/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaServer;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Server</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl#getServices <em>Services</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl#getAuthorization <em>Authorization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaServerImpl extends MobaApplicationFeatureImpl implements MobaServer {
	/**
	 * The default value of the '{@link #getUrl() <em>Url</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected String url = URL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaREST> services;

	/**
	 * The cached value of the '{@link #getAuthorization() <em>Authorization</em>}' reference.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected MobaAuthorization authorization;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_SERVER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrl(String newUrl) {
		String oldUrl = url;
		url = newUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_SERVER__URL, oldUrl, url));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaREST> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<MobaREST>(MobaREST.class, this, MobaPackage.MOBA_SERVER__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaAuthorization getAuthorization() {
		if (authorization != null && authorization.eIsProxy()) {
			InternalEObject oldAuthorization = (InternalEObject)authorization;
			authorization = (MobaAuthorization)eResolveProxy(oldAuthorization);
			if (authorization != oldAuthorization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_SERVER__AUTHORIZATION, oldAuthorization, authorization));
			}
		}
		return authorization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaAuthorization basicGetAuthorization() {
		return authorization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorization(MobaAuthorization newAuthorization) {
		MobaAuthorization oldAuthorization = authorization;
		authorization = newAuthorization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_SERVER__AUTHORIZATION, oldAuthorization, authorization));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_SERVER__URL:
				return getUrl();
			case MobaPackage.MOBA_SERVER__SERVICES:
				return getServices();
			case MobaPackage.MOBA_SERVER__AUTHORIZATION:
				if (resolve) return getAuthorization();
				return basicGetAuthorization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_SERVER__URL:
				setUrl((String)newValue);
				return;
			case MobaPackage.MOBA_SERVER__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends MobaREST>)newValue);
				return;
			case MobaPackage.MOBA_SERVER__AUTHORIZATION:
				setAuthorization((MobaAuthorization)newValue);
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
			case MobaPackage.MOBA_SERVER__URL:
				setUrl(URL_EDEFAULT);
				return;
			case MobaPackage.MOBA_SERVER__SERVICES:
				getServices().clear();
				return;
			case MobaPackage.MOBA_SERVER__AUTHORIZATION:
				setAuthorization((MobaAuthorization)null);
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
			case MobaPackage.MOBA_SERVER__URL:
				return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
			case MobaPackage.MOBA_SERVER__SERVICES:
				return services != null && !services.isEmpty();
			case MobaPackage.MOBA_SERVER__AUTHORIZATION:
				return authorization != null;
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
		result.append(" (url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MobaServer> getAllSuperTypes() {
		return new ArrayList<>();
	}

} // MobaServerImpl
