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
package org.mobadsl.grammar.formatting2;

import com.google.inject.Inject;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.mobadsl.grammar.services.MobaGrammarAccess;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoFeature;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityFeature;
import org.mobadsl.semantic.model.moba.MobaEntityIndex;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaMultiplicityAble;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueFeature;

@SuppressWarnings("all")
public class MobaFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private MobaGrammarAccess _mobaGrammarAccess;
  
  protected void _format(final MobaApplication mobaApplication, @Extension final IFormattableDocument document) {
    EList<MobaApplicationFeature> _features = mobaApplication.getFeatures();
    for (final MobaApplicationFeature features : _features) {
      this.format(features, document);
    }
  }
  
  protected void _format(final MobaPropertiesAble mobaPropertiesProvider, @Extension final IFormattableDocument document) {
    EList<MobaProperty> _properties = mobaPropertiesProvider.getProperties();
    for (final MobaProperty properties : _properties) {
      this.format(properties, document);
    }
  }
  
  protected void _format(final MobaEntity mobaDto, @Extension final IFormattableDocument document) {
    MobaCache _cache = mobaDto.getCache();
    this.format(_cache, document);
    EList<MobaEntityFeature> _features = mobaDto.getFeatures();
    for (final MobaEntityFeature features : _features) {
      this.format(features, document);
    }
    EList<MobaEntityIndex> _indizes = mobaDto.getIndizes();
    this.format(_indizes, document);
  }
  
  protected void _format(final MobaDto mobaPayload, @Extension final IFormattableDocument document) {
    EList<MobaDtoFeature> _features = mobaPayload.getFeatures();
    for (final MobaDtoFeature features : _features) {
      this.format(features, document);
    }
  }
  
  protected void _format(final MobaQueue mobaQueue, @Extension final IFormattableDocument document) {
    EList<MobaQueueFeature> _features = mobaQueue.getFeatures();
    for (final MobaQueueFeature features : _features) {
      this.format(features, document);
    }
  }
  
  protected void _format(final MobaMultiplicityAble mobaMultiplicityProvider, @Extension final IFormattableDocument document) {
    MobaMuliplicity _multiplicity = mobaMultiplicityProvider.getMultiplicity();
    this.format(_multiplicity, document);
  }
  
  public void format(final Object mobaPayload, final IFormattableDocument document) {
    if (mobaPayload instanceof MobaDto) {
      _format((MobaDto)mobaPayload, document);
      return;
    } else if (mobaPayload instanceof MobaEntity) {
      _format((MobaEntity)mobaPayload, document);
      return;
    } else if (mobaPayload instanceof MobaQueue) {
      _format((MobaQueue)mobaPayload, document);
      return;
    } else if (mobaPayload instanceof MobaApplication) {
      _format((MobaApplication)mobaPayload, document);
      return;
    } else if (mobaPayload instanceof XtextResource) {
      _format((XtextResource)mobaPayload, document);
      return;
    } else if (mobaPayload instanceof MobaMultiplicityAble) {
      _format((MobaMultiplicityAble)mobaPayload, document);
      return;
    } else if (mobaPayload instanceof MobaPropertiesAble) {
      _format((MobaPropertiesAble)mobaPayload, document);
      return;
    } else if (mobaPayload instanceof EObject) {
      _format((EObject)mobaPayload, document);
      return;
    } else if (mobaPayload == null) {
      _format((Void)null, document);
      return;
    } else if (mobaPayload != null) {
      _format(mobaPayload, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(mobaPayload, document).toString());
    }
  }
}
