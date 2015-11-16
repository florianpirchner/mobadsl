/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bluetooth Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaBluetoothModule#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaBluetoothModule()
 * @model
 * @generated
 */
public interface MobaBluetoothModule extends MobaExternalModule {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.mobadsl.semantic.model.moba.MobaBlueToothModuleType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaBlueToothModuleType
	 * @see #setType(MobaBlueToothModuleType)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaBluetoothModule_Type()
	 * @model
	 * @generated
	 */
	MobaBlueToothModuleType getType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaBluetoothModule#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaBlueToothModuleType
	 * @see #getType()
	 * @generated
	 */
	void setType(MobaBlueToothModuleType value);

} // MobaBluetoothModule
