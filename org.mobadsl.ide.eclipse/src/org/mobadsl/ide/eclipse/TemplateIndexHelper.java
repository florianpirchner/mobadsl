package org.mobadsl.ide.eclipse;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.Path;
import org.mobadsl.api.template.repository.ITemplateRepositoryManager;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemplateIndexHelper {

	private static final Logger LOGGER = LoggerFactory.getLogger(TemplateIndexHelper.class);
	private ITemplateRepositoryManager templateManager;
	private ServiceReference<ITemplateRepositoryManager> managerRef;

	public void download(IProject project, List<MobaIndexEntry> toDownlaod) {
		for (MobaIndexEntry entry : toDownlaod) {
			String value = getRepoManager().getApplicationModelAsString(entry);
			if (value != null) {
				try {
					IFolder folder = project.getFolder(new Path("/templates"));
					if (!folder.exists()) {
						folder.create(IResource.NONE, true, null);
					}

					IFile file = folder.getFile(getFileName(entry));
					if (!file.exists()) {
						InputStream source = new ByteArrayInputStream(value.getBytes());
						file.create(source, IResource.NONE, null);
					} else {
						file.delete(true, null);
						InputStream source = new ByteArrayInputStream(value.getBytes());
						file.create(source, IResource.NONE, null);
					}
				} catch (CoreException e) {
					LOGGER.error("{}", e);
				}
			}
		}
	}

	public void downloadByCoordinate(IProject project, List<TemplateCoordinate> toDownlaod) {
		for (TemplateCoordinate coordinate : toDownlaod) {
			MobaIndexEntry entry = getRepoManager().find(coordinate.indexID, coordinate.templateID, coordinate.version);
			if (entry != null) {
				String value = getRepoManager().getApplicationModelAsString(entry);
				if (value != null) {
					try {
						IFolder folder = project.getFolder(new Path("/templates"));
						if (!folder.exists()) {
							folder.create(IResource.NONE, true, null);
						}

						IFile file = folder.getFile(getFileName(entry));
						if (!file.exists()) {
							InputStream source = new ByteArrayInputStream(value.getBytes());
							file.create(source, IResource.NONE, null);
						} else {
							file.delete(true, null);
							InputStream source = new ByteArrayInputStream(value.getBytes());
							file.create(source, IResource.NONE, null);
						}
					} catch (CoreException e) {
						LOGGER.error("{}", e);
					}
				}
			}
		}
	}

	public ITemplateRepositoryManager getRepoManager() {
		if (templateManager != null) {
			return templateManager;
		}
		BundleContext bc = FrameworkUtil.getBundle(getClass()).getBundleContext();
		managerRef = bc.getServiceReference(ITemplateRepositoryManager.class);
		if (managerRef != null) {
			templateManager = bc.getService(managerRef);
		}
		return templateManager;
	}

	public String getFileName(MobaIndexEntry entry) {
		return entry.getTemplateName() + "_" + entry.getTemplateVersion() + ".moba";
	}

	public List<MobaIndex> getIndexes() {
		if (getRepoManager() == null) {
			return Collections.emptyList();
		}
		return getRepoManager().getIndexes();
	}

	public String getApplicationModelAsString(MobaIndexEntry entry) {
		if (getRepoManager() == null) {
			return null;
		}
		return getRepoManager().getApplicationModelAsString(entry);
	}

	public List<MobaIndexEntry> getAvailableEntries() {
		if (getRepoManager() == null) {
			return Collections.emptyList();
		}
		return getRepoManager().getAvailableEntries();
	}

	public void dispose() {
		if (managerRef != null) {
			BundleContext bc = FrameworkUtil.getBundle(getClass()).getBundleContext();
			bc.ungetService(managerRef);
			managerRef = null;
		}
	}

	public static class TemplateCoordinate {
		final String indexID;
		final String templateID;
		final String version;

		public TemplateCoordinate(String indexID, String templateID, String version) {
			super();
			this.indexID = indexID;
			this.templateID = templateID;
			this.version = version;
		}

		public static TemplateCoordinate parse(String value) {
			final String[] tokens = value.split(":");
			if (tokens.length != 4) {
				return null;
			}
			return new TemplateCoordinate(tokens[1], tokens[2], tokens[3]);
		}

		public String getIndexID() {
			return indexID;
		}

		public String getTemplateID() {
			return templateID;
		}

		public String getVersion() {
			return version;
		}

	}

}
