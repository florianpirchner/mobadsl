/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dto Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaBeanReference#isCascading <em>Cascading</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaBeanReference#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaBeanReference#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaBeanReference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaBeanReference()
 * @model
 * @generated
 */
public interface MobaBeanReference extends MobaBeanFeature, MobaMultiplicityAble, MobaPropertiesAble {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaBeanReference_Cascading()
	 * @model
	 * @generated
	 */
	boolean isCascading();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaBeanReference#isCascading <em>Cascading</em>}' attribute.
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaBeanReference_Lazy()
	 * @model
	 * @generated
	 */
	boolean isLazy();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaBeanReference#isLazy <em>Lazy</em>}' attribute.
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaBeanReference_Transient()
	 * @model
	 * @generated
	 */
	boolean isTransient();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaBeanReference#isTransient <em>Transient</em>}' attribute.
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
	 * @see #setType(MobaBean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaBeanReference_Type()
	 * @model
	 * @generated
	 */
	MobaBean getType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaBeanReference#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MobaBean value);

} // MobaDtoReference
