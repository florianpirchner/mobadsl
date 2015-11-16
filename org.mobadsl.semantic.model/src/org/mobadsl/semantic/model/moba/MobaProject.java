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
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProject#getId <em>Id</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProject#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProject#getVersion <em>Version</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProject#getUiApplication <em>Ui Application</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaProject#getBackgroundApplication <em>Background Application</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProject()
 * @model
 * @generated
 */
public interface MobaProject extends MobaFriendsAble {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #isSetId()
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProject_Id()
	 * @model unsettable="true" transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getId();

	/**
	 * Returns whether the value of the '{@link org.mobadsl.semantic.model.moba.MobaProject#getId <em>Id</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Id</em>' attribute is set.
	 * @see #getId()
	 * @generated
	 */
	boolean isSetId();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProject_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaProject#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProject_Version()
	 * @model
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaProject#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Ui Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ui Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ui Application</em>' reference.
	 * @see #setUiApplication(MobaUiApplication)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProject_UiApplication()
	 * @model
	 * @generated
	 */
	MobaUiApplication getUiApplication();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaProject#getUiApplication <em>Ui Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ui Application</em>' reference.
	 * @see #getUiApplication()
	 * @generated
	 */
	void setUiApplication(MobaUiApplication value);

	/**
	 * Returns the value of the '<em><b>Background Application</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Background Application</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Background Application</em>' reference.
	 * @see #setBackgroundApplication(MobaBackgroundApplication)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaProject_BackgroundApplication()
	 * @model
	 * @generated
	 */
	MobaBackgroundApplication getBackgroundApplication();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaProject#getBackgroundApplication <em>Background Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Application</em>' reference.
	 * @see #getBackgroundApplication()
	 * @generated
	 */
	void setBackgroundApplication(MobaBackgroundApplication value);

} // MobaProject
