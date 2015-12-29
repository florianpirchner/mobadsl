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
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDto#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDto#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDto#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDto#getSerializationType <em>Serialization Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDto()
 * @model
 * @generated
 */
public interface MobaDto extends MobaData {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDto_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDto#getName <em>Name</em>}' attribute.
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
	 * @see #setSuperType(MobaDto)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDto_SuperType()
	 * @model
	 * @generated
	 */
	MobaDto getSuperType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDto#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaDto value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaDtoFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDto_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaDtoFeature> getFeatures();
	
	/**
	 * Returns the value of the '<em><b>Serialization Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Serialization Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Serialization Type</em>' reference.
	 * @see #setSerializationType(MobaTransportSerializationType)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDto_SerializationType()
	 * @model
	 * @generated
	 */
	MobaTransportSerializationType getSerializationType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDto#getSerializationType <em>Serialization Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialization Type</em>' reference.
	 * @see #getSerializationType()
	 * @generated
	 */
	void setSerializationType(MobaTransportSerializationType value);

	/**
	 * Returns the values for the current instance. Excluding the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaDtoAttribute> getAttributes();

	/**
	 * Returns the values for the current instance. Excluding the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaDtoReference> getReferences();
	
	/**
	 * Returns the values for the current instance. Excluding the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaDtoEmbeddable> getEmbeddables();

	/**
	 * Returns the values for the current instance. Including the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaDtoFeature> getAllFeatures();

	/**
	 * Returns the values for the current instance. Including the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaDtoAttribute> getAllAttributes();

	/**
	 * Returns the values for the current instance. Including the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaDtoReference> getAllReferences();
	
	/**
	 * Returns the values for the current instance. Including the
	 * "super types".
	 * 
	 * @return
	 */
	List<MobaDtoEmbeddable> getAllEmbeddables();
	
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
	List<MobaDtoFeature> getGenFeatures();
	
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
	List<MobaDtoAttribute> getGenAttributes();
	
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
	List<MobaDtoReference> getGenReferences();
	
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
	List<MobaDtoEmbeddable> getGenEmbeddables();
	
	
	/**
	 * Returns all supertypes for this instance.
	 * 
	 * @return
	 * @throws RecursionException
	 *             if a recursion was found
	 */
	List<MobaDto> getAllSuperTypes() throws RecursionException;


} // MobaPayload
