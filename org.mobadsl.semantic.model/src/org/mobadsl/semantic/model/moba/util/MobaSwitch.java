/**
 */
package org.mobadsl.semantic.model.moba.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;
import org.mobadsl.semantic.model.moba.*;
import org.mobadsl.semantic.model.moba.MobaAppInstallTrigger;
import org.mobadsl.semantic.model.moba.MobaAppUpdateTrigger;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaBluetoothModule;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaConstraint;
import org.mobadsl.semantic.model.moba.MobaConstraintable;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDeviceStartupTrigger;
import org.mobadsl.semantic.model.moba.MobaDigitsConstraint;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoFeature;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaEmailTrigger;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityAttribute;
import org.mobadsl.semantic.model.moba.MobaEntityFeature;
import org.mobadsl.semantic.model.moba.MobaEntityIndex;
import org.mobadsl.semantic.model.moba.MobaEntityReference;
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaEnumLiteral;
import org.mobadsl.semantic.model.moba.MobaExternalModule;
import org.mobadsl.semantic.model.moba.MobaFeature;
import org.mobadsl.semantic.model.moba.MobaFriend;
import org.mobadsl.semantic.model.moba.MobaFriendsAble;
import org.mobadsl.semantic.model.moba.MobaFutureConstraint;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorSlot;
import org.mobadsl.semantic.model.moba.MobaGeofenceTrigger;
import org.mobadsl.semantic.model.moba.MobaMaxConstraint;
import org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaMinConstraint;
import org.mobadsl.semantic.model.moba.MobaMinLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaModel;
import org.mobadsl.semantic.model.moba.MobaModelFeature;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaMultiplicityAble;
import org.mobadsl.semantic.model.moba.MobaNFCModule;
import org.mobadsl.semantic.model.moba.MobaNotNullConstraint;
import org.mobadsl.semantic.model.moba.MobaNullConstraint;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPastConstraint;
import org.mobadsl.semantic.model.moba.MobaProject;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaPushModule;
import org.mobadsl.semantic.model.moba.MobaPushTrigger;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueFeature;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition;
import org.mobadsl.semantic.model.moba.MobaRESTWorkflow;
import org.mobadsl.semantic.model.moba.MobaRegexpConstraint;
import org.mobadsl.semantic.model.moba.MobaSMSTrigger;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaSettingsAttribute;
import org.mobadsl.semantic.model.moba.MobaSettingsFeature;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaTimerTrigger;
import org.mobadsl.semantic.model.moba.MobaTransportSerializationType;
import org.mobadsl.semantic.model.moba.MobaTrigger;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.mobadsl.semantic.model.moba.MobaPackage
 * @generated
 */
