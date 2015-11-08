/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoFeature;
import org.mobadsl.semantic.model.moba.MobaDtoIndex;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaFactory;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaLowerBound;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaMultiplicityProvider;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPayload;
import org.mobadsl.semantic.model.moba.MobaPayloadAttribute;
import org.mobadsl.semantic.model.moba.MobaPayloadFeature;
import org.mobadsl.semantic.model.moba.MobaPayloadReference;
import org.mobadsl.semantic.model.moba.MobaPropertiesProvider;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueFeature;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.MobaRestCrud;
import org.mobadsl.semantic.model.moba.MobaRestCustom;
import org.mobadsl.semantic.model.moba.MobaService;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaUpperBound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaPackageImpl extends EPackageImpl implements MobaPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaApplicationFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaTemplateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaGeneratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaConstantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaPropertiesProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaCacheEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaDtoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaDtoIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaPayloadEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaRestCustomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaRestCrudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaDtoFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaDtoAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaMultiplicityProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaDtoReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaPayloadFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaPayloadAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaPayloadReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaQueueFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaQueueReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaMuliplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mobaLowerBoundEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mobaUpperBoundEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MobaPackageImpl() {
		super(eNS_URI, MobaFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MobaPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MobaPackage init() {
		if (isInited) return (MobaPackage)EPackage.Registry.INSTANCE.getEPackage(MobaPackage.eNS_URI);

		// Obtain or create and register package
		MobaPackageImpl theMobaPackage = (MobaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MobaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MobaPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theMobaPackage.createPackageContents();

		// Initialize created meta-data
		theMobaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMobaPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MobaPackage.eNS_URI, theMobaPackage);
		return theMobaPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaApplication() {
		return mobaApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaApplication_Name() {
		return (EAttribute)mobaApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaApplication_Features() {
		return (EReference)mobaApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaApplicationFeature() {
		return mobaApplicationFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaTemplate() {
		return mobaTemplateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaTemplate_Template() {
		return (EReference)mobaTemplateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaGenerator() {
		return mobaGeneratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaGenerator_GeneratorString() {
		return (EAttribute)mobaGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaGenerator_GeneratorConst() {
		return (EReference)mobaGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaDataType() {
		return mobaDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Name() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Primitive() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Array() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Date() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_DateFormatString() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDataType_DateFormatConstant() {
		return (EReference)mobaDataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaConstant() {
		return mobaConstantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaConstant_Name() {
		return (EAttribute)mobaConstantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaConstant_Value() {
		return (EAttribute)mobaConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaPropertiesProvider() {
		return mobaPropertiesProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaPropertiesProvider_Properties() {
		return (EReference)mobaPropertiesProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaProperty() {
		return mobaPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaProperty_KeyString() {
		return (EAttribute)mobaPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaProperty_KeyConst() {
		return (EReference)mobaPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaProperty_ValueString() {
		return (EAttribute)mobaPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaProperty_ValueConst() {
		return (EReference)mobaPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaData() {
		return mobaDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaSettings() {
		return mobaSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaSettings_SuperType() {
		return (EReference)mobaSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaCache() {
		return mobaCacheEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaCache_CacheTypeString() {
		return (EAttribute)mobaCacheEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaCache_CacheTypeConst() {
		return (EReference)mobaCacheEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaCache_CacheStrategyString() {
		return (EAttribute)mobaCacheEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaCache_CacheStrategyConst() {
		return (EReference)mobaCacheEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaDto() {
		return mobaDtoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDto_Name() {
		return (EAttribute)mobaDtoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDto_SuperType() {
		return (EReference)mobaDtoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDto_Cache() {
		return (EReference)mobaDtoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDto_Features() {
		return (EReference)mobaDtoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDto_Index() {
		return (EReference)mobaDtoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaDtoIndex() {
		return mobaDtoIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDtoIndex_Attributes() {
		return (EReference)mobaDtoIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaPayload() {
		return mobaPayloadEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayload_Name() {
		return (EAttribute)mobaPayloadEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaPayload_SuperType() {
		return (EReference)mobaPayloadEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaPayload_Features() {
		return (EReference)mobaPayloadEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaQueue() {
		return mobaQueueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaQueue_Name() {
		return (EAttribute)mobaQueueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaQueue_SuperType() {
		return (EReference)mobaQueueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaQueue_Features() {
		return (EReference)mobaQueueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaService() {
		return mobaServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaRestCustom() {
		return mobaRestCustomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRestCustom_Name() {
		return (EAttribute)mobaRestCustomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaRestCrud() {
		return mobaRestCrudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRestCrud_Name() {
		return (EAttribute)mobaRestCrudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaDtoFeature() {
		return mobaDtoFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaDtoAttribute() {
		return mobaDtoAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDtoAttribute_Lazy() {
		return (EAttribute)mobaDtoAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDtoAttribute_Transient() {
		return (EAttribute)mobaDtoAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDtoAttribute_DomainKey() {
		return (EAttribute)mobaDtoAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDtoAttribute_DomainDescription() {
		return (EAttribute)mobaDtoAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDtoAttribute_Type() {
		return (EReference)mobaDtoAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDtoAttribute_Name() {
		return (EAttribute)mobaDtoAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaMultiplicityProvider() {
		return mobaMultiplicityProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaMultiplicityProvider_Multiplicity() {
		return (EReference)mobaMultiplicityProviderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaDtoReference() {
		return mobaDtoReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDtoReference_Cascading() {
		return (EAttribute)mobaDtoReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDtoReference_Lazy() {
		return (EAttribute)mobaDtoReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDtoReference_Transient() {
		return (EAttribute)mobaDtoReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDtoReference_Type() {
		return (EReference)mobaDtoReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDtoReference_Name() {
		return (EAttribute)mobaDtoReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaPayloadFeature() {
		return mobaPayloadFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaPayloadAttribute() {
		return mobaPayloadAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadAttribute_Lazy() {
		return (EAttribute)mobaPayloadAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadAttribute_Transient() {
		return (EAttribute)mobaPayloadAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadAttribute_DomainKey() {
		return (EAttribute)mobaPayloadAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadAttribute_DomainDescription() {
		return (EAttribute)mobaPayloadAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadAttribute_Alias() {
		return (EAttribute)mobaPayloadAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaPayloadAttribute_Type() {
		return (EReference)mobaPayloadAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadAttribute_Name() {
		return (EAttribute)mobaPayloadAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaPayloadReference() {
		return mobaPayloadReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadReference_Cascading() {
		return (EAttribute)mobaPayloadReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadReference_Lazy() {
		return (EAttribute)mobaPayloadReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadReference_Transient() {
		return (EAttribute)mobaPayloadReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaPayloadReference_Type() {
		return (EReference)mobaPayloadReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaPayloadReference_Name() {
		return (EAttribute)mobaPayloadReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaQueueFeature() {
		return mobaQueueFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaQueueReference() {
		return mobaQueueReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaQueueReference_Cascading() {
		return (EAttribute)mobaQueueReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaQueueReference_Lazy() {
		return (EAttribute)mobaQueueReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaQueueReference_Transient() {
		return (EAttribute)mobaQueueReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaQueueReference_Type() {
		return (EReference)mobaQueueReferenceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaQueueReference_Name() {
		return (EAttribute)mobaQueueReferenceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaMuliplicity() {
		return mobaMuliplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaMuliplicity_Lower() {
		return (EAttribute)mobaMuliplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaMuliplicity_Upper() {
		return (EAttribute)mobaMuliplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMobaLowerBound() {
		return mobaLowerBoundEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMobaUpperBound() {
		return mobaUpperBoundEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaFactory getMobaFactory() {
		return (MobaFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mobaApplicationEClass = createEClass(MOBA_APPLICATION);
		createEAttribute(mobaApplicationEClass, MOBA_APPLICATION__NAME);
		createEReference(mobaApplicationEClass, MOBA_APPLICATION__FEATURES);

		mobaApplicationFeatureEClass = createEClass(MOBA_APPLICATION_FEATURE);

		mobaTemplateEClass = createEClass(MOBA_TEMPLATE);
		createEReference(mobaTemplateEClass, MOBA_TEMPLATE__TEMPLATE);

		mobaGeneratorEClass = createEClass(MOBA_GENERATOR);
		createEAttribute(mobaGeneratorEClass, MOBA_GENERATOR__GENERATOR_STRING);
		createEReference(mobaGeneratorEClass, MOBA_GENERATOR__GENERATOR_CONST);

		mobaDataTypeEClass = createEClass(MOBA_DATA_TYPE);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__NAME);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__PRIMITIVE);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__ARRAY);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__DATE);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__DATE_FORMAT_STRING);
		createEReference(mobaDataTypeEClass, MOBA_DATA_TYPE__DATE_FORMAT_CONSTANT);

		mobaConstantEClass = createEClass(MOBA_CONSTANT);
		createEAttribute(mobaConstantEClass, MOBA_CONSTANT__NAME);
		createEAttribute(mobaConstantEClass, MOBA_CONSTANT__VALUE);

		mobaPropertiesProviderEClass = createEClass(MOBA_PROPERTIES_PROVIDER);
		createEReference(mobaPropertiesProviderEClass, MOBA_PROPERTIES_PROVIDER__PROPERTIES);

		mobaPropertyEClass = createEClass(MOBA_PROPERTY);
		createEAttribute(mobaPropertyEClass, MOBA_PROPERTY__KEY_STRING);
		createEReference(mobaPropertyEClass, MOBA_PROPERTY__KEY_CONST);
		createEAttribute(mobaPropertyEClass, MOBA_PROPERTY__VALUE_STRING);
		createEReference(mobaPropertyEClass, MOBA_PROPERTY__VALUE_CONST);

		mobaDataEClass = createEClass(MOBA_DATA);

		mobaSettingsEClass = createEClass(MOBA_SETTINGS);
		createEReference(mobaSettingsEClass, MOBA_SETTINGS__SUPER_TYPE);

		mobaCacheEClass = createEClass(MOBA_CACHE);
		createEAttribute(mobaCacheEClass, MOBA_CACHE__CACHE_TYPE_STRING);
		createEReference(mobaCacheEClass, MOBA_CACHE__CACHE_TYPE_CONST);
		createEAttribute(mobaCacheEClass, MOBA_CACHE__CACHE_STRATEGY_STRING);
		createEReference(mobaCacheEClass, MOBA_CACHE__CACHE_STRATEGY_CONST);

		mobaDtoEClass = createEClass(MOBA_DTO);
		createEAttribute(mobaDtoEClass, MOBA_DTO__NAME);
		createEReference(mobaDtoEClass, MOBA_DTO__SUPER_TYPE);
		createEReference(mobaDtoEClass, MOBA_DTO__CACHE);
		createEReference(mobaDtoEClass, MOBA_DTO__FEATURES);
		createEReference(mobaDtoEClass, MOBA_DTO__INDEX);

		mobaDtoIndexEClass = createEClass(MOBA_DTO_INDEX);
		createEReference(mobaDtoIndexEClass, MOBA_DTO_INDEX__ATTRIBUTES);

		mobaPayloadEClass = createEClass(MOBA_PAYLOAD);
		createEAttribute(mobaPayloadEClass, MOBA_PAYLOAD__NAME);
		createEReference(mobaPayloadEClass, MOBA_PAYLOAD__SUPER_TYPE);
		createEReference(mobaPayloadEClass, MOBA_PAYLOAD__FEATURES);

		mobaQueueEClass = createEClass(MOBA_QUEUE);
		createEAttribute(mobaQueueEClass, MOBA_QUEUE__NAME);
		createEReference(mobaQueueEClass, MOBA_QUEUE__SUPER_TYPE);
		createEReference(mobaQueueEClass, MOBA_QUEUE__FEATURES);

		mobaServiceEClass = createEClass(MOBA_SERVICE);

		mobaRestCustomEClass = createEClass(MOBA_REST_CUSTOM);
		createEAttribute(mobaRestCustomEClass, MOBA_REST_CUSTOM__NAME);

		mobaRestCrudEClass = createEClass(MOBA_REST_CRUD);
		createEAttribute(mobaRestCrudEClass, MOBA_REST_CRUD__NAME);

		mobaDtoFeatureEClass = createEClass(MOBA_DTO_FEATURE);

		mobaDtoAttributeEClass = createEClass(MOBA_DTO_ATTRIBUTE);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__LAZY);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__TRANSIENT);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__DOMAIN_KEY);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__DOMAIN_DESCRIPTION);
		createEReference(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__TYPE);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__NAME);

		mobaMultiplicityProviderEClass = createEClass(MOBA_MULTIPLICITY_PROVIDER);
		createEReference(mobaMultiplicityProviderEClass, MOBA_MULTIPLICITY_PROVIDER__MULTIPLICITY);

		mobaDtoReferenceEClass = createEClass(MOBA_DTO_REFERENCE);
		createEAttribute(mobaDtoReferenceEClass, MOBA_DTO_REFERENCE__CASCADING);
		createEAttribute(mobaDtoReferenceEClass, MOBA_DTO_REFERENCE__LAZY);
		createEAttribute(mobaDtoReferenceEClass, MOBA_DTO_REFERENCE__TRANSIENT);
		createEReference(mobaDtoReferenceEClass, MOBA_DTO_REFERENCE__TYPE);
		createEAttribute(mobaDtoReferenceEClass, MOBA_DTO_REFERENCE__NAME);

		mobaPayloadFeatureEClass = createEClass(MOBA_PAYLOAD_FEATURE);

		mobaPayloadAttributeEClass = createEClass(MOBA_PAYLOAD_ATTRIBUTE);
		createEAttribute(mobaPayloadAttributeEClass, MOBA_PAYLOAD_ATTRIBUTE__LAZY);
		createEAttribute(mobaPayloadAttributeEClass, MOBA_PAYLOAD_ATTRIBUTE__TRANSIENT);
		createEAttribute(mobaPayloadAttributeEClass, MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_KEY);
		createEAttribute(mobaPayloadAttributeEClass, MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_DESCRIPTION);
		createEAttribute(mobaPayloadAttributeEClass, MOBA_PAYLOAD_ATTRIBUTE__ALIAS);
		createEReference(mobaPayloadAttributeEClass, MOBA_PAYLOAD_ATTRIBUTE__TYPE);
		createEAttribute(mobaPayloadAttributeEClass, MOBA_PAYLOAD_ATTRIBUTE__NAME);

		mobaPayloadReferenceEClass = createEClass(MOBA_PAYLOAD_REFERENCE);
		createEAttribute(mobaPayloadReferenceEClass, MOBA_PAYLOAD_REFERENCE__CASCADING);
		createEAttribute(mobaPayloadReferenceEClass, MOBA_PAYLOAD_REFERENCE__LAZY);
		createEAttribute(mobaPayloadReferenceEClass, MOBA_PAYLOAD_REFERENCE__TRANSIENT);
		createEReference(mobaPayloadReferenceEClass, MOBA_PAYLOAD_REFERENCE__TYPE);
		createEAttribute(mobaPayloadReferenceEClass, MOBA_PAYLOAD_REFERENCE__NAME);

		mobaQueueFeatureEClass = createEClass(MOBA_QUEUE_FEATURE);

		mobaQueueReferenceEClass = createEClass(MOBA_QUEUE_REFERENCE);
		createEAttribute(mobaQueueReferenceEClass, MOBA_QUEUE_REFERENCE__CASCADING);
		createEAttribute(mobaQueueReferenceEClass, MOBA_QUEUE_REFERENCE__LAZY);
		createEAttribute(mobaQueueReferenceEClass, MOBA_QUEUE_REFERENCE__TRANSIENT);
		createEReference(mobaQueueReferenceEClass, MOBA_QUEUE_REFERENCE__TYPE);
		createEAttribute(mobaQueueReferenceEClass, MOBA_QUEUE_REFERENCE__NAME);

		mobaMuliplicityEClass = createEClass(MOBA_MULIPLICITY);
		createEAttribute(mobaMuliplicityEClass, MOBA_MULIPLICITY__LOWER);
		createEAttribute(mobaMuliplicityEClass, MOBA_MULIPLICITY__UPPER);

		// Create enums
		mobaLowerBoundEEnum = createEEnum(MOBA_LOWER_BOUND);
		mobaUpperBoundEEnum = createEEnum(MOBA_UPPER_BOUND);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mobaApplicationEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaTemplateEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaGeneratorEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaDataTypeEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaDataTypeEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaConstantEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaConstantEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaDataEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaSettingsEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaSettingsEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaDtoEClass.getESuperTypes().add(this.getMobaData());
		mobaDtoEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaPayloadEClass.getESuperTypes().add(this.getMobaData());
		mobaPayloadEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaQueueEClass.getESuperTypes().add(this.getMobaData());
		mobaQueueEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaServiceEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaRestCustomEClass.getESuperTypes().add(this.getMobaService());
		mobaRestCustomEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaRestCrudEClass.getESuperTypes().add(this.getMobaService());
		mobaRestCrudEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaDtoAttributeEClass.getESuperTypes().add(this.getMobaDtoFeature());
		mobaDtoAttributeEClass.getESuperTypes().add(this.getMobaMultiplicityProvider());
		mobaDtoAttributeEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaDtoReferenceEClass.getESuperTypes().add(this.getMobaDtoFeature());
		mobaDtoReferenceEClass.getESuperTypes().add(this.getMobaMultiplicityProvider());
		mobaDtoReferenceEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaPayloadAttributeEClass.getESuperTypes().add(this.getMobaPayloadFeature());
		mobaPayloadAttributeEClass.getESuperTypes().add(this.getMobaMultiplicityProvider());
		mobaPayloadAttributeEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaPayloadReferenceEClass.getESuperTypes().add(this.getMobaPayloadFeature());
		mobaPayloadReferenceEClass.getESuperTypes().add(this.getMobaMultiplicityProvider());
		mobaPayloadReferenceEClass.getESuperTypes().add(this.getMobaPropertiesProvider());
		mobaQueueReferenceEClass.getESuperTypes().add(this.getMobaQueueFeature());
		mobaQueueReferenceEClass.getESuperTypes().add(this.getMobaMultiplicityProvider());
		mobaQueueReferenceEClass.getESuperTypes().add(this.getMobaPropertiesProvider());

		// Initialize classes and features; add operations and parameters
		initEClass(mobaApplicationEClass, MobaApplication.class, "MobaApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaApplication_Features(), this.getMobaApplicationFeature(), null, "features", null, 0, -1, MobaApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaApplicationFeatureEClass, MobaApplicationFeature.class, "MobaApplicationFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaTemplateEClass, MobaTemplate.class, "MobaTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaTemplate_Template(), this.getMobaApplication(), null, "template", null, 0, 1, MobaTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaGeneratorEClass, MobaGenerator.class, "MobaGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaGenerator_GeneratorString(), ecorePackage.getEString(), "generatorString", null, 0, 1, MobaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaGenerator_GeneratorConst(), this.getMobaConstant(), null, "generatorConst", null, 0, 1, MobaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDataTypeEClass, MobaDataType.class, "MobaDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Primitive(), ecorePackage.getEBoolean(), "primitive", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Array(), ecorePackage.getEBoolean(), "array", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Date(), ecorePackage.getEBoolean(), "date", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_DateFormatString(), ecorePackage.getEString(), "dateFormatString", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDataType_DateFormatConstant(), this.getMobaConstant(), null, "dateFormatConstant", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaConstantEClass, MobaConstant.class, "MobaConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaConstant_Value(), ecorePackage.getEString(), "value", null, 0, 1, MobaConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaPropertiesProviderEClass, MobaPropertiesProvider.class, "MobaPropertiesProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaPropertiesProvider_Properties(), this.getMobaProperty(), null, "properties", null, 0, -1, MobaPropertiesProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaPropertyEClass, MobaProperty.class, "MobaProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaProperty_KeyString(), ecorePackage.getEString(), "keyString", null, 0, 1, MobaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaProperty_KeyConst(), this.getMobaConstant(), null, "keyConst", null, 0, 1, MobaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaProperty_ValueString(), ecorePackage.getEString(), "valueString", null, 0, 1, MobaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaProperty_ValueConst(), this.getMobaConstant(), null, "valueConst", null, 0, 1, MobaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDataEClass, MobaData.class, "MobaData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaSettingsEClass, MobaSettings.class, "MobaSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaSettings_SuperType(), this.getMobaSettings(), null, "superType", null, 0, 1, MobaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaCacheEClass, MobaCache.class, "MobaCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaCache_CacheTypeString(), ecorePackage.getEString(), "cacheTypeString", null, 0, 1, MobaCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaCache_CacheTypeConst(), this.getMobaConstant(), null, "cacheTypeConst", null, 0, 1, MobaCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaCache_CacheStrategyString(), ecorePackage.getEString(), "cacheStrategyString", null, 0, 1, MobaCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaCache_CacheStrategyConst(), this.getMobaConstant(), null, "cacheStrategyConst", null, 0, 1, MobaCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDtoEClass, MobaDto.class, "MobaDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaDto_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDto_SuperType(), this.getMobaDto(), null, "superType", null, 0, 1, MobaDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDto_Cache(), this.getMobaCache(), null, "cache", null, 0, 1, MobaDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDto_Features(), this.getMobaDtoFeature(), null, "features", null, 0, -1, MobaDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDto_Index(), this.getMobaDtoIndex(), null, "index", null, 0, 1, MobaDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDtoIndexEClass, MobaDtoIndex.class, "MobaDtoIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaDtoIndex_Attributes(), this.getMobaDtoAttribute(), null, "attributes", null, 0, -1, MobaDtoIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaPayloadEClass, MobaPayload.class, "MobaPayload", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaPayload_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaPayload_SuperType(), this.getMobaPayload(), null, "superType", null, 0, 1, MobaPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaPayload_Features(), this.getMobaPayloadFeature(), null, "features", null, 0, -1, MobaPayload.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaQueueEClass, MobaQueue.class, "MobaQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaQueue_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaQueue_SuperType(), this.getMobaQueue(), null, "superType", null, 0, 1, MobaQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaQueue_Features(), this.getMobaQueueFeature(), null, "features", null, 0, -1, MobaQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaServiceEClass, MobaService.class, "MobaService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaRestCustomEClass, MobaRestCustom.class, "MobaRestCustom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaRestCustom_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaRestCustom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaRestCrudEClass, MobaRestCrud.class, "MobaRestCrud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaRestCrud_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaRestCrud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDtoFeatureEClass, MobaDtoFeature.class, "MobaDtoFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaDtoAttributeEClass, MobaDtoAttribute.class, "MobaDtoAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaDtoAttribute_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoAttribute_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoAttribute_DomainKey(), ecorePackage.getEBoolean(), "domainKey", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoAttribute_DomainDescription(), ecorePackage.getEBoolean(), "domainDescription", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDtoAttribute_Type(), this.getMobaDataType(), null, "type", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaMultiplicityProviderEClass, MobaMultiplicityProvider.class, "MobaMultiplicityProvider", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaMultiplicityProvider_Multiplicity(), this.getMobaMuliplicity(), null, "multiplicity", null, 0, 1, MobaMultiplicityProvider.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDtoReferenceEClass, MobaDtoReference.class, "MobaDtoReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaDtoReference_Cascading(), ecorePackage.getEBoolean(), "cascading", null, 0, 1, MobaDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoReference_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoReference_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDtoReference_Type(), this.getMobaDto(), null, "type", null, 0, 1, MobaDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaPayloadFeatureEClass, MobaPayloadFeature.class, "MobaPayloadFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaPayloadAttributeEClass, MobaPayloadAttribute.class, "MobaPayloadAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaPayloadAttribute_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaPayloadAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaPayloadAttribute_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaPayloadAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaPayloadAttribute_DomainKey(), ecorePackage.getEBoolean(), "domainKey", null, 0, 1, MobaPayloadAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaPayloadAttribute_DomainDescription(), ecorePackage.getEBoolean(), "domainDescription", null, 0, 1, MobaPayloadAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaPayloadAttribute_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, MobaPayloadAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaPayloadAttribute_Type(), this.getMobaDataType(), null, "type", null, 0, 1, MobaPayloadAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaPayloadAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaPayloadAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaPayloadReferenceEClass, MobaPayloadReference.class, "MobaPayloadReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaPayloadReference_Cascading(), ecorePackage.getEBoolean(), "cascading", null, 0, 1, MobaPayloadReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaPayloadReference_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaPayloadReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaPayloadReference_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaPayloadReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaPayloadReference_Type(), this.getMobaPayload(), null, "type", null, 0, 1, MobaPayloadReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaPayloadReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaPayloadReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaQueueFeatureEClass, MobaQueueFeature.class, "MobaQueueFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaQueueReferenceEClass, MobaQueueReference.class, "MobaQueueReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaQueueReference_Cascading(), ecorePackage.getEBoolean(), "cascading", null, 0, 1, MobaQueueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaQueueReference_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaQueueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaQueueReference_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaQueueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaQueueReference_Type(), this.getMobaData(), null, "type", null, 0, 1, MobaQueueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaQueueReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaQueueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaMuliplicityEClass, MobaMuliplicity.class, "MobaMuliplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaMuliplicity_Lower(), this.getMobaLowerBound(), "lower", null, 0, 1, MobaMuliplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaMuliplicity_Upper(), this.getMobaUpperBound(), "upper", null, 0, 1, MobaMuliplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mobaLowerBoundEEnum, MobaLowerBound.class, "MobaLowerBound");
		addEEnumLiteral(mobaLowerBoundEEnum, MobaLowerBound.OPTIONAL);
		addEEnumLiteral(mobaLowerBoundEEnum, MobaLowerBound.MANY);
		addEEnumLiteral(mobaLowerBoundEEnum, MobaLowerBound.ZERO);
		addEEnumLiteral(mobaLowerBoundEEnum, MobaLowerBound.ATLEASTONE);
		addEEnumLiteral(mobaLowerBoundEEnum, MobaLowerBound.ONE);

		initEEnum(mobaUpperBoundEEnum, MobaUpperBound.class, "MobaUpperBound");
		addEEnumLiteral(mobaUpperBoundEEnum, MobaUpperBound.NULL);
		addEEnumLiteral(mobaUpperBoundEEnum, MobaUpperBound.ONE);
		addEEnumLiteral(mobaUpperBoundEEnum, MobaUpperBound.MANY);

		// Create resource
		createResource(eNS_URI);
	}

} //MobaPackageImpl
