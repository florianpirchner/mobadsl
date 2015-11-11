package org.mobadsl.grammar.converter;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

@SuppressWarnings("all")
public class MobaQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  public QualifiedName qualifiedName(final MobaApplication ele) {
    String _id = ele.getId();
    String _applicationIdQualifiedNameString = MobaUtil.toApplicationIdQualifiedNameString(_id);
    String[] _split = _applicationIdQualifiedNameString.split("\\.");
    return QualifiedName.create(_split);
  }
}
