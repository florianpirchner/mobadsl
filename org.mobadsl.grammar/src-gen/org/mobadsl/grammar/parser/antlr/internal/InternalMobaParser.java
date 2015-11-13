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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION", "RULE_APPLICATION_ID", "RULE_DOWNLOAD_TEMPLATE", "RULE_FQN", "RULE_GENERATOR_ID", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "SUPER_INT", "SUPER_ID", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'version'", "'='", "'{'", "'}'", "'use template'", "'active'", "'generator'", "'extensionPoint'", "':'", "'mixin'", "'datatype'", "'extends'", "'isPrimitive'", "'isArray'", "'isDate'", "'isTime'", "'isTimestamp'", "'('", "')'", "'constraints'", "','", "'enum'", "'lit'", "'const'", "'+'", "'['", "']'", "'settings'", "'cache'", "'type'", "'strategy'", "'entity'", "'index'", "'dto'", "'queue'", "'rest'", "'restCrud'", "'var'", "'lazy'", "'transient'", "'domainKey'", "'domainDescription'", "'ref'", "'cascading'", "'alias'", "'..'", "'regexp'", "'min'", "'max'", "'minLength'", "'maxLength'", "'digits'", "'isNull'", "'isNotNull'", "'*'", "'0'", "'?'", "'1'"
    };
    public static final int T__50=50;
    public static final int RULE_GENERATOR_ID=9;
    public static final int RULE_VERSION=5;
    public static final int T__59=59;
    public static final int SUPER_ID=14;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_FQN=8;
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
    public static final int RULE_INT=11;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=16;
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
    public static final int SUPER_INT=13;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=10;
    public static final int RULE_SL_COMMENT=17;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=12;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_APPLICATION_ID=6;
    public static final int T__33=33;
    public static final int T__77=77;
    public static final int T__34=34;
    public static final int T__78=78;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__73=73;
    public static final int RULE_DOWNLOAD_TEMPLATE=7;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__74=74;
    public static final int T__31=31;
    public static final int T__75=75;
    public static final int T__32=32;
    public static final int T__76=76;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=15;
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
    // InternalMoba.g:72:1: ruleMobaApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) otherlv_5= '{' ( (lv_features_6_0= ruleMobaApplicationFeature ) )* otherlv_7= '}' ) ;
    public final EObject ruleMobaApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:78:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) otherlv_5= '{' ( (lv_features_6_0= ruleMobaApplicationFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:79:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) otherlv_5= '{' ( (lv_features_6_0= ruleMobaApplicationFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:79:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) otherlv_5= '{' ( (lv_features_6_0= ruleMobaApplicationFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:80:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) otherlv_5= '{' ( (lv_features_6_0= ruleMobaApplicationFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_3); 

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
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaApplicationAccess().getVersionKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_6); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaApplicationAccess().getEqualsSignKeyword_3());
            		
            // InternalMoba.g:110:3: ( (lv_version_4_0= RULE_VERSION ) )
            // InternalMoba.g:111:4: (lv_version_4_0= RULE_VERSION )
            {
            // InternalMoba.g:111:4: (lv_version_4_0= RULE_VERSION )
            // InternalMoba.g:112:5: lv_version_4_0= RULE_VERSION
            {
            lv_version_4_0=(Token)match(input,RULE_VERSION,FOLLOW_7); 

            					newLeafNode(lv_version_4_0, grammarAccess.getMobaApplicationAccess().getVersionVERSIONTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaApplicationRule());
            					}
            					setWithLastConsumed(
            						current,
            						"version",
            						lv_version_4_0,
            						"org.mobadsl.grammar.Moba.VERSION");
            				

            }


            }

            otherlv_5=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaApplicationAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMoba.g:132:3: ( (lv_features_6_0= ruleMobaApplicationFeature ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=25 && LA1_0<=27)||LA1_0==31||LA1_0==44||LA1_0==48||LA1_0==52||(LA1_0>=54 && LA1_0<=57)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMoba.g:133:4: (lv_features_6_0= ruleMobaApplicationFeature )
            	    {
            	    // InternalMoba.g:133:4: (lv_features_6_0= ruleMobaApplicationFeature )
            	    // InternalMoba.g:134:5: lv_features_6_0= ruleMobaApplicationFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaApplicationAccess().getFeaturesMobaApplicationFeatureParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_features_6_0=ruleMobaApplicationFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaApplicationRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"org.mobadsl.grammar.Moba.MobaApplicationFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaApplicationAccess().getRightCurlyBracketKeyword_7());
            		

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
    // InternalMoba.g:159:1: entryRuleMobaApplicationFeature returns [EObject current=null] : iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF ;
    public final EObject entryRuleMobaApplicationFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaApplicationFeature = null;


        try {
            // InternalMoba.g:159:63: (iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF )
            // InternalMoba.g:160:2: iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF
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
    // InternalMoba.g:166:1: ruleMobaApplicationFeature returns [EObject current=null] : (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaService_5= ruleMobaService | this_MobaGenerator_6= ruleMobaGenerator ) ;
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
            // InternalMoba.g:172:2: ( (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaService_5= ruleMobaService | this_MobaGenerator_6= ruleMobaGenerator ) )
            // InternalMoba.g:173:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaService_5= ruleMobaService | this_MobaGenerator_6= ruleMobaGenerator )
            {
            // InternalMoba.g:173:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaService_5= ruleMobaService | this_MobaGenerator_6= ruleMobaGenerator )
            int alt2=7;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt2=1;
                }
                break;
            case 25:
                {
                alt2=2;
                }
                break;
            case 44:
                {
                alt2=3;
                }
                break;
            case 26:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==48) ) {
                    alt2=4;
                }
                else if ( (LA2_4==27) ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 48:
                {
                alt2=4;
                }
                break;
            case 52:
            case 54:
            case 55:
                {
                alt2=5;
                }
                break;
            case 56:
            case 57:
                {
                alt2=6;
                }
                break;
            case 27:
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
                    // InternalMoba.g:174:3: this_MobaDataType_0= ruleMobaDataType
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
                    // InternalMoba.g:183:3: this_MobaTemplate_1= ruleMobaTemplate
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
                    // InternalMoba.g:192:3: this_MobaConstant_2= ruleMobaConstant
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
                    // InternalMoba.g:201:3: this_MobaSettings_3= ruleMobaSettings
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
                    // InternalMoba.g:210:3: this_MobaData_4= ruleMobaData
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
                    // InternalMoba.g:219:3: this_MobaService_5= ruleMobaService
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
                    // InternalMoba.g:228:3: this_MobaGenerator_6= ruleMobaGenerator
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
    // InternalMoba.g:240:1: entryRuleMobaTemplate returns [EObject current=null] : iv_ruleMobaTemplate= ruleMobaTemplate EOF ;
    public final EObject entryRuleMobaTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTemplate = null;


        try {
            // InternalMoba.g:240:53: (iv_ruleMobaTemplate= ruleMobaTemplate EOF )
            // InternalMoba.g:241:2: iv_ruleMobaTemplate= ruleMobaTemplate EOF
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
    // InternalMoba.g:247:1: ruleMobaTemplate returns [EObject current=null] : (otherlv_0= 'use template' ( ( (otherlv_1= RULE_APPLICATION_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) ;
    public final EObject ruleMobaTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_downloadTemplate_2_0=null;


        	enterRule();

        try {
            // InternalMoba.g:253:2: ( (otherlv_0= 'use template' ( ( (otherlv_1= RULE_APPLICATION_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) )
            // InternalMoba.g:254:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_APPLICATION_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            {
            // InternalMoba.g:254:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_APPLICATION_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            // InternalMoba.g:255:3: otherlv_0= 'use template' ( ( (otherlv_1= RULE_APPLICATION_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaTemplateAccess().getUseTemplateKeyword_0());
            		
            // InternalMoba.g:259:3: ( ( (otherlv_1= RULE_APPLICATION_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_APPLICATION_ID) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_DOWNLOAD_TEMPLATE) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMoba.g:260:4: ( (otherlv_1= RULE_APPLICATION_ID ) )
                    {
                    // InternalMoba.g:260:4: ( (otherlv_1= RULE_APPLICATION_ID ) )
                    // InternalMoba.g:261:5: (otherlv_1= RULE_APPLICATION_ID )
                    {
                    // InternalMoba.g:261:5: (otherlv_1= RULE_APPLICATION_ID )
                    // InternalMoba.g:262:6: otherlv_1= RULE_APPLICATION_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaTemplateRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_APPLICATION_ID,FOLLOW_2); 

                    						newLeafNode(otherlv_1, grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationCrossReference_1_0_0());
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:274:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    {
                    // InternalMoba.g:274:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    // InternalMoba.g:275:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    {
                    // InternalMoba.g:275:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    // InternalMoba.g:276:6: lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE
                    {
                    lv_downloadTemplate_2_0=(Token)match(input,RULE_DOWNLOAD_TEMPLATE,FOLLOW_2); 

                    						newLeafNode(lv_downloadTemplate_2_0, grammarAccess.getMobaTemplateAccess().getDownloadTemplateDOWNLOAD_TEMPLATETerminalRuleCall_1_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaTemplateRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"downloadTemplate",
                    							lv_downloadTemplate_2_0,
                    							"org.mobadsl.grammar.Moba.DOWNLOAD_TEMPLATE");
                    					

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
    // $ANTLR end "ruleMobaTemplate"


    // $ANTLR start "entryRuleMobaGenerator"
    // InternalMoba.g:297:1: entryRuleMobaGenerator returns [EObject current=null] : iv_ruleMobaGenerator= ruleMobaGenerator EOF ;
    public final EObject entryRuleMobaGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGenerator = null;


        try {
            // InternalMoba.g:297:54: (iv_ruleMobaGenerator= ruleMobaGenerator EOF )
            // InternalMoba.g:298:2: iv_ruleMobaGenerator= ruleMobaGenerator EOF
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
    // InternalMoba.g:304:1: ruleMobaGenerator returns [EObject current=null] : ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) ;
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
            // InternalMoba.g:310:2: ( ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) )
            // InternalMoba.g:311:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            {
            // InternalMoba.g:311:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            // InternalMoba.g:312:3: ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}'
            {
            // InternalMoba.g:312:3: ( (lv_active_0_0= 'active' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMoba.g:313:4: (lv_active_0_0= 'active' )
                    {
                    // InternalMoba.g:313:4: (lv_active_0_0= 'active' )
                    // InternalMoba.g:314:5: lv_active_0_0= 'active'
                    {
                    lv_active_0_0=(Token)match(input,26,FOLLOW_10); 

                    					newLeafNode(lv_active_0_0, grammarAccess.getMobaGeneratorAccess().getActiveActiveKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaGeneratorRule());
                    					}
                    					setWithLastConsumed(current, "active", true, "active");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaGeneratorAccess().getGeneratorKeyword_1());
            		
            // InternalMoba.g:330:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:331:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:331:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:332:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMobaGeneratorAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaGeneratorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaGeneratorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMoba.g:352:3: ( (lv_features_4_0= ruleMobaGeneratorFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28||LA5_0==30) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMoba.g:353:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    {
            	    // InternalMoba.g:353:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    // InternalMoba.g:354:5: lv_features_4_0= ruleMobaGeneratorFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaGeneratorAccess().getFeaturesMobaGeneratorFeatureParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_11);
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
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMoba.g:379:1: entryRuleMobaGeneratorFeature returns [EObject current=null] : iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF ;
    public final EObject entryRuleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorFeature = null;


        try {
            // InternalMoba.g:379:61: (iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF )
            // InternalMoba.g:380:2: iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF
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
    // InternalMoba.g:386:1: ruleMobaGeneratorFeature returns [EObject current=null] : (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) ;
    public final EObject ruleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaGeneratorIDFeature_0 = null;

        EObject this_MobaGeneratorMixinFeature_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:392:2: ( (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) )
            // InternalMoba.g:393:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            {
            // InternalMoba.g:393:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==28) ) {
                alt6=1;
            }
            else if ( (LA6_0==30) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMoba.g:394:3: this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature
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
                    // InternalMoba.g:403:3: this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature
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
    // InternalMoba.g:415:1: entryRuleMobaGeneratorIDFeature returns [EObject current=null] : iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF ;
    public final EObject entryRuleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorIDFeature = null;


        try {
            // InternalMoba.g:415:63: (iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF )
            // InternalMoba.g:416:2: iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF
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
    // InternalMoba.g:422:1: ruleMobaGeneratorIDFeature returns [EObject current=null] : (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) ;
    public final EObject ruleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_generatorId_1_0=null;
        Token otherlv_2=null;
        Token lv_generatorVersion_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:428:2: ( (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) )
            // InternalMoba.g:429:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            {
            // InternalMoba.g:429:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            // InternalMoba.g:430:3: otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getExtensionPointKeyword_0());
            		
            // InternalMoba.g:434:3: ( (lv_generatorId_1_0= RULE_FQN ) )
            // InternalMoba.g:435:4: (lv_generatorId_1_0= RULE_FQN )
            {
            // InternalMoba.g:435:4: (lv_generatorId_1_0= RULE_FQN )
            // InternalMoba.g:436:5: lv_generatorId_1_0= RULE_FQN
            {
            lv_generatorId_1_0=(Token)match(input,RULE_FQN,FOLLOW_13); 

            					newLeafNode(lv_generatorId_1_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getGeneratorIdFQNTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaGeneratorIDFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"generatorId",
            						lv_generatorId_1_0,
            						"org.mobadsl.grammar.Moba.FQN");
            				

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaGeneratorIDFeatureAccess().getColonKeyword_2());
            		
            // InternalMoba.g:456:3: ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            // InternalMoba.g:457:4: (lv_generatorVersion_3_0= RULE_VERSION )
            {
            // InternalMoba.g:457:4: (lv_generatorVersion_3_0= RULE_VERSION )
            // InternalMoba.g:458:5: lv_generatorVersion_3_0= RULE_VERSION
            {
            lv_generatorVersion_3_0=(Token)match(input,RULE_VERSION,FOLLOW_2); 

            					newLeafNode(lv_generatorVersion_3_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getGeneratorVersionVERSIONTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaGeneratorIDFeatureRule());
            					}
            					setWithLastConsumed(
            						current,
            						"generatorVersion",
            						lv_generatorVersion_3_0,
            						"org.mobadsl.grammar.Moba.VERSION");
            				

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
    // $ANTLR end "ruleMobaGeneratorIDFeature"


    // $ANTLR start "entryRuleMobaGeneratorMixinFeature"
    // InternalMoba.g:478:1: entryRuleMobaGeneratorMixinFeature returns [EObject current=null] : iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF ;
    public final EObject entryRuleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorMixinFeature = null;


        try {
            // InternalMoba.g:478:66: (iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF )
            // InternalMoba.g:479:2: iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF
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
    // InternalMoba.g:485:1: ruleMobaGeneratorMixinFeature returns [EObject current=null] : (otherlv_0= 'mixin' ( (otherlv_1= RULE_GENERATOR_ID ) ) ) ;
    public final EObject ruleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:491:2: ( (otherlv_0= 'mixin' ( (otherlv_1= RULE_GENERATOR_ID ) ) ) )
            // InternalMoba.g:492:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_GENERATOR_ID ) ) )
            {
            // InternalMoba.g:492:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_GENERATOR_ID ) ) )
            // InternalMoba.g:493:3: otherlv_0= 'mixin' ( (otherlv_1= RULE_GENERATOR_ID ) )
            {
            otherlv_0=(Token)match(input,30,FOLLOW_14); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorMixinFeatureAccess().getMixinKeyword_0());
            		
            // InternalMoba.g:497:3: ( (otherlv_1= RULE_GENERATOR_ID ) )
            // InternalMoba.g:498:4: (otherlv_1= RULE_GENERATOR_ID )
            {
            // InternalMoba.g:498:4: (otherlv_1= RULE_GENERATOR_ID )
            // InternalMoba.g:499:5: otherlv_1= RULE_GENERATOR_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaGeneratorMixinFeatureRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_GENERATOR_ID,FOLLOW_2); 

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
    // InternalMoba.g:514:1: entryRuleMobaDataType returns [EObject current=null] : iv_ruleMobaDataType= ruleMobaDataType EOF ;
    public final EObject entryRuleMobaDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDataType = null;


        try {
            // InternalMoba.g:514:53: (iv_ruleMobaDataType= ruleMobaDataType EOF )
            // InternalMoba.g:515:2: iv_ruleMobaDataType= ruleMobaDataType EOF
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
    // InternalMoba.g:521:1: ruleMobaDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:527:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:528:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:528:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:529:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalMoba.g:533:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:534:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:534:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:535:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaDataTypeAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDataTypeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:551:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMoba.g:552:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaDataTypeAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:556:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:557:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:557:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:558:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDataTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDataTypeAccess().getSuperTypeMobaDataTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:570:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) )
            // InternalMoba.g:571:4: ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:571:4: ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) )
            // InternalMoba.g:572:5: ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            				
            // InternalMoba.g:575:5: ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* )
            // InternalMoba.g:576:6: ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )*
            {
            // InternalMoba.g:576:6: ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )*
            loop12:
            do {
                int alt12=6;
                int LA12_0 = input.LA(1);

                if ( LA12_0 == 33 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt12=1;
                }
                else if ( LA12_0 == 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt12=2;
                }
                else if ( LA12_0 >= 35 && LA12_0 <= 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt12=3;
                }
                else if ( LA12_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3) ) {
                    alt12=4;
                }
                else if ( LA12_0 == 42 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4) ) {
                    alt12=5;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMoba.g:577:4: ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) )
            	    {
            	    // InternalMoba.g:577:4: ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) )
            	    // InternalMoba.g:578:5: {...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoba.g:578:109: ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) )
            	    // InternalMoba.g:579:6: ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMoba.g:582:9: ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) )
            	    // InternalMoba.g:582:10: {...}? => ( (lv_primitive_5_0= 'isPrimitive' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:582:19: ( (lv_primitive_5_0= 'isPrimitive' ) )
            	    // InternalMoba.g:582:20: (lv_primitive_5_0= 'isPrimitive' )
            	    {
            	    // InternalMoba.g:582:20: (lv_primitive_5_0= 'isPrimitive' )
            	    // InternalMoba.g:583:10: lv_primitive_5_0= 'isPrimitive'
            	    {
            	    lv_primitive_5_0=(Token)match(input,33,FOLLOW_16); 

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
            	    // InternalMoba.g:600:4: ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:600:4: ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:601:5: {...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoba.g:601:109: ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:602:6: ({...}? => ( (lv_array_6_0= 'isArray' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMoba.g:605:9: ({...}? => ( (lv_array_6_0= 'isArray' ) ) )
            	    // InternalMoba.g:605:10: {...}? => ( (lv_array_6_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:605:19: ( (lv_array_6_0= 'isArray' ) )
            	    // InternalMoba.g:605:20: (lv_array_6_0= 'isArray' )
            	    {
            	    // InternalMoba.g:605:20: (lv_array_6_0= 'isArray' )
            	    // InternalMoba.g:606:10: lv_array_6_0= 'isArray'
            	    {
            	    lv_array_6_0=(Token)match(input,34,FOLLOW_16); 

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
            	    // InternalMoba.g:623:4: ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) )
            	    {
            	    // InternalMoba.g:623:4: ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) )
            	    // InternalMoba.g:624:5: {...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoba.g:624:109: ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) )
            	    // InternalMoba.g:625:6: ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMoba.g:628:9: ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) )
            	    // InternalMoba.g:628:10: {...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:628:19: ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? )
            	    // InternalMoba.g:628:20: ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )?
            	    {
            	    // InternalMoba.g:628:20: ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) )
            	    int alt8=3;
            	    switch ( input.LA(1) ) {
            	    case 35:
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
            	            // InternalMoba.g:629:10: ( (lv_date_7_0= 'isDate' ) )
            	            {
            	            // InternalMoba.g:629:10: ( (lv_date_7_0= 'isDate' ) )
            	            // InternalMoba.g:630:11: (lv_date_7_0= 'isDate' )
            	            {
            	            // InternalMoba.g:630:11: (lv_date_7_0= 'isDate' )
            	            // InternalMoba.g:631:12: lv_date_7_0= 'isDate'
            	            {
            	            lv_date_7_0=(Token)match(input,35,FOLLOW_17); 

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
            	            // InternalMoba.g:644:10: ( (lv_time_8_0= 'isTime' ) )
            	            {
            	            // InternalMoba.g:644:10: ( (lv_time_8_0= 'isTime' ) )
            	            // InternalMoba.g:645:11: (lv_time_8_0= 'isTime' )
            	            {
            	            // InternalMoba.g:645:11: (lv_time_8_0= 'isTime' )
            	            // InternalMoba.g:646:12: lv_time_8_0= 'isTime'
            	            {
            	            lv_time_8_0=(Token)match(input,36,FOLLOW_17); 

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
            	            // InternalMoba.g:659:10: ( (lv_timestamp_9_0= 'isTimestamp' ) )
            	            {
            	            // InternalMoba.g:659:10: ( (lv_timestamp_9_0= 'isTimestamp' ) )
            	            // InternalMoba.g:660:11: (lv_timestamp_9_0= 'isTimestamp' )
            	            {
            	            // InternalMoba.g:660:11: (lv_timestamp_9_0= 'isTimestamp' )
            	            // InternalMoba.g:661:12: lv_timestamp_9_0= 'isTimestamp'
            	            {
            	            lv_timestamp_9_0=(Token)match(input,37,FOLLOW_17); 

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

            	    // InternalMoba.g:674:9: (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )?
            	    int alt10=2;
            	    int LA10_0 = input.LA(1);

            	    if ( (LA10_0==38) ) {
            	        alt10=1;
            	    }
            	    switch (alt10) {
            	        case 1 :
            	            // InternalMoba.g:675:10: otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')'
            	            {
            	            otherlv_10=(Token)match(input,38,FOLLOW_18); 

            	            										newLeafNode(otherlv_10, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_2_1_0());
            	            									
            	            // InternalMoba.g:679:10: ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) )
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
            	                    // InternalMoba.g:680:11: ( (lv_dateFormatString_11_0= RULE_STRING ) )
            	                    {
            	                    // InternalMoba.g:680:11: ( (lv_dateFormatString_11_0= RULE_STRING ) )
            	                    // InternalMoba.g:681:12: (lv_dateFormatString_11_0= RULE_STRING )
            	                    {
            	                    // InternalMoba.g:681:12: (lv_dateFormatString_11_0= RULE_STRING )
            	                    // InternalMoba.g:682:13: lv_dateFormatString_11_0= RULE_STRING
            	                    {
            	                    lv_dateFormatString_11_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

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
            	                    // InternalMoba.g:699:11: ( (otherlv_12= RULE_ID ) )
            	                    {
            	                    // InternalMoba.g:699:11: ( (otherlv_12= RULE_ID ) )
            	                    // InternalMoba.g:700:12: (otherlv_12= RULE_ID )
            	                    {
            	                    // InternalMoba.g:700:12: (otherlv_12= RULE_ID )
            	                    // InternalMoba.g:701:13: otherlv_12= RULE_ID
            	                    {

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    													}
            	                    												
            	                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_19); 

            	                    													newLeafNode(otherlv_12, grammarAccess.getMobaDataTypeAccess().getDateFormatConstMobaConstantCrossReference_3_2_1_1_1_0());
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,39,FOLLOW_16); 

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
            	    // InternalMoba.g:724:4: ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:724:4: ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) )
            	    // InternalMoba.g:725:5: {...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMoba.g:725:109: ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) )
            	    // InternalMoba.g:726:6: ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMoba.g:729:9: ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) )
            	    // InternalMoba.g:729:10: {...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:729:19: (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' )
            	    // InternalMoba.g:729:20: otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')'
            	    {
            	    otherlv_14=(Token)match(input,40,FOLLOW_20); 

            	    									newLeafNode(otherlv_14, grammarAccess.getMobaDataTypeAccess().getConstraintsKeyword_3_3_0());
            	    								
            	    otherlv_15=(Token)match(input,38,FOLLOW_21); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_3_1());
            	    								
            	    // InternalMoba.g:737:9: ( (lv_constraints_16_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:738:10: (lv_constraints_16_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:738:10: (lv_constraints_16_0= ruleMobaConstraint )
            	    // InternalMoba.g:739:11: lv_constraints_16_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_22);
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

            	    // InternalMoba.g:756:9: (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )*
            	    loop11:
            	    do {
            	        int alt11=2;
            	        int LA11_0 = input.LA(1);

            	        if ( (LA11_0==41) ) {
            	            alt11=1;
            	        }


            	        switch (alt11) {
            	    	case 1 :
            	    	    // InternalMoba.g:757:10: otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,41,FOLLOW_21); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getMobaDataTypeAccess().getCommaKeyword_3_3_3_0());
            	    	    									
            	    	    // InternalMoba.g:761:10: ( (lv_constraints_18_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:762:11: (lv_constraints_18_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:762:11: (lv_constraints_18_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:763:12: lv_constraints_18_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_22);
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

            	    otherlv_19=(Token)match(input,39,FOLLOW_16); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_3_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:791:4: ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) )
            	    {
            	    // InternalMoba.g:791:4: ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) )
            	    // InternalMoba.g:792:5: {...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMoba.g:792:109: ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) )
            	    // InternalMoba.g:793:6: ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMoba.g:796:9: ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) )
            	    // InternalMoba.g:796:10: {...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:796:19: ( (lv_enumAST_20_0= ruleMobaEnum ) )
            	    // InternalMoba.g:796:20: (lv_enumAST_20_0= ruleMobaEnum )
            	    {
            	    // InternalMoba.g:796:20: (lv_enumAST_20_0= ruleMobaEnum )
            	    // InternalMoba.g:797:10: lv_enumAST_20_0= ruleMobaEnum
            	    {

            	    										newCompositeNode(grammarAccess.getMobaDataTypeAccess().getEnumASTMobaEnumParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_16);
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

            // InternalMoba.g:826:3: (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoba.g:827:4: this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:843:1: entryRuleMobaEnum returns [EObject current=null] : iv_ruleMobaEnum= ruleMobaEnum EOF ;
    public final EObject entryRuleMobaEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnum = null;


        try {
            // InternalMoba.g:843:49: (iv_ruleMobaEnum= ruleMobaEnum EOF )
            // InternalMoba.g:844:2: iv_ruleMobaEnum= ruleMobaEnum EOF
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
    // InternalMoba.g:850:1: ruleMobaEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' ) ;
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
            // InternalMoba.g:856:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' ) )
            // InternalMoba.g:857:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' )
            {
            // InternalMoba.g:857:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' )
            // InternalMoba.g:858:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,42,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEnumAccess().getEnumKeyword_0());
            		
            // InternalMoba.g:862:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:863:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:863:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:864:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaEnumAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEnumRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMoba.g:884:3: ( (lv_literals_3_0= ruleMobaEnumLiteral ) )
            // InternalMoba.g:885:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            {
            // InternalMoba.g:885:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            // InternalMoba.g:886:5: lv_literals_3_0= ruleMobaEnumLiteral
            {

            					newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_24);
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

            // InternalMoba.g:903:3: (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMoba.g:904:4: otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) )
            	    {
            	    otherlv_4=(Token)match(input,41,FOLLOW_23); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMobaEnumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMoba.g:908:4: ( (lv_literals_5_0= ruleMobaEnumLiteral ) )
            	    // InternalMoba.g:909:5: (lv_literals_5_0= ruleMobaEnumLiteral )
            	    {
            	    // InternalMoba.g:909:5: (lv_literals_5_0= ruleMobaEnumLiteral )
            	    // InternalMoba.g:910:6: lv_literals_5_0= ruleMobaEnumLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_24);
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

            otherlv_6=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMoba.g:936:1: entryRuleMobaEnumLiteral returns [EObject current=null] : iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF ;
    public final EObject entryRuleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnumLiteral = null;


        try {
            // InternalMoba.g:936:56: (iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF )
            // InternalMoba.g:937:2: iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF
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
    // InternalMoba.g:943:1: ruleMobaEnumLiteral returns [EObject current=null] : (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:949:2: ( (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalMoba.g:950:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:950:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalMoba.g:951:3: otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEnumLiteralAccess().getLitKeyword_0());
            		
            // InternalMoba.g:955:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:956:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:956:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:957:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaEnumLiteralAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumLiteralAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,38,FOLLOW_25); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaEnumLiteralAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMoba.g:981:3: ( (lv_literal_4_0= RULE_STRING ) )
            // InternalMoba.g:982:4: (lv_literal_4_0= RULE_STRING )
            {
            // InternalMoba.g:982:4: (lv_literal_4_0= RULE_STRING )
            // InternalMoba.g:983:5: lv_literal_4_0= RULE_STRING
            {
            lv_literal_4_0=(Token)match(input,RULE_STRING,FOLLOW_26); 

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

            otherlv_5=(Token)match(input,41,FOLLOW_27); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_5());
            		
            // InternalMoba.g:1003:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalMoba.g:1004:4: (lv_value_6_0= RULE_INT )
            {
            // InternalMoba.g:1004:4: (lv_value_6_0= RULE_INT )
            // InternalMoba.g:1005:5: lv_value_6_0= RULE_INT
            {
            lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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

            otherlv_7=(Token)match(input,39,FOLLOW_2); 

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
    // InternalMoba.g:1029:1: entryRuleMobaConstant returns [EObject current=null] : iv_ruleMobaConstant= ruleMobaConstant EOF ;
    public final EObject entryRuleMobaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstant = null;


        try {
            // InternalMoba.g:1029:53: (iv_ruleMobaConstant= ruleMobaConstant EOF )
            // InternalMoba.g:1030:2: iv_ruleMobaConstant= ruleMobaConstant EOF
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
    // InternalMoba.g:1036:1: ruleMobaConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_valueAST_3_0 = null;

        EObject this_MobaPropertiesAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:1042:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:1043:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:1043:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:1044:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,44,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaConstantAccess().getConstKeyword_0());
            		
            // InternalMoba.g:1048:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1049:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1049:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1050:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaConstantAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaConstantRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_28); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaConstantAccess().getEqualsSignKeyword_2());
            		
            // InternalMoba.g:1070:3: ( (lv_valueAST_3_0= ruleMobaConstantValue ) )
            // InternalMoba.g:1071:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            {
            // InternalMoba.g:1071:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            // InternalMoba.g:1072:5: lv_valueAST_3_0= ruleMobaConstantValue
            {

            					newCompositeNode(grammarAccess.getMobaConstantAccess().getValueASTMobaConstantValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_29);
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

            // InternalMoba.g:1089:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==46) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMoba.g:1090:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:1106:1: entryRuleMobaConstantValue returns [EObject current=null] : iv_ruleMobaConstantValue= ruleMobaConstantValue EOF ;
    public final EObject entryRuleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstantValue = null;


        try {
            // InternalMoba.g:1106:58: (iv_ruleMobaConstantValue= ruleMobaConstantValue EOF )
            // InternalMoba.g:1107:2: iv_ruleMobaConstantValue= ruleMobaConstantValue EOF
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
    // InternalMoba.g:1113:1: ruleMobaConstantValue returns [EObject current=null] : ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )? ) ;
    public final EObject ruleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token lv_valueInt_1_0=null;
        Token lv_valueDouble_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_tail_5_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1119:2: ( ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )? ) )
            // InternalMoba.g:1120:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )? )
            {
            // InternalMoba.g:1120:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )? )
            // InternalMoba.g:1121:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )?
            {
            // InternalMoba.g:1121:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt16=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt16=1;
                }
                break;
            case RULE_INT:
                {
                alt16=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt16=3;
                }
                break;
            case RULE_ID:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // InternalMoba.g:1122:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1122:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:1123:5: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:1123:5: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:1124:6: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_30); 

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
                    // InternalMoba.g:1141:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    {
                    // InternalMoba.g:1141:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    // InternalMoba.g:1142:5: (lv_valueInt_1_0= RULE_INT )
                    {
                    // InternalMoba.g:1142:5: (lv_valueInt_1_0= RULE_INT )
                    // InternalMoba.g:1143:6: lv_valueInt_1_0= RULE_INT
                    {
                    lv_valueInt_1_0=(Token)match(input,RULE_INT,FOLLOW_30); 

                    						newLeafNode(lv_valueInt_1_0, grammarAccess.getMobaConstantValueAccess().getValueIntINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaConstantValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueInt",
                    							lv_valueInt_1_0,
                    							"org.mobadsl.grammar.Moba.INT");
                    					

                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:1160:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:1160:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:1161:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:1161:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    // InternalMoba.g:1162:6: lv_valueDouble_2_0= RULE_DOUBLE
                    {
                    lv_valueDouble_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_30); 

                    						newLeafNode(lv_valueDouble_2_0, grammarAccess.getMobaConstantValueAccess().getValueDoubleDOUBLETerminalRuleCall_0_2_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaConstantValueRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"valueDouble",
                    							lv_valueDouble_2_0,
                    							"org.mobadsl.grammar.Moba.DOUBLE");
                    					

                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:1179:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:1179:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1180:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1180:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1181:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaConstantValueRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_30); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaConstantValueAccess().getValueConstMobaConstantCrossReference_0_3_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1193:3: (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==45) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalMoba.g:1194:4: otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) )
                    {
                    otherlv_4=(Token)match(input,45,FOLLOW_28); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaConstantValueAccess().getPlusSignKeyword_1_0());
                    			
                    // InternalMoba.g:1198:4: ( (lv_tail_5_0= ruleMobaConstantValue ) )
                    // InternalMoba.g:1199:5: (lv_tail_5_0= ruleMobaConstantValue )
                    {
                    // InternalMoba.g:1199:5: (lv_tail_5_0= ruleMobaConstantValue )
                    // InternalMoba.g:1200:6: lv_tail_5_0= ruleMobaConstantValue
                    {

                    						newCompositeNode(grammarAccess.getMobaConstantValueAccess().getTailMobaConstantValueParserRuleCall_1_1_0());
                    					
                    pushFollow(FOLLOW_2);
                    lv_tail_5_0=ruleMobaConstantValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getMobaConstantValueRule());
                    						}
                    						set(
                    							current,
                    							"tail",
                    							lv_tail_5_0,
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
    // InternalMoba.g:1223:1: ruleMobaPropertiesAble[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleMobaPropertiesAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1229:2: ( (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' ) )
            // InternalMoba.g:1230:2: (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' )
            {
            // InternalMoba.g:1230:2: (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' )
            // InternalMoba.g:1231:3: otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_18); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPropertiesAbleAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoba.g:1235:3: ( (lv_properties_1_0= ruleMobaProperty ) )
            // InternalMoba.g:1236:4: (lv_properties_1_0= ruleMobaProperty )
            {
            // InternalMoba.g:1236:4: (lv_properties_1_0= ruleMobaProperty )
            // InternalMoba.g:1237:5: lv_properties_1_0= ruleMobaProperty
            {

            					newCompositeNode(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_31);
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

            // InternalMoba.g:1254:3: (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==41) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalMoba.g:1255:4: otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) )
            	    {
            	    otherlv_2=(Token)match(input,41,FOLLOW_18); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMobaPropertiesAbleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMoba.g:1259:4: ( (lv_properties_3_0= ruleMobaProperty ) )
            	    // InternalMoba.g:1260:5: (lv_properties_3_0= ruleMobaProperty )
            	    {
            	    // InternalMoba.g:1260:5: (lv_properties_3_0= ruleMobaProperty )
            	    // InternalMoba.g:1261:6: lv_properties_3_0= ruleMobaProperty
            	    {

            	    						newCompositeNode(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesMobaPropertyParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_31);
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

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

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
    // InternalMoba.g:1287:1: entryRuleMobaProperty returns [EObject current=null] : iv_ruleMobaProperty= ruleMobaProperty EOF ;
    public final EObject entryRuleMobaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProperty = null;


        try {
            // InternalMoba.g:1287:53: (iv_ruleMobaProperty= ruleMobaProperty EOF )
            // InternalMoba.g:1288:2: iv_ruleMobaProperty= ruleMobaProperty EOF
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
    // InternalMoba.g:1294:1: ruleMobaProperty returns [EObject current=null] : ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaProperty() throws RecognitionException {
        EObject current = null;

        Token lv_keyString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_valueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:1300:2: ( ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalMoba.g:1301:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalMoba.g:1301:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalMoba.g:1302:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalMoba.g:1302:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
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
                    // InternalMoba.g:1303:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1303:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    // InternalMoba.g:1304:5: (lv_keyString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:1304:5: (lv_keyString_0_0= RULE_STRING )
                    // InternalMoba.g:1305:6: lv_keyString_0_0= RULE_STRING
                    {
                    lv_keyString_0_0=(Token)match(input,RULE_STRING,FOLLOW_5); 

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
                    // InternalMoba.g:1322:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalMoba.g:1322:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoba.g:1323:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoba.g:1323:5: (otherlv_1= RULE_ID )
                    // InternalMoba.g:1324:6: otherlv_1= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaPropertyRule());
                    						}
                    					
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_5); 

                    						newLeafNode(otherlv_1, grammarAccess.getMobaPropertyAccess().getKeyConstMobaConstantCrossReference_0_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:1340:3: ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
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
                    // InternalMoba.g:1341:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1341:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    // InternalMoba.g:1342:5: (lv_valueString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:1342:5: (lv_valueString_3_0= RULE_STRING )
                    // InternalMoba.g:1343:6: lv_valueString_3_0= RULE_STRING
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
                    // InternalMoba.g:1360:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMoba.g:1360:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMoba.g:1361:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMoba.g:1361:5: (otherlv_4= RULE_ID )
                    // InternalMoba.g:1362:6: otherlv_4= RULE_ID
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
    // InternalMoba.g:1378:1: entryRuleMobaData returns [EObject current=null] : iv_ruleMobaData= ruleMobaData EOF ;
    public final EObject entryRuleMobaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaData = null;


        try {
            // InternalMoba.g:1378:49: (iv_ruleMobaData= ruleMobaData EOF )
            // InternalMoba.g:1379:2: iv_ruleMobaData= ruleMobaData EOF
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
    // InternalMoba.g:1385:1: ruleMobaData returns [EObject current=null] : (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) ;
    public final EObject ruleMobaData() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntity_0 = null;

        EObject this_MobaDto_1 = null;

        EObject this_MobaQueue_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1391:2: ( (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) )
            // InternalMoba.g:1392:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            {
            // InternalMoba.g:1392:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 52:
                {
                alt21=1;
                }
                break;
            case 54:
                {
                alt21=2;
                }
                break;
            case 55:
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
                    // InternalMoba.g:1393:3: this_MobaEntity_0= ruleMobaEntity
                    {

                    			newCompositeNode(grammarAccess.getMobaDataAccess().getMobaEntityParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaEntity_0=ruleMobaEntity();

                    state._fsp--;


                    			current = this_MobaEntity_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:1402:3: this_MobaDto_1= ruleMobaDto
                    {

                    			newCompositeNode(grammarAccess.getMobaDataAccess().getMobaDtoParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaDto_1=ruleMobaDto();

                    state._fsp--;


                    			current = this_MobaDto_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMoba.g:1411:3: this_MobaQueue_2= ruleMobaQueue
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
    // InternalMoba.g:1423:1: entryRuleMobaSettings returns [EObject current=null] : iv_ruleMobaSettings= ruleMobaSettings EOF ;
    public final EObject entryRuleMobaSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettings = null;


        try {
            // InternalMoba.g:1423:53: (iv_ruleMobaSettings= ruleMobaSettings EOF )
            // InternalMoba.g:1424:2: iv_ruleMobaSettings= ruleMobaSettings EOF
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
    // InternalMoba.g:1430:1: ruleMobaSettings returns [EObject current=null] : ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) ;
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
            // InternalMoba.g:1436:2: ( ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:1437:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:1437:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:1438:3: () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}'
            {
            // InternalMoba.g:1438:3: ()
            // InternalMoba.g:1439:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0(),
            					current);
            			

            }

            // InternalMoba.g:1445:3: ( (lv_active_1_0= 'active' ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==26) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalMoba.g:1446:4: (lv_active_1_0= 'active' )
                    {
                    // InternalMoba.g:1446:4: (lv_active_1_0= 'active' )
                    // InternalMoba.g:1447:5: lv_active_1_0= 'active'
                    {
                    lv_active_1_0=(Token)match(input,26,FOLLOW_32); 

                    					newLeafNode(lv_active_1_0, grammarAccess.getMobaSettingsAccess().getActiveActiveKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaSettingsRule());
                    					}
                    					setWithLastConsumed(current, "active", true, "active");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,48,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaSettingsAccess().getSettingsKeyword_2());
            		
            // InternalMoba.g:1463:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMoba.g:1464:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMoba.g:1464:4: (lv_name_3_0= RULE_ID )
            // InternalMoba.g:1465:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_3_0, grammarAccess.getMobaSettingsAccess().getNameIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_3_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:1481:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoba.g:1482:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaSettingsAccess().getExtendsKeyword_4_0());
                    			
                    // InternalMoba.g:1486:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMoba.g:1487:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMoba.g:1487:5: (otherlv_5= RULE_ID )
                    // InternalMoba.g:1488:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaSettingsRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_5, grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1500:3: (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==46) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoba.g:1501:4: this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaSettingsRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaSettingsAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
                    pushFollow(FOLLOW_7);
                    this_MobaPropertiesAble_6=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_35); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMoba.g:1517:3: ( (lv_features_8_0= ruleMobaSettingsFeature ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==58) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMoba.g:1518:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    {
            	    // InternalMoba.g:1518:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    // InternalMoba.g:1519:5: lv_features_8_0= ruleMobaSettingsFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaSettingsAccess().getFeaturesMobaSettingsFeatureParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_35);
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

            otherlv_9=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMoba.g:1544:1: entryRuleMobaCache returns [EObject current=null] : iv_ruleMobaCache= ruleMobaCache EOF ;
    public final EObject entryRuleMobaCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaCache = null;


        try {
            // InternalMoba.g:1544:50: (iv_ruleMobaCache= ruleMobaCache EOF )
            // InternalMoba.g:1545:2: iv_ruleMobaCache= ruleMobaCache EOF
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
    // InternalMoba.g:1551:1: ruleMobaCache returns [EObject current=null] : ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) ;
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
            // InternalMoba.g:1557:2: ( ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) )
            // InternalMoba.g:1558:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            {
            // InternalMoba.g:1558:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            // InternalMoba.g:1559:3: () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            {
            // InternalMoba.g:1559:3: ()
            // InternalMoba.g:1560:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaCacheAccess().getMobaCacheAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,49,FOLLOW_36); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaCacheAccess().getCacheKeyword_1());
            		
            // InternalMoba.g:1570:3: (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==38) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalMoba.g:1571:4: otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')'
                    {
                    otherlv_2=(Token)match(input,38,FOLLOW_37); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoba.g:1575:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) )
                    // InternalMoba.g:1576:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    {
                    // InternalMoba.g:1576:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    // InternalMoba.g:1577:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    					
                    // InternalMoba.g:1580:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    // InternalMoba.g:1581:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    {
                    // InternalMoba.g:1581:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    loop28:
                    do {
                        int alt28=3;
                        int LA28_0 = input.LA(1);

                        if ( LA28_0 == 50 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                            alt28=1;
                        }
                        else if ( LA28_0 == 51 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                            alt28=2;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMoba.g:1582:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:1582:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:1583:6: {...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0)");
                    	    }
                    	    // InternalMoba.g:1583:109: ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:1584:7: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0);
                    	    						
                    	    // InternalMoba.g:1587:10: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:1587:11: {...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:1587:20: (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    // InternalMoba.g:1587:21: otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    	    {
                    	    otherlv_4=(Token)match(input,50,FOLLOW_5); 

                    	    										newLeafNode(otherlv_4, grammarAccess.getMobaCacheAccess().getTypeKeyword_2_1_0_0());
                    	    									
                    	    otherlv_5=(Token)match(input,22,FOLLOW_18); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_0_1());
                    	    									
                    	    // InternalMoba.g:1595:10: ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
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
                    	            // InternalMoba.g:1596:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:1596:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            // InternalMoba.g:1597:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:1597:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            // InternalMoba.g:1598:13: lv_cacheTypeString_6_0= RULE_STRING
                    	            {
                    	            lv_cacheTypeString_6_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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
                    	            // InternalMoba.g:1615:11: ( (otherlv_7= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:1615:11: ( (otherlv_7= RULE_ID ) )
                    	            // InternalMoba.g:1616:12: (otherlv_7= RULE_ID )
                    	            {
                    	            // InternalMoba.g:1616:12: (otherlv_7= RULE_ID )
                    	            // InternalMoba.g:1617:13: otherlv_7= RULE_ID
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_37); 

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
                    	    // InternalMoba.g:1635:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:1635:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:1636:6: {...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1)");
                    	    }
                    	    // InternalMoba.g:1636:109: ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:1637:7: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1);
                    	    						
                    	    // InternalMoba.g:1640:10: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:1640:11: {...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:1640:20: (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    // InternalMoba.g:1640:21: otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,51,FOLLOW_5); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getMobaCacheAccess().getStrategyKeyword_2_1_1_0());
                    	    									
                    	    otherlv_9=(Token)match(input,22,FOLLOW_18); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_1_1());
                    	    									
                    	    // InternalMoba.g:1648:10: ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
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
                    	            // InternalMoba.g:1649:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:1649:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            // InternalMoba.g:1650:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:1650:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            // InternalMoba.g:1651:13: lv_cacheStrategyString_10_0= RULE_STRING
                    	            {
                    	            lv_cacheStrategyString_10_0=(Token)match(input,RULE_STRING,FOLLOW_37); 

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
                    	            // InternalMoba.g:1668:11: ( (otherlv_11= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:1668:11: ( (otherlv_11= RULE_ID ) )
                    	            // InternalMoba.g:1669:12: (otherlv_11= RULE_ID )
                    	            {
                    	            // InternalMoba.g:1669:12: (otherlv_11= RULE_ID )
                    	            // InternalMoba.g:1670:13: otherlv_11= RULE_ID
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_37); 

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

                    otherlv_12=(Token)match(input,39,FOLLOW_2); 

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


    // $ANTLR start "entryRuleMobaEntity"
    // InternalMoba.g:1704:1: entryRuleMobaEntity returns [EObject current=null] : iv_ruleMobaEntity= ruleMobaEntity EOF ;
    public final EObject entryRuleMobaEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntity = null;


        try {
            // InternalMoba.g:1704:51: (iv_ruleMobaEntity= ruleMobaEntity EOF )
            // InternalMoba.g:1705:2: iv_ruleMobaEntity= ruleMobaEntity EOF
            {
             newCompositeNode(grammarAccess.getMobaEntityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntity=ruleMobaEntity();

            state._fsp--;

             current =iv_ruleMobaEntity; 
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
    // $ANTLR end "entryRuleMobaEntity"


    // $ANTLR start "ruleMobaEntity"
    // InternalMoba.g:1711:1: ruleMobaEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' ) ;
    public final EObject ruleMobaEntity() throws RecognitionException {
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
            // InternalMoba.g:1717:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' ) )
            // InternalMoba.g:1718:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' )
            {
            // InternalMoba.g:1718:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' )
            // InternalMoba.g:1719:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAccess().getEntityKeyword_0());
            		
            // InternalMoba.g:1723:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1724:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1724:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1725:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_38); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaEntityAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:1741:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) )
            // InternalMoba.g:1742:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:1742:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            // InternalMoba.g:1743:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            				
            // InternalMoba.g:1746:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            // InternalMoba.g:1747:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            {
            // InternalMoba.g:1747:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            loop30:
            do {
                int alt30=3;
                int LA30_0 = input.LA(1);

                if ( LA30_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
                    alt30=1;
                }
                else if ( LA30_0 == 49 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
                    alt30=2;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalMoba.g:1748:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1748:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:1749:5: {...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoba.g:1749:107: ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:1750:6: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMoba.g:1753:9: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalMoba.g:1753:10: {...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:1753:19: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalMoba.g:1753:20: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,32,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMobaEntityAccess().getExtendsKeyword_2_0_0());
            	    								
            	    // InternalMoba.g:1757:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalMoba.g:1758:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMoba.g:1758:10: (otherlv_4= RULE_ID )
            	    // InternalMoba.g:1759:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaEntityRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    											newLeafNode(otherlv_4, grammarAccess.getMobaEntityAccess().getSuperTypeMobaEntityCrossReference_2_0_1_0());
            	    										

            	    }


            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:1776:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    {
            	    // InternalMoba.g:1776:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    // InternalMoba.g:1777:5: {...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoba.g:1777:107: ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    // InternalMoba.g:1778:6: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMoba.g:1781:9: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    // InternalMoba.g:1781:10: {...}? => ( (lv_cache_5_0= ruleMobaCache ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:1781:19: ( (lv_cache_5_0= ruleMobaCache ) )
            	    // InternalMoba.g:1781:20: (lv_cache_5_0= ruleMobaCache )
            	    {
            	    // InternalMoba.g:1781:20: (lv_cache_5_0= ruleMobaCache )
            	    // InternalMoba.g:1782:10: lv_cache_5_0= ruleMobaCache
            	    {

            	    										newCompositeNode(grammarAccess.getMobaEntityAccess().getCacheMobaCacheParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_38);
            	    lv_cache_5_0=ruleMobaCache();

            	    state._fsp--;


            	    										if (current==null) {
            	    											current = createModelElementForParent(grammarAccess.getMobaEntityRule());
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

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            				

            }

            // InternalMoba.g:1811:3: (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==46) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoba.g:1812:4: this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaEntityRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaEntityAccess().getMobaPropertiesAbleParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_7);
                    this_MobaPropertiesAble_6=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_6;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_7=(Token)match(input,23,FOLLOW_39); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:1828:3: ( (lv_features_8_0= ruleMobaEntityFeature ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==58||LA32_0==63) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalMoba.g:1829:4: (lv_features_8_0= ruleMobaEntityFeature )
            	    {
            	    // InternalMoba.g:1829:4: (lv_features_8_0= ruleMobaEntityFeature )
            	    // InternalMoba.g:1830:5: lv_features_8_0= ruleMobaEntityFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaEntityAccess().getFeaturesMobaEntityFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_39);
            	    lv_features_8_0=ruleMobaEntityFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaEntityRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_8_0,
            	    						"org.mobadsl.grammar.Moba.MobaEntityFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            // InternalMoba.g:1847:3: ( (lv_index_9_0= ruleMobaEntityIndex ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==53) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalMoba.g:1848:4: (lv_index_9_0= ruleMobaEntityIndex )
                    {
                    // InternalMoba.g:1848:4: (lv_index_9_0= ruleMobaEntityIndex )
                    // InternalMoba.g:1849:5: lv_index_9_0= ruleMobaEntityIndex
                    {

                    					newCompositeNode(grammarAccess.getMobaEntityAccess().getIndexMobaEntityIndexParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_40);
                    lv_index_9_0=ruleMobaEntityIndex();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getMobaEntityRule());
                    					}
                    					set(
                    						current,
                    						"index",
                    						lv_index_9_0,
                    						"org.mobadsl.grammar.Moba.MobaEntityIndex");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getMobaEntityAccess().getRightCurlyBracketKeyword_7());
            		

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
    // $ANTLR end "ruleMobaEntity"


    // $ANTLR start "entryRuleMobaEntityIndex"
    // InternalMoba.g:1874:1: entryRuleMobaEntityIndex returns [EObject current=null] : iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF ;
    public final EObject entryRuleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityIndex = null;


        try {
            // InternalMoba.g:1874:56: (iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF )
            // InternalMoba.g:1875:2: iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF
            {
             newCompositeNode(grammarAccess.getMobaEntityIndexRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityIndex=ruleMobaEntityIndex();

            state._fsp--;

             current =iv_ruleMobaEntityIndex; 
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
    // $ANTLR end "entryRuleMobaEntityIndex"


    // $ANTLR start "ruleMobaEntityIndex"
    // InternalMoba.g:1881:1: ruleMobaEntityIndex returns [EObject current=null] : (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) ;
    public final EObject ruleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:1887:2: ( (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) )
            // InternalMoba.g:1888:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            {
            // InternalMoba.g:1888:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            // InternalMoba.g:1889:3: otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityIndexAccess().getIndexKeyword_0());
            		
            // InternalMoba.g:1893:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:1894:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:1894:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:1895:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityIndexRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_26); 

            					newLeafNode(otherlv_1, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_1_0());
            				

            }


            }

            // InternalMoba.g:1906:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            // InternalMoba.g:1907:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )*
            {
            otherlv_2=(Token)match(input,41,FOLLOW_41); 

            				newLeafNode(otherlv_2, grammarAccess.getMobaEntityIndexAccess().getCommaKeyword_2_0());
            			
            // InternalMoba.g:1911:4: ( (otherlv_3= RULE_ID ) )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==RULE_ID) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMoba.g:1912:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMoba.g:1912:5: (otherlv_3= RULE_ID )
            	    // InternalMoba.g:1913:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMobaEntityIndexRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_41); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_2_1_0());
            	    					

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
    // $ANTLR end "ruleMobaEntityIndex"


    // $ANTLR start "entryRuleMobaDto"
    // InternalMoba.g:1929:1: entryRuleMobaDto returns [EObject current=null] : iv_ruleMobaDto= ruleMobaDto EOF ;
    public final EObject entryRuleMobaDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDto = null;


        try {
            // InternalMoba.g:1929:48: (iv_ruleMobaDto= ruleMobaDto EOF )
            // InternalMoba.g:1930:2: iv_ruleMobaDto= ruleMobaDto EOF
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
    // InternalMoba.g:1936:1: ruleMobaDto returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' ) ;
    public final EObject ruleMobaDto() throws RecognitionException {
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
            // InternalMoba.g:1942:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:1943:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:1943:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:1944:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAccess().getDtoKeyword_0());
            		
            // InternalMoba.g:1948:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1949:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1949:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1950:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaDtoAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:1966:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==32) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalMoba.g:1967:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaDtoAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:1971:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1972:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1972:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1973:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDtoRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1985:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==46) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMoba.g:1986:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaDtoRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaDtoAccess().getMobaPropertiesAbleParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_7);
                    this_MobaPropertiesAble_4=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_42); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaDtoAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:2002:3: ( (lv_features_6_0= ruleMobaDtoFeature ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==58||LA37_0==63) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalMoba.g:2003:4: (lv_features_6_0= ruleMobaDtoFeature )
            	    {
            	    // InternalMoba.g:2003:4: (lv_features_6_0= ruleMobaDtoFeature )
            	    // InternalMoba.g:2004:5: lv_features_6_0= ruleMobaDtoFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaDtoAccess().getFeaturesMobaDtoFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_42);
            	    lv_features_6_0=ruleMobaDtoFeature();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMobaDtoRule());
            	    					}
            	    					add(
            	    						current,
            	    						"features",
            	    						lv_features_6_0,
            	    						"org.mobadsl.grammar.Moba.MobaDtoFeature");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaDtoAccess().getRightCurlyBracketKeyword_6());
            		

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


    // $ANTLR start "entryRuleMobaQueue"
    // InternalMoba.g:2029:1: entryRuleMobaQueue returns [EObject current=null] : iv_ruleMobaQueue= ruleMobaQueue EOF ;
    public final EObject entryRuleMobaQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueue = null;


        try {
            // InternalMoba.g:2029:50: (iv_ruleMobaQueue= ruleMobaQueue EOF )
            // InternalMoba.g:2030:2: iv_ruleMobaQueue= ruleMobaQueue EOF
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
    // InternalMoba.g:2036:1: ruleMobaQueue returns [EObject current=null] : (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) ;
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
            // InternalMoba.g:2042:2: ( (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:2043:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:2043:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:2044:3: otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,55,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueAccess().getQueueKeyword_0());
            		
            // InternalMoba.g:2048:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2049:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2049:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2050:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_33); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaQueueAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:2066:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==32) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoba.g:2067:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:2071:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:2072:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:2072:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:2073:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaQueueRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_34); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:2085:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==46) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoba.g:2086:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaQueueRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaQueueAccess().getMobaPropertiesAbleParserRuleCall_3());
                    			
                    pushFollow(FOLLOW_7);
                    this_MobaPropertiesAble_4=ruleMobaPropertiesAble(current);

                    state._fsp--;


                    				current = this_MobaPropertiesAble_4;
                    				afterParserOrEnumRuleCall();
                    			

                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_43); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:2102:3: ( (lv_features_6_0= ruleMobaQueueFeature ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==63) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMoba.g:2103:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    {
            	    // InternalMoba.g:2103:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    // InternalMoba.g:2104:5: lv_features_6_0= ruleMobaQueueFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_43);
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

            otherlv_7=(Token)match(input,24,FOLLOW_2); 

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
    // InternalMoba.g:2129:1: entryRuleMobaService returns [EObject current=null] : iv_ruleMobaService= ruleMobaService EOF ;
    public final EObject entryRuleMobaService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaService = null;


        try {
            // InternalMoba.g:2129:52: (iv_ruleMobaService= ruleMobaService EOF )
            // InternalMoba.g:2130:2: iv_ruleMobaService= ruleMobaService EOF
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
    // InternalMoba.g:2136:1: ruleMobaService returns [EObject current=null] : (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud ) ;
    public final EObject ruleMobaService() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRestCustom_0 = null;

        EObject this_MobaRestCrud_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:2142:2: ( (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud ) )
            // InternalMoba.g:2143:2: (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud )
            {
            // InternalMoba.g:2143:2: (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud )
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==56) ) {
                alt41=1;
            }
            else if ( (LA41_0==57) ) {
                alt41=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }
            switch (alt41) {
                case 1 :
                    // InternalMoba.g:2144:3: this_MobaRestCustom_0= ruleMobaRestCustom
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
                    // InternalMoba.g:2153:3: this_MobaRestCrud_1= ruleMobaRestCrud
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
    // InternalMoba.g:2165:1: entryRuleMobaRestCustom returns [EObject current=null] : iv_ruleMobaRestCustom= ruleMobaRestCustom EOF ;
    public final EObject entryRuleMobaRestCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestCustom = null;


        try {
            // InternalMoba.g:2165:55: (iv_ruleMobaRestCustom= ruleMobaRestCustom EOF )
            // InternalMoba.g:2166:2: iv_ruleMobaRestCustom= ruleMobaRestCustom EOF
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
    // InternalMoba.g:2172:1: ruleMobaRestCustom returns [EObject current=null] : (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaRestCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaPropertiesAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2178:2: ( (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2179:2: (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2179:2: (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2180:3: otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRestCustomAccess().getRestKeyword_0());
            		
            // InternalMoba.g:2184:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2185:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2185:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2186:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaRestCustomAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaRestCustomRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:2202:3: (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==46) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalMoba.g:2203:4: this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:2219:1: entryRuleMobaRestCrud returns [EObject current=null] : iv_ruleMobaRestCrud= ruleMobaRestCrud EOF ;
    public final EObject entryRuleMobaRestCrud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestCrud = null;


        try {
            // InternalMoba.g:2219:53: (iv_ruleMobaRestCrud= ruleMobaRestCrud EOF )
            // InternalMoba.g:2220:2: iv_ruleMobaRestCrud= ruleMobaRestCrud EOF
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
    // InternalMoba.g:2226:1: ruleMobaRestCrud returns [EObject current=null] : (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaRestCrud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaPropertiesAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2232:2: ( (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2233:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2233:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2234:3: otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,57,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRestCrudAccess().getRestCrudKeyword_0());
            		
            // InternalMoba.g:2238:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2239:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2239:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2240:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_1_0, grammarAccess.getMobaRestCrudAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaRestCrudRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:2256:3: (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==46) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoba.g:2257:4: this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current]
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


    // $ANTLR start "entryRuleMobaEntityFeature"
    // InternalMoba.g:2273:1: entryRuleMobaEntityFeature returns [EObject current=null] : iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF ;
    public final EObject entryRuleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityFeature = null;


        try {
            // InternalMoba.g:2273:58: (iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF )
            // InternalMoba.g:2274:2: iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF
            {
             newCompositeNode(grammarAccess.getMobaEntityFeatureRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityFeature=ruleMobaEntityFeature();

            state._fsp--;

             current =iv_ruleMobaEntityFeature; 
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
    // $ANTLR end "entryRuleMobaEntityFeature"


    // $ANTLR start "ruleMobaEntityFeature"
    // InternalMoba.g:2280:1: ruleMobaEntityFeature returns [EObject current=null] : (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference ) ;
    public final EObject ruleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntityAttribute_0 = null;

        EObject this_MobaEntityReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:2286:2: ( (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference ) )
            // InternalMoba.g:2287:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference )
            {
            // InternalMoba.g:2287:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference )
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==58) ) {
                alt44=1;
            }
            else if ( (LA44_0==63) ) {
                alt44=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoba.g:2288:3: this_MobaEntityAttribute_0= ruleMobaEntityAttribute
                    {

                    			newCompositeNode(grammarAccess.getMobaEntityFeatureAccess().getMobaEntityAttributeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaEntityAttribute_0=ruleMobaEntityAttribute();

                    state._fsp--;


                    			current = this_MobaEntityAttribute_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMoba.g:2297:3: this_MobaEntityReference_1= ruleMobaEntityReference
                    {

                    			newCompositeNode(grammarAccess.getMobaEntityFeatureAccess().getMobaEntityReferenceParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MobaEntityReference_1=ruleMobaEntityReference();

                    state._fsp--;


                    			current = this_MobaEntityReference_1;
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
    // $ANTLR end "ruleMobaEntityFeature"


    // $ANTLR start "entryRuleMobaEntityAttribute"
    // InternalMoba.g:2309:1: entryRuleMobaEntityAttribute returns [EObject current=null] : iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF ;
    public final EObject entryRuleMobaEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityAttribute = null;


        try {
            // InternalMoba.g:2309:60: (iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF )
            // InternalMoba.g:2310:2: iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF
            {
             newCompositeNode(grammarAccess.getMobaEntityAttributeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityAttribute=ruleMobaEntityAttribute();

            state._fsp--;

             current =iv_ruleMobaEntityAttribute; 
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
    // $ANTLR end "entryRuleMobaEntityAttribute"


    // $ANTLR start "ruleMobaEntityAttribute"
    // InternalMoba.g:2316:1: ruleMobaEntityAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaEntityAttribute() throws RecognitionException {
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
            // InternalMoba.g:2322:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2323:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2323:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2324:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2328:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2329:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2329:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2330:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2333:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:2334:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:2334:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop46:
            do {
                int alt46=6;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt46=2;
                }
                else if ( LA46_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt46=3;
                }
                else if ( LA46_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt46=4;
                }
                else if ( LA46_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt46=5;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMoba.g:2335:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2335:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2336:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2336:116: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2337:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2340:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:2340:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2340:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:2340:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2340:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:2341:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,59,FOLLOW_44); 

            	    										newLeafNode(lv_lazy_2_0, grammarAccess.getMobaEntityAttributeAccess().getLazyLazyKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2358:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2358:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2359:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2359:116: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2360:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2363:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:2363:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2363:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:2363:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:2363:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:2364:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,60,FOLLOW_44); 

            	    										newLeafNode(lv_transient_3_0, grammarAccess.getMobaEntityAttributeAccess().getTransientTransientKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:2381:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2381:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:2382:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2382:116: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:2383:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2386:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:2386:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2386:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:2386:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:2386:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:2387:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,61,FOLLOW_44); 

            	    										newLeafNode(lv_domainKey_4_0, grammarAccess.getMobaEntityAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainKey", true, "domainKey");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:2404:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2404:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:2405:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:2405:116: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:2406:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:2409:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:2409:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2409:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:2409:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:2409:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:2410:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,62,FOLLOW_44); 

            	    										newLeafNode(lv_domainDescription_5_0, grammarAccess.getMobaEntityAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            	    										}
            	    										setWithLastConsumed(current, "domainDescription", true, "domainDescription");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:2427:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2427:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:2428:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:2428:116: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:2429:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:2432:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:2432:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2432:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:2432:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_20); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaEntityAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,38,FOLLOW_21); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaEntityAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:2440:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:2441:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:2441:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:2442:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_22);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;


            	    											if (current==null) {
            	    												current = createModelElementForParent(grammarAccess.getMobaEntityAttributeRule());
            	    											}
            	    											add(
            	    												current,
            	    												"constraints",
            	    												lv_constraints_8_0,
            	    												"org.mobadsl.grammar.Moba.MobaConstraint");
            	    											afterParserOrEnumRuleCall();
            	    										

            	    }


            	    }

            	    // InternalMoba.g:2459:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==41) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // InternalMoba.g:2460:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,41,FOLLOW_21); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaEntityAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:2464:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:2465:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:2465:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:2466:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_22);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;


            	    	    												if (current==null) {
            	    	    													current = createModelElementForParent(grammarAccess.getMobaEntityAttributeRule());
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

            	    otherlv_11=(Token)match(input,39,FOLLOW_44); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaEntityAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2501:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:2502:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:2502:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:2503:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_12, grammarAccess.getMobaEntityAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_13;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:2525:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:2526:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:2526:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:2527:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_14_0, grammarAccess.getMobaEntityAttributeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_14_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:2543:3: (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==46) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMoba.g:2544:4: this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
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
    // $ANTLR end "ruleMobaEntityAttribute"


    // $ANTLR start "entryRuleMobaSettingsFeature"
    // InternalMoba.g:2560:1: entryRuleMobaSettingsFeature returns [EObject current=null] : iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF ;
    public final EObject entryRuleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsFeature = null;


        try {
            // InternalMoba.g:2560:60: (iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF )
            // InternalMoba.g:2561:2: iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF
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
    // InternalMoba.g:2567:1: ruleMobaSettingsFeature returns [EObject current=null] : this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute ;
    public final EObject ruleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaSettingsAttribute_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2573:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute )
            // InternalMoba.g:2574:2: this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute
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
    // InternalMoba.g:2585:1: entryRuleMobaSettingsAttribute returns [EObject current=null] : iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF ;
    public final EObject entryRuleMobaSettingsAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsAttribute = null;


        try {
            // InternalMoba.g:2585:62: (iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF )
            // InternalMoba.g:2586:2: iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF
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
    // InternalMoba.g:2592:1: ruleMobaSettingsAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:2598:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2599:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2599:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2600:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2604:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2605:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2605:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2606:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2609:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:2610:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:2610:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop49:
            do {
                int alt49=6;
                int LA49_0 = input.LA(1);

                if ( LA49_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt49=1;
                }
                else if ( LA49_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt49=2;
                }
                else if ( LA49_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt49=3;
                }
                else if ( LA49_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt49=4;
                }
                else if ( LA49_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt49=5;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMoba.g:2611:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2611:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2612:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2612:118: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2613:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2616:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:2616:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2616:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:2616:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2616:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:2617:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,59,FOLLOW_44); 

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
            	    // InternalMoba.g:2634:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2634:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2635:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2635:118: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2636:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2639:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:2639:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2639:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:2639:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:2639:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:2640:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,60,FOLLOW_44); 

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
            	    // InternalMoba.g:2657:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2657:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:2658:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2658:118: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:2659:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2662:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:2662:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2662:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:2662:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:2662:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:2663:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,61,FOLLOW_44); 

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
            	    // InternalMoba.g:2680:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2680:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:2681:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:2681:118: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:2682:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:2685:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:2685:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2685:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:2685:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:2685:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:2686:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,62,FOLLOW_44); 

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
            	    // InternalMoba.g:2703:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2703:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:2704:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:2704:118: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:2705:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:2708:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:2708:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2708:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:2708:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_20); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaSettingsAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,38,FOLLOW_21); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:2716:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:2717:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:2717:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:2718:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_22);
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

            	    // InternalMoba.g:2735:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==41) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // InternalMoba.g:2736:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,41,FOLLOW_21); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:2740:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:2741:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:2741:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:2742:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_22);
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

            	    otherlv_11=(Token)match(input,39,FOLLOW_44); 

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

            // InternalMoba.g:2777:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:2778:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:2778:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:2779:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_45); 

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
            		
            // InternalMoba.g:2801:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:2802:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:2802:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:2803:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_14_0, grammarAccess.getMobaSettingsAttributeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_14_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:2819:3: (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==46) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMoba.g:2820:4: this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:2837:1: ruleMobaMultiplicityAble[EObject in_current] returns [EObject current=in_current] : ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? ;
    public final EObject ruleMobaMultiplicityAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2843:2: ( ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? )
            // InternalMoba.g:2844:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            {
            // InternalMoba.g:2844:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==46) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoba.g:2845:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    {
                    // InternalMoba.g:2845:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    // InternalMoba.g:2846:4: lv_multiplicity_0_0= ruleMobaMuliplicity
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


    // $ANTLR start "entryRuleMobaEntityReference"
    // InternalMoba.g:2866:1: entryRuleMobaEntityReference returns [EObject current=null] : iv_ruleMobaEntityReference= ruleMobaEntityReference EOF ;
    public final EObject entryRuleMobaEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityReference = null;


        try {
            // InternalMoba.g:2866:60: (iv_ruleMobaEntityReference= ruleMobaEntityReference EOF )
            // InternalMoba.g:2867:2: iv_ruleMobaEntityReference= ruleMobaEntityReference EOF
            {
             newCompositeNode(grammarAccess.getMobaEntityReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityReference=ruleMobaEntityReference();

            state._fsp--;

             current =iv_ruleMobaEntityReference; 
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
    // $ANTLR end "entryRuleMobaEntityReference"


    // $ANTLR start "ruleMobaEntityReference"
    // InternalMoba.g:2873:1: ruleMobaEntityReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaEntityReference() throws RecognitionException {
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
            // InternalMoba.g:2879:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2880:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2880:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2881:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:2885:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:2886:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:2886:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:2887:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2890:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:2891:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:2891:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop52:
            do {
                int alt52=4;
                int LA52_0 = input.LA(1);

                if ( LA52_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt52=1;
                }
                else if ( LA52_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt52=2;
                }
                else if ( LA52_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt52=3;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMoba.g:2892:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2892:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:2893:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2893:116: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:2894:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2897:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:2897:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:2897:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:2897:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:2897:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:2898:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,64,FOLLOW_46); 

            	    										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaEntityReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "cascading", true, "cascading");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2915:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2915:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2916:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2916:116: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2917:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2920:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:2920:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:2920:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:2920:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2920:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:2921:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,59,FOLLOW_46); 

            	    										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaEntityReferenceAccess().getLazyLazyKeyword_1_1_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "lazy", true, "lazy");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:2938:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2938:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2939:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2939:116: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2940:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2943:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:2943:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:2943:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:2943:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:2943:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:2944:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,60,FOLLOW_46); 

            	    										newLeafNode(lv_transient_4_0, grammarAccess.getMobaEntityReferenceAccess().getTransientTransientKeyword_1_2_0());
            	    									

            	    										if (current==null) {
            	    											current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            	    										}
            	    										setWithLastConsumed(current, "transient", true, "transient");
            	    									

            	    }


            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2968:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:2969:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:2969:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:2970:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_5, grammarAccess.getMobaEntityReferenceAccess().getTypeMobaEntityCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            			}
            			newCompositeNode(grammarAccess.getMobaEntityReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_6;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:2992:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:2993:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:2993:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:2994:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_7_0, grammarAccess.getMobaEntityReferenceAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:3010:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==46) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalMoba.g:3011:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaEntityReferenceAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
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
    // $ANTLR end "ruleMobaEntityReference"


    // $ANTLR start "entryRuleMobaDtoFeature"
    // InternalMoba.g:3027:1: entryRuleMobaDtoFeature returns [EObject current=null] : iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF ;
    public final EObject entryRuleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoFeature = null;


        try {
            // InternalMoba.g:3027:55: (iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF )
            // InternalMoba.g:3028:2: iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF
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
    // InternalMoba.g:3034:1: ruleMobaDtoFeature returns [EObject current=null] : (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference ) ;
    public final EObject ruleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDtoAttribute_0 = null;

        EObject this_MobaDtoReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:3040:2: ( (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference ) )
            // InternalMoba.g:3041:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference )
            {
            // InternalMoba.g:3041:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==58) ) {
                alt54=1;
            }
            else if ( (LA54_0==63) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoba.g:3042:3: this_MobaDtoAttribute_0= ruleMobaDtoAttribute
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
                    // InternalMoba.g:3051:3: this_MobaDtoReference_1= ruleMobaDtoReference
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
    // InternalMoba.g:3063:1: entryRuleMobaDtoAttribute returns [EObject current=null] : iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF ;
    public final EObject entryRuleMobaDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoAttribute = null;


        try {
            // InternalMoba.g:3063:57: (iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF )
            // InternalMoba.g:3064:2: iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF
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
    // InternalMoba.g:3070:1: ruleMobaDtoAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:3076:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3077:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3077:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3078:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,58,FOLLOW_47); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:3082:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:3083:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:3083:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            // InternalMoba.g:3084:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3087:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            // InternalMoba.g:3088:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            {
            // InternalMoba.g:3088:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            loop56:
            do {
                int alt56=7;
                int LA56_0 = input.LA(1);

                if ( LA56_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt56=2;
                }
                else if ( LA56_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt56=3;
                }
                else if ( LA56_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt56=4;
                }
                else if ( LA56_0 == 40 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt56=5;
                }
                else if ( LA56_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5) ) {
                    alt56=6;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMoba.g:3089:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3089:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3090:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3090:113: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3091:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3094:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:3094:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3094:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:3094:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3094:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:3095:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,59,FOLLOW_47); 

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
            	    // InternalMoba.g:3112:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3112:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3113:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3113:113: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3114:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3117:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:3117:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3117:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:3117:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:3117:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:3118:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,60,FOLLOW_47); 

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
            	    // InternalMoba.g:3135:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3135:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:3136:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3136:113: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:3137:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3140:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:3140:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3140:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:3140:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:3140:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:3141:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,61,FOLLOW_47); 

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
            	    // InternalMoba.g:3158:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3158:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:3159:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:3159:113: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:3160:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:3163:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:3163:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3163:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:3163:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:3163:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:3164:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,62,FOLLOW_47); 

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
            	    // InternalMoba.g:3181:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:3181:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:3182:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:3182:113: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:3183:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:3186:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:3186:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3186:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:3186:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,40,FOLLOW_20); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaDtoAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,38,FOLLOW_21); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:3194:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:3195:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:3195:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:3196:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_22);
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

            	    // InternalMoba.g:3213:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop55:
            	    do {
            	        int alt55=2;
            	        int LA55_0 = input.LA(1);

            	        if ( (LA55_0==41) ) {
            	            alt55=1;
            	        }


            	        switch (alt55) {
            	    	case 1 :
            	    	    // InternalMoba.g:3214:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,41,FOLLOW_21); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaDtoAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:3218:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:3219:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:3219:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:3220:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_22);
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
            	    	    break loop55;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,39,FOLLOW_47); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMoba.g:3248:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:3248:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    // InternalMoba.g:3249:5: {...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalMoba.g:3249:113: ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    // InternalMoba.g:3250:6: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalMoba.g:3253:9: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    // InternalMoba.g:3253:10: {...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3253:19: (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    // InternalMoba.g:3253:20: otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')'
            	    {
            	    otherlv_12=(Token)match(input,65,FOLLOW_20); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMobaDtoAttributeAccess().getAliasKeyword_1_5_0());
            	    								
            	    otherlv_13=(Token)match(input,38,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_5_1());
            	    								
            	    // InternalMoba.g:3261:9: ( (lv_alias_14_0= RULE_ID ) )
            	    // InternalMoba.g:3262:10: (lv_alias_14_0= RULE_ID )
            	    {
            	    // InternalMoba.g:3262:10: (lv_alias_14_0= RULE_ID )
            	    // InternalMoba.g:3263:11: lv_alias_14_0= RULE_ID
            	    {
            	    lv_alias_14_0=(Token)match(input,RULE_ID,FOLLOW_19); 

            	    											newLeafNode(lv_alias_14_0, grammarAccess.getMobaDtoAttributeAccess().getAliasIDTerminalRuleCall_1_5_2_0());
            	    										

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	    											}
            	    											setWithLastConsumed(
            	    												current,
            	    												"alias",
            	    												lv_alias_14_0,
            	    												"org.mobadsl.grammar.Moba.ID");
            	    										

            	    }


            	    }

            	    otherlv_15=(Token)match(input,39,FOLLOW_47); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

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

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3296:3: ( (otherlv_16= RULE_ID ) )
            // InternalMoba.g:3297:4: (otherlv_16= RULE_ID )
            {
            // InternalMoba.g:3297:4: (otherlv_16= RULE_ID )
            // InternalMoba.g:3298:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_45); 

            					newLeafNode(otherlv_16, grammarAccess.getMobaDtoAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
            				

            }


            }


            			if (current==null) {
            				current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            			}
            			newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
            		
            pushFollow(FOLLOW_3);
            this_MobaMultiplicityAble_17=ruleMobaMultiplicityAble(current);

            state._fsp--;


            			current = this_MobaMultiplicityAble_17;
            			afterParserOrEnumRuleCall();
            		
            // InternalMoba.g:3320:3: ( (lv_name_18_0= RULE_ID ) )
            // InternalMoba.g:3321:4: (lv_name_18_0= RULE_ID )
            {
            // InternalMoba.g:3321:4: (lv_name_18_0= RULE_ID )
            // InternalMoba.g:3322:5: lv_name_18_0= RULE_ID
            {
            lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_18_0, grammarAccess.getMobaDtoAttributeAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_18_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:3338:3: (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==46) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoba.g:3339:4: this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current]
                    {

                    				if (current==null) {
                    					current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
                    				}
                    				newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getMobaPropertiesAbleParserRuleCall_5());
                    			
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
    // $ANTLR end "ruleMobaDtoAttribute"


    // $ANTLR start "entryRuleMobaDtoReference"
    // InternalMoba.g:3355:1: entryRuleMobaDtoReference returns [EObject current=null] : iv_ruleMobaDtoReference= ruleMobaDtoReference EOF ;
    public final EObject entryRuleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoReference = null;


        try {
            // InternalMoba.g:3355:57: (iv_ruleMobaDtoReference= ruleMobaDtoReference EOF )
            // InternalMoba.g:3356:2: iv_ruleMobaDtoReference= ruleMobaDtoReference EOF
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
    // InternalMoba.g:3362:1: ruleMobaDtoReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:3368:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3369:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3369:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3370:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:3374:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3375:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3375:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:3376:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3379:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:3380:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:3380:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop58:
            do {
                int alt58=4;
                int LA58_0 = input.LA(1);

                if ( LA58_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt58=2;
                }
                else if ( LA58_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt58=3;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMoba.g:3381:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3381:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:3382:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3382:113: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:3383:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3386:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:3386:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:3386:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:3386:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:3386:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:3387:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,64,FOLLOW_46); 

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
            	    // InternalMoba.g:3404:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3404:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3405:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3405:113: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3406:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3409:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:3409:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:3409:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:3409:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3409:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:3410:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,59,FOLLOW_46); 

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
            	    // InternalMoba.g:3427:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3427:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3428:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3428:113: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3429:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3432:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:3432:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:3432:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:3432:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:3432:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:3433:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,60,FOLLOW_46); 

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
            	    break loop58;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3457:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:3458:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:3458:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:3459:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_45); 

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
            		
            // InternalMoba.g:3481:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:3482:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:3482:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:3483:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_7_0, grammarAccess.getMobaDtoReferenceAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:3499:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==46) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMoba.g:3500:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
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


    // $ANTLR start "entryRuleMobaQueueFeature"
    // InternalMoba.g:3516:1: entryRuleMobaQueueFeature returns [EObject current=null] : iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF ;
    public final EObject entryRuleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueFeature = null;


        try {
            // InternalMoba.g:3516:57: (iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF )
            // InternalMoba.g:3517:2: iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF
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
    // InternalMoba.g:3523:1: ruleMobaQueueFeature returns [EObject current=null] : this_MobaQueueReference_0= ruleMobaQueueReference ;
    public final EObject ruleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaQueueReference_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3529:2: (this_MobaQueueReference_0= ruleMobaQueueReference )
            // InternalMoba.g:3530:2: this_MobaQueueReference_0= ruleMobaQueueReference
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
    // InternalMoba.g:3541:1: entryRuleMobaQueueReference returns [EObject current=null] : iv_ruleMobaQueueReference= ruleMobaQueueReference EOF ;
    public final EObject entryRuleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueReference = null;


        try {
            // InternalMoba.g:3541:59: (iv_ruleMobaQueueReference= ruleMobaQueueReference EOF )
            // InternalMoba.g:3542:2: iv_ruleMobaQueueReference= ruleMobaQueueReference EOF
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
    // InternalMoba.g:3548:1: ruleMobaQueueReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:3554:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3555:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3555:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3556:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,63,FOLLOW_46); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:3560:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3561:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3561:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:3562:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3565:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:3566:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:3566:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop60:
            do {
                int alt60=4;
                int LA60_0 = input.LA(1);

                if ( LA60_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt60=1;
                }
                else if ( LA60_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt60=2;
                }
                else if ( LA60_0 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt60=3;
                }


                switch (alt60) {
            	case 1 :
            	    // InternalMoba.g:3567:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3567:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:3568:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3568:115: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:3569:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3572:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:3572:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3572:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:3572:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:3572:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:3573:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,64,FOLLOW_46); 

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
            	    // InternalMoba.g:3590:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3590:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3591:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3591:115: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3592:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3595:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:3595:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3595:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:3595:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3595:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:3596:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,59,FOLLOW_46); 

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
            	    // InternalMoba.g:3613:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3613:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3614:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3614:115: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3615:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3618:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:3618:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3618:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:3618:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:3618:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:3619:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,60,FOLLOW_46); 

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

            // InternalMoba.g:3643:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:3644:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:3644:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:3645:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_45); 

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
            		
            // InternalMoba.g:3667:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:3668:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:3668:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:3669:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_29); 

            					newLeafNode(lv_name_7_0, grammarAccess.getMobaQueueReferenceAccess().getNameIDTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_7_0,
            						"org.mobadsl.grammar.Moba.ID");
            				

            }


            }

            // InternalMoba.g:3685:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==46) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalMoba.g:3686:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:3702:1: entryRuleMobaMuliplicity returns [EObject current=null] : iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF ;
    public final EObject entryRuleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMuliplicity = null;


        try {
            // InternalMoba.g:3702:56: (iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF )
            // InternalMoba.g:3703:2: iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF
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
    // InternalMoba.g:3709:1: ruleMobaMuliplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lower_1_0 = null;

        Enumerator lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3715:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) )
            // InternalMoba.g:3716:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            {
            // InternalMoba.g:3716:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            // InternalMoba.g:3717:3: otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,46,FOLLOW_48); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoba.g:3721:3: ( (lv_lower_1_0= ruleMobaLowerBound ) )
            // InternalMoba.g:3722:4: (lv_lower_1_0= ruleMobaLowerBound )
            {
            // InternalMoba.g:3722:4: (lv_lower_1_0= ruleMobaLowerBound )
            // InternalMoba.g:3723:5: lv_lower_1_0= ruleMobaLowerBound
            {

            					newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_49);
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

            // InternalMoba.g:3740:3: (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==66) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMoba.g:3741:4: otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    {
                    otherlv_2=(Token)match(input,66,FOLLOW_50); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0());
                    			
                    // InternalMoba.g:3745:4: ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    // InternalMoba.g:3746:5: (lv_upper_3_0= ruleMobaUpperBound )
                    {
                    // InternalMoba.g:3746:5: (lv_upper_3_0= ruleMobaUpperBound )
                    // InternalMoba.g:3747:6: lv_upper_3_0= ruleMobaUpperBound
                    {

                    						newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_51);
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

            otherlv_4=(Token)match(input,47,FOLLOW_2); 

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
    // InternalMoba.g:3773:1: entryRuleMobaConstraint returns [EObject current=null] : iv_ruleMobaConstraint= ruleMobaConstraint EOF ;
    public final EObject entryRuleMobaConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstraint = null;


        try {
            // InternalMoba.g:3773:55: (iv_ruleMobaConstraint= ruleMobaConstraint EOF )
            // InternalMoba.g:3774:2: iv_ruleMobaConstraint= ruleMobaConstraint EOF
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
    // InternalMoba.g:3780:1: ruleMobaConstraint returns [EObject current=null] : (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) ;
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
            // InternalMoba.g:3786:2: ( (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) )
            // InternalMoba.g:3787:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            {
            // InternalMoba.g:3787:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            int alt63=8;
            switch ( input.LA(1) ) {
            case 67:
                {
                alt63=1;
                }
                break;
            case 68:
                {
                alt63=2;
                }
                break;
            case 69:
                {
                alt63=3;
                }
                break;
            case 70:
                {
                alt63=4;
                }
                break;
            case 71:
                {
                alt63=5;
                }
                break;
            case 72:
                {
                alt63=6;
                }
                break;
            case 73:
                {
                alt63=7;
                }
                break;
            case 74:
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
                    // InternalMoba.g:3788:3: this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint
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
                    // InternalMoba.g:3797:3: this_MobaMinConstraint_1= ruleMobaMinConstraint
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
                    // InternalMoba.g:3806:3: this_MobaMaxConstraint_2= ruleMobaMaxConstraint
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
                    // InternalMoba.g:3815:3: this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint
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
                    // InternalMoba.g:3824:3: this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint
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
                    // InternalMoba.g:3833:3: this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint
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
                    // InternalMoba.g:3842:3: this_MobaNullConstraint_6= ruleMobaNullConstraint
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
                    // InternalMoba.g:3851:3: this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint
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
    // InternalMoba.g:3863:1: entryRuleMobaRegexpConstraint returns [EObject current=null] : iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF ;
    public final EObject entryRuleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRegexpConstraint = null;


        try {
            // InternalMoba.g:3863:61: (iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF )
            // InternalMoba.g:3864:2: iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF
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
    // InternalMoba.g:3870:1: ruleMobaRegexpConstraint returns [EObject current=null] : (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3876:2: ( (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3877:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3877:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3878:3: otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRegexpConstraintAccess().getRegexpKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_18); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaRegexpConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3886:3: ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
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
                    // InternalMoba.g:3887:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:3887:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    // InternalMoba.g:3888:5: (lv_filterString_2_0= RULE_STRING )
                    {
                    // InternalMoba.g:3888:5: (lv_filterString_2_0= RULE_STRING )
                    // InternalMoba.g:3889:6: lv_filterString_2_0= RULE_STRING
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
                    // InternalMoba.g:3906:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3906:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3907:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3907:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3908:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:3924:1: entryRuleMobaMinConstraint returns [EObject current=null] : iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF ;
    public final EObject entryRuleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinConstraint = null;


        try {
            // InternalMoba.g:3924:58: (iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF )
            // InternalMoba.g:3925:2: iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF
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
    // InternalMoba.g:3931:1: ruleMobaMinConstraint returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3937:2: ( (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3938:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3938:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3939:3: otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinConstraintAccess().getMinKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3947:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_DOUBLE) ) {
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
                    // InternalMoba.g:3948:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:3948:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:3949:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:3949:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:3950:6: lv_filterValue_2_0= RULE_DOUBLE
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMinConstraintAccess().getFilterValueDOUBLETerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMinConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterValue",
                    							lv_filterValue_2_0,
                    							"org.mobadsl.grammar.Moba.DOUBLE");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3967:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3967:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3968:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3968:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3969:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:3985:1: entryRuleMobaMaxConstraint returns [EObject current=null] : iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF ;
    public final EObject entryRuleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxConstraint = null;


        try {
            // InternalMoba.g:3985:58: (iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF )
            // InternalMoba.g:3986:2: iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF
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
    // InternalMoba.g:3992:1: ruleMobaMaxConstraint returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3998:2: ( (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3999:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3999:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:4000:3: otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxConstraintAccess().getMaxKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_52); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:4008:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_DOUBLE) ) {
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
                    // InternalMoba.g:4009:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:4009:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:4010:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:4010:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:4011:6: lv_filterValue_2_0= RULE_DOUBLE
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); 

                    						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMaxConstraintAccess().getFilterValueDOUBLETerminalRuleCall_2_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaMaxConstraintRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"filterValue",
                    							lv_filterValue_2_0,
                    							"org.mobadsl.grammar.Moba.DOUBLE");
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4028:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4028:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4029:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4029:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4030:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4046:1: entryRuleMobaMinLengthConstraint returns [EObject current=null] : iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF ;
    public final EObject entryRuleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinLengthConstraint = null;


        try {
            // InternalMoba.g:4046:64: (iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF )
            // InternalMoba.g:4047:2: iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF
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
    // InternalMoba.g:4053:1: ruleMobaMinLengthConstraint returns [EObject current=null] : (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:4059:2: ( (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:4060:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:4060:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:4061:3: otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinLengthConstraintAccess().getMinLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:4069:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
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
                    // InternalMoba.g:4070:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4070:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:4071:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:4071:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:4072:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:4089:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4089:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4090:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4090:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4091:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4107:1: entryRuleMobaMaxLengthConstraint returns [EObject current=null] : iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF ;
    public final EObject entryRuleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxLengthConstraint = null;


        try {
            // InternalMoba.g:4107:64: (iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF )
            // InternalMoba.g:4108:2: iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF
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
    // InternalMoba.g:4114:1: ruleMobaMaxLengthConstraint returns [EObject current=null] : (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:4120:2: ( (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:4121:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:4121:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:4122:3: otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxLengthConstraintAccess().getMaxLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,22,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:4130:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
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
                    // InternalMoba.g:4131:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4131:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:4132:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:4132:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:4133:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:4150:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4150:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4151:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4151:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4152:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4168:1: entryRuleMobaDigitsConstraint returns [EObject current=null] : iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF ;
    public final EObject entryRuleMobaDigitsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDigitsConstraint = null;


        try {
            // InternalMoba.g:4168:61: (iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF )
            // InternalMoba.g:4169:2: iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF
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
    // InternalMoba.g:4175:1: ruleMobaDigitsConstraint returns [EObject current=null] : (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:4181:2: ( (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ) )
            // InternalMoba.g:4182:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:4182:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' )
            // InternalMoba.g:4183:3: otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_20); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDigitsConstraintAccess().getDigitsKeyword_0());
            		
            otherlv_1=(Token)match(input,38,FOLLOW_53); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaDigitsConstraintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoba.g:4191:3: ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
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
                    // InternalMoba.g:4192:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4192:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    // InternalMoba.g:4193:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:4193:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    // InternalMoba.g:4194:6: lv_filterIntegerValue_2_0= RULE_INT
                    {
                    lv_filterIntegerValue_2_0=(Token)match(input,RULE_INT,FOLLOW_26); 

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
                    // InternalMoba.g:4211:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4211:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4212:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4212:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4213:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_26); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,41,FOLLOW_53); 

            			newLeafNode(otherlv_4, grammarAccess.getMobaDigitsConstraintAccess().getCommaKeyword_3());
            		
            // InternalMoba.g:4229:3: ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) )
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
                    // InternalMoba.g:4230:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4230:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    // InternalMoba.g:4231:5: (lv_filterFractionValue_5_0= RULE_INT )
                    {
                    // InternalMoba.g:4231:5: (lv_filterFractionValue_5_0= RULE_INT )
                    // InternalMoba.g:4232:6: lv_filterFractionValue_5_0= RULE_INT
                    {
                    lv_filterFractionValue_5_0=(Token)match(input,RULE_INT,FOLLOW_19); 

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
                    // InternalMoba.g:4249:4: ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMoba.g:4249:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMoba.g:4250:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMoba.g:4250:5: (otherlv_6= RULE_ID )
                    // InternalMoba.g:4251:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); 

                    						newLeafNode(otherlv_6, grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionConstMobaConstantCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,39,FOLLOW_2); 

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
    // InternalMoba.g:4271:1: entryRuleMobaNullConstraint returns [EObject current=null] : iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF ;
    public final EObject entryRuleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNullConstraint = null;


        try {
            // InternalMoba.g:4271:59: (iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF )
            // InternalMoba.g:4272:2: iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF
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
    // InternalMoba.g:4278:1: ruleMobaNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNull' ) ;
    public final EObject ruleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4284:2: ( ( () otherlv_1= 'isNull' ) )
            // InternalMoba.g:4285:2: ( () otherlv_1= 'isNull' )
            {
            // InternalMoba.g:4285:2: ( () otherlv_1= 'isNull' )
            // InternalMoba.g:4286:3: () otherlv_1= 'isNull'
            {
            // InternalMoba.g:4286:3: ()
            // InternalMoba.g:4287:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNullConstraintAccess().getMobaNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,73,FOLLOW_2); 

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
    // InternalMoba.g:4301:1: entryRuleMobaNotNullConstraint returns [EObject current=null] : iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF ;
    public final EObject entryRuleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNotNullConstraint = null;


        try {
            // InternalMoba.g:4301:62: (iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF )
            // InternalMoba.g:4302:2: iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF
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
    // InternalMoba.g:4308:1: ruleMobaNotNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNotNull' ) ;
    public final EObject ruleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4314:2: ( ( () otherlv_1= 'isNotNull' ) )
            // InternalMoba.g:4315:2: ( () otherlv_1= 'isNotNull' )
            {
            // InternalMoba.g:4315:2: ( () otherlv_1= 'isNotNull' )
            // InternalMoba.g:4316:3: () otherlv_1= 'isNotNull'
            {
            // InternalMoba.g:4316:3: ()
            // InternalMoba.g:4317:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNotNullConstraintAccess().getMobaNotNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,74,FOLLOW_2); 

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
    // InternalMoba.g:4331:1: ruleMobaLowerBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) ;
    public final Enumerator ruleMobaLowerBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMoba.g:4337:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) )
            // InternalMoba.g:4338:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            {
            // InternalMoba.g:4338:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            int alt71=5;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt71=1;
                }
                break;
            case 76:
                {
                alt71=2;
                }
                break;
            case 77:
                {
                alt71=3;
                }
                break;
            case 45:
                {
                alt71=4;
                }
                break;
            case 78:
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
                    // InternalMoba.g:4339:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:4339:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:4340:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4347:3: (enumLiteral_1= '0' )
                    {
                    // InternalMoba.g:4347:3: (enumLiteral_1= '0' )
                    // InternalMoba.g:4348:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,76,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:4355:3: (enumLiteral_2= '?' )
                    {
                    // InternalMoba.g:4355:3: (enumLiteral_2= '?' )
                    // InternalMoba.g:4356:4: enumLiteral_2= '?'
                    {
                    enumLiteral_2=(Token)match(input,77,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:4363:3: (enumLiteral_3= '+' )
                    {
                    // InternalMoba.g:4363:3: (enumLiteral_3= '+' )
                    // InternalMoba.g:4364:4: enumLiteral_3= '+'
                    {
                    enumLiteral_3=(Token)match(input,45,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:4371:3: (enumLiteral_4= '1' )
                    {
                    // InternalMoba.g:4371:3: (enumLiteral_4= '1' )
                    // InternalMoba.g:4372:4: enumLiteral_4= '1'
                    {
                    enumLiteral_4=(Token)match(input,78,FOLLOW_2); 

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
    // InternalMoba.g:4382:1: ruleMobaUpperBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) ;
    public final Enumerator ruleMobaUpperBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4388:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) )
            // InternalMoba.g:4389:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            {
            // InternalMoba.g:4389:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==75) ) {
                alt72=1;
            }
            else if ( (LA72_0==78) ) {
                alt72=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }
            switch (alt72) {
                case 1 :
                    // InternalMoba.g:4390:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:4390:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:4391:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,75,FOLLOW_2); 

                    				current = grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4398:3: (enumLiteral_1= '1' )
                    {
                    // InternalMoba.g:4398:3: (enumLiteral_1= '1' )
                    // InternalMoba.g:4399:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,78,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x03D110008F000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000051000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000453F00000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000453E00000002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000457E00000002L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000000000L,0x00000000000007F8L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000028000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000020001000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000001C10L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000820000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400100800000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000400000800000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0400000001000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x000C008000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0002400100800000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x8420000001000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x8400000001000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x8000000001000000L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x7800010000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000010L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x1800000000000010L,0x0000000000000001L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x7800010000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000200000000000L,0x0000000000007800L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000800000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004800L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000000001010L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000810L});

}
