/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaExternalModule;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>External Module</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaExternalModuleImpl#getSuperType
 * <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class MobaExternalModuleImpl extends MobaApplicationFeatureImpl implements MobaExternalModule {
	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaExternalModule superType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaExternalModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_EXTERNAL_MODULE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaExternalModule getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject) superType;
			superType = (MobaExternalModule) eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MobaPackage.MOBA_EXTERNAL_MODULE__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaExternalModule basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSuperType(MobaExternalModule newSuperType) {
		MobaExternalModule oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_EXTERNAL_MODULE__SUPER_TYPE,
					oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MobaPackage.MOBA_EXTERNAL_MODULE__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MobaPackage.MOBA_EXTERNAL_MODULE__SUPER_TYPE:
			setSuperType((MobaExternalModule) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MobaPackage.MOBA_EXTERNAL_MODULE__SUPER_TYPE:
			setSuperType((MobaExternalModule) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MobaPackage.MOBA_EXTERNAL_MODULE__SUPER_TYPE:
			return superType != null;
		}
		return super.eIsSet(featureID);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MobaExternalModule> getAllSuperTypes() {
		return MobaUtil.getAllSuperTypes(this, MobaPackage.Literals.MOBA_EXTERNAL_MODULE__SUPER_TYPE);
	}

} // MobaExternalModuleImpl
