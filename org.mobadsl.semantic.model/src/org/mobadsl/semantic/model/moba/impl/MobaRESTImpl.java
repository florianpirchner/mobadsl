/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaREST;

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
	 * The cached value of the '{@link #getRequestDto() <em>Request Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDto()
	 * @generated
	 * @ordered
	 */
	protected MobaDto requestDto;

	/**
	 * The cached value of the '{@link #getResponseDto() <em>Response Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDto()
	 * @generated
	 * @ordered
	 */
	protected MobaDto responseDto;

	/**
	 * The cached value of the '{@link #getErrorDto() <em>Error Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getErrorDto()
	 * @generated
	 * @ordered
	 */
	protected MobaDto errorDto;

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
	public MobaDto getRequestDto() {
		if (requestDto != null && requestDto.eIsProxy()) {
			InternalEObject oldRequestDto = (InternalEObject)requestDto;
			requestDto = (MobaDto)eResolveProxy(oldRequestDto);
			if (requestDto != oldRequestDto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST__REQUEST_DTO, oldRequestDto, requestDto));
			}
		}
		return requestDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDto basicGetRequestDto() {
		return requestDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestDto(MobaDto newRequestDto) {
		MobaDto oldRequestDto = requestDto;
		requestDto = newRequestDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__REQUEST_DTO, oldRequestDto, requestDto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDto getResponseDto() {
		if (responseDto != null && responseDto.eIsProxy()) {
			InternalEObject oldResponseDto = (InternalEObject)responseDto;
			responseDto = (MobaDto)eResolveProxy(oldResponseDto);
			if (responseDto != oldResponseDto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST__RESPONSE_DTO, oldResponseDto, responseDto));
			}
		}
		return responseDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDto basicGetResponseDto() {
		return responseDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseDto(MobaDto newResponseDto) {
		MobaDto oldResponseDto = responseDto;
		responseDto = newResponseDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__RESPONSE_DTO, oldResponseDto, responseDto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDto getErrorDto() {
		if (errorDto != null && errorDto.eIsProxy()) {
			InternalEObject oldErrorDto = (InternalEObject)errorDto;
			errorDto = (MobaDto)eResolveProxy(oldErrorDto);
			if (errorDto != oldErrorDto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST__ERROR_DTO, oldErrorDto, errorDto));
			}
		}
		return errorDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDto basicGetErrorDto() {
		return errorDto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setErrorDto(MobaDto newErrorDto) {
		MobaDto oldErrorDto = errorDto;
		errorDto = newErrorDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST__ERROR_DTO, oldErrorDto, errorDto));
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
				if (resolve) return getRequestDto();
				return basicGetRequestDto();
			case MobaPackage.MOBA_REST__RESPONSE_DTO:
				if (resolve) return getResponseDto();
				return basicGetResponseDto();
			case MobaPackage.MOBA_REST__ERROR_DTO:
				if (resolve) return getErrorDto();
				return basicGetErrorDto();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
				setRequestDto((MobaDto)newValue);
				return;
			case MobaPackage.MOBA_REST__RESPONSE_DTO:
				setResponseDto((MobaDto)newValue);
				return;
			case MobaPackage.MOBA_REST__ERROR_DTO:
				setErrorDto((MobaDto)newValue);
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
				setRequestDto((MobaDto)null);
				return;
			case MobaPackage.MOBA_REST__RESPONSE_DTO:
				setResponseDto((MobaDto)null);
				return;
			case MobaPackage.MOBA_REST__ERROR_DTO:
				setErrorDto((MobaDto)null);
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
		result.append(')');
		return result.toString();
	}

} //MobaRESTImpl
