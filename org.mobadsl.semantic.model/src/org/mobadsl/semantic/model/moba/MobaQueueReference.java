/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Queue Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaQueueReference#getRestService <em>Rest Service</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaQueueReference()
 * @model
 * @generated
 */
public interface MobaQueueReference extends MobaQueueFeature {
	/**
	 * Returns the value of the '<em><b>Rest Service</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rest Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rest Service</em>' reference.
	 * @see #setRestService(MobaREST)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaQueueReference_RestService()
	 * @model
	 * @generated
	 */
	MobaREST getRestService();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaQueueReference#getRestService <em>Rest Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rest Service</em>' reference.
	 * @see #getRestService()
	 * @generated
	 */
	void setRestService(MobaREST value);

} // MobaQueueReference
