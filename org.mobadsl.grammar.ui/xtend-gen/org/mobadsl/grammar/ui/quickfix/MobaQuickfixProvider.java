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
package org.mobadsl.grammar.ui.quickfix;

import com.google.common.base.Objects;
import java.util.ArrayList;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModification;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.mobadsl.grammar.validation.MobaValidator;
import org.mobadsl.ide.eclipse.TemplateIndexHelper;

@SuppressWarnings("all")
public class MobaQuickfixProvider extends DefaultQuickfixProvider {
  @Fix(MobaValidator.DOWNLOAD_TEMPLATE)
  public void downloadTemplate(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final IModification _function = (IModificationContext context) -> {
      final IXtextDocument xtextDocument = context.getXtextDocument();
      Integer _offset = issue.getOffset();
      Integer _length = issue.getLength();
      final String value = xtextDocument.get((_offset).intValue(), (_length).intValue());
      final TemplateIndexHelper.TemplateCoordinate coordinate = TemplateIndexHelper.TemplateCoordinate.parse(value);
      boolean _equals = Objects.equal(coordinate, null);
      if (_equals) {
        return;
      }
      Integer _offset_1 = issue.getOffset();
      Integer _length_1 = issue.getLength();
      String _templateID = coordinate.getTemplateID();
      xtextDocument.replace((_offset_1).intValue(), (_length_1).intValue(), _templateID);
      final IFile file = xtextDocument.<IFile>getAdapter(IFile.class);
      final IProject project = file.getProject();
      final TemplateIndexHelper helper = new TemplateIndexHelper();
      ArrayList<TemplateIndexHelper.TemplateCoordinate> _newArrayList = CollectionLiterals.<TemplateIndexHelper.TemplateCoordinate>newArrayList(coordinate);
      helper.downloadByCoordinate(project, _newArrayList);
      helper.dispose();
    };
    acceptor.accept(issue, "Download template", "Download the template from the repository.", "index.gif", _function);
  }
}
