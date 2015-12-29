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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalMobaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION", "RULE_ID_VERSION", "RULE_STRING", "RULE_CONSTANT", "RULE_DOWNLOAD_TEMPLATE", "RULE_FQN", "RULE_INT", "RULE_DOUBLE", "SUPER_INT", "SUPER_ID", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'version'", "'='", "'{'", "'uiApp'", "'backgroundApp'", "'}'", "'application'", "'server'", "'url'", "'extends'", "'autorizations'", "'('", "','", "')'", "'services'", "'use template'", "'active'", "'generator'", "'extensionPoint'", "':'", "'mixin'", "'authorization'", "'serialization'", "'datatype'", "'isArray'", "'constraints'", "'isDate'", "'isTime'", "'isTimestamp'", "'isString'", "'isPrimitive'", "'isBool'", "'isNumeric'", "'isDecimal'", "'enum'", "'lit'", "'isDefault'", "'isUndefined'", "'const'", "'->'", "'+'", "'friends'", "'['", "']'", "'settings'", "'cache'", "'type'", "'strategy'", "'entity'", "'index'", "'dto'", "'queue'", "'rest'", "'bigData'", "'headers'", "'parameters'", "'requestDto'", "'responseDto'", "'errorDto'", "'method'", "'as'", "'param'", "'restCrud'", "'restWorkflow'", "'service'", "'var'", "'lazy'", "'transient'", "'domainKey'", "'domainDescription'", "'ref'", "'cascading'", "'alias'", "'..'", "'regexp'", "'min'", "'max'", "'minLength'", "'maxLength'", "'digits'", "'isNull'", "'isNotNull'", "'slot'", "'trigger app install'", "'trigger app update'", "'trigger email'", "'trigger device start'", "'trigger sms'", "'trigger push'", "'trigger geofence'", "'event'", "'module bluetooth'", "'module push'", "'module NFC'", "'toFirstLower'", "'toFirstUpper'", "'toLowerCase'", "'toUpperCase'", "'enter'", "'leave'", "'low energy'", "'spp'", "'beacon'", "'id'", "'custom'", "'text'", "'*'", "'0'", "'?'", "'1'", "'GET'", "'POST'", "' PUT'", "'DELETE'"
    };
    public static final int T__50=50;
    public static final int RULE_VERSION=5;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_FQN=10;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=11;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=16;
    public static final int T__67=67;
    public static final int T__129=129;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__126=126;
    public static final int T__63=63;
    public static final int T__125=125;
    public static final int T__64=64;
    public static final int T__128=128;
    public static final int T__65=65;
    public static final int T__127=127;
    public static final int RULE_CONSTANT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DOWNLOAD_TEMPLATE=9;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int SUPER_ID=14;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int RULE_ID_VERSION=6;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int SUPER_INT=13;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_DOUBLE=12;
    public static final int T__77=77;
    public static final int T__119=119;
    public static final int T__78=78;
    public static final int T__118=118;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int T__115=115;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__114=114;
    public static final int T__75=75;
    public static final int T__117=117;
    public static final int T__76=76;
    public static final int T__116=116;
    public static final int T__80=80;
    public static final int T__111=111;
    public static final int T__81=81;
    public static final int T__110=110;
    public static final int T__82=82;
    public static final int T__113=113;
    public static final int T__83=83;
    public static final int T__112=112;
    public static final int RULE_WS=18;
    public static final int RULE_ANY_OTHER=19;
    public static final int T__88=88;
    public static final int T__108=108;
    public static final int T__89=89;
    public static final int T__107=107;
    public static final int T__109=109;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

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
        	return "MobaModel";
       	}

       	@Override
       	protected MobaGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleMobaModel"
    // InternalMoba.g:65:1: entryRuleMobaModel returns [EObject current=null] : iv_ruleMobaModel= ruleMobaModel EOF ;
    public final EObject entryRuleMobaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaModel = null;


        try {
            // InternalMoba.g:65:50: (iv_ruleMobaModel= ruleMobaModel EOF )
            // InternalMoba.g:66:2: iv_ruleMobaModel= ruleMobaModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaModel=ruleMobaModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaModel"


    // $ANTLR start "ruleMobaModel"
    // InternalMoba.g:72:1: ruleMobaModel returns [EObject current=null] : ( (lv_features_0_0= ruleMobaModelFeature ) )* ;
    public final EObject ruleMobaModel() throws RecognitionException {
        EObject current = null;

        EObject lv_features_0_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:78:2: ( ( (lv_features_0_0= ruleMobaModelFeature ) )* )
            // InternalMoba.g:79:2: ( (lv_features_0_0= ruleMobaModelFeature ) )*
            {
            // InternalMoba.g:79:2: ( (lv_features_0_0= ruleMobaModelFeature ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==20||LA1_0==27) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMoba.g:80:3: (lv_features_0_0= ruleMobaModelFeature )
            	    {
            	    // InternalMoba.g:80:3: (lv_features_0_0= ruleMobaModelFeature )
            	    // InternalMoba.g:81:4: lv_features_0_0= ruleMobaModelFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getMobaModelAccess().getFeaturesMobaModelFeatureParserRuleCall_0());
            	      			
            	    }
            	    pushFollow(FOLLOW_3);
            	    lv_features_0_0=ruleMobaModelFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				if (current==null) {
            	      					current = createModelElementForParent(grammarAccess.getMobaModelRule());
            	      				}
            	      				add(
            	      					current,
            	      					"features",
            	      					lv_features_0_0,
            	      					"org.mobadsl.grammar.Moba.MobaModelFeature");
            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaModel"


    // $ANTLR start "entryRuleMobaModelFeature"
    // InternalMoba.g:101:1: entryRuleMobaModelFeature returns [EObject current=null] : iv_ruleMobaModelFeature= ruleMobaModelFeature EOF ;
    public final EObject entryRuleMobaModelFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaModelFeature = null;


        try {
            // InternalMoba.g:101:57: (iv_ruleMobaModelFeature= ruleMobaModelFeature EOF )
            // InternalMoba.g:102:2: iv_ruleMobaModelFeature= ruleMobaModelFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaModelFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaModelFeature=ruleMobaModelFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaModelFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaModelFeature"


    // $ANTLR start "ruleMobaModelFeature"
    // InternalMoba.g:108:1: ruleMobaModelFeature returns [EObject current=null] : (this_MobaProject_0= ruleMobaProject | this_MobaApplication_1= ruleMobaApplication ) ;
    public final EObject ruleMobaModelFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaProject_0 = null;

        EObject this_MobaApplication_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:114:2: ( (this_MobaProject_0= ruleMobaProject | this_MobaApplication_1= ruleMobaApplication ) )
            // InternalMoba.g:115:2: (this_MobaProject_0= ruleMobaProject | this_MobaApplication_1= ruleMobaApplication )
            {
            // InternalMoba.g:115:2: (this_MobaProject_0= ruleMobaProject | this_MobaApplication_1= ruleMobaApplication )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==20) ) {
                alt2=1;
            }
            else if ( (LA2_0==27) ) {
                alt2=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMoba.g:116:3: this_MobaProject_0= ruleMobaProject
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaModelFeatureAccess().getMobaProjectParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaProject_0=ruleMobaProject();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaProject_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:125:3: this_MobaApplication_1= ruleMobaApplication
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaModelFeatureAccess().getMobaApplicationParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaApplication_1=ruleMobaApplication();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaApplication_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaModelFeature"


    // $ANTLR start "entryRuleMobaProject"
    // InternalMoba.g:137:1: entryRuleMobaProject returns [EObject current=null] : iv_ruleMobaProject= ruleMobaProject EOF ;
    public final EObject entryRuleMobaProject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProject = null;


        try {
            // InternalMoba.g:137:52: (iv_ruleMobaProject= ruleMobaProject EOF )
            // InternalMoba.g:138:2: iv_ruleMobaProject= ruleMobaProject EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaProjectRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaProject=ruleMobaProject();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaProject; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaProject"


    // $ANTLR start "ruleMobaProject"
    // InternalMoba.g:144:1: ruleMobaProject returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
    public final EObject ruleMobaProject() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        EObject this_MobaFriendsAble_5 = null;



        	enterRule();

        try {
            // InternalMoba.g:150:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalMoba.g:151:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalMoba.g:151:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalMoba.g:152:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* ) ) ) otherlv_14= '}'
            {
            otherlv_0=(Token)match(input,20,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaProjectAccess().getProjectKeyword_0());
              		
            }
            // InternalMoba.g:156:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:157:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:157:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:158:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaProjectAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaProjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaProjectAccess().getVersionKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaProjectAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:182:3: ( (lv_version_4_0= RULE_VERSION ) )
            // InternalMoba.g:183:4: (lv_version_4_0= RULE_VERSION )
            {
            // InternalMoba.g:183:4: (lv_version_4_0= RULE_VERSION )
            // InternalMoba.g:184:5: lv_version_4_0= RULE_VERSION
            {
            lv_version_4_0=(Token)match(input,RULE_VERSION,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_version_4_0, grammarAccess.getMobaProjectAccess().getVersionVERSIONTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaProjectRule());
              					}
              					setWithLastConsumed(
              						current,
              						"version",
              						lv_version_4_0,
              						"org.mobadsl.grammar.Moba.VERSION");
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaProjectRule());
              			}
              			newCompositeNode(grammarAccess.getMobaProjectAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_5;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_6=(Token)match(input,23,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMobaProjectAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalMoba.g:215:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:216:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:216:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* ) )
            // InternalMoba.g:217:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7());
            // InternalMoba.g:220:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )* )
            // InternalMoba.g:221:6: ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )*
            {
            // InternalMoba.g:221:6: ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) ) )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( LA3_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 25 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMoba.g:222:4: ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:222:4: ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) ) )
            	    // InternalMoba.g:223:5: {...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalMoba.g:223:108: ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) ) )
            	    // InternalMoba.g:224:6: ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0);
            	    // InternalMoba.g:227:9: ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) ) )
            	    // InternalMoba.g:227:10: {...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaProject", "true");
            	    }
            	    // InternalMoba.g:227:19: (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) ) )
            	    // InternalMoba.g:227:20: otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID_VERSION ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getMobaProjectAccess().getUiAppKeyword_7_0_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getMobaProjectAccess().getEqualsSignKeyword_7_0_1());
            	      								
            	    }
            	    // InternalMoba.g:235:9: ( (otherlv_10= RULE_ID_VERSION ) )
            	    // InternalMoba.g:236:10: (otherlv_10= RULE_ID_VERSION )
            	    {
            	    // InternalMoba.g:236:10: (otherlv_10= RULE_ID_VERSION )
            	    // InternalMoba.g:237:11: otherlv_10= RULE_ID_VERSION
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaProjectRule());
            	      											}
            	      										
            	    }
            	    otherlv_10=(Token)match(input,RULE_ID_VERSION,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_10, grammarAccess.getMobaProjectAccess().getUiApplicationMobaApplicationCrossReference_7_0_2_0());
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:254:4: ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:254:4: ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) ) )
            	    // InternalMoba.g:255:5: {...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalMoba.g:255:108: ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) ) )
            	    // InternalMoba.g:256:6: ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1);
            	    // InternalMoba.g:259:9: ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) ) )
            	    // InternalMoba.g:259:10: {...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaProject", "true");
            	    }
            	    // InternalMoba.g:259:19: (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) ) )
            	    // InternalMoba.g:259:20: otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID_VERSION ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaProjectAccess().getBackgroundAppKeyword_7_1_0());
            	      								
            	    }
            	    otherlv_12=(Token)match(input,22,FOLLOW_11); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getMobaProjectAccess().getEqualsSignKeyword_7_1_1());
            	      								
            	    }
            	    // InternalMoba.g:267:9: ( (otherlv_13= RULE_ID_VERSION ) )
            	    // InternalMoba.g:268:10: (otherlv_13= RULE_ID_VERSION )
            	    {
            	    // InternalMoba.g:268:10: (otherlv_13= RULE_ID_VERSION )
            	    // InternalMoba.g:269:11: otherlv_13= RULE_ID_VERSION
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaProjectRule());
            	      											}
            	      										
            	    }
            	    otherlv_13=(Token)match(input,RULE_ID_VERSION,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_13, grammarAccess.getMobaProjectAccess().getBackgroundApplicationMobaApplicationCrossReference_7_1_2_0());
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7());

            }

            otherlv_14=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getMobaProjectAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaProject"


    // $ANTLR start "entryRuleMobaApplication"
    // InternalMoba.g:301:1: entryRuleMobaApplication returns [EObject current=null] : iv_ruleMobaApplication= ruleMobaApplication EOF ;
    public final EObject entryRuleMobaApplication() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaApplication = null;


        try {
            // InternalMoba.g:301:56: (iv_ruleMobaApplication= ruleMobaApplication EOF )
            // InternalMoba.g:302:2: iv_ruleMobaApplication= ruleMobaApplication EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaApplicationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaApplication=ruleMobaApplication();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaApplication; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:308:1: ruleMobaApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( (lv_features_7_0= ruleMobaApplicationFeature ) )* otherlv_8= '}' ) ;
    public final EObject ruleMobaApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_MobaFriendsAble_5 = null;

        EObject lv_features_7_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:314:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( (lv_features_7_0= ruleMobaApplicationFeature ) )* otherlv_8= '}' ) )
            // InternalMoba.g:315:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( (lv_features_7_0= ruleMobaApplicationFeature ) )* otherlv_8= '}' )
            {
            // InternalMoba.g:315:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( (lv_features_7_0= ruleMobaApplicationFeature ) )* otherlv_8= '}' )
            // InternalMoba.g:316:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( (lv_features_7_0= ruleMobaApplicationFeature ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaApplicationAccess().getApplicationKeyword_0());
              		
            }
            // InternalMoba.g:320:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:321:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:321:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:322:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_5); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaApplicationAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,21,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaApplicationAccess().getVersionKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaApplicationAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:346:3: ( (lv_version_4_0= RULE_VERSION ) )
            // InternalMoba.g:347:4: (lv_version_4_0= RULE_VERSION )
            {
            // InternalMoba.g:347:4: (lv_version_4_0= RULE_VERSION )
            // InternalMoba.g:348:5: lv_version_4_0= RULE_VERSION
            {
            lv_version_4_0=(Token)match(input,RULE_VERSION,FOLLOW_8); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_version_4_0, grammarAccess.getMobaApplicationAccess().getVersionVERSIONTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaApplicationRule());
              			}
              			newCompositeNode(grammarAccess.getMobaApplicationAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_5;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_6=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMobaApplicationAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalMoba.g:379:3: ( (lv_features_7_0= ruleMobaApplicationFeature ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==28||(LA4_0>=36 && LA4_0<=38)||(LA4_0>=42 && LA4_0<=44)||LA4_0==59||LA4_0==65||LA4_0==69||(LA4_0>=71 && LA4_0<=73)||(LA4_0>=83 && LA4_0<=84)||(LA4_0>=103 && LA4_0<=110)||(LA4_0>=112 && LA4_0<=114)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMoba.g:380:4: (lv_features_7_0= ruleMobaApplicationFeature )
            	    {
            	    // InternalMoba.g:380:4: (lv_features_7_0= ruleMobaApplicationFeature )
            	    // InternalMoba.g:381:5: lv_features_7_0= ruleMobaApplicationFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaApplicationAccess().getFeaturesMobaApplicationFeatureParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_features_7_0=ruleMobaApplicationFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMobaApplicationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"features",
            	      						lv_features_7_0,
            	      						"org.mobadsl.grammar.Moba.MobaApplicationFeature");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getMobaApplicationAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaApplication"


    // $ANTLR start "entryRuleMobaApplicationFeature"
    // InternalMoba.g:406:1: entryRuleMobaApplicationFeature returns [EObject current=null] : iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF ;
    public final EObject entryRuleMobaApplicationFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaApplicationFeature = null;


        try {
            // InternalMoba.g:406:63: (iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF )
            // InternalMoba.g:407:2: iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaApplicationFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaApplicationFeature=ruleMobaApplicationFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaApplicationFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:413:1: ruleMobaApplicationFeature returns [EObject current=null] : (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer ) ;
    public final EObject ruleMobaApplicationFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDataType_0 = null;

        EObject this_MobaTemplate_1 = null;

        EObject this_MobaConstant_2 = null;

        EObject this_MobaSettings_3 = null;

        EObject this_MobaData_4 = null;

        EObject this_MobaREST_5 = null;

        EObject this_MobaGenerator_6 = null;

        EObject this_MobaAuthorization_7 = null;

        EObject this_MobaTransportSerializationType_8 = null;

        EObject this_MobaExternalModule_9 = null;

        EObject this_MobaTrigger_10 = null;

        EObject this_MobaGeneratorSlot_11 = null;

        EObject this_MobaServer_12 = null;



        	enterRule();

        try {
            // InternalMoba.g:419:2: ( (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer ) )
            // InternalMoba.g:420:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer )
            {
            // InternalMoba.g:420:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer )
            int alt5=13;
            alt5 = dfa5.predict(input);
            switch (alt5) {
                case 1 :
                    // InternalMoba.g:421:3: this_MobaDataType_0= ruleMobaDataType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaDataTypeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaDataType_0=ruleMobaDataType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaDataType_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:430:3: this_MobaTemplate_1= ruleMobaTemplate
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaTemplateParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaTemplate_1=ruleMobaTemplate();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaTemplate_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMoba.g:439:3: this_MobaConstant_2= ruleMobaConstant
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaConstantParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaConstant_2=ruleMobaConstant();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaConstant_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMoba.g:448:3: this_MobaSettings_3= ruleMobaSettings
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaSettingsParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaSettings_3=ruleMobaSettings();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaSettings_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMoba.g:457:3: this_MobaData_4= ruleMobaData
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaDataParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaData_4=ruleMobaData();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaData_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMoba.g:466:3: this_MobaREST_5= ruleMobaREST
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaRESTParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaREST_5=ruleMobaREST();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaREST_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMoba.g:475:3: this_MobaGenerator_6= ruleMobaGenerator
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaGeneratorParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaGenerator_6=ruleMobaGenerator();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaGenerator_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMoba.g:484:3: this_MobaAuthorization_7= ruleMobaAuthorization
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaAuthorizationParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaAuthorization_7=ruleMobaAuthorization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaAuthorization_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalMoba.g:493:3: this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaTransportSerializationTypeParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaTransportSerializationType_8=ruleMobaTransportSerializationType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaTransportSerializationType_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalMoba.g:502:3: this_MobaExternalModule_9= ruleMobaExternalModule
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaExternalModuleParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaExternalModule_9=ruleMobaExternalModule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaExternalModule_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalMoba.g:511:3: this_MobaTrigger_10= ruleMobaTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaTriggerParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaTrigger_10=ruleMobaTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaTrigger_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalMoba.g:520:3: this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaGeneratorSlotParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaGeneratorSlot_11=ruleMobaGeneratorSlot();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaGeneratorSlot_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalMoba.g:529:3: this_MobaServer_12= ruleMobaServer
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaServerParserRuleCall_12());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaServer_12=ruleMobaServer();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaServer_12;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaApplicationFeature"


    // $ANTLR start "entryRuleMobaServer"
    // InternalMoba.g:541:1: entryRuleMobaServer returns [EObject current=null] : iv_ruleMobaServer= ruleMobaServer EOF ;
    public final EObject entryRuleMobaServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaServer = null;


        try {
            // InternalMoba.g:541:51: (iv_ruleMobaServer= ruleMobaServer EOF )
            // InternalMoba.g:542:2: iv_ruleMobaServer= ruleMobaServer EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaServerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaServer=ruleMobaServer();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaServer; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaServer"


    // $ANTLR start "ruleMobaServer"
    // InternalMoba.g:548:1: ruleMobaServer returns [EObject current=null] : (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}' ) ;
    public final EObject ruleMobaServer() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_urlString_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        EObject this_MobaFriendsAble_8 = null;



        	enterRule();

        try {
            // InternalMoba.g:554:2: ( (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}' ) )
            // InternalMoba.g:555:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}' )
            {
            // InternalMoba.g:555:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}' )
            // InternalMoba.g:556:3: otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaServerAccess().getServerKeyword_0());
              		
            }
            // InternalMoba.g:560:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:561:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:561:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:562:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_13); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaServerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaServerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,29,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaServerAccess().getUrlKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaServerAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:586:3: ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_STRING) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_CONSTANT) ) {
                alt6=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMoba.g:587:4: ( (lv_urlString_4_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:587:4: ( (lv_urlString_4_0= RULE_STRING ) )
                    // InternalMoba.g:588:5: (lv_urlString_4_0= RULE_STRING )
                    {
                    // InternalMoba.g:588:5: (lv_urlString_4_0= RULE_STRING )
                    // InternalMoba.g:589:6: lv_urlString_4_0= RULE_STRING
                    {
                    lv_urlString_4_0=(Token)match(input,RULE_STRING,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_urlString_4_0, grammarAccess.getMobaServerAccess().getUrlStringSTRINGTerminalRuleCall_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaServerRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"urlString",
                      							lv_urlString_4_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:606:4: ( (otherlv_5= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:606:4: ( (otherlv_5= RULE_CONSTANT ) )
                    // InternalMoba.g:607:5: (otherlv_5= RULE_CONSTANT )
                    {
                    // InternalMoba.g:607:5: (otherlv_5= RULE_CONSTANT )
                    // InternalMoba.g:608:6: otherlv_5= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaServerRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_CONSTANT,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getMobaServerAccess().getUrlConstMobaConstantCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:620:3: (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==30) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMoba.g:621:4: otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMobaServerAccess().getExtendsKeyword_5_0());
                      			
                    }
                    // InternalMoba.g:625:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMoba.g:626:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMoba.g:626:5: (otherlv_7= RULE_ID )
                    // InternalMoba.g:627:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaServerRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getMobaServerAccess().getSuperTypeMobaServerCrossReference_5_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaServerRule());
              			}
              			newCompositeNode(grammarAccess.getMobaServerAccess().getMobaFriendsAbleParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_8;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_9=(Token)match(input,23,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMobaServerAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            // InternalMoba.g:654:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:655:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:655:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) )
            // InternalMoba.g:656:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());
            // InternalMoba.g:659:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* )
            // InternalMoba.g:660:6: ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )*
            {
            // InternalMoba.g:660:6: ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMoba.g:661:4: ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:661:4: ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) )
            	    // InternalMoba.g:662:5: {...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalMoba.g:662:107: ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) )
            	    // InternalMoba.g:663:6: ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0);
            	    // InternalMoba.g:666:9: ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) )
            	    // InternalMoba.g:666:10: {...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "true");
            	    }
            	    // InternalMoba.g:666:19: (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' )
            	    // InternalMoba.g:666:20: otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')'
            	    {
            	    otherlv_11=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaServerAccess().getAutorizationsKeyword_8_0_0());
            	      								
            	    }
            	    otherlv_12=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getMobaServerAccess().getEqualsSignKeyword_8_0_1());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,32,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getMobaServerAccess().getLeftParenthesisKeyword_8_0_2());
            	      								
            	    }
            	    // InternalMoba.g:678:9: ( (otherlv_14= RULE_CONSTANT ) )
            	    // InternalMoba.g:679:10: (otherlv_14= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:679:10: (otherlv_14= RULE_CONSTANT )
            	    // InternalMoba.g:680:11: otherlv_14= RULE_CONSTANT
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaServerRule());
            	      											}
            	      										
            	    }
            	    otherlv_14=(Token)match(input,RULE_CONSTANT,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_14, grammarAccess.getMobaServerAccess().getAuthorizationMobaAuthorizationCrossReference_8_0_3_0());
            	      										
            	    }

            	    }


            	    }

            	    // InternalMoba.g:691:9: (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )*
            	    loop8:
            	    do {
            	        int alt8=2;
            	        int LA8_0 = input.LA(1);

            	        if ( (LA8_0==33) ) {
            	            alt8=1;
            	        }


            	        switch (alt8) {
            	    	case 1 :
            	    	    // InternalMoba.g:692:10: otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,33,FOLLOW_18); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_15, grammarAccess.getMobaServerAccess().getCommaKeyword_8_0_4_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:696:10: ( (otherlv_16= RULE_CONSTANT ) )
            	    	    // InternalMoba.g:697:11: (otherlv_16= RULE_CONSTANT )
            	    	    {
            	    	    // InternalMoba.g:697:11: (otherlv_16= RULE_CONSTANT )
            	    	    // InternalMoba.g:698:12: otherlv_16= RULE_CONSTANT
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElement(grammarAccess.getMobaServerRule());
            	    	      												}
            	    	      											
            	    	    }
            	    	    otherlv_16=(Token)match(input,RULE_CONSTANT,FOLLOW_19); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												newLeafNode(otherlv_16, grammarAccess.getMobaServerAccess().getAuthorizationMobaAuthorizationCrossReference_8_0_4_1_0());
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop8;
            	        }
            	    } while (true);

            	    otherlv_17=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_17, grammarAccess.getMobaServerAccess().getRightParenthesisKeyword_8_0_5());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:720:4: ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:720:4: ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) )
            	    // InternalMoba.g:721:5: {...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalMoba.g:721:107: ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) )
            	    // InternalMoba.g:722:6: ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1);
            	    // InternalMoba.g:725:9: ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) )
            	    // InternalMoba.g:725:10: {...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "true");
            	    }
            	    // InternalMoba.g:725:19: (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' )
            	    // InternalMoba.g:725:20: otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')'
            	    {
            	    otherlv_18=(Token)match(input,35,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_18, grammarAccess.getMobaServerAccess().getServicesKeyword_8_1_0());
            	      								
            	    }
            	    otherlv_19=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_19, grammarAccess.getMobaServerAccess().getEqualsSignKeyword_8_1_1());
            	      								
            	    }
            	    otherlv_20=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_20, grammarAccess.getMobaServerAccess().getLeftParenthesisKeyword_8_1_2());
            	      								
            	    }
            	    // InternalMoba.g:737:9: ( (otherlv_21= RULE_ID ) )
            	    // InternalMoba.g:738:10: (otherlv_21= RULE_ID )
            	    {
            	    // InternalMoba.g:738:10: (otherlv_21= RULE_ID )
            	    // InternalMoba.g:739:11: otherlv_21= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaServerRule());
            	      											}
            	      										
            	    }
            	    otherlv_21=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_21, grammarAccess.getMobaServerAccess().getServicesMobaRESTCrossReference_8_1_3_0());
            	      										
            	    }

            	    }


            	    }

            	    // InternalMoba.g:750:9: (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==33) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalMoba.g:751:10: otherlv_22= ',' ( (otherlv_23= RULE_ID ) )
            	    	    {
            	    	    otherlv_22=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_22, grammarAccess.getMobaServerAccess().getCommaKeyword_8_1_4_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:755:10: ( (otherlv_23= RULE_ID ) )
            	    	    // InternalMoba.g:756:11: (otherlv_23= RULE_ID )
            	    	    {
            	    	    // InternalMoba.g:756:11: (otherlv_23= RULE_ID )
            	    	    // InternalMoba.g:757:12: otherlv_23= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElement(grammarAccess.getMobaServerRule());
            	    	      												}
            	    	      											
            	    	    }
            	    	    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												newLeafNode(otherlv_23, grammarAccess.getMobaServerAccess().getServicesMobaRESTCrossReference_8_1_4_1_0());
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_24=(Token)match(input,34,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_24, grammarAccess.getMobaServerAccess().getRightParenthesisKeyword_8_1_5());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());

            }

            otherlv_25=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_25, grammarAccess.getMobaServerAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaServer"


    // $ANTLR start "entryRuleMobaTemplate"
    // InternalMoba.g:794:1: entryRuleMobaTemplate returns [EObject current=null] : iv_ruleMobaTemplate= ruleMobaTemplate EOF ;
    public final EObject entryRuleMobaTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTemplate = null;


        try {
            // InternalMoba.g:794:53: (iv_ruleMobaTemplate= ruleMobaTemplate EOF )
            // InternalMoba.g:795:2: iv_ruleMobaTemplate= ruleMobaTemplate EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaTemplateRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaTemplate=ruleMobaTemplate();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaTemplate; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:801:1: ruleMobaTemplate returns [EObject current=null] : (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID_VERSION ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) ;
    public final EObject ruleMobaTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_downloadTemplate_2_0=null;


        	enterRule();

        try {
            // InternalMoba.g:807:2: ( (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID_VERSION ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) )
            // InternalMoba.g:808:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID_VERSION ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            {
            // InternalMoba.g:808:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID_VERSION ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            // InternalMoba.g:809:3: otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID_VERSION ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaTemplateAccess().getUseTemplateKeyword_0());
              		
            }
            // InternalMoba.g:813:3: ( ( (otherlv_1= RULE_ID_VERSION ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID_VERSION) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_DOWNLOAD_TEMPLATE) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalMoba.g:814:4: ( (otherlv_1= RULE_ID_VERSION ) )
                    {
                    // InternalMoba.g:814:4: ( (otherlv_1= RULE_ID_VERSION ) )
                    // InternalMoba.g:815:5: (otherlv_1= RULE_ID_VERSION )
                    {
                    // InternalMoba.g:815:5: (otherlv_1= RULE_ID_VERSION )
                    // InternalMoba.g:816:6: otherlv_1= RULE_ID_VERSION
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaTemplateRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID_VERSION,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationCrossReference_1_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:828:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    {
                    // InternalMoba.g:828:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    // InternalMoba.g:829:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    {
                    // InternalMoba.g:829:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    // InternalMoba.g:830:6: lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE
                    {
                    lv_downloadTemplate_2_0=(Token)match(input,RULE_DOWNLOAD_TEMPLATE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_downloadTemplate_2_0, grammarAccess.getMobaTemplateAccess().getDownloadTemplateDOWNLOAD_TEMPLATETerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaTemplate"


    // $ANTLR start "entryRuleMobaGenerator"
    // InternalMoba.g:851:1: entryRuleMobaGenerator returns [EObject current=null] : iv_ruleMobaGenerator= ruleMobaGenerator EOF ;
    public final EObject entryRuleMobaGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGenerator = null;


        try {
            // InternalMoba.g:851:54: (iv_ruleMobaGenerator= ruleMobaGenerator EOF )
            // InternalMoba.g:852:2: iv_ruleMobaGenerator= ruleMobaGenerator EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaGeneratorRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaGenerator=ruleMobaGenerator();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaGenerator; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:858:1: ruleMobaGenerator returns [EObject current=null] : ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) ;
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
            // InternalMoba.g:864:2: ( ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) )
            // InternalMoba.g:865:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            {
            // InternalMoba.g:865:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            // InternalMoba.g:866:3: ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}'
            {
            // InternalMoba.g:866:3: ( (lv_active_0_0= 'active' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoba.g:867:4: (lv_active_0_0= 'active' )
                    {
                    // InternalMoba.g:867:4: (lv_active_0_0= 'active' )
                    // InternalMoba.g:868:5: lv_active_0_0= 'active'
                    {
                    lv_active_0_0=(Token)match(input,37,FOLLOW_21); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_active_0_0, grammarAccess.getMobaGeneratorAccess().getActiveActiveKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMobaGeneratorRule());
                      					}
                      					setWithLastConsumed(current, "active", true, "active");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,38,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaGeneratorAccess().getGeneratorKeyword_1());
              		
            }
            // InternalMoba.g:884:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:885:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:885:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:886:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getMobaGeneratorAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,23,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaGeneratorAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMoba.g:906:3: ( (lv_features_4_0= ruleMobaGeneratorFeature ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMoba.g:907:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    {
            	    // InternalMoba.g:907:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    // InternalMoba.g:908:5: lv_features_4_0= ruleMobaGeneratorFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaGeneratorAccess().getFeaturesMobaGeneratorFeatureParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_22);
            	    lv_features_4_0=ruleMobaGeneratorFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_5=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaGeneratorAccess().getRightCurlyBracketKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaGenerator"


    // $ANTLR start "entryRuleMobaGeneratorFeature"
    // InternalMoba.g:933:1: entryRuleMobaGeneratorFeature returns [EObject current=null] : iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF ;
    public final EObject entryRuleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorFeature = null;


        try {
            // InternalMoba.g:933:61: (iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF )
            // InternalMoba.g:934:2: iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaGeneratorFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeneratorFeature=ruleMobaGeneratorFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaGeneratorFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:940:1: ruleMobaGeneratorFeature returns [EObject current=null] : (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) ;
    public final EObject ruleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaGeneratorIDFeature_0 = null;

        EObject this_MobaGeneratorMixinFeature_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:946:2: ( (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) )
            // InternalMoba.g:947:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            {
            // InternalMoba.g:947:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==39) ) {
                alt14=1;
            }
            else if ( (LA14_0==41) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMoba.g:948:3: this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaGeneratorFeatureAccess().getMobaGeneratorIDFeatureParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaGeneratorIDFeature_0=ruleMobaGeneratorIDFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaGeneratorIDFeature_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:957:3: this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaGeneratorFeatureAccess().getMobaGeneratorMixinFeatureParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaGeneratorMixinFeature_1=ruleMobaGeneratorMixinFeature();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaGeneratorMixinFeature_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaGeneratorFeature"


    // $ANTLR start "entryRuleMobaGeneratorIDFeature"
    // InternalMoba.g:969:1: entryRuleMobaGeneratorIDFeature returns [EObject current=null] : iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF ;
    public final EObject entryRuleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorIDFeature = null;


        try {
            // InternalMoba.g:969:63: (iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF )
            // InternalMoba.g:970:2: iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaGeneratorIDFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeneratorIDFeature=ruleMobaGeneratorIDFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaGeneratorIDFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:976:1: ruleMobaGeneratorIDFeature returns [EObject current=null] : (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) ;
    public final EObject ruleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_generatorId_1_0=null;
        Token otherlv_2=null;
        Token lv_generatorVersion_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:982:2: ( (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) )
            // InternalMoba.g:983:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            {
            // InternalMoba.g:983:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            // InternalMoba.g:984:3: otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getExtensionPointKeyword_0());
              		
            }
            // InternalMoba.g:988:3: ( (lv_generatorId_1_0= RULE_FQN ) )
            // InternalMoba.g:989:4: (lv_generatorId_1_0= RULE_FQN )
            {
            // InternalMoba.g:989:4: (lv_generatorId_1_0= RULE_FQN )
            // InternalMoba.g:990:5: lv_generatorId_1_0= RULE_FQN
            {
            lv_generatorId_1_0=(Token)match(input,RULE_FQN,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_generatorId_1_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getGeneratorIdFQNTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,40,FOLLOW_7); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaGeneratorIDFeatureAccess().getColonKeyword_2());
              		
            }
            // InternalMoba.g:1010:3: ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            // InternalMoba.g:1011:4: (lv_generatorVersion_3_0= RULE_VERSION )
            {
            // InternalMoba.g:1011:4: (lv_generatorVersion_3_0= RULE_VERSION )
            // InternalMoba.g:1012:5: lv_generatorVersion_3_0= RULE_VERSION
            {
            lv_generatorVersion_3_0=(Token)match(input,RULE_VERSION,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_generatorVersion_3_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getGeneratorVersionVERSIONTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaGeneratorIDFeature"


    // $ANTLR start "entryRuleMobaGeneratorMixinFeature"
    // InternalMoba.g:1032:1: entryRuleMobaGeneratorMixinFeature returns [EObject current=null] : iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF ;
    public final EObject entryRuleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorMixinFeature = null;


        try {
            // InternalMoba.g:1032:66: (iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF )
            // InternalMoba.g:1033:2: iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaGeneratorMixinFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeneratorMixinFeature=ruleMobaGeneratorMixinFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaGeneratorMixinFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:1039:1: ruleMobaGeneratorMixinFeature returns [EObject current=null] : (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID_VERSION ) ) ) ;
    public final EObject ruleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:1045:2: ( (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID_VERSION ) ) ) )
            // InternalMoba.g:1046:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID_VERSION ) ) )
            {
            // InternalMoba.g:1046:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID_VERSION ) ) )
            // InternalMoba.g:1047:3: otherlv_0= 'mixin' ( (otherlv_1= RULE_ID_VERSION ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorMixinFeatureAccess().getMixinKeyword_0());
              		
            }
            // InternalMoba.g:1051:3: ( (otherlv_1= RULE_ID_VERSION ) )
            // InternalMoba.g:1052:4: (otherlv_1= RULE_ID_VERSION )
            {
            // InternalMoba.g:1052:4: (otherlv_1= RULE_ID_VERSION )
            // InternalMoba.g:1053:5: otherlv_1= RULE_ID_VERSION
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaGeneratorMixinFeatureRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID_VERSION,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getMobaGeneratorMixinFeatureAccess().getGeneratorRefMobaGeneratorCrossReference_1_0());
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaGeneratorMixinFeature"


    // $ANTLR start "entryRuleMobaAuthorization"
    // InternalMoba.g:1068:1: entryRuleMobaAuthorization returns [EObject current=null] : iv_ruleMobaAuthorization= ruleMobaAuthorization EOF ;
    public final EObject entryRuleMobaAuthorization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAuthorization = null;


        try {
            // InternalMoba.g:1068:58: (iv_ruleMobaAuthorization= ruleMobaAuthorization EOF )
            // InternalMoba.g:1069:2: iv_ruleMobaAuthorization= ruleMobaAuthorization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaAuthorizationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaAuthorization=ruleMobaAuthorization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaAuthorization; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaAuthorization"


    // $ANTLR start "ruleMobaAuthorization"
    // InternalMoba.g:1075:1: ruleMobaAuthorization returns [EObject current=null] : (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaAuthorization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1081:2: ( (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1082:2: (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1082:2: (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1083:3: otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaAuthorizationAccess().getAuthorizationKeyword_0());
              		
            }
            // InternalMoba.g:1087:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1088:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1088:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1089:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaAuthorizationAccess().getNameCONSTANTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaAuthorizationRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.CONSTANT");
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaAuthorizationRule());
              			}
              			newCompositeNode(grammarAccess.getMobaAuthorizationAccess().getMobaFriendsAbleParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_2=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_2;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaAuthorization"


    // $ANTLR start "entryRuleMobaTransportSerializationType"
    // InternalMoba.g:1120:1: entryRuleMobaTransportSerializationType returns [EObject current=null] : iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF ;
    public final EObject entryRuleMobaTransportSerializationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTransportSerializationType = null;


        try {
            // InternalMoba.g:1120:71: (iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF )
            // InternalMoba.g:1121:2: iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaTransportSerializationTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaTransportSerializationType=ruleMobaTransportSerializationType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaTransportSerializationType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaTransportSerializationType"


    // $ANTLR start "ruleMobaTransportSerializationType"
    // InternalMoba.g:1127:1: ruleMobaTransportSerializationType returns [EObject current=null] : (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaTransportSerializationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1133:2: ( (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1134:2: (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1134:2: (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1135:3: otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaTransportSerializationTypeAccess().getSerializationKeyword_0());
              		
            }
            // InternalMoba.g:1139:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1140:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1140:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1141:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaTransportSerializationTypeAccess().getNameCONSTANTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaTransportSerializationTypeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.CONSTANT");
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaTransportSerializationTypeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaTransportSerializationTypeAccess().getMobaFriendsAbleParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_2=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_2;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaTransportSerializationType"


    // $ANTLR start "entryRuleMobaDataType"
    // InternalMoba.g:1172:1: entryRuleMobaDataType returns [EObject current=null] : iv_ruleMobaDataType= ruleMobaDataType EOF ;
    public final EObject entryRuleMobaDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDataType = null;


        try {
            // InternalMoba.g:1172:53: (iv_ruleMobaDataType= ruleMobaDataType EOF )
            // InternalMoba.g:1173:2: iv_ruleMobaDataType= ruleMobaDataType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaDataTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaDataType=ruleMobaDataType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaDataType; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:1179:1: ruleMobaDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaDataType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_array_5_0=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token lv_date_12_0=null;
        Token lv_time_13_0=null;
        Token lv_timestamp_14_0=null;
        Token otherlv_15=null;
        Token lv_dateFormatString_16_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token lv_string_20_0=null;
        Token lv_primitive_21_0=null;
        Token lv_bool_22_0=null;
        Token lv_primitive_23_0=null;
        Token lv_numeric_24_0=null;
        Token lv_primitive_25_0=null;
        Token lv_decimal_26_0=null;
        Token lv_primitive_27_0=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_enumAST_19_0 = null;

        EObject this_MobaFriendsAble_28 = null;



        	enterRule();

        try {
            // InternalMoba.g:1185:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1186:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1186:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1187:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalMoba.g:1191:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1192:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1192:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1193:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaDataTypeAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoba.g:1209:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMoba.g:1210:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaDataTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:1214:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1215:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1215:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1216:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaDataTypeRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_27); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaDataTypeAccess().getSuperTypeMobaDataTypeCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:1228:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) )
            // InternalMoba.g:1229:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) )
            {
            // InternalMoba.g:1229:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) )
            // InternalMoba.g:1230:5: ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            // InternalMoba.g:1233:5: ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?)
            // InternalMoba.g:1234:6: ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?
            {
            // InternalMoba.g:1234:6: ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+
            int cnt25=0;
            loop25:
            do {
                int alt25=4;
                int LA25_0 = input.LA(1);

                if ( LA25_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt25=1;
                }
                else if ( LA25_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt25=2;
                }
                else if ( ( LA25_0 >= 47 && LA25_0 <= 50 || LA25_0 >= 52 && LA25_0 <= 55 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt25=3;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMoba.g:1235:4: ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:1235:4: ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:1236:5: {...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoba.g:1236:109: ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:1237:6: ({...}? => ( (lv_array_5_0= 'isArray' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0);
            	    // InternalMoba.g:1240:9: ({...}? => ( (lv_array_5_0= 'isArray' ) ) )
            	    // InternalMoba.g:1240:10: {...}? => ( (lv_array_5_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1240:19: ( (lv_array_5_0= 'isArray' ) )
            	    // InternalMoba.g:1240:20: (lv_array_5_0= 'isArray' )
            	    {
            	    // InternalMoba.g:1240:20: (lv_array_5_0= 'isArray' )
            	    // InternalMoba.g:1241:10: lv_array_5_0= 'isArray'
            	    {
            	    lv_array_5_0=(Token)match(input,45,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_array_5_0, grammarAccess.getMobaDataTypeAccess().getArrayIsArrayKeyword_3_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	      										}
            	      										setWithLastConsumed(current, "array", true, "isArray");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:1258:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:1258:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:1259:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoba.g:1259:109: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:1260:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1);
            	    // InternalMoba.g:1263:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:1263:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1263:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:1263:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaDataTypeAccess().getConstraintsKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_1_1());
            	      								
            	    }
            	    // InternalMoba.g:1271:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:1272:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:1272:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:1273:11: lv_constraints_8_0= ruleMobaConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_1_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getMobaDataTypeRule());
            	      											}
            	      											add(
            	      												current,
            	      												"constraints",
            	      												lv_constraints_8_0,
            	      												"org.mobadsl.grammar.Moba.MobaConstraint");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }

            	    // InternalMoba.g:1290:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==33) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalMoba.g:1291:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaDataTypeAccess().getCommaKeyword_3_1_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:1295:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:1296:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:1296:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:1297:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getMobaDataTypeAccess().getConstraintsMobaConstraintParserRuleCall_3_1_3_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElementForParent(grammarAccess.getMobaDataTypeRule());
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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,34,FOLLOW_28); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_3_1_4());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:1325:4: ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) )
            	    {
            	    // InternalMoba.g:1325:4: ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) )
            	    // InternalMoba.g:1326:5: {...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoba.g:1326:109: ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) )
            	    // InternalMoba.g:1327:6: ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2);
            	    // InternalMoba.g:1330:9: ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) )
            	    // InternalMoba.g:1330:10: {...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1330:19: ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) )
            	    int alt24=6;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	    case 48:
            	    case 49:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt24=4;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt24=5;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt24=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 24, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt24) {
            	        case 1 :
            	            // InternalMoba.g:1330:20: ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? )
            	            {
            	            // InternalMoba.g:1330:20: ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? )
            	            // InternalMoba.g:1331:10: ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )?
            	            {
            	            // InternalMoba.g:1331:10: ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) )
            	            int alt17=3;
            	            switch ( input.LA(1) ) {
            	            case 47:
            	                {
            	                alt17=1;
            	                }
            	                break;
            	            case 48:
            	                {
            	                alt17=2;
            	                }
            	                break;
            	            case 49:
            	                {
            	                alt17=3;
            	                }
            	                break;
            	            default:
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 17, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt17) {
            	                case 1 :
            	                    // InternalMoba.g:1332:11: ( (lv_date_12_0= 'isDate' ) )
            	                    {
            	                    // InternalMoba.g:1332:11: ( (lv_date_12_0= 'isDate' ) )
            	                    // InternalMoba.g:1333:12: (lv_date_12_0= 'isDate' )
            	                    {
            	                    // InternalMoba.g:1333:12: (lv_date_12_0= 'isDate' )
            	                    // InternalMoba.g:1334:13: lv_date_12_0= 'isDate'
            	                    {
            	                    lv_date_12_0=(Token)match(input,47,FOLLOW_30); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      													newLeafNode(lv_date_12_0, grammarAccess.getMobaDataTypeAccess().getDateIsDateKeyword_3_2_0_0_0_0());
            	                      												
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      													if (current==null) {
            	                      														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                      													}
            	                      													setWithLastConsumed(current, "date", true, "isDate");
            	                      												
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalMoba.g:1347:11: ( (lv_time_13_0= 'isTime' ) )
            	                    {
            	                    // InternalMoba.g:1347:11: ( (lv_time_13_0= 'isTime' ) )
            	                    // InternalMoba.g:1348:12: (lv_time_13_0= 'isTime' )
            	                    {
            	                    // InternalMoba.g:1348:12: (lv_time_13_0= 'isTime' )
            	                    // InternalMoba.g:1349:13: lv_time_13_0= 'isTime'
            	                    {
            	                    lv_time_13_0=(Token)match(input,48,FOLLOW_30); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      													newLeafNode(lv_time_13_0, grammarAccess.getMobaDataTypeAccess().getTimeIsTimeKeyword_3_2_0_0_1_0());
            	                      												
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      													if (current==null) {
            	                      														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                      													}
            	                      													setWithLastConsumed(current, "time", true, "isTime");
            	                      												
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalMoba.g:1362:11: ( (lv_timestamp_14_0= 'isTimestamp' ) )
            	                    {
            	                    // InternalMoba.g:1362:11: ( (lv_timestamp_14_0= 'isTimestamp' ) )
            	                    // InternalMoba.g:1363:12: (lv_timestamp_14_0= 'isTimestamp' )
            	                    {
            	                    // InternalMoba.g:1363:12: (lv_timestamp_14_0= 'isTimestamp' )
            	                    // InternalMoba.g:1364:13: lv_timestamp_14_0= 'isTimestamp'
            	                    {
            	                    lv_timestamp_14_0=(Token)match(input,49,FOLLOW_30); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      													newLeafNode(lv_timestamp_14_0, grammarAccess.getMobaDataTypeAccess().getTimestampIsTimestampKeyword_3_2_0_0_2_0());
            	                      												
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      													if (current==null) {
            	                      														current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                      													}
            	                      													setWithLastConsumed(current, "timestamp", true, "isTimestamp");
            	                      												
            	                    }

            	                    }


            	                    }


            	                    }
            	                    break;

            	            }

            	            // InternalMoba.g:1377:10: (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )?
            	            int alt19=2;
            	            int LA19_0 = input.LA(1);

            	            if ( (LA19_0==32) ) {
            	                alt19=1;
            	            }
            	            switch (alt19) {
            	                case 1 :
            	                    // InternalMoba.g:1378:11: otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')'
            	                    {
            	                    otherlv_15=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      											newLeafNode(otherlv_15, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_2_0_1_0());
            	                      										
            	                    }
            	                    // InternalMoba.g:1382:11: ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) )
            	                    int alt18=2;
            	                    int LA18_0 = input.LA(1);

            	                    if ( (LA18_0==RULE_STRING) ) {
            	                        alt18=1;
            	                    }
            	                    else if ( (LA18_0==RULE_CONSTANT) ) {
            	                        alt18=2;
            	                    }
            	                    else {
            	                        if (state.backtracking>0) {state.failed=true; return current;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 18, 0, input);

            	                        throw nvae;
            	                    }
            	                    switch (alt18) {
            	                        case 1 :
            	                            // InternalMoba.g:1383:12: ( (lv_dateFormatString_16_0= RULE_STRING ) )
            	                            {
            	                            // InternalMoba.g:1383:12: ( (lv_dateFormatString_16_0= RULE_STRING ) )
            	                            // InternalMoba.g:1384:13: (lv_dateFormatString_16_0= RULE_STRING )
            	                            {
            	                            // InternalMoba.g:1384:13: (lv_dateFormatString_16_0= RULE_STRING )
            	                            // InternalMoba.g:1385:14: lv_dateFormatString_16_0= RULE_STRING
            	                            {
            	                            lv_dateFormatString_16_0=(Token)match(input,RULE_STRING,FOLLOW_31); if (state.failed) return current;
            	                            if ( state.backtracking==0 ) {

            	                              														newLeafNode(lv_dateFormatString_16_0, grammarAccess.getMobaDataTypeAccess().getDateFormatStringSTRINGTerminalRuleCall_3_2_0_1_1_0_0());
            	                              													
            	                            }
            	                            if ( state.backtracking==0 ) {

            	                              														if (current==null) {
            	                              															current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                              														}
            	                              														setWithLastConsumed(
            	                              															current,
            	                              															"dateFormatString",
            	                              															lv_dateFormatString_16_0,
            	                              															"org.eclipse.xtext.common.Terminals.STRING");
            	                              													
            	                            }

            	                            }


            	                            }


            	                            }
            	                            break;
            	                        case 2 :
            	                            // InternalMoba.g:1402:12: ( (otherlv_17= RULE_CONSTANT ) )
            	                            {
            	                            // InternalMoba.g:1402:12: ( (otherlv_17= RULE_CONSTANT ) )
            	                            // InternalMoba.g:1403:13: (otherlv_17= RULE_CONSTANT )
            	                            {
            	                            // InternalMoba.g:1403:13: (otherlv_17= RULE_CONSTANT )
            	                            // InternalMoba.g:1404:14: otherlv_17= RULE_CONSTANT
            	                            {
            	                            if ( state.backtracking==0 ) {

            	                              														if (current==null) {
            	                              															current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                              														}
            	                              													
            	                            }
            	                            otherlv_17=(Token)match(input,RULE_CONSTANT,FOLLOW_31); if (state.failed) return current;
            	                            if ( state.backtracking==0 ) {

            	                              														newLeafNode(otherlv_17, grammarAccess.getMobaDataTypeAccess().getDateFormatConstMobaConstantCrossReference_3_2_0_1_1_1_0());
            	                              													
            	                            }

            	                            }


            	                            }


            	                            }
            	                            break;

            	                    }

            	                    otherlv_18=(Token)match(input,34,FOLLOW_28); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      											newLeafNode(otherlv_18, grammarAccess.getMobaDataTypeAccess().getRightParenthesisKeyword_3_2_0_1_2());
            	                      										
            	                    }

            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMoba.g:1423:9: ( (lv_enumAST_19_0= ruleMobaEnum ) )
            	            {
            	            // InternalMoba.g:1423:9: ( (lv_enumAST_19_0= ruleMobaEnum ) )
            	            // InternalMoba.g:1424:10: (lv_enumAST_19_0= ruleMobaEnum )
            	            {
            	            // InternalMoba.g:1424:10: (lv_enumAST_19_0= ruleMobaEnum )
            	            // InternalMoba.g:1425:11: lv_enumAST_19_0= ruleMobaEnum
            	            {
            	            if ( state.backtracking==0 ) {

            	              											newCompositeNode(grammarAccess.getMobaDataTypeAccess().getEnumASTMobaEnumParserRuleCall_3_2_1_0());
            	              										
            	            }
            	            pushFollow(FOLLOW_28);
            	            lv_enumAST_19_0=ruleMobaEnum();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              											if (current==null) {
            	              												current = createModelElementForParent(grammarAccess.getMobaDataTypeRule());
            	              											}
            	              											set(
            	              												current,
            	              												"enumAST",
            	              												lv_enumAST_19_0,
            	              												"org.mobadsl.grammar.Moba.MobaEnum");
            	              											afterParserOrEnumRuleCall();
            	              										
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMoba.g:1443:9: ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1443:9: ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1444:10: ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1444:10: ( (lv_string_20_0= 'isString' ) )
            	            // InternalMoba.g:1445:11: (lv_string_20_0= 'isString' )
            	            {
            	            // InternalMoba.g:1445:11: (lv_string_20_0= 'isString' )
            	            // InternalMoba.g:1446:12: lv_string_20_0= 'isString'
            	            {
            	            lv_string_20_0=(Token)match(input,50,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(lv_string_20_0, grammarAccess.getMobaDataTypeAccess().getStringIsStringKeyword_3_2_2_0_0());
            	              											
            	            }
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	              												}
            	              												setWithLastConsumed(current, "string", true, "isString");
            	              											
            	            }

            	            }


            	            }

            	            // InternalMoba.g:1458:10: ( (lv_primitive_21_0= 'isPrimitive' ) )?
            	            int alt20=2;
            	            int LA20_0 = input.LA(1);

            	            if ( (LA20_0==51) ) {
            	                alt20=1;
            	            }
            	            switch (alt20) {
            	                case 1 :
            	                    // InternalMoba.g:1459:11: (lv_primitive_21_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1459:11: (lv_primitive_21_0= 'isPrimitive' )
            	                    // InternalMoba.g:1460:12: lv_primitive_21_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_21_0=(Token)match(input,51,FOLLOW_28); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      												newLeafNode(lv_primitive_21_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_2_1_0());
            	                      											
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      												if (current==null) {
            	                      													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                      												}
            	                      												setWithLastConsumed(current, "primitive", true, "isPrimitive");
            	                      											
            	                    }

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalMoba.g:1474:9: ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1474:9: ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1475:10: ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1475:10: ( (lv_bool_22_0= 'isBool' ) )
            	            // InternalMoba.g:1476:11: (lv_bool_22_0= 'isBool' )
            	            {
            	            // InternalMoba.g:1476:11: (lv_bool_22_0= 'isBool' )
            	            // InternalMoba.g:1477:12: lv_bool_22_0= 'isBool'
            	            {
            	            lv_bool_22_0=(Token)match(input,52,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(lv_bool_22_0, grammarAccess.getMobaDataTypeAccess().getBoolIsBoolKeyword_3_2_3_0_0());
            	              											
            	            }
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	              												}
            	              												setWithLastConsumed(current, "bool", true, "isBool");
            	              											
            	            }

            	            }


            	            }

            	            // InternalMoba.g:1489:10: ( (lv_primitive_23_0= 'isPrimitive' ) )?
            	            int alt21=2;
            	            int LA21_0 = input.LA(1);

            	            if ( (LA21_0==51) ) {
            	                alt21=1;
            	            }
            	            switch (alt21) {
            	                case 1 :
            	                    // InternalMoba.g:1490:11: (lv_primitive_23_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1490:11: (lv_primitive_23_0= 'isPrimitive' )
            	                    // InternalMoba.g:1491:12: lv_primitive_23_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_23_0=(Token)match(input,51,FOLLOW_28); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      												newLeafNode(lv_primitive_23_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_3_1_0());
            	                      											
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      												if (current==null) {
            	                      													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                      												}
            	                      												setWithLastConsumed(current, "primitive", true, "isPrimitive");
            	                      											
            	                    }

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 5 :
            	            // InternalMoba.g:1505:9: ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1505:9: ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1506:10: ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1506:10: ( (lv_numeric_24_0= 'isNumeric' ) )
            	            // InternalMoba.g:1507:11: (lv_numeric_24_0= 'isNumeric' )
            	            {
            	            // InternalMoba.g:1507:11: (lv_numeric_24_0= 'isNumeric' )
            	            // InternalMoba.g:1508:12: lv_numeric_24_0= 'isNumeric'
            	            {
            	            lv_numeric_24_0=(Token)match(input,53,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(lv_numeric_24_0, grammarAccess.getMobaDataTypeAccess().getNumericIsNumericKeyword_3_2_4_0_0());
            	              											
            	            }
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	              												}
            	              												setWithLastConsumed(current, "numeric", true, "isNumeric");
            	              											
            	            }

            	            }


            	            }

            	            // InternalMoba.g:1520:10: ( (lv_primitive_25_0= 'isPrimitive' ) )?
            	            int alt22=2;
            	            int LA22_0 = input.LA(1);

            	            if ( (LA22_0==51) ) {
            	                alt22=1;
            	            }
            	            switch (alt22) {
            	                case 1 :
            	                    // InternalMoba.g:1521:11: (lv_primitive_25_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1521:11: (lv_primitive_25_0= 'isPrimitive' )
            	                    // InternalMoba.g:1522:12: lv_primitive_25_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_25_0=(Token)match(input,51,FOLLOW_28); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      												newLeafNode(lv_primitive_25_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_4_1_0());
            	                      											
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      												if (current==null) {
            	                      													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                      												}
            	                      												setWithLastConsumed(current, "primitive", true, "isPrimitive");
            	                      											
            	                    }

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;
            	        case 6 :
            	            // InternalMoba.g:1536:9: ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1536:9: ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1537:10: ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1537:10: ( (lv_decimal_26_0= 'isDecimal' ) )
            	            // InternalMoba.g:1538:11: (lv_decimal_26_0= 'isDecimal' )
            	            {
            	            // InternalMoba.g:1538:11: (lv_decimal_26_0= 'isDecimal' )
            	            // InternalMoba.g:1539:12: lv_decimal_26_0= 'isDecimal'
            	            {
            	            lv_decimal_26_0=(Token)match(input,54,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(lv_decimal_26_0, grammarAccess.getMobaDataTypeAccess().getDecimalIsDecimalKeyword_3_2_5_0_0());
            	              											
            	            }
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	              												}
            	              												setWithLastConsumed(current, "decimal", true, "isDecimal");
            	              											
            	            }

            	            }


            	            }

            	            // InternalMoba.g:1551:10: ( (lv_primitive_27_0= 'isPrimitive' ) )?
            	            int alt23=2;
            	            int LA23_0 = input.LA(1);

            	            if ( (LA23_0==51) ) {
            	                alt23=1;
            	            }
            	            switch (alt23) {
            	                case 1 :
            	                    // InternalMoba.g:1552:11: (lv_primitive_27_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1552:11: (lv_primitive_27_0= 'isPrimitive' )
            	                    // InternalMoba.g:1553:12: lv_primitive_27_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_27_0=(Token)match(input,51,FOLLOW_28); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      												newLeafNode(lv_primitive_27_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_5_1_0());
            	                      											
            	                    }
            	                    if ( state.backtracking==0 ) {

            	                      												if (current==null) {
            	                      													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	                      												}
            	                      												setWithLastConsumed(current, "primitive", true, "isPrimitive");
            	                      											
            	                    }

            	                    }


            	                    }
            	                    break;

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt25 >= 1 ) break loop25;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(25, input);
                        throw eee;
                }
                cnt25++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3()) ) {
                if (state.backtracking>0) {state.failed=true; return current;}
                throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canLeave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3())");
            }

            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDataTypeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDataTypeAccess().getMobaFriendsAbleParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_28=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_28;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaDataType"


    // $ANTLR start "entryRuleMobaEnum"
    // InternalMoba.g:1595:1: entryRuleMobaEnum returns [EObject current=null] : iv_ruleMobaEnum= ruleMobaEnum EOF ;
    public final EObject entryRuleMobaEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnum = null;


        try {
            // InternalMoba.g:1595:49: (iv_ruleMobaEnum= ruleMobaEnum EOF )
            // InternalMoba.g:1596:2: iv_ruleMobaEnum= ruleMobaEnum EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaEnumRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaEnum=ruleMobaEnum();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaEnum; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:1602:1: ruleMobaEnum returns [EObject current=null] : ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleMobaEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1608:2: ( ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' ) )
            // InternalMoba.g:1609:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' )
            {
            // InternalMoba.g:1609:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' )
            // InternalMoba.g:1610:3: () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}'
            {
            // InternalMoba.g:1610:3: ()
            // InternalMoba.g:1611:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaEnumAccess().getMobaEnumAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,55,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaEnumAccess().getEnumKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,23,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaEnumAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalMoba.g:1625:3: ( (lv_literals_3_0= ruleMobaEnumLiteral ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==56) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMoba.g:1626:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            	    {
            	    // InternalMoba.g:1626:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            	    // InternalMoba.g:1627:5: lv_literals_3_0= ruleMobaEnumLiteral
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaEnumAccess().getLiteralsMobaEnumLiteralParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_literals_3_0=ruleMobaEnumLiteral();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            otherlv_4=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMobaEnumAccess().getRightCurlyBracketKeyword_4());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaEnum"


    // $ANTLR start "entryRuleMobaEnumLiteral"
    // InternalMoba.g:1652:1: entryRuleMobaEnumLiteral returns [EObject current=null] : iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF ;
    public final EObject entryRuleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnumLiteral = null;


        try {
            // InternalMoba.g:1652:56: (iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF )
            // InternalMoba.g:1653:2: iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaEnumLiteralRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaEnumLiteral=ruleMobaEnumLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaEnumLiteral; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:1659:1: ruleMobaEnumLiteral returns [EObject current=null] : (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' ) ;
    public final EObject ruleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_literal_4_0=null;
        Token otherlv_5=null;
        Token lv_value_6_0=null;
        Token otherlv_8=null;
        Token lv_default_9_0=null;
        Token otherlv_10=null;
        Token lv_undefined_11_0=null;
        Token otherlv_12=null;


        	enterRule();

        try {
            // InternalMoba.g:1665:2: ( (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' ) )
            // InternalMoba.g:1666:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )
            {
            // InternalMoba.g:1666:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )
            // InternalMoba.g:1667:3: otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEnumLiteralAccess().getLitKeyword_0());
              		
            }
            // InternalMoba.g:1671:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1672:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1672:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1673:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaEnumLiteralAccess().getNameCONSTANTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.CONSTANT");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaEnumLiteralAccess().getEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,32,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaEnumLiteralAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalMoba.g:1697:3: ( (lv_literal_4_0= RULE_STRING ) )
            // InternalMoba.g:1698:4: (lv_literal_4_0= RULE_STRING )
            {
            // InternalMoba.g:1698:4: (lv_literal_4_0= RULE_STRING )
            // InternalMoba.g:1699:5: lv_literal_4_0= RULE_STRING
            {
            lv_literal_4_0=(Token)match(input,RULE_STRING,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_literal_4_0, grammarAccess.getMobaEnumLiteralAccess().getLiteralSTRINGTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_5=(Token)match(input,33,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_5());
              		
            }
            // InternalMoba.g:1719:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalMoba.g:1720:4: (lv_value_6_0= RULE_INT )
            {
            // InternalMoba.g:1720:4: (lv_value_6_0= RULE_INT )
            // InternalMoba.g:1721:5: lv_value_6_0= RULE_INT
            {
            lv_value_6_0=(Token)match(input,RULE_INT,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_value_6_0, grammarAccess.getMobaEnumLiteralAccess().getValueINTTerminalRuleCall_6_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoba.g:1737:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:1738:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:1738:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) )
            // InternalMoba.g:1739:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7());
            // InternalMoba.g:1742:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* )
            // InternalMoba.g:1743:6: ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )*
            {
            // InternalMoba.g:1743:6: ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )*
            loop27:
            do {
                int alt27=3;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == 33 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) ) {
                    int LA27_2 = input.LA(2);

                    if ( LA27_2 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) ) {
                        alt27=2;
                    }
                    else if ( LA27_2 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalMoba.g:1744:4: ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1744:4: ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) )
            	    // InternalMoba.g:1745:5: {...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalMoba.g:1745:112: ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) )
            	    // InternalMoba.g:1746:6: ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0);
            	    // InternalMoba.g:1749:9: ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) )
            	    // InternalMoba.g:1749:10: {...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1749:19: (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) )
            	    // InternalMoba.g:1749:20: otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) )
            	    {
            	    otherlv_8=(Token)match(input,33,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_0_0());
            	      								
            	    }
            	    // InternalMoba.g:1753:9: ( (lv_default_9_0= 'isDefault' ) )
            	    // InternalMoba.g:1754:10: (lv_default_9_0= 'isDefault' )
            	    {
            	    // InternalMoba.g:1754:10: (lv_default_9_0= 'isDefault' )
            	    // InternalMoba.g:1755:11: lv_default_9_0= 'isDefault'
            	    {
            	    lv_default_9_0=(Token)match(input,57,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_default_9_0, grammarAccess.getMobaEnumLiteralAccess().getDefaultIsDefaultKeyword_7_0_1_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            	      											}
            	      											setWithLastConsumed(current, "default", true, "isDefault");
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:1773:4: ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1773:4: ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) )
            	    // InternalMoba.g:1774:5: {...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalMoba.g:1774:112: ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) )
            	    // InternalMoba.g:1775:6: ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1);
            	    // InternalMoba.g:1778:9: ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) )
            	    // InternalMoba.g:1778:10: {...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1778:19: (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) )
            	    // InternalMoba.g:1778:20: otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) )
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_1_0());
            	      								
            	    }
            	    // InternalMoba.g:1782:9: ( (lv_undefined_11_0= 'isUndefined' ) )
            	    // InternalMoba.g:1783:10: (lv_undefined_11_0= 'isUndefined' )
            	    {
            	    // InternalMoba.g:1783:10: (lv_undefined_11_0= 'isUndefined' )
            	    // InternalMoba.g:1784:11: lv_undefined_11_0= 'isUndefined'
            	    {
            	    lv_undefined_11_0=(Token)match(input,58,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_undefined_11_0, grammarAccess.getMobaEnumLiteralAccess().getUndefinedIsUndefinedKeyword_7_1_1_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            	      											}
            	      											setWithLastConsumed(current, "undefined", true, "isUndefined");
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7());

            }

            otherlv_12=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getMobaEnumLiteralAccess().getRightParenthesisKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaEnumLiteral"


    // $ANTLR start "entryRuleMobaConstant"
    // InternalMoba.g:1817:1: entryRuleMobaConstant returns [EObject current=null] : iv_ruleMobaConstant= ruleMobaConstant EOF ;
    public final EObject entryRuleMobaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstant = null;


        try {
            // InternalMoba.g:1817:53: (iv_ruleMobaConstant= ruleMobaConstant EOF )
            // InternalMoba.g:1818:2: iv_ruleMobaConstant= ruleMobaConstant EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaConstantRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaConstant=ruleMobaConstant();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaConstant; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:1824:1: ruleMobaConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_valueAST_3_0 = null;

        EObject this_MobaFriendsAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:1830:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1831:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1831:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1832:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,59,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaConstantAccess().getConstKeyword_0());
              		
            }
            // InternalMoba.g:1836:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1837:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1837:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1838:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaConstantAccess().getNameCONSTANTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaConstantRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.CONSTANT");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,22,FOLLOW_39); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaConstantAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalMoba.g:1858:3: ( (lv_valueAST_3_0= ruleMobaConstantValue ) )
            // InternalMoba.g:1859:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            {
            // InternalMoba.g:1859:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            // InternalMoba.g:1860:5: lv_valueAST_3_0= ruleMobaConstantValue
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMobaConstantAccess().getValueASTMobaConstantValueParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_25);
            lv_valueAST_3_0=ruleMobaConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaConstantRule());
              			}
              			newCompositeNode(grammarAccess.getMobaConstantAccess().getMobaFriendsAbleParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_4=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_4;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaConstant"


    // $ANTLR start "entryRuleMobaConstantValue"
    // InternalMoba.g:1892:1: entryRuleMobaConstantValue returns [EObject current=null] : iv_ruleMobaConstantValue= ruleMobaConstantValue EOF ;
    public final EObject entryRuleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstantValue = null;


        try {
            // InternalMoba.g:1892:58: (iv_ruleMobaConstantValue= ruleMobaConstantValue EOF )
            // InternalMoba.g:1893:2: iv_ruleMobaConstantValue= ruleMobaConstantValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaConstantValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaConstantValue=ruleMobaConstantValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaConstantValue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:1899:1: ruleMobaConstantValue returns [EObject current=null] : ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? ) ;
    public final EObject ruleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token lv_valueInt_1_0=null;
        Token lv_valueDouble_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Enumerator lv_valueConstFunctions_5_0 = null;

        EObject lv_tail_7_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1905:2: ( ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? ) )
            // InternalMoba.g:1906:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? )
            {
            // InternalMoba.g:1906:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? )
            // InternalMoba.g:1907:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )?
            {
            // InternalMoba.g:1907:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) )
            int alt29=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt29=1;
                }
                break;
            case RULE_INT:
                {
                alt29=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt29=3;
                }
                break;
            case RULE_CONSTANT:
                {
                alt29=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;
            }

            switch (alt29) {
                case 1 :
                    // InternalMoba.g:1908:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1908:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:1909:5: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:1909:5: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:1910:6: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_valueString_0_0, grammarAccess.getMobaConstantValueAccess().getValueStringSTRINGTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:1927:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    {
                    // InternalMoba.g:1927:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    // InternalMoba.g:1928:5: (lv_valueInt_1_0= RULE_INT )
                    {
                    // InternalMoba.g:1928:5: (lv_valueInt_1_0= RULE_INT )
                    // InternalMoba.g:1929:6: lv_valueInt_1_0= RULE_INT
                    {
                    lv_valueInt_1_0=(Token)match(input,RULE_INT,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_valueInt_1_0, grammarAccess.getMobaConstantValueAccess().getValueIntINTTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 3 :
                    // InternalMoba.g:1946:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:1946:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:1947:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:1947:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    // InternalMoba.g:1948:6: lv_valueDouble_2_0= RULE_DOUBLE
                    {
                    lv_valueDouble_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_valueDouble_2_0, grammarAccess.getMobaConstantValueAccess().getValueDoubleDOUBLETerminalRuleCall_0_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 4 :
                    // InternalMoba.g:1965:4: ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* )
                    {
                    // InternalMoba.g:1965:4: ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* )
                    // InternalMoba.g:1966:5: ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )*
                    {
                    // InternalMoba.g:1966:5: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:1967:6: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:1967:6: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:1968:7: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMobaConstantValueRule());
                      							}
                      						
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_41); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_3, grammarAccess.getMobaConstantValueAccess().getValueConstMobaConstantCrossReference_0_3_0_0());
                      						
                    }

                    }


                    }

                    // InternalMoba.g:1979:5: (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==60) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMoba.g:1980:6: otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) )
                    	    {
                    	    otherlv_4=(Token)match(input,60,FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getMobaConstantValueAccess().getHyphenMinusGreaterThanSignKeyword_0_3_1_0());
                    	      					
                    	    }
                    	    // InternalMoba.g:1984:6: ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) )
                    	    // InternalMoba.g:1985:7: (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction )
                    	    {
                    	    // InternalMoba.g:1985:7: (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction )
                    	    // InternalMoba.g:1986:8: lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMobaConstantValueAccess().getValueConstFunctionsMobaConstantValueFunctionEnumRuleCall_0_3_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_41);
                    	    lv_valueConstFunctions_5_0=ruleMobaConstantValueFunction();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getMobaConstantValueRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"valueConstFunctions",
                    	      									lv_valueConstFunctions_5_0,
                    	      									"org.mobadsl.grammar.Moba.MobaConstantValueFunction");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

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
                    break;

            }

            // InternalMoba.g:2006:3: (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==61) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMoba.g:2007:4: otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMobaConstantValueAccess().getPlusSignKeyword_1_0());
                      			
                    }
                    // InternalMoba.g:2011:4: ( (lv_tail_7_0= ruleMobaConstantValue ) )
                    // InternalMoba.g:2012:5: (lv_tail_7_0= ruleMobaConstantValue )
                    {
                    // InternalMoba.g:2012:5: (lv_tail_7_0= ruleMobaConstantValue )
                    // InternalMoba.g:2013:6: lv_tail_7_0= ruleMobaConstantValue
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMobaConstantValueAccess().getTailMobaConstantValueParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_tail_7_0=ruleMobaConstantValue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getMobaConstantValueRule());
                      						}
                      						set(
                      							current,
                      							"tail",
                      							lv_tail_7_0,
                      							"org.mobadsl.grammar.Moba.MobaConstantValue");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaConstantValue"


    // $ANTLR start "ruleMobaFriendsAble"
    // InternalMoba.g:2036:1: ruleMobaFriendsAble[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) ) ;
    public final EObject ruleMobaFriendsAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject lv_friends_3_0 = null;

        EObject lv_friends_5_0 = null;

        EObject lv_properties_8_0 = null;

        EObject lv_properties_10_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2042:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) ) )
            // InternalMoba.g:2043:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) )
            {
            // InternalMoba.g:2043:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) )
            // InternalMoba.g:2044:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2044:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) )
            // InternalMoba.g:2045:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());
            // InternalMoba.g:2048:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* )
            // InternalMoba.g:2049:5: ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )*
            {
            // InternalMoba.g:2049:5: ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoba.g:2050:3: ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2050:3: ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) )
            	    // InternalMoba.g:2051:4: {...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMoba.g:2051:109: ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) )
            	    // InternalMoba.g:2052:5: ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0);
            	    // InternalMoba.g:2055:8: ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) )
            	    // InternalMoba.g:2055:9: {...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "true");
            	    }
            	    // InternalMoba.g:2055:18: (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' )
            	    // InternalMoba.g:2055:19: otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')'
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_1, grammarAccess.getMobaFriendsAbleAccess().getFriendsKeyword_0_0());
            	      							
            	    }
            	    otherlv_2=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_2, grammarAccess.getMobaFriendsAbleAccess().getLeftParenthesisKeyword_0_1());
            	      							
            	    }
            	    // InternalMoba.g:2063:8: ( (lv_friends_3_0= ruleMobaFriend ) )
            	    // InternalMoba.g:2064:9: (lv_friends_3_0= ruleMobaFriend )
            	    {
            	    // InternalMoba.g:2064:9: (lv_friends_3_0= ruleMobaFriend )
            	    // InternalMoba.g:2065:10: lv_friends_3_0= ruleMobaFriend
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getFriendsMobaFriendParserRuleCall_0_2_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_friends_3_0=ruleMobaFriend();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getMobaFriendsAbleRule());
            	      										}
            	      										add(
            	      											current,
            	      											"friends",
            	      											lv_friends_3_0,
            	      											"org.mobadsl.grammar.Moba.MobaFriend");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }

            	    // InternalMoba.g:2082:8: (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==33) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalMoba.g:2083:9: otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      									newLeafNode(otherlv_4, grammarAccess.getMobaFriendsAbleAccess().getCommaKeyword_0_3_0());
            	    	      								
            	    	    }
            	    	    // InternalMoba.g:2087:9: ( (lv_friends_5_0= ruleMobaFriend ) )
            	    	    // InternalMoba.g:2088:10: (lv_friends_5_0= ruleMobaFriend )
            	    	    {
            	    	    // InternalMoba.g:2088:10: (lv_friends_5_0= ruleMobaFriend )
            	    	    // InternalMoba.g:2089:11: lv_friends_5_0= ruleMobaFriend
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getFriendsMobaFriendParserRuleCall_0_3_1_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_friends_5_0=ruleMobaFriend();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      											if (current==null) {
            	    	      												current = createModelElementForParent(grammarAccess.getMobaFriendsAbleRule());
            	    	      											}
            	    	      											add(
            	    	      												current,
            	    	      												"friends",
            	    	      												lv_friends_5_0,
            	    	      												"org.mobadsl.grammar.Moba.MobaFriend");
            	    	      											afterParserOrEnumRuleCall();
            	    	      										
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);

            	    otherlv_6=(Token)match(input,34,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_6, grammarAccess.getMobaFriendsAbleAccess().getRightParenthesisKeyword_0_4());
            	      							
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:2117:3: ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) )
            	    {
            	    // InternalMoba.g:2117:3: ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) )
            	    // InternalMoba.g:2118:4: {...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMoba.g:2118:109: ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) )
            	    // InternalMoba.g:2119:5: ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1);
            	    // InternalMoba.g:2122:8: ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) )
            	    // InternalMoba.g:2122:9: {...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "true");
            	    }
            	    // InternalMoba.g:2122:18: (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' )
            	    // InternalMoba.g:2122:19: otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']'
            	    {
            	    otherlv_7=(Token)match(input,63,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_7, grammarAccess.getMobaFriendsAbleAccess().getLeftSquareBracketKeyword_1_0());
            	      							
            	    }
            	    // InternalMoba.g:2126:8: ( (lv_properties_8_0= ruleMobaProperty ) )
            	    // InternalMoba.g:2127:9: (lv_properties_8_0= ruleMobaProperty )
            	    {
            	    // InternalMoba.g:2127:9: (lv_properties_8_0= ruleMobaProperty )
            	    // InternalMoba.g:2128:10: lv_properties_8_0= ruleMobaProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_1_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_properties_8_0=ruleMobaProperty();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElementForParent(grammarAccess.getMobaFriendsAbleRule());
            	      										}
            	      										add(
            	      											current,
            	      											"properties",
            	      											lv_properties_8_0,
            	      											"org.mobadsl.grammar.Moba.MobaProperty");
            	      										afterParserOrEnumRuleCall();
            	      									
            	    }

            	    }


            	    }

            	    // InternalMoba.g:2145:8: (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==33) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalMoba.g:2146:9: otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      									newLeafNode(otherlv_9, grammarAccess.getMobaFriendsAbleAccess().getCommaKeyword_1_2_0());
            	    	      								
            	    	    }
            	    	    // InternalMoba.g:2150:9: ( (lv_properties_10_0= ruleMobaProperty ) )
            	    	    // InternalMoba.g:2151:10: (lv_properties_10_0= ruleMobaProperty )
            	    	    {
            	    	    // InternalMoba.g:2151:10: (lv_properties_10_0= ruleMobaProperty )
            	    	    // InternalMoba.g:2152:11: lv_properties_10_0= ruleMobaProperty
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_2_1_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_44);
            	    	    lv_properties_10_0=ruleMobaProperty();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      											if (current==null) {
            	    	      												current = createModelElementForParent(grammarAccess.getMobaFriendsAbleRule());
            	    	      											}
            	    	      											add(
            	    	      												current,
            	    	      												"properties",
            	    	      												lv_properties_10_0,
            	    	      												"org.mobadsl.grammar.Moba.MobaProperty");
            	    	      											afterParserOrEnumRuleCall();
            	    	      										
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,64,FOLLOW_43); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_11, grammarAccess.getMobaFriendsAbleAccess().getRightSquareBracketKeyword_1_3());
            	      							
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaFriendsAble"


    // $ANTLR start "entryRuleMobaFriend"
    // InternalMoba.g:2190:1: entryRuleMobaFriend returns [EObject current=null] : iv_ruleMobaFriend= ruleMobaFriend EOF ;
    public final EObject entryRuleMobaFriend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaFriend = null;


        try {
            // InternalMoba.g:2190:51: (iv_ruleMobaFriend= ruleMobaFriend EOF )
            // InternalMoba.g:2191:2: iv_ruleMobaFriend= ruleMobaFriend EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaFriendRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaFriend=ruleMobaFriend();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaFriend; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaFriend"


    // $ANTLR start "ruleMobaFriend"
    // InternalMoba.g:2197:1: ruleMobaFriend returns [EObject current=null] : ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) ;
    public final EObject ruleMobaFriend() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:2203:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:2204:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
            {
            // InternalMoba.g:2204:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            else if ( (LA34_0==RULE_CONSTANT) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // InternalMoba.g:2205:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2205:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2206:4: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2206:4: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:2207:5: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_valueString_0_0, grammarAccess.getMobaFriendAccess().getValueStringSTRINGTerminalRuleCall_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMobaFriendRule());
                      					}
                      					setWithLastConsumed(
                      						current,
                      						"valueString",
                      						lv_valueString_0_0,
                      						"org.eclipse.xtext.common.Terminals.STRING");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:2224:3: ( (otherlv_1= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2224:3: ( (otherlv_1= RULE_CONSTANT ) )
                    // InternalMoba.g:2225:4: (otherlv_1= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2225:4: (otherlv_1= RULE_CONSTANT )
                    // InternalMoba.g:2226:5: otherlv_1= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMobaFriendRule());
                      					}
                      				
                    }
                    otherlv_1=(Token)match(input,RULE_CONSTANT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_1, grammarAccess.getMobaFriendAccess().getValueConstMobaConstantCrossReference_1_0());
                      				
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaFriend"


    // $ANTLR start "entryRuleMobaProperty"
    // InternalMoba.g:2241:1: entryRuleMobaProperty returns [EObject current=null] : iv_ruleMobaProperty= ruleMobaProperty EOF ;
    public final EObject entryRuleMobaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProperty = null;


        try {
            // InternalMoba.g:2241:53: (iv_ruleMobaProperty= ruleMobaProperty EOF )
            // InternalMoba.g:2242:2: iv_ruleMobaProperty= ruleMobaProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaProperty=ruleMobaProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaProperty; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:2248:1: ruleMobaProperty returns [EObject current=null] : ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaProperty() throws RecognitionException {
        EObject current = null;

        Token lv_keyString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_valueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:2254:2: ( ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:2255:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:2255:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:2256:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) )
            {
            // InternalMoba.g:2256:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==RULE_STRING) ) {
                alt35=1;
            }
            else if ( (LA35_0==RULE_CONSTANT) ) {
                alt35=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // InternalMoba.g:2257:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2257:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2258:5: (lv_keyString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2258:5: (lv_keyString_0_0= RULE_STRING )
                    // InternalMoba.g:2259:6: lv_keyString_0_0= RULE_STRING
                    {
                    lv_keyString_0_0=(Token)match(input,RULE_STRING,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_keyString_0_0, grammarAccess.getMobaPropertyAccess().getKeyStringSTRINGTerminalRuleCall_0_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:2276:4: ( (otherlv_1= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2276:4: ( (otherlv_1= RULE_CONSTANT ) )
                    // InternalMoba.g:2277:5: (otherlv_1= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2277:5: (otherlv_1= RULE_CONSTANT )
                    // InternalMoba.g:2278:6: otherlv_1= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaPropertyRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_CONSTANT,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getMobaPropertyAccess().getKeyConstMobaConstantCrossReference_0_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaPropertyAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:2294:3: ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==RULE_STRING) ) {
                alt36=1;
            }
            else if ( (LA36_0==RULE_CONSTANT) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // InternalMoba.g:2295:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2295:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    // InternalMoba.g:2296:5: (lv_valueString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:2296:5: (lv_valueString_3_0= RULE_STRING )
                    // InternalMoba.g:2297:6: lv_valueString_3_0= RULE_STRING
                    {
                    lv_valueString_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_valueString_3_0, grammarAccess.getMobaPropertyAccess().getValueStringSTRINGTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:2314:4: ( (otherlv_4= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2314:4: ( (otherlv_4= RULE_CONSTANT ) )
                    // InternalMoba.g:2315:5: (otherlv_4= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2315:5: (otherlv_4= RULE_CONSTANT )
                    // InternalMoba.g:2316:6: otherlv_4= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaPropertyRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_CONSTANT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getMobaPropertyAccess().getValueConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaProperty"


    // $ANTLR start "entryRuleMobaData"
    // InternalMoba.g:2332:1: entryRuleMobaData returns [EObject current=null] : iv_ruleMobaData= ruleMobaData EOF ;
    public final EObject entryRuleMobaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaData = null;


        try {
            // InternalMoba.g:2332:49: (iv_ruleMobaData= ruleMobaData EOF )
            // InternalMoba.g:2333:2: iv_ruleMobaData= ruleMobaData EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaDataRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaData=ruleMobaData();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaData; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:2339:1: ruleMobaData returns [EObject current=null] : (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) ;
    public final EObject ruleMobaData() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntity_0 = null;

        EObject this_MobaDto_1 = null;

        EObject this_MobaQueue_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2345:2: ( (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) )
            // InternalMoba.g:2346:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            {
            // InternalMoba.g:2346:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 69:
                {
                alt37=1;
                }
                break;
            case 71:
                {
                alt37=2;
                }
                break;
            case 72:
                {
                alt37=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }

            switch (alt37) {
                case 1 :
                    // InternalMoba.g:2347:3: this_MobaEntity_0= ruleMobaEntity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaDataAccess().getMobaEntityParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaEntity_0=ruleMobaEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaEntity_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:2356:3: this_MobaDto_1= ruleMobaDto
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaDataAccess().getMobaDtoParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaDto_1=ruleMobaDto();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaDto_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMoba.g:2365:3: this_MobaQueue_2= ruleMobaQueue
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaDataAccess().getMobaQueueParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaQueue_2=ruleMobaQueue();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaQueue_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaData"


    // $ANTLR start "entryRuleMobaSettings"
    // InternalMoba.g:2377:1: entryRuleMobaSettings returns [EObject current=null] : iv_ruleMobaSettings= ruleMobaSettings EOF ;
    public final EObject entryRuleMobaSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettings = null;


        try {
            // InternalMoba.g:2377:53: (iv_ruleMobaSettings= ruleMobaSettings EOF )
            // InternalMoba.g:2378:2: iv_ruleMobaSettings= ruleMobaSettings EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaSettingsRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaSettings=ruleMobaSettings();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaSettings; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:2384:1: ruleMobaSettings returns [EObject current=null] : ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) ;
    public final EObject ruleMobaSettings() throws RecognitionException {
        EObject current = null;

        Token lv_active_1_0=null;
        Token otherlv_2=null;
        Token lv_name_3_0=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_MobaFriendsAble_6 = null;

        EObject lv_features_8_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2390:2: ( ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:2391:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:2391:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:2392:3: () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}'
            {
            // InternalMoba.g:2392:3: ()
            // InternalMoba.g:2393:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0(),
              					current);
              			
            }

            }

            // InternalMoba.g:2399:3: ( (lv_active_1_0= 'active' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoba.g:2400:4: (lv_active_1_0= 'active' )
                    {
                    // InternalMoba.g:2400:4: (lv_active_1_0= 'active' )
                    // InternalMoba.g:2401:5: lv_active_1_0= 'active'
                    {
                    lv_active_1_0=(Token)match(input,37,FOLLOW_45); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_active_1_0, grammarAccess.getMobaSettingsAccess().getActiveActiveKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMobaSettingsRule());
                      					}
                      					setWithLastConsumed(current, "active", true, "active");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_2=(Token)match(input,65,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaSettingsAccess().getSettingsKeyword_2());
              		
            }
            // InternalMoba.g:2417:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMoba.g:2418:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMoba.g:2418:4: (lv_name_3_0= RULE_ID )
            // InternalMoba.g:2419:5: lv_name_3_0= RULE_ID
            {
            lv_name_3_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_3_0, grammarAccess.getMobaSettingsAccess().getNameIDTerminalRuleCall_3_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoba.g:2435:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoba.g:2436:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaSettingsAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalMoba.g:2440:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMoba.g:2441:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMoba.g:2441:5: (otherlv_5= RULE_ID )
                    // InternalMoba.g:2442:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaSettingsRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getMobaSettingsAccess().getSuperTypeMobaSettingsCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaSettingsRule());
              			}
              			newCompositeNode(grammarAccess.getMobaSettingsAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_6=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,23,FOLLOW_46); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalMoba.g:2469:3: ( (lv_features_8_0= ruleMobaSettingsFeature ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==86) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMoba.g:2470:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    {
            	    // InternalMoba.g:2470:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    // InternalMoba.g:2471:5: lv_features_8_0= ruleMobaSettingsFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaSettingsAccess().getFeaturesMobaSettingsFeatureParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_46);
            	    lv_features_8_0=ruleMobaSettingsFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAccess().getRightCurlyBracketKeyword_8());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaSettings"


    // $ANTLR start "entryRuleMobaCache"
    // InternalMoba.g:2496:1: entryRuleMobaCache returns [EObject current=null] : iv_ruleMobaCache= ruleMobaCache EOF ;
    public final EObject entryRuleMobaCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaCache = null;


        try {
            // InternalMoba.g:2496:50: (iv_ruleMobaCache= ruleMobaCache EOF )
            // InternalMoba.g:2497:2: iv_ruleMobaCache= ruleMobaCache EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaCacheRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaCache=ruleMobaCache();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaCache; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:2503:1: ruleMobaCache returns [EObject current=null] : ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) ;
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
            // InternalMoba.g:2509:2: ( ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? ) )
            // InternalMoba.g:2510:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            {
            // InternalMoba.g:2510:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )? )
            // InternalMoba.g:2511:3: () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            {
            // InternalMoba.g:2511:3: ()
            // InternalMoba.g:2512:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaCacheAccess().getMobaCacheAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,66,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaCacheAccess().getCacheKeyword_1());
              		
            }
            // InternalMoba.g:2522:3: (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==32) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalMoba.g:2523:4: otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) ) otherlv_12= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:2527:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) ) )
                    // InternalMoba.g:2528:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    {
                    // InternalMoba.g:2528:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* ) )
                    // InternalMoba.g:2529:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    // InternalMoba.g:2532:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )* )
                    // InternalMoba.g:2533:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    {
                    // InternalMoba.g:2533:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) ) )*
                    loop43:
                    do {
                        int alt43=3;
                        int LA43_0 = input.LA(1);

                        if ( LA43_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                            alt43=1;
                        }
                        else if ( LA43_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                            alt43=2;
                        }


                        switch (alt43) {
                    	case 1 :
                    	    // InternalMoba.g:2534:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2534:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:2535:6: {...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0)");
                    	    }
                    	    // InternalMoba.g:2535:109: ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:2536:7: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0);
                    	    // InternalMoba.g:2539:10: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:2539:11: {...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2539:20: (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) ) )
                    	    // InternalMoba.g:2539:21: otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    	    {
                    	    otherlv_4=(Token)match(input,67,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_4, grammarAccess.getMobaCacheAccess().getTypeKeyword_2_1_0_0());
                    	      									
                    	    }
                    	    otherlv_5=(Token)match(input,22,FOLLOW_49); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_5, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_0_1());
                    	      									
                    	    }
                    	    // InternalMoba.g:2547:10: ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_ID ) ) )
                    	    int alt41=2;
                    	    int LA41_0 = input.LA(1);

                    	    if ( (LA41_0==RULE_STRING) ) {
                    	        alt41=1;
                    	    }
                    	    else if ( (LA41_0==RULE_ID) ) {
                    	        alt41=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 41, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt41) {
                    	        case 1 :
                    	            // InternalMoba.g:2548:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:2548:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            // InternalMoba.g:2549:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:2549:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            // InternalMoba.g:2550:13: lv_cacheTypeString_6_0= RULE_STRING
                    	            {
                    	            lv_cacheTypeString_6_0=(Token)match(input,RULE_STRING,FOLLOW_48); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(lv_cacheTypeString_6_0, grammarAccess.getMobaCacheAccess().getCacheTypeStringSTRINGTerminalRuleCall_2_1_0_2_0_0());
                    	              												
                    	            }
                    	            if ( state.backtracking==0 ) {

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


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:2567:11: ( (otherlv_7= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:2567:11: ( (otherlv_7= RULE_ID ) )
                    	            // InternalMoba.g:2568:12: (otherlv_7= RULE_ID )
                    	            {
                    	            // InternalMoba.g:2568:12: (otherlv_7= RULE_ID )
                    	            // InternalMoba.g:2569:13: otherlv_7= RULE_ID
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              												
                    	            }
                    	            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(otherlv_7, grammarAccess.getMobaCacheAccess().getCacheTypeConstMobaConstantCrossReference_2_1_0_2_1_0());
                    	              												
                    	            }

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
                    	    // InternalMoba.g:2587:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2587:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) ) )
                    	    // InternalMoba.g:2588:6: {...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1)");
                    	    }
                    	    // InternalMoba.g:2588:109: ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) ) )
                    	    // InternalMoba.g:2589:7: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1);
                    	    // InternalMoba.g:2592:10: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) ) )
                    	    // InternalMoba.g:2592:11: {...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2592:20: (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) ) )
                    	    // InternalMoba.g:2592:21: otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,68,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_8, grammarAccess.getMobaCacheAccess().getStrategyKeyword_2_1_1_0());
                    	      									
                    	    }
                    	    otherlv_9=(Token)match(input,22,FOLLOW_49); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_9, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_1_1());
                    	      									
                    	    }
                    	    // InternalMoba.g:2600:10: ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_ID ) ) )
                    	    int alt42=2;
                    	    int LA42_0 = input.LA(1);

                    	    if ( (LA42_0==RULE_STRING) ) {
                    	        alt42=1;
                    	    }
                    	    else if ( (LA42_0==RULE_ID) ) {
                    	        alt42=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 42, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt42) {
                    	        case 1 :
                    	            // InternalMoba.g:2601:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:2601:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            // InternalMoba.g:2602:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:2602:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            // InternalMoba.g:2603:13: lv_cacheStrategyString_10_0= RULE_STRING
                    	            {
                    	            lv_cacheStrategyString_10_0=(Token)match(input,RULE_STRING,FOLLOW_48); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(lv_cacheStrategyString_10_0, grammarAccess.getMobaCacheAccess().getCacheStrategyStringSTRINGTerminalRuleCall_2_1_1_2_0_0());
                    	              												
                    	            }
                    	            if ( state.backtracking==0 ) {

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


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:2620:11: ( (otherlv_11= RULE_ID ) )
                    	            {
                    	            // InternalMoba.g:2620:11: ( (otherlv_11= RULE_ID ) )
                    	            // InternalMoba.g:2621:12: (otherlv_11= RULE_ID )
                    	            {
                    	            // InternalMoba.g:2621:12: (otherlv_11= RULE_ID )
                    	            // InternalMoba.g:2622:13: otherlv_11= RULE_ID
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              												
                    	            }
                    	            otherlv_11=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(otherlv_11, grammarAccess.getMobaCacheAccess().getCacheStrategyConstMobaConstantCrossReference_2_1_1_2_1_0());
                    	              												
                    	            }

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
                    	    break loop43;
                        }
                    } while (true);


                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());

                    }

                    otherlv_12=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getMobaCacheAccess().getRightParenthesisKeyword_2_2());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaCache"


    // $ANTLR start "entryRuleMobaEntity"
    // InternalMoba.g:2656:1: entryRuleMobaEntity returns [EObject current=null] : iv_ruleMobaEntity= ruleMobaEntity EOF ;
    public final EObject entryRuleMobaEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntity = null;


        try {
            // InternalMoba.g:2656:51: (iv_ruleMobaEntity= ruleMobaEntity EOF )
            // InternalMoba.g:2657:2: iv_ruleMobaEntity= ruleMobaEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntity=ruleMobaEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:2663:1: ruleMobaEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' ) ;
    public final EObject ruleMobaEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        EObject lv_cache_5_0 = null;

        EObject this_MobaFriendsAble_6 = null;

        EObject lv_features_8_0 = null;

        EObject lv_index_9_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2669:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' ) )
            // InternalMoba.g:2670:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' )
            {
            // InternalMoba.g:2670:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}' )
            // InternalMoba.g:2671:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_index_9_0= ruleMobaEntityIndex ) )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,69,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAccess().getEntityKeyword_0());
              		
            }
            // InternalMoba.g:2675:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2676:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2676:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2677:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaEntityAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoba.g:2693:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) )
            // InternalMoba.g:2694:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:2694:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            // InternalMoba.g:2695:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            // InternalMoba.g:2698:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            // InternalMoba.g:2699:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            {
            // InternalMoba.g:2699:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            loop45:
            do {
                int alt45=3;
                int LA45_0 = input.LA(1);

                if ( LA45_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
                    alt45=1;
                }
                else if ( LA45_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
                    alt45=2;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalMoba.g:2700:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:2700:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:2701:5: {...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoba.g:2701:107: ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:2702:6: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0);
            	    // InternalMoba.g:2705:9: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalMoba.g:2705:10: {...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:2705:19: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalMoba.g:2705:20: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getMobaEntityAccess().getExtendsKeyword_2_0_0());
            	      								
            	    }
            	    // InternalMoba.g:2709:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalMoba.g:2710:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMoba.g:2710:10: (otherlv_4= RULE_ID )
            	    // InternalMoba.g:2711:11: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaEntityRule());
            	      											}
            	      										
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_50); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_4, grammarAccess.getMobaEntityAccess().getSuperTypeMobaEntityCrossReference_2_0_1_0());
            	      										
            	    }

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
            	    // InternalMoba.g:2728:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    {
            	    // InternalMoba.g:2728:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    // InternalMoba.g:2729:5: {...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoba.g:2729:107: ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    // InternalMoba.g:2730:6: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1);
            	    // InternalMoba.g:2733:9: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    // InternalMoba.g:2733:10: {...}? => ( (lv_cache_5_0= ruleMobaCache ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:2733:19: ( (lv_cache_5_0= ruleMobaCache ) )
            	    // InternalMoba.g:2733:20: (lv_cache_5_0= ruleMobaCache )
            	    {
            	    // InternalMoba.g:2733:20: (lv_cache_5_0= ruleMobaCache )
            	    // InternalMoba.g:2734:10: lv_cache_5_0= ruleMobaCache
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getMobaEntityAccess().getCacheMobaCacheParserRuleCall_2_1_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_cache_5_0=ruleMobaCache();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());

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

            getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaEntityRule());
              			}
              			newCompositeNode(grammarAccess.getMobaEntityAccess().getMobaFriendsAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_6=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,23,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaEntityAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:2778:3: ( (lv_features_8_0= ruleMobaEntityFeature ) )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==86||LA46_0==91) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMoba.g:2779:4: (lv_features_8_0= ruleMobaEntityFeature )
            	    {
            	    // InternalMoba.g:2779:4: (lv_features_8_0= ruleMobaEntityFeature )
            	    // InternalMoba.g:2780:5: lv_features_8_0= ruleMobaEntityFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaEntityAccess().getFeaturesMobaEntityFeatureParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_51);
            	    lv_features_8_0=ruleMobaEntityFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop46;
                }
            } while (true);

            // InternalMoba.g:2797:3: ( (lv_index_9_0= ruleMobaEntityIndex ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==70) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalMoba.g:2798:4: (lv_index_9_0= ruleMobaEntityIndex )
                    {
                    // InternalMoba.g:2798:4: (lv_index_9_0= ruleMobaEntityIndex )
                    // InternalMoba.g:2799:5: lv_index_9_0= ruleMobaEntityIndex
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMobaEntityAccess().getIndexMobaEntityIndexParserRuleCall_6_0());
                      				
                    }
                    pushFollow(FOLLOW_52);
                    lv_index_9_0=ruleMobaEntityIndex();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_10=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getMobaEntityAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaEntity"


    // $ANTLR start "entryRuleMobaEntityIndex"
    // InternalMoba.g:2824:1: entryRuleMobaEntityIndex returns [EObject current=null] : iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF ;
    public final EObject entryRuleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityIndex = null;


        try {
            // InternalMoba.g:2824:56: (iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF )
            // InternalMoba.g:2825:2: iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaEntityIndexRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityIndex=ruleMobaEntityIndex();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaEntityIndex; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:2831:1: ruleMobaEntityIndex returns [EObject current=null] : (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) ;
    public final EObject ruleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:2837:2: ( (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) ) )
            // InternalMoba.g:2838:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            {
            // InternalMoba.g:2838:2: (otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* ) )
            // InternalMoba.g:2839:3: otherlv_0= 'index' ( (otherlv_1= RULE_ID ) ) (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            {
            otherlv_0=(Token)match(input,70,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityIndexAccess().getIndexKeyword_0());
              		
            }
            // InternalMoba.g:2843:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:2844:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:2844:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:2845:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityIndexRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_1_0());
              				
            }

            }


            }

            // InternalMoba.g:2856:3: (otherlv_2= ',' ( (otherlv_3= RULE_ID ) )* )
            // InternalMoba.g:2857:4: otherlv_2= ',' ( (otherlv_3= RULE_ID ) )*
            {
            otherlv_2=(Token)match(input,33,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_2, grammarAccess.getMobaEntityIndexAccess().getCommaKeyword_2_0());
              			
            }
            // InternalMoba.g:2861:4: ( (otherlv_3= RULE_ID ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==RULE_ID) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMoba.g:2862:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalMoba.g:2862:5: (otherlv_3= RULE_ID )
            	    // InternalMoba.g:2863:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMobaEntityIndexRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_53); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_2_1_0());
            	      					
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


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaEntityIndex"


    // $ANTLR start "entryRuleMobaDto"
    // InternalMoba.g:2879:1: entryRuleMobaDto returns [EObject current=null] : iv_ruleMobaDto= ruleMobaDto EOF ;
    public final EObject entryRuleMobaDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDto = null;


        try {
            // InternalMoba.g:2879:48: (iv_ruleMobaDto= ruleMobaDto EOF )
            // InternalMoba.g:2880:2: iv_ruleMobaDto= ruleMobaDto EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaDtoRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaDto=ruleMobaDto();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaDto; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:2886:1: ruleMobaDto returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' ) ;
    public final EObject ruleMobaDto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MobaFriendsAble_4 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2892:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:2893:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:2893:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:2894:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,71,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAccess().getDtoKeyword_0());
              		
            }
            // InternalMoba.g:2898:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2899:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2899:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2900:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaDtoAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoba.g:2916:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==30) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMoba.g:2917:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaDtoAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:2921:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:2922:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:2922:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:2923:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaDtoRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDtoRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDtoAccess().getMobaFriendsAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_4=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_4;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,23,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaDtoAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:2950:3: ( (lv_features_6_0= ruleMobaDtoFeature ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==86||LA50_0==91) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMoba.g:2951:4: (lv_features_6_0= ruleMobaDtoFeature )
            	    {
            	    // InternalMoba.g:2951:4: (lv_features_6_0= ruleMobaDtoFeature )
            	    // InternalMoba.g:2952:5: lv_features_6_0= ruleMobaDtoFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaDtoAccess().getFeaturesMobaDtoFeatureParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_features_6_0=ruleMobaDtoFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaDtoAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaDto"


    // $ANTLR start "entryRuleMobaQueue"
    // InternalMoba.g:2977:1: entryRuleMobaQueue returns [EObject current=null] : iv_ruleMobaQueue= ruleMobaQueue EOF ;
    public final EObject entryRuleMobaQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueue = null;


        try {
            // InternalMoba.g:2977:50: (iv_ruleMobaQueue= ruleMobaQueue EOF )
            // InternalMoba.g:2978:2: iv_ruleMobaQueue= ruleMobaQueue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaQueueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaQueue=ruleMobaQueue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaQueue; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:2984:1: ruleMobaQueue returns [EObject current=null] : (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) ;
    public final EObject ruleMobaQueue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject this_MobaFriendsAble_4 = null;

        EObject lv_features_6_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2990:2: ( (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:2991:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:2991:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:2992:3: otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaQueueAccess().getQueueKeyword_0());
              		
            }
            // InternalMoba.g:2996:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2997:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2997:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2998:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaQueueAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoba.g:3014:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==30) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoba.g:3015:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:3019:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3020:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3020:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3021:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaQueueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaQueueRule());
              			}
              			newCompositeNode(grammarAccess.getMobaQueueAccess().getMobaFriendsAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_4=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_4;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,23,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:3048:3: ( (lv_features_6_0= ruleMobaQueueFeature ) )*
            loop52:
            do {
                int alt52=2;
                int LA52_0 = input.LA(1);

                if ( (LA52_0==91) ) {
                    alt52=1;
                }


                switch (alt52) {
            	case 1 :
            	    // InternalMoba.g:3049:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    {
            	    // InternalMoba.g:3049:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    // InternalMoba.g:3050:5: lv_features_6_0= ruleMobaQueueFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_55);
            	    lv_features_6_0=ruleMobaQueueFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop52;
                }
            } while (true);

            otherlv_7=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaQueueAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaQueue"


    // $ANTLR start "entryRuleMobaREST"
    // InternalMoba.g:3075:1: entryRuleMobaREST returns [EObject current=null] : iv_ruleMobaREST= ruleMobaREST EOF ;
    public final EObject entryRuleMobaREST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaREST = null;


        try {
            // InternalMoba.g:3075:49: (iv_ruleMobaREST= ruleMobaREST EOF )
            // InternalMoba.g:3076:2: iv_ruleMobaREST= ruleMobaREST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaRESTRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaREST=ruleMobaREST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaREST; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaREST"


    // $ANTLR start "ruleMobaREST"
    // InternalMoba.g:3082:1: ruleMobaREST returns [EObject current=null] : (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow ) ;
    public final EObject ruleMobaREST() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRESTCustomService_0 = null;

        EObject this_MobaRESTCrud_1 = null;

        EObject this_MobaRESTWorkflow_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:3088:2: ( (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow ) )
            // InternalMoba.g:3089:2: (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow )
            {
            // InternalMoba.g:3089:2: (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow )
            int alt53=3;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt53=1;
                }
                break;
            case 83:
                {
                alt53=2;
                }
                break;
            case 84:
                {
                alt53=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;
            }

            switch (alt53) {
                case 1 :
                    // InternalMoba.g:3090:3: this_MobaRESTCustomService_0= ruleMobaRESTCustomService
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaRESTAccess().getMobaRESTCustomServiceParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaRESTCustomService_0=ruleMobaRESTCustomService();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaRESTCustomService_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:3099:3: this_MobaRESTCrud_1= ruleMobaRESTCrud
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaRESTAccess().getMobaRESTCrudParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaRESTCrud_1=ruleMobaRESTCrud();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaRESTCrud_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMoba.g:3108:3: this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaRESTAccess().getMobaRESTWorkflowParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaRESTWorkflow_2=ruleMobaRESTWorkflow();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaRESTWorkflow_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaREST"


    // $ANTLR start "entryRuleMobaRESTCustomService"
    // InternalMoba.g:3120:1: entryRuleMobaRESTCustomService returns [EObject current=null] : iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF ;
    public final EObject entryRuleMobaRESTCustomService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTCustomService = null;


        try {
            // InternalMoba.g:3120:62: (iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF )
            // InternalMoba.g:3121:2: iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaRESTCustomServiceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTCustomService=ruleMobaRESTCustomService();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaRESTCustomService; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaRESTCustomService"


    // $ANTLR start "ruleMobaRESTCustomService"
    // InternalMoba.g:3127:1: ruleMobaRESTCustomService returns [EObject current=null] : (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}' ) ;
    public final EObject ruleMobaRESTCustomService() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_bigData_1_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        EObject this_MobaFriendsAble_5 = null;

        EObject lv_headers_10_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_requestDto_18_0 = null;

        EObject lv_responseDto_21_0 = null;

        EObject lv_errorDto_24_0 = null;

        Enumerator lv_operation_27_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3133:2: ( (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}' ) )
            // InternalMoba.g:3134:2: (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}' )
            {
            // InternalMoba.g:3134:2: (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}' )
            // InternalMoba.g:3135:3: otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRESTCustomServiceAccess().getRestKeyword_0());
              		
            }
            // InternalMoba.g:3139:3: ( (lv_bigData_1_0= 'bigData' ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==74) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoba.g:3140:4: (lv_bigData_1_0= 'bigData' )
                    {
                    // InternalMoba.g:3140:4: (lv_bigData_1_0= 'bigData' )
                    // InternalMoba.g:3141:5: lv_bigData_1_0= 'bigData'
                    {
                    lv_bigData_1_0=(Token)match(input,74,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_bigData_1_0, grammarAccess.getMobaRESTCustomServiceAccess().getBigDataBigDataKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
                      					}
                      					setWithLastConsumed(current, "bigData", true, "bigData");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMoba.g:3153:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:3154:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:3154:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:3155:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getMobaRESTCustomServiceAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            // InternalMoba.g:3171:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==30) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMoba.g:3172:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMobaRESTCustomServiceAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:3176:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMoba.g:3177:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMoba.g:3177:5: (otherlv_4= RULE_ID )
                    // InternalMoba.g:3178:6: otherlv_4= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
                      						}
                      					
                    }
                    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_4, grammarAccess.getMobaRESTCustomServiceAccess().getSuperTypeMobaRESTCustomServiceCrossReference_3_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getMobaFriendsAbleParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_5;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_6=(Token)match(input,23,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalMoba.g:3205:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3206:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3206:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) )
            // InternalMoba.g:3207:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            // InternalMoba.g:3210:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* )
            // InternalMoba.g:3211:6: ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )*
            {
            // InternalMoba.g:3211:6: ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )*
            loop58:
            do {
                int alt58=7;
                int LA58_0 = input.LA(1);

                if ( LA58_0 == 75 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0) ) {
                    alt58=1;
                }
                else if ( LA58_0 == 76 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1) ) {
                    alt58=2;
                }
                else if ( LA58_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2) ) {
                    alt58=3;
                }
                else if ( LA58_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3) ) {
                    alt58=4;
                }
                else if ( LA58_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4) ) {
                    alt58=5;
                }
                else if ( LA58_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5) ) {
                    alt58=6;
                }


                switch (alt58) {
            	case 1 :
            	    // InternalMoba.g:3212:4: ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalMoba.g:3212:4: ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) )
            	    // InternalMoba.g:3213:5: {...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalMoba.g:3213:118: ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) )
            	    // InternalMoba.g:3214:6: ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0);
            	    // InternalMoba.g:3217:9: ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) )
            	    // InternalMoba.g:3217:10: {...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3217:19: (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' )
            	    // InternalMoba.g:3217:20: otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}'
            	    {
            	    otherlv_8=(Token)match(input,75,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getMobaRESTCustomServiceAccess().getHeadersKeyword_6_0_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,23,FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_6_0_1());
            	      								
            	    }
            	    // InternalMoba.g:3225:9: ( (lv_headers_10_0= ruleMobaRestHeader ) )*
            	    loop56:
            	    do {
            	        int alt56=2;
            	        int LA56_0 = input.LA(1);

            	        if ( (LA56_0==82) ) {
            	            alt56=1;
            	        }


            	        switch (alt56) {
            	    	case 1 :
            	    	    // InternalMoba.g:3226:10: (lv_headers_10_0= ruleMobaRestHeader )
            	    	    {
            	    	    // InternalMoba.g:3226:10: (lv_headers_10_0= ruleMobaRestHeader )
            	    	    // InternalMoba.g:3227:11: lv_headers_10_0= ruleMobaRestHeader
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getHeadersMobaRestHeaderParserRuleCall_6_0_2_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_58);
            	    	    lv_headers_10_0=ruleMobaRestHeader();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      											if (current==null) {
            	    	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    	      											}
            	    	      											add(
            	    	      												current,
            	    	      												"headers",
            	    	      												lv_headers_10_0,
            	    	      												"org.mobadsl.grammar.Moba.MobaRestHeader");
            	    	      											afterParserOrEnumRuleCall();
            	    	      										
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop56;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,26,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaRESTCustomServiceAccess().getRightCurlyBracketKeyword_6_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:3254:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) )
            	    {
            	    // InternalMoba.g:3254:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) )
            	    // InternalMoba.g:3255:5: {...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalMoba.g:3255:118: ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) )
            	    // InternalMoba.g:3256:6: ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1);
            	    // InternalMoba.g:3259:9: ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) )
            	    // InternalMoba.g:3259:10: {...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3259:19: (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' )
            	    // InternalMoba.g:3259:20: otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}'
            	    {
            	    otherlv_12=(Token)match(input,76,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getMobaRESTCustomServiceAccess().getParametersKeyword_6_1_0());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,23,FOLLOW_58); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_6_1_1());
            	      								
            	    }
            	    // InternalMoba.g:3267:9: ( (lv_parameters_14_0= ruleMobaRestParameter ) )*
            	    loop57:
            	    do {
            	        int alt57=2;
            	        int LA57_0 = input.LA(1);

            	        if ( (LA57_0==82) ) {
            	            alt57=1;
            	        }


            	        switch (alt57) {
            	    	case 1 :
            	    	    // InternalMoba.g:3268:10: (lv_parameters_14_0= ruleMobaRestParameter )
            	    	    {
            	    	    // InternalMoba.g:3268:10: (lv_parameters_14_0= ruleMobaRestParameter )
            	    	    // InternalMoba.g:3269:11: lv_parameters_14_0= ruleMobaRestParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getParametersMobaRestParameterParserRuleCall_6_1_2_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_58);
            	    	    lv_parameters_14_0=ruleMobaRestParameter();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      											if (current==null) {
            	    	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	    	      											}
            	    	      											add(
            	    	      												current,
            	    	      												"parameters",
            	    	      												lv_parameters_14_0,
            	    	      												"org.mobadsl.grammar.Moba.MobaRestParameter");
            	    	      											afterParserOrEnumRuleCall();
            	    	      										
            	    	    }

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop57;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,26,FOLLOW_57); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getMobaRESTCustomServiceAccess().getRightCurlyBracketKeyword_6_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:3296:4: ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3296:4: ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3297:5: {...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalMoba.g:3297:118: ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3298:6: ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2);
            	    // InternalMoba.g:3301:9: ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3301:10: {...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3301:19: (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3301:20: otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_16=(Token)match(input,77,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_16, grammarAccess.getMobaRESTCustomServiceAccess().getRequestDtoKeyword_6_2_0());
            	      								
            	    }
            	    otherlv_17=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_17, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_2_1());
            	      								
            	    }
            	    // InternalMoba.g:3309:9: ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3310:10: (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3310:10: (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3311:11: lv_requestDto_18_0= ruleMobaRESTPayloadDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getRequestDtoMobaRESTPayloadDefinitionParserRuleCall_6_2_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_requestDto_18_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	      											}
            	      											set(
            	      												current,
            	      												"requestDto",
            	      												lv_requestDto_18_0,
            	      												"org.mobadsl.grammar.Moba.MobaRESTPayloadDefinition");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:3334:4: ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3334:4: ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3335:5: {...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalMoba.g:3335:118: ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3336:6: ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3);
            	    // InternalMoba.g:3339:9: ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3339:10: {...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3339:19: (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3339:20: otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_19=(Token)match(input,78,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_19, grammarAccess.getMobaRESTCustomServiceAccess().getResponseDtoKeyword_6_3_0());
            	      								
            	    }
            	    otherlv_20=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_20, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_3_1());
            	      								
            	    }
            	    // InternalMoba.g:3347:9: ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3348:10: (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3348:10: (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3349:11: lv_responseDto_21_0= ruleMobaRESTPayloadDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getResponseDtoMobaRESTPayloadDefinitionParserRuleCall_6_3_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_responseDto_21_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	      											}
            	      											set(
            	      												current,
            	      												"responseDto",
            	      												lv_responseDto_21_0,
            	      												"org.mobadsl.grammar.Moba.MobaRESTPayloadDefinition");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:3372:4: ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3372:4: ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3373:5: {...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalMoba.g:3373:118: ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3374:6: ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4);
            	    // InternalMoba.g:3377:9: ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3377:10: {...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3377:19: (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3377:20: otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_22=(Token)match(input,79,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_22, grammarAccess.getMobaRESTCustomServiceAccess().getErrorDtoKeyword_6_4_0());
            	      								
            	    }
            	    otherlv_23=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_23, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_4_1());
            	      								
            	    }
            	    // InternalMoba.g:3385:9: ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3386:10: (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3386:10: (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3387:11: lv_errorDto_24_0= ruleMobaRESTPayloadDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getErrorDtoMobaRESTPayloadDefinitionParserRuleCall_6_4_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_errorDto_24_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	      											}
            	      											set(
            	      												current,
            	      												"errorDto",
            	      												lv_errorDto_24_0,
            	      												"org.mobadsl.grammar.Moba.MobaRESTPayloadDefinition");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMoba.g:3410:4: ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3410:4: ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) )
            	    // InternalMoba.g:3411:5: {...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalMoba.g:3411:118: ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) )
            	    // InternalMoba.g:3412:6: ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5);
            	    // InternalMoba.g:3415:9: ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) )
            	    // InternalMoba.g:3415:10: {...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3415:19: (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) )
            	    // InternalMoba.g:3415:20: otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) )
            	    {
            	    otherlv_25=(Token)match(input,80,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_25, grammarAccess.getMobaRESTCustomServiceAccess().getMethodKeyword_6_5_0());
            	      								
            	    }
            	    otherlv_26=(Token)match(input,22,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_26, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_5_1());
            	      								
            	    }
            	    // InternalMoba.g:3423:9: ( (lv_operation_27_0= ruleMobaRESTMethods ) )
            	    // InternalMoba.g:3424:10: (lv_operation_27_0= ruleMobaRESTMethods )
            	    {
            	    // InternalMoba.g:3424:10: (lv_operation_27_0= ruleMobaRESTMethods )
            	    // InternalMoba.g:3425:11: lv_operation_27_0= ruleMobaRESTMethods
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getOperationMobaRESTMethodsEnumRuleCall_6_5_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_57);
            	    lv_operation_27_0=ruleMobaRESTMethods();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	      											}
            	      											set(
            	      												current,
            	      												"operation",
            	      												lv_operation_27_0,
            	      												"org.mobadsl.grammar.Moba.MobaRESTMethods");
            	      											afterParserOrEnumRuleCall();
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());

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

            getUnorderedGroupHelper().leave(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());

            }

            otherlv_28=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_28, grammarAccess.getMobaRESTCustomServiceAccess().getRightCurlyBracketKeyword_7());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaRESTCustomService"


    // $ANTLR start "entryRuleMobaRESTPayloadDefinition"
    // InternalMoba.g:3463:1: entryRuleMobaRESTPayloadDefinition returns [EObject current=null] : iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF ;
    public final EObject entryRuleMobaRESTPayloadDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTPayloadDefinition = null;


        try {
            // InternalMoba.g:3463:66: (iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF )
            // InternalMoba.g:3464:2: iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaRESTPayloadDefinitionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTPayloadDefinition=ruleMobaRESTPayloadDefinition();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaRESTPayloadDefinition; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaRESTPayloadDefinition"


    // $ANTLR start "ruleMobaRESTPayloadDefinition"
    // InternalMoba.g:3470:1: ruleMobaRESTPayloadDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleMobaRESTPayloadDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:3476:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalMoba.g:3477:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalMoba.g:3477:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) )
            // InternalMoba.g:3478:3: ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) )
            {
            // InternalMoba.g:3478:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoba.g:3479:4: (otherlv_0= RULE_ID )
            {
            // InternalMoba.g:3479:4: (otherlv_0= RULE_ID )
            // InternalMoba.g:3480:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getMobaRESTPayloadDefinitionAccess().getDtoMobaDtoCrossReference_0_0());
              				
            }

            }


            }

            // InternalMoba.g:3491:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3492:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3492:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) )
            // InternalMoba.g:3493:5: ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1());
            // InternalMoba.g:3496:5: ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* )
            // InternalMoba.g:3497:6: ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )*
            {
            // InternalMoba.g:3497:6: ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )*
            loop59:
            do {
                int alt59=3;
                int LA59_0 = input.LA(1);

                if ( LA59_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0) ) {
                    alt59=1;
                }
                else if ( LA59_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1) ) {
                    alt59=2;
                }


                switch (alt59) {
            	case 1 :
            	    // InternalMoba.g:3498:4: ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3498:4: ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:3499:5: {...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3499:122: ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:3500:6: ({...}? => ( (lv_array_2_0= 'isArray' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:3503:9: ({...}? => ( (lv_array_2_0= 'isArray' ) ) )
            	    // InternalMoba.g:3503:10: {...}? => ( (lv_array_2_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "true");
            	    }
            	    // InternalMoba.g:3503:19: ( (lv_array_2_0= 'isArray' ) )
            	    // InternalMoba.g:3503:20: (lv_array_2_0= 'isArray' )
            	    {
            	    // InternalMoba.g:3503:20: (lv_array_2_0= 'isArray' )
            	    // InternalMoba.g:3504:10: lv_array_2_0= 'isArray'
            	    {
            	    lv_array_2_0=(Token)match(input,45,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_array_2_0, grammarAccess.getMobaRESTPayloadDefinitionAccess().getArrayIsArrayKeyword_1_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
            	      										}
            	      										setWithLastConsumed(current, "array", true, "isArray");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:3521:4: ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3521:4: ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) )
            	    // InternalMoba.g:3522:5: {...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3522:122: ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            	    // InternalMoba.g:3523:6: ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:3526:9: ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) )
            	    // InternalMoba.g:3526:10: {...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "true");
            	    }
            	    // InternalMoba.g:3526:19: (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) )
            	    // InternalMoba.g:3526:20: otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) )
            	    {
            	    otherlv_3=(Token)match(input,81,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getMobaRESTPayloadDefinitionAccess().getAsKeyword_1_1_0());
            	      								
            	    }
            	    // InternalMoba.g:3530:9: ( (otherlv_4= RULE_CONSTANT ) )
            	    // InternalMoba.g:3531:10: (otherlv_4= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:3531:10: (otherlv_4= RULE_CONSTANT )
            	    // InternalMoba.g:3532:11: otherlv_4= RULE_CONSTANT
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
            	      											}
            	      										
            	    }
            	    otherlv_4=(Token)match(input,RULE_CONSTANT,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_4, grammarAccess.getMobaRESTPayloadDefinitionAccess().getSerializationTypeMobaTransportSerializationTypeCrossReference_1_1_1_0());
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1());

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

            getUnorderedGroupHelper().leave(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1());

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaRESTPayloadDefinition"


    // $ANTLR start "entryRuleMobaRestParameter"
    // InternalMoba.g:3560:1: entryRuleMobaRestParameter returns [EObject current=null] : iv_ruleMobaRestParameter= ruleMobaRestParameter EOF ;
    public final EObject entryRuleMobaRestParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestParameter = null;


        try {
            // InternalMoba.g:3560:58: (iv_ruleMobaRestParameter= ruleMobaRestParameter EOF )
            // InternalMoba.g:3561:2: iv_ruleMobaRestParameter= ruleMobaRestParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaRestParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaRestParameter=ruleMobaRestParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaRestParameter; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaRestParameter"


    // $ANTLR start "ruleMobaRestParameter"
    // InternalMoba.g:3567:1: ruleMobaRestParameter returns [EObject current=null] : (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) ;
    public final EObject ruleMobaRestParameter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nameString_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_valueString_5_0=null;
        Token lv_valueInt_6_0=null;
        Token lv_valueDouble_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMoba.g:3573:2: ( (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) )
            // InternalMoba.g:3574:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            {
            // InternalMoba.g:3574:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            // InternalMoba.g:3575:3: otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            {
            otherlv_0=(Token)match(input,82,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRestParameterAccess().getParamKeyword_0());
              		
            }
            // InternalMoba.g:3579:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:3580:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:3580:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:3581:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRestParameterRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getMobaRestParameterAccess().getTypeMobaDataTypeCrossReference_1_0());
              				
            }

            }


            }

            // InternalMoba.g:3592:3: ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==RULE_ID) && (synpred1_InternalMoba())) {
                alt60=1;
            }
            else if ( (LA60_0==RULE_CONSTANT) ) {
                alt60=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 60, 0, input);

                throw nvae;
            }
            switch (alt60) {
                case 1 :
                    // InternalMoba.g:3593:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    {
                    // InternalMoba.g:3593:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    // InternalMoba.g:3594:5: ( RULE_ID )=> (lv_nameString_2_0= RULE_ID )
                    {
                    // InternalMoba.g:3595:5: (lv_nameString_2_0= RULE_ID )
                    // InternalMoba.g:3596:6: lv_nameString_2_0= RULE_ID
                    {
                    lv_nameString_2_0=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_nameString_2_0, grammarAccess.getMobaRestParameterAccess().getNameStringIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRestParameterRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"nameString",
                      							lv_nameString_2_0,
                      							"org.mobadsl.grammar.Moba.ID");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3613:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:3613:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:3614:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:3614:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:3615:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRestParameterRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaRestParameterAccess().getNameConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:3627:3: (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==22) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // InternalMoba.g:3628:4: otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaRestParameterAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:3632:4: ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    int alt61=4;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt61=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt61=2;
                        }
                        break;
                    case RULE_DOUBLE:
                        {
                        alt61=3;
                        }
                        break;
                    case RULE_CONSTANT:
                        {
                        alt61=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 61, 0, input);

                        throw nvae;
                    }

                    switch (alt61) {
                        case 1 :
                            // InternalMoba.g:3633:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:3633:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            // InternalMoba.g:3634:6: (lv_valueString_5_0= RULE_STRING )
                            {
                            // InternalMoba.g:3634:6: (lv_valueString_5_0= RULE_STRING )
                            // InternalMoba.g:3635:7: lv_valueString_5_0= RULE_STRING
                            {
                            lv_valueString_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_valueString_5_0, grammarAccess.getMobaRestParameterAccess().getValueStringSTRINGTerminalRuleCall_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaRestParameterRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"valueString",
                              								lv_valueString_5_0,
                              								"org.eclipse.xtext.common.Terminals.STRING");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:3652:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            {
                            // InternalMoba.g:3652:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            // InternalMoba.g:3653:6: (lv_valueInt_6_0= RULE_INT )
                            {
                            // InternalMoba.g:3653:6: (lv_valueInt_6_0= RULE_INT )
                            // InternalMoba.g:3654:7: lv_valueInt_6_0= RULE_INT
                            {
                            lv_valueInt_6_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_valueInt_6_0, grammarAccess.getMobaRestParameterAccess().getValueIntINTTerminalRuleCall_3_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaRestParameterRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"valueInt",
                              								lv_valueInt_6_0,
                              								"org.mobadsl.grammar.Moba.INT");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMoba.g:3671:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            {
                            // InternalMoba.g:3671:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            // InternalMoba.g:3672:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            {
                            // InternalMoba.g:3672:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            // InternalMoba.g:3673:7: lv_valueDouble_7_0= RULE_DOUBLE
                            {
                            lv_valueDouble_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_valueDouble_7_0, grammarAccess.getMobaRestParameterAccess().getValueDoubleDOUBLETerminalRuleCall_3_1_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaRestParameterRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"valueDouble",
                              								lv_valueDouble_7_0,
                              								"org.mobadsl.grammar.Moba.DOUBLE");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalMoba.g:3690:5: ( (otherlv_8= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:3690:5: ( (otherlv_8= RULE_CONSTANT ) )
                            // InternalMoba.g:3691:6: (otherlv_8= RULE_CONSTANT )
                            {
                            // InternalMoba.g:3691:6: (otherlv_8= RULE_CONSTANT )
                            // InternalMoba.g:3692:7: otherlv_8= RULE_CONSTANT
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaRestParameterRule());
                              							}
                              						
                            }
                            otherlv_8=(Token)match(input,RULE_CONSTANT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_8, grammarAccess.getMobaRestParameterAccess().getValueConstMobaConstantCrossReference_3_1_3_0());
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaRestParameter"


    // $ANTLR start "entryRuleMobaRestHeader"
    // InternalMoba.g:3709:1: entryRuleMobaRestHeader returns [EObject current=null] : iv_ruleMobaRestHeader= ruleMobaRestHeader EOF ;
    public final EObject entryRuleMobaRestHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestHeader = null;


        try {
            // InternalMoba.g:3709:55: (iv_ruleMobaRestHeader= ruleMobaRestHeader EOF )
            // InternalMoba.g:3710:2: iv_ruleMobaRestHeader= ruleMobaRestHeader EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaRestHeaderRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaRestHeader=ruleMobaRestHeader();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaRestHeader; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaRestHeader"


    // $ANTLR start "ruleMobaRestHeader"
    // InternalMoba.g:3716:1: ruleMobaRestHeader returns [EObject current=null] : (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) ;
    public final EObject ruleMobaRestHeader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_nameString_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token lv_valueString_5_0=null;
        Token lv_valueInt_6_0=null;
        Token lv_valueDouble_7_0=null;
        Token otherlv_8=null;


        	enterRule();

        try {
            // InternalMoba.g:3722:2: ( (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) )
            // InternalMoba.g:3723:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            {
            // InternalMoba.g:3723:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            // InternalMoba.g:3724:3: otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            {
            otherlv_0=(Token)match(input,82,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRestHeaderAccess().getParamKeyword_0());
              		
            }
            // InternalMoba.g:3728:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:3729:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:3729:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:3730:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRestHeaderRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getMobaRestHeaderAccess().getTypeMobaDataTypeCrossReference_1_0());
              				
            }

            }


            }

            // InternalMoba.g:3741:3: ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) && (synpred2_InternalMoba())) {
                alt63=1;
            }
            else if ( (LA63_0==RULE_CONSTANT) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // InternalMoba.g:3742:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    {
                    // InternalMoba.g:3742:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    // InternalMoba.g:3743:5: ( RULE_ID )=> (lv_nameString_2_0= RULE_ID )
                    {
                    // InternalMoba.g:3744:5: (lv_nameString_2_0= RULE_ID )
                    // InternalMoba.g:3745:6: lv_nameString_2_0= RULE_ID
                    {
                    lv_nameString_2_0=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_nameString_2_0, grammarAccess.getMobaRestHeaderAccess().getNameStringIDTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"nameString",
                      							lv_nameString_2_0,
                      							"org.mobadsl.grammar.Moba.ID");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:3762:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:3762:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:3763:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:3763:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:3764:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_62); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaRestHeaderAccess().getNameConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:3776:3: (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==22) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMoba.g:3777:4: otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaRestHeaderAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:3781:4: ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    int alt64=4;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt64=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt64=2;
                        }
                        break;
                    case RULE_DOUBLE:
                        {
                        alt64=3;
                        }
                        break;
                    case RULE_CONSTANT:
                        {
                        alt64=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 64, 0, input);

                        throw nvae;
                    }

                    switch (alt64) {
                        case 1 :
                            // InternalMoba.g:3782:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:3782:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            // InternalMoba.g:3783:6: (lv_valueString_5_0= RULE_STRING )
                            {
                            // InternalMoba.g:3783:6: (lv_valueString_5_0= RULE_STRING )
                            // InternalMoba.g:3784:7: lv_valueString_5_0= RULE_STRING
                            {
                            lv_valueString_5_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_valueString_5_0, grammarAccess.getMobaRestHeaderAccess().getValueStringSTRINGTerminalRuleCall_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"valueString",
                              								lv_valueString_5_0,
                              								"org.eclipse.xtext.common.Terminals.STRING");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:3801:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            {
                            // InternalMoba.g:3801:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            // InternalMoba.g:3802:6: (lv_valueInt_6_0= RULE_INT )
                            {
                            // InternalMoba.g:3802:6: (lv_valueInt_6_0= RULE_INT )
                            // InternalMoba.g:3803:7: lv_valueInt_6_0= RULE_INT
                            {
                            lv_valueInt_6_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_valueInt_6_0, grammarAccess.getMobaRestHeaderAccess().getValueIntINTTerminalRuleCall_3_1_1_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"valueInt",
                              								lv_valueInt_6_0,
                              								"org.mobadsl.grammar.Moba.INT");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 3 :
                            // InternalMoba.g:3820:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            {
                            // InternalMoba.g:3820:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            // InternalMoba.g:3821:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            {
                            // InternalMoba.g:3821:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            // InternalMoba.g:3822:7: lv_valueDouble_7_0= RULE_DOUBLE
                            {
                            lv_valueDouble_7_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_valueDouble_7_0, grammarAccess.getMobaRestHeaderAccess().getValueDoubleDOUBLETerminalRuleCall_3_1_2_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"valueDouble",
                              								lv_valueDouble_7_0,
                              								"org.mobadsl.grammar.Moba.DOUBLE");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 4 :
                            // InternalMoba.g:3839:5: ( (otherlv_8= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:3839:5: ( (otherlv_8= RULE_CONSTANT ) )
                            // InternalMoba.g:3840:6: (otherlv_8= RULE_CONSTANT )
                            {
                            // InternalMoba.g:3840:6: (otherlv_8= RULE_CONSTANT )
                            // InternalMoba.g:3841:7: otherlv_8= RULE_CONSTANT
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                              							}
                              						
                            }
                            otherlv_8=(Token)match(input,RULE_CONSTANT,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_8, grammarAccess.getMobaRestHeaderAccess().getValueConstMobaConstantCrossReference_3_1_3_0());
                              						
                            }

                            }


                            }


                            }
                            break;

                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaRestHeader"


    // $ANTLR start "entryRuleMobaRESTCrud"
    // InternalMoba.g:3858:1: entryRuleMobaRESTCrud returns [EObject current=null] : iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF ;
    public final EObject entryRuleMobaRESTCrud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTCrud = null;


        try {
            // InternalMoba.g:3858:53: (iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF )
            // InternalMoba.g:3859:2: iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaRESTCrudRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTCrud=ruleMobaRESTCrud();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaRESTCrud; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaRESTCrud"


    // $ANTLR start "ruleMobaRESTCrud"
    // InternalMoba.g:3865:1: ruleMobaRESTCrud returns [EObject current=null] : (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaRESTCrud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_MobaFriendsAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:3871:2: ( (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:3872:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:3872:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:3873:3: otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,83,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRESTCrudAccess().getRestCrudKeyword_0());
              		
            }
            // InternalMoba.g:3877:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:3878:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:3878:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:3879:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaRESTCrudAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRESTCrudRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            // InternalMoba.g:3895:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==30) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMoba.g:3896:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaRESTCrudAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:3900:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3901:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3901:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3902:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRESTCrudRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaRESTCrudAccess().getSuperTypeMobaRESTCrudCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaRESTCrudRule());
              			}
              			newCompositeNode(grammarAccess.getMobaRESTCrudAccess().getMobaFriendsAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_4=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_4;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaRESTCrud"


    // $ANTLR start "entryRuleMobaRESTWorkflow"
    // InternalMoba.g:3929:1: entryRuleMobaRESTWorkflow returns [EObject current=null] : iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF ;
    public final EObject entryRuleMobaRESTWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTWorkflow = null;


        try {
            // InternalMoba.g:3929:57: (iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF )
            // InternalMoba.g:3930:2: iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaRESTWorkflowRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaRESTWorkflow=ruleMobaRESTWorkflow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaRESTWorkflow; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaRESTWorkflow"


    // $ANTLR start "ruleMobaRESTWorkflow"
    // InternalMoba.g:3936:1: ruleMobaRESTWorkflow returns [EObject current=null] : (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) ;
    public final EObject ruleMobaRESTWorkflow() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject this_MobaFriendsAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:3942:2: ( (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) )
            // InternalMoba.g:3943:2: (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            {
            // InternalMoba.g:3943:2: (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            // InternalMoba.g:3944:3: otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,84,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRESTWorkflowAccess().getRestWorkflowKeyword_0());
              		
            }
            // InternalMoba.g:3948:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:3949:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:3949:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:3950:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaRESTWorkflowAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRESTWorkflowRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            // InternalMoba.g:3966:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==30) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalMoba.g:3967:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaRESTWorkflowAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:3971:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3972:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3972:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3973:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRESTWorkflowRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaRESTWorkflowAccess().getSuperTypeMobaRESTWorkflowCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaRESTWorkflowRule());
              			}
              			newCompositeNode(grammarAccess.getMobaRESTWorkflowAccess().getMobaFriendsAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_4=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_4;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_5=(Token)match(input,23,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaRESTWorkflowAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:4000:3: (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==85) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // InternalMoba.g:4001:4: otherlv_6= 'service' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,85,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getMobaRESTWorkflowAccess().getServiceKeyword_5_0());
            	      			
            	    }
            	    // InternalMoba.g:4005:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalMoba.g:4006:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMoba.g:4006:5: (otherlv_7= RULE_ID )
            	    // InternalMoba.g:4007:6: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMobaRESTWorkflowRule());
            	      						}
            	      					
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_64); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getMobaRESTWorkflowAccess().getServicesMobaRESTCrossReference_5_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_8=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getMobaRESTWorkflowAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaRESTWorkflow"


    // $ANTLR start "entryRuleMobaEntityFeature"
    // InternalMoba.g:4027:1: entryRuleMobaEntityFeature returns [EObject current=null] : iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF ;
    public final EObject entryRuleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityFeature = null;


        try {
            // InternalMoba.g:4027:58: (iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF )
            // InternalMoba.g:4028:2: iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaEntityFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityFeature=ruleMobaEntityFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaEntityFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:4034:1: ruleMobaEntityFeature returns [EObject current=null] : (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference ) ;
    public final EObject ruleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntityAttribute_0 = null;

        EObject this_MobaEntityReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:4040:2: ( (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference ) )
            // InternalMoba.g:4041:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference )
            {
            // InternalMoba.g:4041:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference )
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==86) ) {
                alt69=1;
            }
            else if ( (LA69_0==91) ) {
                alt69=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }
            switch (alt69) {
                case 1 :
                    // InternalMoba.g:4042:3: this_MobaEntityAttribute_0= ruleMobaEntityAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaEntityFeatureAccess().getMobaEntityAttributeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaEntityAttribute_0=ruleMobaEntityAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaEntityAttribute_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:4051:3: this_MobaEntityReference_1= ruleMobaEntityReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaEntityFeatureAccess().getMobaEntityReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaEntityReference_1=ruleMobaEntityReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaEntityReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaEntityFeature"


    // $ANTLR start "entryRuleMobaEntityAttribute"
    // InternalMoba.g:4063:1: entryRuleMobaEntityAttribute returns [EObject current=null] : iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF ;
    public final EObject entryRuleMobaEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityAttribute = null;


        try {
            // InternalMoba.g:4063:60: (iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF )
            // InternalMoba.g:4064:2: iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaEntityAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityAttribute=ruleMobaEntityAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaEntityAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:4070:1: ruleMobaEntityAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current] ) ;
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

        EObject this_MobaFriendsAble_15 = null;



        	enterRule();

        try {
            // InternalMoba.g:4076:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4077:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4077:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4078:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,86,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAttributeAccess().getVarKeyword_0());
              		
            }
            // InternalMoba.g:4082:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:4083:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:4083:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:4084:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            // InternalMoba.g:4087:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:4088:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:4088:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop71:
            do {
                int alt71=6;
                int LA71_0 = input.LA(1);

                if ( LA71_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt71=1;
                }
                else if ( LA71_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt71=2;
                }
                else if ( LA71_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt71=3;
                }
                else if ( LA71_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt71=4;
                }
                else if ( LA71_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt71=5;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalMoba.g:4089:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4089:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:4090:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4090:116: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:4091:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:4094:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:4094:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4094:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:4094:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:4094:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:4095:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,87,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_lazy_2_0, grammarAccess.getMobaEntityAttributeAccess().getLazyLazyKeyword_1_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "lazy", true, "lazy");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:4112:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4112:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:4113:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4113:116: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:4114:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:4117:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:4117:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4117:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:4117:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:4117:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:4118:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,88,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_transient_3_0, grammarAccess.getMobaEntityAttributeAccess().getTransientTransientKeyword_1_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "transient", true, "transient");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:4135:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4135:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:4136:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:4136:116: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:4137:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:4140:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:4140:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4140:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:4140:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:4140:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:4141:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,89,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_domainKey_4_0, grammarAccess.getMobaEntityAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "domainKey", true, "domainKey");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:4158:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4158:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:4159:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:4159:116: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:4160:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3);
            	    // InternalMoba.g:4163:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:4163:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4163:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:4163:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:4163:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:4164:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,90,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_domainDescription_5_0, grammarAccess.getMobaEntityAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "domainDescription", true, "domainDescription");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:4181:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:4181:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:4182:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:4182:116: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:4183:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4);
            	    // InternalMoba.g:4186:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:4186:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4186:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:4186:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaEntityAttributeAccess().getConstraintsKeyword_1_4_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaEntityAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	      								
            	    }
            	    // InternalMoba.g:4194:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:4195:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:4195:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:4196:11: lv_constraints_8_0= ruleMobaConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalMoba.g:4213:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop70:
            	    do {
            	        int alt70=2;
            	        int LA70_0 = input.LA(1);

            	        if ( (LA70_0==33) ) {
            	            alt70=1;
            	        }


            	        switch (alt70) {
            	    	case 1 :
            	    	    // InternalMoba.g:4214:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaEntityAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:4218:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:4219:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:4219:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:4220:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop70;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,34,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaEntityAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:4255:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:4256:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:4256:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:4257:5: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
              					}
              				
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_12, grammarAccess.getMobaEntityAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_13;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:4279:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:4280:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:4280:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:4281:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_14_0, grammarAccess.getMobaEntityAttributeAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_15=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_15;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaEntityAttribute"


    // $ANTLR start "entryRuleMobaSettingsFeature"
    // InternalMoba.g:4312:1: entryRuleMobaSettingsFeature returns [EObject current=null] : iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF ;
    public final EObject entryRuleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsFeature = null;


        try {
            // InternalMoba.g:4312:60: (iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF )
            // InternalMoba.g:4313:2: iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaSettingsFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaSettingsFeature=ruleMobaSettingsFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaSettingsFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:4319:1: ruleMobaSettingsFeature returns [EObject current=null] : this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute ;
    public final EObject ruleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaSettingsAttribute_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:4325:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute )
            // InternalMoba.g:4326:2: this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getMobaSettingsFeatureAccess().getMobaSettingsAttributeParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_MobaSettingsAttribute_0=ruleMobaSettingsAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_MobaSettingsAttribute_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaSettingsFeature"


    // $ANTLR start "entryRuleMobaSettingsAttribute"
    // InternalMoba.g:4337:1: entryRuleMobaSettingsAttribute returns [EObject current=null] : iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF ;
    public final EObject entryRuleMobaSettingsAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsAttribute = null;


        try {
            // InternalMoba.g:4337:62: (iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF )
            // InternalMoba.g:4338:2: iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaSettingsAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaSettingsAttribute=ruleMobaSettingsAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaSettingsAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:4344:1: ruleMobaSettingsAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current] ) ;
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

        EObject this_MobaFriendsAble_15 = null;



        	enterRule();

        try {
            // InternalMoba.g:4350:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4351:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4351:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4352:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) this_MobaFriendsAble_15= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,86,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsAttributeAccess().getVarKeyword_0());
              		
            }
            // InternalMoba.g:4356:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:4357:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:4357:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:4358:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            // InternalMoba.g:4361:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:4362:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:4362:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop73:
            do {
                int alt73=6;
                int LA73_0 = input.LA(1);

                if ( LA73_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt73=1;
                }
                else if ( LA73_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt73=2;
                }
                else if ( LA73_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt73=3;
                }
                else if ( LA73_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt73=4;
                }
                else if ( LA73_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt73=5;
                }


                switch (alt73) {
            	case 1 :
            	    // InternalMoba.g:4363:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4363:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:4364:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4364:118: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:4365:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:4368:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:4368:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4368:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:4368:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:4368:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:4369:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,87,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_lazy_2_0, grammarAccess.getMobaSettingsAttributeAccess().getLazyLazyKeyword_1_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "lazy", true, "lazy");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:4386:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4386:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:4387:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4387:118: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:4388:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:4391:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:4391:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4391:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:4391:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:4391:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:4392:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,88,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_transient_3_0, grammarAccess.getMobaSettingsAttributeAccess().getTransientTransientKeyword_1_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "transient", true, "transient");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:4409:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4409:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:4410:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:4410:118: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:4411:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:4414:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:4414:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4414:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:4414:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:4414:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:4415:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,89,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_domainKey_4_0, grammarAccess.getMobaSettingsAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "domainKey", true, "domainKey");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:4432:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4432:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:4433:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:4433:118: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:4434:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3);
            	    // InternalMoba.g:4437:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:4437:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4437:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:4437:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:4437:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:4438:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,90,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_domainDescription_5_0, grammarAccess.getMobaSettingsAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "domainDescription", true, "domainDescription");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:4455:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:4455:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:4456:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:4456:118: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:4457:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4);
            	    // InternalMoba.g:4460:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:4460:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4460:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:4460:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaSettingsAttributeAccess().getConstraintsKeyword_1_4_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	      								
            	    }
            	    // InternalMoba.g:4468:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:4469:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:4469:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:4470:11: lv_constraints_8_0= ruleMobaConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalMoba.g:4487:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop72:
            	    do {
            	        int alt72=2;
            	        int LA72_0 = input.LA(1);

            	        if ( (LA72_0==33) ) {
            	            alt72=1;
            	        }


            	        switch (alt72) {
            	    	case 1 :
            	    	    // InternalMoba.g:4488:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:4492:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:4493:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:4493:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:4494:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop72;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,34,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaSettingsAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:4529:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:4530:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:4530:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:4531:5: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
              					}
              				
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_12, grammarAccess.getMobaSettingsAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_13;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:4553:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:4554:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:4554:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:4555:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_14_0, grammarAccess.getMobaSettingsAttributeAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_15=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_15;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaSettingsAttribute"


    // $ANTLR start "ruleMobaMultiplicityAble"
    // InternalMoba.g:4587:1: ruleMobaMultiplicityAble[EObject in_current] returns [EObject current=in_current] : ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? ;
    public final EObject ruleMobaMultiplicityAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:4593:2: ( ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? )
            // InternalMoba.g:4594:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            {
            // InternalMoba.g:4594:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==63) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalMoba.g:4595:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    {
                    // InternalMoba.g:4595:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    // InternalMoba.g:4596:4: lv_multiplicity_0_0= ruleMobaMuliplicity
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getMobaMultiplicityAbleAccess().getMultiplicityMobaMuliplicityParserRuleCall_0());
                      			
                    }
                    pushFollow(FOLLOW_2);
                    lv_multiplicity_0_0=ruleMobaMuliplicity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaMultiplicityAble"


    // $ANTLR start "entryRuleMobaEntityReference"
    // InternalMoba.g:4616:1: entryRuleMobaEntityReference returns [EObject current=null] : iv_ruleMobaEntityReference= ruleMobaEntityReference EOF ;
    public final EObject entryRuleMobaEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityReference = null;


        try {
            // InternalMoba.g:4616:60: (iv_ruleMobaEntityReference= ruleMobaEntityReference EOF )
            // InternalMoba.g:4617:2: iv_ruleMobaEntityReference= ruleMobaEntityReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaEntityReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityReference=ruleMobaEntityReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaEntityReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:4623:1: ruleMobaEntityReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaEntityReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cascading_2_0=null;
        Token lv_lazy_3_0=null;
        Token lv_transient_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        EObject this_MobaMultiplicityAble_6 = null;

        EObject this_MobaFriendsAble_8 = null;



        	enterRule();

        try {
            // InternalMoba.g:4629:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4630:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4630:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4631:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,91,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityReferenceAccess().getRefKeyword_0());
              		
            }
            // InternalMoba.g:4635:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:4636:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:4636:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:4637:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:4640:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:4641:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:4641:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop75:
            do {
                int alt75=4;
                int LA75_0 = input.LA(1);

                if ( LA75_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt75=1;
                }
                else if ( LA75_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt75=2;
                }
                else if ( LA75_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt75=3;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalMoba.g:4642:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4642:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:4643:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4643:116: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:4644:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:4647:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:4647:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:4647:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:4647:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:4647:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:4648:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,92,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaEntityReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "cascading", true, "cascading");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:4665:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4665:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:4666:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4666:116: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:4667:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:4670:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:4670:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:4670:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:4670:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:4670:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:4671:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,87,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaEntityReferenceAccess().getLazyLazyKeyword_1_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "lazy", true, "lazy");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:4688:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4688:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:4689:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:4689:116: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:4690:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:4693:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:4693:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:4693:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:4693:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:4693:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:4694:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,88,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_transient_4_0, grammarAccess.getMobaEntityReferenceAccess().getTransientTransientKeyword_1_2_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "transient", true, "transient");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:4718:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:4719:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:4719:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:4720:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getMobaEntityReferenceAccess().getTypeMobaEntityCrossReference_2_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaEntityReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_6;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:4742:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:4743:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:4743:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:4744:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_7_0, grammarAccess.getMobaEntityReferenceAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaEntityReferenceAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_8;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaEntityReference"


    // $ANTLR start "entryRuleMobaDtoFeature"
    // InternalMoba.g:4775:1: entryRuleMobaDtoFeature returns [EObject current=null] : iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF ;
    public final EObject entryRuleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoFeature = null;


        try {
            // InternalMoba.g:4775:55: (iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF )
            // InternalMoba.g:4776:2: iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaDtoFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaDtoFeature=ruleMobaDtoFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaDtoFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:4782:1: ruleMobaDtoFeature returns [EObject current=null] : (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference ) ;
    public final EObject ruleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDtoAttribute_0 = null;

        EObject this_MobaDtoReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:4788:2: ( (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference ) )
            // InternalMoba.g:4789:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference )
            {
            // InternalMoba.g:4789:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==86) ) {
                alt76=1;
            }
            else if ( (LA76_0==91) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // InternalMoba.g:4790:3: this_MobaDtoAttribute_0= ruleMobaDtoAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoAttributeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaDtoAttribute_0=ruleMobaDtoAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaDtoAttribute_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:4799:3: this_MobaDtoReference_1= ruleMobaDtoReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaDtoReference_1=ruleMobaDtoReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaDtoReference_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaDtoFeature"


    // $ANTLR start "entryRuleMobaDtoAttribute"
    // InternalMoba.g:4811:1: entryRuleMobaDtoAttribute returns [EObject current=null] : iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF ;
    public final EObject entryRuleMobaDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoAttribute = null;


        try {
            // InternalMoba.g:4811:57: (iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF )
            // InternalMoba.g:4812:2: iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaDtoAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaDtoAttribute=ruleMobaDtoAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaDtoAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:4818:1: ruleMobaDtoAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) this_MobaFriendsAble_19= ruleMobaFriendsAble[$current] ) ;
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

        EObject this_MobaFriendsAble_19 = null;



        	enterRule();

        try {
            // InternalMoba.g:4824:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) this_MobaFriendsAble_19= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4825:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) this_MobaFriendsAble_19= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4825:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) this_MobaFriendsAble_19= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4826:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) ) ( (otherlv_16= RULE_ID ) ) this_MobaMultiplicityAble_17= ruleMobaMultiplicityAble[$current] ( (lv_name_18_0= RULE_ID ) ) this_MobaFriendsAble_19= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,86,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAttributeAccess().getVarKeyword_0());
              		
            }
            // InternalMoba.g:4830:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:4831:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:4831:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* ) )
            // InternalMoba.g:4832:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            // InternalMoba.g:4835:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )* )
            // InternalMoba.g:4836:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            {
            // InternalMoba.g:4836:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) ) )*
            loop78:
            do {
                int alt78=7;
                int LA78_0 = input.LA(1);

                if ( LA78_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt78=1;
                }
                else if ( LA78_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt78=2;
                }
                else if ( LA78_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt78=3;
                }
                else if ( LA78_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt78=4;
                }
                else if ( LA78_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt78=5;
                }
                else if ( LA78_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5) ) {
                    alt78=6;
                }


                switch (alt78) {
            	case 1 :
            	    // InternalMoba.g:4837:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4837:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:4838:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4838:113: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:4839:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:4842:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:4842:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:4842:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:4842:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:4842:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:4843:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,87,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_lazy_2_0, grammarAccess.getMobaDtoAttributeAccess().getLazyLazyKeyword_1_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "lazy", true, "lazy");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:4860:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4860:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:4861:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4861:113: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:4862:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:4865:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:4865:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:4865:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:4865:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:4865:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:4866:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,88,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_transient_3_0, grammarAccess.getMobaDtoAttributeAccess().getTransientTransientKeyword_1_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "transient", true, "transient");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:4883:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4883:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:4884:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:4884:113: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:4885:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:4888:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:4888:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:4888:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:4888:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:4888:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:4889:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,89,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_domainKey_4_0, grammarAccess.getMobaDtoAttributeAccess().getDomainKeyDomainKeyKeyword_1_2_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "domainKey", true, "domainKey");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // InternalMoba.g:4906:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4906:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:4907:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:4907:113: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:4908:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3);
            	    // InternalMoba.g:4911:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:4911:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:4911:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:4911:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:4911:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:4912:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,90,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_domainDescription_5_0, grammarAccess.getMobaDtoAttributeAccess().getDomainDescriptionDomainDescriptionKeyword_1_3_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	      										}
            	      										setWithLastConsumed(current, "domainDescription", true, "domainDescription");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // InternalMoba.g:4929:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:4929:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:4930:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:4930:113: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:4931:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4);
            	    // InternalMoba.g:4934:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:4934:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:4934:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:4934:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaDtoAttributeAccess().getConstraintsKeyword_1_4_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	      								
            	    }
            	    // InternalMoba.g:4942:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:4943:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:4943:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:4944:11: lv_constraints_8_0= ruleMobaConstraint
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_19);
            	    lv_constraints_8_0=ruleMobaConstraint();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // InternalMoba.g:4961:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop77:
            	    do {
            	        int alt77=2;
            	        int LA77_0 = input.LA(1);

            	        if ( (LA77_0==33) ) {
            	            alt77=1;
            	        }


            	        switch (alt77) {
            	    	case 1 :
            	    	    // InternalMoba.g:4962:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaDtoAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:4966:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:4967:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:4967:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:4968:12: lv_constraints_10_0= ruleMobaConstraint
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getConstraintsMobaConstraintParserRuleCall_1_4_3_1_0());
            	    	      											
            	    	    }
            	    	    pushFollow(FOLLOW_19);
            	    	    lv_constraints_10_0=ruleMobaConstraint();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop77;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,34,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_1_4_4());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // InternalMoba.g:4996:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:4996:4: ({...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) ) )
            	    // InternalMoba.g:4997:5: {...}? => ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5)");
            	    }
            	    // InternalMoba.g:4997:113: ( ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) ) )
            	    // InternalMoba.g:4998:6: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 5);
            	    // InternalMoba.g:5001:9: ({...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' ) )
            	    // InternalMoba.g:5001:10: {...}? => (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5001:19: (otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')' )
            	    // InternalMoba.g:5001:20: otherlv_12= 'alias' otherlv_13= '(' ( (lv_alias_14_0= RULE_ID ) ) otherlv_15= ')'
            	    {
            	    otherlv_12=(Token)match(input,93,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getMobaDtoAttributeAccess().getAliasKeyword_1_5_0());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_5_1());
            	      								
            	    }
            	    // InternalMoba.g:5009:9: ( (lv_alias_14_0= RULE_ID ) )
            	    // InternalMoba.g:5010:10: (lv_alias_14_0= RULE_ID )
            	    {
            	    // InternalMoba.g:5010:10: (lv_alias_14_0= RULE_ID )
            	    // InternalMoba.g:5011:11: lv_alias_14_0= RULE_ID
            	    {
            	    lv_alias_14_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_alias_14_0, grammarAccess.getMobaDtoAttributeAccess().getAliasIDTerminalRuleCall_1_5_2_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    otherlv_15=(Token)match(input,34,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_1_5_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5044:3: ( (otherlv_16= RULE_ID ) )
            // InternalMoba.g:5045:4: (otherlv_16= RULE_ID )
            {
            // InternalMoba.g:5045:4: (otherlv_16= RULE_ID )
            // InternalMoba.g:5046:5: otherlv_16= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
              					}
              				
            }
            otherlv_16=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_16, grammarAccess.getMobaDtoAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getMobaMultiplicityAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_MobaMultiplicityAble_17=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_17;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:5068:3: ( (lv_name_18_0= RULE_ID ) )
            // InternalMoba.g:5069:4: (lv_name_18_0= RULE_ID )
            {
            // InternalMoba.g:5069:4: (lv_name_18_0= RULE_ID )
            // InternalMoba.g:5070:5: lv_name_18_0= RULE_ID
            {
            lv_name_18_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_18_0, grammarAccess.getMobaDtoAttributeAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_19=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_19;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaDtoAttribute"


    // $ANTLR start "entryRuleMobaDtoReference"
    // InternalMoba.g:5101:1: entryRuleMobaDtoReference returns [EObject current=null] : iv_ruleMobaDtoReference= ruleMobaDtoReference EOF ;
    public final EObject entryRuleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoReference = null;


        try {
            // InternalMoba.g:5101:57: (iv_ruleMobaDtoReference= ruleMobaDtoReference EOF )
            // InternalMoba.g:5102:2: iv_ruleMobaDtoReference= ruleMobaDtoReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaDtoReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaDtoReference=ruleMobaDtoReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaDtoReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5108:1: ruleMobaDtoReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cascading_2_0=null;
        Token lv_lazy_3_0=null;
        Token lv_transient_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        EObject this_MobaMultiplicityAble_6 = null;

        EObject this_MobaFriendsAble_8 = null;



        	enterRule();

        try {
            // InternalMoba.g:5114:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5115:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5115:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5116:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,91,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoReferenceAccess().getRefKeyword_0());
              		
            }
            // InternalMoba.g:5120:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:5121:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:5121:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:5122:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:5125:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:5126:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:5126:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop79:
            do {
                int alt79=4;
                int LA79_0 = input.LA(1);

                if ( LA79_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt79=1;
                }
                else if ( LA79_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt79=2;
                }
                else if ( LA79_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt79=3;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalMoba.g:5127:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5127:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:5128:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5128:113: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:5129:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:5132:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:5132:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:5132:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:5132:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:5132:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:5133:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,92,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaDtoReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "cascading", true, "cascading");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:5150:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5150:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5151:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5151:113: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5152:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:5155:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:5155:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:5155:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:5155:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5155:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:5156:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,87,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaDtoReferenceAccess().getLazyLazyKeyword_1_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "lazy", true, "lazy");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:5173:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5173:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5174:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5174:113: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5175:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:5178:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:5178:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:5178:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:5178:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:5178:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:5179:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,88,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_transient_4_0, grammarAccess.getMobaDtoReferenceAccess().getTransientTransientKeyword_1_2_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "transient", true, "transient");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5203:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:5204:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:5204:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:5205:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getMobaDtoReferenceAccess().getTypeMobaDtoCrossReference_2_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDtoReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_6;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:5227:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:5228:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:5228:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:5229:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_7_0, grammarAccess.getMobaDtoReferenceAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDtoReferenceAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_8;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaDtoReference"


    // $ANTLR start "entryRuleMobaQueueFeature"
    // InternalMoba.g:5260:1: entryRuleMobaQueueFeature returns [EObject current=null] : iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF ;
    public final EObject entryRuleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueFeature = null;


        try {
            // InternalMoba.g:5260:57: (iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF )
            // InternalMoba.g:5261:2: iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaQueueFeatureRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaQueueFeature=ruleMobaQueueFeature();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaQueueFeature; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5267:1: ruleMobaQueueFeature returns [EObject current=null] : this_MobaQueueReference_0= ruleMobaQueueReference ;
    public final EObject ruleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaQueueReference_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:5273:2: (this_MobaQueueReference_0= ruleMobaQueueReference )
            // InternalMoba.g:5274:2: this_MobaQueueReference_0= ruleMobaQueueReference
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getMobaQueueFeatureAccess().getMobaQueueReferenceParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_MobaQueueReference_0=ruleMobaQueueReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_MobaQueueReference_0;
              		afterParserOrEnumRuleCall();
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaQueueFeature"


    // $ANTLR start "entryRuleMobaQueueReference"
    // InternalMoba.g:5285:1: entryRuleMobaQueueReference returns [EObject current=null] : iv_ruleMobaQueueReference= ruleMobaQueueReference EOF ;
    public final EObject entryRuleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueReference = null;


        try {
            // InternalMoba.g:5285:59: (iv_ruleMobaQueueReference= ruleMobaQueueReference EOF )
            // InternalMoba.g:5286:2: iv_ruleMobaQueueReference= ruleMobaQueueReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaQueueReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaQueueReference=ruleMobaQueueReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaQueueReference; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5292:1: ruleMobaQueueReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cascading_2_0=null;
        Token lv_lazy_3_0=null;
        Token lv_transient_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        EObject this_MobaMultiplicityAble_6 = null;

        EObject this_MobaFriendsAble_8 = null;



        	enterRule();

        try {
            // InternalMoba.g:5298:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5299:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5299:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5300:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,91,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0());
              		
            }
            // InternalMoba.g:5304:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:5305:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:5305:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:5306:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:5309:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:5310:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:5310:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop80:
            do {
                int alt80=4;
                int LA80_0 = input.LA(1);

                if ( LA80_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt80=1;
                }
                else if ( LA80_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt80=2;
                }
                else if ( LA80_0 == 88 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt80=3;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalMoba.g:5311:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5311:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:5312:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5312:115: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:5313:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:5316:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:5316:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:5316:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:5316:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:5316:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:5317:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,92,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaQueueReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "cascading", true, "cascading");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:5334:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5334:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5335:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5335:115: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5336:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:5339:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:5339:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:5339:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:5339:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5339:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:5340:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,87,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaQueueReferenceAccess().getLazyLazyKeyword_1_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "lazy", true, "lazy");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:5357:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5357:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5358:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5358:115: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5359:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:5362:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:5362:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:5362:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:5362:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:5362:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:5363:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,88,FOLLOW_67); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_transient_4_0, grammarAccess.getMobaQueueReferenceAccess().getTransientTransientKeyword_1_2_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "transient", true, "transient");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5387:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:5388:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:5388:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:5389:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getMobaQueueReferenceAccess().getTypeMobaDataCrossReference_2_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaQueueReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_6;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:5411:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:5412:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:5412:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:5413:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_7_0, grammarAccess.getMobaQueueReferenceAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

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


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaQueueReferenceAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_8;
              			afterParserOrEnumRuleCall();
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaQueueReference"


    // $ANTLR start "entryRuleMobaMuliplicity"
    // InternalMoba.g:5444:1: entryRuleMobaMuliplicity returns [EObject current=null] : iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF ;
    public final EObject entryRuleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMuliplicity = null;


        try {
            // InternalMoba.g:5444:56: (iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF )
            // InternalMoba.g:5445:2: iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaMuliplicityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaMuliplicity=ruleMobaMuliplicity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaMuliplicity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5451:1: ruleMobaMuliplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lower_1_0 = null;

        Enumerator lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:5457:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) )
            // InternalMoba.g:5458:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            {
            // InternalMoba.g:5458:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            // InternalMoba.g:5459:3: otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMoba.g:5463:3: ( (lv_lower_1_0= ruleMobaLowerBound ) )
            // InternalMoba.g:5464:4: (lv_lower_1_0= ruleMobaLowerBound )
            {
            // InternalMoba.g:5464:4: (lv_lower_1_0= ruleMobaLowerBound )
            // InternalMoba.g:5465:5: lv_lower_1_0= ruleMobaLowerBound
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_70);
            lv_lower_1_0=ruleMobaLowerBound();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            // InternalMoba.g:5482:3: (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==94) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMoba.g:5483:4: otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    {
                    otherlv_2=(Token)match(input,94,FOLLOW_71); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:5487:4: ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    // InternalMoba.g:5488:5: (lv_upper_3_0= ruleMobaUpperBound )
                    {
                    // InternalMoba.g:5488:5: (lv_upper_3_0= ruleMobaUpperBound )
                    // InternalMoba.g:5489:6: lv_upper_3_0= ruleMobaUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_72);
                    lv_upper_3_0=ruleMobaUpperBound();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }

            otherlv_4=(Token)match(input,64,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMobaMuliplicityAccess().getRightSquareBracketKeyword_3());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaMuliplicity"


    // $ANTLR start "entryRuleMobaConstraint"
    // InternalMoba.g:5515:1: entryRuleMobaConstraint returns [EObject current=null] : iv_ruleMobaConstraint= ruleMobaConstraint EOF ;
    public final EObject entryRuleMobaConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstraint = null;


        try {
            // InternalMoba.g:5515:55: (iv_ruleMobaConstraint= ruleMobaConstraint EOF )
            // InternalMoba.g:5516:2: iv_ruleMobaConstraint= ruleMobaConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaConstraint=ruleMobaConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5522:1: ruleMobaConstraint returns [EObject current=null] : (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) ;
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
            // InternalMoba.g:5528:2: ( (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) )
            // InternalMoba.g:5529:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            {
            // InternalMoba.g:5529:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            int alt82=8;
            switch ( input.LA(1) ) {
            case 95:
                {
                alt82=1;
                }
                break;
            case 96:
                {
                alt82=2;
                }
                break;
            case 97:
                {
                alt82=3;
                }
                break;
            case 98:
                {
                alt82=4;
                }
                break;
            case 99:
                {
                alt82=5;
                }
                break;
            case 100:
                {
                alt82=6;
                }
                break;
            case 101:
                {
                alt82=7;
                }
                break;
            case 102:
                {
                alt82=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // InternalMoba.g:5530:3: this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaRegexpConstraintParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaRegexpConstraint_0=ruleMobaRegexpConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaRegexpConstraint_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:5539:3: this_MobaMinConstraint_1= ruleMobaMinConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaMinConstraintParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaMinConstraint_1=ruleMobaMinConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaMinConstraint_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMoba.g:5548:3: this_MobaMaxConstraint_2= ruleMobaMaxConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaMaxConstraintParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaMaxConstraint_2=ruleMobaMaxConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaMaxConstraint_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMoba.g:5557:3: this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaMinLengthConstraintParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaMinLengthConstraint_3=ruleMobaMinLengthConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaMinLengthConstraint_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMoba.g:5566:3: this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaMaxLengthConstraintParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaMaxLengthConstraint_4=ruleMobaMaxLengthConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaMaxLengthConstraint_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMoba.g:5575:3: this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaDigitsConstraintParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaDigitsConstraint_5=ruleMobaDigitsConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaDigitsConstraint_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMoba.g:5584:3: this_MobaNullConstraint_6= ruleMobaNullConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaNullConstraintParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaNullConstraint_6=ruleMobaNullConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaNullConstraint_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalMoba.g:5593:3: this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaConstraintAccess().getMobaNotNullConstraintParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaNotNullConstraint_7=ruleMobaNotNullConstraint();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaNotNullConstraint_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaConstraint"


    // $ANTLR start "entryRuleMobaRegexpConstraint"
    // InternalMoba.g:5605:1: entryRuleMobaRegexpConstraint returns [EObject current=null] : iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF ;
    public final EObject entryRuleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRegexpConstraint = null;


        try {
            // InternalMoba.g:5605:61: (iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF )
            // InternalMoba.g:5606:2: iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaRegexpConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaRegexpConstraint=ruleMobaRegexpConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaRegexpConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5612:1: ruleMobaRegexpConstraint returns [EObject current=null] : (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:5618:2: ( (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:5619:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:5619:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:5620:3: otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,95,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRegexpConstraintAccess().getRegexpKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaRegexpConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:5628:3: ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==RULE_STRING) ) {
                alt83=1;
            }
            else if ( (LA83_0==RULE_CONSTANT) ) {
                alt83=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }
            switch (alt83) {
                case 1 :
                    // InternalMoba.g:5629:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:5629:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    // InternalMoba.g:5630:5: (lv_filterString_2_0= RULE_STRING )
                    {
                    // InternalMoba.g:5630:5: (lv_filterString_2_0= RULE_STRING )
                    // InternalMoba.g:5631:6: lv_filterString_2_0= RULE_STRING
                    {
                    lv_filterString_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_filterString_2_0, grammarAccess.getMobaRegexpConstraintAccess().getFilterStringSTRINGTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5648:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:5648:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:5649:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:5649:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:5650:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRegexpConstraintRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaRegexpConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaRegexpConstraint"


    // $ANTLR start "entryRuleMobaMinConstraint"
    // InternalMoba.g:5666:1: entryRuleMobaMinConstraint returns [EObject current=null] : iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF ;
    public final EObject entryRuleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinConstraint = null;


        try {
            // InternalMoba.g:5666:58: (iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF )
            // InternalMoba.g:5667:2: iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaMinConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaMinConstraint=ruleMobaMinConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaMinConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5673:1: ruleMobaMinConstraint returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:5679:2: ( (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:5680:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:5680:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:5681:3: otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,96,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMinConstraintAccess().getMinKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMinConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:5689:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==RULE_DOUBLE) ) {
                alt84=1;
            }
            else if ( (LA84_0==RULE_CONSTANT) ) {
                alt84=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 84, 0, input);

                throw nvae;
            }
            switch (alt84) {
                case 1 :
                    // InternalMoba.g:5690:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:5690:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:5691:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:5691:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:5692:6: lv_filterValue_2_0= RULE_DOUBLE
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMinConstraintAccess().getFilterValueDOUBLETerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5709:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:5709:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:5710:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:5710:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:5711:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaMinConstraintRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaMinConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaMinConstraint"


    // $ANTLR start "entryRuleMobaMaxConstraint"
    // InternalMoba.g:5727:1: entryRuleMobaMaxConstraint returns [EObject current=null] : iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF ;
    public final EObject entryRuleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxConstraint = null;


        try {
            // InternalMoba.g:5727:58: (iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF )
            // InternalMoba.g:5728:2: iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaMaxConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaMaxConstraint=ruleMobaMaxConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaMaxConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5734:1: ruleMobaMaxConstraint returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:5740:2: ( (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:5741:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:5741:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:5742:3: otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,97,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMaxConstraintAccess().getMaxKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMaxConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:5750:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==RULE_DOUBLE) ) {
                alt85=1;
            }
            else if ( (LA85_0==RULE_CONSTANT) ) {
                alt85=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 85, 0, input);

                throw nvae;
            }
            switch (alt85) {
                case 1 :
                    // InternalMoba.g:5751:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:5751:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:5752:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:5752:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:5753:6: lv_filterValue_2_0= RULE_DOUBLE
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMaxConstraintAccess().getFilterValueDOUBLETerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5770:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:5770:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:5771:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:5771:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:5772:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaMaxConstraintRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaMaxConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaMaxConstraint"


    // $ANTLR start "entryRuleMobaMinLengthConstraint"
    // InternalMoba.g:5788:1: entryRuleMobaMinLengthConstraint returns [EObject current=null] : iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF ;
    public final EObject entryRuleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinLengthConstraint = null;


        try {
            // InternalMoba.g:5788:64: (iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF )
            // InternalMoba.g:5789:2: iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaMinLengthConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaMinLengthConstraint=ruleMobaMinLengthConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaMinLengthConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5795:1: ruleMobaMinLengthConstraint returns [EObject current=null] : (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:5801:2: ( (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:5802:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:5802:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:5803:3: otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,98,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMinLengthConstraintAccess().getMinLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMinLengthConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:5811:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==RULE_INT) ) {
                alt86=1;
            }
            else if ( (LA86_0==RULE_CONSTANT) ) {
                alt86=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }
            switch (alt86) {
                case 1 :
                    // InternalMoba.g:5812:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:5812:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:5813:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:5813:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:5814:6: lv_filterValue_2_0= RULE_INT
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMinLengthConstraintAccess().getFilterValueINTTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5831:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:5831:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:5832:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:5832:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:5833:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaMinLengthConstraintRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaMinLengthConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaMinLengthConstraint"


    // $ANTLR start "entryRuleMobaMaxLengthConstraint"
    // InternalMoba.g:5849:1: entryRuleMobaMaxLengthConstraint returns [EObject current=null] : iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF ;
    public final EObject entryRuleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxLengthConstraint = null;


        try {
            // InternalMoba.g:5849:64: (iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF )
            // InternalMoba.g:5850:2: iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaMaxLengthConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaMaxLengthConstraint=ruleMobaMaxLengthConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaMaxLengthConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5856:1: ruleMobaMaxLengthConstraint returns [EObject current=null] : (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:5862:2: ( (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:5863:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:5863:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:5864:3: otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,99,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMaxLengthConstraintAccess().getMaxLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMaxLengthConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:5872:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==RULE_INT) ) {
                alt87=1;
            }
            else if ( (LA87_0==RULE_CONSTANT) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }
            switch (alt87) {
                case 1 :
                    // InternalMoba.g:5873:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:5873:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:5874:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:5874:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:5875:6: lv_filterValue_2_0= RULE_INT
                    {
                    lv_filterValue_2_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_filterValue_2_0, grammarAccess.getMobaMaxLengthConstraintAccess().getFilterValueINTTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5892:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:5892:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:5893:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:5893:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:5894:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaMaxLengthConstraintRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaMaxLengthConstraintAccess().getFilterConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaMaxLengthConstraint"


    // $ANTLR start "entryRuleMobaDigitsConstraint"
    // InternalMoba.g:5910:1: entryRuleMobaDigitsConstraint returns [EObject current=null] : iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF ;
    public final EObject entryRuleMobaDigitsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDigitsConstraint = null;


        try {
            // InternalMoba.g:5910:61: (iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF )
            // InternalMoba.g:5911:2: iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaDigitsConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaDigitsConstraint=ruleMobaDigitsConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaDigitsConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:5917:1: ruleMobaDigitsConstraint returns [EObject current=null] : (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:5923:2: ( (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' ) )
            // InternalMoba.g:5924:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:5924:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )
            // InternalMoba.g:5925:3: otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,100,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDigitsConstraintAccess().getDigitsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,32,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaDigitsConstraintAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMoba.g:5933:3: ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt88=2;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==RULE_INT) ) {
                alt88=1;
            }
            else if ( (LA88_0==RULE_CONSTANT) ) {
                alt88=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }
            switch (alt88) {
                case 1 :
                    // InternalMoba.g:5934:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:5934:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    // InternalMoba.g:5935:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:5935:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    // InternalMoba.g:5936:6: lv_filterIntegerValue_2_0= RULE_INT
                    {
                    lv_filterIntegerValue_2_0=(Token)match(input,RULE_INT,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_filterIntegerValue_2_0, grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerValueINTTerminalRuleCall_2_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5953:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:5953:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:5954:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:5954:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:5955:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_35); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaDigitsConstraintAccess().getFilterIntegerConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,33,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMobaDigitsConstraintAccess().getCommaKeyword_3());
              		
            }
            // InternalMoba.g:5971:3: ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) )
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==RULE_INT) ) {
                alt89=1;
            }
            else if ( (LA89_0==RULE_CONSTANT) ) {
                alt89=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;
            }
            switch (alt89) {
                case 1 :
                    // InternalMoba.g:5972:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    {
                    // InternalMoba.g:5972:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    // InternalMoba.g:5973:5: (lv_filterFractionValue_5_0= RULE_INT )
                    {
                    // InternalMoba.g:5973:5: (lv_filterFractionValue_5_0= RULE_INT )
                    // InternalMoba.g:5974:6: lv_filterFractionValue_5_0= RULE_INT
                    {
                    lv_filterFractionValue_5_0=(Token)match(input,RULE_INT,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_filterFractionValue_5_0, grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionValueINTTerminalRuleCall_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

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


                    }
                    break;
                case 2 :
                    // InternalMoba.g:5991:4: ( (otherlv_6= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:5991:4: ( (otherlv_6= RULE_CONSTANT ) )
                    // InternalMoba.g:5992:5: (otherlv_6= RULE_CONSTANT )
                    {
                    // InternalMoba.g:5992:5: (otherlv_6= RULE_CONSTANT )
                    // InternalMoba.g:5993:6: otherlv_6= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaDigitsConstraintRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_CONSTANT,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getMobaDigitsConstraintAccess().getFilterFractionConstMobaConstantCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaDigitsConstraintAccess().getRightParenthesisKeyword_5());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaDigitsConstraint"


    // $ANTLR start "entryRuleMobaNullConstraint"
    // InternalMoba.g:6013:1: entryRuleMobaNullConstraint returns [EObject current=null] : iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF ;
    public final EObject entryRuleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNullConstraint = null;


        try {
            // InternalMoba.g:6013:59: (iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF )
            // InternalMoba.g:6014:2: iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaNullConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaNullConstraint=ruleMobaNullConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaNullConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:6020:1: ruleMobaNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNull' ) ;
    public final EObject ruleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:6026:2: ( ( () otherlv_1= 'isNull' ) )
            // InternalMoba.g:6027:2: ( () otherlv_1= 'isNull' )
            {
            // InternalMoba.g:6027:2: ( () otherlv_1= 'isNull' )
            // InternalMoba.g:6028:3: () otherlv_1= 'isNull'
            {
            // InternalMoba.g:6028:3: ()
            // InternalMoba.g:6029:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaNullConstraintAccess().getMobaNullConstraintAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,101,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaNullConstraintAccess().getIsNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaNullConstraint"


    // $ANTLR start "entryRuleMobaNotNullConstraint"
    // InternalMoba.g:6043:1: entryRuleMobaNotNullConstraint returns [EObject current=null] : iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF ;
    public final EObject entryRuleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNotNullConstraint = null;


        try {
            // InternalMoba.g:6043:62: (iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF )
            // InternalMoba.g:6044:2: iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaNotNullConstraintRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaNotNullConstraint=ruleMobaNotNullConstraint();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaNotNullConstraint; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // InternalMoba.g:6050:1: ruleMobaNotNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNotNull' ) ;
    public final EObject ruleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:6056:2: ( ( () otherlv_1= 'isNotNull' ) )
            // InternalMoba.g:6057:2: ( () otherlv_1= 'isNotNull' )
            {
            // InternalMoba.g:6057:2: ( () otherlv_1= 'isNotNull' )
            // InternalMoba.g:6058:3: () otherlv_1= 'isNotNull'
            {
            // InternalMoba.g:6058:3: ()
            // InternalMoba.g:6059:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaNotNullConstraintAccess().getMobaNotNullConstraintAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,102,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaNotNullConstraintAccess().getIsNotNullKeyword_1());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaNotNullConstraint"


    // $ANTLR start "entryRuleMobaGeneratorSlot"
    // InternalMoba.g:6073:1: entryRuleMobaGeneratorSlot returns [EObject current=null] : iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF ;
    public final EObject entryRuleMobaGeneratorSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorSlot = null;


        try {
            // InternalMoba.g:6073:58: (iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF )
            // InternalMoba.g:6074:2: iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaGeneratorSlotRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeneratorSlot=ruleMobaGeneratorSlot();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaGeneratorSlot; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaGeneratorSlot"


    // $ANTLR start "ruleMobaGeneratorSlot"
    // InternalMoba.g:6080:1: ruleMobaGeneratorSlot returns [EObject current=null] : (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleMobaGeneratorSlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6086:2: ( (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? ) )
            // InternalMoba.g:6087:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? )
            {
            // InternalMoba.g:6087:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? )
            // InternalMoba.g:6088:3: otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,103,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorSlotAccess().getSlotKeyword_0());
              		
            }
            // InternalMoba.g:6092:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6093:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6093:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6094:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaGeneratorSlotAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaGeneratorSlotRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            // InternalMoba.g:6110:3: (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==67) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalMoba.g:6111:4: otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaGeneratorSlotAccess().getTypeKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:6115:4: ( (lv_type_3_0= RULE_STRING ) )
                    // InternalMoba.g:6116:5: (lv_type_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:6116:5: (lv_type_3_0= RULE_STRING )
                    // InternalMoba.g:6117:6: lv_type_3_0= RULE_STRING
                    {
                    lv_type_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_3_0, grammarAccess.getMobaGeneratorSlotAccess().getTypeSTRINGTerminalRuleCall_2_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaGeneratorSlotRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"type",
                      							lv_type_3_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaGeneratorSlot"


    // $ANTLR start "entryRuleMobaTrigger"
    // InternalMoba.g:6138:1: entryRuleMobaTrigger returns [EObject current=null] : iv_ruleMobaTrigger= ruleMobaTrigger EOF ;
    public final EObject entryRuleMobaTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTrigger = null;


        try {
            // InternalMoba.g:6138:52: (iv_ruleMobaTrigger= ruleMobaTrigger EOF )
            // InternalMoba.g:6139:2: iv_ruleMobaTrigger= ruleMobaTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaTrigger=ruleMobaTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaTrigger"


    // $ANTLR start "ruleMobaTrigger"
    // InternalMoba.g:6145:1: ruleMobaTrigger returns [EObject current=null] : (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger ) ;
    public final EObject ruleMobaTrigger() throws RecognitionException {
        EObject current = null;

        EObject this_MobaAppInstallTrigger_0 = null;

        EObject this_MobaAppUpdateTrigger_1 = null;

        EObject this_MobaEmailTrigger_2 = null;

        EObject this_MobaDeviceStartupTrigger_3 = null;

        EObject this_MobaSMSTrigger_4 = null;

        EObject this_MobaPushTrigger_5 = null;

        EObject this_MobaGeofenceTrigger_6 = null;



        	enterRule();

        try {
            // InternalMoba.g:6151:2: ( (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger ) )
            // InternalMoba.g:6152:2: (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger )
            {
            // InternalMoba.g:6152:2: (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger )
            int alt91=7;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt91=1;
                }
                break;
            case 105:
                {
                alt91=2;
                }
                break;
            case 106:
                {
                alt91=3;
                }
                break;
            case 107:
                {
                alt91=4;
                }
                break;
            case 108:
                {
                alt91=5;
                }
                break;
            case 109:
                {
                alt91=6;
                }
                break;
            case 110:
                {
                alt91=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 91, 0, input);

                throw nvae;
            }

            switch (alt91) {
                case 1 :
                    // InternalMoba.g:6153:3: this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaAppInstallTriggerParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaAppInstallTrigger_0=ruleMobaAppInstallTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaAppInstallTrigger_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:6162:3: this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaAppUpdateTriggerParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaAppUpdateTrigger_1=ruleMobaAppUpdateTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaAppUpdateTrigger_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMoba.g:6171:3: this_MobaEmailTrigger_2= ruleMobaEmailTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaEmailTriggerParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaEmailTrigger_2=ruleMobaEmailTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaEmailTrigger_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalMoba.g:6180:3: this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaDeviceStartupTriggerParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaDeviceStartupTrigger_3=ruleMobaDeviceStartupTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaDeviceStartupTrigger_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalMoba.g:6189:3: this_MobaSMSTrigger_4= ruleMobaSMSTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaSMSTriggerParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaSMSTrigger_4=ruleMobaSMSTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaSMSTrigger_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalMoba.g:6198:3: this_MobaPushTrigger_5= ruleMobaPushTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaPushTriggerParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaPushTrigger_5=ruleMobaPushTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaPushTrigger_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalMoba.g:6207:3: this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaTriggerAccess().getMobaGeofenceTriggerParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaGeofenceTrigger_6=ruleMobaGeofenceTrigger();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaGeofenceTrigger_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaTrigger"


    // $ANTLR start "entryRuleMobaAppInstallTrigger"
    // InternalMoba.g:6219:1: entryRuleMobaAppInstallTrigger returns [EObject current=null] : iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF ;
    public final EObject entryRuleMobaAppInstallTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAppInstallTrigger = null;


        try {
            // InternalMoba.g:6219:62: (iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF )
            // InternalMoba.g:6220:2: iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaAppInstallTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaAppInstallTrigger=ruleMobaAppInstallTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaAppInstallTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaAppInstallTrigger"


    // $ANTLR start "ruleMobaAppInstallTrigger"
    // InternalMoba.g:6226:1: ruleMobaAppInstallTrigger returns [EObject current=null] : (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaAppInstallTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6232:2: ( (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:6233:2: (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:6233:2: (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:6234:3: otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,104,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaAppInstallTriggerAccess().getTriggerAppInstallKeyword_0());
              		
            }
            // InternalMoba.g:6238:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6239:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6239:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6240:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaAppInstallTriggerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaAppInstallTriggerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaAppInstallTrigger"


    // $ANTLR start "entryRuleMobaAppUpdateTrigger"
    // InternalMoba.g:6260:1: entryRuleMobaAppUpdateTrigger returns [EObject current=null] : iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF ;
    public final EObject entryRuleMobaAppUpdateTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAppUpdateTrigger = null;


        try {
            // InternalMoba.g:6260:61: (iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF )
            // InternalMoba.g:6261:2: iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaAppUpdateTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaAppUpdateTrigger=ruleMobaAppUpdateTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaAppUpdateTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaAppUpdateTrigger"


    // $ANTLR start "ruleMobaAppUpdateTrigger"
    // InternalMoba.g:6267:1: ruleMobaAppUpdateTrigger returns [EObject current=null] : (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaAppUpdateTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6273:2: ( (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:6274:2: (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:6274:2: (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:6275:3: otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,105,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaAppUpdateTriggerAccess().getTriggerAppUpdateKeyword_0());
              		
            }
            // InternalMoba.g:6279:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6280:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6280:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6281:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaAppUpdateTriggerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaAppUpdateTriggerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaAppUpdateTrigger"


    // $ANTLR start "entryRuleMobaEmailTrigger"
    // InternalMoba.g:6301:1: entryRuleMobaEmailTrigger returns [EObject current=null] : iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF ;
    public final EObject entryRuleMobaEmailTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEmailTrigger = null;


        try {
            // InternalMoba.g:6301:57: (iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF )
            // InternalMoba.g:6302:2: iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaEmailTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaEmailTrigger=ruleMobaEmailTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaEmailTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaEmailTrigger"


    // $ANTLR start "ruleMobaEmailTrigger"
    // InternalMoba.g:6308:1: ruleMobaEmailTrigger returns [EObject current=null] : (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaEmailTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6314:2: ( (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:6315:2: (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:6315:2: (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:6316:3: otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEmailTriggerAccess().getTriggerEmailKeyword_0());
              		
            }
            // InternalMoba.g:6320:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6321:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6321:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6322:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaEmailTriggerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEmailTriggerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaEmailTrigger"


    // $ANTLR start "entryRuleMobaDeviceStartupTrigger"
    // InternalMoba.g:6342:1: entryRuleMobaDeviceStartupTrigger returns [EObject current=null] : iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF ;
    public final EObject entryRuleMobaDeviceStartupTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDeviceStartupTrigger = null;


        try {
            // InternalMoba.g:6342:65: (iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF )
            // InternalMoba.g:6343:2: iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaDeviceStartupTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaDeviceStartupTrigger=ruleMobaDeviceStartupTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaDeviceStartupTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaDeviceStartupTrigger"


    // $ANTLR start "ruleMobaDeviceStartupTrigger"
    // InternalMoba.g:6349:1: ruleMobaDeviceStartupTrigger returns [EObject current=null] : (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaDeviceStartupTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6355:2: ( (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:6356:2: (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:6356:2: (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:6357:3: otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDeviceStartupTriggerAccess().getTriggerDeviceStartKeyword_0());
              		
            }
            // InternalMoba.g:6361:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6362:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6362:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6363:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaDeviceStartupTriggerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDeviceStartupTriggerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaDeviceStartupTrigger"


    // $ANTLR start "entryRuleMobaSMSTrigger"
    // InternalMoba.g:6383:1: entryRuleMobaSMSTrigger returns [EObject current=null] : iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF ;
    public final EObject entryRuleMobaSMSTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSMSTrigger = null;


        try {
            // InternalMoba.g:6383:55: (iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF )
            // InternalMoba.g:6384:2: iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaSMSTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaSMSTrigger=ruleMobaSMSTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaSMSTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaSMSTrigger"


    // $ANTLR start "ruleMobaSMSTrigger"
    // InternalMoba.g:6390:1: ruleMobaSMSTrigger returns [EObject current=null] : (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaSMSTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6396:2: ( (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:6397:2: (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:6397:2: (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:6398:3: otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaSMSTriggerAccess().getTriggerSmsKeyword_0());
              		
            }
            // InternalMoba.g:6402:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6403:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6403:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6404:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaSMSTriggerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaSMSTriggerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaSMSTrigger"


    // $ANTLR start "entryRuleMobaPushTrigger"
    // InternalMoba.g:6424:1: entryRuleMobaPushTrigger returns [EObject current=null] : iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF ;
    public final EObject entryRuleMobaPushTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPushTrigger = null;


        try {
            // InternalMoba.g:6424:56: (iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF )
            // InternalMoba.g:6425:2: iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaPushTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaPushTrigger=ruleMobaPushTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaPushTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaPushTrigger"


    // $ANTLR start "ruleMobaPushTrigger"
    // InternalMoba.g:6431:1: ruleMobaPushTrigger returns [EObject current=null] : (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaPushTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6437:2: ( (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:6438:2: (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:6438:2: (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:6439:3: otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,109,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaPushTriggerAccess().getTriggerPushKeyword_0());
              		
            }
            // InternalMoba.g:6443:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6444:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6444:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6445:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaPushTriggerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaPushTriggerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaPushTrigger"


    // $ANTLR start "entryRuleMobaGeofenceTrigger"
    // InternalMoba.g:6465:1: entryRuleMobaGeofenceTrigger returns [EObject current=null] : iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF ;
    public final EObject entryRuleMobaGeofenceTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeofenceTrigger = null;


        try {
            // InternalMoba.g:6465:60: (iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF )
            // InternalMoba.g:6466:2: iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaGeofenceTriggerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaGeofenceTrigger=ruleMobaGeofenceTrigger();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaGeofenceTrigger; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaGeofenceTrigger"


    // $ANTLR start "ruleMobaGeofenceTrigger"
    // InternalMoba.g:6472:1: ruleMobaGeofenceTrigger returns [EObject current=null] : (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) ) ;
    public final EObject ruleMobaGeofenceTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_eventType_4_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:6478:2: ( (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) ) )
            // InternalMoba.g:6479:2: (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) )
            {
            // InternalMoba.g:6479:2: (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) )
            // InternalMoba.g:6480:3: otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeofenceTriggerAccess().getTriggerGeofenceKeyword_0());
              		
            }
            // InternalMoba.g:6484:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6485:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6485:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6486:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaGeofenceTriggerAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaGeofenceTriggerRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,111,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaGeofenceTriggerAccess().getEventKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaGeofenceTriggerAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:6510:3: ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) )
            // InternalMoba.g:6511:4: (lv_eventType_4_0= ruleMobaGeofenceEvent )
            {
            // InternalMoba.g:6511:4: (lv_eventType_4_0= ruleMobaGeofenceEvent )
            // InternalMoba.g:6512:5: lv_eventType_4_0= ruleMobaGeofenceEvent
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMobaGeofenceTriggerAccess().getEventTypeMobaGeofenceEventEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_eventType_4_0=ruleMobaGeofenceEvent();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMobaGeofenceTriggerRule());
              					}
              					set(
              						current,
              						"eventType",
              						lv_eventType_4_0,
              						"org.mobadsl.grammar.Moba.MobaGeofenceEvent");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaGeofenceTrigger"


    // $ANTLR start "entryRuleMobaExternalModule"
    // InternalMoba.g:6533:1: entryRuleMobaExternalModule returns [EObject current=null] : iv_ruleMobaExternalModule= ruleMobaExternalModule EOF ;
    public final EObject entryRuleMobaExternalModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaExternalModule = null;


        try {
            // InternalMoba.g:6533:59: (iv_ruleMobaExternalModule= ruleMobaExternalModule EOF )
            // InternalMoba.g:6534:2: iv_ruleMobaExternalModule= ruleMobaExternalModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaExternalModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaExternalModule=ruleMobaExternalModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaExternalModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaExternalModule"


    // $ANTLR start "ruleMobaExternalModule"
    // InternalMoba.g:6540:1: ruleMobaExternalModule returns [EObject current=null] : (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule ) ;
    public final EObject ruleMobaExternalModule() throws RecognitionException {
        EObject current = null;

        EObject this_MobaBluetoothModule_0 = null;

        EObject this_MobaPushModule_1 = null;

        EObject this_MobaNFCModule_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:6546:2: ( (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule ) )
            // InternalMoba.g:6547:2: (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule )
            {
            // InternalMoba.g:6547:2: (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule )
            int alt92=3;
            switch ( input.LA(1) ) {
            case 112:
                {
                alt92=1;
                }
                break;
            case 113:
                {
                alt92=2;
                }
                break;
            case 114:
                {
                alt92=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // InternalMoba.g:6548:3: this_MobaBluetoothModule_0= ruleMobaBluetoothModule
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaExternalModuleAccess().getMobaBluetoothModuleParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaBluetoothModule_0=ruleMobaBluetoothModule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaBluetoothModule_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalMoba.g:6557:3: this_MobaPushModule_1= ruleMobaPushModule
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaExternalModuleAccess().getMobaPushModuleParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaPushModule_1=ruleMobaPushModule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaPushModule_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalMoba.g:6566:3: this_MobaNFCModule_2= ruleMobaNFCModule
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaExternalModuleAccess().getMobaNFCModuleParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaNFCModule_2=ruleMobaNFCModule();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaNFCModule_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaExternalModule"


    // $ANTLR start "entryRuleMobaBluetoothModule"
    // InternalMoba.g:6578:1: entryRuleMobaBluetoothModule returns [EObject current=null] : iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF ;
    public final EObject entryRuleMobaBluetoothModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaBluetoothModule = null;


        try {
            // InternalMoba.g:6578:60: (iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF )
            // InternalMoba.g:6579:2: iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaBluetoothModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaBluetoothModule=ruleMobaBluetoothModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaBluetoothModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaBluetoothModule"


    // $ANTLR start "ruleMobaBluetoothModule"
    // InternalMoba.g:6585:1: ruleMobaBluetoothModule returns [EObject current=null] : (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) ) ;
    public final EObject ruleMobaBluetoothModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:6591:2: ( (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) ) )
            // InternalMoba.g:6592:2: (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) )
            {
            // InternalMoba.g:6592:2: (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) )
            // InternalMoba.g:6593:3: otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) )
            {
            otherlv_0=(Token)match(input,112,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaBluetoothModuleAccess().getModuleBluetoothKeyword_0());
              		
            }
            // InternalMoba.g:6597:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6598:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6598:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6599:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaBluetoothModuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaBluetoothModuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaBluetoothModuleAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaBluetoothModuleAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:6623:3: ( (lv_type_4_0= ruleMobaBlueToothModuleType ) )
            // InternalMoba.g:6624:4: (lv_type_4_0= ruleMobaBlueToothModuleType )
            {
            // InternalMoba.g:6624:4: (lv_type_4_0= ruleMobaBlueToothModuleType )
            // InternalMoba.g:6625:5: lv_type_4_0= ruleMobaBlueToothModuleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMobaBluetoothModuleAccess().getTypeMobaBlueToothModuleTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleMobaBlueToothModuleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMobaBluetoothModuleRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"org.mobadsl.grammar.Moba.MobaBlueToothModuleType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaBluetoothModule"


    // $ANTLR start "entryRuleMobaPushModule"
    // InternalMoba.g:6646:1: entryRuleMobaPushModule returns [EObject current=null] : iv_ruleMobaPushModule= ruleMobaPushModule EOF ;
    public final EObject entryRuleMobaPushModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPushModule = null;


        try {
            // InternalMoba.g:6646:55: (iv_ruleMobaPushModule= ruleMobaPushModule EOF )
            // InternalMoba.g:6647:2: iv_ruleMobaPushModule= ruleMobaPushModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaPushModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaPushModule=ruleMobaPushModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaPushModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaPushModule"


    // $ANTLR start "ruleMobaPushModule"
    // InternalMoba.g:6653:1: ruleMobaPushModule returns [EObject current=null] : (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaPushModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6659:2: ( (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:6660:2: (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:6660:2: (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:6661:3: otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,113,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaPushModuleAccess().getModulePushKeyword_0());
              		
            }
            // InternalMoba.g:6665:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6666:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6666:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6667:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaPushModuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaPushModuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaPushModule"


    // $ANTLR start "entryRuleMobaNFCModule"
    // InternalMoba.g:6687:1: entryRuleMobaNFCModule returns [EObject current=null] : iv_ruleMobaNFCModule= ruleMobaNFCModule EOF ;
    public final EObject entryRuleMobaNFCModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNFCModule = null;


        try {
            // InternalMoba.g:6687:54: (iv_ruleMobaNFCModule= ruleMobaNFCModule EOF )
            // InternalMoba.g:6688:2: iv_ruleMobaNFCModule= ruleMobaNFCModule EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaNFCModuleRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaNFCModule=ruleMobaNFCModule();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaNFCModule; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

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
    // $ANTLR end "entryRuleMobaNFCModule"


    // $ANTLR start "ruleMobaNFCModule"
    // InternalMoba.g:6694:1: ruleMobaNFCModule returns [EObject current=null] : (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) ) ;
    public final EObject ruleMobaNFCModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:6700:2: ( (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) ) )
            // InternalMoba.g:6701:2: (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) )
            {
            // InternalMoba.g:6701:2: (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) )
            // InternalMoba.g:6702:3: otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) )
            {
            otherlv_0=(Token)match(input,114,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaNFCModuleAccess().getModuleNFCKeyword_0());
              		
            }
            // InternalMoba.g:6706:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6707:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6707:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6708:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaNFCModuleAccess().getNameIDTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaNFCModuleRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_1_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            otherlv_2=(Token)match(input,67,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaNFCModuleAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_80); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaNFCModuleAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:6732:3: ( (lv_type_4_0= ruleMobaNFCModuleType ) )
            // InternalMoba.g:6733:4: (lv_type_4_0= ruleMobaNFCModuleType )
            {
            // InternalMoba.g:6733:4: (lv_type_4_0= ruleMobaNFCModuleType )
            // InternalMoba.g:6734:5: lv_type_4_0= ruleMobaNFCModuleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMobaNFCModuleAccess().getTypeMobaNFCModuleTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleMobaNFCModuleType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getMobaNFCModuleRule());
              					}
              					set(
              						current,
              						"type",
              						lv_type_4_0,
              						"org.mobadsl.grammar.Moba.MobaNFCModuleType");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaNFCModule"


    // $ANTLR start "ruleMobaConstantValueFunction"
    // InternalMoba.g:6755:1: ruleMobaConstantValueFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) ) ;
    public final Enumerator ruleMobaConstantValueFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6761:2: ( ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) ) )
            // InternalMoba.g:6762:2: ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) )
            {
            // InternalMoba.g:6762:2: ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) )
            int alt93=4;
            switch ( input.LA(1) ) {
            case 115:
                {
                alt93=1;
                }
                break;
            case 116:
                {
                alt93=2;
                }
                break;
            case 117:
                {
                alt93=3;
                }
                break;
            case 118:
                {
                alt93=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 93, 0, input);

                throw nvae;
            }

            switch (alt93) {
                case 1 :
                    // InternalMoba.g:6763:3: (enumLiteral_0= 'toFirstLower' )
                    {
                    // InternalMoba.g:6763:3: (enumLiteral_0= 'toFirstLower' )
                    // InternalMoba.g:6764:4: enumLiteral_0= 'toFirstLower'
                    {
                    enumLiteral_0=(Token)match(input,115,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_LOWER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_LOWER_CASEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:6771:3: (enumLiteral_1= 'toFirstUpper' )
                    {
                    // InternalMoba.g:6771:3: (enumLiteral_1= 'toFirstUpper' )
                    // InternalMoba.g:6772:4: enumLiteral_1= 'toFirstUpper'
                    {
                    enumLiteral_1=(Token)match(input,116,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_UPPER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_UPPER_CASEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:6779:3: (enumLiteral_2= 'toLowerCase' )
                    {
                    // InternalMoba.g:6779:3: (enumLiteral_2= 'toLowerCase' )
                    // InternalMoba.g:6780:4: enumLiteral_2= 'toLowerCase'
                    {
                    enumLiteral_2=(Token)match(input,117,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_LOWER_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaConstantValueFunctionAccess().getTO_LOWER_CASEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:6787:3: (enumLiteral_3= 'toUpperCase' )
                    {
                    // InternalMoba.g:6787:3: (enumLiteral_3= 'toUpperCase' )
                    // InternalMoba.g:6788:4: enumLiteral_3= 'toUpperCase'
                    {
                    enumLiteral_3=(Token)match(input,118,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_UPPER_CASEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getMobaConstantValueFunctionAccess().getTO_UPPER_CASEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaConstantValueFunction"


    // $ANTLR start "ruleMobaGeofenceEvent"
    // InternalMoba.g:6798:1: ruleMobaGeofenceEvent returns [Enumerator current=null] : ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) ) ;
    public final Enumerator ruleMobaGeofenceEvent() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:6804:2: ( ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) ) )
            // InternalMoba.g:6805:2: ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) )
            {
            // InternalMoba.g:6805:2: ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==119) ) {
                alt94=1;
            }
            else if ( (LA94_0==120) ) {
                alt94=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // InternalMoba.g:6806:3: (enumLiteral_0= 'enter' )
                    {
                    // InternalMoba.g:6806:3: (enumLiteral_0= 'enter' )
                    // InternalMoba.g:6807:4: enumLiteral_0= 'enter'
                    {
                    enumLiteral_0=(Token)match(input,119,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaGeofenceEventAccess().getENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaGeofenceEventAccess().getENTEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:6814:3: (enumLiteral_1= 'leave' )
                    {
                    // InternalMoba.g:6814:3: (enumLiteral_1= 'leave' )
                    // InternalMoba.g:6815:4: enumLiteral_1= 'leave'
                    {
                    enumLiteral_1=(Token)match(input,120,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaGeofenceEventAccess().getLEAVEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaGeofenceEventAccess().getLEAVEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaGeofenceEvent"


    // $ANTLR start "ruleMobaBlueToothModuleType"
    // InternalMoba.g:6825:1: ruleMobaBlueToothModuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'low energy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) ) ;
    public final Enumerator ruleMobaBlueToothModuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMoba.g:6831:2: ( ( (enumLiteral_0= 'low energy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) ) )
            // InternalMoba.g:6832:2: ( (enumLiteral_0= 'low energy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) )
            {
            // InternalMoba.g:6832:2: ( (enumLiteral_0= 'low energy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) )
            int alt95=3;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt95=1;
                }
                break;
            case 122:
                {
                alt95=2;
                }
                break;
            case 123:
                {
                alt95=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }

            switch (alt95) {
                case 1 :
                    // InternalMoba.g:6833:3: (enumLiteral_0= 'low energy' )
                    {
                    // InternalMoba.g:6833:3: (enumLiteral_0= 'low energy' )
                    // InternalMoba.g:6834:4: enumLiteral_0= 'low energy'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaBlueToothModuleTypeAccess().getLEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:6841:3: (enumLiteral_1= 'spp' )
                    {
                    // InternalMoba.g:6841:3: (enumLiteral_1= 'spp' )
                    // InternalMoba.g:6842:4: enumLiteral_1= 'spp'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getSPPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaBlueToothModuleTypeAccess().getSPPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:6849:3: (enumLiteral_2= 'beacon' )
                    {
                    // InternalMoba.g:6849:3: (enumLiteral_2= 'beacon' )
                    // InternalMoba.g:6850:4: enumLiteral_2= 'beacon'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getBEACONEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaBlueToothModuleTypeAccess().getBEACONEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaBlueToothModuleType"


    // $ANTLR start "ruleMobaNFCModuleType"
    // InternalMoba.g:6860:1: ruleMobaNFCModuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) ) ;
    public final Enumerator ruleMobaNFCModuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMoba.g:6866:2: ( ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) ) )
            // InternalMoba.g:6867:2: ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) )
            {
            // InternalMoba.g:6867:2: ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) )
            int alt96=3;
            switch ( input.LA(1) ) {
            case 124:
                {
                alt96=1;
                }
                break;
            case 125:
                {
                alt96=2;
                }
                break;
            case 126:
                {
                alt96=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;
            }

            switch (alt96) {
                case 1 :
                    // InternalMoba.g:6868:3: (enumLiteral_0= 'id' )
                    {
                    // InternalMoba.g:6868:3: (enumLiteral_0= 'id' )
                    // InternalMoba.g:6869:4: enumLiteral_0= 'id'
                    {
                    enumLiteral_0=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaNFCModuleTypeAccess().getIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaNFCModuleTypeAccess().getIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:6876:3: (enumLiteral_1= 'custom' )
                    {
                    // InternalMoba.g:6876:3: (enumLiteral_1= 'custom' )
                    // InternalMoba.g:6877:4: enumLiteral_1= 'custom'
                    {
                    enumLiteral_1=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaNFCModuleTypeAccess().getCUSTOMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaNFCModuleTypeAccess().getCUSTOMEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:6884:3: (enumLiteral_2= 'text' )
                    {
                    // InternalMoba.g:6884:3: (enumLiteral_2= 'text' )
                    // InternalMoba.g:6885:4: enumLiteral_2= 'text'
                    {
                    enumLiteral_2=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaNFCModuleTypeAccess().getTEXTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaNFCModuleTypeAccess().getTEXTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaNFCModuleType"


    // $ANTLR start "ruleMobaLowerBound"
    // InternalMoba.g:6895:1: ruleMobaLowerBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) ;
    public final Enumerator ruleMobaLowerBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMoba.g:6901:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) )
            // InternalMoba.g:6902:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            {
            // InternalMoba.g:6902:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            int alt97=5;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt97=1;
                }
                break;
            case 128:
                {
                alt97=2;
                }
                break;
            case 129:
                {
                alt97=3;
                }
                break;
            case 61:
                {
                alt97=4;
                }
                break;
            case 130:
                {
                alt97=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 97, 0, input);

                throw nvae;
            }

            switch (alt97) {
                case 1 :
                    // InternalMoba.g:6903:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:6903:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:6904:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:6911:3: (enumLiteral_1= '0' )
                    {
                    // InternalMoba.g:6911:3: (enumLiteral_1= '0' )
                    // InternalMoba.g:6912:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:6919:3: (enumLiteral_2= '?' )
                    {
                    // InternalMoba.g:6919:3: (enumLiteral_2= '?' )
                    // InternalMoba.g:6920:4: enumLiteral_2= '?'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:6927:3: (enumLiteral_3= '+' )
                    {
                    // InternalMoba.g:6927:3: (enumLiteral_3= '+' )
                    // InternalMoba.g:6928:4: enumLiteral_3= '+'
                    {
                    enumLiteral_3=(Token)match(input,61,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:6935:3: (enumLiteral_4= '1' )
                    {
                    // InternalMoba.g:6935:3: (enumLiteral_4= '1' )
                    // InternalMoba.g:6936:4: enumLiteral_4= '1'
                    {
                    enumLiteral_4=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getONEEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_4, grammarAccess.getMobaLowerBoundAccess().getONEEnumLiteralDeclaration_4());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaLowerBound"


    // $ANTLR start "ruleMobaUpperBound"
    // InternalMoba.g:6946:1: ruleMobaUpperBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) ;
    public final Enumerator ruleMobaUpperBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:6952:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) )
            // InternalMoba.g:6953:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            {
            // InternalMoba.g:6953:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==127) ) {
                alt98=1;
            }
            else if ( (LA98_0==130) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;
            }
            switch (alt98) {
                case 1 :
                    // InternalMoba.g:6954:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:6954:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:6955:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:6962:3: (enumLiteral_1= '1' )
                    {
                    // InternalMoba.g:6962:3: (enumLiteral_1= '1' )
                    // InternalMoba.g:6963:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaUpperBoundAccess().getONEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaUpperBoundAccess().getONEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaUpperBound"


    // $ANTLR start "ruleMobaRESTMethods"
    // InternalMoba.g:6973:1: ruleMobaRESTMethods returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= ' PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMobaRESTMethods() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6979:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= ' PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalMoba.g:6980:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= ' PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalMoba.g:6980:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= ' PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt99=4;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt99=1;
                }
                break;
            case 132:
                {
                alt99=2;
                }
                break;
            case 133:
                {
                alt99=3;
                }
                break;
            case 134:
                {
                alt99=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;
            }

            switch (alt99) {
                case 1 :
                    // InternalMoba.g:6981:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalMoba.g:6981:3: (enumLiteral_0= 'GET' )
                    // InternalMoba.g:6982:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaRESTMethodsAccess().getGETEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:6989:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalMoba.g:6989:3: (enumLiteral_1= 'POST' )
                    // InternalMoba.g:6990:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaRESTMethodsAccess().getPOSTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:6997:3: (enumLiteral_2= ' PUT' )
                    {
                    // InternalMoba.g:6997:3: (enumLiteral_2= ' PUT' )
                    // InternalMoba.g:6998:4: enumLiteral_2= ' PUT'
                    {
                    enumLiteral_2=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaRESTMethodsAccess().getPUTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:7005:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalMoba.g:7005:3: (enumLiteral_3= 'DELETE' )
                    // InternalMoba.g:7006:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getDELETEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getMobaRESTMethodsAccess().getDELETEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

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
    // $ANTLR end "ruleMobaRESTMethods"

    // $ANTLR start synpred1_InternalMoba
    public final void synpred1_InternalMoba_fragment() throws RecognitionException {   
        // InternalMoba.g:3594:5: ( RULE_ID )
        // InternalMoba.g:3594:6: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMoba

    // $ANTLR start synpred2_InternalMoba
    public final void synpred2_InternalMoba_fragment() throws RecognitionException {   
        // InternalMoba.g:3743:5: ( RULE_ID )
        // InternalMoba.g:3743:6: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalMoba

    // Delegated rules

    public final boolean synpred2_InternalMoba() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalMoba_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalMoba() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalMoba_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA5 dfa5 = new DFA5(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\34\3\uffff\1\46\12\uffff";
    static final String dfa_3s = "\1\162\3\uffff\1\101\12\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\16\7\uffff\1\2\1\4\1\10\3\uffff\1\11\1\12\1\1\16\uffff\1\3\5\uffff\1\5\3\uffff\1\6\1\uffff\2\6\1\7\11\uffff\2\7\22\uffff\1\15\7\14\1\uffff\3\13",
            "",
            "",
            "",
            "\1\10\32\uffff\1\5",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final char[] dfa_2 = DFA.unpackEncodedStringToUnsignedChars(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final short[] dfa_4 = DFA.unpackEncodedString(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[][] dfa_6 = unpackEncodedStringArray(dfa_6s);

    class DFA5 extends DFA {

        public DFA5(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 5;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "420:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000008100002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0xC000000000800000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000007000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x08001C7014000000L,0x00077F80001803A2L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000000180L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xC000000040800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000884000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000240L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000028004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00F7E00040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00F7E00000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xC0F7E00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0000007F80000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xC0F7E00100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xC0FFE00000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000001980L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x0078000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000004000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0xC000000040800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000004000000L,0x0000000008400040L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000004000000L,0x0000000008400000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000004000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000400L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000004000000L,0x000000000001F800L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000004000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000078L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000200000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0xC000000040000000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000004000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000400000000010L,0x0000000007800000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000000000010L,0x0000000011800000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000400000000010L,0x0000000027800000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x2000000000000000L,0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000001L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000001100L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000900L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0180000000000000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0E00000000000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x7000000000000000L});

}
