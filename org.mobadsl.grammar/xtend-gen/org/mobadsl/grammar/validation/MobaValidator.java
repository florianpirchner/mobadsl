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
package org.mobadsl.grammar.validation;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate;
import org.mobadsl.grammar.validation.AbstractMobaValidator;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaCache;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaDto;
import org.mobadsl.semantic.model.moba.MobaDtoFeature;
import org.mobadsl.semantic.model.moba.MobaDtoReference;
import org.mobadsl.semantic.model.moba.MobaEntity;
import org.mobadsl.semantic.model.moba.MobaEntityFeature;
import org.mobadsl.semantic.model.moba.MobaEntityReference;
import org.mobadsl.semantic.model.moba.MobaEnum;
import org.mobadsl.semantic.model.moba.MobaEnumLiteral;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaMuliplicity;
import org.mobadsl.semantic.model.moba.MobaPackage;
import org.mobadsl.semantic.model.moba.MobaQueue;
import org.mobadsl.semantic.model.moba.MobaQueueFeature;
import org.mobadsl.semantic.model.moba.MobaRESTAttribute;
import org.mobadsl.semantic.model.moba.MobaRESTCrud;
import org.mobadsl.semantic.model.moba.MobaRESTCustomService;
import org.mobadsl.semantic.model.moba.MobaServer;
import org.mobadsl.semantic.model.moba.MobaSettings;
import org.mobadsl.semantic.model.moba.MobaTemplate;
import org.mobadsl.semantic.model.moba.RecursionException;
import org.mobadsl.semantic.model.moba.ValueType;
import org.mobadsl.semantic.model.moba.util.Bounds;

@SuppressWarnings("all")
public class MobaValidator extends AbstractMobaValidator {
  @Inject
  private IContainer.Manager containerManager;
  
  @Inject
  private IResourceDescription.Manager descriptionManager;
  
  @Inject
  private ExtensionGeneratorDelegate generatorDelegate;
  
  @Inject
  @Named(Constants.LANGUAGE_NAME)
  private String grammarName;
  
  public final static String DUPLICATE_NAME = "duplicateName";
  
  public final static String DOWNLOAD_TEMPLATE = "downloadTemplate";
  
