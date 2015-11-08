/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isPrimitive <em>Primitive</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isArray <em>Array</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isDate <em>Date</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatString <em>Date Format String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatConstant <em>Date Format Constant</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType()
 * @model
 * @generated
 */
public interface MobaDataType extends MobaApplicationFeature, MobaPropertiesProvider {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see #setPrimitive(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Primitive()
	 * @model
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isPrimitive <em>Primitive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primitive</em>' attribute.
	 * @see #isPrimitive()
	 * @generated
	 */
	void setPrimitive(boolean value);

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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Array()
	 * @model
	 * @generated
	 */
	boolean isArray();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #isArray()
	 * @generated
	 */
	void setArray(boolean value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Date()
	 * @model
	 * @generated
	 */
	boolean isDate();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #isDate()
	 * @generated
	 */
	void setDate(boolean value);

	/**
	 * Returns the value of the '<em><b>Date Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format String</em>' attribute.
	 * @see #setDateFormatString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_DateFormatString()
	 * @model
	 * @generated
	 */
	String getDateFormatString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatString <em>Date Format String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format String</em>' attribute.
	 * @see #getDateFormatString()
	 * @generated
	 */
	void setDateFormatString(String value);

	/**
	 * Returns the value of the '<em><b>Date Format Constant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format Constant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format Constant</em>' reference.
	 * @see #setDateFormatConstant(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_DateFormatConstant()
	 * @model
	 * @generated
	 */
	MobaConstant getDateFormatConstant();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatConstant <em>Date Format Constant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Format Constant</em>' reference.
	 * @see #getDateFormatConstant()
	 * @generated
	 */
	void setDateFormatConstant(MobaConstant value);
	
	/**
	 * Returns the dateformat. From {@link #getDateFormatString()} or {@link #getDateFormatConstant()}
	 * @return
	 */
	String getDateFormat();

} // MobaDataType
