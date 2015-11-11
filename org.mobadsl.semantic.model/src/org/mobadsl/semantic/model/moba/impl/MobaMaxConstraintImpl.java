/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaMaxConstraint;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Max Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaMaxConstraintImpl#getFilterValue <em>Filter Value</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaMaxConstraintImpl#getFilterConst <em>Filter Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaMaxConstraintImpl extends MobaConstraintImpl implements MobaMaxConstraint {

	private static final Logger LOGGER = LoggerFactory.getLogger(MobaMaxConstraintImpl.class);

	/**
	 * The default value of the '{@link #getFilterValue() <em>Filter Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilterValue()
	 * @generated
	 * @ordered
	 */
	protected static final double FILTER_VALUE_EDEFAULT = 0.0;
	/**
	 * The cached value of the '{@link #getFilterValue() <em>Filter Value</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilterValue()
	 * @generated
	 * @ordered
	 */
	protected double filterValue = FILTER_VALUE_EDEFAULT;
	/**
	 * The cached value of the '{@link #getFilterConst() <em>Filter Const</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilterConst()
	 * @generated
	 * @ordered
	 */
	protected MobaConstant filterConst;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaMaxConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_MAX_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public double getFilterValue() {
		return filterValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterValue(double newFilterValue) {
		double oldFilterValue = filterValue;
		filterValue = newFilterValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_VALUE, oldFilterValue, filterValue));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant getFilterConst() {
		if (filterConst != null && filterConst.eIsProxy()) {
			InternalEObject oldFilterConst = (InternalEObject)filterConst;
			filterConst = (MobaConstant)eResolveProxy(oldFilterConst);
			if (filterConst != oldFilterConst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_CONST, oldFilterConst, filterConst));
			}
		}
		return filterConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public MobaConstant basicGetFilterConst() {
		return filterConst;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterConst(MobaConstant newFilterConst) {
		MobaConstant oldFilterConst = filterConst;
		filterConst = newFilterConst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_CONST, oldFilterConst, filterConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_VALUE:
				return getFilterValue();
			case MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_CONST:
				if (resolve) return getFilterConst();
				return basicGetFilterConst();
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
			case MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_VALUE:
				setFilterValue((Double)newValue);
				return;
			case MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_CONST:
				setFilterConst((MobaConstant)newValue);
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
			case MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_VALUE:
				setFilterValue(FILTER_VALUE_EDEFAULT);
				return;
			case MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_CONST:
				setFilterConst((MobaConstant)null);
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
			case MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_VALUE:
				return filterValue != FILTER_VALUE_EDEFAULT;
			case MobaPackage.MOBA_MAX_CONSTRAINT__FILTER_CONST:
				return filterConst != null;
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
		result.append(" (filterValue: ");
		result.append(filterValue);
		result.append(')');
		return result.toString();
	}

	@Override
	public double getFilter() {
		if (getFilterConst() != null) {
			try {
				return Double.valueOf(getFilterConst().getValue());
			} catch (Exception ex) {
				LOGGER.error(String.format("Can not parse %s to double", getFilterConst().getValue()));
				throw new IllegalStateException(String.format("Can not parse %s to double", getFilterConst().getValue()));
			}
		}
		return getFilterValue();
	}

} // MobaMaxConstraintImpl
