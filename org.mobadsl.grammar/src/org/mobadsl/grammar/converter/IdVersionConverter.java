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
package org.mobadsl.grammar.converter;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

public class IdVersionConverter extends AbstractValueConverter<String> {

	@Override
	public String toValue(String string, INode node) throws ValueConverterException {
		return MobaUtil.toVersionedIdModelValue(string);
	}

	@Override
	public String toString(String value) throws ValueConverterException {
		return MobaUtil.toVersionedIdUiValue(value);
	}

}
