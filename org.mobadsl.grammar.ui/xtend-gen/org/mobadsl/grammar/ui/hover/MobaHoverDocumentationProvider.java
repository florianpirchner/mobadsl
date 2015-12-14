package org.mobadsl.grammar.ui.hover;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.name.Named;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.mobadsl.grammar.generator.ExtensionGeneratorDelegate;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaConstantValue;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;
import org.mobadsl.semantic.model.moba.ValueType;

@SuppressWarnings("all")
public class MobaHoverDocumentationProvider extends MultiLineCommentDocumentationProvider {
  @Inject
  private ExtensionGeneratorDelegate generatorDelegate;
  
  @Inject
  @Named(Constants.LANGUAGE_NAME)
  private String grammarName;
  
  @Override
  public String getDocumentation(final EObject o) {
    final String returnValue = this.findComment(o);
    String extendedValue = "";
    boolean _notEquals = (!Objects.equal(returnValue, null));
    if (_notEquals) {
      String _textFromMultilineComment = this.getTextFromMultilineComment(returnValue);
      extendedValue = _textFromMultilineComment;
    }
    final String resultValue = this.getDocu(o, extendedValue);
    return resultValue;
  }
  
  protected String _getDocu(final EObject object, final String value) {
    return value;
  }
  
  protected String _getDocu(final MobaConstant object, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>@value = <code>");
    String _value = object.getValue();
    _builder.append(_value, "");
    _builder.append("</code><br>");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("@valueType = ");
    ValueType _xifexpression = null;
    boolean _and = false;
    MobaConstantValue _valueAST = object.getValueAST();
    boolean _notEquals = (!Objects.equal(_valueAST, null));
    if (!_notEquals) {
      _and = false;
    } else {
      MobaConstantValue _valueAST_1 = object.getValueAST();
      MobaConstantValue _tail = _valueAST_1.getTail();
      boolean _equals = Objects.equal(_tail, null);
      _and = _equals;
    }
    if (_and) {
      MobaConstantValue _valueAST_2 = object.getValueAST();
      _xifexpression = _valueAST_2.getValueType();
    } else {
      _xifexpression = ValueType.STRING;
    }
    _builder.append(_xifexpression, "\t\t");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("</p>");
    return (value + _builder);
  }
  
  protected String _getDocu(final MobaApplication object, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>@verson = <code>");
    String _version = object.getVersion();
    _builder.append(_version, "");
    _builder.append("</code></p>");
    return (value + _builder);
  }
  
