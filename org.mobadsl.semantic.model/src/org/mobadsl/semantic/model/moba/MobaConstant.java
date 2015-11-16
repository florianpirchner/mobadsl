/**
 */
package org.mobadsl.semantic.model.moba;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Constant</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaConstant#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaConstant#getValueAST <em>Value AST</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstant()
 * @model
 * @generated
 */
public interface MobaConstant extends MobaPropertiesAble {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstant_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaConstant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Value AST</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value AST</em>' containment reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value AST</em>' containment reference.
	 * @see #setValueAST(MobaConstantValue)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaConstant_ValueAST()
	 * @model containment="true"
	 * @generated
	 */
	MobaConstantValue getValueAST();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaConstant#getValueAST <em>Value AST</em>}' containment reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Value AST</em>' containment reference.
	 * @see #getValueAST()
	 * @generated
	 */
	void setValueAST(MobaConstantValue value);

	/**
	 * Returns the String representation of the {@link #getValueAST()}
	 * 
	 * @return
	 */
	String getValue();
	
} // MobaConstant
