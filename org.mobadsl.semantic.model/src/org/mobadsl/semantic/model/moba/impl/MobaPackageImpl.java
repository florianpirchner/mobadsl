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
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaConstraint;
import org.mobadsl.semantic.model.moba.MobaConstraintable;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDigitsConstraint;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoFeature;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityAttribute;
import org.mobadsl.semantic.model.moba.MobaEntityFeature;
import org.mobadsl.semantic.model.moba.MobaEntityIndex;
import org.mobadsl.semantic.model.moba.MobaEntityReference;
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaEnumLiteral;
import org.mobadsl.semantic.model.moba.MobaFactory;
import org.mobadsl.semantic.model.moba.MobaFeature;
import org.mobadsl.semantic.model.moba.MobaFutureConstraint;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaLowerBound;
import org.mobadsl.semantic.model.moba.MobaMaxConstraint;
import org.mobadsl.semantic.model.moba.MobaMaxLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaMinConstraint;
import org.mobadsl.semantic.model.moba.MobaMinLengthConstraint;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaMultiplicityAble;
import org.mobadsl.semantic.model.moba.MobaNotNullConstraint;
import org.mobadsl.semantic.model.moba.MobaNullConstraint;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPastConstraint;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueFeature;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaRESTOperations;
import org.mobadsl.semantic.model.moba.MobaRESTWorkflow;
import org.mobadsl.semantic.model.moba.MobaRegexpConstraint;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaSettingsAttribute;
import org.mobadsl.semantic.model.moba.MobaSettingsFeature;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaUpperBound;
import org.mobadsl.semantic.model.moba.index.MobaIndexPackage;
import org.mobadsl.semantic.model.moba.index.impl.MobaIndexPackageImpl;

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
	private EClass mobaServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaAuthorizationEClass = null;

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
	private EClass mobaGeneratorFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaGeneratorMixinFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaGeneratorIDFeatureEClass = null;

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
	private EClass mobaConstantValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaPropertiesAbleEClass = null;

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
	private EClass mobaEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaEntityIndexEClass = null;

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
	private EClass mobaQueueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaRESTEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaRESTAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaRESTCustomServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaRESTWorkflowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaRESTCrudEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaEntityFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaEntityAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaMultiplicityAbleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaEntityReferenceEClass = null;

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
	private EClass mobaDtoReferenceEClass = null;

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
	private EClass mobaSettingsFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaSettingsAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaConstraintableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaRegexpConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaMinConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaMaxConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaFutureConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaPastConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaNotNullConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaNullConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaMinLengthConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaMaxLengthConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaDigitsConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaEnumLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mobaRESTOperationsEEnum = null;

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

		// Obtain or create and register interdependencies
		MobaIndexPackageImpl theMobaIndexPackage = (MobaIndexPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MobaIndexPackage.eNS_URI) instanceof MobaIndexPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MobaIndexPackage.eNS_URI) : MobaIndexPackage.eINSTANCE);

		// Create package meta-data objects
		theMobaPackage.createPackageContents();
		theMobaIndexPackage.createPackageContents();

		// Initialize created meta-data
		theMobaPackage.initializePackageContents();
		theMobaIndexPackage.initializePackageContents();

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
	public EAttribute getMobaApplication_Id() {
		return (EAttribute)mobaApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaApplication_Name() {
		return (EAttribute)mobaApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaApplication_Version() {
		return (EAttribute)mobaApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaApplication_Features() {
		return (EReference)mobaApplicationEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMobaTemplate_DownloadTemplate() {
		return (EAttribute)mobaTemplateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaServer() {
		return mobaServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaServer_Url() {
		return (EAttribute)mobaServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaServer_Services() {
		return (EReference)mobaServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaServer_Authorization() {
		return (EReference)mobaServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaAuthorization() {
		return mobaAuthorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaAuthorization_Name() {
		return (EAttribute)mobaAuthorizationEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getMobaGenerator_Name() {
		return (EAttribute)mobaGeneratorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaGenerator_Features() {
		return (EReference)mobaGeneratorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaGenerator_Active() {
		return (EAttribute)mobaGeneratorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaGeneratorFeature() {
		return mobaGeneratorFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaGeneratorMixinFeature() {
		return mobaGeneratorMixinFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaGeneratorMixinFeature_GeneratorRef() {
		return (EReference)mobaGeneratorMixinFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaGeneratorIDFeature() {
		return mobaGeneratorIDFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaGeneratorIDFeature_GeneratorId() {
		return (EAttribute)mobaGeneratorIDFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaGeneratorIDFeature_GeneratorVersion() {
		return (EAttribute)mobaGeneratorIDFeatureEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getMobaDataType_String() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Numeric() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Decimal() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Array() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Date() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_DateFormatString() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDataType_DateFormatConst() {
		return (EReference)mobaDataTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDataType_SuperType() {
		return (EReference)mobaDataTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDataType_EnumAST() {
		return (EReference)mobaDataTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Time() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDataType_Timestamp() {
		return (EAttribute)mobaDataTypeEClass.getEStructuralFeatures().get(7);
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
	public EReference getMobaConstant_ValueAST() {
		return (EReference)mobaConstantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaConstantValue() {
		return mobaConstantValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaConstantValue_ValueString() {
		return (EAttribute)mobaConstantValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaConstantValue_ValueConst() {
		return (EReference)mobaConstantValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaConstantValue_Tail() {
		return (EReference)mobaConstantValueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaConstantValue_ValueInt() {
		return (EAttribute)mobaConstantValueEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaConstantValue_ValueDouble() {
		return (EAttribute)mobaConstantValueEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaPropertiesAble() {
		return mobaPropertiesAbleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaPropertiesAble_Properties() {
		return (EReference)mobaPropertiesAbleEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getMobaProperty_Key() {
		return (EAttribute)mobaPropertyEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaProperty_Value() {
		return (EAttribute)mobaPropertyEClass.getEStructuralFeatures().get(5);
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
	public EAttribute getMobaSettings_Name() {
		return (EAttribute)mobaSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaSettings_Features() {
		return (EReference)mobaSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaSettings_Active() {
		return (EAttribute)mobaSettingsEClass.getEStructuralFeatures().get(3);
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
	public EClass getMobaEntity() {
		return mobaEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEntity_Name() {
		return (EAttribute)mobaEntityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaEntity_SuperType() {
		return (EReference)mobaEntityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaEntity_Cache() {
		return (EReference)mobaEntityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaEntity_Features() {
		return (EReference)mobaEntityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaEntity_Index() {
		return (EReference)mobaEntityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaEntityIndex() {
		return mobaEntityIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaEntityIndex_Attributes() {
		return (EReference)mobaEntityIndexEClass.getEStructuralFeatures().get(0);
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
	public EReference getMobaDto_Features() {
		return (EReference)mobaDtoEClass.getEStructuralFeatures().get(2);
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
	public EClass getMobaREST() {
		return mobaRESTEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaREST_Name() {
		return (EAttribute)mobaRESTEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaREST_Url() {
		return (EAttribute)mobaRESTEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaREST_BigData() {
		return (EAttribute)mobaRESTEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaREST_RequestDto() {
		return (EReference)mobaRESTEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaREST_ResponseDto() {
		return (EReference)mobaRESTEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaREST_ErrorDto() {
		return (EReference)mobaRESTEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaREST_Headers() {
		return (EReference)mobaRESTEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaRESTAttribute() {
		return mobaRESTAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaRESTAttribute_Type() {
		return (EReference)mobaRESTAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRESTAttribute_NameString() {
		return (EAttribute)mobaRESTAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaRESTAttribute_NameConst() {
		return (EReference)mobaRESTAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRESTAttribute_ValueString() {
		return (EAttribute)mobaRESTAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaRESTAttribute_ValueConst() {
		return (EReference)mobaRESTAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRESTAttribute_ValueDouble() {
		return (EAttribute)mobaRESTAttributeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRESTAttribute_ValueInt() {
		return (EAttribute)mobaRESTAttributeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRESTAttribute_Name() {
		return (EAttribute)mobaRESTAttributeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRESTAttribute_Value() {
		return (EAttribute)mobaRESTAttributeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaRESTCustomService() {
		return mobaRESTCustomServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRESTCustomService_Operation() {
		return (EAttribute)mobaRESTCustomServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaRESTCustomService_Parameters() {
		return (EReference)mobaRESTCustomServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaRESTCustomService_SuperType() {
		return (EReference)mobaRESTCustomServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaRESTWorkflow() {
		return mobaRESTWorkflowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaRESTWorkflow_Services() {
		return (EReference)mobaRESTWorkflowEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaRESTWorkflow_SuperType() {
		return (EReference)mobaRESTWorkflowEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaRESTCrud() {
		return mobaRESTCrudEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRESTCrud_Operations() {
		return (EAttribute)mobaRESTCrudEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaRESTCrud_SuperType() {
		return (EReference)mobaRESTCrudEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaFeature() {
		return mobaFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaFeature_Name() {
		return (EAttribute)mobaFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaEntityFeature() {
		return mobaEntityFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaEntityAttribute() {
		return mobaEntityAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEntityAttribute_Lazy() {
		return (EAttribute)mobaEntityAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEntityAttribute_Transient() {
		return (EAttribute)mobaEntityAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEntityAttribute_DomainKey() {
		return (EAttribute)mobaEntityAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEntityAttribute_DomainDescription() {
		return (EAttribute)mobaEntityAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaEntityAttribute_Type() {
		return (EReference)mobaEntityAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaMultiplicityAble() {
		return mobaMultiplicityAbleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaMultiplicityAble_Multiplicity() {
		return (EReference)mobaMultiplicityAbleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaEntityReference() {
		return mobaEntityReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEntityReference_Cascading() {
		return (EAttribute)mobaEntityReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEntityReference_Lazy() {
		return (EAttribute)mobaEntityReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEntityReference_Transient() {
		return (EAttribute)mobaEntityReferenceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaEntityReference_Type() {
		return (EReference)mobaEntityReferenceEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getMobaDtoAttribute_Alias() {
		return (EAttribute)mobaDtoAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDtoAttribute_Type() {
		return (EReference)mobaDtoAttributeEClass.getEStructuralFeatures().get(5);
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
	public EClass getMobaSettingsFeature() {
		return mobaSettingsFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaSettingsAttribute() {
		return mobaSettingsAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaSettingsAttribute_Lazy() {
		return (EAttribute)mobaSettingsAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaSettingsAttribute_Transient() {
		return (EAttribute)mobaSettingsAttributeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaSettingsAttribute_DomainKey() {
		return (EAttribute)mobaSettingsAttributeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaSettingsAttribute_DomainDescription() {
		return (EAttribute)mobaSettingsAttributeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaSettingsAttribute_Type() {
		return (EReference)mobaSettingsAttributeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaConstraintable() {
		return mobaConstraintableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaConstraintable_Constraints() {
		return (EReference)mobaConstraintableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaConstraint() {
		return mobaConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaRegexpConstraint() {
		return mobaRegexpConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaRegexpConstraint_FilterString() {
		return (EAttribute)mobaRegexpConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaRegexpConstraint_FilterConst() {
		return (EReference)mobaRegexpConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaMinConstraint() {
		return mobaMinConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaMinConstraint_FilterValue() {
		return (EAttribute)mobaMinConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaMinConstraint_FilterConst() {
		return (EReference)mobaMinConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaMaxConstraint() {
		return mobaMaxConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaMaxConstraint_FilterValue() {
		return (EAttribute)mobaMaxConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaMaxConstraint_FilterConst() {
		return (EReference)mobaMaxConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaFutureConstraint() {
		return mobaFutureConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaPastConstraint() {
		return mobaPastConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaNotNullConstraint() {
		return mobaNotNullConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaNullConstraint() {
		return mobaNullConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaMinLengthConstraint() {
		return mobaMinLengthConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaMinLengthConstraint_FilterValue() {
		return (EAttribute)mobaMinLengthConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaMinLengthConstraint_FilterConst() {
		return (EReference)mobaMinLengthConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaMaxLengthConstraint() {
		return mobaMaxLengthConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaMaxLengthConstraint_FilterValue() {
		return (EAttribute)mobaMaxLengthConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaMaxLengthConstraint_FilterConst() {
		return (EReference)mobaMaxLengthConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaDigitsConstraint() {
		return mobaDigitsConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDigitsConstraint_FilterIntegerValue() {
		return (EAttribute)mobaDigitsConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDigitsConstraint_FilterIntegerConst() {
		return (EReference)mobaDigitsConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaDigitsConstraint_FilterFractionValue() {
		return (EAttribute)mobaDigitsConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaDigitsConstraint_FilterFractionConst() {
		return (EReference)mobaDigitsConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaEnum() {
		return mobaEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaEnum_SuperType() {
		return (EReference)mobaEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEnum_Name() {
		return (EAttribute)mobaEnumEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaEnum_Literals() {
		return (EReference)mobaEnumEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaEnumLiteral() {
		return mobaEnumLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEnumLiteral_Literal() {
		return (EAttribute)mobaEnumLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEnumLiteral_Name() {
		return (EAttribute)mobaEnumLiteralEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaEnumLiteral_Value() {
		return (EAttribute)mobaEnumLiteralEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMobaRESTOperations() {
		return mobaRESTOperationsEEnum;
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
		createEAttribute(mobaApplicationEClass, MOBA_APPLICATION__ID);
		createEAttribute(mobaApplicationEClass, MOBA_APPLICATION__NAME);
		createEAttribute(mobaApplicationEClass, MOBA_APPLICATION__VERSION);
		createEReference(mobaApplicationEClass, MOBA_APPLICATION__FEATURES);

		mobaApplicationFeatureEClass = createEClass(MOBA_APPLICATION_FEATURE);

		mobaTemplateEClass = createEClass(MOBA_TEMPLATE);
		createEReference(mobaTemplateEClass, MOBA_TEMPLATE__TEMPLATE);
		createEAttribute(mobaTemplateEClass, MOBA_TEMPLATE__DOWNLOAD_TEMPLATE);

		mobaServerEClass = createEClass(MOBA_SERVER);
		createEAttribute(mobaServerEClass, MOBA_SERVER__URL);
		createEReference(mobaServerEClass, MOBA_SERVER__SERVICES);
		createEReference(mobaServerEClass, MOBA_SERVER__AUTHORIZATION);

		mobaAuthorizationEClass = createEClass(MOBA_AUTHORIZATION);
		createEAttribute(mobaAuthorizationEClass, MOBA_AUTHORIZATION__NAME);

		mobaGeneratorEClass = createEClass(MOBA_GENERATOR);
		createEAttribute(mobaGeneratorEClass, MOBA_GENERATOR__NAME);
		createEReference(mobaGeneratorEClass, MOBA_GENERATOR__FEATURES);
		createEAttribute(mobaGeneratorEClass, MOBA_GENERATOR__ACTIVE);

		mobaGeneratorFeatureEClass = createEClass(MOBA_GENERATOR_FEATURE);

		mobaGeneratorMixinFeatureEClass = createEClass(MOBA_GENERATOR_MIXIN_FEATURE);
		createEReference(mobaGeneratorMixinFeatureEClass, MOBA_GENERATOR_MIXIN_FEATURE__GENERATOR_REF);

		mobaGeneratorIDFeatureEClass = createEClass(MOBA_GENERATOR_ID_FEATURE);
		createEAttribute(mobaGeneratorIDFeatureEClass, MOBA_GENERATOR_ID_FEATURE__GENERATOR_ID);
		createEAttribute(mobaGeneratorIDFeatureEClass, MOBA_GENERATOR_ID_FEATURE__GENERATOR_VERSION);

		mobaDataTypeEClass = createEClass(MOBA_DATA_TYPE);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__NAME);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__PRIMITIVE);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__STRING);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__NUMERIC);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__DECIMAL);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__DATE);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__TIME);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__TIMESTAMP);
		createEReference(mobaDataTypeEClass, MOBA_DATA_TYPE__ENUM_AST);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__ARRAY);
		createEAttribute(mobaDataTypeEClass, MOBA_DATA_TYPE__DATE_FORMAT_STRING);
		createEReference(mobaDataTypeEClass, MOBA_DATA_TYPE__DATE_FORMAT_CONST);
		createEReference(mobaDataTypeEClass, MOBA_DATA_TYPE__SUPER_TYPE);

		mobaConstantEClass = createEClass(MOBA_CONSTANT);
		createEAttribute(mobaConstantEClass, MOBA_CONSTANT__NAME);
		createEReference(mobaConstantEClass, MOBA_CONSTANT__VALUE_AST);

		mobaConstantValueEClass = createEClass(MOBA_CONSTANT_VALUE);
		createEAttribute(mobaConstantValueEClass, MOBA_CONSTANT_VALUE__VALUE_STRING);
		createEReference(mobaConstantValueEClass, MOBA_CONSTANT_VALUE__VALUE_CONST);
		createEReference(mobaConstantValueEClass, MOBA_CONSTANT_VALUE__TAIL);
		createEAttribute(mobaConstantValueEClass, MOBA_CONSTANT_VALUE__VALUE_INT);
		createEAttribute(mobaConstantValueEClass, MOBA_CONSTANT_VALUE__VALUE_DOUBLE);

		mobaPropertiesAbleEClass = createEClass(MOBA_PROPERTIES_ABLE);
		createEReference(mobaPropertiesAbleEClass, MOBA_PROPERTIES_ABLE__PROPERTIES);

		mobaPropertyEClass = createEClass(MOBA_PROPERTY);
		createEAttribute(mobaPropertyEClass, MOBA_PROPERTY__KEY_STRING);
		createEReference(mobaPropertyEClass, MOBA_PROPERTY__KEY_CONST);
		createEAttribute(mobaPropertyEClass, MOBA_PROPERTY__VALUE_STRING);
		createEReference(mobaPropertyEClass, MOBA_PROPERTY__VALUE_CONST);
		createEAttribute(mobaPropertyEClass, MOBA_PROPERTY__KEY);
		createEAttribute(mobaPropertyEClass, MOBA_PROPERTY__VALUE);

		mobaDataEClass = createEClass(MOBA_DATA);

		mobaSettingsEClass = createEClass(MOBA_SETTINGS);
		createEReference(mobaSettingsEClass, MOBA_SETTINGS__SUPER_TYPE);
		createEAttribute(mobaSettingsEClass, MOBA_SETTINGS__NAME);
		createEReference(mobaSettingsEClass, MOBA_SETTINGS__FEATURES);
		createEAttribute(mobaSettingsEClass, MOBA_SETTINGS__ACTIVE);

		mobaCacheEClass = createEClass(MOBA_CACHE);
		createEAttribute(mobaCacheEClass, MOBA_CACHE__CACHE_TYPE_STRING);
		createEReference(mobaCacheEClass, MOBA_CACHE__CACHE_TYPE_CONST);
		createEAttribute(mobaCacheEClass, MOBA_CACHE__CACHE_STRATEGY_STRING);
		createEReference(mobaCacheEClass, MOBA_CACHE__CACHE_STRATEGY_CONST);

		mobaEntityEClass = createEClass(MOBA_ENTITY);
		createEAttribute(mobaEntityEClass, MOBA_ENTITY__NAME);
		createEReference(mobaEntityEClass, MOBA_ENTITY__SUPER_TYPE);
		createEReference(mobaEntityEClass, MOBA_ENTITY__CACHE);
		createEReference(mobaEntityEClass, MOBA_ENTITY__FEATURES);
		createEReference(mobaEntityEClass, MOBA_ENTITY__INDEX);

		mobaEntityIndexEClass = createEClass(MOBA_ENTITY_INDEX);
		createEReference(mobaEntityIndexEClass, MOBA_ENTITY_INDEX__ATTRIBUTES);

		mobaDtoEClass = createEClass(MOBA_DTO);
		createEAttribute(mobaDtoEClass, MOBA_DTO__NAME);
		createEReference(mobaDtoEClass, MOBA_DTO__SUPER_TYPE);
		createEReference(mobaDtoEClass, MOBA_DTO__FEATURES);

		mobaQueueEClass = createEClass(MOBA_QUEUE);
		createEAttribute(mobaQueueEClass, MOBA_QUEUE__NAME);
		createEReference(mobaQueueEClass, MOBA_QUEUE__SUPER_TYPE);
		createEReference(mobaQueueEClass, MOBA_QUEUE__FEATURES);

		mobaRESTEClass = createEClass(MOBA_REST);
		createEAttribute(mobaRESTEClass, MOBA_REST__NAME);
		createEAttribute(mobaRESTEClass, MOBA_REST__URL);
		createEAttribute(mobaRESTEClass, MOBA_REST__BIG_DATA);
		createEReference(mobaRESTEClass, MOBA_REST__REQUEST_DTO);
		createEReference(mobaRESTEClass, MOBA_REST__RESPONSE_DTO);
		createEReference(mobaRESTEClass, MOBA_REST__ERROR_DTO);
		createEReference(mobaRESTEClass, MOBA_REST__HEADERS);

		mobaRESTAttributeEClass = createEClass(MOBA_REST_ATTRIBUTE);
		createEReference(mobaRESTAttributeEClass, MOBA_REST_ATTRIBUTE__TYPE);
		createEAttribute(mobaRESTAttributeEClass, MOBA_REST_ATTRIBUTE__NAME_STRING);
		createEReference(mobaRESTAttributeEClass, MOBA_REST_ATTRIBUTE__NAME_CONST);
		createEAttribute(mobaRESTAttributeEClass, MOBA_REST_ATTRIBUTE__VALUE_STRING);
		createEReference(mobaRESTAttributeEClass, MOBA_REST_ATTRIBUTE__VALUE_CONST);
		createEAttribute(mobaRESTAttributeEClass, MOBA_REST_ATTRIBUTE__VALUE_DOUBLE);
		createEAttribute(mobaRESTAttributeEClass, MOBA_REST_ATTRIBUTE__VALUE_INT);
		createEAttribute(mobaRESTAttributeEClass, MOBA_REST_ATTRIBUTE__NAME);
		createEAttribute(mobaRESTAttributeEClass, MOBA_REST_ATTRIBUTE__VALUE);

		mobaRESTCustomServiceEClass = createEClass(MOBA_REST_CUSTOM_SERVICE);
		createEAttribute(mobaRESTCustomServiceEClass, MOBA_REST_CUSTOM_SERVICE__OPERATION);
		createEReference(mobaRESTCustomServiceEClass, MOBA_REST_CUSTOM_SERVICE__PARAMETERS);
		createEReference(mobaRESTCustomServiceEClass, MOBA_REST_CUSTOM_SERVICE__SUPER_TYPE);

		mobaRESTWorkflowEClass = createEClass(MOBA_REST_WORKFLOW);
		createEReference(mobaRESTWorkflowEClass, MOBA_REST_WORKFLOW__SERVICES);
		createEReference(mobaRESTWorkflowEClass, MOBA_REST_WORKFLOW__SUPER_TYPE);

		mobaRESTCrudEClass = createEClass(MOBA_REST_CRUD);
		createEAttribute(mobaRESTCrudEClass, MOBA_REST_CRUD__OPERATIONS);
		createEReference(mobaRESTCrudEClass, MOBA_REST_CRUD__SUPER_TYPE);

		mobaFeatureEClass = createEClass(MOBA_FEATURE);
		createEAttribute(mobaFeatureEClass, MOBA_FEATURE__NAME);

		mobaEntityFeatureEClass = createEClass(MOBA_ENTITY_FEATURE);

		mobaEntityAttributeEClass = createEClass(MOBA_ENTITY_ATTRIBUTE);
		createEAttribute(mobaEntityAttributeEClass, MOBA_ENTITY_ATTRIBUTE__LAZY);
		createEAttribute(mobaEntityAttributeEClass, MOBA_ENTITY_ATTRIBUTE__TRANSIENT);
		createEAttribute(mobaEntityAttributeEClass, MOBA_ENTITY_ATTRIBUTE__DOMAIN_KEY);
		createEAttribute(mobaEntityAttributeEClass, MOBA_ENTITY_ATTRIBUTE__DOMAIN_DESCRIPTION);
		createEReference(mobaEntityAttributeEClass, MOBA_ENTITY_ATTRIBUTE__TYPE);

		mobaMultiplicityAbleEClass = createEClass(MOBA_MULTIPLICITY_ABLE);
		createEReference(mobaMultiplicityAbleEClass, MOBA_MULTIPLICITY_ABLE__MULTIPLICITY);

		mobaEntityReferenceEClass = createEClass(MOBA_ENTITY_REFERENCE);
		createEAttribute(mobaEntityReferenceEClass, MOBA_ENTITY_REFERENCE__CASCADING);
		createEAttribute(mobaEntityReferenceEClass, MOBA_ENTITY_REFERENCE__LAZY);
		createEAttribute(mobaEntityReferenceEClass, MOBA_ENTITY_REFERENCE__TRANSIENT);
		createEReference(mobaEntityReferenceEClass, MOBA_ENTITY_REFERENCE__TYPE);

		mobaDtoFeatureEClass = createEClass(MOBA_DTO_FEATURE);

		mobaDtoAttributeEClass = createEClass(MOBA_DTO_ATTRIBUTE);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__LAZY);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__TRANSIENT);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__DOMAIN_KEY);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__DOMAIN_DESCRIPTION);
		createEAttribute(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__ALIAS);
		createEReference(mobaDtoAttributeEClass, MOBA_DTO_ATTRIBUTE__TYPE);

		mobaDtoReferenceEClass = createEClass(MOBA_DTO_REFERENCE);
		createEAttribute(mobaDtoReferenceEClass, MOBA_DTO_REFERENCE__CASCADING);
		createEAttribute(mobaDtoReferenceEClass, MOBA_DTO_REFERENCE__LAZY);
		createEAttribute(mobaDtoReferenceEClass, MOBA_DTO_REFERENCE__TRANSIENT);
		createEReference(mobaDtoReferenceEClass, MOBA_DTO_REFERENCE__TYPE);

		mobaQueueFeatureEClass = createEClass(MOBA_QUEUE_FEATURE);

		mobaQueueReferenceEClass = createEClass(MOBA_QUEUE_REFERENCE);
		createEAttribute(mobaQueueReferenceEClass, MOBA_QUEUE_REFERENCE__CASCADING);
		createEAttribute(mobaQueueReferenceEClass, MOBA_QUEUE_REFERENCE__LAZY);
		createEAttribute(mobaQueueReferenceEClass, MOBA_QUEUE_REFERENCE__TRANSIENT);
		createEReference(mobaQueueReferenceEClass, MOBA_QUEUE_REFERENCE__TYPE);

		mobaMuliplicityEClass = createEClass(MOBA_MULIPLICITY);
		createEAttribute(mobaMuliplicityEClass, MOBA_MULIPLICITY__LOWER);
		createEAttribute(mobaMuliplicityEClass, MOBA_MULIPLICITY__UPPER);

		mobaSettingsFeatureEClass = createEClass(MOBA_SETTINGS_FEATURE);

		mobaSettingsAttributeEClass = createEClass(MOBA_SETTINGS_ATTRIBUTE);
		createEAttribute(mobaSettingsAttributeEClass, MOBA_SETTINGS_ATTRIBUTE__LAZY);
		createEAttribute(mobaSettingsAttributeEClass, MOBA_SETTINGS_ATTRIBUTE__TRANSIENT);
		createEAttribute(mobaSettingsAttributeEClass, MOBA_SETTINGS_ATTRIBUTE__DOMAIN_KEY);
		createEAttribute(mobaSettingsAttributeEClass, MOBA_SETTINGS_ATTRIBUTE__DOMAIN_DESCRIPTION);
		createEReference(mobaSettingsAttributeEClass, MOBA_SETTINGS_ATTRIBUTE__TYPE);

		mobaConstraintableEClass = createEClass(MOBA_CONSTRAINTABLE);
		createEReference(mobaConstraintableEClass, MOBA_CONSTRAINTABLE__CONSTRAINTS);

		mobaConstraintEClass = createEClass(MOBA_CONSTRAINT);

		mobaRegexpConstraintEClass = createEClass(MOBA_REGEXP_CONSTRAINT);
		createEAttribute(mobaRegexpConstraintEClass, MOBA_REGEXP_CONSTRAINT__FILTER_STRING);
		createEReference(mobaRegexpConstraintEClass, MOBA_REGEXP_CONSTRAINT__FILTER_CONST);

		mobaMinConstraintEClass = createEClass(MOBA_MIN_CONSTRAINT);
		createEAttribute(mobaMinConstraintEClass, MOBA_MIN_CONSTRAINT__FILTER_VALUE);
		createEReference(mobaMinConstraintEClass, MOBA_MIN_CONSTRAINT__FILTER_CONST);

		mobaMaxConstraintEClass = createEClass(MOBA_MAX_CONSTRAINT);
		createEAttribute(mobaMaxConstraintEClass, MOBA_MAX_CONSTRAINT__FILTER_VALUE);
		createEReference(mobaMaxConstraintEClass, MOBA_MAX_CONSTRAINT__FILTER_CONST);

		mobaFutureConstraintEClass = createEClass(MOBA_FUTURE_CONSTRAINT);

		mobaPastConstraintEClass = createEClass(MOBA_PAST_CONSTRAINT);

		mobaNotNullConstraintEClass = createEClass(MOBA_NOT_NULL_CONSTRAINT);

		mobaNullConstraintEClass = createEClass(MOBA_NULL_CONSTRAINT);

		mobaMinLengthConstraintEClass = createEClass(MOBA_MIN_LENGTH_CONSTRAINT);
		createEAttribute(mobaMinLengthConstraintEClass, MOBA_MIN_LENGTH_CONSTRAINT__FILTER_VALUE);
		createEReference(mobaMinLengthConstraintEClass, MOBA_MIN_LENGTH_CONSTRAINT__FILTER_CONST);

		mobaMaxLengthConstraintEClass = createEClass(MOBA_MAX_LENGTH_CONSTRAINT);
		createEAttribute(mobaMaxLengthConstraintEClass, MOBA_MAX_LENGTH_CONSTRAINT__FILTER_VALUE);
		createEReference(mobaMaxLengthConstraintEClass, MOBA_MAX_LENGTH_CONSTRAINT__FILTER_CONST);

		mobaDigitsConstraintEClass = createEClass(MOBA_DIGITS_CONSTRAINT);
		createEAttribute(mobaDigitsConstraintEClass, MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_VALUE);
		createEReference(mobaDigitsConstraintEClass, MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_CONST);
		createEAttribute(mobaDigitsConstraintEClass, MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_VALUE);
		createEReference(mobaDigitsConstraintEClass, MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_CONST);

		mobaEnumEClass = createEClass(MOBA_ENUM);
		createEReference(mobaEnumEClass, MOBA_ENUM__SUPER_TYPE);
		createEAttribute(mobaEnumEClass, MOBA_ENUM__NAME);
		createEReference(mobaEnumEClass, MOBA_ENUM__LITERALS);

		mobaEnumLiteralEClass = createEClass(MOBA_ENUM_LITERAL);
		createEAttribute(mobaEnumLiteralEClass, MOBA_ENUM_LITERAL__LITERAL);
		createEAttribute(mobaEnumLiteralEClass, MOBA_ENUM_LITERAL__NAME);
		createEAttribute(mobaEnumLiteralEClass, MOBA_ENUM_LITERAL__VALUE);

		// Create enums
		mobaRESTOperationsEEnum = createEEnum(MOBA_REST_OPERATIONS);
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

		// Obtain other dependent packages
		MobaIndexPackage theMobaIndexPackage = (MobaIndexPackage)EPackage.Registry.INSTANCE.getEPackage(MobaIndexPackage.eNS_URI);

		// Add subpackages
		getESubpackages().add(theMobaIndexPackage);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mobaApplicationEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaTemplateEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaServerEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaAuthorizationEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaAuthorizationEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaGeneratorEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaGeneratorMixinFeatureEClass.getESuperTypes().add(this.getMobaGeneratorFeature());
		mobaGeneratorIDFeatureEClass.getESuperTypes().add(this.getMobaGeneratorFeature());
		mobaDataTypeEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaDataTypeEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaDataTypeEClass.getESuperTypes().add(this.getMobaConstraintable());
		mobaConstantEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaConstantEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaDataEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaSettingsEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaSettingsEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaEntityEClass.getESuperTypes().add(this.getMobaData());
		mobaEntityEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaDtoEClass.getESuperTypes().add(this.getMobaData());
		mobaDtoEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaQueueEClass.getESuperTypes().add(this.getMobaData());
		mobaQueueEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaRESTEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaRESTCustomServiceEClass.getESuperTypes().add(this.getMobaREST());
		mobaRESTCustomServiceEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaRESTWorkflowEClass.getESuperTypes().add(this.getMobaREST());
		mobaRESTWorkflowEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaRESTCrudEClass.getESuperTypes().add(this.getMobaREST());
		mobaRESTCrudEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaEntityFeatureEClass.getESuperTypes().add(this.getMobaFeature());
		mobaEntityAttributeEClass.getESuperTypes().add(this.getMobaEntityFeature());
		mobaEntityAttributeEClass.getESuperTypes().add(this.getMobaMultiplicityAble());
		mobaEntityAttributeEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaEntityAttributeEClass.getESuperTypes().add(this.getMobaConstraintable());
		mobaEntityReferenceEClass.getESuperTypes().add(this.getMobaEntityFeature());
		mobaEntityReferenceEClass.getESuperTypes().add(this.getMobaMultiplicityAble());
		mobaEntityReferenceEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaDtoFeatureEClass.getESuperTypes().add(this.getMobaFeature());
		mobaDtoAttributeEClass.getESuperTypes().add(this.getMobaDtoFeature());
		mobaDtoAttributeEClass.getESuperTypes().add(this.getMobaMultiplicityAble());
		mobaDtoAttributeEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaDtoAttributeEClass.getESuperTypes().add(this.getMobaConstraintable());
		mobaDtoReferenceEClass.getESuperTypes().add(this.getMobaDtoFeature());
		mobaDtoReferenceEClass.getESuperTypes().add(this.getMobaMultiplicityAble());
		mobaDtoReferenceEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaQueueFeatureEClass.getESuperTypes().add(this.getMobaFeature());
		mobaQueueReferenceEClass.getESuperTypes().add(this.getMobaQueueFeature());
		mobaQueueReferenceEClass.getESuperTypes().add(this.getMobaMultiplicityAble());
		mobaQueueReferenceEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaSettingsFeatureEClass.getESuperTypes().add(this.getMobaFeature());
		mobaSettingsAttributeEClass.getESuperTypes().add(this.getMobaSettingsFeature());
		mobaSettingsAttributeEClass.getESuperTypes().add(this.getMobaMultiplicityAble());
		mobaSettingsAttributeEClass.getESuperTypes().add(this.getMobaPropertiesAble());
		mobaSettingsAttributeEClass.getESuperTypes().add(this.getMobaConstraintable());
		mobaRegexpConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaMinConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaMaxConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaFutureConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaPastConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaNotNullConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaNullConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaMinLengthConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaMaxLengthConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaDigitsConstraintEClass.getESuperTypes().add(this.getMobaConstraint());
		mobaEnumEClass.getESuperTypes().add(this.getMobaApplicationFeature());
		mobaEnumEClass.getESuperTypes().add(this.getMobaPropertiesAble());

		// Initialize classes and features; add operations and parameters
		initEClass(mobaApplicationEClass, MobaApplication.class, "MobaApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaApplication_Id(), ecorePackage.getEString(), "id", null, 0, 1, MobaApplication.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaApplication_Version(), ecorePackage.getEString(), "version", null, 0, 1, MobaApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaApplication_Features(), this.getMobaApplicationFeature(), null, "features", null, 0, -1, MobaApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaApplicationFeatureEClass, MobaApplicationFeature.class, "MobaApplicationFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaTemplateEClass, MobaTemplate.class, "MobaTemplate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaTemplate_Template(), this.getMobaApplication(), null, "template", null, 0, 1, MobaTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaTemplate_DownloadTemplate(), ecorePackage.getEString(), "downloadTemplate", null, 0, 1, MobaTemplate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaServerEClass, MobaServer.class, "MobaServer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaServer_Url(), ecorePackage.getEString(), "url", null, 0, 1, MobaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaServer_Services(), this.getMobaREST(), null, "services", null, 0, -1, MobaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaServer_Authorization(), this.getMobaAuthorization(), null, "authorization", null, 0, 1, MobaServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaAuthorizationEClass, MobaAuthorization.class, "MobaAuthorization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaAuthorization_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaAuthorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaGeneratorEClass, MobaGenerator.class, "MobaGenerator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaGenerator_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaGenerator_Features(), this.getMobaGeneratorFeature(), null, "features", null, 0, -1, MobaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaGenerator_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, MobaGenerator.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaGeneratorFeatureEClass, MobaGeneratorFeature.class, "MobaGeneratorFeature", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaGeneratorMixinFeatureEClass, MobaGeneratorMixinFeature.class, "MobaGeneratorMixinFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaGeneratorMixinFeature_GeneratorRef(), this.getMobaGenerator(), null, "generatorRef", null, 0, 1, MobaGeneratorMixinFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaGeneratorIDFeatureEClass, MobaGeneratorIDFeature.class, "MobaGeneratorIDFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaGeneratorIDFeature_GeneratorId(), ecorePackage.getEString(), "generatorId", null, 0, 1, MobaGeneratorIDFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaGeneratorIDFeature_GeneratorVersion(), ecorePackage.getEString(), "generatorVersion", null, 0, 1, MobaGeneratorIDFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDataTypeEClass, MobaDataType.class, "MobaDataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaDataType_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Primitive(), ecorePackage.getEBoolean(), "primitive", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_String(), ecorePackage.getEBoolean(), "string", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Numeric(), ecorePackage.getEBoolean(), "numeric", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Decimal(), ecorePackage.getEBoolean(), "decimal", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Date(), ecorePackage.getEBoolean(), "date", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Time(), ecorePackage.getEBoolean(), "time", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Timestamp(), ecorePackage.getEBoolean(), "timestamp", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDataType_EnumAST(), this.getMobaEnum(), null, "enumAST", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_Array(), ecorePackage.getEBoolean(), "array", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDataType_DateFormatString(), ecorePackage.getEString(), "dateFormatString", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDataType_DateFormatConst(), this.getMobaConstant(), null, "dateFormatConst", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDataType_SuperType(), this.getMobaDataType(), null, "superType", null, 0, 1, MobaDataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaConstantEClass, MobaConstant.class, "MobaConstant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaConstant_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaConstant_ValueAST(), this.getMobaConstantValue(), null, "valueAST", null, 0, 1, MobaConstant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaConstantValueEClass, MobaConstantValue.class, "MobaConstantValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaConstantValue_ValueString(), ecorePackage.getEString(), "valueString", null, 0, 1, MobaConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaConstantValue_ValueConst(), this.getMobaConstant(), null, "valueConst", null, 0, 1, MobaConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaConstantValue_Tail(), this.getMobaConstantValue(), null, "tail", null, 0, 1, MobaConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaConstantValue_ValueInt(), ecorePackage.getEIntegerObject(), "valueInt", null, 0, 1, MobaConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaConstantValue_ValueDouble(), ecorePackage.getEDoubleObject(), "valueDouble", null, 0, 1, MobaConstantValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaPropertiesAbleEClass, MobaPropertiesAble.class, "MobaPropertiesAble", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaPropertiesAble_Properties(), this.getMobaProperty(), null, "properties", null, 0, -1, MobaPropertiesAble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaPropertyEClass, MobaProperty.class, "MobaProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaProperty_KeyString(), ecorePackage.getEString(), "keyString", null, 0, 1, MobaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaProperty_KeyConst(), this.getMobaConstant(), null, "keyConst", null, 0, 1, MobaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaProperty_ValueString(), ecorePackage.getEString(), "valueString", null, 0, 1, MobaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaProperty_ValueConst(), this.getMobaConstant(), null, "valueConst", null, 0, 1, MobaProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaProperty_Key(), ecorePackage.getEString(), "key", null, 0, 1, MobaProperty.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, MobaProperty.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mobaDataEClass, MobaData.class, "MobaData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaSettingsEClass, MobaSettings.class, "MobaSettings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaSettings_SuperType(), this.getMobaSettings(), null, "superType", null, 0, 1, MobaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaSettings_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaSettings_Features(), this.getMobaSettingsFeature(), null, "features", null, 0, -1, MobaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaSettings_Active(), ecorePackage.getEBoolean(), "active", null, 0, 1, MobaSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaCacheEClass, MobaCache.class, "MobaCache", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaCache_CacheTypeString(), ecorePackage.getEString(), "cacheTypeString", null, 0, 1, MobaCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaCache_CacheTypeConst(), this.getMobaConstant(), null, "cacheTypeConst", null, 0, 1, MobaCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaCache_CacheStrategyString(), ecorePackage.getEString(), "cacheStrategyString", null, 0, 1, MobaCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaCache_CacheStrategyConst(), this.getMobaConstant(), null, "cacheStrategyConst", null, 0, 1, MobaCache.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaEntityEClass, MobaEntity.class, "MobaEntity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaEntity_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaEntity_SuperType(), this.getMobaEntity(), null, "superType", null, 0, 1, MobaEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaEntity_Cache(), this.getMobaCache(), null, "cache", null, 0, 1, MobaEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaEntity_Features(), this.getMobaEntityFeature(), null, "features", null, 0, -1, MobaEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaEntity_Index(), this.getMobaEntityIndex(), null, "index", null, 0, 1, MobaEntity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaEntityIndexEClass, MobaEntityIndex.class, "MobaEntityIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaEntityIndex_Attributes(), this.getMobaEntityAttribute(), null, "attributes", null, 0, -1, MobaEntityIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDtoEClass, MobaDto.class, "MobaDto", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaDto_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDto_SuperType(), this.getMobaDto(), null, "superType", null, 0, 1, MobaDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDto_Features(), this.getMobaDtoFeature(), null, "features", null, 0, -1, MobaDto.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaQueueEClass, MobaQueue.class, "MobaQueue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaQueue_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaQueue_SuperType(), this.getMobaQueue(), null, "superType", null, 0, 1, MobaQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaQueue_Features(), this.getMobaQueueFeature(), null, "features", null, 0, -1, MobaQueue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaRESTEClass, MobaREST.class, "MobaREST", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaREST_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaREST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaREST_Url(), ecorePackage.getEString(), "url", null, 0, 1, MobaREST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaREST_BigData(), ecorePackage.getEBoolean(), "bigData", null, 0, 1, MobaREST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaREST_RequestDto(), this.getMobaDto(), null, "requestDto", null, 0, 1, MobaREST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaREST_ResponseDto(), this.getMobaDto(), null, "responseDto", null, 0, 1, MobaREST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaREST_ErrorDto(), this.getMobaDto(), null, "errorDto", null, 0, 1, MobaREST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaREST_Headers(), this.getMobaRESTAttribute(), null, "headers", null, 0, -1, MobaREST.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaRESTAttributeEClass, MobaRESTAttribute.class, "MobaRESTAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaRESTAttribute_Type(), this.getMobaDataType(), null, "type", null, 0, 1, MobaRESTAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaRESTAttribute_NameString(), ecorePackage.getEString(), "nameString", null, 0, 1, MobaRESTAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaRESTAttribute_NameConst(), this.getMobaConstant(), null, "nameConst", null, 0, 1, MobaRESTAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaRESTAttribute_ValueString(), ecorePackage.getEString(), "valueString", null, 0, 1, MobaRESTAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaRESTAttribute_ValueConst(), this.getMobaConstant(), null, "valueConst", null, 0, 1, MobaRESTAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaRESTAttribute_ValueDouble(), ecorePackage.getEDoubleObject(), "valueDouble", null, 0, 1, MobaRESTAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaRESTAttribute_ValueInt(), ecorePackage.getEIntegerObject(), "valueInt", null, 0, 1, MobaRESTAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaRESTAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaRESTAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaRESTAttribute_Value(), ecorePackage.getEString(), "value", null, 0, 1, MobaRESTAttribute.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(mobaRESTCustomServiceEClass, MobaRESTCustomService.class, "MobaRESTCustomService", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaRESTCustomService_Operation(), this.getMobaRESTOperations(), "operation", null, 0, 1, MobaRESTCustomService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaRESTCustomService_Parameters(), this.getMobaRESTAttribute(), null, "parameters", null, 0, -1, MobaRESTCustomService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaRESTCustomService_SuperType(), this.getMobaRESTCustomService(), null, "superType", null, 0, 1, MobaRESTCustomService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaRESTWorkflowEClass, MobaRESTWorkflow.class, "MobaRESTWorkflow", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaRESTWorkflow_Services(), this.getMobaREST(), null, "services", null, 0, -1, MobaRESTWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaRESTWorkflow_SuperType(), this.getMobaRESTWorkflow(), null, "superType", null, 0, 1, MobaRESTWorkflow.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaRESTCrudEClass, MobaRESTCrud.class, "MobaRESTCrud", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaRESTCrud_Operations(), this.getMobaRESTOperations(), "operations", null, 0, -1, MobaRESTCrud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaRESTCrud_SuperType(), this.getMobaRESTCrud(), null, "superType", null, 0, 1, MobaRESTCrud.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaFeatureEClass, MobaFeature.class, "MobaFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaFeature_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaEntityFeatureEClass, MobaEntityFeature.class, "MobaEntityFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaEntityAttributeEClass, MobaEntityAttribute.class, "MobaEntityAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaEntityAttribute_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaEntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaEntityAttribute_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaEntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaEntityAttribute_DomainKey(), ecorePackage.getEBoolean(), "domainKey", null, 0, 1, MobaEntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaEntityAttribute_DomainDescription(), ecorePackage.getEBoolean(), "domainDescription", null, 0, 1, MobaEntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaEntityAttribute_Type(), this.getMobaDataType(), null, "type", null, 0, 1, MobaEntityAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaMultiplicityAbleEClass, MobaMultiplicityAble.class, "MobaMultiplicityAble", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaMultiplicityAble_Multiplicity(), this.getMobaMuliplicity(), null, "multiplicity", null, 0, 1, MobaMultiplicityAble.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaEntityReferenceEClass, MobaEntityReference.class, "MobaEntityReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaEntityReference_Cascading(), ecorePackage.getEBoolean(), "cascading", null, 0, 1, MobaEntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaEntityReference_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaEntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaEntityReference_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaEntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaEntityReference_Type(), this.getMobaEntity(), null, "type", null, 0, 1, MobaEntityReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDtoFeatureEClass, MobaDtoFeature.class, "MobaDtoFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaDtoAttributeEClass, MobaDtoAttribute.class, "MobaDtoAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaDtoAttribute_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoAttribute_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoAttribute_DomainKey(), ecorePackage.getEBoolean(), "domainKey", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoAttribute_DomainDescription(), ecorePackage.getEBoolean(), "domainDescription", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoAttribute_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDtoAttribute_Type(), this.getMobaDataType(), null, "type", null, 0, 1, MobaDtoAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDtoReferenceEClass, MobaDtoReference.class, "MobaDtoReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaDtoReference_Cascading(), ecorePackage.getEBoolean(), "cascading", null, 0, 1, MobaDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoReference_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDtoReference_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDtoReference_Type(), this.getMobaDto(), null, "type", null, 0, 1, MobaDtoReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaQueueFeatureEClass, MobaQueueFeature.class, "MobaQueueFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaQueueReferenceEClass, MobaQueueReference.class, "MobaQueueReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaQueueReference_Cascading(), ecorePackage.getEBoolean(), "cascading", null, 0, 1, MobaQueueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaQueueReference_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaQueueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaQueueReference_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaQueueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaQueueReference_Type(), this.getMobaData(), null, "type", null, 0, 1, MobaQueueReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaMuliplicityEClass, MobaMuliplicity.class, "MobaMuliplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaMuliplicity_Lower(), this.getMobaLowerBound(), "lower", null, 0, 1, MobaMuliplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaMuliplicity_Upper(), this.getMobaUpperBound(), "upper", null, 0, 1, MobaMuliplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaSettingsFeatureEClass, MobaSettingsFeature.class, "MobaSettingsFeature", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaSettingsAttributeEClass, MobaSettingsAttribute.class, "MobaSettingsAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaSettingsAttribute_Lazy(), ecorePackage.getEBoolean(), "lazy", null, 0, 1, MobaSettingsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaSettingsAttribute_Transient(), ecorePackage.getEBoolean(), "transient", null, 0, 1, MobaSettingsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaSettingsAttribute_DomainKey(), ecorePackage.getEBoolean(), "domainKey", null, 0, 1, MobaSettingsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaSettingsAttribute_DomainDescription(), ecorePackage.getEBoolean(), "domainDescription", null, 0, 1, MobaSettingsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaSettingsAttribute_Type(), this.getMobaDataType(), null, "type", null, 0, 1, MobaSettingsAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaConstraintableEClass, MobaConstraintable.class, "MobaConstraintable", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaConstraintable_Constraints(), this.getMobaConstraint(), null, "constraints", null, 0, -1, MobaConstraintable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaConstraintEClass, MobaConstraint.class, "MobaConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaRegexpConstraintEClass, MobaRegexpConstraint.class, "MobaRegexpConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaRegexpConstraint_FilterString(), ecorePackage.getEString(), "filterString", null, 0, 1, MobaRegexpConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaRegexpConstraint_FilterConst(), this.getMobaConstant(), null, "filterConst", null, 0, 1, MobaRegexpConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaMinConstraintEClass, MobaMinConstraint.class, "MobaMinConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaMinConstraint_FilterValue(), ecorePackage.getEDouble(), "filterValue", null, 0, 1, MobaMinConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaMinConstraint_FilterConst(), this.getMobaConstant(), null, "filterConst", null, 0, 1, MobaMinConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaMaxConstraintEClass, MobaMaxConstraint.class, "MobaMaxConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaMaxConstraint_FilterValue(), ecorePackage.getEDouble(), "filterValue", null, 0, 1, MobaMaxConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaMaxConstraint_FilterConst(), this.getMobaConstant(), null, "filterConst", null, 0, 1, MobaMaxConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaFutureConstraintEClass, MobaFutureConstraint.class, "MobaFutureConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaPastConstraintEClass, MobaPastConstraint.class, "MobaPastConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaNotNullConstraintEClass, MobaNotNullConstraint.class, "MobaNotNullConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaNullConstraintEClass, MobaNullConstraint.class, "MobaNullConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mobaMinLengthConstraintEClass, MobaMinLengthConstraint.class, "MobaMinLengthConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaMinLengthConstraint_FilterValue(), ecorePackage.getEInt(), "filterValue", null, 0, 1, MobaMinLengthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaMinLengthConstraint_FilterConst(), this.getMobaConstant(), null, "filterConst", null, 0, 1, MobaMinLengthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaMaxLengthConstraintEClass, MobaMaxLengthConstraint.class, "MobaMaxLengthConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaMaxLengthConstraint_FilterValue(), ecorePackage.getEInt(), "filterValue", null, 0, 1, MobaMaxLengthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaMaxLengthConstraint_FilterConst(), this.getMobaConstant(), null, "filterConst", null, 0, 1, MobaMaxLengthConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaDigitsConstraintEClass, MobaDigitsConstraint.class, "MobaDigitsConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaDigitsConstraint_FilterIntegerValue(), ecorePackage.getEInt(), "filterIntegerValue", null, 0, 1, MobaDigitsConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDigitsConstraint_FilterIntegerConst(), this.getMobaConstant(), null, "filterIntegerConst", null, 0, 1, MobaDigitsConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaDigitsConstraint_FilterFractionValue(), ecorePackage.getEInt(), "filterFractionValue", null, 0, 1, MobaDigitsConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaDigitsConstraint_FilterFractionConst(), this.getMobaConstant(), null, "filterFractionConst", null, 0, 1, MobaDigitsConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaEnumEClass, MobaEnum.class, "MobaEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMobaEnum_SuperType(), this.getMobaEnum(), null, "superType", null, 0, 1, MobaEnum.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaEnum_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaEnum_Literals(), this.getMobaEnumLiteral(), null, "literals", null, 0, -1, MobaEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaEnumLiteralEClass, MobaEnumLiteral.class, "MobaEnumLiteral", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaEnumLiteral_Literal(), ecorePackage.getEString(), "literal", null, 0, 1, MobaEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaEnumLiteral_Name(), ecorePackage.getEString(), "name", null, 0, 1, MobaEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaEnumLiteral_Value(), ecorePackage.getEInt(), "value", null, 0, 1, MobaEnumLiteral.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(mobaRESTOperationsEEnum, MobaRESTOperations.class, "MobaRESTOperations");
		addEEnumLiteral(mobaRESTOperationsEEnum, MobaRESTOperations.GET);
		addEEnumLiteral(mobaRESTOperationsEEnum, MobaRESTOperations.PUT);
		addEEnumLiteral(mobaRESTOperationsEEnum, MobaRESTOperations.DELETE);
		addEEnumLiteral(mobaRESTOperationsEEnum, MobaRESTOperations.POST);

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
