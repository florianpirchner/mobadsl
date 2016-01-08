/**
 * Copyright (c) 2015 - 2016, Lunifera GmbH (Wien), Ekkehard Gentz (Rosenheim)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *         Florian Pirchner - Initial implementation
 */
package org.mobadsl.grammar.ui;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.mobadsl.grammar.ui.AbstractMobaUiModule;
import org.mobadsl.grammar.ui.hover.MobaHoverDocumentationProvider;

/**
 * Use this class to register components to be used within the Eclipse IDE.
 */
@FinalFieldsConstructor
@SuppressWarnings("all")
public class MobaUiModule extends AbstractMobaUiModule {
  public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
    return MobaHoverDocumentationProvider.class;
  }
  
  public MobaUiModule(final AbstractUIPlugin plugin) {
    super(plugin);
  }
}
