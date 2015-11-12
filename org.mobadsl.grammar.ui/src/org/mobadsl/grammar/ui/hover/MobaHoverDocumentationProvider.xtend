package org.mobadsl.grammar.ui.hover

import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider
import org.mobadsl.semantic.model.moba.MobaConstant
import org.mobadsl.semantic.model.moba.MobaConstantValue
import org.mobadsl.semantic.model.moba.MobaDataType
import org.mobadsl.semantic.model.moba.MobaGenerator
import org.mobadsl.semantic.model.moba.MobaGeneratorFeature
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature
import org.mobadsl.semantic.model.moba.MobaPropertiesAble
import org.mobadsl.semantic.model.moba.MobaProperty
import com.google.inject.Inject
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate
import com.google.inject.name.Named
import org.eclipse.xtext.Constants
import java.util.Collections

class MobaHoverDocumentationProvider extends MultiLineCommentDocumentationProvider {

	@Inject ExtensionGeneratorDelegate generatorDelegate
	@Inject @Named(Constants.LANGUAGE_NAME) String grammarName

	override String getDocumentation(EObject o) {
		val String returnValue = findComment(o);
		var String extendedValue = ""
		if (returnValue != null) {
			extendedValue = getTextFromMultilineComment(returnValue);
		}
		val resultValue = o.getDocu(extendedValue)
		return resultValue
	}

	def dispatch String getDocu(EObject object, String value) {
		return value
	}

	def dispatch String getDocu(MobaConstant object, String value) {
		return value +
			'''<p>@value = <code>«object.value»</code><br>
		@valueType = «if(object.valueAST != null && object.valueAST.tail == null) object.valueAST.valueType else MobaConstantValue.ValueType.STRING»
		</p>'''
	}

	def dispatch String getDocu(MobaGenerator object, String value) {

		return value + '''<p>
		Generators:<br>
		<ul>
		«FOR feature : object.allGeneratorIdFeatures»
			<li>«feature.toDocu»</li>
		«ENDFOR»
		</ul>
		'''
	}

	def dispatch String getDocu(MobaDataType object, String value) {
		return value + '''<p>
		Datatype <b>«object.name»</b>:<br>
		«object.toPropertiesDocu»
		'''
	}

	def dispatch String getDocu(MobaPropertiesAble object, String value) {
		return value + '''<p>
		«object.toPropertiesDocu»
		'''
	}

	def String getToPropertiesDocu(MobaPropertiesAble type) {
		val allProps = type.genProperties
		if (allProps.empty) {
			return ""
		}
		val StringBuilder b = new StringBuilder
		b.append("Properties: ")
		for (MobaProperty prop : allProps) {
			b.append("<code>")
			b.append(prop.keyStringOrConstantName)
			b.append("=")
			b.append(prop.valueStringOrConstantName)
			b.append("</code>, ")
		}
		return if(b.length >= 2) b.toString.substring(0, b.length - 2) else b.toString
	}

	def dispatch String toDocu(MobaGeneratorFeature feature) '''
	
	'''

	def dispatch String toDocu(MobaGeneratorIDFeature feature) {
		val metadata = generatorDelegate.readExtentionsMetadata(grammarName, Collections.singletonList(feature.generatorId)).get(feature.generatorId)
		if(metadata != null) {
			'''<b>«metadata.name»</b> «IF !metadata.license.nullOrEmpty» <i>under («metadata.license»«ENDIF»</i>) - «metadata.description»: <code>«feature.generatorId»</code>'''
		}else{
			'''<code>«feature.generatorId»</code>'''
		}
	}
	

	def dispatch String toDocu(MobaGeneratorMixinFeature feature) '''
		mixin <code>«feature.generatorId»</code>
	'''

}
