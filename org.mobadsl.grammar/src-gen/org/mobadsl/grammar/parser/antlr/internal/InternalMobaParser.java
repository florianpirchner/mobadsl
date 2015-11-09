package org.mobadsl.grammar.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.mobadsl.grammar.services.MobaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMobaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "SUPER_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'{'", "'}'", "'use template'", "'use generator'", "'datatype'", "'extends'", "'isPrimitive'", "'isArray'", "'isDate'", "'isTime'", "'isTimestamp'", "'('", "')'", "'constraints'", "','", "'enum'", "'lit'", "'='", "'const'", "'+'", "'['", "']'", "'settings'", "'cache'", "'type'", "'strategy'", "'dto'", "'index'", "'payload'", "'queue'", "'rest'", "'restCrud'", "'var'", "'lazy'", "'transient'", "'domainKey'", "'domainDescription'", "'ref'", "'cascading'", "'alias'", "'..'", "'regexp'", "'min'", "'max'", "'minLength'", "'maxLength'", "'digits'", "'isNull'", "'isNotNull'", "'*'", "'0'", "'?'", "'1'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__59=59;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__13=13;
    public static final int T__57=57;
    public static final int T__14=14;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__20=20;
    public static final int T__64=64;
    public static final int T__21=21;
    public static final int T__65=65;
    public static final int SUPER_INT=8;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=10;
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
    public static final int RULE_WS=11;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=7;
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

        public InternalMobaParser(TokenStream input, MobaGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "MobaApplication";
       	}

       	@Override
       	protected MobaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMobaApplication"
    // InternalMoba.g:65:1: entryRuleMobaApplication returns [EObject current=null] : iv_ruleMobaApplication= ruleMobaApplication EOF ;
    public final EObject entryRuleMobaApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaApplication = null;


        try {
            // InternalMoba.g:65:56: (iv_ruleMobaApplication= ruleMobaApplication EOF )
            // InternalMoba.g:66:2: iv_ruleMobaApplication= ruleMobaApplication EOF
            {
             newCompositeNode(grammarAccess.getMobaApplicationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaApplication=ruleMobaApplication();

            state._fsp--;

             current =iv_ruleMobaApplication; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaApplication"


    // $ANTLR start "ruleMobaApplication"
    // InternalMoba.g:72:1: ruleMobaApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleMobaApplicationFeature ) )* otherlv_4= '}' ) ;
    public final EObject ruleMobaApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_features_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:78:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleMobaApplicationFeature ) )* otherlv_4= '}' ) )
            // InternalMoba.g:79:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleMobaApplicationFeature ) )* otherlv_4= '}' )
            {
            // InternalMoba.g:79:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleMobaApplicationFeature ) )* otherlv_4= '}' )
            // InternalMoba.g:80:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_features_3_0= ruleMobaApplicationFeature ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaApplicationAccess().getApplicationKeyword_0());
            		
            // InternalMoba.g:84:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:85:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:85:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:86:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaApplicationAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaApplicationAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMoba.g:106:3: ( (lv_features_3_0= ruleMobaApplicationFeature ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=16 && LA1_0<=18)||LA1_0==32||LA1_0==36||LA1_0==40||(LA1_0>=42 && LA1_0<=45)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMoba.g:107:4: (lv_features_3_0= ruleMobaApplicationFeature )
            	    {
            	    // InternalMoba.g:107:4: (lv_features_3_0= ruleMobaApplicationFeature )
            	    // InternalMoba.g:108:5: lv_features_3_0= ruleMobaApplicationFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaApplicationAccess().getFeaturesMobaApplicationFeatureParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_features_3_0=ruleMobaApplicationFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_3_0,
            	    						"org.mobadsl.grammar.Moba.MobaApplicationFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMobaApplicationAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaApplication"


    // $ANTLR start "entryRuleMobaApplicationFeature"
    // InternalMoba.g:133:1: entryRuleMobaApplicationFeature returns [EObject current=null] : iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF ;
    public final EObject entryRuleMobaApplicationFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaApplicationFeature = null;


        try {
            // InternalMoba.g:133:63: (iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF )
            // InternalMoba.g:134:2: iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaApplicationFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaApplicationFeature=ruleMobaApplicationFeature();

            state._fsp--;

             current =iv_ruleMobaApplicationFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaApplicationFeature"


    // $ANTLR start "ruleMobaApplicationFeature"
    // InternalMoba.g:140:1: ruleMobaApplicationFeature returns [EObject current=null] : (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaService_5= ruleMobaService | this_MobaGenerator_6= ruleMobaGenerator ) ;
    public final EObject ruleMobaApplicationFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDataType_0 = null;

        EObject this_MobaTemplate_1 = null;

        EObject this_MobaConstant_2 = null;

        EObject this_MobaSettings_3 = null;

        EObject this_MobaData_4 = null;

        EObject this_MobaService_5 = null;

        EObject this_MobaGenerator_6 = null;



        	enterRule();

        try {
            // InternalMoba.g:146:2: ( (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaService_5= ruleMobaService | this_MobaGenerator_6= ruleMobaGenerator ) )
            // InternalMoba.g:147:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaService_5= ruleMobaService | this_MobaGenerator_6= ruleMobaGenerator )
            {
            // InternalMoba.g:147:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaService_5= ruleMobaService | this_MobaGenerator_6= ruleMobaGenerator )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 32:
                {
                alt2=3;
                }
                break;
            case 36:
                {
                alt2=4;
                }
                break;
            case 40:
            case 42:
            case 43:
                {
                alt2=5;
                }
                break;
            case 44:
            case 45:
                {
                alt2=6;
                }
                break;
            case 17:
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
                    // InternalMoba.g:148:3: this_MobaDataType_0= ruleMobaDataType
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaDataTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaDataType_0=ruleMobaDataType();

                    state._fsp--;


                    			current = this_MobaDataType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:157:3: this_MobaTemplate_1= ruleMobaTemplate
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaTemplateParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaTemplate_1=ruleMobaTemplate();

                    state._fsp--;


                    			current = this_MobaTemplate_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoba.g:166:3: this_MobaConstant_2= ruleMobaConstant
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaConstantParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaConstant_2=ruleMobaConstant();

                    state._fsp--;


                    			current = this_MobaConstant_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMoba.g:175:3: this_MobaSettings_3= ruleMobaSettings
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaSettingsParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaSettings_3=ruleMobaSettings();

                    state._fsp--;


                    			current = this_MobaSettings_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMoba.g:184:3: this_MobaData_4= ruleMobaData
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaDataParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaData_4=ruleMobaData();

                    state._fsp--;


                    			current = this_MobaData_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMoba.g:193:3: this_MobaService_5= ruleMobaService
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaServiceParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaService_5=ruleMobaService();

                    state._fsp--;


                    			current = this_MobaService_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMoba.g:202:3: this_MobaGenerator_6= ruleMobaGenerator
                    {

                    			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaGeneratorParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaGenerator_6=ruleMobaGenerator();

                    state._fsp--;


                    			current = this_MobaGenerator_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaApplicationFeature"


    // $ANTLR start "entryRuleMobaTemplate"
    // InternalMoba.g:214:1: entryRuleMobaTemplate returns [EObject current=null] : iv_ruleMobaTemplate= ruleMobaTemplate EOF ;
    public final EObject entryRuleMobaTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTemplate = null;


        try {
            // InternalMoba.g:214:53: (iv_ruleMobaTemplate= ruleMobaTemplate EOF )
            // InternalMoba.g:215:2: iv_ruleMobaTemplate= ruleMobaTemplate EOF
            {
             newCompositeNode(grammarAccess.getMobaTemplateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaTemplate=ruleMobaTemplate();

            state._fsp--;

             current =iv_ruleMobaTemplate; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaTemplate"


    // $ANTLR start "ruleMobaTemplate"
    // InternalMoba.g:221:1: ruleMobaTemplate returns [EObject current=null] : (otherlv_0= 'use template' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMobaTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:227:2: ( (otherlv_0= 'use template' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMoba.g:228:2: (otherlv_0= 'use template' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMoba.g:228:2: (otherlv_0= 'use template' ( (otherlv_1= RULE_ID ) ) )
            // InternalMoba.g:229:3: otherlv_0= 'use template' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaTemplateAccess().getUseTemplateKeyword_0());
            		
            // InternalMoba.g:233:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:234:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:234:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:235:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaTemplateRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationCrossReference_1_0());
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaTemplate"


    // $ANTLR start "entryRuleMobaGenerator"
    // InternalMoba.g:250:1: entryRuleMobaGenerator returns [EObject current=null] : iv_ruleMobaGenerator= ruleMobaGenerator EOF ;
    public final EObject entryRuleMobaGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGenerator = null;


        try {
            // InternalMoba.g:250:54: (iv_ruleMobaGenerator= ruleMobaGenerator EOF )
            // InternalMoba.g:251:2: iv_ruleMobaGenerator= ruleMobaGenerator EOF
            {
             newCompositeNode(grammarAccess.getMobaGeneratorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaGenerator=ruleMobaGenerator();

            state._fsp--;

             current =iv_ruleMobaGenerator; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaGenerator"


    // $ANTLR start "ruleMobaGenerator"
    // InternalMoba.g:257:1: ruleMobaGenerator returns [EObject current=null] : (otherlv_0= 'use generator' ( ( (lv_generatorString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaGenerator() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_generatorString_1_0=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalMoba.g:263:2: ( (otherlv_0= 'use generator' ( ( (lv_generatorString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) ) )
            // InternalMoba.g:264:2: (otherlv_0= 'use generator' ( ( (lv_generatorString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            {
            // InternalMoba.g:264:2: (otherlv_0= 'use generator' ( ( (lv_generatorString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) ) )
            // InternalMoba.g:265:3: otherlv_0= 'use generator' ( ( (lv_generatorString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorAccess().getUseGeneratorKeyword_0());
            		
            // InternalMoba.g:269:3: ( ( (lv_generatorString_1_0= RULE_STRING ) ) | ( (otherlv_2= RULE_ID ) ) )
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
                    // InternalMoba.g:270:4: ( (lv_generatorString_1_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:270:4: ( (lv_generatorString_1_0= RULE_STRING ) )
                    // InternalMoba.g:271:5: (lv_generatorString_1_0= RULE_STRING )
                    {
                    // InternalMoba.g:271:5: (lv_generatorString_1_0= RULE_STRING )
                    // InternalMoba.g:272:6: lv_generatorString_1_0= RULE_STRING
                    {
                    lv_generatorString_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_generatorString_1_0, grammarAccess.getMobaGeneratorAccess().getGeneratorStringSTRINGTerminalRuleCall_1_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaGeneratorRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"generatorString",
                    							lv_generatorString_1_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:289:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalMoba.g:289:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMoba.g:290:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMoba.g:290:5: (otherlv_2= RULE_ID )
                    // InternalMoba.g:291:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaGeneratorRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getMobaGeneratorAccess().getGeneratorConstMobaConstantCrossReference_1_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaGenerator"


    // $ANTLR start "entryRuleMobaDataType"
    // InternalMoba.g:307:1: entryRuleMobaDataType returns [EObject current=null] : iv_ruleMobaDataType= ruleMobaDataType EOF ;
    public final EObject entryRuleMobaDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDataType = null;


        try {
            // InternalMoba.g:307:53: (iv_ruleMobaDataType= ruleMobaDataType EOF )
            // InternalMoba.g:308:2: iv_ruleMobaDataType= ruleMobaDataType EOF
            {
             newCompositeNode(grammarAccess.getMobaDataTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaDataType=ruleMobaDataType();

            state._fsp--;

             current =iv_ruleMobaDataType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaDataType"


    // $ANTLR start "ruleMobaDataType"
    // InternalMoba.g:314:1: ruleMobaDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_primitive_5_0=null;
        Token lv_array_6_0=null;
        Token lv_date_7_0=null;
        Token lv_date_8_0=null;
        Token lv_date_9_0=null;
        Token otherlv_10=null;
        Token lv_dateFormatString_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        EObject lv_constraints_16_0 = null;

        EObject lv_constraints_18_0 = null;

        EObject lv_enumAST_20_0 = null;

        EObject this_MobaPropertiesAble_21 = null;



        	enterRule();

        try {
            // InternalMoba.g:320:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:321:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:321:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:322:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalMoba.g:326:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:327:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:327:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:328:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:344:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMoba.g:345:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaDataTypeAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:349:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:350:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:350:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:351:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDataTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDataTypeAccess().getSuperTypeMobaDataTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:363:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) )
            // InternalMoba.g:364:4: ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:364:4: ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) )
            // InternalMoba.g:365:5: ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            				
            // InternalMoba.g:368:5: ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* )
            // InternalMoba.g:369:6: ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )*
            {
            // InternalMoba.g:369:6: ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )*
            loop9:
            do {
                int alt9=6;
                int LA9_0 = input.LA(1);

                if ( LA9_0 == 20 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt9=1;
                }
                else if ( LA9_0 == 21 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt9=2;
                }
                else if ( LA9_0 >= 22 && LA9_0 <= 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt9=3;
                }
                else if ( LA9_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3) ) {
                    alt9=4;
                }
                else if ( LA9_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4) ) {
                    alt9=5;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMoba.g:370:4: ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) )
            	    {
            	    // InternalMoba.g:370:4: ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) )
            	    // InternalMoba.g:371:5: {...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoba.g:371:109: ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) )
            	    // InternalMoba.g:372:6: ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMoba.g:375:9: ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) )
            	    // InternalMoba.g:375:10: {...}? => ( (lv_primitive_5_0= 'isPrimitive' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:375:19: ( (lv_primitive_5_0= 'isPrimitive' ) )
            	    // InternalMoba.g:375:20: (lv_primitive_5_0= 'isPrimitive' )
            	    {
            	    // InternalMoba.g:375:20: (lv_primitive_5_0= 'isPrimitive' )
            	    // InternalMoba.g:376:10: lv_primitive_5_0= 'isPrimitive'
            	    {
            	    lv_primitive_5_0=(Token)match(input,20,FOLLOW_8); 

            	    										newLeafNode(lv_primitive_5_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	    										}
            	    										setWithLastConsumed(current, "primitive", true, "isPrimitive");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:393:4: ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:393:4: ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:394:5: {...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoba.g:394:109: ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:395:6: ({...}? => ( (lv_array_6_0= 'isArray' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMoba.g:398:9: ({...}? => ( (lv_array_6_0= 'isArray' ) ) )
            	    // InternalMoba.g:398:10: {...}? => ( (lv_array_6_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:398:19: ( (lv_array_6_0= 'isArray' ) )
            	    // InternalMoba.g:398:20: (lv_array_6_0= 'isArray' )
            	    {
            	    // InternalMoba.g:398:20: (lv_array_6_0= 'isArray' )
            	    // InternalMoba.g:399:10: lv_array_6_0= 'isArray'
            	    {
            	    lv_array_6_0=(Token)match(input,21,FOLLOW_8); 

            	    										newLeafNode(lv_array_6_0, grammarAccess.getMobaDataTypeAccess().getArrayIsArrayKeyword_3_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	    										}
            	    										setWithLastConsumed(current, "array", true, "isArray");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:416:4: ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) )
            	    {
            	    // InternalMoba.g:416:4: ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) )
            	    // InternalMoba.g:417:5: {...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoba.g:417:109: ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) )
            	    // InternalMoba.g:418:6: ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMoba.g:421:9: ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) )
            	    // InternalMoba.g:421:10: {...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:421:19: ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? )
            	    // InternalMoba.g:421:20: ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )?
            	    {
            	    // InternalMoba.g:421:20: ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_date_8_0= 'isTime' ) ) | ( (lv_date_9_0= 'isTimestamp' ) ) )
            	    int alt5=3;
            	    switch ( input.LA(1) ) {
            	    case 22:
            	        {
            	        alt5=1;
            	        }
            	        break;
            	    case 23:
            	        {
            	        alt5=2;
            	        }
            	        break;
            	    case 24:
            	        {
            	        alt5=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt5) {
            	        case 1 :
            	            // InternalMoba.g:422:10: ( (lv_date_7_0= 'isDate' ) )
            	            {
            	            // InternalMoba.g:422:10: ( (lv_date_7_0= 'isDate' ) )
            	            // InternalMoba.g:423:11: (lv_date_7_0= 'isDate' )
            	            {
            	            // InternalMoba.g:423:11: (lv_date_7_0= 'isDate' )
            	            // InternalMoba.g:424:12: lv_date_7_0= 'isDate'
            	            {
            	            lv_date_7_0=(Token)match(input,22,FOLLOW_9); 

            	            												newLeafNode(lv_date_7_0, grammarAccess.getMobaDataTypeAccess().getDateIsDateKeyword_3_2_0_0_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            												}
            	            												setWithLastConsumed(current, "date", true, "isDate");
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMoba.g:437:10: ( (lv_date_8_0= 'isTime' ) )
            	            {
            	            // InternalMoba.g:437:10: ( (lv_date_8_0= 'isTime' ) )
            	            // InternalMoba.g:438:11: (lv_date_8_0= 'isTime' )
            	            {
            	            // InternalMoba.g:438:11: (lv_date_8_0= 'isTime' )
            	            // InternalMoba.g:439:12: lv_date_8_0= 'isTime'
            	            {
            	            lv_date_8_0=(Token)match(input,23,FOLLOW_9); 

            	            												newLeafNode(lv_date_8_0, grammarAccess.getMobaDataTypeAccess().getDateIsTimeKeyword_3_2_0_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            												}
            	            												setWithLastConsumed(current, "date", true, "isTime");
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMoba.g:452:10: ( (lv_date_9_0= 'isTimestamp' ) )
            	            {
            	            // InternalMoba.g:452:10: ( (lv_date_9_0= 'isTimestamp' ) )
            	            // InternalMoba.g:453:11: (lv_date_9_0= 'isTimestamp' )
            	            {
            	            // InternalMoba.g:453:11: (lv_date_9_0= 'isTimestamp' )
            	            // InternalMoba.g:454:12: lv_date_9_0= 'isTimestamp'
            	            {
            	            lv_date_9_0=(Token)match(input,24,FOLLOW_9); 

            	            												newLeafNode(lv_date_9_0, grammarAccess.getMobaDataTypeAccess().getDateIsTimestampKeyword_3_2_0_2_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            												}
            	            												setWithLastConsumed(current, "date", true, "isTimestamp");
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMoba.g:467:9: (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==25) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // InternalMoba.g:468:10: otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')'
            	            {
            	            otherlv_10=(Token)match(input,25,FOLLOW_6); 

            	            										newLeafNode(otherlv_10, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_2_1_0());
            	            									
            	            // InternalMoba.g:472:10: ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) )
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
            	                    // InternalMoba.g:473:11: ( (lv_dateFormatString_11_0= RULE_STRING ) )
            	                    {
            	                    // InternalMoba.g:473:11: ( (lv_dateFormatString_11_0= RULE_STRING ) )
            	                    // InternalMoba.g:474:12: (lv_dateFormatString_11_0= RULE_STRING )
            	                    {
            	                    // InternalMoba.g:474:12: (lv_dateFormatString_11_0= RULE_STRING )
            	                    // InternalMoba.g:475:13: lv_dateFormatString_11_0= RULE_STRING
            	                    {
            	                    lv_dateFormatString_11_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            	                    													newLeafNode(lv_dateFormatString_11_0, grammarAccess.getMobaDataTypeAccess().getDateFormatStringSTRINGTerminalRuleCall_3_2_1_1_0_0());
            	                    												

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    													}
            	                    													setWithLastConsumed(
            	                    														current,
            	                    														"dateFormatString",
            	                    														lv_dateFormatString_11_0,
            	                    														"org.eclipse.xtext.common.Terminals.STRING");
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalMoba.g:492:11: ( (otherlv_12= RULE_ID ) )
            	                    {
            	                    // InternalMoba.g:492:11: ( (otherlv_12= RULE_ID ) )
            	                    // InternalMoba.g:493:12: (otherlv_12= RULE_ID )
            	                    {
            	                    // InternalMoba.g:493:12: (otherlv_12= RULE_ID )
            	                    // InternalMoba.g:494:13: otherlv_12= RULE_ID
            	                    {

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    													}
            	                    												
            	                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_10); 

            	                    													newLeafNode(otherlv_12, grammarAccess.getMobaDataTypeAccess().getDateFormatConstMobaConstantCrossReference_3_2_1_1_1_0());
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,26,FOLLOW_8); 

            	            										newLeafNode(otherlv_13, grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_3_2_1_2());
            	            									

            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:517:4: ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:517:4: ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) )
            	    // InternalMoba.g:518:5: {...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMoba.g:518:109: ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) )
            	    // InternalMoba.g:519:6: ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMoba.g:522:9: ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) )
            	    // InternalMoba.g:522:10: {...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:522:19: (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' )
            	    // InternalMoba.g:522:20: otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')'
            	    {
            	    otherlv_14=(Token)match(input,27,FOLLOW_11); 

            	    									newLeafNode(otherlv_14, grammarAccess.getMobaDataTypeAccess().getConstraintsKeyword_3_3_0());
            	    								
            	    otherlv_15=(Token)match(input,25,FOLLOW_12); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_3_1());
            	    								
            	    // InternalMoba.g:530:9: ( (lv_constraints_16_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:531:10: (lv_constraints_16_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:531:10: (lv_constraints_16_0= ruleMobaConstraint )
            	    // InternalMoba.g:532:11: lv_constraints_16_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_constraints_16_0=ruleMobaConstraint();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaDataTypeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"constraints",
            	    												lv_constraints_16_0,
            	    												"org.mobadsl.grammar.Moba.MobaConstraint");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMoba.g:549:9: (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==28) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalMoba.g:550:10: otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,28,FOLLOW_12); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getMobaDataTypeAccess().getCommaKeyword_3_3_3_0());
            	    	    									
            	    	    // InternalMoba.g:554:10: ( (lv_constraints_18_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:555:11: (lv_constraints_18_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:555:11: (lv_constraints_18_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:556:12: lv_constraints_18_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_constraints_18_0=ruleMobaConstraint();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMobaDataTypeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"constraints",
            	    	    													lv_constraints_18_0,
            	    	    													"org.mobadsl.grammar.Moba.MobaConstraint");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,26,FOLLOW_8); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_3_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:584:4: ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) )
            	    {
            	    // InternalMoba.g:584:4: ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) )
            	    // InternalMoba.g:585:5: {...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMoba.g:585:109: ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) )
            	    // InternalMoba.g:586:6: ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMoba.g:589:9: ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) )
            	    // InternalMoba.g:589:10: {...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:589:19: ( (lv_enumAST_20_0= ruleMobaEnum ) )
            	    // InternalMoba.g:589:20: (lv_enumAST_20_0= ruleMobaEnum )
            	    {
            	    // InternalMoba.g:589:20: (lv_enumAST_20_0= ruleMobaEnum )
            	    // InternalMoba.g:590:10: lv_enumAST_20_0= ruleMobaEnum
            	    {

            	    										newCompositeNode(grammarAccess.getMobaDataTypeAccess().getEnumASTMobaEnumParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_8);
            	    lv_enumAST_20_0=ruleMobaEnum();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMobaDataTypeRule());
            	    										}
            	    										set(
            	    											current,
            	    											"enumAST",
            	    											lv_enumAST_20_0,
            	    											"org.mobadsl.grammar.Moba.MobaEnum");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            				

            }

            // InternalMoba.g:619:3: (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==34) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMoba.g:620:4: this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaDataTypeRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaDataTypeAccess().getMobaPropertiesAbleParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_21=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_21;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaDataType"


    // $ANTLR start "entryRuleMobaEnum"
    // InternalMoba.g:636:1: entryRuleMobaEnum returns [EObject current=null] : iv_ruleMobaEnum= ruleMobaEnum EOF ;
    public final EObject entryRuleMobaEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnum = null;


        try {
            // InternalMoba.g:636:49: (iv_ruleMobaEnum= ruleMobaEnum EOF )
            // InternalMoba.g:637:2: iv_ruleMobaEnum= ruleMobaEnum EOF
            {
             newCompositeNode(grammarAccess.getMobaEnumRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaEnum=ruleMobaEnum();

            state._fsp--;

             current =iv_ruleMobaEnum; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaEnum"


    // $ANTLR start "ruleMobaEnum"
    // InternalMoba.g:643:1: ruleMobaEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' ) ;
    public final EObject ruleMobaEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_literals_3_0 = null;

        EObject lv_literals_5_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:649:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' ) )
            // InternalMoba.g:650:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' )
            {
            // InternalMoba.g:650:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' )
            // InternalMoba.g:651:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,29,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEnumAccess().getEnumKeyword_0());
            		
            // InternalMoba.g:655:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:656:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:656:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:657:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaEnumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,14,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMoba.g:677:3: ( (lv_literals_3_0= ruleMobaEnumLiteral ) )
            // InternalMoba.g:678:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            {
            // InternalMoba.g:678:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            // InternalMoba.g:679:5: lv_literals_3_0= ruleMobaEnumLiteral
            {

            					newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_15);
            lv_literals_3_0=ruleMobaEnumLiteral();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMobaEnumRule());
            					}
            					add(
            						current,
            						"literals",
            						lv_literals_3_0,
            						"org.mobadsl.grammar.Moba.MobaEnumLiteral");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoba.g:696:3: (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMoba.g:697:4: otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) )
            	    {
            	    otherlv_4=(Token)match(input,28,FOLLOW_14); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMobaEnumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMoba.g:701:4: ( (lv_literals_5_0= ruleMobaEnumLiteral ) )
            	    // InternalMoba.g:702:5: (lv_literals_5_0= ruleMobaEnumLiteral )
            	    {
            	    // InternalMoba.g:702:5: (lv_literals_5_0= ruleMobaEnumLiteral )
            	    // InternalMoba.g:703:6: lv_literals_5_0= ruleMobaEnumLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_literals_5_0=ruleMobaEnumLiteral();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMobaEnumRule());
            	    						}
            	    						add(
            	    							current,
            	    							"literals",
            	    							lv_literals_5_0,
            	    							"org.mobadsl.grammar.Moba.MobaEnumLiteral");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            otherlv_6=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getMobaEnumAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaEnum"


    // $ANTLR start "entryRuleMobaEnumLiteral"
    // InternalMoba.g:729:1: entryRuleMobaEnumLiteral returns [EObject current=null] : iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF ;
    public final EObject entryRuleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnumLiteral = null;


        try {
            // InternalMoba.g:729:56: (iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF )
            // InternalMoba.g:730:2: iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF
            {
             newCompositeNode(grammarAccess.getMobaEnumLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaEnumLiteral=ruleMobaEnumLiteral();

            state._fsp--;

             current =iv_ruleMobaEnumLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaEnumLiteral"


    // $ANTLR start "ruleMobaEnumLiteral"
    // InternalMoba.g:736:1: ruleMobaEnumLiteral returns [EObject current=null] : (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
    public final EObject ruleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_literal_4_0=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMoba.g:742:2: ( (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalMoba.g:743:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:743:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalMoba.g:744:3: otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEnumLiteralAccess().getLitKeyword_0());
            		
            // InternalMoba.g:748:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:749:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:749:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:750:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaEnumLiteralAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumLiteralAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,25,FOLLOW_17); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaEnumLiteralAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMoba.g:774:3: ( (lv_literal_4_0= RULE_STRING ) )
            // InternalMoba.g:775:4: (lv_literal_4_0= RULE_STRING )
            {
            // InternalMoba.g:775:4: (lv_literal_4_0= RULE_STRING )
            // InternalMoba.g:776:5: lv_literal_4_0= RULE_STRING
            {
            lv_literal_4_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_literal_4_0, grammarAccess.getMobaEnumLiteralAccess().getLiteralSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"literal",
            						lv_literal_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,28,FOLLOW_19); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_5());
            		
            // InternalMoba.g:796:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalMoba.g:797:4: (lv_value_6_0= RULE_INT )
            {
            // InternalMoba.g:797:4: (lv_value_6_0= RULE_INT )
            // InternalMoba.g:798:5: lv_value_6_0= RULE_INT
            {
            lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_10); 

            					newLeafNode(lv_value_6_0, grammarAccess.getMobaEnumLiteralAccess().getValueINTTerminalRuleCall_6_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"value",
            						lv_value_6_0,
            						"org.mobadsl.grammar.Moba.INT");
            				

            }


            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaEnumLiteralAccess().getRightParenthesisKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaEnumLiteral"


    // $ANTLR start "entryRuleMobaConstant"
    // InternalMoba.g:822:1: entryRuleMobaConstant returns [EObject current=null] : iv_ruleMobaConstant= ruleMobaConstant EOF ;
    public final EObject entryRuleMobaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstant = null;


        try {
            // InternalMoba.g:822:53: (iv_ruleMobaConstant= ruleMobaConstant EOF )
            // InternalMoba.g:823:2: iv_ruleMobaConstant= ruleMobaConstant EOF
            {
             newCompositeNode(grammarAccess.getMobaConstantRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaConstant=ruleMobaConstant();

            state._fsp--;

             current =iv_ruleMobaConstant; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaConstant"


    // $ANTLR start "ruleMobaConstant"
    // InternalMoba.g:829:1: ruleMobaConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_valueAST_3_0 = null;

        EObject this_MobaPropertiesAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:835:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:836:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:836:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:837:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,32,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaConstantAccess().getConstKeyword_0());
            		
            // InternalMoba.g:841:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:842:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:842:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:843:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_16); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaConstantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaConstantAccess().getEqualsSignKeyword_2());
            		
            // InternalMoba.g:863:3: ( (lv_valueAST_3_0= ruleMobaConstantValue ) )
            // InternalMoba.g:864:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            {
            // InternalMoba.g:864:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            // InternalMoba.g:865:5: lv_valueAST_3_0= ruleMobaConstantValue
            {

            					newCompositeNode(grammarAccess.getMobaConstantAccess().getValueASTMobaConstantValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_20);
            lv_valueAST_3_0=ruleMobaConstantValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMobaConstantRule());
            					}
            					set(
            						current,
            						"valueAST",
            						lv_valueAST_3_0,
            						"org.mobadsl.grammar.Moba.MobaConstantValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoba.g:882:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==34) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoba.g:883:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaConstantRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaConstantAccess().getMobaPropertiesAbleParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_4=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaConstant"


    // $ANTLR start "entryRuleMobaConstantValue"
    // InternalMoba.g:899:1: entryRuleMobaConstantValue returns [EObject current=null] : iv_ruleMobaConstantValue= ruleMobaConstantValue EOF ;
    public final EObject entryRuleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstantValue = null;


        try {
            // InternalMoba.g:899:58: (iv_ruleMobaConstantValue= ruleMobaConstantValue EOF )
            // InternalMoba.g:900:2: iv_ruleMobaConstantValue= ruleMobaConstantValue EOF
            {
             newCompositeNode(grammarAccess.getMobaConstantValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaConstantValue=ruleMobaConstantValue();

            state._fsp--;

             current =iv_ruleMobaConstantValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaConstantValue"


    // $ANTLR start "ruleMobaConstantValue"
    // InternalMoba.g:906:1: ruleMobaConstantValue returns [EObject current=null] : ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )? ) ;
    public final EObject ruleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_tail_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:912:2: ( ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )? ) )
            // InternalMoba.g:913:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )? )
            {
            // InternalMoba.g:913:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )? )
            // InternalMoba.g:914:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )?
            {
            // InternalMoba.g:914:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==RULE_STRING) ) {
                alt13=1;
            }
            else if ( (LA13_0==RULE_ID) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoba.g:915:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:915:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:916:5: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:916:5: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:917:6: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_21); 

                    						newLeafNode(lv_valueString_0_0, grammarAccess.getMobaConstantValueAccess().getValueStringSTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaConstantValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueString",
                    							lv_valueString_0_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:934:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalMoba.g:934:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoba.g:935:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoba.g:935:5: (otherlv_1= RULE_ID )
                    // InternalMoba.g:936:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaConstantValueRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_21); 

                    						newLeafNode(otherlv_1, grammarAccess.getMobaConstantValueAccess().getValueConstMobaConstantCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:948:3: (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMoba.g:949:4: otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) )
                    {
                    otherlv_2=(Token)match(input,33,FOLLOW_6); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaConstantValueAccess().getPlusSignKeyword_1_0());
                    			
                    // InternalMoba.g:953:4: ( (lv_tail_3_0= ruleMobaConstantValue ) )
                    // InternalMoba.g:954:5: (lv_tail_3_0= ruleMobaConstantValue )
                    {
                    // InternalMoba.g:954:5: (lv_tail_3_0= ruleMobaConstantValue )
                    // InternalMoba.g:955:6: lv_tail_3_0= ruleMobaConstantValue
                    {

                    						newCompositeNode(grammarAccess.getMobaConstantValueAccess().getTailMobaConstantValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tail_3_0=ruleMobaConstantValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMobaConstantValueRule());
                    						}
                    						set(
                    							current,
                    							"tail",
                    							lv_tail_3_0,
                    							"org.mobadsl.grammar.Moba.MobaConstantValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaConstantValue"


    // $ANTLR start "ruleMobaPropertiesAble"
    // InternalMoba.g:978:1: ruleMobaPropertiesAble[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleMobaPropertiesAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:984:2: ( (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' ) )
            // InternalMoba.g:985:2: (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' )
            {
            // InternalMoba.g:985:2: (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' )
            // InternalMoba.g:986:3: otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_6); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPropertiesAbleAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoba.g:990:3: ( (lv_properties_1_0= ruleMobaProperty ) )
            // InternalMoba.g:991:4: (lv_properties_1_0= ruleMobaProperty )
            {
            // InternalMoba.g:991:4: (lv_properties_1_0= ruleMobaProperty )
            // InternalMoba.g:992:5: lv_properties_1_0= ruleMobaProperty
            {

            					newCompositeNode(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_22);
            lv_properties_1_0=ruleMobaProperty();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMobaPropertiesAbleRule());
            					}
            					add(
            						current,
            						"properties",
            						lv_properties_1_0,
            						"org.mobadsl.grammar.Moba.MobaProperty");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoba.g:1009:3: (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==28) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMoba.g:1010:4: otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) )
            	    {
            	    otherlv_2=(Token)match(input,28,FOLLOW_6); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMobaPropertiesAbleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMoba.g:1014:4: ( (lv_properties_3_0= ruleMobaProperty ) )
            	    // InternalMoba.g:1015:5: (lv_properties_3_0= ruleMobaProperty )
            	    {
            	    // InternalMoba.g:1015:5: (lv_properties_3_0= ruleMobaProperty )
            	    // InternalMoba.g:1016:6: lv_properties_3_0= ruleMobaProperty
            	    {

            	    						newCompositeNode(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesMobaPropertyParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_22);
            	    lv_properties_3_0=ruleMobaProperty();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMobaPropertiesAbleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"properties",
            	    							lv_properties_3_0,
            	    							"org.mobadsl.grammar.Moba.MobaProperty");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMobaPropertiesAbleAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaPropertiesAble"


    // $ANTLR start "entryRuleMobaProperty"
    // InternalMoba.g:1042:1: entryRuleMobaProperty returns [EObject current=null] : iv_ruleMobaProperty= ruleMobaProperty EOF ;
    public final EObject entryRuleMobaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProperty = null;


        try {
            // InternalMoba.g:1042:53: (iv_ruleMobaProperty= ruleMobaProperty EOF )
            // InternalMoba.g:1043:2: iv_ruleMobaProperty= ruleMobaProperty EOF
            {
             newCompositeNode(grammarAccess.getMobaPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaProperty=ruleMobaProperty();

            state._fsp--;

             current =iv_ruleMobaProperty; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaProperty"


    // $ANTLR start "ruleMobaProperty"
    // InternalMoba.g:1049:1: ruleMobaProperty returns [EObject current=null] : ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaProperty() throws RecognitionException {
        EObject current = null;

        Token lv_keyString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_valueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:1055:2: ( ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalMoba.g:1056:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalMoba.g:1056:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalMoba.g:1057:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalMoba.g:1057:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalMoba.g:1058:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1058:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    // InternalMoba.g:1059:5: (lv_keyString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:1059:5: (lv_keyString_0_0= RULE_STRING )
                    // InternalMoba.g:1060:6: lv_keyString_0_0= RULE_STRING
                    {
                    lv_keyString_0_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

                    						newLeafNode(lv_keyString_0_0, grammarAccess.getMobaPropertyAccess().getKeyStringSTRINGTerminalRuleCall_0_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"keyString",
                    							lv_keyString_0_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:1077:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalMoba.g:1077:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoba.g:1078:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoba.g:1078:5: (otherlv_1= RULE_ID )
                    // InternalMoba.g:1079:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPropertyRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_1, grammarAccess.getMobaPropertyAccess().getKeyConstMobaConstantCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:1095:3: ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_STRING) ) {
                alt17=1;
            }
            else if ( (LA17_0==RULE_ID) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // InternalMoba.g:1096:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1096:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    // InternalMoba.g:1097:5: (lv_valueString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:1097:5: (lv_valueString_3_0= RULE_STRING )
                    // InternalMoba.g:1098:6: lv_valueString_3_0= RULE_STRING
                    {
                    lv_valueString_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_valueString_3_0, grammarAccess.getMobaPropertyAccess().getValueStringSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPropertyRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueString",
                    							lv_valueString_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:1115:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMoba.g:1115:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMoba.g:1116:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMoba.g:1116:5: (otherlv_4= RULE_ID )
                    // InternalMoba.g:1117:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPropertyRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_4, grammarAccess.getMobaPropertyAccess().getValueConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaProperty"


    // $ANTLR start "entryRuleMobaData"
    // InternalMoba.g:1133:1: entryRuleMobaData returns [EObject current=null] : iv_ruleMobaData= ruleMobaData EOF ;
    public final EObject entryRuleMobaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaData = null;


        try {
            // InternalMoba.g:1133:49: (iv_ruleMobaData= ruleMobaData EOF )
            // InternalMoba.g:1134:2: iv_ruleMobaData= ruleMobaData EOF
            {
             newCompositeNode(grammarAccess.getMobaDataRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaData=ruleMobaData();

            state._fsp--;

             current =iv_ruleMobaData; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaData"


    // $ANTLR start "ruleMobaData"
    // InternalMoba.g:1140:1: ruleMobaData returns [EObject current=null] : (this_MobaDto_0= ruleMobaDto | this_MobaPayload_1= ruleMobaPayload | this_MobaQueue_2= ruleMobaQueue ) ;
    public final EObject ruleMobaData() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDto_0 = null;

        EObject this_MobaPayload_1 = null;

        EObject this_MobaQueue_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1146:2: ( (this_MobaDto_0= ruleMobaDto | this_MobaPayload_1= ruleMobaPayload | this_MobaQueue_2= ruleMobaQueue ) )
            // InternalMoba.g:1147:2: (this_MobaDto_0= ruleMobaDto | this_MobaPayload_1= ruleMobaPayload | this_MobaQueue_2= ruleMobaQueue )
            {
            // InternalMoba.g:1147:2: (this_MobaDto_0= ruleMobaDto | this_MobaPayload_1= ruleMobaPayload | this_MobaQueue_2= ruleMobaQueue )
            int alt18=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt18=1;
                }
                break;
            case 42:
                {
                alt18=2;
                }
                break;
            case 43:
                {
                alt18=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }

            switch (alt18) {
                case 1 :
                    // InternalMoba.g:1148:3: this_MobaDto_0= ruleMobaDto
                    {

                    			newCompositeNode(grammarAccess.getMobaDataAccess().getMobaDtoParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaDto_0=ruleMobaDto();

                    state._fsp--;


                    			current = this_MobaDto_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:1157:3: this_MobaPayload_1= ruleMobaPayload
                    {

                    			newCompositeNode(grammarAccess.getMobaDataAccess().getMobaPayloadParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaPayload_1=ruleMobaPayload();

                    state._fsp--;


                    			current = this_MobaPayload_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoba.g:1166:3: this_MobaQueue_2= ruleMobaQueue
                    {

                    			newCompositeNode(grammarAccess.getMobaDataAccess().getMobaQueueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaQueue_2=ruleMobaQueue();

                    state._fsp--;


                    			current = this_MobaQueue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaData"


    // $ANTLR start "entryRuleMobaSettings"
    // InternalMoba.g:1178:1: entryRuleMobaSettings returns [EObject current=null] : iv_ruleMobaSettings= ruleMobaSettings EOF ;
    public final EObject entryRuleMobaSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettings = null;


        try {
            // InternalMoba.g:1178:53: (iv_ruleMobaSettings= ruleMobaSettings EOF )
            // InternalMoba.g:1179:2: iv_ruleMobaSettings= ruleMobaSettings EOF
            {
             newCompositeNode(grammarAccess.getMobaSettingsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaSettings=ruleMobaSettings();

            state._fsp--;

             current =iv_ruleMobaSettings; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaSettings"


    // $ANTLR start "ruleMobaSettings"
    // InternalMoba.g:1185:1: ruleMobaSettings returns [EObject current=null] : ( () otherlv_1= 'settings' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (this_MobaPropertiesAble_5= ruleMobaPropertiesAble[$current] )? otherlv_6= '{' ( (lv_features_7_0= ruleMobaSettingsFeature ) )* otherlv_8= '}' ) ;
    public final EObject ruleMobaSettings() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MobaPropertiesAble_5 = null;

        EObject lv_features_7_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1191:2: ( ( () otherlv_1= 'settings' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (this_MobaPropertiesAble_5= ruleMobaPropertiesAble[$current] )? otherlv_6= '{' ( (lv_features_7_0= ruleMobaSettingsFeature ) )* otherlv_8= '}' ) )
            // InternalMoba.g:1192:2: ( () otherlv_1= 'settings' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (this_MobaPropertiesAble_5= ruleMobaPropertiesAble[$current] )? otherlv_6= '{' ( (lv_features_7_0= ruleMobaSettingsFeature ) )* otherlv_8= '}' )
            {
            // InternalMoba.g:1192:2: ( () otherlv_1= 'settings' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (this_MobaPropertiesAble_5= ruleMobaPropertiesAble[$current] )? otherlv_6= '{' ( (lv_features_7_0= ruleMobaSettingsFeature ) )* otherlv_8= '}' )
            // InternalMoba.g:1193:3: () otherlv_1= 'settings' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? (this_MobaPropertiesAble_5= ruleMobaPropertiesAble[$current] )? otherlv_6= '{' ( (lv_features_7_0= ruleMobaSettingsFeature ) )* otherlv_8= '}'
            {
            // InternalMoba.g:1193:3: ()
            // InternalMoba.g:1194:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaSettingsAccess().getSettingsKeyword_1());
            		
            // InternalMoba.g:1204:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:1205:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:1205:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:1206:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMobaSettingsAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:1222:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==19) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalMoba.g:1223:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_3, grammarAccess.getMobaSettingsAccess().getExtendsKeyword_3_0());
                    			
                    // InternalMoba.g:1227:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMoba.g:1228:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMoba.g:1228:5: (otherlv_4= RULE_ID )
                    // InternalMoba.g:1229:6: otherlv_4= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaSettingsRule());
                    						}
                    					
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_4, grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsCrossReference_3_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1241:3: (this_MobaPropertiesAble_5= ruleMobaPropertiesAble[$current] )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==34) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalMoba.g:1242:4: this_MobaPropertiesAble_5= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaSettingsRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaSettingsAccess().getMobaPropertiesAbleParserRuleCall_4());
                    			
                    pushFollow(FOLLOW_4);
                    this_MobaPropertiesAble_5=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_5;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_25); 

            			newLeafNode(otherlv_6, grammarAccess.getMobaSettingsAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMoba.g:1258:3: ( (lv_features_7_0= ruleMobaSettingsFeature ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==46) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalMoba.g:1259:4: (lv_features_7_0= ruleMobaSettingsFeature )
            	    {
            	    // InternalMoba.g:1259:4: (lv_features_7_0= ruleMobaSettingsFeature )
            	    // InternalMoba.g:1260:5: lv_features_7_0= ruleMobaSettingsFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaSettingsAccess().getFeaturesMobaSettingsFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_25);
            	    lv_features_7_0=ruleMobaSettingsFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaSettingsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_7_0,
            	    						"org.mobadsl.grammar.Moba.MobaSettingsFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_8=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_8, grammarAccess.getMobaSettingsAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaSettings"


    // $ANTLR start "entryRuleMobaCache"
    // InternalMoba.g:1285:1: entryRuleMobaCache returns [EObject current=null] : iv_ruleMobaCache= ruleMobaCache EOF ;
    public final EObject entryRuleMobaCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaCache = null;


        try {
            // InternalMoba.g:1285:50: (iv_ruleMobaCache= ruleMobaCache EOF )
            // InternalMoba.g:1286:2: iv_ruleMobaCache= ruleMobaCache EOF
            {
             newCompositeNode(grammarAccess.getMobaCacheRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaCache=ruleMobaCache();

            state._fsp--;

             current =iv_ruleMobaCache; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaCache"


    // $ANTLR start "ruleMobaCache"
    // InternalMoba.g:1292:1: ruleMobaCache returns [EObject current=null] : ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) ;
    public final EObject ruleMobaCache() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_cacheTypeString_6_0=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_cacheStrategyString_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMoba.g:1298:2: ( ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) )
            // InternalMoba.g:1299:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            {
            // InternalMoba.g:1299:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            // InternalMoba.g:1300:3: () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            {
            // InternalMoba.g:1300:3: ()
            // InternalMoba.g:1301:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaCacheAccess().getMobaCacheAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,37,FOLLOW_26); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaCacheAccess().getCacheKeyword_1());
            		
            // InternalMoba.g:1311:3: (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==25) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMoba.g:1312:4: otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')'
                    {
                    otherlv_2=(Token)match(input,25,FOLLOW_27); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoba.g:1316:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) )
                    // InternalMoba.g:1317:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    {
                    // InternalMoba.g:1317:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    // InternalMoba.g:1318:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    					
                    // InternalMoba.g:1321:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    // InternalMoba.g:1322:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    {
                    // InternalMoba.g:1322:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    loop24:
                    do {
                        int alt24=3;
                        int LA24_0 = input.LA(1);

                        if ( LA24_0 == 38 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                            alt24=1;
                        }
                        else if ( LA24_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                            alt24=2;
                        }


                        switch (alt24) {
                    	case 1 :
                    	    // InternalMoba.g:1323:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:1323:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:1324:6: {...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0)");
                    	    }
                    	    // InternalMoba.g:1324:109: ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:1325:7: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0);
                    	    						
                    	    // InternalMoba.g:1328:10: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:1328:11: {...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:1328:20: (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    // InternalMoba.g:1328:21: otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    	    {
                    	    otherlv_4=(Token)match(input,38,FOLLOW_16); 

                    	    										newLeafNode(otherlv_4, grammarAccess.getMobaCacheAccess().getTypeKeyword_2_1_0_0());
                    	    									
                    	    otherlv_5=(Token)match(input,31,FOLLOW_6); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_0_1());
                    	    									
                    	    // InternalMoba.g:1336:10: ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    	    int alt22=2;
                    	    int LA22_0 = input.LA(1);

                    	    if ( (LA22_0==RULE_STRING) ) {
                    	        alt22=1;
                    	    }
                    	    else if ( (LA22_0==RULE_ID) ) {
                    	        alt22=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 22, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt22) {
                    	        case 1 :
                    	            // InternalMoba.g:1337:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:1337:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            // InternalMoba.g:1338:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:1338:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            // InternalMoba.g:1339:13: lv_cacheTypeString_6_0= RULE_STRING
                    	            {
                    	            lv_cacheTypeString_6_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

                    	            													newLeafNode(lv_cacheTypeString_6_0, grammarAccess.getMobaCacheAccess().getCacheTypeStringSTRINGTerminalRuleCall_2_1_0_2_0_0());
                    	            												

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            													setWithLastConsumed(
                    	            														current,
                    	            														"cacheTypeString",
                    	            														lv_cacheTypeString_6_0,
                    	            														"org.eclipse.xtext.common.Terminals.STRING");
                    	            												

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:1356:11: ( (otherlv_7= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:1356:11: ( (otherlv_7= RULE_ID ) )
                    	            // InternalMoba.g:1357:12: (otherlv_7= RULE_ID )
                    	            {
                    	            // InternalMoba.g:1357:12: (otherlv_7= RULE_ID )
                    	            // InternalMoba.g:1358:13: otherlv_7= RULE_ID
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	            													newLeafNode(otherlv_7, grammarAccess.getMobaCacheAccess().getCacheTypeConstMobaConstantCrossReference_2_1_0_2_1_0());
                    	            												

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMoba.g:1376:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:1376:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:1377:6: {...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1)");
                    	    }
                    	    // InternalMoba.g:1377:109: ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:1378:7: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1);
                    	    						
                    	    // InternalMoba.g:1381:10: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:1381:11: {...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:1381:20: (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    // InternalMoba.g:1381:21: otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,39,FOLLOW_16); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getMobaCacheAccess().getStrategyKeyword_2_1_1_0());
                    	    									
                    	    otherlv_9=(Token)match(input,31,FOLLOW_6); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_1_1());
                    	    									
                    	    // InternalMoba.g:1389:10: ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
                    	    int alt23=2;
                    	    int LA23_0 = input.LA(1);

                    	    if ( (LA23_0==RULE_STRING) ) {
                    	        alt23=1;
                    	    }
                    	    else if ( (LA23_0==RULE_ID) ) {
                    	        alt23=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 23, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt23) {
                    	        case 1 :
                    	            // InternalMoba.g:1390:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:1390:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            // InternalMoba.g:1391:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:1391:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            // InternalMoba.g:1392:13: lv_cacheStrategyString_10_0= RULE_STRING
                    	            {
                    	            lv_cacheStrategyString_10_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

                    	            													newLeafNode(lv_cacheStrategyString_10_0, grammarAccess.getMobaCacheAccess().getCacheStrategyStringSTRINGTerminalRuleCall_2_1_1_2_0_0());
                    	            												

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            													setWithLastConsumed(
                    	            														current,
                    	            														"cacheStrategyString",
                    	            														lv_cacheStrategyString_10_0,
                    	            														"org.eclipse.xtext.common.Terminals.STRING");
                    	            												

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:1409:11: ( (otherlv_11= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:1409:11: ( (otherlv_11= RULE_ID ) )
                    	            // InternalMoba.g:1410:12: (otherlv_11= RULE_ID )
                    	            {
                    	            // InternalMoba.g:1410:12: (otherlv_11= RULE_ID )
                    	            // InternalMoba.g:1411:13: otherlv_11= RULE_ID
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_27); 

                    	            													newLeafNode(otherlv_11, grammarAccess.getMobaCacheAccess().getCacheStrategyConstMobaConstantCrossReference_2_1_1_2_1_0());
                    	            												

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	     
                    	    							getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop24;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    					

                    }

                    otherlv_12=(Token)match(input,26,FOLLOW_2); 

                    				newLeafNode(otherlv_12, grammarAccess.getMobaCacheAccess().getRightParenthesisKeyword_2_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaCache"


    // $ANTLR start "entryRuleMobaDto"
    // InternalMoba.g:1445:1: entryRuleMobaDto returns [EObject current=null] : iv_ruleMobaDto= ruleMobaDto EOF ;
    public final EObject entryRuleMobaDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDto = null;


        try {
            // InternalMoba.g:1445:48: (iv_ruleMobaDto= ruleMobaDto EOF )
            // InternalMoba.g:1446:2: iv_ruleMobaDto= ruleMobaDto EOF
            {
             newCompositeNode(grammarAccess.getMobaDtoRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaDto=ruleMobaDto();

            state._fsp--;

             current =iv_ruleMobaDto; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaDto"


    // $ANTLR start "ruleMobaDto"
    // InternalMoba.g:1452:1: ruleMobaDto returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* ( (lv_index_9_0= ruleMobaDtoIndex ) )? otherlv_10= '}' ) ;
    public final EObject ruleMobaDto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_cache_5_0 = null;

        EObject this_MobaPropertiesAble_6 = null;

        EObject lv_features_8_0 = null;

        EObject lv_index_9_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1458:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* ( (lv_index_9_0= ruleMobaDtoIndex ) )? otherlv_10= '}' ) )
            // InternalMoba.g:1459:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* ( (lv_index_9_0= ruleMobaDtoIndex ) )? otherlv_10= '}' )
            {
            // InternalMoba.g:1459:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* ( (lv_index_9_0= ruleMobaDtoIndex ) )? otherlv_10= '}' )
            // InternalMoba.g:1460:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* ( (lv_index_9_0= ruleMobaDtoIndex ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAccess().getDtoKeyword_0());
            		
            // InternalMoba.g:1464:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1465:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1465:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1466:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_28); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaDtoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:1482:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) )
            // InternalMoba.g:1483:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:1483:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            // InternalMoba.g:1484:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2());
            				
            // InternalMoba.g:1487:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            // InternalMoba.g:1488:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            {
            // InternalMoba.g:1488:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            loop26:
            do {
                int alt26=3;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == 19 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1) ) {
                    alt26=2;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMoba.g:1489:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1489:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:1490:5: {...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDto", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoba.g:1490:104: ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:1491:6: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMoba.g:1494:9: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalMoba.g:1494:10: {...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDto", "true");
            	    }
            	    // InternalMoba.g:1494:19: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalMoba.g:1494:20: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMobaDtoAccess().getExtendsKeyword_2_0_0());
            	    								
            	    // InternalMoba.g:1498:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalMoba.g:1499:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMoba.g:1499:10: (otherlv_4= RULE_ID )
            	    // InternalMoba.g:1500:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaDtoRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_28); 

            	    											newLeafNode(otherlv_4, grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoCrossReference_2_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:1517:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    {
            	    // InternalMoba.g:1517:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    // InternalMoba.g:1518:5: {...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDto", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoba.g:1518:104: ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    // InternalMoba.g:1519:6: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMoba.g:1522:9: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    // InternalMoba.g:1522:10: {...}? => ( (lv_cache_5_0= ruleMobaCache ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDto", "true");
            	    }
            	    // InternalMoba.g:1522:19: ( (lv_cache_5_0= ruleMobaCache ) )
            	    // InternalMoba.g:1522:20: (lv_cache_5_0= ruleMobaCache )
            	    {
            	    // InternalMoba.g:1522:20: (lv_cache_5_0= ruleMobaCache )
            	    // InternalMoba.g:1523:10: lv_cache_5_0= ruleMobaCache
            	    {

            	    										newCompositeNode(grammarAccess.getMobaDtoAccess().getCacheMobaCacheParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_28);
            	    lv_cache_5_0=ruleMobaCache();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMobaDtoRule());
            	    										}
            	    										set(
            	    											current,
            	    											"cache",
            	    											lv_cache_5_0,
            	    											"org.mobadsl.grammar.Moba.MobaCache");
            	    										afterParserOrEnumRuleCall();
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAccess().getUnorderedGroup_2());
            				

            }

            // InternalMoba.g:1552:3: (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalMoba.g:1553:4: this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaDtoRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaDtoAccess().getMobaPropertiesAbleParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_MobaPropertiesAble_6=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_29); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaDtoAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:1569:3: ( (lv_features_8_0= ruleMobaDtoFeature ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==46||LA28_0==51) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalMoba.g:1570:4: (lv_features_8_0= ruleMobaDtoFeature )
            	    {
            	    // InternalMoba.g:1570:4: (lv_features_8_0= ruleMobaDtoFeature )
            	    // InternalMoba.g:1571:5: lv_features_8_0= ruleMobaDtoFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaDtoAccess().getFeaturesMobaDtoFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_29);
            	    lv_features_8_0=ruleMobaDtoFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaDtoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_8_0,
            	    						"org.mobadsl.grammar.Moba.MobaDtoFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            // InternalMoba.g:1588:3: ( (lv_index_9_0= ruleMobaDtoIndex ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==41) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoba.g:1589:4: (lv_index_9_0= ruleMobaDtoIndex )
                    {
                    // InternalMoba.g:1589:4: (lv_index_9_0= ruleMobaDtoIndex )
                    // InternalMoba.g:1590:5: lv_index_9_0= ruleMobaDtoIndex
                    {

                    					newCompositeNode(grammarAccess.getMobaDtoAccess().getIndexMobaDtoIndexParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_30);
                    lv_index_9_0=ruleMobaDtoIndex();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMobaDtoRule());
                    					}
                    					set(
                    						current,
                    						"index",
                    						lv_index_9_0,
                    						"org.mobadsl.grammar.Moba.MobaDtoIndex");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMobaDtoAccess().getRightCurlyBracketKeyword_7());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaDto"


    // $ANTLR start "entryRuleMobaDtoIndex"
    // InternalMoba.g:1615:1: entryRuleMobaDtoIndex returns [EObject current=null] : iv_ruleMobaDtoIndex= ruleMobaDtoIndex EOF ;
    public final EObject entryRuleMobaDtoIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoIndex = null;


        try {
            // InternalMoba.g:1615:53: (iv_ruleMobaDtoIndex= ruleMobaDtoIndex EOF )
            // InternalMoba.g:1616:2: iv_ruleMobaDtoIndex= ruleMobaDtoIndex EOF
            {
             newCompositeNode(grammarAccess.getMobaDtoIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaDtoIndex=ruleMobaDtoIndex();

            state._fsp--;

             current =iv_ruleMobaDtoIndex; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaDtoIndex"


    // $ANTLR start "ruleMobaDtoIndex"
    // InternalMoba.g:1622:1: ruleMobaDtoIndex returns [EObject current=null] : (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) ;
    public final EObject ruleMobaDtoIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:1628:2: ( (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) )
            // InternalMoba.g:1629:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            {
            // InternalMoba.g:1629:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            // InternalMoba.g:1630:3: otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoIndexAccess().getIndexKeyword_0());
            		
            // InternalMoba.g:1634:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:1635:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:1635:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:1636:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoIndexRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_18); 

            					newLeafNode(otherlv_1, grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeCrossReference_1_0());
            				

            }


            }

            // InternalMoba.g:1647:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            // InternalMoba.g:1648:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )*
            {
            otherlv_2=(Token)match(input,28,FOLLOW_31); 

            				newLeafNode(otherlv_2, grammarAccess.getMobaDtoIndexAccess().getCommaKeyword_2_0());
            			
            // InternalMoba.g:1652:4: ( (otherlv_3= RULE_ID ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==RULE_ID) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMoba.g:1653:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMoba.g:1653:5: (otherlv_3= RULE_ID )
            	    // InternalMoba.g:1654:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMobaDtoIndexRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMobaDtoIndexAccess().getAttributesMobaDtoAttributeCrossReference_2_1_0());
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaDtoIndex"


    // $ANTLR start "entryRuleMobaPayload"
    // InternalMoba.g:1670:1: entryRuleMobaPayload returns [EObject current=null] : iv_ruleMobaPayload= ruleMobaPayload EOF ;
    public final EObject entryRuleMobaPayload() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPayload = null;


        try {
            // InternalMoba.g:1670:52: (iv_ruleMobaPayload= ruleMobaPayload EOF )
            // InternalMoba.g:1671:2: iv_ruleMobaPayload= ruleMobaPayload EOF
            {
             newCompositeNode(grammarAccess.getMobaPayloadRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaPayload=ruleMobaPayload();

            state._fsp--;

             current =iv_ruleMobaPayload; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaPayload"


    // $ANTLR start "ruleMobaPayload"
    // InternalMoba.g:1677:1: ruleMobaPayload returns [EObject current=null] : (otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}' ) ;
    public final EObject ruleMobaPayload() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MobaPropertiesAble_4 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1683:2: ( (otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:1684:2: (otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:1684:2: (otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:1685:3: otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPayloadAccess().getPayloadKeyword_0());
            		
            // InternalMoba.g:1689:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1690:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1690:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1691:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaPayloadAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaPayloadRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:1707:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==19) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoba.g:1708:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaPayloadAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:1712:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1713:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1713:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1714:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPayloadRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaPayloadAccess().getSuperTypeMobaPayloadCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1726:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==34) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMoba.g:1727:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaPayloadRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaPayloadAccess().getMobaPropertiesAbleParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_MobaPropertiesAble_4=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaPayloadAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:1743:3: ( (lv_features_6_0= ruleMobaPayloadFeature ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==46||LA33_0==51) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoba.g:1744:4: (lv_features_6_0= ruleMobaPayloadFeature )
            	    {
            	    // InternalMoba.g:1744:4: (lv_features_6_0= ruleMobaPayloadFeature )
            	    // InternalMoba.g:1745:5: lv_features_6_0= ruleMobaPayloadFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaPayloadAccess().getFeaturesMobaPayloadFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_features_6_0=ruleMobaPayloadFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaPayloadRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"org.mobadsl.grammar.Moba.MobaPayloadFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaPayloadAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaPayload"


    // $ANTLR start "entryRuleMobaQueue"
    // InternalMoba.g:1770:1: entryRuleMobaQueue returns [EObject current=null] : iv_ruleMobaQueue= ruleMobaQueue EOF ;
    public final EObject entryRuleMobaQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueue = null;


        try {
            // InternalMoba.g:1770:50: (iv_ruleMobaQueue= ruleMobaQueue EOF )
            // InternalMoba.g:1771:2: iv_ruleMobaQueue= ruleMobaQueue EOF
            {
             newCompositeNode(grammarAccess.getMobaQueueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaQueue=ruleMobaQueue();

            state._fsp--;

             current =iv_ruleMobaQueue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaQueue"


    // $ANTLR start "ruleMobaQueue"
    // InternalMoba.g:1777:1: ruleMobaQueue returns [EObject current=null] : (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) ;
    public final EObject ruleMobaQueue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MobaPropertiesAble_4 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1783:2: ( (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:1784:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:1784:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:1785:3: otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueAccess().getQueueKeyword_0());
            		
            // InternalMoba.g:1789:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1790:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1790:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1791:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaQueueAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:1807:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==19) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMoba.g:1808:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,19,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:1812:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1813:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1813:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1814:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaQueueRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_24); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1826:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMoba.g:1827:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaQueueRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaQueueAccess().getMobaPropertiesAbleParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_MobaPropertiesAble_4=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_33); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:1843:3: ( (lv_features_6_0= ruleMobaQueueFeature ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==51) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalMoba.g:1844:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    {
            	    // InternalMoba.g:1844:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    // InternalMoba.g:1845:5: lv_features_6_0= ruleMobaQueueFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_33);
            	    lv_features_6_0=ruleMobaQueueFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaQueueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"org.mobadsl.grammar.Moba.MobaQueueFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaQueueAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaQueue"


    // $ANTLR start "entryRuleMobaService"
    // InternalMoba.g:1870:1: entryRuleMobaService returns [EObject current=null] : iv_ruleMobaService= ruleMobaService EOF ;
    public final EObject entryRuleMobaService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaService = null;


        try {
            // InternalMoba.g:1870:52: (iv_ruleMobaService= ruleMobaService EOF )
            // InternalMoba.g:1871:2: iv_ruleMobaService= ruleMobaService EOF
            {
             newCompositeNode(grammarAccess.getMobaServiceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaService=ruleMobaService();

            state._fsp--;

             current =iv_ruleMobaService; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaService"


    // $ANTLR start "ruleMobaService"
    // InternalMoba.g:1877:1: ruleMobaService returns [EObject current=null] : (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud ) ;
    public final EObject ruleMobaService() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRestCustom_0 = null;

        EObject this_MobaRestCrud_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:1883:2: ( (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud ) )
            // InternalMoba.g:1884:2: (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud )
            {
            // InternalMoba.g:1884:2: (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==44) ) {
                alt37=1;
            }
            else if ( (LA37_0==45) ) {
                alt37=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoba.g:1885:3: this_MobaRestCustom_0= ruleMobaRestCustom
                    {

                    			newCompositeNode(grammarAccess.getMobaServiceAccess().getMobaRestCustomParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRestCustom_0=ruleMobaRestCustom();

                    state._fsp--;


                    			current = this_MobaRestCustom_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:1894:3: this_MobaRestCrud_1= ruleMobaRestCrud
                    {

                    			newCompositeNode(grammarAccess.getMobaServiceAccess().getMobaRestCrudParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRestCrud_1=ruleMobaRestCrud();

                    state._fsp--;


                    			current = this_MobaRestCrud_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaService"


    // $ANTLR start "entryRuleMobaRestCustom"
    // InternalMoba.g:1906:1: entryRuleMobaRestCustom returns [EObject current=null] : iv_ruleMobaRestCustom= ruleMobaRestCustom EOF ;
    public final EObject entryRuleMobaRestCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestCustom = null;


        try {
            // InternalMoba.g:1906:55: (iv_ruleMobaRestCustom= ruleMobaRestCustom EOF )
            // InternalMoba.g:1907:2: iv_ruleMobaRestCustom= ruleMobaRestCustom EOF
            {
             newCompositeNode(grammarAccess.getMobaRestCustomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRestCustom=ruleMobaRestCustom();

            state._fsp--;

             current =iv_ruleMobaRestCustom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaRestCustom"


    // $ANTLR start "ruleMobaRestCustom"
    // InternalMoba.g:1913:1: ruleMobaRestCustom returns [EObject current=null] : (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaRestCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaPropertiesAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1919:2: ( (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:1920:2: (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:1920:2: (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:1921:3: otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRestCustomAccess().getRestKeyword_0());
            		
            // InternalMoba.g:1925:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1926:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1926:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1927:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaRestCustomAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaRestCustomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:1943:3: (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==34) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoba.g:1944:4: this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaRestCustomRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaRestCustomAccess().getMobaPropertiesAbleParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_2=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaRestCustom"


    // $ANTLR start "entryRuleMobaRestCrud"
    // InternalMoba.g:1960:1: entryRuleMobaRestCrud returns [EObject current=null] : iv_ruleMobaRestCrud= ruleMobaRestCrud EOF ;
    public final EObject entryRuleMobaRestCrud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestCrud = null;


        try {
            // InternalMoba.g:1960:53: (iv_ruleMobaRestCrud= ruleMobaRestCrud EOF )
            // InternalMoba.g:1961:2: iv_ruleMobaRestCrud= ruleMobaRestCrud EOF
            {
             newCompositeNode(grammarAccess.getMobaRestCrudRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRestCrud=ruleMobaRestCrud();

            state._fsp--;

             current =iv_ruleMobaRestCrud; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaRestCrud"


    // $ANTLR start "ruleMobaRestCrud"
    // InternalMoba.g:1967:1: ruleMobaRestCrud returns [EObject current=null] : (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaRestCrud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaPropertiesAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1973:2: ( (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:1974:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:1974:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:1975:3: otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRestCrudAccess().getRestCrudKeyword_0());
            		
            // InternalMoba.g:1979:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1980:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1980:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1981:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaRestCrudAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaRestCrudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:1997:3: (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==34) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoba.g:1998:4: this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaRestCrudRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaRestCrudAccess().getMobaPropertiesAbleParserRuleCall_2());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_2=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_2;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaRestCrud"


    // $ANTLR start "entryRuleMobaDtoFeature"
    // InternalMoba.g:2014:1: entryRuleMobaDtoFeature returns [EObject current=null] : iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF ;
    public final EObject entryRuleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoFeature = null;


        try {
            // InternalMoba.g:2014:55: (iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF )
            // InternalMoba.g:2015:2: iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaDtoFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaDtoFeature=ruleMobaDtoFeature();

            state._fsp--;

             current =iv_ruleMobaDtoFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaDtoFeature"


    // $ANTLR start "ruleMobaDtoFeature"
    // InternalMoba.g:2021:1: ruleMobaDtoFeature returns [EObject current=null] : (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference ) ;
    public final EObject ruleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDtoAttribute_0 = null;

        EObject this_MobaDtoReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:2027:2: ( (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference ) )
            // InternalMoba.g:2028:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference )
            {
            // InternalMoba.g:2028:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference )
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==46) ) {
                alt40=1;
            }
            else if ( (LA40_0==51) ) {
                alt40=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoba.g:2029:3: this_MobaDtoAttribute_0= ruleMobaDtoAttribute
                    {

                    			newCompositeNode(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaDtoAttribute_0=ruleMobaDtoAttribute();

                    state._fsp--;


                    			current = this_MobaDtoAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:2038:3: this_MobaDtoReference_1= ruleMobaDtoReference
                    {

                    			newCompositeNode(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaDtoReference_1=ruleMobaDtoReference();

                    state._fsp--;


                    			current = this_MobaDtoReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaDtoFeature"


    // $ANTLR start "entryRuleMobaDtoAttribute"
    // InternalMoba.g:2050:1: entryRuleMobaDtoAttribute returns [EObject current=null] : iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF ;
    public final EObject entryRuleMobaDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoAttribute = null;


        try {
            // InternalMoba.g:2050:57: (iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF )
            // InternalMoba.g:2051:2: iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaDtoAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaDtoAttribute=ruleMobaDtoAttribute();

            state._fsp--;

             current =iv_ruleMobaDtoAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaDtoAttribute"


    // $ANTLR start "ruleMobaDtoAttribute"
    // InternalMoba.g:2057:1: ruleMobaDtoAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaDtoAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lazy_2_0=null;
        Token lv_transient_3_0=null;
        Token lv_domainKey_4_0=null;
        Token lv_domainDescription_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_14_0=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject this_MobaMultiplicityAble_13 = null;

        EObject this_MobaPropertiesAble_15 = null;



        	enterRule();

        try {
            // InternalMoba.g:2063:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2064:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2064:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2065:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2069:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2070:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2070:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2071:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2074:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:2075:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:2075:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop42:
            do {
                int alt42=6;
                int LA42_0 = input.LA(1);

                if ( LA42_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt42=1;
                }
                else if ( LA42_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt42=2;
                }
                else if ( LA42_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt42=3;
                }
                else if ( LA42_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt42=4;
                }
                else if ( LA42_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt42=5;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalMoba.g:2076:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2076:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2077:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2077:113: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2078:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2081:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:2081:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:2081:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:2081:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2081:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:2082:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,47,FOLLOW_34); 

            	    										newLeafNode(lv_lazy_2_0, grammarAccess.getMobaDtoAttributeAccess().getLazyLazyKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2099:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2099:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2100:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2100:113: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2101:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2104:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:2104:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:2104:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:2104:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:2104:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:2105:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,48,FOLLOW_34); 

            	    										newLeafNode(lv_transient_3_0, grammarAccess.getMobaDtoAttributeAccess().getTransientTransientKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:2122:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2122:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:2123:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2123:113: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:2124:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2127:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:2127:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:2127:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:2127:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:2127:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:2128:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,49,FOLLOW_34); 

            	    										newLeafNode(lv_domainKey_4_0, grammarAccess.getMobaDtoAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainKey", true, "domainKey");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:2145:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2145:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:2146:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:2146:113: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:2147:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:2150:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:2150:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:2150:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:2150:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:2150:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:2151:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,50,FOLLOW_34); 

            	    										newLeafNode(lv_domainDescription_5_0, grammarAccess.getMobaDtoAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainDescription", true, "domainDescription");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:2168:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2168:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:2169:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:2169:113: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:2170:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:2173:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:2173:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:2173:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:2173:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaDtoAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,25,FOLLOW_12); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:2181:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:2182:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:2182:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:2183:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaDtoAttributeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"constraints",
            	    												lv_constraints_8_0,
            	    												"org.mobadsl.grammar.Moba.MobaConstraint");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMoba.g:2200:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==28) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // InternalMoba.g:2201:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,28,FOLLOW_12); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaDtoAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:2205:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:2206:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:2206:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:2207:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMobaDtoAttributeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"constraints",
            	    	    													lv_constraints_10_0,
            	    	    													"org.mobadsl.grammar.Moba.MobaConstraint");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,26,FOLLOW_34); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2242:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:2243:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:2243:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:2244:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_12, grammarAccess.getMobaDtoAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_13;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:2266:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:2267:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:2267:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:2268:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_14_0, grammarAccess.getMobaDtoAttributeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_14_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:2284:3: (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==34) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoba.g:2285:4: this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_15=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_15;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaDtoAttribute"


    // $ANTLR start "entryRuleMobaSettingsFeature"
    // InternalMoba.g:2301:1: entryRuleMobaSettingsFeature returns [EObject current=null] : iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF ;
    public final EObject entryRuleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsFeature = null;


        try {
            // InternalMoba.g:2301:60: (iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF )
            // InternalMoba.g:2302:2: iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaSettingsFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaSettingsFeature=ruleMobaSettingsFeature();

            state._fsp--;

             current =iv_ruleMobaSettingsFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaSettingsFeature"


    // $ANTLR start "ruleMobaSettingsFeature"
    // InternalMoba.g:2308:1: ruleMobaSettingsFeature returns [EObject current=null] : this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute ;
    public final EObject ruleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaSettingsAttribute_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2314:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute )
            // InternalMoba.g:2315:2: this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute
            {

            		newCompositeNode(grammarAccess.getMobaSettingsFeatureAccess().getMobaSettingsAttributeParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_MobaSettingsAttribute_0=ruleMobaSettingsAttribute();

            state._fsp--;


            		current = this_MobaSettingsAttribute_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaSettingsFeature"


    // $ANTLR start "entryRuleMobaSettingsAttribute"
    // InternalMoba.g:2326:1: entryRuleMobaSettingsAttribute returns [EObject current=null] : iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF ;
    public final EObject entryRuleMobaSettingsAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsAttribute = null;


        try {
            // InternalMoba.g:2326:62: (iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF )
            // InternalMoba.g:2327:2: iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaSettingsAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaSettingsAttribute=ruleMobaSettingsAttribute();

            state._fsp--;

             current =iv_ruleMobaSettingsAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaSettingsAttribute"


    // $ANTLR start "ruleMobaSettingsAttribute"
    // InternalMoba.g:2333:1: ruleMobaSettingsAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaSettingsAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lazy_2_0=null;
        Token lv_transient_3_0=null;
        Token lv_domainKey_4_0=null;
        Token lv_domainDescription_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token lv_name_14_0=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject this_MobaMultiplicityAble_13 = null;

        EObject this_MobaPropertiesAble_15 = null;



        	enterRule();

        try {
            // InternalMoba.g:2339:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2340:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2340:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2341:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_34); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2345:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2346:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2346:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2347:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2350:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:2351:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:2351:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop45:
            do {
                int alt45=6;
                int LA45_0 = input.LA(1);

                if ( LA45_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt45=1;
                }
                else if ( LA45_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt45=2;
                }
                else if ( LA45_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt45=3;
                }
                else if ( LA45_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt45=4;
                }
                else if ( LA45_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt45=5;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMoba.g:2352:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2352:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2353:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2353:118: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2354:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2357:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:2357:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2357:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:2357:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2357:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:2358:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,47,FOLLOW_34); 

            	    										newLeafNode(lv_lazy_2_0, grammarAccess.getMobaSettingsAttributeAccess().getLazyLazyKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2375:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2375:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2376:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2376:118: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2377:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2380:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:2380:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2380:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:2380:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:2380:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:2381:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,48,FOLLOW_34); 

            	    										newLeafNode(lv_transient_3_0, grammarAccess.getMobaSettingsAttributeAccess().getTransientTransientKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:2398:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2398:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:2399:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2399:118: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:2400:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2403:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:2403:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2403:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:2403:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:2403:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:2404:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,49,FOLLOW_34); 

            	    										newLeafNode(lv_domainKey_4_0, grammarAccess.getMobaSettingsAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainKey", true, "domainKey");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:2421:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2421:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:2422:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:2422:118: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:2423:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:2426:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:2426:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2426:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:2426:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:2426:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:2427:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,50,FOLLOW_34); 

            	    										newLeafNode(lv_domainDescription_5_0, grammarAccess.getMobaSettingsAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainDescription", true, "domainDescription");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:2444:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2444:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:2445:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:2445:118: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:2446:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:2449:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:2449:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2449:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:2449:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaSettingsAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,25,FOLLOW_12); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:2457:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:2458:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:2458:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:2459:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaSettingsAttributeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"constraints",
            	    												lv_constraints_8_0,
            	    												"org.mobadsl.grammar.Moba.MobaConstraint");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMoba.g:2476:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==28) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // InternalMoba.g:2477:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,28,FOLLOW_12); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:2481:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:2482:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:2482:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:2483:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMobaSettingsAttributeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"constraints",
            	    	    													lv_constraints_10_0,
            	    	    													"org.mobadsl.grammar.Moba.MobaConstraint");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop44;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,26,FOLLOW_34); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaSettingsAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2518:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:2519:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:2519:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:2520:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_12, grammarAccess.getMobaSettingsAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_13;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:2542:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:2543:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:2543:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:2544:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_14_0, grammarAccess.getMobaSettingsAttributeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_14_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:2560:3: (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==34) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMoba.g:2561:4: this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_15=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_15;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaSettingsAttribute"


    // $ANTLR start "ruleMobaMultiplicityAble"
    // InternalMoba.g:2578:1: ruleMobaMultiplicityAble[EObject in_current] returns [EObject current=in_current] : ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? ;
    public final EObject ruleMobaMultiplicityAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2584:2: ( ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? )
            // InternalMoba.g:2585:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            {
            // InternalMoba.g:2585:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==34) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMoba.g:2586:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    {
                    // InternalMoba.g:2586:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    // InternalMoba.g:2587:4: lv_multiplicity_0_0= ruleMobaMuliplicity
                    {

                    				newCompositeNode(grammarAccess.getMobaMultiplicityAbleAccess().getMultiplicityMobaMuliplicityParserRuleCall_0());
                    			
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_0_0=ruleMobaMuliplicity();

                    state._fsp--;


                    				if (current==null) {
                    					current = createModelElementForParent(grammarAccess.getMobaMultiplicityAbleRule());
                    				}
                    				set(
                    					current,
                    					"multiplicity",
                    					lv_multiplicity_0_0,
                    					"org.mobadsl.grammar.Moba.MobaMuliplicity");
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaMultiplicityAble"


    // $ANTLR start "entryRuleMobaDtoReference"
    // InternalMoba.g:2607:1: entryRuleMobaDtoReference returns [EObject current=null] : iv_ruleMobaDtoReference= ruleMobaDtoReference EOF ;
    public final EObject entryRuleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoReference = null;


        try {
            // InternalMoba.g:2607:57: (iv_ruleMobaDtoReference= ruleMobaDtoReference EOF )
            // InternalMoba.g:2608:2: iv_ruleMobaDtoReference= ruleMobaDtoReference EOF
            {
             newCompositeNode(grammarAccess.getMobaDtoReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaDtoReference=ruleMobaDtoReference();

            state._fsp--;

             current =iv_ruleMobaDtoReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaDtoReference"


    // $ANTLR start "ruleMobaDtoReference"
    // InternalMoba.g:2614:1: ruleMobaDtoReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cascading_2_0=null;
        Token lv_lazy_3_0=null;
        Token lv_transient_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        EObject this_MobaMultiplicityAble_6 = null;

        EObject this_MobaPropertiesAble_8 = null;



        	enterRule();

        try {
            // InternalMoba.g:2620:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2621:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2621:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2622:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:2626:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:2627:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:2627:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:2628:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2631:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:2632:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:2632:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop48:
            do {
                int alt48=4;
                int LA48_0 = input.LA(1);

                if ( LA48_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt48=1;
                }
                else if ( LA48_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt48=2;
                }
                else if ( LA48_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt48=3;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMoba.g:2633:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2633:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:2634:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2634:113: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:2635:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2638:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:2638:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:2638:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:2638:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:2638:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:2639:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,52,FOLLOW_36); 

            	    										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaDtoReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "cascading", true, "cascading");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2656:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2656:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2657:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2657:113: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2658:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2661:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:2661:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:2661:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:2661:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2661:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:2662:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,47,FOLLOW_36); 

            	    										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaDtoReferenceAccess().getLazyLazyKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:2679:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2679:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2680:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2680:113: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2681:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2684:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:2684:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:2684:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:2684:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:2684:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:2685:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,48,FOLLOW_36); 

            	    										newLeafNode(lv_transient_4_0, grammarAccess.getMobaDtoReferenceAccess().getTransientTransientKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2709:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:2710:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:2710:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:2711:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_5, grammarAccess.getMobaDtoReferenceAccess().getTypeMobaDtoCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_6;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:2733:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:2734:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:2734:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:2735:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_7_0, grammarAccess.getMobaDtoReferenceAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:2751:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==34) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMoba.g:2752:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaDtoReferenceAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_8=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaDtoReference"


    // $ANTLR start "entryRuleMobaPayloadFeature"
    // InternalMoba.g:2768:1: entryRuleMobaPayloadFeature returns [EObject current=null] : iv_ruleMobaPayloadFeature= ruleMobaPayloadFeature EOF ;
    public final EObject entryRuleMobaPayloadFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPayloadFeature = null;


        try {
            // InternalMoba.g:2768:59: (iv_ruleMobaPayloadFeature= ruleMobaPayloadFeature EOF )
            // InternalMoba.g:2769:2: iv_ruleMobaPayloadFeature= ruleMobaPayloadFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaPayloadFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaPayloadFeature=ruleMobaPayloadFeature();

            state._fsp--;

             current =iv_ruleMobaPayloadFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaPayloadFeature"


    // $ANTLR start "ruleMobaPayloadFeature"
    // InternalMoba.g:2775:1: ruleMobaPayloadFeature returns [EObject current=null] : (this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute | this_MobaPayloadReference_1= ruleMobaPayloadReference ) ;
    public final EObject ruleMobaPayloadFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaPayloadAttribute_0 = null;

        EObject this_MobaPayloadReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:2781:2: ( (this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute | this_MobaPayloadReference_1= ruleMobaPayloadReference ) )
            // InternalMoba.g:2782:2: (this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute | this_MobaPayloadReference_1= ruleMobaPayloadReference )
            {
            // InternalMoba.g:2782:2: (this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute | this_MobaPayloadReference_1= ruleMobaPayloadReference )
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            else if ( (LA50_0==51) ) {
                alt50=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }
            switch (alt50) {
                case 1 :
                    // InternalMoba.g:2783:3: this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute
                    {

                    			newCompositeNode(grammarAccess.getMobaPayloadFeatureAccess().getMobaPayloadAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaPayloadAttribute_0=ruleMobaPayloadAttribute();

                    state._fsp--;


                    			current = this_MobaPayloadAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:2792:3: this_MobaPayloadReference_1= ruleMobaPayloadReference
                    {

                    			newCompositeNode(grammarAccess.getMobaPayloadFeatureAccess().getMobaPayloadReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaPayloadReference_1=ruleMobaPayloadReference();

                    state._fsp--;


                    			current = this_MobaPayloadReference_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaPayloadFeature"


    // $ANTLR start "entryRuleMobaPayloadAttribute"
    // InternalMoba.g:2804:1: entryRuleMobaPayloadAttribute returns [EObject current=null] : iv_ruleMobaPayloadAttribute= ruleMobaPayloadAttribute EOF ;
    public final EObject entryRuleMobaPayloadAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPayloadAttribute = null;


        try {
            // InternalMoba.g:2804:61: (iv_ruleMobaPayloadAttribute= ruleMobaPayloadAttribute EOF )
            // InternalMoba.g:2805:2: iv_ruleMobaPayloadAttribute= ruleMobaPayloadAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaPayloadAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaPayloadAttribute=ruleMobaPayloadAttribute();

            state._fsp--;

             current =iv_ruleMobaPayloadAttribute; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaPayloadAttribute"


    // $ANTLR start "ruleMobaPayloadAttribute"
    // InternalMoba.g:2811:1: ruleMobaPayloadAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaPayloadAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_lazy_2_0=null;
        Token lv_transient_3_0=null;
        Token lv_domainKey_4_0=null;
        Token lv_domainDescription_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token lv_alias_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_name_18_0=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject this_MobaMultiplicityAble_17 = null;

        EObject this_MobaPropertiesAble_19 = null;



        	enterRule();

        try {
            // InternalMoba.g:2817:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2818:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2818:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2819:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,46,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPayloadAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2823:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2824:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2824:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2825:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2828:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            // InternalMoba.g:2829:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            {
            // InternalMoba.g:2829:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            loop52:
            do {
                int alt52=7;
                int LA52_0 = input.LA(1);

                if ( LA52_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt52=1;
                }
                else if ( LA52_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt52=2;
                }
                else if ( LA52_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt52=3;
                }
                else if ( LA52_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt52=4;
                }
                else if ( LA52_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt52=5;
                }
                else if ( LA52_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 5) ) {
                    alt52=6;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMoba.g:2830:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2830:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2831:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2831:117: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2832:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2835:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:2835:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:2835:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:2835:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2835:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:2836:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,47,FOLLOW_37); 

            	    										newLeafNode(lv_lazy_2_0, grammarAccess.getMobaPayloadAttributeAccess().getLazyLazyKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2853:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2853:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2854:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2854:117: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2855:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2858:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:2858:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:2858:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:2858:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:2858:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:2859:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,48,FOLLOW_37); 

            	    										newLeafNode(lv_transient_3_0, grammarAccess.getMobaPayloadAttributeAccess().getTransientTransientKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:2876:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2876:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:2877:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2877:117: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:2878:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2881:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:2881:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:2881:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:2881:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:2881:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:2882:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,49,FOLLOW_37); 

            	    										newLeafNode(lv_domainKey_4_0, grammarAccess.getMobaPayloadAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainKey", true, "domainKey");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:2899:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2899:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:2900:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:2900:117: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:2901:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:2904:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:2904:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:2904:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:2904:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:2904:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:2905:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,50,FOLLOW_37); 

            	    										newLeafNode(lv_domainDescription_5_0, grammarAccess.getMobaPayloadAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainDescription", true, "domainDescription");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:2922:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2922:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:2923:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:2923:117: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:2924:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:2927:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:2927:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:2927:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:2927:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,27,FOLLOW_11); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaPayloadAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,25,FOLLOW_12); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaPayloadAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:2935:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:2936:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:2936:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:2937:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaPayloadAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_13);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaPayloadAttributeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"constraints",
            	    												lv_constraints_8_0,
            	    												"org.mobadsl.grammar.Moba.MobaConstraint");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMoba.g:2954:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==28) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // InternalMoba.g:2955:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,28,FOLLOW_12); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaPayloadAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:2959:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:2960:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:2960:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:2961:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaPayloadAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_13);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMobaPayloadAttributeRule());
            	    	    												}
            	    	    												add(
            	    	    													current,
            	    	    													"constraints",
            	    	    													lv_constraints_10_0,
            	    	    													"org.mobadsl.grammar.Moba.MobaConstraint");
            	    	    												afterParserOrEnumRuleCall();
            	    	    											

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,26,FOLLOW_37); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaPayloadAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMoba.g:2989:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2989:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    // InternalMoba.g:2990:5: {...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalMoba.g:2990:117: ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    // InternalMoba.g:2991:6: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalMoba.g:2994:9: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    // InternalMoba.g:2994:10: {...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:2994:19: (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    // InternalMoba.g:2994:20: otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')'
            	    {
            	    otherlv_12=(Token)match(input,53,FOLLOW_11); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMobaPayloadAttributeAccess().getAliasKeyword_1_5_0());
            	    								
            	    otherlv_13=(Token)match(input,25,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getMobaPayloadAttributeAccess().getLeftParenthesisKeyword_1_5_1());
            	    								
            	    // InternalMoba.g:3002:9: ( (lv_alias_14_0= RULE_ID ) )
            	    // InternalMoba.g:3003:10: (lv_alias_14_0= RULE_ID )
            	    {
            	    // InternalMoba.g:3003:10: (lv_alias_14_0= RULE_ID )
            	    // InternalMoba.g:3004:11: lv_alias_14_0= RULE_ID
            	    {
            	    lv_alias_14_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            	    											newLeafNode(lv_alias_14_0, grammarAccess.getMobaPayloadAttributeAccess().getAliasIDTerminalRuleCall_1_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"alias",
            	    												lv_alias_14_0,
            	    												"org.eclipse.xtext.common.Terminals.ID");
            	    										

            	    }


            	    }

            	    otherlv_15=(Token)match(input,26,FOLLOW_37); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaPayloadAttributeAccess().getRightParenthesisKeyword_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3037:3: ( (otherlv_16= RULE_ID ) )
            // InternalMoba.g:3038:4: (otherlv_16= RULE_ID )
            {
            // InternalMoba.g:3038:4: (otherlv_16= RULE_ID )
            // InternalMoba.g:3039:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_16, grammarAccess.getMobaPayloadAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaPayloadAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_17=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_17;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:3061:3: ( (lv_name_18_0= RULE_ID ) )
            // InternalMoba.g:3062:4: (lv_name_18_0= RULE_ID )
            {
            // InternalMoba.g:3062:4: (lv_name_18_0= RULE_ID )
            // InternalMoba.g:3063:5: lv_name_18_0= RULE_ID
            {
            lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_18_0, grammarAccess.getMobaPayloadAttributeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_18_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:3079:3: (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==34) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMoba.g:3080:4: this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaPayloadAttributeAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_19=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_19;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaPayloadAttribute"


    // $ANTLR start "entryRuleMobaPayloadReference"
    // InternalMoba.g:3096:1: entryRuleMobaPayloadReference returns [EObject current=null] : iv_ruleMobaPayloadReference= ruleMobaPayloadReference EOF ;
    public final EObject entryRuleMobaPayloadReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPayloadReference = null;


        try {
            // InternalMoba.g:3096:61: (iv_ruleMobaPayloadReference= ruleMobaPayloadReference EOF )
            // InternalMoba.g:3097:2: iv_ruleMobaPayloadReference= ruleMobaPayloadReference EOF
            {
             newCompositeNode(grammarAccess.getMobaPayloadReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaPayloadReference=ruleMobaPayloadReference();

            state._fsp--;

             current =iv_ruleMobaPayloadReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaPayloadReference"


    // $ANTLR start "ruleMobaPayloadReference"
    // InternalMoba.g:3103:1: ruleMobaPayloadReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaPayloadReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cascading_2_0=null;
        Token lv_lazy_3_0=null;
        Token lv_transient_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        EObject this_MobaMultiplicityAble_6 = null;

        EObject this_MobaPropertiesAble_8 = null;



        	enterRule();

        try {
            // InternalMoba.g:3109:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3110:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3110:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3111:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPayloadReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:3115:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3116:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3116:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:3117:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3120:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:3121:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:3121:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop54:
            do {
                int alt54=4;
                int LA54_0 = input.LA(1);

                if ( LA54_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt54=1;
                }
                else if ( LA54_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt54=2;
                }
                else if ( LA54_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt54=3;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalMoba.g:3122:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3122:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:3123:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3123:117: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:3124:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3127:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:3127:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "true");
            	    }
            	    // InternalMoba.g:3127:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:3127:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:3127:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:3128:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,52,FOLLOW_36); 

            	    										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaPayloadReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaPayloadReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "cascading", true, "cascading");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:3145:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3145:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3146:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3146:117: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3147:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3150:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:3150:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "true");
            	    }
            	    // InternalMoba.g:3150:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:3150:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3150:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:3151:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,47,FOLLOW_36); 

            	    										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaPayloadReferenceAccess().getLazyLazyKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaPayloadReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:3168:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3168:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3169:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3169:117: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3170:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3173:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:3173:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "true");
            	    }
            	    // InternalMoba.g:3173:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:3173:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:3173:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:3174:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,48,FOLLOW_36); 

            	    										newLeafNode(lv_transient_4_0, grammarAccess.getMobaPayloadReferenceAccess().getTransientTransientKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaPayloadReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3198:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:3199:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:3199:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:3200:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaPayloadReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_5, grammarAccess.getMobaPayloadReferenceAccess().getTypeMobaPayloadCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaPayloadReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaPayloadReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_6;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:3222:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:3223:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:3223:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:3224:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_7_0, grammarAccess.getMobaPayloadReferenceAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaPayloadReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:3240:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==34) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMoba.g:3241:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaPayloadReferenceRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaPayloadReferenceAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_8=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaPayloadReference"


    // $ANTLR start "entryRuleMobaQueueFeature"
    // InternalMoba.g:3257:1: entryRuleMobaQueueFeature returns [EObject current=null] : iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF ;
    public final EObject entryRuleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueFeature = null;


        try {
            // InternalMoba.g:3257:57: (iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF )
            // InternalMoba.g:3258:2: iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaQueueFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaQueueFeature=ruleMobaQueueFeature();

            state._fsp--;

             current =iv_ruleMobaQueueFeature; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaQueueFeature"


    // $ANTLR start "ruleMobaQueueFeature"
    // InternalMoba.g:3264:1: ruleMobaQueueFeature returns [EObject current=null] : this_MobaQueueReference_0= ruleMobaQueueReference ;
    public final EObject ruleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaQueueReference_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3270:2: (this_MobaQueueReference_0= ruleMobaQueueReference )
            // InternalMoba.g:3271:2: this_MobaQueueReference_0= ruleMobaQueueReference
            {

            		newCompositeNode(grammarAccess.getMobaQueueFeatureAccess().getMobaQueueReferenceParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_MobaQueueReference_0=ruleMobaQueueReference();

            state._fsp--;


            		current = this_MobaQueueReference_0;
            		afterParserOrEnumRuleCall();
            	

            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaQueueFeature"


    // $ANTLR start "entryRuleMobaQueueReference"
    // InternalMoba.g:3282:1: entryRuleMobaQueueReference returns [EObject current=null] : iv_ruleMobaQueueReference= ruleMobaQueueReference EOF ;
    public final EObject entryRuleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueReference = null;


        try {
            // InternalMoba.g:3282:59: (iv_ruleMobaQueueReference= ruleMobaQueueReference EOF )
            // InternalMoba.g:3283:2: iv_ruleMobaQueueReference= ruleMobaQueueReference EOF
            {
             newCompositeNode(grammarAccess.getMobaQueueReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaQueueReference=ruleMobaQueueReference();

            state._fsp--;

             current =iv_ruleMobaQueueReference; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaQueueReference"


    // $ANTLR start "ruleMobaQueueReference"
    // InternalMoba.g:3289:1: ruleMobaQueueReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cascading_2_0=null;
        Token lv_lazy_3_0=null;
        Token lv_transient_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        EObject this_MobaMultiplicityAble_6 = null;

        EObject this_MobaPropertiesAble_8 = null;



        	enterRule();

        try {
            // InternalMoba.g:3295:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3296:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3296:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3297:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,51,FOLLOW_36); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:3301:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3302:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3302:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:3303:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3306:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:3307:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:3307:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop56:
            do {
                int alt56=4;
                int LA56_0 = input.LA(1);

                if ( LA56_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt56=2;
                }
                else if ( LA56_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt56=3;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMoba.g:3308:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3308:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:3309:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3309:115: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:3310:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3313:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:3313:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3313:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:3313:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:3313:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:3314:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,52,FOLLOW_36); 

            	    										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaQueueReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "cascading", true, "cascading");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:3331:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3331:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3332:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3332:115: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3333:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3336:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:3336:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3336:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:3336:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3336:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:3337:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,47,FOLLOW_36); 

            	    										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaQueueReferenceAccess().getLazyLazyKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:3354:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3354:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3355:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3355:115: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3356:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3359:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:3359:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3359:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:3359:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:3359:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:3360:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,48,FOLLOW_36); 

            	    										newLeafNode(lv_transient_4_0, grammarAccess.getMobaQueueReferenceAccess().getTransientTransientKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3384:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:3385:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:3385:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:3386:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_35); 

            					newLeafNode(otherlv_5, grammarAccess.getMobaQueueReferenceAccess().getTypeMobaDataCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaQueueReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_6;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:3408:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:3409:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:3409:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:3410:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(lv_name_7_0, grammarAccess.getMobaQueueReferenceAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:3426:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==34) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoba.g:3427:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaQueueReferenceAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_2);
                    this_MobaPropertiesAble_8=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_8;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaQueueReference"


    // $ANTLR start "entryRuleMobaMuliplicity"
    // InternalMoba.g:3443:1: entryRuleMobaMuliplicity returns [EObject current=null] : iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF ;
    public final EObject entryRuleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMuliplicity = null;


        try {
            // InternalMoba.g:3443:56: (iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF )
            // InternalMoba.g:3444:2: iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF
            {
             newCompositeNode(grammarAccess.getMobaMuliplicityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaMuliplicity=ruleMobaMuliplicity();

            state._fsp--;

             current =iv_ruleMobaMuliplicity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaMuliplicity"


    // $ANTLR start "ruleMobaMuliplicity"
    // InternalMoba.g:3450:1: ruleMobaMuliplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lower_1_0 = null;

        Enumerator lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3456:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) )
            // InternalMoba.g:3457:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            {
            // InternalMoba.g:3457:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            // InternalMoba.g:3458:3: otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_38); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoba.g:3462:3: ( (lv_lower_1_0= ruleMobaLowerBound ) )
            // InternalMoba.g:3463:4: (lv_lower_1_0= ruleMobaLowerBound )
            {
            // InternalMoba.g:3463:4: (lv_lower_1_0= ruleMobaLowerBound )
            // InternalMoba.g:3464:5: lv_lower_1_0= ruleMobaLowerBound
            {

            					newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_39);
            lv_lower_1_0=ruleMobaLowerBound();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMobaMuliplicityRule());
            					}
            					set(
            						current,
            						"lower",
            						lv_lower_1_0,
            						"org.mobadsl.grammar.Moba.MobaLowerBound");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMoba.g:3481:3: (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==54) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMoba.g:3482:4: otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    {
                    otherlv_2=(Token)match(input,54,FOLLOW_40); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0());
                    			
                    // InternalMoba.g:3486:4: ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    // InternalMoba.g:3487:5: (lv_upper_3_0= ruleMobaUpperBound )
                    {
                    // InternalMoba.g:3487:5: (lv_upper_3_0= ruleMobaUpperBound )
                    // InternalMoba.g:3488:6: lv_upper_3_0= ruleMobaUpperBound
                    {

                    						newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_41);
                    lv_upper_3_0=ruleMobaUpperBound();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMobaMuliplicityRule());
                    						}
                    						set(
                    							current,
                    							"upper",
                    							lv_upper_3_0,
                    							"org.mobadsl.grammar.Moba.MobaUpperBound");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,35,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMobaMuliplicityAccess().getRightSquareBracketKeyword_3());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaMuliplicity"


    // $ANTLR start "entryRuleMobaConstraint"
    // InternalMoba.g:3514:1: entryRuleMobaConstraint returns [EObject current=null] : iv_ruleMobaConstraint= ruleMobaConstraint EOF ;
    public final EObject entryRuleMobaConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstraint = null;


        try {
            // InternalMoba.g:3514:55: (iv_ruleMobaConstraint= ruleMobaConstraint EOF )
            // InternalMoba.g:3515:2: iv_ruleMobaConstraint= ruleMobaConstraint EOF
            {
             newCompositeNode(grammarAccess.getMobaConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaConstraint=ruleMobaConstraint();

            state._fsp--;

             current =iv_ruleMobaConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaConstraint"


    // $ANTLR start "ruleMobaConstraint"
    // InternalMoba.g:3521:1: ruleMobaConstraint returns [EObject current=null] : (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) ;
    public final EObject ruleMobaConstraint() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRegexpConstraint_0 = null;

        EObject this_MobaMinConstraint_1 = null;

        EObject this_MobaMaxConstraint_2 = null;

        EObject this_MobaMinLengthConstraint_3 = null;

        EObject this_MobaMaxLengthConstraint_4 = null;

        EObject this_MobaDigitsConstraint_5 = null;

        EObject this_MobaNullConstraint_6 = null;

        EObject this_MobaNotNullConstraint_7 = null;



        	enterRule();

        try {
            // InternalMoba.g:3527:2: ( (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) )
            // InternalMoba.g:3528:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            {
            // InternalMoba.g:3528:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            int alt59=8;
            switch ( input.LA(1) ) {
            case 55:
                {
                alt59=1;
                }
                break;
            case 56:
                {
                alt59=2;
                }
                break;
            case 57:
                {
                alt59=3;
                }
                break;
            case 58:
                {
                alt59=4;
                }
                break;
            case 59:
                {
                alt59=5;
                }
                break;
            case 60:
                {
                alt59=6;
                }
                break;
            case 61:
                {
                alt59=7;
                }
                break;
            case 62:
                {
                alt59=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // InternalMoba.g:3529:3: this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint
                    {

                    			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaRegexpConstraintParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaRegexpConstraint_0=ruleMobaRegexpConstraint();

                    state._fsp--;


                    			current = this_MobaRegexpConstraint_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:3538:3: this_MobaMinConstraint_1= ruleMobaMinConstraint
                    {

                    			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaMinConstraintParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaMinConstraint_1=ruleMobaMinConstraint();

                    state._fsp--;


                    			current = this_MobaMinConstraint_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoba.g:3547:3: this_MobaMaxConstraint_2= ruleMobaMaxConstraint
                    {

                    			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaMaxConstraintParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaMaxConstraint_2=ruleMobaMaxConstraint();

                    state._fsp--;


                    			current = this_MobaMaxConstraint_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMoba.g:3556:3: this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint
                    {

                    			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaMinLengthConstraintParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaMinLengthConstraint_3=ruleMobaMinLengthConstraint();

                    state._fsp--;


                    			current = this_MobaMinLengthConstraint_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMoba.g:3565:3: this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint
                    {

                    			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaMaxLengthConstraintParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaMaxLengthConstraint_4=ruleMobaMaxLengthConstraint();

                    state._fsp--;


                    			current = this_MobaMaxLengthConstraint_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMoba.g:3574:3: this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint
                    {

                    			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaDigitsConstraintParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaDigitsConstraint_5=ruleMobaDigitsConstraint();

                    state._fsp--;


                    			current = this_MobaDigitsConstraint_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMoba.g:3583:3: this_MobaNullConstraint_6= ruleMobaNullConstraint
                    {

                    			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaNullConstraintParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaNullConstraint_6=ruleMobaNullConstraint();

                    state._fsp--;


                    			current = this_MobaNullConstraint_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMoba.g:3592:3: this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint
                    {

                    			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaNotNullConstraintParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaNotNullConstraint_7=ruleMobaNotNullConstraint();

                    state._fsp--;


                    			current = this_MobaNotNullConstraint_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaConstraint"


    // $ANTLR start "entryRuleMobaRegexpConstraint"
    // InternalMoba.g:3604:1: entryRuleMobaRegexpConstraint returns [EObject current=null] : iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF ;
    public final EObject entryRuleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRegexpConstraint = null;


        try {
            // InternalMoba.g:3604:61: (iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF )
            // InternalMoba.g:3605:2: iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF
            {
             newCompositeNode(grammarAccess.getMobaRegexpConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaRegexpConstraint=ruleMobaRegexpConstraint();

            state._fsp--;

             current =iv_ruleMobaRegexpConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaRegexpConstraint"


    // $ANTLR start "ruleMobaRegexpConstraint"
    // InternalMoba.g:3611:1: ruleMobaRegexpConstraint returns [EObject current=null] : (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3617:2: ( (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3618:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3618:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3619:3: otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,55,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRegexpConstraintAccess().getRegexpKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_6); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaRegexpConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3627:3: ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_STRING) ) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_ID) ) {
                alt60=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalMoba.g:3628:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:3628:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    // InternalMoba.g:3629:5: (lv_filterString_2_0= RULE_STRING )
                    {
                    // InternalMoba.g:3629:5: (lv_filterString_2_0= RULE_STRING )
                    // InternalMoba.g:3630:6: lv_filterString_2_0= RULE_STRING
                    {
                    lv_filterString_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_filterString_2_0, grammarAccess.getMobaRegexpConstraintAccess().getFilterStringSTRINGTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRegexpConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterString",
                    							lv_filterString_2_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3647:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3647:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3648:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3648:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3649:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaRegexpConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaRegexpConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaRegexpConstraint"


    // $ANTLR start "entryRuleMobaMinConstraint"
    // InternalMoba.g:3665:1: entryRuleMobaMinConstraint returns [EObject current=null] : iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF ;
    public final EObject entryRuleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinConstraint = null;


        try {
            // InternalMoba.g:3665:58: (iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF )
            // InternalMoba.g:3666:2: iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF
            {
             newCompositeNode(grammarAccess.getMobaMinConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaMinConstraint=ruleMobaMinConstraint();

            state._fsp--;

             current =iv_ruleMobaMinConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaMinConstraint"


    // $ANTLR start "ruleMobaMinConstraint"
    // InternalMoba.g:3672:1: ruleMobaMinConstraint returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3678:2: ( (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3679:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3679:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3680:3: otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinConstraintAccess().getMinKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3688:3: ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==RULE_FLOAT) ) {
                alt61=1;
            }
            else if ( (LA61_0==RULE_ID) ) {
                alt61=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }
            switch (alt61) {
                case 1 :
                    // InternalMoba.g:3689:4: ( (lv_filterValue_2_0= RULE_FLOAT ) )
                    {
                    // InternalMoba.g:3689:4: ( (lv_filterValue_2_0= RULE_FLOAT ) )
                    // InternalMoba.g:3690:5: (lv_filterValue_2_0= RULE_FLOAT )
                    {
                    // InternalMoba.g:3690:5: (lv_filterValue_2_0= RULE_FLOAT )
                    // InternalMoba.g:3691:6: lv_filterValue_2_0= RULE_FLOAT
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMinConstraintAccess().getFilterValueFLOATTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMinConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterValue",
                    							lv_filterValue_2_0,
                    							"org.mobadsl.grammar.Moba.FLOAT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3708:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3708:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3709:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3709:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3710:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMinConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaMinConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaMinConstraint"


    // $ANTLR start "entryRuleMobaMaxConstraint"
    // InternalMoba.g:3726:1: entryRuleMobaMaxConstraint returns [EObject current=null] : iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF ;
    public final EObject entryRuleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxConstraint = null;


        try {
            // InternalMoba.g:3726:58: (iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF )
            // InternalMoba.g:3727:2: iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF
            {
             newCompositeNode(grammarAccess.getMobaMaxConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaMaxConstraint=ruleMobaMaxConstraint();

            state._fsp--;

             current =iv_ruleMobaMaxConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaMaxConstraint"


    // $ANTLR start "ruleMobaMaxConstraint"
    // InternalMoba.g:3733:1: ruleMobaMaxConstraint returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3739:2: ( (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3740:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3740:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3741:3: otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxConstraintAccess().getMaxKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_42); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3749:3: ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==RULE_FLOAT) ) {
                alt62=1;
            }
            else if ( (LA62_0==RULE_ID) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // InternalMoba.g:3750:4: ( (lv_filterValue_2_0= RULE_FLOAT ) )
                    {
                    // InternalMoba.g:3750:4: ( (lv_filterValue_2_0= RULE_FLOAT ) )
                    // InternalMoba.g:3751:5: (lv_filterValue_2_0= RULE_FLOAT )
                    {
                    // InternalMoba.g:3751:5: (lv_filterValue_2_0= RULE_FLOAT )
                    // InternalMoba.g:3752:6: lv_filterValue_2_0= RULE_FLOAT
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_FLOAT,FOLLOW_2); 

                    						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMaxConstraintAccess().getFilterValueFLOATTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMaxConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterValue",
                    							lv_filterValue_2_0,
                    							"org.mobadsl.grammar.Moba.FLOAT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3769:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3769:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3770:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3770:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3771:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMaxConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaMaxConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaMaxConstraint"


    // $ANTLR start "entryRuleMobaMinLengthConstraint"
    // InternalMoba.g:3787:1: entryRuleMobaMinLengthConstraint returns [EObject current=null] : iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF ;
    public final EObject entryRuleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinLengthConstraint = null;


        try {
            // InternalMoba.g:3787:64: (iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF )
            // InternalMoba.g:3788:2: iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF
            {
             newCompositeNode(grammarAccess.getMobaMinLengthConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaMinLengthConstraint=ruleMobaMinLengthConstraint();

            state._fsp--;

             current =iv_ruleMobaMinLengthConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaMinLengthConstraint"


    // $ANTLR start "ruleMobaMinLengthConstraint"
    // InternalMoba.g:3794:1: ruleMobaMinLengthConstraint returns [EObject current=null] : (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3800:2: ( (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3801:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3801:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3802:3: otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinLengthConstraintAccess().getMinLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3810:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_INT) ) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_ID) ) {
                alt63=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalMoba.g:3811:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:3811:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:3812:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:3812:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:3813:6: lv_filterValue_2_0= RULE_INT
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMinLengthConstraintAccess().getFilterValueINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMinLengthConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterValue",
                    							lv_filterValue_2_0,
                    							"org.mobadsl.grammar.Moba.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3830:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3830:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3831:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3831:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3832:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMinLengthConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaMinLengthConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaMinLengthConstraint"


    // $ANTLR start "entryRuleMobaMaxLengthConstraint"
    // InternalMoba.g:3848:1: entryRuleMobaMaxLengthConstraint returns [EObject current=null] : iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF ;
    public final EObject entryRuleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxLengthConstraint = null;


        try {
            // InternalMoba.g:3848:64: (iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF )
            // InternalMoba.g:3849:2: iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF
            {
             newCompositeNode(grammarAccess.getMobaMaxLengthConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaMaxLengthConstraint=ruleMobaMaxLengthConstraint();

            state._fsp--;

             current =iv_ruleMobaMaxLengthConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaMaxLengthConstraint"


    // $ANTLR start "ruleMobaMaxLengthConstraint"
    // InternalMoba.g:3855:1: ruleMobaMaxLengthConstraint returns [EObject current=null] : (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3861:2: ( (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3862:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3862:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3863:3: otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxLengthConstraintAccess().getMaxLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,31,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3871:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_INT) ) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_ID) ) {
                alt64=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalMoba.g:3872:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:3872:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:3873:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:3873:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:3874:6: lv_filterValue_2_0= RULE_INT
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMaxLengthConstraintAccess().getFilterValueINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMaxLengthConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterValue",
                    							lv_filterValue_2_0,
                    							"org.mobadsl.grammar.Moba.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3891:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3891:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3892:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3892:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3893:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMaxLengthConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaMaxLengthConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaMaxLengthConstraint"


    // $ANTLR start "entryRuleMobaDigitsConstraint"
    // InternalMoba.g:3909:1: entryRuleMobaDigitsConstraint returns [EObject current=null] : iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF ;
    public final EObject entryRuleMobaDigitsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDigitsConstraint = null;


        try {
            // InternalMoba.g:3909:61: (iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF )
            // InternalMoba.g:3910:2: iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF
            {
             newCompositeNode(grammarAccess.getMobaDigitsConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaDigitsConstraint=ruleMobaDigitsConstraint();

            state._fsp--;

             current =iv_ruleMobaDigitsConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaDigitsConstraint"


    // $ANTLR start "ruleMobaDigitsConstraint"
    // InternalMoba.g:3916:1: ruleMobaDigitsConstraint returns [EObject current=null] : (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ) ;
    public final EObject ruleMobaDigitsConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterIntegerValue_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_filterFractionValue_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMoba.g:3922:2: ( (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ) )
            // InternalMoba.g:3923:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:3923:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' )
            // InternalMoba.g:3924:3: otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,60,FOLLOW_11); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDigitsConstraintAccess().getDigitsKeyword_0());
            		
            otherlv_1=(Token)match(input,25,FOLLOW_43); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaDigitsConstraintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoba.g:3932:3: ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_INT) ) {
                alt65=1;
            }
            else if ( (LA65_0==RULE_ID) ) {
                alt65=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }
            switch (alt65) {
                case 1 :
                    // InternalMoba.g:3933:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:3933:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    // InternalMoba.g:3934:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:3934:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    // InternalMoba.g:3935:6: lv_filterIntegerValue_2_0= RULE_INT
                    {
                    lv_filterIntegerValue_2_0=(Token)match(input,RULE_INT,FOLLOW_18); 

                    						newLeafNode(lv_filterIntegerValue_2_0, grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerValueINTTerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterIntegerValue",
                    							lv_filterIntegerValue_2_0,
                    							"org.mobadsl.grammar.Moba.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3952:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3952:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3953:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3953:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3954:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_18); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_43); 

            			newLeafNode(otherlv_4, grammarAccess.getMobaDigitsConstraintAccess().getCommaKeyword_3());
            		
            // InternalMoba.g:3970:3: ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_INT) ) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_ID) ) {
                alt66=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalMoba.g:3971:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    {
                    // InternalMoba.g:3971:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    // InternalMoba.g:3972:5: (lv_filterFractionValue_5_0= RULE_INT )
                    {
                    // InternalMoba.g:3972:5: (lv_filterFractionValue_5_0= RULE_INT )
                    // InternalMoba.g:3973:6: lv_filterFractionValue_5_0= RULE_INT
                    {
                    lv_filterFractionValue_5_0=(Token)match(input,RULE_INT,FOLLOW_10); 

                    						newLeafNode(lv_filterFractionValue_5_0, grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionValueINTTerminalRuleCall_4_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterFractionValue",
                    							lv_filterFractionValue_5_0,
                    							"org.mobadsl.grammar.Moba.INT");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3990:4: ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMoba.g:3990:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMoba.g:3991:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMoba.g:3991:5: (otherlv_6= RULE_ID )
                    // InternalMoba.g:3992:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); 

                    						newLeafNode(otherlv_6, grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionConstMobaConstantCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,26,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaDigitsConstraintAccess().getRightParenthesisKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaDigitsConstraint"


    // $ANTLR start "entryRuleMobaNullConstraint"
    // InternalMoba.g:4012:1: entryRuleMobaNullConstraint returns [EObject current=null] : iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF ;
    public final EObject entryRuleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNullConstraint = null;


        try {
            // InternalMoba.g:4012:59: (iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF )
            // InternalMoba.g:4013:2: iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF
            {
             newCompositeNode(grammarAccess.getMobaNullConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaNullConstraint=ruleMobaNullConstraint();

            state._fsp--;

             current =iv_ruleMobaNullConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaNullConstraint"


    // $ANTLR start "ruleMobaNullConstraint"
    // InternalMoba.g:4019:1: ruleMobaNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNull' ) ;
    public final EObject ruleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4025:2: ( ( () otherlv_1= 'isNull' ) )
            // InternalMoba.g:4026:2: ( () otherlv_1= 'isNull' )
            {
            // InternalMoba.g:4026:2: ( () otherlv_1= 'isNull' )
            // InternalMoba.g:4027:3: () otherlv_1= 'isNull'
            {
            // InternalMoba.g:4027:3: ()
            // InternalMoba.g:4028:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNullConstraintAccess().getMobaNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,61,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaNullConstraintAccess().getIsNullKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaNullConstraint"


    // $ANTLR start "entryRuleMobaNotNullConstraint"
    // InternalMoba.g:4042:1: entryRuleMobaNotNullConstraint returns [EObject current=null] : iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF ;
    public final EObject entryRuleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNotNullConstraint = null;


        try {
            // InternalMoba.g:4042:62: (iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF )
            // InternalMoba.g:4043:2: iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF
            {
             newCompositeNode(grammarAccess.getMobaNotNullConstraintRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaNotNullConstraint=ruleMobaNotNullConstraint();

            state._fsp--;

             current =iv_ruleMobaNotNullConstraint; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMobaNotNullConstraint"


    // $ANTLR start "ruleMobaNotNullConstraint"
    // InternalMoba.g:4049:1: ruleMobaNotNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNotNull' ) ;
    public final EObject ruleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4055:2: ( ( () otherlv_1= 'isNotNull' ) )
            // InternalMoba.g:4056:2: ( () otherlv_1= 'isNotNull' )
            {
            // InternalMoba.g:4056:2: ( () otherlv_1= 'isNotNull' )
            // InternalMoba.g:4057:3: () otherlv_1= 'isNotNull'
            {
            // InternalMoba.g:4057:3: ()
            // InternalMoba.g:4058:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNotNullConstraintAccess().getMobaNotNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,62,FOLLOW_2); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaNotNullConstraintAccess().getIsNotNullKeyword_1());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaNotNullConstraint"


    // $ANTLR start "ruleMobaLowerBound"
    // InternalMoba.g:4072:1: ruleMobaLowerBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) ;
    public final Enumerator ruleMobaLowerBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMoba.g:4078:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) )
            // InternalMoba.g:4079:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            {
            // InternalMoba.g:4079:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            int alt67=5;
            switch ( input.LA(1) ) {
            case 63:
                {
                alt67=1;
                }
                break;
            case 64:
                {
                alt67=2;
                }
                break;
            case 65:
                {
                alt67=3;
                }
                break;
            case 33:
                {
                alt67=4;
                }
                break;
            case 66:
                {
                alt67=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }

            switch (alt67) {
                case 1 :
                    // InternalMoba.g:4080:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:4080:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:4081:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4088:3: (enumLiteral_1= '0' )
                    {
                    // InternalMoba.g:4088:3: (enumLiteral_1= '0' )
                    // InternalMoba.g:4089:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,64,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:4096:3: (enumLiteral_2= '?' )
                    {
                    // InternalMoba.g:4096:3: (enumLiteral_2= '?' )
                    // InternalMoba.g:4097:4: enumLiteral_2= '?'
                    {
                    enumLiteral_2=(Token)match(input,65,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:4104:3: (enumLiteral_3= '+' )
                    {
                    // InternalMoba.g:4104:3: (enumLiteral_3= '+' )
                    // InternalMoba.g:4105:4: enumLiteral_3= '+'
                    {
                    enumLiteral_3=(Token)match(input,33,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:4112:3: (enumLiteral_4= '1' )
                    {
                    // InternalMoba.g:4112:3: (enumLiteral_4= '1' )
                    // InternalMoba.g:4113:4: enumLiteral_4= '1'
                    {
                    enumLiteral_4=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_4, grammarAccess.getMobaLowerBoundAccess().getONEEnumLiteralDeclaration_4());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaLowerBound"


    // $ANTLR start "ruleMobaUpperBound"
    // InternalMoba.g:4123:1: ruleMobaUpperBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) ;
    public final Enumerator ruleMobaUpperBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4129:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) )
            // InternalMoba.g:4130:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            {
            // InternalMoba.g:4130:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==63) ) {
                alt68=1;
            }
            else if ( (LA68_0==66) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalMoba.g:4131:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:4131:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:4132:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,63,FOLLOW_2); 

                    				current = grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4139:3: (enumLiteral_1= '1' )
                    {
                    // InternalMoba.g:4139:3: (enumLiteral_1= '1' )
                    // InternalMoba.g:4140:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMobaUpperBoundAccess().getONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaUpperBoundAccess().getONEEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMobaUpperBound"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x00003D1100078000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000429F80002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000429F00002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000000042BF00002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x7F80000000000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000014000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010008000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000810000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000400084000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000400004000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000400000008000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x000000C004000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000002400084000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0008420000008000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0008400000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0008000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0007800008000010L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000010L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0011800000000010L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0027800008000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x8000000200000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0040000800000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000050L});

}
