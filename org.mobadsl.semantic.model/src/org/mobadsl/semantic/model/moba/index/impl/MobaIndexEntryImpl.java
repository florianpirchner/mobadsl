/**
 */
package org.mobadsl.semantic.model.moba.index.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;
import org.mobadsl.semantic.model.moba.index.MobaIndexPackage;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Entry</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl#getRelativePath
 * <em>Relative Path</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl#getFilename
 * <em>Filename</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl#getTemplateId
 * <em>Template Id</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl#getTemplateName
 * <em>Template Name</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl#getTemplateDescription
 * <em>Template Description</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl#getTemplateVersion
 * <em>Template Version</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.impl.MobaIndexEntryImpl#getTransientTemplate
 * <em>Transient Template</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MobaIndexEntryImpl extends MinimalEObjectImpl.Container implements MobaIndexEntry {
	/**
	 * The default value of the '{@link #getRelativePath()
	 * <em>Relative Path</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected static final String RELATIVE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRelativePath() <em>Relative Path</em>
	 * }' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getRelativePath()
	 * @generated
	 * @ordered
	 */
	protected String relativePath = RELATIVE_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFilename() <em>Filename</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected String filename = FILENAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateId() <em>Template Id</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTemplateId()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_ID_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTemplateName()
	 * <em>Template Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateName() <em>Template Name</em>
	 * }' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTemplateName()
	 * @generated
	 * @ordered
	 */
	protected String templateName = TEMPLATE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateDescription()
	 * <em>Template Description</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTemplateDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateDescription()
	 * <em>Template Description</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTemplateDescription()
	 * @generated
	 * @ordered
	 */
	protected String templateDescription = TEMPLATE_DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTemplateVersion()
	 * <em>Template Version</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTemplateVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String TEMPLATE_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTemplateVersion()
	 * <em>Template Version</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTemplateVersion()
	 * @generated
	 * @ordered
	 */
	protected String templateVersion = TEMPLATE_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransientTemplate()
	 * <em>Transient Template</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getTransientTemplate()
	 * @generated
	 * @ordered
	 */
	protected MobaApplication transientTemplate;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected MobaIndexEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MobaIndexPackage.Literals.MOBA_INDEX_ENTRY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getRelativePath() {
		return relativePath;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setRelativePath(String newRelativePath) {
		String oldRelativePath = relativePath;
		relativePath = newRelativePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaIndexPackage.MOBA_INDEX_ENTRY__RELATIVE_PATH,
					oldRelativePath, relativePath));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setFilename(String newFilename) {
		String oldFilename = filename;
		filename = newFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaIndexPackage.MOBA_INDEX_ENTRY__FILENAME,
					oldFilename, filename));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public String getTemplateId() {
		return MobaUtil.createApplicationId(getTemplateName(), getTemplateVersion());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public boolean isSetTemplateId() {
		return getTemplateId() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTemplateName() {
		return templateName;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTemplateName(String newTemplateName) {
		String oldTemplateName = templateName;
		templateName = newTemplateName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_NAME,
					oldTemplateName, templateName));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTemplateDescription() {
		return templateDescription;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTemplateDescription(String newTemplateDescription) {
		String oldTemplateDescription = templateDescription;
		templateDescription = newTemplateDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_DESCRIPTION, oldTemplateDescription,
					templateDescription));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public String getTemplateVersion() {
		return templateVersion;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setTemplateVersion(String newTemplateVersion) {
		String oldTemplateVersion = templateVersion;
		templateVersion = newTemplateVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_VERSION,
					oldTemplateVersion, templateVersion));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaApplication getTransientTemplate() {
		if (transientTemplate != null && transientTemplate.eIsProxy()) {
			InternalEObject oldTransientTemplate = (InternalEObject) transientTemplate;
			transientTemplate = (MobaApplication) eResolveProxy(oldTransientTemplate);
			if (transientTemplate != oldTransientTemplate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MobaIndexPackage.MOBA_INDEX_ENTRY__TRANSIENT_TEMPLATE, oldTransientTemplate,
							transientTemplate));
			}
		}
		return transientTemplate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public MobaApplication basicGetTransientTemplate() {
		return transientTemplate;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 */
	public void setTransientTemplate(MobaApplication newTransientTemplate) {
		MobaApplication oldTransientTemplate = transientTemplate;
		transientTemplate = newTransientTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MobaIndexPackage.MOBA_INDEX_ENTRY__TRANSIENT_TEMPLATE,
					oldTransientTemplate, transientTemplate));

		if (transientTemplate != null) {
			setTemplateName(transientTemplate.getName());
			setTemplateVersion(transientTemplate.getVersion());

			if (transientTemplate.eResource() != null) {
				String uriString = transientTemplate.eResource().getURI().toString();
				int start = uriString.lastIndexOf("/");
				String fileName = uriString.substring(start + 1);
				setFilename(fileName);
			}
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MobaIndexPackage.MOBA_INDEX_ENTRY__RELATIVE_PATH:
			return getRelativePath();
		case MobaIndexPackage.MOBA_INDEX_ENTRY__FILENAME:
			return getFilename();
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_ID:
			return getTemplateId();
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_NAME:
			return getTemplateName();
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_DESCRIPTION:
			return getTemplateDescription();
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_VERSION:
			return getTemplateVersion();
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TRANSIENT_TEMPLATE:
			if (resolve)
				return getTransientTemplate();
			return basicGetTransientTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MobaIndexPackage.MOBA_INDEX_ENTRY__RELATIVE_PATH:
			setRelativePath((String) newValue);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__FILENAME:
			setFilename((String) newValue);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_NAME:
			setTemplateName((String) newValue);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_DESCRIPTION:
			setTemplateDescription((String) newValue);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_VERSION:
			setTemplateVersion((String) newValue);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TRANSIENT_TEMPLATE:
			setTransientTemplate((MobaApplication) newValue);
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
		case MobaIndexPackage.MOBA_INDEX_ENTRY__RELATIVE_PATH:
			setRelativePath(RELATIVE_PATH_EDEFAULT);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__FILENAME:
			setFilename(FILENAME_EDEFAULT);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_NAME:
			setTemplateName(TEMPLATE_NAME_EDEFAULT);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_DESCRIPTION:
			setTemplateDescription(TEMPLATE_DESCRIPTION_EDEFAULT);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_VERSION:
			setTemplateVersion(TEMPLATE_VERSION_EDEFAULT);
			return;
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TRANSIENT_TEMPLATE:
			setTransientTemplate((MobaApplication) null);
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
		case MobaIndexPackage.MOBA_INDEX_ENTRY__RELATIVE_PATH:
			return RELATIVE_PATH_EDEFAULT == null ? relativePath != null : !RELATIVE_PATH_EDEFAULT.equals(relativePath);
		case MobaIndexPackage.MOBA_INDEX_ENTRY__FILENAME:
			return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_ID:
			return isSetTemplateId();
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_NAME:
			return TEMPLATE_NAME_EDEFAULT == null ? templateName != null : !TEMPLATE_NAME_EDEFAULT.equals(templateName);
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_DESCRIPTION:
			return TEMPLATE_DESCRIPTION_EDEFAULT == null ? templateDescription != null
					: !TEMPLATE_DESCRIPTION_EDEFAULT.equals(templateDescription);
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TEMPLATE_VERSION:
			return TEMPLATE_VERSION_EDEFAULT == null ? templateVersion != null
					: !TEMPLATE_VERSION_EDEFAULT.equals(templateVersion);
		case MobaIndexPackage.MOBA_INDEX_ENTRY__TRANSIENT_TEMPLATE:
			return transientTemplate != null;
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
		result.append(" (relativePath: ");
		result.append(relativePath);
		result.append(", filename: ");
		result.append(filename);
		result.append(", templateName: ");
		result.append(templateName);
		result.append(", templateDescription: ");
		result.append(templateDescription);
		result.append(", templateVersion: ");
		result.append(templateVersion);
		result.append(')');
		return result.toString();
	}

	@Override
	public String getRelativeFilePath() {
		String relPath = getRelativePath();
		if (!relPath.startsWith("/")) {
			relPath = "/" + relPath;
		}
		if (!relPath.endsWith("/")) {
			relPath = relPath + "/";
		}

		return relPath + getFilename();
	}

} // MobaIndexEntryImpl
