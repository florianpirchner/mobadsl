/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition;
import org.mobadsl.semantic.model.moba.MobaTransportSerializationType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REST Payload Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTPayloadDefinitionImpl#getDto <em>Dto</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTPayloadDefinitionImpl#isArray <em>Array</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRESTPayloadDefinitionImpl#getSerializationType <em>Serialization Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaRESTPayloadDefinitionImpl extends MinimalEObjectImpl.Container implements MobaRESTPayloadDefinition {
	/**
	 * The cached value of the '{@link #getDto() <em>Dto</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDto()
	 * @generated
	 * @ordered
	 */
	protected MobaDto dto;

	/**
	 * The default value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ARRAY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isArray() <em>Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isArray()
	 * @generated
	 * @ordered
	 */
	protected boolean array = ARRAY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSerializationType() <em>Serialization Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSerializationType()
	 * @generated
	 * @ordered
	 */
	protected MobaTransportSerializationType serializationType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaRESTPayloadDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_REST_PAYLOAD_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDto getDto() {
		if (dto != null && dto.eIsProxy()) {
			InternalEObject oldDto = (InternalEObject)dto;
			dto = (MobaDto)eResolveProxy(oldDto);
			if (dto != oldDto) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__DTO, oldDto, dto));
			}
		}
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDto basicGetDto() {
		return dto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDto(MobaDto newDto) {
		MobaDto oldDto = dto;
		dto = newDto;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__DTO, oldDto, dto));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isArray() {
		return array;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArray(boolean newArray) {
		boolean oldArray = array;
		array = newArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__ARRAY, oldArray, array));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaTransportSerializationType getSerializationType() {
		if (serializationType != null && serializationType.eIsProxy()) {
			InternalEObject oldSerializationType = (InternalEObject)serializationType;
			serializationType = (MobaTransportSerializationType)eResolveProxy(oldSerializationType);
			if (serializationType != oldSerializationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__SERIALIZATION_TYPE, oldSerializationType, serializationType));
			}
		}
		return serializationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaTransportSerializationType basicGetSerializationType() {
		return serializationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSerializationType(MobaTransportSerializationType newSerializationType) {
		MobaTransportSerializationType oldSerializationType = serializationType;
		serializationType = newSerializationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__SERIALIZATION_TYPE, oldSerializationType, serializationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__DTO:
				if (resolve) return getDto();
				return basicGetDto();
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__ARRAY:
				return isArray();
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__SERIALIZATION_TYPE:
				if (resolve) return getSerializationType();
				return basicGetSerializationType();
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
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__DTO:
				setDto((MobaDto)newValue);
				return;
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__ARRAY:
				setArray((Boolean)newValue);
				return;
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__SERIALIZATION_TYPE:
				setSerializationType((MobaTransportSerializationType)newValue);
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
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__DTO:
				setDto((MobaDto)null);
				return;
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__ARRAY:
				setArray(ARRAY_EDEFAULT);
				return;
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__SERIALIZATION_TYPE:
				setSerializationType((MobaTransportSerializationType)null);
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
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__DTO:
				return dto != null;
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__ARRAY:
				return array != ARRAY_EDEFAULT;
			case MobaPackage.MOBA_REST_PAYLOAD_DEFINITION__SERIALIZATION_TYPE:
				return serializationType != null;
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
		result.append(" (array: ");
		result.append(array);
		result.append(')');
		return result.toString();
	}

} //MobaRESTPayloadDefinitionImpl
