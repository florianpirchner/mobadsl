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
package org.mobadsl.grammar.ui.outline

import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.mobadsl.semantic.model.moba.MobaDataType
import org.mobadsl.semantic.model.moba.MobaConstant

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#outline
 */
class MobaOutlineTreeProvider extends DefaultOutlineTreeProvider {

	def boolean _isLeaf(MobaDataType modelElement) {
		return true;
	}
	
	def boolean _isLeaf(MobaConstant modelElement) {
		return true;
	}
}
