package org.mobadsl.ide.eclipse.ui;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.mobadsl.ide.eclipse.TemplateIndexHelper;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;

public class TemplatesFromRepoCompositeDialog extends Dialog {

	protected static final int CONTROL_OFFSET = 10;

	private TreeViewer treeViewer;
	private Image indexImage = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/index.gif")
			.createImage();
	private Image indexEntryImage = Activator.imageDescriptorFromPlugin(Activator.PLUGIN_ID, "icons/indexentry.gif")
			.createImage();

	private TemplateIndexHelper templateHelper = new TemplateIndexHelper();
	private ArrayList<MobaIndexEntry> toDownload = new ArrayList<MobaIndexEntry>();

	private IProject project;

	protected TemplatesFromRepoCompositeDialog(IProject project, Shell parentShell) {
		super(parentShell);

		this.project = project;
		setShellStyle(getShellStyle() | SWT.MAX | SWT.RESIZE);
	}

	@Override
	protected void configureShell(Shell shell) {
		super.configureShell(shell);
		shell.setText("Download templates from repository");
	}

	@Override
	protected Control createDialogArea(Composite parent) {

		Composite composite = (Composite) super.createDialogArea(parent);
		{
			FormLayout layout = new FormLayout();
			composite.setLayout(layout);

			GridData data = new GridData();
			data.verticalAlignment = GridData.FILL;
			data.grabExcessVerticalSpace = true;
			data.horizontalAlignment = GridData.FILL;
			data.grabExcessHorizontalSpace = true;
			data.widthHint = 600;
			data.heightHint = 315;
			composite.setLayoutData(data);
		}

		createPartControl(composite);

		return composite;
	}

	public void createPartControl(Composite parent) {

		treeViewer = new TreeViewer(parent, SWT.MULTI);
		treeViewer.setAutoExpandLevel(2);

		FormData data = new FormData();
		// data.left = new FormAttachment(0, CONTROL_OFFSET);
		// data.top = new FormAttachment(buttonComposite, CONTROL_OFFSET);
		data.top = new FormAttachment(0, CONTROL_OFFSET);
		data.bottom = new FormAttachment(100, CONTROL_OFFSET);
		data.left = new FormAttachment(0, CONTROL_OFFSET);
		data.right = new FormAttachment(100, -CONTROL_OFFSET);
		treeViewer.getTree().setLayoutData(data);

		treeViewer.addSelectionChangedListener(e -> selectionChanged(e));

		treeViewer.setContentProvider(new ContentProvider());
		treeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				if (element instanceof MobaIndex) {
					return indexImage;
				} else if (element instanceof MobaIndexEntry) {
					return indexEntryImage;
				}
				return super.getImage(element);
			}

			@Override
			public String getText(Object element) {
				if (element instanceof String) {
					return (String) element;
				} else if (element instanceof MobaIndex) {
					MobaIndex index = (MobaIndex) element;
					return index.getName() + ":" + index.getVersion() + " - " + index.getDescription();
				} else if (element instanceof MobaIndexEntry) {
					MobaIndexEntry entry = (MobaIndexEntry) element;
					return templateHelper.getFileName(entry) + ":" + entry.getVersion() + " - "
							+ entry.getDescription();
				} else if (element instanceof URI) {
					return element.toString();
				}
				return "";
			}
		});

		treeViewer.setInput(new Object());
	}

	private void selectionChanged(SelectionChangedEvent e) {
		IStructuredSelection selection = (IStructuredSelection) e.getSelection();

		toDownload.clear();

		@SuppressWarnings("unchecked")
		Iterator<Object> iter = selection.iterator();
		while (iter.hasNext()) {
			Object element = iter.next();
			if (element instanceof MobaIndexEntry) {
				toDownload.add((MobaIndexEntry) element);
			}
		}

		getButton(Dialog.OK).setEnabled(!toDownload.isEmpty());
	}

	@Override
	public boolean close() {

		indexImage.dispose();
		indexEntryImage.dispose();
		templateHelper.dispose();

		return super.close();
	}

	@Override
	protected void okPressed() {
		if (!toDownload.isEmpty()) {
			templateHelper.download(project, toDownload);
		}

		super.okPressed();
	}

	protected class ContentProvider implements ITreeContentProvider {

		@Override
		public void dispose() {

		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return templateHelper.getIndexes().toArray();
		}

		@Override
		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof MobaIndex) {
				return ((MobaIndex) parentElement).getEntries().toArray();
			}
			return null;
		}

		@Override
		public Object getParent(Object element) {
			if (element instanceof MobaIndex) {
				return ((MobaIndex) element).eContainer();
			} else if (element instanceof MobaIndexEntry) {
				return ((MobaIndexEntry) element).eContainer();
			}
			return null;
		}

		@Override
		public boolean hasChildren(Object element) {
			if (element instanceof MobaIndex) {
				return true;
			} else if (element instanceof MobaIndexEntry) {
				return false;
			}
			return false;
		}
	}

}
