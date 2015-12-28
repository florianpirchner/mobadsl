package org.mobadsl.grammar.generator.common

import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.mobadsl.grammar.generator.common.IGeneratorDelegate.PropertiesMap
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaAuthorization
import org.mobadsl.semantic.model.moba.MobaConstant
import org.mobadsl.semantic.model.moba.MobaModel
import org.mobadsl.semantic.model.moba.MobaProject
import org.mobadsl.semantic.model.moba.MobaServer
import org.mobadsl.semantic.model.moba.MobaApplicationFeature

/**
 * The generator iterates the given MobaModel and generates the required code.<br>
 * Different types of features are available for objects, following the pattern:
 * <ul>
 * <li>getAll... - will return all objects of this type excluding the "used templates".</li>
 * <li>getGen... - will return all objects of this type including the "used templates". These methods should be used to generate your code, 
 * since this method returns exactly what is needed. If values are overridden by sub types, this method takes aware of it.</li>
 * <li>get... - returns all objects of this type from the current object.</li>
 * </ul>
 * 
 * If you have no idea, which method to use, then use the getGen... method if available.
 */
class CommonGeneratorDelegate {

	def void generate(MobaModel model, IFileSystemAccess2 fsa, IGeneratorContext context, PropertiesMap properties) {

		for (feature : model.features) {
			feature.generate
		}
	}
 
	def dispatch generate(MobaApplication app) {
		// iterates all features required for generation
		app.genFeatures.forEach [
			it.generateFeature
		]
	}

	def dispatch generate(MobaProject project) {
	}
	
	def dispatch generateFeature(MobaApplicationFeature auth) {
	}

	def dispatch generateFeature(MobaAuthorization auth) {
	}

	def dispatch generateFeature(MobaConstant auth) {
	}

	def dispatch generateFeature(MobaServer auth) {
	}

}