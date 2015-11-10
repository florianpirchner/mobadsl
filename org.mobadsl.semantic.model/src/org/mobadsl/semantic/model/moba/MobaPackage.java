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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaPropertiesAble <em>Properties Able</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaPropertiesAble
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPropertiesAble()
	 * @generated
	 */
	int MOBA_PROPERTIES_ABLE = 10;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaApplication()
	 * @generated
	 */
	int MOBA_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION__PROPERTIES = MOBA_PROPERTIES_ABLE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION__NAME = MOBA_PROPERTIES_ABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION__FEATURES = MOBA_PROPERTIES_ABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION_FEATURE_COUNT = MOBA_PROPERTIES_ABLE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationFeatureImpl <em>Application Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaApplicationFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaApplicationFeature()
	 * @generated
	 */
	int MOBA_APPLICATION_FEATURE = 1;

	/**
	 * The number of structural features of the '<em>Application Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_APPLICATION_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaTemplateImpl <em>Template</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaTemplateImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaTemplate()
	 * @generated
	 */
	int MOBA_TEMPLATE = 2;

	/**
	 * The feature id for the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TEMPLATE__TEMPLATE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Template</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_TEMPLATE_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGenerator()
	 * @generated
	 */
	int MOBA_GENERATOR = 3;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaGeneratorFeature <em>Generator Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorFeature
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorFeature()
	 * @generated
	 */
	int MOBA_GENERATOR_FEATURE = 4;

	/**
	 * The number of structural features of the '<em>Generator Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_FEATURE_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorMixinFeatureImpl <em>Generator Mixin Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorMixinFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorMixinFeature()
	 * @generated
	 */
	int MOBA_GENERATOR_MIXIN_FEATURE = 5;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl <em>Generator ID Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaGeneratorIDFeature()
	 * @generated
	 */
	int MOBA_GENERATOR_ID_FEATURE = 6;

	/**
	 * The feature id for the '<em><b>Generator Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_ID_FEATURE__GENERATOR_CONST = MOBA_GENERATOR_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Generator String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_ID_FEATURE__GENERATOR_STRING = MOBA_GENERATOR_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Generator ID Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_GENERATOR_ID_FEATURE_FEATURE_COUNT = MOBA_GENERATOR_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl <em>Data Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDataTypeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDataType()
	 * @generated
	 */
	int MOBA_DATA_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__PROPERTIES = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__CONSTRAINTS = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__PRIMITIVE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__ARRAY = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__DATE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__TIME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__TIMESTAMP = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Date Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__DATE_FORMAT_STRING = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Date Format Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__DATE_FORMAT_CONST = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__SUPER_TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Enum AST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE__ENUM_AST = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Data Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_TYPE_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaConstantImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstant()
	 * @generated
	 */
	int MOBA_CONSTANT = 8;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT__PROPERTIES = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value AST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT__VALUE_AST = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl <em>Constant Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaConstantValueImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstantValue()
	 * @generated
	 */
	int MOBA_CONSTANT_VALUE = 9;

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
	 * The number of structural features of the '<em>Constant Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTANT_VALUE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPropertyImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaProperty()
	 * @generated
	 */
	int MOBA_PROPERTY = 11;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDataImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaData()
	 * @generated
	 */
	int MOBA_DATA = 12;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DATA_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl <em>Settings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaSettingsImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSettings()
	 * @generated
	 */
	int MOBA_SETTINGS = 13;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__PROPERTIES = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__SUPER_TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__FEATURES = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS__ACTIVE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Settings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaCacheImpl <em>Cache</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaCacheImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaCache()
	 * @generated
	 */
	int MOBA_CACHE = 14;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoImpl <em>Dto</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDto()
	 * @generated
	 */
	int MOBA_DTO = 15;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__PROPERTIES = MOBA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__NAME = MOBA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__SUPER_TYPE = MOBA_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__CACHE = MOBA_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__FEATURES = MOBA_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO__INDEX = MOBA_DATA_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dto</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_FEATURE_COUNT = MOBA_DATA_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoIndexImpl <em>Dto Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoIndexImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoIndex()
	 * @generated
	 */
	int MOBA_DTO_INDEX = 16;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_INDEX__ATTRIBUTES = 0;

	/**
	 * The number of structural features of the '<em>Dto Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_INDEX_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadImpl <em>Payload</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPayloadImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPayload()
	 * @generated
	 */
	int MOBA_PAYLOAD = 17;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD__PROPERTIES = MOBA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD__NAME = MOBA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD__SUPER_TYPE = MOBA_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD__FEATURES = MOBA_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Payload</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_FEATURE_COUNT = MOBA_DATA_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaQueueImpl <em>Queue</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaQueueImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaQueue()
	 * @generated
	 */
	int MOBA_QUEUE = 18;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE__PROPERTIES = MOBA_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE__NAME = MOBA_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE__SUPER_TYPE = MOBA_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE__FEATURES = MOBA_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Queue</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_FEATURE_COUNT = MOBA_DATA_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaServiceImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaService()
	 * @generated
	 */
	int MOBA_SERVICE = 19;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SERVICE_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRestCustomImpl <em>Rest Custom</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRestCustomImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRestCustom()
	 * @generated
	 */
	int MOBA_REST_CUSTOM = 20;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM__PROPERTIES = MOBA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM__NAME = MOBA_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rest Custom</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CUSTOM_FEATURE_COUNT = MOBA_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRestCrudImpl <em>Rest Crud</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRestCrudImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRestCrud()
	 * @generated
	 */
	int MOBA_REST_CRUD = 21;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__PROPERTIES = MOBA_SERVICE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD__NAME = MOBA_SERVICE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rest Crud</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_REST_CRUD_FEATURE_COUNT = MOBA_SERVICE_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFeatureImpl <em>Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFeature()
	 * @generated
	 */
	int MOBA_FEATURE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FEATURE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FEATURE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoFeatureImpl <em>Dto Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoFeature()
	 * @generated
	 */
	int MOBA_DTO_FEATURE = 23;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoAttributeImpl <em>Dto Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoAttributeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoAttribute()
	 * @generated
	 */
	int MOBA_DTO_ATTRIBUTE = 24;

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
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__PROPERTIES = MOBA_DTO_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__CONSTRAINTS = MOBA_DTO_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__LAZY = MOBA_DTO_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__TRANSIENT = MOBA_DTO_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__DOMAIN_KEY = MOBA_DTO_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_ATTRIBUTE__DOMAIN_DESCRIPTION = MOBA_DTO_FEATURE_FEATURE_COUNT + 6;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaMultiplicityAble <em>Multiplicity Able</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaMultiplicityAble
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMultiplicityAble()
	 * @generated
	 */
	int MOBA_MULTIPLICITY_ABLE = 25;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoReferenceImpl <em>Dto Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoReferenceImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoReference()
	 * @generated
	 */
	int MOBA_DTO_REFERENCE = 26;

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
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__PROPERTIES = MOBA_DTO_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__CASCADING = MOBA_DTO_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__LAZY = MOBA_DTO_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__TRANSIENT = MOBA_DTO_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE__TYPE = MOBA_DTO_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Dto Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_DTO_REFERENCE_FEATURE_COUNT = MOBA_DTO_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadFeatureImpl <em>Payload Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPayloadFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPayloadFeature()
	 * @generated
	 */
	int MOBA_PAYLOAD_FEATURE = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_FEATURE__NAME = MOBA_FEATURE__NAME;

	/**
	 * The number of structural features of the '<em>Payload Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_FEATURE_FEATURE_COUNT = MOBA_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl <em>Payload Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPayloadAttribute()
	 * @generated
	 */
	int MOBA_PAYLOAD_ATTRIBUTE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__NAME = MOBA_PAYLOAD_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__PROPERTIES = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__CONSTRAINTS = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__LAZY = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__TRANSIENT = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_KEY = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_DESCRIPTION = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__ALIAS = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE__TYPE = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The number of structural features of the '<em>Payload Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_ATTRIBUTE_FEATURE_COUNT = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 9;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl <em>Payload Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPayloadReference()
	 * @generated
	 */
	int MOBA_PAYLOAD_REFERENCE = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_REFERENCE__NAME = MOBA_PAYLOAD_FEATURE__NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_REFERENCE__MULTIPLICITY = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_REFERENCE__PROPERTIES = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_REFERENCE__CASCADING = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_REFERENCE__LAZY = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_REFERENCE__TRANSIENT = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_REFERENCE__TYPE = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Payload Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAYLOAD_REFERENCE_FEATURE_COUNT = MOBA_PAYLOAD_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaQueueFeatureImpl <em>Queue Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaQueueFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaQueueFeature()
	 * @generated
	 */
	int MOBA_QUEUE_FEATURE = 30;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaQueueReferenceImpl <em>Queue Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaQueueReferenceImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaQueueReference()
	 * @generated
	 */
	int MOBA_QUEUE_REFERENCE = 31;

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
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__PROPERTIES = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__CASCADING = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__LAZY = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__TRANSIENT = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE__TYPE = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Queue Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_QUEUE_REFERENCE_FEATURE_COUNT = MOBA_QUEUE_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMuliplicityImpl <em>Muliplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMuliplicityImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMuliplicity()
	 * @generated
	 */
	int MOBA_MULIPLICITY = 32;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsFeatureImpl <em>Settings Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaSettingsFeatureImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSettingsFeature()
	 * @generated
	 */
	int MOBA_SETTINGS_FEATURE = 33;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaSettingsAttributeImpl <em>Settings Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaSettingsAttributeImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaSettingsAttribute()
	 * @generated
	 */
	int MOBA_SETTINGS_ATTRIBUTE = 34;

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
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__PROPERTIES = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__CONSTRAINTS = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__LAZY = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__TRANSIENT = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Domain Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__DOMAIN_KEY = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__DOMAIN_DESCRIPTION = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE__TYPE = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Settings Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_SETTINGS_ATTRIBUTE_FEATURE_COUNT = MOBA_SETTINGS_FEATURE_FEATURE_COUNT + 8;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaConstraintable <em>Constraintable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaConstraintable
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstraintable()
	 * @generated
	 */
	int MOBA_CONSTRAINTABLE = 35;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaConstraint()
	 * @generated
	 */
	int MOBA_CONSTRAINT = 36;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_CONSTRAINT_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRegexpConstraintImpl <em>Regexp Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaRegexpConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRegexpConstraint()
	 * @generated
	 */
	int MOBA_REGEXP_CONSTRAINT = 37;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMinConstraintImpl <em>Min Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMinConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMinConstraint()
	 * @generated
	 */
	int MOBA_MIN_CONSTRAINT = 38;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMaxConstraintImpl <em>Max Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMaxConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMaxConstraint()
	 * @generated
	 */
	int MOBA_MAX_CONSTRAINT = 39;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaFutureConstraintImpl <em>Future Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaFutureConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaFutureConstraint()
	 * @generated
	 */
	int MOBA_FUTURE_CONSTRAINT = 40;

	/**
	 * The number of structural features of the '<em>Future Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_FUTURE_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPastConstraintImpl <em>Past Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPastConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPastConstraint()
	 * @generated
	 */
	int MOBA_PAST_CONSTRAINT = 41;

	/**
	 * The number of structural features of the '<em>Past Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_PAST_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaNotNullConstraintImpl <em>Not Null Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaNotNullConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNotNullConstraint()
	 * @generated
	 */
	int MOBA_NOT_NULL_CONSTRAINT = 42;

	/**
	 * The number of structural features of the '<em>Not Null Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NOT_NULL_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaNullConstraintImpl <em>Null Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaNullConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaNullConstraint()
	 * @generated
	 */
	int MOBA_NULL_CONSTRAINT = 43;

	/**
	 * The number of structural features of the '<em>Null Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_NULL_CONSTRAINT_FEATURE_COUNT = MOBA_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMinLengthConstraintImpl <em>Min Length Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMinLengthConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMinLengthConstraint()
	 * @generated
	 */
	int MOBA_MIN_LENGTH_CONSTRAINT = 44;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaMaxLengthConstraintImpl <em>Max Length Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaMaxLengthConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaMaxLengthConstraint()
	 * @generated
	 */
	int MOBA_MAX_LENGTH_CONSTRAINT = 45;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl <em>Digits Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDigitsConstraint()
	 * @generated
	 */
	int MOBA_DIGITS_CONSTRAINT = 46;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEnumImpl <em>Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEnumImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEnum()
	 * @generated
	 */
	int MOBA_ENUM = 47;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM__PROPERTIES = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM__SUPER_TYPE = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM__NAME = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Literals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM__LITERALS = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_ENUM_FEATURE_COUNT = MOBA_APPLICATION_FEATURE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.impl.MobaEnumLiteralImpl <em>Enum Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.impl.MobaEnumLiteralImpl
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaEnumLiteral()
	 * @generated
	 */
	int MOBA_ENUM_LITERAL = 48;

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
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaLowerBound <em>Lower Bound</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaLowerBound
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaLowerBound()
	 * @generated
	 */
	int MOBA_LOWER_BOUND = 49;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.MobaUpperBound <em>Upper Bound</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.MobaUpperBound
	 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaUpperBound()
	 * @generated
	 */
	int MOBA_UPPER_BOUND = 50;


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
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorConst <em>Generator Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Generator Const</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorConst()
	 * @see #getMobaGeneratorIDFeature()
	 * @generated
	 */
	EReference getMobaGeneratorIDFeature_GeneratorConst();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorString <em>Generator String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Generator String</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorString()
	 * @see #getMobaGeneratorIDFeature()
	 * @generated
	 */
	EAttribute getMobaGeneratorIDFeature_GeneratorString();

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
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaDto#getCache <em>Cache</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cache</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDto#getCache()
	 * @see #getMobaDto()
	 * @generated
	 */
	EReference getMobaDto_Cache();

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
	 * Returns the meta object for the containment reference '{@link org.mobadsl.semantic.model.moba.MobaDto#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Index</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDto#getIndex()
	 * @see #getMobaDto()
	 * @generated
	 */
	EReference getMobaDto_Index();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaDtoIndex <em>Dto Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dto Index</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoIndex
	 * @generated
	 */
	EClass getMobaDtoIndex();

	/**
	 * Returns the meta object for the reference list '{@link org.mobadsl.semantic.model.moba.MobaDtoIndex#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaDtoIndex#getAttributes()
	 * @see #getMobaDtoIndex()
	 * @generated
	 */
	EReference getMobaDtoIndex_Attributes();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaPayload <em>Payload</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayload
	 * @generated
	 */
	EClass getMobaPayload();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaPayload#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayload#getName()
	 * @see #getMobaPayload()
	 * @generated
	 */
	EAttribute getMobaPayload_Name();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaPayload#getSuperType <em>Super Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Super Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayload#getSuperType()
	 * @see #getMobaPayload()
	 * @generated
	 */
	EReference getMobaPayload_SuperType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.MobaPayload#getFeatures <em>Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Features</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayload#getFeatures()
	 * @see #getMobaPayload()
	 * @generated
	 */
	EReference getMobaPayload_Features();

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
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaService
	 * @generated
	 */
	EClass getMobaService();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaRestCustom <em>Rest Custom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Custom</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRestCustom
	 * @generated
	 */
	EClass getMobaRestCustom();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRestCustom#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRestCustom#getName()
	 * @see #getMobaRestCustom()
	 * @generated
	 */
	EAttribute getMobaRestCustom_Name();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaRestCrud <em>Rest Crud</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rest Crud</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRestCrud
	 * @generated
	 */
	EClass getMobaRestCrud();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaRestCrud#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaRestCrud#getName()
	 * @see #getMobaRestCrud()
	 * @generated
	 */
	EAttribute getMobaRestCrud_Name();

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
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaPayloadFeature <em>Payload Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload Feature</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadFeature
	 * @generated
	 */
	EClass getMobaPayloadFeature();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaPayloadAttribute <em>Payload Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload Attribute</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadAttribute
	 * @generated
	 */
	EClass getMobaPayloadAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaPayloadAttribute#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadAttribute#isLazy()
	 * @see #getMobaPayloadAttribute()
	 * @generated
	 */
	EAttribute getMobaPayloadAttribute_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaPayloadAttribute#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadAttribute#isTransient()
	 * @see #getMobaPayloadAttribute()
	 * @generated
	 */
	EAttribute getMobaPayloadAttribute_Transient();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaPayloadAttribute#isDomainKey <em>Domain Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Key</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadAttribute#isDomainKey()
	 * @see #getMobaPayloadAttribute()
	 * @generated
	 */
	EAttribute getMobaPayloadAttribute_DomainKey();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaPayloadAttribute#isDomainDescription <em>Domain Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Domain Description</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadAttribute#isDomainDescription()
	 * @see #getMobaPayloadAttribute()
	 * @generated
	 */
	EAttribute getMobaPayloadAttribute_DomainDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaPayloadAttribute#getAlias <em>Alias</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alias</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadAttribute#getAlias()
	 * @see #getMobaPayloadAttribute()
	 * @generated
	 */
	EAttribute getMobaPayloadAttribute_Alias();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaPayloadAttribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadAttribute#getType()
	 * @see #getMobaPayloadAttribute()
	 * @generated
	 */
	EReference getMobaPayloadAttribute_Type();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.MobaPayloadReference <em>Payload Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Payload Reference</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadReference
	 * @generated
	 */
	EClass getMobaPayloadReference();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaPayloadReference#isCascading <em>Cascading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cascading</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadReference#isCascading()
	 * @see #getMobaPayloadReference()
	 * @generated
	 */
	EAttribute getMobaPayloadReference_Cascading();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaPayloadReference#isLazy <em>Lazy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lazy</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadReference#isLazy()
	 * @see #getMobaPayloadReference()
	 * @generated
	 */
	EAttribute getMobaPayloadReference_Lazy();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.MobaPayloadReference#isTransient <em>Transient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadReference#isTransient()
	 * @see #getMobaPayloadReference()
	 * @generated
	 */
	EAttribute getMobaPayloadReference_Transient();

	/**
	 * Returns the meta object for the reference '{@link org.mobadsl.semantic.model.moba.MobaPayloadReference#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see org.mobadsl.semantic.model.moba.MobaPayloadReference#getType()
	 * @see #getMobaPayloadReference()
	 * @generated
	 */
	EReference getMobaPayloadReference_Type();

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
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaApplication()
		 * @generated
		 */
		EClass MOBA_APPLICATION = eINSTANCE.getMobaApplication();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_APPLICATION__NAME = eINSTANCE.getMobaApplication_Name();

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
		 * The meta object literal for the '<em><b>Generator Const</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_GENERATOR_ID_FEATURE__GENERATOR_CONST = eINSTANCE.getMobaGeneratorIDFeature_GeneratorConst();

		/**
		 * The meta object literal for the '<em><b>Generator String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_GENERATOR_ID_FEATURE__GENERATOR_STRING = eINSTANCE.getMobaGeneratorIDFeature_GeneratorString();

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
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.MobaPropertiesAble <em>Properties Able</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.MobaPropertiesAble
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
		 * The meta object literal for the '<em><b>Cache</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO__CACHE = eINSTANCE.getMobaDto_Cache();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO__FEATURES = eINSTANCE.getMobaDto_Features();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO__INDEX = eINSTANCE.getMobaDto_Index();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaDtoIndexImpl <em>Dto Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaDtoIndexImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaDtoIndex()
		 * @generated
		 */
		EClass MOBA_DTO_INDEX = eINSTANCE.getMobaDtoIndex();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO_INDEX__ATTRIBUTES = eINSTANCE.getMobaDtoIndex_Attributes();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadImpl <em>Payload</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPayloadImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPayload()
		 * @generated
		 */
		EClass MOBA_PAYLOAD = eINSTANCE.getMobaPayload();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PAYLOAD__NAME = eINSTANCE.getMobaPayload_Name();

		/**
		 * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_PAYLOAD__SUPER_TYPE = eINSTANCE.getMobaPayload_SuperType();

		/**
		 * The meta object literal for the '<em><b>Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_PAYLOAD__FEATURES = eINSTANCE.getMobaPayload_Features();

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
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaServiceImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaService()
		 * @generated
		 */
		EClass MOBA_SERVICE = eINSTANCE.getMobaService();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRestCustomImpl <em>Rest Custom</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaRestCustomImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRestCustom()
		 * @generated
		 */
		EClass MOBA_REST_CUSTOM = eINSTANCE.getMobaRestCustom();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_CUSTOM__NAME = eINSTANCE.getMobaRestCustom_Name();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaRestCrudImpl <em>Rest Crud</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaRestCrudImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaRestCrud()
		 * @generated
		 */
		EClass MOBA_REST_CRUD = eINSTANCE.getMobaRestCrud();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_REST_CRUD__NAME = eINSTANCE.getMobaRestCrud_Name();

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
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_DTO_ATTRIBUTE__TYPE = eINSTANCE.getMobaDtoAttribute_Type();

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
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadFeatureImpl <em>Payload Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPayloadFeatureImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPayloadFeature()
		 * @generated
		 */
		EClass MOBA_PAYLOAD_FEATURE = eINSTANCE.getMobaPayloadFeature();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl <em>Payload Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPayloadAttribute()
		 * @generated
		 */
		EClass MOBA_PAYLOAD_ATTRIBUTE = eINSTANCE.getMobaPayloadAttribute();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PAYLOAD_ATTRIBUTE__LAZY = eINSTANCE.getMobaPayloadAttribute_Lazy();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PAYLOAD_ATTRIBUTE__TRANSIENT = eINSTANCE.getMobaPayloadAttribute_Transient();

		/**
		 * The meta object literal for the '<em><b>Domain Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_KEY = eINSTANCE.getMobaPayloadAttribute_DomainKey();

		/**
		 * The meta object literal for the '<em><b>Domain Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_DESCRIPTION = eINSTANCE.getMobaPayloadAttribute_DomainDescription();

		/**
		 * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PAYLOAD_ATTRIBUTE__ALIAS = eINSTANCE.getMobaPayloadAttribute_Alias();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_PAYLOAD_ATTRIBUTE__TYPE = eINSTANCE.getMobaPayloadAttribute_Type();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl <em>Payload Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl
		 * @see org.mobadsl.semantic.model.moba.impl.MobaPackageImpl#getMobaPayloadReference()
		 * @generated
		 */
		EClass MOBA_PAYLOAD_REFERENCE = eINSTANCE.getMobaPayloadReference();

		/**
		 * The meta object literal for the '<em><b>Cascading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PAYLOAD_REFERENCE__CASCADING = eINSTANCE.getMobaPayloadReference_Cascading();

		/**
		 * The meta object literal for the '<em><b>Lazy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PAYLOAD_REFERENCE__LAZY = eINSTANCE.getMobaPayloadReference_Lazy();

		/**
		 * The meta object literal for the '<em><b>Transient</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_PAYLOAD_REFERENCE__TRANSIENT = eINSTANCE.getMobaPayloadReference_Transient();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_PAYLOAD_REFERENCE__TYPE = eINSTANCE.getMobaPayloadReference_Type();

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

	}

} //MobaPackage
