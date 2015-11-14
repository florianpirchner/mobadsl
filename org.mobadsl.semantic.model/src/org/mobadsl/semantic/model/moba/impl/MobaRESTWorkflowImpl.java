/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaRESTWorkflow;
import org.mobadsl.semantic.model.moba.RecursionException;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>REST Workflow</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaRESTWorkflowImpl#getProperties
 * <em>Properties</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaRESTWorkflowImpl#getServices
 * <em>Services</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.impl.MobaRESTWorkflowImpl#getSuperType
 * <em>Super Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaRESTWorkflowImpl extends MobaRESTImpl implements MobaRESTWorkflow {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}'
	 * containment reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaProperty> properties;

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
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaRESTWorkflow superType;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaRESTWorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_REST_WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this,
					MobaPackage.MOBA_REST_WORKFLOW__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<MobaREST> getServices() {
		if (services == null) {
			services = new EObjectResolvingEList<MobaREST>(MobaREST.class, this,
					MobaPackage.MOBA_REST_WORKFLOW__SERVICES);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaRESTWorkflow getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject) superType;
			superType = (MobaRESTWorkflow) eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MobaPackage.MOBA_REST_WORKFLOW__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaRESTWorkflow basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSuperType(MobaRESTWorkflow newSuperType) {
		MobaRESTWorkflow oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REST_WORKFLOW__SUPER_TYPE,
					oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MobaPackage.MOBA_REST_WORKFLOW__PROPERTIES:
			return ((InternalEList<?>) getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MobaPackage.MOBA_REST_WORKFLOW__PROPERTIES:
			return getProperties();
		case MobaPackage.MOBA_REST_WORKFLOW__SERVICES:
			return getServices();
		case MobaPackage.MOBA_REST_WORKFLOW__SUPER_TYPE:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MobaPackage.MOBA_REST_WORKFLOW__PROPERTIES:
			getProperties().clear();
			getProperties().addAll((Collection<? extends MobaProperty>) newValue);
			return;
		case MobaPackage.MOBA_REST_WORKFLOW__SERVICES:
			getServices().clear();
			getServices().addAll((Collection<? extends MobaREST>) newValue);
			return;
		case MobaPackage.MOBA_REST_WORKFLOW__SUPER_TYPE:
			setSuperType((MobaRESTWorkflow) newValue);
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
		case MobaPackage.MOBA_REST_WORKFLOW__PROPERTIES:
			getProperties().clear();
			return;
		case MobaPackage.MOBA_REST_WORKFLOW__SERVICES:
			getServices().clear();
			return;
		case MobaPackage.MOBA_REST_WORKFLOW__SUPER_TYPE:
			setSuperType((MobaRESTWorkflow) null);
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
		case MobaPackage.MOBA_REST_WORKFLOW__PROPERTIES:
			return properties != null && !properties.isEmpty();
		case MobaPackage.MOBA_REST_WORKFLOW__SERVICES:
			return services != null && !services.isEmpty();
		case MobaPackage.MOBA_REST_WORKFLOW__SUPER_TYPE:
			return superType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MobaPropertiesAble.class) {
			switch (derivedFeatureID) {
			case MobaPackage.MOBA_REST_WORKFLOW__PROPERTIES:
				return MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MobaPropertiesAble.class) {
			switch (baseFeatureID) {
			case MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES:
				return MobaPackage.MOBA_REST_WORKFLOW__PROPERTIES;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	@Override
	public List<MobaProperty> getAllProperties() {
		return collectAll(this, MobaProperty.class, MobaPackage.Literals.MOBA_PROPERTIES_ABLE__PROPERTIES);
	}

	@Override
	public List<MobaProperty> getGenProperties() {
		return collectGen(this, MobaProperty.class, MobaPackage.Literals.MOBA_PROPERTIES_ABLE__PROPERTIES,
				MobaPackage.Literals.MOBA_PROPERTY__KEY);
	}

	@Override
	public List<MobaRESTWorkflow> getAllSuperTypes() throws RecursionException {
		List<MobaRESTWorkflow> result = MobaUtil.getAllSuperTypes(this,
				MobaPackage.Literals.MOBA_REST_WORKFLOW__SUPER_TYPE);
		return result;
	}

} // MobaRESTWorkflowImpl
