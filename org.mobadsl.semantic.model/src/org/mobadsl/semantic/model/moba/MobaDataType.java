/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Data Type</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isPrimitive <em>Primitive</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isString <em>String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isNumeric <em>Numeric</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isDecimal <em>Decimal</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isDate <em>Date</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isTime <em>Time</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isTimestamp <em>Timestamp</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#getEnumAST <em>Enum AST</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#isArray <em>Array</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatString <em>Date Format String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatConst <em>Date Format Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDataType#getSuperType <em>Super Type</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType()
 * @model
 * @generated
 */
public interface MobaDataType extends MobaApplicationFeature, MobaConstraintable {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Primitive</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Primitive</em>' attribute.
	 * @see #setPrimitive(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Primitive()
	 * @model
	 * @generated
	 */
	boolean isPrimitive();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaDataType#isPrimitive
	 * <em>Primitive</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Primitive</em>' attribute.
	 * @see #isPrimitive()
	 * @generated
	 */
	void setPrimitive(boolean value);

	/**
	 * Returns the value of the '<em><b>String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String</em>' attribute.
	 * @see #setString(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_String()
	 * @model
	 * @generated
	 */
	boolean isString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isString <em>String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String</em>' attribute.
	 * @see #isString()
	 * @generated
	 */
	void setString(boolean value);

	/**
	 * Returns the value of the '<em><b>Numeric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Numeric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Numeric</em>' attribute.
	 * @see #setNumeric(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Numeric()
	 * @model
	 * @generated
	 */
	boolean isNumeric();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isNumeric <em>Numeric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Numeric</em>' attribute.
	 * @see #isNumeric()
	 * @generated
	 */
	void setNumeric(boolean value);

	/**
	 * Returns the value of the '<em><b>Decimal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decimal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decimal</em>' attribute.
	 * @see #setDecimal(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Decimal()
	 * @model
	 * @generated
	 */
	boolean isDecimal();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isDecimal <em>Decimal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decimal</em>' attribute.
	 * @see #isDecimal()
	 * @generated
	 */
	void setDecimal(boolean value);

	/**
	 * Returns the value of the '<em><b>Array</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Array</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Array</em>' attribute.
	 * @see #setArray(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Array()
	 * @model
	 * @generated
	 */
	boolean isArray();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isArray <em>Array</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array</em>' attribute.
	 * @see #isArray()
	 * @generated
	 */
	void setArray(boolean value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Date()
	 * @model
	 * @generated
	 */
	boolean isDate();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #isDate()
	 * @generated
	 */
	void setDate(boolean value);

	/**
	 * Returns the value of the '<em><b>Date Format String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format String</em>' attribute isn't
	 * clear, there really should be more of a description here...
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
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Date Format String</em>' attribute.
	 * @see #getDateFormatString()
	 * @generated
	 */
	void setDateFormatString(String value);

	/**
	 * Returns the value of the '<em><b>Date Format Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Format Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Format Const</em>' reference.
	 * @see #setDateFormatConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_DateFormatConst()
	 * @model
	 * @generated
	 */
	MobaConstant getDateFormatConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#getDateFormatConst <em>Date Format Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Date Format Const</em>' reference.
	 * @see #getDateFormatConst()
	 * @generated
	 */
	void setDateFormatConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(MobaDataType)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_SuperType()
	 * @model
	 * @generated
	 */
	MobaDataType getSuperType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaDataType value);

	/**
	 * Returns the value of the '<em><b>Enum AST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum AST</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum AST</em>' containment reference.
	 * @see #setEnumAST(MobaEnum)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_EnumAST()
	 * @model containment="true"
	 * @generated
	 */
	MobaEnum getEnumAST();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#getEnumAST <em>Enum AST</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Enum AST</em>' containment reference.
	 * @see #getEnumAST()
	 * @generated
	 */
	void setEnumAST(MobaEnum value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time</em>' attribute.
	 * @see #setTime(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Time()
	 * @model
	 * @generated
	 */
	boolean isTime();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isTime <em>Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' attribute.
	 * @see #isTime()
	 * @generated
	 */
	void setTime(boolean value);

	/**
	 * Returns the value of the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Timestamp</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timestamp</em>' attribute.
	 * @see #setTimestamp(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDataType_Timestamp()
	 * @model
	 * @generated
	 */
	boolean isTimestamp();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDataType#isTimestamp <em>Timestamp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Timestamp</em>' attribute.
	 * @see #isTimestamp()
	 * @generated
	 */
	void setTimestamp(boolean value);

	/**
	 * Returns the dateformat. From {@link #getDateFormatString()} or
	 * {@link #getDateFormatConstant()}
	 * 
	 * @return
	 */
	String getDateFormat();

	/**
	 * Returns the root datatype.<br>
	 * Means finding a transitive {@link #getSuperType()} that has no superType.
	 * 
	 * @return
	 */
	MobaDataType getRootType();

	/**
	 * A datatype is a roottype if is has no {@link #getSuperType() superType}.
	 * 
	 * @return
	 */
	boolean isRootType();

	/**
	 * Returns true, if this instance represents an Enum.
	 * 
	 * @return
	 */
	boolean isEnum();

	/**
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaConstraint> getAllConstraints();
	
	/**
	 * Returns all super types by traversing the {@link #getSuperType()}
	 * reference to the root element.
	 * 
	 * @return
	 * @throws RecursionException
	 */
	List<MobaDataType> getAllSuperTypes() throws RecursionException;

} // MobaDataType
