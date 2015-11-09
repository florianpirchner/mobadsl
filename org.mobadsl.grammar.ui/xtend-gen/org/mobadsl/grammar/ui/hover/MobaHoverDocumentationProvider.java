package org.mobadsl.grammar.ui.hover;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.documentation.impl.MultiLineCommentDocumentationProvider;
import org.mobadsl.semantic.model.moba.MobaConstant;

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
  
  public String getDocu(final EObject object, final String value) {
    if (object instanceof MobaConstant) {
      return _getDocu((MobaConstant)object, value);
    } else if (object != null) {
      return _getDocu(object, value);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(object, value).toString());
    }
  }
}