public class MobaSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MobaPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaSwitch() {
		if (modelPackage == null) {
			modelPackage = MobaPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case MobaPackage.MOBA_MODEL: {
				MobaModel mobaModel = (MobaModel)theEObject;
				T result = caseMobaModel(mobaModel);
				if (result == null) result = caseMobaFriendsAble(mobaModel);
				if (result == null) result = caseMobaPropertiesAble(mobaModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_MODEL_FEATURE: {
				MobaModelFeature mobaModelFeature = (MobaModelFeature)theEObject;
				T result = caseMobaModelFeature(mobaModelFeature);
				if (result == null) result = caseMobaFriendsAble(mobaModelFeature);
				if (result == null) result = caseMobaPropertiesAble(mobaModelFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PROJECT: {
				MobaProject mobaProject = (MobaProject)theEObject;
				T result = caseMobaProject(mobaProject);
				if (result == null) result = caseMobaModelFeature(mobaProject);
				if (result == null) result = caseMobaFriendsAble(mobaProject);
				if (result == null) result = caseMobaPropertiesAble(mobaProject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_APPLICATION: {
				MobaApplication mobaApplication = (MobaApplication)theEObject;
				T result = caseMobaApplication(mobaApplication);
				if (result == null) result = caseMobaModelFeature(mobaApplication);
				if (result == null) result = caseMobaFriendsAble(mobaApplication);
				if (result == null) result = caseMobaPropertiesAble(mobaApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_APPLICATION_FEATURE: {
				MobaApplicationFeature mobaApplicationFeature = (MobaApplicationFeature)theEObject;
				T result = caseMobaApplicationFeature(mobaApplicationFeature);
				if (result == null) result = caseMobaFriendsAble(mobaApplicationFeature);
				if (result == null) result = caseMobaPropertiesAble(mobaApplicationFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_TEMPLATE: {
				MobaTemplate mobaTemplate = (MobaTemplate)theEObject;
				T result = caseMobaTemplate(mobaTemplate);
				if (result == null) result = caseMobaApplicationFeature(mobaTemplate);
				if (result == null) result = caseMobaFriendsAble(mobaTemplate);
				if (result == null) result = caseMobaPropertiesAble(mobaTemplate);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_SERVER: {
				MobaServer mobaServer = (MobaServer)theEObject;
				T result = caseMobaServer(mobaServer);
				if (result == null) result = caseMobaApplicationFeature(mobaServer);
				if (result == null) result = caseMobaFriendsAble(mobaServer);
				if (result == null) result = caseMobaPropertiesAble(mobaServer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_AUTHORIZATION: {
				MobaAuthorization mobaAuthorization = (MobaAuthorization)theEObject;
				T result = caseMobaAuthorization(mobaAuthorization);
				if (result == null) result = caseMobaApplicationFeature(mobaAuthorization);
				if (result == null) result = caseMobaFriendsAble(mobaAuthorization);
				if (result == null) result = caseMobaPropertiesAble(mobaAuthorization);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_TRANSPORT_SERIALIZATION_TYPE: {
				MobaTransportSerializationType mobaTransportSerializationType = (MobaTransportSerializationType)theEObject;
				T result = caseMobaTransportSerializationType(mobaTransportSerializationType);
				if (result == null) result = caseMobaApplicationFeature(mobaTransportSerializationType);
				if (result == null) result = caseMobaFriendsAble(mobaTransportSerializationType);
				if (result == null) result = caseMobaPropertiesAble(mobaTransportSerializationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PERSISTENCE_TYPE: {
				MobaPersistenceType mobaPersistenceType = (MobaPersistenceType)theEObject;
				T result = caseMobaPersistenceType(mobaPersistenceType);
				if (result == null) result = caseMobaApplicationFeature(mobaPersistenceType);
				if (result == null) result = caseMobaFriendsAble(mobaPersistenceType);
				if (result == null) result = caseMobaPropertiesAble(mobaPersistenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_GENERATOR: {
				MobaGenerator mobaGenerator = (MobaGenerator)theEObject;
				T result = caseMobaGenerator(mobaGenerator);
				if (result == null) result = caseMobaApplicationFeature(mobaGenerator);
				if (result == null) result = caseMobaFriendsAble(mobaGenerator);
				if (result == null) result = caseMobaPropertiesAble(mobaGenerator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_GENERATOR_FEATURE: {
				MobaGeneratorFeature mobaGeneratorFeature = (MobaGeneratorFeature)theEObject;
				T result = caseMobaGeneratorFeature(mobaGeneratorFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_GENERATOR_MIXIN_FEATURE: {
				MobaGeneratorMixinFeature mobaGeneratorMixinFeature = (MobaGeneratorMixinFeature)theEObject;
				T result = caseMobaGeneratorMixinFeature(mobaGeneratorMixinFeature);
				if (result == null) result = caseMobaGeneratorFeature(mobaGeneratorMixinFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE: {
				MobaGeneratorIDFeature mobaGeneratorIDFeature = (MobaGeneratorIDFeature)theEObject;
				T result = caseMobaGeneratorIDFeature(mobaGeneratorIDFeature);
				if (result == null) result = caseMobaGeneratorFeature(mobaGeneratorIDFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_GENERATOR_SLOT: {
				MobaGeneratorSlot mobaGeneratorSlot = (MobaGeneratorSlot)theEObject;
				T result = caseMobaGeneratorSlot(mobaGeneratorSlot);
				if (result == null) result = caseMobaApplicationFeature(mobaGeneratorSlot);
				if (result == null) result = caseMobaFriendsAble(mobaGeneratorSlot);
				if (result == null) result = caseMobaPropertiesAble(mobaGeneratorSlot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DATA_TYPE: {
				MobaDataType mobaDataType = (MobaDataType)theEObject;
				T result = caseMobaDataType(mobaDataType);
				if (result == null) result = caseMobaApplicationFeature(mobaDataType);
				if (result == null) result = caseMobaConstraintable(mobaDataType);
				if (result == null) result = caseMobaFriendsAble(mobaDataType);
				if (result == null) result = caseMobaPropertiesAble(mobaDataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_CONSTANT: {
				MobaConstant mobaConstant = (MobaConstant)theEObject;
				T result = caseMobaConstant(mobaConstant);
				if (result == null) result = caseMobaApplicationFeature(mobaConstant);
				if (result == null) result = caseMobaFriendsAble(mobaConstant);
				if (result == null) result = caseMobaPropertiesAble(mobaConstant);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_CONSTANT_VALUE: {
				MobaConstantValue mobaConstantValue = (MobaConstantValue)theEObject;
				T result = caseMobaConstantValue(mobaConstantValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PROPERTIES_ABLE: {
				MobaPropertiesAble mobaPropertiesAble = (MobaPropertiesAble)theEObject;
				T result = caseMobaPropertiesAble(mobaPropertiesAble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PROPERTY: {
				MobaProperty mobaProperty = (MobaProperty)theEObject;
				T result = caseMobaProperty(mobaProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DATA: {
				MobaData mobaData = (MobaData)theEObject;
				T result = caseMobaData(mobaData);
				if (result == null) result = caseMobaApplicationFeature(mobaData);
				if (result == null) result = caseMobaFriendsAble(mobaData);
				if (result == null) result = caseMobaPropertiesAble(mobaData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_SETTINGS: {
				MobaSettings mobaSettings = (MobaSettings)theEObject;
				T result = caseMobaSettings(mobaSettings);
				if (result == null) result = caseMobaApplicationFeature(mobaSettings);
				if (result == null) result = caseMobaFriendsAble(mobaSettings);
				if (result == null) result = caseMobaPropertiesAble(mobaSettings);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_SETTINGS_FEATURE: {
				MobaSettingsFeature mobaSettingsFeature = (MobaSettingsFeature)theEObject;
				T result = caseMobaSettingsFeature(mobaSettingsFeature);
				if (result == null) result = caseMobaFeature(mobaSettingsFeature);
				if (result == null) result = caseMobaFriendsAble(mobaSettingsFeature);
				if (result == null) result = caseMobaPropertiesAble(mobaSettingsFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_SETTINGS_ATTRIBUTE: {
				MobaSettingsAttribute mobaSettingsAttribute = (MobaSettingsAttribute)theEObject;
				T result = caseMobaSettingsAttribute(mobaSettingsAttribute);
				if (result == null) result = caseMobaSettingsFeature(mobaSettingsAttribute);
				if (result == null) result = caseMobaMultiplicityAble(mobaSettingsAttribute);
				if (result == null) result = caseMobaConstraintable(mobaSettingsAttribute);
				if (result == null) result = caseMobaFeature(mobaSettingsAttribute);
				if (result == null) result = caseMobaFriendsAble(mobaSettingsAttribute);
				if (result == null) result = caseMobaPropertiesAble(mobaSettingsAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_SETTINGS_ENTITY_REFERENCE: {
				MobaSettingsEntityReference mobaSettingsEntityReference = (MobaSettingsEntityReference)theEObject;
				T result = caseMobaSettingsEntityReference(mobaSettingsEntityReference);
				if (result == null) result = caseMobaSettingsFeature(mobaSettingsEntityReference);
				if (result == null) result = caseMobaMultiplicityAble(mobaSettingsEntityReference);
				if (result == null) result = caseMobaConstraintable(mobaSettingsEntityReference);
				if (result == null) result = caseMobaFeature(mobaSettingsEntityReference);
				if (result == null) result = caseMobaFriendsAble(mobaSettingsEntityReference);
				if (result == null) result = caseMobaPropertiesAble(mobaSettingsEntityReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_CACHE: {
				MobaCache mobaCache = (MobaCache)theEObject;
				T result = caseMobaCache(mobaCache);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_ENTITY: {
				MobaEntity mobaEntity = (MobaEntity)theEObject;
				T result = caseMobaEntity(mobaEntity);
				if (result == null) result = caseMobaData(mobaEntity);
				if (result == null) result = caseMobaApplicationFeature(mobaEntity);
				if (result == null) result = caseMobaFriendsAble(mobaEntity);
				if (result == null) result = caseMobaPropertiesAble(mobaEntity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_ENTITY_INDEX: {
				MobaEntityIndex mobaEntityIndex = (MobaEntityIndex)theEObject;
				T result = caseMobaEntityIndex(mobaEntityIndex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO: {
				MobaDto mobaDto = (MobaDto)theEObject;
				T result = caseMobaDto(mobaDto);
				if (result == null) result = caseMobaData(mobaDto);
				if (result == null) result = caseMobaApplicationFeature(mobaDto);
				if (result == null) result = caseMobaFriendsAble(mobaDto);
				if (result == null) result = caseMobaPropertiesAble(mobaDto);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_QUEUE: {
				MobaQueue mobaQueue = (MobaQueue)theEObject;
				T result = caseMobaQueue(mobaQueue);
				if (result == null) result = caseMobaData(mobaQueue);
				if (result == null) result = caseMobaApplicationFeature(mobaQueue);
				if (result == null) result = caseMobaFriendsAble(mobaQueue);
				if (result == null) result = caseMobaPropertiesAble(mobaQueue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_REST: {
				MobaREST mobaREST = (MobaREST)theEObject;
				T result = caseMobaREST(mobaREST);
				if (result == null) result = caseMobaApplicationFeature(mobaREST);
				if (result == null) result = caseMobaFriendsAble(mobaREST);
				if (result == null) result = caseMobaPropertiesAble(mobaREST);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION: {
				MobaRESTPayloadDefinition mobaRESTPayloadDefinition = (MobaRESTPayloadDefinition)theEObject;
				T result = caseMobaRESTPayloadDefinition(mobaRESTPayloadDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_REST_ATTRIBUTE: {
				MobaRESTAttribute mobaRESTAttribute = (MobaRESTAttribute)theEObject;
				T result = caseMobaRESTAttribute(mobaRESTAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_REST_CUSTOM_SERVICE: {
				MobaRESTCustomService mobaRESTCustomService = (MobaRESTCustomService)theEObject;
				T result = caseMobaRESTCustomService(mobaRESTCustomService);
				if (result == null) result = caseMobaREST(mobaRESTCustomService);
				if (result == null) result = caseMobaApplicationFeature(mobaRESTCustomService);
				if (result == null) result = caseMobaFriendsAble(mobaRESTCustomService);
				if (result == null) result = caseMobaPropertiesAble(mobaRESTCustomService);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_REST_WORKFLOW: {
				MobaRESTWorkflow mobaRESTWorkflow = (MobaRESTWorkflow)theEObject;
				T result = caseMobaRESTWorkflow(mobaRESTWorkflow);
				if (result == null) result = caseMobaREST(mobaRESTWorkflow);
				if (result == null) result = caseMobaApplicationFeature(mobaRESTWorkflow);
				if (result == null) result = caseMobaFriendsAble(mobaRESTWorkflow);
				if (result == null) result = caseMobaPropertiesAble(mobaRESTWorkflow);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_REST_CRUD: {
				MobaRESTCrud mobaRESTCrud = (MobaRESTCrud)theEObject;
				T result = caseMobaRESTCrud(mobaRESTCrud);
				if (result == null) result = caseMobaREST(mobaRESTCrud);
				if (result == null) result = caseMobaApplicationFeature(mobaRESTCrud);
				if (result == null) result = caseMobaFriendsAble(mobaRESTCrud);
				if (result == null) result = caseMobaPropertiesAble(mobaRESTCrud);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_FEATURE: {
				MobaFeature mobaFeature = (MobaFeature)theEObject;
				T result = caseMobaFeature(mobaFeature);
				if (result == null) result = caseMobaFriendsAble(mobaFeature);
				if (result == null) result = caseMobaPropertiesAble(mobaFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_ENTITY_FEATURE: {
				MobaEntityFeature mobaEntityFeature = (MobaEntityFeature)theEObject;
				T result = caseMobaEntityFeature(mobaEntityFeature);
				if (result == null) result = caseMobaFeature(mobaEntityFeature);
				if (result == null) result = caseMobaFriendsAble(mobaEntityFeature);
				if (result == null) result = caseMobaPropertiesAble(mobaEntityFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_ENTITY_ATTRIBUTE: {
				MobaEntityAttribute mobaEntityAttribute = (MobaEntityAttribute)theEObject;
				T result = caseMobaEntityAttribute(mobaEntityAttribute);
				if (result == null) result = caseMobaEntityFeature(mobaEntityAttribute);
				if (result == null) result = caseMobaMultiplicityAble(mobaEntityAttribute);
				if (result == null) result = caseMobaConstraintable(mobaEntityAttribute);
				if (result == null) result = caseMobaFeature(mobaEntityAttribute);
				if (result == null) result = caseMobaFriendsAble(mobaEntityAttribute);
				if (result == null) result = caseMobaPropertiesAble(mobaEntityAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_MULTIPLICITY_ABLE: {
				MobaMultiplicityAble mobaMultiplicityAble = (MobaMultiplicityAble)theEObject;
				T result = caseMobaMultiplicityAble(mobaMultiplicityAble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_ENTITY_REFERENCE: {
				MobaEntityReference mobaEntityReference = (MobaEntityReference)theEObject;
				T result = caseMobaEntityReference(mobaEntityReference);
				if (result == null) result = caseMobaEntityFeature(mobaEntityReference);
				if (result == null) result = caseMobaMultiplicityAble(mobaEntityReference);
				if (result == null) result = caseMobaFeature(mobaEntityReference);
				if (result == null) result = caseMobaFriendsAble(mobaEntityReference);
				if (result == null) result = caseMobaPropertiesAble(mobaEntityReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_ENTITY_EMBEDDABLE: {
				MobaEntityEmbeddable mobaEntityEmbeddable = (MobaEntityEmbeddable)theEObject;
				T result = caseMobaEntityEmbeddable(mobaEntityEmbeddable);
				if (result == null) result = caseMobaEntityFeature(mobaEntityEmbeddable);
				if (result == null) result = caseMobaMultiplicityAble(mobaEntityEmbeddable);
				if (result == null) result = caseMobaFeature(mobaEntityEmbeddable);
				if (result == null) result = caseMobaFriendsAble(mobaEntityEmbeddable);
				if (result == null) result = caseMobaPropertiesAble(mobaEntityEmbeddable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO_FEATURE: {
				MobaDtoFeature mobaDtoFeature = (MobaDtoFeature)theEObject;
				T result = caseMobaDtoFeature(mobaDtoFeature);
				if (result == null) result = caseMobaFeature(mobaDtoFeature);
				if (result == null) result = caseMobaFriendsAble(mobaDtoFeature);
				if (result == null) result = caseMobaPropertiesAble(mobaDtoFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO_ATTRIBUTE: {
				MobaDtoAttribute mobaDtoAttribute = (MobaDtoAttribute)theEObject;
				T result = caseMobaDtoAttribute(mobaDtoAttribute);
				if (result == null) result = caseMobaDtoFeature(mobaDtoAttribute);
				if (result == null) result = caseMobaMultiplicityAble(mobaDtoAttribute);
				if (result == null) result = caseMobaConstraintable(mobaDtoAttribute);
				if (result == null) result = caseMobaFeature(mobaDtoAttribute);
				if (result == null) result = caseMobaFriendsAble(mobaDtoAttribute);
				if (result == null) result = caseMobaPropertiesAble(mobaDtoAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO_REFERENCE: {
				MobaDtoReference mobaDtoReference = (MobaDtoReference)theEObject;
				T result = caseMobaDtoReference(mobaDtoReference);
				if (result == null) result = caseMobaDtoFeature(mobaDtoReference);
				if (result == null) result = caseMobaMultiplicityAble(mobaDtoReference);
				if (result == null) result = caseMobaFeature(mobaDtoReference);
				if (result == null) result = caseMobaFriendsAble(mobaDtoReference);
				if (result == null) result = caseMobaPropertiesAble(mobaDtoReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DTO_EMBEDDABLE: {
				MobaDtoEmbeddable mobaDtoEmbeddable = (MobaDtoEmbeddable)theEObject;
				T result = caseMobaDtoEmbeddable(mobaDtoEmbeddable);
				if (result == null) result = caseMobaDtoFeature(mobaDtoEmbeddable);
				if (result == null) result = caseMobaMultiplicityAble(mobaDtoEmbeddable);
				if (result == null) result = caseMobaFeature(mobaDtoEmbeddable);
				if (result == null) result = caseMobaFriendsAble(mobaDtoEmbeddable);
				if (result == null) result = caseMobaPropertiesAble(mobaDtoEmbeddable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_QUEUE_FEATURE: {
				MobaQueueFeature mobaQueueFeature = (MobaQueueFeature)theEObject;
				T result = caseMobaQueueFeature(mobaQueueFeature);
				if (result == null) result = caseMobaFeature(mobaQueueFeature);
				if (result == null) result = caseMobaFriendsAble(mobaQueueFeature);
				if (result == null) result = caseMobaPropertiesAble(mobaQueueFeature);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_QUEUE_REFERENCE: {
				MobaQueueReference mobaQueueReference = (MobaQueueReference)theEObject;
				T result = caseMobaQueueReference(mobaQueueReference);
				if (result == null) result = caseMobaQueueFeature(mobaQueueReference);
				if (result == null) result = caseMobaMultiplicityAble(mobaQueueReference);
				if (result == null) result = caseMobaFeature(mobaQueueReference);
				if (result == null) result = caseMobaFriendsAble(mobaQueueReference);
				if (result == null) result = caseMobaPropertiesAble(mobaQueueReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_MULIPLICITY: {
				MobaMuliplicity mobaMuliplicity = (MobaMuliplicity)theEObject;
				T result = caseMobaMuliplicity(mobaMuliplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_CONSTRAINTABLE: {
				MobaConstraintable mobaConstraintable = (MobaConstraintable)theEObject;
				T result = caseMobaConstraintable(mobaConstraintable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_CONSTRAINT: {
				MobaConstraint mobaConstraint = (MobaConstraint)theEObject;
				T result = caseMobaConstraint(mobaConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_REGEXP_CONSTRAINT: {
				MobaRegexpConstraint mobaRegexpConstraint = (MobaRegexpConstraint)theEObject;
				T result = caseMobaRegexpConstraint(mobaRegexpConstraint);
				if (result == null) result = caseMobaConstraint(mobaRegexpConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_MIN_CONSTRAINT: {
				MobaMinConstraint mobaMinConstraint = (MobaMinConstraint)theEObject;
				T result = caseMobaMinConstraint(mobaMinConstraint);
				if (result == null) result = caseMobaConstraint(mobaMinConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_MAX_CONSTRAINT: {
				MobaMaxConstraint mobaMaxConstraint = (MobaMaxConstraint)theEObject;
				T result = caseMobaMaxConstraint(mobaMaxConstraint);
				if (result == null) result = caseMobaConstraint(mobaMaxConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_FUTURE_CONSTRAINT: {
				MobaFutureConstraint mobaFutureConstraint = (MobaFutureConstraint)theEObject;
				T result = caseMobaFutureConstraint(mobaFutureConstraint);
				if (result == null) result = caseMobaConstraint(mobaFutureConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PAST_CONSTRAINT: {
				MobaPastConstraint mobaPastConstraint = (MobaPastConstraint)theEObject;
				T result = caseMobaPastConstraint(mobaPastConstraint);
				if (result == null) result = caseMobaConstraint(mobaPastConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_NOT_NULL_CONSTRAINT: {
				MobaNotNullConstraint mobaNotNullConstraint = (MobaNotNullConstraint)theEObject;
				T result = caseMobaNotNullConstraint(mobaNotNullConstraint);
				if (result == null) result = caseMobaConstraint(mobaNotNullConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_NULL_CONSTRAINT: {
				MobaNullConstraint mobaNullConstraint = (MobaNullConstraint)theEObject;
				T result = caseMobaNullConstraint(mobaNullConstraint);
				if (result == null) result = caseMobaConstraint(mobaNullConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_MIN_LENGTH_CONSTRAINT: {
				MobaMinLengthConstraint mobaMinLengthConstraint = (MobaMinLengthConstraint)theEObject;
				T result = caseMobaMinLengthConstraint(mobaMinLengthConstraint);
				if (result == null) result = caseMobaConstraint(mobaMinLengthConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_MAX_LENGTH_CONSTRAINT: {
				MobaMaxLengthConstraint mobaMaxLengthConstraint = (MobaMaxLengthConstraint)theEObject;
				T result = caseMobaMaxLengthConstraint(mobaMaxLengthConstraint);
				if (result == null) result = caseMobaConstraint(mobaMaxLengthConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DIGITS_CONSTRAINT: {
				MobaDigitsConstraint mobaDigitsConstraint = (MobaDigitsConstraint)theEObject;
				T result = caseMobaDigitsConstraint(mobaDigitsConstraint);
				if (result == null) result = caseMobaConstraint(mobaDigitsConstraint);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_ENUM: {
				MobaEnum mobaEnum = (MobaEnum)theEObject;
				T result = caseMobaEnum(mobaEnum);
				if (result == null) result = caseMobaApplicationFeature(mobaEnum);
				if (result == null) result = caseMobaFriendsAble(mobaEnum);
				if (result == null) result = caseMobaPropertiesAble(mobaEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_ENUM_LITERAL: {
				MobaEnumLiteral mobaEnumLiteral = (MobaEnumLiteral)theEObject;
				T result = caseMobaEnumLiteral(mobaEnumLiteral);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_TRIGGER: {
				MobaTrigger mobaTrigger = (MobaTrigger)theEObject;
				T result = caseMobaTrigger(mobaTrigger);
				if (result == null) result = caseMobaApplicationFeature(mobaTrigger);
				if (result == null) result = caseMobaFriendsAble(mobaTrigger);
				if (result == null) result = caseMobaPropertiesAble(mobaTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_APP_INSTALL_TRIGGER: {
				MobaAppInstallTrigger mobaAppInstallTrigger = (MobaAppInstallTrigger)theEObject;
				T result = caseMobaAppInstallTrigger(mobaAppInstallTrigger);
				if (result == null) result = caseMobaTrigger(mobaAppInstallTrigger);
				if (result == null) result = caseMobaApplicationFeature(mobaAppInstallTrigger);
				if (result == null) result = caseMobaFriendsAble(mobaAppInstallTrigger);
				if (result == null) result = caseMobaPropertiesAble(mobaAppInstallTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_APP_UPDATE_TRIGGER: {
				MobaAppUpdateTrigger mobaAppUpdateTrigger = (MobaAppUpdateTrigger)theEObject;
				T result = caseMobaAppUpdateTrigger(mobaAppUpdateTrigger);
				if (result == null) result = caseMobaTrigger(mobaAppUpdateTrigger);
				if (result == null) result = caseMobaApplicationFeature(mobaAppUpdateTrigger);
				if (result == null) result = caseMobaFriendsAble(mobaAppUpdateTrigger);
				if (result == null) result = caseMobaPropertiesAble(mobaAppUpdateTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_SMS_TRIGGER: {
				MobaSMSTrigger mobaSMSTrigger = (MobaSMSTrigger)theEObject;
				T result = caseMobaSMSTrigger(mobaSMSTrigger);
				if (result == null) result = caseMobaTrigger(mobaSMSTrigger);
				if (result == null) result = caseMobaApplicationFeature(mobaSMSTrigger);
				if (result == null) result = caseMobaFriendsAble(mobaSMSTrigger);
				if (result == null) result = caseMobaPropertiesAble(mobaSMSTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_DEVICE_STARTUP_TRIGGER: {
				MobaDeviceStartupTrigger mobaDeviceStartupTrigger = (MobaDeviceStartupTrigger)theEObject;
				T result = caseMobaDeviceStartupTrigger(mobaDeviceStartupTrigger);
				if (result == null) result = caseMobaTrigger(mobaDeviceStartupTrigger);
				if (result == null) result = caseMobaApplicationFeature(mobaDeviceStartupTrigger);
				if (result == null) result = caseMobaFriendsAble(mobaDeviceStartupTrigger);
				if (result == null) result = caseMobaPropertiesAble(mobaDeviceStartupTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_EMAIL_TRIGGER: {
				MobaEmailTrigger mobaEmailTrigger = (MobaEmailTrigger)theEObject;
				T result = caseMobaEmailTrigger(mobaEmailTrigger);
				if (result == null) result = caseMobaTrigger(mobaEmailTrigger);
				if (result == null) result = caseMobaApplicationFeature(mobaEmailTrigger);
				if (result == null) result = caseMobaFriendsAble(mobaEmailTrigger);
				if (result == null) result = caseMobaPropertiesAble(mobaEmailTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_TIMER_TRIGGER: {
				MobaTimerTrigger mobaTimerTrigger = (MobaTimerTrigger)theEObject;
				T result = caseMobaTimerTrigger(mobaTimerTrigger);
				if (result == null) result = caseMobaTrigger(mobaTimerTrigger);
				if (result == null) result = caseMobaApplicationFeature(mobaTimerTrigger);
				if (result == null) result = caseMobaFriendsAble(mobaTimerTrigger);
				if (result == null) result = caseMobaPropertiesAble(mobaTimerTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PUSH_TRIGGER: {
				MobaPushTrigger mobaPushTrigger = (MobaPushTrigger)theEObject;
				T result = caseMobaPushTrigger(mobaPushTrigger);
				if (result == null) result = caseMobaTrigger(mobaPushTrigger);
				if (result == null) result = caseMobaApplicationFeature(mobaPushTrigger);
				if (result == null) result = caseMobaFriendsAble(mobaPushTrigger);
				if (result == null) result = caseMobaPropertiesAble(mobaPushTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_GEOFENCE_TRIGGER: {
				MobaGeofenceTrigger mobaGeofenceTrigger = (MobaGeofenceTrigger)theEObject;
				T result = caseMobaGeofenceTrigger(mobaGeofenceTrigger);
				if (result == null) result = caseMobaTrigger(mobaGeofenceTrigger);
				if (result == null) result = caseMobaApplicationFeature(mobaGeofenceTrigger);
				if (result == null) result = caseMobaFriendsAble(mobaGeofenceTrigger);
				if (result == null) result = caseMobaPropertiesAble(mobaGeofenceTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_FRIEND: {
				MobaFriend mobaFriend = (MobaFriend)theEObject;
				T result = caseMobaFriend(mobaFriend);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_FRIENDS_ABLE: {
				MobaFriendsAble mobaFriendsAble = (MobaFriendsAble)theEObject;
				T result = caseMobaFriendsAble(mobaFriendsAble);
				if (result == null) result = caseMobaPropertiesAble(mobaFriendsAble);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_EXTERNAL_MODULE: {
				MobaExternalModule mobaExternalModule = (MobaExternalModule)theEObject;
				T result = caseMobaExternalModule(mobaExternalModule);
				if (result == null) result = caseMobaApplicationFeature(mobaExternalModule);
				if (result == null) result = caseMobaFriendsAble(mobaExternalModule);
				if (result == null) result = caseMobaPropertiesAble(mobaExternalModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_BLUETOOTH_MODULE: {
				MobaBluetoothModule mobaBluetoothModule = (MobaBluetoothModule)theEObject;
				T result = caseMobaBluetoothModule(mobaBluetoothModule);
				if (result == null) result = caseMobaExternalModule(mobaBluetoothModule);
				if (result == null) result = caseMobaApplicationFeature(mobaBluetoothModule);
				if (result == null) result = caseMobaFriendsAble(mobaBluetoothModule);
				if (result == null) result = caseMobaPropertiesAble(mobaBluetoothModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_NFC_MODULE: {
				MobaNFCModule mobaNFCModule = (MobaNFCModule)theEObject;
				T result = caseMobaNFCModule(mobaNFCModule);
				if (result == null) result = caseMobaExternalModule(mobaNFCModule);
				if (result == null) result = caseMobaApplicationFeature(mobaNFCModule);
				if (result == null) result = caseMobaFriendsAble(mobaNFCModule);
				if (result == null) result = caseMobaPropertiesAble(mobaNFCModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case MobaPackage.MOBA_PUSH_MODULE: {
				MobaPushModule mobaPushModule = (MobaPushModule)theEObject;
				T result = caseMobaPushModule(mobaPushModule);
				if (result == null) result = caseMobaExternalModule(mobaPushModule);
				if (result == null) result = caseMobaApplicationFeature(mobaPushModule);
				if (result == null) result = caseMobaFriendsAble(mobaPushModule);
				if (result == null) result = caseMobaPropertiesAble(mobaPushModule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaModel(MobaModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaModelFeature(MobaModelFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaProject(MobaProject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaApplication(MobaApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaApplicationFeature(MobaApplicationFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Template</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaTemplate(MobaTemplate object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Server</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaServer(MobaServer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorization</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaAuthorization(MobaAuthorization object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transport Serialization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transport Serialization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaTransportSerializationType(MobaTransportSerializationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Persistence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Persistence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPersistenceType(MobaPersistenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaGenerator(MobaGenerator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaGeneratorFeature(MobaGeneratorFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Mixin Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Mixin Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaGeneratorMixinFeature(MobaGeneratorMixinFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator ID Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator ID Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaGeneratorIDFeature(MobaGeneratorIDFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDataType(MobaDataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaConstant(MobaConstant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaConstantValue(MobaConstantValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Properties Able</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Properties Able</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPropertiesAble(MobaPropertiesAble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaProperty(MobaProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaData(MobaData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaSettings(MobaSettings object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cache</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaCache(MobaCache object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaEntity(MobaEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Index</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Index</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaEntityIndex(MobaEntityIndex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDto(MobaDto object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaQueue(MobaQueue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaREST(MobaREST object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Payload Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Payload Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaRESTPayloadDefinition(MobaRESTPayloadDefinition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaRESTAttribute(MobaRESTAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Custom Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Custom Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaRESTCustomService(MobaRESTCustomService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Workflow</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaRESTWorkflow(MobaRESTWorkflow object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>REST Crud</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>REST Crud</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaRESTCrud(MobaRESTCrud object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaFeature(MobaFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaEntityFeature(MobaEntityFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaEntityAttribute(MobaEntityAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Multiplicity Able</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Multiplicity Able</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaMultiplicityAble(MobaMultiplicityAble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaEntityReference(MobaEntityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity Embeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaEntityEmbeddable(MobaEntityEmbeddable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDtoFeature(MobaDtoFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDtoAttribute(MobaDtoAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDtoReference(MobaDtoReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dto Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dto Embeddable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDtoEmbeddable(MobaDtoEmbeddable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaQueueFeature(MobaQueueFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Queue Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Queue Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaQueueReference(MobaQueueReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Muliplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Muliplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaMuliplicity(MobaMuliplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings Feature</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings Feature</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaSettingsFeature(MobaSettingsFeature object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaSettingsAttribute(MobaSettingsAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Settings Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Settings Entity Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaSettingsEntityReference(MobaSettingsEntityReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraintable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraintable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaConstraintable(MobaConstraintable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaConstraint(MobaConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Regexp Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Regexp Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaRegexpConstraint(MobaRegexpConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaMinConstraint(MobaMinConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaMaxConstraint(MobaMaxConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Future Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Future Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaFutureConstraint(MobaFutureConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Past Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Past Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPastConstraint(MobaPastConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Not Null Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Not Null Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaNotNullConstraint(MobaNotNullConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Null Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Null Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaNullConstraint(MobaNullConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Min Length Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Min Length Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaMinLengthConstraint(MobaMinLengthConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Max Length Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Max Length Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaMaxLengthConstraint(MobaMaxLengthConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Digits Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Digits Constraint</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDigitsConstraint(MobaDigitsConstraint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaEnum(MobaEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Enum Literal</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaEnumLiteral(MobaEnumLiteral object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaTrigger(MobaTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Install Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Install Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaAppInstallTrigger(MobaAppInstallTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>App Update Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>App Update Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaAppUpdateTrigger(MobaAppUpdateTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SMS Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SMS Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaSMSTrigger(MobaSMSTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Device Startup Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Device Startup Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaDeviceStartupTrigger(MobaDeviceStartupTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Email Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Email Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaEmailTrigger(MobaEmailTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaTimerTrigger(MobaTimerTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPushTrigger(MobaPushTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Geofence Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Geofence Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaGeofenceTrigger(MobaGeofenceTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generator Slot</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generator Slot</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaGeneratorSlot(MobaGeneratorSlot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Friend</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Friend</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaFriend(MobaFriend object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Friends Able</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Friends Able</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaFriendsAble(MobaFriendsAble object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaExternalModule(MobaExternalModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bluetooth Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bluetooth Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaBluetoothModule(MobaBluetoothModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>NFC Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>NFC Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaNFCModule(MobaNFCModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Push Module</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Push Module</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMobaPushModule(MobaPushModule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //MobaSwitch
