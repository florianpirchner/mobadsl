/**
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar;

import org.mobadsl.grammar.MobaStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MobaStandaloneSetup extends MobaStandaloneSetupGenerated {
  public static void doSetup() {
    MobaStandaloneSetup _mobaStandaloneSetup = new MobaStandaloneSetup();
    _mobaStandaloneSetup.createInjectorAndDoEMFRegistration();
  }
}
