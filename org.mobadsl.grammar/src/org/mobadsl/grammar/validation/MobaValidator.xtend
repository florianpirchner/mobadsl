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
package org.mobadsl.grammar.validation

import com.google.inject.Inject
import com.google.inject.name.Named
import java.net.MalformedURLException
import java.net.URL
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.Collections
import java.util.Set
import org.eclipse.xtext.Constants
import org.eclipse.xtext.validation.Check
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaCache
import org.mobadsl.semantic.model.moba.MobaConstant
import org.mobadsl.semantic.model.moba.MobaConstantValue
import org.mobadsl.semantic.model.moba.MobaDataType
import org.mobadsl.semantic.model.moba.MobaDto
import org.mobadsl.semantic.model.moba.MobaDtoReference
import org.mobadsl.semantic.model.moba.MobaEntity
import org.mobadsl.semantic.model.moba.MobaEntityReference
import org.mobadsl.semantic.model.moba.MobaEnum
import org.mobadsl.semantic.model.moba.MobaEnumLiteral
import org.mobadsl.semantic.model.moba.MobaGenerator
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature
import org.mobadsl.semantic.model.moba.MobaPackage
import org.mobadsl.semantic.model.moba.MobaQueue
import org.mobadsl.semantic.model.moba.MobaRESTAttribute
import org.mobadsl.semantic.model.moba.MobaRESTCrud
import org.mobadsl.semantic.model.moba.MobaRESTCustomService
import org.mobadsl.semantic.model.moba.MobaServer
import org.mobadsl.semantic.model.moba.MobaSettings
import org.mobadsl.semantic.model.moba.MobaTemplate
import org.mobadsl.semantic.model.moba.RecursionException
import org.mobadsl.semantic.model.moba.ValueType
import org.eclipse.xtext.resource.IResourceDescription
import org.eclipse.xtext.resource.IContainer

class MobaValidator extends AbstractMobaValidator {

	@Inject
	private IContainer.Manager containerManager;
	@Inject
	private IResourceDescription.Manager descriptionManager;

	@Inject ExtensionGeneratorDelegate generatorDelegate
	@Inject @Named(Constants.LANGUAGE_NAME) String grammarName

	public static val DUPLICATE_NAME = 'duplicateName'
	public static val DOWNLOAD_TEMPLATE = 'downloadTemplate'

	@Check
	def checkDuplicateFeatureName(MobaEntity dto) {
		// all super type features 
		val superFeatureMap = if (dto.getSuperType != null)
				try {
					dto.getSuperType.allFeatures.toMap [
						it.name
					]
				} catch (RecursionException ex) {
					Collections.emptyMap
				}
			else
				Collections.emptyMap

		val Set<String> currentFeatures = newHashSet()
		var index = 0;
		for (feature : dto.features) {
			if (superFeatureMap.containsKey(feature.name)) {
				error("Supertype contains same feature name", dto, MobaPackage.Literals.MOBA_ENTITY__FEATURES, index)
			}

			if (currentFeatures.contains(feature.name)) {
				error("Feature name must be unique", dto, MobaPackage.Literals.MOBA_ENTITY__FEATURES, index)
			}
			currentFeatures.add(feature.name)
			index++;
		}

	}

	@Check
	def checkDuplicateFeatureName(MobaDto payload) {
		// all super type features 
		val superFeatureMap = if (payload.getSuperType != null)
				try {
					payload.getSuperType.allFeatures.toMap [
						it.name
					]
				} catch (RecursionException ex) {
					Collections.emptyMap
				}
			else
				Collections.emptyMap

		val Set<String> currentFeatures = newHashSet()
		var index = 0;
		for (feature : payload.features) {
			if (superFeatureMap.containsKey(feature.name)) {
				error("Supertype contains same feature name", payload, MobaPackage.Literals.MOBA_DTO__FEATURES, index)
			}

			if (currentFeatures.contains(feature.name)) {
				error("Feature name must be unique", payload, MobaPackage.Literals.MOBA_DTO__FEATURES, index)
			}
			currentFeatures.add(feature.name)
			index++;
		}

	}

