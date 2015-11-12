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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION", "RULE_APPLICATION_ID", "RULE_DOWNLOAD_TEMPLATE", "RULE_STRING", "RULE_INT", "RULE_DOUBLE", "SUPER_INT", "SUPER_ID", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'application'", "'version'", "'='", "'{'", "'}'", "'use template'", "'active'", "'generator'", "'id'", "'mixin'", "'datatype'", "'extends'", "'isPrimitive'", "'isArray'", "'isDate'", "'isTime'", "'isTimestamp'", "'('", "')'", "'constraints'", "','", "'enum'", "'lit'", "'const'", "'+'", "'['", "']'", "'settings'", "'cache'", "'type'", "'strategy'", "'entity'", "'index'", "'dto'", "'queue'", "'rest'", "'restCrud'", "'var'", "'lazy'", "'transient'", "'domainKey'", "'domainDescription'", "'ref'", "'cascading'", "'alias'", "'..'", "'regexp'", "'min'", "'max'", "'minLength'", "'maxLength'", "'digits'", "'isNull'", "'isNotNull'", "'*'", "'0'", "'?'", "'1'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int RULE_VERSION=5;
    public static final int T__59=59;
    public static final int SUPER_ID=12;
    public static final int T__18=18;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
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
    public static final int RULE_INT=9;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
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
    public static final int SUPER_INT=11;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=15;
    public static final int T__37=37;
    public static final int RULE_DOUBLE=10;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_APPLICATION_ID=6;
    public static final int T__33=33;
    public static final int T__34=34;
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
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_FLOAT=13;
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
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

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

            otherlv_2=(Token)match(input,19,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaApplicationAccess().getVersionKeyword_2());
            		
            otherlv_3=(Token)match(input,20,FOLLOW_6); 

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

            otherlv_5=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaApplicationAccess().getLeftCurlyBracketKeyword_5());
            		
            // InternalMoba.g:132:3: ( (lv_features_6_0= ruleMobaApplicationFeature ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=23 && LA1_0<=25)||LA1_0==28||LA1_0==41||LA1_0==45||LA1_0==49||(LA1_0>=51 && LA1_0<=54)) ) {
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

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
            case 28:
                {
                alt2=1;
                }
                break;
            case 23:
                {
                alt2=2;
                }
                break;
            case 41:
                {
                alt2=3;
                }
                break;
            case 24:
                {
                int LA2_4 = input.LA(2);

                if ( (LA2_4==45) ) {
                    alt2=4;
                }
                else if ( (LA2_4==25) ) {
                    alt2=7;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 4, input);

                    throw nvae;
                }
                }
                break;
            case 45:
                {
                alt2=4;
                }
                break;
            case 49:
            case 51:
            case 52:
                {
                alt2=5;
                }
                break;
            case 53:
            case 54:
                {
                alt2=6;
                }
                break;
            case 25:
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
            otherlv_0=(Token)match(input,23,FOLLOW_9); 

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

            if ( (LA4_0==24) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMoba.g:313:4: (lv_active_0_0= 'active' )
                    {
                    // InternalMoba.g:313:4: (lv_active_0_0= 'active' )
                    // InternalMoba.g:314:5: lv_active_0_0= 'active'
                    {
                    lv_active_0_0=(Token)match(input,24,FOLLOW_10); 

                    					newLeafNode(lv_active_0_0, grammarAccess.getMobaGeneratorAccess().getActiveActiveKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaGeneratorRule());
                    					}
                    					setWithLastConsumed(current, "active", true, "active");
                    				

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,25,FOLLOW_3); 

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

            otherlv_3=(Token)match(input,21,FOLLOW_11); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaGeneratorAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMoba.g:352:3: ( (lv_features_4_0= ruleMobaGeneratorFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=26 && LA5_0<=27)) ) {
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

            otherlv_5=(Token)match(input,22,FOLLOW_2); 

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

            if ( (LA6_0==26) ) {
                alt6=1;
            }
            else if ( (LA6_0==27) ) {
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
    // InternalMoba.g:422:1: ruleMobaGeneratorIDFeature returns [EObject current=null] : (otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) ) ) ;
    public final EObject ruleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_generatorString_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:428:2: ( (otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) ) ) )
            // InternalMoba.g:429:2: (otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) ) )
            {
            // InternalMoba.g:429:2: (otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) ) )
            // InternalMoba.g:430:3: otherlv_0= 'id' otherlv_1= '=' ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getIdKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaGeneratorIDFeatureAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:438:3: ( ( (otherlv_2= RULE_ID ) ) | ( (lv_generatorString_3_0= RULE_STRING ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_STRING) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMoba.g:439:4: ( (otherlv_2= RULE_ID ) )
                    {
                    // InternalMoba.g:439:4: ( (otherlv_2= RULE_ID ) )
                    // InternalMoba.g:440:5: (otherlv_2= RULE_ID )
                    {
                    // InternalMoba.g:440:5: (otherlv_2= RULE_ID )
                    // InternalMoba.g:441:6: otherlv_2= RULE_ID
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
                    // InternalMoba.g:453:4: ( (lv_generatorString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:453:4: ( (lv_generatorString_3_0= RULE_STRING ) )
                    // InternalMoba.g:454:5: (lv_generatorString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:454:5: (lv_generatorString_3_0= RULE_STRING )
                    // InternalMoba.g:455:6: lv_generatorString_3_0= RULE_STRING
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
    // InternalMoba.g:476:1: entryRuleMobaGeneratorMixinFeature returns [EObject current=null] : iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF ;
    public final EObject entryRuleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorMixinFeature = null;


        try {
            // InternalMoba.g:476:66: (iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF )
            // InternalMoba.g:477:2: iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF
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
    // InternalMoba.g:483:1: ruleMobaGeneratorMixinFeature returns [EObject current=null] : (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:489:2: ( (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMoba.g:490:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMoba.g:490:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            // InternalMoba.g:491:3: otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorMixinFeatureAccess().getMixinKeyword_0());
            		
            // InternalMoba.g:495:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:496:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:496:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:497:5: otherlv_1= RULE_ID
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
    // InternalMoba.g:512:1: entryRuleMobaDataType returns [EObject current=null] : iv_ruleMobaDataType= ruleMobaDataType EOF ;
    public final EObject entryRuleMobaDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDataType = null;


        try {
            // InternalMoba.g:512:53: (iv_ruleMobaDataType= ruleMobaDataType EOF )
            // InternalMoba.g:513:2: iv_ruleMobaDataType= ruleMobaDataType EOF
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
    // InternalMoba.g:519:1: ruleMobaDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:525:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:526:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:526:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:527:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,28,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0());
            		
            // InternalMoba.g:531:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:532:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:532:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:533:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); 

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

            // InternalMoba.g:549:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==29) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMoba.g:550:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaDataTypeAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:554:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:555:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:555:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:556:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDataTypeRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_14); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDataTypeAccess().getSuperTypeMobaDataTypeCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:568:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) ) )
            // InternalMoba.g:569:4: ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:569:4: ( ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* ) )
            // InternalMoba.g:570:5: ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            				
            // InternalMoba.g:573:5: ( ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )* )
            // InternalMoba.g:574:6: ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )*
            {
            // InternalMoba.g:574:6: ( ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) ) )*
            loop13:
            do {
                int alt13=6;
                int LA13_0 = input.LA(1);

                if ( LA13_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt13=1;
                }
                else if ( LA13_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt13=2;
                }
                else if ( LA13_0 >= 32 && LA13_0 <= 34 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt13=3;
                }
                else if ( LA13_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3) ) {
                    alt13=4;
                }
                else if ( LA13_0 == 39 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4) ) {
                    alt13=5;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMoba.g:575:4: ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) )
            	    {
            	    // InternalMoba.g:575:4: ({...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) ) )
            	    // InternalMoba.g:576:5: {...}? => ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoba.g:576:109: ( ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) ) )
            	    // InternalMoba.g:577:6: ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0);
            	    					
            	    // InternalMoba.g:580:9: ({...}? => ( (lv_primitive_5_0= 'isPrimitive' ) ) )
            	    // InternalMoba.g:580:10: {...}? => ( (lv_primitive_5_0= 'isPrimitive' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:580:19: ( (lv_primitive_5_0= 'isPrimitive' ) )
            	    // InternalMoba.g:580:20: (lv_primitive_5_0= 'isPrimitive' )
            	    {
            	    // InternalMoba.g:580:20: (lv_primitive_5_0= 'isPrimitive' )
            	    // InternalMoba.g:581:10: lv_primitive_5_0= 'isPrimitive'
            	    {
            	    lv_primitive_5_0=(Token)match(input,30,FOLLOW_14); 

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
            	    // InternalMoba.g:598:4: ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:598:4: ({...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:599:5: {...}? => ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoba.g:599:109: ( ({...}? => ( (lv_array_6_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:600:6: ({...}? => ( (lv_array_6_0= 'isArray' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1);
            	    					
            	    // InternalMoba.g:603:9: ({...}? => ( (lv_array_6_0= 'isArray' ) ) )
            	    // InternalMoba.g:603:10: {...}? => ( (lv_array_6_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:603:19: ( (lv_array_6_0= 'isArray' ) )
            	    // InternalMoba.g:603:20: (lv_array_6_0= 'isArray' )
            	    {
            	    // InternalMoba.g:603:20: (lv_array_6_0= 'isArray' )
            	    // InternalMoba.g:604:10: lv_array_6_0= 'isArray'
            	    {
            	    lv_array_6_0=(Token)match(input,31,FOLLOW_14); 

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
            	    // InternalMoba.g:621:4: ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) )
            	    {
            	    // InternalMoba.g:621:4: ({...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) ) )
            	    // InternalMoba.g:622:5: {...}? => ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoba.g:622:109: ( ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) ) )
            	    // InternalMoba.g:623:6: ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2);
            	    					
            	    // InternalMoba.g:626:9: ({...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? ) )
            	    // InternalMoba.g:626:10: {...}? => ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:626:19: ( ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )? )
            	    // InternalMoba.g:626:20: ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) ) (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )?
            	    {
            	    // InternalMoba.g:626:20: ( ( (lv_date_7_0= 'isDate' ) ) | ( (lv_time_8_0= 'isTime' ) ) | ( (lv_timestamp_9_0= 'isTimestamp' ) ) )
            	    int alt9=3;
            	    switch ( input.LA(1) ) {
            	    case 32:
            	        {
            	        alt9=1;
            	        }
            	        break;
            	    case 33:
            	        {
            	        alt9=2;
            	        }
            	        break;
            	    case 34:
            	        {
            	        alt9=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 9, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt9) {
            	        case 1 :
            	            // InternalMoba.g:627:10: ( (lv_date_7_0= 'isDate' ) )
            	            {
            	            // InternalMoba.g:627:10: ( (lv_date_7_0= 'isDate' ) )
            	            // InternalMoba.g:628:11: (lv_date_7_0= 'isDate' )
            	            {
            	            // InternalMoba.g:628:11: (lv_date_7_0= 'isDate' )
            	            // InternalMoba.g:629:12: lv_date_7_0= 'isDate'
            	            {
            	            lv_date_7_0=(Token)match(input,32,FOLLOW_15); 

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
            	            // InternalMoba.g:642:10: ( (lv_time_8_0= 'isTime' ) )
            	            {
            	            // InternalMoba.g:642:10: ( (lv_time_8_0= 'isTime' ) )
            	            // InternalMoba.g:643:11: (lv_time_8_0= 'isTime' )
            	            {
            	            // InternalMoba.g:643:11: (lv_time_8_0= 'isTime' )
            	            // InternalMoba.g:644:12: lv_time_8_0= 'isTime'
            	            {
            	            lv_time_8_0=(Token)match(input,33,FOLLOW_15); 

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
            	            // InternalMoba.g:657:10: ( (lv_timestamp_9_0= 'isTimestamp' ) )
            	            {
            	            // InternalMoba.g:657:10: ( (lv_timestamp_9_0= 'isTimestamp' ) )
            	            // InternalMoba.g:658:11: (lv_timestamp_9_0= 'isTimestamp' )
            	            {
            	            // InternalMoba.g:658:11: (lv_timestamp_9_0= 'isTimestamp' )
            	            // InternalMoba.g:659:12: lv_timestamp_9_0= 'isTimestamp'
            	            {
            	            lv_timestamp_9_0=(Token)match(input,34,FOLLOW_15); 

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

            	    // InternalMoba.g:672:9: (otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')' )?
            	    int alt11=2;
            	    int LA11_0 = input.LA(1);

            	    if ( (LA11_0==35) ) {
            	        alt11=1;
            	    }
            	    switch (alt11) {
            	        case 1 :
            	            // InternalMoba.g:673:10: otherlv_10= '(' ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) ) otherlv_13= ')'
            	            {
            	            otherlv_10=(Token)match(input,35,FOLLOW_12); 

            	            										newLeafNode(otherlv_10, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_2_1_0());
            	            									
            	            // InternalMoba.g:677:10: ( ( (lv_dateFormatString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_ID ) ) )
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
            	                    // InternalMoba.g:678:11: ( (lv_dateFormatString_11_0= RULE_STRING ) )
            	                    {
            	                    // InternalMoba.g:678:11: ( (lv_dateFormatString_11_0= RULE_STRING ) )
            	                    // InternalMoba.g:679:12: (lv_dateFormatString_11_0= RULE_STRING )
            	                    {
            	                    // InternalMoba.g:679:12: (lv_dateFormatString_11_0= RULE_STRING )
            	                    // InternalMoba.g:680:13: lv_dateFormatString_11_0= RULE_STRING
            	                    {
            	                    lv_dateFormatString_11_0=(Token)match(input,RULE_STRING,FOLLOW_16); 

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
            	                    // InternalMoba.g:697:11: ( (otherlv_12= RULE_ID ) )
            	                    {
            	                    // InternalMoba.g:697:11: ( (otherlv_12= RULE_ID ) )
            	                    // InternalMoba.g:698:12: (otherlv_12= RULE_ID )
            	                    {
            	                    // InternalMoba.g:698:12: (otherlv_12= RULE_ID )
            	                    // InternalMoba.g:699:13: otherlv_12= RULE_ID
            	                    {

            	                    													if (current==null) {
            	                    														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                    													}
            	                    												
            	                    otherlv_12=(Token)match(input,RULE_ID,FOLLOW_16); 

            	                    													newLeafNode(otherlv_12, grammarAccess.getMobaDataTypeAccess().getDateFormatConstMobaConstantCrossReference_3_2_1_1_1_0());
            	                    												

            	                    }


            	                    }


            	                    }
            	                    break;

            	            }

            	            otherlv_13=(Token)match(input,36,FOLLOW_14); 

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
            	    // InternalMoba.g:722:4: ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:722:4: ({...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) ) )
            	    // InternalMoba.g:723:5: {...}? => ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // InternalMoba.g:723:109: ( ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) ) )
            	    // InternalMoba.g:724:6: ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 3);
            	    					
            	    // InternalMoba.g:727:9: ({...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' ) )
            	    // InternalMoba.g:727:10: {...}? => (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:727:19: (otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')' )
            	    // InternalMoba.g:727:20: otherlv_14= 'constraints' otherlv_15= '(' ( (lv_constraints_16_0= ruleMobaConstraint ) ) (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )* otherlv_19= ')'
            	    {
            	    otherlv_14=(Token)match(input,37,FOLLOW_17); 

            	    									newLeafNode(otherlv_14, grammarAccess.getMobaDataTypeAccess().getConstraintsKeyword_3_3_0());
            	    								
            	    otherlv_15=(Token)match(input,35,FOLLOW_18); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_3_1());
            	    								
            	    // InternalMoba.g:735:9: ( (lv_constraints_16_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:736:10: (lv_constraints_16_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:736:10: (lv_constraints_16_0= ruleMobaConstraint )
            	    // InternalMoba.g:737:11: lv_constraints_16_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_3_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
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

            	    // InternalMoba.g:754:9: (otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) ) )*
            	    loop12:
            	    do {
            	        int alt12=2;
            	        int LA12_0 = input.LA(1);

            	        if ( (LA12_0==38) ) {
            	            alt12=1;
            	        }


            	        switch (alt12) {
            	    	case 1 :
            	    	    // InternalMoba.g:755:10: otherlv_17= ',' ( (lv_constraints_18_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_17=(Token)match(input,38,FOLLOW_18); 

            	    	    										newLeafNode(otherlv_17, grammarAccess.getMobaDataTypeAccess().getCommaKeyword_3_3_3_0());
            	    	    									
            	    	    // InternalMoba.g:759:10: ( (lv_constraints_18_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:760:11: (lv_constraints_18_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:760:11: (lv_constraints_18_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:761:12: lv_constraints_18_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_3_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_19);
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
            	    	    break loop12;
            	        }
            	    } while (true);

            	    otherlv_19=(Token)match(input,36,FOLLOW_14); 

            	    									newLeafNode(otherlv_19, grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_3_3_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:789:4: ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) )
            	    {
            	    // InternalMoba.g:789:4: ({...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) ) )
            	    // InternalMoba.g:790:5: {...}? => ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // InternalMoba.g:790:109: ( ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) ) )
            	    // InternalMoba.g:791:6: ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 4);
            	    					
            	    // InternalMoba.g:794:9: ({...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) ) )
            	    // InternalMoba.g:794:10: {...}? => ( (lv_enumAST_20_0= ruleMobaEnum ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:794:19: ( (lv_enumAST_20_0= ruleMobaEnum ) )
            	    // InternalMoba.g:794:20: (lv_enumAST_20_0= ruleMobaEnum )
            	    {
            	    // InternalMoba.g:794:20: (lv_enumAST_20_0= ruleMobaEnum )
            	    // InternalMoba.g:795:10: lv_enumAST_20_0= ruleMobaEnum
            	    {

            	    										newCompositeNode(grammarAccess.getMobaDataTypeAccess().getEnumASTMobaEnumParserRuleCall_3_4_0());
            	    									
            	    pushFollow(FOLLOW_14);
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
            	    break loop13;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            				

            }

            // InternalMoba.g:824:3: (this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current] )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==43) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalMoba.g:825:4: this_MobaPropertiesAble_21= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:841:1: entryRuleMobaEnum returns [EObject current=null] : iv_ruleMobaEnum= ruleMobaEnum EOF ;
    public final EObject entryRuleMobaEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnum = null;


        try {
            // InternalMoba.g:841:49: (iv_ruleMobaEnum= ruleMobaEnum EOF )
            // InternalMoba.g:842:2: iv_ruleMobaEnum= ruleMobaEnum EOF
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
    // InternalMoba.g:848:1: ruleMobaEnum returns [EObject current=null] : (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' ) ;
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
            // InternalMoba.g:854:2: ( (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' ) )
            // InternalMoba.g:855:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' )
            {
            // InternalMoba.g:855:2: (otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}' )
            // InternalMoba.g:856:3: otherlv_0= 'enum' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) ) (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )* otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,39,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEnumAccess().getEnumKeyword_0());
            		
            // InternalMoba.g:860:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:861:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:861:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:862:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,21,FOLLOW_20); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMoba.g:882:3: ( (lv_literals_3_0= ruleMobaEnumLiteral ) )
            // InternalMoba.g:883:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            {
            // InternalMoba.g:883:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            // InternalMoba.g:884:5: lv_literals_3_0= ruleMobaEnumLiteral
            {

            					newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_21);
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

            // InternalMoba.g:901:3: (otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==38) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalMoba.g:902:4: otherlv_4= ',' ( (lv_literals_5_0= ruleMobaEnumLiteral ) )
            	    {
            	    otherlv_4=(Token)match(input,38,FOLLOW_20); 

            	    				newLeafNode(otherlv_4, grammarAccess.getMobaEnumAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalMoba.g:906:4: ( (lv_literals_5_0= ruleMobaEnumLiteral ) )
            	    // InternalMoba.g:907:5: (lv_literals_5_0= ruleMobaEnumLiteral )
            	    {
            	    // InternalMoba.g:907:5: (lv_literals_5_0= ruleMobaEnumLiteral )
            	    // InternalMoba.g:908:6: lv_literals_5_0= ruleMobaEnumLiteral
            	    {

            	    						newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_21);
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
            	    break loop15;
                }
            } while (true);

            otherlv_6=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMoba.g:934:1: entryRuleMobaEnumLiteral returns [EObject current=null] : iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF ;
    public final EObject entryRuleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnumLiteral = null;


        try {
            // InternalMoba.g:934:56: (iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF )
            // InternalMoba.g:935:2: iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF
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
    // InternalMoba.g:941:1: ruleMobaEnumLiteral returns [EObject current=null] : (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:947:2: ( (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' ) )
            // InternalMoba.g:948:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:948:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')' )
            // InternalMoba.g:949:3: otherlv_0= 'lit' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEnumLiteralAccess().getLitKeyword_0());
            		
            // InternalMoba.g:953:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:954:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:954:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:955:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_17); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaEnumLiteralAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,35,FOLLOW_22); 

            			newLeafNode(otherlv_3, grammarAccess.getMobaEnumLiteralAccess().getLeftParenthesisKeyword_3());
            		
            // InternalMoba.g:979:3: ( (lv_literal_4_0= RULE_STRING ) )
            // InternalMoba.g:980:4: (lv_literal_4_0= RULE_STRING )
            {
            // InternalMoba.g:980:4: (lv_literal_4_0= RULE_STRING )
            // InternalMoba.g:981:5: lv_literal_4_0= RULE_STRING
            {
            lv_literal_4_0=(Token)match(input,RULE_STRING,FOLLOW_23); 

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

            otherlv_5=(Token)match(input,38,FOLLOW_24); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_5());
            		
            // InternalMoba.g:1001:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalMoba.g:1002:4: (lv_value_6_0= RULE_INT )
            {
            // InternalMoba.g:1002:4: (lv_value_6_0= RULE_INT )
            // InternalMoba.g:1003:5: lv_value_6_0= RULE_INT
            {
            lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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

            otherlv_7=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMoba.g:1027:1: entryRuleMobaConstant returns [EObject current=null] : iv_ruleMobaConstant= ruleMobaConstant EOF ;
    public final EObject entryRuleMobaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstant = null;


        try {
            // InternalMoba.g:1027:53: (iv_ruleMobaConstant= ruleMobaConstant EOF )
            // InternalMoba.g:1028:2: iv_ruleMobaConstant= ruleMobaConstant EOF
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
    // InternalMoba.g:1034:1: ruleMobaConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_valueAST_3_0 = null;

        EObject this_MobaPropertiesAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:1040:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:1041:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:1041:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:1042:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,41,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaConstantAccess().getConstKeyword_0());
            		
            // InternalMoba.g:1046:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1047:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1047:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1048:5: lv_name_1_0= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_25); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaConstantAccess().getEqualsSignKeyword_2());
            		
            // InternalMoba.g:1068:3: ( (lv_valueAST_3_0= ruleMobaConstantValue ) )
            // InternalMoba.g:1069:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            {
            // InternalMoba.g:1069:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            // InternalMoba.g:1070:5: lv_valueAST_3_0= ruleMobaConstantValue
            {

            					newCompositeNode(grammarAccess.getMobaConstantAccess().getValueASTMobaConstantValueParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_26);
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

            // InternalMoba.g:1087:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==43) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMoba.g:1088:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:1104:1: entryRuleMobaConstantValue returns [EObject current=null] : iv_ruleMobaConstantValue= ruleMobaConstantValue EOF ;
    public final EObject entryRuleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstantValue = null;


        try {
            // InternalMoba.g:1104:58: (iv_ruleMobaConstantValue= ruleMobaConstantValue EOF )
            // InternalMoba.g:1105:2: iv_ruleMobaConstantValue= ruleMobaConstantValue EOF
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
    // InternalMoba.g:1111:1: ruleMobaConstantValue returns [EObject current=null] : ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )? ) ;
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
            // InternalMoba.g:1117:2: ( ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )? ) )
            // InternalMoba.g:1118:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )? )
            {
            // InternalMoba.g:1118:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )? )
            // InternalMoba.g:1119:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )?
            {
            // InternalMoba.g:1119:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt17=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt17=1;
                }
                break;
            case RULE_INT:
                {
                alt17=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt17=3;
                }
                break;
            case RULE_ID:
                {
                alt17=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }

            switch (alt17) {
                case 1 :
                    // InternalMoba.g:1120:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1120:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:1121:5: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:1121:5: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:1122:6: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

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
                    // InternalMoba.g:1139:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    {
                    // InternalMoba.g:1139:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    // InternalMoba.g:1140:5: (lv_valueInt_1_0= RULE_INT )
                    {
                    // InternalMoba.g:1140:5: (lv_valueInt_1_0= RULE_INT )
                    // InternalMoba.g:1141:6: lv_valueInt_1_0= RULE_INT
                    {
                    lv_valueInt_1_0=(Token)match(input,RULE_INT,FOLLOW_27); 

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
                    // InternalMoba.g:1158:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:1158:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:1159:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:1159:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    // InternalMoba.g:1160:6: lv_valueDouble_2_0= RULE_DOUBLE
                    {
                    lv_valueDouble_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_27); 

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
                    // InternalMoba.g:1177:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:1177:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1178:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1178:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1179:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaConstantValueRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaConstantValueAccess().getValueConstMobaConstantCrossReference_0_3_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1191:3: (otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==42) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalMoba.g:1192:4: otherlv_4= '+' ( (lv_tail_5_0= ruleMobaConstantValue ) )
                    {
                    otherlv_4=(Token)match(input,42,FOLLOW_25); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaConstantValueAccess().getPlusSignKeyword_1_0());
                    			
                    // InternalMoba.g:1196:4: ( (lv_tail_5_0= ruleMobaConstantValue ) )
                    // InternalMoba.g:1197:5: (lv_tail_5_0= ruleMobaConstantValue )
                    {
                    // InternalMoba.g:1197:5: (lv_tail_5_0= ruleMobaConstantValue )
                    // InternalMoba.g:1198:6: lv_tail_5_0= ruleMobaConstantValue
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
    // InternalMoba.g:1221:1: ruleMobaPropertiesAble[EObject in_current] returns [EObject current=in_current] : (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' ) ;
    public final EObject ruleMobaPropertiesAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_properties_1_0 = null;

        EObject lv_properties_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1227:2: ( (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' ) )
            // InternalMoba.g:1228:2: (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' )
            {
            // InternalMoba.g:1228:2: (otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']' )
            // InternalMoba.g:1229:3: otherlv_0= '[' ( (lv_properties_1_0= ruleMobaProperty ) ) (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )* otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_12); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaPropertiesAbleAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoba.g:1233:3: ( (lv_properties_1_0= ruleMobaProperty ) )
            // InternalMoba.g:1234:4: (lv_properties_1_0= ruleMobaProperty )
            {
            // InternalMoba.g:1234:4: (lv_properties_1_0= ruleMobaProperty )
            // InternalMoba.g:1235:5: lv_properties_1_0= ruleMobaProperty
            {

            					newCompositeNode(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_28);
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

            // InternalMoba.g:1252:3: (otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==38) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // InternalMoba.g:1253:4: otherlv_2= ',' ( (lv_properties_3_0= ruleMobaProperty ) )
            	    {
            	    otherlv_2=(Token)match(input,38,FOLLOW_12); 

            	    				newLeafNode(otherlv_2, grammarAccess.getMobaPropertiesAbleAccess().getCommaKeyword_2_0());
            	    			
            	    // InternalMoba.g:1257:4: ( (lv_properties_3_0= ruleMobaProperty ) )
            	    // InternalMoba.g:1258:5: (lv_properties_3_0= ruleMobaProperty )
            	    {
            	    // InternalMoba.g:1258:5: (lv_properties_3_0= ruleMobaProperty )
            	    // InternalMoba.g:1259:6: lv_properties_3_0= ruleMobaProperty
            	    {

            	    						newCompositeNode(grammarAccess.getMobaPropertiesAbleAccess().getPropertiesMobaPropertyParserRuleCall_2_1_0());
            	    					
            	    pushFollow(FOLLOW_28);
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
            	    break loop19;
                }
            } while (true);

            otherlv_4=(Token)match(input,44,FOLLOW_2); 

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
    // InternalMoba.g:1285:1: entryRuleMobaProperty returns [EObject current=null] : iv_ruleMobaProperty= ruleMobaProperty EOF ;
    public final EObject entryRuleMobaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProperty = null;


        try {
            // InternalMoba.g:1285:53: (iv_ruleMobaProperty= ruleMobaProperty EOF )
            // InternalMoba.g:1286:2: iv_ruleMobaProperty= ruleMobaProperty EOF
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
    // InternalMoba.g:1292:1: ruleMobaProperty returns [EObject current=null] : ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaProperty() throws RecognitionException {
        EObject current = null;

        Token lv_keyString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_valueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:1298:2: ( ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) ) )
            // InternalMoba.g:1299:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            {
            // InternalMoba.g:1299:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) ) )
            // InternalMoba.g:1300:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalMoba.g:1300:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
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
                    // InternalMoba.g:1301:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1301:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    // InternalMoba.g:1302:5: (lv_keyString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:1302:5: (lv_keyString_0_0= RULE_STRING )
                    // InternalMoba.g:1303:6: lv_keyString_0_0= RULE_STRING
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
                    // InternalMoba.g:1320:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalMoba.g:1320:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoba.g:1321:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoba.g:1321:5: (otherlv_1= RULE_ID )
                    // InternalMoba.g:1322:6: otherlv_1= RULE_ID
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

            otherlv_2=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaPropertyAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:1338:3: ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_ID ) ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_STRING) ) {
                alt21=1;
            }
            else if ( (LA21_0==RULE_ID) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // InternalMoba.g:1339:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1339:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    // InternalMoba.g:1340:5: (lv_valueString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:1340:5: (lv_valueString_3_0= RULE_STRING )
                    // InternalMoba.g:1341:6: lv_valueString_3_0= RULE_STRING
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
                    // InternalMoba.g:1358:4: ( (otherlv_4= RULE_ID ) )
                    {
                    // InternalMoba.g:1358:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMoba.g:1359:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMoba.g:1359:5: (otherlv_4= RULE_ID )
                    // InternalMoba.g:1360:6: otherlv_4= RULE_ID
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
    // InternalMoba.g:1376:1: entryRuleMobaData returns [EObject current=null] : iv_ruleMobaData= ruleMobaData EOF ;
    public final EObject entryRuleMobaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaData = null;


        try {
            // InternalMoba.g:1376:49: (iv_ruleMobaData= ruleMobaData EOF )
            // InternalMoba.g:1377:2: iv_ruleMobaData= ruleMobaData EOF
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
    // InternalMoba.g:1383:1: ruleMobaData returns [EObject current=null] : (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) ;
    public final EObject ruleMobaData() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntity_0 = null;

        EObject this_MobaDto_1 = null;

        EObject this_MobaQueue_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1389:2: ( (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) )
            // InternalMoba.g:1390:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            {
            // InternalMoba.g:1390:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 49:
                {
                alt22=1;
                }
                break;
            case 51:
                {
                alt22=2;
                }
                break;
            case 52:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // InternalMoba.g:1391:3: this_MobaEntity_0= ruleMobaEntity
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
                    // InternalMoba.g:1400:3: this_MobaDto_1= ruleMobaDto
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
                    // InternalMoba.g:1409:3: this_MobaQueue_2= ruleMobaQueue
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
    // InternalMoba.g:1421:1: entryRuleMobaSettings returns [EObject current=null] : iv_ruleMobaSettings= ruleMobaSettings EOF ;
    public final EObject entryRuleMobaSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettings = null;


        try {
            // InternalMoba.g:1421:53: (iv_ruleMobaSettings= ruleMobaSettings EOF )
            // InternalMoba.g:1422:2: iv_ruleMobaSettings= ruleMobaSettings EOF
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
    // InternalMoba.g:1428:1: ruleMobaSettings returns [EObject current=null] : ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) ;
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
            // InternalMoba.g:1434:2: ( ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:1435:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:1435:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:1436:3: () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}'
            {
            // InternalMoba.g:1436:3: ()
            // InternalMoba.g:1437:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0(),
            					current);
            			

            }

            // InternalMoba.g:1443:3: ( (lv_active_1_0= 'active' ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalMoba.g:1444:4: (lv_active_1_0= 'active' )
                    {
                    // InternalMoba.g:1444:4: (lv_active_1_0= 'active' )
                    // InternalMoba.g:1445:5: lv_active_1_0= 'active'
                    {
                    lv_active_1_0=(Token)match(input,24,FOLLOW_29); 

                    					newLeafNode(lv_active_1_0, grammarAccess.getMobaSettingsAccess().getActiveActiveKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getMobaSettingsRule());
                    					}
                    					setWithLastConsumed(current, "active", true, "active");
                    				

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,45,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getMobaSettingsAccess().getSettingsKeyword_2());
            		
            // InternalMoba.g:1461:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMoba.g:1462:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMoba.g:1462:4: (lv_name_3_0= RULE_ID )
            // InternalMoba.g:1463:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            // InternalMoba.g:1479:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==29) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalMoba.g:1480:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getMobaSettingsAccess().getExtendsKeyword_4_0());
                    			
                    // InternalMoba.g:1484:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMoba.g:1485:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMoba.g:1485:5: (otherlv_5= RULE_ID )
                    // InternalMoba.g:1486:6: otherlv_5= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaSettingsRule());
                    						}
                    					
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_5, grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1498:3: (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==43) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalMoba.g:1499:4: this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current]
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

            otherlv_7=(Token)match(input,21,FOLLOW_32); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalMoba.g:1515:3: ( (lv_features_8_0= ruleMobaSettingsFeature ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==55) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMoba.g:1516:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    {
            	    // InternalMoba.g:1516:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    // InternalMoba.g:1517:5: lv_features_8_0= ruleMobaSettingsFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaSettingsAccess().getFeaturesMobaSettingsFeatureParserRuleCall_7_0());
            	    				
            	    pushFollow(FOLLOW_32);
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
            	    break loop26;
                }
            } while (true);

            otherlv_9=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMoba.g:1542:1: entryRuleMobaCache returns [EObject current=null] : iv_ruleMobaCache= ruleMobaCache EOF ;
    public final EObject entryRuleMobaCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaCache = null;


        try {
            // InternalMoba.g:1542:50: (iv_ruleMobaCache= ruleMobaCache EOF )
            // InternalMoba.g:1543:2: iv_ruleMobaCache= ruleMobaCache EOF
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
    // InternalMoba.g:1549:1: ruleMobaCache returns [EObject current=null] : ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) ;
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
            // InternalMoba.g:1555:2: ( ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) )
            // InternalMoba.g:1556:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            {
            // InternalMoba.g:1556:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            // InternalMoba.g:1557:3: () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            {
            // InternalMoba.g:1557:3: ()
            // InternalMoba.g:1558:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaCacheAccess().getMobaCacheAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,46,FOLLOW_33); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaCacheAccess().getCacheKeyword_1());
            		
            // InternalMoba.g:1568:3: (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMoba.g:1569:4: otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')'
                    {
                    otherlv_2=(Token)match(input,35,FOLLOW_34); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_2_0());
                    			
                    // InternalMoba.g:1573:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) )
                    // InternalMoba.g:1574:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    {
                    // InternalMoba.g:1574:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    // InternalMoba.g:1575:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    {
                     
                    					  getUnorderedGroupHelper().enter(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    					
                    // InternalMoba.g:1578:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    // InternalMoba.g:1579:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    {
                    // InternalMoba.g:1579:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    loop29:
                    do {
                        int alt29=3;
                        int LA29_0 = input.LA(1);

                        if ( LA29_0 == 47 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                            alt29=1;
                        }
                        else if ( LA29_0 == 48 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                            alt29=2;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMoba.g:1580:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:1580:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:1581:6: {...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0)");
                    	    }
                    	    // InternalMoba.g:1581:109: ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:1582:7: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0);
                    	    						
                    	    // InternalMoba.g:1585:10: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:1585:11: {...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:1585:20: (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    // InternalMoba.g:1585:21: otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    	    {
                    	    otherlv_4=(Token)match(input,47,FOLLOW_5); 

                    	    										newLeafNode(otherlv_4, grammarAccess.getMobaCacheAccess().getTypeKeyword_2_1_0_0());
                    	    									
                    	    otherlv_5=(Token)match(input,20,FOLLOW_12); 

                    	    										newLeafNode(otherlv_5, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_0_1());
                    	    									
                    	    // InternalMoba.g:1593:10: ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
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
                    	            // InternalMoba.g:1594:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:1594:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            // InternalMoba.g:1595:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:1595:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            // InternalMoba.g:1596:13: lv_cacheTypeString_6_0= RULE_STRING
                    	            {
                    	            lv_cacheTypeString_6_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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
                    	            // InternalMoba.g:1613:11: ( (otherlv_7= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:1613:11: ( (otherlv_7= RULE_ID ) )
                    	            // InternalMoba.g:1614:12: (otherlv_7= RULE_ID )
                    	            {
                    	            // InternalMoba.g:1614:12: (otherlv_7= RULE_ID )
                    	            // InternalMoba.g:1615:13: otherlv_7= RULE_ID
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_34); 

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
                    	    // InternalMoba.g:1633:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:1633:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:1634:6: {...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1)");
                    	    }
                    	    // InternalMoba.g:1634:109: ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:1635:7: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    {

                    	    							getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1);
                    	    						
                    	    // InternalMoba.g:1638:10: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:1638:11: {...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:1638:20: (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    // InternalMoba.g:1638:21: otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,48,FOLLOW_5); 

                    	    										newLeafNode(otherlv_8, grammarAccess.getMobaCacheAccess().getStrategyKeyword_2_1_1_0());
                    	    									
                    	    otherlv_9=(Token)match(input,20,FOLLOW_12); 

                    	    										newLeafNode(otherlv_9, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_1_1());
                    	    									
                    	    // InternalMoba.g:1646:10: ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
                    	    int alt28=2;
                    	    int LA28_0 = input.LA(1);

                    	    if ( (LA28_0==RULE_STRING) ) {
                    	        alt28=1;
                    	    }
                    	    else if ( (LA28_0==RULE_ID) ) {
                    	        alt28=2;
                    	    }
                    	    else {
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 28, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt28) {
                    	        case 1 :
                    	            // InternalMoba.g:1647:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:1647:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            // InternalMoba.g:1648:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:1648:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            // InternalMoba.g:1649:13: lv_cacheStrategyString_10_0= RULE_STRING
                    	            {
                    	            lv_cacheStrategyString_10_0=(Token)match(input,RULE_STRING,FOLLOW_34); 

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
                    	            // InternalMoba.g:1666:11: ( (otherlv_11= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:1666:11: ( (otherlv_11= RULE_ID ) )
                    	            // InternalMoba.g:1667:12: (otherlv_11= RULE_ID )
                    	            {
                    	            // InternalMoba.g:1667:12: (otherlv_11= RULE_ID )
                    	            // InternalMoba.g:1668:13: otherlv_11= RULE_ID
                    	            {

                    	            													if (current==null) {
                    	            														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	            													}
                    	            												
                    	            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_34); 

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
                    	    break loop29;
                        }
                    } while (true);


                    }


                    }

                     
                    					  getUnorderedGroupHelper().leave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    					

                    }

                    otherlv_12=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMoba.g:1702:1: entryRuleMobaEntity returns [EObject current=null] : iv_ruleMobaEntity= ruleMobaEntity EOF ;
    public final EObject entryRuleMobaEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntity = null;


        try {
            // InternalMoba.g:1702:51: (iv_ruleMobaEntity= ruleMobaEntity EOF )
            // InternalMoba.g:1703:2: iv_ruleMobaEntity= ruleMobaEntity EOF
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
    // InternalMoba.g:1709:1: ruleMobaEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' ) ;
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
            // InternalMoba.g:1715:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' ) )
            // InternalMoba.g:1716:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' )
            {
            // InternalMoba.g:1716:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' )
            // InternalMoba.g:1717:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )? otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,49,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAccess().getEntityKeyword_0());
            		
            // InternalMoba.g:1721:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1722:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1722:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1723:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_35); 

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

            // InternalMoba.g:1739:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) )
            // InternalMoba.g:1740:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:1740:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            // InternalMoba.g:1741:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            				
            // InternalMoba.g:1744:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            // InternalMoba.g:1745:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            {
            // InternalMoba.g:1745:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( LA31_0 == 29 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
                    alt31=1;
                }
                else if ( LA31_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalMoba.g:1746:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1746:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:1747:5: {...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoba.g:1747:107: ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:1748:6: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0);
            	    					
            	    // InternalMoba.g:1751:9: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalMoba.g:1751:10: {...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:1751:19: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalMoba.g:1751:20: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,29,FOLLOW_3); 

            	    									newLeafNode(otherlv_3, grammarAccess.getMobaEntityAccess().getExtendsKeyword_2_0_0());
            	    								
            	    // InternalMoba.g:1755:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalMoba.g:1756:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMoba.g:1756:10: (otherlv_4= RULE_ID )
            	    // InternalMoba.g:1757:11: otherlv_4= RULE_ID
            	    {

            	    											if (current==null) {
            	    												current = createModelElement(grammarAccess.getMobaEntityRule());
            	    											}
            	    										
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_35); 

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
            	    // InternalMoba.g:1774:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    {
            	    // InternalMoba.g:1774:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    // InternalMoba.g:1775:5: {...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoba.g:1775:107: ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    // InternalMoba.g:1776:6: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1);
            	    					
            	    // InternalMoba.g:1779:9: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    // InternalMoba.g:1779:10: {...}? => ( (lv_cache_5_0= ruleMobaCache ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:1779:19: ( (lv_cache_5_0= ruleMobaCache ) )
            	    // InternalMoba.g:1779:20: (lv_cache_5_0= ruleMobaCache )
            	    {
            	    // InternalMoba.g:1779:20: (lv_cache_5_0= ruleMobaCache )
            	    // InternalMoba.g:1780:10: lv_cache_5_0= ruleMobaCache
            	    {

            	    										newCompositeNode(grammarAccess.getMobaEntityAccess().getCacheMobaCacheParserRuleCall_2_1_0());
            	    									
            	    pushFollow(FOLLOW_35);
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
            	    break loop31;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            				

            }

            // InternalMoba.g:1809:3: (this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current] )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==43) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalMoba.g:1810:4: this_MobaPropertiesAble_6= ruleMobaPropertiesAble[$current]
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

            otherlv_7=(Token)match(input,21,FOLLOW_36); 

            			newLeafNode(otherlv_7, grammarAccess.getMobaEntityAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:1826:3: ( (lv_features_8_0= ruleMobaEntityFeature ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==55||LA33_0==60) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoba.g:1827:4: (lv_features_8_0= ruleMobaEntityFeature )
            	    {
            	    // InternalMoba.g:1827:4: (lv_features_8_0= ruleMobaEntityFeature )
            	    // InternalMoba.g:1828:5: lv_features_8_0= ruleMobaEntityFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaEntityAccess().getFeaturesMobaEntityFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_36);
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
            	    break loop33;
                }
            } while (true);

            // InternalMoba.g:1845:3: ( (lv_index_9_0= ruleMobaEntityIndex ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==50) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalMoba.g:1846:4: (lv_index_9_0= ruleMobaEntityIndex )
                    {
                    // InternalMoba.g:1846:4: (lv_index_9_0= ruleMobaEntityIndex )
                    // InternalMoba.g:1847:5: lv_index_9_0= ruleMobaEntityIndex
                    {

                    					newCompositeNode(grammarAccess.getMobaEntityAccess().getIndexMobaEntityIndexParserRuleCall_6_0());
                    				
                    pushFollow(FOLLOW_37);
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

            otherlv_10=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMoba.g:1872:1: entryRuleMobaEntityIndex returns [EObject current=null] : iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF ;
    public final EObject entryRuleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityIndex = null;


        try {
            // InternalMoba.g:1872:56: (iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF )
            // InternalMoba.g:1873:2: iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF
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
    // InternalMoba.g:1879:1: ruleMobaEntityIndex returns [EObject current=null] : (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) ;
    public final EObject ruleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:1885:2: ( (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) )
            // InternalMoba.g:1886:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            {
            // InternalMoba.g:1886:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            // InternalMoba.g:1887:3: otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            {
            otherlv_0=(Token)match(input,50,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityIndexAccess().getIndexKeyword_0());
            		
            // InternalMoba.g:1891:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:1892:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:1892:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:1893:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityIndexRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_23); 

            					newLeafNode(otherlv_1, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_1_0());
            				

            }


            }

            // InternalMoba.g:1904:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            // InternalMoba.g:1905:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )*
            {
            otherlv_2=(Token)match(input,38,FOLLOW_38); 

            				newLeafNode(otherlv_2, grammarAccess.getMobaEntityIndexAccess().getCommaKeyword_2_0());
            			
            // InternalMoba.g:1909:4: ( (otherlv_3= RULE_ID ) )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==RULE_ID) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalMoba.g:1910:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMoba.g:1910:5: (otherlv_3= RULE_ID )
            	    // InternalMoba.g:1911:6: otherlv_3= RULE_ID
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getMobaEntityIndexRule());
            	    						}
            	    					
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_38); 

            	    						newLeafNode(otherlv_3, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_2_1_0());
            	    					

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalMoba.g:1927:1: entryRuleMobaDto returns [EObject current=null] : iv_ruleMobaDto= ruleMobaDto EOF ;
    public final EObject entryRuleMobaDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDto = null;


        try {
            // InternalMoba.g:1927:48: (iv_ruleMobaDto= ruleMobaDto EOF )
            // InternalMoba.g:1928:2: iv_ruleMobaDto= ruleMobaDto EOF
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
    // InternalMoba.g:1934:1: ruleMobaDto returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' ) ;
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
            // InternalMoba.g:1940:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:1941:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:1941:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:1942:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,51,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAccess().getDtoKeyword_0());
            		
            // InternalMoba.g:1946:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1947:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1947:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1948:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            // InternalMoba.g:1964:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==29) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalMoba.g:1965:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaDtoAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:1969:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1970:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1970:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1971:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDtoRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1983:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==43) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoba.g:1984:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
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

            otherlv_5=(Token)match(input,21,FOLLOW_39); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaDtoAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:2000:3: ( (lv_features_6_0= ruleMobaDtoFeature ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==55||LA38_0==60) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalMoba.g:2001:4: (lv_features_6_0= ruleMobaDtoFeature )
            	    {
            	    // InternalMoba.g:2001:4: (lv_features_6_0= ruleMobaDtoFeature )
            	    // InternalMoba.g:2002:5: lv_features_6_0= ruleMobaDtoFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaDtoAccess().getFeaturesMobaDtoFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_39);
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
            	    break loop38;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMoba.g:2027:1: entryRuleMobaQueue returns [EObject current=null] : iv_ruleMobaQueue= ruleMobaQueue EOF ;
    public final EObject entryRuleMobaQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueue = null;


        try {
            // InternalMoba.g:2027:50: (iv_ruleMobaQueue= ruleMobaQueue EOF )
            // InternalMoba.g:2028:2: iv_ruleMobaQueue= ruleMobaQueue EOF
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
    // InternalMoba.g:2034:1: ruleMobaQueue returns [EObject current=null] : (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) ;
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
            // InternalMoba.g:2040:2: ( (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:2041:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:2041:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:2042:3: otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )? otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueAccess().getQueueKeyword_0());
            		
            // InternalMoba.g:2046:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2047:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2047:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2048:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_30); 

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

            // InternalMoba.g:2064:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==29) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoba.g:2065:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,29,FOLLOW_3); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0());
                    			
                    // InternalMoba.g:2069:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:2070:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:2070:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:2071:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaQueueRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_31); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:2083:3: (this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current] )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==43) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoba.g:2084:4: this_MobaPropertiesAble_4= ruleMobaPropertiesAble[$current]
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

            otherlv_5=(Token)match(input,21,FOLLOW_40); 

            			newLeafNode(otherlv_5, grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_4());
            		
            // InternalMoba.g:2100:3: ( (lv_features_6_0= ruleMobaQueueFeature ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==60) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMoba.g:2101:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    {
            	    // InternalMoba.g:2101:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    // InternalMoba.g:2102:5: lv_features_6_0= ruleMobaQueueFeature
            	    {

            	    					newCompositeNode(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_40);
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
            	    break loop41;
                }
            } while (true);

            otherlv_7=(Token)match(input,22,FOLLOW_2); 

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
    // InternalMoba.g:2127:1: entryRuleMobaService returns [EObject current=null] : iv_ruleMobaService= ruleMobaService EOF ;
    public final EObject entryRuleMobaService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaService = null;


        try {
            // InternalMoba.g:2127:52: (iv_ruleMobaService= ruleMobaService EOF )
            // InternalMoba.g:2128:2: iv_ruleMobaService= ruleMobaService EOF
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
    // InternalMoba.g:2134:1: ruleMobaService returns [EObject current=null] : (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud ) ;
    public final EObject ruleMobaService() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRestCustom_0 = null;

        EObject this_MobaRestCrud_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:2140:2: ( (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud ) )
            // InternalMoba.g:2141:2: (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud )
            {
            // InternalMoba.g:2141:2: (this_MobaRestCustom_0= ruleMobaRestCustom | this_MobaRestCrud_1= ruleMobaRestCrud )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==53) ) {
                alt42=1;
            }
            else if ( (LA42_0==54) ) {
                alt42=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;
            }
            switch (alt42) {
                case 1 :
                    // InternalMoba.g:2142:3: this_MobaRestCustom_0= ruleMobaRestCustom
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
                    // InternalMoba.g:2151:3: this_MobaRestCrud_1= ruleMobaRestCrud
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
    // InternalMoba.g:2163:1: entryRuleMobaRestCustom returns [EObject current=null] : iv_ruleMobaRestCustom= ruleMobaRestCustom EOF ;
    public final EObject entryRuleMobaRestCustom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestCustom = null;


        try {
            // InternalMoba.g:2163:55: (iv_ruleMobaRestCustom= ruleMobaRestCustom EOF )
            // InternalMoba.g:2164:2: iv_ruleMobaRestCustom= ruleMobaRestCustom EOF
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
    // InternalMoba.g:2170:1: ruleMobaRestCustom returns [EObject current=null] : (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaRestCustom() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaPropertiesAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2176:2: ( (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2177:2: (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2177:2: (otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2178:3: otherlv_0= 'rest' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,53,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRestCustomAccess().getRestKeyword_0());
            		
            // InternalMoba.g:2182:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2183:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2183:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2184:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:2200:3: (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==43) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalMoba.g:2201:4: this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:2217:1: entryRuleMobaRestCrud returns [EObject current=null] : iv_ruleMobaRestCrud= ruleMobaRestCrud EOF ;
    public final EObject entryRuleMobaRestCrud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestCrud = null;


        try {
            // InternalMoba.g:2217:53: (iv_ruleMobaRestCrud= ruleMobaRestCrud EOF )
            // InternalMoba.g:2218:2: iv_ruleMobaRestCrud= ruleMobaRestCrud EOF
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
    // InternalMoba.g:2224:1: ruleMobaRestCrud returns [EObject current=null] : (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) ;
    public final EObject ruleMobaRestCrud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaPropertiesAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2230:2: ( (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2231:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2231:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2232:3: otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,54,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRestCrudAccess().getRestCrudKeyword_0());
            		
            // InternalMoba.g:2236:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2237:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2237:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2238:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:2254:3: (this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current] )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==43) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoba.g:2255:4: this_MobaPropertiesAble_2= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:2271:1: entryRuleMobaEntityFeature returns [EObject current=null] : iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF ;
    public final EObject entryRuleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityFeature = null;


        try {
            // InternalMoba.g:2271:58: (iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF )
            // InternalMoba.g:2272:2: iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF
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
    // InternalMoba.g:2278:1: ruleMobaEntityFeature returns [EObject current=null] : (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference ) ;
    public final EObject ruleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntityAttribute_0 = null;

        EObject this_MobaEntityReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:2284:2: ( (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference ) )
            // InternalMoba.g:2285:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference )
            {
            // InternalMoba.g:2285:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==55) ) {
                alt45=1;
            }
            else if ( (LA45_0==60) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // InternalMoba.g:2286:3: this_MobaEntityAttribute_0= ruleMobaEntityAttribute
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
                    // InternalMoba.g:2295:3: this_MobaEntityReference_1= ruleMobaEntityReference
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
    // InternalMoba.g:2307:1: entryRuleMobaEntityAttribute returns [EObject current=null] : iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF ;
    public final EObject entryRuleMobaEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityAttribute = null;


        try {
            // InternalMoba.g:2307:60: (iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF )
            // InternalMoba.g:2308:2: iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF
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
    // InternalMoba.g:2314:1: ruleMobaEntityAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:2320:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2321:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2321:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2322:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2326:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2327:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2327:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2328:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2331:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:2332:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:2332:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop47:
            do {
                int alt47=6;
                int LA47_0 = input.LA(1);

                if ( LA47_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt47=2;
                }
                else if ( LA47_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt47=3;
                }
                else if ( LA47_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt47=4;
                }
                else if ( LA47_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt47=5;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMoba.g:2333:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2333:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2334:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2334:116: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2335:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2338:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:2338:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2338:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:2338:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2338:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:2339:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,56,FOLLOW_41); 

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
            	    // InternalMoba.g:2356:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2356:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2357:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2357:116: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2358:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2361:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:2361:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2361:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:2361:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:2361:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:2362:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,57,FOLLOW_41); 

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
            	    // InternalMoba.g:2379:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2379:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:2380:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2380:116: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:2381:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2384:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:2384:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2384:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:2384:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:2384:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:2385:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,58,FOLLOW_41); 

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
            	    // InternalMoba.g:2402:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2402:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:2403:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:2403:116: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:2404:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:2407:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:2407:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2407:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:2407:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:2407:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:2408:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,59,FOLLOW_41); 

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
            	    // InternalMoba.g:2425:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2425:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:2426:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:2426:116: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:2427:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:2430:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:2430:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:2430:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:2430:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,37,FOLLOW_17); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaEntityAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,35,FOLLOW_18); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaEntityAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:2438:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:2439:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:2439:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:2440:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
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

            	    // InternalMoba.g:2457:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==38) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // InternalMoba.g:2458:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,38,FOLLOW_18); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaEntityAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:2462:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:2463:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:2463:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:2464:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_19);
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
            	    	    break loop46;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,36,FOLLOW_41); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaEntityAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2499:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:2500:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:2500:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:2501:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_42); 

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
            		
            // InternalMoba.g:2523:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:2524:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:2524:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:2525:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:2541:3: (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==43) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalMoba.g:2542:4: this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:2558:1: entryRuleMobaSettingsFeature returns [EObject current=null] : iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF ;
    public final EObject entryRuleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsFeature = null;


        try {
            // InternalMoba.g:2558:60: (iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF )
            // InternalMoba.g:2559:2: iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF
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
    // InternalMoba.g:2565:1: ruleMobaSettingsFeature returns [EObject current=null] : this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute ;
    public final EObject ruleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaSettingsAttribute_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2571:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute )
            // InternalMoba.g:2572:2: this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute
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
    // InternalMoba.g:2583:1: entryRuleMobaSettingsAttribute returns [EObject current=null] : iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF ;
    public final EObject entryRuleMobaSettingsAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsAttribute = null;


        try {
            // InternalMoba.g:2583:62: (iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF )
            // InternalMoba.g:2584:2: iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF
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
    // InternalMoba.g:2590:1: ruleMobaSettingsAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:2596:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2597:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2597:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2598:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_41); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:2602:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:2603:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2603:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:2604:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2607:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:2608:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:2608:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop50:
            do {
                int alt50=6;
                int LA50_0 = input.LA(1);

                if ( LA50_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt50=1;
                }
                else if ( LA50_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt50=2;
                }
                else if ( LA50_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt50=3;
                }
                else if ( LA50_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt50=4;
                }
                else if ( LA50_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt50=5;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMoba.g:2609:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2609:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2610:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2610:118: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2611:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2614:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:2614:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2614:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:2614:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2614:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:2615:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,56,FOLLOW_41); 

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
            	    // InternalMoba.g:2632:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2632:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2633:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2633:118: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2634:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2637:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:2637:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2637:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:2637:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:2637:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:2638:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,57,FOLLOW_41); 

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
            	    // InternalMoba.g:2655:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2655:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:2656:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2656:118: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:2657:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2660:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:2660:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2660:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:2660:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:2660:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:2661:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,58,FOLLOW_41); 

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
            	    // InternalMoba.g:2678:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2678:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:2679:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:2679:118: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:2680:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:2683:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:2683:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2683:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:2683:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:2683:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:2684:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,59,FOLLOW_41); 

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
            	    // InternalMoba.g:2701:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2701:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:2702:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:2702:118: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:2703:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:2706:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:2706:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:2706:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:2706:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,37,FOLLOW_17); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaSettingsAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,35,FOLLOW_18); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:2714:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:2715:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:2715:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:2716:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
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

            	    // InternalMoba.g:2733:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==38) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // InternalMoba.g:2734:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,38,FOLLOW_18); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:2738:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:2739:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:2739:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:2740:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_19);
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
            	    	    break loop49;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,36,FOLLOW_41); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaSettingsAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2775:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:2776:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:2776:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:2777:5: otherlv_12= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            					}
            				
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_42); 

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
            		
            // InternalMoba.g:2799:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:2800:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:2800:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:2801:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:2817:3: (this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current] )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==43) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoba.g:2818:4: this_MobaPropertiesAble_15= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:2835:1: ruleMobaMultiplicityAble[EObject in_current] returns [EObject current=in_current] : ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? ;
    public final EObject ruleMobaMultiplicityAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2841:2: ( ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? )
            // InternalMoba.g:2842:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            {
            // InternalMoba.g:2842:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==43) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMoba.g:2843:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    {
                    // InternalMoba.g:2843:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    // InternalMoba.g:2844:4: lv_multiplicity_0_0= ruleMobaMuliplicity
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
    // InternalMoba.g:2864:1: entryRuleMobaEntityReference returns [EObject current=null] : iv_ruleMobaEntityReference= ruleMobaEntityReference EOF ;
    public final EObject entryRuleMobaEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityReference = null;


        try {
            // InternalMoba.g:2864:60: (iv_ruleMobaEntityReference= ruleMobaEntityReference EOF )
            // InternalMoba.g:2865:2: iv_ruleMobaEntityReference= ruleMobaEntityReference EOF
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
    // InternalMoba.g:2871:1: ruleMobaEntityReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:2877:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:2878:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:2878:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:2879:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaEntityReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:2883:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:2884:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:2884:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:2885:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:2888:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:2889:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:2889:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop53:
            do {
                int alt53=4;
                int LA53_0 = input.LA(1);

                if ( LA53_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt53=1;
                }
                else if ( LA53_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt53=2;
                }
                else if ( LA53_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt53=3;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMoba.g:2890:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2890:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:2891:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:2891:116: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:2892:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:2895:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:2895:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:2895:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:2895:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:2895:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:2896:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,61,FOLLOW_43); 

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
            	    // InternalMoba.g:2913:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2913:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:2914:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:2914:116: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:2915:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:2918:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:2918:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:2918:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:2918:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:2918:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:2919:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,56,FOLLOW_43); 

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
            	    // InternalMoba.g:2936:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:2936:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:2937:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:2937:116: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:2938:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:2941:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:2941:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:2941:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:2941:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:2941:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:2942:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,57,FOLLOW_43); 

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
            	    break loop53;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:2966:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:2967:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:2967:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:2968:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_42); 

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
            		
            // InternalMoba.g:2990:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:2991:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:2991:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:2992:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:3008:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==43) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoba.g:3009:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:3025:1: entryRuleMobaDtoFeature returns [EObject current=null] : iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF ;
    public final EObject entryRuleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoFeature = null;


        try {
            // InternalMoba.g:3025:55: (iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF )
            // InternalMoba.g:3026:2: iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF
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
    // InternalMoba.g:3032:1: ruleMobaDtoFeature returns [EObject current=null] : (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference ) ;
    public final EObject ruleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDtoAttribute_0 = null;

        EObject this_MobaDtoReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:3038:2: ( (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference ) )
            // InternalMoba.g:3039:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference )
            {
            // InternalMoba.g:3039:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference )
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==55) ) {
                alt55=1;
            }
            else if ( (LA55_0==60) ) {
                alt55=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;
            }
            switch (alt55) {
                case 1 :
                    // InternalMoba.g:3040:3: this_MobaDtoAttribute_0= ruleMobaDtoAttribute
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
                    // InternalMoba.g:3049:3: this_MobaDtoReference_1= ruleMobaDtoReference
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
    // InternalMoba.g:3061:1: entryRuleMobaDtoAttribute returns [EObject current=null] : iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF ;
    public final EObject entryRuleMobaDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoAttribute = null;


        try {
            // InternalMoba.g:3061:57: (iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF )
            // InternalMoba.g:3062:2: iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF
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
    // InternalMoba.g:3068:1: ruleMobaDtoAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:3074:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3075:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3075:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3076:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,55,FOLLOW_44); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAttributeAccess().getVarKeyword_0());
            		
            // InternalMoba.g:3080:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:3081:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:3081:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            // InternalMoba.g:3082:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3085:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            // InternalMoba.g:3086:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            {
            // InternalMoba.g:3086:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            loop57:
            do {
                int alt57=7;
                int LA57_0 = input.LA(1);

                if ( LA57_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt57=1;
                }
                else if ( LA57_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt57=2;
                }
                else if ( LA57_0 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt57=3;
                }
                else if ( LA57_0 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt57=4;
                }
                else if ( LA57_0 == 37 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt57=5;
                }
                else if ( LA57_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5) ) {
                    alt57=6;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalMoba.g:3087:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3087:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3088:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3088:113: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3089:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3092:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:3092:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3092:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:3092:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3092:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:3093:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,56,FOLLOW_44); 

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
            	    // InternalMoba.g:3110:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3110:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3111:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3111:113: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3112:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3115:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:3115:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3115:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:3115:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:3115:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:3116:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,57,FOLLOW_44); 

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
            	    // InternalMoba.g:3133:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3133:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:3134:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3134:113: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:3135:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3138:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:3138:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3138:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:3138:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:3138:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:3139:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,58,FOLLOW_44); 

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
            	    // InternalMoba.g:3156:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3156:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:3157:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:3157:113: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:3158:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3);
            	    					
            	    // InternalMoba.g:3161:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:3161:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3161:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:3161:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:3161:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:3162:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,59,FOLLOW_44); 

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
            	    // InternalMoba.g:3179:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:3179:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:3180:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:3180:113: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:3181:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4);
            	    					
            	    // InternalMoba.g:3184:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:3184:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3184:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:3184:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,37,FOLLOW_17); 

            	    									newLeafNode(otherlv_6, grammarAccess.getMobaDtoAttributeAccess().getConstraintsKeyword_1_4_0());
            	    								
            	    otherlv_7=(Token)match(input,35,FOLLOW_18); 

            	    									newLeafNode(otherlv_7, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	    								
            	    // InternalMoba.g:3192:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:3193:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:3193:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:3194:11: lv_constraints_8_0= ruleMobaConstraint
            	    {

            	    											newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	    										
            	    pushFollow(FOLLOW_19);
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

            	    // InternalMoba.g:3211:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==38) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalMoba.g:3212:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,38,FOLLOW_18); 

            	    	    										newLeafNode(otherlv_9, grammarAccess.getMobaDtoAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	    									
            	    	    // InternalMoba.g:3216:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:3217:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:3217:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:3218:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {

            	    	    												newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	    											
            	    	    pushFollow(FOLLOW_19);
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
            	    	    break loop56;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,36,FOLLOW_44); 

            	    									newLeafNode(otherlv_11, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMoba.g:3246:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:3246:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    // InternalMoba.g:3247:5: {...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalMoba.g:3247:113: ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    // InternalMoba.g:3248:6: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5);
            	    					
            	    // InternalMoba.g:3251:9: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    // InternalMoba.g:3251:10: {...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:3251:19: (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    // InternalMoba.g:3251:20: otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')'
            	    {
            	    otherlv_12=(Token)match(input,62,FOLLOW_17); 

            	    									newLeafNode(otherlv_12, grammarAccess.getMobaDtoAttributeAccess().getAliasKeyword_1_5_0());
            	    								
            	    otherlv_13=(Token)match(input,35,FOLLOW_3); 

            	    									newLeafNode(otherlv_13, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_5_1());
            	    								
            	    // InternalMoba.g:3259:9: ( (lv_alias_14_0= RULE_ID ) )
            	    // InternalMoba.g:3260:10: (lv_alias_14_0= RULE_ID )
            	    {
            	    // InternalMoba.g:3260:10: (lv_alias_14_0= RULE_ID )
            	    // InternalMoba.g:3261:11: lv_alias_14_0= RULE_ID
            	    {
            	    lv_alias_14_0=(Token)match(input,RULE_ID,FOLLOW_16); 

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

            	    otherlv_15=(Token)match(input,36,FOLLOW_44); 

            	    									newLeafNode(otherlv_15, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_1_5_3());
            	    								

            	    }


            	    }

            	     
            	    						getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3294:3: ( (otherlv_16= RULE_ID ) )
            // InternalMoba.g:3295:4: (otherlv_16= RULE_ID )
            {
            // InternalMoba.g:3295:4: (otherlv_16= RULE_ID )
            // InternalMoba.g:3296:5: otherlv_16= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            					}
            				
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_42); 

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
            		
            // InternalMoba.g:3318:3: ( (lv_name_18_0= RULE_ID ) )
            // InternalMoba.g:3319:4: (lv_name_18_0= RULE_ID )
            {
            // InternalMoba.g:3319:4: (lv_name_18_0= RULE_ID )
            // InternalMoba.g:3320:5: lv_name_18_0= RULE_ID
            {
            lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:3336:3: (this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current] )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==43) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMoba.g:3337:4: this_MobaPropertiesAble_19= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:3353:1: entryRuleMobaDtoReference returns [EObject current=null] : iv_ruleMobaDtoReference= ruleMobaDtoReference EOF ;
    public final EObject entryRuleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoReference = null;


        try {
            // InternalMoba.g:3353:57: (iv_ruleMobaDtoReference= ruleMobaDtoReference EOF )
            // InternalMoba.g:3354:2: iv_ruleMobaDtoReference= ruleMobaDtoReference EOF
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
    // InternalMoba.g:3360:1: ruleMobaDtoReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:3366:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3367:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3367:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3368:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDtoReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:3372:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3373:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3373:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:3374:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3377:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:3378:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:3378:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop59:
            do {
                int alt59=4;
                int LA59_0 = input.LA(1);

                if ( LA59_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt59=1;
                }
                else if ( LA59_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt59=2;
                }
                else if ( LA59_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt59=3;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalMoba.g:3379:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3379:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:3380:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3380:113: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:3381:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3384:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:3384:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:3384:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:3384:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:3384:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:3385:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,61,FOLLOW_43); 

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
            	    // InternalMoba.g:3402:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3402:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3403:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3403:113: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3404:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3407:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:3407:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:3407:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:3407:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3407:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:3408:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,56,FOLLOW_43); 

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
            	    // InternalMoba.g:3425:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3425:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3426:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3426:113: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3427:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3430:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:3430:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:3430:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:3430:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:3430:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:3431:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,57,FOLLOW_43); 

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
            	    break loop59;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3455:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:3456:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:3456:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:3457:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_42); 

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
            		
            // InternalMoba.g:3479:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:3480:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:3480:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:3481:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:3497:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==43) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // InternalMoba.g:3498:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:3514:1: entryRuleMobaQueueFeature returns [EObject current=null] : iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF ;
    public final EObject entryRuleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueFeature = null;


        try {
            // InternalMoba.g:3514:57: (iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF )
            // InternalMoba.g:3515:2: iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF
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
    // InternalMoba.g:3521:1: ruleMobaQueueFeature returns [EObject current=null] : this_MobaQueueReference_0= ruleMobaQueueReference ;
    public final EObject ruleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaQueueReference_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3527:2: (this_MobaQueueReference_0= ruleMobaQueueReference )
            // InternalMoba.g:3528:2: this_MobaQueueReference_0= ruleMobaQueueReference
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
    // InternalMoba.g:3539:1: entryRuleMobaQueueReference returns [EObject current=null] : iv_ruleMobaQueueReference= ruleMobaQueueReference EOF ;
    public final EObject entryRuleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueReference = null;


        try {
            // InternalMoba.g:3539:59: (iv_ruleMobaQueueReference= ruleMobaQueueReference EOF )
            // InternalMoba.g:3540:2: iv_ruleMobaQueueReference= ruleMobaQueueReference EOF
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
    // InternalMoba.g:3546:1: ruleMobaQueueReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) ;
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
            // InternalMoba.g:3552:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? ) )
            // InternalMoba.g:3553:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            {
            // InternalMoba.g:3553:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )? )
            // InternalMoba.g:3554:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            {
            otherlv_0=(Token)match(input,60,FOLLOW_43); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0());
            		
            // InternalMoba.g:3558:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3559:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3559:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:3560:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
             
            				  getUnorderedGroupHelper().enter(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            				
            // InternalMoba.g:3563:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:3564:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:3564:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop61:
            do {
                int alt61=4;
                int LA61_0 = input.LA(1);

                if ( LA61_0 == 61 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt61=1;
                }
                else if ( LA61_0 == 56 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt61=2;
                }
                else if ( LA61_0 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt61=3;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalMoba.g:3565:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3565:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:3566:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3566:115: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:3567:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0);
            	    					
            	    // InternalMoba.g:3570:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:3570:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3570:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:3570:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:3570:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:3571:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,61,FOLLOW_43); 

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
            	    // InternalMoba.g:3588:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3588:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:3589:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3589:115: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:3590:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1);
            	    					
            	    // InternalMoba.g:3593:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:3593:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3593:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:3593:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:3593:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:3594:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,56,FOLLOW_43); 

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
            	    // InternalMoba.g:3611:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3611:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:3612:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:3612:115: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:3613:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {

            	    						getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2);
            	    					
            	    // InternalMoba.g:3616:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:3616:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:3616:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:3616:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:3616:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:3617:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,57,FOLLOW_43); 

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
            	    break loop61;
                }
            } while (true);


            }


            }

             
            				  getUnorderedGroupHelper().leave(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            				

            }

            // InternalMoba.g:3641:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:3642:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:3642:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:3643:5: otherlv_5= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            					}
            				
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_42); 

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
            		
            // InternalMoba.g:3665:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:3666:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:3666:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:3667:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_26); 

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

            // InternalMoba.g:3683:3: (this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current] )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==43) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMoba.g:3684:4: this_MobaPropertiesAble_8= ruleMobaPropertiesAble[$current]
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
    // InternalMoba.g:3700:1: entryRuleMobaMuliplicity returns [EObject current=null] : iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF ;
    public final EObject entryRuleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMuliplicity = null;


        try {
            // InternalMoba.g:3700:56: (iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF )
            // InternalMoba.g:3701:2: iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF
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
    // InternalMoba.g:3707:1: ruleMobaMuliplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lower_1_0 = null;

        Enumerator lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3713:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) )
            // InternalMoba.g:3714:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            {
            // InternalMoba.g:3714:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            // InternalMoba.g:3715:3: otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,43,FOLLOW_45); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMoba.g:3719:3: ( (lv_lower_1_0= ruleMobaLowerBound ) )
            // InternalMoba.g:3720:4: (lv_lower_1_0= ruleMobaLowerBound )
            {
            // InternalMoba.g:3720:4: (lv_lower_1_0= ruleMobaLowerBound )
            // InternalMoba.g:3721:5: lv_lower_1_0= ruleMobaLowerBound
            {

            					newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0());
            				
            pushFollow(FOLLOW_46);
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

            // InternalMoba.g:3738:3: (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==63) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalMoba.g:3739:4: otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    {
                    otherlv_2=(Token)match(input,63,FOLLOW_47); 

                    				newLeafNode(otherlv_2, grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0());
                    			
                    // InternalMoba.g:3743:4: ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    // InternalMoba.g:3744:5: (lv_upper_3_0= ruleMobaUpperBound )
                    {
                    // InternalMoba.g:3744:5: (lv_upper_3_0= ruleMobaUpperBound )
                    // InternalMoba.g:3745:6: lv_upper_3_0= ruleMobaUpperBound
                    {

                    						newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0());
                    					
                    pushFollow(FOLLOW_48);
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

            otherlv_4=(Token)match(input,44,FOLLOW_2); 

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
    // InternalMoba.g:3771:1: entryRuleMobaConstraint returns [EObject current=null] : iv_ruleMobaConstraint= ruleMobaConstraint EOF ;
    public final EObject entryRuleMobaConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstraint = null;


        try {
            // InternalMoba.g:3771:55: (iv_ruleMobaConstraint= ruleMobaConstraint EOF )
            // InternalMoba.g:3772:2: iv_ruleMobaConstraint= ruleMobaConstraint EOF
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
    // InternalMoba.g:3778:1: ruleMobaConstraint returns [EObject current=null] : (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) ;
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
            // InternalMoba.g:3784:2: ( (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) )
            // InternalMoba.g:3785:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            {
            // InternalMoba.g:3785:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            int alt64=8;
            switch ( input.LA(1) ) {
            case 64:
                {
                alt64=1;
                }
                break;
            case 65:
                {
                alt64=2;
                }
                break;
            case 66:
                {
                alt64=3;
                }
                break;
            case 67:
                {
                alt64=4;
                }
                break;
            case 68:
                {
                alt64=5;
                }
                break;
            case 69:
                {
                alt64=6;
                }
                break;
            case 70:
                {
                alt64=7;
                }
                break;
            case 71:
                {
                alt64=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }

            switch (alt64) {
                case 1 :
                    // InternalMoba.g:3786:3: this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint
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
                    // InternalMoba.g:3795:3: this_MobaMinConstraint_1= ruleMobaMinConstraint
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
                    // InternalMoba.g:3804:3: this_MobaMaxConstraint_2= ruleMobaMaxConstraint
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
                    // InternalMoba.g:3813:3: this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint
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
                    // InternalMoba.g:3822:3: this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint
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
                    // InternalMoba.g:3831:3: this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint
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
                    // InternalMoba.g:3840:3: this_MobaNullConstraint_6= ruleMobaNullConstraint
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
                    // InternalMoba.g:3849:3: this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint
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
    // InternalMoba.g:3861:1: entryRuleMobaRegexpConstraint returns [EObject current=null] : iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF ;
    public final EObject entryRuleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRegexpConstraint = null;


        try {
            // InternalMoba.g:3861:61: (iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF )
            // InternalMoba.g:3862:2: iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF
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
    // InternalMoba.g:3868:1: ruleMobaRegexpConstraint returns [EObject current=null] : (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3874:2: ( (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3875:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3875:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3876:3: otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,64,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaRegexpConstraintAccess().getRegexpKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_12); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaRegexpConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3884:3: ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==RULE_STRING) ) {
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
                    // InternalMoba.g:3885:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:3885:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    // InternalMoba.g:3886:5: (lv_filterString_2_0= RULE_STRING )
                    {
                    // InternalMoba.g:3886:5: (lv_filterString_2_0= RULE_STRING )
                    // InternalMoba.g:3887:6: lv_filterString_2_0= RULE_STRING
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
                    // InternalMoba.g:3904:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3904:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3905:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3905:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3906:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:3922:1: entryRuleMobaMinConstraint returns [EObject current=null] : iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF ;
    public final EObject entryRuleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinConstraint = null;


        try {
            // InternalMoba.g:3922:58: (iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF )
            // InternalMoba.g:3923:2: iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF
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
    // InternalMoba.g:3929:1: ruleMobaMinConstraint returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3935:2: ( (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3936:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3936:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3937:3: otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,65,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinConstraintAccess().getMinKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:3945:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
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
                    // InternalMoba.g:3946:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:3946:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:3947:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:3947:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:3948:6: lv_filterValue_2_0= RULE_DOUBLE
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
                    // InternalMoba.g:3965:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:3965:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3966:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3966:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3967:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:3983:1: entryRuleMobaMaxConstraint returns [EObject current=null] : iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF ;
    public final EObject entryRuleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxConstraint = null;


        try {
            // InternalMoba.g:3983:58: (iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF )
            // InternalMoba.g:3984:2: iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF
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
    // InternalMoba.g:3990:1: ruleMobaMaxConstraint returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:3996:2: ( (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:3997:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:3997:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:3998:3: otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,66,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxConstraintAccess().getMaxKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_49); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:4006:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_ID ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_DOUBLE) ) {
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
                    // InternalMoba.g:4007:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:4007:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:4008:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:4008:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:4009:6: lv_filterValue_2_0= RULE_DOUBLE
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
                    // InternalMoba.g:4026:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4026:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4027:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4027:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4028:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4044:1: entryRuleMobaMinLengthConstraint returns [EObject current=null] : iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF ;
    public final EObject entryRuleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinLengthConstraint = null;


        try {
            // InternalMoba.g:4044:64: (iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF )
            // InternalMoba.g:4045:2: iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF
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
    // InternalMoba.g:4051:1: ruleMobaMinLengthConstraint returns [EObject current=null] : (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:4057:2: ( (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:4058:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:4058:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:4059:3: otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,67,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMinLengthConstraintAccess().getMinLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMinLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:4067:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
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
                    // InternalMoba.g:4068:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4068:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:4069:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:4069:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:4070:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:4087:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4087:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4088:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4088:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4089:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4105:1: entryRuleMobaMaxLengthConstraint returns [EObject current=null] : iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF ;
    public final EObject entryRuleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxLengthConstraint = null;


        try {
            // InternalMoba.g:4105:64: (iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF )
            // InternalMoba.g:4106:2: iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF
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
    // InternalMoba.g:4112:1: ruleMobaMaxLengthConstraint returns [EObject current=null] : (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) ;
    public final EObject ruleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:4118:2: ( (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) ) )
            // InternalMoba.g:4119:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            {
            // InternalMoba.g:4119:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) )
            // InternalMoba.g:4120:3: otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
            {
            otherlv_0=(Token)match(input,68,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaMaxLengthConstraintAccess().getMaxLengthKeyword_0());
            		
            otherlv_1=(Token)match(input,20,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaMaxLengthConstraintAccess().getEqualsSignKeyword_1());
            		
            // InternalMoba.g:4128:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
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
                    // InternalMoba.g:4129:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4129:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:4130:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:4130:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:4131:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:4148:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4148:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4149:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4149:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4150:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4166:1: entryRuleMobaDigitsConstraint returns [EObject current=null] : iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF ;
    public final EObject entryRuleMobaDigitsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDigitsConstraint = null;


        try {
            // InternalMoba.g:4166:61: (iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF )
            // InternalMoba.g:4167:2: iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF
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
    // InternalMoba.g:4173:1: ruleMobaDigitsConstraint returns [EObject current=null] : (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:4179:2: ( (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' ) )
            // InternalMoba.g:4180:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:4180:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')' )
            // InternalMoba.g:4181:3: otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_17); 

            			newLeafNode(otherlv_0, grammarAccess.getMobaDigitsConstraintAccess().getDigitsKeyword_0());
            		
            otherlv_1=(Token)match(input,35,FOLLOW_50); 

            			newLeafNode(otherlv_1, grammarAccess.getMobaDigitsConstraintAccess().getLeftParenthesisKeyword_1());
            		
            // InternalMoba.g:4189:3: ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_ID ) ) )
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
                    // InternalMoba.g:4190:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4190:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    // InternalMoba.g:4191:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:4191:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    // InternalMoba.g:4192:6: lv_filterIntegerValue_2_0= RULE_INT
                    {
                    lv_filterIntegerValue_2_0=(Token)match(input,RULE_INT,FOLLOW_23); 

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
                    // InternalMoba.g:4209:4: ( (otherlv_3= RULE_ID ) )
                    {
                    // InternalMoba.g:4209:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4210:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4210:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4211:6: otherlv_3= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_23); 

                    						newLeafNode(otherlv_3, grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerConstMobaConstantCrossReference_2_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,38,FOLLOW_50); 

            			newLeafNode(otherlv_4, grammarAccess.getMobaDigitsConstraintAccess().getCommaKeyword_3());
            		
            // InternalMoba.g:4227:3: ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_ID ) ) )
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==RULE_INT) ) {
                alt71=1;
            }
            else if ( (LA71_0==RULE_ID) ) {
                alt71=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 71, 0, input);

                throw nvae;
            }
            switch (alt71) {
                case 1 :
                    // InternalMoba.g:4228:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    {
                    // InternalMoba.g:4228:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    // InternalMoba.g:4229:5: (lv_filterFractionValue_5_0= RULE_INT )
                    {
                    // InternalMoba.g:4229:5: (lv_filterFractionValue_5_0= RULE_INT )
                    // InternalMoba.g:4230:6: lv_filterFractionValue_5_0= RULE_INT
                    {
                    lv_filterFractionValue_5_0=(Token)match(input,RULE_INT,FOLLOW_16); 

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
                    // InternalMoba.g:4247:4: ( (otherlv_6= RULE_ID ) )
                    {
                    // InternalMoba.g:4247:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMoba.g:4248:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMoba.g:4248:5: (otherlv_6= RULE_ID )
                    // InternalMoba.g:4249:6: otherlv_6= RULE_ID
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                    						}
                    					
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_16); 

                    						newLeafNode(otherlv_6, grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionConstMobaConstantCrossReference_4_1_0());
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,36,FOLLOW_2); 

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
    // InternalMoba.g:4269:1: entryRuleMobaNullConstraint returns [EObject current=null] : iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF ;
    public final EObject entryRuleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNullConstraint = null;


        try {
            // InternalMoba.g:4269:59: (iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF )
            // InternalMoba.g:4270:2: iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF
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
    // InternalMoba.g:4276:1: ruleMobaNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNull' ) ;
    public final EObject ruleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4282:2: ( ( () otherlv_1= 'isNull' ) )
            // InternalMoba.g:4283:2: ( () otherlv_1= 'isNull' )
            {
            // InternalMoba.g:4283:2: ( () otherlv_1= 'isNull' )
            // InternalMoba.g:4284:3: () otherlv_1= 'isNull'
            {
            // InternalMoba.g:4284:3: ()
            // InternalMoba.g:4285:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNullConstraintAccess().getMobaNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,70,FOLLOW_2); 

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
    // InternalMoba.g:4299:1: entryRuleMobaNotNullConstraint returns [EObject current=null] : iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF ;
    public final EObject entryRuleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNotNullConstraint = null;


        try {
            // InternalMoba.g:4299:62: (iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF )
            // InternalMoba.g:4300:2: iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF
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
    // InternalMoba.g:4306:1: ruleMobaNotNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNotNull' ) ;
    public final EObject ruleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4312:2: ( ( () otherlv_1= 'isNotNull' ) )
            // InternalMoba.g:4313:2: ( () otherlv_1= 'isNotNull' )
            {
            // InternalMoba.g:4313:2: ( () otherlv_1= 'isNotNull' )
            // InternalMoba.g:4314:3: () otherlv_1= 'isNotNull'
            {
            // InternalMoba.g:4314:3: ()
            // InternalMoba.g:4315:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMobaNotNullConstraintAccess().getMobaNotNullConstraintAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,71,FOLLOW_2); 

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
    // InternalMoba.g:4329:1: ruleMobaLowerBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) ;
    public final Enumerator ruleMobaLowerBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMoba.g:4335:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) )
            // InternalMoba.g:4336:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            {
            // InternalMoba.g:4336:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            int alt72=5;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt72=1;
                }
                break;
            case 73:
                {
                alt72=2;
                }
                break;
            case 74:
                {
                alt72=3;
                }
                break;
            case 42:
                {
                alt72=4;
                }
                break;
            case 75:
                {
                alt72=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalMoba.g:4337:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:4337:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:4338:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4345:3: (enumLiteral_1= '0' )
                    {
                    // InternalMoba.g:4345:3: (enumLiteral_1= '0' )
                    // InternalMoba.g:4346:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,73,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:4353:3: (enumLiteral_2= '?' )
                    {
                    // InternalMoba.g:4353:3: (enumLiteral_2= '?' )
                    // InternalMoba.g:4354:4: enumLiteral_2= '?'
                    {
                    enumLiteral_2=(Token)match(input,74,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:4361:3: (enumLiteral_3= '+' )
                    {
                    // InternalMoba.g:4361:3: (enumLiteral_3= '+' )
                    // InternalMoba.g:4362:4: enumLiteral_3= '+'
                    {
                    enumLiteral_3=(Token)match(input,42,FOLLOW_2); 

                    				current = grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:4369:3: (enumLiteral_4= '1' )
                    {
                    // InternalMoba.g:4369:3: (enumLiteral_4= '1' )
                    // InternalMoba.g:4370:4: enumLiteral_4= '1'
                    {
                    enumLiteral_4=(Token)match(input,75,FOLLOW_2); 

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
    // InternalMoba.g:4380:1: ruleMobaUpperBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) ;
    public final Enumerator ruleMobaUpperBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:4386:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) )
            // InternalMoba.g:4387:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            {
            // InternalMoba.g:4387:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==72) ) {
                alt73=1;
            }
            else if ( (LA73_0==75) ) {
                alt73=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // InternalMoba.g:4388:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:4388:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:4389:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,72,FOLLOW_2); 

                    				current = grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:4396:3: (enumLiteral_1= '1' )
                    {
                    // InternalMoba.g:4396:3: (enumLiteral_1= '1' )
                    // InternalMoba.g:4397:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,75,FOLLOW_2); 

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
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x007A220013C00000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x000000000C400000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000008A7E0000002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x000008A7C0000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x000008AFC0000002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000FFL});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000005000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000400000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000710L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000104000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000080020200000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000080000200000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0080000000400000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001801000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000480020200000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x1084000000400000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1080000000400000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x1000000000400000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0F00002000000010L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000080000000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x2300000000000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x4F00002000000010L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000F00L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x8000100000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000900L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000410L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000210L});

}
