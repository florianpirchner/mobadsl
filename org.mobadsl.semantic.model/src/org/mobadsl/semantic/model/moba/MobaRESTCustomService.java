/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.common.util.EList;


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
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getSuperType <em>Super Type</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaRESTAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaRESTAttribute> getParameters();

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(MobaRESTCustomService)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService_SuperType()
	 * @model
	 * @generated
	 */
	MobaRESTCustomService getSuperType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaRESTCustomService value);

} // MobaRESTCustomService
