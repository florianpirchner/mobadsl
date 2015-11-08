package org.mobadsl.grammar.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.mobadsl.grammar.services.MobaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMobaParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'0'", "'?'", "'+'", "'1'", "'application'", "'{'", "'}'", "'use template'", "'use generator'", "'datatype'", "'('", "')'", "'const'", "'='", "'['", "']'", "','", "'settings'", "'extends'", "'cache'", "'type'", "'strategy'", "'dto'", "'index'", "'payload'", "'queue'", "'rest'", "'restCrud'", "'var'", "'ref'", "'alias'", "'..'", "'isPrimitive'", "'isArray'", "'isDate'", "'isTime'", "'isTimestamp'", "'lazy'", "'transient'", "'domainKey'", "'domainDescription'", "'cascading'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMobaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMobaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMobaParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMoba.g"; }


    	private MobaGrammarAccess grammarAccess;

    	public void setGrammarAccess(MobaGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMobaApplication"
    // InternalMoba.g:53:1: entryRuleMobaApplication : ruleMobaApplication EOF ;
    public final void entryRuleMobaApplication() throws RecognitionException {
        try {
            // InternalMoba.g:54:1: ( ruleMobaApplication EOF )
            // InternalMoba.g:55:1: ruleMobaApplication EOF
            {
             before(grammarAccess.getMobaApplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaApplication();

            state._fsp--;

             after(grammarAccess.getMobaApplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaApplication"


    // $ANTLR start "ruleMobaApplication"
    // InternalMoba.g:62:1: ruleMobaApplication : ( ( rule__MobaApplication__Group__0 ) ) ;
    public final void ruleMobaApplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:66:2: ( ( ( rule__MobaApplication__Group__0 ) ) )
            // InternalMoba.g:67:2: ( ( rule__MobaApplication__Group__0 ) )
            {
            // InternalMoba.g:67:2: ( ( rule__MobaApplication__Group__0 ) )
            // InternalMoba.g:68:3: ( rule__MobaApplication__Group__0 )
            {
             before(grammarAccess.getMobaApplicationAccess().getGroup()); 
            // InternalMoba.g:69:3: ( rule__MobaApplication__Group__0 )
            // InternalMoba.g:69:4: rule__MobaApplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaApplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaApplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaApplication"


    // $ANTLR start "entryRuleMobaApplicationFeature"
    // InternalMoba.g:78:1: entryRuleMobaApplicationFeature : ruleMobaApplicationFeature EOF ;
    public final void entryRuleMobaApplicationFeature() throws RecognitionException {
        try {
            // InternalMoba.g:79:1: ( ruleMobaApplicationFeature EOF )
            // InternalMoba.g:80:1: ruleMobaApplicationFeature EOF
            {
             before(grammarAccess.getMobaApplicationFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaApplicationFeature();

            state._fsp--;

             after(grammarAccess.getMobaApplicationFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaApplicationFeature"


    // $ANTLR start "ruleMobaApplicationFeature"
    // InternalMoba.g:87:1: ruleMobaApplicationFeature : ( ( rule__MobaApplicationFeature__Alternatives ) ) ;
    public final void ruleMobaApplicationFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:91:2: ( ( ( rule__MobaApplicationFeature__Alternatives ) ) )
            // InternalMoba.g:92:2: ( ( rule__MobaApplicationFeature__Alternatives ) )
            {
            // InternalMoba.g:92:2: ( ( rule__MobaApplicationFeature__Alternatives ) )
            // InternalMoba.g:93:3: ( rule__MobaApplicationFeature__Alternatives )
            {
             before(grammarAccess.getMobaApplicationFeatureAccess().getAlternatives()); 
            // InternalMoba.g:94:3: ( rule__MobaApplicationFeature__Alternatives )
            // InternalMoba.g:94:4: rule__MobaApplicationFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MobaApplicationFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMobaApplicationFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaApplicationFeature"


    // $ANTLR start "entryRuleMobaTemplate"
    // InternalMoba.g:103:1: entryRuleMobaTemplate : ruleMobaTemplate EOF ;
    public final void entryRuleMobaTemplate() throws RecognitionException {
        try {
            // InternalMoba.g:104:1: ( ruleMobaTemplate EOF )
            // InternalMoba.g:105:1: ruleMobaTemplate EOF
            {
             before(grammarAccess.getMobaTemplateRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaTemplate();

            state._fsp--;

             after(grammarAccess.getMobaTemplateRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaTemplate"


    // $ANTLR start "ruleMobaTemplate"
    // InternalMoba.g:112:1: ruleMobaTemplate : ( ( rule__MobaTemplate__Group__0 ) ) ;
    public final void ruleMobaTemplate() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:116:2: ( ( ( rule__MobaTemplate__Group__0 ) ) )
            // InternalMoba.g:117:2: ( ( rule__MobaTemplate__Group__0 ) )
            {
            // InternalMoba.g:117:2: ( ( rule__MobaTemplate__Group__0 ) )
            // InternalMoba.g:118:3: ( rule__MobaTemplate__Group__0 )
            {
             before(grammarAccess.getMobaTemplateAccess().getGroup()); 
            // InternalMoba.g:119:3: ( rule__MobaTemplate__Group__0 )
            // InternalMoba.g:119:4: rule__MobaTemplate__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaTemplate__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaTemplateAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaTemplate"


    // $ANTLR start "entryRuleMobaGenerator"
    // InternalMoba.g:128:1: entryRuleMobaGenerator : ruleMobaGenerator EOF ;
    public final void entryRuleMobaGenerator() throws RecognitionException {
        try {
            // InternalMoba.g:129:1: ( ruleMobaGenerator EOF )
            // InternalMoba.g:130:1: ruleMobaGenerator EOF
            {
             before(grammarAccess.getMobaGeneratorRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaGenerator();

            state._fsp--;

             after(grammarAccess.getMobaGeneratorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaGenerator"


    // $ANTLR start "ruleMobaGenerator"
    // InternalMoba.g:137:1: ruleMobaGenerator : ( ( rule__MobaGenerator__Group__0 ) ) ;
    public final void ruleMobaGenerator() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:141:2: ( ( ( rule__MobaGenerator__Group__0 ) ) )
            // InternalMoba.g:142:2: ( ( rule__MobaGenerator__Group__0 ) )
            {
            // InternalMoba.g:142:2: ( ( rule__MobaGenerator__Group__0 ) )
            // InternalMoba.g:143:3: ( rule__MobaGenerator__Group__0 )
            {
             before(grammarAccess.getMobaGeneratorAccess().getGroup()); 
            // InternalMoba.g:144:3: ( rule__MobaGenerator__Group__0 )
            // InternalMoba.g:144:4: rule__MobaGenerator__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaGenerator__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaGeneratorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaGenerator"


    // $ANTLR start "entryRuleMobaDataType"
    // InternalMoba.g:153:1: entryRuleMobaDataType : ruleMobaDataType EOF ;
    public final void entryRuleMobaDataType() throws RecognitionException {
        try {
            // InternalMoba.g:154:1: ( ruleMobaDataType EOF )
            // InternalMoba.g:155:1: ruleMobaDataType EOF
            {
             before(grammarAccess.getMobaDataTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaDataType();

            state._fsp--;

             after(grammarAccess.getMobaDataTypeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaDataType"


    // $ANTLR start "ruleMobaDataType"
    // InternalMoba.g:162:1: ruleMobaDataType : ( ( rule__MobaDataType__Group__0 ) ) ;
    public final void ruleMobaDataType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:166:2: ( ( ( rule__MobaDataType__Group__0 ) ) )
            // InternalMoba.g:167:2: ( ( rule__MobaDataType__Group__0 ) )
            {
            // InternalMoba.g:167:2: ( ( rule__MobaDataType__Group__0 ) )
            // InternalMoba.g:168:3: ( rule__MobaDataType__Group__0 )
            {
             before(grammarAccess.getMobaDataTypeAccess().getGroup()); 
            // InternalMoba.g:169:3: ( rule__MobaDataType__Group__0 )
            // InternalMoba.g:169:4: rule__MobaDataType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaDataTypeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaDataType"


    // $ANTLR start "entryRuleMobaConstant"
    // InternalMoba.g:178:1: entryRuleMobaConstant : ruleMobaConstant EOF ;
    public final void entryRuleMobaConstant() throws RecognitionException {
        try {
            // InternalMoba.g:179:1: ( ruleMobaConstant EOF )
            // InternalMoba.g:180:1: ruleMobaConstant EOF
            {
             before(grammarAccess.getMobaConstantRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaConstant();

            state._fsp--;

             after(grammarAccess.getMobaConstantRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaConstant"


    // $ANTLR start "ruleMobaConstant"
    // InternalMoba.g:187:1: ruleMobaConstant : ( ( rule__MobaConstant__Group__0 ) ) ;
    public final void ruleMobaConstant() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:191:2: ( ( ( rule__MobaConstant__Group__0 ) ) )
            // InternalMoba.g:192:2: ( ( rule__MobaConstant__Group__0 ) )
            {
            // InternalMoba.g:192:2: ( ( rule__MobaConstant__Group__0 ) )
            // InternalMoba.g:193:3: ( rule__MobaConstant__Group__0 )
            {
             before(grammarAccess.getMobaConstantAccess().getGroup()); 
            // InternalMoba.g:194:3: ( rule__MobaConstant__Group__0 )
            // InternalMoba.g:194:4: rule__MobaConstant__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaConstant__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaConstantAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaConstant"


    // $ANTLR start "ruleMobaPropertiesProvider"
    // InternalMoba.g:204:1: ruleMobaPropertiesProvider : ( ( rule__MobaPropertiesProvider__Group__0 ) ) ;
    public final void ruleMobaPropertiesProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:208:2: ( ( ( rule__MobaPropertiesProvider__Group__0 ) ) )
            // InternalMoba.g:209:2: ( ( rule__MobaPropertiesProvider__Group__0 ) )
            {
            // InternalMoba.g:209:2: ( ( rule__MobaPropertiesProvider__Group__0 ) )
            // InternalMoba.g:210:3: ( rule__MobaPropertiesProvider__Group__0 )
            {
             before(grammarAccess.getMobaPropertiesProviderAccess().getGroup()); 
            // InternalMoba.g:211:3: ( rule__MobaPropertiesProvider__Group__0 )
            // InternalMoba.g:211:4: rule__MobaPropertiesProvider__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaPropertiesProvider__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaPropertiesProviderAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaPropertiesProvider"


    // $ANTLR start "entryRuleMobaProperty"
    // InternalMoba.g:220:1: entryRuleMobaProperty : ruleMobaProperty EOF ;
    public final void entryRuleMobaProperty() throws RecognitionException {
        try {
            // InternalMoba.g:221:1: ( ruleMobaProperty EOF )
            // InternalMoba.g:222:1: ruleMobaProperty EOF
            {
             before(grammarAccess.getMobaPropertyRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaProperty();

            state._fsp--;

             after(grammarAccess.getMobaPropertyRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaProperty"


    // $ANTLR start "ruleMobaProperty"
    // InternalMoba.g:229:1: ruleMobaProperty : ( ( rule__MobaProperty__Group__0 ) ) ;
    public final void ruleMobaProperty() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:233:2: ( ( ( rule__MobaProperty__Group__0 ) ) )
            // InternalMoba.g:234:2: ( ( rule__MobaProperty__Group__0 ) )
            {
            // InternalMoba.g:234:2: ( ( rule__MobaProperty__Group__0 ) )
            // InternalMoba.g:235:3: ( rule__MobaProperty__Group__0 )
            {
             before(grammarAccess.getMobaPropertyAccess().getGroup()); 
            // InternalMoba.g:236:3: ( rule__MobaProperty__Group__0 )
            // InternalMoba.g:236:4: rule__MobaProperty__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaProperty__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaPropertyAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaProperty"


    // $ANTLR start "entryRuleMobaData"
    // InternalMoba.g:245:1: entryRuleMobaData : ruleMobaData EOF ;
    public final void entryRuleMobaData() throws RecognitionException {
        try {
            // InternalMoba.g:246:1: ( ruleMobaData EOF )
            // InternalMoba.g:247:1: ruleMobaData EOF
            {
             before(grammarAccess.getMobaDataRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaData();

            state._fsp--;

             after(grammarAccess.getMobaDataRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaData"


    // $ANTLR start "ruleMobaData"
    // InternalMoba.g:254:1: ruleMobaData : ( ( rule__MobaData__Alternatives ) ) ;
    public final void ruleMobaData() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:258:2: ( ( ( rule__MobaData__Alternatives ) ) )
            // InternalMoba.g:259:2: ( ( rule__MobaData__Alternatives ) )
            {
            // InternalMoba.g:259:2: ( ( rule__MobaData__Alternatives ) )
            // InternalMoba.g:260:3: ( rule__MobaData__Alternatives )
            {
             before(grammarAccess.getMobaDataAccess().getAlternatives()); 
            // InternalMoba.g:261:3: ( rule__MobaData__Alternatives )
            // InternalMoba.g:261:4: rule__MobaData__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MobaData__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMobaDataAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaData"


    // $ANTLR start "entryRuleMobaSettings"
    // InternalMoba.g:270:1: entryRuleMobaSettings : ruleMobaSettings EOF ;
    public final void entryRuleMobaSettings() throws RecognitionException {
        try {
            // InternalMoba.g:271:1: ( ruleMobaSettings EOF )
            // InternalMoba.g:272:1: ruleMobaSettings EOF
            {
             before(grammarAccess.getMobaSettingsRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaSettings();

            state._fsp--;

             after(grammarAccess.getMobaSettingsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaSettings"


    // $ANTLR start "ruleMobaSettings"
    // InternalMoba.g:279:1: ruleMobaSettings : ( ( rule__MobaSettings__Group__0 ) ) ;
    public final void ruleMobaSettings() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:283:2: ( ( ( rule__MobaSettings__Group__0 ) ) )
            // InternalMoba.g:284:2: ( ( rule__MobaSettings__Group__0 ) )
            {
            // InternalMoba.g:284:2: ( ( rule__MobaSettings__Group__0 ) )
            // InternalMoba.g:285:3: ( rule__MobaSettings__Group__0 )
            {
             before(grammarAccess.getMobaSettingsAccess().getGroup()); 
            // InternalMoba.g:286:3: ( rule__MobaSettings__Group__0 )
            // InternalMoba.g:286:4: rule__MobaSettings__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaSettings__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaSettingsAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaSettings"


    // $ANTLR start "entryRuleMobaCache"
    // InternalMoba.g:295:1: entryRuleMobaCache : ruleMobaCache EOF ;
    public final void entryRuleMobaCache() throws RecognitionException {
        try {
            // InternalMoba.g:296:1: ( ruleMobaCache EOF )
            // InternalMoba.g:297:1: ruleMobaCache EOF
            {
             before(grammarAccess.getMobaCacheRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaCache();

            state._fsp--;

             after(grammarAccess.getMobaCacheRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaCache"


    // $ANTLR start "ruleMobaCache"
    // InternalMoba.g:304:1: ruleMobaCache : ( ( rule__MobaCache__Group__0 ) ) ;
    public final void ruleMobaCache() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:308:2: ( ( ( rule__MobaCache__Group__0 ) ) )
            // InternalMoba.g:309:2: ( ( rule__MobaCache__Group__0 ) )
            {
            // InternalMoba.g:309:2: ( ( rule__MobaCache__Group__0 ) )
            // InternalMoba.g:310:3: ( rule__MobaCache__Group__0 )
            {
             before(grammarAccess.getMobaCacheAccess().getGroup()); 
            // InternalMoba.g:311:3: ( rule__MobaCache__Group__0 )
            // InternalMoba.g:311:4: rule__MobaCache__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaCache__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaCacheAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaCache"


    // $ANTLR start "entryRuleMobaDto"
    // InternalMoba.g:320:1: entryRuleMobaDto : ruleMobaDto EOF ;
    public final void entryRuleMobaDto() throws RecognitionException {
        try {
            // InternalMoba.g:321:1: ( ruleMobaDto EOF )
            // InternalMoba.g:322:1: ruleMobaDto EOF
            {
             before(grammarAccess.getMobaDtoRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaDto();

            state._fsp--;

             after(grammarAccess.getMobaDtoRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaDto"


    // $ANTLR start "ruleMobaDto"
    // InternalMoba.g:329:1: ruleMobaDto : ( ( rule__MobaDto__Group__0 ) ) ;
    public final void ruleMobaDto() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:333:2: ( ( ( rule__MobaDto__Group__0 ) ) )
            // InternalMoba.g:334:2: ( ( rule__MobaDto__Group__0 ) )
            {
            // InternalMoba.g:334:2: ( ( rule__MobaDto__Group__0 ) )
            // InternalMoba.g:335:3: ( rule__MobaDto__Group__0 )
            {
             before(grammarAccess.getMobaDtoAccess().getGroup()); 
            // InternalMoba.g:336:3: ( rule__MobaDto__Group__0 )
            // InternalMoba.g:336:4: rule__MobaDto__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaDto__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaDto"


    // $ANTLR start "entryRuleMobaDtoIndex"
    // InternalMoba.g:345:1: entryRuleMobaDtoIndex : ruleMobaDtoIndex EOF ;
    public final void entryRuleMobaDtoIndex() throws RecognitionException {
        try {
            // InternalMoba.g:346:1: ( ruleMobaDtoIndex EOF )
            // InternalMoba.g:347:1: ruleMobaDtoIndex EOF
            {
             before(grammarAccess.getMobaDtoIndexRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaDtoIndex();

            state._fsp--;

             after(grammarAccess.getMobaDtoIndexRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaDtoIndex"


    // $ANTLR start "ruleMobaDtoIndex"
    // InternalMoba.g:354:1: ruleMobaDtoIndex : ( ( rule__MobaDtoIndex__Group__0 ) ) ;
    public final void ruleMobaDtoIndex() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:358:2: ( ( ( rule__MobaDtoIndex__Group__0 ) ) )
            // InternalMoba.g:359:2: ( ( rule__MobaDtoIndex__Group__0 ) )
            {
            // InternalMoba.g:359:2: ( ( rule__MobaDtoIndex__Group__0 ) )
            // InternalMoba.g:360:3: ( rule__MobaDtoIndex__Group__0 )
            {
             before(grammarAccess.getMobaDtoIndexAccess().getGroup()); 
            // InternalMoba.g:361:3: ( rule__MobaDtoIndex__Group__0 )
            // InternalMoba.g:361:4: rule__MobaDtoIndex__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoIndex__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoIndexAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaDtoIndex"


    // $ANTLR start "entryRuleMobaPayload"
    // InternalMoba.g:370:1: entryRuleMobaPayload : ruleMobaPayload EOF ;
    public final void entryRuleMobaPayload() throws RecognitionException {
        try {
            // InternalMoba.g:371:1: ( ruleMobaPayload EOF )
            // InternalMoba.g:372:1: ruleMobaPayload EOF
            {
             before(grammarAccess.getMobaPayloadRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaPayload();

            state._fsp--;

             after(grammarAccess.getMobaPayloadRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaPayload"


    // $ANTLR start "ruleMobaPayload"
    // InternalMoba.g:379:1: ruleMobaPayload : ( ( rule__MobaPayload__Group__0 ) ) ;
    public final void ruleMobaPayload() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:383:2: ( ( ( rule__MobaPayload__Group__0 ) ) )
            // InternalMoba.g:384:2: ( ( rule__MobaPayload__Group__0 ) )
            {
            // InternalMoba.g:384:2: ( ( rule__MobaPayload__Group__0 ) )
            // InternalMoba.g:385:3: ( rule__MobaPayload__Group__0 )
            {
             before(grammarAccess.getMobaPayloadAccess().getGroup()); 
            // InternalMoba.g:386:3: ( rule__MobaPayload__Group__0 )
            // InternalMoba.g:386:4: rule__MobaPayload__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaPayload"


    // $ANTLR start "entryRuleMobaQueue"
    // InternalMoba.g:395:1: entryRuleMobaQueue : ruleMobaQueue EOF ;
    public final void entryRuleMobaQueue() throws RecognitionException {
        try {
            // InternalMoba.g:396:1: ( ruleMobaQueue EOF )
            // InternalMoba.g:397:1: ruleMobaQueue EOF
            {
             before(grammarAccess.getMobaQueueRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaQueue();

            state._fsp--;

             after(grammarAccess.getMobaQueueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaQueue"


    // $ANTLR start "ruleMobaQueue"
    // InternalMoba.g:404:1: ruleMobaQueue : ( ( rule__MobaQueue__Group__0 ) ) ;
    public final void ruleMobaQueue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:408:2: ( ( ( rule__MobaQueue__Group__0 ) ) )
            // InternalMoba.g:409:2: ( ( rule__MobaQueue__Group__0 ) )
            {
            // InternalMoba.g:409:2: ( ( rule__MobaQueue__Group__0 ) )
            // InternalMoba.g:410:3: ( rule__MobaQueue__Group__0 )
            {
             before(grammarAccess.getMobaQueueAccess().getGroup()); 
            // InternalMoba.g:411:3: ( rule__MobaQueue__Group__0 )
            // InternalMoba.g:411:4: rule__MobaQueue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaQueueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaQueue"


    // $ANTLR start "entryRuleMobaService"
    // InternalMoba.g:420:1: entryRuleMobaService : ruleMobaService EOF ;
    public final void entryRuleMobaService() throws RecognitionException {
        try {
            // InternalMoba.g:421:1: ( ruleMobaService EOF )
            // InternalMoba.g:422:1: ruleMobaService EOF
            {
             before(grammarAccess.getMobaServiceRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaService();

            state._fsp--;

             after(grammarAccess.getMobaServiceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaService"


    // $ANTLR start "ruleMobaService"
    // InternalMoba.g:429:1: ruleMobaService : ( ( rule__MobaService__Alternatives ) ) ;
    public final void ruleMobaService() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:433:2: ( ( ( rule__MobaService__Alternatives ) ) )
            // InternalMoba.g:434:2: ( ( rule__MobaService__Alternatives ) )
            {
            // InternalMoba.g:434:2: ( ( rule__MobaService__Alternatives ) )
            // InternalMoba.g:435:3: ( rule__MobaService__Alternatives )
            {
             before(grammarAccess.getMobaServiceAccess().getAlternatives()); 
            // InternalMoba.g:436:3: ( rule__MobaService__Alternatives )
            // InternalMoba.g:436:4: rule__MobaService__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MobaService__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMobaServiceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaService"


    // $ANTLR start "entryRuleMobaRestCustom"
    // InternalMoba.g:445:1: entryRuleMobaRestCustom : ruleMobaRestCustom EOF ;
    public final void entryRuleMobaRestCustom() throws RecognitionException {
        try {
            // InternalMoba.g:446:1: ( ruleMobaRestCustom EOF )
            // InternalMoba.g:447:1: ruleMobaRestCustom EOF
            {
             before(grammarAccess.getMobaRestCustomRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaRestCustom();

            state._fsp--;

             after(grammarAccess.getMobaRestCustomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaRestCustom"


    // $ANTLR start "ruleMobaRestCustom"
    // InternalMoba.g:454:1: ruleMobaRestCustom : ( ( rule__MobaRestCustom__Group__0 ) ) ;
    public final void ruleMobaRestCustom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:458:2: ( ( ( rule__MobaRestCustom__Group__0 ) ) )
            // InternalMoba.g:459:2: ( ( rule__MobaRestCustom__Group__0 ) )
            {
            // InternalMoba.g:459:2: ( ( rule__MobaRestCustom__Group__0 ) )
            // InternalMoba.g:460:3: ( rule__MobaRestCustom__Group__0 )
            {
             before(grammarAccess.getMobaRestCustomAccess().getGroup()); 
            // InternalMoba.g:461:3: ( rule__MobaRestCustom__Group__0 )
            // InternalMoba.g:461:4: rule__MobaRestCustom__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaRestCustom__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaRestCustomAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaRestCustom"


    // $ANTLR start "entryRuleMobaRestCrud"
    // InternalMoba.g:470:1: entryRuleMobaRestCrud : ruleMobaRestCrud EOF ;
    public final void entryRuleMobaRestCrud() throws RecognitionException {
        try {
            // InternalMoba.g:471:1: ( ruleMobaRestCrud EOF )
            // InternalMoba.g:472:1: ruleMobaRestCrud EOF
            {
             before(grammarAccess.getMobaRestCrudRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaRestCrud();

            state._fsp--;

             after(grammarAccess.getMobaRestCrudRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaRestCrud"


    // $ANTLR start "ruleMobaRestCrud"
    // InternalMoba.g:479:1: ruleMobaRestCrud : ( ( rule__MobaRestCrud__Group__0 ) ) ;
    public final void ruleMobaRestCrud() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:483:2: ( ( ( rule__MobaRestCrud__Group__0 ) ) )
            // InternalMoba.g:484:2: ( ( rule__MobaRestCrud__Group__0 ) )
            {
            // InternalMoba.g:484:2: ( ( rule__MobaRestCrud__Group__0 ) )
            // InternalMoba.g:485:3: ( rule__MobaRestCrud__Group__0 )
            {
             before(grammarAccess.getMobaRestCrudAccess().getGroup()); 
            // InternalMoba.g:486:3: ( rule__MobaRestCrud__Group__0 )
            // InternalMoba.g:486:4: rule__MobaRestCrud__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaRestCrud__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaRestCrudAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaRestCrud"


    // $ANTLR start "entryRuleMobaDtoFeature"
    // InternalMoba.g:495:1: entryRuleMobaDtoFeature : ruleMobaDtoFeature EOF ;
    public final void entryRuleMobaDtoFeature() throws RecognitionException {
        try {
            // InternalMoba.g:496:1: ( ruleMobaDtoFeature EOF )
            // InternalMoba.g:497:1: ruleMobaDtoFeature EOF
            {
             before(grammarAccess.getMobaDtoFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaDtoFeature();

            state._fsp--;

             after(grammarAccess.getMobaDtoFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaDtoFeature"


    // $ANTLR start "ruleMobaDtoFeature"
    // InternalMoba.g:504:1: ruleMobaDtoFeature : ( ( rule__MobaDtoFeature__Alternatives ) ) ;
    public final void ruleMobaDtoFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:508:2: ( ( ( rule__MobaDtoFeature__Alternatives ) ) )
            // InternalMoba.g:509:2: ( ( rule__MobaDtoFeature__Alternatives ) )
            {
            // InternalMoba.g:509:2: ( ( rule__MobaDtoFeature__Alternatives ) )
            // InternalMoba.g:510:3: ( rule__MobaDtoFeature__Alternatives )
            {
             before(grammarAccess.getMobaDtoFeatureAccess().getAlternatives()); 
            // InternalMoba.g:511:3: ( rule__MobaDtoFeature__Alternatives )
            // InternalMoba.g:511:4: rule__MobaDtoFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaDtoFeature"


    // $ANTLR start "entryRuleMobaDtoAttribute"
    // InternalMoba.g:520:1: entryRuleMobaDtoAttribute : ruleMobaDtoAttribute EOF ;
    public final void entryRuleMobaDtoAttribute() throws RecognitionException {
        try {
            // InternalMoba.g:521:1: ( ruleMobaDtoAttribute EOF )
            // InternalMoba.g:522:1: ruleMobaDtoAttribute EOF
            {
             before(grammarAccess.getMobaDtoAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaDtoAttribute();

            state._fsp--;

             after(grammarAccess.getMobaDtoAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaDtoAttribute"


    // $ANTLR start "ruleMobaDtoAttribute"
    // InternalMoba.g:529:1: ruleMobaDtoAttribute : ( ( rule__MobaDtoAttribute__Group__0 ) ) ;
    public final void ruleMobaDtoAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:533:2: ( ( ( rule__MobaDtoAttribute__Group__0 ) ) )
            // InternalMoba.g:534:2: ( ( rule__MobaDtoAttribute__Group__0 ) )
            {
            // InternalMoba.g:534:2: ( ( rule__MobaDtoAttribute__Group__0 ) )
            // InternalMoba.g:535:3: ( rule__MobaDtoAttribute__Group__0 )
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getGroup()); 
            // InternalMoba.g:536:3: ( rule__MobaDtoAttribute__Group__0 )
            // InternalMoba.g:536:4: rule__MobaDtoAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaDtoAttribute"


    // $ANTLR start "ruleMobaMultiplicityProvider"
    // InternalMoba.g:546:1: ruleMobaMultiplicityProvider : ( ( rule__MobaMultiplicityProvider__MultiplicityAssignment )? ) ;
    public final void ruleMobaMultiplicityProvider() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:550:2: ( ( ( rule__MobaMultiplicityProvider__MultiplicityAssignment )? ) )
            // InternalMoba.g:551:2: ( ( rule__MobaMultiplicityProvider__MultiplicityAssignment )? )
            {
            // InternalMoba.g:551:2: ( ( rule__MobaMultiplicityProvider__MultiplicityAssignment )? )
            // InternalMoba.g:552:3: ( rule__MobaMultiplicityProvider__MultiplicityAssignment )?
            {
             before(grammarAccess.getMobaMultiplicityProviderAccess().getMultiplicityAssignment()); 
            // InternalMoba.g:553:3: ( rule__MobaMultiplicityProvider__MultiplicityAssignment )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMoba.g:553:4: rule__MobaMultiplicityProvider__MultiplicityAssignment
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaMultiplicityProvider__MultiplicityAssignment();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaMultiplicityProviderAccess().getMultiplicityAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaMultiplicityProvider"


    // $ANTLR start "entryRuleMobaDtoReference"
    // InternalMoba.g:562:1: entryRuleMobaDtoReference : ruleMobaDtoReference EOF ;
    public final void entryRuleMobaDtoReference() throws RecognitionException {
        try {
            // InternalMoba.g:563:1: ( ruleMobaDtoReference EOF )
            // InternalMoba.g:564:1: ruleMobaDtoReference EOF
            {
             before(grammarAccess.getMobaDtoReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaDtoReference();

            state._fsp--;

             after(grammarAccess.getMobaDtoReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaDtoReference"


    // $ANTLR start "ruleMobaDtoReference"
    // InternalMoba.g:571:1: ruleMobaDtoReference : ( ( rule__MobaDtoReference__Group__0 ) ) ;
    public final void ruleMobaDtoReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:575:2: ( ( ( rule__MobaDtoReference__Group__0 ) ) )
            // InternalMoba.g:576:2: ( ( rule__MobaDtoReference__Group__0 ) )
            {
            // InternalMoba.g:576:2: ( ( rule__MobaDtoReference__Group__0 ) )
            // InternalMoba.g:577:3: ( rule__MobaDtoReference__Group__0 )
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getGroup()); 
            // InternalMoba.g:578:3: ( rule__MobaDtoReference__Group__0 )
            // InternalMoba.g:578:4: rule__MobaDtoReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaDtoReference"


    // $ANTLR start "entryRuleMobaPayloadFeature"
    // InternalMoba.g:587:1: entryRuleMobaPayloadFeature : ruleMobaPayloadFeature EOF ;
    public final void entryRuleMobaPayloadFeature() throws RecognitionException {
        try {
            // InternalMoba.g:588:1: ( ruleMobaPayloadFeature EOF )
            // InternalMoba.g:589:1: ruleMobaPayloadFeature EOF
            {
             before(grammarAccess.getMobaPayloadFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaPayloadFeature();

            state._fsp--;

             after(grammarAccess.getMobaPayloadFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaPayloadFeature"


    // $ANTLR start "ruleMobaPayloadFeature"
    // InternalMoba.g:596:1: ruleMobaPayloadFeature : ( ( rule__MobaPayloadFeature__Alternatives ) ) ;
    public final void ruleMobaPayloadFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:600:2: ( ( ( rule__MobaPayloadFeature__Alternatives ) ) )
            // InternalMoba.g:601:2: ( ( rule__MobaPayloadFeature__Alternatives ) )
            {
            // InternalMoba.g:601:2: ( ( rule__MobaPayloadFeature__Alternatives ) )
            // InternalMoba.g:602:3: ( rule__MobaPayloadFeature__Alternatives )
            {
             before(grammarAccess.getMobaPayloadFeatureAccess().getAlternatives()); 
            // InternalMoba.g:603:3: ( rule__MobaPayloadFeature__Alternatives )
            // InternalMoba.g:603:4: rule__MobaPayloadFeature__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadFeature__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadFeatureAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaPayloadFeature"


    // $ANTLR start "entryRuleMobaPayloadAttribute"
    // InternalMoba.g:612:1: entryRuleMobaPayloadAttribute : ruleMobaPayloadAttribute EOF ;
    public final void entryRuleMobaPayloadAttribute() throws RecognitionException {
        try {
            // InternalMoba.g:613:1: ( ruleMobaPayloadAttribute EOF )
            // InternalMoba.g:614:1: ruleMobaPayloadAttribute EOF
            {
             before(grammarAccess.getMobaPayloadAttributeRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaPayloadAttribute();

            state._fsp--;

             after(grammarAccess.getMobaPayloadAttributeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaPayloadAttribute"


    // $ANTLR start "ruleMobaPayloadAttribute"
    // InternalMoba.g:621:1: ruleMobaPayloadAttribute : ( ( rule__MobaPayloadAttribute__Group__0 ) ) ;
    public final void ruleMobaPayloadAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:625:2: ( ( ( rule__MobaPayloadAttribute__Group__0 ) ) )
            // InternalMoba.g:626:2: ( ( rule__MobaPayloadAttribute__Group__0 ) )
            {
            // InternalMoba.g:626:2: ( ( rule__MobaPayloadAttribute__Group__0 ) )
            // InternalMoba.g:627:3: ( rule__MobaPayloadAttribute__Group__0 )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getGroup()); 
            // InternalMoba.g:628:3: ( rule__MobaPayloadAttribute__Group__0 )
            // InternalMoba.g:628:4: rule__MobaPayloadAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaPayloadAttribute"


    // $ANTLR start "entryRuleMobaPayloadReference"
    // InternalMoba.g:637:1: entryRuleMobaPayloadReference : ruleMobaPayloadReference EOF ;
    public final void entryRuleMobaPayloadReference() throws RecognitionException {
        try {
            // InternalMoba.g:638:1: ( ruleMobaPayloadReference EOF )
            // InternalMoba.g:639:1: ruleMobaPayloadReference EOF
            {
             before(grammarAccess.getMobaPayloadReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaPayloadReference();

            state._fsp--;

             after(grammarAccess.getMobaPayloadReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaPayloadReference"


    // $ANTLR start "ruleMobaPayloadReference"
    // InternalMoba.g:646:1: ruleMobaPayloadReference : ( ( rule__MobaPayloadReference__Group__0 ) ) ;
    public final void ruleMobaPayloadReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:650:2: ( ( ( rule__MobaPayloadReference__Group__0 ) ) )
            // InternalMoba.g:651:2: ( ( rule__MobaPayloadReference__Group__0 ) )
            {
            // InternalMoba.g:651:2: ( ( rule__MobaPayloadReference__Group__0 ) )
            // InternalMoba.g:652:3: ( rule__MobaPayloadReference__Group__0 )
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getGroup()); 
            // InternalMoba.g:653:3: ( rule__MobaPayloadReference__Group__0 )
            // InternalMoba.g:653:4: rule__MobaPayloadReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaPayloadReference"


    // $ANTLR start "entryRuleMobaQueueFeature"
    // InternalMoba.g:662:1: entryRuleMobaQueueFeature : ruleMobaQueueFeature EOF ;
    public final void entryRuleMobaQueueFeature() throws RecognitionException {
        try {
            // InternalMoba.g:663:1: ( ruleMobaQueueFeature EOF )
            // InternalMoba.g:664:1: ruleMobaQueueFeature EOF
            {
             before(grammarAccess.getMobaQueueFeatureRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaQueueFeature();

            state._fsp--;

             after(grammarAccess.getMobaQueueFeatureRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaQueueFeature"


    // $ANTLR start "ruleMobaQueueFeature"
    // InternalMoba.g:671:1: ruleMobaQueueFeature : ( ruleMobaQueueReference ) ;
    public final void ruleMobaQueueFeature() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:675:2: ( ( ruleMobaQueueReference ) )
            // InternalMoba.g:676:2: ( ruleMobaQueueReference )
            {
            // InternalMoba.g:676:2: ( ruleMobaQueueReference )
            // InternalMoba.g:677:3: ruleMobaQueueReference
            {
             before(grammarAccess.getMobaQueueFeatureAccess().getMobaQueueReferenceParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleMobaQueueReference();

            state._fsp--;

             after(grammarAccess.getMobaQueueFeatureAccess().getMobaQueueReferenceParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaQueueFeature"


    // $ANTLR start "entryRuleMobaQueueReference"
    // InternalMoba.g:687:1: entryRuleMobaQueueReference : ruleMobaQueueReference EOF ;
    public final void entryRuleMobaQueueReference() throws RecognitionException {
        try {
            // InternalMoba.g:688:1: ( ruleMobaQueueReference EOF )
            // InternalMoba.g:689:1: ruleMobaQueueReference EOF
            {
             before(grammarAccess.getMobaQueueReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaQueueReference();

            state._fsp--;

             after(grammarAccess.getMobaQueueReferenceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaQueueReference"


    // $ANTLR start "ruleMobaQueueReference"
    // InternalMoba.g:696:1: ruleMobaQueueReference : ( ( rule__MobaQueueReference__Group__0 ) ) ;
    public final void ruleMobaQueueReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:700:2: ( ( ( rule__MobaQueueReference__Group__0 ) ) )
            // InternalMoba.g:701:2: ( ( rule__MobaQueueReference__Group__0 ) )
            {
            // InternalMoba.g:701:2: ( ( rule__MobaQueueReference__Group__0 ) )
            // InternalMoba.g:702:3: ( rule__MobaQueueReference__Group__0 )
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getGroup()); 
            // InternalMoba.g:703:3: ( rule__MobaQueueReference__Group__0 )
            // InternalMoba.g:703:4: rule__MobaQueueReference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaQueueReferenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaQueueReference"


    // $ANTLR start "entryRuleMobaMuliplicity"
    // InternalMoba.g:712:1: entryRuleMobaMuliplicity : ruleMobaMuliplicity EOF ;
    public final void entryRuleMobaMuliplicity() throws RecognitionException {
        try {
            // InternalMoba.g:713:1: ( ruleMobaMuliplicity EOF )
            // InternalMoba.g:714:1: ruleMobaMuliplicity EOF
            {
             before(grammarAccess.getMobaMuliplicityRule()); 
            pushFollow(FOLLOW_1);
            ruleMobaMuliplicity();

            state._fsp--;

             after(grammarAccess.getMobaMuliplicityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMobaMuliplicity"


    // $ANTLR start "ruleMobaMuliplicity"
    // InternalMoba.g:721:1: ruleMobaMuliplicity : ( ( rule__MobaMuliplicity__Group__0 ) ) ;
    public final void ruleMobaMuliplicity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:725:2: ( ( ( rule__MobaMuliplicity__Group__0 ) ) )
            // InternalMoba.g:726:2: ( ( rule__MobaMuliplicity__Group__0 ) )
            {
            // InternalMoba.g:726:2: ( ( rule__MobaMuliplicity__Group__0 ) )
            // InternalMoba.g:727:3: ( rule__MobaMuliplicity__Group__0 )
            {
             before(grammarAccess.getMobaMuliplicityAccess().getGroup()); 
            // InternalMoba.g:728:3: ( rule__MobaMuliplicity__Group__0 )
            // InternalMoba.g:728:4: rule__MobaMuliplicity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaMuliplicity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaMuliplicityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaMuliplicity"


    // $ANTLR start "ruleMobaLowerBound"
    // InternalMoba.g:737:1: ruleMobaLowerBound : ( ( rule__MobaLowerBound__Alternatives ) ) ;
    public final void ruleMobaLowerBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:741:1: ( ( ( rule__MobaLowerBound__Alternatives ) ) )
            // InternalMoba.g:742:2: ( ( rule__MobaLowerBound__Alternatives ) )
            {
            // InternalMoba.g:742:2: ( ( rule__MobaLowerBound__Alternatives ) )
            // InternalMoba.g:743:3: ( rule__MobaLowerBound__Alternatives )
            {
             before(grammarAccess.getMobaLowerBoundAccess().getAlternatives()); 
            // InternalMoba.g:744:3: ( rule__MobaLowerBound__Alternatives )
            // InternalMoba.g:744:4: rule__MobaLowerBound__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MobaLowerBound__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMobaLowerBoundAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaLowerBound"


    // $ANTLR start "ruleMobaUpperBound"
    // InternalMoba.g:753:1: ruleMobaUpperBound : ( ( rule__MobaUpperBound__Alternatives ) ) ;
    public final void ruleMobaUpperBound() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:757:1: ( ( ( rule__MobaUpperBound__Alternatives ) ) )
            // InternalMoba.g:758:2: ( ( rule__MobaUpperBound__Alternatives ) )
            {
            // InternalMoba.g:758:2: ( ( rule__MobaUpperBound__Alternatives ) )
            // InternalMoba.g:759:3: ( rule__MobaUpperBound__Alternatives )
            {
             before(grammarAccess.getMobaUpperBoundAccess().getAlternatives()); 
            // InternalMoba.g:760:3: ( rule__MobaUpperBound__Alternatives )
            // InternalMoba.g:760:4: rule__MobaUpperBound__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__MobaUpperBound__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMobaUpperBoundAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMobaUpperBound"


    // $ANTLR start "rule__MobaApplicationFeature__Alternatives"
    // InternalMoba.g:768:1: rule__MobaApplicationFeature__Alternatives : ( ( ruleMobaDataType ) | ( ruleMobaTemplate ) | ( ruleMobaConstant ) | ( ruleMobaSettings ) | ( ruleMobaData ) | ( ruleMobaService ) | ( ruleMobaGenerator ) );
    public final void rule__MobaApplicationFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:772:1: ( ( ruleMobaDataType ) | ( ruleMobaTemplate ) | ( ruleMobaConstant ) | ( ruleMobaSettings ) | ( ruleMobaData ) | ( ruleMobaService ) | ( ruleMobaGenerator ) )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 21:
                {
                alt2=1;
                }
                break;
            case 19:
                {
                alt2=2;
                }
                break;
            case 24:
                {
                alt2=3;
                }
                break;
            case 29:
                {
                alt2=4;
                }
                break;
            case 34:
            case 36:
            case 37:
                {
                alt2=5;
                }
                break;
            case 38:
            case 39:
                {
                alt2=6;
                }
                break;
            case 20:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMoba.g:773:2: ( ruleMobaDataType )
                    {
                    // InternalMoba.g:773:2: ( ruleMobaDataType )
                    // InternalMoba.g:774:3: ruleMobaDataType
                    {
                     before(grammarAccess.getMobaApplicationFeatureAccess().getMobaDataTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaDataType();

                    state._fsp--;

                     after(grammarAccess.getMobaApplicationFeatureAccess().getMobaDataTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:779:2: ( ruleMobaTemplate )
                    {
                    // InternalMoba.g:779:2: ( ruleMobaTemplate )
                    // InternalMoba.g:780:3: ruleMobaTemplate
                    {
                     before(grammarAccess.getMobaApplicationFeatureAccess().getMobaTemplateParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaTemplate();

                    state._fsp--;

                     after(grammarAccess.getMobaApplicationFeatureAccess().getMobaTemplateParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:785:2: ( ruleMobaConstant )
                    {
                    // InternalMoba.g:785:2: ( ruleMobaConstant )
                    // InternalMoba.g:786:3: ruleMobaConstant
                    {
                     before(grammarAccess.getMobaApplicationFeatureAccess().getMobaConstantParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaConstant();

                    state._fsp--;

                     after(grammarAccess.getMobaApplicationFeatureAccess().getMobaConstantParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:791:2: ( ruleMobaSettings )
                    {
                    // InternalMoba.g:791:2: ( ruleMobaSettings )
                    // InternalMoba.g:792:3: ruleMobaSettings
                    {
                     before(grammarAccess.getMobaApplicationFeatureAccess().getMobaSettingsParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaSettings();

                    state._fsp--;

                     after(grammarAccess.getMobaApplicationFeatureAccess().getMobaSettingsParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:797:2: ( ruleMobaData )
                    {
                    // InternalMoba.g:797:2: ( ruleMobaData )
                    // InternalMoba.g:798:3: ruleMobaData
                    {
                     before(grammarAccess.getMobaApplicationFeatureAccess().getMobaDataParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaData();

                    state._fsp--;

                     after(grammarAccess.getMobaApplicationFeatureAccess().getMobaDataParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMoba.g:803:2: ( ruleMobaService )
                    {
                    // InternalMoba.g:803:2: ( ruleMobaService )
                    // InternalMoba.g:804:3: ruleMobaService
                    {
                     before(grammarAccess.getMobaApplicationFeatureAccess().getMobaServiceParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaService();

                    state._fsp--;

                     after(grammarAccess.getMobaApplicationFeatureAccess().getMobaServiceParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMoba.g:809:2: ( ruleMobaGenerator )
                    {
                    // InternalMoba.g:809:2: ( ruleMobaGenerator )
                    // InternalMoba.g:810:3: ruleMobaGenerator
                    {
                     before(grammarAccess.getMobaApplicationFeatureAccess().getMobaGeneratorParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaGenerator();

                    state._fsp--;

                     after(grammarAccess.getMobaApplicationFeatureAccess().getMobaGeneratorParserRuleCall_6()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplicationFeature__Alternatives"


    // $ANTLR start "rule__MobaGenerator__Alternatives_1"
    // InternalMoba.g:819:1: rule__MobaGenerator__Alternatives_1 : ( ( ( rule__MobaGenerator__GeneratorStringAssignment_1_0 ) ) | ( ( rule__MobaGenerator__GeneratorConstAssignment_1_1 ) ) );
    public final void rule__MobaGenerator__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:823:1: ( ( ( rule__MobaGenerator__GeneratorStringAssignment_1_0 ) ) | ( ( rule__MobaGenerator__GeneratorConstAssignment_1_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMoba.g:824:2: ( ( rule__MobaGenerator__GeneratorStringAssignment_1_0 ) )
                    {
                    // InternalMoba.g:824:2: ( ( rule__MobaGenerator__GeneratorStringAssignment_1_0 ) )
                    // InternalMoba.g:825:3: ( rule__MobaGenerator__GeneratorStringAssignment_1_0 )
                    {
                     before(grammarAccess.getMobaGeneratorAccess().getGeneratorStringAssignment_1_0()); 
                    // InternalMoba.g:826:3: ( rule__MobaGenerator__GeneratorStringAssignment_1_0 )
                    // InternalMoba.g:826:4: rule__MobaGenerator__GeneratorStringAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaGenerator__GeneratorStringAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaGeneratorAccess().getGeneratorStringAssignment_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:830:2: ( ( rule__MobaGenerator__GeneratorConstAssignment_1_1 ) )
                    {
                    // InternalMoba.g:830:2: ( ( rule__MobaGenerator__GeneratorConstAssignment_1_1 ) )
                    // InternalMoba.g:831:3: ( rule__MobaGenerator__GeneratorConstAssignment_1_1 )
                    {
                     before(grammarAccess.getMobaGeneratorAccess().getGeneratorConstAssignment_1_1()); 
                    // InternalMoba.g:832:3: ( rule__MobaGenerator__GeneratorConstAssignment_1_1 )
                    // InternalMoba.g:832:4: rule__MobaGenerator__GeneratorConstAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaGenerator__GeneratorConstAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaGeneratorAccess().getGeneratorConstAssignment_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaGenerator__Alternatives_1"


    // $ANTLR start "rule__MobaDataType__Alternatives_2_2_0"
    // InternalMoba.g:840:1: rule__MobaDataType__Alternatives_2_2_0 : ( ( ( rule__MobaDataType__DateAssignment_2_2_0_0 ) ) | ( ( rule__MobaDataType__DateAssignment_2_2_0_1 ) ) | ( ( rule__MobaDataType__DateAssignment_2_2_0_2 ) ) );
    public final void rule__MobaDataType__Alternatives_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:844:1: ( ( ( rule__MobaDataType__DateAssignment_2_2_0_0 ) ) | ( ( rule__MobaDataType__DateAssignment_2_2_0_1 ) ) | ( ( rule__MobaDataType__DateAssignment_2_2_0_2 ) ) )
            int alt4=3;
            switch ( input.LA(1) ) {
            case 46:
                {
                alt4=1;
                }
                break;
            case 47:
                {
                alt4=2;
                }
                break;
            case 48:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalMoba.g:845:2: ( ( rule__MobaDataType__DateAssignment_2_2_0_0 ) )
                    {
                    // InternalMoba.g:845:2: ( ( rule__MobaDataType__DateAssignment_2_2_0_0 ) )
                    // InternalMoba.g:846:3: ( rule__MobaDataType__DateAssignment_2_2_0_0 )
                    {
                     before(grammarAccess.getMobaDataTypeAccess().getDateAssignment_2_2_0_0()); 
                    // InternalMoba.g:847:3: ( rule__MobaDataType__DateAssignment_2_2_0_0 )
                    // InternalMoba.g:847:4: rule__MobaDataType__DateAssignment_2_2_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__DateAssignment_2_2_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDataTypeAccess().getDateAssignment_2_2_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:851:2: ( ( rule__MobaDataType__DateAssignment_2_2_0_1 ) )
                    {
                    // InternalMoba.g:851:2: ( ( rule__MobaDataType__DateAssignment_2_2_0_1 ) )
                    // InternalMoba.g:852:3: ( rule__MobaDataType__DateAssignment_2_2_0_1 )
                    {
                     before(grammarAccess.getMobaDataTypeAccess().getDateAssignment_2_2_0_1()); 
                    // InternalMoba.g:853:3: ( rule__MobaDataType__DateAssignment_2_2_0_1 )
                    // InternalMoba.g:853:4: rule__MobaDataType__DateAssignment_2_2_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__DateAssignment_2_2_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDataTypeAccess().getDateAssignment_2_2_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:857:2: ( ( rule__MobaDataType__DateAssignment_2_2_0_2 ) )
                    {
                    // InternalMoba.g:857:2: ( ( rule__MobaDataType__DateAssignment_2_2_0_2 ) )
                    // InternalMoba.g:858:3: ( rule__MobaDataType__DateAssignment_2_2_0_2 )
                    {
                     before(grammarAccess.getMobaDataTypeAccess().getDateAssignment_2_2_0_2()); 
                    // InternalMoba.g:859:3: ( rule__MobaDataType__DateAssignment_2_2_0_2 )
                    // InternalMoba.g:859:4: rule__MobaDataType__DateAssignment_2_2_0_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__DateAssignment_2_2_0_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDataTypeAccess().getDateAssignment_2_2_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Alternatives_2_2_0"


    // $ANTLR start "rule__MobaDataType__Alternatives_2_2_1_1"
    // InternalMoba.g:867:1: rule__MobaDataType__Alternatives_2_2_1_1 : ( ( ( rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0 ) ) | ( ( rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1 ) ) );
    public final void rule__MobaDataType__Alternatives_2_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:871:1: ( ( ( rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0 ) ) | ( ( rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1 ) ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMoba.g:872:2: ( ( rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0 ) )
                    {
                    // InternalMoba.g:872:2: ( ( rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0 ) )
                    // InternalMoba.g:873:3: ( rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0 )
                    {
                     before(grammarAccess.getMobaDataTypeAccess().getDateFormatStringAssignment_2_2_1_1_0()); 
                    // InternalMoba.g:874:3: ( rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0 )
                    // InternalMoba.g:874:4: rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDataTypeAccess().getDateFormatStringAssignment_2_2_1_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:878:2: ( ( rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1 ) )
                    {
                    // InternalMoba.g:878:2: ( ( rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1 ) )
                    // InternalMoba.g:879:3: ( rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1 )
                    {
                     before(grammarAccess.getMobaDataTypeAccess().getDateFormatConstantAssignment_2_2_1_1_1()); 
                    // InternalMoba.g:880:3: ( rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1 )
                    // InternalMoba.g:880:4: rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDataTypeAccess().getDateFormatConstantAssignment_2_2_1_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Alternatives_2_2_1_1"


    // $ANTLR start "rule__MobaProperty__Alternatives_0"
    // InternalMoba.g:888:1: rule__MobaProperty__Alternatives_0 : ( ( ( rule__MobaProperty__KeyStringAssignment_0_0 ) ) | ( ( rule__MobaProperty__KeyConstAssignment_0_1 ) ) );
    public final void rule__MobaProperty__Alternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:892:1: ( ( ( rule__MobaProperty__KeyStringAssignment_0_0 ) ) | ( ( rule__MobaProperty__KeyConstAssignment_0_1 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMoba.g:893:2: ( ( rule__MobaProperty__KeyStringAssignment_0_0 ) )
                    {
                    // InternalMoba.g:893:2: ( ( rule__MobaProperty__KeyStringAssignment_0_0 ) )
                    // InternalMoba.g:894:3: ( rule__MobaProperty__KeyStringAssignment_0_0 )
                    {
                     before(grammarAccess.getMobaPropertyAccess().getKeyStringAssignment_0_0()); 
                    // InternalMoba.g:895:3: ( rule__MobaProperty__KeyStringAssignment_0_0 )
                    // InternalMoba.g:895:4: rule__MobaProperty__KeyStringAssignment_0_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaProperty__KeyStringAssignment_0_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPropertyAccess().getKeyStringAssignment_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:899:2: ( ( rule__MobaProperty__KeyConstAssignment_0_1 ) )
                    {
                    // InternalMoba.g:899:2: ( ( rule__MobaProperty__KeyConstAssignment_0_1 ) )
                    // InternalMoba.g:900:3: ( rule__MobaProperty__KeyConstAssignment_0_1 )
                    {
                     before(grammarAccess.getMobaPropertyAccess().getKeyConstAssignment_0_1()); 
                    // InternalMoba.g:901:3: ( rule__MobaProperty__KeyConstAssignment_0_1 )
                    // InternalMoba.g:901:4: rule__MobaProperty__KeyConstAssignment_0_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaProperty__KeyConstAssignment_0_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPropertyAccess().getKeyConstAssignment_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__Alternatives_0"


    // $ANTLR start "rule__MobaProperty__Alternatives_2"
    // InternalMoba.g:909:1: rule__MobaProperty__Alternatives_2 : ( ( ( rule__MobaProperty__ValueStringAssignment_2_0 ) ) | ( ( rule__MobaProperty__ValueConstAssignment_2_1 ) ) );
    public final void rule__MobaProperty__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:913:1: ( ( ( rule__MobaProperty__ValueStringAssignment_2_0 ) ) | ( ( rule__MobaProperty__ValueConstAssignment_2_1 ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMoba.g:914:2: ( ( rule__MobaProperty__ValueStringAssignment_2_0 ) )
                    {
                    // InternalMoba.g:914:2: ( ( rule__MobaProperty__ValueStringAssignment_2_0 ) )
                    // InternalMoba.g:915:3: ( rule__MobaProperty__ValueStringAssignment_2_0 )
                    {
                     before(grammarAccess.getMobaPropertyAccess().getValueStringAssignment_2_0()); 
                    // InternalMoba.g:916:3: ( rule__MobaProperty__ValueStringAssignment_2_0 )
                    // InternalMoba.g:916:4: rule__MobaProperty__ValueStringAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaProperty__ValueStringAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPropertyAccess().getValueStringAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:920:2: ( ( rule__MobaProperty__ValueConstAssignment_2_1 ) )
                    {
                    // InternalMoba.g:920:2: ( ( rule__MobaProperty__ValueConstAssignment_2_1 ) )
                    // InternalMoba.g:921:3: ( rule__MobaProperty__ValueConstAssignment_2_1 )
                    {
                     before(grammarAccess.getMobaPropertyAccess().getValueConstAssignment_2_1()); 
                    // InternalMoba.g:922:3: ( rule__MobaProperty__ValueConstAssignment_2_1 )
                    // InternalMoba.g:922:4: rule__MobaProperty__ValueConstAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaProperty__ValueConstAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPropertyAccess().getValueConstAssignment_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__Alternatives_2"


    // $ANTLR start "rule__MobaData__Alternatives"
    // InternalMoba.g:930:1: rule__MobaData__Alternatives : ( ( ruleMobaDto ) | ( ruleMobaPayload ) | ( ruleMobaQueue ) );
    public final void rule__MobaData__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:934:1: ( ( ruleMobaDto ) | ( ruleMobaPayload ) | ( ruleMobaQueue ) )
            int alt8=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt8=1;
                }
                break;
            case 36:
                {
                alt8=2;
                }
                break;
            case 37:
                {
                alt8=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMoba.g:935:2: ( ruleMobaDto )
                    {
                    // InternalMoba.g:935:2: ( ruleMobaDto )
                    // InternalMoba.g:936:3: ruleMobaDto
                    {
                     before(grammarAccess.getMobaDataAccess().getMobaDtoParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaDto();

                    state._fsp--;

                     after(grammarAccess.getMobaDataAccess().getMobaDtoParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:941:2: ( ruleMobaPayload )
                    {
                    // InternalMoba.g:941:2: ( ruleMobaPayload )
                    // InternalMoba.g:942:3: ruleMobaPayload
                    {
                     before(grammarAccess.getMobaDataAccess().getMobaPayloadParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaPayload();

                    state._fsp--;

                     after(grammarAccess.getMobaDataAccess().getMobaPayloadParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:947:2: ( ruleMobaQueue )
                    {
                    // InternalMoba.g:947:2: ( ruleMobaQueue )
                    // InternalMoba.g:948:3: ruleMobaQueue
                    {
                     before(grammarAccess.getMobaDataAccess().getMobaQueueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaQueue();

                    state._fsp--;

                     after(grammarAccess.getMobaDataAccess().getMobaQueueParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaData__Alternatives"


    // $ANTLR start "rule__MobaCache__Alternatives_2_1_0_2"
    // InternalMoba.g:957:1: rule__MobaCache__Alternatives_2_1_0_2 : ( ( ( rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0 ) ) | ( ( rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1 ) ) );
    public final void rule__MobaCache__Alternatives_2_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:961:1: ( ( ( rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0 ) ) | ( ( rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1 ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            else if ( (LA9_0==RULE_ID) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // InternalMoba.g:962:2: ( ( rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0 ) )
                    {
                    // InternalMoba.g:962:2: ( ( rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0 ) )
                    // InternalMoba.g:963:3: ( rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0 )
                    {
                     before(grammarAccess.getMobaCacheAccess().getCacheTypeStringAssignment_2_1_0_2_0()); 
                    // InternalMoba.g:964:3: ( rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0 )
                    // InternalMoba.g:964:4: rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaCacheAccess().getCacheTypeStringAssignment_2_1_0_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:968:2: ( ( rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1 ) )
                    {
                    // InternalMoba.g:968:2: ( ( rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1 ) )
                    // InternalMoba.g:969:3: ( rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1 )
                    {
                     before(grammarAccess.getMobaCacheAccess().getCacheTypeConstAssignment_2_1_0_2_1()); 
                    // InternalMoba.g:970:3: ( rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1 )
                    // InternalMoba.g:970:4: rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaCacheAccess().getCacheTypeConstAssignment_2_1_0_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Alternatives_2_1_0_2"


    // $ANTLR start "rule__MobaCache__Alternatives_2_1_1_2"
    // InternalMoba.g:978:1: rule__MobaCache__Alternatives_2_1_1_2 : ( ( ( rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0 ) ) | ( ( rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1 ) ) );
    public final void rule__MobaCache__Alternatives_2_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:982:1: ( ( ( rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0 ) ) | ( ( rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1 ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_ID) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalMoba.g:983:2: ( ( rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0 ) )
                    {
                    // InternalMoba.g:983:2: ( ( rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0 ) )
                    // InternalMoba.g:984:3: ( rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0 )
                    {
                     before(grammarAccess.getMobaCacheAccess().getCacheStrategyStringAssignment_2_1_1_2_0()); 
                    // InternalMoba.g:985:3: ( rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0 )
                    // InternalMoba.g:985:4: rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaCacheAccess().getCacheStrategyStringAssignment_2_1_1_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:989:2: ( ( rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1 ) )
                    {
                    // InternalMoba.g:989:2: ( ( rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1 ) )
                    // InternalMoba.g:990:3: ( rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1 )
                    {
                     before(grammarAccess.getMobaCacheAccess().getCacheStrategyConstAssignment_2_1_1_2_1()); 
                    // InternalMoba.g:991:3: ( rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1 )
                    // InternalMoba.g:991:4: rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaCacheAccess().getCacheStrategyConstAssignment_2_1_1_2_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Alternatives_2_1_1_2"


    // $ANTLR start "rule__MobaService__Alternatives"
    // InternalMoba.g:999:1: rule__MobaService__Alternatives : ( ( ruleMobaRestCustom ) | ( ruleMobaRestCrud ) );
    public final void rule__MobaService__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1003:1: ( ( ruleMobaRestCustom ) | ( ruleMobaRestCrud ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==38) ) {
                alt11=1;
            }
            else if ( (LA11_0==39) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMoba.g:1004:2: ( ruleMobaRestCustom )
                    {
                    // InternalMoba.g:1004:2: ( ruleMobaRestCustom )
                    // InternalMoba.g:1005:3: ruleMobaRestCustom
                    {
                     before(grammarAccess.getMobaServiceAccess().getMobaRestCustomParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaRestCustom();

                    state._fsp--;

                     after(grammarAccess.getMobaServiceAccess().getMobaRestCustomParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:1010:2: ( ruleMobaRestCrud )
                    {
                    // InternalMoba.g:1010:2: ( ruleMobaRestCrud )
                    // InternalMoba.g:1011:3: ruleMobaRestCrud
                    {
                     before(grammarAccess.getMobaServiceAccess().getMobaRestCrudParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaRestCrud();

                    state._fsp--;

                     after(grammarAccess.getMobaServiceAccess().getMobaRestCrudParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaService__Alternatives"


    // $ANTLR start "rule__MobaDtoFeature__Alternatives"
    // InternalMoba.g:1020:1: rule__MobaDtoFeature__Alternatives : ( ( ruleMobaDtoAttribute ) | ( ruleMobaDtoReference ) );
    public final void rule__MobaDtoFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1024:1: ( ( ruleMobaDtoAttribute ) | ( ruleMobaDtoReference ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==40) ) {
                alt12=1;
            }
            else if ( (LA12_0==41) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoba.g:1025:2: ( ruleMobaDtoAttribute )
                    {
                    // InternalMoba.g:1025:2: ( ruleMobaDtoAttribute )
                    // InternalMoba.g:1026:3: ruleMobaDtoAttribute
                    {
                     before(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaDtoAttribute();

                    state._fsp--;

                     after(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:1031:2: ( ruleMobaDtoReference )
                    {
                    // InternalMoba.g:1031:2: ( ruleMobaDtoReference )
                    // InternalMoba.g:1032:3: ruleMobaDtoReference
                    {
                     before(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaDtoReference();

                    state._fsp--;

                     after(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoFeature__Alternatives"


    // $ANTLR start "rule__MobaPayloadFeature__Alternatives"
    // InternalMoba.g:1041:1: rule__MobaPayloadFeature__Alternatives : ( ( ruleMobaPayloadAttribute ) | ( ruleMobaPayloadReference ) );
    public final void rule__MobaPayloadFeature__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1045:1: ( ( ruleMobaPayloadAttribute ) | ( ruleMobaPayloadReference ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==40) ) {
                alt13=1;
            }
            else if ( (LA13_0==41) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoba.g:1046:2: ( ruleMobaPayloadAttribute )
                    {
                    // InternalMoba.g:1046:2: ( ruleMobaPayloadAttribute )
                    // InternalMoba.g:1047:3: ruleMobaPayloadAttribute
                    {
                     before(grammarAccess.getMobaPayloadFeatureAccess().getMobaPayloadAttributeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaPayloadAttribute();

                    state._fsp--;

                     after(grammarAccess.getMobaPayloadFeatureAccess().getMobaPayloadAttributeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:1052:2: ( ruleMobaPayloadReference )
                    {
                    // InternalMoba.g:1052:2: ( ruleMobaPayloadReference )
                    // InternalMoba.g:1053:3: ruleMobaPayloadReference
                    {
                     before(grammarAccess.getMobaPayloadFeatureAccess().getMobaPayloadReferenceParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleMobaPayloadReference();

                    state._fsp--;

                     after(grammarAccess.getMobaPayloadFeatureAccess().getMobaPayloadReferenceParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadFeature__Alternatives"


    // $ANTLR start "rule__MobaLowerBound__Alternatives"
    // InternalMoba.g:1062:1: rule__MobaLowerBound__Alternatives : ( ( ( '*' ) ) | ( ( '0' ) ) | ( ( '?' ) ) | ( ( '+' ) ) | ( ( '1' ) ) );
    public final void rule__MobaLowerBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1066:1: ( ( ( '*' ) ) | ( ( '0' ) ) | ( ( '?' ) ) | ( ( '+' ) ) | ( ( '1' ) ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 11:
                {
                alt14=1;
                }
                break;
            case 12:
                {
                alt14=2;
                }
                break;
            case 13:
                {
                alt14=3;
                }
                break;
            case 14:
                {
                alt14=4;
                }
                break;
            case 15:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // InternalMoba.g:1067:2: ( ( '*' ) )
                    {
                    // InternalMoba.g:1067:2: ( ( '*' ) )
                    // InternalMoba.g:1068:3: ( '*' )
                    {
                     before(grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0()); 
                    // InternalMoba.g:1069:3: ( '*' )
                    // InternalMoba.g:1069:4: '*'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:1073:2: ( ( '0' ) )
                    {
                    // InternalMoba.g:1073:2: ( ( '0' ) )
                    // InternalMoba.g:1074:3: ( '0' )
                    {
                     before(grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1()); 
                    // InternalMoba.g:1075:3: ( '0' )
                    // InternalMoba.g:1075:4: '0'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:1079:2: ( ( '?' ) )
                    {
                    // InternalMoba.g:1079:2: ( ( '?' ) )
                    // InternalMoba.g:1080:3: ( '?' )
                    {
                     before(grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2()); 
                    // InternalMoba.g:1081:3: ( '?' )
                    // InternalMoba.g:1081:4: '?'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:1085:2: ( ( '+' ) )
                    {
                    // InternalMoba.g:1085:2: ( ( '+' ) )
                    // InternalMoba.g:1086:3: ( '+' )
                    {
                     before(grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3()); 
                    // InternalMoba.g:1087:3: ( '+' )
                    // InternalMoba.g:1087:4: '+'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:1091:2: ( ( '1' ) )
                    {
                    // InternalMoba.g:1091:2: ( ( '1' ) )
                    // InternalMoba.g:1092:3: ( '1' )
                    {
                     before(grammarAccess.getMobaLowerBoundAccess().getONEEnumLiteralDeclaration_4()); 
                    // InternalMoba.g:1093:3: ( '1' )
                    // InternalMoba.g:1093:4: '1'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMobaLowerBoundAccess().getONEEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaLowerBound__Alternatives"


    // $ANTLR start "rule__MobaUpperBound__Alternatives"
    // InternalMoba.g:1101:1: rule__MobaUpperBound__Alternatives : ( ( ( '*' ) ) | ( ( '1' ) ) );
    public final void rule__MobaUpperBound__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1105:1: ( ( ( '*' ) ) | ( ( '1' ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==11) ) {
                alt15=1;
            }
            else if ( (LA15_0==15) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMoba.g:1106:2: ( ( '*' ) )
                    {
                    // InternalMoba.g:1106:2: ( ( '*' ) )
                    // InternalMoba.g:1107:3: ( '*' )
                    {
                     before(grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0()); 
                    // InternalMoba.g:1108:3: ( '*' )
                    // InternalMoba.g:1108:4: '*'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:1112:2: ( ( '1' ) )
                    {
                    // InternalMoba.g:1112:2: ( ( '1' ) )
                    // InternalMoba.g:1113:3: ( '1' )
                    {
                     before(grammarAccess.getMobaUpperBoundAccess().getONEEnumLiteralDeclaration_1()); 
                    // InternalMoba.g:1114:3: ( '1' )
                    // InternalMoba.g:1114:4: '1'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getMobaUpperBoundAccess().getONEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaUpperBound__Alternatives"


    // $ANTLR start "rule__MobaApplication__Group__0"
    // InternalMoba.g:1122:1: rule__MobaApplication__Group__0 : rule__MobaApplication__Group__0__Impl rule__MobaApplication__Group__1 ;
    public final void rule__MobaApplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1126:1: ( rule__MobaApplication__Group__0__Impl rule__MobaApplication__Group__1 )
            // InternalMoba.g:1127:2: rule__MobaApplication__Group__0__Impl rule__MobaApplication__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaApplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaApplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__0"


    // $ANTLR start "rule__MobaApplication__Group__0__Impl"
    // InternalMoba.g:1134:1: rule__MobaApplication__Group__0__Impl : ( 'application' ) ;
    public final void rule__MobaApplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1138:1: ( ( 'application' ) )
            // InternalMoba.g:1139:1: ( 'application' )
            {
            // InternalMoba.g:1139:1: ( 'application' )
            // InternalMoba.g:1140:2: 'application'
            {
             before(grammarAccess.getMobaApplicationAccess().getApplicationKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMobaApplicationAccess().getApplicationKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__0__Impl"


    // $ANTLR start "rule__MobaApplication__Group__1"
    // InternalMoba.g:1149:1: rule__MobaApplication__Group__1 : rule__MobaApplication__Group__1__Impl rule__MobaApplication__Group__2 ;
    public final void rule__MobaApplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1153:1: ( rule__MobaApplication__Group__1__Impl rule__MobaApplication__Group__2 )
            // InternalMoba.g:1154:2: rule__MobaApplication__Group__1__Impl rule__MobaApplication__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MobaApplication__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaApplication__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__1"


    // $ANTLR start "rule__MobaApplication__Group__1__Impl"
    // InternalMoba.g:1161:1: rule__MobaApplication__Group__1__Impl : ( ( rule__MobaApplication__NameAssignment_1 ) ) ;
    public final void rule__MobaApplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1165:1: ( ( ( rule__MobaApplication__NameAssignment_1 ) ) )
            // InternalMoba.g:1166:1: ( ( rule__MobaApplication__NameAssignment_1 ) )
            {
            // InternalMoba.g:1166:1: ( ( rule__MobaApplication__NameAssignment_1 ) )
            // InternalMoba.g:1167:2: ( rule__MobaApplication__NameAssignment_1 )
            {
             before(grammarAccess.getMobaApplicationAccess().getNameAssignment_1()); 
            // InternalMoba.g:1168:2: ( rule__MobaApplication__NameAssignment_1 )
            // InternalMoba.g:1168:3: rule__MobaApplication__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaApplication__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaApplicationAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__1__Impl"


    // $ANTLR start "rule__MobaApplication__Group__2"
    // InternalMoba.g:1176:1: rule__MobaApplication__Group__2 : rule__MobaApplication__Group__2__Impl rule__MobaApplication__Group__3 ;
    public final void rule__MobaApplication__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1180:1: ( rule__MobaApplication__Group__2__Impl rule__MobaApplication__Group__3 )
            // InternalMoba.g:1181:2: rule__MobaApplication__Group__2__Impl rule__MobaApplication__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MobaApplication__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaApplication__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__2"


    // $ANTLR start "rule__MobaApplication__Group__2__Impl"
    // InternalMoba.g:1188:1: rule__MobaApplication__Group__2__Impl : ( '{' ) ;
    public final void rule__MobaApplication__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1192:1: ( ( '{' ) )
            // InternalMoba.g:1193:1: ( '{' )
            {
            // InternalMoba.g:1193:1: ( '{' )
            // InternalMoba.g:1194:2: '{'
            {
             before(grammarAccess.getMobaApplicationAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMobaApplicationAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__2__Impl"


    // $ANTLR start "rule__MobaApplication__Group__3"
    // InternalMoba.g:1203:1: rule__MobaApplication__Group__3 : rule__MobaApplication__Group__3__Impl rule__MobaApplication__Group__4 ;
    public final void rule__MobaApplication__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1207:1: ( rule__MobaApplication__Group__3__Impl rule__MobaApplication__Group__4 )
            // InternalMoba.g:1208:2: rule__MobaApplication__Group__3__Impl rule__MobaApplication__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__MobaApplication__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaApplication__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__3"


    // $ANTLR start "rule__MobaApplication__Group__3__Impl"
    // InternalMoba.g:1215:1: rule__MobaApplication__Group__3__Impl : ( ( rule__MobaApplication__FeaturesAssignment_3 )* ) ;
    public final void rule__MobaApplication__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1219:1: ( ( ( rule__MobaApplication__FeaturesAssignment_3 )* ) )
            // InternalMoba.g:1220:1: ( ( rule__MobaApplication__FeaturesAssignment_3 )* )
            {
            // InternalMoba.g:1220:1: ( ( rule__MobaApplication__FeaturesAssignment_3 )* )
            // InternalMoba.g:1221:2: ( rule__MobaApplication__FeaturesAssignment_3 )*
            {
             before(grammarAccess.getMobaApplicationAccess().getFeaturesAssignment_3()); 
            // InternalMoba.g:1222:2: ( rule__MobaApplication__FeaturesAssignment_3 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=19 && LA16_0<=21)||LA16_0==24||LA16_0==29||LA16_0==34||(LA16_0>=36 && LA16_0<=39)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalMoba.g:1222:3: rule__MobaApplication__FeaturesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__MobaApplication__FeaturesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getMobaApplicationAccess().getFeaturesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__3__Impl"


    // $ANTLR start "rule__MobaApplication__Group__4"
    // InternalMoba.g:1230:1: rule__MobaApplication__Group__4 : rule__MobaApplication__Group__4__Impl ;
    public final void rule__MobaApplication__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1234:1: ( rule__MobaApplication__Group__4__Impl )
            // InternalMoba.g:1235:2: rule__MobaApplication__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaApplication__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__4"


    // $ANTLR start "rule__MobaApplication__Group__4__Impl"
    // InternalMoba.g:1241:1: rule__MobaApplication__Group__4__Impl : ( '}' ) ;
    public final void rule__MobaApplication__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1245:1: ( ( '}' ) )
            // InternalMoba.g:1246:1: ( '}' )
            {
            // InternalMoba.g:1246:1: ( '}' )
            // InternalMoba.g:1247:2: '}'
            {
             before(grammarAccess.getMobaApplicationAccess().getRightCurlyBracketKeyword_4()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMobaApplicationAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__Group__4__Impl"


    // $ANTLR start "rule__MobaTemplate__Group__0"
    // InternalMoba.g:1257:1: rule__MobaTemplate__Group__0 : rule__MobaTemplate__Group__0__Impl rule__MobaTemplate__Group__1 ;
    public final void rule__MobaTemplate__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1261:1: ( rule__MobaTemplate__Group__0__Impl rule__MobaTemplate__Group__1 )
            // InternalMoba.g:1262:2: rule__MobaTemplate__Group__0__Impl rule__MobaTemplate__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaTemplate__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaTemplate__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaTemplate__Group__0"


    // $ANTLR start "rule__MobaTemplate__Group__0__Impl"
    // InternalMoba.g:1269:1: rule__MobaTemplate__Group__0__Impl : ( 'use template' ) ;
    public final void rule__MobaTemplate__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1273:1: ( ( 'use template' ) )
            // InternalMoba.g:1274:1: ( 'use template' )
            {
            // InternalMoba.g:1274:1: ( 'use template' )
            // InternalMoba.g:1275:2: 'use template'
            {
             before(grammarAccess.getMobaTemplateAccess().getUseTemplateKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getMobaTemplateAccess().getUseTemplateKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaTemplate__Group__0__Impl"


    // $ANTLR start "rule__MobaTemplate__Group__1"
    // InternalMoba.g:1284:1: rule__MobaTemplate__Group__1 : rule__MobaTemplate__Group__1__Impl ;
    public final void rule__MobaTemplate__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1288:1: ( rule__MobaTemplate__Group__1__Impl )
            // InternalMoba.g:1289:2: rule__MobaTemplate__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaTemplate__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaTemplate__Group__1"


    // $ANTLR start "rule__MobaTemplate__Group__1__Impl"
    // InternalMoba.g:1295:1: rule__MobaTemplate__Group__1__Impl : ( ( rule__MobaTemplate__TemplateAssignment_1 ) ) ;
    public final void rule__MobaTemplate__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1299:1: ( ( ( rule__MobaTemplate__TemplateAssignment_1 ) ) )
            // InternalMoba.g:1300:1: ( ( rule__MobaTemplate__TemplateAssignment_1 ) )
            {
            // InternalMoba.g:1300:1: ( ( rule__MobaTemplate__TemplateAssignment_1 ) )
            // InternalMoba.g:1301:2: ( rule__MobaTemplate__TemplateAssignment_1 )
            {
             before(grammarAccess.getMobaTemplateAccess().getTemplateAssignment_1()); 
            // InternalMoba.g:1302:2: ( rule__MobaTemplate__TemplateAssignment_1 )
            // InternalMoba.g:1302:3: rule__MobaTemplate__TemplateAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaTemplate__TemplateAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaTemplateAccess().getTemplateAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaTemplate__Group__1__Impl"


    // $ANTLR start "rule__MobaGenerator__Group__0"
    // InternalMoba.g:1311:1: rule__MobaGenerator__Group__0 : rule__MobaGenerator__Group__0__Impl rule__MobaGenerator__Group__1 ;
    public final void rule__MobaGenerator__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1315:1: ( rule__MobaGenerator__Group__0__Impl rule__MobaGenerator__Group__1 )
            // InternalMoba.g:1316:2: rule__MobaGenerator__Group__0__Impl rule__MobaGenerator__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MobaGenerator__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaGenerator__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaGenerator__Group__0"


    // $ANTLR start "rule__MobaGenerator__Group__0__Impl"
    // InternalMoba.g:1323:1: rule__MobaGenerator__Group__0__Impl : ( 'use generator' ) ;
    public final void rule__MobaGenerator__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1327:1: ( ( 'use generator' ) )
            // InternalMoba.g:1328:1: ( 'use generator' )
            {
            // InternalMoba.g:1328:1: ( 'use generator' )
            // InternalMoba.g:1329:2: 'use generator'
            {
             before(grammarAccess.getMobaGeneratorAccess().getUseGeneratorKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getMobaGeneratorAccess().getUseGeneratorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaGenerator__Group__0__Impl"


    // $ANTLR start "rule__MobaGenerator__Group__1"
    // InternalMoba.g:1338:1: rule__MobaGenerator__Group__1 : rule__MobaGenerator__Group__1__Impl ;
    public final void rule__MobaGenerator__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1342:1: ( rule__MobaGenerator__Group__1__Impl )
            // InternalMoba.g:1343:2: rule__MobaGenerator__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaGenerator__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaGenerator__Group__1"


    // $ANTLR start "rule__MobaGenerator__Group__1__Impl"
    // InternalMoba.g:1349:1: rule__MobaGenerator__Group__1__Impl : ( ( rule__MobaGenerator__Alternatives_1 ) ) ;
    public final void rule__MobaGenerator__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1353:1: ( ( ( rule__MobaGenerator__Alternatives_1 ) ) )
            // InternalMoba.g:1354:1: ( ( rule__MobaGenerator__Alternatives_1 ) )
            {
            // InternalMoba.g:1354:1: ( ( rule__MobaGenerator__Alternatives_1 ) )
            // InternalMoba.g:1355:2: ( rule__MobaGenerator__Alternatives_1 )
            {
             before(grammarAccess.getMobaGeneratorAccess().getAlternatives_1()); 
            // InternalMoba.g:1356:2: ( rule__MobaGenerator__Alternatives_1 )
            // InternalMoba.g:1356:3: rule__MobaGenerator__Alternatives_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaGenerator__Alternatives_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaGeneratorAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaGenerator__Group__1__Impl"


    // $ANTLR start "rule__MobaDataType__Group__0"
    // InternalMoba.g:1365:1: rule__MobaDataType__Group__0 : rule__MobaDataType__Group__0__Impl rule__MobaDataType__Group__1 ;
    public final void rule__MobaDataType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1369:1: ( rule__MobaDataType__Group__0__Impl rule__MobaDataType__Group__1 )
            // InternalMoba.g:1370:2: rule__MobaDataType__Group__0__Impl rule__MobaDataType__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaDataType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group__0"


    // $ANTLR start "rule__MobaDataType__Group__0__Impl"
    // InternalMoba.g:1377:1: rule__MobaDataType__Group__0__Impl : ( 'datatype' ) ;
    public final void rule__MobaDataType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1381:1: ( ( 'datatype' ) )
            // InternalMoba.g:1382:1: ( 'datatype' )
            {
            // InternalMoba.g:1382:1: ( 'datatype' )
            // InternalMoba.g:1383:2: 'datatype'
            {
             before(grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group__0__Impl"


    // $ANTLR start "rule__MobaDataType__Group__1"
    // InternalMoba.g:1392:1: rule__MobaDataType__Group__1 : rule__MobaDataType__Group__1__Impl rule__MobaDataType__Group__2 ;
    public final void rule__MobaDataType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1396:1: ( rule__MobaDataType__Group__1__Impl rule__MobaDataType__Group__2 )
            // InternalMoba.g:1397:2: rule__MobaDataType__Group__1__Impl rule__MobaDataType__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__MobaDataType__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group__1"


    // $ANTLR start "rule__MobaDataType__Group__1__Impl"
    // InternalMoba.g:1404:1: rule__MobaDataType__Group__1__Impl : ( ( rule__MobaDataType__NameAssignment_1 ) ) ;
    public final void rule__MobaDataType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1408:1: ( ( ( rule__MobaDataType__NameAssignment_1 ) ) )
            // InternalMoba.g:1409:1: ( ( rule__MobaDataType__NameAssignment_1 ) )
            {
            // InternalMoba.g:1409:1: ( ( rule__MobaDataType__NameAssignment_1 ) )
            // InternalMoba.g:1410:2: ( rule__MobaDataType__NameAssignment_1 )
            {
             before(grammarAccess.getMobaDataTypeAccess().getNameAssignment_1()); 
            // InternalMoba.g:1411:2: ( rule__MobaDataType__NameAssignment_1 )
            // InternalMoba.g:1411:3: rule__MobaDataType__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaDataType__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaDataTypeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group__1__Impl"


    // $ANTLR start "rule__MobaDataType__Group__2"
    // InternalMoba.g:1419:1: rule__MobaDataType__Group__2 : rule__MobaDataType__Group__2__Impl rule__MobaDataType__Group__3 ;
    public final void rule__MobaDataType__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1423:1: ( rule__MobaDataType__Group__2__Impl rule__MobaDataType__Group__3 )
            // InternalMoba.g:1424:2: rule__MobaDataType__Group__2__Impl rule__MobaDataType__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MobaDataType__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group__2"


    // $ANTLR start "rule__MobaDataType__Group__2__Impl"
    // InternalMoba.g:1431:1: rule__MobaDataType__Group__2__Impl : ( ( rule__MobaDataType__UnorderedGroup_2 ) ) ;
    public final void rule__MobaDataType__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1435:1: ( ( ( rule__MobaDataType__UnorderedGroup_2 ) ) )
            // InternalMoba.g:1436:1: ( ( rule__MobaDataType__UnorderedGroup_2 ) )
            {
            // InternalMoba.g:1436:1: ( ( rule__MobaDataType__UnorderedGroup_2 ) )
            // InternalMoba.g:1437:2: ( rule__MobaDataType__UnorderedGroup_2 )
            {
             before(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2()); 
            // InternalMoba.g:1438:2: ( rule__MobaDataType__UnorderedGroup_2 )
            // InternalMoba.g:1438:3: rule__MobaDataType__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaDataType__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group__2__Impl"


    // $ANTLR start "rule__MobaDataType__Group__3"
    // InternalMoba.g:1446:1: rule__MobaDataType__Group__3 : rule__MobaDataType__Group__3__Impl ;
    public final void rule__MobaDataType__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1450:1: ( rule__MobaDataType__Group__3__Impl )
            // InternalMoba.g:1451:2: rule__MobaDataType__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group__3"


    // $ANTLR start "rule__MobaDataType__Group__3__Impl"
    // InternalMoba.g:1457:1: rule__MobaDataType__Group__3__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaDataType__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1461:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:1462:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:1462:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:1463:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaDataTypeAccess().getMobaPropertiesProviderParserRuleCall_3()); 
            // InternalMoba.g:1464:2: ( ruleMobaPropertiesProvider )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMoba.g:1464:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaDataTypeAccess().getMobaPropertiesProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group__3__Impl"


    // $ANTLR start "rule__MobaDataType__Group_2_2__0"
    // InternalMoba.g:1473:1: rule__MobaDataType__Group_2_2__0 : rule__MobaDataType__Group_2_2__0__Impl rule__MobaDataType__Group_2_2__1 ;
    public final void rule__MobaDataType__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1477:1: ( rule__MobaDataType__Group_2_2__0__Impl rule__MobaDataType__Group_2_2__1 )
            // InternalMoba.g:1478:2: rule__MobaDataType__Group_2_2__0__Impl rule__MobaDataType__Group_2_2__1
            {
            pushFollow(FOLLOW_10);
            rule__MobaDataType__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2__0"


    // $ANTLR start "rule__MobaDataType__Group_2_2__0__Impl"
    // InternalMoba.g:1485:1: rule__MobaDataType__Group_2_2__0__Impl : ( ( rule__MobaDataType__Alternatives_2_2_0 ) ) ;
    public final void rule__MobaDataType__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1489:1: ( ( ( rule__MobaDataType__Alternatives_2_2_0 ) ) )
            // InternalMoba.g:1490:1: ( ( rule__MobaDataType__Alternatives_2_2_0 ) )
            {
            // InternalMoba.g:1490:1: ( ( rule__MobaDataType__Alternatives_2_2_0 ) )
            // InternalMoba.g:1491:2: ( rule__MobaDataType__Alternatives_2_2_0 )
            {
             before(grammarAccess.getMobaDataTypeAccess().getAlternatives_2_2_0()); 
            // InternalMoba.g:1492:2: ( rule__MobaDataType__Alternatives_2_2_0 )
            // InternalMoba.g:1492:3: rule__MobaDataType__Alternatives_2_2_0
            {
            pushFollow(FOLLOW_2);
            rule__MobaDataType__Alternatives_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getMobaDataTypeAccess().getAlternatives_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2__0__Impl"


    // $ANTLR start "rule__MobaDataType__Group_2_2__1"
    // InternalMoba.g:1500:1: rule__MobaDataType__Group_2_2__1 : rule__MobaDataType__Group_2_2__1__Impl ;
    public final void rule__MobaDataType__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1504:1: ( rule__MobaDataType__Group_2_2__1__Impl )
            // InternalMoba.g:1505:2: rule__MobaDataType__Group_2_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group_2_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2__1"


    // $ANTLR start "rule__MobaDataType__Group_2_2__1__Impl"
    // InternalMoba.g:1511:1: rule__MobaDataType__Group_2_2__1__Impl : ( ( rule__MobaDataType__Group_2_2_1__0 )? ) ;
    public final void rule__MobaDataType__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1515:1: ( ( ( rule__MobaDataType__Group_2_2_1__0 )? ) )
            // InternalMoba.g:1516:1: ( ( rule__MobaDataType__Group_2_2_1__0 )? )
            {
            // InternalMoba.g:1516:1: ( ( rule__MobaDataType__Group_2_2_1__0 )? )
            // InternalMoba.g:1517:2: ( rule__MobaDataType__Group_2_2_1__0 )?
            {
             before(grammarAccess.getMobaDataTypeAccess().getGroup_2_2_1()); 
            // InternalMoba.g:1518:2: ( rule__MobaDataType__Group_2_2_1__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==22) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMoba.g:1518:3: rule__MobaDataType__Group_2_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__Group_2_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaDataTypeAccess().getGroup_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2__1__Impl"


    // $ANTLR start "rule__MobaDataType__Group_2_2_1__0"
    // InternalMoba.g:1527:1: rule__MobaDataType__Group_2_2_1__0 : rule__MobaDataType__Group_2_2_1__0__Impl rule__MobaDataType__Group_2_2_1__1 ;
    public final void rule__MobaDataType__Group_2_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1531:1: ( rule__MobaDataType__Group_2_2_1__0__Impl rule__MobaDataType__Group_2_2_1__1 )
            // InternalMoba.g:1532:2: rule__MobaDataType__Group_2_2_1__0__Impl rule__MobaDataType__Group_2_2_1__1
            {
            pushFollow(FOLLOW_7);
            rule__MobaDataType__Group_2_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group_2_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2_1__0"


    // $ANTLR start "rule__MobaDataType__Group_2_2_1__0__Impl"
    // InternalMoba.g:1539:1: rule__MobaDataType__Group_2_2_1__0__Impl : ( '(' ) ;
    public final void rule__MobaDataType__Group_2_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1543:1: ( ( '(' ) )
            // InternalMoba.g:1544:1: ( '(' )
            {
            // InternalMoba.g:1544:1: ( '(' )
            // InternalMoba.g:1545:2: '('
            {
             before(grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_2_2_1_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2_1__0__Impl"


    // $ANTLR start "rule__MobaDataType__Group_2_2_1__1"
    // InternalMoba.g:1554:1: rule__MobaDataType__Group_2_2_1__1 : rule__MobaDataType__Group_2_2_1__1__Impl rule__MobaDataType__Group_2_2_1__2 ;
    public final void rule__MobaDataType__Group_2_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1558:1: ( rule__MobaDataType__Group_2_2_1__1__Impl rule__MobaDataType__Group_2_2_1__2 )
            // InternalMoba.g:1559:2: rule__MobaDataType__Group_2_2_1__1__Impl rule__MobaDataType__Group_2_2_1__2
            {
            pushFollow(FOLLOW_11);
            rule__MobaDataType__Group_2_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group_2_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2_1__1"


    // $ANTLR start "rule__MobaDataType__Group_2_2_1__1__Impl"
    // InternalMoba.g:1566:1: rule__MobaDataType__Group_2_2_1__1__Impl : ( ( rule__MobaDataType__Alternatives_2_2_1_1 ) ) ;
    public final void rule__MobaDataType__Group_2_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1570:1: ( ( ( rule__MobaDataType__Alternatives_2_2_1_1 ) ) )
            // InternalMoba.g:1571:1: ( ( rule__MobaDataType__Alternatives_2_2_1_1 ) )
            {
            // InternalMoba.g:1571:1: ( ( rule__MobaDataType__Alternatives_2_2_1_1 ) )
            // InternalMoba.g:1572:2: ( rule__MobaDataType__Alternatives_2_2_1_1 )
            {
             before(grammarAccess.getMobaDataTypeAccess().getAlternatives_2_2_1_1()); 
            // InternalMoba.g:1573:2: ( rule__MobaDataType__Alternatives_2_2_1_1 )
            // InternalMoba.g:1573:3: rule__MobaDataType__Alternatives_2_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaDataType__Alternatives_2_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaDataTypeAccess().getAlternatives_2_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2_1__1__Impl"


    // $ANTLR start "rule__MobaDataType__Group_2_2_1__2"
    // InternalMoba.g:1581:1: rule__MobaDataType__Group_2_2_1__2 : rule__MobaDataType__Group_2_2_1__2__Impl ;
    public final void rule__MobaDataType__Group_2_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1585:1: ( rule__MobaDataType__Group_2_2_1__2__Impl )
            // InternalMoba.g:1586:2: rule__MobaDataType__Group_2_2_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDataType__Group_2_2_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2_1__2"


    // $ANTLR start "rule__MobaDataType__Group_2_2_1__2__Impl"
    // InternalMoba.g:1592:1: rule__MobaDataType__Group_2_2_1__2__Impl : ( ')' ) ;
    public final void rule__MobaDataType__Group_2_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1596:1: ( ( ')' ) )
            // InternalMoba.g:1597:1: ( ')' )
            {
            // InternalMoba.g:1597:1: ( ')' )
            // InternalMoba.g:1598:2: ')'
            {
             before(grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_2_2_1_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_2_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__Group_2_2_1__2__Impl"


    // $ANTLR start "rule__MobaConstant__Group__0"
    // InternalMoba.g:1608:1: rule__MobaConstant__Group__0 : rule__MobaConstant__Group__0__Impl rule__MobaConstant__Group__1 ;
    public final void rule__MobaConstant__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1612:1: ( rule__MobaConstant__Group__0__Impl rule__MobaConstant__Group__1 )
            // InternalMoba.g:1613:2: rule__MobaConstant__Group__0__Impl rule__MobaConstant__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaConstant__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaConstant__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__0"


    // $ANTLR start "rule__MobaConstant__Group__0__Impl"
    // InternalMoba.g:1620:1: rule__MobaConstant__Group__0__Impl : ( 'const' ) ;
    public final void rule__MobaConstant__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1624:1: ( ( 'const' ) )
            // InternalMoba.g:1625:1: ( 'const' )
            {
            // InternalMoba.g:1625:1: ( 'const' )
            // InternalMoba.g:1626:2: 'const'
            {
             before(grammarAccess.getMobaConstantAccess().getConstKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getMobaConstantAccess().getConstKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__0__Impl"


    // $ANTLR start "rule__MobaConstant__Group__1"
    // InternalMoba.g:1635:1: rule__MobaConstant__Group__1 : rule__MobaConstant__Group__1__Impl rule__MobaConstant__Group__2 ;
    public final void rule__MobaConstant__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1639:1: ( rule__MobaConstant__Group__1__Impl rule__MobaConstant__Group__2 )
            // InternalMoba.g:1640:2: rule__MobaConstant__Group__1__Impl rule__MobaConstant__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__MobaConstant__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaConstant__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__1"


    // $ANTLR start "rule__MobaConstant__Group__1__Impl"
    // InternalMoba.g:1647:1: rule__MobaConstant__Group__1__Impl : ( ( rule__MobaConstant__NameAssignment_1 ) ) ;
    public final void rule__MobaConstant__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1651:1: ( ( ( rule__MobaConstant__NameAssignment_1 ) ) )
            // InternalMoba.g:1652:1: ( ( rule__MobaConstant__NameAssignment_1 ) )
            {
            // InternalMoba.g:1652:1: ( ( rule__MobaConstant__NameAssignment_1 ) )
            // InternalMoba.g:1653:2: ( rule__MobaConstant__NameAssignment_1 )
            {
             before(grammarAccess.getMobaConstantAccess().getNameAssignment_1()); 
            // InternalMoba.g:1654:2: ( rule__MobaConstant__NameAssignment_1 )
            // InternalMoba.g:1654:3: rule__MobaConstant__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaConstant__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaConstantAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__1__Impl"


    // $ANTLR start "rule__MobaConstant__Group__2"
    // InternalMoba.g:1662:1: rule__MobaConstant__Group__2 : rule__MobaConstant__Group__2__Impl rule__MobaConstant__Group__3 ;
    public final void rule__MobaConstant__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1666:1: ( rule__MobaConstant__Group__2__Impl rule__MobaConstant__Group__3 )
            // InternalMoba.g:1667:2: rule__MobaConstant__Group__2__Impl rule__MobaConstant__Group__3
            {
            pushFollow(FOLLOW_13);
            rule__MobaConstant__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaConstant__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__2"


    // $ANTLR start "rule__MobaConstant__Group__2__Impl"
    // InternalMoba.g:1674:1: rule__MobaConstant__Group__2__Impl : ( '=' ) ;
    public final void rule__MobaConstant__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1678:1: ( ( '=' ) )
            // InternalMoba.g:1679:1: ( '=' )
            {
            // InternalMoba.g:1679:1: ( '=' )
            // InternalMoba.g:1680:2: '='
            {
             before(grammarAccess.getMobaConstantAccess().getEqualsSignKeyword_2()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMobaConstantAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__2__Impl"


    // $ANTLR start "rule__MobaConstant__Group__3"
    // InternalMoba.g:1689:1: rule__MobaConstant__Group__3 : rule__MobaConstant__Group__3__Impl rule__MobaConstant__Group__4 ;
    public final void rule__MobaConstant__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1693:1: ( rule__MobaConstant__Group__3__Impl rule__MobaConstant__Group__4 )
            // InternalMoba.g:1694:2: rule__MobaConstant__Group__3__Impl rule__MobaConstant__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__MobaConstant__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaConstant__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__3"


    // $ANTLR start "rule__MobaConstant__Group__3__Impl"
    // InternalMoba.g:1701:1: rule__MobaConstant__Group__3__Impl : ( ( rule__MobaConstant__ValueAssignment_3 ) ) ;
    public final void rule__MobaConstant__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1705:1: ( ( ( rule__MobaConstant__ValueAssignment_3 ) ) )
            // InternalMoba.g:1706:1: ( ( rule__MobaConstant__ValueAssignment_3 ) )
            {
            // InternalMoba.g:1706:1: ( ( rule__MobaConstant__ValueAssignment_3 ) )
            // InternalMoba.g:1707:2: ( rule__MobaConstant__ValueAssignment_3 )
            {
             before(grammarAccess.getMobaConstantAccess().getValueAssignment_3()); 
            // InternalMoba.g:1708:2: ( rule__MobaConstant__ValueAssignment_3 )
            // InternalMoba.g:1708:3: rule__MobaConstant__ValueAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MobaConstant__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMobaConstantAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__3__Impl"


    // $ANTLR start "rule__MobaConstant__Group__4"
    // InternalMoba.g:1716:1: rule__MobaConstant__Group__4 : rule__MobaConstant__Group__4__Impl ;
    public final void rule__MobaConstant__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1720:1: ( rule__MobaConstant__Group__4__Impl )
            // InternalMoba.g:1721:2: rule__MobaConstant__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaConstant__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__4"


    // $ANTLR start "rule__MobaConstant__Group__4__Impl"
    // InternalMoba.g:1727:1: rule__MobaConstant__Group__4__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaConstant__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1731:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:1732:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:1732:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:1733:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaConstantAccess().getMobaPropertiesProviderParserRuleCall_4()); 
            // InternalMoba.g:1734:2: ( ruleMobaPropertiesProvider )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==26) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMoba.g:1734:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaConstantAccess().getMobaPropertiesProviderParserRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__Group__4__Impl"


    // $ANTLR start "rule__MobaPropertiesProvider__Group__0"
    // InternalMoba.g:1743:1: rule__MobaPropertiesProvider__Group__0 : rule__MobaPropertiesProvider__Group__0__Impl rule__MobaPropertiesProvider__Group__1 ;
    public final void rule__MobaPropertiesProvider__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1747:1: ( rule__MobaPropertiesProvider__Group__0__Impl rule__MobaPropertiesProvider__Group__1 )
            // InternalMoba.g:1748:2: rule__MobaPropertiesProvider__Group__0__Impl rule__MobaPropertiesProvider__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__MobaPropertiesProvider__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPropertiesProvider__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group__0"


    // $ANTLR start "rule__MobaPropertiesProvider__Group__0__Impl"
    // InternalMoba.g:1755:1: rule__MobaPropertiesProvider__Group__0__Impl : ( '[' ) ;
    public final void rule__MobaPropertiesProvider__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1759:1: ( ( '[' ) )
            // InternalMoba.g:1760:1: ( '[' )
            {
            // InternalMoba.g:1760:1: ( '[' )
            // InternalMoba.g:1761:2: '['
            {
             before(grammarAccess.getMobaPropertiesProviderAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMobaPropertiesProviderAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group__0__Impl"


    // $ANTLR start "rule__MobaPropertiesProvider__Group__1"
    // InternalMoba.g:1770:1: rule__MobaPropertiesProvider__Group__1 : rule__MobaPropertiesProvider__Group__1__Impl rule__MobaPropertiesProvider__Group__2 ;
    public final void rule__MobaPropertiesProvider__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1774:1: ( rule__MobaPropertiesProvider__Group__1__Impl rule__MobaPropertiesProvider__Group__2 )
            // InternalMoba.g:1775:2: rule__MobaPropertiesProvider__Group__1__Impl rule__MobaPropertiesProvider__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__MobaPropertiesProvider__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPropertiesProvider__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group__1"


    // $ANTLR start "rule__MobaPropertiesProvider__Group__1__Impl"
    // InternalMoba.g:1782:1: rule__MobaPropertiesProvider__Group__1__Impl : ( ( rule__MobaPropertiesProvider__PropertiesAssignment_1 ) ) ;
    public final void rule__MobaPropertiesProvider__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1786:1: ( ( ( rule__MobaPropertiesProvider__PropertiesAssignment_1 ) ) )
            // InternalMoba.g:1787:1: ( ( rule__MobaPropertiesProvider__PropertiesAssignment_1 ) )
            {
            // InternalMoba.g:1787:1: ( ( rule__MobaPropertiesProvider__PropertiesAssignment_1 ) )
            // InternalMoba.g:1788:2: ( rule__MobaPropertiesProvider__PropertiesAssignment_1 )
            {
             before(grammarAccess.getMobaPropertiesProviderAccess().getPropertiesAssignment_1()); 
            // InternalMoba.g:1789:2: ( rule__MobaPropertiesProvider__PropertiesAssignment_1 )
            // InternalMoba.g:1789:3: rule__MobaPropertiesProvider__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaPropertiesProvider__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaPropertiesProviderAccess().getPropertiesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group__1__Impl"


    // $ANTLR start "rule__MobaPropertiesProvider__Group__2"
    // InternalMoba.g:1797:1: rule__MobaPropertiesProvider__Group__2 : rule__MobaPropertiesProvider__Group__2__Impl rule__MobaPropertiesProvider__Group__3 ;
    public final void rule__MobaPropertiesProvider__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1801:1: ( rule__MobaPropertiesProvider__Group__2__Impl rule__MobaPropertiesProvider__Group__3 )
            // InternalMoba.g:1802:2: rule__MobaPropertiesProvider__Group__2__Impl rule__MobaPropertiesProvider__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__MobaPropertiesProvider__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPropertiesProvider__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group__2"


    // $ANTLR start "rule__MobaPropertiesProvider__Group__2__Impl"
    // InternalMoba.g:1809:1: rule__MobaPropertiesProvider__Group__2__Impl : ( ( rule__MobaPropertiesProvider__Group_2__0 )* ) ;
    public final void rule__MobaPropertiesProvider__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1813:1: ( ( ( rule__MobaPropertiesProvider__Group_2__0 )* ) )
            // InternalMoba.g:1814:1: ( ( rule__MobaPropertiesProvider__Group_2__0 )* )
            {
            // InternalMoba.g:1814:1: ( ( rule__MobaPropertiesProvider__Group_2__0 )* )
            // InternalMoba.g:1815:2: ( rule__MobaPropertiesProvider__Group_2__0 )*
            {
             before(grammarAccess.getMobaPropertiesProviderAccess().getGroup_2()); 
            // InternalMoba.g:1816:2: ( rule__MobaPropertiesProvider__Group_2__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==28) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // InternalMoba.g:1816:3: rule__MobaPropertiesProvider__Group_2__0
            	    {
            	    pushFollow(FOLLOW_15);
            	    rule__MobaPropertiesProvider__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

             after(grammarAccess.getMobaPropertiesProviderAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group__2__Impl"


    // $ANTLR start "rule__MobaPropertiesProvider__Group__3"
    // InternalMoba.g:1824:1: rule__MobaPropertiesProvider__Group__3 : rule__MobaPropertiesProvider__Group__3__Impl ;
    public final void rule__MobaPropertiesProvider__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1828:1: ( rule__MobaPropertiesProvider__Group__3__Impl )
            // InternalMoba.g:1829:2: rule__MobaPropertiesProvider__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaPropertiesProvider__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group__3"


    // $ANTLR start "rule__MobaPropertiesProvider__Group__3__Impl"
    // InternalMoba.g:1835:1: rule__MobaPropertiesProvider__Group__3__Impl : ( ']' ) ;
    public final void rule__MobaPropertiesProvider__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1839:1: ( ( ']' ) )
            // InternalMoba.g:1840:1: ( ']' )
            {
            // InternalMoba.g:1840:1: ( ']' )
            // InternalMoba.g:1841:2: ']'
            {
             before(grammarAccess.getMobaPropertiesProviderAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMobaPropertiesProviderAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group__3__Impl"


    // $ANTLR start "rule__MobaPropertiesProvider__Group_2__0"
    // InternalMoba.g:1851:1: rule__MobaPropertiesProvider__Group_2__0 : rule__MobaPropertiesProvider__Group_2__0__Impl rule__MobaPropertiesProvider__Group_2__1 ;
    public final void rule__MobaPropertiesProvider__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1855:1: ( rule__MobaPropertiesProvider__Group_2__0__Impl rule__MobaPropertiesProvider__Group_2__1 )
            // InternalMoba.g:1856:2: rule__MobaPropertiesProvider__Group_2__0__Impl rule__MobaPropertiesProvider__Group_2__1
            {
            pushFollow(FOLLOW_7);
            rule__MobaPropertiesProvider__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPropertiesProvider__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group_2__0"


    // $ANTLR start "rule__MobaPropertiesProvider__Group_2__0__Impl"
    // InternalMoba.g:1863:1: rule__MobaPropertiesProvider__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MobaPropertiesProvider__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1867:1: ( ( ',' ) )
            // InternalMoba.g:1868:1: ( ',' )
            {
            // InternalMoba.g:1868:1: ( ',' )
            // InternalMoba.g:1869:2: ','
            {
             before(grammarAccess.getMobaPropertiesProviderAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMobaPropertiesProviderAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group_2__0__Impl"


    // $ANTLR start "rule__MobaPropertiesProvider__Group_2__1"
    // InternalMoba.g:1878:1: rule__MobaPropertiesProvider__Group_2__1 : rule__MobaPropertiesProvider__Group_2__1__Impl ;
    public final void rule__MobaPropertiesProvider__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1882:1: ( rule__MobaPropertiesProvider__Group_2__1__Impl )
            // InternalMoba.g:1883:2: rule__MobaPropertiesProvider__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaPropertiesProvider__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group_2__1"


    // $ANTLR start "rule__MobaPropertiesProvider__Group_2__1__Impl"
    // InternalMoba.g:1889:1: rule__MobaPropertiesProvider__Group_2__1__Impl : ( ( rule__MobaPropertiesProvider__PropertiesAssignment_2_1 ) ) ;
    public final void rule__MobaPropertiesProvider__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1893:1: ( ( ( rule__MobaPropertiesProvider__PropertiesAssignment_2_1 ) ) )
            // InternalMoba.g:1894:1: ( ( rule__MobaPropertiesProvider__PropertiesAssignment_2_1 ) )
            {
            // InternalMoba.g:1894:1: ( ( rule__MobaPropertiesProvider__PropertiesAssignment_2_1 ) )
            // InternalMoba.g:1895:2: ( rule__MobaPropertiesProvider__PropertiesAssignment_2_1 )
            {
             before(grammarAccess.getMobaPropertiesProviderAccess().getPropertiesAssignment_2_1()); 
            // InternalMoba.g:1896:2: ( rule__MobaPropertiesProvider__PropertiesAssignment_2_1 )
            // InternalMoba.g:1896:3: rule__MobaPropertiesProvider__PropertiesAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaPropertiesProvider__PropertiesAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaPropertiesProviderAccess().getPropertiesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__Group_2__1__Impl"


    // $ANTLR start "rule__MobaProperty__Group__0"
    // InternalMoba.g:1905:1: rule__MobaProperty__Group__0 : rule__MobaProperty__Group__0__Impl rule__MobaProperty__Group__1 ;
    public final void rule__MobaProperty__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1909:1: ( rule__MobaProperty__Group__0__Impl rule__MobaProperty__Group__1 )
            // InternalMoba.g:1910:2: rule__MobaProperty__Group__0__Impl rule__MobaProperty__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MobaProperty__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaProperty__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__Group__0"


    // $ANTLR start "rule__MobaProperty__Group__0__Impl"
    // InternalMoba.g:1917:1: rule__MobaProperty__Group__0__Impl : ( ( rule__MobaProperty__Alternatives_0 ) ) ;
    public final void rule__MobaProperty__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1921:1: ( ( ( rule__MobaProperty__Alternatives_0 ) ) )
            // InternalMoba.g:1922:1: ( ( rule__MobaProperty__Alternatives_0 ) )
            {
            // InternalMoba.g:1922:1: ( ( rule__MobaProperty__Alternatives_0 ) )
            // InternalMoba.g:1923:2: ( rule__MobaProperty__Alternatives_0 )
            {
             before(grammarAccess.getMobaPropertyAccess().getAlternatives_0()); 
            // InternalMoba.g:1924:2: ( rule__MobaProperty__Alternatives_0 )
            // InternalMoba.g:1924:3: rule__MobaProperty__Alternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__MobaProperty__Alternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getMobaPropertyAccess().getAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__Group__0__Impl"


    // $ANTLR start "rule__MobaProperty__Group__1"
    // InternalMoba.g:1932:1: rule__MobaProperty__Group__1 : rule__MobaProperty__Group__1__Impl rule__MobaProperty__Group__2 ;
    public final void rule__MobaProperty__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1936:1: ( rule__MobaProperty__Group__1__Impl rule__MobaProperty__Group__2 )
            // InternalMoba.g:1937:2: rule__MobaProperty__Group__1__Impl rule__MobaProperty__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__MobaProperty__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaProperty__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__Group__1"


    // $ANTLR start "rule__MobaProperty__Group__1__Impl"
    // InternalMoba.g:1944:1: rule__MobaProperty__Group__1__Impl : ( '=' ) ;
    public final void rule__MobaProperty__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1948:1: ( ( '=' ) )
            // InternalMoba.g:1949:1: ( '=' )
            {
            // InternalMoba.g:1949:1: ( '=' )
            // InternalMoba.g:1950:2: '='
            {
             before(grammarAccess.getMobaPropertyAccess().getEqualsSignKeyword_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMobaPropertyAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__Group__1__Impl"


    // $ANTLR start "rule__MobaProperty__Group__2"
    // InternalMoba.g:1959:1: rule__MobaProperty__Group__2 : rule__MobaProperty__Group__2__Impl ;
    public final void rule__MobaProperty__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1963:1: ( rule__MobaProperty__Group__2__Impl )
            // InternalMoba.g:1964:2: rule__MobaProperty__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaProperty__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__Group__2"


    // $ANTLR start "rule__MobaProperty__Group__2__Impl"
    // InternalMoba.g:1970:1: rule__MobaProperty__Group__2__Impl : ( ( rule__MobaProperty__Alternatives_2 ) ) ;
    public final void rule__MobaProperty__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1974:1: ( ( ( rule__MobaProperty__Alternatives_2 ) ) )
            // InternalMoba.g:1975:1: ( ( rule__MobaProperty__Alternatives_2 ) )
            {
            // InternalMoba.g:1975:1: ( ( rule__MobaProperty__Alternatives_2 ) )
            // InternalMoba.g:1976:2: ( rule__MobaProperty__Alternatives_2 )
            {
             before(grammarAccess.getMobaPropertyAccess().getAlternatives_2()); 
            // InternalMoba.g:1977:2: ( rule__MobaProperty__Alternatives_2 )
            // InternalMoba.g:1977:3: rule__MobaProperty__Alternatives_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaProperty__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaPropertyAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__Group__2__Impl"


    // $ANTLR start "rule__MobaSettings__Group__0"
    // InternalMoba.g:1986:1: rule__MobaSettings__Group__0 : rule__MobaSettings__Group__0__Impl rule__MobaSettings__Group__1 ;
    public final void rule__MobaSettings__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:1990:1: ( rule__MobaSettings__Group__0__Impl rule__MobaSettings__Group__1 )
            // InternalMoba.g:1991:2: rule__MobaSettings__Group__0__Impl rule__MobaSettings__Group__1
            {
            pushFollow(FOLLOW_16);
            rule__MobaSettings__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaSettings__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group__0"


    // $ANTLR start "rule__MobaSettings__Group__0__Impl"
    // InternalMoba.g:1998:1: rule__MobaSettings__Group__0__Impl : ( () ) ;
    public final void rule__MobaSettings__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2002:1: ( ( () ) )
            // InternalMoba.g:2003:1: ( () )
            {
            // InternalMoba.g:2003:1: ( () )
            // InternalMoba.g:2004:2: ()
            {
             before(grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0()); 
            // InternalMoba.g:2005:2: ()
            // InternalMoba.g:2005:3: 
            {
            }

             after(grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group__0__Impl"


    // $ANTLR start "rule__MobaSettings__Group__1"
    // InternalMoba.g:2013:1: rule__MobaSettings__Group__1 : rule__MobaSettings__Group__1__Impl rule__MobaSettings__Group__2 ;
    public final void rule__MobaSettings__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2017:1: ( rule__MobaSettings__Group__1__Impl rule__MobaSettings__Group__2 )
            // InternalMoba.g:2018:2: rule__MobaSettings__Group__1__Impl rule__MobaSettings__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__MobaSettings__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaSettings__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group__1"


    // $ANTLR start "rule__MobaSettings__Group__1__Impl"
    // InternalMoba.g:2025:1: rule__MobaSettings__Group__1__Impl : ( 'settings' ) ;
    public final void rule__MobaSettings__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2029:1: ( ( 'settings' ) )
            // InternalMoba.g:2030:1: ( 'settings' )
            {
            // InternalMoba.g:2030:1: ( 'settings' )
            // InternalMoba.g:2031:2: 'settings'
            {
             before(grammarAccess.getMobaSettingsAccess().getSettingsKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getMobaSettingsAccess().getSettingsKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group__1__Impl"


    // $ANTLR start "rule__MobaSettings__Group__2"
    // InternalMoba.g:2040:1: rule__MobaSettings__Group__2 : rule__MobaSettings__Group__2__Impl rule__MobaSettings__Group__3 ;
    public final void rule__MobaSettings__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2044:1: ( rule__MobaSettings__Group__2__Impl rule__MobaSettings__Group__3 )
            // InternalMoba.g:2045:2: rule__MobaSettings__Group__2__Impl rule__MobaSettings__Group__3
            {
            pushFollow(FOLLOW_17);
            rule__MobaSettings__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaSettings__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group__2"


    // $ANTLR start "rule__MobaSettings__Group__2__Impl"
    // InternalMoba.g:2052:1: rule__MobaSettings__Group__2__Impl : ( ( rule__MobaSettings__Group_2__0 )? ) ;
    public final void rule__MobaSettings__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2056:1: ( ( ( rule__MobaSettings__Group_2__0 )? ) )
            // InternalMoba.g:2057:1: ( ( rule__MobaSettings__Group_2__0 )? )
            {
            // InternalMoba.g:2057:1: ( ( rule__MobaSettings__Group_2__0 )? )
            // InternalMoba.g:2058:2: ( rule__MobaSettings__Group_2__0 )?
            {
             before(grammarAccess.getMobaSettingsAccess().getGroup_2()); 
            // InternalMoba.g:2059:2: ( rule__MobaSettings__Group_2__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalMoba.g:2059:3: rule__MobaSettings__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaSettings__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaSettingsAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group__2__Impl"


    // $ANTLR start "rule__MobaSettings__Group__3"
    // InternalMoba.g:2067:1: rule__MobaSettings__Group__3 : rule__MobaSettings__Group__3__Impl ;
    public final void rule__MobaSettings__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2071:1: ( rule__MobaSettings__Group__3__Impl )
            // InternalMoba.g:2072:2: rule__MobaSettings__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaSettings__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group__3"


    // $ANTLR start "rule__MobaSettings__Group__3__Impl"
    // InternalMoba.g:2078:1: rule__MobaSettings__Group__3__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaSettings__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2082:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:2083:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:2083:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:2084:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaSettingsAccess().getMobaPropertiesProviderParserRuleCall_3()); 
            // InternalMoba.g:2085:2: ( ruleMobaPropertiesProvider )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMoba.g:2085:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaSettingsAccess().getMobaPropertiesProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group__3__Impl"


    // $ANTLR start "rule__MobaSettings__Group_2__0"
    // InternalMoba.g:2094:1: rule__MobaSettings__Group_2__0 : rule__MobaSettings__Group_2__0__Impl rule__MobaSettings__Group_2__1 ;
    public final void rule__MobaSettings__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2098:1: ( rule__MobaSettings__Group_2__0__Impl rule__MobaSettings__Group_2__1 )
            // InternalMoba.g:2099:2: rule__MobaSettings__Group_2__0__Impl rule__MobaSettings__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaSettings__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaSettings__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group_2__0"


    // $ANTLR start "rule__MobaSettings__Group_2__0__Impl"
    // InternalMoba.g:2106:1: rule__MobaSettings__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__MobaSettings__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2110:1: ( ( 'extends' ) )
            // InternalMoba.g:2111:1: ( 'extends' )
            {
            // InternalMoba.g:2111:1: ( 'extends' )
            // InternalMoba.g:2112:2: 'extends'
            {
             before(grammarAccess.getMobaSettingsAccess().getExtendsKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMobaSettingsAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group_2__0__Impl"


    // $ANTLR start "rule__MobaSettings__Group_2__1"
    // InternalMoba.g:2121:1: rule__MobaSettings__Group_2__1 : rule__MobaSettings__Group_2__1__Impl ;
    public final void rule__MobaSettings__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2125:1: ( rule__MobaSettings__Group_2__1__Impl )
            // InternalMoba.g:2126:2: rule__MobaSettings__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaSettings__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group_2__1"


    // $ANTLR start "rule__MobaSettings__Group_2__1__Impl"
    // InternalMoba.g:2132:1: rule__MobaSettings__Group_2__1__Impl : ( ( rule__MobaSettings__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__MobaSettings__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2136:1: ( ( ( rule__MobaSettings__SuperTypeAssignment_2_1 ) ) )
            // InternalMoba.g:2137:1: ( ( rule__MobaSettings__SuperTypeAssignment_2_1 ) )
            {
            // InternalMoba.g:2137:1: ( ( rule__MobaSettings__SuperTypeAssignment_2_1 ) )
            // InternalMoba.g:2138:2: ( rule__MobaSettings__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getMobaSettingsAccess().getSuperTypeAssignment_2_1()); 
            // InternalMoba.g:2139:2: ( rule__MobaSettings__SuperTypeAssignment_2_1 )
            // InternalMoba.g:2139:3: rule__MobaSettings__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaSettings__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaSettingsAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__Group_2__1__Impl"


    // $ANTLR start "rule__MobaCache__Group__0"
    // InternalMoba.g:2148:1: rule__MobaCache__Group__0 : rule__MobaCache__Group__0__Impl rule__MobaCache__Group__1 ;
    public final void rule__MobaCache__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2152:1: ( rule__MobaCache__Group__0__Impl rule__MobaCache__Group__1 )
            // InternalMoba.g:2153:2: rule__MobaCache__Group__0__Impl rule__MobaCache__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__MobaCache__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaCache__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group__0"


    // $ANTLR start "rule__MobaCache__Group__0__Impl"
    // InternalMoba.g:2160:1: rule__MobaCache__Group__0__Impl : ( () ) ;
    public final void rule__MobaCache__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2164:1: ( ( () ) )
            // InternalMoba.g:2165:1: ( () )
            {
            // InternalMoba.g:2165:1: ( () )
            // InternalMoba.g:2166:2: ()
            {
             before(grammarAccess.getMobaCacheAccess().getMobaCacheAction_0()); 
            // InternalMoba.g:2167:2: ()
            // InternalMoba.g:2167:3: 
            {
            }

             after(grammarAccess.getMobaCacheAccess().getMobaCacheAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group__0__Impl"


    // $ANTLR start "rule__MobaCache__Group__1"
    // InternalMoba.g:2175:1: rule__MobaCache__Group__1 : rule__MobaCache__Group__1__Impl rule__MobaCache__Group__2 ;
    public final void rule__MobaCache__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2179:1: ( rule__MobaCache__Group__1__Impl rule__MobaCache__Group__2 )
            // InternalMoba.g:2180:2: rule__MobaCache__Group__1__Impl rule__MobaCache__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__MobaCache__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaCache__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group__1"


    // $ANTLR start "rule__MobaCache__Group__1__Impl"
    // InternalMoba.g:2187:1: rule__MobaCache__Group__1__Impl : ( 'cache' ) ;
    public final void rule__MobaCache__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2191:1: ( ( 'cache' ) )
            // InternalMoba.g:2192:1: ( 'cache' )
            {
            // InternalMoba.g:2192:1: ( 'cache' )
            // InternalMoba.g:2193:2: 'cache'
            {
             before(grammarAccess.getMobaCacheAccess().getCacheKeyword_1()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getCacheKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group__1__Impl"


    // $ANTLR start "rule__MobaCache__Group__2"
    // InternalMoba.g:2202:1: rule__MobaCache__Group__2 : rule__MobaCache__Group__2__Impl ;
    public final void rule__MobaCache__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2206:1: ( rule__MobaCache__Group__2__Impl )
            // InternalMoba.g:2207:2: rule__MobaCache__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaCache__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group__2"


    // $ANTLR start "rule__MobaCache__Group__2__Impl"
    // InternalMoba.g:2213:1: rule__MobaCache__Group__2__Impl : ( ( rule__MobaCache__Group_2__0 )? ) ;
    public final void rule__MobaCache__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2217:1: ( ( ( rule__MobaCache__Group_2__0 )? ) )
            // InternalMoba.g:2218:1: ( ( rule__MobaCache__Group_2__0 )? )
            {
            // InternalMoba.g:2218:1: ( ( rule__MobaCache__Group_2__0 )? )
            // InternalMoba.g:2219:2: ( rule__MobaCache__Group_2__0 )?
            {
             before(grammarAccess.getMobaCacheAccess().getGroup_2()); 
            // InternalMoba.g:2220:2: ( rule__MobaCache__Group_2__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==22) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoba.g:2220:3: rule__MobaCache__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaCache__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaCacheAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group__2__Impl"


    // $ANTLR start "rule__MobaCache__Group_2__0"
    // InternalMoba.g:2229:1: rule__MobaCache__Group_2__0 : rule__MobaCache__Group_2__0__Impl rule__MobaCache__Group_2__1 ;
    public final void rule__MobaCache__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2233:1: ( rule__MobaCache__Group_2__0__Impl rule__MobaCache__Group_2__1 )
            // InternalMoba.g:2234:2: rule__MobaCache__Group_2__0__Impl rule__MobaCache__Group_2__1
            {
            pushFollow(FOLLOW_19);
            rule__MobaCache__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaCache__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2__0"


    // $ANTLR start "rule__MobaCache__Group_2__0__Impl"
    // InternalMoba.g:2241:1: rule__MobaCache__Group_2__0__Impl : ( '(' ) ;
    public final void rule__MobaCache__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2245:1: ( ( '(' ) )
            // InternalMoba.g:2246:1: ( '(' )
            {
            // InternalMoba.g:2246:1: ( '(' )
            // InternalMoba.g:2247:2: '('
            {
             before(grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2__0__Impl"


    // $ANTLR start "rule__MobaCache__Group_2__1"
    // InternalMoba.g:2256:1: rule__MobaCache__Group_2__1 : rule__MobaCache__Group_2__1__Impl rule__MobaCache__Group_2__2 ;
    public final void rule__MobaCache__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2260:1: ( rule__MobaCache__Group_2__1__Impl rule__MobaCache__Group_2__2 )
            // InternalMoba.g:2261:2: rule__MobaCache__Group_2__1__Impl rule__MobaCache__Group_2__2
            {
            pushFollow(FOLLOW_11);
            rule__MobaCache__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaCache__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2__1"


    // $ANTLR start "rule__MobaCache__Group_2__1__Impl"
    // InternalMoba.g:2268:1: rule__MobaCache__Group_2__1__Impl : ( ( rule__MobaCache__UnorderedGroup_2_1 ) ) ;
    public final void rule__MobaCache__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2272:1: ( ( ( rule__MobaCache__UnorderedGroup_2_1 ) ) )
            // InternalMoba.g:2273:1: ( ( rule__MobaCache__UnorderedGroup_2_1 ) )
            {
            // InternalMoba.g:2273:1: ( ( rule__MobaCache__UnorderedGroup_2_1 ) )
            // InternalMoba.g:2274:2: ( rule__MobaCache__UnorderedGroup_2_1 )
            {
             before(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1()); 
            // InternalMoba.g:2275:2: ( rule__MobaCache__UnorderedGroup_2_1 )
            // InternalMoba.g:2275:3: rule__MobaCache__UnorderedGroup_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaCache__UnorderedGroup_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2__1__Impl"


    // $ANTLR start "rule__MobaCache__Group_2__2"
    // InternalMoba.g:2283:1: rule__MobaCache__Group_2__2 : rule__MobaCache__Group_2__2__Impl ;
    public final void rule__MobaCache__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2287:1: ( rule__MobaCache__Group_2__2__Impl )
            // InternalMoba.g:2288:2: rule__MobaCache__Group_2__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaCache__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2__2"


    // $ANTLR start "rule__MobaCache__Group_2__2__Impl"
    // InternalMoba.g:2294:1: rule__MobaCache__Group_2__2__Impl : ( ')' ) ;
    public final void rule__MobaCache__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2298:1: ( ( ')' ) )
            // InternalMoba.g:2299:1: ( ')' )
            {
            // InternalMoba.g:2299:1: ( ')' )
            // InternalMoba.g:2300:2: ')'
            {
             before(grammarAccess.getMobaCacheAccess().getRightParenthesisKeyword_2_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2__2__Impl"


    // $ANTLR start "rule__MobaCache__Group_2_1_0__0"
    // InternalMoba.g:2310:1: rule__MobaCache__Group_2_1_0__0 : rule__MobaCache__Group_2_1_0__0__Impl rule__MobaCache__Group_2_1_0__1 ;
    public final void rule__MobaCache__Group_2_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2314:1: ( rule__MobaCache__Group_2_1_0__0__Impl rule__MobaCache__Group_2_1_0__1 )
            // InternalMoba.g:2315:2: rule__MobaCache__Group_2_1_0__0__Impl rule__MobaCache__Group_2_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__MobaCache__Group_2_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaCache__Group_2_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_0__0"


    // $ANTLR start "rule__MobaCache__Group_2_1_0__0__Impl"
    // InternalMoba.g:2322:1: rule__MobaCache__Group_2_1_0__0__Impl : ( 'type' ) ;
    public final void rule__MobaCache__Group_2_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2326:1: ( ( 'type' ) )
            // InternalMoba.g:2327:1: ( 'type' )
            {
            // InternalMoba.g:2327:1: ( 'type' )
            // InternalMoba.g:2328:2: 'type'
            {
             before(grammarAccess.getMobaCacheAccess().getTypeKeyword_2_1_0_0()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getTypeKeyword_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_0__0__Impl"


    // $ANTLR start "rule__MobaCache__Group_2_1_0__1"
    // InternalMoba.g:2337:1: rule__MobaCache__Group_2_1_0__1 : rule__MobaCache__Group_2_1_0__1__Impl rule__MobaCache__Group_2_1_0__2 ;
    public final void rule__MobaCache__Group_2_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2341:1: ( rule__MobaCache__Group_2_1_0__1__Impl rule__MobaCache__Group_2_1_0__2 )
            // InternalMoba.g:2342:2: rule__MobaCache__Group_2_1_0__1__Impl rule__MobaCache__Group_2_1_0__2
            {
            pushFollow(FOLLOW_7);
            rule__MobaCache__Group_2_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaCache__Group_2_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_0__1"


    // $ANTLR start "rule__MobaCache__Group_2_1_0__1__Impl"
    // InternalMoba.g:2349:1: rule__MobaCache__Group_2_1_0__1__Impl : ( '=' ) ;
    public final void rule__MobaCache__Group_2_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2353:1: ( ( '=' ) )
            // InternalMoba.g:2354:1: ( '=' )
            {
            // InternalMoba.g:2354:1: ( '=' )
            // InternalMoba.g:2355:2: '='
            {
             before(grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_0_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_0__1__Impl"


    // $ANTLR start "rule__MobaCache__Group_2_1_0__2"
    // InternalMoba.g:2364:1: rule__MobaCache__Group_2_1_0__2 : rule__MobaCache__Group_2_1_0__2__Impl ;
    public final void rule__MobaCache__Group_2_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2368:1: ( rule__MobaCache__Group_2_1_0__2__Impl )
            // InternalMoba.g:2369:2: rule__MobaCache__Group_2_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaCache__Group_2_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_0__2"


    // $ANTLR start "rule__MobaCache__Group_2_1_0__2__Impl"
    // InternalMoba.g:2375:1: rule__MobaCache__Group_2_1_0__2__Impl : ( ( rule__MobaCache__Alternatives_2_1_0_2 ) ) ;
    public final void rule__MobaCache__Group_2_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2379:1: ( ( ( rule__MobaCache__Alternatives_2_1_0_2 ) ) )
            // InternalMoba.g:2380:1: ( ( rule__MobaCache__Alternatives_2_1_0_2 ) )
            {
            // InternalMoba.g:2380:1: ( ( rule__MobaCache__Alternatives_2_1_0_2 ) )
            // InternalMoba.g:2381:2: ( rule__MobaCache__Alternatives_2_1_0_2 )
            {
             before(grammarAccess.getMobaCacheAccess().getAlternatives_2_1_0_2()); 
            // InternalMoba.g:2382:2: ( rule__MobaCache__Alternatives_2_1_0_2 )
            // InternalMoba.g:2382:3: rule__MobaCache__Alternatives_2_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaCache__Alternatives_2_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaCacheAccess().getAlternatives_2_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_0__2__Impl"


    // $ANTLR start "rule__MobaCache__Group_2_1_1__0"
    // InternalMoba.g:2391:1: rule__MobaCache__Group_2_1_1__0 : rule__MobaCache__Group_2_1_1__0__Impl rule__MobaCache__Group_2_1_1__1 ;
    public final void rule__MobaCache__Group_2_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2395:1: ( rule__MobaCache__Group_2_1_1__0__Impl rule__MobaCache__Group_2_1_1__1 )
            // InternalMoba.g:2396:2: rule__MobaCache__Group_2_1_1__0__Impl rule__MobaCache__Group_2_1_1__1
            {
            pushFollow(FOLLOW_12);
            rule__MobaCache__Group_2_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaCache__Group_2_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_1__0"


    // $ANTLR start "rule__MobaCache__Group_2_1_1__0__Impl"
    // InternalMoba.g:2403:1: rule__MobaCache__Group_2_1_1__0__Impl : ( 'strategy' ) ;
    public final void rule__MobaCache__Group_2_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2407:1: ( ( 'strategy' ) )
            // InternalMoba.g:2408:1: ( 'strategy' )
            {
            // InternalMoba.g:2408:1: ( 'strategy' )
            // InternalMoba.g:2409:2: 'strategy'
            {
             before(grammarAccess.getMobaCacheAccess().getStrategyKeyword_2_1_1_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getStrategyKeyword_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_1__0__Impl"


    // $ANTLR start "rule__MobaCache__Group_2_1_1__1"
    // InternalMoba.g:2418:1: rule__MobaCache__Group_2_1_1__1 : rule__MobaCache__Group_2_1_1__1__Impl rule__MobaCache__Group_2_1_1__2 ;
    public final void rule__MobaCache__Group_2_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2422:1: ( rule__MobaCache__Group_2_1_1__1__Impl rule__MobaCache__Group_2_1_1__2 )
            // InternalMoba.g:2423:2: rule__MobaCache__Group_2_1_1__1__Impl rule__MobaCache__Group_2_1_1__2
            {
            pushFollow(FOLLOW_7);
            rule__MobaCache__Group_2_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaCache__Group_2_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_1__1"


    // $ANTLR start "rule__MobaCache__Group_2_1_1__1__Impl"
    // InternalMoba.g:2430:1: rule__MobaCache__Group_2_1_1__1__Impl : ( '=' ) ;
    public final void rule__MobaCache__Group_2_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2434:1: ( ( '=' ) )
            // InternalMoba.g:2435:1: ( '=' )
            {
            // InternalMoba.g:2435:1: ( '=' )
            // InternalMoba.g:2436:2: '='
            {
             before(grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_1_1()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_1__1__Impl"


    // $ANTLR start "rule__MobaCache__Group_2_1_1__2"
    // InternalMoba.g:2445:1: rule__MobaCache__Group_2_1_1__2 : rule__MobaCache__Group_2_1_1__2__Impl ;
    public final void rule__MobaCache__Group_2_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2449:1: ( rule__MobaCache__Group_2_1_1__2__Impl )
            // InternalMoba.g:2450:2: rule__MobaCache__Group_2_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaCache__Group_2_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_1__2"


    // $ANTLR start "rule__MobaCache__Group_2_1_1__2__Impl"
    // InternalMoba.g:2456:1: rule__MobaCache__Group_2_1_1__2__Impl : ( ( rule__MobaCache__Alternatives_2_1_1_2 ) ) ;
    public final void rule__MobaCache__Group_2_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2460:1: ( ( ( rule__MobaCache__Alternatives_2_1_1_2 ) ) )
            // InternalMoba.g:2461:1: ( ( rule__MobaCache__Alternatives_2_1_1_2 ) )
            {
            // InternalMoba.g:2461:1: ( ( rule__MobaCache__Alternatives_2_1_1_2 ) )
            // InternalMoba.g:2462:2: ( rule__MobaCache__Alternatives_2_1_1_2 )
            {
             before(grammarAccess.getMobaCacheAccess().getAlternatives_2_1_1_2()); 
            // InternalMoba.g:2463:2: ( rule__MobaCache__Alternatives_2_1_1_2 )
            // InternalMoba.g:2463:3: rule__MobaCache__Alternatives_2_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaCache__Alternatives_2_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaCacheAccess().getAlternatives_2_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__Group_2_1_1__2__Impl"


    // $ANTLR start "rule__MobaDto__Group__0"
    // InternalMoba.g:2472:1: rule__MobaDto__Group__0 : rule__MobaDto__Group__0__Impl rule__MobaDto__Group__1 ;
    public final void rule__MobaDto__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2476:1: ( rule__MobaDto__Group__0__Impl rule__MobaDto__Group__1 )
            // InternalMoba.g:2477:2: rule__MobaDto__Group__0__Impl rule__MobaDto__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaDto__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDto__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__0"


    // $ANTLR start "rule__MobaDto__Group__0__Impl"
    // InternalMoba.g:2484:1: rule__MobaDto__Group__0__Impl : ( 'dto' ) ;
    public final void rule__MobaDto__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2488:1: ( ( 'dto' ) )
            // InternalMoba.g:2489:1: ( 'dto' )
            {
            // InternalMoba.g:2489:1: ( 'dto' )
            // InternalMoba.g:2490:2: 'dto'
            {
             before(grammarAccess.getMobaDtoAccess().getDtoKeyword_0()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAccess().getDtoKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__0__Impl"


    // $ANTLR start "rule__MobaDto__Group__1"
    // InternalMoba.g:2499:1: rule__MobaDto__Group__1 : rule__MobaDto__Group__1__Impl rule__MobaDto__Group__2 ;
    public final void rule__MobaDto__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2503:1: ( rule__MobaDto__Group__1__Impl rule__MobaDto__Group__2 )
            // InternalMoba.g:2504:2: rule__MobaDto__Group__1__Impl rule__MobaDto__Group__2
            {
            pushFollow(FOLLOW_20);
            rule__MobaDto__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDto__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__1"


    // $ANTLR start "rule__MobaDto__Group__1__Impl"
    // InternalMoba.g:2511:1: rule__MobaDto__Group__1__Impl : ( ( rule__MobaDto__NameAssignment_1 ) ) ;
    public final void rule__MobaDto__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2515:1: ( ( ( rule__MobaDto__NameAssignment_1 ) ) )
            // InternalMoba.g:2516:1: ( ( rule__MobaDto__NameAssignment_1 ) )
            {
            // InternalMoba.g:2516:1: ( ( rule__MobaDto__NameAssignment_1 ) )
            // InternalMoba.g:2517:2: ( rule__MobaDto__NameAssignment_1 )
            {
             before(grammarAccess.getMobaDtoAccess().getNameAssignment_1()); 
            // InternalMoba.g:2518:2: ( rule__MobaDto__NameAssignment_1 )
            // InternalMoba.g:2518:3: rule__MobaDto__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaDto__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__1__Impl"


    // $ANTLR start "rule__MobaDto__Group__2"
    // InternalMoba.g:2526:1: rule__MobaDto__Group__2 : rule__MobaDto__Group__2__Impl rule__MobaDto__Group__3 ;
    public final void rule__MobaDto__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2530:1: ( rule__MobaDto__Group__2__Impl rule__MobaDto__Group__3 )
            // InternalMoba.g:2531:2: rule__MobaDto__Group__2__Impl rule__MobaDto__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__MobaDto__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDto__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__2"


    // $ANTLR start "rule__MobaDto__Group__2__Impl"
    // InternalMoba.g:2538:1: rule__MobaDto__Group__2__Impl : ( ( rule__MobaDto__UnorderedGroup_2 ) ) ;
    public final void rule__MobaDto__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2542:1: ( ( ( rule__MobaDto__UnorderedGroup_2 ) ) )
            // InternalMoba.g:2543:1: ( ( rule__MobaDto__UnorderedGroup_2 ) )
            {
            // InternalMoba.g:2543:1: ( ( rule__MobaDto__UnorderedGroup_2 ) )
            // InternalMoba.g:2544:2: ( rule__MobaDto__UnorderedGroup_2 )
            {
             before(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2()); 
            // InternalMoba.g:2545:2: ( rule__MobaDto__UnorderedGroup_2 )
            // InternalMoba.g:2545:3: rule__MobaDto__UnorderedGroup_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaDto__UnorderedGroup_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__2__Impl"


    // $ANTLR start "rule__MobaDto__Group__3"
    // InternalMoba.g:2553:1: rule__MobaDto__Group__3 : rule__MobaDto__Group__3__Impl rule__MobaDto__Group__4 ;
    public final void rule__MobaDto__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2557:1: ( rule__MobaDto__Group__3__Impl rule__MobaDto__Group__4 )
            // InternalMoba.g:2558:2: rule__MobaDto__Group__3__Impl rule__MobaDto__Group__4
            {
            pushFollow(FOLLOW_21);
            rule__MobaDto__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDto__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__3"


    // $ANTLR start "rule__MobaDto__Group__3__Impl"
    // InternalMoba.g:2565:1: rule__MobaDto__Group__3__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaDto__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2569:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:2570:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:2570:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:2571:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaDtoAccess().getMobaPropertiesProviderParserRuleCall_3()); 
            // InternalMoba.g:2572:2: ( ruleMobaPropertiesProvider )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==26) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoba.g:2572:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaDtoAccess().getMobaPropertiesProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__3__Impl"


    // $ANTLR start "rule__MobaDto__Group__4"
    // InternalMoba.g:2580:1: rule__MobaDto__Group__4 : rule__MobaDto__Group__4__Impl rule__MobaDto__Group__5 ;
    public final void rule__MobaDto__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2584:1: ( rule__MobaDto__Group__4__Impl rule__MobaDto__Group__5 )
            // InternalMoba.g:2585:2: rule__MobaDto__Group__4__Impl rule__MobaDto__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__MobaDto__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDto__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__4"


    // $ANTLR start "rule__MobaDto__Group__4__Impl"
    // InternalMoba.g:2592:1: rule__MobaDto__Group__4__Impl : ( '{' ) ;
    public final void rule__MobaDto__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2596:1: ( ( '{' ) )
            // InternalMoba.g:2597:1: ( '{' )
            {
            // InternalMoba.g:2597:1: ( '{' )
            // InternalMoba.g:2598:2: '{'
            {
             before(grammarAccess.getMobaDtoAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__4__Impl"


    // $ANTLR start "rule__MobaDto__Group__5"
    // InternalMoba.g:2607:1: rule__MobaDto__Group__5 : rule__MobaDto__Group__5__Impl rule__MobaDto__Group__6 ;
    public final void rule__MobaDto__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2611:1: ( rule__MobaDto__Group__5__Impl rule__MobaDto__Group__6 )
            // InternalMoba.g:2612:2: rule__MobaDto__Group__5__Impl rule__MobaDto__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__MobaDto__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDto__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__5"


    // $ANTLR start "rule__MobaDto__Group__5__Impl"
    // InternalMoba.g:2619:1: rule__MobaDto__Group__5__Impl : ( ( rule__MobaDto__FeaturesAssignment_5 )* ) ;
    public final void rule__MobaDto__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2623:1: ( ( ( rule__MobaDto__FeaturesAssignment_5 )* ) )
            // InternalMoba.g:2624:1: ( ( rule__MobaDto__FeaturesAssignment_5 )* )
            {
            // InternalMoba.g:2624:1: ( ( rule__MobaDto__FeaturesAssignment_5 )* )
            // InternalMoba.g:2625:2: ( rule__MobaDto__FeaturesAssignment_5 )*
            {
             before(grammarAccess.getMobaDtoAccess().getFeaturesAssignment_5()); 
            // InternalMoba.g:2626:2: ( rule__MobaDto__FeaturesAssignment_5 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=40 && LA25_0<=41)) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMoba.g:2626:3: rule__MobaDto__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MobaDto__FeaturesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getMobaDtoAccess().getFeaturesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__5__Impl"


    // $ANTLR start "rule__MobaDto__Group__6"
    // InternalMoba.g:2634:1: rule__MobaDto__Group__6 : rule__MobaDto__Group__6__Impl rule__MobaDto__Group__7 ;
    public final void rule__MobaDto__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2638:1: ( rule__MobaDto__Group__6__Impl rule__MobaDto__Group__7 )
            // InternalMoba.g:2639:2: rule__MobaDto__Group__6__Impl rule__MobaDto__Group__7
            {
            pushFollow(FOLLOW_22);
            rule__MobaDto__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDto__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__6"


    // $ANTLR start "rule__MobaDto__Group__6__Impl"
    // InternalMoba.g:2646:1: rule__MobaDto__Group__6__Impl : ( ( rule__MobaDto__IndexAssignment_6 )? ) ;
    public final void rule__MobaDto__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2650:1: ( ( ( rule__MobaDto__IndexAssignment_6 )? ) )
            // InternalMoba.g:2651:1: ( ( rule__MobaDto__IndexAssignment_6 )? )
            {
            // InternalMoba.g:2651:1: ( ( rule__MobaDto__IndexAssignment_6 )? )
            // InternalMoba.g:2652:2: ( rule__MobaDto__IndexAssignment_6 )?
            {
             before(grammarAccess.getMobaDtoAccess().getIndexAssignment_6()); 
            // InternalMoba.g:2653:2: ( rule__MobaDto__IndexAssignment_6 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==35) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalMoba.g:2653:3: rule__MobaDto__IndexAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDto__IndexAssignment_6();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaDtoAccess().getIndexAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__6__Impl"


    // $ANTLR start "rule__MobaDto__Group__7"
    // InternalMoba.g:2661:1: rule__MobaDto__Group__7 : rule__MobaDto__Group__7__Impl ;
    public final void rule__MobaDto__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2665:1: ( rule__MobaDto__Group__7__Impl )
            // InternalMoba.g:2666:2: rule__MobaDto__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDto__Group__7__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__7"


    // $ANTLR start "rule__MobaDto__Group__7__Impl"
    // InternalMoba.g:2672:1: rule__MobaDto__Group__7__Impl : ( '}' ) ;
    public final void rule__MobaDto__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2676:1: ( ( '}' ) )
            // InternalMoba.g:2677:1: ( '}' )
            {
            // InternalMoba.g:2677:1: ( '}' )
            // InternalMoba.g:2678:2: '}'
            {
             before(grammarAccess.getMobaDtoAccess().getRightCurlyBracketKeyword_7()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAccess().getRightCurlyBracketKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group__7__Impl"


    // $ANTLR start "rule__MobaDto__Group_2_0__0"
    // InternalMoba.g:2688:1: rule__MobaDto__Group_2_0__0 : rule__MobaDto__Group_2_0__0__Impl rule__MobaDto__Group_2_0__1 ;
    public final void rule__MobaDto__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2692:1: ( rule__MobaDto__Group_2_0__0__Impl rule__MobaDto__Group_2_0__1 )
            // InternalMoba.g:2693:2: rule__MobaDto__Group_2_0__0__Impl rule__MobaDto__Group_2_0__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaDto__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDto__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group_2_0__0"


    // $ANTLR start "rule__MobaDto__Group_2_0__0__Impl"
    // InternalMoba.g:2700:1: rule__MobaDto__Group_2_0__0__Impl : ( 'extends' ) ;
    public final void rule__MobaDto__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2704:1: ( ( 'extends' ) )
            // InternalMoba.g:2705:1: ( 'extends' )
            {
            // InternalMoba.g:2705:1: ( 'extends' )
            // InternalMoba.g:2706:2: 'extends'
            {
             before(grammarAccess.getMobaDtoAccess().getExtendsKeyword_2_0_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAccess().getExtendsKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group_2_0__0__Impl"


    // $ANTLR start "rule__MobaDto__Group_2_0__1"
    // InternalMoba.g:2715:1: rule__MobaDto__Group_2_0__1 : rule__MobaDto__Group_2_0__1__Impl ;
    public final void rule__MobaDto__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2719:1: ( rule__MobaDto__Group_2_0__1__Impl )
            // InternalMoba.g:2720:2: rule__MobaDto__Group_2_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDto__Group_2_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group_2_0__1"


    // $ANTLR start "rule__MobaDto__Group_2_0__1__Impl"
    // InternalMoba.g:2726:1: rule__MobaDto__Group_2_0__1__Impl : ( ( rule__MobaDto__SuperTypeAssignment_2_0_1 ) ) ;
    public final void rule__MobaDto__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2730:1: ( ( ( rule__MobaDto__SuperTypeAssignment_2_0_1 ) ) )
            // InternalMoba.g:2731:1: ( ( rule__MobaDto__SuperTypeAssignment_2_0_1 ) )
            {
            // InternalMoba.g:2731:1: ( ( rule__MobaDto__SuperTypeAssignment_2_0_1 ) )
            // InternalMoba.g:2732:2: ( rule__MobaDto__SuperTypeAssignment_2_0_1 )
            {
             before(grammarAccess.getMobaDtoAccess().getSuperTypeAssignment_2_0_1()); 
            // InternalMoba.g:2733:2: ( rule__MobaDto__SuperTypeAssignment_2_0_1 )
            // InternalMoba.g:2733:3: rule__MobaDto__SuperTypeAssignment_2_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaDto__SuperTypeAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoAccess().getSuperTypeAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__Group_2_0__1__Impl"


    // $ANTLR start "rule__MobaDtoIndex__Group__0"
    // InternalMoba.g:2742:1: rule__MobaDtoIndex__Group__0 : rule__MobaDtoIndex__Group__0__Impl rule__MobaDtoIndex__Group__1 ;
    public final void rule__MobaDtoIndex__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2746:1: ( rule__MobaDtoIndex__Group__0__Impl rule__MobaDtoIndex__Group__1 )
            // InternalMoba.g:2747:2: rule__MobaDtoIndex__Group__0__Impl rule__MobaDtoIndex__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaDtoIndex__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoIndex__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group__0"


    // $ANTLR start "rule__MobaDtoIndex__Group__0__Impl"
    // InternalMoba.g:2754:1: rule__MobaDtoIndex__Group__0__Impl : ( 'index' ) ;
    public final void rule__MobaDtoIndex__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2758:1: ( ( 'index' ) )
            // InternalMoba.g:2759:1: ( 'index' )
            {
            // InternalMoba.g:2759:1: ( 'index' )
            // InternalMoba.g:2760:2: 'index'
            {
             before(grammarAccess.getMobaDtoIndexAccess().getIndexKeyword_0()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getMobaDtoIndexAccess().getIndexKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group__0__Impl"


    // $ANTLR start "rule__MobaDtoIndex__Group__1"
    // InternalMoba.g:2769:1: rule__MobaDtoIndex__Group__1 : rule__MobaDtoIndex__Group__1__Impl rule__MobaDtoIndex__Group__2 ;
    public final void rule__MobaDtoIndex__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2773:1: ( rule__MobaDtoIndex__Group__1__Impl rule__MobaDtoIndex__Group__2 )
            // InternalMoba.g:2774:2: rule__MobaDtoIndex__Group__1__Impl rule__MobaDtoIndex__Group__2
            {
            pushFollow(FOLLOW_24);
            rule__MobaDtoIndex__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoIndex__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group__1"


    // $ANTLR start "rule__MobaDtoIndex__Group__1__Impl"
    // InternalMoba.g:2781:1: rule__MobaDtoIndex__Group__1__Impl : ( ( rule__MobaDtoIndex__AttributesAssignment_1 ) ) ;
    public final void rule__MobaDtoIndex__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2785:1: ( ( ( rule__MobaDtoIndex__AttributesAssignment_1 ) ) )
            // InternalMoba.g:2786:1: ( ( rule__MobaDtoIndex__AttributesAssignment_1 ) )
            {
            // InternalMoba.g:2786:1: ( ( rule__MobaDtoIndex__AttributesAssignment_1 ) )
            // InternalMoba.g:2787:2: ( rule__MobaDtoIndex__AttributesAssignment_1 )
            {
             before(grammarAccess.getMobaDtoIndexAccess().getAttributesAssignment_1()); 
            // InternalMoba.g:2788:2: ( rule__MobaDtoIndex__AttributesAssignment_1 )
            // InternalMoba.g:2788:3: rule__MobaDtoIndex__AttributesAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoIndex__AttributesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoIndexAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group__1__Impl"


    // $ANTLR start "rule__MobaDtoIndex__Group__2"
    // InternalMoba.g:2796:1: rule__MobaDtoIndex__Group__2 : rule__MobaDtoIndex__Group__2__Impl ;
    public final void rule__MobaDtoIndex__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2800:1: ( rule__MobaDtoIndex__Group__2__Impl )
            // InternalMoba.g:2801:2: rule__MobaDtoIndex__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoIndex__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group__2"


    // $ANTLR start "rule__MobaDtoIndex__Group__2__Impl"
    // InternalMoba.g:2807:1: rule__MobaDtoIndex__Group__2__Impl : ( ( rule__MobaDtoIndex__Group_2__0 ) ) ;
    public final void rule__MobaDtoIndex__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2811:1: ( ( ( rule__MobaDtoIndex__Group_2__0 ) ) )
            // InternalMoba.g:2812:1: ( ( rule__MobaDtoIndex__Group_2__0 ) )
            {
            // InternalMoba.g:2812:1: ( ( rule__MobaDtoIndex__Group_2__0 ) )
            // InternalMoba.g:2813:2: ( rule__MobaDtoIndex__Group_2__0 )
            {
             before(grammarAccess.getMobaDtoIndexAccess().getGroup_2()); 
            // InternalMoba.g:2814:2: ( rule__MobaDtoIndex__Group_2__0 )
            // InternalMoba.g:2814:3: rule__MobaDtoIndex__Group_2__0
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoIndex__Group_2__0();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoIndexAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group__2__Impl"


    // $ANTLR start "rule__MobaDtoIndex__Group_2__0"
    // InternalMoba.g:2823:1: rule__MobaDtoIndex__Group_2__0 : rule__MobaDtoIndex__Group_2__0__Impl rule__MobaDtoIndex__Group_2__1 ;
    public final void rule__MobaDtoIndex__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2827:1: ( rule__MobaDtoIndex__Group_2__0__Impl rule__MobaDtoIndex__Group_2__1 )
            // InternalMoba.g:2828:2: rule__MobaDtoIndex__Group_2__0__Impl rule__MobaDtoIndex__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaDtoIndex__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoIndex__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group_2__0"


    // $ANTLR start "rule__MobaDtoIndex__Group_2__0__Impl"
    // InternalMoba.g:2835:1: rule__MobaDtoIndex__Group_2__0__Impl : ( ',' ) ;
    public final void rule__MobaDtoIndex__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2839:1: ( ( ',' ) )
            // InternalMoba.g:2840:1: ( ',' )
            {
            // InternalMoba.g:2840:1: ( ',' )
            // InternalMoba.g:2841:2: ','
            {
             before(grammarAccess.getMobaDtoIndexAccess().getCommaKeyword_2_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getMobaDtoIndexAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group_2__0__Impl"


    // $ANTLR start "rule__MobaDtoIndex__Group_2__1"
    // InternalMoba.g:2850:1: rule__MobaDtoIndex__Group_2__1 : rule__MobaDtoIndex__Group_2__1__Impl ;
    public final void rule__MobaDtoIndex__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2854:1: ( rule__MobaDtoIndex__Group_2__1__Impl )
            // InternalMoba.g:2855:2: rule__MobaDtoIndex__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoIndex__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group_2__1"


    // $ANTLR start "rule__MobaDtoIndex__Group_2__1__Impl"
    // InternalMoba.g:2861:1: rule__MobaDtoIndex__Group_2__1__Impl : ( ( rule__MobaDtoIndex__AttributesAssignment_2_1 )* ) ;
    public final void rule__MobaDtoIndex__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2865:1: ( ( ( rule__MobaDtoIndex__AttributesAssignment_2_1 )* ) )
            // InternalMoba.g:2866:1: ( ( rule__MobaDtoIndex__AttributesAssignment_2_1 )* )
            {
            // InternalMoba.g:2866:1: ( ( rule__MobaDtoIndex__AttributesAssignment_2_1 )* )
            // InternalMoba.g:2867:2: ( rule__MobaDtoIndex__AttributesAssignment_2_1 )*
            {
             before(grammarAccess.getMobaDtoIndexAccess().getAttributesAssignment_2_1()); 
            // InternalMoba.g:2868:2: ( rule__MobaDtoIndex__AttributesAssignment_2_1 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==RULE_ID) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMoba.g:2868:3: rule__MobaDtoIndex__AttributesAssignment_2_1
            	    {
            	    pushFollow(FOLLOW_25);
            	    rule__MobaDtoIndex__AttributesAssignment_2_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

             after(grammarAccess.getMobaDtoIndexAccess().getAttributesAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__Group_2__1__Impl"


    // $ANTLR start "rule__MobaPayload__Group__0"
    // InternalMoba.g:2877:1: rule__MobaPayload__Group__0 : rule__MobaPayload__Group__0__Impl rule__MobaPayload__Group__1 ;
    public final void rule__MobaPayload__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2881:1: ( rule__MobaPayload__Group__0__Impl rule__MobaPayload__Group__1 )
            // InternalMoba.g:2882:2: rule__MobaPayload__Group__0__Impl rule__MobaPayload__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaPayload__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__0"


    // $ANTLR start "rule__MobaPayload__Group__0__Impl"
    // InternalMoba.g:2889:1: rule__MobaPayload__Group__0__Impl : ( 'payload' ) ;
    public final void rule__MobaPayload__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2893:1: ( ( 'payload' ) )
            // InternalMoba.g:2894:1: ( 'payload' )
            {
            // InternalMoba.g:2894:1: ( 'payload' )
            // InternalMoba.g:2895:2: 'payload'
            {
             before(grammarAccess.getMobaPayloadAccess().getPayloadKeyword_0()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAccess().getPayloadKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__0__Impl"


    // $ANTLR start "rule__MobaPayload__Group__1"
    // InternalMoba.g:2904:1: rule__MobaPayload__Group__1 : rule__MobaPayload__Group__1__Impl rule__MobaPayload__Group__2 ;
    public final void rule__MobaPayload__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2908:1: ( rule__MobaPayload__Group__1__Impl rule__MobaPayload__Group__2 )
            // InternalMoba.g:2909:2: rule__MobaPayload__Group__1__Impl rule__MobaPayload__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MobaPayload__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__1"


    // $ANTLR start "rule__MobaPayload__Group__1__Impl"
    // InternalMoba.g:2916:1: rule__MobaPayload__Group__1__Impl : ( ( rule__MobaPayload__NameAssignment_1 ) ) ;
    public final void rule__MobaPayload__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2920:1: ( ( ( rule__MobaPayload__NameAssignment_1 ) ) )
            // InternalMoba.g:2921:1: ( ( rule__MobaPayload__NameAssignment_1 ) )
            {
            // InternalMoba.g:2921:1: ( ( rule__MobaPayload__NameAssignment_1 ) )
            // InternalMoba.g:2922:2: ( rule__MobaPayload__NameAssignment_1 )
            {
             before(grammarAccess.getMobaPayloadAccess().getNameAssignment_1()); 
            // InternalMoba.g:2923:2: ( rule__MobaPayload__NameAssignment_1 )
            // InternalMoba.g:2923:3: rule__MobaPayload__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayload__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__1__Impl"


    // $ANTLR start "rule__MobaPayload__Group__2"
    // InternalMoba.g:2931:1: rule__MobaPayload__Group__2 : rule__MobaPayload__Group__2__Impl rule__MobaPayload__Group__3 ;
    public final void rule__MobaPayload__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2935:1: ( rule__MobaPayload__Group__2__Impl rule__MobaPayload__Group__3 )
            // InternalMoba.g:2936:2: rule__MobaPayload__Group__2__Impl rule__MobaPayload__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__MobaPayload__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__2"


    // $ANTLR start "rule__MobaPayload__Group__2__Impl"
    // InternalMoba.g:2943:1: rule__MobaPayload__Group__2__Impl : ( ( rule__MobaPayload__Group_2__0 )? ) ;
    public final void rule__MobaPayload__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2947:1: ( ( ( rule__MobaPayload__Group_2__0 )? ) )
            // InternalMoba.g:2948:1: ( ( rule__MobaPayload__Group_2__0 )? )
            {
            // InternalMoba.g:2948:1: ( ( rule__MobaPayload__Group_2__0 )? )
            // InternalMoba.g:2949:2: ( rule__MobaPayload__Group_2__0 )?
            {
             before(grammarAccess.getMobaPayloadAccess().getGroup_2()); 
            // InternalMoba.g:2950:2: ( rule__MobaPayload__Group_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==30) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalMoba.g:2950:3: rule__MobaPayload__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayload__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaPayloadAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__2__Impl"


    // $ANTLR start "rule__MobaPayload__Group__3"
    // InternalMoba.g:2958:1: rule__MobaPayload__Group__3 : rule__MobaPayload__Group__3__Impl rule__MobaPayload__Group__4 ;
    public final void rule__MobaPayload__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2962:1: ( rule__MobaPayload__Group__3__Impl rule__MobaPayload__Group__4 )
            // InternalMoba.g:2963:2: rule__MobaPayload__Group__3__Impl rule__MobaPayload__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__MobaPayload__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__3"


    // $ANTLR start "rule__MobaPayload__Group__3__Impl"
    // InternalMoba.g:2970:1: rule__MobaPayload__Group__3__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaPayload__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2974:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:2975:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:2975:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:2976:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaPayloadAccess().getMobaPropertiesProviderParserRuleCall_3()); 
            // InternalMoba.g:2977:2: ( ruleMobaPropertiesProvider )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==26) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoba.g:2977:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaPayloadAccess().getMobaPropertiesProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__3__Impl"


    // $ANTLR start "rule__MobaPayload__Group__4"
    // InternalMoba.g:2985:1: rule__MobaPayload__Group__4 : rule__MobaPayload__Group__4__Impl rule__MobaPayload__Group__5 ;
    public final void rule__MobaPayload__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:2989:1: ( rule__MobaPayload__Group__4__Impl rule__MobaPayload__Group__5 )
            // InternalMoba.g:2990:2: rule__MobaPayload__Group__4__Impl rule__MobaPayload__Group__5
            {
            pushFollow(FOLLOW_27);
            rule__MobaPayload__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__4"


    // $ANTLR start "rule__MobaPayload__Group__4__Impl"
    // InternalMoba.g:2997:1: rule__MobaPayload__Group__4__Impl : ( '{' ) ;
    public final void rule__MobaPayload__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3001:1: ( ( '{' ) )
            // InternalMoba.g:3002:1: ( '{' )
            {
            // InternalMoba.g:3002:1: ( '{' )
            // InternalMoba.g:3003:2: '{'
            {
             before(grammarAccess.getMobaPayloadAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__4__Impl"


    // $ANTLR start "rule__MobaPayload__Group__5"
    // InternalMoba.g:3012:1: rule__MobaPayload__Group__5 : rule__MobaPayload__Group__5__Impl rule__MobaPayload__Group__6 ;
    public final void rule__MobaPayload__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3016:1: ( rule__MobaPayload__Group__5__Impl rule__MobaPayload__Group__6 )
            // InternalMoba.g:3017:2: rule__MobaPayload__Group__5__Impl rule__MobaPayload__Group__6
            {
            pushFollow(FOLLOW_27);
            rule__MobaPayload__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__5"


    // $ANTLR start "rule__MobaPayload__Group__5__Impl"
    // InternalMoba.g:3024:1: rule__MobaPayload__Group__5__Impl : ( ( rule__MobaPayload__FeaturesAssignment_5 )* ) ;
    public final void rule__MobaPayload__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3028:1: ( ( ( rule__MobaPayload__FeaturesAssignment_5 )* ) )
            // InternalMoba.g:3029:1: ( ( rule__MobaPayload__FeaturesAssignment_5 )* )
            {
            // InternalMoba.g:3029:1: ( ( rule__MobaPayload__FeaturesAssignment_5 )* )
            // InternalMoba.g:3030:2: ( rule__MobaPayload__FeaturesAssignment_5 )*
            {
             before(grammarAccess.getMobaPayloadAccess().getFeaturesAssignment_5()); 
            // InternalMoba.g:3031:2: ( rule__MobaPayload__FeaturesAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=40 && LA30_0<=41)) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMoba.g:3031:3: rule__MobaPayload__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_23);
            	    rule__MobaPayload__FeaturesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getMobaPayloadAccess().getFeaturesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__5__Impl"


    // $ANTLR start "rule__MobaPayload__Group__6"
    // InternalMoba.g:3039:1: rule__MobaPayload__Group__6 : rule__MobaPayload__Group__6__Impl ;
    public final void rule__MobaPayload__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3043:1: ( rule__MobaPayload__Group__6__Impl )
            // InternalMoba.g:3044:2: rule__MobaPayload__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__6"


    // $ANTLR start "rule__MobaPayload__Group__6__Impl"
    // InternalMoba.g:3050:1: rule__MobaPayload__Group__6__Impl : ( '}' ) ;
    public final void rule__MobaPayload__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3054:1: ( ( '}' ) )
            // InternalMoba.g:3055:1: ( '}' )
            {
            // InternalMoba.g:3055:1: ( '}' )
            // InternalMoba.g:3056:2: '}'
            {
             before(grammarAccess.getMobaPayloadAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group__6__Impl"


    // $ANTLR start "rule__MobaPayload__Group_2__0"
    // InternalMoba.g:3066:1: rule__MobaPayload__Group_2__0 : rule__MobaPayload__Group_2__0__Impl rule__MobaPayload__Group_2__1 ;
    public final void rule__MobaPayload__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3070:1: ( rule__MobaPayload__Group_2__0__Impl rule__MobaPayload__Group_2__1 )
            // InternalMoba.g:3071:2: rule__MobaPayload__Group_2__0__Impl rule__MobaPayload__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaPayload__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group_2__0"


    // $ANTLR start "rule__MobaPayload__Group_2__0__Impl"
    // InternalMoba.g:3078:1: rule__MobaPayload__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__MobaPayload__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3082:1: ( ( 'extends' ) )
            // InternalMoba.g:3083:1: ( 'extends' )
            {
            // InternalMoba.g:3083:1: ( 'extends' )
            // InternalMoba.g:3084:2: 'extends'
            {
             before(grammarAccess.getMobaPayloadAccess().getExtendsKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group_2__0__Impl"


    // $ANTLR start "rule__MobaPayload__Group_2__1"
    // InternalMoba.g:3093:1: rule__MobaPayload__Group_2__1 : rule__MobaPayload__Group_2__1__Impl ;
    public final void rule__MobaPayload__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3097:1: ( rule__MobaPayload__Group_2__1__Impl )
            // InternalMoba.g:3098:2: rule__MobaPayload__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayload__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group_2__1"


    // $ANTLR start "rule__MobaPayload__Group_2__1__Impl"
    // InternalMoba.g:3104:1: rule__MobaPayload__Group_2__1__Impl : ( ( rule__MobaPayload__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__MobaPayload__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3108:1: ( ( ( rule__MobaPayload__SuperTypeAssignment_2_1 ) ) )
            // InternalMoba.g:3109:1: ( ( rule__MobaPayload__SuperTypeAssignment_2_1 ) )
            {
            // InternalMoba.g:3109:1: ( ( rule__MobaPayload__SuperTypeAssignment_2_1 ) )
            // InternalMoba.g:3110:2: ( rule__MobaPayload__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getMobaPayloadAccess().getSuperTypeAssignment_2_1()); 
            // InternalMoba.g:3111:2: ( rule__MobaPayload__SuperTypeAssignment_2_1 )
            // InternalMoba.g:3111:3: rule__MobaPayload__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayload__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__Group_2__1__Impl"


    // $ANTLR start "rule__MobaQueue__Group__0"
    // InternalMoba.g:3120:1: rule__MobaQueue__Group__0 : rule__MobaQueue__Group__0__Impl rule__MobaQueue__Group__1 ;
    public final void rule__MobaQueue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3124:1: ( rule__MobaQueue__Group__0__Impl rule__MobaQueue__Group__1 )
            // InternalMoba.g:3125:2: rule__MobaQueue__Group__0__Impl rule__MobaQueue__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaQueue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__0"


    // $ANTLR start "rule__MobaQueue__Group__0__Impl"
    // InternalMoba.g:3132:1: rule__MobaQueue__Group__0__Impl : ( 'queue' ) ;
    public final void rule__MobaQueue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3136:1: ( ( 'queue' ) )
            // InternalMoba.g:3137:1: ( 'queue' )
            {
            // InternalMoba.g:3137:1: ( 'queue' )
            // InternalMoba.g:3138:2: 'queue'
            {
             before(grammarAccess.getMobaQueueAccess().getQueueKeyword_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getMobaQueueAccess().getQueueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__0__Impl"


    // $ANTLR start "rule__MobaQueue__Group__1"
    // InternalMoba.g:3147:1: rule__MobaQueue__Group__1 : rule__MobaQueue__Group__1__Impl rule__MobaQueue__Group__2 ;
    public final void rule__MobaQueue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3151:1: ( rule__MobaQueue__Group__1__Impl rule__MobaQueue__Group__2 )
            // InternalMoba.g:3152:2: rule__MobaQueue__Group__1__Impl rule__MobaQueue__Group__2
            {
            pushFollow(FOLLOW_26);
            rule__MobaQueue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__1"


    // $ANTLR start "rule__MobaQueue__Group__1__Impl"
    // InternalMoba.g:3159:1: rule__MobaQueue__Group__1__Impl : ( ( rule__MobaQueue__NameAssignment_1 ) ) ;
    public final void rule__MobaQueue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3163:1: ( ( ( rule__MobaQueue__NameAssignment_1 ) ) )
            // InternalMoba.g:3164:1: ( ( rule__MobaQueue__NameAssignment_1 ) )
            {
            // InternalMoba.g:3164:1: ( ( rule__MobaQueue__NameAssignment_1 ) )
            // InternalMoba.g:3165:2: ( rule__MobaQueue__NameAssignment_1 )
            {
             before(grammarAccess.getMobaQueueAccess().getNameAssignment_1()); 
            // InternalMoba.g:3166:2: ( rule__MobaQueue__NameAssignment_1 )
            // InternalMoba.g:3166:3: rule__MobaQueue__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueue__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaQueueAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__1__Impl"


    // $ANTLR start "rule__MobaQueue__Group__2"
    // InternalMoba.g:3174:1: rule__MobaQueue__Group__2 : rule__MobaQueue__Group__2__Impl rule__MobaQueue__Group__3 ;
    public final void rule__MobaQueue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3178:1: ( rule__MobaQueue__Group__2__Impl rule__MobaQueue__Group__3 )
            // InternalMoba.g:3179:2: rule__MobaQueue__Group__2__Impl rule__MobaQueue__Group__3
            {
            pushFollow(FOLLOW_26);
            rule__MobaQueue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__2"


    // $ANTLR start "rule__MobaQueue__Group__2__Impl"
    // InternalMoba.g:3186:1: rule__MobaQueue__Group__2__Impl : ( ( rule__MobaQueue__Group_2__0 )? ) ;
    public final void rule__MobaQueue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3190:1: ( ( ( rule__MobaQueue__Group_2__0 )? ) )
            // InternalMoba.g:3191:1: ( ( rule__MobaQueue__Group_2__0 )? )
            {
            // InternalMoba.g:3191:1: ( ( rule__MobaQueue__Group_2__0 )? )
            // InternalMoba.g:3192:2: ( rule__MobaQueue__Group_2__0 )?
            {
             before(grammarAccess.getMobaQueueAccess().getGroup_2()); 
            // InternalMoba.g:3193:2: ( rule__MobaQueue__Group_2__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoba.g:3193:3: rule__MobaQueue__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaQueue__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaQueueAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__2__Impl"


    // $ANTLR start "rule__MobaQueue__Group__3"
    // InternalMoba.g:3201:1: rule__MobaQueue__Group__3 : rule__MobaQueue__Group__3__Impl rule__MobaQueue__Group__4 ;
    public final void rule__MobaQueue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3205:1: ( rule__MobaQueue__Group__3__Impl rule__MobaQueue__Group__4 )
            // InternalMoba.g:3206:2: rule__MobaQueue__Group__3__Impl rule__MobaQueue__Group__4
            {
            pushFollow(FOLLOW_26);
            rule__MobaQueue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__3"


    // $ANTLR start "rule__MobaQueue__Group__3__Impl"
    // InternalMoba.g:3213:1: rule__MobaQueue__Group__3__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaQueue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3217:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:3218:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:3218:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:3219:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaQueueAccess().getMobaPropertiesProviderParserRuleCall_3()); 
            // InternalMoba.g:3220:2: ( ruleMobaPropertiesProvider )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==26) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMoba.g:3220:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaQueueAccess().getMobaPropertiesProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__3__Impl"


    // $ANTLR start "rule__MobaQueue__Group__4"
    // InternalMoba.g:3228:1: rule__MobaQueue__Group__4 : rule__MobaQueue__Group__4__Impl rule__MobaQueue__Group__5 ;
    public final void rule__MobaQueue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3232:1: ( rule__MobaQueue__Group__4__Impl rule__MobaQueue__Group__5 )
            // InternalMoba.g:3233:2: rule__MobaQueue__Group__4__Impl rule__MobaQueue__Group__5
            {
            pushFollow(FOLLOW_28);
            rule__MobaQueue__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__4"


    // $ANTLR start "rule__MobaQueue__Group__4__Impl"
    // InternalMoba.g:3240:1: rule__MobaQueue__Group__4__Impl : ( '{' ) ;
    public final void rule__MobaQueue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3244:1: ( ( '{' ) )
            // InternalMoba.g:3245:1: ( '{' )
            {
            // InternalMoba.g:3245:1: ( '{' )
            // InternalMoba.g:3246:2: '{'
            {
             before(grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__4__Impl"


    // $ANTLR start "rule__MobaQueue__Group__5"
    // InternalMoba.g:3255:1: rule__MobaQueue__Group__5 : rule__MobaQueue__Group__5__Impl rule__MobaQueue__Group__6 ;
    public final void rule__MobaQueue__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3259:1: ( rule__MobaQueue__Group__5__Impl rule__MobaQueue__Group__6 )
            // InternalMoba.g:3260:2: rule__MobaQueue__Group__5__Impl rule__MobaQueue__Group__6
            {
            pushFollow(FOLLOW_28);
            rule__MobaQueue__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__5"


    // $ANTLR start "rule__MobaQueue__Group__5__Impl"
    // InternalMoba.g:3267:1: rule__MobaQueue__Group__5__Impl : ( ( rule__MobaQueue__FeaturesAssignment_5 )* ) ;
    public final void rule__MobaQueue__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3271:1: ( ( ( rule__MobaQueue__FeaturesAssignment_5 )* ) )
            // InternalMoba.g:3272:1: ( ( rule__MobaQueue__FeaturesAssignment_5 )* )
            {
            // InternalMoba.g:3272:1: ( ( rule__MobaQueue__FeaturesAssignment_5 )* )
            // InternalMoba.g:3273:2: ( rule__MobaQueue__FeaturesAssignment_5 )*
            {
             before(grammarAccess.getMobaQueueAccess().getFeaturesAssignment_5()); 
            // InternalMoba.g:3274:2: ( rule__MobaQueue__FeaturesAssignment_5 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==41) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoba.g:3274:3: rule__MobaQueue__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_29);
            	    rule__MobaQueue__FeaturesAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getMobaQueueAccess().getFeaturesAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__5__Impl"


    // $ANTLR start "rule__MobaQueue__Group__6"
    // InternalMoba.g:3282:1: rule__MobaQueue__Group__6 : rule__MobaQueue__Group__6__Impl ;
    public final void rule__MobaQueue__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3286:1: ( rule__MobaQueue__Group__6__Impl )
            // InternalMoba.g:3287:2: rule__MobaQueue__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__6"


    // $ANTLR start "rule__MobaQueue__Group__6__Impl"
    // InternalMoba.g:3293:1: rule__MobaQueue__Group__6__Impl : ( '}' ) ;
    public final void rule__MobaQueue__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3297:1: ( ( '}' ) )
            // InternalMoba.g:3298:1: ( '}' )
            {
            // InternalMoba.g:3298:1: ( '}' )
            // InternalMoba.g:3299:2: '}'
            {
             before(grammarAccess.getMobaQueueAccess().getRightCurlyBracketKeyword_6()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getMobaQueueAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group__6__Impl"


    // $ANTLR start "rule__MobaQueue__Group_2__0"
    // InternalMoba.g:3309:1: rule__MobaQueue__Group_2__0 : rule__MobaQueue__Group_2__0__Impl rule__MobaQueue__Group_2__1 ;
    public final void rule__MobaQueue__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3313:1: ( rule__MobaQueue__Group_2__0__Impl rule__MobaQueue__Group_2__1 )
            // InternalMoba.g:3314:2: rule__MobaQueue__Group_2__0__Impl rule__MobaQueue__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaQueue__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group_2__0"


    // $ANTLR start "rule__MobaQueue__Group_2__0__Impl"
    // InternalMoba.g:3321:1: rule__MobaQueue__Group_2__0__Impl : ( 'extends' ) ;
    public final void rule__MobaQueue__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3325:1: ( ( 'extends' ) )
            // InternalMoba.g:3326:1: ( 'extends' )
            {
            // InternalMoba.g:3326:1: ( 'extends' )
            // InternalMoba.g:3327:2: 'extends'
            {
             before(grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group_2__0__Impl"


    // $ANTLR start "rule__MobaQueue__Group_2__1"
    // InternalMoba.g:3336:1: rule__MobaQueue__Group_2__1 : rule__MobaQueue__Group_2__1__Impl ;
    public final void rule__MobaQueue__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3340:1: ( rule__MobaQueue__Group_2__1__Impl )
            // InternalMoba.g:3341:2: rule__MobaQueue__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueue__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group_2__1"


    // $ANTLR start "rule__MobaQueue__Group_2__1__Impl"
    // InternalMoba.g:3347:1: rule__MobaQueue__Group_2__1__Impl : ( ( rule__MobaQueue__SuperTypeAssignment_2_1 ) ) ;
    public final void rule__MobaQueue__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3351:1: ( ( ( rule__MobaQueue__SuperTypeAssignment_2_1 ) ) )
            // InternalMoba.g:3352:1: ( ( rule__MobaQueue__SuperTypeAssignment_2_1 ) )
            {
            // InternalMoba.g:3352:1: ( ( rule__MobaQueue__SuperTypeAssignment_2_1 ) )
            // InternalMoba.g:3353:2: ( rule__MobaQueue__SuperTypeAssignment_2_1 )
            {
             before(grammarAccess.getMobaQueueAccess().getSuperTypeAssignment_2_1()); 
            // InternalMoba.g:3354:2: ( rule__MobaQueue__SuperTypeAssignment_2_1 )
            // InternalMoba.g:3354:3: rule__MobaQueue__SuperTypeAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueue__SuperTypeAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaQueueAccess().getSuperTypeAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__Group_2__1__Impl"


    // $ANTLR start "rule__MobaRestCustom__Group__0"
    // InternalMoba.g:3363:1: rule__MobaRestCustom__Group__0 : rule__MobaRestCustom__Group__0__Impl rule__MobaRestCustom__Group__1 ;
    public final void rule__MobaRestCustom__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3367:1: ( rule__MobaRestCustom__Group__0__Impl rule__MobaRestCustom__Group__1 )
            // InternalMoba.g:3368:2: rule__MobaRestCustom__Group__0__Impl rule__MobaRestCustom__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaRestCustom__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaRestCustom__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCustom__Group__0"


    // $ANTLR start "rule__MobaRestCustom__Group__0__Impl"
    // InternalMoba.g:3375:1: rule__MobaRestCustom__Group__0__Impl : ( 'rest' ) ;
    public final void rule__MobaRestCustom__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3379:1: ( ( 'rest' ) )
            // InternalMoba.g:3380:1: ( 'rest' )
            {
            // InternalMoba.g:3380:1: ( 'rest' )
            // InternalMoba.g:3381:2: 'rest'
            {
             before(grammarAccess.getMobaRestCustomAccess().getRestKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getMobaRestCustomAccess().getRestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCustom__Group__0__Impl"


    // $ANTLR start "rule__MobaRestCustom__Group__1"
    // InternalMoba.g:3390:1: rule__MobaRestCustom__Group__1 : rule__MobaRestCustom__Group__1__Impl rule__MobaRestCustom__Group__2 ;
    public final void rule__MobaRestCustom__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3394:1: ( rule__MobaRestCustom__Group__1__Impl rule__MobaRestCustom__Group__2 )
            // InternalMoba.g:3395:2: rule__MobaRestCustom__Group__1__Impl rule__MobaRestCustom__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MobaRestCustom__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaRestCustom__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCustom__Group__1"


    // $ANTLR start "rule__MobaRestCustom__Group__1__Impl"
    // InternalMoba.g:3402:1: rule__MobaRestCustom__Group__1__Impl : ( ( rule__MobaRestCustom__NameAssignment_1 ) ) ;
    public final void rule__MobaRestCustom__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3406:1: ( ( ( rule__MobaRestCustom__NameAssignment_1 ) ) )
            // InternalMoba.g:3407:1: ( ( rule__MobaRestCustom__NameAssignment_1 ) )
            {
            // InternalMoba.g:3407:1: ( ( rule__MobaRestCustom__NameAssignment_1 ) )
            // InternalMoba.g:3408:2: ( rule__MobaRestCustom__NameAssignment_1 )
            {
             before(grammarAccess.getMobaRestCustomAccess().getNameAssignment_1()); 
            // InternalMoba.g:3409:2: ( rule__MobaRestCustom__NameAssignment_1 )
            // InternalMoba.g:3409:3: rule__MobaRestCustom__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaRestCustom__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaRestCustomAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCustom__Group__1__Impl"


    // $ANTLR start "rule__MobaRestCustom__Group__2"
    // InternalMoba.g:3417:1: rule__MobaRestCustom__Group__2 : rule__MobaRestCustom__Group__2__Impl ;
    public final void rule__MobaRestCustom__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3421:1: ( rule__MobaRestCustom__Group__2__Impl )
            // InternalMoba.g:3422:2: rule__MobaRestCustom__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaRestCustom__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCustom__Group__2"


    // $ANTLR start "rule__MobaRestCustom__Group__2__Impl"
    // InternalMoba.g:3428:1: rule__MobaRestCustom__Group__2__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaRestCustom__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3432:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:3433:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:3433:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:3434:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaRestCustomAccess().getMobaPropertiesProviderParserRuleCall_2()); 
            // InternalMoba.g:3435:2: ( ruleMobaPropertiesProvider )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==26) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMoba.g:3435:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaRestCustomAccess().getMobaPropertiesProviderParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCustom__Group__2__Impl"


    // $ANTLR start "rule__MobaRestCrud__Group__0"
    // InternalMoba.g:3444:1: rule__MobaRestCrud__Group__0 : rule__MobaRestCrud__Group__0__Impl rule__MobaRestCrud__Group__1 ;
    public final void rule__MobaRestCrud__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3448:1: ( rule__MobaRestCrud__Group__0__Impl rule__MobaRestCrud__Group__1 )
            // InternalMoba.g:3449:2: rule__MobaRestCrud__Group__0__Impl rule__MobaRestCrud__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MobaRestCrud__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaRestCrud__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCrud__Group__0"


    // $ANTLR start "rule__MobaRestCrud__Group__0__Impl"
    // InternalMoba.g:3456:1: rule__MobaRestCrud__Group__0__Impl : ( 'restCrud' ) ;
    public final void rule__MobaRestCrud__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3460:1: ( ( 'restCrud' ) )
            // InternalMoba.g:3461:1: ( 'restCrud' )
            {
            // InternalMoba.g:3461:1: ( 'restCrud' )
            // InternalMoba.g:3462:2: 'restCrud'
            {
             before(grammarAccess.getMobaRestCrudAccess().getRestCrudKeyword_0()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getMobaRestCrudAccess().getRestCrudKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCrud__Group__0__Impl"


    // $ANTLR start "rule__MobaRestCrud__Group__1"
    // InternalMoba.g:3471:1: rule__MobaRestCrud__Group__1 : rule__MobaRestCrud__Group__1__Impl rule__MobaRestCrud__Group__2 ;
    public final void rule__MobaRestCrud__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3475:1: ( rule__MobaRestCrud__Group__1__Impl rule__MobaRestCrud__Group__2 )
            // InternalMoba.g:3476:2: rule__MobaRestCrud__Group__1__Impl rule__MobaRestCrud__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__MobaRestCrud__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaRestCrud__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCrud__Group__1"


    // $ANTLR start "rule__MobaRestCrud__Group__1__Impl"
    // InternalMoba.g:3483:1: rule__MobaRestCrud__Group__1__Impl : ( ( rule__MobaRestCrud__NameAssignment_1 ) ) ;
    public final void rule__MobaRestCrud__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3487:1: ( ( ( rule__MobaRestCrud__NameAssignment_1 ) ) )
            // InternalMoba.g:3488:1: ( ( rule__MobaRestCrud__NameAssignment_1 ) )
            {
            // InternalMoba.g:3488:1: ( ( rule__MobaRestCrud__NameAssignment_1 ) )
            // InternalMoba.g:3489:2: ( rule__MobaRestCrud__NameAssignment_1 )
            {
             before(grammarAccess.getMobaRestCrudAccess().getNameAssignment_1()); 
            // InternalMoba.g:3490:2: ( rule__MobaRestCrud__NameAssignment_1 )
            // InternalMoba.g:3490:3: rule__MobaRestCrud__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaRestCrud__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaRestCrudAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCrud__Group__1__Impl"


    // $ANTLR start "rule__MobaRestCrud__Group__2"
    // InternalMoba.g:3498:1: rule__MobaRestCrud__Group__2 : rule__MobaRestCrud__Group__2__Impl ;
    public final void rule__MobaRestCrud__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3502:1: ( rule__MobaRestCrud__Group__2__Impl )
            // InternalMoba.g:3503:2: rule__MobaRestCrud__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaRestCrud__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCrud__Group__2"


    // $ANTLR start "rule__MobaRestCrud__Group__2__Impl"
    // InternalMoba.g:3509:1: rule__MobaRestCrud__Group__2__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaRestCrud__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3513:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:3514:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:3514:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:3515:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaRestCrudAccess().getMobaPropertiesProviderParserRuleCall_2()); 
            // InternalMoba.g:3516:2: ( ruleMobaPropertiesProvider )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==26) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMoba.g:3516:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaRestCrudAccess().getMobaPropertiesProviderParserRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCrud__Group__2__Impl"


    // $ANTLR start "rule__MobaDtoAttribute__Group__0"
    // InternalMoba.g:3525:1: rule__MobaDtoAttribute__Group__0 : rule__MobaDtoAttribute__Group__0__Impl rule__MobaDtoAttribute__Group__1 ;
    public final void rule__MobaDtoAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3529:1: ( rule__MobaDtoAttribute__Group__0__Impl rule__MobaDtoAttribute__Group__1 )
            // InternalMoba.g:3530:2: rule__MobaDtoAttribute__Group__0__Impl rule__MobaDtoAttribute__Group__1
            {
            pushFollow(FOLLOW_30);
            rule__MobaDtoAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__0"


    // $ANTLR start "rule__MobaDtoAttribute__Group__0__Impl"
    // InternalMoba.g:3537:1: rule__MobaDtoAttribute__Group__0__Impl : ( 'var' ) ;
    public final void rule__MobaDtoAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3541:1: ( ( 'var' ) )
            // InternalMoba.g:3542:1: ( 'var' )
            {
            // InternalMoba.g:3542:1: ( 'var' )
            // InternalMoba.g:3543:2: 'var'
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getVarKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAttributeAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__0__Impl"


    // $ANTLR start "rule__MobaDtoAttribute__Group__1"
    // InternalMoba.g:3552:1: rule__MobaDtoAttribute__Group__1 : rule__MobaDtoAttribute__Group__1__Impl rule__MobaDtoAttribute__Group__2 ;
    public final void rule__MobaDtoAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3556:1: ( rule__MobaDtoAttribute__Group__1__Impl rule__MobaDtoAttribute__Group__2 )
            // InternalMoba.g:3557:2: rule__MobaDtoAttribute__Group__1__Impl rule__MobaDtoAttribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MobaDtoAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__1"


    // $ANTLR start "rule__MobaDtoAttribute__Group__1__Impl"
    // InternalMoba.g:3564:1: rule__MobaDtoAttribute__Group__1__Impl : ( ( rule__MobaDtoAttribute__UnorderedGroup_1 ) ) ;
    public final void rule__MobaDtoAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3568:1: ( ( ( rule__MobaDtoAttribute__UnorderedGroup_1 ) ) )
            // InternalMoba.g:3569:1: ( ( rule__MobaDtoAttribute__UnorderedGroup_1 ) )
            {
            // InternalMoba.g:3569:1: ( ( rule__MobaDtoAttribute__UnorderedGroup_1 ) )
            // InternalMoba.g:3570:2: ( rule__MobaDtoAttribute__UnorderedGroup_1 )
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1()); 
            // InternalMoba.g:3571:2: ( rule__MobaDtoAttribute__UnorderedGroup_1 )
            // InternalMoba.g:3571:3: rule__MobaDtoAttribute__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__1__Impl"


    // $ANTLR start "rule__MobaDtoAttribute__Group__2"
    // InternalMoba.g:3579:1: rule__MobaDtoAttribute__Group__2 : rule__MobaDtoAttribute__Group__2__Impl rule__MobaDtoAttribute__Group__3 ;
    public final void rule__MobaDtoAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3583:1: ( rule__MobaDtoAttribute__Group__2__Impl rule__MobaDtoAttribute__Group__3 )
            // InternalMoba.g:3584:2: rule__MobaDtoAttribute__Group__2__Impl rule__MobaDtoAttribute__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MobaDtoAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__2"


    // $ANTLR start "rule__MobaDtoAttribute__Group__2__Impl"
    // InternalMoba.g:3591:1: rule__MobaDtoAttribute__Group__2__Impl : ( ( rule__MobaDtoAttribute__TypeAssignment_2 ) ) ;
    public final void rule__MobaDtoAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3595:1: ( ( ( rule__MobaDtoAttribute__TypeAssignment_2 ) ) )
            // InternalMoba.g:3596:1: ( ( rule__MobaDtoAttribute__TypeAssignment_2 ) )
            {
            // InternalMoba.g:3596:1: ( ( rule__MobaDtoAttribute__TypeAssignment_2 ) )
            // InternalMoba.g:3597:2: ( rule__MobaDtoAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getTypeAssignment_2()); 
            // InternalMoba.g:3598:2: ( rule__MobaDtoAttribute__TypeAssignment_2 )
            // InternalMoba.g:3598:3: rule__MobaDtoAttribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__2__Impl"


    // $ANTLR start "rule__MobaDtoAttribute__Group__3"
    // InternalMoba.g:3606:1: rule__MobaDtoAttribute__Group__3 : rule__MobaDtoAttribute__Group__3__Impl rule__MobaDtoAttribute__Group__4 ;
    public final void rule__MobaDtoAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3610:1: ( rule__MobaDtoAttribute__Group__3__Impl rule__MobaDtoAttribute__Group__4 )
            // InternalMoba.g:3611:2: rule__MobaDtoAttribute__Group__3__Impl rule__MobaDtoAttribute__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__MobaDtoAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__3"


    // $ANTLR start "rule__MobaDtoAttribute__Group__3__Impl"
    // InternalMoba.g:3618:1: rule__MobaDtoAttribute__Group__3__Impl : ( ruleMobaMultiplicityProvider ) ;
    public final void rule__MobaDtoAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3622:1: ( ( ruleMobaMultiplicityProvider ) )
            // InternalMoba.g:3623:1: ( ruleMobaMultiplicityProvider )
            {
            // InternalMoba.g:3623:1: ( ruleMobaMultiplicityProvider )
            // InternalMoba.g:3624:2: ruleMobaMultiplicityProvider
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getMobaMultiplicityProviderParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleMobaMultiplicityProvider();

            state._fsp--;

             after(grammarAccess.getMobaDtoAttributeAccess().getMobaMultiplicityProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__3__Impl"


    // $ANTLR start "rule__MobaDtoAttribute__Group__4"
    // InternalMoba.g:3633:1: rule__MobaDtoAttribute__Group__4 : rule__MobaDtoAttribute__Group__4__Impl rule__MobaDtoAttribute__Group__5 ;
    public final void rule__MobaDtoAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3637:1: ( rule__MobaDtoAttribute__Group__4__Impl rule__MobaDtoAttribute__Group__5 )
            // InternalMoba.g:3638:2: rule__MobaDtoAttribute__Group__4__Impl rule__MobaDtoAttribute__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MobaDtoAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__4"


    // $ANTLR start "rule__MobaDtoAttribute__Group__4__Impl"
    // InternalMoba.g:3645:1: rule__MobaDtoAttribute__Group__4__Impl : ( ( rule__MobaDtoAttribute__NameAssignment_4 ) ) ;
    public final void rule__MobaDtoAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3649:1: ( ( ( rule__MobaDtoAttribute__NameAssignment_4 ) ) )
            // InternalMoba.g:3650:1: ( ( rule__MobaDtoAttribute__NameAssignment_4 ) )
            {
            // InternalMoba.g:3650:1: ( ( rule__MobaDtoAttribute__NameAssignment_4 ) )
            // InternalMoba.g:3651:2: ( rule__MobaDtoAttribute__NameAssignment_4 )
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getNameAssignment_4()); 
            // InternalMoba.g:3652:2: ( rule__MobaDtoAttribute__NameAssignment_4 )
            // InternalMoba.g:3652:3: rule__MobaDtoAttribute__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoAttributeAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__4__Impl"


    // $ANTLR start "rule__MobaDtoAttribute__Group__5"
    // InternalMoba.g:3660:1: rule__MobaDtoAttribute__Group__5 : rule__MobaDtoAttribute__Group__5__Impl ;
    public final void rule__MobaDtoAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3664:1: ( rule__MobaDtoAttribute__Group__5__Impl )
            // InternalMoba.g:3665:2: rule__MobaDtoAttribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__5"


    // $ANTLR start "rule__MobaDtoAttribute__Group__5__Impl"
    // InternalMoba.g:3671:1: rule__MobaDtoAttribute__Group__5__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaDtoAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3675:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:3676:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:3676:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:3677:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getMobaPropertiesProviderParserRuleCall_5()); 
            // InternalMoba.g:3678:2: ( ruleMobaPropertiesProvider )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==26) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMoba.g:3678:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaDtoAttributeAccess().getMobaPropertiesProviderParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__Group__5__Impl"


    // $ANTLR start "rule__MobaDtoReference__Group__0"
    // InternalMoba.g:3687:1: rule__MobaDtoReference__Group__0 : rule__MobaDtoReference__Group__0__Impl rule__MobaDtoReference__Group__1 ;
    public final void rule__MobaDtoReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3691:1: ( rule__MobaDtoReference__Group__0__Impl rule__MobaDtoReference__Group__1 )
            // InternalMoba.g:3692:2: rule__MobaDtoReference__Group__0__Impl rule__MobaDtoReference__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__MobaDtoReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__0"


    // $ANTLR start "rule__MobaDtoReference__Group__0__Impl"
    // InternalMoba.g:3699:1: rule__MobaDtoReference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__MobaDtoReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3703:1: ( ( 'ref' ) )
            // InternalMoba.g:3704:1: ( 'ref' )
            {
            // InternalMoba.g:3704:1: ( 'ref' )
            // InternalMoba.g:3705:2: 'ref'
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMobaDtoReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__0__Impl"


    // $ANTLR start "rule__MobaDtoReference__Group__1"
    // InternalMoba.g:3714:1: rule__MobaDtoReference__Group__1 : rule__MobaDtoReference__Group__1__Impl rule__MobaDtoReference__Group__2 ;
    public final void rule__MobaDtoReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3718:1: ( rule__MobaDtoReference__Group__1__Impl rule__MobaDtoReference__Group__2 )
            // InternalMoba.g:3719:2: rule__MobaDtoReference__Group__1__Impl rule__MobaDtoReference__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MobaDtoReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__1"


    // $ANTLR start "rule__MobaDtoReference__Group__1__Impl"
    // InternalMoba.g:3726:1: rule__MobaDtoReference__Group__1__Impl : ( ( rule__MobaDtoReference__UnorderedGroup_1 ) ) ;
    public final void rule__MobaDtoReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3730:1: ( ( ( rule__MobaDtoReference__UnorderedGroup_1 ) ) )
            // InternalMoba.g:3731:1: ( ( rule__MobaDtoReference__UnorderedGroup_1 ) )
            {
            // InternalMoba.g:3731:1: ( ( rule__MobaDtoReference__UnorderedGroup_1 ) )
            // InternalMoba.g:3732:2: ( rule__MobaDtoReference__UnorderedGroup_1 )
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1()); 
            // InternalMoba.g:3733:2: ( rule__MobaDtoReference__UnorderedGroup_1 )
            // InternalMoba.g:3733:3: rule__MobaDtoReference__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__1__Impl"


    // $ANTLR start "rule__MobaDtoReference__Group__2"
    // InternalMoba.g:3741:1: rule__MobaDtoReference__Group__2 : rule__MobaDtoReference__Group__2__Impl rule__MobaDtoReference__Group__3 ;
    public final void rule__MobaDtoReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3745:1: ( rule__MobaDtoReference__Group__2__Impl rule__MobaDtoReference__Group__3 )
            // InternalMoba.g:3746:2: rule__MobaDtoReference__Group__2__Impl rule__MobaDtoReference__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MobaDtoReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__2"


    // $ANTLR start "rule__MobaDtoReference__Group__2__Impl"
    // InternalMoba.g:3753:1: rule__MobaDtoReference__Group__2__Impl : ( ( rule__MobaDtoReference__TypeAssignment_2 ) ) ;
    public final void rule__MobaDtoReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3757:1: ( ( ( rule__MobaDtoReference__TypeAssignment_2 ) ) )
            // InternalMoba.g:3758:1: ( ( rule__MobaDtoReference__TypeAssignment_2 ) )
            {
            // InternalMoba.g:3758:1: ( ( rule__MobaDtoReference__TypeAssignment_2 ) )
            // InternalMoba.g:3759:2: ( rule__MobaDtoReference__TypeAssignment_2 )
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getTypeAssignment_2()); 
            // InternalMoba.g:3760:2: ( rule__MobaDtoReference__TypeAssignment_2 )
            // InternalMoba.g:3760:3: rule__MobaDtoReference__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoReferenceAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__2__Impl"


    // $ANTLR start "rule__MobaDtoReference__Group__3"
    // InternalMoba.g:3768:1: rule__MobaDtoReference__Group__3 : rule__MobaDtoReference__Group__3__Impl rule__MobaDtoReference__Group__4 ;
    public final void rule__MobaDtoReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3772:1: ( rule__MobaDtoReference__Group__3__Impl rule__MobaDtoReference__Group__4 )
            // InternalMoba.g:3773:2: rule__MobaDtoReference__Group__3__Impl rule__MobaDtoReference__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__MobaDtoReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__3"


    // $ANTLR start "rule__MobaDtoReference__Group__3__Impl"
    // InternalMoba.g:3780:1: rule__MobaDtoReference__Group__3__Impl : ( ruleMobaMultiplicityProvider ) ;
    public final void rule__MobaDtoReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3784:1: ( ( ruleMobaMultiplicityProvider ) )
            // InternalMoba.g:3785:1: ( ruleMobaMultiplicityProvider )
            {
            // InternalMoba.g:3785:1: ( ruleMobaMultiplicityProvider )
            // InternalMoba.g:3786:2: ruleMobaMultiplicityProvider
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getMobaMultiplicityProviderParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleMobaMultiplicityProvider();

            state._fsp--;

             after(grammarAccess.getMobaDtoReferenceAccess().getMobaMultiplicityProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__3__Impl"


    // $ANTLR start "rule__MobaDtoReference__Group__4"
    // InternalMoba.g:3795:1: rule__MobaDtoReference__Group__4 : rule__MobaDtoReference__Group__4__Impl rule__MobaDtoReference__Group__5 ;
    public final void rule__MobaDtoReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3799:1: ( rule__MobaDtoReference__Group__4__Impl rule__MobaDtoReference__Group__5 )
            // InternalMoba.g:3800:2: rule__MobaDtoReference__Group__4__Impl rule__MobaDtoReference__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MobaDtoReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__4"


    // $ANTLR start "rule__MobaDtoReference__Group__4__Impl"
    // InternalMoba.g:3807:1: rule__MobaDtoReference__Group__4__Impl : ( ( rule__MobaDtoReference__NameAssignment_4 ) ) ;
    public final void rule__MobaDtoReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3811:1: ( ( ( rule__MobaDtoReference__NameAssignment_4 ) ) )
            // InternalMoba.g:3812:1: ( ( rule__MobaDtoReference__NameAssignment_4 ) )
            {
            // InternalMoba.g:3812:1: ( ( rule__MobaDtoReference__NameAssignment_4 ) )
            // InternalMoba.g:3813:2: ( rule__MobaDtoReference__NameAssignment_4 )
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getNameAssignment_4()); 
            // InternalMoba.g:3814:2: ( rule__MobaDtoReference__NameAssignment_4 )
            // InternalMoba.g:3814:3: rule__MobaDtoReference__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMobaDtoReferenceAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__4__Impl"


    // $ANTLR start "rule__MobaDtoReference__Group__5"
    // InternalMoba.g:3822:1: rule__MobaDtoReference__Group__5 : rule__MobaDtoReference__Group__5__Impl ;
    public final void rule__MobaDtoReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3826:1: ( rule__MobaDtoReference__Group__5__Impl )
            // InternalMoba.g:3827:2: rule__MobaDtoReference__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__5"


    // $ANTLR start "rule__MobaDtoReference__Group__5__Impl"
    // InternalMoba.g:3833:1: rule__MobaDtoReference__Group__5__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaDtoReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3837:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:3838:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:3838:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:3839:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getMobaPropertiesProviderParserRuleCall_5()); 
            // InternalMoba.g:3840:2: ( ruleMobaPropertiesProvider )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==26) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoba.g:3840:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaDtoReferenceAccess().getMobaPropertiesProviderParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__Group__5__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__0"
    // InternalMoba.g:3849:1: rule__MobaPayloadAttribute__Group__0 : rule__MobaPayloadAttribute__Group__0__Impl rule__MobaPayloadAttribute__Group__1 ;
    public final void rule__MobaPayloadAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3853:1: ( rule__MobaPayloadAttribute__Group__0__Impl rule__MobaPayloadAttribute__Group__1 )
            // InternalMoba.g:3854:2: rule__MobaPayloadAttribute__Group__0__Impl rule__MobaPayloadAttribute__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__MobaPayloadAttribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__0"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__0__Impl"
    // InternalMoba.g:3861:1: rule__MobaPayloadAttribute__Group__0__Impl : ( 'var' ) ;
    public final void rule__MobaPayloadAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3865:1: ( ( 'var' ) )
            // InternalMoba.g:3866:1: ( 'var' )
            {
            // InternalMoba.g:3866:1: ( 'var' )
            // InternalMoba.g:3867:2: 'var'
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getVarKeyword_0()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__0__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__1"
    // InternalMoba.g:3876:1: rule__MobaPayloadAttribute__Group__1 : rule__MobaPayloadAttribute__Group__1__Impl rule__MobaPayloadAttribute__Group__2 ;
    public final void rule__MobaPayloadAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3880:1: ( rule__MobaPayloadAttribute__Group__1__Impl rule__MobaPayloadAttribute__Group__2 )
            // InternalMoba.g:3881:2: rule__MobaPayloadAttribute__Group__1__Impl rule__MobaPayloadAttribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MobaPayloadAttribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__1"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__1__Impl"
    // InternalMoba.g:3888:1: rule__MobaPayloadAttribute__Group__1__Impl : ( ( rule__MobaPayloadAttribute__UnorderedGroup_1 ) ) ;
    public final void rule__MobaPayloadAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3892:1: ( ( ( rule__MobaPayloadAttribute__UnorderedGroup_1 ) ) )
            // InternalMoba.g:3893:1: ( ( rule__MobaPayloadAttribute__UnorderedGroup_1 ) )
            {
            // InternalMoba.g:3893:1: ( ( rule__MobaPayloadAttribute__UnorderedGroup_1 ) )
            // InternalMoba.g:3894:2: ( rule__MobaPayloadAttribute__UnorderedGroup_1 )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1()); 
            // InternalMoba.g:3895:2: ( rule__MobaPayloadAttribute__UnorderedGroup_1 )
            // InternalMoba.g:3895:3: rule__MobaPayloadAttribute__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__1__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__2"
    // InternalMoba.g:3903:1: rule__MobaPayloadAttribute__Group__2 : rule__MobaPayloadAttribute__Group__2__Impl rule__MobaPayloadAttribute__Group__3 ;
    public final void rule__MobaPayloadAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3907:1: ( rule__MobaPayloadAttribute__Group__2__Impl rule__MobaPayloadAttribute__Group__3 )
            // InternalMoba.g:3908:2: rule__MobaPayloadAttribute__Group__2__Impl rule__MobaPayloadAttribute__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MobaPayloadAttribute__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__2"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__2__Impl"
    // InternalMoba.g:3915:1: rule__MobaPayloadAttribute__Group__2__Impl : ( ( rule__MobaPayloadAttribute__TypeAssignment_2 ) ) ;
    public final void rule__MobaPayloadAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3919:1: ( ( ( rule__MobaPayloadAttribute__TypeAssignment_2 ) ) )
            // InternalMoba.g:3920:1: ( ( rule__MobaPayloadAttribute__TypeAssignment_2 ) )
            {
            // InternalMoba.g:3920:1: ( ( rule__MobaPayloadAttribute__TypeAssignment_2 ) )
            // InternalMoba.g:3921:2: ( rule__MobaPayloadAttribute__TypeAssignment_2 )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getTypeAssignment_2()); 
            // InternalMoba.g:3922:2: ( rule__MobaPayloadAttribute__TypeAssignment_2 )
            // InternalMoba.g:3922:3: rule__MobaPayloadAttribute__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__2__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__3"
    // InternalMoba.g:3930:1: rule__MobaPayloadAttribute__Group__3 : rule__MobaPayloadAttribute__Group__3__Impl rule__MobaPayloadAttribute__Group__4 ;
    public final void rule__MobaPayloadAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3934:1: ( rule__MobaPayloadAttribute__Group__3__Impl rule__MobaPayloadAttribute__Group__4 )
            // InternalMoba.g:3935:2: rule__MobaPayloadAttribute__Group__3__Impl rule__MobaPayloadAttribute__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__MobaPayloadAttribute__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__3"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__3__Impl"
    // InternalMoba.g:3942:1: rule__MobaPayloadAttribute__Group__3__Impl : ( ruleMobaMultiplicityProvider ) ;
    public final void rule__MobaPayloadAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3946:1: ( ( ruleMobaMultiplicityProvider ) )
            // InternalMoba.g:3947:1: ( ruleMobaMultiplicityProvider )
            {
            // InternalMoba.g:3947:1: ( ruleMobaMultiplicityProvider )
            // InternalMoba.g:3948:2: ruleMobaMultiplicityProvider
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getMobaMultiplicityProviderParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleMobaMultiplicityProvider();

            state._fsp--;

             after(grammarAccess.getMobaPayloadAttributeAccess().getMobaMultiplicityProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__3__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__4"
    // InternalMoba.g:3957:1: rule__MobaPayloadAttribute__Group__4 : rule__MobaPayloadAttribute__Group__4__Impl rule__MobaPayloadAttribute__Group__5 ;
    public final void rule__MobaPayloadAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3961:1: ( rule__MobaPayloadAttribute__Group__4__Impl rule__MobaPayloadAttribute__Group__5 )
            // InternalMoba.g:3962:2: rule__MobaPayloadAttribute__Group__4__Impl rule__MobaPayloadAttribute__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MobaPayloadAttribute__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__4"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__4__Impl"
    // InternalMoba.g:3969:1: rule__MobaPayloadAttribute__Group__4__Impl : ( ( rule__MobaPayloadAttribute__NameAssignment_4 ) ) ;
    public final void rule__MobaPayloadAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3973:1: ( ( ( rule__MobaPayloadAttribute__NameAssignment_4 ) ) )
            // InternalMoba.g:3974:1: ( ( rule__MobaPayloadAttribute__NameAssignment_4 ) )
            {
            // InternalMoba.g:3974:1: ( ( rule__MobaPayloadAttribute__NameAssignment_4 ) )
            // InternalMoba.g:3975:2: ( rule__MobaPayloadAttribute__NameAssignment_4 )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getNameAssignment_4()); 
            // InternalMoba.g:3976:2: ( rule__MobaPayloadAttribute__NameAssignment_4 )
            // InternalMoba.g:3976:3: rule__MobaPayloadAttribute__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__4__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__5"
    // InternalMoba.g:3984:1: rule__MobaPayloadAttribute__Group__5 : rule__MobaPayloadAttribute__Group__5__Impl ;
    public final void rule__MobaPayloadAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3988:1: ( rule__MobaPayloadAttribute__Group__5__Impl )
            // InternalMoba.g:3989:2: rule__MobaPayloadAttribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__5"


    // $ANTLR start "rule__MobaPayloadAttribute__Group__5__Impl"
    // InternalMoba.g:3995:1: rule__MobaPayloadAttribute__Group__5__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaPayloadAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:3999:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:4000:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:4000:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:4001:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getMobaPropertiesProviderParserRuleCall_5()); 
            // InternalMoba.g:4002:2: ( ruleMobaPropertiesProvider )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==26) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoba.g:4002:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getMobaPropertiesProviderParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group__5__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group_1_4__0"
    // InternalMoba.g:4011:1: rule__MobaPayloadAttribute__Group_1_4__0 : rule__MobaPayloadAttribute__Group_1_4__0__Impl rule__MobaPayloadAttribute__Group_1_4__1 ;
    public final void rule__MobaPayloadAttribute__Group_1_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4015:1: ( rule__MobaPayloadAttribute__Group_1_4__0__Impl rule__MobaPayloadAttribute__Group_1_4__1 )
            // InternalMoba.g:4016:2: rule__MobaPayloadAttribute__Group_1_4__0__Impl rule__MobaPayloadAttribute__Group_1_4__1
            {
            pushFollow(FOLLOW_10);
            rule__MobaPayloadAttribute__Group_1_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group_1_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group_1_4__0"


    // $ANTLR start "rule__MobaPayloadAttribute__Group_1_4__0__Impl"
    // InternalMoba.g:4023:1: rule__MobaPayloadAttribute__Group_1_4__0__Impl : ( 'alias' ) ;
    public final void rule__MobaPayloadAttribute__Group_1_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4027:1: ( ( 'alias' ) )
            // InternalMoba.g:4028:1: ( 'alias' )
            {
            // InternalMoba.g:4028:1: ( 'alias' )
            // InternalMoba.g:4029:2: 'alias'
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getAliasKeyword_1_4_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getAliasKeyword_1_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group_1_4__0__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group_1_4__1"
    // InternalMoba.g:4038:1: rule__MobaPayloadAttribute__Group_1_4__1 : rule__MobaPayloadAttribute__Group_1_4__1__Impl rule__MobaPayloadAttribute__Group_1_4__2 ;
    public final void rule__MobaPayloadAttribute__Group_1_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4042:1: ( rule__MobaPayloadAttribute__Group_1_4__1__Impl rule__MobaPayloadAttribute__Group_1_4__2 )
            // InternalMoba.g:4043:2: rule__MobaPayloadAttribute__Group_1_4__1__Impl rule__MobaPayloadAttribute__Group_1_4__2
            {
            pushFollow(FOLLOW_3);
            rule__MobaPayloadAttribute__Group_1_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group_1_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group_1_4__1"


    // $ANTLR start "rule__MobaPayloadAttribute__Group_1_4__1__Impl"
    // InternalMoba.g:4050:1: rule__MobaPayloadAttribute__Group_1_4__1__Impl : ( '(' ) ;
    public final void rule__MobaPayloadAttribute__Group_1_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4054:1: ( ( '(' ) )
            // InternalMoba.g:4055:1: ( '(' )
            {
            // InternalMoba.g:4055:1: ( '(' )
            // InternalMoba.g:4056:2: '('
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getLeftParenthesisKeyword_1_4_1()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getLeftParenthesisKeyword_1_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group_1_4__1__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group_1_4__2"
    // InternalMoba.g:4065:1: rule__MobaPayloadAttribute__Group_1_4__2 : rule__MobaPayloadAttribute__Group_1_4__2__Impl rule__MobaPayloadAttribute__Group_1_4__3 ;
    public final void rule__MobaPayloadAttribute__Group_1_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4069:1: ( rule__MobaPayloadAttribute__Group_1_4__2__Impl rule__MobaPayloadAttribute__Group_1_4__3 )
            // InternalMoba.g:4070:2: rule__MobaPayloadAttribute__Group_1_4__2__Impl rule__MobaPayloadAttribute__Group_1_4__3
            {
            pushFollow(FOLLOW_11);
            rule__MobaPayloadAttribute__Group_1_4__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group_1_4__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group_1_4__2"


    // $ANTLR start "rule__MobaPayloadAttribute__Group_1_4__2__Impl"
    // InternalMoba.g:4077:1: rule__MobaPayloadAttribute__Group_1_4__2__Impl : ( ( rule__MobaPayloadAttribute__AliasAssignment_1_4_2 ) ) ;
    public final void rule__MobaPayloadAttribute__Group_1_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4081:1: ( ( ( rule__MobaPayloadAttribute__AliasAssignment_1_4_2 ) ) )
            // InternalMoba.g:4082:1: ( ( rule__MobaPayloadAttribute__AliasAssignment_1_4_2 ) )
            {
            // InternalMoba.g:4082:1: ( ( rule__MobaPayloadAttribute__AliasAssignment_1_4_2 ) )
            // InternalMoba.g:4083:2: ( rule__MobaPayloadAttribute__AliasAssignment_1_4_2 )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getAliasAssignment_1_4_2()); 
            // InternalMoba.g:4084:2: ( rule__MobaPayloadAttribute__AliasAssignment_1_4_2 )
            // InternalMoba.g:4084:3: rule__MobaPayloadAttribute__AliasAssignment_1_4_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__AliasAssignment_1_4_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getAliasAssignment_1_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group_1_4__2__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__Group_1_4__3"
    // InternalMoba.g:4092:1: rule__MobaPayloadAttribute__Group_1_4__3 : rule__MobaPayloadAttribute__Group_1_4__3__Impl ;
    public final void rule__MobaPayloadAttribute__Group_1_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4096:1: ( rule__MobaPayloadAttribute__Group_1_4__3__Impl )
            // InternalMoba.g:4097:2: rule__MobaPayloadAttribute__Group_1_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__Group_1_4__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group_1_4__3"


    // $ANTLR start "rule__MobaPayloadAttribute__Group_1_4__3__Impl"
    // InternalMoba.g:4103:1: rule__MobaPayloadAttribute__Group_1_4__3__Impl : ( ')' ) ;
    public final void rule__MobaPayloadAttribute__Group_1_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4107:1: ( ( ')' ) )
            // InternalMoba.g:4108:1: ( ')' )
            {
            // InternalMoba.g:4108:1: ( ')' )
            // InternalMoba.g:4109:2: ')'
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getRightParenthesisKeyword_1_4_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getRightParenthesisKeyword_1_4_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__Group_1_4__3__Impl"


    // $ANTLR start "rule__MobaPayloadReference__Group__0"
    // InternalMoba.g:4119:1: rule__MobaPayloadReference__Group__0 : rule__MobaPayloadReference__Group__0__Impl rule__MobaPayloadReference__Group__1 ;
    public final void rule__MobaPayloadReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4123:1: ( rule__MobaPayloadReference__Group__0__Impl rule__MobaPayloadReference__Group__1 )
            // InternalMoba.g:4124:2: rule__MobaPayloadReference__Group__0__Impl rule__MobaPayloadReference__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__MobaPayloadReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__0"


    // $ANTLR start "rule__MobaPayloadReference__Group__0__Impl"
    // InternalMoba.g:4131:1: rule__MobaPayloadReference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__MobaPayloadReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4135:1: ( ( 'ref' ) )
            // InternalMoba.g:4136:1: ( 'ref' )
            {
            // InternalMoba.g:4136:1: ( 'ref' )
            // InternalMoba.g:4137:2: 'ref'
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__0__Impl"


    // $ANTLR start "rule__MobaPayloadReference__Group__1"
    // InternalMoba.g:4146:1: rule__MobaPayloadReference__Group__1 : rule__MobaPayloadReference__Group__1__Impl rule__MobaPayloadReference__Group__2 ;
    public final void rule__MobaPayloadReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4150:1: ( rule__MobaPayloadReference__Group__1__Impl rule__MobaPayloadReference__Group__2 )
            // InternalMoba.g:4151:2: rule__MobaPayloadReference__Group__1__Impl rule__MobaPayloadReference__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MobaPayloadReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__1"


    // $ANTLR start "rule__MobaPayloadReference__Group__1__Impl"
    // InternalMoba.g:4158:1: rule__MobaPayloadReference__Group__1__Impl : ( ( rule__MobaPayloadReference__UnorderedGroup_1 ) ) ;
    public final void rule__MobaPayloadReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4162:1: ( ( ( rule__MobaPayloadReference__UnorderedGroup_1 ) ) )
            // InternalMoba.g:4163:1: ( ( rule__MobaPayloadReference__UnorderedGroup_1 ) )
            {
            // InternalMoba.g:4163:1: ( ( rule__MobaPayloadReference__UnorderedGroup_1 ) )
            // InternalMoba.g:4164:2: ( rule__MobaPayloadReference__UnorderedGroup_1 )
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1()); 
            // InternalMoba.g:4165:2: ( rule__MobaPayloadReference__UnorderedGroup_1 )
            // InternalMoba.g:4165:3: rule__MobaPayloadReference__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__1__Impl"


    // $ANTLR start "rule__MobaPayloadReference__Group__2"
    // InternalMoba.g:4173:1: rule__MobaPayloadReference__Group__2 : rule__MobaPayloadReference__Group__2__Impl rule__MobaPayloadReference__Group__3 ;
    public final void rule__MobaPayloadReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4177:1: ( rule__MobaPayloadReference__Group__2__Impl rule__MobaPayloadReference__Group__3 )
            // InternalMoba.g:4178:2: rule__MobaPayloadReference__Group__2__Impl rule__MobaPayloadReference__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MobaPayloadReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__2"


    // $ANTLR start "rule__MobaPayloadReference__Group__2__Impl"
    // InternalMoba.g:4185:1: rule__MobaPayloadReference__Group__2__Impl : ( ( rule__MobaPayloadReference__TypeAssignment_2 ) ) ;
    public final void rule__MobaPayloadReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4189:1: ( ( ( rule__MobaPayloadReference__TypeAssignment_2 ) ) )
            // InternalMoba.g:4190:1: ( ( rule__MobaPayloadReference__TypeAssignment_2 ) )
            {
            // InternalMoba.g:4190:1: ( ( rule__MobaPayloadReference__TypeAssignment_2 ) )
            // InternalMoba.g:4191:2: ( rule__MobaPayloadReference__TypeAssignment_2 )
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getTypeAssignment_2()); 
            // InternalMoba.g:4192:2: ( rule__MobaPayloadReference__TypeAssignment_2 )
            // InternalMoba.g:4192:3: rule__MobaPayloadReference__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadReferenceAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__2__Impl"


    // $ANTLR start "rule__MobaPayloadReference__Group__3"
    // InternalMoba.g:4200:1: rule__MobaPayloadReference__Group__3 : rule__MobaPayloadReference__Group__3__Impl rule__MobaPayloadReference__Group__4 ;
    public final void rule__MobaPayloadReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4204:1: ( rule__MobaPayloadReference__Group__3__Impl rule__MobaPayloadReference__Group__4 )
            // InternalMoba.g:4205:2: rule__MobaPayloadReference__Group__3__Impl rule__MobaPayloadReference__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__MobaPayloadReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__3"


    // $ANTLR start "rule__MobaPayloadReference__Group__3__Impl"
    // InternalMoba.g:4212:1: rule__MobaPayloadReference__Group__3__Impl : ( ruleMobaMultiplicityProvider ) ;
    public final void rule__MobaPayloadReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4216:1: ( ( ruleMobaMultiplicityProvider ) )
            // InternalMoba.g:4217:1: ( ruleMobaMultiplicityProvider )
            {
            // InternalMoba.g:4217:1: ( ruleMobaMultiplicityProvider )
            // InternalMoba.g:4218:2: ruleMobaMultiplicityProvider
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getMobaMultiplicityProviderParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleMobaMultiplicityProvider();

            state._fsp--;

             after(grammarAccess.getMobaPayloadReferenceAccess().getMobaMultiplicityProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__3__Impl"


    // $ANTLR start "rule__MobaPayloadReference__Group__4"
    // InternalMoba.g:4227:1: rule__MobaPayloadReference__Group__4 : rule__MobaPayloadReference__Group__4__Impl rule__MobaPayloadReference__Group__5 ;
    public final void rule__MobaPayloadReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4231:1: ( rule__MobaPayloadReference__Group__4__Impl rule__MobaPayloadReference__Group__5 )
            // InternalMoba.g:4232:2: rule__MobaPayloadReference__Group__4__Impl rule__MobaPayloadReference__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MobaPayloadReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__4"


    // $ANTLR start "rule__MobaPayloadReference__Group__4__Impl"
    // InternalMoba.g:4239:1: rule__MobaPayloadReference__Group__4__Impl : ( ( rule__MobaPayloadReference__NameAssignment_4 ) ) ;
    public final void rule__MobaPayloadReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4243:1: ( ( ( rule__MobaPayloadReference__NameAssignment_4 ) ) )
            // InternalMoba.g:4244:1: ( ( rule__MobaPayloadReference__NameAssignment_4 ) )
            {
            // InternalMoba.g:4244:1: ( ( rule__MobaPayloadReference__NameAssignment_4 ) )
            // InternalMoba.g:4245:2: ( rule__MobaPayloadReference__NameAssignment_4 )
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getNameAssignment_4()); 
            // InternalMoba.g:4246:2: ( rule__MobaPayloadReference__NameAssignment_4 )
            // InternalMoba.g:4246:3: rule__MobaPayloadReference__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMobaPayloadReferenceAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__4__Impl"


    // $ANTLR start "rule__MobaPayloadReference__Group__5"
    // InternalMoba.g:4254:1: rule__MobaPayloadReference__Group__5 : rule__MobaPayloadReference__Group__5__Impl ;
    public final void rule__MobaPayloadReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4258:1: ( rule__MobaPayloadReference__Group__5__Impl )
            // InternalMoba.g:4259:2: rule__MobaPayloadReference__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__5"


    // $ANTLR start "rule__MobaPayloadReference__Group__5__Impl"
    // InternalMoba.g:4265:1: rule__MobaPayloadReference__Group__5__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaPayloadReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4269:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:4270:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:4270:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:4271:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getMobaPropertiesProviderParserRuleCall_5()); 
            // InternalMoba.g:4272:2: ( ruleMobaPropertiesProvider )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==26) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoba.g:4272:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaPayloadReferenceAccess().getMobaPropertiesProviderParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__Group__5__Impl"


    // $ANTLR start "rule__MobaQueueReference__Group__0"
    // InternalMoba.g:4281:1: rule__MobaQueueReference__Group__0 : rule__MobaQueueReference__Group__0__Impl rule__MobaQueueReference__Group__1 ;
    public final void rule__MobaQueueReference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4285:1: ( rule__MobaQueueReference__Group__0__Impl rule__MobaQueueReference__Group__1 )
            // InternalMoba.g:4286:2: rule__MobaQueueReference__Group__0__Impl rule__MobaQueueReference__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__MobaQueueReference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__0"


    // $ANTLR start "rule__MobaQueueReference__Group__0__Impl"
    // InternalMoba.g:4293:1: rule__MobaQueueReference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__MobaQueueReference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4297:1: ( ( 'ref' ) )
            // InternalMoba.g:4298:1: ( 'ref' )
            {
            // InternalMoba.g:4298:1: ( 'ref' )
            // InternalMoba.g:4299:2: 'ref'
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__0__Impl"


    // $ANTLR start "rule__MobaQueueReference__Group__1"
    // InternalMoba.g:4308:1: rule__MobaQueueReference__Group__1 : rule__MobaQueueReference__Group__1__Impl rule__MobaQueueReference__Group__2 ;
    public final void rule__MobaQueueReference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4312:1: ( rule__MobaQueueReference__Group__1__Impl rule__MobaQueueReference__Group__2 )
            // InternalMoba.g:4313:2: rule__MobaQueueReference__Group__1__Impl rule__MobaQueueReference__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__MobaQueueReference__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__1"


    // $ANTLR start "rule__MobaQueueReference__Group__1__Impl"
    // InternalMoba.g:4320:1: rule__MobaQueueReference__Group__1__Impl : ( ( rule__MobaQueueReference__UnorderedGroup_1 ) ) ;
    public final void rule__MobaQueueReference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4324:1: ( ( ( rule__MobaQueueReference__UnorderedGroup_1 ) ) )
            // InternalMoba.g:4325:1: ( ( rule__MobaQueueReference__UnorderedGroup_1 ) )
            {
            // InternalMoba.g:4325:1: ( ( rule__MobaQueueReference__UnorderedGroup_1 ) )
            // InternalMoba.g:4326:2: ( rule__MobaQueueReference__UnorderedGroup_1 )
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1()); 
            // InternalMoba.g:4327:2: ( rule__MobaQueueReference__UnorderedGroup_1 )
            // InternalMoba.g:4327:3: rule__MobaQueueReference__UnorderedGroup_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__UnorderedGroup_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__1__Impl"


    // $ANTLR start "rule__MobaQueueReference__Group__2"
    // InternalMoba.g:4335:1: rule__MobaQueueReference__Group__2 : rule__MobaQueueReference__Group__2__Impl rule__MobaQueueReference__Group__3 ;
    public final void rule__MobaQueueReference__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4339:1: ( rule__MobaQueueReference__Group__2__Impl rule__MobaQueueReference__Group__3 )
            // InternalMoba.g:4340:2: rule__MobaQueueReference__Group__2__Impl rule__MobaQueueReference__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__MobaQueueReference__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__2"


    // $ANTLR start "rule__MobaQueueReference__Group__2__Impl"
    // InternalMoba.g:4347:1: rule__MobaQueueReference__Group__2__Impl : ( ( rule__MobaQueueReference__TypeAssignment_2 ) ) ;
    public final void rule__MobaQueueReference__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4351:1: ( ( ( rule__MobaQueueReference__TypeAssignment_2 ) ) )
            // InternalMoba.g:4352:1: ( ( rule__MobaQueueReference__TypeAssignment_2 ) )
            {
            // InternalMoba.g:4352:1: ( ( rule__MobaQueueReference__TypeAssignment_2 ) )
            // InternalMoba.g:4353:2: ( rule__MobaQueueReference__TypeAssignment_2 )
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getTypeAssignment_2()); 
            // InternalMoba.g:4354:2: ( rule__MobaQueueReference__TypeAssignment_2 )
            // InternalMoba.g:4354:3: rule__MobaQueueReference__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMobaQueueReferenceAccess().getTypeAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__2__Impl"


    // $ANTLR start "rule__MobaQueueReference__Group__3"
    // InternalMoba.g:4362:1: rule__MobaQueueReference__Group__3 : rule__MobaQueueReference__Group__3__Impl rule__MobaQueueReference__Group__4 ;
    public final void rule__MobaQueueReference__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4366:1: ( rule__MobaQueueReference__Group__3__Impl rule__MobaQueueReference__Group__4 )
            // InternalMoba.g:4367:2: rule__MobaQueueReference__Group__3__Impl rule__MobaQueueReference__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__MobaQueueReference__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__3"


    // $ANTLR start "rule__MobaQueueReference__Group__3__Impl"
    // InternalMoba.g:4374:1: rule__MobaQueueReference__Group__3__Impl : ( ruleMobaMultiplicityProvider ) ;
    public final void rule__MobaQueueReference__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4378:1: ( ( ruleMobaMultiplicityProvider ) )
            // InternalMoba.g:4379:1: ( ruleMobaMultiplicityProvider )
            {
            // InternalMoba.g:4379:1: ( ruleMobaMultiplicityProvider )
            // InternalMoba.g:4380:2: ruleMobaMultiplicityProvider
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getMobaMultiplicityProviderParserRuleCall_3()); 
            pushFollow(FOLLOW_2);
            ruleMobaMultiplicityProvider();

            state._fsp--;

             after(grammarAccess.getMobaQueueReferenceAccess().getMobaMultiplicityProviderParserRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__3__Impl"


    // $ANTLR start "rule__MobaQueueReference__Group__4"
    // InternalMoba.g:4389:1: rule__MobaQueueReference__Group__4 : rule__MobaQueueReference__Group__4__Impl rule__MobaQueueReference__Group__5 ;
    public final void rule__MobaQueueReference__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4393:1: ( rule__MobaQueueReference__Group__4__Impl rule__MobaQueueReference__Group__5 )
            // InternalMoba.g:4394:2: rule__MobaQueueReference__Group__4__Impl rule__MobaQueueReference__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__MobaQueueReference__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__4"


    // $ANTLR start "rule__MobaQueueReference__Group__4__Impl"
    // InternalMoba.g:4401:1: rule__MobaQueueReference__Group__4__Impl : ( ( rule__MobaQueueReference__NameAssignment_4 ) ) ;
    public final void rule__MobaQueueReference__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4405:1: ( ( ( rule__MobaQueueReference__NameAssignment_4 ) ) )
            // InternalMoba.g:4406:1: ( ( rule__MobaQueueReference__NameAssignment_4 ) )
            {
            // InternalMoba.g:4406:1: ( ( rule__MobaQueueReference__NameAssignment_4 ) )
            // InternalMoba.g:4407:2: ( rule__MobaQueueReference__NameAssignment_4 )
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getNameAssignment_4()); 
            // InternalMoba.g:4408:2: ( rule__MobaQueueReference__NameAssignment_4 )
            // InternalMoba.g:4408:3: rule__MobaQueueReference__NameAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getMobaQueueReferenceAccess().getNameAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__4__Impl"


    // $ANTLR start "rule__MobaQueueReference__Group__5"
    // InternalMoba.g:4416:1: rule__MobaQueueReference__Group__5 : rule__MobaQueueReference__Group__5__Impl ;
    public final void rule__MobaQueueReference__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4420:1: ( rule__MobaQueueReference__Group__5__Impl )
            // InternalMoba.g:4421:2: rule__MobaQueueReference__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__5"


    // $ANTLR start "rule__MobaQueueReference__Group__5__Impl"
    // InternalMoba.g:4427:1: rule__MobaQueueReference__Group__5__Impl : ( ( ruleMobaPropertiesProvider )? ) ;
    public final void rule__MobaQueueReference__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4431:1: ( ( ( ruleMobaPropertiesProvider )? ) )
            // InternalMoba.g:4432:1: ( ( ruleMobaPropertiesProvider )? )
            {
            // InternalMoba.g:4432:1: ( ( ruleMobaPropertiesProvider )? )
            // InternalMoba.g:4433:2: ( ruleMobaPropertiesProvider )?
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getMobaPropertiesProviderParserRuleCall_5()); 
            // InternalMoba.g:4434:2: ( ruleMobaPropertiesProvider )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==26) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoba.g:4434:3: ruleMobaPropertiesProvider
                    {
                    pushFollow(FOLLOW_2);
                    ruleMobaPropertiesProvider();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaQueueReferenceAccess().getMobaPropertiesProviderParserRuleCall_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__Group__5__Impl"


    // $ANTLR start "rule__MobaMuliplicity__Group__0"
    // InternalMoba.g:4443:1: rule__MobaMuliplicity__Group__0 : rule__MobaMuliplicity__Group__0__Impl rule__MobaMuliplicity__Group__1 ;
    public final void rule__MobaMuliplicity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4447:1: ( rule__MobaMuliplicity__Group__0__Impl rule__MobaMuliplicity__Group__1 )
            // InternalMoba.g:4448:2: rule__MobaMuliplicity__Group__0__Impl rule__MobaMuliplicity__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__MobaMuliplicity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaMuliplicity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group__0"


    // $ANTLR start "rule__MobaMuliplicity__Group__0__Impl"
    // InternalMoba.g:4455:1: rule__MobaMuliplicity__Group__0__Impl : ( '[' ) ;
    public final void rule__MobaMuliplicity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4459:1: ( ( '[' ) )
            // InternalMoba.g:4460:1: ( '[' )
            {
            // InternalMoba.g:4460:1: ( '[' )
            // InternalMoba.g:4461:2: '['
            {
             before(grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group__0__Impl"


    // $ANTLR start "rule__MobaMuliplicity__Group__1"
    // InternalMoba.g:4470:1: rule__MobaMuliplicity__Group__1 : rule__MobaMuliplicity__Group__1__Impl rule__MobaMuliplicity__Group__2 ;
    public final void rule__MobaMuliplicity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4474:1: ( rule__MobaMuliplicity__Group__1__Impl rule__MobaMuliplicity__Group__2 )
            // InternalMoba.g:4475:2: rule__MobaMuliplicity__Group__1__Impl rule__MobaMuliplicity__Group__2
            {
            pushFollow(FOLLOW_34);
            rule__MobaMuliplicity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaMuliplicity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group__1"


    // $ANTLR start "rule__MobaMuliplicity__Group__1__Impl"
    // InternalMoba.g:4482:1: rule__MobaMuliplicity__Group__1__Impl : ( ( rule__MobaMuliplicity__LowerAssignment_1 ) ) ;
    public final void rule__MobaMuliplicity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4486:1: ( ( ( rule__MobaMuliplicity__LowerAssignment_1 ) ) )
            // InternalMoba.g:4487:1: ( ( rule__MobaMuliplicity__LowerAssignment_1 ) )
            {
            // InternalMoba.g:4487:1: ( ( rule__MobaMuliplicity__LowerAssignment_1 ) )
            // InternalMoba.g:4488:2: ( rule__MobaMuliplicity__LowerAssignment_1 )
            {
             before(grammarAccess.getMobaMuliplicityAccess().getLowerAssignment_1()); 
            // InternalMoba.g:4489:2: ( rule__MobaMuliplicity__LowerAssignment_1 )
            // InternalMoba.g:4489:3: rule__MobaMuliplicity__LowerAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaMuliplicity__LowerAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaMuliplicityAccess().getLowerAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group__1__Impl"


    // $ANTLR start "rule__MobaMuliplicity__Group__2"
    // InternalMoba.g:4497:1: rule__MobaMuliplicity__Group__2 : rule__MobaMuliplicity__Group__2__Impl rule__MobaMuliplicity__Group__3 ;
    public final void rule__MobaMuliplicity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4501:1: ( rule__MobaMuliplicity__Group__2__Impl rule__MobaMuliplicity__Group__3 )
            // InternalMoba.g:4502:2: rule__MobaMuliplicity__Group__2__Impl rule__MobaMuliplicity__Group__3
            {
            pushFollow(FOLLOW_34);
            rule__MobaMuliplicity__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaMuliplicity__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group__2"


    // $ANTLR start "rule__MobaMuliplicity__Group__2__Impl"
    // InternalMoba.g:4509:1: rule__MobaMuliplicity__Group__2__Impl : ( ( rule__MobaMuliplicity__Group_2__0 )? ) ;
    public final void rule__MobaMuliplicity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4513:1: ( ( ( rule__MobaMuliplicity__Group_2__0 )? ) )
            // InternalMoba.g:4514:1: ( ( rule__MobaMuliplicity__Group_2__0 )? )
            {
            // InternalMoba.g:4514:1: ( ( rule__MobaMuliplicity__Group_2__0 )? )
            // InternalMoba.g:4515:2: ( rule__MobaMuliplicity__Group_2__0 )?
            {
             before(grammarAccess.getMobaMuliplicityAccess().getGroup_2()); 
            // InternalMoba.g:4516:2: ( rule__MobaMuliplicity__Group_2__0 )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==43) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoba.g:4516:3: rule__MobaMuliplicity__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaMuliplicity__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getMobaMuliplicityAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group__2__Impl"


    // $ANTLR start "rule__MobaMuliplicity__Group__3"
    // InternalMoba.g:4524:1: rule__MobaMuliplicity__Group__3 : rule__MobaMuliplicity__Group__3__Impl ;
    public final void rule__MobaMuliplicity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4528:1: ( rule__MobaMuliplicity__Group__3__Impl )
            // InternalMoba.g:4529:2: rule__MobaMuliplicity__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaMuliplicity__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group__3"


    // $ANTLR start "rule__MobaMuliplicity__Group__3__Impl"
    // InternalMoba.g:4535:1: rule__MobaMuliplicity__Group__3__Impl : ( ']' ) ;
    public final void rule__MobaMuliplicity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4539:1: ( ( ']' ) )
            // InternalMoba.g:4540:1: ( ']' )
            {
            // InternalMoba.g:4540:1: ( ']' )
            // InternalMoba.g:4541:2: ']'
            {
             before(grammarAccess.getMobaMuliplicityAccess().getRightSquareBracketKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getMobaMuliplicityAccess().getRightSquareBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group__3__Impl"


    // $ANTLR start "rule__MobaMuliplicity__Group_2__0"
    // InternalMoba.g:4551:1: rule__MobaMuliplicity__Group_2__0 : rule__MobaMuliplicity__Group_2__0__Impl rule__MobaMuliplicity__Group_2__1 ;
    public final void rule__MobaMuliplicity__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4555:1: ( rule__MobaMuliplicity__Group_2__0__Impl rule__MobaMuliplicity__Group_2__1 )
            // InternalMoba.g:4556:2: rule__MobaMuliplicity__Group_2__0__Impl rule__MobaMuliplicity__Group_2__1
            {
            pushFollow(FOLLOW_35);
            rule__MobaMuliplicity__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MobaMuliplicity__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group_2__0"


    // $ANTLR start "rule__MobaMuliplicity__Group_2__0__Impl"
    // InternalMoba.g:4563:1: rule__MobaMuliplicity__Group_2__0__Impl : ( '..' ) ;
    public final void rule__MobaMuliplicity__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4567:1: ( ( '..' ) )
            // InternalMoba.g:4568:1: ( '..' )
            {
            // InternalMoba.g:4568:1: ( '..' )
            // InternalMoba.g:4569:2: '..'
            {
             before(grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group_2__0__Impl"


    // $ANTLR start "rule__MobaMuliplicity__Group_2__1"
    // InternalMoba.g:4578:1: rule__MobaMuliplicity__Group_2__1 : rule__MobaMuliplicity__Group_2__1__Impl ;
    public final void rule__MobaMuliplicity__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4582:1: ( rule__MobaMuliplicity__Group_2__1__Impl )
            // InternalMoba.g:4583:2: rule__MobaMuliplicity__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaMuliplicity__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group_2__1"


    // $ANTLR start "rule__MobaMuliplicity__Group_2__1__Impl"
    // InternalMoba.g:4589:1: rule__MobaMuliplicity__Group_2__1__Impl : ( ( rule__MobaMuliplicity__UpperAssignment_2_1 ) ) ;
    public final void rule__MobaMuliplicity__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4593:1: ( ( ( rule__MobaMuliplicity__UpperAssignment_2_1 ) ) )
            // InternalMoba.g:4594:1: ( ( rule__MobaMuliplicity__UpperAssignment_2_1 ) )
            {
            // InternalMoba.g:4594:1: ( ( rule__MobaMuliplicity__UpperAssignment_2_1 ) )
            // InternalMoba.g:4595:2: ( rule__MobaMuliplicity__UpperAssignment_2_1 )
            {
             before(grammarAccess.getMobaMuliplicityAccess().getUpperAssignment_2_1()); 
            // InternalMoba.g:4596:2: ( rule__MobaMuliplicity__UpperAssignment_2_1 )
            // InternalMoba.g:4596:3: rule__MobaMuliplicity__UpperAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__MobaMuliplicity__UpperAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getMobaMuliplicityAccess().getUpperAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__Group_2__1__Impl"


    // $ANTLR start "rule__MobaDataType__UnorderedGroup_2"
    // InternalMoba.g:4605:1: rule__MobaDataType__UnorderedGroup_2 : ( rule__MobaDataType__UnorderedGroup_2__0 )? ;
    public final void rule__MobaDataType__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2());
        	
        try {
            // InternalMoba.g:4610:1: ( ( rule__MobaDataType__UnorderedGroup_2__0 )? )
            // InternalMoba.g:4611:2: ( rule__MobaDataType__UnorderedGroup_2__0 )?
            {
            // InternalMoba.g:4611:2: ( rule__MobaDataType__UnorderedGroup_2__0 )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( LA42_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 0) ) {
                alt42=1;
            }
            else if ( LA42_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 1) ) {
                alt42=1;
            }
            else if ( LA42_0 >= 46 && LA42_0 <= 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 2) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMoba.g:4611:2: rule__MobaDataType__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__UnorderedGroup_2"


    // $ANTLR start "rule__MobaDataType__UnorderedGroup_2__Impl"
    // InternalMoba.g:4619:1: rule__MobaDataType__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDataType__ArrayAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDataType__Group_2_2__0 ) ) ) ) ) ;
    public final void rule__MobaDataType__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoba.g:4624:1: ( ( ({...}? => ( ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDataType__ArrayAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDataType__Group_2_2__0 ) ) ) ) ) )
            // InternalMoba.g:4625:3: ( ({...}? => ( ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDataType__ArrayAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDataType__Group_2_2__0 ) ) ) ) )
            {
            // InternalMoba.g:4625:3: ( ({...}? => ( ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDataType__ArrayAssignment_2_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDataType__Group_2_2__0 ) ) ) ) )
            int alt43=3;
            int LA43_0 = input.LA(1);

            if ( LA43_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 0) ) {
                alt43=1;
            }
            else if ( LA43_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 1) ) {
                alt43=2;
            }
            else if ( LA43_0 >= 46 && LA43_0 <= 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 2) ) {
                alt43=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoba.g:4626:3: ({...}? => ( ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) ) ) )
                    {
                    // InternalMoba.g:4626:3: ({...}? => ( ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) ) ) )
                    // InternalMoba.g:4627:4: {...}? => ( ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MobaDataType__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalMoba.g:4627:108: ( ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) ) )
                    // InternalMoba.g:4628:5: ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4634:5: ( ( rule__MobaDataType__PrimitiveAssignment_2_0 ) )
                    // InternalMoba.g:4635:6: ( rule__MobaDataType__PrimitiveAssignment_2_0 )
                    {
                     before(grammarAccess.getMobaDataTypeAccess().getPrimitiveAssignment_2_0()); 
                    // InternalMoba.g:4636:6: ( rule__MobaDataType__PrimitiveAssignment_2_0 )
                    // InternalMoba.g:4636:7: rule__MobaDataType__PrimitiveAssignment_2_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__PrimitiveAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDataTypeAccess().getPrimitiveAssignment_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4641:3: ({...}? => ( ( ( rule__MobaDataType__ArrayAssignment_2_1 ) ) ) )
                    {
                    // InternalMoba.g:4641:3: ({...}? => ( ( ( rule__MobaDataType__ArrayAssignment_2_1 ) ) ) )
                    // InternalMoba.g:4642:4: {...}? => ( ( ( rule__MobaDataType__ArrayAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MobaDataType__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalMoba.g:4642:108: ( ( ( rule__MobaDataType__ArrayAssignment_2_1 ) ) )
                    // InternalMoba.g:4643:5: ( ( rule__MobaDataType__ArrayAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4649:5: ( ( rule__MobaDataType__ArrayAssignment_2_1 ) )
                    // InternalMoba.g:4650:6: ( rule__MobaDataType__ArrayAssignment_2_1 )
                    {
                     before(grammarAccess.getMobaDataTypeAccess().getArrayAssignment_2_1()); 
                    // InternalMoba.g:4651:6: ( rule__MobaDataType__ArrayAssignment_2_1 )
                    // InternalMoba.g:4651:7: rule__MobaDataType__ArrayAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__ArrayAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDataTypeAccess().getArrayAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:4656:3: ({...}? => ( ( ( rule__MobaDataType__Group_2_2__0 ) ) ) )
                    {
                    // InternalMoba.g:4656:3: ({...}? => ( ( ( rule__MobaDataType__Group_2_2__0 ) ) ) )
                    // InternalMoba.g:4657:4: {...}? => ( ( ( rule__MobaDataType__Group_2_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 2) ) {
                        throw new FailedPredicateException(input, "rule__MobaDataType__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 2)");
                    }
                    // InternalMoba.g:4657:108: ( ( ( rule__MobaDataType__Group_2_2__0 ) ) )
                    // InternalMoba.g:4658:5: ( ( rule__MobaDataType__Group_2_2__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4664:5: ( ( rule__MobaDataType__Group_2_2__0 ) )
                    // InternalMoba.g:4665:6: ( rule__MobaDataType__Group_2_2__0 )
                    {
                     before(grammarAccess.getMobaDataTypeAccess().getGroup_2_2()); 
                    // InternalMoba.g:4666:6: ( rule__MobaDataType__Group_2_2__0 )
                    // InternalMoba.g:4666:7: rule__MobaDataType__Group_2_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDataTypeAccess().getGroup_2_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__MobaDataType__UnorderedGroup_2__0"
    // InternalMoba.g:4679:1: rule__MobaDataType__UnorderedGroup_2__0 : rule__MobaDataType__UnorderedGroup_2__Impl ( rule__MobaDataType__UnorderedGroup_2__1 )? ;
    public final void rule__MobaDataType__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4683:1: ( rule__MobaDataType__UnorderedGroup_2__Impl ( rule__MobaDataType__UnorderedGroup_2__1 )? )
            // InternalMoba.g:4684:2: rule__MobaDataType__UnorderedGroup_2__Impl ( rule__MobaDataType__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_36);
            rule__MobaDataType__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalMoba.g:4685:2: ( rule__MobaDataType__UnorderedGroup_2__1 )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( LA44_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 0) ) {
                alt44=1;
            }
            else if ( LA44_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 1) ) {
                alt44=1;
            }
            else if ( LA44_0 >= 46 && LA44_0 <= 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 2) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoba.g:4685:2: rule__MobaDataType__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__UnorderedGroup_2__0"


    // $ANTLR start "rule__MobaDataType__UnorderedGroup_2__1"
    // InternalMoba.g:4691:1: rule__MobaDataType__UnorderedGroup_2__1 : rule__MobaDataType__UnorderedGroup_2__Impl ( rule__MobaDataType__UnorderedGroup_2__2 )? ;
    public final void rule__MobaDataType__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4695:1: ( rule__MobaDataType__UnorderedGroup_2__Impl ( rule__MobaDataType__UnorderedGroup_2__2 )? )
            // InternalMoba.g:4696:2: rule__MobaDataType__UnorderedGroup_2__Impl ( rule__MobaDataType__UnorderedGroup_2__2 )?
            {
            pushFollow(FOLLOW_36);
            rule__MobaDataType__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalMoba.g:4697:2: ( rule__MobaDataType__UnorderedGroup_2__2 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( LA45_0 == 44 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 0) ) {
                alt45=1;
            }
            else if ( LA45_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 1) ) {
                alt45=1;
            }
            else if ( LA45_0 >= 46 && LA45_0 <= 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_2(), 2) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMoba.g:4697:2: rule__MobaDataType__UnorderedGroup_2__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDataType__UnorderedGroup_2__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__UnorderedGroup_2__1"


    // $ANTLR start "rule__MobaDataType__UnorderedGroup_2__2"
    // InternalMoba.g:4703:1: rule__MobaDataType__UnorderedGroup_2__2 : rule__MobaDataType__UnorderedGroup_2__Impl ;
    public final void rule__MobaDataType__UnorderedGroup_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4707:1: ( rule__MobaDataType__UnorderedGroup_2__Impl )
            // InternalMoba.g:4708:2: rule__MobaDataType__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDataType__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__UnorderedGroup_2__2"


    // $ANTLR start "rule__MobaCache__UnorderedGroup_2_1"
    // InternalMoba.g:4715:1: rule__MobaCache__UnorderedGroup_2_1 : ( rule__MobaCache__UnorderedGroup_2_1__0 )? ;
    public final void rule__MobaCache__UnorderedGroup_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
        	
        try {
            // InternalMoba.g:4720:1: ( ( rule__MobaCache__UnorderedGroup_2_1__0 )? )
            // InternalMoba.g:4721:2: ( rule__MobaCache__UnorderedGroup_2_1__0 )?
            {
            // InternalMoba.g:4721:2: ( rule__MobaCache__UnorderedGroup_2_1__0 )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( LA46_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                alt46=1;
            }
            else if ( LA46_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMoba.g:4721:2: rule__MobaCache__UnorderedGroup_2_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaCache__UnorderedGroup_2_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__UnorderedGroup_2_1"


    // $ANTLR start "rule__MobaCache__UnorderedGroup_2_1__Impl"
    // InternalMoba.g:4729:1: rule__MobaCache__UnorderedGroup_2_1__Impl : ( ({...}? => ( ( ( rule__MobaCache__Group_2_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MobaCache__Group_2_1_1__0 ) ) ) ) ) ;
    public final void rule__MobaCache__UnorderedGroup_2_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoba.g:4734:1: ( ( ({...}? => ( ( ( rule__MobaCache__Group_2_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MobaCache__Group_2_1_1__0 ) ) ) ) ) )
            // InternalMoba.g:4735:3: ( ({...}? => ( ( ( rule__MobaCache__Group_2_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MobaCache__Group_2_1_1__0 ) ) ) ) )
            {
            // InternalMoba.g:4735:3: ( ({...}? => ( ( ( rule__MobaCache__Group_2_1_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MobaCache__Group_2_1_1__0 ) ) ) ) )
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( LA47_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                alt47=1;
            }
            else if ( LA47_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                alt47=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }
            switch (alt47) {
                case 1 :
                    // InternalMoba.g:4736:3: ({...}? => ( ( ( rule__MobaCache__Group_2_1_0__0 ) ) ) )
                    {
                    // InternalMoba.g:4736:3: ({...}? => ( ( ( rule__MobaCache__Group_2_1_0__0 ) ) ) )
                    // InternalMoba.g:4737:4: {...}? => ( ( ( rule__MobaCache__Group_2_1_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MobaCache__UnorderedGroup_2_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0)");
                    }
                    // InternalMoba.g:4737:107: ( ( ( rule__MobaCache__Group_2_1_0__0 ) ) )
                    // InternalMoba.g:4738:5: ( ( rule__MobaCache__Group_2_1_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4744:5: ( ( rule__MobaCache__Group_2_1_0__0 ) )
                    // InternalMoba.g:4745:6: ( rule__MobaCache__Group_2_1_0__0 )
                    {
                     before(grammarAccess.getMobaCacheAccess().getGroup_2_1_0()); 
                    // InternalMoba.g:4746:6: ( rule__MobaCache__Group_2_1_0__0 )
                    // InternalMoba.g:4746:7: rule__MobaCache__Group_2_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaCache__Group_2_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaCacheAccess().getGroup_2_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4751:3: ({...}? => ( ( ( rule__MobaCache__Group_2_1_1__0 ) ) ) )
                    {
                    // InternalMoba.g:4751:3: ({...}? => ( ( ( rule__MobaCache__Group_2_1_1__0 ) ) ) )
                    // InternalMoba.g:4752:4: {...}? => ( ( ( rule__MobaCache__Group_2_1_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MobaCache__UnorderedGroup_2_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1)");
                    }
                    // InternalMoba.g:4752:107: ( ( ( rule__MobaCache__Group_2_1_1__0 ) ) )
                    // InternalMoba.g:4753:5: ( ( rule__MobaCache__Group_2_1_1__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4759:5: ( ( rule__MobaCache__Group_2_1_1__0 ) )
                    // InternalMoba.g:4760:6: ( rule__MobaCache__Group_2_1_1__0 )
                    {
                     before(grammarAccess.getMobaCacheAccess().getGroup_2_1_1()); 
                    // InternalMoba.g:4761:6: ( rule__MobaCache__Group_2_1_1__0 )
                    // InternalMoba.g:4761:7: rule__MobaCache__Group_2_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaCache__Group_2_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaCacheAccess().getGroup_2_1_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__UnorderedGroup_2_1__Impl"


    // $ANTLR start "rule__MobaCache__UnorderedGroup_2_1__0"
    // InternalMoba.g:4774:1: rule__MobaCache__UnorderedGroup_2_1__0 : rule__MobaCache__UnorderedGroup_2_1__Impl ( rule__MobaCache__UnorderedGroup_2_1__1 )? ;
    public final void rule__MobaCache__UnorderedGroup_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4778:1: ( rule__MobaCache__UnorderedGroup_2_1__Impl ( rule__MobaCache__UnorderedGroup_2_1__1 )? )
            // InternalMoba.g:4779:2: rule__MobaCache__UnorderedGroup_2_1__Impl ( rule__MobaCache__UnorderedGroup_2_1__1 )?
            {
            pushFollow(FOLLOW_37);
            rule__MobaCache__UnorderedGroup_2_1__Impl();

            state._fsp--;

            // InternalMoba.g:4780:2: ( rule__MobaCache__UnorderedGroup_2_1__1 )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( LA48_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                alt48=1;
            }
            else if ( LA48_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMoba.g:4780:2: rule__MobaCache__UnorderedGroup_2_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaCache__UnorderedGroup_2_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__UnorderedGroup_2_1__0"


    // $ANTLR start "rule__MobaCache__UnorderedGroup_2_1__1"
    // InternalMoba.g:4786:1: rule__MobaCache__UnorderedGroup_2_1__1 : rule__MobaCache__UnorderedGroup_2_1__Impl ;
    public final void rule__MobaCache__UnorderedGroup_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4790:1: ( rule__MobaCache__UnorderedGroup_2_1__Impl )
            // InternalMoba.g:4791:2: rule__MobaCache__UnorderedGroup_2_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaCache__UnorderedGroup_2_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__UnorderedGroup_2_1__1"


    // $ANTLR start "rule__MobaDto__UnorderedGroup_2"
    // InternalMoba.g:4798:1: rule__MobaDto__UnorderedGroup_2 : ( rule__MobaDto__UnorderedGroup_2__0 )? ;
    public final void rule__MobaDto__UnorderedGroup_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2());
        	
        try {
            // InternalMoba.g:4803:1: ( ( rule__MobaDto__UnorderedGroup_2__0 )? )
            // InternalMoba.g:4804:2: ( rule__MobaDto__UnorderedGroup_2__0 )?
            {
            // InternalMoba.g:4804:2: ( rule__MobaDto__UnorderedGroup_2__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( LA49_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0) ) {
                alt49=1;
            }
            else if ( LA49_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMoba.g:4804:2: rule__MobaDto__UnorderedGroup_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDto__UnorderedGroup_2__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__UnorderedGroup_2"


    // $ANTLR start "rule__MobaDto__UnorderedGroup_2__Impl"
    // InternalMoba.g:4812:1: rule__MobaDto__UnorderedGroup_2__Impl : ( ({...}? => ( ( ( rule__MobaDto__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDto__CacheAssignment_2_1 ) ) ) ) ) ;
    public final void rule__MobaDto__UnorderedGroup_2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoba.g:4817:1: ( ( ({...}? => ( ( ( rule__MobaDto__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDto__CacheAssignment_2_1 ) ) ) ) ) )
            // InternalMoba.g:4818:3: ( ({...}? => ( ( ( rule__MobaDto__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDto__CacheAssignment_2_1 ) ) ) ) )
            {
            // InternalMoba.g:4818:3: ( ({...}? => ( ( ( rule__MobaDto__Group_2_0__0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDto__CacheAssignment_2_1 ) ) ) ) )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( LA50_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0) ) {
                alt50=1;
            }
            else if ( LA50_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMoba.g:4819:3: ({...}? => ( ( ( rule__MobaDto__Group_2_0__0 ) ) ) )
                    {
                    // InternalMoba.g:4819:3: ({...}? => ( ( ( rule__MobaDto__Group_2_0__0 ) ) ) )
                    // InternalMoba.g:4820:4: {...}? => ( ( ( rule__MobaDto__Group_2_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MobaDto__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0)");
                    }
                    // InternalMoba.g:4820:103: ( ( ( rule__MobaDto__Group_2_0__0 ) ) )
                    // InternalMoba.g:4821:5: ( ( rule__MobaDto__Group_2_0__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4827:5: ( ( rule__MobaDto__Group_2_0__0 ) )
                    // InternalMoba.g:4828:6: ( rule__MobaDto__Group_2_0__0 )
                    {
                     before(grammarAccess.getMobaDtoAccess().getGroup_2_0()); 
                    // InternalMoba.g:4829:6: ( rule__MobaDto__Group_2_0__0 )
                    // InternalMoba.g:4829:7: rule__MobaDto__Group_2_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDto__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDtoAccess().getGroup_2_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4834:3: ({...}? => ( ( ( rule__MobaDto__CacheAssignment_2_1 ) ) ) )
                    {
                    // InternalMoba.g:4834:3: ({...}? => ( ( ( rule__MobaDto__CacheAssignment_2_1 ) ) ) )
                    // InternalMoba.g:4835:4: {...}? => ( ( ( rule__MobaDto__CacheAssignment_2_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MobaDto__UnorderedGroup_2__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1)");
                    }
                    // InternalMoba.g:4835:103: ( ( ( rule__MobaDto__CacheAssignment_2_1 ) ) )
                    // InternalMoba.g:4836:5: ( ( rule__MobaDto__CacheAssignment_2_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4842:5: ( ( rule__MobaDto__CacheAssignment_2_1 ) )
                    // InternalMoba.g:4843:6: ( rule__MobaDto__CacheAssignment_2_1 )
                    {
                     before(grammarAccess.getMobaDtoAccess().getCacheAssignment_2_1()); 
                    // InternalMoba.g:4844:6: ( rule__MobaDto__CacheAssignment_2_1 )
                    // InternalMoba.g:4844:7: rule__MobaDto__CacheAssignment_2_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDto__CacheAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDtoAccess().getCacheAssignment_2_1()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__UnorderedGroup_2__Impl"


    // $ANTLR start "rule__MobaDto__UnorderedGroup_2__0"
    // InternalMoba.g:4857:1: rule__MobaDto__UnorderedGroup_2__0 : rule__MobaDto__UnorderedGroup_2__Impl ( rule__MobaDto__UnorderedGroup_2__1 )? ;
    public final void rule__MobaDto__UnorderedGroup_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4861:1: ( rule__MobaDto__UnorderedGroup_2__Impl ( rule__MobaDto__UnorderedGroup_2__1 )? )
            // InternalMoba.g:4862:2: rule__MobaDto__UnorderedGroup_2__Impl ( rule__MobaDto__UnorderedGroup_2__1 )?
            {
            pushFollow(FOLLOW_38);
            rule__MobaDto__UnorderedGroup_2__Impl();

            state._fsp--;

            // InternalMoba.g:4863:2: ( rule__MobaDto__UnorderedGroup_2__1 )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( LA51_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0) ) {
                alt51=1;
            }
            else if ( LA51_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoba.g:4863:2: rule__MobaDto__UnorderedGroup_2__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDto__UnorderedGroup_2__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__UnorderedGroup_2__0"


    // $ANTLR start "rule__MobaDto__UnorderedGroup_2__1"
    // InternalMoba.g:4869:1: rule__MobaDto__UnorderedGroup_2__1 : rule__MobaDto__UnorderedGroup_2__Impl ;
    public final void rule__MobaDto__UnorderedGroup_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4873:1: ( rule__MobaDto__UnorderedGroup_2__Impl )
            // InternalMoba.g:4874:2: rule__MobaDto__UnorderedGroup_2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDto__UnorderedGroup_2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__UnorderedGroup_2__1"


    // $ANTLR start "rule__MobaDtoAttribute__UnorderedGroup_1"
    // InternalMoba.g:4881:1: rule__MobaDtoAttribute__UnorderedGroup_1 : ( rule__MobaDtoAttribute__UnorderedGroup_1__0 )? ;
    public final void rule__MobaDtoAttribute__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMoba.g:4886:1: ( ( rule__MobaDtoAttribute__UnorderedGroup_1__0 )? )
            // InternalMoba.g:4887:2: ( rule__MobaDtoAttribute__UnorderedGroup_1__0 )?
            {
            // InternalMoba.g:4887:2: ( rule__MobaDtoAttribute__UnorderedGroup_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( LA52_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt52=1;
            }
            else if ( LA52_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt52=1;
            }
            else if ( LA52_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt52=1;
            }
            else if ( LA52_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMoba.g:4887:2: rule__MobaDtoAttribute__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoAttribute__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__UnorderedGroup_1"


    // $ANTLR start "rule__MobaDtoAttribute__UnorderedGroup_1__Impl"
    // InternalMoba.g:4895:1: rule__MobaDtoAttribute__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) ) ) ) ) ;
    public final void rule__MobaDtoAttribute__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoba.g:4900:1: ( ( ({...}? => ( ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) ) ) ) ) )
            // InternalMoba.g:4901:3: ( ({...}? => ( ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) ) ) ) )
            {
            // InternalMoba.g:4901:3: ( ({...}? => ( ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) ) ) ) )
            int alt53=4;
            int LA53_0 = input.LA(1);

            if ( LA53_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt53=1;
            }
            else if ( LA53_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt53=2;
            }
            else if ( LA53_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt53=3;
            }
            else if ( LA53_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt53=4;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }
            switch (alt53) {
                case 1 :
                    // InternalMoba.g:4902:3: ({...}? => ( ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) ) ) )
                    {
                    // InternalMoba.g:4902:3: ({...}? => ( ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) ) ) )
                    // InternalMoba.g:4903:4: {...}? => ( ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MobaDtoAttribute__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMoba.g:4903:112: ( ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) ) )
                    // InternalMoba.g:4904:5: ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4910:5: ( ( rule__MobaDtoAttribute__LazyAssignment_1_0 ) )
                    // InternalMoba.g:4911:6: ( rule__MobaDtoAttribute__LazyAssignment_1_0 )
                    {
                     before(grammarAccess.getMobaDtoAttributeAccess().getLazyAssignment_1_0()); 
                    // InternalMoba.g:4912:6: ( rule__MobaDtoAttribute__LazyAssignment_1_0 )
                    // InternalMoba.g:4912:7: rule__MobaDtoAttribute__LazyAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoAttribute__LazyAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDtoAttributeAccess().getLazyAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4917:3: ({...}? => ( ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) ) ) )
                    {
                    // InternalMoba.g:4917:3: ({...}? => ( ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) ) ) )
                    // InternalMoba.g:4918:4: {...}? => ( ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MobaDtoAttribute__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMoba.g:4918:112: ( ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) ) )
                    // InternalMoba.g:4919:5: ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4925:5: ( ( rule__MobaDtoAttribute__TransientAssignment_1_1 ) )
                    // InternalMoba.g:4926:6: ( rule__MobaDtoAttribute__TransientAssignment_1_1 )
                    {
                     before(grammarAccess.getMobaDtoAttributeAccess().getTransientAssignment_1_1()); 
                    // InternalMoba.g:4927:6: ( rule__MobaDtoAttribute__TransientAssignment_1_1 )
                    // InternalMoba.g:4927:7: rule__MobaDtoAttribute__TransientAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoAttribute__TransientAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDtoAttributeAccess().getTransientAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:4932:3: ({...}? => ( ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) ) ) )
                    {
                    // InternalMoba.g:4932:3: ({...}? => ( ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) ) ) )
                    // InternalMoba.g:4933:4: {...}? => ( ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__MobaDtoAttribute__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalMoba.g:4933:112: ( ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) ) )
                    // InternalMoba.g:4934:5: ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4940:5: ( ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 ) )
                    // InternalMoba.g:4941:6: ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 )
                    {
                     before(grammarAccess.getMobaDtoAttributeAccess().getDomainKeyAssignment_1_2()); 
                    // InternalMoba.g:4942:6: ( rule__MobaDtoAttribute__DomainKeyAssignment_1_2 )
                    // InternalMoba.g:4942:7: rule__MobaDtoAttribute__DomainKeyAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoAttribute__DomainKeyAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDtoAttributeAccess().getDomainKeyAssignment_1_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:4947:3: ({...}? => ( ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) ) ) )
                    {
                    // InternalMoba.g:4947:3: ({...}? => ( ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) ) ) )
                    // InternalMoba.g:4948:4: {...}? => ( ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                        throw new FailedPredicateException(input, "rule__MobaDtoAttribute__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3)");
                    }
                    // InternalMoba.g:4948:112: ( ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) ) )
                    // InternalMoba.g:4949:5: ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:4955:5: ( ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 ) )
                    // InternalMoba.g:4956:6: ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 )
                    {
                     before(grammarAccess.getMobaDtoAttributeAccess().getDomainDescriptionAssignment_1_3()); 
                    // InternalMoba.g:4957:6: ( rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 )
                    // InternalMoba.g:4957:7: rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDtoAttributeAccess().getDomainDescriptionAssignment_1_3()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__MobaDtoAttribute__UnorderedGroup_1__0"
    // InternalMoba.g:4970:1: rule__MobaDtoAttribute__UnorderedGroup_1__0 : rule__MobaDtoAttribute__UnorderedGroup_1__Impl ( rule__MobaDtoAttribute__UnorderedGroup_1__1 )? ;
    public final void rule__MobaDtoAttribute__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4974:1: ( rule__MobaDtoAttribute__UnorderedGroup_1__Impl ( rule__MobaDtoAttribute__UnorderedGroup_1__1 )? )
            // InternalMoba.g:4975:2: rule__MobaDtoAttribute__UnorderedGroup_1__Impl ( rule__MobaDtoAttribute__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_39);
            rule__MobaDtoAttribute__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:4976:2: ( rule__MobaDtoAttribute__UnorderedGroup_1__1 )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( LA54_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt54=1;
            }
            else if ( LA54_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt54=1;
            }
            else if ( LA54_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt54=1;
            }
            else if ( LA54_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoba.g:4976:2: rule__MobaDtoAttribute__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoAttribute__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__UnorderedGroup_1__0"


    // $ANTLR start "rule__MobaDtoAttribute__UnorderedGroup_1__1"
    // InternalMoba.g:4982:1: rule__MobaDtoAttribute__UnorderedGroup_1__1 : rule__MobaDtoAttribute__UnorderedGroup_1__Impl ( rule__MobaDtoAttribute__UnorderedGroup_1__2 )? ;
    public final void rule__MobaDtoAttribute__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4986:1: ( rule__MobaDtoAttribute__UnorderedGroup_1__Impl ( rule__MobaDtoAttribute__UnorderedGroup_1__2 )? )
            // InternalMoba.g:4987:2: rule__MobaDtoAttribute__UnorderedGroup_1__Impl ( rule__MobaDtoAttribute__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_39);
            rule__MobaDtoAttribute__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:4988:2: ( rule__MobaDtoAttribute__UnorderedGroup_1__2 )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( LA55_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt55=1;
            }
            else if ( LA55_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt55=1;
            }
            else if ( LA55_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt55=1;
            }
            else if ( LA55_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMoba.g:4988:2: rule__MobaDtoAttribute__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoAttribute__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__UnorderedGroup_1__1"


    // $ANTLR start "rule__MobaDtoAttribute__UnorderedGroup_1__2"
    // InternalMoba.g:4994:1: rule__MobaDtoAttribute__UnorderedGroup_1__2 : rule__MobaDtoAttribute__UnorderedGroup_1__Impl ( rule__MobaDtoAttribute__UnorderedGroup_1__3 )? ;
    public final void rule__MobaDtoAttribute__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:4998:1: ( rule__MobaDtoAttribute__UnorderedGroup_1__Impl ( rule__MobaDtoAttribute__UnorderedGroup_1__3 )? )
            // InternalMoba.g:4999:2: rule__MobaDtoAttribute__UnorderedGroup_1__Impl ( rule__MobaDtoAttribute__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_39);
            rule__MobaDtoAttribute__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5000:2: ( rule__MobaDtoAttribute__UnorderedGroup_1__3 )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( LA56_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt56=1;
            }
            else if ( LA56_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt56=1;
            }
            else if ( LA56_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt56=1;
            }
            else if ( LA56_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalMoba.g:5000:2: rule__MobaDtoAttribute__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoAttribute__UnorderedGroup_1__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__UnorderedGroup_1__2"


    // $ANTLR start "rule__MobaDtoAttribute__UnorderedGroup_1__3"
    // InternalMoba.g:5006:1: rule__MobaDtoAttribute__UnorderedGroup_1__3 : rule__MobaDtoAttribute__UnorderedGroup_1__Impl ;
    public final void rule__MobaDtoAttribute__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5010:1: ( rule__MobaDtoAttribute__UnorderedGroup_1__Impl )
            // InternalMoba.g:5011:2: rule__MobaDtoAttribute__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoAttribute__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__UnorderedGroup_1__3"


    // $ANTLR start "rule__MobaDtoReference__UnorderedGroup_1"
    // InternalMoba.g:5018:1: rule__MobaDtoReference__UnorderedGroup_1 : ( rule__MobaDtoReference__UnorderedGroup_1__0 )? ;
    public final void rule__MobaDtoReference__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMoba.g:5023:1: ( ( rule__MobaDtoReference__UnorderedGroup_1__0 )? )
            // InternalMoba.g:5024:2: ( rule__MobaDtoReference__UnorderedGroup_1__0 )?
            {
            // InternalMoba.g:5024:2: ( rule__MobaDtoReference__UnorderedGroup_1__0 )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( LA57_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt57=1;
            }
            else if ( LA57_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt57=1;
            }
            else if ( LA57_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoba.g:5024:2: rule__MobaDtoReference__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoReference__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__UnorderedGroup_1"


    // $ANTLR start "rule__MobaDtoReference__UnorderedGroup_1__Impl"
    // InternalMoba.g:5032:1: rule__MobaDtoReference__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) ) ) ) ) ;
    public final void rule__MobaDtoReference__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoba.g:5037:1: ( ( ({...}? => ( ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) ) ) ) ) )
            // InternalMoba.g:5038:3: ( ({...}? => ( ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) ) ) ) )
            {
            // InternalMoba.g:5038:3: ( ({...}? => ( ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) ) ) ) )
            int alt58=3;
            int LA58_0 = input.LA(1);

            if ( LA58_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt58=1;
            }
            else if ( LA58_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt58=2;
            }
            else if ( LA58_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt58=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }
            switch (alt58) {
                case 1 :
                    // InternalMoba.g:5039:3: ({...}? => ( ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) ) ) )
                    {
                    // InternalMoba.g:5039:3: ({...}? => ( ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) ) ) )
                    // InternalMoba.g:5040:4: {...}? => ( ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MobaDtoReference__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMoba.g:5040:112: ( ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) ) )
                    // InternalMoba.g:5041:5: ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5047:5: ( ( rule__MobaDtoReference__CascadingAssignment_1_0 ) )
                    // InternalMoba.g:5048:6: ( rule__MobaDtoReference__CascadingAssignment_1_0 )
                    {
                     before(grammarAccess.getMobaDtoReferenceAccess().getCascadingAssignment_1_0()); 
                    // InternalMoba.g:5049:6: ( rule__MobaDtoReference__CascadingAssignment_1_0 )
                    // InternalMoba.g:5049:7: rule__MobaDtoReference__CascadingAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoReference__CascadingAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDtoReferenceAccess().getCascadingAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5054:3: ({...}? => ( ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) ) ) )
                    {
                    // InternalMoba.g:5054:3: ({...}? => ( ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) ) ) )
                    // InternalMoba.g:5055:4: {...}? => ( ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MobaDtoReference__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMoba.g:5055:112: ( ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) ) )
                    // InternalMoba.g:5056:5: ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5062:5: ( ( rule__MobaDtoReference__LazyAssignment_1_1 ) )
                    // InternalMoba.g:5063:6: ( rule__MobaDtoReference__LazyAssignment_1_1 )
                    {
                     before(grammarAccess.getMobaDtoReferenceAccess().getLazyAssignment_1_1()); 
                    // InternalMoba.g:5064:6: ( rule__MobaDtoReference__LazyAssignment_1_1 )
                    // InternalMoba.g:5064:7: rule__MobaDtoReference__LazyAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoReference__LazyAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDtoReferenceAccess().getLazyAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:5069:3: ({...}? => ( ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) ) ) )
                    {
                    // InternalMoba.g:5069:3: ({...}? => ( ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) ) ) )
                    // InternalMoba.g:5070:4: {...}? => ( ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__MobaDtoReference__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalMoba.g:5070:112: ( ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) ) )
                    // InternalMoba.g:5071:5: ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5077:5: ( ( rule__MobaDtoReference__TransientAssignment_1_2 ) )
                    // InternalMoba.g:5078:6: ( rule__MobaDtoReference__TransientAssignment_1_2 )
                    {
                     before(grammarAccess.getMobaDtoReferenceAccess().getTransientAssignment_1_2()); 
                    // InternalMoba.g:5079:6: ( rule__MobaDtoReference__TransientAssignment_1_2 )
                    // InternalMoba.g:5079:7: rule__MobaDtoReference__TransientAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoReference__TransientAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaDtoReferenceAccess().getTransientAssignment_1_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__MobaDtoReference__UnorderedGroup_1__0"
    // InternalMoba.g:5092:1: rule__MobaDtoReference__UnorderedGroup_1__0 : rule__MobaDtoReference__UnorderedGroup_1__Impl ( rule__MobaDtoReference__UnorderedGroup_1__1 )? ;
    public final void rule__MobaDtoReference__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5096:1: ( rule__MobaDtoReference__UnorderedGroup_1__Impl ( rule__MobaDtoReference__UnorderedGroup_1__1 )? )
            // InternalMoba.g:5097:2: rule__MobaDtoReference__UnorderedGroup_1__Impl ( rule__MobaDtoReference__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_40);
            rule__MobaDtoReference__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5098:2: ( rule__MobaDtoReference__UnorderedGroup_1__1 )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( LA59_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt59=1;
            }
            else if ( LA59_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt59=1;
            }
            else if ( LA59_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMoba.g:5098:2: rule__MobaDtoReference__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoReference__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__UnorderedGroup_1__0"


    // $ANTLR start "rule__MobaDtoReference__UnorderedGroup_1__1"
    // InternalMoba.g:5104:1: rule__MobaDtoReference__UnorderedGroup_1__1 : rule__MobaDtoReference__UnorderedGroup_1__Impl ( rule__MobaDtoReference__UnorderedGroup_1__2 )? ;
    public final void rule__MobaDtoReference__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5108:1: ( rule__MobaDtoReference__UnorderedGroup_1__Impl ( rule__MobaDtoReference__UnorderedGroup_1__2 )? )
            // InternalMoba.g:5109:2: rule__MobaDtoReference__UnorderedGroup_1__Impl ( rule__MobaDtoReference__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_40);
            rule__MobaDtoReference__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5110:2: ( rule__MobaDtoReference__UnorderedGroup_1__2 )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( LA60_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt60=1;
            }
            else if ( LA60_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt60=1;
            }
            else if ( LA60_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMoba.g:5110:2: rule__MobaDtoReference__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaDtoReference__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__UnorderedGroup_1__1"


    // $ANTLR start "rule__MobaDtoReference__UnorderedGroup_1__2"
    // InternalMoba.g:5116:1: rule__MobaDtoReference__UnorderedGroup_1__2 : rule__MobaDtoReference__UnorderedGroup_1__Impl ;
    public final void rule__MobaDtoReference__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5120:1: ( rule__MobaDtoReference__UnorderedGroup_1__Impl )
            // InternalMoba.g:5121:2: rule__MobaDtoReference__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaDtoReference__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__UnorderedGroup_1__2"


    // $ANTLR start "rule__MobaPayloadAttribute__UnorderedGroup_1"
    // InternalMoba.g:5128:1: rule__MobaPayloadAttribute__UnorderedGroup_1 : ( rule__MobaPayloadAttribute__UnorderedGroup_1__0 )? ;
    public final void rule__MobaPayloadAttribute__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMoba.g:5133:1: ( ( rule__MobaPayloadAttribute__UnorderedGroup_1__0 )? )
            // InternalMoba.g:5134:2: ( rule__MobaPayloadAttribute__UnorderedGroup_1__0 )?
            {
            // InternalMoba.g:5134:2: ( rule__MobaPayloadAttribute__UnorderedGroup_1__0 )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( LA61_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt61=1;
            }
            else if ( LA61_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt61=1;
            }
            else if ( LA61_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt61=1;
            }
            else if ( LA61_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt61=1;
            }
            else if ( LA61_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMoba.g:5134:2: rule__MobaPayloadAttribute__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__UnorderedGroup_1"


    // $ANTLR start "rule__MobaPayloadAttribute__UnorderedGroup_1__Impl"
    // InternalMoba.g:5142:1: rule__MobaPayloadAttribute__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) ) ) ) ) ;
    public final void rule__MobaPayloadAttribute__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoba.g:5147:1: ( ( ({...}? => ( ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) ) ) ) ) )
            // InternalMoba.g:5148:3: ( ({...}? => ( ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) ) ) ) )
            {
            // InternalMoba.g:5148:3: ( ({...}? => ( ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) ) ) ) )
            int alt62=5;
            int LA62_0 = input.LA(1);

            if ( LA62_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt62=1;
            }
            else if ( LA62_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt62=2;
            }
            else if ( LA62_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt62=3;
            }
            else if ( LA62_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt62=4;
            }
            else if ( LA62_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
                alt62=5;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalMoba.g:5149:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) ) ) )
                    {
                    // InternalMoba.g:5149:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) ) ) )
                    // InternalMoba.g:5150:4: {...}? => ( ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MobaPayloadAttribute__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMoba.g:5150:116: ( ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) ) )
                    // InternalMoba.g:5151:5: ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5157:5: ( ( rule__MobaPayloadAttribute__LazyAssignment_1_0 ) )
                    // InternalMoba.g:5158:6: ( rule__MobaPayloadAttribute__LazyAssignment_1_0 )
                    {
                     before(grammarAccess.getMobaPayloadAttributeAccess().getLazyAssignment_1_0()); 
                    // InternalMoba.g:5159:6: ( rule__MobaPayloadAttribute__LazyAssignment_1_0 )
                    // InternalMoba.g:5159:7: rule__MobaPayloadAttribute__LazyAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__LazyAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPayloadAttributeAccess().getLazyAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5164:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) ) ) )
                    {
                    // InternalMoba.g:5164:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) ) ) )
                    // InternalMoba.g:5165:4: {...}? => ( ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MobaPayloadAttribute__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMoba.g:5165:116: ( ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) ) )
                    // InternalMoba.g:5166:5: ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5172:5: ( ( rule__MobaPayloadAttribute__TransientAssignment_1_1 ) )
                    // InternalMoba.g:5173:6: ( rule__MobaPayloadAttribute__TransientAssignment_1_1 )
                    {
                     before(grammarAccess.getMobaPayloadAttributeAccess().getTransientAssignment_1_1()); 
                    // InternalMoba.g:5174:6: ( rule__MobaPayloadAttribute__TransientAssignment_1_1 )
                    // InternalMoba.g:5174:7: rule__MobaPayloadAttribute__TransientAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__TransientAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPayloadAttributeAccess().getTransientAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:5179:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) ) ) )
                    {
                    // InternalMoba.g:5179:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) ) ) )
                    // InternalMoba.g:5180:4: {...}? => ( ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__MobaPayloadAttribute__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalMoba.g:5180:116: ( ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) ) )
                    // InternalMoba.g:5181:5: ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5187:5: ( ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 ) )
                    // InternalMoba.g:5188:6: ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 )
                    {
                     before(grammarAccess.getMobaPayloadAttributeAccess().getDomainKeyAssignment_1_2()); 
                    // InternalMoba.g:5189:6: ( rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 )
                    // InternalMoba.g:5189:7: rule__MobaPayloadAttribute__DomainKeyAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__DomainKeyAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPayloadAttributeAccess().getDomainKeyAssignment_1_2()); 

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:5194:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) ) ) )
                    {
                    // InternalMoba.g:5194:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) ) ) )
                    // InternalMoba.g:5195:4: {...}? => ( ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
                        throw new FailedPredicateException(input, "rule__MobaPayloadAttribute__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3)");
                    }
                    // InternalMoba.g:5195:116: ( ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) ) )
                    // InternalMoba.g:5196:5: ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5202:5: ( ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 ) )
                    // InternalMoba.g:5203:6: ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 )
                    {
                     before(grammarAccess.getMobaPayloadAttributeAccess().getDomainDescriptionAssignment_1_3()); 
                    // InternalMoba.g:5204:6: ( rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 )
                    // InternalMoba.g:5204:7: rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPayloadAttributeAccess().getDomainDescriptionAssignment_1_3()); 

                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:5209:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) ) ) )
                    {
                    // InternalMoba.g:5209:3: ({...}? => ( ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) ) ) )
                    // InternalMoba.g:5210:4: {...}? => ( ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
                        throw new FailedPredicateException(input, "rule__MobaPayloadAttribute__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4)");
                    }
                    // InternalMoba.g:5210:116: ( ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) ) )
                    // InternalMoba.g:5211:5: ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5217:5: ( ( rule__MobaPayloadAttribute__Group_1_4__0 ) )
                    // InternalMoba.g:5218:6: ( rule__MobaPayloadAttribute__Group_1_4__0 )
                    {
                     before(grammarAccess.getMobaPayloadAttributeAccess().getGroup_1_4()); 
                    // InternalMoba.g:5219:6: ( rule__MobaPayloadAttribute__Group_1_4__0 )
                    // InternalMoba.g:5219:7: rule__MobaPayloadAttribute__Group_1_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__Group_1_4__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPayloadAttributeAccess().getGroup_1_4()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__MobaPayloadAttribute__UnorderedGroup_1__0"
    // InternalMoba.g:5232:1: rule__MobaPayloadAttribute__UnorderedGroup_1__0 : rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__1 )? ;
    public final void rule__MobaPayloadAttribute__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5236:1: ( rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__1 )? )
            // InternalMoba.g:5237:2: rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_41);
            rule__MobaPayloadAttribute__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5238:2: ( rule__MobaPayloadAttribute__UnorderedGroup_1__1 )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( LA63_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt63=1;
            }
            else if ( LA63_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt63=1;
            }
            else if ( LA63_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt63=1;
            }
            else if ( LA63_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt63=1;
            }
            else if ( LA63_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMoba.g:5238:2: rule__MobaPayloadAttribute__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__UnorderedGroup_1__0"


    // $ANTLR start "rule__MobaPayloadAttribute__UnorderedGroup_1__1"
    // InternalMoba.g:5244:1: rule__MobaPayloadAttribute__UnorderedGroup_1__1 : rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__2 )? ;
    public final void rule__MobaPayloadAttribute__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5248:1: ( rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__2 )? )
            // InternalMoba.g:5249:2: rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_41);
            rule__MobaPayloadAttribute__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5250:2: ( rule__MobaPayloadAttribute__UnorderedGroup_1__2 )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( LA64_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt64=1;
            }
            else if ( LA64_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt64=1;
            }
            else if ( LA64_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt64=1;
            }
            else if ( LA64_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt64=1;
            }
            else if ( LA64_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // InternalMoba.g:5250:2: rule__MobaPayloadAttribute__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__UnorderedGroup_1__1"


    // $ANTLR start "rule__MobaPayloadAttribute__UnorderedGroup_1__2"
    // InternalMoba.g:5256:1: rule__MobaPayloadAttribute__UnorderedGroup_1__2 : rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__3 )? ;
    public final void rule__MobaPayloadAttribute__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5260:1: ( rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__3 )? )
            // InternalMoba.g:5261:2: rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__3 )?
            {
            pushFollow(FOLLOW_41);
            rule__MobaPayloadAttribute__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5262:2: ( rule__MobaPayloadAttribute__UnorderedGroup_1__3 )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( LA65_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt65=1;
            }
            else if ( LA65_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt65=1;
            }
            else if ( LA65_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt65=1;
            }
            else if ( LA65_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt65=1;
            }
            else if ( LA65_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMoba.g:5262:2: rule__MobaPayloadAttribute__UnorderedGroup_1__3
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__UnorderedGroup_1__3();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__UnorderedGroup_1__2"


    // $ANTLR start "rule__MobaPayloadAttribute__UnorderedGroup_1__3"
    // InternalMoba.g:5268:1: rule__MobaPayloadAttribute__UnorderedGroup_1__3 : rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__4 )? ;
    public final void rule__MobaPayloadAttribute__UnorderedGroup_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5272:1: ( rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__4 )? )
            // InternalMoba.g:5273:2: rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ( rule__MobaPayloadAttribute__UnorderedGroup_1__4 )?
            {
            pushFollow(FOLLOW_41);
            rule__MobaPayloadAttribute__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5274:2: ( rule__MobaPayloadAttribute__UnorderedGroup_1__4 )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( LA66_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
                alt66=1;
            }
            else if ( LA66_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
                alt66=1;
            }
            else if ( LA66_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
                alt66=1;
            }
            else if ( LA66_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
                alt66=1;
            }
            else if ( LA66_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMoba.g:5274:2: rule__MobaPayloadAttribute__UnorderedGroup_1__4
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadAttribute__UnorderedGroup_1__4();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__UnorderedGroup_1__3"


    // $ANTLR start "rule__MobaPayloadAttribute__UnorderedGroup_1__4"
    // InternalMoba.g:5280:1: rule__MobaPayloadAttribute__UnorderedGroup_1__4 : rule__MobaPayloadAttribute__UnorderedGroup_1__Impl ;
    public final void rule__MobaPayloadAttribute__UnorderedGroup_1__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5284:1: ( rule__MobaPayloadAttribute__UnorderedGroup_1__Impl )
            // InternalMoba.g:5285:2: rule__MobaPayloadAttribute__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadAttribute__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__UnorderedGroup_1__4"


    // $ANTLR start "rule__MobaPayloadReference__UnorderedGroup_1"
    // InternalMoba.g:5292:1: rule__MobaPayloadReference__UnorderedGroup_1 : ( rule__MobaPayloadReference__UnorderedGroup_1__0 )? ;
    public final void rule__MobaPayloadReference__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMoba.g:5297:1: ( ( rule__MobaPayloadReference__UnorderedGroup_1__0 )? )
            // InternalMoba.g:5298:2: ( rule__MobaPayloadReference__UnorderedGroup_1__0 )?
            {
            // InternalMoba.g:5298:2: ( rule__MobaPayloadReference__UnorderedGroup_1__0 )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( LA67_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt67=1;
            }
            else if ( LA67_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt67=1;
            }
            else if ( LA67_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMoba.g:5298:2: rule__MobaPayloadReference__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadReference__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__UnorderedGroup_1"


    // $ANTLR start "rule__MobaPayloadReference__UnorderedGroup_1__Impl"
    // InternalMoba.g:5306:1: rule__MobaPayloadReference__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) ) ) ) ) ;
    public final void rule__MobaPayloadReference__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoba.g:5311:1: ( ( ({...}? => ( ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) ) ) ) ) )
            // InternalMoba.g:5312:3: ( ({...}? => ( ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) ) ) ) )
            {
            // InternalMoba.g:5312:3: ( ({...}? => ( ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) ) ) ) )
            int alt68=3;
            int LA68_0 = input.LA(1);

            if ( LA68_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt68=1;
            }
            else if ( LA68_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt68=2;
            }
            else if ( LA68_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt68=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalMoba.g:5313:3: ({...}? => ( ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) ) ) )
                    {
                    // InternalMoba.g:5313:3: ({...}? => ( ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) ) ) )
                    // InternalMoba.g:5314:4: {...}? => ( ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MobaPayloadReference__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMoba.g:5314:116: ( ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) ) )
                    // InternalMoba.g:5315:5: ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5321:5: ( ( rule__MobaPayloadReference__CascadingAssignment_1_0 ) )
                    // InternalMoba.g:5322:6: ( rule__MobaPayloadReference__CascadingAssignment_1_0 )
                    {
                     before(grammarAccess.getMobaPayloadReferenceAccess().getCascadingAssignment_1_0()); 
                    // InternalMoba.g:5323:6: ( rule__MobaPayloadReference__CascadingAssignment_1_0 )
                    // InternalMoba.g:5323:7: rule__MobaPayloadReference__CascadingAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadReference__CascadingAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPayloadReferenceAccess().getCascadingAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5328:3: ({...}? => ( ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) ) ) )
                    {
                    // InternalMoba.g:5328:3: ({...}? => ( ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) ) ) )
                    // InternalMoba.g:5329:4: {...}? => ( ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MobaPayloadReference__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMoba.g:5329:116: ( ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) ) )
                    // InternalMoba.g:5330:5: ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5336:5: ( ( rule__MobaPayloadReference__LazyAssignment_1_1 ) )
                    // InternalMoba.g:5337:6: ( rule__MobaPayloadReference__LazyAssignment_1_1 )
                    {
                     before(grammarAccess.getMobaPayloadReferenceAccess().getLazyAssignment_1_1()); 
                    // InternalMoba.g:5338:6: ( rule__MobaPayloadReference__LazyAssignment_1_1 )
                    // InternalMoba.g:5338:7: rule__MobaPayloadReference__LazyAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadReference__LazyAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPayloadReferenceAccess().getLazyAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:5343:3: ({...}? => ( ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) ) ) )
                    {
                    // InternalMoba.g:5343:3: ({...}? => ( ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) ) ) )
                    // InternalMoba.g:5344:4: {...}? => ( ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__MobaPayloadReference__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalMoba.g:5344:116: ( ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) ) )
                    // InternalMoba.g:5345:5: ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5351:5: ( ( rule__MobaPayloadReference__TransientAssignment_1_2 ) )
                    // InternalMoba.g:5352:6: ( rule__MobaPayloadReference__TransientAssignment_1_2 )
                    {
                     before(grammarAccess.getMobaPayloadReferenceAccess().getTransientAssignment_1_2()); 
                    // InternalMoba.g:5353:6: ( rule__MobaPayloadReference__TransientAssignment_1_2 )
                    // InternalMoba.g:5353:7: rule__MobaPayloadReference__TransientAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadReference__TransientAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaPayloadReferenceAccess().getTransientAssignment_1_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__MobaPayloadReference__UnorderedGroup_1__0"
    // InternalMoba.g:5366:1: rule__MobaPayloadReference__UnorderedGroup_1__0 : rule__MobaPayloadReference__UnorderedGroup_1__Impl ( rule__MobaPayloadReference__UnorderedGroup_1__1 )? ;
    public final void rule__MobaPayloadReference__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5370:1: ( rule__MobaPayloadReference__UnorderedGroup_1__Impl ( rule__MobaPayloadReference__UnorderedGroup_1__1 )? )
            // InternalMoba.g:5371:2: rule__MobaPayloadReference__UnorderedGroup_1__Impl ( rule__MobaPayloadReference__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_40);
            rule__MobaPayloadReference__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5372:2: ( rule__MobaPayloadReference__UnorderedGroup_1__1 )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( LA69_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt69=1;
            }
            else if ( LA69_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt69=1;
            }
            else if ( LA69_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMoba.g:5372:2: rule__MobaPayloadReference__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadReference__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__UnorderedGroup_1__0"


    // $ANTLR start "rule__MobaPayloadReference__UnorderedGroup_1__1"
    // InternalMoba.g:5378:1: rule__MobaPayloadReference__UnorderedGroup_1__1 : rule__MobaPayloadReference__UnorderedGroup_1__Impl ( rule__MobaPayloadReference__UnorderedGroup_1__2 )? ;
    public final void rule__MobaPayloadReference__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5382:1: ( rule__MobaPayloadReference__UnorderedGroup_1__Impl ( rule__MobaPayloadReference__UnorderedGroup_1__2 )? )
            // InternalMoba.g:5383:2: rule__MobaPayloadReference__UnorderedGroup_1__Impl ( rule__MobaPayloadReference__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_40);
            rule__MobaPayloadReference__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5384:2: ( rule__MobaPayloadReference__UnorderedGroup_1__2 )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( LA70_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt70=1;
            }
            else if ( LA70_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt70=1;
            }
            else if ( LA70_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMoba.g:5384:2: rule__MobaPayloadReference__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaPayloadReference__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__UnorderedGroup_1__1"


    // $ANTLR start "rule__MobaPayloadReference__UnorderedGroup_1__2"
    // InternalMoba.g:5390:1: rule__MobaPayloadReference__UnorderedGroup_1__2 : rule__MobaPayloadReference__UnorderedGroup_1__Impl ;
    public final void rule__MobaPayloadReference__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5394:1: ( rule__MobaPayloadReference__UnorderedGroup_1__Impl )
            // InternalMoba.g:5395:2: rule__MobaPayloadReference__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaPayloadReference__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__UnorderedGroup_1__2"


    // $ANTLR start "rule__MobaQueueReference__UnorderedGroup_1"
    // InternalMoba.g:5402:1: rule__MobaQueueReference__UnorderedGroup_1 : ( rule__MobaQueueReference__UnorderedGroup_1__0 )? ;
    public final void rule__MobaQueueReference__UnorderedGroup_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
        	
        try {
            // InternalMoba.g:5407:1: ( ( rule__MobaQueueReference__UnorderedGroup_1__0 )? )
            // InternalMoba.g:5408:2: ( rule__MobaQueueReference__UnorderedGroup_1__0 )?
            {
            // InternalMoba.g:5408:2: ( rule__MobaQueueReference__UnorderedGroup_1__0 )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( LA71_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt71=1;
            }
            else if ( LA71_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt71=1;
            }
            else if ( LA71_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMoba.g:5408:2: rule__MobaQueueReference__UnorderedGroup_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaQueueReference__UnorderedGroup_1__0();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__UnorderedGroup_1"


    // $ANTLR start "rule__MobaQueueReference__UnorderedGroup_1__Impl"
    // InternalMoba.g:5416:1: rule__MobaQueueReference__UnorderedGroup_1__Impl : ( ({...}? => ( ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) ) ) ) ) ;
    public final void rule__MobaQueueReference__UnorderedGroup_1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
        	
        try {
            // InternalMoba.g:5421:1: ( ( ({...}? => ( ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) ) ) ) ) )
            // InternalMoba.g:5422:3: ( ({...}? => ( ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) ) ) ) )
            {
            // InternalMoba.g:5422:3: ( ({...}? => ( ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) ) ) ) | ({...}? => ( ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) ) ) ) | ({...}? => ( ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) ) ) ) )
            int alt72=3;
            int LA72_0 = input.LA(1);

            if ( LA72_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt72=1;
            }
            else if ( LA72_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt72=2;
            }
            else if ( LA72_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt72=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalMoba.g:5423:3: ({...}? => ( ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) ) ) )
                    {
                    // InternalMoba.g:5423:3: ({...}? => ( ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) ) ) )
                    // InternalMoba.g:5424:4: {...}? => ( ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                        throw new FailedPredicateException(input, "rule__MobaQueueReference__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0)");
                    }
                    // InternalMoba.g:5424:114: ( ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) ) )
                    // InternalMoba.g:5425:5: ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5431:5: ( ( rule__MobaQueueReference__CascadingAssignment_1_0 ) )
                    // InternalMoba.g:5432:6: ( rule__MobaQueueReference__CascadingAssignment_1_0 )
                    {
                     before(grammarAccess.getMobaQueueReferenceAccess().getCascadingAssignment_1_0()); 
                    // InternalMoba.g:5433:6: ( rule__MobaQueueReference__CascadingAssignment_1_0 )
                    // InternalMoba.g:5433:7: rule__MobaQueueReference__CascadingAssignment_1_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaQueueReference__CascadingAssignment_1_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaQueueReferenceAccess().getCascadingAssignment_1_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5438:3: ({...}? => ( ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) ) ) )
                    {
                    // InternalMoba.g:5438:3: ({...}? => ( ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) ) ) )
                    // InternalMoba.g:5439:4: {...}? => ( ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                        throw new FailedPredicateException(input, "rule__MobaQueueReference__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1)");
                    }
                    // InternalMoba.g:5439:114: ( ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) ) )
                    // InternalMoba.g:5440:5: ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5446:5: ( ( rule__MobaQueueReference__LazyAssignment_1_1 ) )
                    // InternalMoba.g:5447:6: ( rule__MobaQueueReference__LazyAssignment_1_1 )
                    {
                     before(grammarAccess.getMobaQueueReferenceAccess().getLazyAssignment_1_1()); 
                    // InternalMoba.g:5448:6: ( rule__MobaQueueReference__LazyAssignment_1_1 )
                    // InternalMoba.g:5448:7: rule__MobaQueueReference__LazyAssignment_1_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaQueueReference__LazyAssignment_1_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaQueueReferenceAccess().getLazyAssignment_1_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:5453:3: ({...}? => ( ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) ) ) )
                    {
                    // InternalMoba.g:5453:3: ({...}? => ( ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) ) ) )
                    // InternalMoba.g:5454:4: {...}? => ( ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                        throw new FailedPredicateException(input, "rule__MobaQueueReference__UnorderedGroup_1__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2)");
                    }
                    // InternalMoba.g:5454:114: ( ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) ) )
                    // InternalMoba.g:5455:5: ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) )
                    {

                    					getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2);
                    				

                    					selected = true;
                    				
                    // InternalMoba.g:5461:5: ( ( rule__MobaQueueReference__TransientAssignment_1_2 ) )
                    // InternalMoba.g:5462:6: ( rule__MobaQueueReference__TransientAssignment_1_2 )
                    {
                     before(grammarAccess.getMobaQueueReferenceAccess().getTransientAssignment_1_2()); 
                    // InternalMoba.g:5463:6: ( rule__MobaQueueReference__TransientAssignment_1_2 )
                    // InternalMoba.g:5463:7: rule__MobaQueueReference__TransientAssignment_1_2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaQueueReference__TransientAssignment_1_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getMobaQueueReferenceAccess().getTransientAssignment_1_2()); 

                    }


                    }


                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__UnorderedGroup_1__Impl"


    // $ANTLR start "rule__MobaQueueReference__UnorderedGroup_1__0"
    // InternalMoba.g:5476:1: rule__MobaQueueReference__UnorderedGroup_1__0 : rule__MobaQueueReference__UnorderedGroup_1__Impl ( rule__MobaQueueReference__UnorderedGroup_1__1 )? ;
    public final void rule__MobaQueueReference__UnorderedGroup_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5480:1: ( rule__MobaQueueReference__UnorderedGroup_1__Impl ( rule__MobaQueueReference__UnorderedGroup_1__1 )? )
            // InternalMoba.g:5481:2: rule__MobaQueueReference__UnorderedGroup_1__Impl ( rule__MobaQueueReference__UnorderedGroup_1__1 )?
            {
            pushFollow(FOLLOW_40);
            rule__MobaQueueReference__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5482:2: ( rule__MobaQueueReference__UnorderedGroup_1__1 )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( LA73_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt73=1;
            }
            else if ( LA73_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt73=1;
            }
            else if ( LA73_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalMoba.g:5482:2: rule__MobaQueueReference__UnorderedGroup_1__1
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaQueueReference__UnorderedGroup_1__1();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__UnorderedGroup_1__0"


    // $ANTLR start "rule__MobaQueueReference__UnorderedGroup_1__1"
    // InternalMoba.g:5488:1: rule__MobaQueueReference__UnorderedGroup_1__1 : rule__MobaQueueReference__UnorderedGroup_1__Impl ( rule__MobaQueueReference__UnorderedGroup_1__2 )? ;
    public final void rule__MobaQueueReference__UnorderedGroup_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5492:1: ( rule__MobaQueueReference__UnorderedGroup_1__Impl ( rule__MobaQueueReference__UnorderedGroup_1__2 )? )
            // InternalMoba.g:5493:2: rule__MobaQueueReference__UnorderedGroup_1__Impl ( rule__MobaQueueReference__UnorderedGroup_1__2 )?
            {
            pushFollow(FOLLOW_40);
            rule__MobaQueueReference__UnorderedGroup_1__Impl();

            state._fsp--;

            // InternalMoba.g:5494:2: ( rule__MobaQueueReference__UnorderedGroup_1__2 )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( LA74_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                alt74=1;
            }
            else if ( LA74_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                alt74=1;
            }
            else if ( LA74_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMoba.g:5494:2: rule__MobaQueueReference__UnorderedGroup_1__2
                    {
                    pushFollow(FOLLOW_2);
                    rule__MobaQueueReference__UnorderedGroup_1__2();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__UnorderedGroup_1__1"


    // $ANTLR start "rule__MobaQueueReference__UnorderedGroup_1__2"
    // InternalMoba.g:5500:1: rule__MobaQueueReference__UnorderedGroup_1__2 : rule__MobaQueueReference__UnorderedGroup_1__Impl ;
    public final void rule__MobaQueueReference__UnorderedGroup_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5504:1: ( rule__MobaQueueReference__UnorderedGroup_1__Impl )
            // InternalMoba.g:5505:2: rule__MobaQueueReference__UnorderedGroup_1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MobaQueueReference__UnorderedGroup_1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__UnorderedGroup_1__2"


    // $ANTLR start "rule__MobaApplication__NameAssignment_1"
    // InternalMoba.g:5512:1: rule__MobaApplication__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobaApplication__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5516:1: ( ( RULE_ID ) )
            // InternalMoba.g:5517:2: ( RULE_ID )
            {
            // InternalMoba.g:5517:2: ( RULE_ID )
            // InternalMoba.g:5518:3: RULE_ID
            {
             before(grammarAccess.getMobaApplicationAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaApplicationAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__NameAssignment_1"


    // $ANTLR start "rule__MobaApplication__FeaturesAssignment_3"
    // InternalMoba.g:5527:1: rule__MobaApplication__FeaturesAssignment_3 : ( ruleMobaApplicationFeature ) ;
    public final void rule__MobaApplication__FeaturesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5531:1: ( ( ruleMobaApplicationFeature ) )
            // InternalMoba.g:5532:2: ( ruleMobaApplicationFeature )
            {
            // InternalMoba.g:5532:2: ( ruleMobaApplicationFeature )
            // InternalMoba.g:5533:3: ruleMobaApplicationFeature
            {
             before(grammarAccess.getMobaApplicationAccess().getFeaturesMobaApplicationFeatureParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaApplicationFeature();

            state._fsp--;

             after(grammarAccess.getMobaApplicationAccess().getFeaturesMobaApplicationFeatureParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaApplication__FeaturesAssignment_3"


    // $ANTLR start "rule__MobaTemplate__TemplateAssignment_1"
    // InternalMoba.g:5542:1: rule__MobaTemplate__TemplateAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaTemplate__TemplateAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5546:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:5547:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:5547:2: ( ( RULE_ID ) )
            // InternalMoba.g:5548:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationCrossReference_1_0()); 
            // InternalMoba.g:5549:3: ( RULE_ID )
            // InternalMoba.g:5550:4: RULE_ID
            {
             before(grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaTemplate__TemplateAssignment_1"


    // $ANTLR start "rule__MobaGenerator__GeneratorStringAssignment_1_0"
    // InternalMoba.g:5561:1: rule__MobaGenerator__GeneratorStringAssignment_1_0 : ( RULE_STRING ) ;
    public final void rule__MobaGenerator__GeneratorStringAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5565:1: ( ( RULE_STRING ) )
            // InternalMoba.g:5566:2: ( RULE_STRING )
            {
            // InternalMoba.g:5566:2: ( RULE_STRING )
            // InternalMoba.g:5567:3: RULE_STRING
            {
             before(grammarAccess.getMobaGeneratorAccess().getGeneratorStringSTRINGTerminalRuleCall_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMobaGeneratorAccess().getGeneratorStringSTRINGTerminalRuleCall_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaGenerator__GeneratorStringAssignment_1_0"


    // $ANTLR start "rule__MobaGenerator__GeneratorConstAssignment_1_1"
    // InternalMoba.g:5576:1: rule__MobaGenerator__GeneratorConstAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaGenerator__GeneratorConstAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5580:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:5581:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:5581:2: ( ( RULE_ID ) )
            // InternalMoba.g:5582:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaGeneratorAccess().getGeneratorConstMobaConstantCrossReference_1_1_0()); 
            // InternalMoba.g:5583:3: ( RULE_ID )
            // InternalMoba.g:5584:4: RULE_ID
            {
             before(grammarAccess.getMobaGeneratorAccess().getGeneratorConstMobaConstantIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaGeneratorAccess().getGeneratorConstMobaConstantIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getMobaGeneratorAccess().getGeneratorConstMobaConstantCrossReference_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaGenerator__GeneratorConstAssignment_1_1"


    // $ANTLR start "rule__MobaDataType__NameAssignment_1"
    // InternalMoba.g:5595:1: rule__MobaDataType__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobaDataType__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5599:1: ( ( RULE_ID ) )
            // InternalMoba.g:5600:2: ( RULE_ID )
            {
            // InternalMoba.g:5600:2: ( RULE_ID )
            // InternalMoba.g:5601:3: RULE_ID
            {
             before(grammarAccess.getMobaDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__NameAssignment_1"


    // $ANTLR start "rule__MobaDataType__PrimitiveAssignment_2_0"
    // InternalMoba.g:5610:1: rule__MobaDataType__PrimitiveAssignment_2_0 : ( ( 'isPrimitive' ) ) ;
    public final void rule__MobaDataType__PrimitiveAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5614:1: ( ( ( 'isPrimitive' ) ) )
            // InternalMoba.g:5615:2: ( ( 'isPrimitive' ) )
            {
            // InternalMoba.g:5615:2: ( ( 'isPrimitive' ) )
            // InternalMoba.g:5616:3: ( 'isPrimitive' )
            {
             before(grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_2_0_0()); 
            // InternalMoba.g:5617:3: ( 'isPrimitive' )
            // InternalMoba.g:5618:4: 'isPrimitive'
            {
             before(grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_2_0_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_2_0_0()); 

            }

             after(grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__PrimitiveAssignment_2_0"


    // $ANTLR start "rule__MobaDataType__ArrayAssignment_2_1"
    // InternalMoba.g:5629:1: rule__MobaDataType__ArrayAssignment_2_1 : ( ( 'isArray' ) ) ;
    public final void rule__MobaDataType__ArrayAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5633:1: ( ( ( 'isArray' ) ) )
            // InternalMoba.g:5634:2: ( ( 'isArray' ) )
            {
            // InternalMoba.g:5634:2: ( ( 'isArray' ) )
            // InternalMoba.g:5635:3: ( 'isArray' )
            {
             before(grammarAccess.getMobaDataTypeAccess().getArrayIsArrayKeyword_2_1_0()); 
            // InternalMoba.g:5636:3: ( 'isArray' )
            // InternalMoba.g:5637:4: 'isArray'
            {
             before(grammarAccess.getMobaDataTypeAccess().getArrayIsArrayKeyword_2_1_0()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getArrayIsArrayKeyword_2_1_0()); 

            }

             after(grammarAccess.getMobaDataTypeAccess().getArrayIsArrayKeyword_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__ArrayAssignment_2_1"


    // $ANTLR start "rule__MobaDataType__DateAssignment_2_2_0_0"
    // InternalMoba.g:5648:1: rule__MobaDataType__DateAssignment_2_2_0_0 : ( ( 'isDate' ) ) ;
    public final void rule__MobaDataType__DateAssignment_2_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5652:1: ( ( ( 'isDate' ) ) )
            // InternalMoba.g:5653:2: ( ( 'isDate' ) )
            {
            // InternalMoba.g:5653:2: ( ( 'isDate' ) )
            // InternalMoba.g:5654:3: ( 'isDate' )
            {
             before(grammarAccess.getMobaDataTypeAccess().getDateIsDateKeyword_2_2_0_0_0()); 
            // InternalMoba.g:5655:3: ( 'isDate' )
            // InternalMoba.g:5656:4: 'isDate'
            {
             before(grammarAccess.getMobaDataTypeAccess().getDateIsDateKeyword_2_2_0_0_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getDateIsDateKeyword_2_2_0_0_0()); 

            }

             after(grammarAccess.getMobaDataTypeAccess().getDateIsDateKeyword_2_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__DateAssignment_2_2_0_0"


    // $ANTLR start "rule__MobaDataType__DateAssignment_2_2_0_1"
    // InternalMoba.g:5667:1: rule__MobaDataType__DateAssignment_2_2_0_1 : ( ( 'isTime' ) ) ;
    public final void rule__MobaDataType__DateAssignment_2_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5671:1: ( ( ( 'isTime' ) ) )
            // InternalMoba.g:5672:2: ( ( 'isTime' ) )
            {
            // InternalMoba.g:5672:2: ( ( 'isTime' ) )
            // InternalMoba.g:5673:3: ( 'isTime' )
            {
             before(grammarAccess.getMobaDataTypeAccess().getDateIsTimeKeyword_2_2_0_1_0()); 
            // InternalMoba.g:5674:3: ( 'isTime' )
            // InternalMoba.g:5675:4: 'isTime'
            {
             before(grammarAccess.getMobaDataTypeAccess().getDateIsTimeKeyword_2_2_0_1_0()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getDateIsTimeKeyword_2_2_0_1_0()); 

            }

             after(grammarAccess.getMobaDataTypeAccess().getDateIsTimeKeyword_2_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__DateAssignment_2_2_0_1"


    // $ANTLR start "rule__MobaDataType__DateAssignment_2_2_0_2"
    // InternalMoba.g:5686:1: rule__MobaDataType__DateAssignment_2_2_0_2 : ( ( 'isTimestamp' ) ) ;
    public final void rule__MobaDataType__DateAssignment_2_2_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5690:1: ( ( ( 'isTimestamp' ) ) )
            // InternalMoba.g:5691:2: ( ( 'isTimestamp' ) )
            {
            // InternalMoba.g:5691:2: ( ( 'isTimestamp' ) )
            // InternalMoba.g:5692:3: ( 'isTimestamp' )
            {
             before(grammarAccess.getMobaDataTypeAccess().getDateIsTimestampKeyword_2_2_0_2_0()); 
            // InternalMoba.g:5693:3: ( 'isTimestamp' )
            // InternalMoba.g:5694:4: 'isTimestamp'
            {
             before(grammarAccess.getMobaDataTypeAccess().getDateIsTimestampKeyword_2_2_0_2_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getDateIsTimestampKeyword_2_2_0_2_0()); 

            }

             after(grammarAccess.getMobaDataTypeAccess().getDateIsTimestampKeyword_2_2_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__DateAssignment_2_2_0_2"


    // $ANTLR start "rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0"
    // InternalMoba.g:5705:1: rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0 : ( RULE_STRING ) ;
    public final void rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5709:1: ( ( RULE_STRING ) )
            // InternalMoba.g:5710:2: ( RULE_STRING )
            {
            // InternalMoba.g:5710:2: ( RULE_STRING )
            // InternalMoba.g:5711:3: RULE_STRING
            {
             before(grammarAccess.getMobaDataTypeAccess().getDateFormatStringSTRINGTerminalRuleCall_2_2_1_1_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getDateFormatStringSTRINGTerminalRuleCall_2_2_1_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__DateFormatStringAssignment_2_2_1_1_0"


    // $ANTLR start "rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1"
    // InternalMoba.g:5720:1: rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5724:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:5725:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:5725:2: ( ( RULE_ID ) )
            // InternalMoba.g:5726:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaDataTypeAccess().getDateFormatConstantMobaConstantCrossReference_2_2_1_1_1_0()); 
            // InternalMoba.g:5727:3: ( RULE_ID )
            // InternalMoba.g:5728:4: RULE_ID
            {
             before(grammarAccess.getMobaDataTypeAccess().getDateFormatConstantMobaConstantIDTerminalRuleCall_2_2_1_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDataTypeAccess().getDateFormatConstantMobaConstantIDTerminalRuleCall_2_2_1_1_1_0_1()); 

            }

             after(grammarAccess.getMobaDataTypeAccess().getDateFormatConstantMobaConstantCrossReference_2_2_1_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDataType__DateFormatConstantAssignment_2_2_1_1_1"


    // $ANTLR start "rule__MobaConstant__NameAssignment_1"
    // InternalMoba.g:5739:1: rule__MobaConstant__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobaConstant__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5743:1: ( ( RULE_ID ) )
            // InternalMoba.g:5744:2: ( RULE_ID )
            {
            // InternalMoba.g:5744:2: ( RULE_ID )
            // InternalMoba.g:5745:3: RULE_ID
            {
             before(grammarAccess.getMobaConstantAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaConstantAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__NameAssignment_1"


    // $ANTLR start "rule__MobaConstant__ValueAssignment_3"
    // InternalMoba.g:5754:1: rule__MobaConstant__ValueAssignment_3 : ( RULE_STRING ) ;
    public final void rule__MobaConstant__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5758:1: ( ( RULE_STRING ) )
            // InternalMoba.g:5759:2: ( RULE_STRING )
            {
            // InternalMoba.g:5759:2: ( RULE_STRING )
            // InternalMoba.g:5760:3: RULE_STRING
            {
             before(grammarAccess.getMobaConstantAccess().getValueSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMobaConstantAccess().getValueSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaConstant__ValueAssignment_3"


    // $ANTLR start "rule__MobaPropertiesProvider__PropertiesAssignment_1"
    // InternalMoba.g:5769:1: rule__MobaPropertiesProvider__PropertiesAssignment_1 : ( ruleMobaProperty ) ;
    public final void rule__MobaPropertiesProvider__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5773:1: ( ( ruleMobaProperty ) )
            // InternalMoba.g:5774:2: ( ruleMobaProperty )
            {
            // InternalMoba.g:5774:2: ( ruleMobaProperty )
            // InternalMoba.g:5775:3: ruleMobaProperty
            {
             before(grammarAccess.getMobaPropertiesProviderAccess().getPropertiesMobaPropertyParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaProperty();

            state._fsp--;

             after(grammarAccess.getMobaPropertiesProviderAccess().getPropertiesMobaPropertyParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__PropertiesAssignment_1"


    // $ANTLR start "rule__MobaPropertiesProvider__PropertiesAssignment_2_1"
    // InternalMoba.g:5784:1: rule__MobaPropertiesProvider__PropertiesAssignment_2_1 : ( ruleMobaProperty ) ;
    public final void rule__MobaPropertiesProvider__PropertiesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5788:1: ( ( ruleMobaProperty ) )
            // InternalMoba.g:5789:2: ( ruleMobaProperty )
            {
            // InternalMoba.g:5789:2: ( ruleMobaProperty )
            // InternalMoba.g:5790:3: ruleMobaProperty
            {
             before(grammarAccess.getMobaPropertiesProviderAccess().getPropertiesMobaPropertyParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaProperty();

            state._fsp--;

             after(grammarAccess.getMobaPropertiesProviderAccess().getPropertiesMobaPropertyParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPropertiesProvider__PropertiesAssignment_2_1"


    // $ANTLR start "rule__MobaProperty__KeyStringAssignment_0_0"
    // InternalMoba.g:5799:1: rule__MobaProperty__KeyStringAssignment_0_0 : ( RULE_STRING ) ;
    public final void rule__MobaProperty__KeyStringAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5803:1: ( ( RULE_STRING ) )
            // InternalMoba.g:5804:2: ( RULE_STRING )
            {
            // InternalMoba.g:5804:2: ( RULE_STRING )
            // InternalMoba.g:5805:3: RULE_STRING
            {
             before(grammarAccess.getMobaPropertyAccess().getKeyStringSTRINGTerminalRuleCall_0_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMobaPropertyAccess().getKeyStringSTRINGTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__KeyStringAssignment_0_0"


    // $ANTLR start "rule__MobaProperty__KeyConstAssignment_0_1"
    // InternalMoba.g:5814:1: rule__MobaProperty__KeyConstAssignment_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaProperty__KeyConstAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5818:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:5819:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:5819:2: ( ( RULE_ID ) )
            // InternalMoba.g:5820:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaPropertyAccess().getKeyConstMobaConstantCrossReference_0_1_0()); 
            // InternalMoba.g:5821:3: ( RULE_ID )
            // InternalMoba.g:5822:4: RULE_ID
            {
             before(grammarAccess.getMobaPropertyAccess().getKeyConstMobaConstantIDTerminalRuleCall_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaPropertyAccess().getKeyConstMobaConstantIDTerminalRuleCall_0_1_0_1()); 

            }

             after(grammarAccess.getMobaPropertyAccess().getKeyConstMobaConstantCrossReference_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__KeyConstAssignment_0_1"


    // $ANTLR start "rule__MobaProperty__ValueStringAssignment_2_0"
    // InternalMoba.g:5833:1: rule__MobaProperty__ValueStringAssignment_2_0 : ( RULE_STRING ) ;
    public final void rule__MobaProperty__ValueStringAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5837:1: ( ( RULE_STRING ) )
            // InternalMoba.g:5838:2: ( RULE_STRING )
            {
            // InternalMoba.g:5838:2: ( RULE_STRING )
            // InternalMoba.g:5839:3: RULE_STRING
            {
             before(grammarAccess.getMobaPropertyAccess().getValueStringSTRINGTerminalRuleCall_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMobaPropertyAccess().getValueStringSTRINGTerminalRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__ValueStringAssignment_2_0"


    // $ANTLR start "rule__MobaProperty__ValueConstAssignment_2_1"
    // InternalMoba.g:5848:1: rule__MobaProperty__ValueConstAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaProperty__ValueConstAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5852:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:5853:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:5853:2: ( ( RULE_ID ) )
            // InternalMoba.g:5854:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaPropertyAccess().getValueConstMobaConstantCrossReference_2_1_0()); 
            // InternalMoba.g:5855:3: ( RULE_ID )
            // InternalMoba.g:5856:4: RULE_ID
            {
             before(grammarAccess.getMobaPropertyAccess().getValueConstMobaConstantIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaPropertyAccess().getValueConstMobaConstantIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMobaPropertyAccess().getValueConstMobaConstantCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaProperty__ValueConstAssignment_2_1"


    // $ANTLR start "rule__MobaSettings__SuperTypeAssignment_2_1"
    // InternalMoba.g:5867:1: rule__MobaSettings__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaSettings__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5871:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:5872:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:5872:2: ( ( RULE_ID ) )
            // InternalMoba.g:5873:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsCrossReference_2_1_0()); 
            // InternalMoba.g:5874:3: ( RULE_ID )
            // InternalMoba.g:5875:4: RULE_ID
            {
             before(grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaSettings__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0"
    // InternalMoba.g:5886:1: rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0 : ( RULE_STRING ) ;
    public final void rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5890:1: ( ( RULE_STRING ) )
            // InternalMoba.g:5891:2: ( RULE_STRING )
            {
            // InternalMoba.g:5891:2: ( RULE_STRING )
            // InternalMoba.g:5892:3: RULE_STRING
            {
             before(grammarAccess.getMobaCacheAccess().getCacheTypeStringSTRINGTerminalRuleCall_2_1_0_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getCacheTypeStringSTRINGTerminalRuleCall_2_1_0_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__CacheTypeStringAssignment_2_1_0_2_0"


    // $ANTLR start "rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1"
    // InternalMoba.g:5901:1: rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5905:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:5906:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:5906:2: ( ( RULE_ID ) )
            // InternalMoba.g:5907:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaCacheAccess().getCacheTypeConstMobaConstantCrossReference_2_1_0_2_1_0()); 
            // InternalMoba.g:5908:3: ( RULE_ID )
            // InternalMoba.g:5909:4: RULE_ID
            {
             before(grammarAccess.getMobaCacheAccess().getCacheTypeConstMobaConstantIDTerminalRuleCall_2_1_0_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getCacheTypeConstMobaConstantIDTerminalRuleCall_2_1_0_2_1_0_1()); 

            }

             after(grammarAccess.getMobaCacheAccess().getCacheTypeConstMobaConstantCrossReference_2_1_0_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__CacheTypeConstAssignment_2_1_0_2_1"


    // $ANTLR start "rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0"
    // InternalMoba.g:5920:1: rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0 : ( RULE_STRING ) ;
    public final void rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5924:1: ( ( RULE_STRING ) )
            // InternalMoba.g:5925:2: ( RULE_STRING )
            {
            // InternalMoba.g:5925:2: ( RULE_STRING )
            // InternalMoba.g:5926:3: RULE_STRING
            {
             before(grammarAccess.getMobaCacheAccess().getCacheStrategyStringSTRINGTerminalRuleCall_2_1_1_2_0_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getCacheStrategyStringSTRINGTerminalRuleCall_2_1_1_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__CacheStrategyStringAssignment_2_1_1_2_0"


    // $ANTLR start "rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1"
    // InternalMoba.g:5935:1: rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5939:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:5940:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:5940:2: ( ( RULE_ID ) )
            // InternalMoba.g:5941:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaCacheAccess().getCacheStrategyConstMobaConstantCrossReference_2_1_1_2_1_0()); 
            // InternalMoba.g:5942:3: ( RULE_ID )
            // InternalMoba.g:5943:4: RULE_ID
            {
             before(grammarAccess.getMobaCacheAccess().getCacheStrategyConstMobaConstantIDTerminalRuleCall_2_1_1_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaCacheAccess().getCacheStrategyConstMobaConstantIDTerminalRuleCall_2_1_1_2_1_0_1()); 

            }

             after(grammarAccess.getMobaCacheAccess().getCacheStrategyConstMobaConstantCrossReference_2_1_1_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaCache__CacheStrategyConstAssignment_2_1_1_2_1"


    // $ANTLR start "rule__MobaDto__NameAssignment_1"
    // InternalMoba.g:5954:1: rule__MobaDto__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobaDto__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5958:1: ( ( RULE_ID ) )
            // InternalMoba.g:5959:2: ( RULE_ID )
            {
            // InternalMoba.g:5959:2: ( RULE_ID )
            // InternalMoba.g:5960:3: RULE_ID
            {
             before(grammarAccess.getMobaDtoAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__NameAssignment_1"


    // $ANTLR start "rule__MobaDto__SuperTypeAssignment_2_0_1"
    // InternalMoba.g:5969:1: rule__MobaDto__SuperTypeAssignment_2_0_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaDto__SuperTypeAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5973:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:5974:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:5974:2: ( ( RULE_ID ) )
            // InternalMoba.g:5975:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoCrossReference_2_0_1_0()); 
            // InternalMoba.g:5976:3: ( RULE_ID )
            // InternalMoba.g:5977:4: RULE_ID
            {
             before(grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoIDTerminalRuleCall_2_0_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoIDTerminalRuleCall_2_0_1_0_1()); 

            }

             after(grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoCrossReference_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__SuperTypeAssignment_2_0_1"


    // $ANTLR start "rule__MobaDto__CacheAssignment_2_1"
    // InternalMoba.g:5988:1: rule__MobaDto__CacheAssignment_2_1 : ( ruleMobaCache ) ;
    public final void rule__MobaDto__CacheAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:5992:1: ( ( ruleMobaCache ) )
            // InternalMoba.g:5993:2: ( ruleMobaCache )
            {
            // InternalMoba.g:5993:2: ( ruleMobaCache )
            // InternalMoba.g:5994:3: ruleMobaCache
            {
             before(grammarAccess.getMobaDtoAccess().getCacheMobaCacheParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaCache();

            state._fsp--;

             after(grammarAccess.getMobaDtoAccess().getCacheMobaCacheParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__CacheAssignment_2_1"


    // $ANTLR start "rule__MobaDto__FeaturesAssignment_5"
    // InternalMoba.g:6003:1: rule__MobaDto__FeaturesAssignment_5 : ( ruleMobaDtoFeature ) ;
    public final void rule__MobaDto__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6007:1: ( ( ruleMobaDtoFeature ) )
            // InternalMoba.g:6008:2: ( ruleMobaDtoFeature )
            {
            // InternalMoba.g:6008:2: ( ruleMobaDtoFeature )
            // InternalMoba.g:6009:3: ruleMobaDtoFeature
            {
             before(grammarAccess.getMobaDtoAccess().getFeaturesMobaDtoFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaDtoFeature();

            state._fsp--;

             after(grammarAccess.getMobaDtoAccess().getFeaturesMobaDtoFeatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__FeaturesAssignment_5"


    // $ANTLR start "rule__MobaDto__IndexAssignment_6"
    // InternalMoba.g:6018:1: rule__MobaDto__IndexAssignment_6 : ( ruleMobaDtoIndex ) ;
    public final void rule__MobaDto__IndexAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6022:1: ( ( ruleMobaDtoIndex ) )
            // InternalMoba.g:6023:2: ( ruleMobaDtoIndex )
            {
            // InternalMoba.g:6023:2: ( ruleMobaDtoIndex )
            // InternalMoba.g:6024:3: ruleMobaDtoIndex
            {
             before(grammarAccess.getMobaDtoAccess().getIndexMobaDtoIndexParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaDtoIndex();

            state._fsp--;

             after(grammarAccess.getMobaDtoAccess().getIndexMobaDtoIndexParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDto__IndexAssignment_6"


    // $ANTLR start "rule__MobaDtoIndex__AttributesAssignment_1"
    // InternalMoba.g:6033:1: rule__MobaDtoIndex__AttributesAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaDtoIndex__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6037:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:6038:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:6038:2: ( ( RULE_ID ) )
            // InternalMoba.g:6039:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeCrossReference_1_0()); 
            // InternalMoba.g:6040:3: ( RULE_ID )
            // InternalMoba.g:6041:4: RULE_ID
            {
             before(grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeCrossReference_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__AttributesAssignment_1"


    // $ANTLR start "rule__MobaDtoIndex__AttributesAssignment_2_1"
    // InternalMoba.g:6052:1: rule__MobaDtoIndex__AttributesAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaDtoIndex__AttributesAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6056:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:6057:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:6057:2: ( ( RULE_ID ) )
            // InternalMoba.g:6058:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeCrossReference_2_1_0()); 
            // InternalMoba.g:6059:3: ( RULE_ID )
            // InternalMoba.g:6060:4: RULE_ID
            {
             before(grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoIndex__AttributesAssignment_2_1"


    // $ANTLR start "rule__MobaPayload__NameAssignment_1"
    // InternalMoba.g:6071:1: rule__MobaPayload__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobaPayload__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6075:1: ( ( RULE_ID ) )
            // InternalMoba.g:6076:2: ( RULE_ID )
            {
            // InternalMoba.g:6076:2: ( RULE_ID )
            // InternalMoba.g:6077:3: RULE_ID
            {
             before(grammarAccess.getMobaPayloadAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__NameAssignment_1"


    // $ANTLR start "rule__MobaPayload__SuperTypeAssignment_2_1"
    // InternalMoba.g:6086:1: rule__MobaPayload__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaPayload__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6090:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:6091:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:6091:2: ( ( RULE_ID ) )
            // InternalMoba.g:6092:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaPayloadAccess().getSuperTypeMobaPayloadCrossReference_2_1_0()); 
            // InternalMoba.g:6093:3: ( RULE_ID )
            // InternalMoba.g:6094:4: RULE_ID
            {
             before(grammarAccess.getMobaPayloadAccess().getSuperTypeMobaPayloadIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAccess().getSuperTypeMobaPayloadIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMobaPayloadAccess().getSuperTypeMobaPayloadCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__MobaPayload__FeaturesAssignment_5"
    // InternalMoba.g:6105:1: rule__MobaPayload__FeaturesAssignment_5 : ( ruleMobaPayloadFeature ) ;
    public final void rule__MobaPayload__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6109:1: ( ( ruleMobaPayloadFeature ) )
            // InternalMoba.g:6110:2: ( ruleMobaPayloadFeature )
            {
            // InternalMoba.g:6110:2: ( ruleMobaPayloadFeature )
            // InternalMoba.g:6111:3: ruleMobaPayloadFeature
            {
             before(grammarAccess.getMobaPayloadAccess().getFeaturesMobaPayloadFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaPayloadFeature();

            state._fsp--;

             after(grammarAccess.getMobaPayloadAccess().getFeaturesMobaPayloadFeatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayload__FeaturesAssignment_5"


    // $ANTLR start "rule__MobaQueue__NameAssignment_1"
    // InternalMoba.g:6120:1: rule__MobaQueue__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobaQueue__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6124:1: ( ( RULE_ID ) )
            // InternalMoba.g:6125:2: ( RULE_ID )
            {
            // InternalMoba.g:6125:2: ( RULE_ID )
            // InternalMoba.g:6126:3: RULE_ID
            {
             before(grammarAccess.getMobaQueueAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaQueueAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__NameAssignment_1"


    // $ANTLR start "rule__MobaQueue__SuperTypeAssignment_2_1"
    // InternalMoba.g:6135:1: rule__MobaQueue__SuperTypeAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__MobaQueue__SuperTypeAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6139:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:6140:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:6140:2: ( ( RULE_ID ) )
            // InternalMoba.g:6141:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueCrossReference_2_1_0()); 
            // InternalMoba.g:6142:3: ( RULE_ID )
            // InternalMoba.g:6143:4: RULE_ID
            {
             before(grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueIDTerminalRuleCall_2_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueIDTerminalRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueCrossReference_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__SuperTypeAssignment_2_1"


    // $ANTLR start "rule__MobaQueue__FeaturesAssignment_5"
    // InternalMoba.g:6154:1: rule__MobaQueue__FeaturesAssignment_5 : ( ruleMobaQueueFeature ) ;
    public final void rule__MobaQueue__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6158:1: ( ( ruleMobaQueueFeature ) )
            // InternalMoba.g:6159:2: ( ruleMobaQueueFeature )
            {
            // InternalMoba.g:6159:2: ( ruleMobaQueueFeature )
            // InternalMoba.g:6160:3: ruleMobaQueueFeature
            {
             before(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaQueueFeature();

            state._fsp--;

             after(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueue__FeaturesAssignment_5"


    // $ANTLR start "rule__MobaRestCustom__NameAssignment_1"
    // InternalMoba.g:6169:1: rule__MobaRestCustom__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobaRestCustom__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6173:1: ( ( RULE_ID ) )
            // InternalMoba.g:6174:2: ( RULE_ID )
            {
            // InternalMoba.g:6174:2: ( RULE_ID )
            // InternalMoba.g:6175:3: RULE_ID
            {
             before(grammarAccess.getMobaRestCustomAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaRestCustomAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCustom__NameAssignment_1"


    // $ANTLR start "rule__MobaRestCrud__NameAssignment_1"
    // InternalMoba.g:6184:1: rule__MobaRestCrud__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MobaRestCrud__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6188:1: ( ( RULE_ID ) )
            // InternalMoba.g:6189:2: ( RULE_ID )
            {
            // InternalMoba.g:6189:2: ( RULE_ID )
            // InternalMoba.g:6190:3: RULE_ID
            {
             before(grammarAccess.getMobaRestCrudAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaRestCrudAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaRestCrud__NameAssignment_1"


    // $ANTLR start "rule__MobaDtoAttribute__LazyAssignment_1_0"
    // InternalMoba.g:6199:1: rule__MobaDtoAttribute__LazyAssignment_1_0 : ( ( 'lazy' ) ) ;
    public final void rule__MobaDtoAttribute__LazyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6203:1: ( ( ( 'lazy' ) ) )
            // InternalMoba.g:6204:2: ( ( 'lazy' ) )
            {
            // InternalMoba.g:6204:2: ( ( 'lazy' ) )
            // InternalMoba.g:6205:3: ( 'lazy' )
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getLazyLazyKeyword_1_0_0()); 
            // InternalMoba.g:6206:3: ( 'lazy' )
            // InternalMoba.g:6207:4: 'lazy'
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getLazyLazyKeyword_1_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAttributeAccess().getLazyLazyKeyword_1_0_0()); 

            }

             after(grammarAccess.getMobaDtoAttributeAccess().getLazyLazyKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__LazyAssignment_1_0"


    // $ANTLR start "rule__MobaDtoAttribute__TransientAssignment_1_1"
    // InternalMoba.g:6218:1: rule__MobaDtoAttribute__TransientAssignment_1_1 : ( ( 'transient' ) ) ;
    public final void rule__MobaDtoAttribute__TransientAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6222:1: ( ( ( 'transient' ) ) )
            // InternalMoba.g:6223:2: ( ( 'transient' ) )
            {
            // InternalMoba.g:6223:2: ( ( 'transient' ) )
            // InternalMoba.g:6224:3: ( 'transient' )
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getTransientTransientKeyword_1_1_0()); 
            // InternalMoba.g:6225:3: ( 'transient' )
            // InternalMoba.g:6226:4: 'transient'
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getTransientTransientKeyword_1_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAttributeAccess().getTransientTransientKeyword_1_1_0()); 

            }

             after(grammarAccess.getMobaDtoAttributeAccess().getTransientTransientKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__TransientAssignment_1_1"


    // $ANTLR start "rule__MobaDtoAttribute__DomainKeyAssignment_1_2"
    // InternalMoba.g:6237:1: rule__MobaDtoAttribute__DomainKeyAssignment_1_2 : ( ( 'domainKey' ) ) ;
    public final void rule__MobaDtoAttribute__DomainKeyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6241:1: ( ( ( 'domainKey' ) ) )
            // InternalMoba.g:6242:2: ( ( 'domainKey' ) )
            {
            // InternalMoba.g:6242:2: ( ( 'domainKey' ) )
            // InternalMoba.g:6243:3: ( 'domainKey' )
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0()); 
            // InternalMoba.g:6244:3: ( 'domainKey' )
            // InternalMoba.g:6245:4: 'domainKey'
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0()); 

            }

             after(grammarAccess.getMobaDtoAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__DomainKeyAssignment_1_2"


    // $ANTLR start "rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3"
    // InternalMoba.g:6256:1: rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3 : ( ( 'domainDescription' ) ) ;
    public final void rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6260:1: ( ( ( 'domainDescription' ) ) )
            // InternalMoba.g:6261:2: ( ( 'domainDescription' ) )
            {
            // InternalMoba.g:6261:2: ( ( 'domainDescription' ) )
            // InternalMoba.g:6262:3: ( 'domainDescription' )
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0()); 
            // InternalMoba.g:6263:3: ( 'domainDescription' )
            // InternalMoba.g:6264:4: 'domainDescription'
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0()); 

            }

             after(grammarAccess.getMobaDtoAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__DomainDescriptionAssignment_1_3"


    // $ANTLR start "rule__MobaDtoAttribute__TypeAssignment_2"
    // InternalMoba.g:6275:1: rule__MobaDtoAttribute__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MobaDtoAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6279:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:6280:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:6280:2: ( ( RULE_ID ) )
            // InternalMoba.g:6281:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getTypeMobaDataTypeCrossReference_2_0()); 
            // InternalMoba.g:6282:3: ( RULE_ID )
            // InternalMoba.g:6283:4: RULE_ID
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getTypeMobaDataTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAttributeAccess().getTypeMobaDataTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMobaDtoAttributeAccess().getTypeMobaDataTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__TypeAssignment_2"


    // $ANTLR start "rule__MobaDtoAttribute__NameAssignment_4"
    // InternalMoba.g:6294:1: rule__MobaDtoAttribute__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__MobaDtoAttribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6298:1: ( ( RULE_ID ) )
            // InternalMoba.g:6299:2: ( RULE_ID )
            {
            // InternalMoba.g:6299:2: ( RULE_ID )
            // InternalMoba.g:6300:3: RULE_ID
            {
             before(grammarAccess.getMobaDtoAttributeAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDtoAttributeAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoAttribute__NameAssignment_4"


    // $ANTLR start "rule__MobaMultiplicityProvider__MultiplicityAssignment"
    // InternalMoba.g:6309:1: rule__MobaMultiplicityProvider__MultiplicityAssignment : ( ruleMobaMuliplicity ) ;
    public final void rule__MobaMultiplicityProvider__MultiplicityAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6313:1: ( ( ruleMobaMuliplicity ) )
            // InternalMoba.g:6314:2: ( ruleMobaMuliplicity )
            {
            // InternalMoba.g:6314:2: ( ruleMobaMuliplicity )
            // InternalMoba.g:6315:3: ruleMobaMuliplicity
            {
             before(grammarAccess.getMobaMultiplicityProviderAccess().getMultiplicityMobaMuliplicityParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaMuliplicity();

            state._fsp--;

             after(grammarAccess.getMobaMultiplicityProviderAccess().getMultiplicityMobaMuliplicityParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMultiplicityProvider__MultiplicityAssignment"


    // $ANTLR start "rule__MobaDtoReference__CascadingAssignment_1_0"
    // InternalMoba.g:6324:1: rule__MobaDtoReference__CascadingAssignment_1_0 : ( ( 'cascading' ) ) ;
    public final void rule__MobaDtoReference__CascadingAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6328:1: ( ( ( 'cascading' ) ) )
            // InternalMoba.g:6329:2: ( ( 'cascading' ) )
            {
            // InternalMoba.g:6329:2: ( ( 'cascading' ) )
            // InternalMoba.g:6330:3: ( 'cascading' )
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 
            // InternalMoba.g:6331:3: ( 'cascading' )
            // InternalMoba.g:6332:4: 'cascading'
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMobaDtoReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 

            }

             after(grammarAccess.getMobaDtoReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__CascadingAssignment_1_0"


    // $ANTLR start "rule__MobaDtoReference__LazyAssignment_1_1"
    // InternalMoba.g:6343:1: rule__MobaDtoReference__LazyAssignment_1_1 : ( ( 'lazy' ) ) ;
    public final void rule__MobaDtoReference__LazyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6347:1: ( ( ( 'lazy' ) ) )
            // InternalMoba.g:6348:2: ( ( 'lazy' ) )
            {
            // InternalMoba.g:6348:2: ( ( 'lazy' ) )
            // InternalMoba.g:6349:3: ( 'lazy' )
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getLazyLazyKeyword_1_1_0()); 
            // InternalMoba.g:6350:3: ( 'lazy' )
            // InternalMoba.g:6351:4: 'lazy'
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getLazyLazyKeyword_1_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMobaDtoReferenceAccess().getLazyLazyKeyword_1_1_0()); 

            }

             after(grammarAccess.getMobaDtoReferenceAccess().getLazyLazyKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__LazyAssignment_1_1"


    // $ANTLR start "rule__MobaDtoReference__TransientAssignment_1_2"
    // InternalMoba.g:6362:1: rule__MobaDtoReference__TransientAssignment_1_2 : ( ( 'transient' ) ) ;
    public final void rule__MobaDtoReference__TransientAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6366:1: ( ( ( 'transient' ) ) )
            // InternalMoba.g:6367:2: ( ( 'transient' ) )
            {
            // InternalMoba.g:6367:2: ( ( 'transient' ) )
            // InternalMoba.g:6368:3: ( 'transient' )
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getTransientTransientKeyword_1_2_0()); 
            // InternalMoba.g:6369:3: ( 'transient' )
            // InternalMoba.g:6370:4: 'transient'
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getTransientTransientKeyword_1_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMobaDtoReferenceAccess().getTransientTransientKeyword_1_2_0()); 

            }

             after(grammarAccess.getMobaDtoReferenceAccess().getTransientTransientKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__TransientAssignment_1_2"


    // $ANTLR start "rule__MobaDtoReference__TypeAssignment_2"
    // InternalMoba.g:6381:1: rule__MobaDtoReference__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MobaDtoReference__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6385:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:6386:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:6386:2: ( ( RULE_ID ) )
            // InternalMoba.g:6387:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getTypeMobaDtoCrossReference_2_0()); 
            // InternalMoba.g:6388:3: ( RULE_ID )
            // InternalMoba.g:6389:4: RULE_ID
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getTypeMobaDtoIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDtoReferenceAccess().getTypeMobaDtoIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMobaDtoReferenceAccess().getTypeMobaDtoCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__TypeAssignment_2"


    // $ANTLR start "rule__MobaDtoReference__NameAssignment_4"
    // InternalMoba.g:6400:1: rule__MobaDtoReference__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__MobaDtoReference__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6404:1: ( ( RULE_ID ) )
            // InternalMoba.g:6405:2: ( RULE_ID )
            {
            // InternalMoba.g:6405:2: ( RULE_ID )
            // InternalMoba.g:6406:3: RULE_ID
            {
             before(grammarAccess.getMobaDtoReferenceAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaDtoReferenceAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaDtoReference__NameAssignment_4"


    // $ANTLR start "rule__MobaPayloadAttribute__LazyAssignment_1_0"
    // InternalMoba.g:6415:1: rule__MobaPayloadAttribute__LazyAssignment_1_0 : ( ( 'lazy' ) ) ;
    public final void rule__MobaPayloadAttribute__LazyAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6419:1: ( ( ( 'lazy' ) ) )
            // InternalMoba.g:6420:2: ( ( 'lazy' ) )
            {
            // InternalMoba.g:6420:2: ( ( 'lazy' ) )
            // InternalMoba.g:6421:3: ( 'lazy' )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getLazyLazyKeyword_1_0_0()); 
            // InternalMoba.g:6422:3: ( 'lazy' )
            // InternalMoba.g:6423:4: 'lazy'
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getLazyLazyKeyword_1_0_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getLazyLazyKeyword_1_0_0()); 

            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getLazyLazyKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__LazyAssignment_1_0"


    // $ANTLR start "rule__MobaPayloadAttribute__TransientAssignment_1_1"
    // InternalMoba.g:6434:1: rule__MobaPayloadAttribute__TransientAssignment_1_1 : ( ( 'transient' ) ) ;
    public final void rule__MobaPayloadAttribute__TransientAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6438:1: ( ( ( 'transient' ) ) )
            // InternalMoba.g:6439:2: ( ( 'transient' ) )
            {
            // InternalMoba.g:6439:2: ( ( 'transient' ) )
            // InternalMoba.g:6440:3: ( 'transient' )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getTransientTransientKeyword_1_1_0()); 
            // InternalMoba.g:6441:3: ( 'transient' )
            // InternalMoba.g:6442:4: 'transient'
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getTransientTransientKeyword_1_1_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getTransientTransientKeyword_1_1_0()); 

            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getTransientTransientKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__TransientAssignment_1_1"


    // $ANTLR start "rule__MobaPayloadAttribute__DomainKeyAssignment_1_2"
    // InternalMoba.g:6453:1: rule__MobaPayloadAttribute__DomainKeyAssignment_1_2 : ( ( 'domainKey' ) ) ;
    public final void rule__MobaPayloadAttribute__DomainKeyAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6457:1: ( ( ( 'domainKey' ) ) )
            // InternalMoba.g:6458:2: ( ( 'domainKey' ) )
            {
            // InternalMoba.g:6458:2: ( ( 'domainKey' ) )
            // InternalMoba.g:6459:3: ( 'domainKey' )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0()); 
            // InternalMoba.g:6460:3: ( 'domainKey' )
            // InternalMoba.g:6461:4: 'domainKey'
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0()); 
            match(input,51,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0()); 

            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__DomainKeyAssignment_1_2"


    // $ANTLR start "rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3"
    // InternalMoba.g:6472:1: rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3 : ( ( 'domainDescription' ) ) ;
    public final void rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6476:1: ( ( ( 'domainDescription' ) ) )
            // InternalMoba.g:6477:2: ( ( 'domainDescription' ) )
            {
            // InternalMoba.g:6477:2: ( ( 'domainDescription' ) )
            // InternalMoba.g:6478:3: ( 'domainDescription' )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0()); 
            // InternalMoba.g:6479:3: ( 'domainDescription' )
            // InternalMoba.g:6480:4: 'domainDescription'
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0()); 
            match(input,52,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0()); 

            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__DomainDescriptionAssignment_1_3"


    // $ANTLR start "rule__MobaPayloadAttribute__AliasAssignment_1_4_2"
    // InternalMoba.g:6491:1: rule__MobaPayloadAttribute__AliasAssignment_1_4_2 : ( RULE_ID ) ;
    public final void rule__MobaPayloadAttribute__AliasAssignment_1_4_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6495:1: ( ( RULE_ID ) )
            // InternalMoba.g:6496:2: ( RULE_ID )
            {
            // InternalMoba.g:6496:2: ( RULE_ID )
            // InternalMoba.g:6497:3: RULE_ID
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getAliasIDTerminalRuleCall_1_4_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getAliasIDTerminalRuleCall_1_4_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__AliasAssignment_1_4_2"


    // $ANTLR start "rule__MobaPayloadAttribute__TypeAssignment_2"
    // InternalMoba.g:6506:1: rule__MobaPayloadAttribute__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MobaPayloadAttribute__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6510:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:6511:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:6511:2: ( ( RULE_ID ) )
            // InternalMoba.g:6512:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getTypeMobaDataTypeCrossReference_2_0()); 
            // InternalMoba.g:6513:3: ( RULE_ID )
            // InternalMoba.g:6514:4: RULE_ID
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getTypeMobaDataTypeIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getTypeMobaDataTypeIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMobaPayloadAttributeAccess().getTypeMobaDataTypeCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__TypeAssignment_2"


    // $ANTLR start "rule__MobaPayloadAttribute__NameAssignment_4"
    // InternalMoba.g:6525:1: rule__MobaPayloadAttribute__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__MobaPayloadAttribute__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6529:1: ( ( RULE_ID ) )
            // InternalMoba.g:6530:2: ( RULE_ID )
            {
            // InternalMoba.g:6530:2: ( RULE_ID )
            // InternalMoba.g:6531:3: RULE_ID
            {
             before(grammarAccess.getMobaPayloadAttributeAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadAttributeAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadAttribute__NameAssignment_4"


    // $ANTLR start "rule__MobaPayloadReference__CascadingAssignment_1_0"
    // InternalMoba.g:6540:1: rule__MobaPayloadReference__CascadingAssignment_1_0 : ( ( 'cascading' ) ) ;
    public final void rule__MobaPayloadReference__CascadingAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6544:1: ( ( ( 'cascading' ) ) )
            // InternalMoba.g:6545:2: ( ( 'cascading' ) )
            {
            // InternalMoba.g:6545:2: ( ( 'cascading' ) )
            // InternalMoba.g:6546:3: ( 'cascading' )
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 
            // InternalMoba.g:6547:3: ( 'cascading' )
            // InternalMoba.g:6548:4: 'cascading'
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 

            }

             after(grammarAccess.getMobaPayloadReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__CascadingAssignment_1_0"


    // $ANTLR start "rule__MobaPayloadReference__LazyAssignment_1_1"
    // InternalMoba.g:6559:1: rule__MobaPayloadReference__LazyAssignment_1_1 : ( ( 'lazy' ) ) ;
    public final void rule__MobaPayloadReference__LazyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6563:1: ( ( ( 'lazy' ) ) )
            // InternalMoba.g:6564:2: ( ( 'lazy' ) )
            {
            // InternalMoba.g:6564:2: ( ( 'lazy' ) )
            // InternalMoba.g:6565:3: ( 'lazy' )
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getLazyLazyKeyword_1_1_0()); 
            // InternalMoba.g:6566:3: ( 'lazy' )
            // InternalMoba.g:6567:4: 'lazy'
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getLazyLazyKeyword_1_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadReferenceAccess().getLazyLazyKeyword_1_1_0()); 

            }

             after(grammarAccess.getMobaPayloadReferenceAccess().getLazyLazyKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__LazyAssignment_1_1"


    // $ANTLR start "rule__MobaPayloadReference__TransientAssignment_1_2"
    // InternalMoba.g:6578:1: rule__MobaPayloadReference__TransientAssignment_1_2 : ( ( 'transient' ) ) ;
    public final void rule__MobaPayloadReference__TransientAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6582:1: ( ( ( 'transient' ) ) )
            // InternalMoba.g:6583:2: ( ( 'transient' ) )
            {
            // InternalMoba.g:6583:2: ( ( 'transient' ) )
            // InternalMoba.g:6584:3: ( 'transient' )
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getTransientTransientKeyword_1_2_0()); 
            // InternalMoba.g:6585:3: ( 'transient' )
            // InternalMoba.g:6586:4: 'transient'
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getTransientTransientKeyword_1_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadReferenceAccess().getTransientTransientKeyword_1_2_0()); 

            }

             after(grammarAccess.getMobaPayloadReferenceAccess().getTransientTransientKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__TransientAssignment_1_2"


    // $ANTLR start "rule__MobaPayloadReference__TypeAssignment_2"
    // InternalMoba.g:6597:1: rule__MobaPayloadReference__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MobaPayloadReference__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6601:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:6602:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:6602:2: ( ( RULE_ID ) )
            // InternalMoba.g:6603:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getTypeMobaPayloadCrossReference_2_0()); 
            // InternalMoba.g:6604:3: ( RULE_ID )
            // InternalMoba.g:6605:4: RULE_ID
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getTypeMobaPayloadIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadReferenceAccess().getTypeMobaPayloadIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMobaPayloadReferenceAccess().getTypeMobaPayloadCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__TypeAssignment_2"


    // $ANTLR start "rule__MobaPayloadReference__NameAssignment_4"
    // InternalMoba.g:6616:1: rule__MobaPayloadReference__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__MobaPayloadReference__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6620:1: ( ( RULE_ID ) )
            // InternalMoba.g:6621:2: ( RULE_ID )
            {
            // InternalMoba.g:6621:2: ( RULE_ID )
            // InternalMoba.g:6622:3: RULE_ID
            {
             before(grammarAccess.getMobaPayloadReferenceAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaPayloadReferenceAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaPayloadReference__NameAssignment_4"


    // $ANTLR start "rule__MobaQueueReference__CascadingAssignment_1_0"
    // InternalMoba.g:6631:1: rule__MobaQueueReference__CascadingAssignment_1_0 : ( ( 'cascading' ) ) ;
    public final void rule__MobaQueueReference__CascadingAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6635:1: ( ( ( 'cascading' ) ) )
            // InternalMoba.g:6636:2: ( ( 'cascading' ) )
            {
            // InternalMoba.g:6636:2: ( ( 'cascading' ) )
            // InternalMoba.g:6637:3: ( 'cascading' )
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 
            // InternalMoba.g:6638:3: ( 'cascading' )
            // InternalMoba.g:6639:4: 'cascading'
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 
            match(input,53,FOLLOW_2); 
             after(grammarAccess.getMobaQueueReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 

            }

             after(grammarAccess.getMobaQueueReferenceAccess().getCascadingCascadingKeyword_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__CascadingAssignment_1_0"


    // $ANTLR start "rule__MobaQueueReference__LazyAssignment_1_1"
    // InternalMoba.g:6650:1: rule__MobaQueueReference__LazyAssignment_1_1 : ( ( 'lazy' ) ) ;
    public final void rule__MobaQueueReference__LazyAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6654:1: ( ( ( 'lazy' ) ) )
            // InternalMoba.g:6655:2: ( ( 'lazy' ) )
            {
            // InternalMoba.g:6655:2: ( ( 'lazy' ) )
            // InternalMoba.g:6656:3: ( 'lazy' )
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getLazyLazyKeyword_1_1_0()); 
            // InternalMoba.g:6657:3: ( 'lazy' )
            // InternalMoba.g:6658:4: 'lazy'
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getLazyLazyKeyword_1_1_0()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getMobaQueueReferenceAccess().getLazyLazyKeyword_1_1_0()); 

            }

             after(grammarAccess.getMobaQueueReferenceAccess().getLazyLazyKeyword_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__LazyAssignment_1_1"


    // $ANTLR start "rule__MobaQueueReference__TransientAssignment_1_2"
    // InternalMoba.g:6669:1: rule__MobaQueueReference__TransientAssignment_1_2 : ( ( 'transient' ) ) ;
    public final void rule__MobaQueueReference__TransientAssignment_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6673:1: ( ( ( 'transient' ) ) )
            // InternalMoba.g:6674:2: ( ( 'transient' ) )
            {
            // InternalMoba.g:6674:2: ( ( 'transient' ) )
            // InternalMoba.g:6675:3: ( 'transient' )
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getTransientTransientKeyword_1_2_0()); 
            // InternalMoba.g:6676:3: ( 'transient' )
            // InternalMoba.g:6677:4: 'transient'
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getTransientTransientKeyword_1_2_0()); 
            match(input,50,FOLLOW_2); 
             after(grammarAccess.getMobaQueueReferenceAccess().getTransientTransientKeyword_1_2_0()); 

            }

             after(grammarAccess.getMobaQueueReferenceAccess().getTransientTransientKeyword_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__TransientAssignment_1_2"


    // $ANTLR start "rule__MobaQueueReference__TypeAssignment_2"
    // InternalMoba.g:6688:1: rule__MobaQueueReference__TypeAssignment_2 : ( ( RULE_ID ) ) ;
    public final void rule__MobaQueueReference__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6692:1: ( ( ( RULE_ID ) ) )
            // InternalMoba.g:6693:2: ( ( RULE_ID ) )
            {
            // InternalMoba.g:6693:2: ( ( RULE_ID ) )
            // InternalMoba.g:6694:3: ( RULE_ID )
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getTypeMobaDataCrossReference_2_0()); 
            // InternalMoba.g:6695:3: ( RULE_ID )
            // InternalMoba.g:6696:4: RULE_ID
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getTypeMobaDataIDTerminalRuleCall_2_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaQueueReferenceAccess().getTypeMobaDataIDTerminalRuleCall_2_0_1()); 

            }

             after(grammarAccess.getMobaQueueReferenceAccess().getTypeMobaDataCrossReference_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__TypeAssignment_2"


    // $ANTLR start "rule__MobaQueueReference__NameAssignment_4"
    // InternalMoba.g:6707:1: rule__MobaQueueReference__NameAssignment_4 : ( RULE_ID ) ;
    public final void rule__MobaQueueReference__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6711:1: ( ( RULE_ID ) )
            // InternalMoba.g:6712:2: ( RULE_ID )
            {
            // InternalMoba.g:6712:2: ( RULE_ID )
            // InternalMoba.g:6713:3: RULE_ID
            {
             before(grammarAccess.getMobaQueueReferenceAccess().getNameIDTerminalRuleCall_4_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMobaQueueReferenceAccess().getNameIDTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaQueueReference__NameAssignment_4"


    // $ANTLR start "rule__MobaMuliplicity__LowerAssignment_1"
    // InternalMoba.g:6722:1: rule__MobaMuliplicity__LowerAssignment_1 : ( ruleMobaLowerBound ) ;
    public final void rule__MobaMuliplicity__LowerAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6726:1: ( ( ruleMobaLowerBound ) )
            // InternalMoba.g:6727:2: ( ruleMobaLowerBound )
            {
            // InternalMoba.g:6727:2: ( ruleMobaLowerBound )
            // InternalMoba.g:6728:3: ruleMobaLowerBound
            {
             before(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaLowerBound();

            state._fsp--;

             after(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__LowerAssignment_1"


    // $ANTLR start "rule__MobaMuliplicity__UpperAssignment_2_1"
    // InternalMoba.g:6737:1: rule__MobaMuliplicity__UpperAssignment_2_1 : ( ruleMobaUpperBound ) ;
    public final void rule__MobaMuliplicity__UpperAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMoba.g:6741:1: ( ( ruleMobaUpperBound ) )
            // InternalMoba.g:6742:2: ( ruleMobaUpperBound )
            {
            // InternalMoba.g:6742:2: ( ruleMobaUpperBound )
            // InternalMoba.g:6743:3: ruleMobaUpperBound
            {
             before(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMobaUpperBound();

            state._fsp--;

             after(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MobaMuliplicity__UpperAssignment_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000F4213C0000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000F421380002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0001F00000000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000044000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000300000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004020000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000030800040000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000030000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000044020000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000030000040000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x001E000000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0026000000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x001E040000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x000000000000F800L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000080008000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000000008800L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0001F00000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000300000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x001E000000000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0026000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x001E040000000002L});

}
