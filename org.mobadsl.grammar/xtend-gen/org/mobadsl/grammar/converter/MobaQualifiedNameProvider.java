package org.mobadsl.grammar.converter;

import java.util.ArrayList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
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
    EObject _eContainer = ele.eContainer();
    final MobaApplication app = ((MobaApplication) _eContainer);
    String _versionedId = ele.getVersionedId();
    final String[] idTokens = _versionedId.split("(:|\\.|-)");
    String _name = app.getName();
    final ArrayList<String> tokens = CollectionLiterals.<String>newArrayList(_name);
    CollectionExtensions.<String>addAll(tokens, idTokens);
    return QualifiedName.create(tokens);
  }
}
