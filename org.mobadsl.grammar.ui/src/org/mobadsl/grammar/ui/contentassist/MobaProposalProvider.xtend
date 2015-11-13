/*
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.ui.contentassist

import com.google.inject.Inject
import com.google.inject.name.Named
import org.eclipse.emf.ecore.EObject
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.Constants
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.mobadsl.api.template.repository.ITemplateRepositoryManager
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate.Metadata
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature
import org.mobadsl.semantic.model.moba.index.MobaIndex
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry
import org.mobadsl.semantic.model.moba.util.MobaUtil
import org.osgi.framework.FrameworkUtil

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
class MobaProposalProvider extends AbstractMobaProposalProvider {

	@Inject ExtensionGeneratorDelegate generatorDelegate
	@Inject @Named(Constants.LANGUAGE_NAME) String grammarName

	override void completeMobaTemplate_Template(EObject model, Assignment assignment, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		super.completeMobaTemplate_Template(model, assignment, context, acceptor);

		// complete with web access
		val manager = getManager
		if (manager != null) {
			manager.availableEntries.forEach [
				val index = it.eContainer as MobaIndex
				acceptor.accept(
					doCreateProposal(index.createProposalValue(it), index.createStyledString(it), it.image, 1000,
						context))
			]
		}
	}

	override void completeMobaGeneratorIDFeature_GeneratorId(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeMobaGeneratorIDFeature_GeneratorId(model, assignment, context, acceptor);

		val prefix = context.prefix;

		val allGenerators = generatorDelegate.readExtentionsMetadataById(grammarName, prefix)
		allGenerators.values.forEach [
			acceptor.accept(doCreateProposal(
				'''«MobaUtil.toGeneratorVersionedIdWithWhitespace(it.id, it.version)»''',
				it.createStyledString,
				model.image,
				1000,
				context
			))
		]
	}

	override void completeMobaGeneratorIDFeature_GeneratorVersion(EObject model, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		super.completeMobaGeneratorIDFeature_GeneratorId(model, assignment, context, acceptor);

		val prefix = context.prefix;
		val MobaGeneratorIDFeature feature = model as MobaGeneratorIDFeature
		val allGenerators = generatorDelegate.readExtentionsMetadataByVersion(grammarName, feature.id, prefix)
		allGenerators.values.forEach [
			acceptor.accept(doCreateProposal(it.version, it.createStyledStringForVersion, model.image, 1000, context))
		]
	}

	def StyledString createStyledString(Metadata metadata) {
		val result = new StyledString(metadata.name)
		if (!metadata.version.isNullOrEmpty) {
			result.append(''' version «metadata.version»''', StyledString.QUALIFIER_STYLER)
		}
		if (!metadata.license.isNullOrEmpty) {
			result.append(''' under «metadata.license»''', StyledString.QUALIFIER_STYLER)
		}

		if (!metadata.description.isNullOrEmpty) {
			result.append(''' - «metadata.description»''', StyledString.COUNTER_STYLER)
		}

		return result
	}

	def StyledString createStyledStringForVersion(Metadata metadata) {
		val result = new StyledString(metadata.version)
		result.append(''' «metadata.name»''', StyledString.QUALIFIER_STYLER)

		if (!metadata.license.isNullOrEmpty) {
			result.append(''' under «metadata.license»''', StyledString.QUALIFIER_STYLER)
		}

		if (!metadata.description.isNullOrEmpty) {
			result.append(''' - «metadata.description»''', StyledString.COUNTER_STYLER)
		}

		return result
	}

	def StyledString createStyledString(MobaIndex index, MobaIndexEntry entry) {
		val result = new StyledString("index://")
		result.append('''«index.id»:«entry.templateId»''')
		result.append(''' - «entry.templateDescription»''', StyledString.COUNTER_STYLER)
		return result
	}

	def String createProposalValue(MobaIndex index, MobaIndexEntry entry) '''
		index://«index.id»:«entry.templateId»
	'''

	def ITemplateRepositoryManager getManager() {
		val bc = FrameworkUtil.getBundle(MobaProposalProvider).bundleContext

		val ref = bc.getServiceReference(ITemplateRepositoryManager)
		if (ref != null) {
			val manager = bc.getService(ref)
			return manager
		}

		return null
	}

	override String getDisplayString(EObject element, String givenQualifiedNameAsString, String shortName) {
		var qualifiedNameAsString = givenQualifiedNameAsString;
		if (qualifiedNameAsString == null)
			qualifiedNameAsString = shortName;
		if (qualifiedNameAsString == null) {
			if (element != null) {
				qualifiedNameAsString = labelProvider.getText(element)
			} else
				return null
		}

		if (!(element instanceof MobaApplication)) {
			// do not add the version of application to the value
			val QualifiedName qualifiedName = qualifiedNameConverter.toQualifiedName(qualifiedNameAsString);
			if (qualifiedName.getSegmentCount() > 1) {
				return qualifiedName.getLastSegment() + " - " + qualifiedNameAsString;
			}
		}
		return qualifiedNameAsString;
	}

}
