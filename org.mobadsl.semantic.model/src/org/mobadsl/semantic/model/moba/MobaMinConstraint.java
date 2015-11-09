/**
 */
package org.mobadsl.semantic.model.moba;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Min Constraint</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaMinConstraint#getFilterValue <em>Filter Value</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaMinConstraint#getFilterConst <em>Filter Const</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaMinConstraint()
 * @model
 * @generated
 */
public interface MobaMinConstraint extends MobaConstraint {

	/**
	 * Returns the value of the '<em><b>Filter Value</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Filter Value</em>' attribute.
	 * @see #setFilterValue(float)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaMinConstraint_FilterValue()
	 * @model
	 * @generated
	 */
	float getFilterValue();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaMinConstraint#getFilterValue <em>Filter Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Filter Value</em>' attribute.
	 * @see #getFilterValue()
	 * @generated
	 */
	void setFilterValue(float value);

	/**
	 * Returns the value of the '<em><b>Filter Const</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Filter Const</em>' reference.
	 * @see #setFilterConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaMinConstraint_FilterConst()
	 * @model
	 * @generated
	 */
	MobaConstant getFilterConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaMinConstraint#getFilterConst <em>Filter Const</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Filter Const</em>' reference.
	 * @see #getFilterConst()
	 * @generated
	 */
	void setFilterConst(MobaConstant value);

	/**
	 * Returns the filter value. First it tries to get the value form
	 * {@link #getFilterConst()}. If not available, it returns a parsed
	 * {@link #getFilterValue()}. If {@link #getFilterConst()} is not
	 * convertable to <code>float</code>, then an {@link IllegalStateException}
	 * is thrown.
	 * 
	 * @return
	 * @throws IllegalStateException if the constant value is not convertible to float.
	 */
	float getFilter();
} // MobaMinConstraint
