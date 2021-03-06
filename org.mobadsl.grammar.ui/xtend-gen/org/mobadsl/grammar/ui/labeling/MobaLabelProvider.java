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
package org.mobadsl.grammar.ui.labeling;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaData;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoAttribute;
import org.mobadsl.semantic.model.moba.MobaDtoEmbeddable;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityAttribute;
import org.mobadsl.semantic.model.moba.MobaEntityReference;
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaEnumLiteral;
import org.mobadsl.semantic.model.moba.MobaExternalModule;
import org.mobadsl.semantic.model.moba.MobaFeature;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaPersistenceType;
import org.mobadsl.semantic.model.moba.MobaProject;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueReference;
import org.mobadsl.semantic.model.moba.MobaREST;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTPayloadDefinition;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaSettingsAttribute;
import org.mobadsl.semantic.model.moba.MobaSettingsEntityReference;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaTrigger;

@SuppressWarnings("all")
public class MobaLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public MobaLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
  
  public StyledString text(final MobaProject project) {
    String _name = project.getName();
    String _version = project.getVersion();
    return this.getDisplayString(_name, _version);
  }
  
  public StyledString text(final MobaApplication app) {
    String _name = app.getName();
    String _version = app.getVersion();
    return this.getDisplayString(_name, _version);
  }
  
  public StyledString text(final MobaTemplate app) {
    MobaApplication _template = app.getTemplate();
    String _name = _template.getName();
    MobaApplication _template_1 = app.getTemplate();
    String _version = _template_1.getVersion();
    return this.getDisplayString(_name, _version);
  }
  
  public StyledString text(final MobaGenerator generator) {
    EObject _eContainer = generator.eContainer();
    final MobaApplication app = ((MobaApplication) _eContainer);
    String _name = generator.getName();
    String _version = app.getVersion();
    return this.getDisplayString(_name, _version);
  }
  
  public StyledString text(final MobaGeneratorMixinFeature feature) {
    MobaGenerator _generatorRef = feature.getGeneratorRef();
    return this.text(_generatorRef);
  }
  
  public StyledString text(final MobaConstant const_) {
    String _name = const_.getName();
    String _value = const_.getValue();
    return this.getDisplayString(_name, _value);
  }
  
  public StyledString text(final MobaRESTAttribute att) {
    String _key = att.getKey();
    String _value = att.getValue();
    return this.getDisplayString(_key, _value);
  }
  
  public StyledString text(final MobaDtoAttribute att) {
    String _name = att.getName();
    MobaDataType _type = att.getType();
    String _name_1 = _type.getName();
    return this.getDisplayString(_name, _name_1);
  }
  
  public StyledString text(final MobaEntityAttribute att) {
    String _name = att.getName();
    MobaDataType _type = att.getType();
    String _name_1 = _type.getName();
    return this.getDisplayString(_name, _name_1);
  }
  
  public StyledString text(final MobaCache cache) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _cacheStrategy = cache.getCacheStrategy();
    _builder.append(_cacheStrategy, "");
    _builder.append(" / ");
    String _cacheType = cache.getCacheType();
    _builder.append(_cacheType, "");
    _builder.append(" / ");
    int _cacheInterval = cache.getCacheInterval();
    _builder.append(_cacheInterval, "");
    _builder.append(" / ");
    MobaPersistenceType _cachePersistence = cache.getCachePersistence();
    String _toName = this.getToName(_cachePersistence);
    _builder.append(_toName, "");
    _builder.append(")");
    return this.getDisplayString("Cache", _builder.toString());
  }
  
  public String getToName(final MobaPersistenceType type) {
    String _xifexpression = null;
    boolean _equals = Objects.equal(type, null);
    if (_equals) {
      _xifexpression = "default";
    } else {
      return type.getName();
    }
    return _xifexpression;
  }
  
  public StyledString text(final MobaSettingsAttribute att) {
    String _name = att.getName();
    MobaDataType _type = att.getType();
    String _name_1 = _type.getName();
    return this.getDisplayString(_name, _name_1);
  }
  
  public StyledString text(final MobaDtoReference att) {
    String _name = att.getName();
    MobaDto _type = att.getType();
    String _name_1 = _type.getName();
    return this.getDisplayString(_name, _name_1);
  }
  
  public StyledString text(final MobaDtoEmbeddable att) {
    String _name = att.getName();
    MobaDto _type = att.getType();
    String _name_1 = _type.getName();
    return this.getDisplayString(_name, _name_1);
  }
  
  public StyledString text(final MobaEntityReference att) {
    String _name = att.getName();
    MobaEntity _type = att.getType();
    String _name_1 = _type.getName();
    return this.getDisplayString(_name, _name_1);
  }
  
  public StyledString text(final MobaSettingsEntityReference att) {
    String _name = att.getName();
    MobaEntity _type = att.getType();
    String _name_1 = _type.getName();
    return this.getDisplayString(_name, _name_1);
  }
  
  public StyledString text(final MobaQueueReference att) {
    String _name = att.getName();
    MobaREST _restService = att.getRestService();
    String _name_1 = _restService.getName();
    return this.getDisplayString(_name, _name_1);
  }
  
  public StyledString text(final MobaRESTPayloadDefinition att) {
    MobaDto _dto = att.getDto();
    String _name = _dto.getName();
    String _xifexpression = null;
    boolean _isArray = att.isArray();
    if (_isArray) {
      _xifexpression = "[*]";
    } else {
      _xifexpression = null;
    }
    return this.getDisplayString(_name, _xifexpression);
  }
  
  protected String _name(final MobaData data) {
    return "";
  }
  
  protected String _name(final MobaDto data) {
    return data.getName();
  }
  
  protected String _name(final MobaEntity data) {
    return data.getName();
  }
  
  protected String _name(final MobaQueue data) {
    return data.getName();
  }
  
  public StyledString text(final MobaDataType dt) {
    boolean _or = false;
    boolean _or_1 = false;
    boolean _isDate = dt.isDate();
    if (_isDate) {
      _or_1 = true;
    } else {
      boolean _isTime = dt.isTime();
      _or_1 = _isTime;
    }
    if (_or_1) {
      _or = true;
    } else {
      boolean _isTimestamp = dt.isTimestamp();
      _or = _isTimestamp;
    }
    if (_or) {
      String _name = dt.getName();
      String _dateFormat = dt.getDateFormat();
      return this.getDisplayString(_name, _dateFormat);
    } else {
      boolean _isEnum = dt.isEnum();
      if (_isEnum) {
        final StringBuilder bf = new StringBuilder();
        bf.append("(");
        MobaEnum _enumAST = dt.getEnumAST();
        List<MobaEnumLiteral> _allLiterals = _enumAST.getAllLiterals();
        for (final MobaEnumLiteral lit : _allLiterals) {
          {
            int _length = bf.length();
            boolean _greaterThan = (_length > 1);
            if (_greaterThan) {
              bf.append(", ");
            }
            String _literal = lit.getLiteral();
            bf.append(_literal);
          }
        }
        bf.append(")");
        String _name_1 = dt.getName();
        String _string = bf.toString();
        return this.getDisplayString(_name_1, _string);
      }
    }
    String _name_2 = dt.getName();
    return this.getDisplayString(_name_2, null);
  }
  
  public StyledString text(final MobaServer server) {
    String _name = server.getName();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _uRL = server.getURL();
    _builder.append(_uRL, "");
    _builder.append(")");
    return this.getDisplayString(_name, _builder.toString());
  }
  
  public StyledString getDisplayString(final String value, final String description) {
    final StyledString string = new StyledString(value);
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(description);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      string.append((" : " + description), StyledString.DECORATIONS_STYLER);
    }
    return string;
  }
  
  public String image(final MobaApplication ele) {
    return "MobaApplication.png";
  }
  
  public String image(final MobaQueue ele) {
    return "MobaQueue.png";
  }
  
  public String image(final MobaApplicationFeature ele) {
    return "MobaApplicationFeature.png";
  }
  
  public String image(final MobaDataType ele) {
    return "MobaFeature.png";
  }
  
  public String image(final MobaFeature ele) {
    return "MobaFeature.png";
  }
  
  public String image(final MobaProject ele) {
    return "MobaProject.png";
  }
  
  public String image(final MobaServer ele) {
    return "MobaServer.png";
  }
  
  public String image(final MobaDto ele) {
    return "MobaDto.png";
  }
  
  public String image(final MobaSettings ele) {
    return "MobaSettings.gif";
  }
  
  public String image(final MobaExternalModule ele) {
    return "MobaExternalModule.png";
  }
  
  public String image(final MobaTrigger ele) {
    return "MobaTrigger.png";
  }
  
  public String image(final MobaCache ele) {
    return "MobaCache.png";
  }
  
  public String image(final MobaREST ele) {
    return "MobaREST.png";
  }
  
  public String image(final MobaTemplate ele) {
    return "MobaTemplate.png";
  }
  
  public String image(final MobaConstant ele) {
    return "MobaConstant.png";
  }
  
  public String image(final MobaEntity ele) {
    return "MobaEntity.gif";
  }
  
  public String image(final MobaGenerator ele) {
    return "MobaGenerator.gif";
  }
  
  public Object image(final MobaQueueReference ele) {
    MobaREST _restService = ele.getRestService();
    return super.doGetImage(_restService);
  }
  
  public String image(final MobaRESTPayloadDefinition ele) {
    return "MobaDto.png";
  }
  
  public String image(final MobaRESTAttribute ele) {
    return "MobaFeature.png";
  }
  
  public String name(final MobaData data) {
    if (data instanceof MobaDto) {
      return _name((MobaDto)data);
    } else if (data instanceof MobaEntity) {
      return _name((MobaEntity)data);
    } else if (data instanceof MobaQueue) {
      return _name((MobaQueue)data);
    } else if (data != null) {
      return _name(data);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(data).toString());
    }
  }
}
