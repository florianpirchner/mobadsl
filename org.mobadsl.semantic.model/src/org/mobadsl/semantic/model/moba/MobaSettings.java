/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Settings</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.mobadsl.semantic.model.moba.MobaSettings#getSuperType
 * <em>Super Type</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.MobaSettings#getName <em>Name</em>
 * }</li>
 * <li>{@link org.mobadsl.semantic.model.moba.MobaSettings#getFeatures
 * <em>Features</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaSettings()
 * @model
 * @generated
 */
public interface MobaSettings extends MobaApplicationFeature, MobaPropertiesAble {
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
	 * @see #setSuperType(MobaSettings)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaSettings_SuperType()
	 * @model
	 * @generated
	 */
	MobaSettings getSuperType();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaSettings#getSuperType
	 * <em>Super Type</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaSettings value);

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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaSettings_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaSettings#getName <em>Name</em>
	 * }' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference
	 * list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaSettingsFeature}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Features</em>' containment reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaSettings_Features()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaSettingsFeature> getFeatures();

	/**
	 * Returns the values for the current instance. Excluding the "super types".
	 * 
	 * @return
	 */
	List<MobaSettingsAttribute> getAttributes();

	/**
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaSettingsFeature> getAllFeatures();

	/**
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaSettingsAttribute> getAllAttributes();

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
	List<MobaSettingsFeature> getGenFeatures();

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
	List<MobaSettingsAttribute> getGenAttributes();

	/**
	 * Returns all supertypes of this instance.
	 * 
	 * @return
	 * @throws RecursionException
	 *             if a recursion in super types was found
	 */
	List<MobaSettings> getAllSuperTypes() throws RecursionException;

} // MobaSettings
