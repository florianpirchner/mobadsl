/*
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.ide.contentassist.antlr;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.mobadsl.grammar.ide.contentassist.antlr.internal.InternalMobaParser;
import org.mobadsl.grammar.services.MobaGrammarAccess;

public class MobaParser extends AbstractContentAssistParser {

	@Inject
	private MobaGrammarAccess grammarAccess;

	private Map<AbstractElement, String> nameMappings;

	@Override
	protected InternalMobaParser createParser() {
		InternalMobaParser result = new InternalMobaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getMobaApplicationFeatureAccess().getAlternatives(), "rule__MobaApplicationFeature__Alternatives");
					put(grammarAccess.getMobaGeneratorFeatureAccess().getAlternatives(), "rule__MobaGeneratorFeature__Alternatives");
					put(grammarAccess.getMobaGeneratorIDFeatureAccess().getAlternatives_2(), "rule__MobaGeneratorIDFeature__Alternatives_2");
					put(grammarAccess.getMobaDataTypeAccess().getAlternatives_3_2_0(), "rule__MobaDataType__Alternatives_3_2_0");
					put(grammarAccess.getMobaDataTypeAccess().getAlternatives_3_2_1_1(), "rule__MobaDataType__Alternatives_3_2_1_1");
					put(grammarAccess.getMobaConstantValueAccess().getAlternatives_0(), "rule__MobaConstantValue__Alternatives_0");
					put(grammarAccess.getMobaPropertyAccess().getAlternatives_0(), "rule__MobaProperty__Alternatives_0");
					put(grammarAccess.getMobaPropertyAccess().getAlternatives_2(), "rule__MobaProperty__Alternatives_2");
					put(grammarAccess.getMobaDataAccess().getAlternatives(), "rule__MobaData__Alternatives");
					put(grammarAccess.getMobaCacheAccess().getAlternatives_2_1_0_2(), "rule__MobaCache__Alternatives_2_1_0_2");
					put(grammarAccess.getMobaCacheAccess().getAlternatives_2_1_1_2(), "rule__MobaCache__Alternatives_2_1_1_2");
					put(grammarAccess.getMobaServiceAccess().getAlternatives(), "rule__MobaService__Alternatives");
					put(grammarAccess.getMobaDtoFeatureAccess().getAlternatives(), "rule__MobaDtoFeature__Alternatives");
					put(grammarAccess.getMobaPayloadFeatureAccess().getAlternatives(), "rule__MobaPayloadFeature__Alternatives");
					put(grammarAccess.getMobaConstraintAccess().getAlternatives(), "rule__MobaConstraint__Alternatives");
					put(grammarAccess.getMobaRegexpConstraintAccess().getAlternatives_2(), "rule__MobaRegexpConstraint__Alternatives_2");
					put(grammarAccess.getMobaMinConstraintAccess().getAlternatives_2(), "rule__MobaMinConstraint__Alternatives_2");
					put(grammarAccess.getMobaMaxConstraintAccess().getAlternatives_2(), "rule__MobaMaxConstraint__Alternatives_2");
					put(grammarAccess.getMobaMinLengthConstraintAccess().getAlternatives_2(), "rule__MobaMinLengthConstraint__Alternatives_2");
					put(grammarAccess.getMobaMaxLengthConstraintAccess().getAlternatives_2(), "rule__MobaMaxLengthConstraint__Alternatives_2");
					put(grammarAccess.getMobaDigitsConstraintAccess().getAlternatives_2(), "rule__MobaDigitsConstraint__Alternatives_2");
					put(grammarAccess.getMobaDigitsConstraintAccess().getAlternatives_4(), "rule__MobaDigitsConstraint__Alternatives_4");
					put(grammarAccess.getMobaLowerBoundAccess().getAlternatives(), "rule__MobaLowerBound__Alternatives");
					put(grammarAccess.getMobaUpperBoundAccess().getAlternatives(), "rule__MobaUpperBound__Alternatives");
					put(grammarAccess.getMobaApplicationAccess().getGroup(), "rule__MobaApplication__Group__0");
					put(grammarAccess.getMobaTemplateAccess().getGroup(), "rule__MobaTemplate__Group__0");
					put(grammarAccess.getMobaGeneratorAccess().getGroup(), "rule__MobaGenerator__Group__0");
					put(grammarAccess.getMobaGeneratorIDFeatureAccess().getGroup(), "rule__MobaGeneratorIDFeature__Group__0");
					put(grammarAccess.getMobaGeneratorMixinFeatureAccess().getGroup(), "rule__MobaGeneratorMixinFeature__Group__0");
					put(grammarAccess.getMobaDataTypeAccess().getGroup(), "rule__MobaDataType__Group__0");
					put(grammarAccess.getMobaDataTypeAccess().getGroup_2(), "rule__MobaDataType__Group_2__0");
					put(grammarAccess.getMobaDataTypeAccess().getGroup_3_2(), "rule__MobaDataType__Group_3_2__0");
					put(grammarAccess.getMobaDataTypeAccess().getGroup_3_2_1(), "rule__MobaDataType__Group_3_2_1__0");
					put(grammarAccess.getMobaDataTypeAccess().getGroup_3_3(), "rule__MobaDataType__Group_3_3__0");
					put(grammarAccess.getMobaDataTypeAccess().getGroup_3_3_3(), "rule__MobaDataType__Group_3_3_3__0");
					put(grammarAccess.getMobaEnumAccess().getGroup(), "rule__MobaEnum__Group__0");
					put(grammarAccess.getMobaEnumAccess().getGroup_4(), "rule__MobaEnum__Group_4__0");
					put(grammarAccess.getMobaEnumLiteralAccess().getGroup(), "rule__MobaEnumLiteral__Group__0");
					put(grammarAccess.getMobaConstantAccess().getGroup(), "rule__MobaConstant__Group__0");
					put(grammarAccess.getMobaConstantValueAccess().getGroup(), "rule__MobaConstantValue__Group__0");
					put(grammarAccess.getMobaConstantValueAccess().getGroup_1(), "rule__MobaConstantValue__Group_1__0");
					put(grammarAccess.getMobaPropertiesAbleAccess().getGroup(), "rule__MobaPropertiesAble__Group__0");
					put(grammarAccess.getMobaPropertiesAbleAccess().getGroup_2(), "rule__MobaPropertiesAble__Group_2__0");
					put(grammarAccess.getMobaPropertyAccess().getGroup(), "rule__MobaProperty__Group__0");
					put(grammarAccess.getMobaSettingsAccess().getGroup(), "rule__MobaSettings__Group__0");
					put(grammarAccess.getMobaSettingsAccess().getGroup_4(), "rule__MobaSettings__Group_4__0");
					put(grammarAccess.getMobaCacheAccess().getGroup(), "rule__MobaCache__Group__0");
					put(grammarAccess.getMobaCacheAccess().getGroup_2(), "rule__MobaCache__Group_2__0");
					put(grammarAccess.getMobaCacheAccess().getGroup_2_1_0(), "rule__MobaCache__Group_2_1_0__0");
					put(grammarAccess.getMobaCacheAccess().getGroup_2_1_1(), "rule__MobaCache__Group_2_1_1__0");
					put(grammarAccess.getMobaDtoAccess().getGroup(), "rule__MobaDto__Group__0");
					put(grammarAccess.getMobaDtoAccess().getGroup_2_0(), "rule__MobaDto__Group_2_0__0");
					put(grammarAccess.getMobaDtoIndexAccess().getGroup(), "rule__MobaDtoIndex__Group__0");
					put(grammarAccess.getMobaDtoIndexAccess().getGroup_2(), "rule__MobaDtoIndex__Group_2__0");
					put(grammarAccess.getMobaPayloadAccess().getGroup(), "rule__MobaPayload__Group__0");
					put(grammarAccess.getMobaPayloadAccess().getGroup_2(), "rule__MobaPayload__Group_2__0");
					put(grammarAccess.getMobaQueueAccess().getGroup(), "rule__MobaQueue__Group__0");
					put(grammarAccess.getMobaQueueAccess().getGroup_2(), "rule__MobaQueue__Group_2__0");
					put(grammarAccess.getMobaRestCustomAccess().getGroup(), "rule__MobaRestCustom__Group__0");
					put(grammarAccess.getMobaRestCrudAccess().getGroup(), "rule__MobaRestCrud__Group__0");
					put(grammarAccess.getMobaDtoAttributeAccess().getGroup(), "rule__MobaDtoAttribute__Group__0");
					put(grammarAccess.getMobaDtoAttributeAccess().getGroup_1_4(), "rule__MobaDtoAttribute__Group_1_4__0");
					put(grammarAccess.getMobaDtoAttributeAccess().getGroup_1_4_3(), "rule__MobaDtoAttribute__Group_1_4_3__0");
					put(grammarAccess.getMobaSettingsAttributeAccess().getGroup(), "rule__MobaSettingsAttribute__Group__0");
					put(grammarAccess.getMobaSettingsAttributeAccess().getGroup_1_4(), "rule__MobaSettingsAttribute__Group_1_4__0");
					put(grammarAccess.getMobaSettingsAttributeAccess().getGroup_1_4_3(), "rule__MobaSettingsAttribute__Group_1_4_3__0");
					put(grammarAccess.getMobaDtoReferenceAccess().getGroup(), "rule__MobaDtoReference__Group__0");
					put(grammarAccess.getMobaPayloadAttributeAccess().getGroup(), "rule__MobaPayloadAttribute__Group__0");
					put(grammarAccess.getMobaPayloadAttributeAccess().getGroup_1_4(), "rule__MobaPayloadAttribute__Group_1_4__0");
					put(grammarAccess.getMobaPayloadAttributeAccess().getGroup_1_4_3(), "rule__MobaPayloadAttribute__Group_1_4_3__0");
					put(grammarAccess.getMobaPayloadAttributeAccess().getGroup_1_5(), "rule__MobaPayloadAttribute__Group_1_5__0");
					put(grammarAccess.getMobaPayloadReferenceAccess().getGroup(), "rule__MobaPayloadReference__Group__0");
					put(grammarAccess.getMobaQueueReferenceAccess().getGroup(), "rule__MobaQueueReference__Group__0");
					put(grammarAccess.getMobaMuliplicityAccess().getGroup(), "rule__MobaMuliplicity__Group__0");
					put(grammarAccess.getMobaMuliplicityAccess().getGroup_2(), "rule__MobaMuliplicity__Group_2__0");
					put(grammarAccess.getMobaRegexpConstraintAccess().getGroup(), "rule__MobaRegexpConstraint__Group__0");
					put(grammarAccess.getMobaMinConstraintAccess().getGroup(), "rule__MobaMinConstraint__Group__0");
					put(grammarAccess.getMobaMaxConstraintAccess().getGroup(), "rule__MobaMaxConstraint__Group__0");
					put(grammarAccess.getMobaMinLengthConstraintAccess().getGroup(), "rule__MobaMinLengthConstraint__Group__0");
					put(grammarAccess.getMobaMaxLengthConstraintAccess().getGroup(), "rule__MobaMaxLengthConstraint__Group__0");
					put(grammarAccess.getMobaDigitsConstraintAccess().getGroup(), "rule__MobaDigitsConstraint__Group__0");
					put(grammarAccess.getMobaNullConstraintAccess().getGroup(), "rule__MobaNullConstraint__Group__0");
					put(grammarAccess.getMobaNotNullConstraintAccess().getGroup(), "rule__MobaNotNullConstraint__Group__0");
					put(grammarAccess.getMobaApplicationAccess().getNameAssignment_1(), "rule__MobaApplication__NameAssignment_1");
					put(grammarAccess.getMobaApplicationAccess().getFeaturesAssignment_3(), "rule__MobaApplication__FeaturesAssignment_3");
					put(grammarAccess.getMobaTemplateAccess().getTemplateAssignment_1(), "rule__MobaTemplate__TemplateAssignment_1");
					put(grammarAccess.getMobaGeneratorAccess().getActiveAssignment_0(), "rule__MobaGenerator__ActiveAssignment_0");
					put(grammarAccess.getMobaGeneratorAccess().getNameAssignment_2(), "rule__MobaGenerator__NameAssignment_2");
					put(grammarAccess.getMobaGeneratorAccess().getFeaturesAssignment_4(), "rule__MobaGenerator__FeaturesAssignment_4");
					put(grammarAccess.getMobaGeneratorIDFeatureAccess().getGeneratorConstAssignment_2_0(), "rule__MobaGeneratorIDFeature__GeneratorConstAssignment_2_0");
					put(grammarAccess.getMobaGeneratorIDFeatureAccess().getGeneratorStringAssignment_2_1(), "rule__MobaGeneratorIDFeature__GeneratorStringAssignment_2_1");
					put(grammarAccess.getMobaGeneratorMixinFeatureAccess().getGeneratorRefAssignment_1(), "rule__MobaGeneratorMixinFeature__GeneratorRefAssignment_1");
					put(grammarAccess.getMobaDataTypeAccess().getNameAssignment_1(), "rule__MobaDataType__NameAssignment_1");
					put(grammarAccess.getMobaDataTypeAccess().getSuperTypeAssignment_2_1(), "rule__MobaDataType__SuperTypeAssignment_2_1");
					put(grammarAccess.getMobaDataTypeAccess().getPrimitiveAssignment_3_0(), "rule__MobaDataType__PrimitiveAssignment_3_0");
					put(grammarAccess.getMobaDataTypeAccess().getArrayAssignment_3_1(), "rule__MobaDataType__ArrayAssignment_3_1");
					put(grammarAccess.getMobaDataTypeAccess().getDateAssignment_3_2_0_0(), "rule__MobaDataType__DateAssignment_3_2_0_0");
					put(grammarAccess.getMobaDataTypeAccess().getTimeAssignment_3_2_0_1(), "rule__MobaDataType__TimeAssignment_3_2_0_1");
					put(grammarAccess.getMobaDataTypeAccess().getTimestampAssignment_3_2_0_2(), "rule__MobaDataType__TimestampAssignment_3_2_0_2");
					put(grammarAccess.getMobaDataTypeAccess().getDateFormatStringAssignment_3_2_1_1_0(), "rule__MobaDataType__DateFormatStringAssignment_3_2_1_1_0");
					put(grammarAccess.getMobaDataTypeAccess().getDateFormatConstAssignment_3_2_1_1_1(), "rule__MobaDataType__DateFormatConstAssignment_3_2_1_1_1");
					put(grammarAccess.getMobaDataTypeAccess().getConstraintsAssignment_3_3_2(), "rule__MobaDataType__ConstraintsAssignment_3_3_2");
					put(grammarAccess.getMobaDataTypeAccess().getConstraintsAssignment_3_3_3_1(), "rule__MobaDataType__ConstraintsAssignment_3_3_3_1");
					put(grammarAccess.getMobaDataTypeAccess().getEnumASTAssignment_3_4(), "rule__MobaDataType__EnumASTAssignment_3_4");
					put(grammarAccess.getMobaEnumAccess().getNameAssignment_1(), "rule__MobaEnum__NameAssignment_1");
					put(grammarAccess.getMobaEnumAccess().getLiteralsAssignment_3(), "rule__MobaEnum__LiteralsAssignment_3");
					put(grammarAccess.getMobaEnumAccess().getLiteralsAssignment_4_1(), "rule__MobaEnum__LiteralsAssignment_4_1");
					put(grammarAccess.getMobaEnumLiteralAccess().getNameAssignment_1(), "rule__MobaEnumLiteral__NameAssignment_1");
					put(grammarAccess.getMobaEnumLiteralAccess().getLiteralAssignment_4(), "rule__MobaEnumLiteral__LiteralAssignment_4");
					put(grammarAccess.getMobaEnumLiteralAccess().getValueAssignment_6(), "rule__MobaEnumLiteral__ValueAssignment_6");
					put(grammarAccess.getMobaConstantAccess().getNameAssignment_1(), "rule__MobaConstant__NameAssignment_1");
					put(grammarAccess.getMobaConstantAccess().getValueASTAssignment_3(), "rule__MobaConstant__ValueASTAssignment_3");
					put(grammarAccess.getMobaConstantValueAccess().getValueStringAssignment_0_0(), "rule__MobaConstantValue__ValueStringAssignment_0_0");
					put(grammarAccess.getMobaConstantValueAccess().getValueConstAssignment_0_1(), "rule__MobaConstantValue__ValueConstAssignment_0_1");
					put(grammarAccess.getMobaConstantValueAccess().getTailAssignment_1_1(), "rule__MobaConstantValue__TailAssignment_1_1");
					put(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesAssignment_1(), "rule__MobaPropertiesAble__PropertiesAssignment_1");
					put(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesAssignment_2_1(), "rule__MobaPropertiesAble__PropertiesAssignment_2_1");
					put(grammarAccess.getMobaPropertyAccess().getKeyStringAssignment_0_0(), "rule__MobaProperty__KeyStringAssignment_0_0");
					put(grammarAccess.getMobaPropertyAccess().getKeyConstAssignment_0_1(), "rule__MobaProperty__KeyConstAssignment_0_1");
					put(grammarAccess.getMobaPropertyAccess().getValueStringAssignment_2_0(), "rule__MobaProperty__ValueStringAssignment_2_0");
					put(grammarAccess.getMobaPropertyAccess().getValueConstAssignment_2_1(), "rule__MobaProperty__ValueConstAssignment_2_1");
					put(grammarAccess.getMobaSettingsAccess().getActiveAssignment_1(), "rule__MobaSettings__ActiveAssignment_1");
					put(grammarAccess.getMobaSettingsAccess().getNameAssignment_3(), "rule__MobaSettings__NameAssignment_3");
					put(grammarAccess.getMobaSettingsAccess().getSuperTypeAssignment_4_1(), "rule__MobaSettings__SuperTypeAssignment_4_1");
					put(grammarAccess.getMobaSettingsAccess().getFeaturesAssignment_7(), "rule__MobaSettings__FeaturesAssignment_7");
					put(grammarAccess.getMobaCacheAccess().getCacheTypeStringAssignment_2_1_0_2_0(), "rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0");
					put(grammarAccess.getMobaCacheAccess().getCacheTypeConstAssignment_2_1_0_2_1(), "rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1");
					put(grammarAccess.getMobaCacheAccess().getCacheStrategyStringAssignment_2_1_1_2_0(), "rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0");
					put(grammarAccess.getMobaCacheAccess().getCacheStrategyConstAssignment_2_1_1_2_1(), "rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1");
					put(grammarAccess.getMobaDtoAccess().getNameAssignment_1(), "rule__MobaDto__NameAssignment_1");
					put(grammarAccess.getMobaDtoAccess().getSuperTypeAssignment_2_0_1(), "rule__MobaDto__SuperTypeAssignment_2_0_1");
					put(grammarAccess.getMobaDtoAccess().getCacheAssignment_2_1(), "rule__MobaDto__CacheAssignment_2_1");
					put(grammarAccess.getMobaDtoAccess().getFeaturesAssignment_5(), "rule__MobaDto__FeaturesAssignment_5");
					put(grammarAccess.getMobaDtoAccess().getIndexAssignment_6(), "rule__MobaDto__IndexAssignment_6");
					put(grammarAccess.getMobaDtoIndexAccess().getAttributesAssignment_1(), "rule__MobaDtoIndex__AttributesAssignment_1");
					put(grammarAccess.getMobaDtoIndexAccess().getAttributesAssignment_2_1(), "rule__MobaDtoIndex__AttributesAssignment_2_1");
					put(grammarAccess.getMobaPayloadAccess().getNameAssignment_1(), "rule__MobaPayload__NameAssignment_1");
					put(grammarAccess.getMobaPayloadAccess().getSuperTypeAssignment_2_1(), "rule__MobaPayload__SuperTypeAssignment_2_1");
					put(grammarAccess.getMobaPayloadAccess().getFeaturesAssignment_5(), "rule__MobaPayload__FeaturesAssignment_5");
					put(grammarAccess.getMobaQueueAccess().getNameAssignment_1(), "rule__MobaQueue__NameAssignment_1");
					put(grammarAccess.getMobaQueueAccess().getSuperTypeAssignment_2_1(), "rule__MobaQueue__SuperTypeAssignment_2_1");
					put(grammarAccess.getMobaQueueAccess().getFeaturesAssignment_5(), "rule__MobaQueue__FeaturesAssignment_5");
					put(grammarAccess.getMobaRestCustomAccess().getNameAssignment_1(), "rule__MobaRestCustom__NameAssignment_1");
					put(grammarAccess.getMobaRestCrudAccess().getNameAssignment_1(), "rule__MobaRestCrud__NameAssignment_1");
					put(grammarAccess.getMobaDtoAttributeAccess().getLazyAssignment_1_0(), "rule__MobaDtoAttribute__LazyAssignment_1_0");
					put(grammarAccess.getMobaDtoAttributeAccess().getTransientAssignment_1_1(), "rule__MobaDtoAttribute__TransientAssignment_1_1");
					put(grammarAccess.getMobaDtoAttributeAccess().getDomainKeyAssignment_1_2(), "rule__MobaDtoAttribute__DomainKeyAssignment_1_2");
					put(grammarAccess.getMobaDtoAttributeAccess().getDomainDescriptionAssignment_1_3(), "rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3");
					put(grammarAccess.getMobaDtoAttributeAccess().getConstraintsAssignment_1_4_2(), "rule__MobaDtoAttribute__ConstraintsAssignment_1_4_2");
					put(grammarAccess.getMobaDtoAttributeAccess().getConstraintsAssignment_1_4_3_1(), "rule__MobaDtoAttribute__ConstraintsAssignment_1_4_3_1");
					put(grammarAccess.getMobaDtoAttributeAccess().getTypeAssignment_2(), "rule__MobaDtoAttribute__TypeAssignment_2");
					put(grammarAccess.getMobaDtoAttributeAccess().getNameAssignment_4(), "rule__MobaDtoAttribute__NameAssignment_4");
					put(grammarAccess.getMobaSettingsAttributeAccess().getLazyAssignment_1_0(), "rule__MobaSettingsAttribute__LazyAssignment_1_0");
					put(grammarAccess.getMobaSettingsAttributeAccess().getTransientAssignment_1_1(), "rule__MobaSettingsAttribute__TransientAssignment_1_1");
					put(grammarAccess.getMobaSettingsAttributeAccess().getDomainKeyAssignment_1_2(), "rule__MobaSettingsAttribute__DomainKeyAssignment_1_2");
					put(grammarAccess.getMobaSettingsAttributeAccess().getDomainDescriptionAssignment_1_3(), "rule__MobaSettingsAttribute__DomainDescriptionAssignment_1_3");
					put(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsAssignment_1_4_2(), "rule__MobaSettingsAttribute__ConstraintsAssignment_1_4_2");
					put(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsAssignment_1_4_3_1(), "rule__MobaSettingsAttribute__ConstraintsAssignment_1_4_3_1");
					put(grammarAccess.getMobaSettingsAttributeAccess().getTypeAssignment_2(), "rule__MobaSettingsAttribute__TypeAssignment_2");
					put(grammarAccess.getMobaSettingsAttributeAccess().getNameAssignment_4(), "rule__MobaSettingsAttribute__NameAssignment_4");
					put(grammarAccess.getMobaMultiplicityAbleAccess().getMultiplicityAssignment(), "rule__MobaMultiplicityAble__MultiplicityAssignment");
					put(grammarAccess.getMobaDtoReferenceAccess().getCascadingAssignment_1_0(), "rule__MobaDtoReference__CascadingAssignment_1_0");
					put(grammarAccess.getMobaDtoReferenceAccess().getLazyAssignment_1_1(), "rule__MobaDtoReference__LazyAssignment_1_1");
					put(grammarAccess.getMobaDtoReferenceAccess().getTransientAssignment_1_2(), "rule__MobaDtoReference__TransientAssignment_1_2");
					put(grammarAccess.getMobaDtoReferenceAccess().getTypeAssignment_2(), "rule__MobaDtoReference__TypeAssignment_2");
					put(grammarAccess.getMobaDtoReferenceAccess().getNameAssignment_4(), "rule__MobaDtoReference__NameAssignment_4");
					put(grammarAccess.getMobaPayloadAttributeAccess().getLazyAssignment_1_0(), "rule__MobaPayloadAttribute__LazyAssignment_1_0");
					put(grammarAccess.getMobaPayloadAttributeAccess().getTransientAssignment_1_1(), "rule__MobaPayloadAttribute__TransientAssignment_1_1");
					put(grammarAccess.getMobaPayloadAttributeAccess().getDomainKeyAssignment_1_2(), "rule__MobaPayloadAttribute__DomainKeyAssignment_1_2");
					put(grammarAccess.getMobaPayloadAttributeAccess().getDomainDescriptionAssignment_1_3(), "rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3");
					put(grammarAccess.getMobaPayloadAttributeAccess().getConstraintsAssignment_1_4_2(), "rule__MobaPayloadAttribute__ConstraintsAssignment_1_4_2");
					put(grammarAccess.getMobaPayloadAttributeAccess().getConstraintsAssignment_1_4_3_1(), "rule__MobaPayloadAttribute__ConstraintsAssignment_1_4_3_1");
					put(grammarAccess.getMobaPayloadAttributeAccess().getAliasAssignment_1_5_2(), "rule__MobaPayloadAttribute__AliasAssignment_1_5_2");
					put(grammarAccess.getMobaPayloadAttributeAccess().getTypeAssignment_2(), "rule__MobaPayloadAttribute__TypeAssignment_2");
					put(grammarAccess.getMobaPayloadAttributeAccess().getNameAssignment_4(), "rule__MobaPayloadAttribute__NameAssignment_4");
					put(grammarAccess.getMobaPayloadReferenceAccess().getCascadingAssignment_1_0(), "rule__MobaPayloadReference__CascadingAssignment_1_0");
					put(grammarAccess.getMobaPayloadReferenceAccess().getLazyAssignment_1_1(), "rule__MobaPayloadReference__LazyAssignment_1_1");
					put(grammarAccess.getMobaPayloadReferenceAccess().getTransientAssignment_1_2(), "rule__MobaPayloadReference__TransientAssignment_1_2");
					put(grammarAccess.getMobaPayloadReferenceAccess().getTypeAssignment_2(), "rule__MobaPayloadReference__TypeAssignment_2");
					put(grammarAccess.getMobaPayloadReferenceAccess().getNameAssignment_4(), "rule__MobaPayloadReference__NameAssignment_4");
					put(grammarAccess.getMobaQueueReferenceAccess().getCascadingAssignment_1_0(), "rule__MobaQueueReference__CascadingAssignment_1_0");
					put(grammarAccess.getMobaQueueReferenceAccess().getLazyAssignment_1_1(), "rule__MobaQueueReference__LazyAssignment_1_1");
					put(grammarAccess.getMobaQueueReferenceAccess().getTransientAssignment_1_2(), "rule__MobaQueueReference__TransientAssignment_1_2");
					put(grammarAccess.getMobaQueueReferenceAccess().getTypeAssignment_2(), "rule__MobaQueueReference__TypeAssignment_2");
					put(grammarAccess.getMobaQueueReferenceAccess().getNameAssignment_4(), "rule__MobaQueueReference__NameAssignment_4");
					put(grammarAccess.getMobaMuliplicityAccess().getLowerAssignment_1(), "rule__MobaMuliplicity__LowerAssignment_1");
					put(grammarAccess.getMobaMuliplicityAccess().getUpperAssignment_2_1(), "rule__MobaMuliplicity__UpperAssignment_2_1");
					put(grammarAccess.getMobaRegexpConstraintAccess().getFilterStringAssignment_2_0(), "rule__MobaRegexpConstraint__FilterStringAssignment_2_0");
					put(grammarAccess.getMobaRegexpConstraintAccess().getFilterConstAssignment_2_1(), "rule__MobaRegexpConstraint__FilterConstAssignment_2_1");
					put(grammarAccess.getMobaMinConstraintAccess().getFilterValueAssignment_2_0(), "rule__MobaMinConstraint__FilterValueAssignment_2_0");
					put(grammarAccess.getMobaMinConstraintAccess().getFilterConstAssignment_2_1(), "rule__MobaMinConstraint__FilterConstAssignment_2_1");
					put(grammarAccess.getMobaMaxConstraintAccess().getFilterValueAssignment_2_0(), "rule__MobaMaxConstraint__FilterValueAssignment_2_0");
					put(grammarAccess.getMobaMaxConstraintAccess().getFilterConstAssignment_2_1(), "rule__MobaMaxConstraint__FilterConstAssignment_2_1");
					put(grammarAccess.getMobaMinLengthConstraintAccess().getFilterValueAssignment_2_0(), "rule__MobaMinLengthConstraint__FilterValueAssignment_2_0");
					put(grammarAccess.getMobaMinLengthConstraintAccess().getFilterConstAssignment_2_1(), "rule__MobaMinLengthConstraint__FilterConstAssignment_2_1");
					put(grammarAccess.getMobaMaxLengthConstraintAccess().getFilterValueAssignment_2_0(), "rule__MobaMaxLengthConstraint__FilterValueAssignment_2_0");
					put(grammarAccess.getMobaMaxLengthConstraintAccess().getFilterConstAssignment_2_1(), "rule__MobaMaxLengthConstraint__FilterConstAssignment_2_1");
					put(grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerValueAssignment_2_0(), "rule__MobaDigitsConstraint__FilterIntegerValueAssignment_2_0");
					put(grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerConstAssignment_2_1(), "rule__MobaDigitsConstraint__FilterIntegerConstAssignment_2_1");
					put(grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionValueAssignment_4_0(), "rule__MobaDigitsConstraint__FilterFractionValueAssignment_4_0");
					put(grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionConstAssignment_4_1(), "rule__MobaDigitsConstraint__FilterFractionConstAssignment_4_1");
					put(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), "rule__MobaDataType__UnorderedGroup_3");
					put(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), "rule__MobaCache__UnorderedGroup_2_1");
					put(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), "rule__MobaDto__UnorderedGroup_2");
					put(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), "rule__MobaDtoAttribute__UnorderedGroup_1");
					put(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), "rule__MobaSettingsAttribute__UnorderedGroup_1");
					put(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), "rule__MobaDtoReference__UnorderedGroup_1");
					put(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), "rule__MobaPayloadAttribute__UnorderedGroup_1");
					put(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), "rule__MobaPayloadReference__UnorderedGroup_1");
					put(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), "rule__MobaQueueReference__UnorderedGroup_1");
				}
			};
		}
		return nameMappings.get(element);
	}

	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			InternalMobaParser typedParser = (InternalMobaParser) parser;
			typedParser.entryRuleMobaApplication();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MobaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MobaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
