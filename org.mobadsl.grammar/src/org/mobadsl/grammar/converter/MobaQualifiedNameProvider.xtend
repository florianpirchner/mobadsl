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
package org.mobadsl.grammar.converter

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider
import org.eclipse.xtext.naming.QualifiedName
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaGenerator
import org.mobadsl.semantic.model.moba.util.MobaUtil

class MobaQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {

//	def QualifiedName qualifiedName(MobaApplication ele) {
//		return QualifiedName.create(MobaUtil.toVersionedIdModelValue(ele.id).split("\\."))
//	}
//	
//	def QualifiedName qualifiedName(MobaGenerator ele) {
//		val idTokens = ele.versionedId.split("(:|\\.|-)");
//		// avoid splitting the versions into single tokens
//		return QualifiedName.create(idTokens)
//	}
}
