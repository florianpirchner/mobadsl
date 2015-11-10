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
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Constant</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaConstantImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaConstantImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaConstantImpl#getValueAST <em>Value AST</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaConstantImpl extends MobaApplicationFeatureImpl implements MobaConstant {
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
	 * The cached value of the '{@link #getValueAST() <em>Value AST</em>}' containment reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getValueAST()
	 * @generated
	 * @ordered
	 */
	protected MobaConstantValue valueAST;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaConstantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_CONSTANT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this, MobaPackage.MOBA_CONSTANT__PROPERTIES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CONSTANT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstantValue getValueAST() {
		return valueAST;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValueAST(MobaConstantValue newValueAST, NotificationChain msgs) {
		MobaConstantValue oldValueAST = valueAST;
		valueAST = newValueAST;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CONSTANT__VALUE_AST, oldValueAST, newValueAST);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueAST(MobaConstantValue newValueAST) {
		if (newValueAST != valueAST) {
			NotificationChain msgs = null;
			if (valueAST != null)
				msgs = ((InternalEObject)valueAST).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_CONSTANT__VALUE_AST, null, msgs);
			if (newValueAST != null)
				msgs = ((InternalEObject)newValueAST).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MobaPackage.MOBA_CONSTANT__VALUE_AST, null, msgs);
			msgs = basicSetValueAST(newValueAST, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_CONSTANT__VALUE_AST, newValueAST, newValueAST));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MobaPackage.MOBA_CONSTANT__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case MobaPackage.MOBA_CONSTANT__VALUE_AST:
				return basicSetValueAST(null, msgs);
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
			case MobaPackage.MOBA_CONSTANT__PROPERTIES:
				return getProperties();
			case MobaPackage.MOBA_CONSTANT__NAME:
				return getName();
			case MobaPackage.MOBA_CONSTANT__VALUE_AST:
				return getValueAST();
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
			case MobaPackage.MOBA_CONSTANT__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MobaProperty>)newValue);
				return;
			case MobaPackage.MOBA_CONSTANT__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_CONSTANT__VALUE_AST:
				setValueAST((MobaConstantValue)newValue);
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
			case MobaPackage.MOBA_CONSTANT__PROPERTIES:
				getProperties().clear();
				return;
			case MobaPackage.MOBA_CONSTANT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_CONSTANT__VALUE_AST:
				setValueAST((MobaConstantValue)null);
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
			case MobaPackage.MOBA_CONSTANT__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MobaPackage.MOBA_CONSTANT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_CONSTANT__VALUE_AST:
				return valueAST != null;
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
				case MobaPackage.MOBA_CONSTANT__PROPERTIES: return MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES;
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
				case MobaPackage.MOBA_PROPERTIES_ABLE__PROPERTIES: return MobaPackage.MOBA_CONSTANT__PROPERTIES;
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
	public String getValue() {
		return getValueAST() != null ? getValueAST().getValue() : null;
	}

	@Override
	public List<MobaProperty> getAllProperties() {
		return getProperties();
	}

	@Override
	public List<MobaProperty> getGenProperties() {
		return getProperties();
	}

} // MobaConstantImpl
