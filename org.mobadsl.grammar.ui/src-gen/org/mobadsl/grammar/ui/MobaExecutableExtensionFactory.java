/*
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.mobadsl.grammar.ui.internal.MobaActivator;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class MobaExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return MobaActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return MobaActivator.getInstance().getInjector(MobaActivator.ORG_MOBADSL_GRAMMAR_MOBA);
	}
	
}
