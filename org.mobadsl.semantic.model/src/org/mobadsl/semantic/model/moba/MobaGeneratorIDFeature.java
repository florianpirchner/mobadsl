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
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorId <em>Generator Id</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorVersion <em>Generator Version</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeneratorIDFeature()
 * @model
 * @generated
 */
public interface MobaGeneratorIDFeature extends MobaGeneratorFeature {
	/**
	 * Returns the value of the '<em><b>Generator Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Id</em>' attribute.
	 * @see #setGeneratorId(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeneratorIDFeature_GeneratorId()
	 * @model
	 * @generated
	 */
	String getGeneratorId();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorId <em>Generator Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Id</em>' attribute.
	 * @see #getGeneratorId()
	 * @generated
	 */
	void setGeneratorId(String value);

	/**
	 * Returns the value of the '<em><b>Generator Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generator Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generator Version</em>' attribute.
	 * @see #setGeneratorVersion(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaGeneratorIDFeature_GeneratorVersion()
	 * @model
	 * @generated
	 */
	String getGeneratorVersion();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature#getGeneratorVersion <em>Generator Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Generator Version</em>' attribute.
	 * @see #getGeneratorVersion()
	 * @generated
	 */
	void setGeneratorVersion(String value);

} // MobaGeneratorIDFeature
