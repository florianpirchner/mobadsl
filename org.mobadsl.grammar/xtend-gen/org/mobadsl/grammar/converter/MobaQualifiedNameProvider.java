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
    String _applicationVersionedIdModelValue = MobaUtil.toApplicationVersionedIdModelValue(_id);
    String[] _split = _applicationVersionedIdModelValue.split("\\.");
    return QualifiedName.create(_split);
  }
  
  public QualifiedName qualifiedName(final MobaGenerator ele) {
    String _versionedId = ele.getVersionedId();
    final String[] tokens = _versionedId.split(":");
    String _get = tokens[0];
    QualifiedName _create = QualifiedName.create(_get);
    String _get_1 = tokens[1];
    QualifiedName _create_1 = QualifiedName.create(_get_1);
    return _create.append(_create_1);
  }
}
