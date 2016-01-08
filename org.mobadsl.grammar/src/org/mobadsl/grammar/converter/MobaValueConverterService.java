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

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

public class MobaValueConverterService extends DefaultTerminalConverters {

	@Inject
	private IdVersionConverter idVersionValueConverter;

//	@Inject
//	private GeneratorIdConverter generatorIdValueConverter;

	@ValueConverter(rule = "ID_VERSION")
	public IValueConverter<String> APPLICATION_ID() {
		return idVersionValueConverter;
	}

//	@ValueConverter(rule = "GENERATOR_ID")
//	public IValueConverter<String> GENERATOR_ID() {
//		return generatorIdValueConverter;
//	}

}
