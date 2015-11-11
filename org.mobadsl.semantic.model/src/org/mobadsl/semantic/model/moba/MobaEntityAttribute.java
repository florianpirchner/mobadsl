/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isDomainKey <em>Domain Key</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntityAttribute()
 * @model
 * @generated
 */
public interface MobaEntityAttribute extends MobaEntityFeature, MobaMultiplicityAble, MobaPropertiesAble, MobaConstraintable {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntityAttribute_Lazy()
	 * @model
	 * @generated
	 */
	boolean isLazy();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isLazy <em>Lazy</em>}' attribute.
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntityAttribute_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isTransient <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transient</em>' attribute.
	 * @see #isTransient()
	 * @generated
	 */
	void setTransient(boolean value);

	/**
	 * Returns the value of the '<em><b>Domain Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Key</em>' attribute.
	 * @see #setDomainKey(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntityAttribute_DomainKey()
	 * @model
	 * @generated
	 */
	boolean isDomainKey();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isDomainKey <em>Domain Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Key</em>' attribute.
	 * @see #isDomainKey()
	 * @generated
	 */
	void setDomainKey(boolean value);

	/**
	 * Returns the value of the '<em><b>Domain Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Description</em>' attribute.
	 * @see #setDomainDescription(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntityAttribute_DomainDescription()
	 * @model
	 * @generated
	 */
	boolean isDomainDescription();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#isDomainDescription <em>Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Description</em>' attribute.
	 * @see #isDomainDescription()
	 * @generated
	 */
	void setDomainDescription(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(MobaDataType)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaEntityAttribute_Type()
	 * @model
	 * @generated
	 */
	MobaDataType getType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaEntityAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MobaDataType value);

} // MobaDtoAttribute