package org.mobadsl.grammar.generator.server.rest;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.mobadsl.grammar.generator.common.IGeneratorDelegate;
import org.mobadsl.semantic.model.moba.MobaModel;

public class RestServicesGenerator implements IGeneratorDelegate {

	@SuppressWarnings("unused")
	@Override
	public void beforeGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context,
			PropertiesMap properties) {
		MobaModel model = (MobaModel) input.getContents().get(0);
	}

	@SuppressWarnings("unused")
	@Override
	public void afterGenerate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context,
			PropertiesMap properties) {
		MobaModel model = (MobaModel) input.getContents().get(0);
	}

	@SuppressWarnings("unused")
	@Override
	public void generate(Resource input, IFileSystemAccess2 fsa, IGeneratorContext context, PropertiesMap properties) {
		MobaModel model = (MobaModel) input.getContents().get(0);
		fsa.generateFile("Foo", "server-rest", "Heyho");
	}

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {

		OutputConfiguration config = new OutputConfiguration("server-rest");
		config.setDescription("Generates REST services for the server side.");
		config.setOutputDirectory("./rest");

		return Collections.singleton(config);
	}

}
