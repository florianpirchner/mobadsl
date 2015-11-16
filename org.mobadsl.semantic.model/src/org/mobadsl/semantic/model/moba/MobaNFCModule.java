/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NFC Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaNFCModule#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaNFCModule()
 * @model
 * @generated
 */
public interface MobaNFCModule extends MobaExternalModule {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mobadsl.semantic.model.moba.MobaNFCModuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaNFCModuleType
	 * @see #setType(MobaNFCModuleType)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaNFCModule_Type()
	 * @model
	 * @generated
	 */
	MobaNFCModuleType getType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaNFCModule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaNFCModuleType
	 * @see #getType()
	 * @generated
	 */
	void setType(MobaNFCModuleType value);

} // MobaNFCModule
