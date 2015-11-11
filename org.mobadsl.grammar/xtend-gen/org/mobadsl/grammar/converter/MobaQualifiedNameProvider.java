package org.mobadsl.grammar.converter;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.mobadsl.semantic.model.moba.MobaApplication;

@SuppressWarnings("all")
public class MobaQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  public QualifiedName qualifiedName(final MobaApplication ele) {
    String _id = ele.getId();
    return QualifiedName.create(_id);
  }
}
