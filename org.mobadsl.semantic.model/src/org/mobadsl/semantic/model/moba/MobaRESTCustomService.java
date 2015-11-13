/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Custom Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService()
 * @model
 * @generated
 */
public interface MobaRESTCustomService extends MobaREST, MobaPropertiesAble {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mobadsl.semantic.model.moba.MobaRESTOperations}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTOperations
	 * @see #setOperation(MobaRESTOperations)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService_Operation()
	 * @model
	 * @generated
	 */
	MobaRESTOperations getOperation();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTOperations
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(MobaRESTOperations value);

} // MobaRESTCustomService
