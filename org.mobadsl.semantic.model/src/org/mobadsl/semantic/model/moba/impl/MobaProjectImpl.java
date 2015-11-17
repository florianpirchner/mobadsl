/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaProject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Project</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaProjectImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaProjectImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaProjectImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaProjectImpl#getUiApplication <em>Ui Application</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaProjectImpl#getBackgroundApplication <em>Background Application</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaProjectImpl extends MobaModelFeatureImpl implements MobaProject {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUiApplication() <em>Ui Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUiApplication()
	 * @generated
	 * @ordered
	 */
	protected MobaApplication uiApplication;

	/**
	 * The cached value of the '{@link #getBackgroundApplication() <em>Background Application</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundApplication()
	 * @generated
	 * @ordered
	 */
	protected MobaApplication backgroundApplication;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaProjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_PROJECT;
	}

	@Override
	public String getId() {
		return getName() + ":" + getVersion();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public boolean isSetId() {
		return getId() != null;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PROJECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PROJECT__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaApplication getUiApplication() {
		if (uiApplication != null && uiApplication.eIsProxy()) {
			InternalEObject oldUiApplication = (InternalEObject)uiApplication;
			uiApplication = (MobaApplication)eResolveProxy(oldUiApplication);
			if (uiApplication != oldUiApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_PROJECT__UI_APPLICATION, oldUiApplication, uiApplication));
			}
		}
		return uiApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaApplication basicGetUiApplication() {
		return uiApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUiApplication(MobaApplication newUiApplication) {
		MobaApplication oldUiApplication = uiApplication;
		uiApplication = newUiApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PROJECT__UI_APPLICATION, oldUiApplication, uiApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaApplication getBackgroundApplication() {
		if (backgroundApplication != null && backgroundApplication.eIsProxy()) {
			InternalEObject oldBackgroundApplication = (InternalEObject)backgroundApplication;
			backgroundApplication = (MobaApplication)eResolveProxy(oldBackgroundApplication);
			if (backgroundApplication != oldBackgroundApplication) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_PROJECT__BACKGROUND_APPLICATION, oldBackgroundApplication, backgroundApplication));
			}
		}
		return backgroundApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaApplication basicGetBackgroundApplication() {
		return backgroundApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackgroundApplication(MobaApplication newBackgroundApplication) {
		MobaApplication oldBackgroundApplication = backgroundApplication;
		backgroundApplication = newBackgroundApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PROJECT__BACKGROUND_APPLICATION, oldBackgroundApplication, backgroundApplication));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_PROJECT__ID:
				return getId();
			case MobaPackage.MOBA_PROJECT__NAME:
				return getName();
			case MobaPackage.MOBA_PROJECT__VERSION:
				return getVersion();
			case MobaPackage.MOBA_PROJECT__UI_APPLICATION:
				if (resolve) return getUiApplication();
				return basicGetUiApplication();
			case MobaPackage.MOBA_PROJECT__BACKGROUND_APPLICATION:
				if (resolve) return getBackgroundApplication();
				return basicGetBackgroundApplication();
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
			case MobaPackage.MOBA_PROJECT__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_PROJECT__VERSION:
				setVersion((String)newValue);
				return;
			case MobaPackage.MOBA_PROJECT__UI_APPLICATION:
				setUiApplication((MobaApplication)newValue);
				return;
			case MobaPackage.MOBA_PROJECT__BACKGROUND_APPLICATION:
				setBackgroundApplication((MobaApplication)newValue);
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
			case MobaPackage.MOBA_PROJECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_PROJECT__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case MobaPackage.MOBA_PROJECT__UI_APPLICATION:
				setUiApplication((MobaApplication)null);
				return;
			case MobaPackage.MOBA_PROJECT__BACKGROUND_APPLICATION:
				setBackgroundApplication((MobaApplication)null);
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
			case MobaPackage.MOBA_PROJECT__ID:
				return isSetId();
			case MobaPackage.MOBA_PROJECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_PROJECT__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case MobaPackage.MOBA_PROJECT__UI_APPLICATION:
				return uiApplication != null;
			case MobaPackage.MOBA_PROJECT__BACKGROUND_APPLICATION:
				return backgroundApplication != null;
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
		result.append(", version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

	@Override
	public <T extends EObject> List<T> getAllSuperTypes() {
		return new ArrayList<>();
	}

} //MobaProjectImpl
