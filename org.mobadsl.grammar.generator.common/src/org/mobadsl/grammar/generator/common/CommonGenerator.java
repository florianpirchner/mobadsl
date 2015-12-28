package org.mobadsl.grammar.generator.common;

import java.util.Collections;
import java.util.Set;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.mobadsl.semantic.model.moba.MobaModel;

public class CommonGenerator implements IGeneratorDelegate {

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
		
		fsa.generateFile("Foo", "mobile", "Heyho");
	}

	@Override
	public Set<OutputConfiguration> getOutputConfigurations() {

		OutputConfiguration config = new OutputConfiguration("mobile");
		config.setDescription("Generates Mobile stuff.");
		config.setOutputDirectory("./mobile");

		return Collections.singleton(config);
	}

}
