package org.mobadsl.grammar.generator;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.LanguageInfo;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.mobadsl.grammar.generator.common.IGeneratorDelegate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.inject.Inject;
import com.google.inject.Injector;

/**
 * Delegates generation to registered extensions. See extensionpoint
 * "org.lunifera.dsl.xtext.lazyresolver.generatorDelegate"
 */
public class ExtensionGeneratorDelegate {

	private static final Logger LOGGER = LoggerFactory.getLogger(ExtensionGeneratorDelegate.class);

	private static final String ATTR_ID = "generatorId"; //$NON-NLS-1$
	private static final String ATTR_GRAMMAR = "grammarName"; //$NON-NLS-1$
	private static final String ATTR_GENERATORHOOK = "generatorDelegateClass"; //$NON-NLS-1$
	private static final String INFERRER_HOOK_EXTPT = "generatorDelegate"; //$NON-NLS-1$

	@Inject
	private LanguageInfo languageInfo;
	@Inject
	private Injector injector;

	public void generate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context, List<String> generatorIds) {
		Map<String, IGeneratorDelegate> generators = readExtentions(languageInfo.getLanguageName(), generatorIds);

		IGeneratorDelegate.PropertiesMap properties = new IGeneratorDelegate.PropertiesMap();
		for (String id : generatorIds) {
			if (generators.containsKey(id)) {
				generators.get(id).generate(input, fsa, context, properties);
			}
		}
	}

	public void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context,
			List<String> generatorIds) {
		Map<String, IGeneratorDelegate> generators = readExtentions(languageInfo.getLanguageName(), generatorIds);

		IGeneratorDelegate.PropertiesMap properties = new IGeneratorDelegate.PropertiesMap();
		for (String id : generatorIds) {
			if (generators.containsKey(id)) {
				generators.get(id).beforeGenerate(input, fsa, context, properties);
			}
		}
	}

	public void afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context,
			List<String> generatorIds) {
		Map<String, IGeneratorDelegate> generators = readExtentions(languageInfo.getLanguageName(), generatorIds);

		IGeneratorDelegate.PropertiesMap properties = new IGeneratorDelegate.PropertiesMap();

		for (String id : generatorIds) {
			if (generators.containsKey(id)) {
				generators.get(id).afterGenerate(input, fsa, context, properties);
			}
		}
	}

	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> result = new HashSet<OutputConfiguration>();
		for (Map.Entry<String, IGeneratorDelegate> entry : readExtentions(languageInfo.getLanguageName(), null)
				.entrySet()) {
			result.addAll(entry.getValue().getOutputConfigurations());
		}
		return result;
	}

	/**
	 * Extensions are being processed new for each request, since each call
	 * needs a new instance of processor.
	 * 
	 * @param grammarName
	 * @param generatorIds
	 * @return
	 */
	private Map<String, IGeneratorDelegate> readExtentions(String grammarName, List<String> generatorIds) {
		IExtensionRegistry registry = Platform.getExtensionRegistry();
		IExtensionPoint point = registry.getExtensionPoint("org.mobadsl.grammar", INFERRER_HOOK_EXTPT);
		if (point == null) {
			return Collections.emptyMap();
		}

		Map<String, IGeneratorDelegate> delegates = new HashMap<>();
		IExtension[] extensions = point.getExtensions();
		for (int i = 0; i < extensions.length; i++) {
			IConfigurationElement[] elements = extensions[i].getConfigurationElements();
			for (int j = 0; j < elements.length; j++) {
				String id = elements[j].getAttribute(ATTR_ID);
				if (generatorIds != null && !generatorIds.isEmpty()) {
					if (!generatorIds.contains(id)) {
						continue;
					}
				}
				String _grammarName = elements[j].getAttribute(ATTR_GRAMMAR);
				if (_grammarName != null && _grammarName.equals(grammarName)) {
					try {
						IGeneratorDelegate delegate = (IGeneratorDelegate) elements[j]
								.createExecutableExtension(ATTR_GENERATORHOOK);
						injector.injectMembers(delegate);
						delegates.put(id, delegate);
					} catch (CoreException e) {
						LOGGER.error("{}", e);
					}
				}
			}
		}
		return delegates;
	}
}