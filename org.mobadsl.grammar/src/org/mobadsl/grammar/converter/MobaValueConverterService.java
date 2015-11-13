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
