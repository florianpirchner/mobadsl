/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.mobadsl.semantic.model.moba.MobaPackage
 * @generated
 */
public interface MobaFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobaFactory eINSTANCE = org.mobadsl.semantic.model.moba.impl.MobaFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	MobaModel createMobaModel();

	/**
	 * Returns a new object of class '<em>Project</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project</em>'.
	 * @generated
	 */
	MobaProject createMobaProject();

	/**
	 * Returns a new object of class '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application</em>'.
	 * @generated
	 */
	MobaApplication createMobaApplication();

	/**
	 * Returns a new object of class '<em>Template</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Template</em>'.
	 * @generated
	 */
	MobaTemplate createMobaTemplate();

	/**
	 * Returns a new object of class '<em>Server</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Server</em>'.
	 * @generated
	 */
	MobaServer createMobaServer();

	/**
	 * Returns a new object of class '<em>Authorization</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Authorization</em>'.
	 * @generated
	 */
	MobaAuthorization createMobaAuthorization();

	/**
	 * Returns a new object of class '<em>Transport Serialization Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transport Serialization Type</em>'.
	 * @generated
	 */
	MobaTransportSerializationType createMobaTransportSerializationType();

	/**
	 * Returns a new object of class '<em>Persistence Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persistence Type</em>'.
	 * @generated
	 */
	MobaPersistenceType createMobaPersistenceType();

	/**
	 * Returns a new object of class '<em>Generator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator</em>'.
	 * @generated
	 */
	MobaGenerator createMobaGenerator();

	/**
	 * Returns a new object of class '<em>Generator Mixin Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Mixin Feature</em>'.
	 * @generated
	 */
	MobaGeneratorMixinFeature createMobaGeneratorMixinFeature();

	/**
	 * Returns a new object of class '<em>Generator ID Feature</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator ID Feature</em>'.
	 * @generated
	 */
	MobaGeneratorIDFeature createMobaGeneratorIDFeature();

	/**
	 * Returns a new object of class '<em>Data Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Type</em>'.
	 * @generated
	 */
	MobaDataType createMobaDataType();

	/**
	 * Returns a new object of class '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant</em>'.
	 * @generated
	 */
	MobaConstant createMobaConstant();

	/**
	 * Returns a new object of class '<em>Constant Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Value</em>'.
	 * @generated
	 */
	MobaConstantValue createMobaConstantValue();

	/**
	 * Returns a new object of class '<em>Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Property</em>'.
	 * @generated
	 */
	MobaProperty createMobaProperty();

	/**
	 * Returns a new object of class '<em>Settings</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings</em>'.
	 * @generated
	 */
	MobaSettings createMobaSettings();

	/**
	 * Returns a new object of class '<em>Cache</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cache</em>'.
	 * @generated
	 */
	MobaCache createMobaCache();

	/**
	 * Returns a new object of class '<em>Entity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity</em>'.
	 * @generated
	 */
	MobaEntity createMobaEntity();

	/**
	 * Returns a new object of class '<em>Entity Index</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Index</em>'.
	 * @generated
	 */
	MobaEntityIndex createMobaEntityIndex();

	/**
	 * Returns a new object of class '<em>Dto</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto</em>'.
	 * @generated
	 */
	MobaDto createMobaDto();

	/**
	 * Returns a new object of class '<em>Queue</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue</em>'.
	 * @generated
	 */
	MobaQueue createMobaQueue();

	/**
	 * Returns a new object of class '<em>REST Payload Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Payload Definition</em>'.
	 * @generated
	 */
	MobaRESTPayloadDefinition createMobaRESTPayloadDefinition();

	/**
	 * Returns a new object of class '<em>REST Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Attribute</em>'.
	 * @generated
	 */
	MobaRESTAttribute createMobaRESTAttribute();

	/**
	 * Returns a new object of class '<em>REST Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Header</em>'.
	 * @generated
	 */
	MobaRESTHeader createMobaRESTHeader();

	/**
	 * Returns a new object of class '<em>REST Custom Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Custom Service</em>'.
	 * @generated
	 */
	MobaRESTCustomService createMobaRESTCustomService();

	/**
	 * Returns a new object of class '<em>REST Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Workflow</em>'.
	 * @generated
	 */
	MobaRESTWorkflow createMobaRESTWorkflow();

	/**
	 * Returns a new object of class '<em>REST Crud</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>REST Crud</em>'.
	 * @generated
	 */
	MobaRESTCrud createMobaRESTCrud();

	/**
	 * Returns a new object of class '<em>Entity Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Attribute</em>'.
	 * @generated
	 */
	MobaEntityAttribute createMobaEntityAttribute();

	/**
	 * Returns a new object of class '<em>Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Reference</em>'.
	 * @generated
	 */
	MobaEntityReference createMobaEntityReference();

	/**
	 * Returns a new object of class '<em>Entity Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entity Embeddable</em>'.
	 * @generated
	 */
	MobaEntityEmbeddable createMobaEntityEmbeddable();

	/**
	 * Returns a new object of class '<em>Dto Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto Attribute</em>'.
	 * @generated
	 */
	MobaDtoAttribute createMobaDtoAttribute();

	/**
	 * Returns a new object of class '<em>Dto Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto Reference</em>'.
	 * @generated
	 */
	MobaDtoReference createMobaDtoReference();

	/**
	 * Returns a new object of class '<em>Dto Embeddable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dto Embeddable</em>'.
	 * @generated
	 */
	MobaDtoEmbeddable createMobaDtoEmbeddable();

	/**
	 * Returns a new object of class '<em>Queue Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Queue Reference</em>'.
	 * @generated
	 */
	MobaQueueReference createMobaQueueReference();

	/**
	 * Returns a new object of class '<em>Muliplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Muliplicity</em>'.
	 * @generated
	 */
	MobaMuliplicity createMobaMuliplicity();

	/**
	 * Returns a new object of class '<em>Settings Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings Attribute</em>'.
	 * @generated
	 */
	MobaSettingsAttribute createMobaSettingsAttribute();

	/**
	 * Returns a new object of class '<em>Settings Entity Reference</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Settings Entity Reference</em>'.
	 * @generated
	 */
	MobaSettingsEntityReference createMobaSettingsEntityReference();

	/**
	 * Returns a new object of class '<em>Regexp Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Regexp Constraint</em>'.
	 * @generated
	 */
	MobaRegexpConstraint createMobaRegexpConstraint();

	/**
	 * Returns a new object of class '<em>Min Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Constraint</em>'.
	 * @generated
	 */
	MobaMinConstraint createMobaMinConstraint();

	/**
	 * Returns a new object of class '<em>Max Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Constraint</em>'.
	 * @generated
	 */
	MobaMaxConstraint createMobaMaxConstraint();

	/**
	 * Returns a new object of class '<em>Future Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Future Constraint</em>'.
	 * @generated
	 */
	MobaFutureConstraint createMobaFutureConstraint();

	/**
	 * Returns a new object of class '<em>Past Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Past Constraint</em>'.
	 * @generated
	 */
	MobaPastConstraint createMobaPastConstraint();

	/**
	 * Returns a new object of class '<em>Not Null Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Not Null Constraint</em>'.
	 * @generated
	 */
	MobaNotNullConstraint createMobaNotNullConstraint();

	/**
	 * Returns a new object of class '<em>Null Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Null Constraint</em>'.
	 * @generated
	 */
	MobaNullConstraint createMobaNullConstraint();

	/**
	 * Returns a new object of class '<em>Min Length Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Min Length Constraint</em>'.
	 * @generated
	 */
	MobaMinLengthConstraint createMobaMinLengthConstraint();

	/**
	 * Returns a new object of class '<em>Max Length Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Max Length Constraint</em>'.
	 * @generated
	 */
	MobaMaxLengthConstraint createMobaMaxLengthConstraint();

	/**
	 * Returns a new object of class '<em>Digits Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Digits Constraint</em>'.
	 * @generated
	 */
	MobaDigitsConstraint createMobaDigitsConstraint();

	/**
	 * Returns a new object of class '<em>Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum</em>'.
	 * @generated
	 */
	MobaEnum createMobaEnum();

	/**
	 * Returns a new object of class '<em>Enum Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Literal</em>'.
	 * @generated
	 */
	MobaEnumLiteral createMobaEnumLiteral();

	/**
	 * Returns a new object of class '<em>App Install Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Install Trigger</em>'.
	 * @generated
	 */
	MobaAppInstallTrigger createMobaAppInstallTrigger();

	/**
	 * Returns a new object of class '<em>App Update Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>App Update Trigger</em>'.
	 * @generated
	 */
	MobaAppUpdateTrigger createMobaAppUpdateTrigger();

	/**
	 * Returns a new object of class '<em>SMS Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SMS Trigger</em>'.
	 * @generated
	 */
	MobaSMSTrigger createMobaSMSTrigger();

	/**
	 * Returns a new object of class '<em>Device Startup Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Device Startup Trigger</em>'.
	 * @generated
	 */
	MobaDeviceStartupTrigger createMobaDeviceStartupTrigger();

	/**
	 * Returns a new object of class '<em>Email Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Email Trigger</em>'.
	 * @generated
	 */
	MobaEmailTrigger createMobaEmailTrigger();

	/**
	 * Returns a new object of class '<em>Timer Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer Trigger</em>'.
	 * @generated
	 */
	MobaTimerTrigger createMobaTimerTrigger();

	/**
	 * Returns a new object of class '<em>Push Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Trigger</em>'.
	 * @generated
	 */
	MobaPushTrigger createMobaPushTrigger();

	/**
	 * Returns a new object of class '<em>Geofence Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Geofence Trigger</em>'.
	 * @generated
	 */
	MobaGeofenceTrigger createMobaGeofenceTrigger();

	/**
	 * Returns a new object of class '<em>Generator Slot</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generator Slot</em>'.
	 * @generated
	 */
	MobaGeneratorSlot createMobaGeneratorSlot();

	/**
	 * Returns a new object of class '<em>Friend</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Friend</em>'.
	 * @generated
	 */
	MobaFriend createMobaFriend();

	/**
	 * Returns a new object of class '<em>Bluetooth Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bluetooth Module</em>'.
	 * @generated
	 */
	MobaBluetoothModule createMobaBluetoothModule();

	/**
	 * Returns a new object of class '<em>NFC Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>NFC Module</em>'.
	 * @generated
	 */
	MobaNFCModule createMobaNFCModule();

	/**
	 * Returns a new object of class '<em>Push Module</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Push Module</em>'.
	 * @generated
	 */
	MobaPushModule createMobaPushModule();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MobaPackage getMobaPackage();

} //MobaFactory
