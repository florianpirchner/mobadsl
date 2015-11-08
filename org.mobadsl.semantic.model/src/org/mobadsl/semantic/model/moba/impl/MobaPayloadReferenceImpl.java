/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaMultiplicityProvider;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPayload;
import org.mobadsl.semantic.model.moba.MobaPayloadReference;
import org.mobadsl.semantic.model.moba.MobaPropertiesProvider;
import org.mobadsl.semantic.model.moba.MobaProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payload Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl#isCascading <em>Cascading</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadReferenceImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaPayloadReferenceImpl extends MobaPayloadFeatureImpl implements MobaPayloadReference {
	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MobaMuliplicity multiplicity;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaProperty> properties;

	/**
	 * The default value of the '{@link #isCascading() <em>Cascading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCascading()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CASCADING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCascading() <em>Cascading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCascading()
	 * @generated
	 * @ordered
	 */
	protected boolean cascading = CASCADING_EDEFAULT;

	/**
	 * The default value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean LAZY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isLazy() <em>Lazy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isLazy()
	 * @generated
	 * @ordered
	 */
	protected boolean lazy = LAZY_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSIENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransient() <em>Transient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransient()
	 * @generated
	 * @ordered
	 */
	protected boolean transient_ = TRANSIENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MobaPayload type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaPayloadReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_PAYLOAD_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaMuliplicity getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity(MobaMuliplicity newMultiplicity, NotificationChain msgs) {
		MobaMuliplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY, oldMultiplicity, newMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(MobaMuliplicity newMultiplicity) {
		if (newMultiplicity != multiplicity) {
			NotificationChain msgs = null;
			if (multiplicity != null)
				msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY, null, msgs);
			if (newMultiplicity != null)
				msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY, null, msgs);
			msgs = basicSetMultiplicity(newMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY, newMultiplicity, newMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this, MobaPackage.MOBA_PAYLOAD_REFERENCE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCascading() {
		return cascading;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCascading(boolean newCascading) {
		boolean oldCascading = cascading;
		cascading = newCascading;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_REFERENCE__CASCADING, oldCascading, cascading));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isLazy() {
		return lazy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLazy(boolean newLazy) {
		boolean oldLazy = lazy;
		lazy = newLazy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_REFERENCE__LAZY, oldLazy, lazy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransient() {
		return transient_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransient(boolean newTransient) {
		boolean oldTransient = transient_;
		transient_ = newTransient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_REFERENCE__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPayload getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MobaPayload)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_PAYLOAD_REFERENCE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaPayload basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MobaPayload newType) {
		MobaPayload oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_REFERENCE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY:
				return basicSetMultiplicity(null, msgs);
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY:
				return getMultiplicity();
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__PROPERTIES:
				return getProperties();
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__CASCADING:
				return isCascading();
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__LAZY:
				return isLazy();
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__TRANSIENT:
				return isTransient();
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__TYPE:
				if (resolve) return getType();
				return basicGetType();
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
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY:
				setMultiplicity((MobaMuliplicity)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MobaProperty>)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__CASCADING:
				setCascading((Boolean)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__LAZY:
				setLazy((Boolean)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__TYPE:
				setType((MobaPayload)newValue);
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
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY:
				setMultiplicity((MobaMuliplicity)null);
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__PROPERTIES:
				getProperties().clear();
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__CASCADING:
				setCascading(CASCADING_EDEFAULT);
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__LAZY:
				setLazy(LAZY_EDEFAULT);
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__TYPE:
				setType((MobaPayload)null);
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
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY:
				return multiplicity != null;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__CASCADING:
				return cascading != CASCADING_EDEFAULT;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__LAZY:
				return lazy != LAZY_EDEFAULT;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case MobaPackage.MOBA_PAYLOAD_REFERENCE__TYPE:
				return type != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == MobaMultiplicityProvider.class) {
			switch (derivedFeatureID) {
				case MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY: return MobaPackage.MOBA_MULTIPLICITY_PROVIDER__MULTIPLICITY;
				default: return -1;
			}
		}
		if (baseClass == MobaPropertiesProvider.class) {
			switch (derivedFeatureID) {
				case MobaPackage.MOBA_PAYLOAD_REFERENCE__PROPERTIES: return MobaPackage.MOBA_PROPERTIES_PROVIDER__PROPERTIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == MobaMultiplicityProvider.class) {
			switch (baseFeatureID) {
				case MobaPackage.MOBA_MULTIPLICITY_PROVIDER__MULTIPLICITY: return MobaPackage.MOBA_PAYLOAD_REFERENCE__MULTIPLICITY;
				default: return -1;
			}
		}
		if (baseClass == MobaPropertiesProvider.class) {
			switch (baseFeatureID) {
				case MobaPackage.MOBA_PROPERTIES_PROVIDER__PROPERTIES: return MobaPackage.MOBA_PAYLOAD_REFERENCE__PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (cascading: ");
		result.append(cascading);
		result.append(", lazy: ");
		result.append(lazy);
		result.append(", transient: ");
		result.append(transient_);
		result.append(')');
		return result.toString();
	}

} //MobaPayloadReferenceImpl
