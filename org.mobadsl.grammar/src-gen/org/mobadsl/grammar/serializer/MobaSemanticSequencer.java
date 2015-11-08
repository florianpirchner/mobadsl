/*
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.mobadsl.grammar.services.MobaGrammarAccess;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoIndex;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPayload;
import org.mobadsl.semantic.model.moba.MobaPayloadAttribute;
import org.mobadsl.semantic.model.moba.MobaPayloadReference;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.MobaRestCrud;
import org.mobadsl.semantic.model.moba.MobaRestCustom;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaTemplate;

@SuppressWarnings("all")
public class MobaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private MobaGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MobaPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MobaPackage.MOBA_APPLICATION:
				sequence_MobaApplication(context, (MobaApplication) semanticObject); 
				return; 
			case MobaPackage.MOBA_CACHE:
				sequence_MobaCache(context, (MobaCache) semanticObject); 
				return; 
			case MobaPackage.MOBA_CONSTANT:
				sequence_MobaConstant_MobaProperties(context, (MobaConstant) semanticObject); 
				return; 
			case MobaPackage.MOBA_DATA_TYPE:
				sequence_MobaDataType_MobaProperties(context, (MobaDataType) semanticObject); 
				return; 
			case MobaPackage.MOBA_DTO:
				sequence_MobaDto_MobaProperties(context, (MobaDto) semanticObject); 
				return; 
			case MobaPackage.MOBA_DTO_ATTRIBUTE:
				sequence_MobaDtoAttribute_MobaMultiplicityProvider_MobaProperties(context, (MobaDtoAttribute) semanticObject); 
				return; 
			case MobaPackage.MOBA_DTO_INDEX:
				sequence_MobaDtoIndex(context, (MobaDtoIndex) semanticObject); 
				return; 
			case MobaPackage.MOBA_DTO_REFERENCE:
				sequence_MobaDtoReference_MobaMultiplicityProvider_MobaProperties(context, (MobaDtoReference) semanticObject); 
				return; 
			case MobaPackage.MOBA_GENERATOR:
				sequence_MobaGenerator(context, (MobaGenerator) semanticObject); 
				return; 
			case MobaPackage.MOBA_MULIPLICITY:
				sequence_MobaMuliplicity(context, (MobaMuliplicity) semanticObject); 
				return; 
			case MobaPackage.MOBA_PAYLOAD:
				sequence_MobaPayload_MobaProperties(context, (MobaPayload) semanticObject); 
				return; 
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE:
				sequence_MobaMultiplicityProvider_MobaPayloadAttribute_MobaProperties(context, (MobaPayloadAttribute) semanticObject); 
				return; 
			case MobaPackage.MOBA_PAYLOAD_REFERENCE:
				sequence_MobaMultiplicityProvider_MobaPayloadReference_MobaProperties(context, (MobaPayloadReference) semanticObject); 
				return; 
			case MobaPackage.MOBA_PROPERTY:
				sequence_MobaProperty(context, (MobaProperty) semanticObject); 
				return; 
			case MobaPackage.MOBA_QUEUE:
				sequence_MobaProperties_MobaQueue(context, (MobaQueue) semanticObject); 
				return; 
			case MobaPackage.MOBA_QUEUE_REFERENCE:
				sequence_MobaMultiplicityProvider_MobaProperties_MobaQueueReference(context, (MobaQueueReference) semanticObject); 
				return; 
			case MobaPackage.MOBA_REST_CRUD:
				sequence_MobaProperties_MobaRestCrud(context, (MobaRestCrud) semanticObject); 
				return; 
			case MobaPackage.MOBA_REST_CUSTOM:
				sequence_MobaProperties_MobaRestCustom(context, (MobaRestCustom) semanticObject); 
				return; 
			case MobaPackage.MOBA_SETTINGS:
				sequence_MobaProperties_MobaSettings(context, (MobaSettings) semanticObject); 
				return; 
			case MobaPackage.MOBA_TEMPLATE:
				sequence_MobaTemplate(context, (MobaTemplate) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     MobaApplication returns MobaApplication
	 *
	 * Constraint:
	 *     (name=ID features+=MobaApplicationFeature*)
	 */
	protected void sequence_MobaApplication(ISerializationContext context, MobaApplication semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaCache returns MobaCache
	 *
	 * Constraint:
	 *     (cacheTypeString=STRING | cacheTypeConst=[MobaConstant|ID] | cacheStrategyString=STRING | cacheStrategyConst=[MobaConstant|ID])*
	 */
	protected void sequence_MobaCache(ISerializationContext context, MobaCache semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaConstant
	 *     MobaConstant returns MobaConstant
	 *
	 * Constraint:
	 *     (name=ID value=STRING (properties+=MobaProperty properties+=MobaProperty*)?)
	 */
	protected void sequence_MobaConstant_MobaProperties(ISerializationContext context, MobaConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaDataType
	 *     MobaDataType returns MobaDataType
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (
	 *             primitive?='isPrimitive' | 
	 *             array?='isArray' | 
	 *             ((date?='isDate' | date?='isTime' | date?='isTimestamp') dateFormatConstant=[MobaConstant|ID]? dateFormatString=STRING?)
	 *         )* 
	 *         (properties+=MobaProperty properties+=MobaProperty*)?
	 *     )
	 */
	protected void sequence_MobaDataType_MobaProperties(ISerializationContext context, MobaDataType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaDtoFeature returns MobaDtoAttribute
	 *     MobaDtoAttribute returns MobaDtoAttribute
	 *
	 * Constraint:
	 *     (
	 *         (lazy?='lazy' | transient?='transient' | domainKey?='domainKey' | domainDescription?='domainDescription')* 
	 *         type=[MobaDataType|ID] 
	 *         multiplicity=MobaMuliplicity? 
	 *         name=ID 
	 *         (properties+=MobaProperty properties+=MobaProperty*)?
	 *     )
	 */
	protected void sequence_MobaDtoAttribute_MobaMultiplicityProvider_MobaProperties(ISerializationContext context, MobaDtoAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaDtoIndex returns MobaDtoIndex
	 *
	 * Constraint:
	 *     (attributes+=[MobaDtoAttribute|ID] attributes+=[MobaDtoAttribute|ID]*)
	 */
	protected void sequence_MobaDtoIndex(ISerializationContext context, MobaDtoIndex semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaDtoFeature returns MobaDtoReference
	 *     MobaDtoReference returns MobaDtoReference
	 *
	 * Constraint:
	 *     (
	 *         (cascading?='cascading' | lazy?='lazy' | transient?='transient')* 
	 *         type=[MobaDto|ID] 
	 *         multiplicity=MobaMuliplicity? 
	 *         name=ID 
	 *         (properties+=MobaProperty properties+=MobaProperty*)?
	 *     )
	 */
	protected void sequence_MobaDtoReference_MobaMultiplicityProvider_MobaProperties(ISerializationContext context, MobaDtoReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaDto
	 *     MobaData returns MobaDto
	 *     MobaDto returns MobaDto
	 *
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (superType=[MobaDto|ID] | cache=MobaCache)* 
	 *         (properties+=MobaProperty properties+=MobaProperty*)? 
	 *         features+=MobaDtoFeature* 
	 *         index=MobaDtoIndex?
	 *     )
	 */
	protected void sequence_MobaDto_MobaProperties(ISerializationContext context, MobaDto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaGenerator
	 *     MobaGenerator returns MobaGenerator
	 *
	 * Constraint:
	 *     (generatorString=STRING | generatorConst=[MobaConstant|ID])
	 */
	protected void sequence_MobaGenerator(ISerializationContext context, MobaGenerator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaMuliplicity returns MobaMuliplicity
	 *
	 * Constraint:
	 *     (lower=MobaLowerBound upper=MobaUpperBound?)
	 */
	protected void sequence_MobaMuliplicity(ISerializationContext context, MobaMuliplicity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaPayloadFeature returns MobaPayloadAttribute
	 *     MobaPayloadAttribute returns MobaPayloadAttribute
	 *
	 * Constraint:
	 *     (
	 *         (lazy?='lazy' | transient?='transient' | domainKey?='domainKey' | domainDescription?='domainDescription' | alias=ID)* 
	 *         type=[MobaDataType|ID] 
	 *         multiplicity=MobaMuliplicity? 
	 *         name=ID 
	 *         (properties+=MobaProperty properties+=MobaProperty*)?
	 *     )
	 */
	protected void sequence_MobaMultiplicityProvider_MobaPayloadAttribute_MobaProperties(ISerializationContext context, MobaPayloadAttribute semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaPayloadFeature returns MobaPayloadReference
	 *     MobaPayloadReference returns MobaPayloadReference
	 *
	 * Constraint:
	 *     (
	 *         (cascading?='cascading' | lazy?='lazy' | transient?='transient')* 
	 *         type=[MobaPayload|ID] 
	 *         multiplicity=MobaMuliplicity? 
	 *         name=ID 
	 *         (properties+=MobaProperty properties+=MobaProperty*)?
	 *     )
	 */
	protected void sequence_MobaMultiplicityProvider_MobaPayloadReference_MobaProperties(ISerializationContext context, MobaPayloadReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaQueueFeature returns MobaQueueReference
	 *     MobaQueueReference returns MobaQueueReference
	 *
	 * Constraint:
	 *     (
	 *         (cascading?='cascading' | lazy?='lazy' | transient?='transient')* 
	 *         type=[MobaData|ID] 
	 *         multiplicity=MobaMuliplicity? 
	 *         name=ID 
	 *         (properties+=MobaProperty properties+=MobaProperty*)?
	 *     )
	 */
	protected void sequence_MobaMultiplicityProvider_MobaProperties_MobaQueueReference(ISerializationContext context, MobaQueueReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaPayload
	 *     MobaData returns MobaPayload
	 *     MobaPayload returns MobaPayload
	 *
	 * Constraint:
	 *     (name=ID superType=[MobaPayload|ID]? (properties+=MobaProperty properties+=MobaProperty*)? features+=MobaPayloadFeature*)
	 */
	protected void sequence_MobaPayload_MobaProperties(ISerializationContext context, MobaPayload semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaQueue
	 *     MobaData returns MobaQueue
	 *     MobaQueue returns MobaQueue
	 *
	 * Constraint:
	 *     (name=ID superType=[MobaQueue|ID]? (properties+=MobaProperty properties+=MobaProperty*)? features+=MobaQueueFeature*)
	 */
	protected void sequence_MobaProperties_MobaQueue(ISerializationContext context, MobaQueue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaRestCrud
	 *     MobaService returns MobaRestCrud
	 *     MobaRestCrud returns MobaRestCrud
	 *
	 * Constraint:
	 *     (name=ID (properties+=MobaProperty properties+=MobaProperty*)?)
	 */
	protected void sequence_MobaProperties_MobaRestCrud(ISerializationContext context, MobaRestCrud semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaRestCustom
	 *     MobaService returns MobaRestCustom
	 *     MobaRestCustom returns MobaRestCustom
	 *
	 * Constraint:
	 *     (name=ID (properties+=MobaProperty properties+=MobaProperty*)?)
	 */
	protected void sequence_MobaProperties_MobaRestCustom(ISerializationContext context, MobaRestCustom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaSettings
	 *     MobaSettings returns MobaSettings
	 *
	 * Constraint:
	 *     (superType=[MobaSettings|ID]? (properties+=MobaProperty properties+=MobaProperty*)?)
	 */
	protected void sequence_MobaProperties_MobaSettings(ISerializationContext context, MobaSettings semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaProperty returns MobaProperty
	 *
	 * Constraint:
	 *     ((keyString=STRING | keyConst=[MobaConstant|ID]) (valueString=STRING | valueConst=[MobaConstant|ID]))
	 */
	protected void sequence_MobaProperty(ISerializationContext context, MobaProperty semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MobaApplicationFeature returns MobaTemplate
	 *     MobaTemplate returns MobaTemplate
	 *
	 * Constraint:
	 *     template=[MobaApplication|ID]
	 */
	protected void sequence_MobaTemplate(ISerializationContext context, MobaTemplate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MobaPackage.Literals.MOBA_TEMPLATE__TEMPLATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MobaPackage.Literals.MOBA_TEMPLATE__TEMPLATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationIDTerminalRuleCall_1_0_1(), semanticObject.getTemplate());
		feeder.finish();
	}
	
	
}
