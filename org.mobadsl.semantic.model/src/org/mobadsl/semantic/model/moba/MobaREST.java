/**
 */
package org.mobadsl.semantic.model.moba;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REST</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaREST#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaREST#getUrl <em>Url</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaREST#isBigData <em>Big Data</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaREST#getRequestDto <em>Request Dto</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaREST#getResponseDto <em>Response Dto</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.MobaREST#getErrorDto <em>Error Dto</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaREST()
 * @model abstract="true"
 * @generated
 */
public interface MobaREST extends MobaApplicationFeature {
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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaREST_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaREST#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaREST_Url()
	 * @model
	 * @generated
	 */
	String getUrl();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaREST#getUrl <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url</em>' attribute.
	 * @see #getUrl()
	 * @generated
	 */
	void setUrl(String value);

	/**
	 * Returns the value of the '<em><b>Big Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Big Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Big Data</em>' attribute.
	 * @see #setBigData(boolean)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaREST_BigData()
	 * @model
	 * @generated
	 */
	boolean isBigData();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaREST#isBigData <em>Big Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Big Data</em>' attribute.
	 * @see #isBigData()
	 * @generated
	 */
	void setBigData(boolean value);

	/**
	 * Returns the value of the '<em><b>Request Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Dto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Dto</em>' reference.
	 * @see #setRequestDto(MobaDto)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaREST_RequestDto()
	 * @model
	 * @generated
	 */
	MobaDto getRequestDto();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaREST#getRequestDto <em>Request Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Dto</em>' reference.
	 * @see #getRequestDto()
	 * @generated
	 */
	void setRequestDto(MobaDto value);

	/**
	 * Returns the value of the '<em><b>Response Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Dto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Dto</em>' reference.
	 * @see #setResponseDto(MobaDto)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaREST_ResponseDto()
	 * @model
	 * @generated
	 */
	MobaDto getResponseDto();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaREST#getResponseDto <em>Response Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Dto</em>' reference.
	 * @see #getResponseDto()
	 * @generated
	 */
	void setResponseDto(MobaDto value);

	/**
	 * Returns the value of the '<em><b>Error Dto</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Error Dto</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Error Dto</em>' reference.
	 * @see #setErrorDto(MobaDto)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaREST_ErrorDto()
	 * @model
	 * @generated
	 */
	MobaDto getErrorDto();

	/**
	 * Sets the value of the '{@link org.mobadsl.semantic.model.moba.MobaREST#getErrorDto <em>Error Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Error Dto</em>' reference.
	 * @see #getErrorDto()
	 * @generated
	 */
	void setErrorDto(MobaDto value);

} // MobaREST
