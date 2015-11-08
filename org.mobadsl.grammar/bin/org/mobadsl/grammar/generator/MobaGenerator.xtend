/*
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.generator

import com.google.inject.Inject
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.mobadsl.semantic.model.moba.MobaApplication

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MobaGenerator extends AbstractGenerator {

	@Inject ExtensionGeneratorDelegate generatorDelegate;

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val List<String> generatorIds = input.collectGeneratorIds();
		generatorDelegate.generate(input, fsa, context, generatorIds);
	}
	
	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val List<String> generatorIds = input.collectGeneratorIds();
		generatorDelegate.beforeGenerate(input, fsa, context, generatorIds);
	}

	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val List<String> generatorIds = input.collectGeneratorIds();
		generatorDelegate.afterGenerate(input, fsa, context, generatorIds);
	}

	def List<String> collectGeneratorIds(Resource resource) {
		val MobaApplication application = resource.contents.get(0) as MobaApplication
		return application.allGenerators.map[it.generatorString]
	}

}
