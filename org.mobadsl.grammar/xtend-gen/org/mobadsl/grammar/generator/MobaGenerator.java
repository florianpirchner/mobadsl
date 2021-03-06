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
package org.mobadsl.grammar.generator;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate;
import org.mobadsl.grammar.generator.MobaConstantsGenerator;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaModel;
import org.mobadsl.semantic.model.moba.MobaModelFeature;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MobaGenerator extends AbstractGenerator {
  @Inject
  private ExtensionGeneratorDelegate generatorDelegate;
  
  @Inject
  private MobaConstantsGenerator constantsGenerator;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    this.constantsGenerator.doGenerate(input, fsa, context);
    final List<String> generatorIds = this.collectGeneratorIds(input);
    boolean _equals = Objects.equal(generatorIds, null);
    if (_equals) {
      return;
    }
    this.generatorDelegate.generate(input, fsa, context, generatorIds);
  }
  
  @Override
  public void beforeGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final List<String> generatorIds = this.collectGeneratorIds(input);
    boolean _equals = Objects.equal(generatorIds, null);
    if (_equals) {
      return;
    }
    this.generatorDelegate.beforeGenerate(input, fsa, context, generatorIds);
  }
  
  @Override
  public void afterGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final List<String> generatorIds = this.collectGeneratorIds(input);
    boolean _equals = Objects.equal(generatorIds, null);
    if (_equals) {
      return;
    }
    this.generatorDelegate.afterGenerate(input, fsa, context, generatorIds);
  }
  
  public List<String> collectGeneratorIds(final Resource resource) {
    EList<EObject> _contents = resource.getContents();
    EObject _get = _contents.get(0);
    final MobaModel model = ((MobaModel) _get);
    boolean _equals = Objects.equal(model, null);
    if (_equals) {
      return Collections.<String>emptyList();
    }
    final List<String> generatorIds = CollectionLiterals.<String>newArrayList();
    EList<MobaModelFeature> _features = model.getFeatures();
    final Function1<MobaModelFeature, Boolean> _function = (MobaModelFeature it) -> {
      return Boolean.valueOf((it instanceof MobaApplication));
    };
    Iterable<MobaModelFeature> _filter = IterableExtensions.<MobaModelFeature>filter(_features, _function);
    final Consumer<MobaModelFeature> _function_1 = (MobaModelFeature it) -> {
      final MobaApplication app = ((MobaApplication) it);
      List<String> _xifexpression = null;
      org.mobadsl.semantic.model.moba.MobaGenerator _activeGenerator = app.getActiveGenerator();
      boolean _notEquals = (!Objects.equal(_activeGenerator, null));
      if (_notEquals) {
        org.mobadsl.semantic.model.moba.MobaGenerator _activeGenerator_1 = app.getActiveGenerator();
        _xifexpression = _activeGenerator_1.getAllGeneratorVersionedIds();
      } else {
        _xifexpression = Collections.<String>emptyList();
      }
      Iterables.<String>addAll(generatorIds, _xifexpression);
    };
    _filter.forEach(_function_1);
    return generatorIds;
  }
}
