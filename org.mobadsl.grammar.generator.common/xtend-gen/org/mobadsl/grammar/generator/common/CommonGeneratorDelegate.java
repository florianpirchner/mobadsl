package org.mobadsl.grammar.generator.common;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.mobadsl.grammar.generator.common.IGeneratorDelegate;
import org.mobadsl.semantic.model.moba.MobaApplication;
import org.mobadsl.semantic.model.moba.MobaApplicationFeature;
import org.mobadsl.semantic.model.moba.MobaAuthorization;
import org.mobadsl.semantic.model.moba.MobaConstant;
import org.mobadsl.semantic.model.moba.MobaModel;
import org.mobadsl.semantic.model.moba.MobaModelFeature;
import org.mobadsl.semantic.model.moba.MobaProject;
import org.mobadsl.semantic.model.moba.MobaServer;

/**
 * The generator iterates the given MobaModel and generates the required code.<br>
 * Different types of features are available for objects, following the pattern:
 * <ul>
 * <li>getAll... - will return all objects of this type excluding the "used templates".</li>
 * <li>getGen... - will return all objects of this type including the "used templates". These methods should be used to generate your code,
 * since this method returns exactly what is needed. If values are overridden by sub types, this method takes aware of it.</li>
 * <li>get... - returns all objects of this type from the current object.</li>
 * </ul>
 * 
 * If you have no idea, which method to use, then use the getGen... method if available.
 */
@SuppressWarnings("all")
public class CommonGeneratorDelegate {
  public void generate(final MobaModel model, final IFileSystemAccess2 fsa, final IGeneratorContext context, final IGeneratorDelegate.PropertiesMap properties) {
    EList<MobaModelFeature> _features = model.getFeatures();
    for (final MobaModelFeature feature : _features) {
      this.generate(feature);
    }
  }
  
  protected Object _generate(final MobaApplication app) {
    List<MobaApplicationFeature> _genFeatures = app.getGenFeatures();
    final Consumer<MobaApplicationFeature> _function = (MobaApplicationFeature it) -> {
      this.generateFeature(it);
    };
    _genFeatures.forEach(_function);
    return null;
  }
  
  protected Object _generate(final MobaProject project) {
    return null;
  }
  
  protected Object _generateFeature(final MobaAuthorization auth) {
    return null;
  }
  
  protected Object _generateFeature(final MobaConstant auth) {
    return null;
  }
  
  protected Object _generateFeature(final MobaServer auth) {
    return null;
  }
  
  public Object generate(final MobaModelFeature app) {
    if (app instanceof MobaApplication) {
      return _generate((MobaApplication)app);
    } else if (app instanceof MobaProject) {
      return _generate((MobaProject)app);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(app).toString());
    }
  }
  
  public Object generateFeature(final MobaApplicationFeature auth) {
    if (auth instanceof MobaAuthorization) {
      return _generateFeature((MobaAuthorization)auth);
    } else if (auth instanceof MobaConstant) {
      return _generateFeature((MobaConstant)auth);
    } else if (auth instanceof MobaServer) {
      return _generateFeature((MobaServer)auth);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(auth).toString());
    }
  }
}
