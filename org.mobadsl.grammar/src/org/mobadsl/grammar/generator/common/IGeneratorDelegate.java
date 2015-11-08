package org.mobadsl.grammar.generator.common;

import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.OutputConfiguration;

public interface IGeneratorDelegate {

	void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context);

	void afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context);
	
	public void generate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context);

	public Set<OutputConfiguration> getOutputConfigurations();

}
