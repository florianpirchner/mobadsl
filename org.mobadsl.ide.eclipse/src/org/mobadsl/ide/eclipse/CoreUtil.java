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
package org.mobadsl.ide.eclipse;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoreUtil {

	private static final Logger LOGGER = LoggerFactory.getLogger(CoreUtil.class);

	public static String NATURE_ID = "org.mobadsl.ide.eclipse.ui.MobaNature";
	// public static final String BUILDER_ID =
	// "org.mobadsl.ide.eclipse.ui.MobaBuilder";

	/**
	 * Returns true, if the given project contains the Moba Nature.
	 * 
	 * @param project
	 * @return
	 */
	public static boolean hasNature(IProject project) {
		try {
			if (project.isAccessible()) {
				return project.hasNature(NATURE_ID);
			}
		} catch (CoreException e) {
			LOGGER.error(e.getMessage(), e);
		}
		return false;
	}

	/**
	 * Returns true, if the given project contains the Moba Builder.
	 * 
	 * @param project
	 * @return
	 */
	public static boolean hasBuilder(IProject project) {
		// if (project.isAccessible()) {
		// try {
		// for (ICommand command : project.getDescription().getBuildSpec()) {
		// if (BUILDER_ID.equals(command.getBuilderName())) {
		// return true;
		// }
		// }
		// } catch (CoreException e) {
		// LOGGER.error("Can't build due to an exception.", e);
		// }
		// }
		return false;
	}

}