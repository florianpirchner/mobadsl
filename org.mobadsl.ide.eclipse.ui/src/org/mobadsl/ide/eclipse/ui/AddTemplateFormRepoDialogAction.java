package org.mobadsl.ide.eclipse.ui;

import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.mobadsl.ide.eclipse.ui.nature.ToggleMobaNatureAction;
import org.slf4j.LoggerFactory;

public class AddTemplateFormRepoDialogAction implements IObjectActionDelegate {

	private static final org.slf4j.Logger log = LoggerFactory.getLogger(ToggleMobaNatureAction.class);

	private ISelection selection;

	public void run(IAction action) {
		if (selection instanceof IStructuredSelection) {
			for (Iterator<?> it = ((IStructuredSelection) selection).iterator(); it.hasNext();) {
				Object element = it.next();
				IProject project = null;
				if (element instanceof IProject) {
					project = (IProject) element;
				} else if (element instanceof IAdaptable) {
					project = (IProject) ((IAdaptable) element).getAdapter(IProject.class);
				}
				if (project != null) {
					addTemplateByDialog(project);
				}
			}
		}
	}

	public void selectionChanged(IAction action, ISelection selection) {
		this.selection = selection;
	}

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

	public void addTemplateByDialog(IProject project) {
		Dialog dialog = new TemplatesFromRepoCompositeDialog(project, Display.getCurrent().getActiveShell());
		dialog.open();
	}

}