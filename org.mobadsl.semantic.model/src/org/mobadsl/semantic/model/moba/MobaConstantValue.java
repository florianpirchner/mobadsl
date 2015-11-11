/**
 */
package org.mobadsl.semantic.model.moba;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Constant Value</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueConst <em>Value Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getTail <em>Tail</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueInt <em>Value Int</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueDouble <em>Value Double</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstantValue()
 * @model
 * @generated
 */
public interface MobaConstantValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Value String</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value String</em>' attribute.
	 * @see #setValueString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstantValue_ValueString()
	 * @model
	 * @generated
	 */
	String getValueString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueString <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' attribute.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(String value);

	/**
	 * Returns the value of the '<em><b>Value Const</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Const</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Const</em>' reference.
	 * @see #setValueConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstantValue_ValueConst()
	 * @model
	 * @generated
	 */
	MobaConstant getValueConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueConst <em>Value Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Value Const</em>' reference.
	 * @see #getValueConst()
	 * @generated
	 */
	void setValueConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Tail</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tail</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tail</em>' containment reference.
	 * @see #setTail(MobaConstantValue)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstantValue_Tail()
	 * @model containment="true"
	 * @generated
	 */
	MobaConstantValue getTail();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getTail <em>Tail</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Tail</em>' containment reference.
	 * @see #getTail()
	 * @generated
	 */
	void setTail(MobaConstantValue value);

	/**
	 * Returns the value of the '<em><b>Value Int</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Int</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Int</em>' attribute.
	 * @see #setValueInt(Integer)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstantValue_ValueInt()
	 * @model
	 * @generated
	 */
	Integer getValueInt();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueInt
	 * <em>Value Int</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Value Int</em>' attribute.
	 * @see #getValueInt()
	 * @generated
	 */
	void setValueInt(Integer value);

	/**
	 * Returns the value of the '<em><b>Value Double</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Double</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Value Double</em>' attribute.
	 * @see #setValueDouble(Double)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstantValue_ValueDouble()
	 * @model
	 * @generated
	 */
	Double getValueDouble();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaConstantValue#getValueDouble <em>Value Double</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Value Double</em>' attribute.
	 * @see #getValueDouble()
	 * @generated
	 */
	void setValueDouble(Double value);

	/**
	 * Returns the string representation of this constant value and it's tail.
	 * 
	 * @return
	 */
	String getValue();

	/**
	 * Returns the {@link ValueType} of the set value.
	 * 
	 * @return
	 */
	ValueType getValueType();

	/**
	 * The type of value contained in the constant value.
	 * <ul>
	 * <li>{@link #CONSTANT} means {@link MobaConstantValue#getValueConst()}
	 * </li>
	 * <li>{@link #STRING} means {@link MobaConstantValue#getValueString()}</li>
	 * <li>{@link #INT} means {@link MobaConstantValue#getValueInt()}</li>
	 * <li>{@link #DOUBLE} means {@link MobaConstantValue#getValueDouble()}</li>
	 * </ul>
	 */
	public enum ValueType {
		CONSTANT, STRING, INT, DOUBLE
	}

} // MobaConstantValue
