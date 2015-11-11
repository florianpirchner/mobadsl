/**
 */
package org.mobadsl.semantic.model.moba.index;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getRelativePath <em>Relative Path</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getDescription <em>Description</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getVersion <em>Version</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry()
 * @model
 * @generated
 */
public interface MobaIndexEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Path</em>' attribute.
	 * @see #setRelativePath(String)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_RelativePath()
	 * @model required="true"
	 * @generated
	 */
	String getRelativePath();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getRelativePath <em>Relative Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relative Path</em>' attribute.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_Description()
	 * @model required="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_Version()
	 * @model required="true"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // MobaIndexEntry
