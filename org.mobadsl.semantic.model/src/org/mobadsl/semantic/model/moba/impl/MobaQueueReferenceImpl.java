/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaMultiplicityAble;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.MobaREST;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Queue Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaQueueReferenceImpl#getRestService <em>Rest Service</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaQueueReferenceImpl extends MobaQueueFeatureImpl implements MobaQueueReference {
	/**
	 * The cached value of the '{@link #getRestService() <em>Rest Service</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestService()
	 * @generated
	 * @ordered
	 */
	protected MobaREST restService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaQueueReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_QUEUE_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaREST getRestService() {
		if (restService != null && restService.eIsProxy()) {
			InternalEObject oldRestService = (InternalEObject)restService;
			restService = (MobaREST)eResolveProxy(oldRestService);
			if (restService != oldRestService) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_QUEUE_REFERENCE__REST_SERVICE, oldRestService, restService));
			}
		}
		return restService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaREST basicGetRestService() {
		return restService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRestService(MobaREST newRestService) {
		MobaREST oldRestService = restService;
		restService = newRestService;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_QUEUE_REFERENCE__REST_SERVICE, oldRestService, restService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_QUEUE_REFERENCE__REST_SERVICE:
				if (resolve) return getRestService();
				return basicGetRestService();
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
			case MobaPackage.MOBA_QUEUE_REFERENCE__REST_SERVICE:
				setRestService((MobaREST)newValue);
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
			case MobaPackage.MOBA_QUEUE_REFERENCE__REST_SERVICE:
				setRestService((MobaREST)null);
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
			case MobaPackage.MOBA_QUEUE_REFERENCE__REST_SERVICE:
				return restService != null;
		}
		return super.eIsSet(featureID);
	}

} //MobaQueueReferenceImpl
