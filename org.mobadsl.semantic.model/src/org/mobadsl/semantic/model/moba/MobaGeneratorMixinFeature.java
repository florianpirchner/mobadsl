/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generator Mixin Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature#getGeneratorRef <em>Generator Ref</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeneratorMixinFeature()
 * @model
 * @generated
 */
public interface MobaGeneratorMixinFeature extends MobaGeneratorFeature {
	/**
	 * Returns the value of the '<em><b>Generator Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Ref</em>' reference.
	 * @see #setGeneratorRef(MobaGenerator)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeneratorMixinFeature_GeneratorRef()
	 * @model
	 * @generated
	 */
	MobaGenerator getGeneratorRef();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature#getGeneratorRef <em>Generator Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Ref</em>' reference.
	 * @see #getGeneratorRef()
	 * @generated
	 */
	void setGeneratorRef(MobaGenerator value);

} // MobaGeneratorMixinFeature