  protected String _getDocu(final MobaGenerator object, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<b><i>Used Generators:</i></b><br>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<ul>");
    _builder.newLine();
    {
      List<MobaGeneratorIDFeature> _allGeneratorIdFeatures = object.getAllGeneratorIdFeatures();
      for(final MobaGeneratorIDFeature feature : _allGeneratorIdFeatures) {
        _builder.append("\t\t");
        _builder.append("<li>");
        String _docu = this.toDocu(feature);
        _builder.append(_docu, "\t\t");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    _builder.append("</ul>");
    _builder.newLine();
    return (value + _builder);
  }
  
  protected String _getDocu(final MobaDataType object, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t");
    {
      boolean _and = false;
      String _dateFormat = object.getDateFormat();
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_dateFormat);
      boolean _not = (!_isNullOrEmpty);
      if (!_not) {
        _and = false;
      } else {
        boolean _or = false;
        boolean _or_1 = false;
        boolean _isDate = object.isDate();
        if (_isDate) {
          _or_1 = true;
        } else {
          boolean _isTime = object.isTime();
          _or_1 = _isTime;
        }
        if (_or_1) {
          _or = true;
        } else {
          boolean _isTimestamp = object.isTimestamp();
          _or = _isTimestamp;
        }
        _and = _or;
      }
      if (_and) {
        _builder.append("@dateformat = ");
        String _dateFormat_1 = object.getDateFormat();
        _builder.append(_dateFormat_1, "\t\t");
        _builder.append("</br>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      boolean _and_1 = false;
      String _dateFormat_2 = object.getDateFormat();
      boolean _isNullOrEmpty_1 = StringExtensions.isNullOrEmpty(_dateFormat_2);
      if (!_isNullOrEmpty_1) {
        _and_1 = false;
      } else {
        boolean _or_2 = false;
        boolean _or_3 = false;
        boolean _isDate_1 = object.isDate();
        if (_isDate_1) {
          _or_3 = true;
        } else {
          boolean _isTime_1 = object.isTime();
          _or_3 = _isTime_1;
        }
        if (_or_3) {
          _or_2 = true;
        } else {
          boolean _isTimestamp_1 = object.isTimestamp();
          _or_2 = _isTimestamp_1;
        }
        _and_1 = _or_2;
      }
      if (_and_1) {
        _builder.append("@dateformat = default</br>");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    String _toPropertiesDocu = this.getToPropertiesDocu(object);
    _builder.append(_toPropertiesDocu, "\t\t");
    _builder.newLineIfNotEmpty();
    return (value + _builder);
  }
  
  protected String _getDocu(final MobaPropertiesAble object, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t");
    String _toPropertiesDocu = this.getToPropertiesDocu(object);
    _builder.append(_toPropertiesDocu, "\t\t");
    _builder.newLineIfNotEmpty();
    return (value + _builder);
  }
  
  public String getToPropertiesDocu(final MobaPropertiesAble type) {
    final List<MobaProperty> allProps = type.getGenProperties();
    boolean _isEmpty = allProps.isEmpty();
    if (_isEmpty) {
      return "";
    }
    final StringBuilder b = new StringBuilder();
    b.append("Properties: ");
    for (final MobaProperty prop : allProps) {
      {
        b.append("<code>");
        String _keyStringOrConstantName = prop.getKeyStringOrConstantName();
        b.append(_keyStringOrConstantName);
        b.append("=");
        String _valueStringOrConstantName = prop.getValueStringOrConstantName();
        b.append(_valueStringOrConstantName);
        b.append("</code>, ");
      }
    }
    String _xifexpression = null;
    int _length = b.length();
    boolean _greaterEqualsThan = (_length >= 2);
    if (_greaterEqualsThan) {
      String _string = b.toString();
      int _length_1 = b.length();
      int _minus = (_length_1 - 2);
      _xifexpression = _string.substring(0, _minus);
    } else {
      _xifexpression = b.toString();
    }
    return _xifexpression;
  }
  
  protected String _toDocu(final MobaGeneratorFeature feature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.newLine();
    return _builder.toString();
  }
  
  protected String _toDocu(final MobaGeneratorIDFeature feature) {
    String _xblockexpression = null;
    {
      String _generatorVersionedId = feature.getGeneratorVersionedId();
      List<String> _singletonList = Collections.<String>singletonList(_generatorVersionedId);
      Map<String, ExtensionGeneratorDelegate.Metadata> _readExtentionsMetadata = this.generatorDelegate.readExtentionsMetadata(this.grammarName, _singletonList);
      String _generatorVersionedId_1 = feature.getGeneratorVersionedId();
      final ExtensionGeneratorDelegate.Metadata metadata = _readExtentionsMetadata.get(_generatorVersionedId_1);
      String _xifexpression = null;
      boolean _notEquals = (!Objects.equal(metadata, 
        null));
      if (_notEquals) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("<b>");
        String _name = metadata.getName();
        _builder.append(_name, "");
        _builder.append("</b> ");
        {
          String _license = metadata.getLicense();
          boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(_license);
          boolean _not = (!_isNullOrEmpty);
          if (_not) {
            _builder.append(" <i>under (");
            String _license_1 = metadata.getLicense();
            _builder.append(_license_1, "");
          }
        }
        _builder.append("</i>) - ");
        String _description = metadata.getDescription();
        _builder.append(_description, "");
        _builder.append(": <code>");
        String _generatorVersionedId_2 = feature.getGeneratorVersionedId();
        _builder.append(_generatorVersionedId_2, "");
        _builder.append("</code>");
        _xifexpression = _builder.toString();
      } else {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("<code>");
        String _generatorVersionedId_3 = feature.getGeneratorVersionedId();
        _builder_1.append(_generatorVersionedId_3, "");
        _builder_1.append("</code>");
        _xifexpression = _builder_1.toString();
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  protected String _toDocu(final MobaGeneratorMixinFeature feature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mixin <code>");
    String _generatorVersionedId = feature.getGeneratorVersionedId();
    _builder.append(_generatorVersionedId, "");
    _builder.append("</code>");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String getDocu(final EObject object, final String value) {
    if (object instanceof MobaApplication) {
      return _getDocu((MobaApplication)object, value);
    } else if (object instanceof MobaConstant) {
      return _getDocu((MobaConstant)object, value);
    } else if (object instanceof MobaDataType) {
      return _getDocu((MobaDataType)object, value);
    } else if (object instanceof MobaGenerator) {
      return _getDocu((MobaGenerator)object, value);
    } else if (object instanceof MobaPropertiesAble) {
      return _getDocu((MobaPropertiesAble)object, value);
    } else if (object != null) {
      return _getDocu(object, value);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object, value).toString());
    }
  }
  
  public String toDocu(final MobaGeneratorFeature feature) {
    if (feature instanceof MobaGeneratorIDFeature) {
      return _toDocu((MobaGeneratorIDFeature)feature);
    } else if (feature instanceof MobaGeneratorMixinFeature) {
      return _toDocu((MobaGeneratorMixinFeature)feature);
    } else if (feature != null) {
      return _toDocu(feature);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(feature).toString());
    }
  }
}
