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
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaConstraint;
import org.mobadsl.semantic.model.moba.MobaConstraintable;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaMultiplicityAble;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPayloadAttribute;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Payload Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl#getConstraints <em>Constraints</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl#isLazy <em>Lazy</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl#isTransient <em>Transient</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl#isDomainKey <em>Domain Key</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl#isDomainDescription <em>Domain Description</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaPayloadAttributeImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaPayloadAttributeImpl extends MobaPayloadFeatureImpl implements MobaPayloadAttribute {
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
	 * The cached value of the '{@link #getConstraints() <em>Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaConstraint> constraints;

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
	 * The default value of the '{@link #isDomainKey() <em>Domain Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDomainKey()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOMAIN_KEY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDomainKey() <em>Domain Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDomainKey()
	 * @generated
	 * @ordered
	 */
	protected boolean domainKey = DOMAIN_KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #isDomainDescription() <em>Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDomainDescription()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DOMAIN_DESCRIPTION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDomainDescription() <em>Domain Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDomainDescription()
	 * @generated
	 * @ordered
	 */
	protected boolean domainDescription = DOMAIN_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIAS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlias()
	 * @generated
	 * @ordered
	 */
	protected String alias = ALIAS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected MobaDataType type;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaPayloadAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_PAYLOAD_ATTRIBUTE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY, oldMultiplicity, newMultiplicity);
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
				msgs = ((InternalEObject)multiplicity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY, null, msgs);
			if (newMultiplicity != null)
				msgs = ((InternalEObject)newMultiplicity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY, null, msgs);
			msgs = basicSetMultiplicity(newMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY, newMultiplicity, newMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaConstraint> getConstraints() {
		if (constraints == null) {
			constraints = new EObjectContainmentEList<MobaConstraint>(MobaConstraint.class, this, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__CONSTRAINTS);
		}
		return constraints;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__LAZY, oldLazy, lazy));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TRANSIENT, oldTransient, transient_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDomainKey() {
		return domainKey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainKey(boolean newDomainKey) {
		boolean oldDomainKey = domainKey;
		domainKey = newDomainKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_KEY, oldDomainKey, domainKey));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDomainDescription() {
		return domainDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainDescription(boolean newDomainDescription) {
		boolean oldDomainDescription = domainDescription;
		domainDescription = newDomainDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_DESCRIPTION, oldDomainDescription, domainDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlias() {
		return alias;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlias(String newAlias) {
		String oldAlias = alias;
		alias = newAlias;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__ALIAS, oldAlias, alias));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDataType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (MobaDataType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaDataType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(MobaDataType newType) {
		MobaDataType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY:
				return basicSetMultiplicity(null, msgs);
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__CONSTRAINTS:
				return ((InternalEList<?>)getConstraints()).basicRemove(otherEnd, msgs);
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
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY:
				return getMultiplicity();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__PROPERTIES:
				return getProperties();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__CONSTRAINTS:
				return getConstraints();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__LAZY:
				return isLazy();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TRANSIENT:
				return isTransient();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_KEY:
				return isDomainKey();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_DESCRIPTION:
				return isDomainDescription();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__ALIAS:
				return getAlias();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TYPE:
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
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY:
				setMultiplicity((MobaMuliplicity)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MobaProperty>)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__CONSTRAINTS:
				getConstraints().clear();
				getConstraints().addAll((Collection<? extends MobaConstraint>)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__LAZY:
				setLazy((Boolean)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TRANSIENT:
				setTransient((Boolean)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_KEY:
				setDomainKey((Boolean)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_DESCRIPTION:
				setDomainDescription((Boolean)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__ALIAS:
				setAlias((String)newValue);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TYPE:
				setType((MobaDataType)newValue);
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
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY:
				setMultiplicity((MobaMuliplicity)null);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__PROPERTIES:
				getProperties().clear();
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__CONSTRAINTS:
				getConstraints().clear();
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__LAZY:
				setLazy(LAZY_EDEFAULT);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TRANSIENT:
				setTransient(TRANSIENT_EDEFAULT);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_KEY:
				setDomainKey(DOMAIN_KEY_EDEFAULT);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_DESCRIPTION:
				setDomainDescription(DOMAIN_DESCRIPTION_EDEFAULT);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__ALIAS:
				setAlias(ALIAS_EDEFAULT);
				return;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TYPE:
				setType((MobaDataType)null);
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
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY:
				return multiplicity != null;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__CONSTRAINTS:
				return constraints != null && !constraints.isEmpty();
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__LAZY:
				return lazy != LAZY_EDEFAULT;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TRANSIENT:
				return transient_ != TRANSIENT_EDEFAULT;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_KEY:
				return domainKey != DOMAIN_KEY_EDEFAULT;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__DOMAIN_DESCRIPTION:
				return domainDescription != DOMAIN_DESCRIPTION_EDEFAULT;
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__ALIAS:
				return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
			case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__TYPE:
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
		if (baseClass == MobaMultiplicityAble.class) {
			switch (derivedFeatureID) {
				case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY: return MobaPackage.MOBA_MULTIPLICITY_ABLE__MULTIPLICITY;
				default: return -1;
			}
		}
		if (baseClass == MobaPropertiesAble.class) {
			switch (derivedFeatureID) {
				case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__PROPERTIES: return MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == MobaConstraintable.class) {
			switch (derivedFeatureID) {
				case MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__CONSTRAINTS: return MobaPackage.MOBA_CONSTRAINTABLE__CONSTRAINTS;
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
		if (baseClass == MobaMultiplicityAble.class) {
			switch (baseFeatureID) {
				case MobaPackage.MOBA_MULTIPLICITY_ABLE__MULTIPLICITY: return MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__MULTIPLICITY;
				default: return -1;
			}
		}
		if (baseClass == MobaPropertiesAble.class) {
			switch (baseFeatureID) {
				case MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES: return MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__PROPERTIES;
				default: return -1;
			}
		}
		if (baseClass == MobaConstraintable.class) {
			switch (baseFeatureID) {
				case MobaPackage.MOBA_CONSTRAINTABLE__CONSTRAINTS: return MobaPackage.MOBA_PAYLOAD_ATTRIBUTE__CONSTRAINTS;
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
		result.append(" (lazy: ");
		result.append(lazy);
		result.append(", transient: ");
		result.append(transient_);
		result.append(", domainKey: ");
		result.append(domainKey);
		result.append(", domainDescription: ");
		result.append(domainDescription);
		result.append(", alias: ");
		result.append(alias);
		result.append(')');
		return result.toString();
	}

	@Override
	public List<MobaProperty> getAllProperties() {
		return getProperties();
	}

	@Override
	public List<MobaProperty> getGenProperties() {
		return getProperties();
	}
} //MobaPayloadAttributeImpl
