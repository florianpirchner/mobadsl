/**
 */
package org.mobadsl.semantic.model.moba.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaRegexpConstraint;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Regexp Constraint</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRegexpConstraintImpl#getFilterString <em>Filter String</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaRegexpConstraintImpl#getFilterConst <em>Filter Const</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaRegexpConstraintImpl extends MobaConstraintImpl implements MobaRegexpConstraint {
	/**
	 * The default value of the '{@link #getFilterString() <em>Filter String</em>}' attribute.
	 * <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * @see #getFilterString()
	 * @generated
	 * @ordered
	 */
	protected static final String FILTER_STRING_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFilterString() <em>Filter String</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFilterString()
	 * @generated
	 * @ordered
	 */
	protected String filterString = FILTER_STRING_EDEFAULT;
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
	protected MobaRegexpConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_REGEXP_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public String getFilterString() {
		return filterString;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterString(String newFilterString) {
		String oldFilterString = filterString;
		filterString = newFilterString;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_STRING, oldFilterString, filterString));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_CONST, oldFilterConst, filterConst));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_CONST, oldFilterConst, filterConst));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_STRING:
				return getFilterString();
			case MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_CONST:
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
			case MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_STRING:
				setFilterString((String)newValue);
				return;
			case MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_CONST:
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
			case MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_STRING:
				setFilterString(FILTER_STRING_EDEFAULT);
				return;
			case MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_CONST:
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
			case MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_STRING:
				return FILTER_STRING_EDEFAULT == null ? filterString != null : !FILTER_STRING_EDEFAULT.equals(filterString);
			case MobaPackage.MOBA_REGEXP_CONSTRAINT__FILTER_CONST:
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
		result.append(" (filterString: ");
		result.append(filterString);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getFilter() {
		if (getFilterConst() != null) {
			return getFilterConst().getValue();
		}
		return getFilterString();
	}

} // MobaRegexpConstraintImpl
