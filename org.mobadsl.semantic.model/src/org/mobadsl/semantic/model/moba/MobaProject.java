/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProject#getUiApplication <em>Ui Application</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProject#getBackgroundApplication <em>Background Application</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProject()
 * @model
 * @generated
 */
public interface MobaProject extends MobaModelFeature {
	/**
	 * Returns the value of the '<em><b>Ui Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Application</em>' reference.
	 * @see #setUiApplication(MobaApplication)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProject_UiApplication()
	 * @model
	 * @generated
	 */
	MobaApplication getUiApplication();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaProject#getUiApplication <em>Ui Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Application</em>' reference.
	 * @see #getUiApplication()
	 * @generated
	 */
	void setUiApplication(MobaApplication value);

	/**
	 * Returns the value of the '<em><b>Background Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Application</em>' reference.
	 * @see #setBackgroundApplication(MobaApplication)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProject_BackgroundApplication()
	 * @model
	 * @generated
	 */
	MobaApplication getBackgroundApplication();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaProject#getBackgroundApplication <em>Background Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Application</em>' reference.
	 * @see #getBackgroundApplication()
	 * @generated
	 */
	void setBackgroundApplication(MobaApplication value);

} // MobaProject
