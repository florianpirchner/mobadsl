/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Digits Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterIntegerValue <em>Filter Integer Value</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterIntegerConst <em>Filter Integer Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterFractionValue <em>Filter Fraction Value</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterFractionConst <em>Filter Fraction Const</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDigitsConstraint()
 * @model
 * @generated
 */
public interface MobaDigitsConstraint extends MobaConstraint {
	/**
	 * Returns the value of the '<em><b>Filter Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Integer Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Integer Value</em>' attribute.
	 * @see #setFilterIntegerValue(int)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDigitsConstraint_FilterIntegerValue()
	 * @model
	 * @generated
	 */
	int getFilterIntegerValue();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterIntegerValue <em>Filter Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Integer Value</em>' attribute.
	 * @see #getFilterIntegerValue()
	 * @generated
	 */
	void setFilterIntegerValue(int value);

	/**
	 * Returns the value of the '<em><b>Filter Integer Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Integer Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Integer Const</em>' reference.
	 * @see #setFilterIntegerConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDigitsConstraint_FilterIntegerConst()
	 * @model
	 * @generated
	 */
	MobaConstant getFilterIntegerConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterIntegerConst <em>Filter Integer Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Integer Const</em>' reference.
	 * @see #getFilterIntegerConst()
	 * @generated
	 */
	void setFilterIntegerConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Filter Fraction Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Fraction Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Fraction Value</em>' attribute.
	 * @see #setFilterFractionValue(int)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDigitsConstraint_FilterFractionValue()
	 * @model
	 * @generated
	 */
	int getFilterFractionValue();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterFractionValue <em>Filter Fraction Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Fraction Value</em>' attribute.
	 * @see #getFilterFractionValue()
	 * @generated
	 */
	void setFilterFractionValue(int value);

	/**
	 * Returns the value of the '<em><b>Filter Fraction Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Fraction Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Fraction Const</em>' reference.
	 * @see #setFilterFractionConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaDigitsConstraint_FilterFractionConst()
	 * @model
	 * @generated
	 */
	MobaConstant getFilterFractionConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaDigitsConstraint#getFilterFractionConst <em>Filter Fraction Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Fraction Const</em>' reference.
	 * @see #getFilterFractionConst()
	 * @generated
	 */
	void setFilterFractionConst(MobaConstant value);

} // MobaDigitsConstraint
