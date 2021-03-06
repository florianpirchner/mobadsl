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
package org.mobadsl.grammar.formatting2

import com.google.inject.Inject
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import org.mobadsl.grammar.services.MobaGrammarAccess
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaApplicationFeature
import org.mobadsl.semantic.model.moba.MobaMultiplicityAble
import org.mobadsl.semantic.model.moba.MobaPropertiesAble
import org.mobadsl.semantic.model.moba.MobaProperty
import org.mobadsl.semantic.model.moba.MobaQueue
import org.mobadsl.semantic.model.moba.MobaQueueFeature
import org.mobadsl.semantic.model.moba.MobaDto
import org.mobadsl.semantic.model.moba.MobaDtoFeature
import org.mobadsl.semantic.model.moba.MobaEntity
import org.mobadsl.semantic.model.moba.MobaEntityFeature

class MobaFormatter extends AbstractFormatter2 {
	
	@Inject extension MobaGrammarAccess

	def dispatch void format(MobaApplication mobaApplication, extension IFormattableDocument document) {
		for (MobaApplicationFeature features : mobaApplication.getFeatures()) {
			format(features, document);
		}
	}

	def dispatch void format(MobaPropertiesAble mobaPropertiesProvider, extension IFormattableDocument document) {
		for (MobaProperty properties : mobaPropertiesProvider.getProperties()) {
			format(properties, document);
		}
	}

	def dispatch void format(MobaEntity mobaDto, extension IFormattableDocument document) {
		format(mobaDto.getCache(), document);
		for (MobaEntityFeature features : mobaDto.getFeatures()) {
			format(features, document);
		}
		format(mobaDto.indizes, document);
	}

	def dispatch void format(MobaDto mobaPayload, extension IFormattableDocument document) {
		for (MobaDtoFeature features : mobaPayload.getFeatures()) {
			format(features, document);
		}
	}

	def dispatch void format(MobaQueue mobaQueue, extension IFormattableDocument document) {
		for (MobaQueueFeature features : mobaQueue.getFeatures()) {
			format(features, document);
		}
	}

	def dispatch void format(MobaMultiplicityAble mobaMultiplicityProvider, extension IFormattableDocument document) {
		format(mobaMultiplicityProvider.getMultiplicity(), document);
	}
}
