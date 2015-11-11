package org.mobadsl.ide.eclipse.ui;

import java.net.URI;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.mobadsl.api.template.repository.ITemplateRepositoryManager;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

public class TemplatesFromRepoComposite extends Composite {

	private TreeViewer treeViewer;
	private ServiceReference<ITemplateRepositoryManager> managerRef;
	private ITemplateRepositoryManager templateManager;

	public TemplatesFromRepoComposite(Composite parent, int style) {
		super(parent, style);

		createPartControl(this);
	}

	public void createPartControl(Composite parent) {

		getRepoManager();

		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new ContentProvider());
		treeViewer.setLabelProvider(new LabelProvider() {
			@Override
			public Image getImage(Object element) {
				// if (element instanceof IResourceDescription) {
				// return indexImage;
				// } else if (element instanceof ExportedObjects) {
				// return exportedContainerImage;
				// } else if (element instanceof ImportedNames) {
				// return importedNameContainerImage;
				// } else if (element instanceof ReferenceDescriptions) {
				// return referenceContainerImage;
				// } else if (element instanceof IReferenceDescription) {
				// return referenceImage;
				// }
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
					return entry.getName() + ":" + entry.getVersion() + " - " + entry.getDescription();
				} else if (element instanceof URI) {
					return element.toString();
				}
				return "";
			}
		});

	}

	private void getRepoManager() {
		BundleContext bc = FrameworkUtil.getBundle(getClass()).getBundleContext();
		managerRef = bc.getServiceReference(ITemplateRepositoryManager.class);
		if (managerRef != null) {
			templateManager = bc.getService(managerRef);
		}
	}

	@Override
	public void dispose() {

		BundleContext bc = FrameworkUtil.getBundle(getClass()).getBundleContext();
		bc.ungetService(managerRef);
		managerRef = null;
		templateManager = null;

		super.dispose();
	}

	private class ContentProvider implements ITreeContentProvider {

		@Override
		public void dispose() {

		}

		@Override
		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		@Override
		public Object[] getElements(Object inputElement) {
			return templateManager.getIndexes().values().toArray();
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
