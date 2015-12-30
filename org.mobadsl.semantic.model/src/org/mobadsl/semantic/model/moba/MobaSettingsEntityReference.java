/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Settings Entity Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaSettingsEntityReference#isCascading <em>Cascading</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaSettingsEntityReference#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaSettingsEntityReference#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaSettingsEntityReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaSettingsEntityReference()
 * @model
 * @generated
 */
public interface MobaSettingsEntityReference extends MobaSettingsFeature, MobaMultiplicityAble, MobaConstraintable {
	/**
	 * Returns the value of the '<em><b>Cascading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cascading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cascading</em>' attribute.
	 * @see #setCascading(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaSettingsEntityReference_Cascading()
	 * @model
	 * @generated
	 */
	boolean isCascading();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaSettingsEntityReference#isCascading <em>Cascading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cascading</em>' attribute.
	 * @see #isCascading()
	 * @generated
	 */
	void setCascading(boolean value);

	/**
	 * Returns the value of the '<em><b>Lazy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lazy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lazy</em>' attribute.
	 * @see #setLazy(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaSettingsEntityReference_Lazy()
	 * @model
	 * @generated
	 */
	boolean isLazy();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaSettingsEntityReference#isLazy <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lazy</em>' attribute.
	 * @see #isLazy()
	 * @generated
	 */
	void setLazy(boolean value);

	/**
	 * Returns the value of the '<em><b>Transient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transient</em>' attribute.
	 * @see #setTransient(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaSettingsEntityReference_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaSettingsEntityReference#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MobaEntity)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaSettingsEntityReference_Type()
	 * @model
	 * @generated
	 */
	MobaEntity getType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaSettingsEntityReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MobaEntity value);

} // MobaSettingsEntityReference
