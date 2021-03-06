/**
 * Copyright (c) 2015 - 2016, Lunifera GmbH (Wien), Ekkehard Gentz (Rosenheim)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.mobadsl.grammar.ui.contentassist;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.mobadsl.api.template.repository.ITemplateRepositoryManager;
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate;
import org.mobadsl.grammar.ui.contentassist.AbstractMobaProposalProvider;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;
import org.mobadsl.semantic.model.moba.util.MobaUtil;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

/**
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#content-assist
 * on how to customize the content assistant.
 */
@SuppressWarnings("all")
public class MobaProposalProvider extends AbstractMobaProposalProvider {
  @Inject
  private ExtensionGeneratorDelegate generatorDelegate;
  
  @Inject
  @Named(Constants.LANGUAGE_NAME)
  private String grammarName;
  
  @Override
  public void completeMobaTemplate_Template(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeMobaTemplate_Template(model, assignment, context, acceptor);
    final ITemplateRepositoryManager manager = this.getManager();
    boolean _notEquals = (!Objects.equal(manager, null));
    if (_notEquals) {
      List<MobaIndexEntry> _availableEntries = manager.getAvailableEntries();
      final Consumer<MobaIndexEntry> _function = (MobaIndexEntry it) -> {
        EObject _eContainer = it.eContainer();
        final MobaIndex index = ((MobaIndex) _eContainer);
        String _createProposalValue = this.createProposalValue(index, it);
        StyledString _createStyledString = this.createStyledString(index, it);
        Image _image = this.getImage(it);
        ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal(_createProposalValue, _createStyledString, _image, 1000, context);
        acceptor.accept(_doCreateProposal);
      };
      _availableEntries.forEach(_function);
    }
  }
  
  @Override
  public void completeMobaGeneratorIDFeature_GeneratorId(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeMobaGeneratorIDFeature_GeneratorId(model, assignment, context, acceptor);
    final String prefix = context.getPrefix();
    final Map<String, ExtensionGeneratorDelegate.Metadata> allGenerators = this.generatorDelegate.readExtentionsMetadataById(this.grammarName, prefix);
    Collection<ExtensionGeneratorDelegate.Metadata> _values = allGenerators.values();
    final Consumer<ExtensionGeneratorDelegate.Metadata> _function = (ExtensionGeneratorDelegate.Metadata it) -> {
      StringConcatenation _builder = new StringConcatenation();
      String _id = it.getId();
      String _version = it.getVersion();
      String _versionedIdWithWhitespace = MobaUtil.toVersionedIdWithWhitespace(_id, _version);
      _builder.append(_versionedIdWithWhitespace, "");
      StyledString _createStyledString = this.createStyledString(it);
      Image _image = this.getImage(model);
      ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal(_builder.toString(), _createStyledString, _image, 
        1000, context);
      acceptor.accept(_doCreateProposal);
    };
    _values.forEach(_function);
  }
  
  @Override
  public void completeMobaGeneratorIDFeature_GeneratorVersion(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeMobaGeneratorIDFeature_GeneratorId(model, assignment, context, acceptor);
    final String prefix = context.getPrefix();
    final MobaGeneratorIDFeature feature = ((MobaGeneratorIDFeature) model);
    String _id = feature.getId();
    final Map<String, ExtensionGeneratorDelegate.Metadata> allGenerators = this.generatorDelegate.readExtentionsMetadataByVersion(this.grammarName, _id, prefix);
    Collection<ExtensionGeneratorDelegate.Metadata> _values = allGenerators.values();
    final Consumer<ExtensionGeneratorDelegate.Metadata> _function = (ExtensionGeneratorDelegate.Metadata it) -> {
      String _version = it.getVersion();
      StyledString _createStyledStringForVersion = this.createStyledStringForVersion(it);
      Image _image = this.getImage(model);
      ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal(_version, _createStyledStringForVersion, _image, 1000, context);
      acceptor.accept(_doCreateProposal);
    };
    _values.forEach(_function);
  }
  
  @Override
  public void completeMobaRESTAttribute_KeyString(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    StyledString _displayString_KeyString = this.getDisplayString_KeyString();
    Image _image = this.getImage(model);
    ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal("param1", _displayString_KeyString, _image, 1000, context);
    acceptor.accept(_doCreateProposal);
  }
  