	@Check
	def checkDuplicateFeatureName(MobaQueue queue) {
		// all super type features 
		val superFeatureMap = if (queue.superType != null)
				try {
					queue.superType.allFeatures.toMap [
						it.name
					]
				} catch (RecursionException ex) {
					Collections.emptyMap
				}
			else
				Collections.emptyMap

		val Set<String> currentFeatures = newHashSet()
		var index = 0;
		for (feature : queue.features) {
			if (superFeatureMap.containsKey(feature.name)) {
				error("Supertype contains same feature name", queue, MobaPackage.Literals.MOBA_QUEUE__FEATURES, index)
			}

			if (currentFeatures.contains(feature.name)) {
				error("Feature name must be unique", queue, MobaPackage.Literals.MOBA_QUEUE__FEATURES, index)
			}
			currentFeatures.add(feature.name)
			index++;
		}

	}

	@Check
	def checkDuplicateFeatureName(MobaApplication application) {

		// datatypes
		val Set<String> tempConstFeatures = newHashSet()
		val Set<String> tempDtFeatures = newHashSet()
		val Set<String> tempDataFeatures = newHashSet()
		val Set<String> tempServiceFeatures = newHashSet()
		val Set<String> tempSettingsFeatures = newHashSet()
		var index = 0;
		for (feature : application.features) {

			switch (feature) {
				MobaConstant: {
					if (tempConstFeatures.contains(feature.name)) {
						error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
							index)
					}
					tempConstFeatures.add(feature.name)
				}
				MobaDataType: {
					if (tempDtFeatures.contains(feature.name)) {
						error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
							index)
					}
					tempDtFeatures.add(feature.name)
				}
				MobaEntity: {
					if (tempDataFeatures.contains(feature.getName)) {
						error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
							index)
					}
					tempDataFeatures.add(feature.getName)
				}
				MobaDto: {
					if (tempDataFeatures.contains(feature.getName)) {
						error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
							index)
					}
					tempDataFeatures.add(feature.getName)
				}
				MobaQueue: {
					if (tempDataFeatures.contains(feature.name)) {
						error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
							index)
					}
					tempDataFeatures.add(feature.name)
				}
				MobaSettings: {
					if (tempSettingsFeatures.contains(feature.name)) {
						error("Feature name must be unique", application,
							MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index)
					}
					tempSettingsFeatures.add(feature.name)
				}
				MobaRESTCustomService: {
					if (tempServiceFeatures.contains(feature.name)) {
						error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
							index)
					}
					tempServiceFeatures.add(feature.name)
				}
				MobaRESTCrud: {
					if (tempServiceFeatures.contains(feature.name)) {
						error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES,
							index)
					}
					tempServiceFeatures.add(feature.name)
				}
			}

			index++;
		}
	}

	@Check
	def checkSuperType(MobaEntity dto) {
		if (dto.getSuperType == null) {
			return
		}

		try {
			dto.allSuperTypes
		} catch (RecursionException ex) {
			val MobaEntity source = ex.source as MobaEntity
			val MobaEntity superType = ex.superType as MobaEntity

			error('''Recursive supertypes for «source.getName» --> «superType.getName»''', dto,
				MobaPackage.Literals.MOBA_ENTITY__SUPER_TYPE)
		}

	}

	@Check
	def checkSuperType(MobaDto payload) {
		if (payload.getSuperType == null) {
			return
		}

		try {
			payload.allSuperTypes
		} catch (RecursionException ex) {
			val MobaDto source = ex.source as MobaDto
			val MobaDto superType = ex.superType as MobaDto

			error('''Recursive supertypes for «source.getName» --> «superType.getName»''', payload,
				MobaPackage.Literals.MOBA_DTO__SUPER_TYPE)
		}
	}

	@Check
	def checkSuperType(MobaQueue queue) {
		if (queue.superType == null) {
			return
		}

		try {
			queue.allSuperTypes
		} catch (RecursionException ex) {
			val MobaQueue source = ex.source as MobaQueue
			val MobaQueue superType = ex.superType as MobaQueue

			error('''Recursive supertypes for «source.name» --> «superType.name»''', queue,
				MobaPackage.Literals.MOBA_QUEUE__SUPER_TYPE)
		}

	}

	@Check
	def checkSettings(MobaApplication application) {
		var activeFound = false
		var firstIndex = -1;
		if (application.settings.size > 1) {
			for (setting : application.settings) {
				if (firstIndex == -1) {
					firstIndex = application.features.indexOf(setting)
				}
				if (activeFound && setting.active) {
					val index = application.features.indexOf(
						setting)
					error('''You are using multiple settings. Please define the active attribute for ONLY one setting.''',
						application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index)
					return
				}
				if (!activeFound) {
					activeFound = setting.active
				}
			}

			if (!activeFound) {
				error('''You are using multiple settings. Please define the #active attribute for one setting.''',
					application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, firstIndex)
			}
		}
	}

	@Check
	def checkGenerators(MobaApplication application) {
		var activeFound = false
		var firstIndex = -1;
		if (application.generators.size > 1) {
			for (generator : application.generators) {
				if (firstIndex == -1) {
					firstIndex = application.features.indexOf(generator)
				}
				if (activeFound && generator.active) {
					val index = application.features.indexOf(
						generator)
					error('''You are using multiple generators. Please define the active attribute for ONLY one generator.''',
						application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index)
					return
				}
				if (!activeFound) {
					activeFound = generator.active
				}
			}

			if (!activeFound) {
				error('''You are using multiple generators. Please define the #active attribute for one generator.''',
					application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, firstIndex)
			}
		}
	}

	@Check
	def checkEnumExtendsNotEnum(MobaDataType datatype) {
		val superType = datatype.superType
		if (!datatype.isEnum || superType == null) {
			return
		}

		if (!superType.isEnum) {
			error('''SuperType «superType.name» is not an Enum''', datatype,
				MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST)
		}

	}

	@Check
	def checkEnumExtendsDuplicates(MobaDataType datatype) {
		val superType = datatype.superType
		if (!datatype.isEnum || superType == null) {
			return
		}
		val names = newHashSet()
		val literals = newHashSet()
		val values = newHashSet()
		superType.enumAST.allLiterals.forEach [
			{
				names += it.name
				literals += it.literal
				values += it.value
			}
		]

		datatype.enumAST.literals.forEach [
			if (names.contains(it.name)) {
				error('''Duplicate name "«it.name»." Check super type.''', datatype,
					MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST)
			}
			if (literals.contains(it.literal)) {
				error('''Duplicate literal "«it.literal»." Check super type.''', datatype,
					MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST)
			}

			if (values.contains(it.value)) {
				warning('''You are redefinging enum literal with value"«it.value»." Check super type.''', datatype,
					MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST)
			}
		]
	}

	@Check
	def checkEnumDuplicateLiterals(MobaEnum enumx) {
		val names = newHashSet()
		val literals = newHashSet()
		val values = newHashSet()

		var MobaEnumLiteral defaultLit = null
		var MobaEnumLiteral undefinedLit = null

		var index = 0
		for (literal : enumx.literals) {

			if (defaultLit != null && literal.^default) {
				error('''Only one "default literal" allowed''', literal,
					MobaPackage.Literals.MOBA_ENUM_LITERAL__DEFAULT)
			}

			if (undefinedLit != null && literal.undefined) {
				error('''Only one "undefined literal" allowed''', literal,
					MobaPackage.Literals.MOBA_ENUM_LITERAL__UNDEFINED)
			}

			if (defaultLit == null && literal.^default) {
				defaultLit = literal
			}

			if (undefinedLit == null && literal.undefined) {
				undefinedLit = literal
			}

			if (names.contains(literal.name)) {
				error('''Duplicate name "«literal.name»."''', enumx, MobaPackage.Literals.MOBA_ENUM__LITERALS, index)
			}

			if (literals.contains(literal.literal)) {
				error('''Duplicate literal "«literal.literal»."''', enumx, MobaPackage.Literals.MOBA_ENUM__LITERALS,
					index)
			}

			if (values.contains(literal.value)) {
				error('''Duplicate value "«literal.value»."''', enumx, MobaPackage.Literals.MOBA_ENUM__LITERALS, index)
			}

			index++
			names += literal.name
			literals += literal.literal
			values += literal.value
		}
	}

	@Check
	def checkDownloadTemplate(MobaTemplate template) {
		if (!template.downloadTemplate.nullOrEmpty && template.downloadTemplate.startsWith("index://")) {
			error("You need to download the template using the quickfix.", template,
				MobaPackage.Literals.MOBA_TEMPLATE__DOWNLOAD_TEMPLATE, DOWNLOAD_TEMPLATE, null)
		}
	}

	@Check
	def checkGeneratorIds(MobaGenerator generator) {

		var foundWarning = false

		var index = -1
		val features = generator.features
		val generatorMap = generatorDelegate.readExtentionsMetadata(grammarName, features.filter [
			it instanceof MobaGeneratorIDFeature
		].map[it.generatorVersionedId].toList)

		for (feature : generator.features) {
			index++
			if (feature instanceof MobaGeneratorIDFeature) {
				if (!generatorMap.containsKey(feature.
					generatorVersionedId)) {
					foundWarning = true
					warning('''For GeneratorID «feature.generatorVersionedId» is not Generator-Extensions registered. Please check template...''',
						generator, MobaPackage.Literals.MOBA_GENERATOR__FEATURES, index)
				}
			}
		}

		// check if there are problems with mixins
		if (!foundWarning) {
			val allGeneratorMap = generatorDelegate.readExtentionsMetadata(grammarName,
				generator.allGeneratorVersionedIds)
			for (id : generator.allGeneratorVersionedIds) {
				index++
				if (!allGeneratorMap.containsKey(
					id)) {
					foundWarning = true
					warning('''A mixin uses the GeneratorID «id» and there is no Generator-Extensions registered. Please check template...''',
						generator, MobaPackage.Literals.MOBA_GENERATOR__NAME)
				}
			}
		}
	}

	@Check
	def checkConstantUppercase(MobaConstantValue value) {
		if (!value.valueString.nullOrEmpty) {
			if (value.valueConst != null) {
				if (!value.valueConst.value.toUpperCase.equals(value.valueConst.value)) {
					error('''Constant values need to be upper case!''', value,
						MobaPackage.Literals.MOBA_CONSTANT_VALUE__VALUE_CONST)
				}
			}
		}
	}

