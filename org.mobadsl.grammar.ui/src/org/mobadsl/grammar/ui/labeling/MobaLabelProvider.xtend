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
package org.mobadsl.grammar.ui.labeling

import com.google.inject.Inject
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaApplicationFeature
import org.mobadsl.semantic.model.moba.MobaCache
import org.mobadsl.semantic.model.moba.MobaConstant
import org.mobadsl.semantic.model.moba.MobaData
import org.mobadsl.semantic.model.moba.MobaDataType
import org.mobadsl.semantic.model.moba.MobaDto
import org.mobadsl.semantic.model.moba.MobaDtoAttribute
import org.mobadsl.semantic.model.moba.MobaDtoEmbeddable
import org.mobadsl.semantic.model.moba.MobaDtoReference
import org.mobadsl.semantic.model.moba.MobaEntity
import org.mobadsl.semantic.model.moba.MobaEntityAttribute
import org.mobadsl.semantic.model.moba.MobaEntityReference
import org.mobadsl.semantic.model.moba.MobaExternalModule
import org.mobadsl.semantic.model.moba.MobaFeature
import org.mobadsl.semantic.model.moba.MobaGenerator
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature
import org.mobadsl.semantic.model.moba.MobaPersistenceType
import org.mobadsl.semantic.model.moba.MobaProject
import org.mobadsl.semantic.model.moba.MobaQueue
import org.mobadsl.semantic.model.moba.MobaQueueReference
import org.mobadsl.semantic.model.moba.MobaREST
import org.mobadsl.semantic.model.moba.MobaRESTAttribute
import org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition
import org.mobadsl.semantic.model.moba.MobaServer
import org.mobadsl.semantic.model.moba.MobaSettings
import org.mobadsl.semantic.model.moba.MobaSettingsAttribute
import org.mobadsl.semantic.model.moba.MobaSettingsEntityReference
import org.mobadsl.semantic.model.moba.MobaTemplate
import org.mobadsl.semantic.model.moba.MobaTrigger

class MobaLabelProvider extends DefaultEObjectLabelProvider {

	@Inject
	new(AdapterFactoryLabelProvider delegate) {
		super(delegate);
	}

	def text(MobaProject project) {
		return project.name.getDisplayString(project.version)
	}

	def text(MobaApplication app) {
		return app.name.getDisplayString(app.version)
	}

	def text(MobaTemplate app) {
		return app.template.name.getDisplayString(app.template.version)
	}

	def text(MobaGenerator generator) {
		val MobaApplication app = generator.eContainer() as MobaApplication;
		return generator.name.getDisplayString(app.version)
	}

	def text(MobaGeneratorMixinFeature feature) {
		return feature.generatorRef.text
	}

	def text(MobaConstant const) {
		return const.name.getDisplayString(const.value)
	}

	def text(MobaRESTAttribute att) {
		return att.name.getDisplayString(att.value)
	}

	def text(MobaDtoAttribute att) {
		return att.name.getDisplayString(att.type.name)
	}

	def text(MobaEntityAttribute att) {
		return att.name.getDisplayString(att.type.name)
	}

	def text(MobaCache cache) {
		return "Cache".
			getDisplayString('''(«cache.cacheStrategy» / «cache.cacheType» / «cache.cacheInterval» / «cache.cachePersistence.toName»)''')
	}

	def String getToName(MobaPersistenceType type) {
		return if(type == null) "default" else return type.name
	}

	def text(MobaSettingsAttribute att) {
		return att.name.getDisplayString(att.type.name)
	}

	def text(MobaDtoReference att) {
		return att.name.getDisplayString(att.type.name)
	}

	def text(MobaDtoEmbeddable att) {
		return att.name.getDisplayString(att.type.name)
	}

	def text(MobaEntityReference att) {
		return att.name.getDisplayString(att.type.name)
	}

	def text(MobaSettingsEntityReference att) {
		return att.name.getDisplayString(att.type.name)
	}

	def text(MobaQueueReference att) {
		return att.name.getDisplayString(att.type.name)
	}

	def text(MobaRESTPayloadDefinition att) {
		return att.dto.name.getDisplayString(if(att.array) "[*]" else null)
	}

	def dispatch String name(MobaData data) {
		return ""
	}

	def dispatch String name(MobaDto data) {
		return data.name
	}

	def dispatch String name(MobaEntity data) {
		return data.name
	}

	def dispatch String name(MobaQueue data) {
		return data.name
	}

	def text(MobaDataType dt) {
		if (dt.isDate || dt.isTime || dt.isTimestamp) {
			return dt.name.getDisplayString(dt.dateFormat)
		} else if (dt.isEnum) {
			val bf = new StringBuilder
			bf.append("(")
			for (lit : dt.enumAST.allLiterals) {
				if (bf.length > 1) {
					bf.append(", ")
				}
				bf.append(lit.literal)
			}
			bf.append(")")
			return dt.name.getDisplayString(bf.toString)
		}

		return dt.name.getDisplayString(null)
	}

	def text(MobaServer server) {
		return server.name.getDisplayString('''(«server.URL»)''')
	}

	def StyledString getDisplayString(String value, String description) {
		val StyledString string = new StyledString(value)
		if (!description.nullOrEmpty)
			string.append(" : " + description, StyledString.DECORATIONS_STYLER)

		return string
	}

	def image(MobaApplication ele) {
		return "MobaApplication.png"
	}

	def image(MobaQueue ele) {
		return "MobaQueue.png"
	}

	def image(MobaApplicationFeature ele) {
		return "MobaApplicationFeature.png"
	}

	def image(MobaDataType ele) {
//		if (ele.enum) {
//			return "MobaEnum.png"
//		}
		return "MobaFeature.png"
	}

	def image(MobaFeature ele) {
		return "MobaFeature.png"
	}

	def image(MobaProject ele) {
		return "MobaProject.png"
	}

	def image(MobaServer ele) {
		return "MobaServer.png"
	}

	def image(MobaDto ele) {
		return "MobaDto.png"
	}

	def image(MobaSettings ele) {
		return "MobaSettings.gif"
	}

	def image(MobaExternalModule ele) {
		return "MobaExternalModule.png"
	}

	def image(MobaTrigger ele) {
		return "MobaTrigger.png"
	}

	def image(MobaCache ele) {
		return "MobaCache.png"
	}

	def image(MobaREST ele) {
		return "MobaREST.png"
	}

	def image(MobaTemplate ele) {
		return "MobaTemplate.png"
	}

	def image(MobaConstant ele) {
		return "MobaConstant.png"
	}

	def image(MobaEntity ele) {
		return "MobaEntity.gif"
	}

	def image(MobaGenerator ele) {
		return "MobaGenerator.gif"
	}

	def image(MobaQueueReference ele) {
		return super.doGetImage(ele.type)
	}

	def image(MobaRESTPayloadDefinition ele) {
		return "MobaDto.png"
	}

	def image(MobaRESTAttribute ele) {
		return "MobaFeature.png"
	}

}
