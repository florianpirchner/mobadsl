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
package org.mobadsl.grammar.scoping

import java.util.Collections
import java.util.Iterator
import java.util.Map
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.naming.QualifiedName
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription
import org.eclipse.xtext.scoping.IScope
import org.mobadsl.grammar.resource.MobaResourceDescriptionStrategy

class ApplicationTemplateScope implements IScope {

	IScope delegate;
	Map<QualifiedName, Sortable> resolved

	new(IScope delegate) {
		this.delegate = delegate
	}

	override Iterable<IEObjectDescription> getAllElements() {
		resolve();
		return resolved.values.map[it.object]
	}

	override Iterable<IEObjectDescription> getElements(EObject object) {
		resolve();
		return delegate.getElements(object)
	}

	override Iterable<IEObjectDescription> getElements(QualifiedName name) {
		resolve();
		return resolved.values.filter[it.name.equals(name)].map[it.object]
	}

	override IEObjectDescription getSingleElement(EObject object) {
		resolve();
		val Iterable<IEObjectDescription> elements = getElements(object)
		return getFirst(elements);
	}

	override IEObjectDescription getSingleElement(QualifiedName name) {
		resolve();
		val Iterable<IEObjectDescription> elements = getElements(name)
		return getFirst(elements);
	}

	def IEObjectDescription getFirst(Iterable<IEObjectDescription> elements) {
		val Iterator<IEObjectDescription> iterator = elements.iterator()
		if (iterator.hasNext())
			return iterator.next();
		return null;
	}

	def resolve() {
		if (resolved == null) {
			resolved = newHashMap()
			val temp = newArrayList()

			for (desc : delegate.allElements) {
				temp += new Sortable(desc)
			}
			Collections.sort(temp)

			for (desc : temp) {
				resolved.put(desc.name, desc)
			}
		}
	}

	/**
	 * Helper to sort versions properly
	 */
	static class Sortable implements Comparable<Sortable> {

		IEObjectDescription object
		QualifiedName name
		String version
		boolean snapshot

		new(IEObjectDescription desc) {
			this.object = desc
			this.name = desc.name
			val tempVersion = desc.getUserData(MobaResourceDescriptionStrategy.VERSION)
			this.version = tempVersion.replace("-SNAPSHOT", "")
			this.snapshot = tempVersion.endsWith("-SNAPSHOT")
		}

		override compareTo(ApplicationTemplateScope.Sortable o) {
			val nameComp = name.compareTo(o.name)

			if (nameComp != 0) {
				return nameComp
			}

			// versions are not equal
			val versionComp = version.compareTo(o.version)
			if (versionComp != 0) {
				return versionComp
			}

			// same version and (snapshot or not snapshot)
			if (snapshot == o.snapshot) {
				return 0
			}

			if (snapshot) {
				return -1
			}

			if (o.snapshot) {
				return 1
			} else {
				return -1
			}
		}
	}
}