//	@Check
//	def checkResourceName(MobaModelFeature feature) {
//		val MobaModel model = feature.eContainer as MobaModel
//
//		if (model.features.empty || model.features.size > 1) {
//			// if empty or multiple features, do not check
//			return;
//		}
//
//		val id = feature.name + "-" + feature.version
//		val resourceURI = model.eResource.URI
//
//		if (!resourceURI.lastSegment.startsWith(
//			id)) {
//			error('''File need to start with the same name as the name of the element. "«feature.name»:«feature.version»" needs a filename "«feature.name»-«feature.version»{...}.moba"''',
//				feature, MobaPackage.Literals.MOBA_MODEL_FEATURE__NAME, 0)
//		}
//	}
	@Check
	def checkRestAttributeAssignment(MobaRESTAttribute att) {
		val dt = att.type
		val value = att.value;

		val eAtt = if (att.valueConst != null)
				MobaPackage.Literals.MOBA_REST_ATTRIBUTE__VALUE_CONST
			else
				MobaPackage.Literals.MOBA_REST_ATTRIBUTE__VALUE_STRING

		if (dt.isArray) {
			if (!att.value.nullOrEmpty) {
				error('''Array datatypes must not be assigned a value to.''', att, eAtt)
			}
		} else if (dt.isDate || dt.isTime || dt.isTimestamp) {
			val SimpleDateFormat df = if (!dt.dateFormat.nullOrEmpty)
					new SimpleDateFormat(dt.dateFormat)
				else
					new SimpleDateFormat
			try {
				df.parse(value)
			} catch (ParseException ex) {
				error('''Value «value» is not a valid date using dateformat «df.toPattern»!''', att, eAtt)
			}
		} else if (dt.isEnum) {
			if (!att.value.nullOrEmpty) {
				error('''Enum datatypes must not be assigned a value to.''', att, eAtt)
			}
		} else if (dt.isEnum) {
			if (!att.value.nullOrEmpty) {
				error('''Enum datatypes must not be assigned a value to.''', att, eAtt)
			}
		} else if (dt.isNumeric) {
			if (att.valueType != ValueType.NUMERIC) {
				if (att.valueType == ValueType.CONSTANT || att.valueType == ValueType.STRING) {
					try {
						Integer.valueOf(att.value)
					} catch (NumberFormatException ex) {
						error('''Value «value» is not a valid numeric!''', att, eAtt)
					}
				} else {
					error('''Can not assign «att.valueType» to numeric datatype!''', att, eAtt)
				}
			}
		} else if (dt.isDecimal) {
			if (att.valueType != ValueType.NUMERIC && att.valueType != ValueType.DECIMAL) {
				if (att.valueType == ValueType.CONSTANT || att.valueType == ValueType.STRING) {
					try {
						Double.valueOf(att.value)
					} catch (NumberFormatException ex) {
						error('''Value «value» is not a valid decimal!''', att, eAtt)
					}
				} else {
					error('''Can not assign «att.valueType» to decimal datatype!''', att, eAtt)
				}
			}
		}
	}

	@Check
	def void checkServerURL(MobaServer server) {
		val urlValue = server.URL
		try {
			new URL(
				urlValue)
		} catch (MalformedURLException ex) {
			warning('''The url «urlValue» is not a valid URL. You need to redefine it by a sub instance of server «server.name»''',
				server, MobaPackage.Literals.MOBA_SERVER__NAME)
		}
	}

	@Check
	def void checkOpposite(MobaEntityReference ref) {
		if (ref.cascading && ref.multiplicity.bounds.isToMany && ref.opposite == null) {
			error("Opposite reference must be set for cascading 0-* references", ref,
				MobaPackage.Literals.MOBA_ENTITY_REFERENCE__OPPOSITE)
		}

		if (ref.opposite != null && ref.opposite.opposite == null) {
			error("Opposite references must be defined on both sides", ref,
				MobaPackage.Literals.MOBA_ENTITY_REFERENCE__OPPOSITE)
		}
	}

	@Check
	def void checkOpposite(MobaDtoReference ref) {
		if (ref.cascading && ref.multiplicity.bounds.isToMany && ref.opposite == null) {
			error("Opposite reference must be set for cascading 0-* references", ref,
				MobaPackage.Literals.MOBA_DTO_REFERENCE__OPPOSITE)
		}

		if (ref.opposite != null && ref.opposite.opposite == null) {
			error("Opposite references must be defined on both sides", ref,
				MobaPackage.Literals.MOBA_DTO_REFERENCE__OPPOSITE)
		}
	}

	@Check
	def void checkCacheInterval(MobaCache cache) {
		if (cache.cacheIntervalConst != null && cache.cacheIntervalConst.valueAST.valueType != ValueType.NUMERIC) {
			error("The constant for interval needs to be a numeric type constant.", cache,
				MobaPackage.Literals.MOBA_CACHE__CACHE_INTERVAL_CONST)
		}
	}
}
