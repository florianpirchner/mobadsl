/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Payload Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#getDto <em>Dto</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#isArray <em>Array</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#getSerializationType <em>Serialization Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTPayloadDefinition()
 * @model
 * @generated
 */
public interface MobaRESTPayloadDefinition extends EObject {
	/**
	 * Returns the value of the '<em><b>Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dto</em>' reference.
	 * @see #setDto(MobaDto)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTPayloadDefinition_Dto()
	 * @model
	 * @generated
	 */
	MobaDto getDto();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#getDto <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dto</em>' reference.
	 * @see #getDto()
	 * @generated
	 */
	void setDto(MobaDto value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTPayloadDefinition_Array()
	 * @model
	 * @generated
	 */
	boolean isArray();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#isArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #isArray()
	 * @generated
	 */
	void setArray(boolean value);

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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTPayloadDefinition_SerializationType()
	 * @model
	 * @generated
	 */
	MobaTransportSerializationType getSerializationType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition#getSerializationType <em>Serialization Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Serialization Type</em>' reference.
	 * @see #getSerializationType()
	 * @generated
	 */
	void setSerializationType(MobaTransportSerializationType value);

} // MobaRESTPayloadDefinition
