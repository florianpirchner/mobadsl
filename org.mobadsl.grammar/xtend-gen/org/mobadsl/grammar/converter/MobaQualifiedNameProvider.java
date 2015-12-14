package org.mobadsl.grammar.converter;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaGenerator;
import org.mobadsl.semantic.model.moba.util.MobaUtil;

@SuppressWarnings("all")
public class MobaQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  public QualifiedName qualifiedName(final MobaApplication ele) {
    String _id = ele.getId();
    String _versionedIdModelValue = MobaUtil.toVersionedIdModelValue(_id);
    String[] _split = _versionedIdModelValue.split("\\.");
    return QualifiedName.create(_split);
  }
  
  public QualifiedName qualifiedName(final MobaGenerator ele) {
    String _versionedId = ele.getVersionedId();
    final String[] idTokens = _versionedId.split("(:|\\.|-)");
    return QualifiedName.create(idTokens);
  }
}
