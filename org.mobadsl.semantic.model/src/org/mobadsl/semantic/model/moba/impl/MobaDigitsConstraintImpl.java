/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaDigitsConstraint;
import org.mobadsl.semantic.model.moba.MobaPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Digits Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl#getFilterIntegerValue <em>Filter Integer Value</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl#getFilterIntegerConst <em>Filter Integer Const</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl#getFilterFractionValue <em>Filter Fraction Value</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaDigitsConstraintImpl#getFilterFractionConst <em>Filter Fraction Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaDigitsConstraintImpl extends MobaConstraintImpl implements MobaDigitsConstraint {
	/**
	 * The default value of the '{@link #getFilterIntegerValue() <em>Filter Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected static final int FILTER_INTEGER_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFilterIntegerValue() <em>Filter Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterIntegerValue()
	 * @generated
	 * @ordered
	 */
	protected int filterIntegerValue = FILTER_INTEGER_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilterIntegerConst() <em>Filter Integer Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterIntegerConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant filterIntegerConst;

	/**
	 * The default value of the '{@link #getFilterFractionValue() <em>Filter Fraction Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterFractionValue()
	 * @generated
	 * @ordered
	 */
	protected static final int FILTER_FRACTION_VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getFilterFractionValue() <em>Filter Fraction Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterFractionValue()
	 * @generated
	 * @ordered
	 */
	protected int filterFractionValue = FILTER_FRACTION_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFilterFractionConst() <em>Filter Fraction Const</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilterFractionConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant filterFractionConst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaDigitsConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_DIGITS_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFilterIntegerValue() {
		return filterIntegerValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterIntegerValue(int newFilterIntegerValue) {
		int oldFilterIntegerValue = filterIntegerValue;
		filterIntegerValue = newFilterIntegerValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_VALUE, oldFilterIntegerValue, filterIntegerValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getFilterIntegerConst() {
		if (filterIntegerConst != null && filterIntegerConst.eIsProxy()) {
			InternalEObject oldFilterIntegerConst = (InternalEObject)filterIntegerConst;
			filterIntegerConst = (MobaConstant)eResolveProxy(oldFilterIntegerConst);
			if (filterIntegerConst != oldFilterIntegerConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_CONST, oldFilterIntegerConst, filterIntegerConst));
			}
		}
		return filterIntegerConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetFilterIntegerConst() {
		return filterIntegerConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterIntegerConst(MobaConstant newFilterIntegerConst) {
		MobaConstant oldFilterIntegerConst = filterIntegerConst;
		filterIntegerConst = newFilterIntegerConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_CONST, oldFilterIntegerConst, filterIntegerConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFilterFractionValue() {
		return filterFractionValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterFractionValue(int newFilterFractionValue) {
		int oldFilterFractionValue = filterFractionValue;
		filterFractionValue = newFilterFractionValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_VALUE, oldFilterFractionValue, filterFractionValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getFilterFractionConst() {
		if (filterFractionConst != null && filterFractionConst.eIsProxy()) {
			InternalEObject oldFilterFractionConst = (InternalEObject)filterFractionConst;
			filterFractionConst = (MobaConstant)eResolveProxy(oldFilterFractionConst);
			if (filterFractionConst != oldFilterFractionConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_CONST, oldFilterFractionConst, filterFractionConst));
			}
		}
		return filterFractionConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetFilterFractionConst() {
		return filterFractionConst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterFractionConst(MobaConstant newFilterFractionConst) {
		MobaConstant oldFilterFractionConst = filterFractionConst;
		filterFractionConst = newFilterFractionConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_CONST, oldFilterFractionConst, filterFractionConst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_VALUE:
				return getFilterIntegerValue();
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_CONST:
				if (resolve) return getFilterIntegerConst();
				return basicGetFilterIntegerConst();
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_VALUE:
				return getFilterFractionValue();
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_CONST:
				if (resolve) return getFilterFractionConst();
				return basicGetFilterFractionConst();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_VALUE:
				setFilterIntegerValue((Integer)newValue);
				return;
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_CONST:
				setFilterIntegerConst((MobaConstant)newValue);
				return;
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_VALUE:
				setFilterFractionValue((Integer)newValue);
				return;
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_CONST:
				setFilterFractionConst((MobaConstant)newValue);
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
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_VALUE:
				setFilterIntegerValue(FILTER_INTEGER_VALUE_EDEFAULT);
				return;
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_CONST:
				setFilterIntegerConst((MobaConstant)null);
				return;
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_VALUE:
				setFilterFractionValue(FILTER_FRACTION_VALUE_EDEFAULT);
				return;
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_CONST:
				setFilterFractionConst((MobaConstant)null);
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
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_VALUE:
				return filterIntegerValue != FILTER_INTEGER_VALUE_EDEFAULT;
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_INTEGER_CONST:
				return filterIntegerConst != null;
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_VALUE:
				return filterFractionValue != FILTER_FRACTION_VALUE_EDEFAULT;
			case MobaPackage.MOBA_DIGITS_CONSTRAINT__FILTER_FRACTION_CONST:
				return filterFractionConst != null;
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
		result.append(" (filterIntegerValue: ");
		result.append(filterIntegerValue);
		result.append(", filterFractionValue: ");
		result.append(filterFractionValue);
		result.append(')');
		return result.toString();
	}

} //MobaDigitsConstraintImpl
