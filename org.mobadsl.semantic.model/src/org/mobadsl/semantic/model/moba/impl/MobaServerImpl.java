/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Server</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl#getName
 * <em>Name</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl#getSuperType
 * <em>Super Type</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl#getUrl
 * <em>Url</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl#getServices
 * <em>Services</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaServerImpl#getAuthorization
 * <em>Authorization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaServerImpl extends MobaApplicationFeatureImpl implements MobaServer {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaServer superType;

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
	 * The cached value of the '{@link #getServices() <em>Services</em>}'
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaREST> services;

	/**
	 * The cached value of the '{@link #getAuthorization()
	 * <em>Authorization</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getAuthorization()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaAuthorization> authorization;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaServerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_SERVER;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_SERVER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaServer getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject) superType;
			superType = (MobaServer) eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_SERVER__SUPER_TYPE,
							oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaServer basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSuperType(MobaServer newSuperType) {
		MobaServer oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_SERVER__SUPER_TYPE, oldSuperType,
					superType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
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
	 * 
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
	 * 
	 * @generated
	 */
	public EList<MobaAuthorization> getAuthorization() {
		if (authorization == null) {
			authorization = new EObjectResolvingEList<MobaAuthorization>(MobaAuthorization.class, this,
					MobaPackage.MOBA_SERVER__AUTHORIZATION);
		}
		return authorization;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MobaPackage.MOBA_SERVER__NAME:
			return getName();
		case MobaPackage.MOBA_SERVER__SUPER_TYPE:
			if (resolve)
				return getSuperType();
			return basicGetSuperType();
		case MobaPackage.MOBA_SERVER__URL:
			return getUrl();
		case MobaPackage.MOBA_SERVER__SERVICES:
			return getServices();
		case MobaPackage.MOBA_SERVER__AUTHORIZATION:
			return getAuthorization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MobaPackage.MOBA_SERVER__NAME:
			setName((String) newValue);
			return;
		case MobaPackage.MOBA_SERVER__SUPER_TYPE:
			setSuperType((MobaServer) newValue);
			return;
		case MobaPackage.MOBA_SERVER__URL:
			setUrl((String) newValue);
			return;
		case MobaPackage.MOBA_SERVER__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends MobaREST>) newValue);
			return;
		case MobaPackage.MOBA_SERVER__AUTHORIZATION:
			getAuthorization().clear();
			getAuthorization().addAll((Collection<? extends MobaAuthorization>) newValue);
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
		case MobaPackage.MOBA_SERVER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MobaPackage.MOBA_SERVER__SUPER_TYPE:
			setSuperType((MobaServer) null);
			return;
		case MobaPackage.MOBA_SERVER__URL:
			setUrl(URL_EDEFAULT);
			return;
		case MobaPackage.MOBA_SERVER__SERVICES:
			getServices().clear();
			return;
		case MobaPackage.MOBA_SERVER__AUTHORIZATION:
			getAuthorization().clear();
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
		case MobaPackage.MOBA_SERVER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MobaPackage.MOBA_SERVER__SUPER_TYPE:
			return superType != null;
		case MobaPackage.MOBA_SERVER__URL:
			return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
		case MobaPackage.MOBA_SERVER__SERVICES:
			return services != null && !services.isEmpty();
		case MobaPackage.MOBA_SERVER__AUTHORIZATION:
			return authorization != null && !authorization.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", url: ");
		result.append(url);
		result.append(')');
		return result.toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<MobaServer> getAllSuperTypes() {
		return MobaUtil.getAllSuperTypes(this, MobaPackage.Literals.MOBA_SERVER__SUPER_TYPE);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	protected <T extends EObject> List<T> collectAll(MobaServer instance, Class<T> clazz, EReference collectionFeture) {
		List types = getAllSuperTypes();
		// add this instance to the begin of the list
		types.add(0, this);

		return MobaUtil.getAllFeatures(types, clazz, collectionFeture);
	}

	protected <T extends EObject> List<T> collectGen(MobaServer instance, Class<T> clazz, EReference collectionFeture,
			EAttribute nameAtt) {
		return MobaUtil.getGenFeatures(collectAll(this, clazz, collectionFeture), nameAtt);
	}

	@Override
	public List<MobaREST> getAllServices() {
		return collectAll(this, MobaREST.class, MobaPackage.Literals.MOBA_SERVER__SERVICES);
	}

	@Override
	public List<MobaREST> getGenServices() {
		return collectGen(this, MobaREST.class, MobaPackage.Literals.MOBA_SERVER__SERVICES,
				MobaPackage.Literals.MOBA_REST__NAME);
	}

} // MobaServerImpl
