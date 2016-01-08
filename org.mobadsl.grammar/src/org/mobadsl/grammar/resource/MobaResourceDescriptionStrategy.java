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
package org.mobadsl.grammar.resource;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaGenerator;

import com.google.inject.Inject;

public class MobaResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {

	/**
	 * Used as userData in EObjectDescription for MobaApplication.
	 */
	public static String VERSION = "version";

	@Inject
	private IQualifiedNameProvider nameProvider;

	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (eObject instanceof MobaApplication) {
			MobaApplication application = (MobaApplication) eObject;
			QualifiedName qualifiedName = nameProvider.getFullyQualifiedName(application);
			Map<String, String> userData = new HashMap<String, String>();
			userData.put(VERSION, application.getVersion());
			acceptor.accept(EObjectDescription.create(qualifiedName, eObject, userData));
			return true;
		} else if (eObject instanceof MobaGenerator) {
			MobaGenerator generator = (MobaGenerator) eObject;
			QualifiedName qualifiedName = nameProvider.getFullyQualifiedName(generator);
			Map<String, String> userData = new HashMap<String, String>();
			MobaApplication application = (MobaApplication) generator.eContainer();
			userData.put(VERSION, application.getVersion());
			acceptor.accept(EObjectDescription.create(qualifiedName, eObject, userData));
			return true;
		} else {
			return super.createEObjectDescriptions(eObject, acceptor);
		}
	}
}
