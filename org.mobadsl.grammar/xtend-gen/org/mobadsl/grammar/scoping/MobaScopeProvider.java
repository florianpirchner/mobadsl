/**
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.scoping;

import java.util.List;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaPayload;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaRestCrud;
import org.mobadsl.semantic.model.moba.MobaRestCustom;
import org.mobadsl.semantic.model.moba.MobaService;
import org.mobadsl.semantic.model.moba.MobaSettings;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class MobaScopeProvider extends AbstractDeclarativeScopeProvider {
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
  
  public IScope scope_MobaPayload(final MobaApplication ctx, final EReference ref) {
    List<MobaPayload> _allPayloads = ctx.getAllPayloads();
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
    List<MobaRestCrud> _allRestCruds = ctx.getAllRestCruds();
    return Scopes.scopeFor(_allRestCruds);
  }
  
  public IScope scope_MobaRestCustom(final MobaApplication ctx, final EReference ref) {
    List<MobaRestCustom> _allRestCustoms = ctx.getAllRestCustoms();
    return Scopes.scopeFor(_allRestCustoms);
  }
  
  public IScope scope_MobaGenerator(final MobaApplication ctx, final EReference ref) {
    List<MobaGenerator> _allGenerators = ctx.getAllGenerators();
    return Scopes.scopeFor(_allGenerators);
  }
}
