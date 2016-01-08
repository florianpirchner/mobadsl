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
package org.mobadsl.grammar.ui.quickfix

import org.eclipse.core.resources.IFile
import org.eclipse.core.resources.IProject
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue
import org.mobadsl.grammar.validation.MobaValidator
import org.mobadsl.ide.eclipse.TemplateIndexHelper

class MobaQuickfixProvider extends DefaultQuickfixProvider {

	@Fix(MobaValidator.DOWNLOAD_TEMPLATE)
	def downloadTemplate(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Download template', 'Download the template from the repository.', 'index.gif') [ context |
			val xtextDocument = context.xtextDocument
			val value = xtextDocument.get(issue.offset, issue.length)
			val coordinate = TemplateIndexHelper.TemplateCoordinate.parse(value)
			if (coordinate == null) {
				return
			}

			// replace the entry
			xtextDocument.replace(issue.offset, issue.length, coordinate.getTemplateID)

			// download the file
			val IFile file = xtextDocument.getAdapter(IFile)
			val IProject project = file.project

			val TemplateIndexHelper helper = new TemplateIndexHelper();
			helper.downloadByCoordinate(project, newArrayList(coordinate))
			helper.dispose
		]
	}
}
