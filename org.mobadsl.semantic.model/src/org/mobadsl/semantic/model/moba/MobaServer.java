/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Server</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaServer#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaServer#getUrlString <em>Url String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaServer#getUrlConst <em>Url Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaServer#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaServer#getServices <em>Services</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaServer#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer()
 * @model
 * @generated
 */
public interface MobaServer extends MobaApplicationFeature {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaServer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Url String</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url String</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Url String</em>' attribute.
	 * @see #setUrlString(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_UrlString()
	 * @model
	 * @generated
	 */
	String getUrlString();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaServer#getUrlString <em>Url String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Url String</em>' attribute.
	 * @see #getUrlString()
	 * @generated
	 */
	void setUrlString(String value);

	/**
	 * Returns the value of the '<em><b>Url Const</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Const</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Url Const</em>' reference.
	 * @see #setUrlConst(MobaConstant)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_UrlConst()
	 * @model
	 * @generated
	 */
	MobaConstant getUrlConst();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaServer#getUrlConst
	 * <em>Url Const</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Url Const</em>' reference.
	 * @see #getUrlConst()
	 * @generated
	 */
	void setUrlConst(MobaConstant value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(MobaServer)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_SuperType()
	 * @model
	 * @generated
	 */
	MobaServer getSuperType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaServer#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaServer value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' reference list.
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaREST}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_Services()
	 * @model
	 * @generated
	 */
	EList<MobaREST> getServices();

	/**
	 * Returns the value of the '<em><b>Authorization</b></em>' reference list.
	 * The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaAuthorization}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Authorization</em>' reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_Authorization()
	 * @model
	 * @generated
	 */
	EList<MobaAuthorization> getAuthorization();

	/**
	 * Returns all services including superTypes.
	 * 
	 * @return
	 */
	public List<MobaREST> getAllServices();

	/**
	 * Returns services required for generator stuff.
	 * 
	 * @return
	 */
	public List<MobaREST> getGenServices();

	/**
	 * Returns the URL of the server using {@link #getUrlString()} and
	 * {@link #getUrlConst()}.
	 * 
	 * @return
	 */
	public String getURL();

} // MobaServer
