/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Generator ID Feature</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl#getGeneratorId <em>Generator Id</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaGeneratorIDFeatureImpl#getGeneratorVersion <em>Generator Version</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaGeneratorIDFeatureImpl extends MinimalEObjectImpl.Container implements MobaGeneratorIDFeature {
	/**
	 * The default value of the '{@link #getGeneratorId() <em>Generator Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGeneratorId()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratorId() <em>Generator Id</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getGeneratorId()
	 * @generated
	 * @ordered
	 */
	protected String generatorId = GENERATOR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getGeneratorVersion() <em>Generator Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getGeneratorVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String GENERATOR_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGeneratorVersion() <em>Generator Version</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getGeneratorVersion()
	 * @generated
	 * @ordered
	 */
	protected String generatorVersion = GENERATOR_VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaGeneratorIDFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_GENERATOR_ID_FEATURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorId() {
		return generatorId;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorId(String newGeneratorId) {
		String oldGeneratorId = generatorId;
		generatorId = newGeneratorId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_ID, oldGeneratorId, generatorId));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getGeneratorVersion() {
		return generatorVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneratorVersion(String newGeneratorVersion) {
		String oldGeneratorVersion = generatorVersion;
		generatorVersion = newGeneratorVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_VERSION, oldGeneratorVersion, generatorVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_ID:
				return getGeneratorId();
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_VERSION:
				return getGeneratorVersion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_ID:
				setGeneratorId((String)newValue);
				return;
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_VERSION:
				setGeneratorVersion((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_ID:
				setGeneratorId(GENERATOR_ID_EDEFAULT);
				return;
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_VERSION:
				setGeneratorVersion(GENERATOR_VERSION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_ID:
				return GENERATOR_ID_EDEFAULT == null ? generatorId != null : !GENERATOR_ID_EDEFAULT.equals(generatorId);
			case MobaPackage.MOBA_GENERATOR_ID_FEATURE__GENERATOR_VERSION:
				return GENERATOR_VERSION_EDEFAULT == null ? generatorVersion != null : !GENERATOR_VERSION_EDEFAULT.equals(generatorVersion);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (generatorId: ");
		result.append(generatorId);
		result.append(", generatorVersion: ");
		result.append(generatorVersion);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getGeneratorVersionedId() {
		return MobaUtil.toGeneratorVersionedId(getGeneratorId(), getGeneratorVersion());
	}

	@Override
	public String getVersion() {
		return MobaUtil.toGeneratorVersion(getGeneratorVersionedId());
	}

	@Override
	public String getId() {
		return MobaUtil.toGeneratorId(getGeneratorVersionedId());
	}

} // MobaGeneratorIDFeatureImpl
