/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTHeader;
import org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl#isBigData <em>Big Data</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl#getRequestDto <em>Request Dto</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl#getResponseDto <em>Response Dto</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl#getErrorDto <em>Error Dto</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl#getAuthorization <em>Authorization</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MobaRESTImpl extends MobaApplicationFeatureImpl implements MobaREST {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The default value of the '{@link #isBigData() <em>Big Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBigData()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BIG_DATA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBigData() <em>Big Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBigData()
	 * @generated
	 * @ordered
	 */
	protected boolean bigData = BIG_DATA_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequestDto() <em>Request Dto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDto()
	 * @generated
	 * @ordered
	 */
	protected MobaRESTPayloadDefinition requestDto;

	/**
	 * The cached value of the '{@link #getResponseDto() <em>Response Dto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDto()
	 * @generated
	 * @ordered
	 */
	protected MobaRESTPayloadDefinition responseDto;

	/**
	 * The cached value of the '{@link #getErrorDto() <em>Error Dto</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDto()
	 * @generated
	 * @ordered
	 */
	protected MobaRESTPayloadDefinition errorDto;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaRESTHeader> headers;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected MobaAuthorization authorization;

	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_REST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBigData() {
		return bigData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigData(boolean newBigData) {
		boolean oldBigData = bigData;
		bigData = newBigData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__BIG_DATA, oldBigData, bigData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTPayloadDefinition getRequestDto() {
		return requestDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestDto(MobaRESTPayloadDefinition newRequestDto, NotificationChain msgs) {
		MobaRESTPayloadDefinition oldRequestDto = requestDto;
		requestDto = newRequestDto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__REQUEST_DTO, oldRequestDto, newRequestDto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestDto(MobaRESTPayloadDefinition newRequestDto) {
		if (newRequestDto != requestDto) {
			NotificationChain msgs = null;
			if (requestDto != null)
				msgs = ((InternalEObject)requestDto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_REST__REQUEST_DTO, null, msgs);
			if (newRequestDto != null)
				msgs = ((InternalEObject)newRequestDto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_REST__REQUEST_DTO, null, msgs);
			msgs = basicSetRequestDto(newRequestDto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__REQUEST_DTO, newRequestDto, newRequestDto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTPayloadDefinition getResponseDto() {
		return responseDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseDto(MobaRESTPayloadDefinition newResponseDto, NotificationChain msgs) {
		MobaRESTPayloadDefinition oldResponseDto = responseDto;
		responseDto = newResponseDto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__RESPONSE_DTO, oldResponseDto, newResponseDto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseDto(MobaRESTPayloadDefinition newResponseDto) {
		if (newResponseDto != responseDto) {
			NotificationChain msgs = null;
			if (responseDto != null)
				msgs = ((InternalEObject)responseDto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_REST__RESPONSE_DTO, null, msgs);
			if (newResponseDto != null)
				msgs = ((InternalEObject)newResponseDto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_REST__RESPONSE_DTO, null, msgs);
			msgs = basicSetResponseDto(newResponseDto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__RESPONSE_DTO, newResponseDto, newResponseDto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaRESTPayloadDefinition getErrorDto() {
		return errorDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetErrorDto(MobaRESTPayloadDefinition newErrorDto, NotificationChain msgs) {
		MobaRESTPayloadDefinition oldErrorDto = errorDto;
		errorDto = newErrorDto;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__ERROR_DTO, oldErrorDto, newErrorDto);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorDto(MobaRESTPayloadDefinition newErrorDto) {
		if (newErrorDto != errorDto) {
			NotificationChain msgs = null;
			if (errorDto != null)
				msgs = ((InternalEObject)errorDto).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_REST__ERROR_DTO, null, msgs);
			if (newErrorDto != null)
				msgs = ((InternalEObject)newErrorDto).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_REST__ERROR_DTO, null, msgs);
			msgs = basicSetErrorDto(newErrorDto, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__ERROR_DTO, newErrorDto, newErrorDto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaRESTHeader> getHeaders() {
		if (headers == null) {
			headers = new EObjectContainmentEList<MobaRESTHeader>(MobaRESTHeader.class, this, MobaPackage.MOBA_REST__HEADERS);
		}
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaAuthorization getAuthorization() {
		if (authorization != null && authorization.eIsProxy()) {
			InternalEObject oldAuthorization = (InternalEObject)authorization;
			authorization = (MobaAuthorization)eResolveProxy(oldAuthorization);
			if (authorization != oldAuthorization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST__AUTHORIZATION, oldAuthorization, authorization));
			}
		}
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaAuthorization basicGetAuthorization() {
		return authorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(MobaAuthorization newAuthorization) {
		MobaAuthorization oldAuthorization = authorization;
		authorization = newAuthorization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__AUTHORIZATION, oldAuthorization, authorization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_REST__REQUEST_DTO:
				return basicSetRequestDto(null, msgs);
			case MobaPackage.MOBA_REST__RESPONSE_DTO:
				return basicSetResponseDto(null, msgs);
			case MobaPackage.MOBA_REST__ERROR_DTO:
				return basicSetErrorDto(null, msgs);
			case MobaPackage.MOBA_REST__HEADERS:
				return ((InternalEList<?>)getHeaders()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_REST__NAME:
				return getName();
			case MobaPackage.MOBA_REST__URL:
				return getUrl();
			case MobaPackage.MOBA_REST__BIG_DATA:
				return isBigData();
			case MobaPackage.MOBA_REST__REQUEST_DTO:
				return getRequestDto();
			case MobaPackage.MOBA_REST__RESPONSE_DTO:
				return getResponseDto();
			case MobaPackage.MOBA_REST__ERROR_DTO:
				return getErrorDto();
			case MobaPackage.MOBA_REST__HEADERS:
				return getHeaders();
			case MobaPackage.MOBA_REST__AUTHORIZATION:
				if (resolve) return getAuthorization();
				return basicGetAuthorization();
			case MobaPackage.MOBA_REST__PATH:
				return getPath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_REST__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_REST__URL:
				setUrl((String)newValue);
				return;
			case MobaPackage.MOBA_REST__BIG_DATA:
				setBigData((Boolean)newValue);
				return;
			case MobaPackage.MOBA_REST__REQUEST_DTO:
				setRequestDto((MobaRESTPayloadDefinition)newValue);
				return;
			case MobaPackage.MOBA_REST__RESPONSE_DTO:
				setResponseDto((MobaRESTPayloadDefinition)newValue);
				return;
			case MobaPackage.MOBA_REST__ERROR_DTO:
				setErrorDto((MobaRESTPayloadDefinition)newValue);
				return;
			case MobaPackage.MOBA_REST__HEADERS:
				getHeaders().clear();
				getHeaders().addAll((Collection<? extends MobaRESTHeader>)newValue);
				return;
			case MobaPackage.MOBA_REST__AUTHORIZATION:
				setAuthorization((MobaAuthorization)newValue);
				return;
			case MobaPackage.MOBA_REST__PATH:
				setPath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_REST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST__URL:
				setUrl(URL_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST__BIG_DATA:
				setBigData(BIG_DATA_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST__REQUEST_DTO:
				setRequestDto((MobaRESTPayloadDefinition)null);
				return;
			case MobaPackage.MOBA_REST__RESPONSE_DTO:
				setResponseDto((MobaRESTPayloadDefinition)null);
				return;
			case MobaPackage.MOBA_REST__ERROR_DTO:
				setErrorDto((MobaRESTPayloadDefinition)null);
				return;
			case MobaPackage.MOBA_REST__HEADERS:
				getHeaders().clear();
				return;
			case MobaPackage.MOBA_REST__AUTHORIZATION:
				setAuthorization((MobaAuthorization)null);
				return;
			case MobaPackage.MOBA_REST__PATH:
				setPath(PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_REST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_REST__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case MobaPackage.MOBA_REST__BIG_DATA:
				return bigData != BIG_DATA_EDEFAULT;
			case MobaPackage.MOBA_REST__REQUEST_DTO:
				return requestDto != null;
			case MobaPackage.MOBA_REST__RESPONSE_DTO:
				return responseDto != null;
			case MobaPackage.MOBA_REST__ERROR_DTO:
				return errorDto != null;
			case MobaPackage.MOBA_REST__HEADERS:
				return headers != null && !headers.isEmpty();
			case MobaPackage.MOBA_REST__AUTHORIZATION:
				return authorization != null;
			case MobaPackage.MOBA_REST__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", url: ");
		result.append(url);
		result.append(", bigData: ");
		result.append(bigData);
		result.append(", path: ");
		result.append(path);
		result.append(')');
		return result.toString();
	}

	protected <T extends EObject> List<T> collect(Class<T> clazz, EReference collectionFeture) {
		return MobaUtil.getAllFeatures(this, clazz, collectionFeture);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected <T extends EObject> List<T> collectAll(MobaREST instance, Class<T> clazz,
			EReference collectionFeture) {
		List types = getAllSuperTypes();
		// add this instance to the begin of the list
		types.add(0, this);

		return MobaUtil.getAllFeatures(types, clazz, collectionFeture);
	}

	protected <T extends EObject> List<T> collectGen(MobaREST instance, Class<T> clazz,
			EReference collectionFeture, EStructuralFeature nameAtt) {
		return MobaUtil.getGenFeatures(collectAll(this, clazz, collectionFeture), nameAtt);
	}
	
	@Override
	public List<MobaRESTHeader> getAllHeaders() {
		return collectAll(this, MobaRESTHeader.class, MobaPackage.Literals.MOBA_REST__HEADERS);
	}

	@Override
	public List<MobaRESTHeader> getGenHeaders() {
		return collectGen(this, MobaRESTHeader.class, MobaPackage.Literals.MOBA_REST__HEADERS,
				MobaPackage.Literals.MOBA_REST_ATTRIBUTE__KEY);
	}
	
} //MobaRESTImpl
