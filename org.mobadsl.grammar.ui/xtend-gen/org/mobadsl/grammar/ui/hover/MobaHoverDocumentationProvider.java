package org.mobadsl.grammar.ui.hover;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaDataType;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.MobaGeneratorFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorIDFeature;
import org.mobadsl.semantic.model.moba.MobaGeneratorMixinFeature;
import org.mobadsl.semantic.model.moba.MobaPropertiesAble;
import org.mobadsl.semantic.model.moba.MobaProperty;

@SuppressWarnings("all")
public class MobaHoverDocumentationProvider extends MultiLineCommentDocumentationProvider {
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
    _builder.append("</code></p>");
    return (value + _builder);
  }
  
  protected String _getDocu(final MobaGenerator object, final String value) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("contents:<br>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<ul>");
    _builder.newLine();
    {
      EList<MobaGeneratorFeature> _features = object.getFeatures();
      for(final MobaGeneratorFeature feature : _features) {
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
    _builder.append("Datatype <b>");
    String _name = object.getName();
    _builder.append(_name, "\t\t");
    _builder.append("</b>:<br>");
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
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("id <code>");
    String _generatorId = feature.getGeneratorId();
    _builder.append(_generatorId, "");
    _builder.append("</code>");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected String _toDocu(final MobaGeneratorMixinFeature feature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("mixin <code>");
    String _generatorId = feature.getGeneratorId();
    _builder.append(_generatorId, "");
    _builder.append("</code>");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  public String getDocu(final EObject object, final String value) {
    if (object instanceof MobaConstant) {
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
