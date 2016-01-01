/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Dto</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntity#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntity#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntity#getCache <em>Cache</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntity#getFeatures <em>Features</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntity#getIndizes <em>Indizes</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntity()
 * @model
 * @generated
 */
public interface MobaEntity extends MobaData {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDto_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaEntity#getName <em>Name</em>}' attribute.
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
	 * @see #setSuperType(MobaEntity)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDto_SuperType()
	 * @model
	 * @generated
	 */
	MobaEntity getSuperType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaEntity#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaEntity value);

	/**
	 * Returns the value of the '<em><b>Cache</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cache</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cache</em>' containment reference.
	 * @see #setCache(MobaCache)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntity_Cache()
	 * @model containment="true"
	 * @generated
	 */
	MobaCache getCache();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaEntity#getCache <em>Cache</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cache</em>' containment reference.
	 * @see #getCache()
	 * @generated
	 */
	void setCache(MobaCache value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaEntityFeature}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDto_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaEntityFeature> getFeatures();

	/**
	 * Returns the value of the '<em><b>Indizes</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaEntityIndex}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indizes</em>' containment reference list isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Indizes</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntity_Indizes()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaEntityIndex> getIndizes();

	/**
	 * Returns the values for the current instance. Excluding the "super types".
	 * 
	 * @return
	 */
	List<MobaEntityAttribute> getAttributes();

	/**
	 * Returns the values for the current instance. Excluding the "super types".
	 * 
	 * @return
	 */
	List<MobaEntityReference> getReferences();

	/**
	 * Returns the values for the current instance. Excluding the "super types".
	 * 
	 * @return
	 */
	List<MobaEntityEmbeddable> getEmbeddables();

	/**
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaEntityFeature> getAllFeatures();

	/**
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaEntityAttribute> getAllAttributes();

	/**
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaEntityReference> getAllReferences();

	/**
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaEntityEmbeddable> getAllEmbeddables();

	/**
	 * Returns all supertypes for this instance.
	 * <p>
	 * For <code>"a" extends "b" extends "c"</code> a list in the order
	 * <code>[a, b, c]</code> is returned. The highest super type is at the last
	 * index of the list.
	 * 
	 * @return
	 * @throws RecursionException
	 *             if a recursion was found
	 */
	List<MobaEntity> getAllSuperTypes() throws RecursionException;

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
	List<MobaEntityFeature> getGenFeatures();

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
	List<MobaEntityAttribute> getGenAttributes();

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
	List<MobaEntityReference> getGenReferences();

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
	List<MobaEntityEmbeddable> getGenEmbeddables();

	/**
	 * Returns the cache of this entity if not null. Otherwise the cache from
	 * the containing application.
	 * 
	 * @return
	 */
	MobaCache getGenCache();

} // MobaDto
