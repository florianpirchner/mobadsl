package org.mobadsl.grammar.generator;

import java.util.Set;

import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.OutputConfigurationProvider;

import com.google.inject.Inject;

public class DelegatingOutputConfigurationProvider extends OutputConfigurationProvider {
	
	private @Inject ExtensionGeneratorDelegate generatorDelegate;

	/**
	 * @return a set of {@link OutputConfiguration} available for the generator
	 */
	public Set<OutputConfiguration> getOutputConfigurations() {
		Set<OutputConfiguration> configs = super.getOutputConfigurations();

		configs.addAll(generatorDelegate.getOutputConfigurations());

		return configs;
	}

}
