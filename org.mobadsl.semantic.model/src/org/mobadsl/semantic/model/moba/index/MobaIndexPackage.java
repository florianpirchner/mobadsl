/**
 */
package org.mobadsl.semantic.model.moba.index;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see org.mobadsl.semantic.model.moba.index.MobaIndexFactory
 * @model kind="package"
 * @generated
 */
public interface MobaIndexPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "index";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.mobadsl.org/template/repository/Index";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "index";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MobaIndexPackage eINSTANCE = org.mobadsl.semantic.model.moba.index.impl.MobaIndexPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexImpl <em>Moba Index</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.index.impl.MobaIndexImpl
	 * @see org.mobadsl.semantic.model.moba.index.impl.MobaIndexPackageImpl#getMobaIndex()
	 * @generated
	 */
	int MOBA_INDEX = 0;

	/**
	 * The feature id for the '<em><b>Transient Repo ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX__TRANSIENT_REPO_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX__VERSION = 3;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX__ENTRIES = 4;

	/**
	 * The number of structural features of the '<em>Moba Index</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl <em>Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl
	 * @see org.mobadsl.semantic.model.moba.index.impl.MobaIndexPackageImpl#getMobaIndexEntry()
	 * @generated
	 */
	int MOBA_INDEX_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX_ENTRY__RELATIVE_PATH = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX_ENTRY__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX_ENTRY__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX_ENTRY__VERSION = 3;

	/**
	 * The number of structural features of the '<em>Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOBA_INDEX_ENTRY_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.index.MobaIndex <em>Moba Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Moba Index</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndex
	 * @generated
	 */
	EClass getMobaIndex();

	/**
	 * Returns the meta object for the containment reference list '{@link org.mobadsl.semantic.model.moba.index.MobaIndex#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entries</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndex#getEntries()
	 * @see #getMobaIndex()
	 * @generated
	 */
	EReference getMobaIndex_Entries();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.index.MobaIndex#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndex#getName()
	 * @see #getMobaIndex()
	 * @generated
	 */
	EAttribute getMobaIndex_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.index.MobaIndex#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndex#getDescription()
	 * @see #getMobaIndex()
	 * @generated
	 */
	EAttribute getMobaIndex_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.index.MobaIndex#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndex#getVersion()
	 * @see #getMobaIndex()
	 * @generated
	 */
	EAttribute getMobaIndex_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.index.MobaIndex#getTransientRepoID <em>Transient Repo ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transient Repo ID</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndex#getTransientRepoID()
	 * @see #getMobaIndex()
	 * @generated
	 */
	EAttribute getMobaIndex_TransientRepoID();

	/**
	 * Returns the meta object for class '{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexEntry
	 * @generated
	 */
	EClass getMobaIndexEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getRelativePath <em>Relative Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Relative Path</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getRelativePath()
	 * @see #getMobaIndexEntry()
	 * @generated
	 */
	EAttribute getMobaIndexEntry_RelativePath();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getName()
	 * @see #getMobaIndexEntry()
	 * @generated
	 */
	EAttribute getMobaIndexEntry_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getDescription()
	 * @see #getMobaIndexEntry()
	 * @generated
	 */
	EAttribute getMobaIndexEntry_Description();

	/**
	 * Returns the meta object for the attribute '{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getVersion()
	 * @see #getMobaIndexEntry()
	 * @generated
	 */
	EAttribute getMobaIndexEntry_Version();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MobaIndexFactory getMobaIndexFactory();

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
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexImpl <em>Moba Index</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.index.impl.MobaIndexImpl
		 * @see org.mobadsl.semantic.model.moba.index.impl.MobaIndexPackageImpl#getMobaIndex()
		 * @generated
		 */
		EClass MOBA_INDEX = eINSTANCE.getMobaIndex();

		/**
		 * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MOBA_INDEX__ENTRIES = eINSTANCE.getMobaIndex_Entries();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_INDEX__NAME = eINSTANCE.getMobaIndex_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_INDEX__DESCRIPTION = eINSTANCE.getMobaIndex_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_INDEX__VERSION = eINSTANCE.getMobaIndex_Version();

		/**
		 * The meta object literal for the '<em><b>Transient Repo ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_INDEX__TRANSIENT_REPO_ID = eINSTANCE.getMobaIndex_TransientRepoID();

		/**
		 * The meta object literal for the '{@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl <em>Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl
		 * @see org.mobadsl.semantic.model.moba.index.impl.MobaIndexPackageImpl#getMobaIndexEntry()
		 * @generated
		 */
		EClass MOBA_INDEX_ENTRY = eINSTANCE.getMobaIndexEntry();

		/**
		 * The meta object literal for the '<em><b>Relative Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_INDEX_ENTRY__RELATIVE_PATH = eINSTANCE.getMobaIndexEntry_RelativePath();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_INDEX_ENTRY__NAME = eINSTANCE.getMobaIndexEntry_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_INDEX_ENTRY__DESCRIPTION = eINSTANCE.getMobaIndexEntry_Description();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOBA_INDEX_ENTRY__VERSION = eINSTANCE.getMobaIndexEntry_Version();

	}

} //MobaIndexPackage
