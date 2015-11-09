package org.mobadsl.grammar.generator.server.rest;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.mobadsl.grammar.generator.common.IGeneratorDelegate;

public class RestServicesGenerator implements IGeneratorDelegate {

	@Override
	public void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {

	}

	@Override
	public void afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {

	}

	@Override
	public void generate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context) {
		System.out.println("Foo");
	}

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {

		OutputConfiguration config = new OutputConfiguration("server-rest");
		config.setCanClearOutputDirectory(true);
		config.setCreateOutputDirectory(true);
		config.setDescription("Generates REST services for the server side.");
		config.setInstallDslAsPrimarySource(false);
		config.setOutputDirectory("./models");

		return Collections.singleton(config);
	}

}
