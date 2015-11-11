/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaTemplate#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaTemplate#getDownloadTemplate <em>Download Template</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaTemplate()
 * @model
 * @generated
 */
public interface MobaTemplate extends MobaApplicationFeature {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(MobaApplication)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaTemplate_Template()
	 * @model
	 * @generated
	 */
	MobaApplication getTemplate();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaTemplate#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(MobaApplication value);

	/**
	 * Returns the value of the '<em><b>Download Template</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Download Template</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Download Template</em>' attribute.
	 * @see #setDownloadTemplate(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaTemplate_DownloadTemplate()
	 * @model
	 * @generated
	 */
	String getDownloadTemplate();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaTemplate#getDownloadTemplate <em>Download Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Download Template</em>' attribute.
	 * @see #getDownloadTemplate()
	 * @generated
	 */
	void setDownloadTemplate(String value);

} // MobaTemplate
