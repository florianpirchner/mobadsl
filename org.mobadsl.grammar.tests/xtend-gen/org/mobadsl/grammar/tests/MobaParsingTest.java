/**
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.tests;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mobadsl.grammar.tests.MobaInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(MobaInjectorProvider.class)
@SuppressWarnings("all")
public class MobaParsingTest {
  @Inject
  private /* ParseHelper<MobaApplication> */Object parseHelper;
  
  @Test
  public void loadModel() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Hello Xtext!");
      _builder.newLine();
      final MobaApplication result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
