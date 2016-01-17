/**
 */
package org.mobadsl.semantic.model.moba;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getType <em>Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getKeyString <em>Key String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getKeyConst <em>Key Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getKey <em>Key</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueString <em>Value String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueConst <em>Value Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueDouble <em>Value Double</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueInt <em>Value Int</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValue <em>Value</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getFormatString <em>Format String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getFormatConst <em>Format Const</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute()
 * @model
 * @generated
 */
public interface MobaRESTAttribute extends MobaRESTAbstractAttribute {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_Type()
	 * @model
	 * @generated
	 */
	MobaDataType getType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(MobaDataType value);

	/**
	 * Returns the value of the '<em><b>Key String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key String</em>' attribute.
	 * @see #setKeyString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_KeyString()
	 * @model
	 * @generated
	 */
	String getKeyString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getKeyString <em>Key String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key String</em>' attribute.
	 * @see #getKeyString()
	 * @generated
	 */
	void setKeyString(String value);

	/**
	 * Returns the value of the '<em><b>Key Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key Const</em>' reference.
	 * @see #setKeyConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_KeyConst()
	 * @model
	 * @generated
	 */
	MobaConstant getKeyConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getKeyConst <em>Key Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key Const</em>' reference.
	 * @see #getKeyConst()
	 * @generated
	 */
	void setKeyConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_Key()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Returns the value of the '<em><b>Value String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value String</em>' attribute.
	 * @see #setValueString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_ValueString()
	 * @model
	 * @generated
	 */
	String getValueString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueString <em>Value String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value String</em>' attribute.
	 * @see #getValueString()
	 * @generated
	 */
	void setValueString(String value);

	/**
	 * Returns the value of the '<em><b>Value Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Const</em>' reference.
	 * @see #setValueConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_ValueConst()
	 * @model
	 * @generated
	 */
	MobaConstant getValueConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueConst <em>Value Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Const</em>' reference.
	 * @see #getValueConst()
	 * @generated
	 */
	void setValueConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Value Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Double</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Double</em>' attribute.
	 * @see #setValueDouble(Double)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_ValueDouble()
	 * @model
	 * @generated
	 */
	Double getValueDouble();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueDouble <em>Value Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Double</em>' attribute.
	 * @see #getValueDouble()
	 * @generated
	 */
	void setValueDouble(Double value);

	/**
	 * Returns the value of the '<em><b>Value Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Int</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Int</em>' attribute.
	 * @see #setValueInt(Integer)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_ValueInt()
	 * @model
	 * @generated
	 */
	Integer getValueInt();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getValueInt <em>Value Int</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Int</em>' attribute.
	 * @see #getValueInt()
	 * @generated
	 */
	void setValueInt(Integer value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_Value()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getValue();
	
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_FormatString()
	 * @model
	 * @generated
	 */
	String getFormatString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getFormatString <em>Format String</em>}' attribute.
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTAttribute_FormatConst()
	 * @model
	 * @generated
	 */
	MobaConstant getFormatConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRESTAttribute#getFormatConst <em>Format Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Const</em>' reference.
	 * @see #getFormatConst()
	 * @generated
	 */
	void setFormatConst(MobaConstant value);

	/**
	 * Returns the {@link ValueType} of the set value.
	 * 
	 * @return
	 */
	ValueType getValueType();

	/**
	 * Returns the format. From {@link #getFormatString()} or
	 * {@link #getFormatConstant()}. If values are empty and datatype is date, then the dateFormat will be returned.
	 * 
	 * @return
	 */
	String getFormat();
	
} // MobaRESTAttribute
