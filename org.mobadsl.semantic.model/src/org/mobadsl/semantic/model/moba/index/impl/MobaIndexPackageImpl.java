/**
 */
package org.mobadsl.semantic.model.moba.index.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.impl.MobaPackageImpl;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;
import org.mobadsl.semantic.model.moba.index.MobaIndexFactory;
import org.mobadsl.semantic.model.moba.index.MobaIndexPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MobaIndexPackageImpl extends EPackageImpl implements MobaIndexPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaIndexEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mobaIndexEntryEClass = null;

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
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MobaIndexPackageImpl() {
		super(eNS_URI, MobaIndexFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MobaIndexPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MobaIndexPackage init() {
		if (isInited) return (MobaIndexPackage)EPackage.Registry.INSTANCE.getEPackage(MobaIndexPackage.eNS_URI);

		// Obtain or create and register package
		MobaIndexPackageImpl theMobaIndexPackage = (MobaIndexPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MobaIndexPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MobaIndexPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		MobaPackageImpl theMobaPackage = (MobaPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(MobaPackage.eNS_URI) instanceof MobaPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(MobaPackage.eNS_URI) : MobaPackage.eINSTANCE);

		// Create package meta-data objects
		theMobaIndexPackage.createPackageContents();
		theMobaPackage.createPackageContents();

		// Initialize created meta-data
		theMobaIndexPackage.initializePackageContents();
		theMobaPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMobaIndexPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MobaIndexPackage.eNS_URI, theMobaIndexPackage);
		return theMobaIndexPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaIndex() {
		return mobaIndexEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaIndex_Id() {
		return (EAttribute)mobaIndexEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMobaIndex_Entries() {
		return (EReference)mobaIndexEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaIndex_Name() {
		return (EAttribute)mobaIndexEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaIndex_Description() {
		return (EAttribute)mobaIndexEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaIndex_Version() {
		return (EAttribute)mobaIndexEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMobaIndexEntry() {
		return mobaIndexEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaIndexEntry_RelativePath() {
		return (EAttribute)mobaIndexEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaIndexEntry_TemplateId() {
		return (EAttribute)mobaIndexEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaIndexEntry_TemplateName() {
		return (EAttribute)mobaIndexEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaIndexEntry_TemplateDescription() {
		return (EAttribute)mobaIndexEntryEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMobaIndexEntry_TemplateVersion() {
		return (EAttribute)mobaIndexEntryEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaIndexFactory getMobaIndexFactory() {
		return (MobaIndexFactory)getEFactoryInstance();
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
		mobaIndexEClass = createEClass(MOBA_INDEX);
		createEAttribute(mobaIndexEClass, MOBA_INDEX__ID);
		createEAttribute(mobaIndexEClass, MOBA_INDEX__NAME);
		createEAttribute(mobaIndexEClass, MOBA_INDEX__DESCRIPTION);
		createEAttribute(mobaIndexEClass, MOBA_INDEX__VERSION);
		createEReference(mobaIndexEClass, MOBA_INDEX__ENTRIES);

		mobaIndexEntryEClass = createEClass(MOBA_INDEX_ENTRY);
		createEAttribute(mobaIndexEntryEClass, MOBA_INDEX_ENTRY__RELATIVE_PATH);
		createEAttribute(mobaIndexEntryEClass, MOBA_INDEX_ENTRY__TEMPLATE_ID);
		createEAttribute(mobaIndexEntryEClass, MOBA_INDEX_ENTRY__TEMPLATE_NAME);
		createEAttribute(mobaIndexEntryEClass, MOBA_INDEX_ENTRY__TEMPLATE_DESCRIPTION);
		createEAttribute(mobaIndexEntryEClass, MOBA_INDEX_ENTRY__TEMPLATE_VERSION);
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

		// Initialize classes and features; add operations and parameters
		initEClass(mobaIndexEClass, MobaIndex.class, "MobaIndex", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaIndex_Id(), ecorePackage.getEString(), "id", null, 1, 1, MobaIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaIndex_Name(), ecorePackage.getEString(), "name", null, 1, 1, MobaIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaIndex_Description(), ecorePackage.getEString(), "description", null, 1, 1, MobaIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaIndex_Version(), ecorePackage.getEString(), "version", null, 1, 1, MobaIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMobaIndex_Entries(), this.getMobaIndexEntry(), null, "entries", null, 0, -1, MobaIndex.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mobaIndexEntryEClass, MobaIndexEntry.class, "MobaIndexEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMobaIndexEntry_RelativePath(), ecorePackage.getEString(), "relativePath", null, 1, 1, MobaIndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaIndexEntry_TemplateId(), ecorePackage.getEString(), "templateId", null, 0, 1, MobaIndexEntry.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaIndexEntry_TemplateName(), ecorePackage.getEString(), "templateName", null, 1, 1, MobaIndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaIndexEntry_TemplateDescription(), ecorePackage.getEString(), "templateDescription", null, 1, 1, MobaIndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMobaIndexEntry_TemplateVersion(), ecorePackage.getEString(), "templateVersion", null, 1, 1, MobaIndexEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
	}

} //MobaIndexPackageImpl
