/*
 * generated by Xtext 2.9.0.beta6
 */
package org.mobadsl.grammar.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.mobadsl.grammar.parser.antlr.internal.InternalMobaParser;
import org.mobadsl.grammar.services.MobaGrammarAccess;

public class MobaParser extends AbstractAntlrParser {

	@Inject
	private MobaGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMobaParser createParser(XtextTokenStream stream) {
		return new InternalMobaParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MobaApplication";
	}

	public MobaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MobaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
