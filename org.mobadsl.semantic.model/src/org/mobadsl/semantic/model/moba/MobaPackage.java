/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.mobadsl.semantic.model.moba.MobaFactory
 * @model kind="package"
 * @generated
 */
public interface MobaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "moba";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mobadsl.org/model/Moba";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "moba";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobaPackage eINSTANCE = org.mobadsl.semantic.model.moba.impl.MobaPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPropertiesAbleImpl <em>Properties Able</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPropertiesAbleImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPropertiesAble()
	 * @generated
	 */
	int MOBA_PROPERTIES_ABLE = 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROPERTIES_ABLE__PROPERTIES = 0;

	/**
	 * The number of structural features of the '<em>Properties Able</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROPERTIES_ABLE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaProjectImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaProject()
	 * @generated
	 */
	int MOBA_PROJECT = 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaApplication()
	 * @generated
	 */
	int MOBA_APPLICATION = 1;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationFeatureImpl <em>Application Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaApplicationFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaApplicationFeature()
	 * @generated
	 */
	int MOBA_APPLICATION_FEATURE = 2;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaTemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaTemplateImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaTemplate()
	 * @generated
	 */
	int MOBA_TEMPLATE = 3;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl <em>Server</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaServerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaServer()
	 * @generated
	 */
	int MOBA_SERVER = 4;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaAuthorizationImpl <em>Authorization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaAuthorizationImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaAuthorization()
	 * @generated
	 */
	int MOBA_AUTHORIZATION = 5;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaTransportSerializationTypeImpl <em>Transport Serialization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaTransportSerializationTypeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaTransportSerializationType()
	 * @generated
	 */
	int MOBA_TRANSPORT_SERIALIZATION_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGenerator()
	 * @generated
	 */
	int MOBA_GENERATOR = 7;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaGeneratorFeature <em>Generator Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorFeature
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorFeature()
	 * @generated
	 */
	int MOBA_GENERATOR_FEATURE = 8;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorMixinFeatureImpl <em>Generator Mixin Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorMixinFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorMixinFeature()
	 * @generated
	 */
	int MOBA_GENERATOR_MIXIN_FEATURE = 9;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl <em>Generator ID Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorIDFeature()
	 * @generated
	 */
	int MOBA_GENERATOR_ID_FEATURE = 10;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDataType()
	 * @generated
	 */
	int MOBA_DATA_TYPE = 11;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaConstantImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstant()
	 * @generated
	 */
	int MOBA_CONSTANT = 12;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl <em>Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstantValue()
	 * @generated
	 */
	int MOBA_CONSTANT_VALUE = 13;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaProperty()
	 * @generated
	 */
	int MOBA_PROPERTY = 15;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDataImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaData()
	 * @generated
	 */
	int MOBA_DATA = 16;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSettings()
	 * @generated
	 */
	int MOBA_SETTINGS = 17;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaCacheImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaCache()
	 * @generated
	 */
	int MOBA_CACHE = 18;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityImpl <em>Entity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntity()
	 * @generated
	 */
	int MOBA_ENTITY = 19;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityIndexImpl <em>Entity Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityIndexImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntityIndex()
	 * @generated
	 */
	int MOBA_ENTITY_INDEX = 20;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoImpl <em>Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDto()
	 * @generated
	 */
	int MOBA_DTO = 21;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl <em>Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaQueueImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaQueue()
	 * @generated
	 */
	int MOBA_QUEUE = 22;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl <em>REST</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaREST()
	 * @generated
	 */
	int MOBA_REST = 23;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTPayloadDefinitionImpl <em>REST Payload Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTPayloadDefinitionImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTPayloadDefinition()
	 * @generated
	 */
	int MOBA_REST_PAYLOAD_DEFINITION = 24;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl <em>REST Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTAttribute()
	 * @generated
	 */
	int MOBA_REST_ATTRIBUTE = 25;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTCustomServiceImpl <em>REST Custom Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTCustomServiceImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTCustomService()
	 * @generated
	 */
	int MOBA_REST_CUSTOM_SERVICE = 26;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTWorkflowImpl <em>REST Workflow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTWorkflowImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTWorkflow()
	 * @generated
	 */
	int MOBA_REST_WORKFLOW = 27;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTCrudImpl <em>REST Crud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTCrudImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTCrud()
	 * @generated
	 */
	int MOBA_REST_CRUD = 28;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFeature()
	 * @generated
	 */
	int MOBA_FEATURE = 29;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityFeatureImpl <em>Entity Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntityFeature()
	 * @generated
	 */
	int MOBA_ENTITY_FEATURE = 30;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityAttributeImpl <em>Entity Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityAttributeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntityAttribute()
	 * @generated
	 */
	int MOBA_ENTITY_ATTRIBUTE = 31;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaMultiplicityAble <em>Multiplicity Able</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaMultiplicityAble
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMultiplicityAble()
	 * @generated
	 */
	int MOBA_MULTIPLICITY_ABLE = 32;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityReferenceImpl <em>Entity Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityReferenceImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntityReference()
	 * @generated
	 */
	int MOBA_ENTITY_REFERENCE = 33;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoFeatureImpl <em>Dto Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoFeature()
	 * @generated
	 */
	int MOBA_DTO_FEATURE = 34;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoAttributeImpl <em>Dto Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoAttributeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoAttribute()
	 * @generated
	 */
	int MOBA_DTO_ATTRIBUTE = 35;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoReferenceImpl <em>Dto Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoReferenceImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoReference()
	 * @generated
	 */
	int MOBA_DTO_REFERENCE = 36;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaQueueFeatureImpl <em>Queue Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaQueueFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaQueueFeature()
	 * @generated
	 */
	int MOBA_QUEUE_FEATURE = 37;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaQueueReferenceImpl <em>Queue Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaQueueReferenceImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaQueueReference()
	 * @generated
	 */
	int MOBA_QUEUE_REFERENCE = 38;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMuliplicityImpl <em>Muliplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMuliplicityImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMuliplicity()
	 * @generated
	 */
	int MOBA_MULIPLICITY = 39;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsFeatureImpl <em>Settings Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaSettingsFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSettingsFeature()
	 * @generated
	 */
	int MOBA_SETTINGS_FEATURE = 40;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsAttributeImpl <em>Settings Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaSettingsAttributeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSettingsAttribute()
	 * @generated
	 */
	int MOBA_SETTINGS_ATTRIBUTE = 41;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaConstraintable <em>Constraintable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaConstraintable
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstraintable()
	 * @generated
	 */
	int MOBA_CONSTRAINTABLE = 42;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstraint()
	 * @generated
	 */
	int MOBA_CONSTRAINT = 43;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRegexpConstraintImpl <em>Regexp Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRegexpConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRegexpConstraint()
	 * @generated
	 */
	int MOBA_REGEXP_CONSTRAINT = 44;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMinConstraintImpl <em>Min Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMinConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMinConstraint()
	 * @generated
	 */
	int MOBA_MIN_CONSTRAINT = 45;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMaxConstraintImpl <em>Max Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMaxConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMaxConstraint()
	 * @generated
	 */
	int MOBA_MAX_CONSTRAINT = 46;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFutureConstraintImpl <em>Future Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaFutureConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFutureConstraint()
	 * @generated
	 */
	int MOBA_FUTURE_CONSTRAINT = 47;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPastConstraintImpl <em>Past Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPastConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPastConstraint()
	 * @generated
	 */
	int MOBA_PAST_CONSTRAINT = 48;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaNotNullConstraintImpl <em>Not Null Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaNotNullConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNotNullConstraint()
	 * @generated
	 */
	int MOBA_NOT_NULL_CONSTRAINT = 49;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaNullConstraintImpl <em>Null Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaNullConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNullConstraint()
	 * @generated
	 */
	int MOBA_NULL_CONSTRAINT = 50;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMinLengthConstraintImpl <em>Min Length Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMinLengthConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMinLengthConstraint()
	 * @generated
	 */
	int MOBA_MIN_LENGTH_CONSTRAINT = 51;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMaxLengthConstraintImpl <em>Max Length Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMaxLengthConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMaxLengthConstraint()
	 * @generated
	 */
	int MOBA_MAX_LENGTH_CONSTRAINT = 52;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl <em>Digits Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDigitsConstraint()
	 * @generated
	 */
	int MOBA_DIGITS_CONSTRAINT = 53;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEnumImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEnum()
	 * @generated
	 */
	int MOBA_ENUM = 54;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEnumLiteralImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEnumLiteral()
	 * @generated
	 */
	int MOBA_ENUM_LITERAL = 55;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaUiApplicationImpl <em>Ui Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaUiApplicationImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaUiApplication()
	 * @generated
	 */
	int MOBA_UI_APPLICATION = 56;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaBackgroundApplicationImpl <em>Background Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaBackgroundApplicationImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaBackgroundApplication()
	 * @generated
	 */
	int MOBA_BACKGROUND_APPLICATION = 57;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaTriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaTriggerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaTrigger()
	 * @generated
	 */
	int MOBA_TRIGGER = 58;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaAppInstallTriggerImpl <em>App Install Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaAppInstallTriggerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaAppInstallTrigger()
	 * @generated
	 */
	int MOBA_APP_INSTALL_TRIGGER = 59;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaAppUpdatelTriggerImpl <em>App Updatel Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaAppUpdatelTriggerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaAppUpdatelTrigger()
	 * @generated
	 */
	int MOBA_APP_UPDATEL_TRIGGER = 60;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSMSTriggerImpl <em>SMS Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaSMSTriggerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSMSTrigger()
	 * @generated
	 */
	int MOBA_SMS_TRIGGER = 61;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDeviceStartupTriggerImpl <em>Device Startup Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDeviceStartupTriggerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDeviceStartupTrigger()
	 * @generated
	 */
	int MOBA_DEVICE_STARTUP_TRIGGER = 62;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEmailTriggerImpl <em>Email Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEmailTriggerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEmailTrigger()
	 * @generated
	 */
	int MOBA_EMAIL_TRIGGER = 63;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaTimerTriggerImpl <em>Timer Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaTimerTriggerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaTimerTrigger()
	 * @generated
	 */
	int MOBA_TIMER_TRIGGER = 64;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPushTriggerImpl <em>Push Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPushTriggerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPushTrigger()
	 * @generated
	 */
	int MOBA_PUSH_TRIGGER = 65;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeofenceTriggerImpl <em>Geofence Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaGeofenceTriggerImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeofenceTrigger()
	 * @generated
	 */
	int MOBA_GEOFENCE_TRIGGER = 66;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorSlotImpl <em>Generator Slot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorSlotImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorSlot()
	 * @generated
	 */
	int MOBA_GENERATOR_SLOT = 67;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFriendImpl <em>Friend</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaFriendImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFriend()
	 * @generated
	 */
	int MOBA_FRIEND = 68;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFriendsAbleImpl <em>Friends Able</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaFriendsAbleImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFriendsAble()
	 * @generated
	 */
	int MOBA_FRIENDS_ABLE = 69;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FRIENDS_ABLE__PROPERTIES = MOBA_PROPERTIES_ABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FRIENDS_ABLE__FRIENDS = MOBA_PROPERTIES_ABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Friends Able</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FRIENDS_ABLE_FEATURE_COUNT = MOBA_PROPERTIES_ABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROJECT__PROPERTIES = MOBA_FRIENDS_ABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROJECT__FRIENDS = MOBA_FRIENDS_ABLE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROJECT__ID = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROJECT__NAME = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROJECT__VERSION = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ui Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROJECT__UI_APPLICATION = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Background Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROJECT__BACKGROUND_APPLICATION = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROJECT_FEATURE_COUNT = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION__PROPERTIES = MOBA_FRIENDS_ABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION__FRIENDS = MOBA_FRIENDS_ABLE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION__ID = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION__NAME = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION__VERSION = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION__FEATURES = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION_FEATURE_COUNT = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION_FEATURE__PROPERTIES = MOBA_FRIENDS_ABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION_FEATURE__FRIENDS = MOBA_FRIENDS_ABLE__FRIENDS;

	/**
	 * The number of structural features of the '<em>Application Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION_FEATURE_FEATURE_COUNT = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TEMPLATE__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TEMPLATE__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TEMPLATE__TEMPLATE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Download Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TEMPLATE__DOWNLOAD_TEMPLATE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TEMPLATE_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SERVER__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SERVER__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SERVER__URL = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SERVER__SERVICES = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Authorization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SERVER__AUTHORIZATION = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Server</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SERVER_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_AUTHORIZATION__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_AUTHORIZATION__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_AUTHORIZATION__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Authorization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_AUTHORIZATION_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TRANSPORT_SERIALIZATION_TYPE__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TRANSPORT_SERIALIZATION_TYPE__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TRANSPORT_SERIALIZATION_TYPE__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Transport Serialization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TRANSPORT_SERIALIZATION_TYPE_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR__FEATURES = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR__ACTIVE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generator Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Generator Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_MIXIN_FEATURE__GENERATOR_REF = MOBA_GENERATOR_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Generator Mixin Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_MIXIN_FEATURE_FEATURE_COUNT = MOBA_GENERATOR_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_ID_FEATURE__GENERATOR_ID = MOBA_GENERATOR_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generator Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_ID_FEATURE__GENERATOR_VERSION = MOBA_GENERATOR_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator ID Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_ID_FEATURE_FEATURE_COUNT = MOBA_GENERATOR_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__CONSTRAINTS = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__PRIMITIVE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__STRING = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__NUMERIC = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__DECIMAL = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__DATE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__TIME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__TIMESTAMP = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Enum AST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__ENUM_AST = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__ARRAY = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Date Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__DATE_FORMAT_STRING = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Date Format Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__DATE_FORMAT_CONST = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__SUPER_TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value AST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT__VALUE_AST = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT_VALUE__VALUE_STRING = 0;

	/**
	 * The feature id for the '<em><b>Value Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT_VALUE__VALUE_CONST = 1;

	/**
	 * The feature id for the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT_VALUE__TAIL = 2;

	/**
	 * The feature id for the '<em><b>Value Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT_VALUE__VALUE_INT = 3;

	/**
	 * The feature id for the '<em><b>Value Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT_VALUE__VALUE_DOUBLE = 4;

	/**
	 * The number of structural features of the '<em>Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT_VALUE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Key String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROPERTY__KEY_STRING = 0;

	/**
	 * The feature id for the '<em><b>Key Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROPERTY__KEY_CONST = 1;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROPERTY__VALUE_STRING = 2;

	/**
	 * The feature id for the '<em><b>Value Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROPERTY__VALUE_CONST = 3;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROPERTY__KEY = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROPERTY__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PROPERTY_FEATURE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__SUPER_TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__FEATURES = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__ACTIVE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Cache Type String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CACHE__CACHE_TYPE_STRING = 0;

	/**
	 * The feature id for the '<em><b>Cache Type Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CACHE__CACHE_TYPE_CONST = 1;

	/**
	 * The feature id for the '<em><b>Cache Strategy String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CACHE__CACHE_STRATEGY_STRING = 2;

	/**
	 * The feature id for the '<em><b>Cache Strategy Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CACHE__CACHE_STRATEGY_CONST = 3;

	/**
	 * The number of structural features of the '<em>Cache</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CACHE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY__PROPERTIES = MOBA_DATA__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY__FRIENDS = MOBA_DATA__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY__NAME = MOBA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY__SUPER_TYPE = MOBA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY__CACHE = MOBA_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY__FEATURES = MOBA_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY__INDEX = MOBA_DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_FEATURE_COUNT = MOBA_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_INDEX__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Entity Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_INDEX_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__PROPERTIES = MOBA_DATA__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__FRIENDS = MOBA_DATA__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__NAME = MOBA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__SUPER_TYPE = MOBA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__FEATURES = MOBA_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Serialization Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__SERIALIZATION_TYPE = MOBA_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_FEATURE_COUNT = MOBA_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE__PROPERTIES = MOBA_DATA__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE__FRIENDS = MOBA_DATA__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE__NAME = MOBA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE__SUPER_TYPE = MOBA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE__FEATURES = MOBA_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_FEATURE_COUNT = MOBA_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST__URL = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Big Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST__BIG_DATA = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Request Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST__REQUEST_DTO = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Response Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST__RESPONSE_DTO = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Error Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST__ERROR_DTO = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST__HEADERS = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>REST</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_PAYLOAD_DEFINITION__DTO = 0;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_PAYLOAD_DEFINITION__ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Serialization Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_PAYLOAD_DEFINITION__SERIALIZATION_TYPE = 2;

	/**
	 * The number of structural features of the '<em>REST Payload Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_PAYLOAD_DEFINITION_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE__NAME_STRING = 1;

	/**
	 * The feature id for the '<em><b>Name Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE__NAME_CONST = 2;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE__VALUE_STRING = 3;

	/**
	 * The feature id for the '<em><b>Value Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE__VALUE_CONST = 4;

	/**
	 * The feature id for the '<em><b>Value Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE__VALUE_DOUBLE = 5;

	/**
	 * The feature id for the '<em><b>Value Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE__VALUE_INT = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE__NAME = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE__VALUE = 8;

	/**
	 * The number of structural features of the '<em>REST Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_ATTRIBUTE_FEATURE_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__PROPERTIES = MOBA_REST__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__FRIENDS = MOBA_REST__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__NAME = MOBA_REST__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__URL = MOBA_REST__URL;

	/**
	 * The feature id for the '<em><b>Big Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__BIG_DATA = MOBA_REST__BIG_DATA;

	/**
	 * The feature id for the '<em><b>Request Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__REQUEST_DTO = MOBA_REST__REQUEST_DTO;

	/**
	 * The feature id for the '<em><b>Response Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__RESPONSE_DTO = MOBA_REST__RESPONSE_DTO;

	/**
	 * The feature id for the '<em><b>Error Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__ERROR_DTO = MOBA_REST__ERROR_DTO;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__HEADERS = MOBA_REST__HEADERS;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__OPERATION = MOBA_REST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__PARAMETERS = MOBA_REST_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE = MOBA_REST_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>REST Custom Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_SERVICE_FEATURE_COUNT = MOBA_REST_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__PROPERTIES = MOBA_REST__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__FRIENDS = MOBA_REST__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__NAME = MOBA_REST__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__URL = MOBA_REST__URL;

	/**
	 * The feature id for the '<em><b>Big Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__BIG_DATA = MOBA_REST__BIG_DATA;

	/**
	 * The feature id for the '<em><b>Request Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__REQUEST_DTO = MOBA_REST__REQUEST_DTO;

	/**
	 * The feature id for the '<em><b>Response Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__RESPONSE_DTO = MOBA_REST__RESPONSE_DTO;

	/**
	 * The feature id for the '<em><b>Error Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__ERROR_DTO = MOBA_REST__ERROR_DTO;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__HEADERS = MOBA_REST__HEADERS;

	/**
	 * The feature id for the '<em><b>Services</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__SERVICES = MOBA_REST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW__SUPER_TYPE = MOBA_REST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>REST Workflow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_WORKFLOW_FEATURE_COUNT = MOBA_REST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__PROPERTIES = MOBA_REST__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__FRIENDS = MOBA_REST__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__NAME = MOBA_REST__NAME;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__URL = MOBA_REST__URL;

	/**
	 * The feature id for the '<em><b>Big Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__BIG_DATA = MOBA_REST__BIG_DATA;

	/**
	 * The feature id for the '<em><b>Request Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__REQUEST_DTO = MOBA_REST__REQUEST_DTO;

	/**
	 * The feature id for the '<em><b>Response Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__RESPONSE_DTO = MOBA_REST__RESPONSE_DTO;

	/**
	 * The feature id for the '<em><b>Error Dto</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__ERROR_DTO = MOBA_REST__ERROR_DTO;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__HEADERS = MOBA_REST__HEADERS;

	/**
	 * The feature id for the '<em><b>Operations</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__OPERATIONS = MOBA_REST_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__SUPER_TYPE = MOBA_REST_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>REST Crud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD_FEATURE_COUNT = MOBA_REST_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FEATURE__PROPERTIES = MOBA_FRIENDS_ABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FEATURE__FRIENDS = MOBA_FRIENDS_ABLE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FEATURE__NAME = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FEATURE_FEATURE_COUNT = MOBA_FRIENDS_ABLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_FEATURE__PROPERTIES = MOBA_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_FEATURE__FRIENDS = MOBA_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_FEATURE__NAME = MOBA_FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Entity Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_FEATURE_FEATURE_COUNT = MOBA_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__PROPERTIES = MOBA_ENTITY_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__FRIENDS = MOBA_ENTITY_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__NAME = MOBA_ENTITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__MULTIPLICITY = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__CONSTRAINTS = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__LAZY = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__TRANSIENT = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Domain Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__DOMAIN_KEY = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__DOMAIN_DESCRIPTION = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE__TYPE = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Entity Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_ATTRIBUTE_FEATURE_COUNT = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MULTIPLICITY_ABLE__MULTIPLICITY = 0;

	/**
	 * The number of structural features of the '<em>Multiplicity Able</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MULTIPLICITY_ABLE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_REFERENCE__PROPERTIES = MOBA_ENTITY_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_REFERENCE__FRIENDS = MOBA_ENTITY_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_REFERENCE__NAME = MOBA_ENTITY_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_REFERENCE__MULTIPLICITY = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_REFERENCE__CASCADING = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_REFERENCE__LAZY = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_REFERENCE__TRANSIENT = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_REFERENCE__TYPE = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Entity Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENTITY_REFERENCE_FEATURE_COUNT = MOBA_ENTITY_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_FEATURE__PROPERTIES = MOBA_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_FEATURE__FRIENDS = MOBA_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_FEATURE__NAME = MOBA_FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Dto Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_FEATURE_FEATURE_COUNT = MOBA_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__PROPERTIES = MOBA_DTO_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__FRIENDS = MOBA_DTO_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__NAME = MOBA_DTO_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__MULTIPLICITY = MOBA_DTO_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__CONSTRAINTS = MOBA_DTO_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__LAZY = MOBA_DTO_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__TRANSIENT = MOBA_DTO_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Domain Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__DOMAIN_KEY = MOBA_DTO_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__DOMAIN_DESCRIPTION = MOBA_DTO_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__ALIAS = MOBA_DTO_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__TYPE = MOBA_DTO_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Dto Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE_FEATURE_COUNT = MOBA_DTO_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__PROPERTIES = MOBA_DTO_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__FRIENDS = MOBA_DTO_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__NAME = MOBA_DTO_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__MULTIPLICITY = MOBA_DTO_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__CASCADING = MOBA_DTO_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__LAZY = MOBA_DTO_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__TRANSIENT = MOBA_DTO_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__TYPE = MOBA_DTO_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Dto Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE_FEATURE_COUNT = MOBA_DTO_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_FEATURE__PROPERTIES = MOBA_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_FEATURE__FRIENDS = MOBA_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_FEATURE__NAME = MOBA_FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Queue Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_FEATURE_FEATURE_COUNT = MOBA_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__PROPERTIES = MOBA_QUEUE_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__FRIENDS = MOBA_QUEUE_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__NAME = MOBA_QUEUE_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__MULTIPLICITY = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__CASCADING = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__LAZY = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__TRANSIENT = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__TYPE = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Queue Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE_FEATURE_COUNT = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Lower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MULIPLICITY__LOWER = 0;

	/**
	 * The feature id for the '<em><b>Upper</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MULIPLICITY__UPPER = 1;

	/**
	 * The number of structural features of the '<em>Muliplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MULIPLICITY_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_FEATURE__PROPERTIES = MOBA_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_FEATURE__FRIENDS = MOBA_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_FEATURE__NAME = MOBA_FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Settings Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_FEATURE_FEATURE_COUNT = MOBA_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__PROPERTIES = MOBA_SETTINGS_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__FRIENDS = MOBA_SETTINGS_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__NAME = MOBA_SETTINGS_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__MULTIPLICITY = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__CONSTRAINTS = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__LAZY = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__TRANSIENT = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Domain Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__DOMAIN_KEY = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__DOMAIN_DESCRIPTION = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__TYPE = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Settings Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE_FEATURE_COUNT = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTRAINTABLE__CONSTRAINTS = 0;

	/**
	 * The number of structural features of the '<em>Constraintable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTRAINTABLE_FEATURE_COUNT = 1;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Filter String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REGEXP_CONSTRAINT__FILTER_STRING = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REGEXP_CONSTRAINT__FILTER_CONST = MOBA_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Regexp Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REGEXP_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MIN_CONSTRAINT__FILTER_VALUE = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MIN_CONSTRAINT__FILTER_CONST = MOBA_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Min Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MIN_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MAX_CONSTRAINT__FILTER_VALUE = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MAX_CONSTRAINT__FILTER_CONST = MOBA_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Max Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MAX_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Future Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FUTURE_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Past Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAST_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not Null Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NOT_NULL_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Null Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NULL_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MIN_LENGTH_CONSTRAINT__FILTER_VALUE = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MIN_LENGTH_CONSTRAINT__FILTER_CONST = MOBA_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Min Length Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MIN_LENGTH_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MAX_LENGTH_CONSTRAINT__FILTER_VALUE = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MAX_LENGTH_CONSTRAINT__FILTER_CONST = MOBA_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Max Length Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_MAX_LENGTH_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_VALUE = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Filter Integer Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_CONST = MOBA_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Filter Fraction Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_VALUE = MOBA_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Filter Fraction Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_CONST = MOBA_CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Digits Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DIGITS_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM__SUPER_TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM__LITERALS = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM_LITERAL__LITERAL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM_LITERAL__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM_LITERAL__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Enum Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM_LITERAL_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_UI_APPLICATION__PROPERTIES = MOBA_APPLICATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_UI_APPLICATION__FRIENDS = MOBA_APPLICATION__FRIENDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_UI_APPLICATION__ID = MOBA_APPLICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_UI_APPLICATION__NAME = MOBA_APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_UI_APPLICATION__VERSION = MOBA_APPLICATION__VERSION;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_UI_APPLICATION__FEATURES = MOBA_APPLICATION__FEATURES;

	/**
	 * The number of structural features of the '<em>Ui Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_UI_APPLICATION_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BACKGROUND_APPLICATION__PROPERTIES = MOBA_APPLICATION__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BACKGROUND_APPLICATION__FRIENDS = MOBA_APPLICATION__FRIENDS;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BACKGROUND_APPLICATION__ID = MOBA_APPLICATION__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BACKGROUND_APPLICATION__NAME = MOBA_APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BACKGROUND_APPLICATION__VERSION = MOBA_APPLICATION__VERSION;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BACKGROUND_APPLICATION__FEATURES = MOBA_APPLICATION__FEATURES;

	/**
	 * The feature id for the '<em><b>Triggers</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BACKGROUND_APPLICATION__TRIGGERS = MOBA_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Background Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BACKGROUND_APPLICATION_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TRIGGER__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TRIGGER__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TRIGGER__SUPER_TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TRIGGER__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TRIGGER_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_INSTALL_TRIGGER__PROPERTIES = MOBA_TRIGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_INSTALL_TRIGGER__FRIENDS = MOBA_TRIGGER__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_INSTALL_TRIGGER__SUPER_TYPE = MOBA_TRIGGER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_INSTALL_TRIGGER__NAME = MOBA_TRIGGER__NAME;

	/**
	 * The number of structural features of the '<em>App Install Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_INSTALL_TRIGGER_FEATURE_COUNT = MOBA_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_UPDATEL_TRIGGER__PROPERTIES = MOBA_TRIGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_UPDATEL_TRIGGER__FRIENDS = MOBA_TRIGGER__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_UPDATEL_TRIGGER__SUPER_TYPE = MOBA_TRIGGER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_UPDATEL_TRIGGER__NAME = MOBA_TRIGGER__NAME;

	/**
	 * The number of structural features of the '<em>App Updatel Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APP_UPDATEL_TRIGGER_FEATURE_COUNT = MOBA_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SMS_TRIGGER__PROPERTIES = MOBA_TRIGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SMS_TRIGGER__FRIENDS = MOBA_TRIGGER__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SMS_TRIGGER__SUPER_TYPE = MOBA_TRIGGER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SMS_TRIGGER__NAME = MOBA_TRIGGER__NAME;

	/**
	 * The number of structural features of the '<em>SMS Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SMS_TRIGGER_FEATURE_COUNT = MOBA_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DEVICE_STARTUP_TRIGGER__PROPERTIES = MOBA_TRIGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DEVICE_STARTUP_TRIGGER__FRIENDS = MOBA_TRIGGER__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DEVICE_STARTUP_TRIGGER__SUPER_TYPE = MOBA_TRIGGER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DEVICE_STARTUP_TRIGGER__NAME = MOBA_TRIGGER__NAME;

	/**
	 * The number of structural features of the '<em>Device Startup Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DEVICE_STARTUP_TRIGGER_FEATURE_COUNT = MOBA_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EMAIL_TRIGGER__PROPERTIES = MOBA_TRIGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EMAIL_TRIGGER__FRIENDS = MOBA_TRIGGER__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EMAIL_TRIGGER__SUPER_TYPE = MOBA_TRIGGER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EMAIL_TRIGGER__NAME = MOBA_TRIGGER__NAME;

	/**
	 * The number of structural features of the '<em>Email Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EMAIL_TRIGGER_FEATURE_COUNT = MOBA_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TIMER_TRIGGER__PROPERTIES = MOBA_TRIGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TIMER_TRIGGER__FRIENDS = MOBA_TRIGGER__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TIMER_TRIGGER__SUPER_TYPE = MOBA_TRIGGER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TIMER_TRIGGER__NAME = MOBA_TRIGGER__NAME;

	/**
	 * The number of structural features of the '<em>Timer Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TIMER_TRIGGER_FEATURE_COUNT = MOBA_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_TRIGGER__PROPERTIES = MOBA_TRIGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_TRIGGER__FRIENDS = MOBA_TRIGGER__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_TRIGGER__SUPER_TYPE = MOBA_TRIGGER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_TRIGGER__NAME = MOBA_TRIGGER__NAME;

	/**
	 * The number of structural features of the '<em>Push Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_TRIGGER_FEATURE_COUNT = MOBA_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GEOFENCE_TRIGGER__PROPERTIES = MOBA_TRIGGER__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GEOFENCE_TRIGGER__FRIENDS = MOBA_TRIGGER__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GEOFENCE_TRIGGER__SUPER_TYPE = MOBA_TRIGGER__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GEOFENCE_TRIGGER__NAME = MOBA_TRIGGER__NAME;

	/**
	 * The feature id for the '<em><b>Event Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GEOFENCE_TRIGGER__EVENT_TYPE = MOBA_TRIGGER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Geofence Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GEOFENCE_TRIGGER_FEATURE_COUNT = MOBA_TRIGGER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_SLOT__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_SLOT__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_SLOT__SUPER_TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_SLOT__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_SLOT__TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Generator Slot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_SLOT_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FRIEND__VALUE_STRING = 0;

	/**
	 * The feature id for the '<em><b>Value Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FRIEND__VALUE_CONST = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FRIEND__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Friend</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FRIEND_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaExternalModuleImpl <em>External Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaExternalModuleImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaExternalModule()
	 * @generated
	 */
	int MOBA_EXTERNAL_MODULE = 70;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EXTERNAL_MODULE__PROPERTIES = MOBA_APPLICATION_FEATURE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EXTERNAL_MODULE__FRIENDS = MOBA_APPLICATION_FEATURE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EXTERNAL_MODULE__SUPER_TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EXTERNAL_MODULE__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>External Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_EXTERNAL_MODULE_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaBluetoothModuleImpl <em>Bluetooth Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaBluetoothModuleImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaBluetoothModule()
	 * @generated
	 */
	int MOBA_BLUETOOTH_MODULE = 71;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BLUETOOTH_MODULE__PROPERTIES = MOBA_EXTERNAL_MODULE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BLUETOOTH_MODULE__FRIENDS = MOBA_EXTERNAL_MODULE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BLUETOOTH_MODULE__SUPER_TYPE = MOBA_EXTERNAL_MODULE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BLUETOOTH_MODULE__NAME = MOBA_EXTERNAL_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BLUETOOTH_MODULE__TYPE = MOBA_EXTERNAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bluetooth Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_BLUETOOTH_MODULE_FEATURE_COUNT = MOBA_EXTERNAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaNFCModuleImpl <em>NFC Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaNFCModuleImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNFCModule()
	 * @generated
	 */
	int MOBA_NFC_MODULE = 72;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NFC_MODULE__PROPERTIES = MOBA_EXTERNAL_MODULE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NFC_MODULE__FRIENDS = MOBA_EXTERNAL_MODULE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NFC_MODULE__SUPER_TYPE = MOBA_EXTERNAL_MODULE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NFC_MODULE__NAME = MOBA_EXTERNAL_MODULE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NFC_MODULE__TYPE = MOBA_EXTERNAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>NFC Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NFC_MODULE_FEATURE_COUNT = MOBA_EXTERNAL_MODULE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPushModuleImpl <em>Push Module</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPushModuleImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPushModule()
	 * @generated
	 */
	int MOBA_PUSH_MODULE = 73;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_MODULE__PROPERTIES = MOBA_EXTERNAL_MODULE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_MODULE__FRIENDS = MOBA_EXTERNAL_MODULE__FRIENDS;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_MODULE__SUPER_TYPE = MOBA_EXTERNAL_MODULE__SUPER_TYPE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_MODULE__NAME = MOBA_EXTERNAL_MODULE__NAME;

	/**
	 * The number of structural features of the '<em>Push Module</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PUSH_MODULE_FEATURE_COUNT = MOBA_EXTERNAL_MODULE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaRESTMethods <em>REST Methods</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaRESTMethods
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTMethods()
	 * @generated
	 */
	int MOBA_REST_METHODS = 74;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaLowerBound <em>Lower Bound</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaLowerBound
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaLowerBound()
	 * @generated
	 */
	int MOBA_LOWER_BOUND = 75;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaUpperBound <em>Upper Bound</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaUpperBound
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaUpperBound()
	 * @generated
	 */
	int MOBA_UPPER_BOUND = 76;


	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaGeofenceEvent <em>Geofence Event</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaGeofenceEvent
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeofenceEvent()
	 * @generated
	 */
	int MOBA_GEOFENCE_EVENT = 77;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaNFCModuleType <em>NFC Module Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaNFCModuleType
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNFCModuleType()
	 * @generated
	 */
	int MOBA_NFC_MODULE_TYPE = 78;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaBlueToothModuleType <em>Blue Tooth Module Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaBlueToothModuleType
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaBlueToothModuleType()
	 * @generated
	 */
	int MOBA_BLUE_TOOTH_MODULE_TYPE = 79;


	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaProject <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProject
	 * @generated
	 */
	EClass getMobaProject();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaProject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProject#getId()
	 * @see #getMobaProject()
	 * @generated
	 */
	EAttribute getMobaProject_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaProject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProject#getName()
	 * @see #getMobaProject()
	 * @generated
	 */
	EAttribute getMobaProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaProject#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProject#getVersion()
	 * @see #getMobaProject()
	 * @generated
	 */
	EAttribute getMobaProject_Version();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaProject#getUiApplication <em>Ui Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Ui Application</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProject#getUiApplication()
	 * @see #getMobaProject()
	 * @generated
	 */
	EReference getMobaProject_UiApplication();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaProject#getBackgroundApplication <em>Background Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Background Application</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProject#getBackgroundApplication()
	 * @see #getMobaProject()
	 * @generated
	 */
	EReference getMobaProject_BackgroundApplication();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaApplication
	 * @generated
	 */
	EClass getMobaApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaApplication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaApplication#getId()
	 * @see #getMobaApplication()
	 * @generated
	 */
	EAttribute getMobaApplication_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaApplication#getName()
	 * @see #getMobaApplication()
	 * @generated
	 */
	EAttribute getMobaApplication_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaApplication#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaApplication#getVersion()
	 * @see #getMobaApplication()
	 * @generated
	 */
	EAttribute getMobaApplication_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaApplication#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaApplication#getFeatures()
	 * @see #getMobaApplication()
	 * @generated
	 */
	EReference getMobaApplication_Features();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaApplicationFeature <em>Application Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaApplicationFeature
	 * @generated
	 */
	EClass getMobaApplicationFeature();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaTemplate
	 * @generated
	 */
	EClass getMobaTemplate();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaTemplate#getTemplate <em>Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Template</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaTemplate#getTemplate()
	 * @see #getMobaTemplate()
	 * @generated
	 */
	EReference getMobaTemplate_Template();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaTemplate#getDownloadTemplate <em>Download Template</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Download Template</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaTemplate#getDownloadTemplate()
	 * @see #getMobaTemplate()
	 * @generated
	 */
	EAttribute getMobaTemplate_DownloadTemplate();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaServer <em>Server</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Server</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaServer
	 * @generated
	 */
	EClass getMobaServer();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaServer#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaServer#getUrl()
	 * @see #getMobaServer()
	 * @generated
	 */
	EAttribute getMobaServer_Url();

	/**
	 * Returns the meta object for the reference list '{@link org.mobadsl.semantic.model.moba.MobaServer#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaServer#getServices()
	 * @see #getMobaServer()
	 * @generated
	 */
	EReference getMobaServer_Services();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaServer#getAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Authorization</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaServer#getAuthorization()
	 * @see #getMobaServer()
	 * @generated
	 */
	EReference getMobaServer_Authorization();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaAuthorization <em>Authorization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorization</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaAuthorization
	 * @generated
	 */
	EClass getMobaAuthorization();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaAuthorization#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaAuthorization#getName()
	 * @see #getMobaAuthorization()
	 * @generated
	 */
	EAttribute getMobaAuthorization_Name();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaTransportSerializationType <em>Transport Serialization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transport Serialization Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaTransportSerializationType
	 * @generated
	 */
	EClass getMobaTransportSerializationType();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaTransportSerializationType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaTransportSerializationType#getName()
	 * @see #getMobaTransportSerializationType()
	 * @generated
	 */
	EAttribute getMobaTransportSerializationType_Name();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGenerator
	 * @generated
	 */
	EClass getMobaGenerator();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaGenerator#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGenerator#getName()
	 * @see #getMobaGenerator()
	 * @generated
	 */
	EAttribute getMobaGenerator_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaGenerator#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGenerator#getFeatures()
	 * @see #getMobaGenerator()
	 * @generated
	 */
	EReference getMobaGenerator_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaGenerator#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGenerator#isActive()
	 * @see #getMobaGenerator()
	 * @generated
	 */
	EAttribute getMobaGenerator_Active();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaGeneratorFeature <em>Generator Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorFeature
	 * @generated
	 */
	EClass getMobaGeneratorFeature();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature <em>Generator Mixin Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Mixin Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature
	 * @generated
	 */
	EClass getMobaGeneratorMixinFeature();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature#getGeneratorRef <em>Generator Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator Ref</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature#getGeneratorRef()
	 * @see #getMobaGeneratorMixinFeature()
	 * @generated
	 */
	EReference getMobaGeneratorMixinFeature_GeneratorRef();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature <em>Generator ID Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator ID Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature
	 * @generated
	 */
	EClass getMobaGeneratorIDFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorId <em>Generator Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Id</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorId()
	 * @see #getMobaGeneratorIDFeature()
	 * @generated
	 */
	EAttribute getMobaGeneratorIDFeature_GeneratorId();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorVersion <em>Generator Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator Version</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorVersion()
	 * @see #getMobaGeneratorIDFeature()
	 * @generated
	 */
	EAttribute getMobaGeneratorIDFeature_GeneratorVersion();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType
	 * @generated
	 */
	EClass getMobaDataType();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#getName()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#isPrimitive <em>Primitive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#isPrimitive()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_Primitive();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#isString <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#isString()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_String();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#isNumeric <em>Numeric</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Numeric</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#isNumeric()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_Numeric();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#isDecimal <em>Decimal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decimal</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#isDecimal()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_Decimal();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#isArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#isArray()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_Array();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#isDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#isDate()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatString <em>Date Format String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Format String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatString()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_DateFormatString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatConst <em>Date Format Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Date Format Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatConst()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EReference getMobaDataType_DateFormatConst();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaDataType#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#getSuperType()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EReference getMobaDataType_SuperType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaDataType#getEnumAST <em>Enum AST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Enum AST</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#getEnumAST()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EReference getMobaDataType_EnumAST();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#isTime <em>Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#isTime()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_Time();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDataType#isTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDataType#isTimestamp()
	 * @see #getMobaDataType()
	 * @generated
	 */
	EAttribute getMobaDataType_Timestamp();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaConstant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstant
	 * @generated
	 */
	EClass getMobaConstant();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaConstant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstant#getName()
	 * @see #getMobaConstant()
	 * @generated
	 */
	EAttribute getMobaConstant_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaConstant#getValueAST <em>Value AST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value AST</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstant#getValueAST()
	 * @see #getMobaConstant()
	 * @generated
	 */
	EReference getMobaConstant_ValueAST();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaConstantValue <em>Constant Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstantValue
	 * @generated
	 */
	EClass getMobaConstantValue();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstantValue#getValueString()
	 * @see #getMobaConstantValue()
	 * @generated
	 */
	EAttribute getMobaConstantValue_ValueString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueConst <em>Value Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstantValue#getValueConst()
	 * @see #getMobaConstantValue()
	 * @generated
	 */
	EReference getMobaConstantValue_ValueConst();

	/**
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getTail <em>Tail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tail</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstantValue#getTail()
	 * @see #getMobaConstantValue()
	 * @generated
	 */
	EReference getMobaConstantValue_Tail();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueInt <em>Value Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Int</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstantValue#getValueInt()
	 * @see #getMobaConstantValue()
	 * @generated
	 */
	EAttribute getMobaConstantValue_ValueInt();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueDouble <em>Value Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Double</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstantValue#getValueDouble()
	 * @see #getMobaConstantValue()
	 * @generated
	 */
	EAttribute getMobaConstantValue_ValueDouble();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaPropertiesAble <em>Properties Able</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Properties Able</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPropertiesAble
	 * @generated
	 */
	EClass getMobaPropertiesAble();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaPropertiesAble#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPropertiesAble#getProperties()
	 * @see #getMobaPropertiesAble()
	 * @generated
	 */
	EReference getMobaPropertiesAble_Properties();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProperty
	 * @generated
	 */
	EClass getMobaProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaProperty#getKeyString <em>Key String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProperty#getKeyString()
	 * @see #getMobaProperty()
	 * @generated
	 */
	EAttribute getMobaProperty_KeyString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaProperty#getKeyConst <em>Key Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Key Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProperty#getKeyConst()
	 * @see #getMobaProperty()
	 * @generated
	 */
	EReference getMobaProperty_KeyConst();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaProperty#getValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProperty#getValueString()
	 * @see #getMobaProperty()
	 * @generated
	 */
	EAttribute getMobaProperty_ValueString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaProperty#getValueConst <em>Value Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProperty#getValueConst()
	 * @see #getMobaProperty()
	 * @generated
	 */
	EReference getMobaProperty_ValueConst();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaProperty#getKey <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProperty#getKey()
	 * @see #getMobaProperty()
	 * @generated
	 */
	EAttribute getMobaProperty_Key();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaProperty#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaProperty#getValue()
	 * @see #getMobaProperty()
	 * @generated
	 */
	EAttribute getMobaProperty_Value();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaData
	 * @generated
	 */
	EClass getMobaData();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaSettings <em>Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettings
	 * @generated
	 */
	EClass getMobaSettings();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaSettings#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettings#getSuperType()
	 * @see #getMobaSettings()
	 * @generated
	 */
	EReference getMobaSettings_SuperType();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaSettings#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettings#getName()
	 * @see #getMobaSettings()
	 * @generated
	 */
	EAttribute getMobaSettings_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaSettings#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettings#getFeatures()
	 * @see #getMobaSettings()
	 * @generated
	 */
	EReference getMobaSettings_Features();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaSettings#isActive <em>Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Active</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettings#isActive()
	 * @see #getMobaSettings()
	 * @generated
	 */
	EAttribute getMobaSettings_Active();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cache</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaCache
	 * @generated
	 */
	EClass getMobaCache();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheTypeString <em>Cache Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Type String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaCache#getCacheTypeString()
	 * @see #getMobaCache()
	 * @generated
	 */
	EAttribute getMobaCache_CacheTypeString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheTypeConst <em>Cache Type Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cache Type Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaCache#getCacheTypeConst()
	 * @see #getMobaCache()
	 * @generated
	 */
	EReference getMobaCache_CacheTypeConst();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheStrategyString <em>Cache Strategy String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cache Strategy String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaCache#getCacheStrategyString()
	 * @see #getMobaCache()
	 * @generated
	 */
	EAttribute getMobaCache_CacheStrategyString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaCache#getCacheStrategyConst <em>Cache Strategy Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Cache Strategy Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaCache#getCacheStrategyConst()
	 * @see #getMobaCache()
	 * @generated
	 */
	EReference getMobaCache_CacheStrategyConst();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaEntity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntity
	 * @generated
	 */
	EClass getMobaEntity();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEntity#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntity#getName()
	 * @see #getMobaEntity()
	 * @generated
	 */
	EAttribute getMobaEntity_Name();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaEntity#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntity#getSuperType()
	 * @see #getMobaEntity()
	 * @generated
	 */
	EReference getMobaEntity_SuperType();

	/**
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaEntity#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntity#getCache()
	 * @see #getMobaEntity()
	 * @generated
	 */
	EReference getMobaEntity_Cache();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaEntity#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntity#getFeatures()
	 * @see #getMobaEntity()
	 * @generated
	 */
	EReference getMobaEntity_Features();

	/**
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaEntity#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntity#getIndex()
	 * @see #getMobaEntity()
	 * @generated
	 */
	EReference getMobaEntity_Index();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaEntityIndex <em>Entity Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Index</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityIndex
	 * @generated
	 */
	EClass getMobaEntityIndex();

	/**
	 * Returns the meta object for the reference list '{@link org.mobadsl.semantic.model.moba.MobaEntityIndex#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityIndex#getAttributes()
	 * @see #getMobaEntityIndex()
	 * @generated
	 */
	EReference getMobaEntityIndex_Attributes();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDto
	 * @generated
	 */
	EClass getMobaDto();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDto#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDto#getName()
	 * @see #getMobaDto()
	 * @generated
	 */
	EAttribute getMobaDto_Name();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaDto#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDto#getSuperType()
	 * @see #getMobaDto()
	 * @generated
	 */
	EReference getMobaDto_SuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaDto#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDto#getFeatures()
	 * @see #getMobaDto()
	 * @generated
	 */
	EReference getMobaDto_Features();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaDto#getSerializationType <em>Serialization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serialization Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDto#getSerializationType()
	 * @see #getMobaDto()
	 * @generated
	 */
	EReference getMobaDto_SerializationType();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaQueue <em>Queue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueue
	 * @generated
	 */
	EClass getMobaQueue();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaQueue#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueue#getName()
	 * @see #getMobaQueue()
	 * @generated
	 */
	EAttribute getMobaQueue_Name();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaQueue#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueue#getSuperType()
	 * @see #getMobaQueue()
	 * @generated
	 */
	EReference getMobaQueue_SuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaQueue#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueue#getFeatures()
	 * @see #getMobaQueue()
	 * @generated
	 */
	EReference getMobaQueue_Features();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaREST <em>REST</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaREST
	 * @generated
	 */
	EClass getMobaREST();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaREST#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaREST#getName()
	 * @see #getMobaREST()
	 * @generated
	 */
	EAttribute getMobaREST_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaREST#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaREST#getUrl()
	 * @see #getMobaREST()
	 * @generated
	 */
	EAttribute getMobaREST_Url();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaREST#isBigData <em>Big Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Big Data</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaREST#isBigData()
	 * @see #getMobaREST()
	 * @generated
	 */
	EAttribute getMobaREST_BigData();

	/**
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaREST#getRequestDto <em>Request Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Request Dto</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaREST#getRequestDto()
	 * @see #getMobaREST()
	 * @generated
	 */
	EReference getMobaREST_RequestDto();

	/**
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaREST#getResponseDto <em>Response Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Dto</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaREST#getResponseDto()
	 * @see #getMobaREST()
	 * @generated
	 */
	EReference getMobaREST_ResponseDto();

	/**
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaREST#getErrorDto <em>Error Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Error Dto</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaREST#getErrorDto()
	 * @see #getMobaREST()
	 * @generated
	 */
	EReference getMobaREST_ErrorDto();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaREST#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaREST#getHeaders()
	 * @see #getMobaREST()
	 * @generated
	 */
	EReference getMobaREST_Headers();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition <em>REST Payload Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Payload Definition</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition
	 * @generated
	 */
	EClass getMobaRESTPayloadDefinition();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#getDto <em>Dto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dto</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#getDto()
	 * @see #getMobaRESTPayloadDefinition()
	 * @generated
	 */
	EReference getMobaRESTPayloadDefinition_Dto();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#isArray <em>Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Array</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#isArray()
	 * @see #getMobaRESTPayloadDefinition()
	 * @generated
	 */
	EAttribute getMobaRESTPayloadDefinition_Array();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#getSerializationType <em>Serialization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Serialization Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#getSerializationType()
	 * @see #getMobaRESTPayloadDefinition()
	 * @generated
	 */
	EReference getMobaRESTPayloadDefinition_SerializationType();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute <em>REST Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Attribute</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute
	 * @generated
	 */
	EClass getMobaRESTAttribute();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute#getType()
	 * @see #getMobaRESTAttribute()
	 * @generated
	 */
	EReference getMobaRESTAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getNameString <em>Name String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute#getNameString()
	 * @see #getMobaRESTAttribute()
	 * @generated
	 */
	EAttribute getMobaRESTAttribute_NameString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getNameConst <em>Name Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Name Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute#getNameConst()
	 * @see #getMobaRESTAttribute()
	 * @generated
	 */
	EReference getMobaRESTAttribute_NameConst();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueString()
	 * @see #getMobaRESTAttribute()
	 * @generated
	 */
	EAttribute getMobaRESTAttribute_ValueString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueConst <em>Value Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueConst()
	 * @see #getMobaRESTAttribute()
	 * @generated
	 */
	EReference getMobaRESTAttribute_ValueConst();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueDouble <em>Value Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Double</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueDouble()
	 * @see #getMobaRESTAttribute()
	 * @generated
	 */
	EAttribute getMobaRESTAttribute_ValueDouble();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueInt <em>Value Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Int</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueInt()
	 * @see #getMobaRESTAttribute()
	 * @generated
	 */
	EAttribute getMobaRESTAttribute_ValueInt();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute#getName()
	 * @see #getMobaRESTAttribute()
	 * @generated
	 */
	EAttribute getMobaRESTAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValue()
	 * @see #getMobaRESTAttribute()
	 * @generated
	 */
	EAttribute getMobaRESTAttribute_Value();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService <em>REST Custom Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Custom Service</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTCustomService
	 * @generated
	 */
	EClass getMobaRESTCustomService();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operation</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTCustomService#getOperation()
	 * @see #getMobaRESTCustomService()
	 * @generated
	 */
	EAttribute getMobaRESTCustomService_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTCustomService#getParameters()
	 * @see #getMobaRESTCustomService()
	 * @generated
	 */
	EReference getMobaRESTCustomService_Parameters();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTCustomService#getSuperType()
	 * @see #getMobaRESTCustomService()
	 * @generated
	 */
	EReference getMobaRESTCustomService_SuperType();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaRESTWorkflow <em>REST Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Workflow</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTWorkflow
	 * @generated
	 */
	EClass getMobaRESTWorkflow();

	/**
	 * Returns the meta object for the reference list '{@link org.mobadsl.semantic.model.moba.MobaRESTWorkflow#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Services</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTWorkflow#getServices()
	 * @see #getMobaRESTWorkflow()
	 * @generated
	 */
	EReference getMobaRESTWorkflow_Services();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaRESTWorkflow#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTWorkflow#getSuperType()
	 * @see #getMobaRESTWorkflow()
	 * @generated
	 */
	EReference getMobaRESTWorkflow_SuperType();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaRESTCrud <em>REST Crud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>REST Crud</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTCrud
	 * @generated
	 */
	EClass getMobaRESTCrud();

	/**
	 * Returns the meta object for the attribute list '{@link org.mobadsl.semantic.model.moba.MobaRESTCrud#getOperations <em>Operations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Operations</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTCrud#getOperations()
	 * @see #getMobaRESTCrud()
	 * @generated
	 */
	EAttribute getMobaRESTCrud_Operations();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaRESTCrud#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTCrud#getSuperType()
	 * @see #getMobaRESTCrud()
	 * @generated
	 */
	EReference getMobaRESTCrud_SuperType();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaFeature
	 * @generated
	 */
	EClass getMobaFeature();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaFeature#getName()
	 * @see #getMobaFeature()
	 * @generated
	 */
	EAttribute getMobaFeature_Name();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaEntityFeature <em>Entity Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityFeature
	 * @generated
	 */
	EClass getMobaEntityFeature();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute <em>Entity Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Attribute</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityAttribute
	 * @generated
	 */
	EClass getMobaEntityAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityAttribute#isLazy()
	 * @see #getMobaEntityAttribute()
	 * @generated
	 */
	EAttribute getMobaEntityAttribute_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityAttribute#isTransient()
	 * @see #getMobaEntityAttribute()
	 * @generated
	 */
	EAttribute getMobaEntityAttribute_Transient();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isDomainKey <em>Domain Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Key</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityAttribute#isDomainKey()
	 * @see #getMobaEntityAttribute()
	 * @generated
	 */
	EAttribute getMobaEntityAttribute_DomainKey();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isDomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Description</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityAttribute#isDomainDescription()
	 * @see #getMobaEntityAttribute()
	 * @generated
	 */
	EAttribute getMobaEntityAttribute_DomainDescription();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityAttribute#getType()
	 * @see #getMobaEntityAttribute()
	 * @generated
	 */
	EReference getMobaEntityAttribute_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaMultiplicityAble <em>Multiplicity Able</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiplicity Able</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMultiplicityAble
	 * @generated
	 */
	EClass getMobaMultiplicityAble();

	/**
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaMultiplicityAble#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Multiplicity</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMultiplicityAble#getMultiplicity()
	 * @see #getMobaMultiplicityAble()
	 * @generated
	 */
	EReference getMobaMultiplicityAble_Multiplicity();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaEntityReference <em>Entity Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity Reference</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityReference
	 * @generated
	 */
	EClass getMobaEntityReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEntityReference#isCascading <em>Cascading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascading</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityReference#isCascading()
	 * @see #getMobaEntityReference()
	 * @generated
	 */
	EAttribute getMobaEntityReference_Cascading();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEntityReference#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityReference#isLazy()
	 * @see #getMobaEntityReference()
	 * @generated
	 */
	EAttribute getMobaEntityReference_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEntityReference#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityReference#isTransient()
	 * @see #getMobaEntityReference()
	 * @generated
	 */
	EAttribute getMobaEntityReference_Transient();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaEntityReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEntityReference#getType()
	 * @see #getMobaEntityReference()
	 * @generated
	 */
	EReference getMobaEntityReference_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaDtoFeature <em>Dto Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoFeature
	 * @generated
	 */
	EClass getMobaDtoFeature();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute <em>Dto Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto Attribute</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoAttribute
	 * @generated
	 */
	EClass getMobaDtoAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoAttribute#isLazy()
	 * @see #getMobaDtoAttribute()
	 * @generated
	 */
	EAttribute getMobaDtoAttribute_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoAttribute#isTransient()
	 * @see #getMobaDtoAttribute()
	 * @generated
	 */
	EAttribute getMobaDtoAttribute_Transient();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isDomainKey <em>Domain Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Key</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoAttribute#isDomainKey()
	 * @see #getMobaDtoAttribute()
	 * @generated
	 */
	EAttribute getMobaDtoAttribute_DomainKey();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isDomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Description</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoAttribute#isDomainDescription()
	 * @see #getMobaDtoAttribute()
	 * @generated
	 */
	EAttribute getMobaDtoAttribute_DomainDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoAttribute#getAlias()
	 * @see #getMobaDtoAttribute()
	 * @generated
	 */
	EAttribute getMobaDtoAttribute_Alias();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoAttribute#getType()
	 * @see #getMobaDtoAttribute()
	 * @generated
	 */
	EReference getMobaDtoAttribute_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaDtoReference <em>Dto Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto Reference</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoReference
	 * @generated
	 */
	EClass getMobaDtoReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDtoReference#isCascading <em>Cascading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascading</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoReference#isCascading()
	 * @see #getMobaDtoReference()
	 * @generated
	 */
	EAttribute getMobaDtoReference_Cascading();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDtoReference#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoReference#isLazy()
	 * @see #getMobaDtoReference()
	 * @generated
	 */
	EAttribute getMobaDtoReference_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDtoReference#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoReference#isTransient()
	 * @see #getMobaDtoReference()
	 * @generated
	 */
	EAttribute getMobaDtoReference_Transient();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaDtoReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoReference#getType()
	 * @see #getMobaDtoReference()
	 * @generated
	 */
	EReference getMobaDtoReference_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaQueueFeature <em>Queue Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueueFeature
	 * @generated
	 */
	EClass getMobaQueueFeature();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaQueueReference <em>Queue Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Queue Reference</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueueReference
	 * @generated
	 */
	EClass getMobaQueueReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaQueueReference#isCascading <em>Cascading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascading</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueueReference#isCascading()
	 * @see #getMobaQueueReference()
	 * @generated
	 */
	EAttribute getMobaQueueReference_Cascading();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaQueueReference#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueueReference#isLazy()
	 * @see #getMobaQueueReference()
	 * @generated
	 */
	EAttribute getMobaQueueReference_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaQueueReference#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueueReference#isTransient()
	 * @see #getMobaQueueReference()
	 * @generated
	 */
	EAttribute getMobaQueueReference_Transient();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaQueueReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaQueueReference#getType()
	 * @see #getMobaQueueReference()
	 * @generated
	 */
	EReference getMobaQueueReference_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaMuliplicity <em>Muliplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Muliplicity</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMuliplicity
	 * @generated
	 */
	EClass getMobaMuliplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaMuliplicity#getLower <em>Lower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMuliplicity#getLower()
	 * @see #getMobaMuliplicity()
	 * @generated
	 */
	EAttribute getMobaMuliplicity_Lower();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaMuliplicity#getUpper <em>Upper</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMuliplicity#getUpper()
	 * @see #getMobaMuliplicity()
	 * @generated
	 */
	EAttribute getMobaMuliplicity_Upper();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaSettingsFeature <em>Settings Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettingsFeature
	 * @generated
	 */
	EClass getMobaSettingsFeature();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaSettingsAttribute <em>Settings Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Settings Attribute</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettingsAttribute
	 * @generated
	 */
	EClass getMobaSettingsAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaSettingsAttribute#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettingsAttribute#isLazy()
	 * @see #getMobaSettingsAttribute()
	 * @generated
	 */
	EAttribute getMobaSettingsAttribute_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaSettingsAttribute#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettingsAttribute#isTransient()
	 * @see #getMobaSettingsAttribute()
	 * @generated
	 */
	EAttribute getMobaSettingsAttribute_Transient();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaSettingsAttribute#isDomainKey <em>Domain Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Key</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettingsAttribute#isDomainKey()
	 * @see #getMobaSettingsAttribute()
	 * @generated
	 */
	EAttribute getMobaSettingsAttribute_DomainKey();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaSettingsAttribute#isDomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Description</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettingsAttribute#isDomainDescription()
	 * @see #getMobaSettingsAttribute()
	 * @generated
	 */
	EAttribute getMobaSettingsAttribute_DomainDescription();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaSettingsAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSettingsAttribute#getType()
	 * @see #getMobaSettingsAttribute()
	 * @generated
	 */
	EReference getMobaSettingsAttribute_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaConstraintable <em>Constraintable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraintable</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstraintable
	 * @generated
	 */
	EClass getMobaConstraintable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaConstraintable#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstraintable#getConstraints()
	 * @see #getMobaConstraintable()
	 * @generated
	 */
	EReference getMobaConstraintable_Constraints();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaConstraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaConstraint
	 * @generated
	 */
	EClass getMobaConstraint();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint <em>Regexp Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Regexp Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRegexpConstraint
	 * @generated
	 */
	EClass getMobaRegexpConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint#getFilterString <em>Filter String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRegexpConstraint#getFilterString()
	 * @see #getMobaRegexpConstraint()
	 * @generated
	 */
	EAttribute getMobaRegexpConstraint_FilterString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint#getFilterConst <em>Filter Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRegexpConstraint#getFilterConst()
	 * @see #getMobaRegexpConstraint()
	 * @generated
	 */
	EReference getMobaRegexpConstraint_FilterConst();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaMinConstraint <em>Min Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMinConstraint
	 * @generated
	 */
	EClass getMobaMinConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaMinConstraint#getFilterValue <em>Filter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMinConstraint#getFilterValue()
	 * @see #getMobaMinConstraint()
	 * @generated
	 */
	EAttribute getMobaMinConstraint_FilterValue();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaMinConstraint#getFilterConst <em>Filter Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMinConstraint#getFilterConst()
	 * @see #getMobaMinConstraint()
	 * @generated
	 */
	EReference getMobaMinConstraint_FilterConst();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaMaxConstraint <em>Max Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMaxConstraint
	 * @generated
	 */
	EClass getMobaMaxConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaMaxConstraint#getFilterValue <em>Filter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMaxConstraint#getFilterValue()
	 * @see #getMobaMaxConstraint()
	 * @generated
	 */
	EAttribute getMobaMaxConstraint_FilterValue();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaMaxConstraint#getFilterConst <em>Filter Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMaxConstraint#getFilterConst()
	 * @see #getMobaMaxConstraint()
	 * @generated
	 */
	EReference getMobaMaxConstraint_FilterConst();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaFutureConstraint <em>Future Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Future Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaFutureConstraint
	 * @generated
	 */
	EClass getMobaFutureConstraint();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaPastConstraint <em>Past Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Past Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPastConstraint
	 * @generated
	 */
	EClass getMobaPastConstraint();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaNotNullConstraint <em>Not Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not Null Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaNotNullConstraint
	 * @generated
	 */
	EClass getMobaNotNullConstraint();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaNullConstraint <em>Null Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Null Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaNullConstraint
	 * @generated
	 */
	EClass getMobaNullConstraint();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaMinLengthConstraint <em>Min Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min Length Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMinLengthConstraint
	 * @generated
	 */
	EClass getMobaMinLengthConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaMinLengthConstraint#getFilterValue <em>Filter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMinLengthConstraint#getFilterValue()
	 * @see #getMobaMinLengthConstraint()
	 * @generated
	 */
	EAttribute getMobaMinLengthConstraint_FilterValue();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaMinLengthConstraint#getFilterConst <em>Filter Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMinLengthConstraint#getFilterConst()
	 * @see #getMobaMinLengthConstraint()
	 * @generated
	 */
	EReference getMobaMinLengthConstraint_FilterConst();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint <em>Max Length Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max Length Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint
	 * @generated
	 */
	EClass getMobaMaxLengthConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint#getFilterValue <em>Filter Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint#getFilterValue()
	 * @see #getMobaMaxLengthConstraint()
	 * @generated
	 */
	EAttribute getMobaMaxLengthConstraint_FilterValue();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint#getFilterConst <em>Filter Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint#getFilterConst()
	 * @see #getMobaMaxLengthConstraint()
	 * @generated
	 */
	EReference getMobaMaxLengthConstraint_FilterConst();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint <em>Digits Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Digits Constraint</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDigitsConstraint
	 * @generated
	 */
	EClass getMobaDigitsConstraint();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterIntegerValue <em>Filter Integer Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Integer Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterIntegerValue()
	 * @see #getMobaDigitsConstraint()
	 * @generated
	 */
	EAttribute getMobaDigitsConstraint_FilterIntegerValue();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterIntegerConst <em>Filter Integer Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Integer Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterIntegerConst()
	 * @see #getMobaDigitsConstraint()
	 * @generated
	 */
	EReference getMobaDigitsConstraint_FilterIntegerConst();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterFractionValue <em>Filter Fraction Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filter Fraction Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterFractionValue()
	 * @see #getMobaDigitsConstraint()
	 * @generated
	 */
	EAttribute getMobaDigitsConstraint_FilterFractionValue();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterFractionConst <em>Filter Fraction Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Filter Fraction Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterFractionConst()
	 * @see #getMobaDigitsConstraint()
	 * @generated
	 */
	EReference getMobaDigitsConstraint_FilterFractionConst();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaEnum <em>Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEnum
	 * @generated
	 */
	EClass getMobaEnum();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaEnum#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEnum#getSuperType()
	 * @see #getMobaEnum()
	 * @generated
	 */
	EReference getMobaEnum_SuperType();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEnum#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEnum#getName()
	 * @see #getMobaEnum()
	 * @generated
	 */
	EAttribute getMobaEnum_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaEnum#getLiterals <em>Literals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literals</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEnum#getLiterals()
	 * @see #getMobaEnum()
	 * @generated
	 */
	EReference getMobaEnum_Literals();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaEnumLiteral <em>Enum Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Enum Literal</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEnumLiteral
	 * @generated
	 */
	EClass getMobaEnumLiteral();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEnumLiteral#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEnumLiteral#getLiteral()
	 * @see #getMobaEnumLiteral()
	 * @generated
	 */
	EAttribute getMobaEnumLiteral_Literal();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEnumLiteral#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEnumLiteral#getName()
	 * @see #getMobaEnumLiteral()
	 * @generated
	 */
	EAttribute getMobaEnumLiteral_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaEnumLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEnumLiteral#getValue()
	 * @see #getMobaEnumLiteral()
	 * @generated
	 */
	EAttribute getMobaEnumLiteral_Value();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaUiApplication <em>Ui Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ui Application</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaUiApplication
	 * @generated
	 */
	EClass getMobaUiApplication();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaBackgroundApplication <em>Background Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Background Application</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaBackgroundApplication
	 * @generated
	 */
	EClass getMobaBackgroundApplication();

	/**
	 * Returns the meta object for the reference list '{@link org.mobadsl.semantic.model.moba.MobaBackgroundApplication#getTriggers <em>Triggers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Triggers</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaBackgroundApplication#getTriggers()
	 * @see #getMobaBackgroundApplication()
	 * @generated
	 */
	EReference getMobaBackgroundApplication_Triggers();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaTrigger
	 * @generated
	 */
	EClass getMobaTrigger();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaTrigger#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaTrigger#getSuperType()
	 * @see #getMobaTrigger()
	 * @generated
	 */
	EReference getMobaTrigger_SuperType();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaTrigger#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaTrigger#getName()
	 * @see #getMobaTrigger()
	 * @generated
	 */
	EAttribute getMobaTrigger_Name();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaAppInstallTrigger <em>App Install Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Install Trigger</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaAppInstallTrigger
	 * @generated
	 */
	EClass getMobaAppInstallTrigger();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaAppUpdatelTrigger <em>App Updatel Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>App Updatel Trigger</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaAppUpdatelTrigger
	 * @generated
	 */
	EClass getMobaAppUpdatelTrigger();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaSMSTrigger <em>SMS Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SMS Trigger</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaSMSTrigger
	 * @generated
	 */
	EClass getMobaSMSTrigger();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaDeviceStartupTrigger <em>Device Startup Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Device Startup Trigger</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDeviceStartupTrigger
	 * @generated
	 */
	EClass getMobaDeviceStartupTrigger();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaEmailTrigger <em>Email Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Email Trigger</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaEmailTrigger
	 * @generated
	 */
	EClass getMobaEmailTrigger();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaTimerTrigger <em>Timer Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Trigger</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaTimerTrigger
	 * @generated
	 */
	EClass getMobaTimerTrigger();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaPushTrigger <em>Push Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Trigger</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPushTrigger
	 * @generated
	 */
	EClass getMobaPushTrigger();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaGeofenceTrigger <em>Geofence Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Geofence Trigger</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeofenceTrigger
	 * @generated
	 */
	EClass getMobaGeofenceTrigger();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaGeofenceTrigger#getEventType <em>Event Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Event Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeofenceTrigger#getEventType()
	 * @see #getMobaGeofenceTrigger()
	 * @generated
	 */
	EAttribute getMobaGeofenceTrigger_EventType();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaGeneratorSlot <em>Generator Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator Slot</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorSlot
	 * @generated
	 */
	EClass getMobaGeneratorSlot();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaGeneratorSlot#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorSlot#getSuperType()
	 * @see #getMobaGeneratorSlot()
	 * @generated
	 */
	EReference getMobaGeneratorSlot_SuperType();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaGeneratorSlot#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorSlot#getName()
	 * @see #getMobaGeneratorSlot()
	 * @generated
	 */
	EAttribute getMobaGeneratorSlot_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaGeneratorSlot#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorSlot#getType()
	 * @see #getMobaGeneratorSlot()
	 * @generated
	 */
	EAttribute getMobaGeneratorSlot_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaFriend <em>Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Friend</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaFriend
	 * @generated
	 */
	EClass getMobaFriend();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaFriend#getValueString <em>Value String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaFriend#getValueString()
	 * @see #getMobaFriend()
	 * @generated
	 */
	EAttribute getMobaFriend_ValueString();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaFriend#getValueConst <em>Value Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Value Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaFriend#getValueConst()
	 * @see #getMobaFriend()
	 * @generated
	 */
	EReference getMobaFriend_ValueConst();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaFriend#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaFriend#getValue()
	 * @see #getMobaFriend()
	 * @generated
	 */
	EAttribute getMobaFriend_Value();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaFriendsAble <em>Friends Able</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Friends Able</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaFriendsAble
	 * @generated
	 */
	EClass getMobaFriendsAble();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaFriendsAble#getFriends <em>Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Friends</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaFriendsAble#getFriends()
	 * @see #getMobaFriendsAble()
	 * @generated
	 */
	EReference getMobaFriendsAble_Friends();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaExternalModule <em>External Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Module</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaExternalModule
	 * @generated
	 */
	EClass getMobaExternalModule();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaExternalModule#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaExternalModule#getSuperType()
	 * @see #getMobaExternalModule()
	 * @generated
	 */
	EReference getMobaExternalModule_SuperType();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaExternalModule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaExternalModule#getName()
	 * @see #getMobaExternalModule()
	 * @generated
	 */
	EAttribute getMobaExternalModule_Name();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaBluetoothModule <em>Bluetooth Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bluetooth Module</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaBluetoothModule
	 * @generated
	 */
	EClass getMobaBluetoothModule();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaBluetoothModule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaBluetoothModule#getType()
	 * @see #getMobaBluetoothModule()
	 * @generated
	 */
	EAttribute getMobaBluetoothModule_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaNFCModule <em>NFC Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>NFC Module</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaNFCModule
	 * @generated
	 */
	EClass getMobaNFCModule();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaNFCModule#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaNFCModule#getType()
	 * @see #getMobaNFCModule()
	 * @generated
	 */
	EAttribute getMobaNFCModule_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaPushModule <em>Push Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Push Module</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPushModule
	 * @generated
	 */
	EClass getMobaPushModule();

	/**
	 * Returns the meta object for enum '{@link org.mobadsl.semantic.model.moba.MobaRESTMethods <em>REST Methods</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>REST Methods</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTMethods
	 * @generated
	 */
	EEnum getMobaRESTMethods();

	/**
	 * Returns the meta object for enum '{@link org.mobadsl.semantic.model.moba.MobaLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Lower Bound</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaLowerBound
	 * @generated
	 */
	EEnum getMobaLowerBound();

	/**
	 * Returns the meta object for enum '{@link org.mobadsl.semantic.model.moba.MobaUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Upper Bound</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaUpperBound
	 * @generated
	 */
	EEnum getMobaUpperBound();

	/**
	 * Returns the meta object for enum '{@link org.mobadsl.semantic.model.moba.MobaGeofenceEvent <em>Geofence Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Geofence Event</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeofenceEvent
	 * @generated
	 */
	EEnum getMobaGeofenceEvent();

	/**
	 * Returns the meta object for enum '{@link org.mobadsl.semantic.model.moba.MobaNFCModuleType <em>NFC Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>NFC Module Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaNFCModuleType
	 * @generated
	 */
	EEnum getMobaNFCModuleType();

	/**
	 * Returns the meta object for enum '{@link org.mobadsl.semantic.model.moba.MobaBlueToothModuleType <em>Blue Tooth Module Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Blue Tooth Module Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaBlueToothModuleType
	 * @generated
	 */
	EEnum getMobaBlueToothModuleType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MobaFactory getMobaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaProjectImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaProject()
		 * @generated
		 */
		EClass MOBA_PROJECT = eINSTANCE.getMobaProject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PROJECT__ID = eINSTANCE.getMobaProject_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PROJECT__NAME = eINSTANCE.getMobaProject_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PROJECT__VERSION = eINSTANCE.getMobaProject_Version();

		/**
		 * The meta object literal for the '<em><b>Ui Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_PROJECT__UI_APPLICATION = eINSTANCE.getMobaProject_UiApplication();

		/**
		 * The meta object literal for the '<em><b>Background Application</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_PROJECT__BACKGROUND_APPLICATION = eINSTANCE.getMobaProject_BackgroundApplication();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaApplication()
		 * @generated
		 */
		EClass MOBA_APPLICATION = eINSTANCE.getMobaApplication();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_APPLICATION__ID = eINSTANCE.getMobaApplication_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_APPLICATION__NAME = eINSTANCE.getMobaApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_APPLICATION__VERSION = eINSTANCE.getMobaApplication_Version();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_APPLICATION__FEATURES = eINSTANCE.getMobaApplication_Features();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationFeatureImpl <em>Application Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaApplicationFeatureImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaApplicationFeature()
		 * @generated
		 */
		EClass MOBA_APPLICATION_FEATURE = eINSTANCE.getMobaApplicationFeature();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaTemplateImpl <em>Template</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaTemplateImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaTemplate()
		 * @generated
		 */
		EClass MOBA_TEMPLATE = eINSTANCE.getMobaTemplate();

		/**
		 * The meta object literal for the '<em><b>Template</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_TEMPLATE__TEMPLATE = eINSTANCE.getMobaTemplate_Template();

		/**
		 * The meta object literal for the '<em><b>Download Template</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_TEMPLATE__DOWNLOAD_TEMPLATE = eINSTANCE.getMobaTemplate_DownloadTemplate();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl <em>Server</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaServerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaServer()
		 * @generated
		 */
		EClass MOBA_SERVER = eINSTANCE.getMobaServer();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_SERVER__URL = eINSTANCE.getMobaServer_Url();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_SERVER__SERVICES = eINSTANCE.getMobaServer_Services();

		/**
		 * The meta object literal for the '<em><b>Authorization</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_SERVER__AUTHORIZATION = eINSTANCE.getMobaServer_Authorization();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaAuthorizationImpl <em>Authorization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaAuthorizationImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaAuthorization()
		 * @generated
		 */
		EClass MOBA_AUTHORIZATION = eINSTANCE.getMobaAuthorization();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_AUTHORIZATION__NAME = eINSTANCE.getMobaAuthorization_Name();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaTransportSerializationTypeImpl <em>Transport Serialization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaTransportSerializationTypeImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaTransportSerializationType()
		 * @generated
		 */
		EClass MOBA_TRANSPORT_SERIALIZATION_TYPE = eINSTANCE.getMobaTransportSerializationType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_TRANSPORT_SERIALIZATION_TYPE__NAME = eINSTANCE.getMobaTransportSerializationType_Name();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGenerator()
		 * @generated
		 */
		EClass MOBA_GENERATOR = eINSTANCE.getMobaGenerator();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_GENERATOR__NAME = eINSTANCE.getMobaGenerator_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_GENERATOR__FEATURES = eINSTANCE.getMobaGenerator_Features();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_GENERATOR__ACTIVE = eINSTANCE.getMobaGenerator_Active();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaGeneratorFeature <em>Generator Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaGeneratorFeature
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorFeature()
		 * @generated
		 */
		EClass MOBA_GENERATOR_FEATURE = eINSTANCE.getMobaGeneratorFeature();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorMixinFeatureImpl <em>Generator Mixin Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorMixinFeatureImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorMixinFeature()
		 * @generated
		 */
		EClass MOBA_GENERATOR_MIXIN_FEATURE = eINSTANCE.getMobaGeneratorMixinFeature();

		/**
		 * The meta object literal for the '<em><b>Generator Ref</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_GENERATOR_MIXIN_FEATURE__GENERATOR_REF = eINSTANCE.getMobaGeneratorMixinFeature_GeneratorRef();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl <em>Generator ID Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorIDFeature()
		 * @generated
		 */
		EClass MOBA_GENERATOR_ID_FEATURE = eINSTANCE.getMobaGeneratorIDFeature();

		/**
		 * The meta object literal for the '<em><b>Generator Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_GENERATOR_ID_FEATURE__GENERATOR_ID = eINSTANCE.getMobaGeneratorIDFeature_GeneratorId();

		/**
		 * The meta object literal for the '<em><b>Generator Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_GENERATOR_ID_FEATURE__GENERATOR_VERSION = eINSTANCE.getMobaGeneratorIDFeature_GeneratorVersion();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl <em>Data Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDataType()
		 * @generated
		 */
		EClass MOBA_DATA_TYPE = eINSTANCE.getMobaDataType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__NAME = eINSTANCE.getMobaDataType_Name();

		/**
		 * The meta object literal for the '<em><b>Primitive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__PRIMITIVE = eINSTANCE.getMobaDataType_Primitive();

		/**
		 * The meta object literal for the '<em><b>String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__STRING = eINSTANCE.getMobaDataType_String();

		/**
		 * The meta object literal for the '<em><b>Numeric</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__NUMERIC = eINSTANCE.getMobaDataType_Numeric();

		/**
		 * The meta object literal for the '<em><b>Decimal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__DECIMAL = eINSTANCE.getMobaDataType_Decimal();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__ARRAY = eINSTANCE.getMobaDataType_Array();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__DATE = eINSTANCE.getMobaDataType_Date();

		/**
		 * The meta object literal for the '<em><b>Date Format String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__DATE_FORMAT_STRING = eINSTANCE.getMobaDataType_DateFormatString();

		/**
		 * The meta object literal for the '<em><b>Date Format Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DATA_TYPE__DATE_FORMAT_CONST = eINSTANCE.getMobaDataType_DateFormatConst();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DATA_TYPE__SUPER_TYPE = eINSTANCE.getMobaDataType_SuperType();

		/**
		 * The meta object literal for the '<em><b>Enum AST</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DATA_TYPE__ENUM_AST = eINSTANCE.getMobaDataType_EnumAST();

		/**
		 * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__TIME = eINSTANCE.getMobaDataType_Time();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DATA_TYPE__TIMESTAMP = eINSTANCE.getMobaDataType_Timestamp();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaConstantImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstant()
		 * @generated
		 */
		EClass MOBA_CONSTANT = eINSTANCE.getMobaConstant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_CONSTANT__NAME = eINSTANCE.getMobaConstant_Name();

		/**
		 * The meta object literal for the '<em><b>Value AST</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_CONSTANT__VALUE_AST = eINSTANCE.getMobaConstant_ValueAST();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl <em>Constant Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstantValue()
		 * @generated
		 */
		EClass MOBA_CONSTANT_VALUE = eINSTANCE.getMobaConstantValue();

		/**
		 * The meta object literal for the '<em><b>Value String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_CONSTANT_VALUE__VALUE_STRING = eINSTANCE.getMobaConstantValue_ValueString();

		/**
		 * The meta object literal for the '<em><b>Value Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_CONSTANT_VALUE__VALUE_CONST = eINSTANCE.getMobaConstantValue_ValueConst();

		/**
		 * The meta object literal for the '<em><b>Tail</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_CONSTANT_VALUE__TAIL = eINSTANCE.getMobaConstantValue_Tail();

		/**
		 * The meta object literal for the '<em><b>Value Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_CONSTANT_VALUE__VALUE_INT = eINSTANCE.getMobaConstantValue_ValueInt();

		/**
		 * The meta object literal for the '<em><b>Value Double</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_CONSTANT_VALUE__VALUE_DOUBLE = eINSTANCE.getMobaConstantValue_ValueDouble();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPropertiesAbleImpl <em>Properties Able</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPropertiesAbleImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPropertiesAble()
		 * @generated
		 */
		EClass MOBA_PROPERTIES_ABLE = eINSTANCE.getMobaPropertiesAble();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_PROPERTIES_ABLE__PROPERTIES = eINSTANCE.getMobaPropertiesAble_Properties();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl <em>Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaProperty()
		 * @generated
		 */
		EClass MOBA_PROPERTY = eINSTANCE.getMobaProperty();

		/**
		 * The meta object literal for the '<em><b>Key String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PROPERTY__KEY_STRING = eINSTANCE.getMobaProperty_KeyString();

		/**
		 * The meta object literal for the '<em><b>Key Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_PROPERTY__KEY_CONST = eINSTANCE.getMobaProperty_KeyConst();

		/**
		 * The meta object literal for the '<em><b>Value String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PROPERTY__VALUE_STRING = eINSTANCE.getMobaProperty_ValueString();

		/**
		 * The meta object literal for the '<em><b>Value Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_PROPERTY__VALUE_CONST = eINSTANCE.getMobaProperty_ValueConst();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PROPERTY__KEY = eINSTANCE.getMobaProperty_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PROPERTY__VALUE = eINSTANCE.getMobaProperty_Value();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaDataImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaData()
		 * @generated
		 */
		EClass MOBA_DATA = eINSTANCE.getMobaData();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl <em>Settings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSettings()
		 * @generated
		 */
		EClass MOBA_SETTINGS = eINSTANCE.getMobaSettings();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_SETTINGS__SUPER_TYPE = eINSTANCE.getMobaSettings_SuperType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_SETTINGS__NAME = eINSTANCE.getMobaSettings_Name();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_SETTINGS__FEATURES = eINSTANCE.getMobaSettings_Features();

		/**
		 * The meta object literal for the '<em><b>Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_SETTINGS__ACTIVE = eINSTANCE.getMobaSettings_Active();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl <em>Cache</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaCacheImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaCache()
		 * @generated
		 */
		EClass MOBA_CACHE = eINSTANCE.getMobaCache();

		/**
		 * The meta object literal for the '<em><b>Cache Type String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_CACHE__CACHE_TYPE_STRING = eINSTANCE.getMobaCache_CacheTypeString();

		/**
		 * The meta object literal for the '<em><b>Cache Type Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_CACHE__CACHE_TYPE_CONST = eINSTANCE.getMobaCache_CacheTypeConst();

		/**
		 * The meta object literal for the '<em><b>Cache Strategy String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_CACHE__CACHE_STRATEGY_STRING = eINSTANCE.getMobaCache_CacheStrategyString();

		/**
		 * The meta object literal for the '<em><b>Cache Strategy Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_CACHE__CACHE_STRATEGY_CONST = eINSTANCE.getMobaCache_CacheStrategyConst();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityImpl <em>Entity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntity()
		 * @generated
		 */
		EClass MOBA_ENTITY = eINSTANCE.getMobaEntity();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENTITY__NAME = eINSTANCE.getMobaEntity_Name();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_ENTITY__SUPER_TYPE = eINSTANCE.getMobaEntity_SuperType();

		/**
		 * The meta object literal for the '<em><b>Cache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_ENTITY__CACHE = eINSTANCE.getMobaEntity_Cache();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_ENTITY__FEATURES = eINSTANCE.getMobaEntity_Features();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_ENTITY__INDEX = eINSTANCE.getMobaEntity_Index();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityIndexImpl <em>Entity Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityIndexImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntityIndex()
		 * @generated
		 */
		EClass MOBA_ENTITY_INDEX = eINSTANCE.getMobaEntityIndex();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_ENTITY_INDEX__ATTRIBUTES = eINSTANCE.getMobaEntityIndex_Attributes();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoImpl <em>Dto</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDto()
		 * @generated
		 */
		EClass MOBA_DTO = eINSTANCE.getMobaDto();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DTO__NAME = eINSTANCE.getMobaDto_Name();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO__SUPER_TYPE = eINSTANCE.getMobaDto_SuperType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO__FEATURES = eINSTANCE.getMobaDto_Features();

		/**
		 * The meta object literal for the '<em><b>Serialization Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO__SERIALIZATION_TYPE = eINSTANCE.getMobaDto_SerializationType();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl <em>Queue</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaQueueImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaQueue()
		 * @generated
		 */
		EClass MOBA_QUEUE = eINSTANCE.getMobaQueue();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_QUEUE__NAME = eINSTANCE.getMobaQueue_Name();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_QUEUE__SUPER_TYPE = eINSTANCE.getMobaQueue_SuperType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_QUEUE__FEATURES = eINSTANCE.getMobaQueue_Features();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl <em>REST</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaREST()
		 * @generated
		 */
		EClass MOBA_REST = eINSTANCE.getMobaREST();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST__NAME = eINSTANCE.getMobaREST_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST__URL = eINSTANCE.getMobaREST_Url();

		/**
		 * The meta object literal for the '<em><b>Big Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST__BIG_DATA = eINSTANCE.getMobaREST_BigData();

		/**
		 * The meta object literal for the '<em><b>Request Dto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST__REQUEST_DTO = eINSTANCE.getMobaREST_RequestDto();

		/**
		 * The meta object literal for the '<em><b>Response Dto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST__RESPONSE_DTO = eINSTANCE.getMobaREST_ResponseDto();

		/**
		 * The meta object literal for the '<em><b>Error Dto</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST__ERROR_DTO = eINSTANCE.getMobaREST_ErrorDto();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST__HEADERS = eINSTANCE.getMobaREST_Headers();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTPayloadDefinitionImpl <em>REST Payload Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTPayloadDefinitionImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTPayloadDefinition()
		 * @generated
		 */
		EClass MOBA_REST_PAYLOAD_DEFINITION = eINSTANCE.getMobaRESTPayloadDefinition();

		/**
		 * The meta object literal for the '<em><b>Dto</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_PAYLOAD_DEFINITION__DTO = eINSTANCE.getMobaRESTPayloadDefinition_Dto();

		/**
		 * The meta object literal for the '<em><b>Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_PAYLOAD_DEFINITION__ARRAY = eINSTANCE.getMobaRESTPayloadDefinition_Array();

		/**
		 * The meta object literal for the '<em><b>Serialization Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_PAYLOAD_DEFINITION__SERIALIZATION_TYPE = eINSTANCE.getMobaRESTPayloadDefinition_SerializationType();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl <em>REST Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTAttributeImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTAttribute()
		 * @generated
		 */
		EClass MOBA_REST_ATTRIBUTE = eINSTANCE.getMobaRESTAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_ATTRIBUTE__TYPE = eINSTANCE.getMobaRESTAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Name String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_ATTRIBUTE__NAME_STRING = eINSTANCE.getMobaRESTAttribute_NameString();

		/**
		 * The meta object literal for the '<em><b>Name Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_ATTRIBUTE__NAME_CONST = eINSTANCE.getMobaRESTAttribute_NameConst();

		/**
		 * The meta object literal for the '<em><b>Value String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_ATTRIBUTE__VALUE_STRING = eINSTANCE.getMobaRESTAttribute_ValueString();

		/**
		 * The meta object literal for the '<em><b>Value Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_ATTRIBUTE__VALUE_CONST = eINSTANCE.getMobaRESTAttribute_ValueConst();

		/**
		 * The meta object literal for the '<em><b>Value Double</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_ATTRIBUTE__VALUE_DOUBLE = eINSTANCE.getMobaRESTAttribute_ValueDouble();

		/**
		 * The meta object literal for the '<em><b>Value Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_ATTRIBUTE__VALUE_INT = eINSTANCE.getMobaRESTAttribute_ValueInt();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_ATTRIBUTE__NAME = eINSTANCE.getMobaRESTAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_ATTRIBUTE__VALUE = eINSTANCE.getMobaRESTAttribute_Value();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTCustomServiceImpl <em>REST Custom Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTCustomServiceImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTCustomService()
		 * @generated
		 */
		EClass MOBA_REST_CUSTOM_SERVICE = eINSTANCE.getMobaRESTCustomService();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_CUSTOM_SERVICE__OPERATION = eINSTANCE.getMobaRESTCustomService_Operation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_CUSTOM_SERVICE__PARAMETERS = eINSTANCE.getMobaRESTCustomService_Parameters();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE = eINSTANCE.getMobaRESTCustomService_SuperType();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTWorkflowImpl <em>REST Workflow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTWorkflowImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTWorkflow()
		 * @generated
		 */
		EClass MOBA_REST_WORKFLOW = eINSTANCE.getMobaRESTWorkflow();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_WORKFLOW__SERVICES = eINSTANCE.getMobaRESTWorkflow_Services();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_WORKFLOW__SUPER_TYPE = eINSTANCE.getMobaRESTWorkflow_SuperType();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRESTCrudImpl <em>REST Crud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaRESTCrudImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTCrud()
		 * @generated
		 */
		EClass MOBA_REST_CRUD = eINSTANCE.getMobaRESTCrud();

		/**
		 * The meta object literal for the '<em><b>Operations</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_CRUD__OPERATIONS = eINSTANCE.getMobaRESTCrud_Operations();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REST_CRUD__SUPER_TYPE = eINSTANCE.getMobaRESTCrud_SuperType();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFeatureImpl <em>Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaFeatureImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFeature()
		 * @generated
		 */
		EClass MOBA_FEATURE = eINSTANCE.getMobaFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_FEATURE__NAME = eINSTANCE.getMobaFeature_Name();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityFeatureImpl <em>Entity Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityFeatureImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntityFeature()
		 * @generated
		 */
		EClass MOBA_ENTITY_FEATURE = eINSTANCE.getMobaEntityFeature();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityAttributeImpl <em>Entity Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityAttributeImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntityAttribute()
		 * @generated
		 */
		EClass MOBA_ENTITY_ATTRIBUTE = eINSTANCE.getMobaEntityAttribute();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENTITY_ATTRIBUTE__LAZY = eINSTANCE.getMobaEntityAttribute_Lazy();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENTITY_ATTRIBUTE__TRANSIENT = eINSTANCE.getMobaEntityAttribute_Transient();

		/**
		 * The meta object literal for the '<em><b>Domain Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENTITY_ATTRIBUTE__DOMAIN_KEY = eINSTANCE.getMobaEntityAttribute_DomainKey();

		/**
		 * The meta object literal for the '<em><b>Domain Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENTITY_ATTRIBUTE__DOMAIN_DESCRIPTION = eINSTANCE.getMobaEntityAttribute_DomainDescription();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_ENTITY_ATTRIBUTE__TYPE = eINSTANCE.getMobaEntityAttribute_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaMultiplicityAble <em>Multiplicity Able</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaMultiplicityAble
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMultiplicityAble()
		 * @generated
		 */
		EClass MOBA_MULTIPLICITY_ABLE = eINSTANCE.getMobaMultiplicityAble();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_MULTIPLICITY_ABLE__MULTIPLICITY = eINSTANCE.getMobaMultiplicityAble_Multiplicity();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEntityReferenceImpl <em>Entity Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaEntityReferenceImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEntityReference()
		 * @generated
		 */
		EClass MOBA_ENTITY_REFERENCE = eINSTANCE.getMobaEntityReference();

		/**
		 * The meta object literal for the '<em><b>Cascading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENTITY_REFERENCE__CASCADING = eINSTANCE.getMobaEntityReference_Cascading();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENTITY_REFERENCE__LAZY = eINSTANCE.getMobaEntityReference_Lazy();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENTITY_REFERENCE__TRANSIENT = eINSTANCE.getMobaEntityReference_Transient();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_ENTITY_REFERENCE__TYPE = eINSTANCE.getMobaEntityReference_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoFeatureImpl <em>Dto Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoFeatureImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoFeature()
		 * @generated
		 */
		EClass MOBA_DTO_FEATURE = eINSTANCE.getMobaDtoFeature();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoAttributeImpl <em>Dto Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoAttributeImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoAttribute()
		 * @generated
		 */
		EClass MOBA_DTO_ATTRIBUTE = eINSTANCE.getMobaDtoAttribute();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DTO_ATTRIBUTE__LAZY = eINSTANCE.getMobaDtoAttribute_Lazy();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DTO_ATTRIBUTE__TRANSIENT = eINSTANCE.getMobaDtoAttribute_Transient();

		/**
		 * The meta object literal for the '<em><b>Domain Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DTO_ATTRIBUTE__DOMAIN_KEY = eINSTANCE.getMobaDtoAttribute_DomainKey();

		/**
		 * The meta object literal for the '<em><b>Domain Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DTO_ATTRIBUTE__DOMAIN_DESCRIPTION = eINSTANCE.getMobaDtoAttribute_DomainDescription();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DTO_ATTRIBUTE__ALIAS = eINSTANCE.getMobaDtoAttribute_Alias();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO_ATTRIBUTE__TYPE = eINSTANCE.getMobaDtoAttribute_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoReferenceImpl <em>Dto Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoReferenceImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoReference()
		 * @generated
		 */
		EClass MOBA_DTO_REFERENCE = eINSTANCE.getMobaDtoReference();

		/**
		 * The meta object literal for the '<em><b>Cascading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DTO_REFERENCE__CASCADING = eINSTANCE.getMobaDtoReference_Cascading();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DTO_REFERENCE__LAZY = eINSTANCE.getMobaDtoReference_Lazy();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DTO_REFERENCE__TRANSIENT = eINSTANCE.getMobaDtoReference_Transient();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO_REFERENCE__TYPE = eINSTANCE.getMobaDtoReference_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaQueueFeatureImpl <em>Queue Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaQueueFeatureImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaQueueFeature()
		 * @generated
		 */
		EClass MOBA_QUEUE_FEATURE = eINSTANCE.getMobaQueueFeature();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaQueueReferenceImpl <em>Queue Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaQueueReferenceImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaQueueReference()
		 * @generated
		 */
		EClass MOBA_QUEUE_REFERENCE = eINSTANCE.getMobaQueueReference();

		/**
		 * The meta object literal for the '<em><b>Cascading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_QUEUE_REFERENCE__CASCADING = eINSTANCE.getMobaQueueReference_Cascading();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_QUEUE_REFERENCE__LAZY = eINSTANCE.getMobaQueueReference_Lazy();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_QUEUE_REFERENCE__TRANSIENT = eINSTANCE.getMobaQueueReference_Transient();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_QUEUE_REFERENCE__TYPE = eINSTANCE.getMobaQueueReference_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMuliplicityImpl <em>Muliplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaMuliplicityImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMuliplicity()
		 * @generated
		 */
		EClass MOBA_MULIPLICITY = eINSTANCE.getMobaMuliplicity();

		/**
		 * The meta object literal for the '<em><b>Lower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_MULIPLICITY__LOWER = eINSTANCE.getMobaMuliplicity_Lower();

		/**
		 * The meta object literal for the '<em><b>Upper</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_MULIPLICITY__UPPER = eINSTANCE.getMobaMuliplicity_Upper();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsFeatureImpl <em>Settings Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaSettingsFeatureImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSettingsFeature()
		 * @generated
		 */
		EClass MOBA_SETTINGS_FEATURE = eINSTANCE.getMobaSettingsFeature();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsAttributeImpl <em>Settings Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaSettingsAttributeImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSettingsAttribute()
		 * @generated
		 */
		EClass MOBA_SETTINGS_ATTRIBUTE = eINSTANCE.getMobaSettingsAttribute();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_SETTINGS_ATTRIBUTE__LAZY = eINSTANCE.getMobaSettingsAttribute_Lazy();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_SETTINGS_ATTRIBUTE__TRANSIENT = eINSTANCE.getMobaSettingsAttribute_Transient();

		/**
		 * The meta object literal for the '<em><b>Domain Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_SETTINGS_ATTRIBUTE__DOMAIN_KEY = eINSTANCE.getMobaSettingsAttribute_DomainKey();

		/**
		 * The meta object literal for the '<em><b>Domain Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_SETTINGS_ATTRIBUTE__DOMAIN_DESCRIPTION = eINSTANCE.getMobaSettingsAttribute_DomainDescription();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_SETTINGS_ATTRIBUTE__TYPE = eINSTANCE.getMobaSettingsAttribute_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaConstraintable <em>Constraintable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaConstraintable
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstraintable()
		 * @generated
		 */
		EClass MOBA_CONSTRAINTABLE = eINSTANCE.getMobaConstraintable();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_CONSTRAINTABLE__CONSTRAINTS = eINSTANCE.getMobaConstraintable_Constraints();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstraint()
		 * @generated
		 */
		EClass MOBA_CONSTRAINT = eINSTANCE.getMobaConstraint();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRegexpConstraintImpl <em>Regexp Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaRegexpConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRegexpConstraint()
		 * @generated
		 */
		EClass MOBA_REGEXP_CONSTRAINT = eINSTANCE.getMobaRegexpConstraint();

		/**
		 * The meta object literal for the '<em><b>Filter String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REGEXP_CONSTRAINT__FILTER_STRING = eINSTANCE.getMobaRegexpConstraint_FilterString();

		/**
		 * The meta object literal for the '<em><b>Filter Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_REGEXP_CONSTRAINT__FILTER_CONST = eINSTANCE.getMobaRegexpConstraint_FilterConst();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMinConstraintImpl <em>Min Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaMinConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMinConstraint()
		 * @generated
		 */
		EClass MOBA_MIN_CONSTRAINT = eINSTANCE.getMobaMinConstraint();

		/**
		 * The meta object literal for the '<em><b>Filter Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_MIN_CONSTRAINT__FILTER_VALUE = eINSTANCE.getMobaMinConstraint_FilterValue();

		/**
		 * The meta object literal for the '<em><b>Filter Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_MIN_CONSTRAINT__FILTER_CONST = eINSTANCE.getMobaMinConstraint_FilterConst();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMaxConstraintImpl <em>Max Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaMaxConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMaxConstraint()
		 * @generated
		 */
		EClass MOBA_MAX_CONSTRAINT = eINSTANCE.getMobaMaxConstraint();

		/**
		 * The meta object literal for the '<em><b>Filter Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_MAX_CONSTRAINT__FILTER_VALUE = eINSTANCE.getMobaMaxConstraint_FilterValue();

		/**
		 * The meta object literal for the '<em><b>Filter Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_MAX_CONSTRAINT__FILTER_CONST = eINSTANCE.getMobaMaxConstraint_FilterConst();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFutureConstraintImpl <em>Future Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaFutureConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFutureConstraint()
		 * @generated
		 */
		EClass MOBA_FUTURE_CONSTRAINT = eINSTANCE.getMobaFutureConstraint();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPastConstraintImpl <em>Past Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPastConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPastConstraint()
		 * @generated
		 */
		EClass MOBA_PAST_CONSTRAINT = eINSTANCE.getMobaPastConstraint();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaNotNullConstraintImpl <em>Not Null Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaNotNullConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNotNullConstraint()
		 * @generated
		 */
		EClass MOBA_NOT_NULL_CONSTRAINT = eINSTANCE.getMobaNotNullConstraint();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaNullConstraintImpl <em>Null Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaNullConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNullConstraint()
		 * @generated
		 */
		EClass MOBA_NULL_CONSTRAINT = eINSTANCE.getMobaNullConstraint();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMinLengthConstraintImpl <em>Min Length Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaMinLengthConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMinLengthConstraint()
		 * @generated
		 */
		EClass MOBA_MIN_LENGTH_CONSTRAINT = eINSTANCE.getMobaMinLengthConstraint();

		/**
		 * The meta object literal for the '<em><b>Filter Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_MIN_LENGTH_CONSTRAINT__FILTER_VALUE = eINSTANCE.getMobaMinLengthConstraint_FilterValue();

		/**
		 * The meta object literal for the '<em><b>Filter Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_MIN_LENGTH_CONSTRAINT__FILTER_CONST = eINSTANCE.getMobaMinLengthConstraint_FilterConst();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMaxLengthConstraintImpl <em>Max Length Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaMaxLengthConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMaxLengthConstraint()
		 * @generated
		 */
		EClass MOBA_MAX_LENGTH_CONSTRAINT = eINSTANCE.getMobaMaxLengthConstraint();

		/**
		 * The meta object literal for the '<em><b>Filter Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_MAX_LENGTH_CONSTRAINT__FILTER_VALUE = eINSTANCE.getMobaMaxLengthConstraint_FilterValue();

		/**
		 * The meta object literal for the '<em><b>Filter Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_MAX_LENGTH_CONSTRAINT__FILTER_CONST = eINSTANCE.getMobaMaxLengthConstraint_FilterConst();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl <em>Digits Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDigitsConstraint()
		 * @generated
		 */
		EClass MOBA_DIGITS_CONSTRAINT = eINSTANCE.getMobaDigitsConstraint();

		/**
		 * The meta object literal for the '<em><b>Filter Integer Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_VALUE = eINSTANCE.getMobaDigitsConstraint_FilterIntegerValue();

		/**
		 * The meta object literal for the '<em><b>Filter Integer Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_CONST = eINSTANCE.getMobaDigitsConstraint_FilterIntegerConst();

		/**
		 * The meta object literal for the '<em><b>Filter Fraction Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_VALUE = eINSTANCE.getMobaDigitsConstraint_FilterFractionValue();

		/**
		 * The meta object literal for the '<em><b>Filter Fraction Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_CONST = eINSTANCE.getMobaDigitsConstraint_FilterFractionConst();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEnumImpl <em>Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaEnumImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEnum()
		 * @generated
		 */
		EClass MOBA_ENUM = eINSTANCE.getMobaEnum();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_ENUM__SUPER_TYPE = eINSTANCE.getMobaEnum_SuperType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENUM__NAME = eINSTANCE.getMobaEnum_Name();

		/**
		 * The meta object literal for the '<em><b>Literals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_ENUM__LITERALS = eINSTANCE.getMobaEnum_Literals();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEnumLiteralImpl <em>Enum Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaEnumLiteralImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEnumLiteral()
		 * @generated
		 */
		EClass MOBA_ENUM_LITERAL = eINSTANCE.getMobaEnumLiteral();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENUM_LITERAL__LITERAL = eINSTANCE.getMobaEnumLiteral_Literal();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENUM_LITERAL__NAME = eINSTANCE.getMobaEnumLiteral_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_ENUM_LITERAL__VALUE = eINSTANCE.getMobaEnumLiteral_Value();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaUiApplicationImpl <em>Ui Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaUiApplicationImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaUiApplication()
		 * @generated
		 */
		EClass MOBA_UI_APPLICATION = eINSTANCE.getMobaUiApplication();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaBackgroundApplicationImpl <em>Background Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaBackgroundApplicationImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaBackgroundApplication()
		 * @generated
		 */
		EClass MOBA_BACKGROUND_APPLICATION = eINSTANCE.getMobaBackgroundApplication();

		/**
		 * The meta object literal for the '<em><b>Triggers</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_BACKGROUND_APPLICATION__TRIGGERS = eINSTANCE.getMobaBackgroundApplication_Triggers();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaTriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaTriggerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaTrigger()
		 * @generated
		 */
		EClass MOBA_TRIGGER = eINSTANCE.getMobaTrigger();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_TRIGGER__SUPER_TYPE = eINSTANCE.getMobaTrigger_SuperType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_TRIGGER__NAME = eINSTANCE.getMobaTrigger_Name();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaAppInstallTriggerImpl <em>App Install Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaAppInstallTriggerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaAppInstallTrigger()
		 * @generated
		 */
		EClass MOBA_APP_INSTALL_TRIGGER = eINSTANCE.getMobaAppInstallTrigger();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaAppUpdatelTriggerImpl <em>App Updatel Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaAppUpdatelTriggerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaAppUpdatelTrigger()
		 * @generated
		 */
		EClass MOBA_APP_UPDATEL_TRIGGER = eINSTANCE.getMobaAppUpdatelTrigger();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSMSTriggerImpl <em>SMS Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaSMSTriggerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSMSTrigger()
		 * @generated
		 */
		EClass MOBA_SMS_TRIGGER = eINSTANCE.getMobaSMSTrigger();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDeviceStartupTriggerImpl <em>Device Startup Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaDeviceStartupTriggerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDeviceStartupTrigger()
		 * @generated
		 */
		EClass MOBA_DEVICE_STARTUP_TRIGGER = eINSTANCE.getMobaDeviceStartupTrigger();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEmailTriggerImpl <em>Email Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaEmailTriggerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEmailTrigger()
		 * @generated
		 */
		EClass MOBA_EMAIL_TRIGGER = eINSTANCE.getMobaEmailTrigger();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaTimerTriggerImpl <em>Timer Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaTimerTriggerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaTimerTrigger()
		 * @generated
		 */
		EClass MOBA_TIMER_TRIGGER = eINSTANCE.getMobaTimerTrigger();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPushTriggerImpl <em>Push Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPushTriggerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPushTrigger()
		 * @generated
		 */
		EClass MOBA_PUSH_TRIGGER = eINSTANCE.getMobaPushTrigger();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeofenceTriggerImpl <em>Geofence Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaGeofenceTriggerImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeofenceTrigger()
		 * @generated
		 */
		EClass MOBA_GEOFENCE_TRIGGER = eINSTANCE.getMobaGeofenceTrigger();

		/**
		 * The meta object literal for the '<em><b>Event Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_GEOFENCE_TRIGGER__EVENT_TYPE = eINSTANCE.getMobaGeofenceTrigger_EventType();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorSlotImpl <em>Generator Slot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorSlotImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorSlot()
		 * @generated
		 */
		EClass MOBA_GENERATOR_SLOT = eINSTANCE.getMobaGeneratorSlot();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_GENERATOR_SLOT__SUPER_TYPE = eINSTANCE.getMobaGeneratorSlot_SuperType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_GENERATOR_SLOT__NAME = eINSTANCE.getMobaGeneratorSlot_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_GENERATOR_SLOT__TYPE = eINSTANCE.getMobaGeneratorSlot_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFriendImpl <em>Friend</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaFriendImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFriend()
		 * @generated
		 */
		EClass MOBA_FRIEND = eINSTANCE.getMobaFriend();

		/**
		 * The meta object literal for the '<em><b>Value String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_FRIEND__VALUE_STRING = eINSTANCE.getMobaFriend_ValueString();

		/**
		 * The meta object literal for the '<em><b>Value Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_FRIEND__VALUE_CONST = eINSTANCE.getMobaFriend_ValueConst();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_FRIEND__VALUE = eINSTANCE.getMobaFriend_Value();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFriendsAbleImpl <em>Friends Able</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaFriendsAbleImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFriendsAble()
		 * @generated
		 */
		EClass MOBA_FRIENDS_ABLE = eINSTANCE.getMobaFriendsAble();

		/**
		 * The meta object literal for the '<em><b>Friends</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_FRIENDS_ABLE__FRIENDS = eINSTANCE.getMobaFriendsAble_Friends();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaExternalModuleImpl <em>External Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaExternalModuleImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaExternalModule()
		 * @generated
		 */
		EClass MOBA_EXTERNAL_MODULE = eINSTANCE.getMobaExternalModule();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_EXTERNAL_MODULE__SUPER_TYPE = eINSTANCE.getMobaExternalModule_SuperType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_EXTERNAL_MODULE__NAME = eINSTANCE.getMobaExternalModule_Name();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaBluetoothModuleImpl <em>Bluetooth Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaBluetoothModuleImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaBluetoothModule()
		 * @generated
		 */
		EClass MOBA_BLUETOOTH_MODULE = eINSTANCE.getMobaBluetoothModule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_BLUETOOTH_MODULE__TYPE = eINSTANCE.getMobaBluetoothModule_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaNFCModuleImpl <em>NFC Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaNFCModuleImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNFCModule()
		 * @generated
		 */
		EClass MOBA_NFC_MODULE = eINSTANCE.getMobaNFCModule();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_NFC_MODULE__TYPE = eINSTANCE.getMobaNFCModule_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPushModuleImpl <em>Push Module</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPushModuleImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPushModule()
		 * @generated
		 */
		EClass MOBA_PUSH_MODULE = eINSTANCE.getMobaPushModule();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaRESTMethods <em>REST Methods</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaRESTMethods
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRESTMethods()
		 * @generated
		 */
		EEnum MOBA_REST_METHODS = eINSTANCE.getMobaRESTMethods();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaLowerBound <em>Lower Bound</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaLowerBound
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaLowerBound()
		 * @generated
		 */
		EEnum MOBA_LOWER_BOUND = eINSTANCE.getMobaLowerBound();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaUpperBound <em>Upper Bound</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaUpperBound
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaUpperBound()
		 * @generated
		 */
		EEnum MOBA_UPPER_BOUND = eINSTANCE.getMobaUpperBound();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaGeofenceEvent <em>Geofence Event</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaGeofenceEvent
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeofenceEvent()
		 * @generated
		 */
		EEnum MOBA_GEOFENCE_EVENT = eINSTANCE.getMobaGeofenceEvent();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaNFCModuleType <em>NFC Module Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaNFCModuleType
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNFCModuleType()
		 * @generated
		 */
		EEnum MOBA_NFC_MODULE_TYPE = eINSTANCE.getMobaNFCModuleType();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaBlueToothModuleType <em>Blue Tooth Module Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaBlueToothModuleType
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaBlueToothModuleType()
		 * @generated
		 */
		EEnum MOBA_BLUE_TOOTH_MODULE_TYPE = eINSTANCE.getMobaBlueToothModuleType();

	}

} //MobaPackage
