/**
 * Copyright (c) 2015 - 2016, Lunifera GmbH (Wien), Ekkehard Gentz (Rosenheim)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.mobadsl.grammar.generator

import com.google.inject.Inject
import java.util.Collections
import java.util.List
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaModel
import org.eclipse.xtext.generator.IFileSystemAccess

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MobaGenerator extends AbstractGenerator {

	@Inject ExtensionGeneratorDelegate generatorDelegate
	@Inject MobaConstantsGenerator constantsGenerator

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		
		// generate constants for Xtend
		constantsGenerator.doGenerate(input, fsa, context)
		
		val List<String> generatorIds = input.collectGeneratorIds();
		if (generatorIds == null) {
			return
		}
		generatorDelegate.generate(input, fsa, context, generatorIds);
	}

	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val List<String> generatorIds = input.collectGeneratorIds();
		if (generatorIds == null) {
			return
		}
		generatorDelegate.beforeGenerate(input, fsa, context, generatorIds);
	}

	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		val List<String> generatorIds = input.collectGeneratorIds();
		if (generatorIds == null) {
			return
		}
		generatorDelegate.afterGenerate(input, fsa, context, generatorIds);
	}

	def List<String> collectGeneratorIds(Resource resource) {
		val MobaModel model = resource.contents.get(0) as MobaModel
		if (model == null) {
			return Collections.emptyList
		}

		val List<String> generatorIds = newArrayList()
		model.features.filter[it instanceof MobaApplication].forEach [
			val app = it as MobaApplication
			generatorIds += if(app.activeGenerator != null) app.activeGenerator.allGeneratorVersionedIds else Collections.emptyList
		]

		return generatorIds
	}

}
