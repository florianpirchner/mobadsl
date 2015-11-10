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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_FLOAT", "SUPER_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'{'", "'}'", "'use template'", "'active'", "'generator'", "'id'", "'='", "'mixin'", "'datatype'", "'extends'", "'isPrimitive'", "'isArray'", "'isDate'", "'isTime'", "'isTimestamp'", "'('", "')'", "'constraints'", "','", "'enum'", "'lit'", "'const'", "'+'", "'['", "']'", "'settings'", "'cache'", "'type'", "'strategy'", "'bean'", "'index'", "'payload'", "'queue'", "'rest'", "'restCrud'", "'var'", "'lazy'", "'transient'", "'domainKey'", "'domainDescription'", "'ref'", "'cascading'", "'alias'", "'..'", "'regexp'", "'min'", "'max'", "'minLength'", "'maxLength'", "'digits'", "'isNull'", "'isNotNull'", "'*'", "'0'", "'?'", "'1'"
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
    public static final int T__67=67;
    public static final int T__24=24;
    public static final int T__68=68;
    public static final int T__25=25;
    public static final int T__69=69;
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

                if ( ((LA1_0>=16 && LA1_0<=18)||LA1_0==22||LA1_0==35||LA1_0==39||LA1_0==43||(LA1_0>=45 && LA1_0<=48)) ) {
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
            case 22:
                {
                alt2=1;
                }
                break;
            case 16:
                {
                alt2=2;
                }
                break;
            case 35:
                {
                alt2=3;
                }
                break;
            case 17:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==18) ) {
                    alt2=7;
                }
                else if ( (LA2_4==39) ) {
                    alt2=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                alt2=4;
                }
                break;
            case 43:
            case 45:
            case 46:
                {
                alt2=5;
                }
                break;
            case 47:
            case 48:
                {
                alt2=6;
                }
                break;
            case 18:
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
    // InternalMoba.g:257:1: ruleMobaGenerator returns [EObject current=null] : ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) ;
    public final EObject ruleMobaGenerator() throws RecognitionException {
        EObject current = null;

        Token lv_active_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_features_4_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:263:2: ( ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) )
            // InternalMoba.g:264:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            {
            // InternalMoba.g:264:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            // InternalMoba.g:265:3: ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}'
            {
            // InternalMoba.g:265:3: ( (lv_active_0_0= 'active' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMoba.g:266:4: (lv_active_0_0= 'active' )
                    {
                    // InternalMoba.g:266:4: (lv_active_0_0= 'active' )
                    // InternalMoba.g:267:5: lv_active_0_0= 'active'
                    {
                    lv_active_0_0=(Token)match(input,17,FOLLOW_6); 

                    					newLeafNode(lv_active_0_0, grammarAccess.getMobaGeneratorAccess().getActiveActiveKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaGeneratorRule());
                    					}
                    					setWithLastConsumed(current, "active", true, "active");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaGeneratorAccess().getGeneratorKeyword_1());
            		
            // InternalMoba.g:283:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:284:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:284:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:285:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMobaGeneratorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaGeneratorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMoba.g:305:3: ( (lv_features_4_0= ruleMobaGeneratorFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==19||LA4_0==21) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMoba.g:306:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    {
            	    // InternalMoba.g:306:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    // InternalMoba.g:307:5: lv_features_4_0= ruleMobaGeneratorFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaGeneratorAccess().getFeaturesMobaGeneratorFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_7);
            	    lv_features_4_0=ruleMobaGeneratorFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaGeneratorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_4_0,
            	    						"org.mobadsl.grammar.Moba.MobaGeneratorFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaGeneratorAccess().getRightCurlyBracketKeyword_5());
            		

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


    // $ANTLR start "entryRuleMobaGeneratorFeature"
    // InternalMoba.g:332:1: entryRuleMobaGeneratorFeature returns [EObject current=null] : iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF ;
    public final EObject entryRuleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorFeature = null;


        try {
            // InternalMoba.g:332:61: (iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF )
            // InternalMoba.g:333:2: iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaGeneratorFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeneratorFeature=ruleMobaGeneratorFeature();

            state._fsp--;

             current =iv_ruleMobaGeneratorFeature; 
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
    // $ANTLR end "entryRuleMobaGeneratorFeature"


    // $ANTLR start "ruleMobaGeneratorFeature"
    // InternalMoba.g:339:1: ruleMobaGeneratorFeature returns [EObject current=null] : (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) ;
    public final EObject ruleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaGeneratorIDFeature_0 = null;

        EObject this_MobaGeneratorMixinFeature_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:345:2: ( (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) )
            // InternalMoba.g:346:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            {
            // InternalMoba.g:346:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            else if ( (LA5_0==21) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalMoba.g:347:3: this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature
                    {

                    			newCompositeNode(grammarAccess.getMobaGeneratorFeatureAccess().getMobaGeneratorIDFeatureParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaGeneratorIDFeature_0=ruleMobaGeneratorIDFeature();

                    state._fsp--;


                    			current = this_MobaGeneratorIDFeature_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:356:3: this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature
                    {

                    			newCompositeNode(grammarAccess.getMobaGeneratorFeatureAccess().getMobaGeneratorMixinFeatureParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaGeneratorMixinFeature_1=ruleMobaGeneratorMixinFeature();

                    state._fsp--;


                    			current = this_MobaGeneratorMixinFeature_1;
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
    // $ANTLR end "ruleMobaGeneratorFeature"


    // $ANTLR start "entryRuleMobaGeneratorIDFeature"
    // InternalMoba.g:368:1: entryRuleMobaGeneratorIDFeature returns [EObject current=null] : iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF ;
    public final EObject entryRuleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorIDFeature = null;


        try {
            // InternalMoba.g:368:63: (iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF )
            // InternalMoba.g:369:2: iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaGeneratorIDFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeneratorIDFeature=ruleMobaGeneratorIDFeature();

            state._fsp--;

             current =iv_ruleMobaGeneratorIDFeature; 
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
    // $ANTLR end "entryRuleMobaGeneratorIDFeature"


    // $ANTLR start "ruleMobaGeneratorIDFeature"
    // InternalMoba.g:375:1: ruleMobaGeneratorIDFeature returns [EObject current=null] : (otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_generatorString_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:381:2: ( (otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) ) ) )
            // InternalMoba.g:382:2: (otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) ) )
            {
            // InternalMoba.g:382:2: (otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) ) )
            // InternalMoba.g:383:3: otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getIdKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaGeneratorIDFeatureAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:391:3: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_STRING) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMoba.g:392:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalMoba.g:392:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMoba.g:393:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMoba.g:393:5: (otherlv_2= RULE_ID )
                    // InternalMoba.g:394:6: otherlv_2= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaGeneratorIDFeatureRule());
                    						}
                    					
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_2, grammarAccess.getMobaGeneratorIDFeatureAccess().getGeneratorConstMobaConstantCrossReference_2_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:406:4: ( (lv_generatorString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:406:4: ( (lv_generatorString_3_0= RULE_STRING ) )
                    // InternalMoba.g:407:5: (lv_generatorString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:407:5: (lv_generatorString_3_0= RULE_STRING )
                    // InternalMoba.g:408:6: lv_generatorString_3_0= RULE_STRING
                    {
                    lv_generatorString_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    						newLeafNode(lv_generatorString_3_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getGeneratorStringSTRINGTerminalRuleCall_2_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaGeneratorIDFeatureRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"generatorString",
                    							lv_generatorString_3_0,
                    							"org.eclipse.xtext.common.Terminals.STRING");
                    					

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
    // $ANTLR end "ruleMobaGeneratorIDFeature"


    // $ANTLR start "entryRuleMobaGeneratorMixinFeature"
    // InternalMoba.g:429:1: entryRuleMobaGeneratorMixinFeature returns [EObject current=null] : iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF ;
    public final EObject entryRuleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorMixinFeature = null;


        try {
            // InternalMoba.g:429:66: (iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF )
            // InternalMoba.g:430:2: iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaGeneratorMixinFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeneratorMixinFeature=ruleMobaGeneratorMixinFeature();

            state._fsp--;

             current =iv_ruleMobaGeneratorMixinFeature; 
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
    // $ANTLR end "entryRuleMobaGeneratorMixinFeature"


    // $ANTLR start "ruleMobaGeneratorMixinFeature"
    // InternalMoba.g:436:1: ruleMobaGeneratorMixinFeature returns [EObject current=null] : (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:442:2: ( (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMoba.g:443:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMoba.g:443:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            // InternalMoba.g:444:3: otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorMixinFeatureAccess().getMixinKeyword_0());
            		
            // InternalMoba.g:448:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:449:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:449:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:450:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaGeneratorMixinFeatureRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getMobaGeneratorMixinFeatureAccess().getGeneratorRefMobaGeneratorCrossReference_1_0());
            				

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
    // $ANTLR end "ruleMobaGeneratorMixinFeature"


    // $ANTLR start "entryRuleMobaDataType"
    // InternalMoba.g:465:1: entryRuleMobaDataType returns [EObject current=null] : iv_ruleMobaDataType= ruleMobaDataType EOF ;
    public final EObject entryRuleMobaDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDataType = null;


        try {
            // InternalMoba.g:465:53: (iv_ruleMobaDataType= ruleMobaDataType EOF )
            // InternalMoba.g:466:2: iv_ruleMobaDataType= ruleMobaDataType EOF
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
    // InternalMoba.g:472:1: ruleMobaDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_primitive_5_0=null;
        Token lv_array_6_0=null;
        Token lv_date_7_0=null;
        Token lv_time_8_0=null;
        Token lv_timestamp_9_0=null;
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
            // InternalMoba.g:478:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:479:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:479:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:480:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalMoba.g:484:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:485:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:485:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:486:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

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

            // InternalMoba.g:502:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMoba.g:503:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaDataTypeAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:507:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:508:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:508:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:509:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDataTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDataTypeAccess().getSuperTypeMobaDataTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:521:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) )
            // InternalMoba.g:522:4: ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:522:4: ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) )
            // InternalMoba.g:523:5: ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            				
            // InternalMoba.g:526:5: ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* )
            // InternalMoba.g:527:6: ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )*
            {
            // InternalMoba.g:527:6: ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )*
            loop12:
            do {
                int alt12=6;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 >= 26 && LA12_0 <= 28 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3) ) {
                    alt12=4;
                }
                else if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4) ) {
                    alt12=5;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMoba.g:528:4: ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) )
            	    {
            	    // InternalMoba.g:528:4: ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) )
            	    // InternalMoba.g:529:5: {...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoba.g:529:109: ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) )
            	    // InternalMoba.g:530:6: ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMoba.g:533:9: ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) )
            	    // InternalMoba.g:533:10: {...}? => ( (lv_primitive_5_0= 'isPrimitive' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:533:19: ( (lv_primitive_5_0= 'isPrimitive' ) )
            	    // InternalMoba.g:533:20: (lv_primitive_5_0= 'isPrimitive' )
            	    {
            	    // InternalMoba.g:533:20: (lv_primitive_5_0= 'isPrimitive' )
            	    // InternalMoba.g:534:10: lv_primitive_5_0= 'isPrimitive'
            	    {
            	    lv_primitive_5_0=(Token)match(input,24,FOLLOW_11); 

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
            	    // InternalMoba.g:551:4: ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:551:4: ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:552:5: {...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoba.g:552:109: ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:553:6: ({...}? => ( (lv_array_6_0= 'isArray' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMoba.g:556:9: ({...}? => ( (lv_array_6_0= 'isArray' ) ) )
            	    // InternalMoba.g:556:10: {...}? => ( (lv_array_6_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:556:19: ( (lv_array_6_0= 'isArray' ) )
            	    // InternalMoba.g:556:20: (lv_array_6_0= 'isArray' )
            	    {
            	    // InternalMoba.g:556:20: (lv_array_6_0= 'isArray' )
            	    // InternalMoba.g:557:10: lv_array_6_0= 'isArray'
            	    {
            	    lv_array_6_0=(Token)match(input,25,FOLLOW_11); 

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
            	    // InternalMoba.g:574:4: ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) )
            	    {
            	    // InternalMoba.g:574:4: ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) )
            	    // InternalMoba.g:575:5: {...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoba.g:575:109: ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) )
            	    // InternalMoba.g:576:6: ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMoba.g:579:9: ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) )
            	    // InternalMoba.g:579:10: {...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:579:19: ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? )
            	    // InternalMoba.g:579:20: ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )?
            	    {
            	    // InternalMoba.g:579:20: ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) )
            	    int alt8=3;
            	    switch ( input.LA(1) ) {
            	    case 26:
            	        {
            	        alt8=1;
            	        }
            	        break;
            	    case 27:
            	        {
            	        alt8=2;
            	        }
            	        break;
            	    case 28:
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
            	            // InternalMoba.g:580:10: ( (lv_date_7_0= 'isDate' ) )
            	            {
            	            // InternalMoba.g:580:10: ( (lv_date_7_0= 'isDate' ) )
            	            // InternalMoba.g:581:11: (lv_date_7_0= 'isDate' )
            	            {
            	            // InternalMoba.g:581:11: (lv_date_7_0= 'isDate' )
            	            // InternalMoba.g:582:12: lv_date_7_0= 'isDate'
            	            {
            	            lv_date_7_0=(Token)match(input,26,FOLLOW_12); 

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
            	            // InternalMoba.g:595:10: ( (lv_time_8_0= 'isTime' ) )
            	            {
            	            // InternalMoba.g:595:10: ( (lv_time_8_0= 'isTime' ) )
            	            // InternalMoba.g:596:11: (lv_time_8_0= 'isTime' )
            	            {
            	            // InternalMoba.g:596:11: (lv_time_8_0= 'isTime' )
            	            // InternalMoba.g:597:12: lv_time_8_0= 'isTime'
            	            {
            	            lv_time_8_0=(Token)match(input,27,FOLLOW_12); 

            	            												newLeafNode(lv_time_8_0, grammarAccess.getMobaDataTypeAccess().getTimeIsTimeKeyword_3_2_0_1_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            												}
            	            												setWithLastConsumed(current, "time", true, "isTime");
            	            											

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMoba.g:610:10: ( (lv_timestamp_9_0= 'isTimestamp' ) )
            	            {
            	            // InternalMoba.g:610:10: ( (lv_timestamp_9_0= 'isTimestamp' ) )
            	            // InternalMoba.g:611:11: (lv_timestamp_9_0= 'isTimestamp' )
            	            {
            	            // InternalMoba.g:611:11: (lv_timestamp_9_0= 'isTimestamp' )
            	            // InternalMoba.g:612:12: lv_timestamp_9_0= 'isTimestamp'
            	            {
            	            lv_timestamp_9_0=(Token)match(input,28,FOLLOW_12); 

            	            												newLeafNode(lv_timestamp_9_0, grammarAccess.getMobaDataTypeAccess().getTimestampIsTimestampKeyword_3_2_0_2_0());
            	            											

            	            												if (current==null) {
            	            													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	            												}
            	            												setWithLastConsumed(current, "timestamp", true, "isTimestamp");
            	            											

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    // InternalMoba.g:625:9: (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==29) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalMoba.g:626:10: otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')'
            	            {
            	            otherlv_10=(Token)match(input,29,FOLLOW_9); 

            	            										newLeafNode(otherlv_10, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_2_1_0());
            	            									
            	            // InternalMoba.g:630:10: ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) )
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
            	                    // InternalMoba.g:631:11: ( (lv_dateFormatString_11_0= RULE_STRING ) )
            	                    {
            	                    // InternalMoba.g:631:11: ( (lv_dateFormatString_11_0= RULE_STRING ) )
            	                    // InternalMoba.g:632:12: (lv_dateFormatString_11_0= RULE_STRING )
            	                    {
            	                    // InternalMoba.g:632:12: (lv_dateFormatString_11_0= RULE_STRING )
            	                    // InternalMoba.g:633:13: lv_dateFormatString_11_0= RULE_STRING
            	                    {
            	                    lv_dateFormatString_11_0=(Token)match(input,RULE_STRING,FOLLOW_13); 

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
            	                    // InternalMoba.g:650:11: ( (otherlv_12= RULE_ID ) )
            	                    {
            	                    // InternalMoba.g:650:11: ( (otherlv_12= RULE_ID ) )
            	                    // InternalMoba.g:651:12: (otherlv_12= RULE_ID )
            	                    {
            	                    // InternalMoba.g:651:12: (otherlv_12= RULE_ID )
            	                    // InternalMoba.g:652:13: otherlv_12= RULE_ID
            	                    {

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    													}
            	                    												
            	                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_13); 

            	                    													newLeafNode(otherlv_12, grammarAccess.getMobaDataTypeAccess().getDateFormatConstMobaConstantCrossReference_3_2_1_1_1_0());
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,30,FOLLOW_11); 

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
            	    // InternalMoba.g:675:4: ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:675:4: ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) )
            	    // InternalMoba.g:676:5: {...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMoba.g:676:109: ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) )
            	    // InternalMoba.g:677:6: ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMoba.g:680:9: ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) )
            	    // InternalMoba.g:680:10: {...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:680:19: (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' )
            	    // InternalMoba.g:680:20: otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')'
            	    {
            	    otherlv_14=(Token)match(input,31,FOLLOW_14); 

            	    									newLeafNode(otherlv_14, grammarAccess.getMobaDataTypeAccess().getConstraintsKeyword_3_3_0());
            	    								
            	    otherlv_15=(Token)match(input,29,FOLLOW_15); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_3_1());
            	    								
            	    // InternalMoba.g:688:9: ( (lv_constraints_16_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:689:10: (lv_constraints_16_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:689:10: (lv_constraints_16_0= ruleMobaConstraint )
            	    // InternalMoba.g:690:11: lv_constraints_16_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
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

            	    // InternalMoba.g:707:9: (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==32) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalMoba.g:708:10: otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,32,FOLLOW_15); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getMobaDataTypeAccess().getCommaKeyword_3_3_3_0());
            	    	    									
            	    	    // InternalMoba.g:712:10: ( (lv_constraints_18_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:713:11: (lv_constraints_18_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:713:11: (lv_constraints_18_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:714:12: lv_constraints_18_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_16);
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
            	    	    break loop11;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,30,FOLLOW_11); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_3_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:742:4: ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) )
            	    {
            	    // InternalMoba.g:742:4: ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) )
            	    // InternalMoba.g:743:5: {...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMoba.g:743:109: ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) )
            	    // InternalMoba.g:744:6: ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMoba.g:747:9: ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) )
            	    // InternalMoba.g:747:10: {...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:747:19: ( (lv_enumAST_20_0= ruleMobaEnum ) )
            	    // InternalMoba.g:747:20: (lv_enumAST_20_0= ruleMobaEnum )
            	    {
            	    // InternalMoba.g:747:20: (lv_enumAST_20_0= ruleMobaEnum )
            	    // InternalMoba.g:748:10: lv_enumAST_20_0= ruleMobaEnum
            	    {

            	    										newCompositeNode(grammarAccess.getMobaDataTypeAccess().getEnumASTMobaEnumParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_11);
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
            	    break loop12;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            				

            }

            // InternalMoba.g:777:3: (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoba.g:778:4: this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:794:1: entryRuleMobaEnum returns [EObject current=null] : iv_ruleMobaEnum= ruleMobaEnum EOF ;
    public final EObject entryRuleMobaEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnum = null;


        try {
            // InternalMoba.g:794:49: (iv_ruleMobaEnum= ruleMobaEnum EOF )
            // InternalMoba.g:795:2: iv_ruleMobaEnum= ruleMobaEnum EOF
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
    // InternalMoba.g:801:1: ruleMobaEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' ) ;
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
            // InternalMoba.g:807:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' ) )
            // InternalMoba.g:808:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' )
            {
            // InternalMoba.g:808:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' )
            // InternalMoba.g:809:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEnumAccess().getEnumKeyword_0());
            		
            // InternalMoba.g:813:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:814:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:814:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:815:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,14,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMoba.g:835:3: ( (lv_literals_3_0= ruleMobaEnumLiteral ) )
            // InternalMoba.g:836:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            {
            // InternalMoba.g:836:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            // InternalMoba.g:837:5: lv_literals_3_0= ruleMobaEnumLiteral
            {

            					newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_18);
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

            // InternalMoba.g:854:3: (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==32) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMoba.g:855:4: otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) )
            	    {
            	    otherlv_4=(Token)match(input,32,FOLLOW_17); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMobaEnumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMoba.g:859:4: ( (lv_literals_5_0= ruleMobaEnumLiteral ) )
            	    // InternalMoba.g:860:5: (lv_literals_5_0= ruleMobaEnumLiteral )
            	    {
            	    // InternalMoba.g:860:5: (lv_literals_5_0= ruleMobaEnumLiteral )
            	    // InternalMoba.g:861:6: lv_literals_5_0= ruleMobaEnumLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_18);
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
            	    break loop14;
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
    // InternalMoba.g:887:1: entryRuleMobaEnumLiteral returns [EObject current=null] : iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF ;
    public final EObject entryRuleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnumLiteral = null;


        try {
            // InternalMoba.g:887:56: (iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF )
            // InternalMoba.g:888:2: iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF
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
    // InternalMoba.g:894:1: ruleMobaEnumLiteral returns [EObject current=null] : (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:900:2: ( (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalMoba.g:901:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:901:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalMoba.g:902:3: otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEnumLiteralAccess().getLitKeyword_0());
            		
            // InternalMoba.g:906:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:907:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:907:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:908:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumLiteralAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_19); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaEnumLiteralAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMoba.g:932:3: ( (lv_literal_4_0= RULE_STRING ) )
            // InternalMoba.g:933:4: (lv_literal_4_0= RULE_STRING )
            {
            // InternalMoba.g:933:4: (lv_literal_4_0= RULE_STRING )
            // InternalMoba.g:934:5: lv_literal_4_0= RULE_STRING
            {
            lv_literal_4_0=(Token)match(input,RULE_STRING,FOLLOW_20); 

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

            otherlv_5=(Token)match(input,32,FOLLOW_21); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_5());
            		
            // InternalMoba.g:954:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalMoba.g:955:4: (lv_value_6_0= RULE_INT )
            {
            // InternalMoba.g:955:4: (lv_value_6_0= RULE_INT )
            // InternalMoba.g:956:5: lv_value_6_0= RULE_INT
            {
            lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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
    // InternalMoba.g:980:1: entryRuleMobaConstant returns [EObject current=null] : iv_ruleMobaConstant= ruleMobaConstant EOF ;
    public final EObject entryRuleMobaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstant = null;


        try {
            // InternalMoba.g:980:53: (iv_ruleMobaConstant= ruleMobaConstant EOF )
            // InternalMoba.g:981:2: iv_ruleMobaConstant= ruleMobaConstant EOF
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
    // InternalMoba.g:987:1: ruleMobaConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_valueAST_3_0 = null;

        EObject this_MobaPropertiesAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:993:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:994:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:994:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:995:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,35,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaConstantAccess().getConstKeyword_0());
            		
            // InternalMoba.g:999:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1000:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1000:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1001:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

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

            otherlv_2=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaConstantAccess().getEqualsSignKeyword_2());
            		
            // InternalMoba.g:1021:3: ( (lv_valueAST_3_0= ruleMobaConstantValue ) )
            // InternalMoba.g:1022:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            {
            // InternalMoba.g:1022:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            // InternalMoba.g:1023:5: lv_valueAST_3_0= ruleMobaConstantValue
            {

            					newCompositeNode(grammarAccess.getMobaConstantAccess().getValueASTMobaConstantValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_22);
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

            // InternalMoba.g:1040:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMoba.g:1041:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:1057:1: entryRuleMobaConstantValue returns [EObject current=null] : iv_ruleMobaConstantValue= ruleMobaConstantValue EOF ;
    public final EObject entryRuleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstantValue = null;


        try {
            // InternalMoba.g:1057:58: (iv_ruleMobaConstantValue= ruleMobaConstantValue EOF )
            // InternalMoba.g:1058:2: iv_ruleMobaConstantValue= ruleMobaConstantValue EOF
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
    // InternalMoba.g:1064:1: ruleMobaConstantValue returns [EObject current=null] : ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )? ) ;
    public final EObject ruleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        EObject lv_tail_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1070:2: ( ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )? ) )
            // InternalMoba.g:1071:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )? )
            {
            // InternalMoba.g:1071:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )? )
            // InternalMoba.g:1072:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )?
            {
            // InternalMoba.g:1072:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
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
                    // InternalMoba.g:1073:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1073:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:1074:5: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:1074:5: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:1075:6: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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
                    // InternalMoba.g:1092:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalMoba.g:1092:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoba.g:1093:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoba.g:1093:5: (otherlv_1= RULE_ID )
                    // InternalMoba.g:1094:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaConstantValueRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_1, grammarAccess.getMobaConstantValueAccess().getValueConstMobaConstantCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1106:3: (otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==36) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMoba.g:1107:4: otherlv_2= '+' ( (lv_tail_3_0= ruleMobaConstantValue ) )
                    {
                    otherlv_2=(Token)match(input,36,FOLLOW_9); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaConstantValueAccess().getPlusSignKeyword_1_0());
                    			
                    // InternalMoba.g:1111:4: ( (lv_tail_3_0= ruleMobaConstantValue ) )
                    // InternalMoba.g:1112:5: (lv_tail_3_0= ruleMobaConstantValue )
                    {
                    // InternalMoba.g:1112:5: (lv_tail_3_0= ruleMobaConstantValue )
                    // InternalMoba.g:1113:6: lv_tail_3_0= ruleMobaConstantValue
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
    // InternalMoba.g:1136:1: ruleMobaPropertiesAble[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleMobaPropertiesAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1142:2: ( (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' ) )
            // InternalMoba.g:1143:2: (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' )
            {
            // InternalMoba.g:1143:2: (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' )
            // InternalMoba.g:1144:3: otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPropertiesAbleAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoba.g:1148:3: ( (lv_properties_1_0= ruleMobaProperty ) )
            // InternalMoba.g:1149:4: (lv_properties_1_0= ruleMobaProperty )
            {
            // InternalMoba.g:1149:4: (lv_properties_1_0= ruleMobaProperty )
            // InternalMoba.g:1150:5: lv_properties_1_0= ruleMobaProperty
            {

            					newCompositeNode(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMoba.g:1167:3: (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==32) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMoba.g:1168:4: otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) )
            	    {
            	    otherlv_2=(Token)match(input,32,FOLLOW_9); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMobaPropertiesAbleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMoba.g:1172:4: ( (lv_properties_3_0= ruleMobaProperty ) )
            	    // InternalMoba.g:1173:5: (lv_properties_3_0= ruleMobaProperty )
            	    {
            	    // InternalMoba.g:1173:5: (lv_properties_3_0= ruleMobaProperty )
            	    // InternalMoba.g:1174:6: lv_properties_3_0= ruleMobaProperty
            	    {

            	    						newCompositeNode(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesMobaPropertyParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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
            	    break loop18;
                }
            } while (true);

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

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
    // InternalMoba.g:1200:1: entryRuleMobaProperty returns [EObject current=null] : iv_ruleMobaProperty= ruleMobaProperty EOF ;
    public final EObject entryRuleMobaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProperty = null;


        try {
            // InternalMoba.g:1200:53: (iv_ruleMobaProperty= ruleMobaProperty EOF )
            // InternalMoba.g:1201:2: iv_ruleMobaProperty= ruleMobaProperty EOF
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
    // InternalMoba.g:1207:1: ruleMobaProperty returns [EObject current=null] : ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaProperty() throws RecognitionException {
        EObject current = null;

        Token lv_keyString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_valueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:1213:2: ( ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalMoba.g:1214:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalMoba.g:1214:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalMoba.g:1215:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalMoba.g:1215:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_STRING) ) {
                alt19=1;
            }
            else if ( (LA19_0==RULE_ID) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalMoba.g:1216:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1216:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    // InternalMoba.g:1217:5: (lv_keyString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:1217:5: (lv_keyString_0_0= RULE_STRING )
                    // InternalMoba.g:1218:6: lv_keyString_0_0= RULE_STRING
                    {
                    lv_keyString_0_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

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
                    // InternalMoba.g:1235:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalMoba.g:1235:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoba.g:1236:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoba.g:1236:5: (otherlv_1= RULE_ID )
                    // InternalMoba.g:1237:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPropertyRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_8); 

                    						newLeafNode(otherlv_1, grammarAccess.getMobaPropertyAccess().getKeyConstMobaConstantCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:1253:3: ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_STRING) ) {
                alt20=1;
            }
            else if ( (LA20_0==RULE_ID) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // InternalMoba.g:1254:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1254:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    // InternalMoba.g:1255:5: (lv_valueString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:1255:5: (lv_valueString_3_0= RULE_STRING )
                    // InternalMoba.g:1256:6: lv_valueString_3_0= RULE_STRING
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
                    // InternalMoba.g:1273:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMoba.g:1273:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMoba.g:1274:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMoba.g:1274:5: (otherlv_4= RULE_ID )
                    // InternalMoba.g:1275:6: otherlv_4= RULE_ID
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
    // InternalMoba.g:1291:1: entryRuleMobaData returns [EObject current=null] : iv_ruleMobaData= ruleMobaData EOF ;
    public final EObject entryRuleMobaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaData = null;


        try {
            // InternalMoba.g:1291:49: (iv_ruleMobaData= ruleMobaData EOF )
            // InternalMoba.g:1292:2: iv_ruleMobaData= ruleMobaData EOF
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
    // InternalMoba.g:1298:1: ruleMobaData returns [EObject current=null] : (this_MobaBean_0= ruleMobaBean | this_MobaPayload_1= ruleMobaPayload | this_MobaQueue_2= ruleMobaQueue ) ;
    public final EObject ruleMobaData() throws RecognitionException {
        EObject current = null;

        EObject this_MobaBean_0 = null;

        EObject this_MobaPayload_1 = null;

        EObject this_MobaQueue_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1304:2: ( (this_MobaBean_0= ruleMobaBean | this_MobaPayload_1= ruleMobaPayload | this_MobaQueue_2= ruleMobaQueue ) )
            // InternalMoba.g:1305:2: (this_MobaBean_0= ruleMobaBean | this_MobaPayload_1= ruleMobaPayload | this_MobaQueue_2= ruleMobaQueue )
            {
            // InternalMoba.g:1305:2: (this_MobaBean_0= ruleMobaBean | this_MobaPayload_1= ruleMobaPayload | this_MobaQueue_2= ruleMobaQueue )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 43:
                {
                alt21=1;
                }
                break;
            case 45:
                {
                alt21=2;
                }
                break;
            case 46:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // InternalMoba.g:1306:3: this_MobaBean_0= ruleMobaBean
                    {

                    			newCompositeNode(grammarAccess.getMobaDataAccess().getMobaBeanParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaBean_0=ruleMobaBean();

                    state._fsp--;


                    			current = this_MobaBean_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:1315:3: this_MobaPayload_1= ruleMobaPayload
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
                    // InternalMoba.g:1324:3: this_MobaQueue_2= ruleMobaQueue
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
    // InternalMoba.g:1336:1: entryRuleMobaSettings returns [EObject current=null] : iv_ruleMobaSettings= ruleMobaSettings EOF ;
    public final EObject entryRuleMobaSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettings = null;


        try {
            // InternalMoba.g:1336:53: (iv_ruleMobaSettings= ruleMobaSettings EOF )
            // InternalMoba.g:1337:2: iv_ruleMobaSettings= ruleMobaSettings EOF
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
    // InternalMoba.g:1343:1: ruleMobaSettings returns [EObject current=null] : ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) ;
    public final EObject ruleMobaSettings() throws RecognitionException {
        EObject current = null;

        Token lv_active_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_MobaPropertiesAble_6 = null;

        EObject lv_features_8_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1349:2: ( ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:1350:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:1350:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:1351:3: () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}'
            {
            // InternalMoba.g:1351:3: ()
            // InternalMoba.g:1352:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0(),
            					current);
            			

            }

            // InternalMoba.g:1358:3: ( (lv_active_1_0= 'active' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==17) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMoba.g:1359:4: (lv_active_1_0= 'active' )
                    {
                    // InternalMoba.g:1359:4: (lv_active_1_0= 'active' )
                    // InternalMoba.g:1360:5: lv_active_1_0= 'active'
                    {
                    lv_active_1_0=(Token)match(input,17,FOLLOW_25); 

                    					newLeafNode(lv_active_1_0, grammarAccess.getMobaSettingsAccess().getActiveActiveKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaSettingsRule());
                    					}
                    					setWithLastConsumed(current, "active", true, "active");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaSettingsAccess().getSettingsKeyword_2());
            		
            // InternalMoba.g:1376:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMoba.g:1377:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMoba.g:1377:4: (lv_name_3_0= RULE_ID )
            // InternalMoba.g:1378:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMobaSettingsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:1394:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==23) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoba.g:1395:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaSettingsAccess().getExtendsKeyword_4_0());
                    			
                    // InternalMoba.g:1399:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMoba.g:1400:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMoba.g:1400:5: (otherlv_5= RULE_ID )
                    // InternalMoba.g:1401:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaSettingsRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_5, grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1413:3: (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==37) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoba.g:1414:4: this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaSettingsRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaSettingsAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_4);
                    this_MobaPropertiesAble_6=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_28); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMoba.g:1430:3: ( (lv_features_8_0= ruleMobaSettingsFeature ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==49) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMoba.g:1431:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    {
            	    // InternalMoba.g:1431:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    // InternalMoba.g:1432:5: lv_features_8_0= ruleMobaSettingsFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaSettingsAccess().getFeaturesMobaSettingsFeatureParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_28);
            	    lv_features_8_0=ruleMobaSettingsFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaSettingsRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_8_0,
            	    						"org.mobadsl.grammar.Moba.MobaSettingsFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            otherlv_9=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAccess().getRightCurlyBracketKeyword_8());
            		

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
    // InternalMoba.g:1457:1: entryRuleMobaCache returns [EObject current=null] : iv_ruleMobaCache= ruleMobaCache EOF ;
    public final EObject entryRuleMobaCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaCache = null;


        try {
            // InternalMoba.g:1457:50: (iv_ruleMobaCache= ruleMobaCache EOF )
            // InternalMoba.g:1458:2: iv_ruleMobaCache= ruleMobaCache EOF
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
    // InternalMoba.g:1464:1: ruleMobaCache returns [EObject current=null] : ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) ;
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
            // InternalMoba.g:1470:2: ( ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) )
            // InternalMoba.g:1471:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            {
            // InternalMoba.g:1471:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            // InternalMoba.g:1472:3: () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            {
            // InternalMoba.g:1472:3: ()
            // InternalMoba.g:1473:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaCacheAccess().getMobaCacheAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,40,FOLLOW_29); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaCacheAccess().getCacheKeyword_1());
            		
            // InternalMoba.g:1483:3: (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==29) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoba.g:1484:4: otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')'
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_30); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoba.g:1488:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) )
                    // InternalMoba.g:1489:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    {
                    // InternalMoba.g:1489:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    // InternalMoba.g:1490:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    					
                    // InternalMoba.g:1493:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    // InternalMoba.g:1494:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    {
                    // InternalMoba.g:1494:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( LA28_0 == 41 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                            alt28=1;
                        }
                        else if ( LA28_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMoba.g:1495:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:1495:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:1496:6: {...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0)");
                    	    }
                    	    // InternalMoba.g:1496:109: ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:1497:7: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0);
                    	    						
                    	    // InternalMoba.g:1500:10: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:1500:11: {...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:1500:20: (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    // InternalMoba.g:1500:21: otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    	    {
                    	    otherlv_4=(Token)match(input,41,FOLLOW_8); 

                    	    										newLeafNode(otherlv_4, grammarAccess.getMobaCacheAccess().getTypeKeyword_2_1_0_0());
                    	    									
                    	    otherlv_5=(Token)match(input,20,FOLLOW_9); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_0_1());
                    	    									
                    	    // InternalMoba.g:1508:10: ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    	    int alt26=2;
                    	    int LA26_0 = input.LA(1);

                    	    if ( (LA26_0==RULE_STRING) ) {
                    	        alt26=1;
                    	    }
                    	    else if ( (LA26_0==RULE_ID) ) {
                    	        alt26=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 26, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt26) {
                    	        case 1 :
                    	            // InternalMoba.g:1509:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:1509:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            // InternalMoba.g:1510:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:1510:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            // InternalMoba.g:1511:13: lv_cacheTypeString_6_0= RULE_STRING
                    	            {
                    	            lv_cacheTypeString_6_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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
                    	            // InternalMoba.g:1528:11: ( (otherlv_7= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:1528:11: ( (otherlv_7= RULE_ID ) )
                    	            // InternalMoba.g:1529:12: (otherlv_7= RULE_ID )
                    	            {
                    	            // InternalMoba.g:1529:12: (otherlv_7= RULE_ID )
                    	            // InternalMoba.g:1530:13: otherlv_7= RULE_ID
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_30); 

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
                    	    // InternalMoba.g:1548:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:1548:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:1549:6: {...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1)");
                    	    }
                    	    // InternalMoba.g:1549:109: ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:1550:7: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1);
                    	    						
                    	    // InternalMoba.g:1553:10: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:1553:11: {...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:1553:20: (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    // InternalMoba.g:1553:21: otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,42,FOLLOW_8); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getMobaCacheAccess().getStrategyKeyword_2_1_1_0());
                    	    									
                    	    otherlv_9=(Token)match(input,20,FOLLOW_9); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_1_1());
                    	    									
                    	    // InternalMoba.g:1561:10: ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
                    	    int alt27=2;
                    	    int LA27_0 = input.LA(1);

                    	    if ( (LA27_0==RULE_STRING) ) {
                    	        alt27=1;
                    	    }
                    	    else if ( (LA27_0==RULE_ID) ) {
                    	        alt27=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 27, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt27) {
                    	        case 1 :
                    	            // InternalMoba.g:1562:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:1562:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            // InternalMoba.g:1563:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:1563:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            // InternalMoba.g:1564:13: lv_cacheStrategyString_10_0= RULE_STRING
                    	            {
                    	            lv_cacheStrategyString_10_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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
                    	            // InternalMoba.g:1581:11: ( (otherlv_11= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:1581:11: ( (otherlv_11= RULE_ID ) )
                    	            // InternalMoba.g:1582:12: (otherlv_11= RULE_ID )
                    	            {
                    	            // InternalMoba.g:1582:12: (otherlv_11= RULE_ID )
                    	            // InternalMoba.g:1583:13: otherlv_11= RULE_ID
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_30); 

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
                    	    break loop28;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    					

                    }

                    otherlv_12=(Token)match(input,30,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMobaBean"
    // InternalMoba.g:1617:1: entryRuleMobaBean returns [EObject current=null] : iv_ruleMobaBean= ruleMobaBean EOF ;
    public final EObject entryRuleMobaBean() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaBean = null;


        try {
            // InternalMoba.g:1617:49: (iv_ruleMobaBean= ruleMobaBean EOF )
            // InternalMoba.g:1618:2: iv_ruleMobaBean= ruleMobaBean EOF
            {
             newCompositeNode(grammarAccess.getMobaBeanRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaBean=ruleMobaBean();

            state._fsp--;

             current =iv_ruleMobaBean; 
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
    // $ANTLR end "entryRuleMobaBean"


    // $ANTLR start "ruleMobaBean"
    // InternalMoba.g:1624:1: ruleMobaBean returns [EObject current=null] : (otherlv_0= 'bean' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaBeanFeature ) )* ( (lv_index_9_0= ruleMobaBeanIndex ) )? otherlv_10= '}' ) ;
    public final EObject ruleMobaBean() throws RecognitionException {
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
            // InternalMoba.g:1630:2: ( (otherlv_0= 'bean' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaBeanFeature ) )* ( (lv_index_9_0= ruleMobaBeanIndex ) )? otherlv_10= '}' ) )
            // InternalMoba.g:1631:2: (otherlv_0= 'bean' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaBeanFeature ) )* ( (lv_index_9_0= ruleMobaBeanIndex ) )? otherlv_10= '}' )
            {
            // InternalMoba.g:1631:2: (otherlv_0= 'bean' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaBeanFeature ) )* ( (lv_index_9_0= ruleMobaBeanIndex ) )? otherlv_10= '}' )
            // InternalMoba.g:1632:3: otherlv_0= 'bean' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaBeanFeature ) )* ( (lv_index_9_0= ruleMobaBeanIndex ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaBeanAccess().getBeanKeyword_0());
            		
            // InternalMoba.g:1636:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1637:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1637:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1638:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_31); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaBeanAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaBeanRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:1654:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) )
            // InternalMoba.g:1655:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:1655:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            // InternalMoba.g:1656:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2());
            				
            // InternalMoba.g:1659:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            // InternalMoba.g:1660:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            {
            // InternalMoba.g:1660:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2(), 1) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMoba.g:1661:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1661:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:1662:5: {...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBean", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoba.g:1662:105: ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:1663:6: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMoba.g:1666:9: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalMoba.g:1666:10: {...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBean", "true");
            	    }
            	    // InternalMoba.g:1666:19: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalMoba.g:1666:20: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,23,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMobaBeanAccess().getExtendsKeyword_2_0_0());
            	    								
            	    // InternalMoba.g:1670:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalMoba.g:1671:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMoba.g:1671:10: (otherlv_4= RULE_ID )
            	    // InternalMoba.g:1672:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaBeanRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_31); 

            	    											newLeafNode(otherlv_4, grammarAccess.getMobaBeanAccess().getSuperTypeMobaBeanCrossReference_2_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:1689:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    {
            	    // InternalMoba.g:1689:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    // InternalMoba.g:1690:5: {...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBean", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoba.g:1690:105: ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    // InternalMoba.g:1691:6: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMoba.g:1694:9: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    // InternalMoba.g:1694:10: {...}? => ( (lv_cache_5_0= ruleMobaCache ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBean", "true");
            	    }
            	    // InternalMoba.g:1694:19: ( (lv_cache_5_0= ruleMobaCache ) )
            	    // InternalMoba.g:1694:20: (lv_cache_5_0= ruleMobaCache )
            	    {
            	    // InternalMoba.g:1694:20: (lv_cache_5_0= ruleMobaCache )
            	    // InternalMoba.g:1695:10: lv_cache_5_0= ruleMobaCache
            	    {

            	    										newCompositeNode(grammarAccess.getMobaBeanAccess().getCacheMobaCacheParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_31);
            	    lv_cache_5_0=ruleMobaCache();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMobaBeanRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaBeanAccess().getUnorderedGroup_2());
            				

            }

            // InternalMoba.g:1724:3: (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==37) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoba.g:1725:4: this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaBeanRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaBeanAccess().getMobaPropertiesAbleParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_4);
                    this_MobaPropertiesAble_6=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_32); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaBeanAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:1741:3: ( (lv_features_8_0= ruleMobaBeanFeature ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==49||LA32_0==54) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMoba.g:1742:4: (lv_features_8_0= ruleMobaBeanFeature )
            	    {
            	    // InternalMoba.g:1742:4: (lv_features_8_0= ruleMobaBeanFeature )
            	    // InternalMoba.g:1743:5: lv_features_8_0= ruleMobaBeanFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaBeanAccess().getFeaturesMobaBeanFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_32);
            	    lv_features_8_0=ruleMobaBeanFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaBeanRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_8_0,
            	    						"org.mobadsl.grammar.Moba.MobaBeanFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalMoba.g:1760:3: ( (lv_index_9_0= ruleMobaBeanIndex ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==44) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMoba.g:1761:4: (lv_index_9_0= ruleMobaBeanIndex )
                    {
                    // InternalMoba.g:1761:4: (lv_index_9_0= ruleMobaBeanIndex )
                    // InternalMoba.g:1762:5: lv_index_9_0= ruleMobaBeanIndex
                    {

                    					newCompositeNode(grammarAccess.getMobaBeanAccess().getIndexMobaBeanIndexParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_33);
                    lv_index_9_0=ruleMobaBeanIndex();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMobaBeanRule());
                    					}
                    					set(
                    						current,
                    						"index",
                    						lv_index_9_0,
                    						"org.mobadsl.grammar.Moba.MobaBeanIndex");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMobaBeanAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleMobaBean"


    // $ANTLR start "entryRuleMobaBeanIndex"
    // InternalMoba.g:1787:1: entryRuleMobaBeanIndex returns [EObject current=null] : iv_ruleMobaBeanIndex= ruleMobaBeanIndex EOF ;
    public final EObject entryRuleMobaBeanIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaBeanIndex = null;


        try {
            // InternalMoba.g:1787:54: (iv_ruleMobaBeanIndex= ruleMobaBeanIndex EOF )
            // InternalMoba.g:1788:2: iv_ruleMobaBeanIndex= ruleMobaBeanIndex EOF
            {
             newCompositeNode(grammarAccess.getMobaBeanIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaBeanIndex=ruleMobaBeanIndex();

            state._fsp--;

             current =iv_ruleMobaBeanIndex; 
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
    // $ANTLR end "entryRuleMobaBeanIndex"


    // $ANTLR start "ruleMobaBeanIndex"
    // InternalMoba.g:1794:1: ruleMobaBeanIndex returns [EObject current=null] : (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) ;
    public final EObject ruleMobaBeanIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:1800:2: ( (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) )
            // InternalMoba.g:1801:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            {
            // InternalMoba.g:1801:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            // InternalMoba.g:1802:3: otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaBeanIndexAccess().getIndexKeyword_0());
            		
            // InternalMoba.g:1806:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:1807:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:1807:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:1808:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaBeanIndexRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_20); 

            					newLeafNode(otherlv_1, grammarAccess.getMobaBeanIndexAccess().getAttributesMobaBeanAttributeCrossReference_1_0());
            				

            }


            }

            // InternalMoba.g:1819:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            // InternalMoba.g:1820:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )*
            {
            otherlv_2=(Token)match(input,32,FOLLOW_34); 

            				newLeafNode(otherlv_2, grammarAccess.getMobaBeanIndexAccess().getCommaKeyword_2_0());
            			
            // InternalMoba.g:1824:4: ( (otherlv_3= RULE_ID ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMoba.g:1825:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMoba.g:1825:5: (otherlv_3= RULE_ID )
            	    // InternalMoba.g:1826:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMobaBeanIndexRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMobaBeanIndexAccess().getAttributesMobaBeanAttributeCrossReference_2_1_0());
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop34;
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
    // $ANTLR end "ruleMobaBeanIndex"


    // $ANTLR start "entryRuleMobaPayload"
    // InternalMoba.g:1842:1: entryRuleMobaPayload returns [EObject current=null] : iv_ruleMobaPayload= ruleMobaPayload EOF ;
    public final EObject entryRuleMobaPayload() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPayload = null;


        try {
            // InternalMoba.g:1842:52: (iv_ruleMobaPayload= ruleMobaPayload EOF )
            // InternalMoba.g:1843:2: iv_ruleMobaPayload= ruleMobaPayload EOF
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
    // InternalMoba.g:1849:1: ruleMobaPayload returns [EObject current=null] : (otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}' ) ;
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
            // InternalMoba.g:1855:2: ( (otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:1856:2: (otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:1856:2: (otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:1857:3: otherlv_0= 'payload' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaPayloadFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPayloadAccess().getPayloadKeyword_0());
            		
            // InternalMoba.g:1861:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1862:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1862:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1863:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:1879:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==23) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMoba.g:1880:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaPayloadAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:1884:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1885:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1885:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1886:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPayloadRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaPayloadAccess().getSuperTypeMobaPayloadCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1898:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==37) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMoba.g:1899:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
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

            otherlv_5=(Token)match(input,14,FOLLOW_35); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaPayloadAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:1915:3: ( (lv_features_6_0= ruleMobaPayloadFeature ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==49||LA37_0==54) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMoba.g:1916:4: (lv_features_6_0= ruleMobaPayloadFeature )
            	    {
            	    // InternalMoba.g:1916:4: (lv_features_6_0= ruleMobaPayloadFeature )
            	    // InternalMoba.g:1917:5: lv_features_6_0= ruleMobaPayloadFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaPayloadAccess().getFeaturesMobaPayloadFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_35);
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
            	    break loop37;
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
    // InternalMoba.g:1942:1: entryRuleMobaQueue returns [EObject current=null] : iv_ruleMobaQueue= ruleMobaQueue EOF ;
    public final EObject entryRuleMobaQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueue = null;


        try {
            // InternalMoba.g:1942:50: (iv_ruleMobaQueue= ruleMobaQueue EOF )
            // InternalMoba.g:1943:2: iv_ruleMobaQueue= ruleMobaQueue EOF
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
    // InternalMoba.g:1949:1: ruleMobaQueue returns [EObject current=null] : (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) ;
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
            // InternalMoba.g:1955:2: ( (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:1956:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:1956:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:1957:3: otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueAccess().getQueueKeyword_0());
            		
            // InternalMoba.g:1961:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1962:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1962:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1963:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:1979:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==23) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoba.g:1980:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:1984:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1985:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1985:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1986:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaQueueRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1998:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoba.g:1999:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
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

            otherlv_5=(Token)match(input,14,FOLLOW_36); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:2015:3: ( (lv_features_6_0= ruleMobaQueueFeature ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==54) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMoba.g:2016:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    {
            	    // InternalMoba.g:2016:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    // InternalMoba.g:2017:5: lv_features_6_0= ruleMobaQueueFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_36);
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
            	    break loop40;
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
    // InternalMoba.g:2042:1: entryRuleMobaService returns [EObject current=null] : iv_ruleMobaService= ruleMobaService EOF ;
    public final EObject entryRuleMobaService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaService = null;


        try {
            // InternalMoba.g:2042:52: (iv_ruleMobaService= ruleMobaService EOF )
            // InternalMoba.g:2043:2: iv_ruleMobaService= ruleMobaService EOF
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
    // InternalMoba.g:2049:1: ruleMobaService returns [EObject current=null] : (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud ) ;
    public final EObject ruleMobaService() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRestCustom_0 = null;

        EObject this_MobaRestCrud_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:2055:2: ( (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud ) )
            // InternalMoba.g:2056:2: (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud )
            {
            // InternalMoba.g:2056:2: (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==47) ) {
                alt41=1;
            }
            else if ( (LA41_0==48) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoba.g:2057:3: this_MobaRestCustom_0= ruleMobaRestCustom
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
                    // InternalMoba.g:2066:3: this_MobaRestCrud_1= ruleMobaRestCrud
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
    // InternalMoba.g:2078:1: entryRuleMobaRestCustom returns [EObject current=null] : iv_ruleMobaRestCustom= ruleMobaRestCustom EOF ;
    public final EObject entryRuleMobaRestCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestCustom = null;


        try {
            // InternalMoba.g:2078:55: (iv_ruleMobaRestCustom= ruleMobaRestCustom EOF )
            // InternalMoba.g:2079:2: iv_ruleMobaRestCustom= ruleMobaRestCustom EOF
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
    // InternalMoba.g:2085:1: ruleMobaRestCustom returns [EObject current=null] : (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaRestCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaPropertiesAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2091:2: ( (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2092:2: (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2092:2: (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2093:3: otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,47,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRestCustomAccess().getRestKeyword_0());
            		
            // InternalMoba.g:2097:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2098:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2098:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2099:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalMoba.g:2115:3: (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==37) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMoba.g:2116:4: this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:2132:1: entryRuleMobaRestCrud returns [EObject current=null] : iv_ruleMobaRestCrud= ruleMobaRestCrud EOF ;
    public final EObject entryRuleMobaRestCrud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestCrud = null;


        try {
            // InternalMoba.g:2132:53: (iv_ruleMobaRestCrud= ruleMobaRestCrud EOF )
            // InternalMoba.g:2133:2: iv_ruleMobaRestCrud= ruleMobaRestCrud EOF
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
    // InternalMoba.g:2139:1: ruleMobaRestCrud returns [EObject current=null] : (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaRestCrud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaPropertiesAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2145:2: ( (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2146:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2146:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2147:3: otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRestCrudAccess().getRestCrudKeyword_0());
            		
            // InternalMoba.g:2151:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2152:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2152:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2153:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalMoba.g:2169:3: (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==37) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoba.g:2170:4: this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current]
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


    // $ANTLR start "entryRuleMobaBeanFeature"
    // InternalMoba.g:2186:1: entryRuleMobaBeanFeature returns [EObject current=null] : iv_ruleMobaBeanFeature= ruleMobaBeanFeature EOF ;
    public final EObject entryRuleMobaBeanFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaBeanFeature = null;


        try {
            // InternalMoba.g:2186:56: (iv_ruleMobaBeanFeature= ruleMobaBeanFeature EOF )
            // InternalMoba.g:2187:2: iv_ruleMobaBeanFeature= ruleMobaBeanFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaBeanFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaBeanFeature=ruleMobaBeanFeature();

            state._fsp--;

             current =iv_ruleMobaBeanFeature; 
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
    // $ANTLR end "entryRuleMobaBeanFeature"


    // $ANTLR start "ruleMobaBeanFeature"
    // InternalMoba.g:2193:1: ruleMobaBeanFeature returns [EObject current=null] : (this_MobaBeanAttribute_0= ruleMobaBeanAttribute | this_MobaBeanReference_1= ruleMobaBeanReference ) ;
    public final EObject ruleMobaBeanFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaBeanAttribute_0 = null;

        EObject this_MobaBeanReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:2199:2: ( (this_MobaBeanAttribute_0= ruleMobaBeanAttribute | this_MobaBeanReference_1= ruleMobaBeanReference ) )
            // InternalMoba.g:2200:2: (this_MobaBeanAttribute_0= ruleMobaBeanAttribute | this_MobaBeanReference_1= ruleMobaBeanReference )
            {
            // InternalMoba.g:2200:2: (this_MobaBeanAttribute_0= ruleMobaBeanAttribute | this_MobaBeanReference_1= ruleMobaBeanReference )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==49) ) {
                alt44=1;
            }
            else if ( (LA44_0==54) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoba.g:2201:3: this_MobaBeanAttribute_0= ruleMobaBeanAttribute
                    {

                    			newCompositeNode(grammarAccess.getMobaBeanFeatureAccess().getMobaBeanAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaBeanAttribute_0=ruleMobaBeanAttribute();

                    state._fsp--;


                    			current = this_MobaBeanAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:2210:3: this_MobaBeanReference_1= ruleMobaBeanReference
                    {

                    			newCompositeNode(grammarAccess.getMobaBeanFeatureAccess().getMobaBeanReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaBeanReference_1=ruleMobaBeanReference();

                    state._fsp--;


                    			current = this_MobaBeanReference_1;
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
    // $ANTLR end "ruleMobaBeanFeature"


    // $ANTLR start "entryRuleMobaBeanAttribute"
    // InternalMoba.g:2222:1: entryRuleMobaBeanAttribute returns [EObject current=null] : iv_ruleMobaBeanAttribute= ruleMobaBeanAttribute EOF ;
    public final EObject entryRuleMobaBeanAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaBeanAttribute = null;


        try {
            // InternalMoba.g:2222:58: (iv_ruleMobaBeanAttribute= ruleMobaBeanAttribute EOF )
            // InternalMoba.g:2223:2: iv_ruleMobaBeanAttribute= ruleMobaBeanAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaBeanAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaBeanAttribute=ruleMobaBeanAttribute();

            state._fsp--;

             current =iv_ruleMobaBeanAttribute; 
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
    // $ANTLR end "entryRuleMobaBeanAttribute"


    // $ANTLR start "ruleMobaBeanAttribute"
    // InternalMoba.g:2229:1: ruleMobaBeanAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaBeanAttribute() throws RecognitionException {
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
            // InternalMoba.g:2235:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2236:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2236:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2237:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaBeanAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2241:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2242:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2242:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2243:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2246:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:2247:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:2247:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop46:
            do {
                int alt46=6;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt46=3;
                }
                else if ( LA46_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt46=4;
                }
                else if ( LA46_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt46=5;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMoba.g:2248:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2248:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2249:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2249:114: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2250:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2253:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:2253:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "true");
            	    }
            	    // InternalMoba.g:2253:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:2253:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2253:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:2254:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,50,FOLLOW_37); 

            	    										newLeafNode(lv_lazy_2_0, grammarAccess.getMobaBeanAttributeAccess().getLazyLazyKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaBeanAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2271:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2271:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2272:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2272:114: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2273:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2276:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:2276:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "true");
            	    }
            	    // InternalMoba.g:2276:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:2276:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:2276:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:2277:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,51,FOLLOW_37); 

            	    										newLeafNode(lv_transient_3_0, grammarAccess.getMobaBeanAttributeAccess().getTransientTransientKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaBeanAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:2294:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2294:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:2295:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2295:114: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:2296:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2299:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:2299:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "true");
            	    }
            	    // InternalMoba.g:2299:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:2299:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:2299:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:2300:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,52,FOLLOW_37); 

            	    										newLeafNode(lv_domainKey_4_0, grammarAccess.getMobaBeanAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaBeanAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainKey", true, "domainKey");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:2317:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2317:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:2318:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:2318:114: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:2319:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:2322:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:2322:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "true");
            	    }
            	    // InternalMoba.g:2322:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:2322:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:2322:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:2323:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,53,FOLLOW_37); 

            	    										newLeafNode(lv_domainDescription_5_0, grammarAccess.getMobaBeanAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaBeanAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainDescription", true, "domainDescription");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:2340:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2340:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:2341:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:2341:114: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:2342:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:2345:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:2345:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanAttribute", "true");
            	    }
            	    // InternalMoba.g:2345:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:2345:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,31,FOLLOW_14); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaBeanAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,29,FOLLOW_15); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaBeanAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:2353:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:2354:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:2354:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:2355:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaBeanAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaBeanAttributeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"constraints",
            	    												lv_constraints_8_0,
            	    												"org.mobadsl.grammar.Moba.MobaConstraint");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMoba.g:2372:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==32) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // InternalMoba.g:2373:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,32,FOLLOW_15); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaBeanAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:2377:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:2378:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:2378:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:2379:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaBeanAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_16);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMobaBeanAttributeRule());
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
            	    	    break loop45;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,30,FOLLOW_37); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaBeanAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaBeanAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2414:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:2415:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:2415:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:2416:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaBeanAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_12, grammarAccess.getMobaBeanAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaBeanAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaBeanAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_13;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:2438:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:2439:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:2439:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:2440:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_14_0, grammarAccess.getMobaBeanAttributeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaBeanAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_14_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:2456:3: (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==37) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMoba.g:2457:4: this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaBeanAttributeRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaBeanAttributeAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
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
    // $ANTLR end "ruleMobaBeanAttribute"


    // $ANTLR start "entryRuleMobaSettingsFeature"
    // InternalMoba.g:2473:1: entryRuleMobaSettingsFeature returns [EObject current=null] : iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF ;
    public final EObject entryRuleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsFeature = null;


        try {
            // InternalMoba.g:2473:60: (iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF )
            // InternalMoba.g:2474:2: iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF
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
    // InternalMoba.g:2480:1: ruleMobaSettingsFeature returns [EObject current=null] : this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute ;
    public final EObject ruleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaSettingsAttribute_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2486:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute )
            // InternalMoba.g:2487:2: this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute
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
    // InternalMoba.g:2498:1: entryRuleMobaSettingsAttribute returns [EObject current=null] : iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF ;
    public final EObject entryRuleMobaSettingsAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsAttribute = null;


        try {
            // InternalMoba.g:2498:62: (iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF )
            // InternalMoba.g:2499:2: iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF
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
    // InternalMoba.g:2505:1: ruleMobaSettingsAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:2511:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2512:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2512:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2513:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_37); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2517:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2518:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2518:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2519:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2522:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:2523:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:2523:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop49:
            do {
                int alt49=6;
                int LA49_0 = input.LA(1);

                if ( LA49_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt49=3;
                }
                else if ( LA49_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt49=4;
                }
                else if ( LA49_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt49=5;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMoba.g:2524:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2524:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2525:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2525:118: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2526:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2529:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:2529:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2529:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:2529:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2529:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:2530:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,50,FOLLOW_37); 

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
            	    // InternalMoba.g:2547:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2547:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2548:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2548:118: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2549:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2552:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:2552:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2552:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:2552:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:2552:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:2553:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,51,FOLLOW_37); 

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
            	    // InternalMoba.g:2570:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2570:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:2571:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2571:118: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:2572:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2575:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:2575:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2575:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:2575:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:2575:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:2576:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,52,FOLLOW_37); 

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
            	    // InternalMoba.g:2593:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2593:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:2594:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:2594:118: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:2595:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:2598:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:2598:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2598:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:2598:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:2598:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:2599:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,53,FOLLOW_37); 

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
            	    // InternalMoba.g:2616:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2616:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:2617:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:2617:118: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:2618:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:2621:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:2621:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2621:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:2621:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,31,FOLLOW_14); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaSettingsAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,29,FOLLOW_15); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:2629:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:2630:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:2630:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:2631:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
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

            	    // InternalMoba.g:2648:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==32) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalMoba.g:2649:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,32,FOLLOW_15); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:2653:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:2654:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:2654:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:2655:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_16);
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
            	    	    break loop48;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,30,FOLLOW_37); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaSettingsAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2690:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:2691:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:2691:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:2692:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_38); 

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
            		
            // InternalMoba.g:2714:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:2715:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:2715:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:2716:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalMoba.g:2732:3: (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==37) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMoba.g:2733:4: this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:2750:1: ruleMobaMultiplicityAble[EObject in_current] returns [EObject current=in_current] : ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? ;
    public final EObject ruleMobaMultiplicityAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2756:2: ( ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? )
            // InternalMoba.g:2757:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            {
            // InternalMoba.g:2757:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==37) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoba.g:2758:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    {
                    // InternalMoba.g:2758:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    // InternalMoba.g:2759:4: lv_multiplicity_0_0= ruleMobaMuliplicity
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


    // $ANTLR start "entryRuleMobaBeanReference"
    // InternalMoba.g:2779:1: entryRuleMobaBeanReference returns [EObject current=null] : iv_ruleMobaBeanReference= ruleMobaBeanReference EOF ;
    public final EObject entryRuleMobaBeanReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaBeanReference = null;


        try {
            // InternalMoba.g:2779:58: (iv_ruleMobaBeanReference= ruleMobaBeanReference EOF )
            // InternalMoba.g:2780:2: iv_ruleMobaBeanReference= ruleMobaBeanReference EOF
            {
             newCompositeNode(grammarAccess.getMobaBeanReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaBeanReference=ruleMobaBeanReference();

            state._fsp--;

             current =iv_ruleMobaBeanReference; 
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
    // $ANTLR end "entryRuleMobaBeanReference"


    // $ANTLR start "ruleMobaBeanReference"
    // InternalMoba.g:2786:1: ruleMobaBeanReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaBeanReference() throws RecognitionException {
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
            // InternalMoba.g:2792:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2793:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2793:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2794:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaBeanReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:2798:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:2799:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:2799:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:2800:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2803:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:2804:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:2804:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop52:
            do {
                int alt52=4;
                int LA52_0 = input.LA(1);

                if ( LA52_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt52=1;
                }
                else if ( LA52_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt52=2;
                }
                else if ( LA52_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt52=3;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMoba.g:2805:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2805:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:2806:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2806:114: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:2807:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2810:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:2810:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanReference", "true");
            	    }
            	    // InternalMoba.g:2810:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:2810:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:2810:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:2811:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,55,FOLLOW_39); 

            	    										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaBeanReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaBeanReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "cascading", true, "cascading");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2828:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2828:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2829:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2829:114: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2830:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2833:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:2833:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanReference", "true");
            	    }
            	    // InternalMoba.g:2833:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:2833:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2833:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:2834:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,50,FOLLOW_39); 

            	    										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaBeanReferenceAccess().getLazyLazyKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaBeanReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:2851:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2851:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2852:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2852:114: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2853:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2856:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:2856:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaBeanReference", "true");
            	    }
            	    // InternalMoba.g:2856:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:2856:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:2856:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:2857:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,51,FOLLOW_39); 

            	    										newLeafNode(lv_transient_4_0, grammarAccess.getMobaBeanReferenceAccess().getTransientTransientKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaBeanReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaBeanReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2881:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:2882:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:2882:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:2883:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaBeanReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(otherlv_5, grammarAccess.getMobaBeanReferenceAccess().getTypeMobaBeanCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaBeanReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaBeanReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_6;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:2905:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:2906:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:2906:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:2907:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_22); 

            					newLeafNode(lv_name_7_0, grammarAccess.getMobaBeanReferenceAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaBeanReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMoba.g:2923:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==37) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMoba.g:2924:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaBeanReferenceRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaBeanReferenceAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
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
    // $ANTLR end "ruleMobaBeanReference"


    // $ANTLR start "entryRuleMobaPayloadFeature"
    // InternalMoba.g:2940:1: entryRuleMobaPayloadFeature returns [EObject current=null] : iv_ruleMobaPayloadFeature= ruleMobaPayloadFeature EOF ;
    public final EObject entryRuleMobaPayloadFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPayloadFeature = null;


        try {
            // InternalMoba.g:2940:59: (iv_ruleMobaPayloadFeature= ruleMobaPayloadFeature EOF )
            // InternalMoba.g:2941:2: iv_ruleMobaPayloadFeature= ruleMobaPayloadFeature EOF
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
    // InternalMoba.g:2947:1: ruleMobaPayloadFeature returns [EObject current=null] : (this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute | this_MobaPayloadReference_1= ruleMobaPayloadReference ) ;
    public final EObject ruleMobaPayloadFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaPayloadAttribute_0 = null;

        EObject this_MobaPayloadReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:2953:2: ( (this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute | this_MobaPayloadReference_1= ruleMobaPayloadReference ) )
            // InternalMoba.g:2954:2: (this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute | this_MobaPayloadReference_1= ruleMobaPayloadReference )
            {
            // InternalMoba.g:2954:2: (this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute | this_MobaPayloadReference_1= ruleMobaPayloadReference )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==49) ) {
                alt54=1;
            }
            else if ( (LA54_0==54) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoba.g:2955:3: this_MobaPayloadAttribute_0= ruleMobaPayloadAttribute
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
                    // InternalMoba.g:2964:3: this_MobaPayloadReference_1= ruleMobaPayloadReference
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
    // InternalMoba.g:2976:1: entryRuleMobaPayloadAttribute returns [EObject current=null] : iv_ruleMobaPayloadAttribute= ruleMobaPayloadAttribute EOF ;
    public final EObject entryRuleMobaPayloadAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPayloadAttribute = null;


        try {
            // InternalMoba.g:2976:61: (iv_ruleMobaPayloadAttribute= ruleMobaPayloadAttribute EOF )
            // InternalMoba.g:2977:2: iv_ruleMobaPayloadAttribute= ruleMobaPayloadAttribute EOF
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
    // InternalMoba.g:2983:1: ruleMobaPayloadAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:2989:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2990:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2990:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2991:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,49,FOLLOW_40); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPayloadAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2995:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2996:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2996:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2997:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3000:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            // InternalMoba.g:3001:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            {
            // InternalMoba.g:3001:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            loop56:
            do {
                int alt56=7;
                int LA56_0 = input.LA(1);

                if ( LA56_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt56=2;
                }
                else if ( LA56_0 == 52 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt56=3;
                }
                else if ( LA56_0 == 53 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt56=4;
                }
                else if ( LA56_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt56=5;
                }
                else if ( LA56_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 5) ) {
                    alt56=6;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMoba.g:3002:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3002:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3003:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3003:117: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3004:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3007:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:3007:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:3007:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:3007:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3007:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:3008:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,50,FOLLOW_40); 

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
            	    // InternalMoba.g:3025:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3025:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3026:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3026:117: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3027:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3030:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:3030:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:3030:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:3030:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:3030:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:3031:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,51,FOLLOW_40); 

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
            	    // InternalMoba.g:3048:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3048:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:3049:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3049:117: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:3050:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3053:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:3053:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:3053:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:3053:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:3053:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:3054:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,52,FOLLOW_40); 

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
            	    // InternalMoba.g:3071:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3071:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:3072:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:3072:117: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:3073:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:3076:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:3076:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:3076:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:3076:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:3076:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:3077:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,53,FOLLOW_40); 

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
            	    // InternalMoba.g:3094:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:3094:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:3095:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:3095:117: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:3096:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:3099:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:3099:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:3099:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:3099:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,31,FOLLOW_14); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaPayloadAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,29,FOLLOW_15); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaPayloadAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:3107:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:3108:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:3108:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:3109:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaPayloadAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_16);
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

            	    // InternalMoba.g:3126:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        int LA55_0 = input.LA(1);

            	        if ( (LA55_0==32) ) {
            	            alt55=1;
            	        }


            	        switch (alt55) {
            	    	case 1 :
            	    	    // InternalMoba.g:3127:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,32,FOLLOW_15); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaPayloadAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:3131:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:3132:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:3132:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:3133:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaPayloadAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_16);
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
            	    	    break loop55;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,30,FOLLOW_40); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaPayloadAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMoba.g:3161:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:3161:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    // InternalMoba.g:3162:5: {...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalMoba.g:3162:117: ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    // InternalMoba.g:3163:6: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalMoba.g:3166:9: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    // InternalMoba.g:3166:10: {...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadAttribute", "true");
            	    }
            	    // InternalMoba.g:3166:19: (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    // InternalMoba.g:3166:20: otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')'
            	    {
            	    otherlv_12=(Token)match(input,56,FOLLOW_14); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMobaPayloadAttributeAccess().getAliasKeyword_1_5_0());
            	    								
            	    otherlv_13=(Token)match(input,29,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getMobaPayloadAttributeAccess().getLeftParenthesisKeyword_1_5_1());
            	    								
            	    // InternalMoba.g:3174:9: ( (lv_alias_14_0= RULE_ID ) )
            	    // InternalMoba.g:3175:10: (lv_alias_14_0= RULE_ID )
            	    {
            	    // InternalMoba.g:3175:10: (lv_alias_14_0= RULE_ID )
            	    // InternalMoba.g:3176:11: lv_alias_14_0= RULE_ID
            	    {
            	    lv_alias_14_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            	    otherlv_15=(Token)match(input,30,FOLLOW_40); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaPayloadAttributeAccess().getRightParenthesisKeyword_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaPayloadAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3209:3: ( (otherlv_16= RULE_ID ) )
            // InternalMoba.g:3210:4: (otherlv_16= RULE_ID )
            {
            // InternalMoba.g:3210:4: (otherlv_16= RULE_ID )
            // InternalMoba.g:3211:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaPayloadAttributeRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_38); 

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
            		
            // InternalMoba.g:3233:3: ( (lv_name_18_0= RULE_ID ) )
            // InternalMoba.g:3234:4: (lv_name_18_0= RULE_ID )
            {
            // InternalMoba.g:3234:4: (lv_name_18_0= RULE_ID )
            // InternalMoba.g:3235:5: lv_name_18_0= RULE_ID
            {
            lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalMoba.g:3251:3: (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==37) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoba.g:3252:4: this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:3268:1: entryRuleMobaPayloadReference returns [EObject current=null] : iv_ruleMobaPayloadReference= ruleMobaPayloadReference EOF ;
    public final EObject entryRuleMobaPayloadReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPayloadReference = null;


        try {
            // InternalMoba.g:3268:61: (iv_ruleMobaPayloadReference= ruleMobaPayloadReference EOF )
            // InternalMoba.g:3269:2: iv_ruleMobaPayloadReference= ruleMobaPayloadReference EOF
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
    // InternalMoba.g:3275:1: ruleMobaPayloadReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:3281:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3282:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3282:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3283:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPayloadReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:3287:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3288:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3288:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:3289:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3292:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:3293:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:3293:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop58:
            do {
                int alt58=4;
                int LA58_0 = input.LA(1);

                if ( LA58_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt58=2;
                }
                else if ( LA58_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt58=3;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMoba.g:3294:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3294:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:3295:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3295:117: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:3296:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3299:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:3299:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "true");
            	    }
            	    // InternalMoba.g:3299:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:3299:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:3299:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:3300:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,55,FOLLOW_39); 

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
            	    // InternalMoba.g:3317:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3317:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3318:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3318:117: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3319:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3322:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:3322:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "true");
            	    }
            	    // InternalMoba.g:3322:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:3322:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3322:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:3323:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,50,FOLLOW_39); 

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
            	    // InternalMoba.g:3340:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3340:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3341:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3341:117: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3342:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3345:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:3345:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaPayloadReference", "true");
            	    }
            	    // InternalMoba.g:3345:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:3345:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:3345:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:3346:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,51,FOLLOW_39); 

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
            	    break loop58;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaPayloadReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3370:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:3371:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:3371:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:3372:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaPayloadReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_38); 

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
            		
            // InternalMoba.g:3394:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:3395:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:3395:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:3396:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalMoba.g:3412:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==37) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMoba.g:3413:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:3429:1: entryRuleMobaQueueFeature returns [EObject current=null] : iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF ;
    public final EObject entryRuleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueFeature = null;


        try {
            // InternalMoba.g:3429:57: (iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF )
            // InternalMoba.g:3430:2: iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF
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
    // InternalMoba.g:3436:1: ruleMobaQueueFeature returns [EObject current=null] : this_MobaQueueReference_0= ruleMobaQueueReference ;
    public final EObject ruleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaQueueReference_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3442:2: (this_MobaQueueReference_0= ruleMobaQueueReference )
            // InternalMoba.g:3443:2: this_MobaQueueReference_0= ruleMobaQueueReference
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
    // InternalMoba.g:3454:1: entryRuleMobaQueueReference returns [EObject current=null] : iv_ruleMobaQueueReference= ruleMobaQueueReference EOF ;
    public final EObject entryRuleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueReference = null;


        try {
            // InternalMoba.g:3454:59: (iv_ruleMobaQueueReference= ruleMobaQueueReference EOF )
            // InternalMoba.g:3455:2: iv_ruleMobaQueueReference= ruleMobaQueueReference EOF
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
    // InternalMoba.g:3461:1: ruleMobaQueueReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:3467:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3468:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3468:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3469:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_39); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:3473:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3474:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3474:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:3475:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3478:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:3479:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:3479:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop60:
            do {
                int alt60=4;
                int LA60_0 = input.LA(1);

                if ( LA60_0 == 55 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt60=1;
                }
                else if ( LA60_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt60=2;
                }
                else if ( LA60_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt60=3;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalMoba.g:3480:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3480:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:3481:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3481:115: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:3482:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3485:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:3485:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3485:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:3485:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:3485:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:3486:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,55,FOLLOW_39); 

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
            	    // InternalMoba.g:3503:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3503:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3504:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3504:115: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3505:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3508:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:3508:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3508:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:3508:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3508:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:3509:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,50,FOLLOW_39); 

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
            	    // InternalMoba.g:3526:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3526:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3527:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3527:115: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3528:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3531:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:3531:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3531:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:3531:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:3531:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:3532:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,51,FOLLOW_39); 

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
            	    break loop60;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3556:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:3557:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:3557:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:3558:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_38); 

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
            		
            // InternalMoba.g:3580:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:3581:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:3581:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:3582:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_22); 

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

            // InternalMoba.g:3598:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==37) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMoba.g:3599:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:3615:1: entryRuleMobaMuliplicity returns [EObject current=null] : iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF ;
    public final EObject entryRuleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMuliplicity = null;


        try {
            // InternalMoba.g:3615:56: (iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF )
            // InternalMoba.g:3616:2: iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF
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
    // InternalMoba.g:3622:1: ruleMobaMuliplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lower_1_0 = null;

        Enumerator lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3628:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) )
            // InternalMoba.g:3629:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            {
            // InternalMoba.g:3629:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            // InternalMoba.g:3630:3: otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,37,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoba.g:3634:3: ( (lv_lower_1_0= ruleMobaLowerBound ) )
            // InternalMoba.g:3635:4: (lv_lower_1_0= ruleMobaLowerBound )
            {
            // InternalMoba.g:3635:4: (lv_lower_1_0= ruleMobaLowerBound )
            // InternalMoba.g:3636:5: lv_lower_1_0= ruleMobaLowerBound
            {

            					newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_42);
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

            // InternalMoba.g:3653:3: (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==57) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMoba.g:3654:4: otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    {
                    otherlv_2=(Token)match(input,57,FOLLOW_43); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0());
                    			
                    // InternalMoba.g:3658:4: ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    // InternalMoba.g:3659:5: (lv_upper_3_0= ruleMobaUpperBound )
                    {
                    // InternalMoba.g:3659:5: (lv_upper_3_0= ruleMobaUpperBound )
                    // InternalMoba.g:3660:6: lv_upper_3_0= ruleMobaUpperBound
                    {

                    						newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_44);
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

            otherlv_4=(Token)match(input,38,FOLLOW_2); 

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
    // InternalMoba.g:3686:1: entryRuleMobaConstraint returns [EObject current=null] : iv_ruleMobaConstraint= ruleMobaConstraint EOF ;
    public final EObject entryRuleMobaConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstraint = null;


        try {
            // InternalMoba.g:3686:55: (iv_ruleMobaConstraint= ruleMobaConstraint EOF )
            // InternalMoba.g:3687:2: iv_ruleMobaConstraint= ruleMobaConstraint EOF
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
    // InternalMoba.g:3693:1: ruleMobaConstraint returns [EObject current=null] : (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) ;
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
            // InternalMoba.g:3699:2: ( (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) )
            // InternalMoba.g:3700:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            {
            // InternalMoba.g:3700:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            int alt63=8;
            switch ( input.LA(1) ) {
            case 58:
                {
                alt63=1;
                }
                break;
            case 59:
                {
                alt63=2;
                }
                break;
            case 60:
                {
                alt63=3;
                }
                break;
            case 61:
                {
                alt63=4;
                }
                break;
            case 62:
                {
                alt63=5;
                }
                break;
            case 63:
                {
                alt63=6;
                }
                break;
            case 64:
                {
                alt63=7;
                }
                break;
            case 65:
                {
                alt63=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }

            switch (alt63) {
                case 1 :
                    // InternalMoba.g:3701:3: this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint
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
                    // InternalMoba.g:3710:3: this_MobaMinConstraint_1= ruleMobaMinConstraint
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
                    // InternalMoba.g:3719:3: this_MobaMaxConstraint_2= ruleMobaMaxConstraint
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
                    // InternalMoba.g:3728:3: this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint
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
                    // InternalMoba.g:3737:3: this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint
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
                    // InternalMoba.g:3746:3: this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint
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
                    // InternalMoba.g:3755:3: this_MobaNullConstraint_6= ruleMobaNullConstraint
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
                    // InternalMoba.g:3764:3: this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint
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
    // InternalMoba.g:3776:1: entryRuleMobaRegexpConstraint returns [EObject current=null] : iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF ;
    public final EObject entryRuleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRegexpConstraint = null;


        try {
            // InternalMoba.g:3776:61: (iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF )
            // InternalMoba.g:3777:2: iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF
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
    // InternalMoba.g:3783:1: ruleMobaRegexpConstraint returns [EObject current=null] : (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3789:2: ( (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3790:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3790:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3791:3: otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRegexpConstraintAccess().getRegexpKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaRegexpConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3799:3: ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_STRING) ) {
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
                    // InternalMoba.g:3800:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:3800:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    // InternalMoba.g:3801:5: (lv_filterString_2_0= RULE_STRING )
                    {
                    // InternalMoba.g:3801:5: (lv_filterString_2_0= RULE_STRING )
                    // InternalMoba.g:3802:6: lv_filterString_2_0= RULE_STRING
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
                    // InternalMoba.g:3819:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3819:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3820:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3820:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3821:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:3837:1: entryRuleMobaMinConstraint returns [EObject current=null] : iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF ;
    public final EObject entryRuleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinConstraint = null;


        try {
            // InternalMoba.g:3837:58: (iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF )
            // InternalMoba.g:3838:2: iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF
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
    // InternalMoba.g:3844:1: ruleMobaMinConstraint returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3850:2: ( (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3851:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3851:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3852:3: otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,59,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinConstraintAccess().getMinKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3860:3: ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_FLOAT) ) {
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
                    // InternalMoba.g:3861:4: ( (lv_filterValue_2_0= RULE_FLOAT ) )
                    {
                    // InternalMoba.g:3861:4: ( (lv_filterValue_2_0= RULE_FLOAT ) )
                    // InternalMoba.g:3862:5: (lv_filterValue_2_0= RULE_FLOAT )
                    {
                    // InternalMoba.g:3862:5: (lv_filterValue_2_0= RULE_FLOAT )
                    // InternalMoba.g:3863:6: lv_filterValue_2_0= RULE_FLOAT
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
                    // InternalMoba.g:3880:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3880:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3881:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3881:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3882:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:3898:1: entryRuleMobaMaxConstraint returns [EObject current=null] : iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF ;
    public final EObject entryRuleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxConstraint = null;


        try {
            // InternalMoba.g:3898:58: (iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF )
            // InternalMoba.g:3899:2: iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF
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
    // InternalMoba.g:3905:1: ruleMobaMaxConstraint returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3911:2: ( (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3912:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3912:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3913:3: otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,60,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxConstraintAccess().getMaxKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_45); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3921:3: ( ( (lv_filterValue_2_0= RULE_FLOAT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_FLOAT) ) {
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
                    // InternalMoba.g:3922:4: ( (lv_filterValue_2_0= RULE_FLOAT ) )
                    {
                    // InternalMoba.g:3922:4: ( (lv_filterValue_2_0= RULE_FLOAT ) )
                    // InternalMoba.g:3923:5: (lv_filterValue_2_0= RULE_FLOAT )
                    {
                    // InternalMoba.g:3923:5: (lv_filterValue_2_0= RULE_FLOAT )
                    // InternalMoba.g:3924:6: lv_filterValue_2_0= RULE_FLOAT
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
                    // InternalMoba.g:3941:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3941:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3942:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3942:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3943:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:3959:1: entryRuleMobaMinLengthConstraint returns [EObject current=null] : iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF ;
    public final EObject entryRuleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinLengthConstraint = null;


        try {
            // InternalMoba.g:3959:64: (iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF )
            // InternalMoba.g:3960:2: iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF
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
    // InternalMoba.g:3966:1: ruleMobaMinLengthConstraint returns [EObject current=null] : (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3972:2: ( (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3973:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3973:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3974:3: otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinLengthConstraintAccess().getMinLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3982:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_INT) ) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_ID) ) {
                alt67=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalMoba.g:3983:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:3983:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:3984:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:3984:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:3985:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:4002:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4002:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4003:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4003:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4004:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4020:1: entryRuleMobaMaxLengthConstraint returns [EObject current=null] : iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF ;
    public final EObject entryRuleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxLengthConstraint = null;


        try {
            // InternalMoba.g:4020:64: (iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF )
            // InternalMoba.g:4021:2: iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF
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
    // InternalMoba.g:4027:1: ruleMobaMaxLengthConstraint returns [EObject current=null] : (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:4033:2: ( (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:4034:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:4034:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:4035:3: otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,62,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxLengthConstraintAccess().getMaxLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:4043:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==RULE_INT) ) {
                alt68=1;
            }
            else if ( (LA68_0==RULE_ID) ) {
                alt68=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }
            switch (alt68) {
                case 1 :
                    // InternalMoba.g:4044:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4044:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:4045:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:4045:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:4046:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:4063:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4063:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4064:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4064:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4065:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4081:1: entryRuleMobaDigitsConstraint returns [EObject current=null] : iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF ;
    public final EObject entryRuleMobaDigitsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDigitsConstraint = null;


        try {
            // InternalMoba.g:4081:61: (iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF )
            // InternalMoba.g:4082:2: iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF
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
    // InternalMoba.g:4088:1: ruleMobaDigitsConstraint returns [EObject current=null] : (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:4094:2: ( (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ) )
            // InternalMoba.g:4095:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:4095:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' )
            // InternalMoba.g:4096:3: otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDigitsConstraintAccess().getDigitsKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_46); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaDigitsConstraintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoba.g:4104:3: ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==RULE_INT) ) {
                alt69=1;
            }
            else if ( (LA69_0==RULE_ID) ) {
                alt69=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalMoba.g:4105:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4105:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    // InternalMoba.g:4106:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:4106:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    // InternalMoba.g:4107:6: lv_filterIntegerValue_2_0= RULE_INT
                    {
                    lv_filterIntegerValue_2_0=(Token)match(input,RULE_INT,FOLLOW_20); 

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
                    // InternalMoba.g:4124:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4124:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4125:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4125:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4126:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_20); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,32,FOLLOW_46); 

            			newLeafNode(otherlv_4, grammarAccess.getMobaDigitsConstraintAccess().getCommaKeyword_3());
            		
            // InternalMoba.g:4142:3: ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) )
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==RULE_INT) ) {
                alt70=1;
            }
            else if ( (LA70_0==RULE_ID) ) {
                alt70=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;
            }
            switch (alt70) {
                case 1 :
                    // InternalMoba.g:4143:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4143:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    // InternalMoba.g:4144:5: (lv_filterFractionValue_5_0= RULE_INT )
                    {
                    // InternalMoba.g:4144:5: (lv_filterFractionValue_5_0= RULE_INT )
                    // InternalMoba.g:4145:6: lv_filterFractionValue_5_0= RULE_INT
                    {
                    lv_filterFractionValue_5_0=(Token)match(input,RULE_INT,FOLLOW_13); 

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
                    // InternalMoba.g:4162:4: ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMoba.g:4162:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMoba.g:4163:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMoba.g:4163:5: (otherlv_6= RULE_ID )
                    // InternalMoba.g:4164:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_13); 

                    						newLeafNode(otherlv_6, grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionConstMobaConstantCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,30,FOLLOW_2); 

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
    // InternalMoba.g:4184:1: entryRuleMobaNullConstraint returns [EObject current=null] : iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF ;
    public final EObject entryRuleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNullConstraint = null;


        try {
            // InternalMoba.g:4184:59: (iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF )
            // InternalMoba.g:4185:2: iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF
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
    // InternalMoba.g:4191:1: ruleMobaNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNull' ) ;
    public final EObject ruleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4197:2: ( ( () otherlv_1= 'isNull' ) )
            // InternalMoba.g:4198:2: ( () otherlv_1= 'isNull' )
            {
            // InternalMoba.g:4198:2: ( () otherlv_1= 'isNull' )
            // InternalMoba.g:4199:3: () otherlv_1= 'isNull'
            {
            // InternalMoba.g:4199:3: ()
            // InternalMoba.g:4200:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNullConstraintAccess().getMobaNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,64,FOLLOW_2); 

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
    // InternalMoba.g:4214:1: entryRuleMobaNotNullConstraint returns [EObject current=null] : iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF ;
    public final EObject entryRuleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNotNullConstraint = null;


        try {
            // InternalMoba.g:4214:62: (iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF )
            // InternalMoba.g:4215:2: iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF
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
    // InternalMoba.g:4221:1: ruleMobaNotNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNotNull' ) ;
    public final EObject ruleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4227:2: ( ( () otherlv_1= 'isNotNull' ) )
            // InternalMoba.g:4228:2: ( () otherlv_1= 'isNotNull' )
            {
            // InternalMoba.g:4228:2: ( () otherlv_1= 'isNotNull' )
            // InternalMoba.g:4229:3: () otherlv_1= 'isNotNull'
            {
            // InternalMoba.g:4229:3: ()
            // InternalMoba.g:4230:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNotNullConstraintAccess().getMobaNotNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,65,FOLLOW_2); 

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
    // InternalMoba.g:4244:1: ruleMobaLowerBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) ;
    public final Enumerator ruleMobaLowerBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMoba.g:4250:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) )
            // InternalMoba.g:4251:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            {
            // InternalMoba.g:4251:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            int alt71=5;
            switch ( input.LA(1) ) {
            case 66:
                {
                alt71=1;
                }
                break;
            case 67:
                {
                alt71=2;
                }
                break;
            case 68:
                {
                alt71=3;
                }
                break;
            case 36:
                {
                alt71=4;
                }
                break;
            case 69:
                {
                alt71=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }

            switch (alt71) {
                case 1 :
                    // InternalMoba.g:4252:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:4252:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:4253:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4260:3: (enumLiteral_1= '0' )
                    {
                    // InternalMoba.g:4260:3: (enumLiteral_1= '0' )
                    // InternalMoba.g:4261:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,67,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:4268:3: (enumLiteral_2= '?' )
                    {
                    // InternalMoba.g:4268:3: (enumLiteral_2= '?' )
                    // InternalMoba.g:4269:4: enumLiteral_2= '?'
                    {
                    enumLiteral_2=(Token)match(input,68,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:4276:3: (enumLiteral_3= '+' )
                    {
                    // InternalMoba.g:4276:3: (enumLiteral_3= '+' )
                    // InternalMoba.g:4277:4: enumLiteral_3= '+'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:4284:3: (enumLiteral_4= '1' )
                    {
                    // InternalMoba.g:4284:3: (enumLiteral_4= '1' )
                    // InternalMoba.g:4285:4: enumLiteral_4= '1'
                    {
                    enumLiteral_4=(Token)match(input,69,FOLLOW_2); 

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
    // InternalMoba.g:4295:1: ruleMobaUpperBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) ;
    public final Enumerator ruleMobaUpperBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4301:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) )
            // InternalMoba.g:4302:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            {
            // InternalMoba.g:4302:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==66) ) {
                alt72=1;
            }
            else if ( (LA72_0==69) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalMoba.g:4303:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:4303:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:4304:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,66,FOLLOW_2); 

                    				current = grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4311:3: (enumLiteral_1= '1' )
                    {
                    // InternalMoba.g:4311:3: (enumLiteral_1= '1' )
                    // InternalMoba.g:4312:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,69,FOLLOW_2); 

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
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0001E88800478000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000288000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x000000229F800002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000229F000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x00000022BF000002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xFC00000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000140000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000100008000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000004100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000002000804000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0002000000008000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000060040000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000012000804000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0042100000008000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0042000000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0040000000008000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x003C000080000010L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000002000000010L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x008C000000000010L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x013C000080000010L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000001000000000L,0x000000000000003CL});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0200004000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000024L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000050L});

}
