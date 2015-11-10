package org.mobadsl.grammar.generator.common;

import java.util.HashMap;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.OutputConfiguration;

public interface IGeneratorDelegate {

	void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context, PropertiesMap properties);

	void afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context, PropertiesMap properties);

	public void generate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context, PropertiesMap properties);

	public Set<OutputConfiguration> getOutputConfigurations();

	/**
	 * Can be used to transfer key-value-pairs between different generators.
	 */
	@SuppressWarnings("serial")
	public static class PropertiesMap extends HashMap<Object, Object> {

	}

}
