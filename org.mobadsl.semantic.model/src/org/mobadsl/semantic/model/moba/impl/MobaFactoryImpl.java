/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.mobadsl.semantic.model.moba.*;
import org.mobadsl.semantic.model.moba.MobaAppInstallTrigger;
import org.mobadsl.semantic.model.moba.MobaAppUpdateTrigger;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaBlueToothModuleType;
import org.mobadsl.semantic.model.moba.MobaBluetoothModule;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaConstantValueFunction;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDeviceStartupTrigger;
import org.mobadsl.semantic.model.moba.MobaDigitsConstraint;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaEmailTrigger;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityAttribute;
import org.mobadsl.semantic.model.moba.MobaEntityIndex;
import org.mobadsl.semantic.model.moba.MobaEntityReference;
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaEnumLiteral;
import org.mobadsl.semantic.model.moba.MobaFactory;
import org.mobadsl.semantic.model.moba.MobaFriend;
import org.mobadsl.semantic.model.moba.MobaFutureConstraint;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorSlot;
import org.mobadsl.semantic.model.moba.MobaGeofenceEvent;
import org.mobadsl.semantic.model.moba.MobaGeofenceTrigger;
import org.mobadsl.semantic.model.moba.MobaLowerBound;
import org.mobadsl.semantic.model.moba.MobaMaxConstraint;
import org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaMinConstraint;
import org.mobadsl.semantic.model.moba.MobaMinLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaModel;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaNFCModule;
import org.mobadsl.semantic.model.moba.MobaNFCModuleType;
import org.mobadsl.semantic.model.moba.MobaNotNullConstraint;
import org.mobadsl.semantic.model.moba.MobaNullConstraint;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPastConstraint;
import org.mobadsl.semantic.model.moba.MobaProject;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaPushModule;
import org.mobadsl.semantic.model.moba.MobaPushTrigger;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaRESTMethods;
import org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition;
import org.mobadsl.semantic.model.moba.MobaRESTWorkflow;
import org.mobadsl.semantic.model.moba.MobaRegexpConstraint;
import org.mobadsl.semantic.model.moba.MobaSMSTrigger;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaSettingsAttribute;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaTimerTrigger;
import org.mobadsl.semantic.model.moba.MobaTransportSerializationType;
import org.mobadsl.semantic.model.moba.MobaUpperBound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaFactoryImpl extends EFactoryImpl implements MobaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MobaFactory init() {
		try {
			MobaFactory theMobaFactory = (MobaFactory)EPackage.Registry.INSTANCE.getEFactory(MobaPackage.eNS_URI);
			if (theMobaFactory != null) {
				return theMobaFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MobaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case MobaPackage.MOBA_MODEL: return createMobaModel();
			case MobaPackage.MOBA_PROJECT: return createMobaProject();
			case MobaPackage.MOBA_APPLICATION: return createMobaApplication();
			case MobaPackage.MOBA_TEMPLATE: return createMobaTemplate();
			case MobaPackage.MOBA_SERVER: return createMobaServer();
			case MobaPackage.MOBA_AUTHORIZATION: return createMobaAuthorization();
			case MobaPackage.MOBA_TRANSPORT_SERIALIZATION_TYPE: return createMobaTransportSerializationType();
			case MobaPackage.MOBA_PERSISTENCE_TYPE: return createMobaPersistenceType();
			case MobaPackage.MOBA_GENERATOR: return createMobaGenerator();
			case MobaPackage.MOBA_GENERATOR_MIXIN_FEATURE: return createMobaGeneratorMixinFeature();
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE: return createMobaGeneratorIDFeature();
			case MobaPackage.MOBA_GENERATOR_SLOT: return createMobaGeneratorSlot();
			case MobaPackage.MOBA_DATA_TYPE: return createMobaDataType();
			case MobaPackage.MOBA_CONSTANT: return createMobaConstant();
			case MobaPackage.MOBA_CACHE: return createMobaCache();
			case MobaPackage.MOBA_CONSTANT_VALUE: return createMobaConstantValue();
			case MobaPackage.MOBA_PROPERTY: return createMobaProperty();
			case MobaPackage.MOBA_SETTINGS: return createMobaSettings();
			case MobaPackage.MOBA_SETTINGS_ATTRIBUTE: return createMobaSettingsAttribute();
			case MobaPackage.MOBA_SETTINGS_ENTITY_REFERENCE: return createMobaSettingsEntityReference();
			case MobaPackage.MOBA_ENTITY: return createMobaEntity();
			case MobaPackage.MOBA_ENTITY_INDEX: return createMobaEntityIndex();
			case MobaPackage.MOBA_DTO: return createMobaDto();
			case MobaPackage.MOBA_QUEUE: return createMobaQueue();
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION: return createMobaRESTPayloadDefinition();
			case MobaPackage.MOBA_REST_ATTRIBUTE: return createMobaRESTAttribute();
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE: return createMobaRESTCustomService();
			case MobaPackage.MOBA_REST_WORKFLOW: return createMobaRESTWorkflow();
			case MobaPackage.MOBA_REST_CRUD: return createMobaRESTCrud();
			case MobaPackage.MOBA_ENTITY_ATTRIBUTE: return createMobaEntityAttribute();
			case MobaPackage.MOBA_ENTITY_REFERENCE: return createMobaEntityReference();
			case MobaPackage.MOBA_ENTITY_EMBEDDABLE: return createMobaEntityEmbeddable();
			case MobaPackage.MOBA_DTO_ATTRIBUTE: return createMobaDtoAttribute();
			case MobaPackage.MOBA_DTO_REFERENCE: return createMobaDtoReference();
			case MobaPackage.MOBA_DTO_EMBEDDABLE: return createMobaDtoEmbeddable();
			case MobaPackage.MOBA_QUEUE_REFERENCE: return createMobaQueueReference();
			case MobaPackage.MOBA_MULIPLICITY: return createMobaMuliplicity();
			case MobaPackage.MOBA_REGEXP_CONSTRAINT: return createMobaRegexpConstraint();
			case MobaPackage.MOBA_MIN_CONSTRAINT: return createMobaMinConstraint();
			case MobaPackage.MOBA_MAX_CONSTRAINT: return createMobaMaxConstraint();
			case MobaPackage.MOBA_FUTURE_CONSTRAINT: return createMobaFutureConstraint();
			case MobaPackage.MOBA_PAST_CONSTRAINT: return createMobaPastConstraint();
			case MobaPackage.MOBA_NOT_NULL_CONSTRAINT: return createMobaNotNullConstraint();
			case MobaPackage.MOBA_NULL_CONSTRAINT: return createMobaNullConstraint();
			case MobaPackage.MOBA_MIN_LENGTH_CONSTRAINT: return createMobaMinLengthConstraint();
			case MobaPackage.MOBA_MAX_LENGTH_CONSTRAINT: return createMobaMaxLengthConstraint();
			case MobaPackage.MOBA_DIGITS_CONSTRAINT: return createMobaDigitsConstraint();
			case MobaPackage.MOBA_ENUM: return createMobaEnum();
			case MobaPackage.MOBA_ENUM_LITERAL: return createMobaEnumLiteral();
			case MobaPackage.MOBA_APP_INSTALL_TRIGGER: return createMobaAppInstallTrigger();
			case MobaPackage.MOBA_APP_UPDATE_TRIGGER: return createMobaAppUpdateTrigger();
			case MobaPackage.MOBA_SMS_TRIGGER: return createMobaSMSTrigger();
			case MobaPackage.MOBA_DEVICE_STARTUP_TRIGGER: return createMobaDeviceStartupTrigger();
			case MobaPackage.MOBA_EMAIL_TRIGGER: return createMobaEmailTrigger();
			case MobaPackage.MOBA_TIMER_TRIGGER: return createMobaTimerTrigger();
			case MobaPackage.MOBA_PUSH_TRIGGER: return createMobaPushTrigger();
			case MobaPackage.MOBA_GEOFENCE_TRIGGER: return createMobaGeofenceTrigger();
			case MobaPackage.MOBA_FRIEND: return createMobaFriend();
			case MobaPackage.MOBA_BLUETOOTH_MODULE: return createMobaBluetoothModule();
			case MobaPackage.MOBA_NFC_MODULE: return createMobaNFCModule();
			case MobaPackage.MOBA_PUSH_MODULE: return createMobaPushModule();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case MobaPackage.MOBA_CONSTANT_VALUE_FUNCTION:
				return createMobaConstantValueFunctionFromString(eDataType, initialValue);
			case MobaPackage.MOBA_REST_METHODS:
				return createMobaRESTMethodsFromString(eDataType, initialValue);
			case MobaPackage.MOBA_LOWER_BOUND:
				return createMobaLowerBoundFromString(eDataType, initialValue);
			case MobaPackage.MOBA_UPPER_BOUND:
				return createMobaUpperBoundFromString(eDataType, initialValue);
			case MobaPackage.MOBA_GEOFENCE_EVENT:
				return createMobaGeofenceEventFromString(eDataType, initialValue);
			case MobaPackage.MOBA_NFC_MODULE_TYPE:
				return createMobaNFCModuleTypeFromString(eDataType, initialValue);
			case MobaPackage.MOBA_BLUE_TOOTH_MODULE_TYPE:
				return createMobaBlueToothModuleTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case MobaPackage.MOBA_CONSTANT_VALUE_FUNCTION:
				return convertMobaConstantValueFunctionToString(eDataType, instanceValue);
			case MobaPackage.MOBA_REST_METHODS:
				return convertMobaRESTMethodsToString(eDataType, instanceValue);
			case MobaPackage.MOBA_LOWER_BOUND:
				return convertMobaLowerBoundToString(eDataType, instanceValue);
			case MobaPackage.MOBA_UPPER_BOUND:
				return convertMobaUpperBoundToString(eDataType, instanceValue);
			case MobaPackage.MOBA_GEOFENCE_EVENT:
				return convertMobaGeofenceEventToString(eDataType, instanceValue);
			case MobaPackage.MOBA_NFC_MODULE_TYPE:
				return convertMobaNFCModuleTypeToString(eDataType, instanceValue);
			case MobaPackage.MOBA_BLUE_TOOTH_MODULE_TYPE:
				return convertMobaBlueToothModuleTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaModel createMobaModel() {
		MobaModelImpl mobaModel = new MobaModelImpl();
		return mobaModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaProject createMobaProject() {
		MobaProjectImpl mobaProject = new MobaProjectImpl();
		return mobaProject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaApplication createMobaApplication() {
		MobaApplicationImpl mobaApplication = new MobaApplicationImpl();
		return mobaApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaTemplate createMobaTemplate() {
		MobaTemplateImpl mobaTemplate = new MobaTemplateImpl();
		return mobaTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaServer createMobaServer() {
		MobaServerImpl mobaServer = new MobaServerImpl();
		return mobaServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaAuthorization createMobaAuthorization() {
		MobaAuthorizationImpl mobaAuthorization = new MobaAuthorizationImpl();
		return mobaAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaTransportSerializationType createMobaTransportSerializationType() {
		MobaTransportSerializationTypeImpl mobaTransportSerializationType = new MobaTransportSerializationTypeImpl();
		return mobaTransportSerializationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPersistenceType createMobaPersistenceType() {
		MobaPersistenceTypeImpl mobaPersistenceType = new MobaPersistenceTypeImpl();
		return mobaPersistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaGenerator createMobaGenerator() {
		MobaGeneratorImpl mobaGenerator = new MobaGeneratorImpl();
		return mobaGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaGeneratorMixinFeature createMobaGeneratorMixinFeature() {
		MobaGeneratorMixinFeatureImpl mobaGeneratorMixinFeature = new MobaGeneratorMixinFeatureImpl();
		return mobaGeneratorMixinFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaGeneratorIDFeature createMobaGeneratorIDFeature() {
		MobaGeneratorIDFeatureImpl mobaGeneratorIDFeature = new MobaGeneratorIDFeatureImpl();
		return mobaGeneratorIDFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDataType createMobaDataType() {
		MobaDataTypeImpl mobaDataType = new MobaDataTypeImpl();
		return mobaDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant createMobaConstant() {
		MobaConstantImpl mobaConstant = new MobaConstantImpl();
		return mobaConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstantValue createMobaConstantValue() {
		MobaConstantValueImpl mobaConstantValue = new MobaConstantValueImpl();
		return mobaConstantValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaProperty createMobaProperty() {
		MobaPropertyImpl mobaProperty = new MobaPropertyImpl();
		return mobaProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSettings createMobaSettings() {
		MobaSettingsImpl mobaSettings = new MobaSettingsImpl();
		return mobaSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaCache createMobaCache() {
		MobaCacheImpl mobaCache = new MobaCacheImpl();
		return mobaCache;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntity createMobaEntity() {
		MobaEntityImpl mobaEntity = new MobaEntityImpl();
		return mobaEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntityIndex createMobaEntityIndex() {
		MobaEntityIndexImpl mobaEntityIndex = new MobaEntityIndexImpl();
		return mobaEntityIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDto createMobaDto() {
		MobaDtoImpl mobaDto = new MobaDtoImpl();
		return mobaDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaQueue createMobaQueue() {
		MobaQueueImpl mobaQueue = new MobaQueueImpl();
		return mobaQueue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTPayloadDefinition createMobaRESTPayloadDefinition() {
		MobaRESTPayloadDefinitionImpl mobaRESTPayloadDefinition = new MobaRESTPayloadDefinitionImpl();
		return mobaRESTPayloadDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTAttribute createMobaRESTAttribute() {
		MobaRESTAttributeImpl mobaRESTAttribute = new MobaRESTAttributeImpl();
		return mobaRESTAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTCustomService createMobaRESTCustomService() {
		MobaRESTCustomServiceImpl mobaRESTCustomService = new MobaRESTCustomServiceImpl();
		return mobaRESTCustomService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTWorkflow createMobaRESTWorkflow() {
		MobaRESTWorkflowImpl mobaRESTWorkflow = new MobaRESTWorkflowImpl();
		return mobaRESTWorkflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTCrud createMobaRESTCrud() {
		MobaRESTCrudImpl mobaRESTCrud = new MobaRESTCrudImpl();
		return mobaRESTCrud;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntityAttribute createMobaEntityAttribute() {
		MobaEntityAttributeImpl mobaEntityAttribute = new MobaEntityAttributeImpl();
		return mobaEntityAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntityReference createMobaEntityReference() {
		MobaEntityReferenceImpl mobaEntityReference = new MobaEntityReferenceImpl();
		return mobaEntityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEntityEmbeddable createMobaEntityEmbeddable() {
		MobaEntityEmbeddableImpl mobaEntityEmbeddable = new MobaEntityEmbeddableImpl();
		return mobaEntityEmbeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDtoAttribute createMobaDtoAttribute() {
		MobaDtoAttributeImpl mobaDtoAttribute = new MobaDtoAttributeImpl();
		return mobaDtoAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDtoReference createMobaDtoReference() {
		MobaDtoReferenceImpl mobaDtoReference = new MobaDtoReferenceImpl();
		return mobaDtoReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDtoEmbeddable createMobaDtoEmbeddable() {
		MobaDtoEmbeddableImpl mobaDtoEmbeddable = new MobaDtoEmbeddableImpl();
		return mobaDtoEmbeddable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaQueueReference createMobaQueueReference() {
		MobaQueueReferenceImpl mobaQueueReference = new MobaQueueReferenceImpl();
		return mobaQueueReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMuliplicity createMobaMuliplicity() {
		MobaMuliplicityImpl mobaMuliplicity = new MobaMuliplicityImpl();
		return mobaMuliplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSettingsAttribute createMobaSettingsAttribute() {
		MobaSettingsAttributeImpl mobaSettingsAttribute = new MobaSettingsAttributeImpl();
		return mobaSettingsAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSettingsEntityReference createMobaSettingsEntityReference() {
		MobaSettingsEntityReferenceImpl mobaSettingsEntityReference = new MobaSettingsEntityReferenceImpl();
		return mobaSettingsEntityReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRegexpConstraint createMobaRegexpConstraint() {
		MobaRegexpConstraintImpl mobaRegexpConstraint = new MobaRegexpConstraintImpl();
		return mobaRegexpConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMinConstraint createMobaMinConstraint() {
		MobaMinConstraintImpl mobaMinConstraint = new MobaMinConstraintImpl();
		return mobaMinConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMaxConstraint createMobaMaxConstraint() {
		MobaMaxConstraintImpl mobaMaxConstraint = new MobaMaxConstraintImpl();
		return mobaMaxConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaFutureConstraint createMobaFutureConstraint() {
		MobaFutureConstraintImpl mobaFutureConstraint = new MobaFutureConstraintImpl();
		return mobaFutureConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPastConstraint createMobaPastConstraint() {
		MobaPastConstraintImpl mobaPastConstraint = new MobaPastConstraintImpl();
		return mobaPastConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaNotNullConstraint createMobaNotNullConstraint() {
		MobaNotNullConstraintImpl mobaNotNullConstraint = new MobaNotNullConstraintImpl();
		return mobaNotNullConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaNullConstraint createMobaNullConstraint() {
		MobaNullConstraintImpl mobaNullConstraint = new MobaNullConstraintImpl();
		return mobaNullConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMinLengthConstraint createMobaMinLengthConstraint() {
		MobaMinLengthConstraintImpl mobaMinLengthConstraint = new MobaMinLengthConstraintImpl();
		return mobaMinLengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMaxLengthConstraint createMobaMaxLengthConstraint() {
		MobaMaxLengthConstraintImpl mobaMaxLengthConstraint = new MobaMaxLengthConstraintImpl();
		return mobaMaxLengthConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDigitsConstraint createMobaDigitsConstraint() {
		MobaDigitsConstraintImpl mobaDigitsConstraint = new MobaDigitsConstraintImpl();
		return mobaDigitsConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEnum createMobaEnum() {
		MobaEnumImpl mobaEnum = new MobaEnumImpl();
		return mobaEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEnumLiteral createMobaEnumLiteral() {
		MobaEnumLiteralImpl mobaEnumLiteral = new MobaEnumLiteralImpl();
		return mobaEnumLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaAppInstallTrigger createMobaAppInstallTrigger() {
		MobaAppInstallTriggerImpl mobaAppInstallTrigger = new MobaAppInstallTriggerImpl();
		return mobaAppInstallTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaAppUpdateTrigger createMobaAppUpdateTrigger() {
		MobaAppUpdateTriggerImpl mobaAppUpdateTrigger = new MobaAppUpdateTriggerImpl();
		return mobaAppUpdateTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSMSTrigger createMobaSMSTrigger() {
		MobaSMSTriggerImpl mobaSMSTrigger = new MobaSMSTriggerImpl();
		return mobaSMSTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDeviceStartupTrigger createMobaDeviceStartupTrigger() {
		MobaDeviceStartupTriggerImpl mobaDeviceStartupTrigger = new MobaDeviceStartupTriggerImpl();
		return mobaDeviceStartupTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaEmailTrigger createMobaEmailTrigger() {
		MobaEmailTriggerImpl mobaEmailTrigger = new MobaEmailTriggerImpl();
		return mobaEmailTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaTimerTrigger createMobaTimerTrigger() {
		MobaTimerTriggerImpl mobaTimerTrigger = new MobaTimerTriggerImpl();
		return mobaTimerTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPushTrigger createMobaPushTrigger() {
		MobaPushTriggerImpl mobaPushTrigger = new MobaPushTriggerImpl();
		return mobaPushTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaGeofenceTrigger createMobaGeofenceTrigger() {
		MobaGeofenceTriggerImpl mobaGeofenceTrigger = new MobaGeofenceTriggerImpl();
		return mobaGeofenceTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaGeneratorSlot createMobaGeneratorSlot() {
		MobaGeneratorSlotImpl mobaGeneratorSlot = new MobaGeneratorSlotImpl();
		return mobaGeneratorSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaFriend createMobaFriend() {
		MobaFriendImpl mobaFriend = new MobaFriendImpl();
		return mobaFriend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaBluetoothModule createMobaBluetoothModule() {
		MobaBluetoothModuleImpl mobaBluetoothModule = new MobaBluetoothModuleImpl();
		return mobaBluetoothModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaNFCModule createMobaNFCModule() {
		MobaNFCModuleImpl mobaNFCModule = new MobaNFCModuleImpl();
		return mobaNFCModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPushModule createMobaPushModule() {
		MobaPushModuleImpl mobaPushModule = new MobaPushModuleImpl();
		return mobaPushModule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstantValueFunction createMobaConstantValueFunctionFromString(EDataType eDataType, String initialValue) {
		MobaConstantValueFunction result = MobaConstantValueFunction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobaConstantValueFunctionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTMethods createMobaRESTMethodsFromString(EDataType eDataType, String initialValue) {
		MobaRESTMethods result = MobaRESTMethods.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobaRESTMethodsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaLowerBound createMobaLowerBoundFromString(EDataType eDataType, String initialValue) {
		MobaLowerBound result = MobaLowerBound.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobaLowerBoundToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaUpperBound createMobaUpperBoundFromString(EDataType eDataType, String initialValue) {
		MobaUpperBound result = MobaUpperBound.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobaUpperBoundToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaGeofenceEvent createMobaGeofenceEventFromString(EDataType eDataType, String initialValue) {
		MobaGeofenceEvent result = MobaGeofenceEvent.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobaGeofenceEventToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaNFCModuleType createMobaNFCModuleTypeFromString(EDataType eDataType, String initialValue) {
		MobaNFCModuleType result = MobaNFCModuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobaNFCModuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaBlueToothModuleType createMobaBlueToothModuleTypeFromString(EDataType eDataType, String initialValue) {
		MobaBlueToothModuleType result = MobaBlueToothModuleType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMobaBlueToothModuleTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPackage getMobaPackage() {
		return (MobaPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MobaPackage getPackage() {
		return MobaPackage.eINSTANCE;
	}

} //MobaFactoryImpl
