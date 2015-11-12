package org.mobadsl.grammar.converter;

import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractValueConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

public class ApplicationIdConverter extends AbstractValueConverter<String> {

	@Override
	public String toValue(String string, INode node) throws ValueConverterException {
		return MobaUtil.toApplicationVersionedIdModelValue(string);
	}

	@Override
	public String toString(String value) throws ValueConverterException {
		return MobaUtil.toApplicationVersionedIdUiValue(value);
	}

}