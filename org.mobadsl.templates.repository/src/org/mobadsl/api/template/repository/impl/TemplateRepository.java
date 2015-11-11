package org.mobadsl.api.template.repository.impl;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.mobadsl.api.template.repository.ITemplateRepository;
import org.mobadsl.semantic.model.moba.index.MobaIndex;
import org.mobadsl.semantic.model.moba.index.MobaIndexEntry;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(immediate = true, property = { ITemplateRepository.ID + "=" + TemplateRepository.REPO_ID,
		ITemplateRepository.VERSION + "=" + TemplateRepository.REPO_VERSION })
public class TemplateRepository implements ITemplateRepository {

	private static final Logger LOGGER = LoggerFactory.getLogger(TemplateRepository.class);

	static final String REPO_ID = "org.mobadsl.templates";
	static final String REPO_VERSION = "0.8.0";

	private static final String INDEX_URL = "https://raw.githubusercontent.com/florianpirchner/mobadsl-templates/master/Moba.mobaindex";
	private static final String BASE_TEMPLATE_URL = "https://raw.githubusercontent.com/florianpirchner/mobadsl-templates/master";

	private Object loadingLock = new Object();

	private MobaIndex index;

	@SuppressWarnings("unused")
	private Map<String, Object> properties;

	@Activate
	void activate(Map<String, Object> properties) {
		this.properties = properties;
	}

	@Override
	public synchronized MobaIndex getIndex() {
		if (index != null) {
			return index;
		} else {
			synchronized (loadingLock) {
				// double check index != null for concurrent threads
				if (index != null) {
					return index;
				}
				try {
					Resource resource = readResource(INDEX_URL);
					index = (MobaIndex) resource.getContents().get(0);
					return EcoreUtil.copy(index);
				} catch (Exception e) {
					LOGGER.error("Error reading repository at {} : Cause {}", INDEX_URL, e);
					return index;
				}
			}
		}
	}

	/**
	 * Reads the resource from the given URL.
	 * 
	 * @param urlString
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	private Resource readResource(String urlString) throws MalformedURLException, IOException {
		URL url = new java.net.URL(urlString);
		URLConnection connection = url.openConnection();

		Resource resource = null;

		InputStream stream = connection.getInputStream();
		try {

			resource = new XMIResourceImpl();
			resource.load(stream, null);

		} finally {
			if (stream != null) {
				// close the stream
				stream.close();
			}
		}
		return resource;
	}

	/**
	 * Reads the string value from the given URL.
	 * 
	 * @param urlString
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	private String readString(String urlString) throws MalformedURLException, IOException {
		URL url = new java.net.URL(urlString);
		URLConnection connection = url.openConnection();

		InputStream stream = connection.getInputStream();
		try {
			return IOUtils.toString(stream, "UTF-8");
		} finally {
			if (stream != null) {
				// close the stream
				stream.close();
			}
		}
	}

	@Override
	public String getApplicationModelAsString(MobaIndexEntry entry) {
		String templateURL = getTemplateURL(entry);
		try {
			return readString(templateURL);
		} catch (Exception e) {
			LOGGER.error("Error reading application {} at {} : Cause {}", entry.getName(), templateURL, e);
			return null;
		}
	}

	private String getTemplateURL(MobaIndexEntry entry) {
		String path = entry.getRelativePath();
		if (!path.startsWith("/")) {
			path = "/" + path;
		}
		return BASE_TEMPLATE_URL + path;
	}
}
