/**
 * generated by Xtext 2.9.0.beta6
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
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.ui.editor.contentassist.ConfigurableCompletionProposal;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.mobadsl.api.template.repository.ITemplateRepositoryManager;
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate;
import org.mobadsl.grammar.ui.contentassist.AbstractMobaProposalProvider;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;
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
  public void completeMobaGeneratorIDFeature_GeneratorConst(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.completeMobaTemplate_Template(model, assignment, context, acceptor);
    final Map<String, ExtensionGeneratorDelegate.Metadata> allGenerators = this.generatorDelegate.readExtentionsMetadata(this.grammarName, null);
    Collection<ExtensionGeneratorDelegate.Metadata> _values = allGenerators.values();
    final Consumer<ExtensionGeneratorDelegate.Metadata> _function = (ExtensionGeneratorDelegate.Metadata it) -> {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("\"");
      String _id = it.getId();
      _builder.append(_id, "");
      _builder.append("\"");
      StyledString _createStyledString = this.createStyledString(it);
      Image _image = this.getImage(model);
      ConfigurableCompletionProposal _doCreateProposal = this.doCreateProposal(_builder.toString(), _createStyledString, _image, 1000, context);
      acceptor.accept(_doCreateProposal);
    };
    _values.forEach(_function);
  }
  
  public StyledString createStyledString(final ExtensionGeneratorDelegate.Metadata metadata) {
    String _name = metadata.getName();
    final StyledString result = new StyledString(_name);
    String _license = metadata.getLicense();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_license);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append(" ");
      _builder.append("under (");
      String _license_1 = metadata.getLicense();
      _builder.append(_license_1, " ");
      _builder.append(")");
      result.append(_builder.toString(), StyledString.QUALIFIER_STYLER);
    }
    String _description = metadata.getDescription();
    boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_description);
    boolean _not_1 = (!_isNullOrEmpty_1);
    if (_not_1) {
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append(" ");
      _builder_1.append("- ");
      String _description_1 = metadata.getDescription();
      _builder_1.append(_description_1, " ");
      result.append(_builder_1.toString(), StyledString.COUNTER_STYLER);
    }
    return result;
  }
  
  public StyledString createStyledString(final MobaIndex index, final MobaIndexEntry entry) {
    final StyledString result = new StyledString("... ");
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
    _builder.append("»");
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
}