  @Check
  public void checkDuplicateFeatureName(final MobaEntity dto) {
    Map<String, MobaEntityFeature> _xifexpression = null;
    MobaEntity _superType = dto.getSuperType();
    boolean _notEquals = (!Objects.equal(_superType, null));
    if (_notEquals) {
      Map<String, MobaEntityFeature> _xtrycatchfinallyexpression = null;
      try {
        MobaEntity _superType_1 = dto.getSuperType();
        List<MobaEntityFeature> _allFeatures = _superType_1.getAllFeatures();
        final Function1<MobaEntityFeature, String> _function = (MobaEntityFeature it) -> {
          return it.getName();
        };
        _xtrycatchfinallyexpression = IterableExtensions.<String, MobaEntityFeature>toMap(_allFeatures, _function);
      } catch (final Throwable _t) {
        if (_t instanceof RecursionException) {
          final RecursionException ex = (RecursionException)_t;
          _xtrycatchfinallyexpression = Collections.<String, MobaEntityFeature>emptyMap();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xifexpression = _xtrycatchfinallyexpression;
    } else {
      _xifexpression = Collections.<String, MobaEntityFeature>emptyMap();
    }
    final Map<String, MobaEntityFeature> superFeatureMap = _xifexpression;
    final Set<String> currentFeatures = CollectionLiterals.<String>newHashSet();
    int index = 0;
    EList<MobaEntityFeature> _features = dto.getFeatures();
    for (final MobaEntityFeature feature : _features) {
      {
        String _name = feature.getName();
        boolean _containsKey = superFeatureMap.containsKey(_name);
        if (_containsKey) {
          this.error("Supertype contains same feature name", dto, MobaPackage.Literals.MOBA_ENTITY__FEATURES, index);
        }
        String _name_1 = feature.getName();
        boolean _contains = currentFeatures.contains(_name_1);
        if (_contains) {
          this.error("Feature name must be unique", dto, MobaPackage.Literals.MOBA_ENTITY__FEATURES, index);
        }
        String _name_2 = feature.getName();
        currentFeatures.add(_name_2);
        index++;
      }
    }
  }
  
  @Check
  public void checkDuplicateFeatureName(final MobaDto payload) {
    Map<String, MobaDtoFeature> _xifexpression = null;
    MobaDto _superType = payload.getSuperType();
    boolean _notEquals = (!Objects.equal(_superType, null));
    if (_notEquals) {
      Map<String, MobaDtoFeature> _xtrycatchfinallyexpression = null;
      try {
        MobaDto _superType_1 = payload.getSuperType();
        List<MobaDtoFeature> _allFeatures = _superType_1.getAllFeatures();
        final Function1<MobaDtoFeature, String> _function = (MobaDtoFeature it) -> {
          return it.getName();
        };
        _xtrycatchfinallyexpression = IterableExtensions.<String, MobaDtoFeature>toMap(_allFeatures, _function);
      } catch (final Throwable _t) {
        if (_t instanceof RecursionException) {
          final RecursionException ex = (RecursionException)_t;
          _xtrycatchfinallyexpression = Collections.<String, MobaDtoFeature>emptyMap();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xifexpression = _xtrycatchfinallyexpression;
    } else {
      _xifexpression = Collections.<String, MobaDtoFeature>emptyMap();
    }
    final Map<String, MobaDtoFeature> superFeatureMap = _xifexpression;
    final Set<String> currentFeatures = CollectionLiterals.<String>newHashSet();
    int index = 0;
    EList<MobaDtoFeature> _features = payload.getFeatures();
    for (final MobaDtoFeature feature : _features) {
      {
        String _name = feature.getName();
        boolean _containsKey = superFeatureMap.containsKey(_name);
        if (_containsKey) {
          this.error("Supertype contains same feature name", payload, MobaPackage.Literals.MOBA_DTO__FEATURES, index);
        }
        String _name_1 = feature.getName();
        boolean _contains = currentFeatures.contains(_name_1);
        if (_contains) {
          this.error("Feature name must be unique", payload, MobaPackage.Literals.MOBA_DTO__FEATURES, index);
        }
        String _name_2 = feature.getName();
        currentFeatures.add(_name_2);
        index++;
      }
    }
  }
  
  @Check
  public void checkDuplicateFeatureName(final MobaQueue queue) {
    Map<String, MobaQueueFeature> _xifexpression = null;
    MobaQueue _superType = queue.getSuperType();
    boolean _notEquals = (!Objects.equal(_superType, null));
    if (_notEquals) {
      Map<String, MobaQueueFeature> _xtrycatchfinallyexpression = null;
      try {
        MobaQueue _superType_1 = queue.getSuperType();
        List<MobaQueueFeature> _allFeatures = _superType_1.getAllFeatures();
        final Function1<MobaQueueFeature, String> _function = (MobaQueueFeature it) -> {
          return it.getName();
        };
        _xtrycatchfinallyexpression = IterableExtensions.<String, MobaQueueFeature>toMap(_allFeatures, _function);
      } catch (final Throwable _t) {
        if (_t instanceof RecursionException) {
          final RecursionException ex = (RecursionException)_t;
          _xtrycatchfinallyexpression = Collections.<String, MobaQueueFeature>emptyMap();
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xifexpression = _xtrycatchfinallyexpression;
    } else {
      _xifexpression = Collections.<String, MobaQueueFeature>emptyMap();
    }
    final Map<String, MobaQueueFeature> superFeatureMap = _xifexpression;
    final Set<String> currentFeatures = CollectionLiterals.<String>newHashSet();
    int index = 0;
    EList<MobaQueueFeature> _features = queue.getFeatures();
    for (final MobaQueueFeature feature : _features) {
      {
        String _name = feature.getName();
        boolean _containsKey = superFeatureMap.containsKey(_name);
        if (_containsKey) {
          this.error("Supertype contains same feature name", queue, MobaPackage.Literals.MOBA_QUEUE__FEATURES, index);
        }
        String _name_1 = feature.getName();
        boolean _contains = currentFeatures.contains(_name_1);
        if (_contains) {
          this.error("Feature name must be unique", queue, MobaPackage.Literals.MOBA_QUEUE__FEATURES, index);
        }
        String _name_2 = feature.getName();
        currentFeatures.add(_name_2);
        index++;
      }
    }
  }
  
  @Check
  public void checkDuplicateFeatureName(final MobaApplication application) {
    final Set<String> tempConstFeatures = CollectionLiterals.<String>newHashSet();
    final Set<String> tempDtFeatures = CollectionLiterals.<String>newHashSet();
    final Set<String> tempDataFeatures = CollectionLiterals.<String>newHashSet();
    final Set<String> tempServiceFeatures = CollectionLiterals.<String>newHashSet();
    final Set<String> tempSettingsFeatures = CollectionLiterals.<String>newHashSet();
    int index = 0;
    EList<MobaApplicationFeature> _features = application.getFeatures();
    for (final MobaApplicationFeature feature : _features) {
      {
        boolean _matched = false;
        if (!_matched) {
          if (feature instanceof MobaConstant) {
            _matched=true;
            String _name = ((MobaConstant)feature).getName();
            boolean _contains = tempConstFeatures.contains(_name);
            if (_contains) {
              this.error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            }
            String _name_1 = ((MobaConstant)feature).getName();
            tempConstFeatures.add(_name_1);
          }
        }
        if (!_matched) {
          if (feature instanceof MobaDataType) {
            _matched=true;
            String _name = ((MobaDataType)feature).getName();
            boolean _contains = tempDtFeatures.contains(_name);
            if (_contains) {
              this.error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            }
            String _name_1 = ((MobaDataType)feature).getName();
            tempDtFeatures.add(_name_1);
          }
        }
        if (!_matched) {
          if (feature instanceof MobaEntity) {
            _matched=true;
            String _name = ((MobaEntity)feature).getName();
            boolean _contains = tempDataFeatures.contains(_name);
            if (_contains) {
              this.error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            }
            String _name_1 = ((MobaEntity)feature).getName();
            tempDataFeatures.add(_name_1);
          }
        }
        if (!_matched) {
          if (feature instanceof MobaDto) {
            _matched=true;
            String _name = ((MobaDto)feature).getName();
            boolean _contains = tempDataFeatures.contains(_name);
            if (_contains) {
              this.error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            }
            String _name_1 = ((MobaDto)feature).getName();
            tempDataFeatures.add(_name_1);
          }
        }
        if (!_matched) {
          if (feature instanceof MobaQueue) {
            _matched=true;
            String _name = ((MobaQueue)feature).getName();
            boolean _contains = tempDataFeatures.contains(_name);
            if (_contains) {
              this.error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            }
            String _name_1 = ((MobaQueue)feature).getName();
            tempDataFeatures.add(_name_1);
          }
        }
        if (!_matched) {
          if (feature instanceof MobaSettings) {
            _matched=true;
            String _name = ((MobaSettings)feature).getName();
            boolean _contains = tempSettingsFeatures.contains(_name);
            if (_contains) {
              this.error("Feature name must be unique", application, 
                MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            }
            String _name_1 = ((MobaSettings)feature).getName();
            tempSettingsFeatures.add(_name_1);
          }
        }
        if (!_matched) {
          if (feature instanceof MobaRESTCustomService) {
            _matched=true;
            String _name = ((MobaRESTCustomService)feature).getName();
            boolean _contains = tempServiceFeatures.contains(_name);
            if (_contains) {
              this.error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            }
            String _name_1 = ((MobaRESTCustomService)feature).getName();
            tempServiceFeatures.add(_name_1);
          }
        }
        if (!_matched) {
          if (feature instanceof MobaRESTCrud) {
            _matched=true;
            String _name = ((MobaRESTCrud)feature).getName();
            boolean _contains = tempServiceFeatures.contains(_name);
            if (_contains) {
              this.error("Name must be unique", application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            }
            String _name_1 = ((MobaRESTCrud)feature).getName();
            tempServiceFeatures.add(_name_1);
          }
        }
        index++;
      }
    }
  }
  
  @Check
  public void checkSuperType(final MobaEntity dto) {
    MobaEntity _superType = dto.getSuperType();
    boolean _equals = Objects.equal(_superType, null);
    if (_equals) {
      return;
    }
    try {
      dto.getAllSuperTypes();
    } catch (final Throwable _t) {
      if (_t instanceof RecursionException) {
        final RecursionException ex = (RecursionException)_t;
        EObject _source = ex.getSource();
        final MobaEntity source = ((MobaEntity) _source);
        EObject _superType_1 = ex.getSuperType();
        final MobaEntity superType = ((MobaEntity) _superType_1);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Recursive supertypes for ");
        String _name = source.getName();
        _builder.append(_name, "");
        _builder.append(" --> ");
        String _name_1 = superType.getName();
        _builder.append(_name_1, "");
        this.error(_builder.toString(), dto, 
          MobaPackage.Literals.MOBA_ENTITY__SUPER_TYPE);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Check
  public void checkSuperType(final MobaDto payload) {
    MobaDto _superType = payload.getSuperType();
    boolean _equals = Objects.equal(_superType, null);
    if (_equals) {
      return;
    }
    try {
      payload.getAllSuperTypes();
    } catch (final Throwable _t) {
      if (_t instanceof RecursionException) {
        final RecursionException ex = (RecursionException)_t;
        EObject _source = ex.getSource();
        final MobaDto source = ((MobaDto) _source);
        EObject _superType_1 = ex.getSuperType();
        final MobaDto superType = ((MobaDto) _superType_1);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Recursive supertypes for ");
        String _name = source.getName();
        _builder.append(_name, "");
        _builder.append(" --> ");
        String _name_1 = superType.getName();
        _builder.append(_name_1, "");
        this.error(_builder.toString(), payload, 
          MobaPackage.Literals.MOBA_DTO__SUPER_TYPE);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Check
  public void checkSuperType(final MobaQueue queue) {
    MobaQueue _superType = queue.getSuperType();
    boolean _equals = Objects.equal(_superType, null);
    if (_equals) {
      return;
    }
    try {
      queue.getAllSuperTypes();
    } catch (final Throwable _t) {
      if (_t instanceof RecursionException) {
        final RecursionException ex = (RecursionException)_t;
        EObject _source = ex.getSource();
        final MobaQueue source = ((MobaQueue) _source);
        EObject _superType_1 = ex.getSuperType();
        final MobaQueue superType = ((MobaQueue) _superType_1);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Recursive supertypes for ");
        String _name = source.getName();
        _builder.append(_name, "");
        _builder.append(" --> ");
        String _name_1 = superType.getName();
        _builder.append(_name_1, "");
        this.error(_builder.toString(), queue, 
          MobaPackage.Literals.MOBA_QUEUE__SUPER_TYPE);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Check
  public void checkSettings(final MobaApplication application) {
    boolean activeFound = false;
    int firstIndex = (-1);
    List<MobaSettings> _settings = application.getSettings();
    int _size = _settings.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      List<MobaSettings> _settings_1 = application.getSettings();
      for (final MobaSettings setting : _settings_1) {
        {
          if ((firstIndex == (-1))) {
            EList<MobaApplicationFeature> _features = application.getFeatures();
            int _indexOf = _features.indexOf(setting);
            firstIndex = _indexOf;
          }
          boolean _and = false;
          if (!activeFound) {
            _and = false;
          } else {
            boolean _isActive = setting.isActive();
            _and = _isActive;
          }
          if (_and) {
            EList<MobaApplicationFeature> _features_1 = application.getFeatures();
            final int index = _features_1.indexOf(setting);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("You are using multiple settings. Please define the active attribute for ONLY one setting.");
            this.error(_builder.toString(), application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            return;
          }
          if ((!activeFound)) {
            boolean _isActive_1 = setting.isActive();
            activeFound = _isActive_1;
          }
        }
      }
      if ((!activeFound)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("You are using multiple settings. Please define the #active attribute for one setting.");
        this.error(_builder.toString(), application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, firstIndex);
      }
    }
  }
  
  @Check
  public void checkGenerators(final MobaApplication application) {
    boolean activeFound = false;
    int firstIndex = (-1);
    List<MobaGenerator> _generators = application.getGenerators();
    int _size = _generators.size();
    boolean _greaterThan = (_size > 1);
    if (_greaterThan) {
      List<MobaGenerator> _generators_1 = application.getGenerators();
      for (final MobaGenerator generator : _generators_1) {
        {
          if ((firstIndex == (-1))) {
            EList<MobaApplicationFeature> _features = application.getFeatures();
            int _indexOf = _features.indexOf(generator);
            firstIndex = _indexOf;
          }
          boolean _and = false;
          if (!activeFound) {
            _and = false;
          } else {
            boolean _isActive = generator.isActive();
            _and = _isActive;
          }
          if (_and) {
            EList<MobaApplicationFeature> _features_1 = application.getFeatures();
            final int index = _features_1.indexOf(generator);
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("You are using multiple generators. Please define the active attribute for ONLY one generator.");
            this.error(_builder.toString(), application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, index);
            return;
          }
          if ((!activeFound)) {
            boolean _isActive_1 = generator.isActive();
            activeFound = _isActive_1;
          }
        }
      }
      if ((!activeFound)) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("You are using multiple generators. Please define the #active attribute for one generator.");
        this.error(_builder.toString(), application, MobaPackage.Literals.MOBA_APPLICATION__FEATURES, firstIndex);
      }
    }
  }
  
  @Check
  public void checkEnumExtendsNotEnum(final MobaDataType datatype) {
    final MobaDataType superType = datatype.getSuperType();
    boolean _or = false;
    boolean _isEnum = datatype.isEnum();
    boolean _not = (!_isEnum);
    if (_not) {
      _or = true;
    } else {
      boolean _equals = Objects.equal(superType, null);
      _or = _equals;
    }
    if (_or) {
      return;
    }
    boolean _isEnum_1 = superType.isEnum();
    boolean _not_1 = (!_isEnum_1);
    if (_not_1) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("SuperType ");
      String _name = superType.getName();
      _builder.append(_name, "");
      _builder.append(" is not an Enum");
      this.error(_builder.toString(), datatype, 
        MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST);
    }
  }
  
  @Check
  public void checkEnumExtendsDuplicates(final MobaDataType datatype) {
    final MobaDataType superType = datatype.getSuperType();
    boolean _or = false;
    boolean _isEnum = datatype.isEnum();
    boolean _not = (!_isEnum);
    if (_not) {
      _or = true;
    } else {
      boolean _equals = Objects.equal(superType, null);
      _or = _equals;
    }
    if (_or) {
      return;
    }
    final HashSet<String> names = CollectionLiterals.<String>newHashSet();
    final HashSet<String> literals = CollectionLiterals.<String>newHashSet();
    final HashSet<Integer> values = CollectionLiterals.<Integer>newHashSet();
    MobaEnum _enumAST = superType.getEnumAST();
    List<MobaEnumLiteral> _allLiterals = _enumAST.getAllLiterals();
    final Consumer<MobaEnumLiteral> _function = (MobaEnumLiteral it) -> {
      String _name = it.getName();
      names.add(_name);
      String _literal = it.getLiteral();
      literals.add(_literal);
      int _value = it.getValue();
      values.add(Integer.valueOf(_value));
    };
    _allLiterals.forEach(_function);
    MobaEnum _enumAST_1 = datatype.getEnumAST();
    EList<MobaEnumLiteral> _literals = _enumAST_1.getLiterals();
    final Consumer<MobaEnumLiteral> _function_1 = (MobaEnumLiteral it) -> {
      String _name = it.getName();
      boolean _contains = names.contains(_name);
      if (_contains) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Duplicate name \"");
        String _name_1 = it.getName();
        _builder.append(_name_1, "");
        _builder.append(".\" Check super type.");
        this.error(_builder.toString(), datatype, 
          MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST);
      }
      String _literal = it.getLiteral();
      boolean _contains_1 = literals.contains(_literal);
      if (_contains_1) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Duplicate literal \"");
        String _literal_1 = it.getLiteral();
        _builder_1.append(_literal_1, "");
        _builder_1.append(".\" Check super type.");
        this.error(_builder_1.toString(), datatype, 
          MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST);
      }
      int _value = it.getValue();
      boolean _contains_2 = values.contains(Integer.valueOf(_value));
      if (_contains_2) {
        StringConcatenation _builder_2 = new StringConcatenation();
        _builder_2.append("You are redefinging enum literal with value\"");
        int _value_1 = it.getValue();
        _builder_2.append(_value_1, "");
        _builder_2.append(".\" Check super type.");
        this.warning(_builder_2.toString(), datatype, 
          MobaPackage.Literals.MOBA_DATA_TYPE__ENUM_AST);
      }
    };
    _literals.forEach(_function_1);
  }
  
  @Check
  public void checkEnumDuplicateLiterals(final MobaEnum enumx) {
    final HashSet<String> names = CollectionLiterals.<String>newHashSet();
    final HashSet<String> literals = CollectionLiterals.<String>newHashSet();
    final HashSet<Integer> values = CollectionLiterals.<Integer>newHashSet();
    MobaEnumLiteral defaultLit = null;
    MobaEnumLiteral undefinedLit = null;
    int index = 0;
    EList<MobaEnumLiteral> _literals = enumx.getLiterals();
    for (final MobaEnumLiteral literal : _literals) {
      {
        boolean _and = false;
        boolean _notEquals = (!Objects.equal(defaultLit, null));
        if (!_notEquals) {
          _and = false;
        } else {
          boolean _isDefault = literal.isDefault();
          _and = _isDefault;
        }
        if (_and) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Only one \"default literal\" allowed");
          this.error(_builder.toString(), literal, 
            MobaPackage.Literals.MOBA_ENUM_LITERAL__DEFAULT);
        }
        boolean _and_1 = false;
        boolean _notEquals_1 = (!Objects.equal(undefinedLit, null));
        if (!_notEquals_1) {
          _and_1 = false;
        } else {
          boolean _isUndefined = literal.isUndefined();
          _and_1 = _isUndefined;
        }
        if (_and_1) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Only one \"undefined literal\" allowed");
          this.error(_builder_1.toString(), literal, 
            MobaPackage.Literals.MOBA_ENUM_LITERAL__UNDEFINED);
        }
        boolean _and_2 = false;
        boolean _equals = Objects.equal(defaultLit, null);
        if (!_equals) {
          _and_2 = false;
        } else {
          boolean _isDefault_1 = literal.isDefault();
          _and_2 = _isDefault_1;
        }
        if (_and_2) {
          defaultLit = literal;
        }
        boolean _and_3 = false;
        boolean _equals_1 = Objects.equal(undefinedLit, null);
        if (!_equals_1) {
          _and_3 = false;
        } else {
          boolean _isUndefined_1 = literal.isUndefined();
          _and_3 = _isUndefined_1;
        }
        if (_and_3) {
          undefinedLit = literal;
        }
        String _name = literal.getName();
        boolean _contains = names.contains(_name);
        if (_contains) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("Duplicate name \"");
          String _name_1 = literal.getName();
          _builder_2.append(_name_1, "");
          _builder_2.append(".\"");
          this.error(_builder_2.toString(), enumx, MobaPackage.Literals.MOBA_ENUM__LITERALS, index);
        }
        String _literal = literal.getLiteral();
        boolean _contains_1 = literals.contains(_literal);
        if (_contains_1) {
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("Duplicate literal \"");
          String _literal_1 = literal.getLiteral();
          _builder_3.append(_literal_1, "");
          _builder_3.append(".\"");
          this.error(_builder_3.toString(), enumx, MobaPackage.Literals.MOBA_ENUM__LITERALS, index);
        }
        int _value = literal.getValue();
        boolean _contains_2 = values.contains(Integer.valueOf(_value));
        if (_contains_2) {
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("Duplicate value \"");
          int _value_1 = literal.getValue();
          _builder_4.append(_value_1, "");
          _builder_4.append(".\"");
          this.error(_builder_4.toString(), enumx, MobaPackage.Literals.MOBA_ENUM__LITERALS, index);
        }
        index++;
        String _name_2 = literal.getName();
        names.add(_name_2);
        String _literal_2 = literal.getLiteral();
        literals.add(_literal_2);
        int _value_2 = literal.getValue();
        values.add(Integer.valueOf(_value_2));
      }
    }
  }
  
  @Check
  public void checkDownloadTemplate(final MobaTemplate template) {
    boolean _and = false;
    String _downloadTemplate = template.getDownloadTemplate();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_downloadTemplate);
    boolean _not = (!_isNullOrEmpty);
    if (!_not) {
      _and = false;
    } else {
      String _downloadTemplate_1 = template.getDownloadTemplate();
      boolean _startsWith = _downloadTemplate_1.startsWith("index://");
      _and = _startsWith;
    }
    if (_and) {
      this.error("You need to download the template using the quickfix.", template, 
        MobaPackage.Literals.MOBA_TEMPLATE__DOWNLOAD_TEMPLATE, MobaValidator.DOWNLOAD_TEMPLATE, null);
    }
  }
  
  @Check
  public void checkGeneratorIds(final MobaGenerator generator) {
    boolean foundWarning = false;
    int index = (-1);
    final EList<MobaGeneratorFeature> features = generator.getFeatures();
    final Function1<MobaGeneratorFeature, Boolean> _function = (MobaGeneratorFeature it) -> {
      return Boolean.valueOf((it instanceof MobaGeneratorIDFeature));
    };
    Iterable<MobaGeneratorFeature> _filter = IterableExtensions.<MobaGeneratorFeature>filter(features, _function);
    final Function1<MobaGeneratorFeature, String> _function_1 = (MobaGeneratorFeature it) -> {
      return it.getGeneratorVersionedId();
    };
    Iterable<String> _map = IterableExtensions.<MobaGeneratorFeature, String>map(_filter, _function_1);
    List<String> _list = IterableExtensions.<String>toList(_map);
    final Map<String, ExtensionGeneratorDelegate.Metadata> generatorMap = this.generatorDelegate.readExtentionsMetadata(this.grammarName, _list);
    EList<MobaGeneratorFeature> _features = generator.getFeatures();
    for (final MobaGeneratorFeature feature : _features) {
      {
        index++;
        if ((feature instanceof MobaGeneratorIDFeature)) {
          String _generatorVersionedId = ((MobaGeneratorIDFeature)feature).getGeneratorVersionedId();
          boolean _containsKey = generatorMap.containsKey(_generatorVersionedId);
          boolean _not = (!_containsKey);
          if (_not) {
            foundWarning = true;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("For GeneratorID ");
            String _generatorVersionedId_1 = ((MobaGeneratorIDFeature)feature).getGeneratorVersionedId();
            _builder.append(_generatorVersionedId_1, "");
            _builder.append(" is not Generator-Extensions registered. Please check template...");
            this.warning(_builder.toString(), generator, MobaPackage.Literals.MOBA_GENERATOR__FEATURES, index);
          }
        }
      }
    }
    if ((!foundWarning)) {
      List<String> _allGeneratorVersionedIds = generator.getAllGeneratorVersionedIds();
      final Map<String, ExtensionGeneratorDelegate.Metadata> allGeneratorMap = this.generatorDelegate.readExtentionsMetadata(this.grammarName, _allGeneratorVersionedIds);
      List<String> _allGeneratorVersionedIds_1 = generator.getAllGeneratorVersionedIds();
      for (final String id : _allGeneratorVersionedIds_1) {
        {
          index++;
          boolean _containsKey = allGeneratorMap.containsKey(id);
          boolean _not = (!_containsKey);
          if (_not) {
            foundWarning = true;
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("A mixin uses the GeneratorID ");
            _builder.append(id, "");
            _builder.append(" and there is no Generator-Extensions registered. Please check template...");
            this.warning(_builder.toString(), generator, MobaPackage.Literals.MOBA_GENERATOR__NAME);
          }
        }
      }
    }
  }
  
  @Check
  public void checkConstantUppercase(final MobaConstantValue value) {
    String _valueString = value.getValueString();
    boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_valueString);
    boolean _not = (!_isNullOrEmpty);
    if (_not) {
      MobaConstant _valueConst = value.getValueConst();
      boolean _notEquals = (!Objects.equal(_valueConst, null));
      if (_notEquals) {
        MobaConstant _valueConst_1 = value.getValueConst();
        String _value = _valueConst_1.getValue();
        String _upperCase = _value.toUpperCase();
        MobaConstant _valueConst_2 = value.getValueConst();
        String _value_1 = _valueConst_2.getValue();
        boolean _equals = _upperCase.equals(_value_1);
        boolean _not_1 = (!_equals);
        if (_not_1) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Constant values need to be upper case!");
          this.error(_builder.toString(), value, 
            MobaPackage.Literals.MOBA_CONSTANT_VALUE__VALUE_CONST);
        }
      }
    }
  }
  
  @Check
  public Object checkRestAttributeAssignment(final MobaRESTAttribute att) {
    Object _xblockexpression = null;
    {
      final MobaDataType dt = att.getType();
      final String value = att.getValue();
      EStructuralFeature _xifexpression = null;
      MobaConstant _valueConst = att.getValueConst();
      boolean _notEquals = (!Objects.equal(_valueConst, null));
      if (_notEquals) {
        _xifexpression = MobaPackage.Literals.MOBA_REST_ATTRIBUTE__VALUE_CONST;
      } else {
        _xifexpression = MobaPackage.Literals.MOBA_REST_ATTRIBUTE__VALUE_STRING;
      }
      final EStructuralFeature eAtt = _xifexpression;
      Object _xifexpression_1 = null;
      boolean _isArray = dt.isArray();
      if (_isArray) {
        String _value = att.getValue();
        boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_value);
        boolean _not = (!_isNullOrEmpty);
        if (_not) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Array datatypes must not be assigned a value to.");
          this.error(_builder.toString(), att, eAtt);
        }
      } else {
        Object _xifexpression_2 = null;
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
          Date _xblockexpression_1 = null;
          {
            SimpleDateFormat _xifexpression_3 = null;
            String _dateFormat = dt.getDateFormat();
            boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_dateFormat);
            boolean _not_1 = (!_isNullOrEmpty_1);
            if (_not_1) {
              String _dateFormat_1 = dt.getDateFormat();
              _xifexpression_3 = new SimpleDateFormat(_dateFormat_1);
            } else {
              _xifexpression_3 = new SimpleDateFormat();
            }
            final SimpleDateFormat df = _xifexpression_3;
            Date _xtrycatchfinallyexpression = null;
            try {
              _xtrycatchfinallyexpression = df.parse(value);
            } catch (final Throwable _t) {
              if (_t instanceof ParseException) {
                final ParseException ex = (ParseException)_t;
                StringConcatenation _builder_1 = new StringConcatenation();
                _builder_1.append("Value ");
                _builder_1.append(value, "");
                _builder_1.append(" is not a valid date using dateformat ");
                String _pattern = df.toPattern();
                _builder_1.append(_pattern, "");
                _builder_1.append("!");
                this.error(_builder_1.toString(), att, eAtt);
              } else {
                throw Exceptions.sneakyThrow(_t);
              }
            }
            _xblockexpression_1 = _xtrycatchfinallyexpression;
          }
          _xifexpression_2 = _xblockexpression_1;
        } else {
          Number _xifexpression_3 = null;
          boolean _isEnum = dt.isEnum();
          if (_isEnum) {
            String _value_1 = att.getValue();
            boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_value_1);
            boolean _not_1 = (!_isNullOrEmpty_1);
            if (_not_1) {
              StringConcatenation _builder_1 = new StringConcatenation();
              _builder_1.append("Enum datatypes must not be assigned a value to.");
              this.error(_builder_1.toString(), att, eAtt);
            }
          } else {
            Number _xifexpression_4 = null;
            boolean _isEnum_1 = dt.isEnum();
            if (_isEnum_1) {
              String _value_2 = att.getValue();
              boolean _isNullOrEmpty_2 = StringExtensions.isNullOrEmpty(_value_2);
              boolean _not_2 = (!_isNullOrEmpty_2);
              if (_not_2) {
                StringConcatenation _builder_2 = new StringConcatenation();
                _builder_2.append("Enum datatypes must not be assigned a value to.");
                this.error(_builder_2.toString(), att, eAtt);
              }
            } else {
              Number _xifexpression_5 = null;
              boolean _isNumeric = dt.isNumeric();
              if (_isNumeric) {
                Integer _xifexpression_6 = null;
                ValueType _valueType = att.getValueType();
                boolean _notEquals_1 = (!Objects.equal(_valueType, ValueType.NUMERIC));
                if (_notEquals_1) {
                  Integer _xifexpression_7 = null;
                  boolean _or_2 = false;
                  ValueType _valueType_1 = att.getValueType();
                  boolean _equals = Objects.equal(_valueType_1, ValueType.CONSTANT);
                  if (_equals) {
                    _or_2 = true;
                  } else {
                    ValueType _valueType_2 = att.getValueType();
                    boolean _equals_1 = Objects.equal(_valueType_2, ValueType.STRING);
                    _or_2 = _equals_1;
                  }
                  if (_or_2) {
                    Integer _xtrycatchfinallyexpression = null;
                    try {
                      String _value_3 = att.getValue();
                      _xtrycatchfinallyexpression = Integer.valueOf(_value_3);
                    } catch (final Throwable _t) {
                      if (_t instanceof NumberFormatException) {
                        final NumberFormatException ex = (NumberFormatException)_t;
                        StringConcatenation _builder_3 = new StringConcatenation();
                        _builder_3.append("Value ");
                        _builder_3.append(value, "");
                        _builder_3.append(" is not a valid numeric!");
                        this.error(_builder_3.toString(), att, eAtt);
                      } else {
                        throw Exceptions.sneakyThrow(_t);
                      }
                    }
                    _xifexpression_7 = _xtrycatchfinallyexpression;
                  } else {
                    StringConcatenation _builder_4 = new StringConcatenation();
                    _builder_4.append("Can not assign ");
                    ValueType _valueType_3 = att.getValueType();
                    _builder_4.append(_valueType_3, "");
                    _builder_4.append(" to numeric datatype!");
                    this.error(_builder_4.toString(), att, eAtt);
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              } else {
                Double _xifexpression_8 = null;
                boolean _isDecimal = dt.isDecimal();
                if (_isDecimal) {
                  Double _xifexpression_9 = null;
                  boolean _and = false;
                  ValueType _valueType_4 = att.getValueType();
                  boolean _notEquals_2 = (!Objects.equal(_valueType_4, ValueType.NUMERIC));
                  if (!_notEquals_2) {
                    _and = false;
                  } else {
                    ValueType _valueType_5 = att.getValueType();
                    boolean _notEquals_3 = (!Objects.equal(_valueType_5, ValueType.DECIMAL));
                    _and = _notEquals_3;
                  }
                  if (_and) {
                    Double _xifexpression_10 = null;
                    boolean _or_3 = false;
                    ValueType _valueType_6 = att.getValueType();
                    boolean _equals_2 = Objects.equal(_valueType_6, ValueType.CONSTANT);
                    if (_equals_2) {
                      _or_3 = true;
                    } else {
                      ValueType _valueType_7 = att.getValueType();
                      boolean _equals_3 = Objects.equal(_valueType_7, ValueType.STRING);
                      _or_3 = _equals_3;
                    }
                    if (_or_3) {
                      Double _xtrycatchfinallyexpression_1 = null;
                      try {
                        String _value_4 = att.getValue();
                        _xtrycatchfinallyexpression_1 = Double.valueOf(_value_4);
                      } catch (final Throwable _t_1) {
                        if (_t_1 instanceof NumberFormatException) {
                          final NumberFormatException ex_1 = (NumberFormatException)_t_1;
                          StringConcatenation _builder_5 = new StringConcatenation();
                          _builder_5.append("Value ");
                          _builder_5.append(value, "");
                          _builder_5.append(" is not a valid decimal!");
                          this.error(_builder_5.toString(), att, eAtt);
                        } else {
                          throw Exceptions.sneakyThrow(_t_1);
                        }
                      }
                      _xifexpression_10 = _xtrycatchfinallyexpression_1;
                    } else {
                      StringConcatenation _builder_6 = new StringConcatenation();
                      _builder_6.append("Can not assign ");
                      ValueType _valueType_8 = att.getValueType();
                      _builder_6.append(_valueType_8, "");
                      _builder_6.append(" to decimal datatype!");
                      this.error(_builder_6.toString(), att, eAtt);
                    }
                    _xifexpression_9 = _xifexpression_10;
                  }
                  _xifexpression_8 = _xifexpression_9;
                }
                _xifexpression_5 = _xifexpression_8;
              }
              _xifexpression_4 = ((Number)_xifexpression_5);
            }
            _xifexpression_3 = ((Number)_xifexpression_4);
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = ((Object)_xifexpression_2);
      }
      _xblockexpression = ((Object)_xifexpression_1);
    }
    return _xblockexpression;
  }
  
  @Check
  public void checkServerURL(final MobaServer server) {
    final String urlValue = server.getURL();
    try {
      new URL(urlValue);
    } catch (final Throwable _t) {
      if (_t instanceof MalformedURLException) {
        final MalformedURLException ex = (MalformedURLException)_t;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("The url ");
        _builder.append(urlValue, "");
        _builder.append(" is not a valid URL. You need to redefine it by a sub instance of server ");
        String _name = server.getName();
        _builder.append(_name, "");
        this.warning(_builder.toString(), server, MobaPackage.Literals.MOBA_SERVER__NAME);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  @Check
  public void checkOpposite(final MobaEntityReference ref) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _isCascading = ref.isCascading();
    if (!_isCascading) {
      _and_1 = false;
    } else {
      MobaMuliplicity _multiplicity = ref.getMultiplicity();
      Bounds _bounds = _multiplicity.getBounds();
      boolean _isToMany = _bounds.isToMany();
      _and_1 = _isToMany;
    }
    if (!_and_1) {
      _and = false;
    } else {
      MobaEntityReference _opposite = ref.getOpposite();
      boolean _equals = Objects.equal(_opposite, null);
      _and = _equals;
    }
    if (_and) {
      this.error("Opposite reference must be set for cascading 0-* references", ref, 
        MobaPackage.Literals.MOBA_ENTITY_REFERENCE__OPPOSITE);
    }
    boolean _and_2 = false;
    MobaEntityReference _opposite_1 = ref.getOpposite();
    boolean _notEquals = (!Objects.equal(_opposite_1, null));
    if (!_notEquals) {
      _and_2 = false;
    } else {
      MobaEntityReference _opposite_2 = ref.getOpposite();
      MobaEntityReference _opposite_3 = _opposite_2.getOpposite();
      boolean _equals_1 = Objects.equal(_opposite_3, null);
      _and_2 = _equals_1;
    }
    if (_and_2) {
      this.error("Opposite references must be defined on both sides", ref, 
        MobaPackage.Literals.MOBA_ENTITY_REFERENCE__OPPOSITE);
    }
  }
  
  @Check
  public void checkOpposite(final MobaDtoReference ref) {
    boolean _and = false;
    boolean _and_1 = false;
    boolean _isCascading = ref.isCascading();
    if (!_isCascading) {
      _and_1 = false;
    } else {
      MobaMuliplicity _multiplicity = ref.getMultiplicity();
      Bounds _bounds = _multiplicity.getBounds();
      boolean _isToMany = _bounds.isToMany();
      _and_1 = _isToMany;
    }
    if (!_and_1) {
      _and = false;
    } else {
      MobaDtoReference _opposite = ref.getOpposite();
      boolean _equals = Objects.equal(_opposite, null);
      _and = _equals;
    }
    if (_and) {
      this.error("Opposite reference must be set for cascading 0-* references", ref, 
        MobaPackage.Literals.MOBA_DTO_REFERENCE__OPPOSITE);
    }
    boolean _and_2 = false;
    MobaDtoReference _opposite_1 = ref.getOpposite();
    boolean _notEquals = (!Objects.equal(_opposite_1, null));
    if (!_notEquals) {
      _and_2 = false;
    } else {
      MobaDtoReference _opposite_2 = ref.getOpposite();
      MobaDtoReference _opposite_3 = _opposite_2.getOpposite();
      boolean _equals_1 = Objects.equal(_opposite_3, null);
      _and_2 = _equals_1;
    }
    if (_and_2) {
      this.error("Opposite references must be defined on both sides", ref, 
        MobaPackage.Literals.MOBA_DTO_REFERENCE__OPPOSITE);
    }
  }
  
  @Check
  public void checkCacheInterval(final MobaCache cache) {
    boolean _and = false;
    MobaConstant _cacheIntervalConst = cache.getCacheIntervalConst();
    boolean _notEquals = (!Objects.equal(_cacheIntervalConst, null));
    if (!_notEquals) {
      _and = false;
    } else {
      MobaConstant _cacheIntervalConst_1 = cache.getCacheIntervalConst();
      MobaConstantValue _valueAST = _cacheIntervalConst_1.getValueAST();
      ValueType _valueType = _valueAST.getValueType();
      boolean _notEquals_1 = (!Objects.equal(_valueType, ValueType.NUMERIC));
      _and = _notEquals_1;
    }
    if (_and) {
      this.error("The constant for interval needs to be a numeric type constant.", cache, 
        MobaPackage.Literals.MOBA_CACHE__CACHE_INTERVAL_CONST);
    }
  }
}
