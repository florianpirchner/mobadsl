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
import java.util.Calendar
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaConstant
import org.mobadsl.semantic.model.moba.MobaConstantValue
import org.mobadsl.semantic.model.moba.MobaDataType
import org.mobadsl.semantic.model.moba.MobaModel

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MobaConstantsGenerator extends AbstractGenerator {

	@Inject IEObjectDocumentationProvider docuProvider

	override doGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {

		val MobaModel model = input.getContents().get(0) as MobaModel;
		model.applications.forEach [
			fsa.generateFile(it.toFileName, IFileSystemAccess.DEFAULT_OUTPUT, it.toConstantsClass)
		]
	}

	def CharSequence toConstantsClass(
		MobaApplication application) '''
		«application.toCopyright()»
		package «application.toPackageName»;
		
		/**
		  «toDocumentation(application)»
		*/ 
		public interface «application.toInterfaceName» «IF !application.templates.empty»extends «application.toExtends»«ENDIF»{
			
			«toApplication(application)»
			«toConstants(application)»
			«toAuthorizations(application)»
			«toExternalModules(application)»
			«toDatatypes(application)»
			«toDtos(application)»
			«toEntities(application)»
			«toEnums(application)»
			«toGenerators(application)»
			«toGeneratorSlots(application)»
			«toCaches(application)»
			«toPersistenceTypes(application)»
			«toQueues(application)»
			«toRestCustomServices(application)»
			«toRestCruds(application)»
			«toRestWorkflows(application)»
			«toServers(application)»
			«toSettings(application)»
			«toTransportSerializationTypes(application)»
			«toTriggers(application)»
		}
	'''

	def String toCopyright(MobaApplication app) {
		val MobaModel model = app.eContainer as MobaModel
		if(model.copyright.nullOrEmpty) {
			return ""
		}
		
		val b = new StringBuilder
		b.append("/**\n")
		for (line : model.copyright.split("\n")) {
			b.append(" * " + line + "\n")
		}
		b.append(" */")
		
		var result = b.toString
		result = result.replaceAll("\\{\\$year\\}", Integer.toString(toCurrentYear))
		
		return result
	}

	def toCurrentYear() {
		return Calendar.instance.get(Calendar.YEAR)
	}

	def toTriggers(MobaApplication application) '''«IF !application.triggers.empty»
			//
			// TRIGGERS
			//
			«FOR obj : application.triggers»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Trigger__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toTransportSerializationTypes(MobaApplication application) '''«IF !application.transportSerializationTypes.empty»
			//
			// TANSPORT SERIALIZATION TYPE
			//
			«FOR obj : application.transportSerializationTypes»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String TransportSerialization__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toSettings(MobaApplication application) '''«IF !application.settings.empty»
			//
			// SETTINGS
			//
			«FOR obj : application.settings»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Setting__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toServers(MobaApplication application) '''«IF !application.servers.empty»
			//
			// SERVERS
			//
			«FOR obj : application.servers»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Server__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toRestWorkflows(MobaApplication application) '''«IF !application.RESTWorkflows.empty»
			//
			// REST WORKFLOW
			//
			«FOR obj : application.RESTWorkflows»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String RestWorkflow__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toRestCruds(MobaApplication application) '''«IF !application.RESTCruds.empty»
			//
			// REST CRUD
			//
			«FOR obj : application.RESTCruds»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String RestCrud__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toRestCustomServices(MobaApplication application) '''«IF !application.restCustomServices.empty»
			//
			// REST CUSTOM
			//
			«FOR obj : application.restCustomServices»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String RestCustom__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toQueues(MobaApplication application) '''«IF !application.queues.empty»
			//
			// QUEUES
			//
			«FOR obj : application.queues»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Queue__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toPersistenceTypes(MobaApplication application) '''«IF !application.persistenceTypes.empty»
			//
			// PERSISTENCE TYPES
			//
			«FOR obj : application.persistenceTypes»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String PersistenceType__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toCaches(MobaApplication application) '''«IF !application.caches.empty»
			//
			// CACHES
			//
			«FOR obj : application.caches»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Cache__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toGeneratorSlots(MobaApplication application) '''«IF !application.generatorSlots.empty»
			//
			// GENERATOR SLOTS
			//
			«FOR obj : application.generatorSlots»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String GeneratorSlot__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toGenerators(MobaApplication application) '''«IF !application.generators.empty»
			//
			// GENERATORS
			//
			«FOR obj : application.generators»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Generator__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toEntities(MobaApplication application) '''«IF !application.entities.empty»
			//
			// ENTITIES
			//
			«FOR obj : application.entities»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Entity__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toEnums(MobaApplication application) '''«IF !application.enums.empty»
			//
			// ENUMS
			//
			«FOR obj : application.enums»
				/**
				  «toDocumentation(obj.eContainer)»
				 */ 
				public static final String Enum__«(obj.eContainer as MobaDataType).name» = "«(obj.eContainer as MobaDataType).name»";
				
			«ENDFOR»
	«ENDIF»'''

	def toDtos(MobaApplication application) '''«IF !application.dtos.empty»
			//
			// DTOS
			//
			«FOR obj : application.dtos»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Dto__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toDatatypes(MobaApplication application) '''«IF !application.dataTypes.empty»
			//
			// DATATYPES
			//
			«FOR obj : application.dataTypes»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Datatype__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toExternalModules(MobaApplication application) '''«IF !application.externalModules.empty»
			//
			// EXTERNAL MODULES
			//
			«FOR obj : application.externalModules»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Ext_Module__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toAuthorizations(MobaApplication application) '''«IF !application.authorizations.empty»
			//
			// AUTHORIZATIONS
			//
			«FOR obj : application.authorizations»
				/**
				  «toDocumentation(obj)»
				 */ 
				public static final String Authorization__«obj.name» = "«obj.name»";
				
			«ENDFOR»
		«ENDIF»'''

	def toConstants(MobaApplication application) '''«IF !application.constants.empty»
		//
		// CONSTANTS
		//
		«FOR obj : application.constants»
			/**
			  «toDocumentation(obj)»
			 */ 
			public static final «obj.toType» Const__«obj.name» = «obj.toValue»;
			
		«ENDFOR»
		«ENDIF»'''

	def toApplication(MobaApplication application) '''
		public static final String Application__«application.name»_Name = "«application.name»";
		public static final String Application__«application.name»_Version = "«application.version»";
	'''

	def String toExtends(MobaApplication application) {
		val b = new StringBuilder
		for (template : application.templates) {
			if (b.length > 0) {
				b.append(",\n\t\t")
			}
			b.append(template.template.toPackageName + "." + template.template.toInterfaceName)
		}
		return b.toString
	}

	def toDocumentation(EObject eObject) {
		val temp = docuProvider.getDocumentation(eObject).split("\n")

		val result = new StringBuilder
		temp.forEach [
			result.append("* ")
			result.append(it)
			result.append("\n")
		]
		return result.toString
	}

	def String toValue(MobaConstant constant) {
		return constant.valueAST.toValue
	}

	def String toValue(MobaConstantValue value) {
		var String tempResult
		switch (value.valueType) {
			case STRING:
				tempResult = '''"«value.valueSimple»"'''
			case CONSTANT:
				if (value.valueConstFunctions.empty) {
					tempResult = "Const__" + value.valueConst.name
				} else {
					tempResult = '''"«value.valueSimple»"'''
				}
			case DECIMAL:
				tempResult = value.valueSimple
			case NUMERIC:
				tempResult = value.valueSimple
		}

		if (value.tail != null) {
			return tempResult + " + " + value.tail.toValue
		} else {
			return tempResult
		}
	}

	def collectConstantConcats(MobaConstant constant) {
		constant.valueAST.valueConst.name
	}

	def String toType(MobaConstant constant) {
		switch (constant.valueAST.valueType) {
			case STRING:
				return "String"
			case DECIMAL:
				return "double"
			case NUMERIC:
				return "int"
			case CONSTANT:
				return "String"
		}
	}

	def String toInterfaceName(MobaApplication application) {
		application.name + "Constants"
	}

	def String toFileName(MobaApplication application) {
		application.toFilePackageName + "/" + application.toInterfaceName + ".java"
	}

	def String toFilePackageName(MobaApplication application) {
		return if (application.javaPackage.nullOrEmpty)
			"to/be/defined/"
		else
			application.javaPackage.replaceAll("\\.", "/")
	}

	def String toPackageName(MobaApplication application) {
		return if(application.javaPackage.nullOrEmpty) "to.be.defined" else application.javaPackage
	}

	override beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

	override afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
	}

}
