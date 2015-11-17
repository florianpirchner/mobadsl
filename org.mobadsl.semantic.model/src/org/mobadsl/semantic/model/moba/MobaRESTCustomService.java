/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

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
public interface MobaRESTCustomService extends MobaREST {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mobadsl.semantic.model.moba.MobaRESTMethods}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTMethods
	 * @see #setOperation(MobaRESTMethods)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService_Operation()
	 * @model
	 * @generated
	 */
	MobaRESTMethods getOperation();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getOperation <em>Operation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTMethods
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(MobaRESTMethods value);

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
	
	/**
	 * Returns the values for the current instance. Including the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaRESTAttribute> getAllParameters();
	
	/**
	 * Returns the generator specific values for the current instance. Including
	 * the "super types".
	 * <p>
	 * The difference to getAll...() is, that shadowed values are replaces with
	 * their new representation. For instance, if a feature #name is defined in
	 * superType and in this instance, then the #name value from this instance
	 * will be put at the original index from #name in the superType.
	 * 
	 * @return
	 */
	List<MobaRESTAttribute> getGenParameters();
	
	/**
	 * Returns all supertypes for this instance.
	 * 
	 * @return
	 * @throws RecursionException
	 *             if a recursion was found
	 */ 
	List<MobaRESTCustomService> getAllSuperTypes() throws RecursionException;

} // MobaRESTCustomService
