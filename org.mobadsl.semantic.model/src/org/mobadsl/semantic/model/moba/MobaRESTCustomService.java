/**
 */
package org.mobadsl.semantic.model.moba;

import java.util.List;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>REST Custom Service</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getOperation
 * <em>Operation</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getParameters
 * <em>Parameters</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getSuperType
 * <em>Super Type</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getMultipartParameters
 * <em>Multipart Parameters</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService()
 * @model
 * @generated
 */
public interface MobaRESTCustomService extends MobaREST {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' attribute. The
	 * literals are from the enumeration
	 * {@link org.mobadsl.semantic.model.moba.MobaRESTMethods}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Operation</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTMethods
	 * @see #setOperation(MobaRESTMethods)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService_Operation()
	 * @model
	 * @generated
	 */
	MobaRESTMethods getOperation();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getOperation
	 * <em>Operation</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Operation</em>' attribute.
	 * @see org.mobadsl.semantic.model.moba.MobaRESTMethods
	 * @see #getOperation()
	 * @generated
	 */
	void setOperation(MobaRESTMethods value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Parameters</em>' containment reference
	 *         list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaRESTAbstractAttribute> getParameters();

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
	 * @see #setSuperType(MobaRESTCustomService)
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService_SuperType()
	 * @model
	 * @generated
	 */
	MobaRESTCustomService getSuperType();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.MobaRESTCustomService#getSuperType
	 * <em>Super Type</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Super Type</em>' reference.
	 * @see #getSuperType()
	 * @generated
	 */
	void setSuperType(MobaRESTCustomService value);

	/**
	 * Returns the value of the '<em><b>Multipart Parameters</b></em>'
	 * containment reference list. The list contents are of type
	 * {@link org.mobadsl.semantic.model.moba.MobaRESTAbstractAttribute}. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multipart Parameters</em>' containment
	 * reference list isn't clear, there really should be more of a description
	 * here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Multipart Parameters</em>' containment
	 *         reference list.
	 * @see org.mobadsl.semantic.model.moba.MobaPackage#getMobaRESTCustomService_MultipartParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<MobaRESTAbstractAttribute> getMultipartParameters();

	/**
	 * Returns all parameters from the rest. Including <b>Attributes</b> and
	 * <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaRESTAbstractAttribute> getAllParameters();

	/**
	 * Returns all multipartParameters from the rest. Including
	 * <b>Attributes</b> and <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 * @return
	 */
	List<MobaRESTAbstractAttribute> getAllMultipartParameters();

	/**
	 * Returns all multipartParameters from the rest. Excluding
	 * <b>Attributes</b>. And including <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 */
	List<MobaRESTDtoAttribute> getAllMultipartDtoAttributes();

	/**
	 * Returns all multipartParameters from the rest. Including
	 * <b>Attributes</b>. And excluding <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 */
	List<MobaRESTAttribute> getAllMultipartAttributes();

	/**
	 * Returns generator multipartParameters from the rest. Excluding
	 * <b>Attributes</b>. And including <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the generator specific values for the current instance. Including
	 * the "super types".
	 * <p>
	 * The difference to getAll...() is, that shadowed values are replaces with
	 * their new representation. For instance, if a feature #name is defined in
	 * superType and in this instance, then the #name value from this instance
	 * will be put at the original index from #name in the superType.
	 * 
	 * @return
	 */
	List<MobaRESTDtoAttribute> getGenMultipartDtoAttributes();

	/**
	 * Returns generator multipartParameters from the rest. Including
	 * <b>Attributes</b>. And excluding <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the generator specific values for the current instance. Including
	 * the "super types".
	 * <p>
	 * The difference to getAll...() is, that shadowed values are replaces with
	 * their new representation. For instance, if a feature #name is defined in
	 * superType and in this instance, then the #name value from this instance
	 * will be put at the original index from #name in the superType.
	 * 
	 * @return
	 */
	List<MobaRESTAttribute> getGenMultipartAttributes();

	/**
	 * Returns all parameters from the rest. Excluding <b>Attributes</b>. And
	 * including <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 */
	List<MobaRESTDtoAttribute> getAllParameterDtoAttributes();

	/**
	 * Returns generator parameters from the rest. Excluding <b>Attributes</b>.
	 * And including <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the generator specific values for the current instance. Including
	 * the "super types".
	 * <p>
	 * The difference to getAll...() is, that shadowed values are replaces with
	 * their new representation. For instance, if a feature #name is defined in
	 * superType and in this instance, then the #name value from this instance
	 * will be put at the original index from #name in the superType.
	 * 
	 * @return
	 */
	List<MobaRESTDtoAttribute> getGenParameterDtoAttributes();

	/**
	 * Returns all parameters from the rest. Including <b>Attributes</b>. And
	 * excluding <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the values for the current instance. Including the "super types".
	 * 
	 */
	List<MobaRESTAttribute> getAllParameterAttributes();

	/**
	 * Returns generator parameters from the rest. Including <b>Attributes</b>.
	 * And excluding <b>DtoAttributes</b>.
	 * <p>
	 * 
	 * Returns the generator specific values for the current instance. Including
	 * the "super types".
	 * <p>
	 * The difference to getAll...() is, that shadowed values are replaces with
	 * their new representation. For instance, if a feature #name is defined in
	 * superType and in this instance, then the #name value from this instance
	 * will be put at the original index from #name in the superType.
	 * 
	 * @return
	 */
	List<MobaRESTAttribute> getGenParameterAttributes();

	/**
	 * Returns all supertypes for this instance.
	 * 
	 * @return
	 * @throws RecursionException
	 *             if a recursion was found
	 */
	List<MobaRESTCustomService> getAllSuperTypes() throws RecursionException;

} // MobaRESTCustomService
