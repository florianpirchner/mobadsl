/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Crud</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTCrud#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTCrud#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCrud()
 * @model
 * @generated
 */
public interface MobaRESTCrud extends MobaREST, MobaPropertiesAble {
	/**
	 * Returns the value of the '<em><b>Operations</b></em>' attribute list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaRESTMethods}.
	 * The literals are from the enumeration {@link org.mobadsl.semantic.model.moba.MobaRESTMethods}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operations</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operations</em>' attribute list.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTMethods
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCrud_Operations()
	 * @model
	 * @generated
	 */
	EList<MobaRESTMethods> getOperations();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(MobaRESTCrud)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCrud_SuperType()
	 * @model
	 * @generated
	 */
	MobaRESTCrud getSuperType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTCrud#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaRESTCrud value);

} // MobaRESTCrud
