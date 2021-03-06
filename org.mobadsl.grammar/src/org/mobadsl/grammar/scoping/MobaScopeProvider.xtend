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

import com.google.inject.Inject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope
import org.eclipse.xtext.scoping.Scopes
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider
import org.eclipse.xtext.scoping.impl.DefaultGlobalScopeProvider
import org.mobadsl.semantic.model.moba.MobaApplication
import org.mobadsl.semantic.model.moba.MobaDtoReference
import org.mobadsl.semantic.model.moba.MobaEntityReference
import org.mobadsl.semantic.model.moba.MobaRESTCustomService

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
class MobaScopeProvider extends AbstractDeclarativeScopeProvider {

	@Inject DefaultGlobalScopeProvider globalScopeProvider

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

	def IScope scope_MobaEntity(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allEntities);
	}

	def IScope scope_MobaQueue(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allQueues);
	}
	
	def IScope scope_MobaPersistenceType(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allPersistenceTypes);
	}

	def IScope scope_MobaSettings(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allSettings);
	}

	def IScope scope_MobaREST(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allREST);
	}

	def IScope scope_MobaRESTCrud(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allRESTCruds);
	}

	def IScope scope_MobaRESTCustomService(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allRESTCustomServices);
	}

	def IScope scope_MobaAuthorization(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allAuthorizations);
	}

	def IScope scope_MobaTransportSerializationType(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allTransportSerializationTypes);
	}

	def IScope scope_MobaServer(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allServers);
	}

	def IScope scope_MobaTrigger(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allTriggers);
	}

	def IScope scope_MobaExternalModule(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allExternalModules);
	}

	def IScope scope_MobaGenerator(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allGenerators);
	}

	def IScope scope_MobaCache(MobaApplication ctx, EReference ref) {
		return Scopes.scopeFor(ctx.allCaches);
	}

	def IScope scope_MobaApplication(MobaApplication ctx, EReference ref) {
		val scope = globalScopeProvider.getScope(ctx.eResource, ref)
		return new ApplicationTemplateScope(scope)
	}
	
	def IScope scope_MobaRESTDtoAttribute_dtoFeature(MobaRESTCustomService ctx, EReference ref) {
		val dto = ctx.requestDto?.dto
		if(dto == null) {
			return IScope.NULLSCOPE
		}
		return Scopes.scopeFor(dto.genFeatures);
	}
	
	def IScope scope_MobaEntityReference_opposite(MobaEntityReference ctx, EReference ref) {
		if (ctx.type != null) {
			return Scopes.scopeFor(ctx.type.genReferences.filter [
				// ensure that the available opposite references point to the targetDto
				ctx.eContainer == it.type
			]);
		}
		return IScope.NULLSCOPE
	}

	def IScope scope_MobaDtoReference_opposite(MobaDtoReference ctx, EReference ref) {
		if (ctx.type != null) {
			return Scopes.scopeFor(ctx.type.genReferences.filter [
				// ensure that the available opposite references point to the targetDto
				ctx.eContainer == it.type
			]);
		}
		return IScope.NULLSCOPE
	}
}
