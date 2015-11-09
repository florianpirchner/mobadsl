/*
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.scoping

import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.mobadsl.semantic.model.moba.MobaApplication

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MobaScopeProvider extends AbstractDeclarativeScopeProvider {

	def IScope scope_MobaConstant(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allConstants);
	}
	
	def IScope scope_MobaDataType(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allDataTypes);
	}
	
	def IScope scope_MobaData(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allDatas);
	}
	
	def IScope scope_MobaDto(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allDtos);
	}
	
	def IScope scope_MobaPayload(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allPayloads);
	}
	
	def IScope scope_MobaQueue(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allQueues);
	}
	
	def IScope scope_MobaSettings(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allSettings);
	}
	
	def IScope scope_MobaService(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allServices);
	}
	
	def IScope scope_MobaRestCrud(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allRestCruds);
	}
	
	def IScope scope_MobaRestCustom(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allRestCustoms);
	}
	
	

}