  public StyledString createStyledString(final ExtensionGeneratorDelegate.Metadata metadata) {
    String _name = metadata.getName();
    final StyledString result = new StyledString(_name);
    String _version = metadata.getVersion();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_version);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("version ");
      String _version_1 = metadata.getVersion();
      _builder.append(_version_1, " ");
      result.append(_builder.toString(), StyledString.QUALIFIER_STYLER);
    }
    String _license = metadata.getLicense();
    boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_license);
    boolean _not_1 = (!_isNullOrEmpty_1);
    if (_not_1) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("under ");
      String _license_1 = metadata.getLicense();
      _builder_1.append(_license_1, " ");
      result.append(_builder_1.toString(), StyledString.QUALIFIER_STYLER);
    }
    String _description = metadata.getDescription();
    boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_description);
    boolean _not_2 = (!_isNullOrEmpty_2);
    if (_not_2) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" ");
      _builder_2.append("- ");
      String _description_1 = metadata.getDescription();
      _builder_2.append(_description_1, " ");
      result.append(_builder_2.toString(), StyledString.COUNTER_STYLER);
    }
    return result;
  }
  
  @Override
  public void complete_MobaMuliplicity(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.complete_MobaMuliplicity(model, ruleCall, context, acceptor);
    StyledString _displayString_Multiplicity = this.getDisplayString_Multiplicity("attName", "the attName for optional");
    Image _image = this.getImage(model);
    ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal("attName", _displayString_Multiplicity, _image, 1001, context);
    acceptor.accept(_doCreateProposal);
    StyledString _displayString_Multiplicity_1 = this.getDisplayString_Multiplicity("[*]", "to many");
    Image _image_1 = this.getImage(model);
    ConfigurableCompletionProposal _doCreateProposal_1 = this.doCreateProposal("[*]", _displayString_Multiplicity_1, _image_1, 1000, context);
    acceptor.accept(_doCreateProposal_1);
    StyledString _displayString_Multiplicity_2 = this.getDisplayString_Multiplicity("[+]", "to many, but at least one");
    Image _image_2 = this.getImage(model);
    ConfigurableCompletionProposal _doCreateProposal_2 = this.doCreateProposal("[+]", _displayString_Multiplicity_2, _image_2, 1000, context);
    acceptor.accept(_doCreateProposal_2);
    StyledString _displayString_Multiplicity_3 = this.getDisplayString_Multiplicity("[?]", "optional");
    Image _image_3 = this.getImage(model);
    ConfigurableCompletionProposal _doCreateProposal_3 = this.doCreateProposal("[?]", _displayString_Multiplicity_3, _image_3, 1000, context);
    acceptor.accept(_doCreateProposal_3);
    StyledString _displayString_Multiplicity_4 = this.getDisplayString_Multiplicity("[0..*]", "to many");
    Image _image_4 = this.getImage(model);
    ConfigurableCompletionProposal _doCreateProposal_4 = this.doCreateProposal("[0 ..*]", _displayString_Multiplicity_4, _image_4, 1000, context);
    acceptor.accept(_doCreateProposal_4);
  }
  
  @Override
  public void completeMobaDtoAttribute_Alias(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeMobaDtoAttribute_Alias(model, assignment, context, acceptor);
    Image _image = this.getImage(model);
    ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal("aliasName", null, _image, 1000, context);
    acceptor.accept(_doCreateProposal);
  }
  
  @Override
  public void completeMobaDtoReference_Alias(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeMobaDtoReference_Alias(model, assignment, context, acceptor);
    Image _image = this.getImage(model);
    ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal("aliasName", null, _image, 1000, context);
    acceptor.accept(_doCreateProposal);
  }
  
  @Override
  public void completeMobaDtoEmbeddable_Alias(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeMobaDtoEmbeddable_Alias(model, assignment, context, acceptor);
    Image _image = this.getImage(model);
    ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal("aliasName", null, _image, 1000, context);
    acceptor.accept(_doCreateProposal);
  }
  
  public StyledString getDisplayString_Multiplicity(final String value, final String description) {
    final StyledString string = new StyledString((value + " - "));
    string.append(description, StyledString.QUALIFIER_STYLER);
    return string;
  }
  
  public StyledString createStyledStringForVersion(final ExtensionGeneratorDelegate.Metadata metadata) {
    String _version = metadata.getVersion();
    final StyledString result = new StyledString(_version);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    String _name = metadata.getName();
    _builder.append(_name, " ");
    result.append(_builder.toString(), StyledString.QUALIFIER_STYLER);
    String _license = metadata.getLicense();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_license);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("under ");
      String _license_1 = metadata.getLicense();
      _builder_1.append(_license_1, " ");
      result.append(_builder_1.toString(), StyledString.QUALIFIER_STYLER);
    }
    String _description = metadata.getDescription();
    boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_description);
    boolean _not_1 = (!_isNullOrEmpty_1);
    if (_not_1) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append(" ");
      _builder_2.append("- ");
      String _description_1 = metadata.getDescription();
      _builder_2.append(_description_1, " ");
      result.append(_builder_2.toString(), StyledString.COUNTER_STYLER);
    }
    return result;
  }
  
  public StyledString createStyledString(final MobaIndex index, final MobaIndexEntry entry) {
    final StyledString result = new StyledString("index://");
    StringConcatenation _builder = new StringConcatenation();
    String _id = index.getId();
    _builder.append(_id, "");
    _builder.append(":");
    String _templateId = entry.getTemplateId();
    _builder.append(_templateId, "");
    result.append(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append(" ");
    _builder_1.append("- ");
    String _templateDescription = entry.getTemplateDescription();
    _builder_1.append(_templateDescription, " ");
    result.append(_builder_1.toString(), StyledString.COUNTER_STYLER);
    return result;
  }
  
  public String createProposalValue(final MobaIndex index, final MobaIndexEntry entry) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("index://");
    String _id = index.getId();
    _builder.append(_id, "");
    _builder.append(":");
    String _templateId = entry.getTemplateId();
    _builder.append(_templateId, "");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public ITemplateRepositoryManager getManager() {
    Bundle _bundle = FrameworkUtil.getBundle(MobaProposalProvider.class);
    final BundleContext bc = _bundle.getBundleContext();
    final ServiceReference<ITemplateRepositoryManager> ref = bc.<ITemplateRepositoryManager>getServiceReference(ITemplateRepositoryManager.class);
    boolean _notEquals = (!Objects.equal(ref, null));
    if (_notEquals) {
      final ITemplateRepositoryManager manager = bc.<ITemplateRepositoryManager>getService(ref);
      return manager;
    }
    return null;
  }
  
  public StyledString getDisplayString_KeyString() {
    final StyledString string = new StyledString("param1");
    string.append(" - any valid ID", StyledString.QUALIFIER_STYLER);
    return string;
  }
  
  @Override
  public String getDisplayString(final EObject element, final String givenQualifiedNameAsString, final String shortName) {
    String qualifiedNameAsString = givenQualifiedNameAsString;
    boolean _equals = Objects.equal(qualifiedNameAsString, null);
    if (_equals) {
      qualifiedNameAsString = shortName;
    }
    boolean _equals_1 = Objects.equal(qualifiedNameAsString, null);
    if (_equals_1) {
      boolean _notEquals = (!Objects.equal(element, null));
      if (_notEquals) {
        ILabelProvider _labelProvider = this.getLabelProvider();
        String _text = _labelProvider.getText(element);
        qualifiedNameAsString = _text;
      } else {
        return null;
      }
    }
    if ((!(element instanceof MobaApplication))) {
      IQualifiedNameConverter _qualifiedNameConverter = this.getQualifiedNameConverter();
      final QualifiedName qualifiedName = _qualifiedNameConverter.toQualifiedName(qualifiedNameAsString);
      int _segmentCount = qualifiedName.getSegmentCount();
      boolean _greaterThan = (_segmentCount > 1);
      if (_greaterThan) {
        String _lastSegment = qualifiedName.getLastSegment();
        String _plus = (_lastSegment + " - ");
        return (_plus + qualifiedNameAsString);
      }
    }
    return qualifiedNameAsString;
  }
}
