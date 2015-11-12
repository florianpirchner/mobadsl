/**
 */
package org.mobadsl.semantic.model.moba;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Generator ID Feature</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorConst
 * <em>Generator Const</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorString
 * <em>Generator String</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeneratorIDFeature()
 * @model
 * @generated
 */
public interface MobaGeneratorIDFeature extends MobaGeneratorFeature {
	/**
	 * Returns the value of the '<em><b>Generator Const</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Const</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generator Const</em>' reference.
	 * @see #setGeneratorConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeneratorIDFeature_GeneratorConst()
	 * @model
	 * @generated
	 */
	MobaConstant getGeneratorConst();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorConst
	 * <em>Generator Const</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Generator Const</em>' reference.
	 * @see #getGeneratorConst()
	 * @generated
	 */
	void setGeneratorConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Generator String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Generator String</em>' attribute.
	 * @see #setGeneratorString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeneratorIDFeature_GeneratorString()
	 * @model
	 * @generated
	 */
	String getGeneratorString();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorString
	 * <em>Generator String</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Generator String</em>' attribute.
	 * @see #getGeneratorString()
	 * @generated
	 */
	void setGeneratorString(String value);

} // MobaGeneratorIDFeature
