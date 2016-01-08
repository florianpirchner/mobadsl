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
package org.mobadsl.grammar.scoping;

import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.mobadsl.grammar.resource.MobaResourceDescriptionStrategy;

@SuppressWarnings("all")
public class ApplicationTemplateScope implements IScope {
  /**
   * Helper to sort versions properly
   */
  public static class Sortable implements Comparable<ApplicationTemplateScope.Sortable> {
    private IEObjectDescription object;
    
    private QualifiedName name;
    
    private String version;
    
    private boolean snapshot;
    
    public Sortable(final IEObjectDescription desc) {
      this.object = desc;
      QualifiedName _name = desc.getName();
      this.name = _name;
      final String tempVersion = desc.getUserData(MobaResourceDescriptionStrategy.VERSION);
      String _replace = tempVersion.replace("-SNAPSHOT", "");
      this.version = _replace;
      boolean _endsWith = tempVersion.endsWith("-SNAPSHOT");
      this.snapshot = _endsWith;
    }
    
    @Override
    public int compareTo(final ApplicationTemplateScope.Sortable o) {
      final int nameComp = this.name.compareTo(o.name);
      if ((nameComp != 0)) {
        return nameComp;
      }
      final int versionComp = this.version.compareTo(o.version);
      if ((versionComp != 0)) {
        return versionComp;
      }
      if ((this.snapshot == o.snapshot)) {
        return 0;
      }
      if (this.snapshot) {
        return (-1);
      }
      if (o.snapshot) {
        return 1;
      } else {
        return (-1);
      }
    }
  }
  
  private IScope delegate;
  
  private Map<QualifiedName, ApplicationTemplateScope.Sortable> resolved;
  
  public ApplicationTemplateScope(final IScope delegate) {
    this.delegate = delegate;
  }
  
  @Override
  public Iterable<IEObjectDescription> getAllElements() {
    this.resolve();
    Collection<ApplicationTemplateScope.Sortable> _values = this.resolved.values();
    final Function1<ApplicationTemplateScope.Sortable, IEObjectDescription> _function = (ApplicationTemplateScope.Sortable it) -> {
      return it.object;
    };
    return IterableExtensions.<ApplicationTemplateScope.Sortable, IEObjectDescription>map(_values, _function);
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final EObject object) {
    this.resolve();
    return this.delegate.getElements(object);
  }
  
  @Override
  public Iterable<IEObjectDescription> getElements(final QualifiedName name) {
    this.resolve();
    Collection<ApplicationTemplateScope.Sortable> _values = this.resolved.values();
    final Function1<ApplicationTemplateScope.Sortable, Boolean> _function = (ApplicationTemplateScope.Sortable it) -> {
      return Boolean.valueOf(it.name.equals(name));
    };
    Iterable<ApplicationTemplateScope.Sortable> _filter = IterableExtensions.<ApplicationTemplateScope.Sortable>filter(_values, _function);
    final Function1<ApplicationTemplateScope.Sortable, IEObjectDescription> _function_1 = (ApplicationTemplateScope.Sortable it) -> {
      return it.object;
    };
    return IterableExtensions.<ApplicationTemplateScope.Sortable, IEObjectDescription>map(_filter, _function_1);
  }
  
  @Override
  public IEObjectDescription getSingleElement(final EObject object) {
    this.resolve();
    final Iterable<IEObjectDescription> elements = this.getElements(object);
    return this.getFirst(elements);
  }
  
  @Override
  public IEObjectDescription getSingleElement(final QualifiedName name) {
    this.resolve();
    final Iterable<IEObjectDescription> elements = this.getElements(name);
    return this.getFirst(elements);
  }
  
  public IEObjectDescription getFirst(final Iterable<IEObjectDescription> elements) {
    final Iterator<IEObjectDescription> iterator = elements.iterator();
    boolean _hasNext = iterator.hasNext();
    if (_hasNext) {
      return iterator.next();
    }
    return null;
  }
  
  public void resolve() {
    boolean _equals = Objects.equal(this.resolved, null);
    if (_equals) {
      HashMap<QualifiedName, ApplicationTemplateScope.Sortable> _newHashMap = CollectionLiterals.<QualifiedName, ApplicationTemplateScope.Sortable>newHashMap();
      this.resolved = _newHashMap;
      final ArrayList<ApplicationTemplateScope.Sortable> temp = CollectionLiterals.<ApplicationTemplateScope.Sortable>newArrayList();
      Iterable<IEObjectDescription> _allElements = this.delegate.getAllElements();
      for (final IEObjectDescription desc : _allElements) {
        ApplicationTemplateScope.Sortable _sortable = new ApplicationTemplateScope.Sortable(desc);
        temp.add(_sortable);
      }
      Collections.<ApplicationTemplateScope.Sortable>sort(temp);
      for (final ApplicationTemplateScope.Sortable desc_1 : temp) {
        this.resolved.put(desc_1.name, desc_1);
      }
    }
  }
}
