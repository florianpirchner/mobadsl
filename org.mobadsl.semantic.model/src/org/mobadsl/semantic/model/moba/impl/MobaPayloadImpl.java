/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPayload;
import org.mobadsl.semantic.model.moba.MobaPayloadAttribute;
import org.mobadsl.semantic.model.moba.MobaPayloadFeature;
import org.mobadsl.semantic.model.moba.MobaPayloadReference;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.RecursionException;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Payload</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadImpl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaPayloadImpl extends MobaDataImpl implements MobaPayload {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaProperty> properties;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getSuperType()
	 * @generated
	 * @ordered
	 */
	protected MobaPayload superType;

	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaPayloadFeature> features;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaPayloadImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_PAYLOAD;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this, MobaPackage.MOBA_PAYLOAD__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPayload getSuperType() {
		if (superType != null && superType.eIsProxy()) {
			InternalEObject oldSuperType = (InternalEObject)superType;
			superType = (MobaPayload)eResolveProxy(oldSuperType);
			if (superType != oldSuperType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_PAYLOAD__SUPER_TYPE, oldSuperType, superType));
			}
		}
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPayload basicGetSuperType() {
		return superType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperType(MobaPayload newSuperType) {
		MobaPayload oldSuperType = superType;
		superType = newSuperType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD__SUPER_TYPE, oldSuperType, superType));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaPayloadFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<MobaPayloadFeature>(MobaPayloadFeature.class, this, MobaPackage.MOBA_PAYLOAD__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_PAYLOAD__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case MobaPackage.MOBA_PAYLOAD__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_PAYLOAD__PROPERTIES:
				return getProperties();
			case MobaPackage.MOBA_PAYLOAD__NAME:
				return getName();
			case MobaPackage.MOBA_PAYLOAD__SUPER_TYPE:
				if (resolve) return getSuperType();
				return basicGetSuperType();
			case MobaPackage.MOBA_PAYLOAD__FEATURES:
				return getFeatures();
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
			case MobaPackage.MOBA_PAYLOAD__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MobaProperty>)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD__SUPER_TYPE:
				setSuperType((MobaPayload)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends MobaPayloadFeature>)newValue);
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
			case MobaPackage.MOBA_PAYLOAD__PROPERTIES:
				getProperties().clear();
				return;
			case MobaPackage.MOBA_PAYLOAD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_PAYLOAD__SUPER_TYPE:
				setSuperType((MobaPayload)null);
				return;
			case MobaPackage.MOBA_PAYLOAD__FEATURES:
				getFeatures().clear();
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
			case MobaPackage.MOBA_PAYLOAD__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MobaPackage.MOBA_PAYLOAD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_PAYLOAD__SUPER_TYPE:
				return superType != null;
			case MobaPackage.MOBA_PAYLOAD__FEATURES:
				return features != null && !features.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MobaPropertiesAble.class) {
			switch (derivedFeatureID) {
				case MobaPackage.MOBA_PAYLOAD__PROPERTIES: return MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MobaPropertiesAble.class) {
			switch (baseFeatureID) {
				case MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES: return MobaPackage.MOBA_PAYLOAD__PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@Override
	public List<MobaPayloadAttribute> getAttributes() {
		return collect(MobaPayloadAttribute.class);
	}

	@Override
	public List<MobaPayloadReference> getReferences() {
		return collect(MobaPayloadReference.class);
	}

	@Override
	public List<MobaPayloadFeature> getAllFeatures() {
		return collectAll(this, MobaPayloadFeature.class);
	}

	@Override
	public List<MobaPayloadAttribute> getAllAttributes() {
		return collectAll(this, MobaPayloadAttribute.class);
	}

	@Override
	public List<MobaPayloadReference> getAllReferences() {
		return collectAll(this, MobaPayloadReference.class);
	}

	protected <T extends EObject> List<T> collect(Class<T> clazz) {
		return MobaUtil.getAllFeatures(this, clazz, MobaPackage.Literals.MOBA_PAYLOAD__FEATURES);
	}

	protected <T extends EObject> List<T> collectAll(MobaPayload instance, Class<T> clazz) {

		List<MobaPayload> types = getAllSuperTypes();
		// add this instance to the begin of the list
		types.add(0, this);

		return MobaUtil.getAllFeatures(types, clazz, MobaPackage.Literals.MOBA_PAYLOAD__FEATURES);
	}

	protected <T extends EObject> List<T> collectGen(MobaDto instance, Class<T> clazz) {
		return MobaUtil.getGenFeatures(collectAll(this, clazz), MobaPackage.Literals.MOBA_FEATURE__NAME);
	}

	@Override
	public List<MobaPayload> getAllSuperTypes() throws RecursionException {
		List<MobaPayload> result = MobaUtil.getAllSuperTypes(this, MobaPackage.Literals.MOBA_PAYLOAD__SUPER_TYPE);
		return result;
	}

	@Override
	public List<MobaPayloadFeature> getGenFeatures() {
		return MobaUtil.getGenFeatures(getAllFeatures(), MobaPackage.Literals.MOBA_FEATURE__NAME);
	}

	@Override
	public List<MobaPayloadAttribute> getGenAttributes() {
		return MobaUtil.getGenFeatures(getAllAttributes(), MobaPackage.Literals.MOBA_FEATURE__NAME);
	}

	@Override
	public List<MobaPayloadReference> getGenReferences() {
		return MobaUtil.getGenFeatures(getAllReferences(), MobaPackage.Literals.MOBA_FEATURE__NAME);
	}

	@Override
	public List<MobaProperty> getAllProperties() {
		List<MobaPayload> types = getAllSuperTypes();
		// add this instance to the begin of the list
		types.add(0, this);

		return MobaUtil.getAllFeatures(types, MobaProperty.class,
				MobaPackage.Literals.MOBA_PROPERTIES_ABLE__PROPERTIES);
	}

	@Override
	public List<MobaProperty> getGenProperties() {
		return MobaUtil.getGenFeatures(getAllProperties(), MobaPackage.Literals.MOBA_PROPERTY__KEY);
	}
} // MobaPayloadImpl
