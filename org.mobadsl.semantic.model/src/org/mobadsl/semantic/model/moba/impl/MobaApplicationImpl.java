/**
 */
package org.mobadsl.semantic.model.moba.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaPayload;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaRestCrud;
import org.mobadsl.semantic.model.moba.MobaRestCustom;
import org.mobadsl.semantic.model.moba.MobaService;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaTemplate;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Application</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.mobadsl.semantic.model.moba.impl.MobaApplicationImpl#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaApplicationImpl extends MinimalEObjectImpl.Container implements MobaApplication {
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
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<MobaApplicationFeature> features;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MobaApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaPackage.Literals.MOBA_APPLICATION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaProperty> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<MobaProperty>(MobaProperty.class, this, MobaPackage.MOBA_APPLICATION__PROPERTIES);
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
			eNotify(new ENotificationImpl(this, Notification.SET, MobaPackage.MOBA_APPLICATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MobaApplicationFeature> getFeatures() {
		if (features == null) {
			features = new EObjectContainmentEList<MobaApplicationFeature>(MobaApplicationFeature.class, this, MobaPackage.MOBA_APPLICATION__FEATURES);
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case MobaPackage.MOBA_APPLICATION__FEATURES:
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				return getProperties();
			case MobaPackage.MOBA_APPLICATION__NAME:
				return getName();
			case MobaPackage.MOBA_APPLICATION__FEATURES:
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends MobaProperty>)newValue);
				return;
			case MobaPackage.MOBA_APPLICATION__NAME:
				setName((String)newValue);
				return;
			case MobaPackage.MOBA_APPLICATION__FEATURES:
				getFeatures().clear();
				getFeatures().addAll((Collection<? extends MobaApplicationFeature>)newValue);
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				getProperties().clear();
				return;
			case MobaPackage.MOBA_APPLICATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MobaPackage.MOBA_APPLICATION__FEATURES:
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
			case MobaPackage.MOBA_APPLICATION__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case MobaPackage.MOBA_APPLICATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MobaPackage.MOBA_APPLICATION__FEATURES:
				return features != null && !features.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collect(Class<T> clazz) {
		return getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList());
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> collectAll(MobaApplication instance, Class<T> clazz) {
		List<T> result = new ArrayList<>();
		result.addAll(instance.getFeatures().stream().filter(e -> clazz.isAssignableFrom(e.getClass())).map(e -> (T) e)
				.collect(Collectors.<T> toList()));

		for (MobaTemplate template : instance.getTemplates()) {
			result.addAll(collectAll(template.getTemplate(), clazz));
		}

		return result;
	}

	// private void doGetAllTemplates(MobaApplication app, List<MobaTemplate>
	// result) {
	//
	// List<MobaTemplate> templates = app.getTemplates();
	// if (templates.isEmpty()) {
	// return;
	// }
	//
	// for (MobaTemplate template : templates) {
	// if (result.contains(template)) {
	// throw new RecursionException(app, template);
	// }
	// result.add(template);
	//
	// doGetAllTemplates(template.getTemplate(), result);
	// }
	// }

	@Override
	public List<MobaConstant> getConstants() {
		return collect(MobaConstant.class);
	}

	@Override
	public List<MobaData> getDatas() {
		return collect(MobaData.class);
	}

	@Override
	public List<MobaDto> getDtos() {
		return collect(MobaDto.class);
	}

	@Override
	public List<MobaPayload> getPayloads() {
		return collect(MobaPayload.class);
	}

	@Override
	public List<MobaQueue> getQueues() {
		return collect(MobaQueue.class);
	}

	@Override
	public List<MobaDataType> getDataTypes() {
		return collect(MobaDataType.class);
	}

	@Override
	public List<MobaGenerator> getGenerators() {
		return collect(MobaGenerator.class);
	}

	@Override
	public List<MobaService> getServices() {
		return collect(MobaService.class);
	}

	@Override
	public List<MobaRestCustom> getRestCustoms() {
		return collect(MobaRestCustom.class);
	}

	@Override
	public List<MobaRestCrud> getRestCruds() {
		return collect(MobaRestCrud.class);
	}

	@Override
	public List<MobaSettings> getSettings() {
		return collect(MobaSettings.class);
	}

	@Override
	public List<MobaTemplate> getTemplates() {
		return collect(MobaTemplate.class);
	}

	@Override
	public List<MobaApplicationFeature> getAllFeatures() {
		return collectAll(this, MobaApplicationFeature.class);
	}

	@Override
	public List<MobaConstant> getAllConstants() {
		return collectAll(this, MobaConstant.class);
	}

	@Override
	public List<MobaData> getAllDatas() {
		return collectAll(this, MobaData.class);
	}

	@Override
	public List<MobaDto> getAllDtos() {
		return collectAll(this, MobaDto.class);
	}

	@Override
	public List<MobaPayload> getAllPayloads() {
		return collectAll(this, MobaPayload.class);
	}

	@Override
	public List<MobaQueue> getAllQueues() {
		return collectAll(this, MobaQueue.class);
	}

	@Override
	public List<MobaDataType> getAllDataTypes() {
		return collectAll(this, MobaDataType.class);
	}

	@Override
	public List<MobaGenerator> getAllGenerators() {
		return collectAll(this, MobaGenerator.class);
	}

	@Override
	public List<MobaService> getAllServices() {
		return collectAll(this, MobaService.class);
	}

	@Override
	public List<MobaRestCustom> getAllRestCustoms() {
		return collectAll(this, MobaRestCustom.class);
	}

	@Override
	public List<MobaRestCrud> getAllRestCruds() {
		return collectAll(this, MobaRestCrud.class);
	}

	@Override
	public List<MobaSettings> getAllSettings() {
		return collectAll(this, MobaSettings.class);
	}

	@Override
	public List<MobaTemplate> getAllTemplates() {
		return collectAll(this, MobaTemplate.class);
	}

} // MobaApplicationImpl
