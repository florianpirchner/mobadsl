/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Payload Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isDomainKey <em>Domain Key</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getType <em>Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getFormatConst <em>Format Const</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDtoAttribute()
 * @model
 * @generated
 */
public interface MobaDtoAttribute extends MobaDtoFeature, MobaMultiplicityAble, MobaConstraintable {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDtoAttribute_Lazy()
	 * @model
	 * @generated
	 */
	boolean isLazy();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isLazy <em>Lazy</em>}' attribute.
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDtoAttribute_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isTransient <em>Transient</em>}' attribute.
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDtoAttribute_DomainKey()
	 * @model
	 * @generated
	 */
	boolean isDomainKey();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isDomainKey <em>Domain Key</em>}' attribute.
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDtoAttribute_DomainDescription()
	 * @model
	 * @generated
	 */
	boolean isDomainDescription();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#isDomainDescription <em>Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Description</em>' attribute.
	 * @see #isDomainDescription()
	 * @generated
	 */
	void setDomainDescription(boolean value);

	/**
	 * Returns the value of the '<em><b>Alias</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alias</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alias</em>' attribute.
	 * @see #setAlias(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDtoAttribute_Alias()
	 * @model
	 * @generated
	 */
	String getAlias();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getAlias <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alias</em>' attribute.
	 * @see #getAlias()
	 * @generated
	 */
	void setAlias(String value);

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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDtoAttribute_Type()
	 * @model
	 * @generated
	 */
	MobaDataType getType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MobaDataType value);

	/**
	 * Returns the value of the '<em><b>Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format String</em>' attribute.
	 * @see #setFormatString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDtoAttribute_FormatString()
	 * @model
	 * @generated
	 */
	String getFormatString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getFormatString <em>Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format String</em>' attribute.
	 * @see #getFormatString()
	 * @generated
	 */
	void setFormatString(String value);

	/**
	 * Returns the value of the '<em><b>Format Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Const</em>' reference.
	 * @see #setFormatConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDtoAttribute_FormatConst()
	 * @model
	 * @generated
	 */
	MobaConstant getFormatConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDtoAttribute#getFormatConst <em>Format Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Const</em>' reference.
	 * @see #getFormatConst()
	 * @generated
	 */
	void setFormatConst(MobaConstant value);

	/**
	 * Returns the format. From {@link #getFormatString()} or
	 * {@link #getFormatConstant()}. If values are empty and datatype is date, then the dateFormat will be returned.
	 * 
	 * @return
	 */
	String getFormat();
	
} // MobaPayloadAttribute
