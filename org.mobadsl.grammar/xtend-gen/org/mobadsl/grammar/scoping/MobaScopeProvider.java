/**
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.scoping;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.SimpleResourceDescriptionsBasedContainerManager;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.scoping.impl.SimpleScope;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaService;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class MobaScopeProvider extends AbstractDeclarativeScopeProvider {
  @Inject
  private SimpleResourceDescriptionsBasedContainerManager containerManager;
  
  @Inject
  private IResourceDescriptions resourceDescriptions;
  
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
    List<MobaEntity> _allDtos = ctx.getAllDtos();
    return Scopes.scopeFor(_allDtos);
  }
  
  public IScope scope_MobaPayload(final MobaApplication ctx, final EReference ref) {
    List<MobaDto> _allPayloads = ctx.getAllPayloads();
    return Scopes.scopeFor(_allPayloads);
  }
  
  public IScope scope_MobaQueue(final MobaApplication ctx, final EReference ref) {
    List<MobaQueue> _allQueues = ctx.getAllQueues();
    return Scopes.scopeFor(_allQueues);
  }
  
  public IScope scope_MobaSettings(final MobaApplication ctx, final EReference ref) {
    List<MobaSettings> _allSettings = ctx.getAllSettings();
    return Scopes.scopeFor(_allSettings);
  }
  
  public IScope scope_MobaService(final MobaApplication ctx, final EReference ref) {
    List<MobaService> _allServices = ctx.getAllServices();
    return Scopes.scopeFor(_allServices);
  }
  
  public IScope scope_MobaRestCrud(final MobaApplication ctx, final EReference ref) {
    List<MobaRESTCrud> _allRestCruds = ctx.getAllRestCruds();
    return Scopes.scopeFor(_allRestCruds);
  }
  
  public IScope scope_MobaRestCustom(final MobaApplication ctx, final EReference ref) {
    List<MobaRESTCustomService> _allRestCustoms = ctx.getAllRestCustoms();
    return Scopes.scopeFor(_allRestCustoms);
  }
  
  public IScope scope_MobaGenerator(final MobaApplication ctx, final EReference ref) {
    List<MobaGenerator> _allGenerators = ctx.getAllGenerators();
    final Function<MobaGenerator, QualifiedName> _function = (MobaGenerator it) -> {
      String _versionedId = it.getVersionedId();
      String _versionedIdModelValue = MobaUtil.toVersionedIdModelValue(_versionedId);
      String[] _split = _versionedIdModelValue.split("\\.");
      return QualifiedName.create(_split);
    };
    return Scopes.<MobaGenerator>scopeFor(_allGenerators, _function, IScope.NULLSCOPE);
  }
  
  public IScope scope_MobaApplication(final MobaApplication ctx, final EReference ref) {
    Resource _eResource = ctx.eResource();
    URI _uRI = _eResource.getURI();
    final IResourceDescription ctxDesciption = this.resourceDescriptions.getResourceDescription(_uRI);
    final List<IContainer> containers = this.containerManager.getVisibleContainers(ctxDesciption, this.resourceDescriptions);
    final List<IEObjectDescription> result = CollectionLiterals.<IEObjectDescription>newArrayList();
    for (final IContainer container : containers) {
      {
        final Iterable<IEObjectDescription> applications = container.getExportedObjectsByType(MobaPackage.Literals.MOBA_APPLICATION);
        Iterables.<IEObjectDescription>addAll(result, applications);
      }
    }
    return new SimpleScope(result);
  }
}
