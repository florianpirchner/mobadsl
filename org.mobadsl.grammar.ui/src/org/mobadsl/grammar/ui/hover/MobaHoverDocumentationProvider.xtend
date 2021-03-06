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
package org.mobadsl.grammar.ui.hover

import com.google.inject.Inject
import com.google.inject.name.Named
import java.util.Collections
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Constants
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaConstant
import org.mobadsl.semantic.model.moba.MobaDataType
import org.mobadsl.semantic.model.moba.MobaGenerator
import org.mobadsl.semantic.model.moba.MobaGeneratorFeature
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature
import org.mobadsl.semantic.model.moba.MobaPropertiesAble
import org.mobadsl.semantic.model.moba.MobaProperty
import org.mobadsl.semantic.model.moba.ValueType

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
		@valueType = «if(object.valueAST != null && object.valueAST.tail == null) object.valueAST.valueType else ValueType.STRING»
		</p>'''
	}

	def dispatch String getDocu(MobaApplication object, String value) {
		return value + '''<p>@verson = <code>«object.version»</code></p>'''
	}

	def dispatch String getDocu(MobaGenerator object, String value) {

		return value + '''<p>
		<b><i>Used Generators:</i></b><br>
		<ul>
		«FOR feature : object.allGeneratorIdFeatures»
			<li>«feature.toDocu»</li>
		«ENDFOR»
		</ul>
		'''
	}

	def dispatch String getDocu(MobaDataType object, String value) {
		return value +
			'''<p>
		«IF ( !object.dateFormat.nullOrEmpty && ( object.isDate || object.isTime || object.isTimestamp))»@dateformat = «object.dateFormat»</br>«ENDIF»
		«IF ( object.dateFormat.nullOrEmpty && ( object.isDate || object.isTime || object.isTimestamp))»@dateformat = default</br>«ENDIF»
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
		val metadata = generatorDelegate.readExtentionsMetadata(grammarName,
			Collections.singletonList(feature.generatorVersionedId)).get(feature.generatorVersionedId)
		if (metadata !=
			null) {
			'''<b>«metadata.name»</b> «IF !metadata.license.nullOrEmpty» <i>under («metadata.license»«ENDIF»</i>) - «metadata.description»: <code>«feature.generatorVersionedId»</code>'''
		} else {
			'''<code>«feature.generatorVersionedId»</code>'''
		}
	}

	def dispatch String toDocu(MobaGeneratorMixinFeature feature) '''
		mixin <code>«feature.generatorVersionedId»</code>
	'''

}
