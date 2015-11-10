/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaPayload#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaPayload#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaPayload#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaPayload()
 * @model
 * @generated
 */
public interface MobaPayload extends MobaData, MobaPropertiesAble {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaPayload_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaPayload#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(MobaPayload)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaPayload_SuperType()
	 * @model
	 * @generated
	 */
	MobaPayload getSuperType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaPayload#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaPayload value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaPayloadFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaPayload_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaPayloadFeature> getFeatures();
	
	/**
	 * Returns the values for the current instance. Excluding the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaPayloadAttribute> getAttributes();

	/**
	 * Returns the values for the current instance. Excluding the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaPayloadReference> getReferences();

	/**
	 * Returns the values for the current instance. Including the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaPayloadFeature> getAllFeatures();

	/**
	 * Returns the values for the current instance. Including the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaPayloadAttribute> getAllAttributes();

	/**
	 * Returns the values for the current instance. Including the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaPayloadReference> getAllReferences();
	
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
	List<MobaPayloadFeature> getGenFeatures();
	
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
	List<MobaPayloadAttribute> getGenAttributes();
	
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
	List<MobaPayloadReference> getGenReferences();
	
	
	/**
	 * Returns all supertypes for this instance.
	 * 
	 * @return
	 * @throws RecursionException
	 *             if a recursion was found
	 */
	List<MobaPayload> getAllSuperTypes() throws RecursionException;


} // MobaPayload
