/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Generator Mixin Feature</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorMixinFeatureImpl#getGeneratorRef
 * <em>Generator Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaGeneratorMixinFeatureImpl extends MinimalEObjectImpl.Container implements MobaGeneratorMixinFeature {
	/**
	 * The cached value of the '{@link #getGeneratorRef() <em>Generator Ref</em>
	 * }' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getGeneratorRef()
	 * @generated
	 * @ordered
	 */
	protected MobaGenerator generatorRef;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaGeneratorMixinFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_GENERATOR_MIXIN_FEATURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaGenerator getGeneratorRef() {
		if (generatorRef != null && generatorRef.eIsProxy()) {
			InternalEObject oldGeneratorRef = (InternalEObject) generatorRef;
			generatorRef = (MobaGenerator) eResolveProxy(oldGeneratorRef);
			if (generatorRef != oldGeneratorRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MobaPackage.MOBA_GENERATOR_MIXIN_FEATURE__GENERATOR_REF, oldGeneratorRef, generatorRef));
			}
		}
		return generatorRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaGenerator basicGetGeneratorRef() {
		return generatorRef;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGeneratorRef(MobaGenerator newGeneratorRef) {
		MobaGenerator oldGeneratorRef = generatorRef;
		generatorRef = newGeneratorRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MobaPackage.MOBA_GENERATOR_MIXIN_FEATURE__GENERATOR_REF, oldGeneratorRef, generatorRef));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MobaPackage.MOBA_GENERATOR_MIXIN_FEATURE__GENERATOR_REF:
			if (resolve)
				return getGeneratorRef();
			return basicGetGeneratorRef();
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
		case MobaPackage.MOBA_GENERATOR_MIXIN_FEATURE__GENERATOR_REF:
			setGeneratorRef((MobaGenerator) newValue);
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
		case MobaPackage.MOBA_GENERATOR_MIXIN_FEATURE__GENERATOR_REF:
			setGeneratorRef((MobaGenerator) null);
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
		case MobaPackage.MOBA_GENERATOR_MIXIN_FEATURE__GENERATOR_REF:
			return generatorRef != null;
		}
		return super.eIsSet(featureID);
	}

	@Override
	public String getGeneratorVersionedId() {
		if (getGeneratorRef() != null) {
			return getGeneratorRef().getName();
		}
		return null;
	}

	@Override
	public String getVersion() {
		return MobaUtil.toGeneratorVersion(getGeneratorVersionedId());
	}

	@Override
	public String getId() {
		return MobaUtil.toGeneratorId(getGeneratorVersionedId());
	}

} // MobaGeneratorMixinFeatureImpl
