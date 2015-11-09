/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Queue</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaQueue#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaQueue#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaQueue#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaQueue()
 * @model
 * @generated
 */
public interface MobaQueue extends MobaData, MobaPropertiesAble {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaQueue_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaQueue#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(MobaQueue)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaQueue_SuperType()
	 * @model
	 * @generated
	 */
	MobaQueue getSuperType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaQueue#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaQueue value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaQueueFeature}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaQueue_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaQueueFeature> getFeatures();

	/**
	 * Returns the values for the current instance. Excluding the "super types".
	 * 
	 * @return
	 */
	List<MobaQueueReference> getReferences();

	/**
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaQueueFeature> getAllFeatures();

	/**
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaQueueReference> getAllReferences();

	/**
	 * Returns all supertypes for this instance.
	 * 
	 * @return
	 * @throws RecursionException
	 *             if a recursion was found
	 */
	List<MobaQueue> getAllSuperTypes() throws RecursionException;

} // MobaQueue
