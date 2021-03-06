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
import com.google.inject.Inject;
import java.util.Calendar;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaConstantValueFunction;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaExternalModule;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorSlot;
import org.mobadsl.semantic.model.moba.MobaModel;
import org.mobadsl.semantic.model.moba.MobaPersistenceType;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaRESTWorkflow;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.MobaTransportSerializationType;
import org.mobadsl.semantic.model.moba.MobaTrigger;
import org.mobadsl.semantic.model.moba.ValueType;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MobaConstantsGenerator extends AbstractGenerator {
  @Inject
  private IEObjectDocumentationProvider docuProvider;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    EList<EObject> _contents = input.getContents();
    EObject _get = _contents.get(0);
    final MobaModel model = ((MobaModel) _get);
    List<MobaApplication> _applications = model.getApplications();
    final Consumer<MobaApplication> _function = (MobaApplication it) -> {
      String _fileName = this.toFileName(it);
      CharSequence _constantsClass = this.toConstantsClass(it);
      fsa.generateFile(_fileName, IFileSystemAccess.DEFAULT_OUTPUT, _constantsClass);
    };
    _applications.forEach(_function);
  }
  
  public CharSequence toConstantsClass(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    String _copyright = this.toCopyright(application);
    _builder.append(_copyright, "");
    _builder.newLineIfNotEmpty();
    _builder.append("package ");
    String _packageName = this.toPackageName(application);
    _builder.append(_packageName, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("/**");
    _builder.newLine();
    _builder.append("  ");
    String _documentation = this.toDocumentation(application);
    _builder.append(_documentation, "  ");
    _builder.newLineIfNotEmpty();
    _builder.append("*/ ");
    _builder.newLine();
    _builder.append("public interface ");
    String _interfaceName = this.toInterfaceName(application);
    _builder.append(_interfaceName, "");
    _builder.append(" ");
    {
      List<MobaTemplate> _templates = application.getTemplates();
      boolean _isEmpty = _templates.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.append("extends ");
        String _extends = this.toExtends(application);
        _builder.append(_extends, "");
      }
    }
    _builder.append("{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    CharSequence _application = this.toApplication(application);
    _builder.append(_application, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _constants = this.toConstants(application);
    _builder.append(_constants, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _authorizations = this.toAuthorizations(application);
    _builder.append(_authorizations, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _externalModules = this.toExternalModules(application);
    _builder.append(_externalModules, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _datatypes = this.toDatatypes(application);
    _builder.append(_datatypes, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _dtos = this.toDtos(application);
    _builder.append(_dtos, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _entities = this.toEntities(application);
    _builder.append(_entities, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _enums = this.toEnums(application);
    _builder.append(_enums, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generators = this.toGenerators(application);
    _builder.append(_generators, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _generatorSlots = this.toGeneratorSlots(application);
    _builder.append(_generatorSlots, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _caches = this.toCaches(application);
    _builder.append(_caches, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _persistenceTypes = this.toPersistenceTypes(application);
    _builder.append(_persistenceTypes, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _queues = this.toQueues(application);
    _builder.append(_queues, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _restCustomServices = this.toRestCustomServices(application);
    _builder.append(_restCustomServices, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _restCruds = this.toRestCruds(application);
    _builder.append(_restCruds, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _restWorkflows = this.toRestWorkflows(application);
    _builder.append(_restWorkflows, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _servers = this.toServers(application);
    _builder.append(_servers, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _settings = this.toSettings(application);
    _builder.append(_settings, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _transportSerializationTypes = this.toTransportSerializationTypes(application);
    _builder.append(_transportSerializationTypes, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    CharSequence _triggers = this.toTriggers(application);
    _builder.append(_triggers, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  public String toCopyright(final MobaApplication app) {
    EObject _eContainer = app.eContainer();
    final MobaModel model = ((MobaModel) _eContainer);
    String _copyright = model.getCopyright();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_copyright);
    if (_isNullOrEmpty) {
      return "";
    }
    final StringBuilder b = new StringBuilder();
    b.append("/**\n");
    String _copyright_1 = model.getCopyright();
    String[] _split = _copyright_1.split("\n");
    for (final String line : _split) {
      b.append(((" * " + line) + "\n"));
    }
    b.append(" */");
    String result = b.toString();
    int _currentYear = this.toCurrentYear();
    String _string = Integer.toString(_currentYear);
    String _replaceAll = result.replaceAll("\\{\\$year\\}", _string);
    result = _replaceAll;
    return result;
  }
  
  public int toCurrentYear() {
    Calendar _instance = Calendar.getInstance();
    return _instance.get(Calendar.YEAR);
  }
  
  public CharSequence toTriggers(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaTrigger> _triggers = application.getTriggers();
      boolean _isEmpty = _triggers.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// TRIGGERS");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaTrigger> _triggers_1 = application.getTriggers();
          for(final MobaTrigger obj : _triggers_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Trigger__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toTransportSerializationTypes(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaTransportSerializationType> _transportSerializationTypes = application.getTransportSerializationTypes();
      boolean _isEmpty = _transportSerializationTypes.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// TANSPORT SERIALIZATION TYPE");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaTransportSerializationType> _transportSerializationTypes_1 = application.getTransportSerializationTypes();
          for(final MobaTransportSerializationType obj : _transportSerializationTypes_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String TransportSerialization__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toSettings(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaSettings> _settings = application.getSettings();
      boolean _isEmpty = _settings.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// SETTINGS");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaSettings> _settings_1 = application.getSettings();
          for(final MobaSettings obj : _settings_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Setting__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toServers(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaServer> _servers = application.getServers();
      boolean _isEmpty = _servers.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// SERVERS");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaServer> _servers_1 = application.getServers();
          for(final MobaServer obj : _servers_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Server__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toRestWorkflows(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaRESTWorkflow> _rESTWorkflows = application.getRESTWorkflows();
      boolean _isEmpty = _rESTWorkflows.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// REST WORKFLOW");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaRESTWorkflow> _rESTWorkflows_1 = application.getRESTWorkflows();
          for(final MobaRESTWorkflow obj : _rESTWorkflows_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String RestWorkflow__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toRestCruds(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaRESTCrud> _rESTCruds = application.getRESTCruds();
      boolean _isEmpty = _rESTCruds.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// REST CRUD");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaRESTCrud> _rESTCruds_1 = application.getRESTCruds();
          for(final MobaRESTCrud obj : _rESTCruds_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String RestCrud__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toRestCustomServices(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaRESTCustomService> _restCustomServices = application.getRestCustomServices();
      boolean _isEmpty = _restCustomServices.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// REST CUSTOM");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaRESTCustomService> _restCustomServices_1 = application.getRestCustomServices();
          for(final MobaRESTCustomService obj : _restCustomServices_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String RestCustom__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toQueues(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaQueue> _queues = application.getQueues();
      boolean _isEmpty = _queues.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// QUEUES");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaQueue> _queues_1 = application.getQueues();
          for(final MobaQueue obj : _queues_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Queue__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toPersistenceTypes(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaPersistenceType> _persistenceTypes = application.getPersistenceTypes();
      boolean _isEmpty = _persistenceTypes.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// PERSISTENCE TYPES");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaPersistenceType> _persistenceTypes_1 = application.getPersistenceTypes();
          for(final MobaPersistenceType obj : _persistenceTypes_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String PersistenceType__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toCaches(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaCache> _caches = application.getCaches();
      boolean _isEmpty = _caches.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// CACHES");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaCache> _caches_1 = application.getCaches();
          for(final MobaCache obj : _caches_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Cache__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toGeneratorSlots(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaGeneratorSlot> _generatorSlots = application.getGeneratorSlots();
      boolean _isEmpty = _generatorSlots.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// GENERATOR SLOTS");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaGeneratorSlot> _generatorSlots_1 = application.getGeneratorSlots();
          for(final MobaGeneratorSlot obj : _generatorSlots_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String GeneratorSlot__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toGenerators(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaGenerator> _generators = application.getGenerators();
      boolean _isEmpty = _generators.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// GENERATORS");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaGenerator> _generators_1 = application.getGenerators();
          for(final MobaGenerator obj : _generators_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Generator__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toEntities(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaEntity> _entities = application.getEntities();
      boolean _isEmpty = _entities.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// ENTITIES");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaEntity> _entities_1 = application.getEntities();
          for(final MobaEntity obj : _entities_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Entity__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toEnums(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaEnum> _enums = application.getEnums();
      boolean _isEmpty = _enums.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// ENUMS");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaEnum> _enums_1 = application.getEnums();
          for(final MobaEnum obj : _enums_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            EObject _eContainer = obj.eContainer();
            String _documentation = this.toDocumentation(_eContainer);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Enum__");
            EObject _eContainer_1 = obj.eContainer();
            String _name = ((MobaDataType) _eContainer_1).getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            EObject _eContainer_2 = obj.eContainer();
            String _name_1 = ((MobaDataType) _eContainer_2).getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toDtos(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaDto> _dtos = application.getDtos();
      boolean _isEmpty = _dtos.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// DTOS");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaDto> _dtos_1 = application.getDtos();
          for(final MobaDto obj : _dtos_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Dto__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toDatatypes(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaDataType> _dataTypes = application.getDataTypes();
      boolean _isEmpty = _dataTypes.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// DATATYPES");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaDataType> _dataTypes_1 = application.getDataTypes();
          for(final MobaDataType obj : _dataTypes_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Datatype__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toExternalModules(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaExternalModule> _externalModules = application.getExternalModules();
      boolean _isEmpty = _externalModules.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// EXTERNAL MODULES");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaExternalModule> _externalModules_1 = application.getExternalModules();
          for(final MobaExternalModule obj : _externalModules_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Ext_Module__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toAuthorizations(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaAuthorization> _authorizations = application.getAuthorizations();
      boolean _isEmpty = _authorizations.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// AUTHORIZATIONS");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaAuthorization> _authorizations_1 = application.getAuthorizations();
          for(final MobaAuthorization obj : _authorizations_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final String Authorization__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = \"");
            String _name_1 = obj.getName();
            _builder.append(_name_1, "");
            _builder.append("\";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
        _builder.append("\t\t");
      }
    }
    return _builder;
  }
  
  public CharSequence toConstants(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    {
      List<MobaConstant> _constants = application.getConstants();
      boolean _isEmpty = _constants.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        _builder.newLineIfNotEmpty();
        _builder.append("//");
        _builder.newLine();
        _builder.append("// CONSTANTS");
        _builder.newLine();
        _builder.append("//");
        _builder.newLine();
        {
          List<MobaConstant> _constants_1 = application.getConstants();
          for(final MobaConstant obj : _constants_1) {
            _builder.append("/**");
            _builder.newLine();
            _builder.append("  ");
            String _documentation = this.toDocumentation(obj);
            _builder.append(_documentation, "  ");
            _builder.newLineIfNotEmpty();
            _builder.append(" ");
            _builder.append("*/ ");
            _builder.newLine();
            _builder.append("public static final ");
            String _type = this.toType(obj);
            _builder.append(_type, "");
            _builder.append(" Const__");
            String _name = obj.getName();
            _builder.append(_name, "");
            _builder.append(" = ");
            String _value = this.toValue(obj);
            _builder.append(_value, "");
            _builder.append(";");
            _builder.newLineIfNotEmpty();
            _builder.newLine();
          }
        }
      }
    }
    return _builder;
  }
  
  public CharSequence toApplication(final MobaApplication application) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public static final String Application__");
    String _name = application.getName();
    _builder.append(_name, "");
    _builder.append("_Name = \"");
    String _name_1 = application.getName();
    _builder.append(_name_1, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    _builder.append("public static final String Application__");
    String _name_2 = application.getName();
    _builder.append(_name_2, "");
    _builder.append("_Version = \"");
    String _version = application.getVersion();
    _builder.append(_version, "");
    _builder.append("\";");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  public String toExtends(final MobaApplication application) {
    final StringBuilder b = new StringBuilder();
    List<MobaTemplate> _templates = application.getTemplates();
    for (final MobaTemplate template : _templates) {
      {
        int _length = b.length();
        boolean _greaterThan = (_length > 0);
        if (_greaterThan) {
          b.append(",\n\t\t");
        }
        MobaApplication _template = template.getTemplate();
        String _packageName = this.toPackageName(_template);
        String _plus = (_packageName + ".");
        MobaApplication _template_1 = template.getTemplate();
        String _interfaceName = this.toInterfaceName(_template_1);
        String _plus_1 = (_plus + _interfaceName);
        b.append(_plus_1);
      }
    }
    return b.toString();
  }
  
  public String toDocumentation(final EObject eObject) {
    String _documentation = this.docuProvider.getDocumentation(eObject);
    final String[] temp = _documentation.split("\n");
    final StringBuilder result = new StringBuilder();
    final Consumer<String> _function = (String it) -> {
      result.append("* ");
      result.append(it);
      result.append("\n");
    };
    ((List<String>)Conversions.doWrapArray(temp)).forEach(_function);
    return result.toString();
  }
  
  public String toValue(final MobaConstant constant) {
    MobaConstantValue _valueAST = constant.getValueAST();
    return this.toValue(_valueAST);
  }
  
  public String toValue(final MobaConstantValue value) {
    String tempResult = null;
    ValueType _valueType = value.getValueType();
    if (_valueType != null) {
      switch (_valueType) {
        case STRING:
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("\"");
          String _valueSimple = value.getValueSimple();
          _builder.append(_valueSimple, "");
          _builder.append("\"");
          tempResult = _builder.toString();
          break;
        case CONSTANT:
          EList<MobaConstantValueFunction> _valueConstFunctions = value.getValueConstFunctions();
          boolean _isEmpty = _valueConstFunctions.isEmpty();
          if (_isEmpty) {
            MobaConstant _valueConst = value.getValueConst();
            String _name = _valueConst.getName();
            String _plus = ("Const__" + _name);
            tempResult = _plus;
          } else {
            StringConcatenation _builder_1 = new StringConcatenation();
            _builder_1.append("\"");
            String _valueSimple_1 = value.getValueSimple();
            _builder_1.append(_valueSimple_1, "");
            _builder_1.append("\"");
            tempResult = _builder_1.toString();
          }
          break;
        case DECIMAL:
          String _valueSimple_2 = value.getValueSimple();
          tempResult = _valueSimple_2;
          break;
        case NUMERIC:
          String _valueSimple_3 = value.getValueSimple();
          tempResult = _valueSimple_3;
          break;
        default:
          break;
      }
    }
    MobaConstantValue _tail = value.getTail();
    boolean _notEquals = (!Objects.equal(_tail, null));
    if (_notEquals) {
      MobaConstantValue _tail_1 = value.getTail();
      String _value = this.toValue(_tail_1);
      return ((tempResult + " + ") + _value);
    } else {
      return tempResult;
    }
  }
  
  public String collectConstantConcats(final MobaConstant constant) {
    MobaConstantValue _valueAST = constant.getValueAST();
    MobaConstant _valueConst = _valueAST.getValueConst();
    return _valueConst.getName();
  }
  
  public String toType(final MobaConstant constant) {
    MobaConstantValue _valueAST = constant.getValueAST();
    ValueType _valueType = _valueAST.getValueType();
    if (_valueType != null) {
      switch (_valueType) {
        case STRING:
          return "String";
        case DECIMAL:
          return "double";
        case NUMERIC:
          return "int";
        case CONSTANT:
          return "String";
        default:
          break;
      }
    }
    return null;
  }
  
  public String toInterfaceName(final MobaApplication application) {
    String _name = application.getName();
    return (_name + "Constants");
  }
  
  public String toFileName(final MobaApplication application) {
    String _filePackageName = this.toFilePackageName(application);
    String _plus = (_filePackageName + "/");
    String _interfaceName = this.toInterfaceName(application);
    String _plus_1 = (_plus + _interfaceName);
    return (_plus_1 + ".java");
  }
  
  public String toFilePackageName(final MobaApplication application) {
    String _xifexpression = null;
    String _javaPackage = application.getJavaPackage();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_javaPackage);
    if (_isNullOrEmpty) {
      _xifexpression = "to/be/defined/";
    } else {
      String _javaPackage_1 = application.getJavaPackage();
      _xifexpression = _javaPackage_1.replaceAll("\\.", "/");
    }
    return _xifexpression;
  }
  
  public String toPackageName(final MobaApplication application) {
    String _xifexpression = null;
    String _javaPackage = application.getJavaPackage();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_javaPackage);
    if (_isNullOrEmpty) {
      _xifexpression = "to.be.defined";
    } else {
      _xifexpression = application.getJavaPackage();
    }
    return _xifexpression;
  }
  
  @Override
  public void beforeGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
  
  @Override
  public void afterGenerate(final Resource input, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
  }
}
