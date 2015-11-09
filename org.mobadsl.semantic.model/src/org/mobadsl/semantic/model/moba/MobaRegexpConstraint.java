/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regexp Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint#getFilterString <em>Filter String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint#getFilterConst <em>Filter Const</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRegexpConstraint()
 * @model
 * @generated
 */
public interface MobaRegexpConstraint extends MobaConstraint {

	/**
	 * Returns the value of the '<em><b>Filter String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter String</em>' attribute.
	 * @see #setFilterString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRegexpConstraint_FilterString()
	 * @model
	 * @generated
	 */
	String getFilterString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint#getFilterString <em>Filter String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter String</em>' attribute.
	 * @see #getFilterString()
	 * @generated
	 */
	void setFilterString(String value);

	/**
	 * Returns the value of the '<em><b>Filter Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filter Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filter Const</em>' reference.
	 * @see #setFilterConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRegexpConstraint_FilterConst()
	 * @model
	 * @generated
	 */
	MobaConstant getFilterConst();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaRegexpConstraint#getFilterConst <em>Filter Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filter Const</em>' reference.
	 * @see #getFilterConst()
	 * @generated
	 */
	void setFilterConst(MobaConstant value);
	
	/**
	 * Returns the filter value. First it tries to get the value form
	 * {@link #getValueConst()}. If not available, it returns
	 * {@link #getValueString()}.
	 * 
	 * @return
	 */
	String getFilter();
	
} // MobaRegexpConstraint
