/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Server</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaServer#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaServer#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaServer#getUrl <em>Url</em>}</li>
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
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaServer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Super Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Super Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Type</em>' reference.
	 * @see #setSuperType(MobaServer)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_SuperType()
	 * @model
	 * @generated
	 */
	MobaServer getSuperType();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaServer#getSuperType <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaServer value);

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see #setUrl(String)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaServer#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

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
	 * The list contents are of type {@link org.mobadsl.semantic.model.moba.MobaAuthorization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization</em>' reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaServer_Authorization()
	 * @model
	 * @generated
	 */
	EList<MobaAuthorization> getAuthorization();
	
	/**
	 * Returns all services including superTypes.
	 * @return
	 */
	public List<MobaREST> getAllServices();
	
	/**
	 * Returns services required for generator stuff.
	 * @return
	 */
	public List<MobaREST> getGenServices();

} // MobaServer
