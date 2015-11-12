/**
 */
package org.mobadsl.semantic.model.moba.index;

import org.eclipse.emf.ecore.EObject;
import org.mobadsl.semantic.model.moba.MobaApplication;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Entry</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getRelativePath
 * <em>Relative Path</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getFilename
 * <em>Filename</em>}</li>
 * <li>{@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTemplateId
 * <em>Template Id</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTemplateName
 * <em>Template Name</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTemplateDescription
 * <em>Template Description</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTemplateVersion
 * <em>Template Version</em>}</li>
 * <li>
 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTransientTemplate
 * <em>Transient Template</em>}</li>
 * </ul>
 *
 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry()
 * @model
 * @generated
 */
public interface MobaIndexEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Relative Path</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relative Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Relative Path</em>' attribute.
	 * @see #setRelativePath(String)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_RelativePath()
	 * @model required="true"
	 * @generated
	 */
	String getRelativePath();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getRelativePath
	 * <em>Relative Path</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Relative Path</em>' attribute.
	 * @see #getRelativePath()
	 * @generated
	 */
	void setRelativePath(String value);

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Filename</em>' attribute.
	 * @see #setFilename(String)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_Filename()
	 * @model required="true"
	 * @generated
	 */
	String getFilename();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getFilename
	 * <em>Filename</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @param value
	 *            the new value of the '<em>Filename</em>' attribute.
	 * @see #getFilename()
	 * @generated
	 */
	void setFilename(String value);

	/**
	 * Returns the value of the '<em><b>Template Id</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Id</em>' attribute isn't clear, there
	 * really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template Id</em>' attribute.
	 * @see #isSetTemplateId()
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_TemplateId()
	 * @model unsettable="true" transient="true" changeable="false"
	 *        volatile="true" derived="true"
	 * @generated
	 */
	String getTemplateId();

	/**
	 * Returns whether the value of the '
	 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTemplateId
	 * <em>Template Id</em>}' attribute is set. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @return whether the value of the '<em>Template Id</em>' attribute is set.
	 * @see #getTemplateId()
	 * @generated
	 */
	boolean isSetTemplateId();

	/**
	 * Returns the value of the '<em><b>Template Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template Name</em>' attribute.
	 * @see #setTemplateName(String)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_TemplateName()
	 * @model required="true"
	 * @generated
	 */
	String getTemplateName();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTemplateName
	 * <em>Template Name</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Template Name</em>' attribute.
	 * @see #getTemplateName()
	 * @generated
	 */
	void setTemplateName(String value);

	/**
	 * Returns the value of the '<em><b>Template Description</b></em>'
	 * attribute. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Description</em>' attribute isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template Description</em>' attribute.
	 * @see #setTemplateDescription(String)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_TemplateDescription()
	 * @model required="true"
	 * @generated
	 */
	String getTemplateDescription();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTemplateDescription
	 * <em>Template Description</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Template Description</em>'
	 *            attribute.
	 * @see #getTemplateDescription()
	 * @generated
	 */
	void setTemplateDescription(String value);

	/**
	 * Returns the value of the '<em><b>Template Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Template Version</em>' attribute.
	 * @see #setTemplateVersion(String)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_TemplateVersion()
	 * @model required="true"
	 * @generated
	 */
	String getTemplateVersion();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTemplateVersion
	 * <em>Template Version</em>}' attribute. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Template Version</em>' attribute.
	 * @see #getTemplateVersion()
	 * @generated
	 */
	void setTemplateVersion(String value);

	/**
	 * Returns the value of the '<em><b>Transient Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transient Template</em>' reference isn't
	 * clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Transient Template</em>' reference.
	 * @see #setTransientTemplate(MobaApplication)
	 * @see org.mobadsl.semantic.model.moba.index.MobaIndexPackage#getMobaIndexEntry_TransientTemplate()
	 * @model transient="true" derived="true"
	 * @generated
	 */
	MobaApplication getTransientTemplate();

	/**
	 * Sets the value of the '
	 * {@link org.mobadsl.semantic.model.moba.index.MobaIndexEntry#getTransientTemplate
	 * <em>Transient Template</em>}' reference. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Transient Template</em>' reference.
	 * @see #getTransientTemplate()
	 * @generated
	 */
	void setTransientTemplate(MobaApplication value);

	/**
	 * Returns the relative file path. Starting with "/".
	 * 
	 * @return
	 */
	String getRelativeFilePath();

} // MobaIndexEntry
