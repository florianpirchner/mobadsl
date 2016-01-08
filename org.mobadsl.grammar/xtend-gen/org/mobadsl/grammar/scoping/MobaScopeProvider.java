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
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.mobadsl.grammar.scoping.ApplicationTemplateScope;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityReference;
import org.mobadsl.semantic.model.moba.MobaExternalModule;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaPersistenceType;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaTransportSerializationType;
import org.mobadsl.semantic.model.moba.MobaTrigger;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class MobaScopeProvider extends AbstractDeclarativeScopeProvider {
  @Inject
  private DefaultGlobalScopeProvider globalScopeProvider;
  
  public IScope scope_MobaConstant(final MobaApplication ctx, final EReference ref) {
    List<MobaConstant> _allConstants = ctx.getAllConstants();
    return Scopes.scopeFor(_allConstants);
  }
  
  public IScope scope_MobaDataType(final MobaApplication ctx, final EReference ref) {
    List<MobaDataType> _allDataTypes = ctx.getAllDataTypes();
    return Scopes.scopeFor(_allDataTypes);
  }
  
  public IScope scope_MobaData(final MobaApplication ctx, final EReference ref) {
    List<MobaData> _allDatas = ctx.getAllDatas();
    return Scopes.scopeFor(_allDatas);
  }
  
  public IScope scope_MobaDto(final MobaApplication ctx, final EReference ref) {
    List<MobaDto> _allDtos = ctx.getAllDtos();
    return Scopes.scopeFor(_allDtos);
  }
  
  public IScope scope_MobaEntity(final MobaApplication ctx, final EReference ref) {
    List<MobaEntity> _allEntities = ctx.getAllEntities();
    return Scopes.scopeFor(_allEntities);
  }
  
  public IScope scope_MobaQueue(final MobaApplication ctx, final EReference ref) {
    List<MobaQueue> _allQueues = ctx.getAllQueues();
    return Scopes.scopeFor(_allQueues);
  }
  
  public IScope scope_MobaPersistenceType(final MobaApplication ctx, final EReference ref) {
    List<MobaPersistenceType> _allPersistenceTypes = ctx.getAllPersistenceTypes();
    return Scopes.scopeFor(_allPersistenceTypes);
  }
  
  public IScope scope_MobaSettings(final MobaApplication ctx, final EReference ref) {
    List<MobaSettings> _allSettings = ctx.getAllSettings();
    return Scopes.scopeFor(_allSettings);
  }
  
  public IScope scope_MobaREST(final MobaApplication ctx, final EReference ref) {
    List<MobaREST> _allREST = ctx.getAllREST();
    return Scopes.scopeFor(_allREST);
  }
  
  public IScope scope_MobaRESTCrud(final MobaApplication ctx, final EReference ref) {
    List<MobaRESTCrud> _allRESTCruds = ctx.getAllRESTCruds();
    return Scopes.scopeFor(_allRESTCruds);
  }
  
  public IScope scope_MobaRESTCustomService(final MobaApplication ctx, final EReference ref) {
    List<MobaRESTCustomService> _allRESTCustomServices = ctx.getAllRESTCustomServices();
    return Scopes.scopeFor(_allRESTCustomServices);
  }
  
  public IScope scope_MobaAuthorization(final MobaApplication ctx, final EReference ref) {
    List<MobaAuthorization> _allAuthorizations = ctx.getAllAuthorizations();
    return Scopes.scopeFor(_allAuthorizations);
  }
  
  public IScope scope_MobaTransportSerializationType(final MobaApplication ctx, final EReference ref) {
    List<MobaTransportSerializationType> _allTransportSerializationTypes = ctx.getAllTransportSerializationTypes();
    return Scopes.scopeFor(_allTransportSerializationTypes);
  }
  
  public IScope scope_MobaServer(final MobaApplication ctx, final EReference ref) {
    List<MobaServer> _allServers = ctx.getAllServers();
    return Scopes.scopeFor(_allServers);
  }
  
  public IScope scope_MobaTrigger(final MobaApplication ctx, final EReference ref) {
    List<MobaTrigger> _allTriggers = ctx.getAllTriggers();
    return Scopes.scopeFor(_allTriggers);
  }
  
  public IScope scope_MobaExternalModule(final MobaApplication ctx, final EReference ref) {
    List<MobaExternalModule> _allExternalModules = ctx.getAllExternalModules();
    return Scopes.scopeFor(_allExternalModules);
  }
  
  public IScope scope_MobaGenerator(final MobaApplication ctx, final EReference ref) {
    List<MobaGenerator> _allGenerators = ctx.getAllGenerators();
    return Scopes.scopeFor(_allGenerators);
  }
  
  public IScope scope_MobaCache(final MobaApplication ctx, final EReference ref) {
    List<MobaCache> _allCaches = ctx.getAllCaches();
    return Scopes.scopeFor(_allCaches);
  }
  
  public IScope scope_MobaApplication(final MobaApplication ctx, final EReference ref) {
    Resource _eResource = ctx.eResource();
    final IScope scope = this.globalScopeProvider.getScope(_eResource, ref);
    return new ApplicationTemplateScope(scope);
  }
  
  public IScope scope_MobaEntityReference_opposite(final MobaEntityReference ctx, final EReference ref) {
    MobaEntity _type = ctx.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      MobaEntity _type_1 = ctx.getType();
      List<MobaEntityReference> _genReferences = _type_1.getGenReferences();
      final Function1<MobaEntityReference, Boolean> _function = (MobaEntityReference it) -> {
        EObject _eContainer = ctx.eContainer();
        MobaEntity _type_2 = it.getType();
        return Boolean.valueOf(Objects.equal(_eContainer, _type_2));
      };
      Iterable<MobaEntityReference> _filter = IterableExtensions.<MobaEntityReference>filter(_genReferences, _function);
      return Scopes.scopeFor(_filter);
    }
    return IScope.NULLSCOPE;
  }
  
  public IScope scope_MobaDtoReference_opposite(final MobaDtoReference ctx, final EReference ref) {
    MobaDto _type = ctx.getType();
    boolean _notEquals = (!Objects.equal(_type, null));
    if (_notEquals) {
      MobaDto _type_1 = ctx.getType();
      List<MobaDtoReference> _genReferences = _type_1.getGenReferences();
      final Function1<MobaDtoReference, Boolean> _function = (MobaDtoReference it) -> {
        EObject _eContainer = ctx.eContainer();
        MobaDto _type_2 = it.getType();
        return Boolean.valueOf(Objects.equal(_eContainer, _type_2));
      };
      Iterable<MobaDtoReference> _filter = IterableExtensions.<MobaDtoReference>filter(_genReferences, _function);
      return Scopes.scopeFor(_filter);
    }
    return IScope.NULLSCOPE;
  }
}
