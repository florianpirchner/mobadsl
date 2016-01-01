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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION", "RULE_STRING", "RULE_CONSTANT", "RULE_DOWNLOAD_TEMPLATE", "RULE_FQN", "RULE_INT", "RULE_DOUBLE", "SUPER_INT", "SUPER_ID", "RULE_ID_VERSION", "RULE_FLOAT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'project'", "'version'", "'='", "'{'", "'uiApp'", "'backgroundApp'", "'}'", "'application'", "'server'", "'url'", "'extends'", "'autorizations'", "'('", "','", "')'", "'services'", "'use template'", "'active'", "'generator'", "'extensionPoint'", "':'", "'mixin'", "'authorization'", "'serialization'", "'datatype'", "'isArray'", "'constraints'", "'isDate'", "'isTime'", "'isTimestamp'", "'isString'", "'isPrimitive'", "'isBool'", "'isNumeric'", "'isDecimal'", "'enum'", "'lit'", "'isDefault'", "'isUndefined'", "'const'", "'->'", "'+'", "'friends'", "'['", "']'", "'settings'", "'cache'", "'type'", "'strategy'", "'interval'", "'entity'", "'unique'", "'index'", "'dto'", "'queue'", "'rest'", "'bigData'", "'headers'", "'parameters'", "'requestDto'", "'responseDto'", "'errorDto'", "'method'", "'as'", "'param'", "'restCrud'", "'restWorkflow'", "'service'", "'var'", "'lazy'", "'transient'", "'domainKey'", "'domainDescription'", "'format'", "'refEntity'", "'cascading'", "'ref'", "'opposite'", "'embed'", "'alias'", "'..'", "'regexp'", "'min'", "'max'", "'minLength'", "'maxLength'", "'digits'", "'isNull'", "'isNotNull'", "'slot'", "'trigger app install'", "'trigger app update'", "'trigger email'", "'trigger device start'", "'trigger sms'", "'trigger push'", "'trigger geofence'", "'event'", "'module bluetooth'", "'module push'", "'module NFC'", "'toFirstLower'", "'toFirstUpper'", "'toLowerCase'", "'toUpperCase'", "'enter'", "'leave'", "'lowEnergy'", "'spp'", "'beacon'", "'id'", "'custom'", "'text'", "'*'", "'0'", "'?'", "'1'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
    };
    public static final int T__50=50;
    public static final int T__140=140;
    public static final int RULE_VERSION=5;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int RULE_FQN=9;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__137=137;
    public static final int T__52=52;
    public static final int T__136=136;
    public static final int T__53=53;
    public static final int T__139=139;
    public static final int T__54=54;
    public static final int T__138=138;
    public static final int T__133=133;
    public static final int T__132=132;
    public static final int T__60=60;
    public static final int T__135=135;
    public static final int T__61=61;
    public static final int T__134=134;
    public static final int RULE_ID=4;
    public static final int T__131=131;
    public static final int T__130=130;
    public static final int RULE_INT=10;
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
    public static final int RULE_CONSTANT=7;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int RULE_DOWNLOAD_TEMPLATE=8;
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
    public static final int SUPER_ID=13;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int RULE_ID_VERSION=14;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int SUPER_INT=12;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=17;
    public static final int RULE_DOUBLE=11;
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
    // InternalMoba.g:144:1: ruleMobaProject returns [EObject current=null] : (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) ;
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
            // InternalMoba.g:150:2: ( (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' ) )
            // InternalMoba.g:151:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            {
            // InternalMoba.g:151:2: (otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}' )
            // InternalMoba.g:152:3: otherlv_0= 'project' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) ) otherlv_14= '}'
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
            // InternalMoba.g:215:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:216:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:216:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* ) )
            // InternalMoba.g:217:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7());
            // InternalMoba.g:220:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )* )
            // InternalMoba.g:221:6: ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )*
            {
            // InternalMoba.g:221:6: ( ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) ) )*
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
            	    // InternalMoba.g:222:4: ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:222:4: ({...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:223:5: {...}? => ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalMoba.g:223:108: ( ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:224:6: ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0);
            	    // InternalMoba.g:227:9: ({...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) ) )
            	    // InternalMoba.g:227:10: {...}? => (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaProject", "true");
            	    }
            	    // InternalMoba.g:227:19: (otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) ) )
            	    // InternalMoba.g:227:20: otherlv_8= 'uiApp' otherlv_9= '=' ( (otherlv_10= RULE_ID ) )
            	    {
            	    otherlv_8=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getMobaProjectAccess().getUiAppKeyword_7_0_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getMobaProjectAccess().getEqualsSignKeyword_7_0_1());
            	      								
            	    }
            	    // InternalMoba.g:235:9: ( (otherlv_10= RULE_ID ) )
            	    // InternalMoba.g:236:10: (otherlv_10= RULE_ID )
            	    {
            	    // InternalMoba.g:236:10: (otherlv_10= RULE_ID )
            	    // InternalMoba.g:237:11: otherlv_10= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaProjectRule());
            	      											}
            	      										
            	    }
            	    otherlv_10=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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
            	    // InternalMoba.g:254:4: ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:254:4: ({...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:255:5: {...}? => ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaProject", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalMoba.g:255:108: ( ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:256:6: ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1);
            	    // InternalMoba.g:259:9: ({...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) ) )
            	    // InternalMoba.g:259:10: {...}? => (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaProject", "true");
            	    }
            	    // InternalMoba.g:259:19: (otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) ) )
            	    // InternalMoba.g:259:20: otherlv_11= 'backgroundApp' otherlv_12= '=' ( (otherlv_13= RULE_ID ) )
            	    {
            	    otherlv_11=(Token)match(input,25,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaProjectAccess().getBackgroundAppKeyword_7_1_0());
            	      								
            	    }
            	    otherlv_12=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getMobaProjectAccess().getEqualsSignKeyword_7_1_1());
            	      								
            	    }
            	    // InternalMoba.g:267:9: ( (otherlv_13= RULE_ID ) )
            	    // InternalMoba.g:268:10: (otherlv_13= RULE_ID )
            	    {
            	    // InternalMoba.g:268:10: (otherlv_13= RULE_ID )
            	    // InternalMoba.g:269:11: otherlv_13= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaProjectRule());
            	      											}
            	      										
            	    }
            	    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
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
    // InternalMoba.g:308:1: ruleMobaApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) ( (lv_cache_5_0= ruleMobaCache ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaApplicationFeature ) )* otherlv_9= '}' ) ;
    public final EObject ruleMobaApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_cache_5_0 = null;

        EObject this_MobaFriendsAble_6 = null;

        EObject lv_features_8_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:314:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) ( (lv_cache_5_0= ruleMobaCache ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaApplicationFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:315:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) ( (lv_cache_5_0= ruleMobaCache ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaApplicationFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:315:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) ( (lv_cache_5_0= ruleMobaCache ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaApplicationFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:316:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) ( (lv_cache_5_0= ruleMobaCache ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaApplicationFeature ) )* otherlv_9= '}'
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
            lv_version_4_0=(Token)match(input,RULE_VERSION,FOLLOW_11); if (state.failed) return current;
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

            // InternalMoba.g:364:3: ( (lv_cache_5_0= ruleMobaCache ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==66) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMoba.g:365:4: (lv_cache_5_0= ruleMobaCache )
                    {
                    // InternalMoba.g:365:4: (lv_cache_5_0= ruleMobaCache )
                    // InternalMoba.g:366:5: lv_cache_5_0= ruleMobaCache
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getMobaApplicationAccess().getCacheMobaCacheParserRuleCall_5_0());
                      				
                    }
                    pushFollow(FOLLOW_8);
                    lv_cache_5_0=ruleMobaCache();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getMobaApplicationRule());
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
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaApplicationRule());
              			}
              			newCompositeNode(grammarAccess.getMobaApplicationAccess().getMobaFriendsAbleParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_6=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,23,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaApplicationAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            // InternalMoba.g:398:3: ( (lv_features_8_0= ruleMobaApplicationFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==28||(LA5_0>=36 && LA5_0<=38)||(LA5_0>=42 && LA5_0<=44)||LA5_0==59||LA5_0==65||LA5_0==70||(LA5_0>=73 && LA5_0<=75)||(LA5_0>=85 && LA5_0<=86)||(LA5_0>=109 && LA5_0<=116)||(LA5_0>=118 && LA5_0<=120)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMoba.g:399:4: (lv_features_8_0= ruleMobaApplicationFeature )
            	    {
            	    // InternalMoba.g:399:4: (lv_features_8_0= ruleMobaApplicationFeature )
            	    // InternalMoba.g:400:5: lv_features_8_0= ruleMobaApplicationFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaApplicationAccess().getFeaturesMobaApplicationFeatureParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_features_8_0=ruleMobaApplicationFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMobaApplicationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"features",
            	      						lv_features_8_0,
            	      						"org.mobadsl.grammar.Moba.MobaApplicationFeature");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_9=(Token)match(input,26,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMobaApplicationAccess().getRightCurlyBracketKeyword_9());
              		
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
    // InternalMoba.g:425:1: entryRuleMobaApplicationFeature returns [EObject current=null] : iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF ;
    public final EObject entryRuleMobaApplicationFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaApplicationFeature = null;


        try {
            // InternalMoba.g:425:63: (iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF )
            // InternalMoba.g:426:2: iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF
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
    // InternalMoba.g:432:1: ruleMobaApplicationFeature returns [EObject current=null] : (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer ) ;
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
            // InternalMoba.g:438:2: ( (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer ) )
            // InternalMoba.g:439:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer )
            {
            // InternalMoba.g:439:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer )
            int alt6=13;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMoba.g:440:3: this_MobaDataType_0= ruleMobaDataType
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
                    // InternalMoba.g:449:3: this_MobaTemplate_1= ruleMobaTemplate
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
                    // InternalMoba.g:458:3: this_MobaConstant_2= ruleMobaConstant
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
                    // InternalMoba.g:467:3: this_MobaSettings_3= ruleMobaSettings
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
                    // InternalMoba.g:476:3: this_MobaData_4= ruleMobaData
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
                    // InternalMoba.g:485:3: this_MobaREST_5= ruleMobaREST
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
                    // InternalMoba.g:494:3: this_MobaGenerator_6= ruleMobaGenerator
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
                    // InternalMoba.g:503:3: this_MobaAuthorization_7= ruleMobaAuthorization
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
                    // InternalMoba.g:512:3: this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType
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
                    // InternalMoba.g:521:3: this_MobaExternalModule_9= ruleMobaExternalModule
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
                    // InternalMoba.g:530:3: this_MobaTrigger_10= ruleMobaTrigger
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
                    // InternalMoba.g:539:3: this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot
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
                    // InternalMoba.g:548:3: this_MobaServer_12= ruleMobaServer
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
    // InternalMoba.g:560:1: entryRuleMobaServer returns [EObject current=null] : iv_ruleMobaServer= ruleMobaServer EOF ;
    public final EObject entryRuleMobaServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaServer = null;


        try {
            // InternalMoba.g:560:51: (iv_ruleMobaServer= ruleMobaServer EOF )
            // InternalMoba.g:561:2: iv_ruleMobaServer= ruleMobaServer EOF
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
    // InternalMoba.g:567:1: ruleMobaServer returns [EObject current=null] : (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}' ) ;
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
            // InternalMoba.g:573:2: ( (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}' ) )
            // InternalMoba.g:574:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}' )
            {
            // InternalMoba.g:574:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}' )
            // InternalMoba.g:575:3: otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) ) otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaServerAccess().getServerKeyword_0());
              		
            }
            // InternalMoba.g:579:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:580:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:580:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:581:5: lv_name_1_0= RULE_ID
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
            // InternalMoba.g:605:3: ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_CONSTANT) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMoba.g:606:4: ( (lv_urlString_4_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:606:4: ( (lv_urlString_4_0= RULE_STRING ) )
                    // InternalMoba.g:607:5: (lv_urlString_4_0= RULE_STRING )
                    {
                    // InternalMoba.g:607:5: (lv_urlString_4_0= RULE_STRING )
                    // InternalMoba.g:608:6: lv_urlString_4_0= RULE_STRING
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
                    // InternalMoba.g:625:4: ( (otherlv_5= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:625:4: ( (otherlv_5= RULE_CONSTANT ) )
                    // InternalMoba.g:626:5: (otherlv_5= RULE_CONSTANT )
                    {
                    // InternalMoba.g:626:5: (otherlv_5= RULE_CONSTANT )
                    // InternalMoba.g:627:6: otherlv_5= RULE_CONSTANT
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

            // InternalMoba.g:639:3: (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMoba.g:640:4: otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMobaServerAccess().getExtendsKeyword_5_0());
                      			
                    }
                    // InternalMoba.g:644:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMoba.g:645:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMoba.g:645:5: (otherlv_7= RULE_ID )
                    // InternalMoba.g:646:6: otherlv_7= RULE_ID
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
            // InternalMoba.g:673:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:674:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:674:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* ) )
            // InternalMoba.g:675:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());
            // InternalMoba.g:678:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )* )
            // InternalMoba.g:679:6: ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )*
            {
            // InternalMoba.g:679:6: ( ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) ) )*
            loop11:
            do {
                int alt11=3;
                int LA11_0 = input.LA(1);

                if ( LA11_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0) ) {
                    alt11=1;
                }
                else if ( LA11_0 == 35 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1) ) {
                    alt11=2;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMoba.g:680:4: ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:680:4: ({...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) ) )
            	    // InternalMoba.g:681:5: {...}? => ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalMoba.g:681:107: ( ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) ) )
            	    // InternalMoba.g:682:6: ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0);
            	    // InternalMoba.g:685:9: ({...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' ) )
            	    // InternalMoba.g:685:10: {...}? => (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "true");
            	    }
            	    // InternalMoba.g:685:19: (otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')' )
            	    // InternalMoba.g:685:20: otherlv_11= 'autorizations' otherlv_12= '=' otherlv_13= '(' ( (otherlv_14= RULE_CONSTANT ) ) (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )* otherlv_17= ')'
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
            	    // InternalMoba.g:697:9: ( (otherlv_14= RULE_CONSTANT ) )
            	    // InternalMoba.g:698:10: (otherlv_14= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:698:10: (otherlv_14= RULE_CONSTANT )
            	    // InternalMoba.g:699:11: otherlv_14= RULE_CONSTANT
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

            	    // InternalMoba.g:710:9: (otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==33) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalMoba.g:711:10: otherlv_15= ',' ( (otherlv_16= RULE_CONSTANT ) )
            	    	    {
            	    	    otherlv_15=(Token)match(input,33,FOLLOW_18); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_15, grammarAccess.getMobaServerAccess().getCommaKeyword_8_0_4_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:715:10: ( (otherlv_16= RULE_CONSTANT ) )
            	    	    // InternalMoba.g:716:11: (otherlv_16= RULE_CONSTANT )
            	    	    {
            	    	    // InternalMoba.g:716:11: (otherlv_16= RULE_CONSTANT )
            	    	    // InternalMoba.g:717:12: otherlv_16= RULE_CONSTANT
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
            	    	    break loop9;
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
            	    // InternalMoba.g:739:4: ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:739:4: ({...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) ) )
            	    // InternalMoba.g:740:5: {...}? => ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalMoba.g:740:107: ( ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) ) )
            	    // InternalMoba.g:741:6: ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1);
            	    // InternalMoba.g:744:9: ({...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' ) )
            	    // InternalMoba.g:744:10: {...}? => (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "true");
            	    }
            	    // InternalMoba.g:744:19: (otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')' )
            	    // InternalMoba.g:744:20: otherlv_18= 'services' otherlv_19= '=' otherlv_20= '(' ( (otherlv_21= RULE_ID ) ) (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )* otherlv_24= ')'
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
            	    // InternalMoba.g:756:9: ( (otherlv_21= RULE_ID ) )
            	    // InternalMoba.g:757:10: (otherlv_21= RULE_ID )
            	    {
            	    // InternalMoba.g:757:10: (otherlv_21= RULE_ID )
            	    // InternalMoba.g:758:11: otherlv_21= RULE_ID
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

            	    // InternalMoba.g:769:9: (otherlv_22= ',' ( (otherlv_23= RULE_ID ) ) )*
            	    loop10:
            	    do {
            	        int alt10=2;
            	        int LA10_0 = input.LA(1);

            	        if ( (LA10_0==33) ) {
            	            alt10=1;
            	        }


            	        switch (alt10) {
            	    	case 1 :
            	    	    // InternalMoba.g:770:10: otherlv_22= ',' ( (otherlv_23= RULE_ID ) )
            	    	    {
            	    	    otherlv_22=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_22, grammarAccess.getMobaServerAccess().getCommaKeyword_8_1_4_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:774:10: ( (otherlv_23= RULE_ID ) )
            	    	    // InternalMoba.g:775:11: (otherlv_23= RULE_ID )
            	    	    {
            	    	    // InternalMoba.g:775:11: (otherlv_23= RULE_ID )
            	    	    // InternalMoba.g:776:12: otherlv_23= RULE_ID
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
            	    	    break loop10;
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
            	    break loop11;
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
    // InternalMoba.g:813:1: entryRuleMobaTemplate returns [EObject current=null] : iv_ruleMobaTemplate= ruleMobaTemplate EOF ;
    public final EObject entryRuleMobaTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTemplate = null;


        try {
            // InternalMoba.g:813:53: (iv_ruleMobaTemplate= ruleMobaTemplate EOF )
            // InternalMoba.g:814:2: iv_ruleMobaTemplate= ruleMobaTemplate EOF
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
    // InternalMoba.g:820:1: ruleMobaTemplate returns [EObject current=null] : (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) ;
    public final EObject ruleMobaTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_downloadTemplate_2_0=null;


        	enterRule();

        try {
            // InternalMoba.g:826:2: ( (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) )
            // InternalMoba.g:827:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            {
            // InternalMoba.g:827:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            // InternalMoba.g:828:3: otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaTemplateAccess().getUseTemplateKeyword_0());
              		
            }
            // InternalMoba.g:832:3: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            else if ( (LA12_0==RULE_DOWNLOAD_TEMPLATE) ) {
                alt12=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoba.g:833:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalMoba.g:833:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoba.g:834:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoba.g:834:5: (otherlv_1= RULE_ID )
                    // InternalMoba.g:835:6: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaTemplateRule());
                      						}
                      					
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_1, grammarAccess.getMobaTemplateAccess().getTemplateMobaApplicationCrossReference_1_0_0());
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:847:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    {
                    // InternalMoba.g:847:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    // InternalMoba.g:848:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    {
                    // InternalMoba.g:848:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    // InternalMoba.g:849:6: lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE
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
    // InternalMoba.g:870:1: entryRuleMobaGenerator returns [EObject current=null] : iv_ruleMobaGenerator= ruleMobaGenerator EOF ;
    public final EObject entryRuleMobaGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGenerator = null;


        try {
            // InternalMoba.g:870:54: (iv_ruleMobaGenerator= ruleMobaGenerator EOF )
            // InternalMoba.g:871:2: iv_ruleMobaGenerator= ruleMobaGenerator EOF
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
    // InternalMoba.g:877:1: ruleMobaGenerator returns [EObject current=null] : ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) ;
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
            // InternalMoba.g:883:2: ( ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) )
            // InternalMoba.g:884:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            {
            // InternalMoba.g:884:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            // InternalMoba.g:885:3: ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}'
            {
            // InternalMoba.g:885:3: ( (lv_active_0_0= 'active' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMoba.g:886:4: (lv_active_0_0= 'active' )
                    {
                    // InternalMoba.g:886:4: (lv_active_0_0= 'active' )
                    // InternalMoba.g:887:5: lv_active_0_0= 'active'
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
            // InternalMoba.g:903:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:904:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:904:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:905:5: lv_name_2_0= RULE_ID
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
            // InternalMoba.g:925:3: ( (lv_features_4_0= ruleMobaGeneratorFeature ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==39||LA14_0==41) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMoba.g:926:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    {
            	    // InternalMoba.g:926:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    // InternalMoba.g:927:5: lv_features_4_0= ruleMobaGeneratorFeature
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
            	    break loop14;
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
    // InternalMoba.g:952:1: entryRuleMobaGeneratorFeature returns [EObject current=null] : iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF ;
    public final EObject entryRuleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorFeature = null;


        try {
            // InternalMoba.g:952:61: (iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF )
            // InternalMoba.g:953:2: iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF
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
    // InternalMoba.g:959:1: ruleMobaGeneratorFeature returns [EObject current=null] : (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) ;
    public final EObject ruleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaGeneratorIDFeature_0 = null;

        EObject this_MobaGeneratorMixinFeature_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:965:2: ( (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) )
            // InternalMoba.g:966:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            {
            // InternalMoba.g:966:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==39) ) {
                alt15=1;
            }
            else if ( (LA15_0==41) ) {
                alt15=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalMoba.g:967:3: this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature
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
                    // InternalMoba.g:976:3: this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature
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
    // InternalMoba.g:988:1: entryRuleMobaGeneratorIDFeature returns [EObject current=null] : iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF ;
    public final EObject entryRuleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorIDFeature = null;


        try {
            // InternalMoba.g:988:63: (iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF )
            // InternalMoba.g:989:2: iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF
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
    // InternalMoba.g:995:1: ruleMobaGeneratorIDFeature returns [EObject current=null] : (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) ;
    public final EObject ruleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_generatorId_1_0=null;
        Token otherlv_2=null;
        Token lv_generatorVersion_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:1001:2: ( (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) )
            // InternalMoba.g:1002:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            {
            // InternalMoba.g:1002:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            // InternalMoba.g:1003:3: otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getExtensionPointKeyword_0());
              		
            }
            // InternalMoba.g:1007:3: ( (lv_generatorId_1_0= RULE_FQN ) )
            // InternalMoba.g:1008:4: (lv_generatorId_1_0= RULE_FQN )
            {
            // InternalMoba.g:1008:4: (lv_generatorId_1_0= RULE_FQN )
            // InternalMoba.g:1009:5: lv_generatorId_1_0= RULE_FQN
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
            // InternalMoba.g:1029:3: ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            // InternalMoba.g:1030:4: (lv_generatorVersion_3_0= RULE_VERSION )
            {
            // InternalMoba.g:1030:4: (lv_generatorVersion_3_0= RULE_VERSION )
            // InternalMoba.g:1031:5: lv_generatorVersion_3_0= RULE_VERSION
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
    // InternalMoba.g:1051:1: entryRuleMobaGeneratorMixinFeature returns [EObject current=null] : iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF ;
    public final EObject entryRuleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorMixinFeature = null;


        try {
            // InternalMoba.g:1051:66: (iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF )
            // InternalMoba.g:1052:2: iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF
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
    // InternalMoba.g:1058:1: ruleMobaGeneratorMixinFeature returns [EObject current=null] : (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:1064:2: ( (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMoba.g:1065:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMoba.g:1065:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            // InternalMoba.g:1066:3: otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorMixinFeatureAccess().getMixinKeyword_0());
              		
            }
            // InternalMoba.g:1070:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:1071:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:1071:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:1072:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaGeneratorMixinFeatureRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:1087:1: entryRuleMobaAuthorization returns [EObject current=null] : iv_ruleMobaAuthorization= ruleMobaAuthorization EOF ;
    public final EObject entryRuleMobaAuthorization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAuthorization = null;


        try {
            // InternalMoba.g:1087:58: (iv_ruleMobaAuthorization= ruleMobaAuthorization EOF )
            // InternalMoba.g:1088:2: iv_ruleMobaAuthorization= ruleMobaAuthorization EOF
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
    // InternalMoba.g:1094:1: ruleMobaAuthorization returns [EObject current=null] : (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaAuthorization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1100:2: ( (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1101:2: (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1101:2: (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1102:3: otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,42,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaAuthorizationAccess().getAuthorizationKeyword_0());
              		
            }
            // InternalMoba.g:1106:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1107:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1107:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1108:5: lv_name_1_0= RULE_CONSTANT
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
    // InternalMoba.g:1139:1: entryRuleMobaTransportSerializationType returns [EObject current=null] : iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF ;
    public final EObject entryRuleMobaTransportSerializationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTransportSerializationType = null;


        try {
            // InternalMoba.g:1139:71: (iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF )
            // InternalMoba.g:1140:2: iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF
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
    // InternalMoba.g:1146:1: ruleMobaTransportSerializationType returns [EObject current=null] : (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaTransportSerializationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1152:2: ( (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1153:2: (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1153:2: (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1154:3: otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,43,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaTransportSerializationTypeAccess().getSerializationKeyword_0());
              		
            }
            // InternalMoba.g:1158:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1159:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1159:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1160:5: lv_name_1_0= RULE_CONSTANT
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
    // InternalMoba.g:1191:1: entryRuleMobaDataType returns [EObject current=null] : iv_ruleMobaDataType= ruleMobaDataType EOF ;
    public final EObject entryRuleMobaDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDataType = null;


        try {
            // InternalMoba.g:1191:53: (iv_ruleMobaDataType= ruleMobaDataType EOF )
            // InternalMoba.g:1192:2: iv_ruleMobaDataType= ruleMobaDataType EOF
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
    // InternalMoba.g:1198:1: ruleMobaDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:1204:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1205:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1205:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1206:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_28= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalMoba.g:1210:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1211:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1211:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1212:5: lv_name_1_0= RULE_ID
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

            // InternalMoba.g:1228:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==30) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalMoba.g:1229:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaDataTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:1233:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1234:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1234:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1235:6: otherlv_3= RULE_ID
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

            // InternalMoba.g:1247:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) )
            // InternalMoba.g:1248:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) )
            {
            // InternalMoba.g:1248:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) )
            // InternalMoba.g:1249:5: ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            // InternalMoba.g:1252:5: ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?)
            // InternalMoba.g:1253:6: ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?
            {
            // InternalMoba.g:1253:6: ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=4;
                int LA26_0 = input.LA(1);

                if ( LA26_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
                    alt26=1;
                }
                else if ( LA26_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
                    alt26=2;
                }
                else if ( ( LA26_0 >= 47 && LA26_0 <= 50 || LA26_0 >= 52 && LA26_0 <= 55 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt26=3;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMoba.g:1254:4: ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:1254:4: ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:1255:5: {...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoba.g:1255:109: ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:1256:6: ({...}? => ( (lv_array_5_0= 'isArray' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0);
            	    // InternalMoba.g:1259:9: ({...}? => ( (lv_array_5_0= 'isArray' ) ) )
            	    // InternalMoba.g:1259:10: {...}? => ( (lv_array_5_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1259:19: ( (lv_array_5_0= 'isArray' ) )
            	    // InternalMoba.g:1259:20: (lv_array_5_0= 'isArray' )
            	    {
            	    // InternalMoba.g:1259:20: (lv_array_5_0= 'isArray' )
            	    // InternalMoba.g:1260:10: lv_array_5_0= 'isArray'
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
            	    // InternalMoba.g:1277:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:1277:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:1278:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoba.g:1278:109: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:1279:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1);
            	    // InternalMoba.g:1282:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:1282:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1282:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:1282:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaDataTypeAccess().getConstraintsKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_1_1());
            	      								
            	    }
            	    // InternalMoba.g:1290:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:1291:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:1291:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:1292:11: lv_constraints_8_0= ruleMobaConstraint
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

            	    // InternalMoba.g:1309:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==33) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // InternalMoba.g:1310:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaDataTypeAccess().getCommaKeyword_3_1_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:1314:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:1315:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:1315:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:1316:12: lv_constraints_10_0= ruleMobaConstraint
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
            	    	    break loop17;
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
            	    // InternalMoba.g:1344:4: ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) )
            	    {
            	    // InternalMoba.g:1344:4: ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) ) )
            	    // InternalMoba.g:1345:5: {...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoba.g:1345:109: ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) ) )
            	    // InternalMoba.g:1346:6: ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2);
            	    // InternalMoba.g:1349:9: ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) ) )
            	    // InternalMoba.g:1349:10: {...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1349:19: ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? ) )
            	    int alt25=6;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	    case 48:
            	    case 49:
            	        {
            	        alt25=1;
            	        }
            	        break;
            	    case 55:
            	        {
            	        alt25=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt25=3;
            	        }
            	        break;
            	    case 52:
            	        {
            	        alt25=4;
            	        }
            	        break;
            	    case 53:
            	        {
            	        alt25=5;
            	        }
            	        break;
            	    case 54:
            	        {
            	        alt25=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 25, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt25) {
            	        case 1 :
            	            // InternalMoba.g:1349:20: ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? )
            	            {
            	            // InternalMoba.g:1349:20: ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? )
            	            // InternalMoba.g:1350:10: ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )?
            	            {
            	            // InternalMoba.g:1350:10: ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) )
            	            int alt18=3;
            	            switch ( input.LA(1) ) {
            	            case 47:
            	                {
            	                alt18=1;
            	                }
            	                break;
            	            case 48:
            	                {
            	                alt18=2;
            	                }
            	                break;
            	            case 49:
            	                {
            	                alt18=3;
            	                }
            	                break;
            	            default:
            	                if (state.backtracking>0) {state.failed=true; return current;}
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 18, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt18) {
            	                case 1 :
            	                    // InternalMoba.g:1351:11: ( (lv_date_12_0= 'isDate' ) )
            	                    {
            	                    // InternalMoba.g:1351:11: ( (lv_date_12_0= 'isDate' ) )
            	                    // InternalMoba.g:1352:12: (lv_date_12_0= 'isDate' )
            	                    {
            	                    // InternalMoba.g:1352:12: (lv_date_12_0= 'isDate' )
            	                    // InternalMoba.g:1353:13: lv_date_12_0= 'isDate'
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
            	                    // InternalMoba.g:1366:11: ( (lv_time_13_0= 'isTime' ) )
            	                    {
            	                    // InternalMoba.g:1366:11: ( (lv_time_13_0= 'isTime' ) )
            	                    // InternalMoba.g:1367:12: (lv_time_13_0= 'isTime' )
            	                    {
            	                    // InternalMoba.g:1367:12: (lv_time_13_0= 'isTime' )
            	                    // InternalMoba.g:1368:13: lv_time_13_0= 'isTime'
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
            	                    // InternalMoba.g:1381:11: ( (lv_timestamp_14_0= 'isTimestamp' ) )
            	                    {
            	                    // InternalMoba.g:1381:11: ( (lv_timestamp_14_0= 'isTimestamp' ) )
            	                    // InternalMoba.g:1382:12: (lv_timestamp_14_0= 'isTimestamp' )
            	                    {
            	                    // InternalMoba.g:1382:12: (lv_timestamp_14_0= 'isTimestamp' )
            	                    // InternalMoba.g:1383:13: lv_timestamp_14_0= 'isTimestamp'
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

            	            // InternalMoba.g:1396:10: (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )?
            	            int alt20=2;
            	            int LA20_0 = input.LA(1);

            	            if ( (LA20_0==32) ) {
            	                alt20=1;
            	            }
            	            switch (alt20) {
            	                case 1 :
            	                    // InternalMoba.g:1397:11: otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')'
            	                    {
            	                    otherlv_15=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      											newLeafNode(otherlv_15, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_2_0_1_0());
            	                      										
            	                    }
            	                    // InternalMoba.g:1401:11: ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) )
            	                    int alt19=2;
            	                    int LA19_0 = input.LA(1);

            	                    if ( (LA19_0==RULE_STRING) ) {
            	                        alt19=1;
            	                    }
            	                    else if ( (LA19_0==RULE_CONSTANT) ) {
            	                        alt19=2;
            	                    }
            	                    else {
            	                        if (state.backtracking>0) {state.failed=true; return current;}
            	                        NoViableAltException nvae =
            	                            new NoViableAltException("", 19, 0, input);

            	                        throw nvae;
            	                    }
            	                    switch (alt19) {
            	                        case 1 :
            	                            // InternalMoba.g:1402:12: ( (lv_dateFormatString_16_0= RULE_STRING ) )
            	                            {
            	                            // InternalMoba.g:1402:12: ( (lv_dateFormatString_16_0= RULE_STRING ) )
            	                            // InternalMoba.g:1403:13: (lv_dateFormatString_16_0= RULE_STRING )
            	                            {
            	                            // InternalMoba.g:1403:13: (lv_dateFormatString_16_0= RULE_STRING )
            	                            // InternalMoba.g:1404:14: lv_dateFormatString_16_0= RULE_STRING
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
            	                            // InternalMoba.g:1421:12: ( (otherlv_17= RULE_CONSTANT ) )
            	                            {
            	                            // InternalMoba.g:1421:12: ( (otherlv_17= RULE_CONSTANT ) )
            	                            // InternalMoba.g:1422:13: (otherlv_17= RULE_CONSTANT )
            	                            {
            	                            // InternalMoba.g:1422:13: (otherlv_17= RULE_CONSTANT )
            	                            // InternalMoba.g:1423:14: otherlv_17= RULE_CONSTANT
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
            	            // InternalMoba.g:1442:9: ( (lv_enumAST_19_0= ruleMobaEnum ) )
            	            {
            	            // InternalMoba.g:1442:9: ( (lv_enumAST_19_0= ruleMobaEnum ) )
            	            // InternalMoba.g:1443:10: (lv_enumAST_19_0= ruleMobaEnum )
            	            {
            	            // InternalMoba.g:1443:10: (lv_enumAST_19_0= ruleMobaEnum )
            	            // InternalMoba.g:1444:11: lv_enumAST_19_0= ruleMobaEnum
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
            	            // InternalMoba.g:1462:9: ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1462:9: ( ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1463:10: ( (lv_string_20_0= 'isString' ) ) ( (lv_primitive_21_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1463:10: ( (lv_string_20_0= 'isString' ) )
            	            // InternalMoba.g:1464:11: (lv_string_20_0= 'isString' )
            	            {
            	            // InternalMoba.g:1464:11: (lv_string_20_0= 'isString' )
            	            // InternalMoba.g:1465:12: lv_string_20_0= 'isString'
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

            	            // InternalMoba.g:1477:10: ( (lv_primitive_21_0= 'isPrimitive' ) )?
            	            int alt21=2;
            	            int LA21_0 = input.LA(1);

            	            if ( (LA21_0==51) ) {
            	                alt21=1;
            	            }
            	            switch (alt21) {
            	                case 1 :
            	                    // InternalMoba.g:1478:11: (lv_primitive_21_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1478:11: (lv_primitive_21_0= 'isPrimitive' )
            	                    // InternalMoba.g:1479:12: lv_primitive_21_0= 'isPrimitive'
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
            	            // InternalMoba.g:1493:9: ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1493:9: ( ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1494:10: ( (lv_bool_22_0= 'isBool' ) ) ( (lv_primitive_23_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1494:10: ( (lv_bool_22_0= 'isBool' ) )
            	            // InternalMoba.g:1495:11: (lv_bool_22_0= 'isBool' )
            	            {
            	            // InternalMoba.g:1495:11: (lv_bool_22_0= 'isBool' )
            	            // InternalMoba.g:1496:12: lv_bool_22_0= 'isBool'
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

            	            // InternalMoba.g:1508:10: ( (lv_primitive_23_0= 'isPrimitive' ) )?
            	            int alt22=2;
            	            int LA22_0 = input.LA(1);

            	            if ( (LA22_0==51) ) {
            	                alt22=1;
            	            }
            	            switch (alt22) {
            	                case 1 :
            	                    // InternalMoba.g:1509:11: (lv_primitive_23_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1509:11: (lv_primitive_23_0= 'isPrimitive' )
            	                    // InternalMoba.g:1510:12: lv_primitive_23_0= 'isPrimitive'
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
            	            // InternalMoba.g:1524:9: ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1524:9: ( ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1525:10: ( (lv_numeric_24_0= 'isNumeric' ) ) ( (lv_primitive_25_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1525:10: ( (lv_numeric_24_0= 'isNumeric' ) )
            	            // InternalMoba.g:1526:11: (lv_numeric_24_0= 'isNumeric' )
            	            {
            	            // InternalMoba.g:1526:11: (lv_numeric_24_0= 'isNumeric' )
            	            // InternalMoba.g:1527:12: lv_numeric_24_0= 'isNumeric'
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

            	            // InternalMoba.g:1539:10: ( (lv_primitive_25_0= 'isPrimitive' ) )?
            	            int alt23=2;
            	            int LA23_0 = input.LA(1);

            	            if ( (LA23_0==51) ) {
            	                alt23=1;
            	            }
            	            switch (alt23) {
            	                case 1 :
            	                    // InternalMoba.g:1540:11: (lv_primitive_25_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1540:11: (lv_primitive_25_0= 'isPrimitive' )
            	                    // InternalMoba.g:1541:12: lv_primitive_25_0= 'isPrimitive'
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
            	            // InternalMoba.g:1555:9: ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1555:9: ( ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1556:10: ( (lv_decimal_26_0= 'isDecimal' ) ) ( (lv_primitive_27_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1556:10: ( (lv_decimal_26_0= 'isDecimal' ) )
            	            // InternalMoba.g:1557:11: (lv_decimal_26_0= 'isDecimal' )
            	            {
            	            // InternalMoba.g:1557:11: (lv_decimal_26_0= 'isDecimal' )
            	            // InternalMoba.g:1558:12: lv_decimal_26_0= 'isDecimal'
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

            	            // InternalMoba.g:1570:10: ( (lv_primitive_27_0= 'isPrimitive' ) )?
            	            int alt24=2;
            	            int LA24_0 = input.LA(1);

            	            if ( (LA24_0==51) ) {
            	                alt24=1;
            	            }
            	            switch (alt24) {
            	                case 1 :
            	                    // InternalMoba.g:1571:11: (lv_primitive_27_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1571:11: (lv_primitive_27_0= 'isPrimitive' )
            	                    // InternalMoba.g:1572:12: lv_primitive_27_0= 'isPrimitive'
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
            	    if ( cnt26 >= 1 ) break loop26;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // InternalMoba.g:1614:1: entryRuleMobaEnum returns [EObject current=null] : iv_ruleMobaEnum= ruleMobaEnum EOF ;
    public final EObject entryRuleMobaEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnum = null;


        try {
            // InternalMoba.g:1614:49: (iv_ruleMobaEnum= ruleMobaEnum EOF )
            // InternalMoba.g:1615:2: iv_ruleMobaEnum= ruleMobaEnum EOF
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
    // InternalMoba.g:1621:1: ruleMobaEnum returns [EObject current=null] : ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleMobaEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1627:2: ( ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' ) )
            // InternalMoba.g:1628:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' )
            {
            // InternalMoba.g:1628:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' )
            // InternalMoba.g:1629:3: () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}'
            {
            // InternalMoba.g:1629:3: ()
            // InternalMoba.g:1630:4: 
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
            // InternalMoba.g:1644:3: ( (lv_literals_3_0= ruleMobaEnumLiteral ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==56) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalMoba.g:1645:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            	    {
            	    // InternalMoba.g:1645:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            	    // InternalMoba.g:1646:5: lv_literals_3_0= ruleMobaEnumLiteral
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
            	    break loop27;
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
    // InternalMoba.g:1671:1: entryRuleMobaEnumLiteral returns [EObject current=null] : iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF ;
    public final EObject entryRuleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnumLiteral = null;


        try {
            // InternalMoba.g:1671:56: (iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF )
            // InternalMoba.g:1672:2: iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF
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
    // InternalMoba.g:1678:1: ruleMobaEnumLiteral returns [EObject current=null] : (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' ) ;
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
            // InternalMoba.g:1684:2: ( (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' ) )
            // InternalMoba.g:1685:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )
            {
            // InternalMoba.g:1685:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')' )
            // InternalMoba.g:1686:3: otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) ) otherlv_12= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEnumLiteralAccess().getLitKeyword_0());
              		
            }
            // InternalMoba.g:1690:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1691:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1691:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1692:5: lv_name_1_0= RULE_CONSTANT
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
            // InternalMoba.g:1716:3: ( (lv_literal_4_0= RULE_STRING ) )
            // InternalMoba.g:1717:4: (lv_literal_4_0= RULE_STRING )
            {
            // InternalMoba.g:1717:4: (lv_literal_4_0= RULE_STRING )
            // InternalMoba.g:1718:5: lv_literal_4_0= RULE_STRING
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
            // InternalMoba.g:1738:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalMoba.g:1739:4: (lv_value_6_0= RULE_INT )
            {
            // InternalMoba.g:1739:4: (lv_value_6_0= RULE_INT )
            // InternalMoba.g:1740:5: lv_value_6_0= RULE_INT
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

            // InternalMoba.g:1756:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:1757:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:1757:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* ) )
            // InternalMoba.g:1758:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7());
            // InternalMoba.g:1761:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )* )
            // InternalMoba.g:1762:6: ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )*
            {
            // InternalMoba.g:1762:6: ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) )*
            loop28:
            do {
                int alt28=3;
                int LA28_0 = input.LA(1);

                if ( LA28_0 == 33 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) ) {
                    int LA28_2 = input.LA(2);

                    if ( LA28_2 == 57 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) {
                        alt28=1;
                    }
                    else if ( LA28_2 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) ) {
                        alt28=2;
                    }


                }


                switch (alt28) {
            	case 1 :
            	    // InternalMoba.g:1763:4: ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1763:4: ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) )
            	    // InternalMoba.g:1764:5: {...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalMoba.g:1764:112: ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) )
            	    // InternalMoba.g:1765:6: ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0);
            	    // InternalMoba.g:1768:9: ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) )
            	    // InternalMoba.g:1768:10: {...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1768:19: (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) )
            	    // InternalMoba.g:1768:20: otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) )
            	    {
            	    otherlv_8=(Token)match(input,33,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_0_0());
            	      								
            	    }
            	    // InternalMoba.g:1772:9: ( (lv_default_9_0= 'isDefault' ) )
            	    // InternalMoba.g:1773:10: (lv_default_9_0= 'isDefault' )
            	    {
            	    // InternalMoba.g:1773:10: (lv_default_9_0= 'isDefault' )
            	    // InternalMoba.g:1774:11: lv_default_9_0= 'isDefault'
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
            	    // InternalMoba.g:1792:4: ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1792:4: ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) )
            	    // InternalMoba.g:1793:5: {...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalMoba.g:1793:112: ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) )
            	    // InternalMoba.g:1794:6: ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1);
            	    // InternalMoba.g:1797:9: ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) )
            	    // InternalMoba.g:1797:10: {...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1797:19: (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) )
            	    // InternalMoba.g:1797:20: otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) )
            	    {
            	    otherlv_10=(Token)match(input,33,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_1_0());
            	      								
            	    }
            	    // InternalMoba.g:1801:9: ( (lv_undefined_11_0= 'isUndefined' ) )
            	    // InternalMoba.g:1802:10: (lv_undefined_11_0= 'isUndefined' )
            	    {
            	    // InternalMoba.g:1802:10: (lv_undefined_11_0= 'isUndefined' )
            	    // InternalMoba.g:1803:11: lv_undefined_11_0= 'isUndefined'
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
            	    break loop28;
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
    // InternalMoba.g:1836:1: entryRuleMobaConstant returns [EObject current=null] : iv_ruleMobaConstant= ruleMobaConstant EOF ;
    public final EObject entryRuleMobaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstant = null;


        try {
            // InternalMoba.g:1836:53: (iv_ruleMobaConstant= ruleMobaConstant EOF )
            // InternalMoba.g:1837:2: iv_ruleMobaConstant= ruleMobaConstant EOF
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
    // InternalMoba.g:1843:1: ruleMobaConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_valueAST_3_0 = null;

        EObject this_MobaFriendsAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:1849:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1850:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1850:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1851:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,59,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaConstantAccess().getConstKeyword_0());
              		
            }
            // InternalMoba.g:1855:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1856:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1856:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1857:5: lv_name_1_0= RULE_CONSTANT
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
            // InternalMoba.g:1877:3: ( (lv_valueAST_3_0= ruleMobaConstantValue ) )
            // InternalMoba.g:1878:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            {
            // InternalMoba.g:1878:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            // InternalMoba.g:1879:5: lv_valueAST_3_0= ruleMobaConstantValue
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
    // InternalMoba.g:1911:1: entryRuleMobaConstantValue returns [EObject current=null] : iv_ruleMobaConstantValue= ruleMobaConstantValue EOF ;
    public final EObject entryRuleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstantValue = null;


        try {
            // InternalMoba.g:1911:58: (iv_ruleMobaConstantValue= ruleMobaConstantValue EOF )
            // InternalMoba.g:1912:2: iv_ruleMobaConstantValue= ruleMobaConstantValue EOF
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
    // InternalMoba.g:1918:1: ruleMobaConstantValue returns [EObject current=null] : ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? ) ;
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
            // InternalMoba.g:1924:2: ( ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? ) )
            // InternalMoba.g:1925:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? )
            {
            // InternalMoba.g:1925:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? )
            // InternalMoba.g:1926:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )?
            {
            // InternalMoba.g:1926:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) )
            int alt30=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt30=1;
                }
                break;
            case RULE_INT:
                {
                alt30=2;
                }
                break;
            case RULE_DOUBLE:
                {
                alt30=3;
                }
                break;
            case RULE_CONSTANT:
                {
                alt30=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }

            switch (alt30) {
                case 1 :
                    // InternalMoba.g:1927:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:1927:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:1928:5: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:1928:5: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:1929:6: lv_valueString_0_0= RULE_STRING
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
                    // InternalMoba.g:1946:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    {
                    // InternalMoba.g:1946:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    // InternalMoba.g:1947:5: (lv_valueInt_1_0= RULE_INT )
                    {
                    // InternalMoba.g:1947:5: (lv_valueInt_1_0= RULE_INT )
                    // InternalMoba.g:1948:6: lv_valueInt_1_0= RULE_INT
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
                    // InternalMoba.g:1965:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:1965:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:1966:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:1966:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    // InternalMoba.g:1967:6: lv_valueDouble_2_0= RULE_DOUBLE
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
                    // InternalMoba.g:1984:4: ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* )
                    {
                    // InternalMoba.g:1984:4: ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* )
                    // InternalMoba.g:1985:5: ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )*
                    {
                    // InternalMoba.g:1985:5: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:1986:6: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:1986:6: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:1987:7: otherlv_3= RULE_CONSTANT
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

                    // InternalMoba.g:1998:5: (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )*
                    loop29:
                    do {
                        int alt29=2;
                        int LA29_0 = input.LA(1);

                        if ( (LA29_0==60) ) {
                            alt29=1;
                        }


                        switch (alt29) {
                    	case 1 :
                    	    // InternalMoba.g:1999:6: otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) )
                    	    {
                    	    otherlv_4=(Token)match(input,60,FOLLOW_42); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getMobaConstantValueAccess().getHyphenMinusGreaterThanSignKeyword_0_3_1_0());
                    	      					
                    	    }
                    	    // InternalMoba.g:2003:6: ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) )
                    	    // InternalMoba.g:2004:7: (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction )
                    	    {
                    	    // InternalMoba.g:2004:7: (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction )
                    	    // InternalMoba.g:2005:8: lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction
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
                    	    break loop29;
                        }
                    } while (true);


                    }


                    }
                    break;

            }

            // InternalMoba.g:2025:3: (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==61) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalMoba.g:2026:4: otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) )
                    {
                    otherlv_6=(Token)match(input,61,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMobaConstantValueAccess().getPlusSignKeyword_1_0());
                      			
                    }
                    // InternalMoba.g:2030:4: ( (lv_tail_7_0= ruleMobaConstantValue ) )
                    // InternalMoba.g:2031:5: (lv_tail_7_0= ruleMobaConstantValue )
                    {
                    // InternalMoba.g:2031:5: (lv_tail_7_0= ruleMobaConstantValue )
                    // InternalMoba.g:2032:6: lv_tail_7_0= ruleMobaConstantValue
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
    // InternalMoba.g:2055:1: ruleMobaFriendsAble[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) ) ;
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
            // InternalMoba.g:2061:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) ) )
            // InternalMoba.g:2062:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) )
            {
            // InternalMoba.g:2062:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) )
            // InternalMoba.g:2063:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2063:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) )
            // InternalMoba.g:2064:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());
            // InternalMoba.g:2067:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* )
            // InternalMoba.g:2068:5: ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )*
            {
            // InternalMoba.g:2068:5: ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )*
            loop34:
            do {
                int alt34=3;
                int LA34_0 = input.LA(1);

                if ( LA34_0 == 62 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0) ) {
                    alt34=1;
                }
                else if ( LA34_0 == 63 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1) ) {
                    alt34=2;
                }


                switch (alt34) {
            	case 1 :
            	    // InternalMoba.g:2069:3: ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2069:3: ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) )
            	    // InternalMoba.g:2070:4: {...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMoba.g:2070:109: ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) )
            	    // InternalMoba.g:2071:5: ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0);
            	    // InternalMoba.g:2074:8: ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) )
            	    // InternalMoba.g:2074:9: {...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "true");
            	    }
            	    // InternalMoba.g:2074:18: (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' )
            	    // InternalMoba.g:2074:19: otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')'
            	    {
            	    otherlv_1=(Token)match(input,62,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_1, grammarAccess.getMobaFriendsAbleAccess().getFriendsKeyword_0_0());
            	      							
            	    }
            	    otherlv_2=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_2, grammarAccess.getMobaFriendsAbleAccess().getLeftParenthesisKeyword_0_1());
            	      							
            	    }
            	    // InternalMoba.g:2082:8: ( (lv_friends_3_0= ruleMobaFriend ) )
            	    // InternalMoba.g:2083:9: (lv_friends_3_0= ruleMobaFriend )
            	    {
            	    // InternalMoba.g:2083:9: (lv_friends_3_0= ruleMobaFriend )
            	    // InternalMoba.g:2084:10: lv_friends_3_0= ruleMobaFriend
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

            	    // InternalMoba.g:2101:8: (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==33) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalMoba.g:2102:9: otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      									newLeafNode(otherlv_4, grammarAccess.getMobaFriendsAbleAccess().getCommaKeyword_0_3_0());
            	    	      								
            	    	    }
            	    	    // InternalMoba.g:2106:9: ( (lv_friends_5_0= ruleMobaFriend ) )
            	    	    // InternalMoba.g:2107:10: (lv_friends_5_0= ruleMobaFriend )
            	    	    {
            	    	    // InternalMoba.g:2107:10: (lv_friends_5_0= ruleMobaFriend )
            	    	    // InternalMoba.g:2108:11: lv_friends_5_0= ruleMobaFriend
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
            	    	    break loop32;
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
            	    // InternalMoba.g:2136:3: ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) )
            	    {
            	    // InternalMoba.g:2136:3: ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) )
            	    // InternalMoba.g:2137:4: {...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMoba.g:2137:109: ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) )
            	    // InternalMoba.g:2138:5: ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1);
            	    // InternalMoba.g:2141:8: ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) )
            	    // InternalMoba.g:2141:9: {...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "true");
            	    }
            	    // InternalMoba.g:2141:18: (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' )
            	    // InternalMoba.g:2141:19: otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']'
            	    {
            	    otherlv_7=(Token)match(input,63,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_7, grammarAccess.getMobaFriendsAbleAccess().getLeftSquareBracketKeyword_1_0());
            	      							
            	    }
            	    // InternalMoba.g:2145:8: ( (lv_properties_8_0= ruleMobaProperty ) )
            	    // InternalMoba.g:2146:9: (lv_properties_8_0= ruleMobaProperty )
            	    {
            	    // InternalMoba.g:2146:9: (lv_properties_8_0= ruleMobaProperty )
            	    // InternalMoba.g:2147:10: lv_properties_8_0= ruleMobaProperty
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

            	    // InternalMoba.g:2164:8: (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==33) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // InternalMoba.g:2165:9: otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      									newLeafNode(otherlv_9, grammarAccess.getMobaFriendsAbleAccess().getCommaKeyword_1_2_0());
            	    	      								
            	    	    }
            	    	    // InternalMoba.g:2169:9: ( (lv_properties_10_0= ruleMobaProperty ) )
            	    	    // InternalMoba.g:2170:10: (lv_properties_10_0= ruleMobaProperty )
            	    	    {
            	    	    // InternalMoba.g:2170:10: (lv_properties_10_0= ruleMobaProperty )
            	    	    // InternalMoba.g:2171:11: lv_properties_10_0= ruleMobaProperty
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
            	    	    break loop33;
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
            	    break loop34;
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
    // InternalMoba.g:2209:1: entryRuleMobaFriend returns [EObject current=null] : iv_ruleMobaFriend= ruleMobaFriend EOF ;
    public final EObject entryRuleMobaFriend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaFriend = null;


        try {
            // InternalMoba.g:2209:51: (iv_ruleMobaFriend= ruleMobaFriend EOF )
            // InternalMoba.g:2210:2: iv_ruleMobaFriend= ruleMobaFriend EOF
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
    // InternalMoba.g:2216:1: ruleMobaFriend returns [EObject current=null] : ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) ;
    public final EObject ruleMobaFriend() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:2222:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:2223:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
            {
            // InternalMoba.g:2223:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:2224:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2224:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2225:4: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2225:4: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:2226:5: lv_valueString_0_0= RULE_STRING
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
                    // InternalMoba.g:2243:3: ( (otherlv_1= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2243:3: ( (otherlv_1= RULE_CONSTANT ) )
                    // InternalMoba.g:2244:4: (otherlv_1= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2244:4: (otherlv_1= RULE_CONSTANT )
                    // InternalMoba.g:2245:5: otherlv_1= RULE_CONSTANT
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
    // InternalMoba.g:2260:1: entryRuleMobaProperty returns [EObject current=null] : iv_ruleMobaProperty= ruleMobaProperty EOF ;
    public final EObject entryRuleMobaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProperty = null;


        try {
            // InternalMoba.g:2260:53: (iv_ruleMobaProperty= ruleMobaProperty EOF )
            // InternalMoba.g:2261:2: iv_ruleMobaProperty= ruleMobaProperty EOF
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
    // InternalMoba.g:2267:1: ruleMobaProperty returns [EObject current=null] : ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaProperty() throws RecognitionException {
        EObject current = null;

        Token lv_keyString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_valueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:2273:2: ( ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:2274:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:2274:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:2275:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) )
            {
            // InternalMoba.g:2275:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:2276:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2276:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2277:5: (lv_keyString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2277:5: (lv_keyString_0_0= RULE_STRING )
                    // InternalMoba.g:2278:6: lv_keyString_0_0= RULE_STRING
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
                    // InternalMoba.g:2295:4: ( (otherlv_1= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2295:4: ( (otherlv_1= RULE_CONSTANT ) )
                    // InternalMoba.g:2296:5: (otherlv_1= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2296:5: (otherlv_1= RULE_CONSTANT )
                    // InternalMoba.g:2297:6: otherlv_1= RULE_CONSTANT
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
            // InternalMoba.g:2313:3: ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_STRING) ) {
                alt37=1;
            }
            else if ( (LA37_0==RULE_CONSTANT) ) {
                alt37=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // InternalMoba.g:2314:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2314:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    // InternalMoba.g:2315:5: (lv_valueString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:2315:5: (lv_valueString_3_0= RULE_STRING )
                    // InternalMoba.g:2316:6: lv_valueString_3_0= RULE_STRING
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
                    // InternalMoba.g:2333:4: ( (otherlv_4= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2333:4: ( (otherlv_4= RULE_CONSTANT ) )
                    // InternalMoba.g:2334:5: (otherlv_4= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2334:5: (otherlv_4= RULE_CONSTANT )
                    // InternalMoba.g:2335:6: otherlv_4= RULE_CONSTANT
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
    // InternalMoba.g:2351:1: entryRuleMobaData returns [EObject current=null] : iv_ruleMobaData= ruleMobaData EOF ;
    public final EObject entryRuleMobaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaData = null;


        try {
            // InternalMoba.g:2351:49: (iv_ruleMobaData= ruleMobaData EOF )
            // InternalMoba.g:2352:2: iv_ruleMobaData= ruleMobaData EOF
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
    // InternalMoba.g:2358:1: ruleMobaData returns [EObject current=null] : (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) ;
    public final EObject ruleMobaData() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntity_0 = null;

        EObject this_MobaDto_1 = null;

        EObject this_MobaQueue_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2364:2: ( (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) )
            // InternalMoba.g:2365:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            {
            // InternalMoba.g:2365:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            int alt38=3;
            switch ( input.LA(1) ) {
            case 70:
                {
                alt38=1;
                }
                break;
            case 73:
                {
                alt38=2;
                }
                break;
            case 74:
                {
                alt38=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;
            }

            switch (alt38) {
                case 1 :
                    // InternalMoba.g:2366:3: this_MobaEntity_0= ruleMobaEntity
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
                    // InternalMoba.g:2375:3: this_MobaDto_1= ruleMobaDto
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
                    // InternalMoba.g:2384:3: this_MobaQueue_2= ruleMobaQueue
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
    // InternalMoba.g:2396:1: entryRuleMobaSettings returns [EObject current=null] : iv_ruleMobaSettings= ruleMobaSettings EOF ;
    public final EObject entryRuleMobaSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettings = null;


        try {
            // InternalMoba.g:2396:53: (iv_ruleMobaSettings= ruleMobaSettings EOF )
            // InternalMoba.g:2397:2: iv_ruleMobaSettings= ruleMobaSettings EOF
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
    // InternalMoba.g:2403:1: ruleMobaSettings returns [EObject current=null] : ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) ;
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
            // InternalMoba.g:2409:2: ( ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:2410:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:2410:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:2411:3: () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}'
            {
            // InternalMoba.g:2411:3: ()
            // InternalMoba.g:2412:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0(),
              					current);
              			
            }

            }

            // InternalMoba.g:2418:3: ( (lv_active_1_0= 'active' ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==37) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoba.g:2419:4: (lv_active_1_0= 'active' )
                    {
                    // InternalMoba.g:2419:4: (lv_active_1_0= 'active' )
                    // InternalMoba.g:2420:5: lv_active_1_0= 'active'
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
            // InternalMoba.g:2436:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMoba.g:2437:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMoba.g:2437:4: (lv_name_3_0= RULE_ID )
            // InternalMoba.g:2438:5: lv_name_3_0= RULE_ID
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

            // InternalMoba.g:2454:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==30) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalMoba.g:2455:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaSettingsAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalMoba.g:2459:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMoba.g:2460:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMoba.g:2460:5: (otherlv_5= RULE_ID )
                    // InternalMoba.g:2461:6: otherlv_5= RULE_ID
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
            // InternalMoba.g:2488:3: ( (lv_features_8_0= ruleMobaSettingsFeature ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==88||LA41_0==94) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalMoba.g:2489:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    {
            	    // InternalMoba.g:2489:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    // InternalMoba.g:2490:5: lv_features_8_0= ruleMobaSettingsFeature
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
            	    break loop41;
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
    // InternalMoba.g:2515:1: entryRuleMobaCache returns [EObject current=null] : iv_ruleMobaCache= ruleMobaCache EOF ;
    public final EObject entryRuleMobaCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaCache = null;


        try {
            // InternalMoba.g:2515:50: (iv_ruleMobaCache= ruleMobaCache EOF )
            // InternalMoba.g:2516:2: iv_ruleMobaCache= ruleMobaCache EOF
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
    // InternalMoba.g:2522:1: ruleMobaCache returns [EObject current=null] : ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_16= ')' )? ) ;
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
        Token otherlv_13=null;
        Token lv_cacheIntervalInt_14_0=null;
        Token otherlv_15=null;
        Token otherlv_16=null;


        	enterRule();

        try {
            // InternalMoba.g:2528:2: ( ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_16= ')' )? ) )
            // InternalMoba.g:2529:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_16= ')' )? )
            {
            // InternalMoba.g:2529:2: ( () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_16= ')' )? )
            // InternalMoba.g:2530:3: () otherlv_1= 'cache' (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_16= ')' )?
            {
            // InternalMoba.g:2530:3: ()
            // InternalMoba.g:2531:4: 
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
            // InternalMoba.g:2541:3: (otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_16= ')' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==32) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalMoba.g:2542:4: otherlv_2= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) ) ) otherlv_16= ')'
                    {
                    otherlv_2=(Token)match(input,32,FOLLOW_48); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:2546:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalMoba.g:2547:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalMoba.g:2547:5: ( ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?) )
                    // InternalMoba.g:2548:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?)
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());
                    // InternalMoba.g:2551:6: ( ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?)
                    // InternalMoba.g:2552:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalMoba.g:2552:7: ( ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) ) )+
                    int cnt45=0;
                    loop45:
                    do {
                        int alt45=4;
                        int LA45_0 = input.LA(1);

                        if ( LA45_0 == 67 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                            alt45=1;
                        }
                        else if ( LA45_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                            alt45=2;
                        }
                        else if ( LA45_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 2) ) {
                            alt45=3;
                        }


                        switch (alt45) {
                    	case 1 :
                    	    // InternalMoba.g:2553:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2553:5: ({...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) ) )
                    	    // InternalMoba.g:2554:6: {...}? => ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0)");
                    	    }
                    	    // InternalMoba.g:2554:109: ( ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2555:7: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 0);
                    	    // InternalMoba.g:2558:10: ({...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2558:11: {...}? => (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2558:20: (otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2558:21: otherlv_4= 'type' otherlv_5= '=' ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) )
                    	    {
                    	    otherlv_4=(Token)match(input,67,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_4, grammarAccess.getMobaCacheAccess().getTypeKeyword_2_1_0_0());
                    	      									
                    	    }
                    	    otherlv_5=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_5, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_0_1());
                    	      									
                    	    }
                    	    // InternalMoba.g:2566:10: ( ( (lv_cacheTypeString_6_0= RULE_STRING ) ) | ( (otherlv_7= RULE_CONSTANT ) ) )
                    	    int alt42=2;
                    	    int LA42_0 = input.LA(1);

                    	    if ( (LA42_0==RULE_STRING) ) {
                    	        alt42=1;
                    	    }
                    	    else if ( (LA42_0==RULE_CONSTANT) ) {
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
                    	            // InternalMoba.g:2567:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:2567:11: ( (lv_cacheTypeString_6_0= RULE_STRING ) )
                    	            // InternalMoba.g:2568:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:2568:12: (lv_cacheTypeString_6_0= RULE_STRING )
                    	            // InternalMoba.g:2569:13: lv_cacheTypeString_6_0= RULE_STRING
                    	            {
                    	            lv_cacheTypeString_6_0=(Token)match(input,RULE_STRING,FOLLOW_49); if (state.failed) return current;
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
                    	            // InternalMoba.g:2586:11: ( (otherlv_7= RULE_CONSTANT ) )
                    	            {
                    	            // InternalMoba.g:2586:11: ( (otherlv_7= RULE_CONSTANT ) )
                    	            // InternalMoba.g:2587:12: (otherlv_7= RULE_CONSTANT )
                    	            {
                    	            // InternalMoba.g:2587:12: (otherlv_7= RULE_CONSTANT )
                    	            // InternalMoba.g:2588:13: otherlv_7= RULE_CONSTANT
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              												
                    	            }
                    	            otherlv_7=(Token)match(input,RULE_CONSTANT,FOLLOW_49); if (state.failed) return current;
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
                    	    // InternalMoba.g:2606:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2606:5: ({...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) ) )
                    	    // InternalMoba.g:2607:6: {...}? => ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1)");
                    	    }
                    	    // InternalMoba.g:2607:109: ( ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2608:7: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 1);
                    	    // InternalMoba.g:2611:10: ({...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2611:11: {...}? => (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2611:20: (otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2611:21: otherlv_8= 'strategy' otherlv_9= '=' ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) )
                    	    {
                    	    otherlv_8=(Token)match(input,68,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_8, grammarAccess.getMobaCacheAccess().getStrategyKeyword_2_1_1_0());
                    	      									
                    	    }
                    	    otherlv_9=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_9, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_1_1());
                    	      									
                    	    }
                    	    // InternalMoba.g:2619:10: ( ( (lv_cacheStrategyString_10_0= RULE_STRING ) ) | ( (otherlv_11= RULE_CONSTANT ) ) )
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==RULE_STRING) ) {
                    	        alt43=1;
                    	    }
                    	    else if ( (LA43_0==RULE_CONSTANT) ) {
                    	        alt43=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 43, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt43) {
                    	        case 1 :
                    	            // InternalMoba.g:2620:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:2620:11: ( (lv_cacheStrategyString_10_0= RULE_STRING ) )
                    	            // InternalMoba.g:2621:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:2621:12: (lv_cacheStrategyString_10_0= RULE_STRING )
                    	            // InternalMoba.g:2622:13: lv_cacheStrategyString_10_0= RULE_STRING
                    	            {
                    	            lv_cacheStrategyString_10_0=(Token)match(input,RULE_STRING,FOLLOW_49); if (state.failed) return current;
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
                    	            // InternalMoba.g:2639:11: ( (otherlv_11= RULE_CONSTANT ) )
                    	            {
                    	            // InternalMoba.g:2639:11: ( (otherlv_11= RULE_CONSTANT ) )
                    	            // InternalMoba.g:2640:12: (otherlv_11= RULE_CONSTANT )
                    	            {
                    	            // InternalMoba.g:2640:12: (otherlv_11= RULE_CONSTANT )
                    	            // InternalMoba.g:2641:13: otherlv_11= RULE_CONSTANT
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              												
                    	            }
                    	            otherlv_11=(Token)match(input,RULE_CONSTANT,FOLLOW_49); if (state.failed) return current;
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
                    	case 3 :
                    	    // InternalMoba.g:2659:5: ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2659:5: ({...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) ) )
                    	    // InternalMoba.g:2660:6: {...}? => ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 2) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 2)");
                    	    }
                    	    // InternalMoba.g:2660:109: ( ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2661:7: ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1(), 2);
                    	    // InternalMoba.g:2664:10: ({...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2664:11: {...}? => (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2664:20: (otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2664:21: otherlv_12= 'interval' otherlv_13= '=' ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) )
                    	    {
                    	    otherlv_12=(Token)match(input,69,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_12, grammarAccess.getMobaCacheAccess().getIntervalKeyword_2_1_2_0());
                    	      									
                    	    }
                    	    otherlv_13=(Token)match(input,22,FOLLOW_50); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_13, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_2_1_2_1());
                    	      									
                    	    }
                    	    // InternalMoba.g:2672:10: ( ( (lv_cacheIntervalInt_14_0= RULE_INT ) ) | ( (otherlv_15= RULE_CONSTANT ) ) )
                    	    int alt44=2;
                    	    int LA44_0 = input.LA(1);

                    	    if ( (LA44_0==RULE_INT) ) {
                    	        alt44=1;
                    	    }
                    	    else if ( (LA44_0==RULE_CONSTANT) ) {
                    	        alt44=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 44, 0, input);

                    	        throw nvae;
                    	    }
                    	    switch (alt44) {
                    	        case 1 :
                    	            // InternalMoba.g:2673:11: ( (lv_cacheIntervalInt_14_0= RULE_INT ) )
                    	            {
                    	            // InternalMoba.g:2673:11: ( (lv_cacheIntervalInt_14_0= RULE_INT ) )
                    	            // InternalMoba.g:2674:12: (lv_cacheIntervalInt_14_0= RULE_INT )
                    	            {
                    	            // InternalMoba.g:2674:12: (lv_cacheIntervalInt_14_0= RULE_INT )
                    	            // InternalMoba.g:2675:13: lv_cacheIntervalInt_14_0= RULE_INT
                    	            {
                    	            lv_cacheIntervalInt_14_0=(Token)match(input,RULE_INT,FOLLOW_49); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(lv_cacheIntervalInt_14_0, grammarAccess.getMobaCacheAccess().getCacheIntervalIntINTTerminalRuleCall_2_1_2_2_0_0());
                    	              												
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              													setWithLastConsumed(
                    	              														current,
                    	              														"cacheIntervalInt",
                    	              														lv_cacheIntervalInt_14_0,
                    	              														"org.mobadsl.grammar.Moba.INT");
                    	              												
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:2692:11: ( (otherlv_15= RULE_CONSTANT ) )
                    	            {
                    	            // InternalMoba.g:2692:11: ( (otherlv_15= RULE_CONSTANT ) )
                    	            // InternalMoba.g:2693:12: (otherlv_15= RULE_CONSTANT )
                    	            {
                    	            // InternalMoba.g:2693:12: (otherlv_15= RULE_CONSTANT )
                    	            // InternalMoba.g:2694:13: otherlv_15= RULE_CONSTANT
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              												
                    	            }
                    	            otherlv_15=(Token)match(input,RULE_CONSTANT,FOLLOW_49); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(otherlv_15, grammarAccess.getMobaCacheAccess().getCacheIntervalConstMobaConstantCrossReference_2_1_2_2_1_0());
                    	              												
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
                    	    if ( cnt45 >= 1 ) break loop45;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(45, input);
                                throw eee;
                        }
                        cnt45++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1()) ) {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canLeave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1())");
                    }

                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_2_1());

                    }

                    otherlv_16=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getMobaCacheAccess().getRightParenthesisKeyword_2_2());
                      			
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
    // InternalMoba.g:2729:1: entryRuleMobaEntity returns [EObject current=null] : iv_ruleMobaEntity= ruleMobaEntity EOF ;
    public final EObject entryRuleMobaEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntity = null;


        try {
            // InternalMoba.g:2729:51: (iv_ruleMobaEntity= ruleMobaEntity EOF )
            // InternalMoba.g:2730:2: iv_ruleMobaEntity= ruleMobaEntity EOF
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
    // InternalMoba.g:2736:1: ruleMobaEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_indizes_9_0= ruleMobaEntityIndex ) )* otherlv_10= '}' ) ;
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

        EObject lv_indizes_9_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2742:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_indizes_9_0= ruleMobaEntityIndex ) )* otherlv_10= '}' ) )
            // InternalMoba.g:2743:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_indizes_9_0= ruleMobaEntityIndex ) )* otherlv_10= '}' )
            {
            // InternalMoba.g:2743:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_indizes_9_0= ruleMobaEntityIndex ) )* otherlv_10= '}' )
            // InternalMoba.g:2744:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaEntityFeature ) )* ( (lv_indizes_9_0= ruleMobaEntityIndex ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAccess().getEntityKeyword_0());
              		
            }
            // InternalMoba.g:2748:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2749:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2749:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2750:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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

            // InternalMoba.g:2766:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) ) )
            // InternalMoba.g:2767:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:2767:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* ) )
            // InternalMoba.g:2768:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            // InternalMoba.g:2771:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )* )
            // InternalMoba.g:2772:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            {
            // InternalMoba.g:2772:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) ) )*
            loop47:
            do {
                int alt47=3;
                int LA47_0 = input.LA(1);

                if ( LA47_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
                    alt47=1;
                }
                else if ( LA47_0 == 66 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
                    alt47=2;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMoba.g:2773:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:2773:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:2774:5: {...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoba.g:2774:107: ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:2775:6: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0);
            	    // InternalMoba.g:2778:9: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalMoba.g:2778:10: {...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:2778:19: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalMoba.g:2778:20: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getMobaEntityAccess().getExtendsKeyword_2_0_0());
            	      								
            	    }
            	    // InternalMoba.g:2782:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalMoba.g:2783:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMoba.g:2783:10: (otherlv_4= RULE_ID )
            	    // InternalMoba.g:2784:11: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaEntityRule());
            	      											}
            	      										
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_51); if (state.failed) return current;
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
            	    // InternalMoba.g:2801:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    {
            	    // InternalMoba.g:2801:4: ({...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) ) )
            	    // InternalMoba.g:2802:5: {...}? => ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoba.g:2802:107: ( ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) ) )
            	    // InternalMoba.g:2803:6: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1);
            	    // InternalMoba.g:2806:9: ({...}? => ( (lv_cache_5_0= ruleMobaCache ) ) )
            	    // InternalMoba.g:2806:10: {...}? => ( (lv_cache_5_0= ruleMobaCache ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:2806:19: ( (lv_cache_5_0= ruleMobaCache ) )
            	    // InternalMoba.g:2806:20: (lv_cache_5_0= ruleMobaCache )
            	    {
            	    // InternalMoba.g:2806:20: (lv_cache_5_0= ruleMobaCache )
            	    // InternalMoba.g:2807:10: lv_cache_5_0= ruleMobaCache
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getMobaEntityAccess().getCacheMobaCacheParserRuleCall_2_1_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_51);
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
            	    break loop47;
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
            otherlv_7=(Token)match(input,23,FOLLOW_52); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaEntityAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:2851:3: ( (lv_features_8_0= ruleMobaEntityFeature ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==88||LA48_0==96||LA48_0==98) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMoba.g:2852:4: (lv_features_8_0= ruleMobaEntityFeature )
            	    {
            	    // InternalMoba.g:2852:4: (lv_features_8_0= ruleMobaEntityFeature )
            	    // InternalMoba.g:2853:5: lv_features_8_0= ruleMobaEntityFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaEntityAccess().getFeaturesMobaEntityFeatureParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_52);
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
            	    break loop48;
                }
            } while (true);

            // InternalMoba.g:2870:3: ( (lv_indizes_9_0= ruleMobaEntityIndex ) )*
            loop49:
            do {
                int alt49=2;
                int LA49_0 = input.LA(1);

                if ( ((LA49_0>=71 && LA49_0<=72)) ) {
                    alt49=1;
                }


                switch (alt49) {
            	case 1 :
            	    // InternalMoba.g:2871:4: (lv_indizes_9_0= ruleMobaEntityIndex )
            	    {
            	    // InternalMoba.g:2871:4: (lv_indizes_9_0= ruleMobaEntityIndex )
            	    // InternalMoba.g:2872:5: lv_indizes_9_0= ruleMobaEntityIndex
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaEntityAccess().getIndizesMobaEntityIndexParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_indizes_9_0=ruleMobaEntityIndex();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMobaEntityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"indizes",
            	      						lv_indizes_9_0,
            	      						"org.mobadsl.grammar.Moba.MobaEntityIndex");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop49;
                }
            } while (true);

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
    // InternalMoba.g:2897:1: entryRuleMobaEntityIndex returns [EObject current=null] : iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF ;
    public final EObject entryRuleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityIndex = null;


        try {
            // InternalMoba.g:2897:56: (iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF )
            // InternalMoba.g:2898:2: iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF
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
    // InternalMoba.g:2904:1: ruleMobaEntityIndex returns [EObject current=null] : ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) ;
    public final EObject ruleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        Token lv_unique_0_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalMoba.g:2910:2: ( ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) )
            // InternalMoba.g:2911:2: ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            {
            // InternalMoba.g:2911:2: ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            // InternalMoba.g:2912:3: ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
            {
            // InternalMoba.g:2912:3: ( (lv_unique_0_0= 'unique' ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==71) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalMoba.g:2913:4: (lv_unique_0_0= 'unique' )
                    {
                    // InternalMoba.g:2913:4: (lv_unique_0_0= 'unique' )
                    // InternalMoba.g:2914:5: lv_unique_0_0= 'unique'
                    {
                    lv_unique_0_0=(Token)match(input,71,FOLLOW_54); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_unique_0_0, grammarAccess.getMobaEntityIndexAccess().getUniqueUniqueKeyword_0_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMobaEntityIndexRule());
                      					}
                      					setWithLastConsumed(current, "unique", true, "unique");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,72,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaEntityIndexAccess().getIndexKeyword_1());
              		
            }
            // InternalMoba.g:2930:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:2931:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:2931:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:2932:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getMobaEntityIndexAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityIndexRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            otherlv_3=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaEntityIndexAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalMoba.g:2952:3: ( (otherlv_4= RULE_ID ) )
            // InternalMoba.g:2953:4: (otherlv_4= RULE_ID )
            {
            // InternalMoba.g:2953:4: (otherlv_4= RULE_ID )
            // InternalMoba.g:2954:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityIndexRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_4_0());
              				
            }

            }


            }

            // InternalMoba.g:2965:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==33) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalMoba.g:2966:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getMobaEntityIndexAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalMoba.g:2970:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalMoba.g:2971:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMoba.g:2971:5: (otherlv_6= RULE_ID )
            	    // InternalMoba.g:2972:6: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMobaEntityIndexRule());
            	      						}
            	      					
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_6, grammarAccess.getMobaEntityIndexAccess().getAttributesMobaEntityAttributeCrossReference_5_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            otherlv_7=(Token)match(input,34,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaEntityIndexAccess().getRightParenthesisKeyword_6());
              		
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
    // InternalMoba.g:2992:1: entryRuleMobaDto returns [EObject current=null] : iv_ruleMobaDto= ruleMobaDto EOF ;
    public final EObject entryRuleMobaDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDto = null;


        try {
            // InternalMoba.g:2992:48: (iv_ruleMobaDto= ruleMobaDto EOF )
            // InternalMoba.g:2993:2: iv_ruleMobaDto= ruleMobaDto EOF
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
    // InternalMoba.g:2999:1: ruleMobaDto returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' ) ;
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
            // InternalMoba.g:3005:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:3006:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:3006:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:3007:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaDtoFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAccess().getDtoKeyword_0());
              		
            }
            // InternalMoba.g:3011:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:3012:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:3012:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:3013:5: lv_name_1_0= RULE_ID
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

            // InternalMoba.g:3029:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==30) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMoba.g:3030:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaDtoAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:3034:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3035:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3035:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3036:6: otherlv_3= RULE_ID
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
            otherlv_5=(Token)match(input,23,FOLLOW_55); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaDtoAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:3063:3: ( (lv_features_6_0= ruleMobaDtoFeature ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==88||LA53_0==96||LA53_0==98) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMoba.g:3064:4: (lv_features_6_0= ruleMobaDtoFeature )
            	    {
            	    // InternalMoba.g:3064:4: (lv_features_6_0= ruleMobaDtoFeature )
            	    // InternalMoba.g:3065:5: lv_features_6_0= ruleMobaDtoFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaDtoAccess().getFeaturesMobaDtoFeatureParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_55);
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
            	    break loop53;
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
    // InternalMoba.g:3090:1: entryRuleMobaQueue returns [EObject current=null] : iv_ruleMobaQueue= ruleMobaQueue EOF ;
    public final EObject entryRuleMobaQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueue = null;


        try {
            // InternalMoba.g:3090:50: (iv_ruleMobaQueue= ruleMobaQueue EOF )
            // InternalMoba.g:3091:2: iv_ruleMobaQueue= ruleMobaQueue EOF
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
    // InternalMoba.g:3097:1: ruleMobaQueue returns [EObject current=null] : (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) ;
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
            // InternalMoba.g:3103:2: ( (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' ) )
            // InternalMoba.g:3104:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            {
            // InternalMoba.g:3104:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}' )
            // InternalMoba.g:3105:3: otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' ( (lv_features_6_0= ruleMobaQueueFeature ) )* otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,74,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaQueueAccess().getQueueKeyword_0());
              		
            }
            // InternalMoba.g:3109:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:3110:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:3110:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:3111:5: lv_name_1_0= RULE_ID
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

            // InternalMoba.g:3127:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==30) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoba.g:3128:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:3132:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3133:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3133:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3134:6: otherlv_3= RULE_ID
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
            otherlv_5=(Token)match(input,23,FOLLOW_56); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:3161:3: ( (lv_features_6_0= ruleMobaQueueFeature ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==96) ) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // InternalMoba.g:3162:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    {
            	    // InternalMoba.g:3162:4: (lv_features_6_0= ruleMobaQueueFeature )
            	    // InternalMoba.g:3163:5: lv_features_6_0= ruleMobaQueueFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_56);
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
            	    break loop55;
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
    // InternalMoba.g:3188:1: entryRuleMobaREST returns [EObject current=null] : iv_ruleMobaREST= ruleMobaREST EOF ;
    public final EObject entryRuleMobaREST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaREST = null;


        try {
            // InternalMoba.g:3188:49: (iv_ruleMobaREST= ruleMobaREST EOF )
            // InternalMoba.g:3189:2: iv_ruleMobaREST= ruleMobaREST EOF
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
    // InternalMoba.g:3195:1: ruleMobaREST returns [EObject current=null] : (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow ) ;
    public final EObject ruleMobaREST() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRESTCustomService_0 = null;

        EObject this_MobaRESTCrud_1 = null;

        EObject this_MobaRESTWorkflow_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:3201:2: ( (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow ) )
            // InternalMoba.g:3202:2: (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow )
            {
            // InternalMoba.g:3202:2: (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow )
            int alt56=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt56=1;
                }
                break;
            case 85:
                {
                alt56=2;
                }
                break;
            case 86:
                {
                alt56=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }

            switch (alt56) {
                case 1 :
                    // InternalMoba.g:3203:3: this_MobaRESTCustomService_0= ruleMobaRESTCustomService
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
                    // InternalMoba.g:3212:3: this_MobaRESTCrud_1= ruleMobaRESTCrud
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
                    // InternalMoba.g:3221:3: this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow
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
    // InternalMoba.g:3233:1: entryRuleMobaRESTCustomService returns [EObject current=null] : iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF ;
    public final EObject entryRuleMobaRESTCustomService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTCustomService = null;


        try {
            // InternalMoba.g:3233:62: (iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF )
            // InternalMoba.g:3234:2: iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF
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
    // InternalMoba.g:3240:1: ruleMobaRESTCustomService returns [EObject current=null] : (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}' ) ;
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
            // InternalMoba.g:3246:2: ( (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}' ) )
            // InternalMoba.g:3247:2: (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}' )
            {
            // InternalMoba.g:3247:2: (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}' )
            // InternalMoba.g:3248:3: otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_28= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRESTCustomServiceAccess().getRestKeyword_0());
              		
            }
            // InternalMoba.g:3252:3: ( (lv_bigData_1_0= 'bigData' ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==76) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // InternalMoba.g:3253:4: (lv_bigData_1_0= 'bigData' )
                    {
                    // InternalMoba.g:3253:4: (lv_bigData_1_0= 'bigData' )
                    // InternalMoba.g:3254:5: lv_bigData_1_0= 'bigData'
                    {
                    lv_bigData_1_0=(Token)match(input,76,FOLLOW_4); if (state.failed) return current;
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

            // InternalMoba.g:3266:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:3267:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:3267:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:3268:5: lv_name_2_0= RULE_ID
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

            // InternalMoba.g:3284:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==30) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMoba.g:3285:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMobaRESTCustomServiceAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:3289:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMoba.g:3290:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMoba.g:3290:5: (otherlv_4= RULE_ID )
                    // InternalMoba.g:3291:6: otherlv_4= RULE_ID
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
            otherlv_6=(Token)match(input,23,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalMoba.g:3318:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3319:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3319:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) )
            // InternalMoba.g:3320:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            // InternalMoba.g:3323:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )* )
            // InternalMoba.g:3324:6: ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )*
            {
            // InternalMoba.g:3324:6: ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) ) )*
            loop61:
            do {
                int alt61=7;
                int LA61_0 = input.LA(1);

                if ( LA61_0 == 77 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0) ) {
                    alt61=1;
                }
                else if ( LA61_0 == 78 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1) ) {
                    alt61=2;
                }
                else if ( LA61_0 == 79 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2) ) {
                    alt61=3;
                }
                else if ( LA61_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3) ) {
                    alt61=4;
                }
                else if ( LA61_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4) ) {
                    alt61=5;
                }
                else if ( LA61_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5) ) {
                    alt61=6;
                }


                switch (alt61) {
            	case 1 :
            	    // InternalMoba.g:3325:4: ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalMoba.g:3325:4: ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) )
            	    // InternalMoba.g:3326:5: {...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalMoba.g:3326:118: ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) )
            	    // InternalMoba.g:3327:6: ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0);
            	    // InternalMoba.g:3330:9: ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) )
            	    // InternalMoba.g:3330:10: {...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3330:19: (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' )
            	    // InternalMoba.g:3330:20: otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}'
            	    {
            	    otherlv_8=(Token)match(input,77,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getMobaRESTCustomServiceAccess().getHeadersKeyword_6_0_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,23,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_6_0_1());
            	      								
            	    }
            	    // InternalMoba.g:3338:9: ( (lv_headers_10_0= ruleMobaRestHeader ) )*
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==84) ) {
            	            alt59=1;
            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // InternalMoba.g:3339:10: (lv_headers_10_0= ruleMobaRestHeader )
            	    	    {
            	    	    // InternalMoba.g:3339:10: (lv_headers_10_0= ruleMobaRestHeader )
            	    	    // InternalMoba.g:3340:11: lv_headers_10_0= ruleMobaRestHeader
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getHeadersMobaRestHeaderParserRuleCall_6_0_2_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_59);
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
            	    	    break loop59;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,26,FOLLOW_58); if (state.failed) return current;
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
            	    // InternalMoba.g:3367:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) )
            	    {
            	    // InternalMoba.g:3367:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) )
            	    // InternalMoba.g:3368:5: {...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalMoba.g:3368:118: ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) )
            	    // InternalMoba.g:3369:6: ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1);
            	    // InternalMoba.g:3372:9: ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) )
            	    // InternalMoba.g:3372:10: {...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3372:19: (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' )
            	    // InternalMoba.g:3372:20: otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}'
            	    {
            	    otherlv_12=(Token)match(input,78,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getMobaRESTCustomServiceAccess().getParametersKeyword_6_1_0());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,23,FOLLOW_59); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_6_1_1());
            	      								
            	    }
            	    // InternalMoba.g:3380:9: ( (lv_parameters_14_0= ruleMobaRestParameter ) )*
            	    loop60:
            	    do {
            	        int alt60=2;
            	        int LA60_0 = input.LA(1);

            	        if ( (LA60_0==84) ) {
            	            alt60=1;
            	        }


            	        switch (alt60) {
            	    	case 1 :
            	    	    // InternalMoba.g:3381:10: (lv_parameters_14_0= ruleMobaRestParameter )
            	    	    {
            	    	    // InternalMoba.g:3381:10: (lv_parameters_14_0= ruleMobaRestParameter )
            	    	    // InternalMoba.g:3382:11: lv_parameters_14_0= ruleMobaRestParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getParametersMobaRestParameterParserRuleCall_6_1_2_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_59);
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
            	    	    break loop60;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,26,FOLLOW_58); if (state.failed) return current;
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
            	    // InternalMoba.g:3409:4: ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3409:4: ({...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3410:5: {...}? => ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalMoba.g:3410:118: ( ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3411:6: ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2);
            	    // InternalMoba.g:3414:9: ({...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3414:10: {...}? => (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3414:19: (otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3414:20: otherlv_16= 'requestDto' otherlv_17= '=' ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_16=(Token)match(input,79,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_16, grammarAccess.getMobaRESTCustomServiceAccess().getRequestDtoKeyword_6_2_0());
            	      								
            	    }
            	    otherlv_17=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_17, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_2_1());
            	      								
            	    }
            	    // InternalMoba.g:3422:9: ( (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3423:10: (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3423:10: (lv_requestDto_18_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3424:11: lv_requestDto_18_0= ruleMobaRESTPayloadDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getRequestDtoMobaRESTPayloadDefinitionParserRuleCall_6_2_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_58);
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
            	    // InternalMoba.g:3447:4: ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3447:4: ({...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3448:5: {...}? => ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalMoba.g:3448:118: ( ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3449:6: ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3);
            	    // InternalMoba.g:3452:9: ({...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3452:10: {...}? => (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3452:19: (otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3452:20: otherlv_19= 'responseDto' otherlv_20= '=' ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_19=(Token)match(input,80,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_19, grammarAccess.getMobaRESTCustomServiceAccess().getResponseDtoKeyword_6_3_0());
            	      								
            	    }
            	    otherlv_20=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_20, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_3_1());
            	      								
            	    }
            	    // InternalMoba.g:3460:9: ( (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3461:10: (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3461:10: (lv_responseDto_21_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3462:11: lv_responseDto_21_0= ruleMobaRESTPayloadDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getResponseDtoMobaRESTPayloadDefinitionParserRuleCall_6_3_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_58);
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
            	    // InternalMoba.g:3485:4: ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3485:4: ({...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3486:5: {...}? => ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalMoba.g:3486:118: ( ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3487:6: ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4);
            	    // InternalMoba.g:3490:9: ({...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3490:10: {...}? => (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3490:19: (otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3490:20: otherlv_22= 'errorDto' otherlv_23= '=' ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_22=(Token)match(input,81,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_22, grammarAccess.getMobaRESTCustomServiceAccess().getErrorDtoKeyword_6_4_0());
            	      								
            	    }
            	    otherlv_23=(Token)match(input,22,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_23, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_4_1());
            	      								
            	    }
            	    // InternalMoba.g:3498:9: ( (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3499:10: (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3499:10: (lv_errorDto_24_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3500:11: lv_errorDto_24_0= ruleMobaRESTPayloadDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getErrorDtoMobaRESTPayloadDefinitionParserRuleCall_6_4_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_58);
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
            	    // InternalMoba.g:3523:4: ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3523:4: ({...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) ) )
            	    // InternalMoba.g:3524:5: {...}? => ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalMoba.g:3524:118: ( ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) ) )
            	    // InternalMoba.g:3525:6: ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5);
            	    // InternalMoba.g:3528:9: ({...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) ) )
            	    // InternalMoba.g:3528:10: {...}? => (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3528:19: (otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) ) )
            	    // InternalMoba.g:3528:20: otherlv_25= 'method' otherlv_26= '=' ( (lv_operation_27_0= ruleMobaRESTMethods ) )
            	    {
            	    otherlv_25=(Token)match(input,82,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_25, grammarAccess.getMobaRESTCustomServiceAccess().getMethodKeyword_6_5_0());
            	      								
            	    }
            	    otherlv_26=(Token)match(input,22,FOLLOW_60); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_26, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_5_1());
            	      								
            	    }
            	    // InternalMoba.g:3536:9: ( (lv_operation_27_0= ruleMobaRESTMethods ) )
            	    // InternalMoba.g:3537:10: (lv_operation_27_0= ruleMobaRESTMethods )
            	    {
            	    // InternalMoba.g:3537:10: (lv_operation_27_0= ruleMobaRESTMethods )
            	    // InternalMoba.g:3538:11: lv_operation_27_0= ruleMobaRESTMethods
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getOperationMobaRESTMethodsEnumRuleCall_6_5_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_58);
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
            	    break loop61;
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
    // InternalMoba.g:3576:1: entryRuleMobaRESTPayloadDefinition returns [EObject current=null] : iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF ;
    public final EObject entryRuleMobaRESTPayloadDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTPayloadDefinition = null;


        try {
            // InternalMoba.g:3576:66: (iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF )
            // InternalMoba.g:3577:2: iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF
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
    // InternalMoba.g:3583:1: ruleMobaRESTPayloadDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleMobaRESTPayloadDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:3589:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalMoba.g:3590:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalMoba.g:3590:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) )
            // InternalMoba.g:3591:3: ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) )
            {
            // InternalMoba.g:3591:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoba.g:3592:4: (otherlv_0= RULE_ID )
            {
            // InternalMoba.g:3592:4: (otherlv_0= RULE_ID )
            // InternalMoba.g:3593:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getMobaRESTPayloadDefinitionAccess().getDtoMobaDtoCrossReference_0_0());
              				
            }

            }


            }

            // InternalMoba.g:3604:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3605:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3605:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) )
            // InternalMoba.g:3606:5: ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1());
            // InternalMoba.g:3609:5: ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* )
            // InternalMoba.g:3610:6: ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )*
            {
            // InternalMoba.g:3610:6: ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )*
            loop62:
            do {
                int alt62=3;
                int LA62_0 = input.LA(1);

                if ( LA62_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0) ) {
                    alt62=1;
                }
                else if ( LA62_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1) ) {
                    alt62=2;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalMoba.g:3611:4: ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3611:4: ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:3612:5: {...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3612:122: ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:3613:6: ({...}? => ( (lv_array_2_0= 'isArray' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:3616:9: ({...}? => ( (lv_array_2_0= 'isArray' ) ) )
            	    // InternalMoba.g:3616:10: {...}? => ( (lv_array_2_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "true");
            	    }
            	    // InternalMoba.g:3616:19: ( (lv_array_2_0= 'isArray' ) )
            	    // InternalMoba.g:3616:20: (lv_array_2_0= 'isArray' )
            	    {
            	    // InternalMoba.g:3616:20: (lv_array_2_0= 'isArray' )
            	    // InternalMoba.g:3617:10: lv_array_2_0= 'isArray'
            	    {
            	    lv_array_2_0=(Token)match(input,45,FOLLOW_61); if (state.failed) return current;
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
            	    // InternalMoba.g:3634:4: ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3634:4: ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) )
            	    // InternalMoba.g:3635:5: {...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3635:122: ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            	    // InternalMoba.g:3636:6: ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:3639:9: ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) )
            	    // InternalMoba.g:3639:10: {...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "true");
            	    }
            	    // InternalMoba.g:3639:19: (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) )
            	    // InternalMoba.g:3639:20: otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) )
            	    {
            	    otherlv_3=(Token)match(input,83,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getMobaRESTPayloadDefinitionAccess().getAsKeyword_1_1_0());
            	      								
            	    }
            	    // InternalMoba.g:3643:9: ( (otherlv_4= RULE_CONSTANT ) )
            	    // InternalMoba.g:3644:10: (otherlv_4= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:3644:10: (otherlv_4= RULE_CONSTANT )
            	    // InternalMoba.g:3645:11: otherlv_4= RULE_CONSTANT
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
            	      											}
            	      										
            	    }
            	    otherlv_4=(Token)match(input,RULE_CONSTANT,FOLLOW_61); if (state.failed) return current;
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
            	    break loop62;
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
    // InternalMoba.g:3673:1: entryRuleMobaRestParameter returns [EObject current=null] : iv_ruleMobaRestParameter= ruleMobaRestParameter EOF ;
    public final EObject entryRuleMobaRestParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestParameter = null;


        try {
            // InternalMoba.g:3673:58: (iv_ruleMobaRestParameter= ruleMobaRestParameter EOF )
            // InternalMoba.g:3674:2: iv_ruleMobaRestParameter= ruleMobaRestParameter EOF
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
    // InternalMoba.g:3680:1: ruleMobaRestParameter returns [EObject current=null] : (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) ;
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
            // InternalMoba.g:3686:2: ( (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) )
            // InternalMoba.g:3687:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            {
            // InternalMoba.g:3687:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            // InternalMoba.g:3688:3: otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            {
            otherlv_0=(Token)match(input,84,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRestParameterAccess().getParamKeyword_0());
              		
            }
            // InternalMoba.g:3692:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:3693:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:3693:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:3694:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRestParameterRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getMobaRestParameterAccess().getTypeMobaDataTypeCrossReference_1_0());
              				
            }

            }


            }

            // InternalMoba.g:3705:3: ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==RULE_ID) && (synpred1_InternalMoba())) {
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
                    // InternalMoba.g:3706:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    {
                    // InternalMoba.g:3706:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    // InternalMoba.g:3707:5: ( RULE_ID )=> (lv_nameString_2_0= RULE_ID )
                    {
                    // InternalMoba.g:3708:5: (lv_nameString_2_0= RULE_ID )
                    // InternalMoba.g:3709:6: lv_nameString_2_0= RULE_ID
                    {
                    lv_nameString_2_0=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
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
                    // InternalMoba.g:3726:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:3726:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:3727:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:3727:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:3728:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRestParameterRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaRestParameterAccess().getNameConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:3740:3: (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==22) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // InternalMoba.g:3741:4: otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaRestParameterAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:3745:4: ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
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
                            // InternalMoba.g:3746:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:3746:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            // InternalMoba.g:3747:6: (lv_valueString_5_0= RULE_STRING )
                            {
                            // InternalMoba.g:3747:6: (lv_valueString_5_0= RULE_STRING )
                            // InternalMoba.g:3748:7: lv_valueString_5_0= RULE_STRING
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
                            // InternalMoba.g:3765:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            {
                            // InternalMoba.g:3765:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            // InternalMoba.g:3766:6: (lv_valueInt_6_0= RULE_INT )
                            {
                            // InternalMoba.g:3766:6: (lv_valueInt_6_0= RULE_INT )
                            // InternalMoba.g:3767:7: lv_valueInt_6_0= RULE_INT
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
                            // InternalMoba.g:3784:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            {
                            // InternalMoba.g:3784:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            // InternalMoba.g:3785:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            {
                            // InternalMoba.g:3785:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            // InternalMoba.g:3786:7: lv_valueDouble_7_0= RULE_DOUBLE
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
                            // InternalMoba.g:3803:5: ( (otherlv_8= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:3803:5: ( (otherlv_8= RULE_CONSTANT ) )
                            // InternalMoba.g:3804:6: (otherlv_8= RULE_CONSTANT )
                            {
                            // InternalMoba.g:3804:6: (otherlv_8= RULE_CONSTANT )
                            // InternalMoba.g:3805:7: otherlv_8= RULE_CONSTANT
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
    // InternalMoba.g:3822:1: entryRuleMobaRestHeader returns [EObject current=null] : iv_ruleMobaRestHeader= ruleMobaRestHeader EOF ;
    public final EObject entryRuleMobaRestHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestHeader = null;


        try {
            // InternalMoba.g:3822:55: (iv_ruleMobaRestHeader= ruleMobaRestHeader EOF )
            // InternalMoba.g:3823:2: iv_ruleMobaRestHeader= ruleMobaRestHeader EOF
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
    // InternalMoba.g:3829:1: ruleMobaRestHeader returns [EObject current=null] : (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) ;
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
            // InternalMoba.g:3835:2: ( (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) )
            // InternalMoba.g:3836:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            {
            // InternalMoba.g:3836:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            // InternalMoba.g:3837:3: otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            {
            otherlv_0=(Token)match(input,84,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRestHeaderAccess().getParamKeyword_0());
              		
            }
            // InternalMoba.g:3841:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:3842:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:3842:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:3843:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRestHeaderRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getMobaRestHeaderAccess().getTypeMobaDataTypeCrossReference_1_0());
              				
            }

            }


            }

            // InternalMoba.g:3854:3: ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==RULE_ID) && (synpred2_InternalMoba())) {
                alt66=1;
            }
            else if ( (LA66_0==RULE_CONSTANT) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }
            switch (alt66) {
                case 1 :
                    // InternalMoba.g:3855:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    {
                    // InternalMoba.g:3855:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    // InternalMoba.g:3856:5: ( RULE_ID )=> (lv_nameString_2_0= RULE_ID )
                    {
                    // InternalMoba.g:3857:5: (lv_nameString_2_0= RULE_ID )
                    // InternalMoba.g:3858:6: lv_nameString_2_0= RULE_ID
                    {
                    lv_nameString_2_0=(Token)match(input,RULE_ID,FOLLOW_63); if (state.failed) return current;
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
                    // InternalMoba.g:3875:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:3875:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:3876:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:3876:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:3877:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_63); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaRestHeaderAccess().getNameConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:3889:3: (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==22) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalMoba.g:3890:4: otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_39); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaRestHeaderAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:3894:4: ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    int alt67=4;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt67=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt67=2;
                        }
                        break;
                    case RULE_DOUBLE:
                        {
                        alt67=3;
                        }
                        break;
                    case RULE_CONSTANT:
                        {
                        alt67=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 67, 0, input);

                        throw nvae;
                    }

                    switch (alt67) {
                        case 1 :
                            // InternalMoba.g:3895:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:3895:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            // InternalMoba.g:3896:6: (lv_valueString_5_0= RULE_STRING )
                            {
                            // InternalMoba.g:3896:6: (lv_valueString_5_0= RULE_STRING )
                            // InternalMoba.g:3897:7: lv_valueString_5_0= RULE_STRING
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
                            // InternalMoba.g:3914:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            {
                            // InternalMoba.g:3914:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            // InternalMoba.g:3915:6: (lv_valueInt_6_0= RULE_INT )
                            {
                            // InternalMoba.g:3915:6: (lv_valueInt_6_0= RULE_INT )
                            // InternalMoba.g:3916:7: lv_valueInt_6_0= RULE_INT
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
                            // InternalMoba.g:3933:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            {
                            // InternalMoba.g:3933:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            // InternalMoba.g:3934:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            {
                            // InternalMoba.g:3934:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            // InternalMoba.g:3935:7: lv_valueDouble_7_0= RULE_DOUBLE
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
                            // InternalMoba.g:3952:5: ( (otherlv_8= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:3952:5: ( (otherlv_8= RULE_CONSTANT ) )
                            // InternalMoba.g:3953:6: (otherlv_8= RULE_CONSTANT )
                            {
                            // InternalMoba.g:3953:6: (otherlv_8= RULE_CONSTANT )
                            // InternalMoba.g:3954:7: otherlv_8= RULE_CONSTANT
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
    // InternalMoba.g:3971:1: entryRuleMobaRESTCrud returns [EObject current=null] : iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF ;
    public final EObject entryRuleMobaRESTCrud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTCrud = null;


        try {
            // InternalMoba.g:3971:53: (iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF )
            // InternalMoba.g:3972:2: iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF
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
    // InternalMoba.g:3978:1: ruleMobaRESTCrud returns [EObject current=null] : (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaRESTCrud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_MobaFriendsAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:3984:2: ( (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:3985:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:3985:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:3986:3: otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,85,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRESTCrudAccess().getRestCrudKeyword_0());
              		
            }
            // InternalMoba.g:3990:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:3991:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:3991:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:3992:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_64); if (state.failed) return current;
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

            // InternalMoba.g:4008:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==30) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMoba.g:4009:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaRESTCrudAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:4013:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4014:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4014:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4015:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4042:1: entryRuleMobaRESTWorkflow returns [EObject current=null] : iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF ;
    public final EObject entryRuleMobaRESTWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTWorkflow = null;


        try {
            // InternalMoba.g:4042:57: (iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF )
            // InternalMoba.g:4043:2: iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF
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
    // InternalMoba.g:4049:1: ruleMobaRESTWorkflow returns [EObject current=null] : (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) ;
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
            // InternalMoba.g:4055:2: ( (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) )
            // InternalMoba.g:4056:2: (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            {
            // InternalMoba.g:4056:2: (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            // InternalMoba.g:4057:3: otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,86,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRESTWorkflowAccess().getRestWorkflowKeyword_0());
              		
            }
            // InternalMoba.g:4061:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:4062:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:4062:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:4063:5: lv_name_1_0= RULE_ID
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

            // InternalMoba.g:4079:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==30) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMoba.g:4080:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaRESTWorkflowAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:4084:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4085:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4085:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4086:6: otherlv_3= RULE_ID
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
            otherlv_5=(Token)match(input,23,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaRESTWorkflowAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:4113:3: (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==87) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // InternalMoba.g:4114:4: otherlv_6= 'service' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,87,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getMobaRESTWorkflowAccess().getServiceKeyword_5_0());
            	      			
            	    }
            	    // InternalMoba.g:4118:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalMoba.g:4119:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMoba.g:4119:5: (otherlv_7= RULE_ID )
            	    // InternalMoba.g:4120:6: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMobaRESTWorkflowRule());
            	      						}
            	      					
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getMobaRESTWorkflowAccess().getServicesMobaRESTCrossReference_5_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop71;
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
    // InternalMoba.g:4140:1: entryRuleMobaEntityFeature returns [EObject current=null] : iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF ;
    public final EObject entryRuleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityFeature = null;


        try {
            // InternalMoba.g:4140:58: (iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF )
            // InternalMoba.g:4141:2: iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF
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
    // InternalMoba.g:4147:1: ruleMobaEntityFeature returns [EObject current=null] : (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable ) ;
    public final EObject ruleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntityAttribute_0 = null;

        EObject this_MobaEntityReference_1 = null;

        EObject this_MobaEntityEmbeddable_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:4153:2: ( (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable ) )
            // InternalMoba.g:4154:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable )
            {
            // InternalMoba.g:4154:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable )
            int alt72=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt72=1;
                }
                break;
            case 96:
                {
                alt72=2;
                }
                break;
            case 98:
                {
                alt72=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 72, 0, input);

                throw nvae;
            }

            switch (alt72) {
                case 1 :
                    // InternalMoba.g:4155:3: this_MobaEntityAttribute_0= ruleMobaEntityAttribute
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
                    // InternalMoba.g:4164:3: this_MobaEntityReference_1= ruleMobaEntityReference
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
                case 3 :
                    // InternalMoba.g:4173:3: this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaEntityFeatureAccess().getMobaEntityEmbeddableParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaEntityEmbeddable_2=ruleMobaEntityEmbeddable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaEntityEmbeddable_2;
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
    // InternalMoba.g:4185:1: entryRuleMobaEntityAttribute returns [EObject current=null] : iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF ;
    public final EObject entryRuleMobaEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityAttribute = null;


        try {
            // InternalMoba.g:4185:60: (iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF )
            // InternalMoba.g:4186:2: iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF
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
    // InternalMoba.g:4192:1: ruleMobaEntityAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) ;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_formatString_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject this_MobaMultiplicityAble_13 = null;

        EObject this_MobaFriendsAble_20 = null;



        	enterRule();

        try {
            // InternalMoba.g:4198:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4199:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4199:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4200:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,88,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAttributeAccess().getVarKeyword_0());
              		
            }
            // InternalMoba.g:4204:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:4205:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:4205:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:4206:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            // InternalMoba.g:4209:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:4210:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:4210:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop74:
            do {
                int alt74=6;
                int LA74_0 = input.LA(1);

                if ( LA74_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt74=1;
                }
                else if ( LA74_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt74=2;
                }
                else if ( LA74_0 == 91 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt74=3;
                }
                else if ( LA74_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt74=4;
                }
                else if ( LA74_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt74=5;
                }


                switch (alt74) {
            	case 1 :
            	    // InternalMoba.g:4211:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4211:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:4212:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4212:116: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:4213:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:4216:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:4216:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4216:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:4216:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:4216:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:4217:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,89,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:4234:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4234:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:4235:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4235:116: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:4236:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:4239:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:4239:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4239:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:4239:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:4239:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:4240:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,90,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:4257:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4257:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:4258:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:4258:116: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:4259:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:4262:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:4262:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4262:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:4262:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:4262:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:4263:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,91,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:4280:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4280:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:4281:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:4281:116: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:4282:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3);
            	    // InternalMoba.g:4285:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:4285:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4285:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:4285:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:4285:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:4286:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,92,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:4303:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:4303:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:4304:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:4304:116: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:4305:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4);
            	    // InternalMoba.g:4308:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:4308:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4308:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:4308:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaEntityAttributeAccess().getConstraintsKeyword_1_4_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaEntityAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	      								
            	    }
            	    // InternalMoba.g:4316:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:4317:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:4317:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:4318:11: lv_constraints_8_0= ruleMobaConstraint
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

            	    // InternalMoba.g:4335:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop73:
            	    do {
            	        int alt73=2;
            	        int LA73_0 = input.LA(1);

            	        if ( (LA73_0==33) ) {
            	            alt73=1;
            	        }


            	        switch (alt73) {
            	    	case 1 :
            	    	    // InternalMoba.g:4336:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaEntityAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:4340:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:4341:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:4341:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:4342:12: lv_constraints_10_0= ruleMobaConstraint
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
            	    	    break loop73;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,34,FOLLOW_66); if (state.failed) return current;
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
            	    break loop74;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:4377:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:4378:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:4378:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:4379:5: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
              					}
              				
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
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
            // InternalMoba.g:4401:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:4402:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:4402:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:4403:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
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

            // InternalMoba.g:4419:3: (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==93) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalMoba.g:4420:4: otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')'
                    {
                    otherlv_15=(Token)match(input,93,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getMobaEntityAttributeAccess().getFormatKeyword_5_0());
                      			
                    }
                    otherlv_16=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getMobaEntityAttributeAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMoba.g:4428:4: ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) )
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==RULE_STRING) ) {
                        alt75=1;
                    }
                    else if ( (LA75_0==RULE_CONSTANT) ) {
                        alt75=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 0, input);

                        throw nvae;
                    }
                    switch (alt75) {
                        case 1 :
                            // InternalMoba.g:4429:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4429:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            // InternalMoba.g:4430:6: (lv_formatString_17_0= RULE_STRING )
                            {
                            // InternalMoba.g:4430:6: (lv_formatString_17_0= RULE_STRING )
                            // InternalMoba.g:4431:7: lv_formatString_17_0= RULE_STRING
                            {
                            lv_formatString_17_0=(Token)match(input,RULE_STRING,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_formatString_17_0, grammarAccess.getMobaEntityAttributeAccess().getFormatStringSTRINGTerminalRuleCall_5_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"formatString",
                              								lv_formatString_17_0,
                              								"org.eclipse.xtext.common.Terminals.STRING");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4448:5: ( (otherlv_18= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4448:5: ( (otherlv_18= RULE_CONSTANT ) )
                            // InternalMoba.g:4449:6: (otherlv_18= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4449:6: (otherlv_18= RULE_CONSTANT )
                            // InternalMoba.g:4450:7: otherlv_18= RULE_CONSTANT
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
                              							}
                              						
                            }
                            otherlv_18=(Token)match(input,RULE_CONSTANT,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_18, grammarAccess.getMobaEntityAttributeAccess().getFormatConstMobaConstantCrossReference_5_2_1_0());
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getMobaEntityAttributeAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaEntityAttributeAccess().getMobaFriendsAbleParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_20=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_20;
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
    // InternalMoba.g:4482:1: entryRuleMobaSettingsFeature returns [EObject current=null] : iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF ;
    public final EObject entryRuleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsFeature = null;


        try {
            // InternalMoba.g:4482:60: (iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF )
            // InternalMoba.g:4483:2: iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF
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
    // InternalMoba.g:4489:1: ruleMobaSettingsFeature returns [EObject current=null] : (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference ) ;
    public final EObject ruleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaSettingsAttribute_0 = null;

        EObject this_MobaSettingsEntityReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:4495:2: ( (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference ) )
            // InternalMoba.g:4496:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference )
            {
            // InternalMoba.g:4496:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==88) ) {
                alt77=1;
            }
            else if ( (LA77_0==94) ) {
                alt77=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // InternalMoba.g:4497:3: this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaSettingsFeatureAccess().getMobaSettingsAttributeParserRuleCall_0());
                      		
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
                    break;
                case 2 :
                    // InternalMoba.g:4506:3: this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaSettingsFeatureAccess().getMobaSettingsEntityReferenceParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaSettingsEntityReference_1=ruleMobaSettingsEntityReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaSettingsEntityReference_1;
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
    // $ANTLR end "ruleMobaSettingsFeature"


    // $ANTLR start "entryRuleMobaSettingsAttribute"
    // InternalMoba.g:4518:1: entryRuleMobaSettingsAttribute returns [EObject current=null] : iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF ;
    public final EObject entryRuleMobaSettingsAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsAttribute = null;


        try {
            // InternalMoba.g:4518:62: (iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF )
            // InternalMoba.g:4519:2: iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF
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
    // InternalMoba.g:4525:1: ruleMobaSettingsAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) ;
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
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token lv_formatString_17_0=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject this_MobaMultiplicityAble_13 = null;

        EObject this_MobaFriendsAble_20 = null;



        	enterRule();

        try {
            // InternalMoba.g:4531:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4532:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4532:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4533:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,88,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsAttributeAccess().getVarKeyword_0());
              		
            }
            // InternalMoba.g:4537:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:4538:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:4538:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:4539:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            // InternalMoba.g:4542:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:4543:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:4543:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop79:
            do {
                int alt79=6;
                int LA79_0 = input.LA(1);

                if ( LA79_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt79=1;
                }
                else if ( LA79_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt79=2;
                }
                else if ( LA79_0 == 91 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt79=3;
                }
                else if ( LA79_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt79=4;
                }
                else if ( LA79_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt79=5;
                }


                switch (alt79) {
            	case 1 :
            	    // InternalMoba.g:4544:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4544:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:4545:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4545:118: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:4546:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:4549:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:4549:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4549:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:4549:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:4549:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:4550:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,89,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:4567:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4567:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:4568:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4568:118: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:4569:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:4572:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:4572:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4572:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:4572:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:4572:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:4573:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,90,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:4590:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4590:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:4591:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:4591:118: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:4592:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:4595:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:4595:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4595:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:4595:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:4595:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:4596:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,91,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:4613:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4613:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:4614:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:4614:118: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:4615:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3);
            	    // InternalMoba.g:4618:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:4618:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4618:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:4618:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:4618:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:4619:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,92,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:4636:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:4636:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:4637:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:4637:118: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:4638:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4);
            	    // InternalMoba.g:4641:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:4641:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4641:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:4641:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaSettingsAttributeAccess().getConstraintsKeyword_1_4_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	      								
            	    }
            	    // InternalMoba.g:4649:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:4650:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:4650:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:4651:11: lv_constraints_8_0= ruleMobaConstraint
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

            	    // InternalMoba.g:4668:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop78:
            	    do {
            	        int alt78=2;
            	        int LA78_0 = input.LA(1);

            	        if ( (LA78_0==33) ) {
            	            alt78=1;
            	        }


            	        switch (alt78) {
            	    	case 1 :
            	    	    // InternalMoba.g:4669:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:4673:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:4674:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:4674:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:4675:12: lv_constraints_10_0= ruleMobaConstraint
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
            	    	    break loop78;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,34,FOLLOW_66); if (state.failed) return current;
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
            	    break loop79;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:4710:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:4711:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:4711:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:4712:5: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
              					}
              				
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
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
            // InternalMoba.g:4734:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:4735:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:4735:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:4736:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
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

            // InternalMoba.g:4752:3: (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )?
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==93) ) {
                alt81=1;
            }
            switch (alt81) {
                case 1 :
                    // InternalMoba.g:4753:4: otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')'
                    {
                    otherlv_15=(Token)match(input,93,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getMobaSettingsAttributeAccess().getFormatKeyword_5_0());
                      			
                    }
                    otherlv_16=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMoba.g:4761:4: ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) )
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( (LA80_0==RULE_STRING) ) {
                        alt80=1;
                    }
                    else if ( (LA80_0==RULE_CONSTANT) ) {
                        alt80=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 80, 0, input);

                        throw nvae;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalMoba.g:4762:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4762:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            // InternalMoba.g:4763:6: (lv_formatString_17_0= RULE_STRING )
                            {
                            // InternalMoba.g:4763:6: (lv_formatString_17_0= RULE_STRING )
                            // InternalMoba.g:4764:7: lv_formatString_17_0= RULE_STRING
                            {
                            lv_formatString_17_0=(Token)match(input,RULE_STRING,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_formatString_17_0, grammarAccess.getMobaSettingsAttributeAccess().getFormatStringSTRINGTerminalRuleCall_5_2_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
                              							}
                              							setWithLastConsumed(
                              								current,
                              								"formatString",
                              								lv_formatString_17_0,
                              								"org.eclipse.xtext.common.Terminals.STRING");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4781:5: ( (otherlv_18= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4781:5: ( (otherlv_18= RULE_CONSTANT ) )
                            // InternalMoba.g:4782:6: (otherlv_18= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4782:6: (otherlv_18= RULE_CONSTANT )
                            // InternalMoba.g:4783:7: otherlv_18= RULE_CONSTANT
                            {
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
                              							}
                              						
                            }
                            otherlv_18=(Token)match(input,RULE_CONSTANT,FOLLOW_31); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(otherlv_18, grammarAccess.getMobaSettingsAttributeAccess().getFormatConstMobaConstantCrossReference_5_2_1_0());
                              						
                            }

                            }


                            }


                            }
                            break;

                    }

                    otherlv_19=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getMobaSettingsAttributeAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaSettingsAttributeAccess().getMobaFriendsAbleParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_20=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_20;
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


    // $ANTLR start "entryRuleMobaSettingsEntityReference"
    // InternalMoba.g:4815:1: entryRuleMobaSettingsEntityReference returns [EObject current=null] : iv_ruleMobaSettingsEntityReference= ruleMobaSettingsEntityReference EOF ;
    public final EObject entryRuleMobaSettingsEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsEntityReference = null;


        try {
            // InternalMoba.g:4815:68: (iv_ruleMobaSettingsEntityReference= ruleMobaSettingsEntityReference EOF )
            // InternalMoba.g:4816:2: iv_ruleMobaSettingsEntityReference= ruleMobaSettingsEntityReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaSettingsEntityReferenceRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaSettingsEntityReference=ruleMobaSettingsEntityReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaSettingsEntityReference; 
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
    // $ANTLR end "entryRuleMobaSettingsEntityReference"


    // $ANTLR start "ruleMobaSettingsEntityReference"
    // InternalMoba.g:4822:1: ruleMobaSettingsEntityReference returns [EObject current=null] : (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaSettingsEntityReference() throws RecognitionException {
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
            // InternalMoba.g:4828:2: ( (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4829:2: (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4829:2: (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4830:3: otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,94,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getRefEntityKeyword_0());
              		
            }
            // InternalMoba.g:4834:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:4835:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:4835:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:4836:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:4839:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:4840:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:4840:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop82:
            do {
                int alt82=4;
                int LA82_0 = input.LA(1);

                if ( LA82_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt82=1;
                }
                else if ( LA82_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt82=2;
                }
                else if ( LA82_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt82=3;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalMoba.g:4841:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4841:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:4842:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4842:124: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:4843:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:4846:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:4846:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "true");
            	    }
            	    // InternalMoba.g:4846:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:4846:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:4846:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:4847:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,95,FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_cascading_2_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getCascadingCascadingKeyword_1_0_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "cascading", true, "cascading");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:4864:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4864:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:4865:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4865:124: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:4866:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:4869:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:4869:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "true");
            	    }
            	    // InternalMoba.g:4869:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:4869:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:4869:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:4870:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,89,FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_lazy_3_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getLazyLazyKeyword_1_1_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "lazy", true, "lazy");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // InternalMoba.g:4887:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4887:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:4888:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:4888:124: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:4889:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:4892:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:4892:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "true");
            	    }
            	    // InternalMoba.g:4892:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:4892:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:4892:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:4893:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,90,FOLLOW_69); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      										newLeafNode(lv_transient_4_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getTransientTransientKeyword_1_2_0());
            	      									
            	    }
            	    if ( state.backtracking==0 ) {

            	      										if (current==null) {
            	      											current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
            	      										}
            	      										setWithLastConsumed(current, "transient", true, "transient");
            	      									
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop82;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:4917:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:4918:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:4918:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:4919:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_5, grammarAccess.getMobaSettingsEntityReferenceAccess().getTypeMobaEntityCrossReference_2_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaSettingsEntityReferenceAccess().getMobaMultiplicityAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_MobaMultiplicityAble_6=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_6;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:4941:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:4942:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:4942:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:4943:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_7_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
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
              				current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaSettingsEntityReferenceAccess().getMobaFriendsAbleParserRuleCall_5());
              		
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
    // $ANTLR end "ruleMobaSettingsEntityReference"


    // $ANTLR start "ruleMobaMultiplicityAble"
    // InternalMoba.g:4975:1: ruleMobaMultiplicityAble[EObject in_current] returns [EObject current=in_current] : ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? ;
    public final EObject ruleMobaMultiplicityAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:4981:2: ( ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? )
            // InternalMoba.g:4982:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            {
            // InternalMoba.g:4982:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==63) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // InternalMoba.g:4983:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    {
                    // InternalMoba.g:4983:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    // InternalMoba.g:4984:4: lv_multiplicity_0_0= ruleMobaMuliplicity
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
    // InternalMoba.g:5004:1: entryRuleMobaEntityReference returns [EObject current=null] : iv_ruleMobaEntityReference= ruleMobaEntityReference EOF ;
    public final EObject entryRuleMobaEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityReference = null;


        try {
            // InternalMoba.g:5004:60: (iv_ruleMobaEntityReference= ruleMobaEntityReference EOF )
            // InternalMoba.g:5005:2: iv_ruleMobaEntityReference= ruleMobaEntityReference EOF
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
    // InternalMoba.g:5011:1: ruleMobaEntityReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaEntityReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cascading_2_0=null;
        Token lv_lazy_3_0=null;
        Token lv_transient_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject this_MobaMultiplicityAble_6 = null;

        EObject this_MobaFriendsAble_10 = null;



        	enterRule();

        try {
            // InternalMoba.g:5017:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5018:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5018:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5019:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,96,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityReferenceAccess().getRefKeyword_0());
              		
            }
            // InternalMoba.g:5023:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:5024:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:5024:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:5025:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:5028:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:5029:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:5029:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop84:
            do {
                int alt84=4;
                int LA84_0 = input.LA(1);

                if ( LA84_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt84=1;
                }
                else if ( LA84_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt84=2;
                }
                else if ( LA84_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt84=3;
                }


                switch (alt84) {
            	case 1 :
            	    // InternalMoba.g:5030:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5030:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:5031:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5031:116: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:5032:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:5035:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:5035:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:5035:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:5035:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:5035:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:5036:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,95,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:5053:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5053:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5054:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5054:116: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5055:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:5058:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:5058:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:5058:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:5058:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5058:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:5059:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,89,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:5076:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5076:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5077:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5077:116: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5078:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:5081:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:5081:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:5081:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:5081:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:5081:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:5082:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,90,FOLLOW_69); if (state.failed) return current;
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
            	    break loop84;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5106:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:5107:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:5107:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:5108:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
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
            // InternalMoba.g:5130:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:5131:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:5131:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:5132:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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

            // InternalMoba.g:5148:3: (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==97) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // InternalMoba.g:5149:4: otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,97,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMobaEntityReferenceAccess().getOppositeKeyword_5_0());
                      			
                    }
                    // InternalMoba.g:5153:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMoba.g:5154:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMoba.g:5154:5: (otherlv_9= RULE_ID )
                    // InternalMoba.g:5155:6: otherlv_9= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
                      						}
                      					
                    }
                    otherlv_9=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_9, grammarAccess.getMobaEntityReferenceAccess().getOppositeMobaEntityReferenceCrossReference_5_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaEntityReferenceAccess().getMobaFriendsAbleParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_10=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_10;
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


    // $ANTLR start "entryRuleMobaEntityEmbeddable"
    // InternalMoba.g:5182:1: entryRuleMobaEntityEmbeddable returns [EObject current=null] : iv_ruleMobaEntityEmbeddable= ruleMobaEntityEmbeddable EOF ;
    public final EObject entryRuleMobaEntityEmbeddable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityEmbeddable = null;


        try {
            // InternalMoba.g:5182:61: (iv_ruleMobaEntityEmbeddable= ruleMobaEntityEmbeddable EOF )
            // InternalMoba.g:5183:2: iv_ruleMobaEntityEmbeddable= ruleMobaEntityEmbeddable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaEntityEmbeddableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaEntityEmbeddable=ruleMobaEntityEmbeddable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaEntityEmbeddable; 
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
    // $ANTLR end "entryRuleMobaEntityEmbeddable"


    // $ANTLR start "ruleMobaEntityEmbeddable"
    // InternalMoba.g:5189:1: ruleMobaEntityEmbeddable returns [EObject current=null] : (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaEntityEmbeddable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_transient_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        EObject this_MobaMultiplicityAble_3 = null;

        EObject this_MobaFriendsAble_5 = null;



        	enterRule();

        try {
            // InternalMoba.g:5195:2: ( (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5196:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5196:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5197:3: otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,98,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityEmbeddableAccess().getEmbedKeyword_0());
              		
            }
            // InternalMoba.g:5201:3: ( (lv_transient_1_0= 'transient' ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==90) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMoba.g:5202:4: (lv_transient_1_0= 'transient' )
                    {
                    // InternalMoba.g:5202:4: (lv_transient_1_0= 'transient' )
                    // InternalMoba.g:5203:5: lv_transient_1_0= 'transient'
                    {
                    lv_transient_1_0=(Token)match(input,90,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_transient_1_0, grammarAccess.getMobaEntityEmbeddableAccess().getTransientTransientKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
                      					}
                      					setWithLastConsumed(current, "transient", true, "transient");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMoba.g:5215:3: ( (otherlv_2= RULE_ID ) )
            // InternalMoba.g:5216:4: (otherlv_2= RULE_ID )
            {
            // InternalMoba.g:5216:4: (otherlv_2= RULE_ID )
            // InternalMoba.g:5217:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getMobaEntityEmbeddableAccess().getTypeMobaEntityCrossReference_2_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
              			}
              			newCompositeNode(grammarAccess.getMobaEntityEmbeddableAccess().getMobaMultiplicityAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_MobaMultiplicityAble_3=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_3;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:5239:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMoba.g:5240:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMoba.g:5240:4: (lv_name_4_0= RULE_ID )
            // InternalMoba.g:5241:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getMobaEntityEmbeddableAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
              			}
              			newCompositeNode(grammarAccess.getMobaEntityEmbeddableAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_5;
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
    // $ANTLR end "ruleMobaEntityEmbeddable"


    // $ANTLR start "entryRuleMobaDtoFeature"
    // InternalMoba.g:5272:1: entryRuleMobaDtoFeature returns [EObject current=null] : iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF ;
    public final EObject entryRuleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoFeature = null;


        try {
            // InternalMoba.g:5272:55: (iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF )
            // InternalMoba.g:5273:2: iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF
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
    // InternalMoba.g:5279:1: ruleMobaDtoFeature returns [EObject current=null] : (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable ) ;
    public final EObject ruleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDtoAttribute_0 = null;

        EObject this_MobaDtoReference_1 = null;

        EObject this_MobaDtoEmbeddable_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:5285:2: ( (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable ) )
            // InternalMoba.g:5286:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable )
            {
            // InternalMoba.g:5286:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable )
            int alt87=3;
            switch ( input.LA(1) ) {
            case 88:
                {
                alt87=1;
                }
                break;
            case 96:
                {
                alt87=2;
                }
                break;
            case 98:
                {
                alt87=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;
            }

            switch (alt87) {
                case 1 :
                    // InternalMoba.g:5287:3: this_MobaDtoAttribute_0= ruleMobaDtoAttribute
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
                    // InternalMoba.g:5296:3: this_MobaDtoReference_1= ruleMobaDtoReference
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
                case 3 :
                    // InternalMoba.g:5305:3: this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaDtoFeatureAccess().getMobaDtoEmbeddableParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaDtoEmbeddable_2=ruleMobaDtoEmbeddable();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaDtoEmbeddable_2;
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
    // InternalMoba.g:5317:1: entryRuleMobaDtoAttribute returns [EObject current=null] : iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF ;
    public final EObject entryRuleMobaDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoAttribute = null;


        try {
            // InternalMoba.g:5317:57: (iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF )
            // InternalMoba.g:5318:2: iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF
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
    // InternalMoba.g:5324:1: ruleMobaDtoAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] ) ;
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
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token lv_alias_18_0=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token lv_formatString_22_0=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject this_MobaMultiplicityAble_13 = null;

        EObject this_MobaFriendsAble_25 = null;



        	enterRule();

        try {
            // InternalMoba.g:5330:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5331:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5331:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5332:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,88,FOLLOW_66); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAttributeAccess().getVarKeyword_0());
              		
            }
            // InternalMoba.g:5336:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:5337:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:5337:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:5338:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            // InternalMoba.g:5341:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:5342:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:5342:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop89:
            do {
                int alt89=6;
                int LA89_0 = input.LA(1);

                if ( LA89_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt89=1;
                }
                else if ( LA89_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt89=2;
                }
                else if ( LA89_0 == 91 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt89=3;
                }
                else if ( LA89_0 == 92 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt89=4;
                }
                else if ( LA89_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt89=5;
                }


                switch (alt89) {
            	case 1 :
            	    // InternalMoba.g:5343:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5343:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5344:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5344:113: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5345:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:5348:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:5348:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5348:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:5348:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5348:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:5349:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,89,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:5366:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5366:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5367:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5367:113: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5368:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:5371:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:5371:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5371:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:5371:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:5371:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:5372:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,90,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:5389:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5389:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:5390:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5390:113: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:5391:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:5394:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:5394:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5394:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:5394:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:5394:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:5395:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,91,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:5412:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5412:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:5413:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:5413:113: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:5414:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3);
            	    // InternalMoba.g:5417:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:5417:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5417:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:5417:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:5417:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:5418:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,92,FOLLOW_66); if (state.failed) return current;
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
            	    // InternalMoba.g:5435:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:5435:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:5436:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:5436:113: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:5437:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4);
            	    // InternalMoba.g:5440:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:5440:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5440:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:5440:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaDtoAttributeAccess().getConstraintsKeyword_1_4_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,32,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	      								
            	    }
            	    // InternalMoba.g:5448:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:5449:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:5449:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:5450:11: lv_constraints_8_0= ruleMobaConstraint
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

            	    // InternalMoba.g:5467:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop88:
            	    do {
            	        int alt88=2;
            	        int LA88_0 = input.LA(1);

            	        if ( (LA88_0==33) ) {
            	            alt88=1;
            	        }


            	        switch (alt88) {
            	    	case 1 :
            	    	    // InternalMoba.g:5468:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaDtoAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:5472:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:5473:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:5473:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:5474:12: lv_constraints_10_0= ruleMobaConstraint
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
            	    	    break loop88;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,34,FOLLOW_66); if (state.failed) return current;
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

            	default :
            	    break loop89;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5509:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:5510:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:5510:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:5511:5: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
              					}
              				
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_12, grammarAccess.getMobaDtoAttributeAccess().getTypeMobaDataTypeCrossReference_2_0());
              				
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
            this_MobaMultiplicityAble_13=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_13;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:5533:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:5534:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:5534:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:5535:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_14_0, grammarAccess.getMobaDtoAttributeAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_14_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            // InternalMoba.g:5551:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:5552:4: ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:5552:4: ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) )
            // InternalMoba.g:5553:5: ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5());
            // InternalMoba.g:5556:5: ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* )
            // InternalMoba.g:5557:6: ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )*
            {
            // InternalMoba.g:5557:6: ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )*
            loop91:
            do {
                int alt91=3;
                int LA91_0 = input.LA(1);

                if ( LA91_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0) ) {
                    alt91=1;
                }
                else if ( LA91_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1) ) {
                    alt91=2;
                }


                switch (alt91) {
            	case 1 :
            	    // InternalMoba.g:5558:4: ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:5558:4: ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) )
            	    // InternalMoba.g:5559:5: {...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalMoba.g:5559:113: ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) )
            	    // InternalMoba.g:5560:6: ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0);
            	    // InternalMoba.g:5563:9: ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) )
            	    // InternalMoba.g:5563:10: {...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5563:19: (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' )
            	    // InternalMoba.g:5563:20: otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')'
            	    {
            	    otherlv_16=(Token)match(input,99,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_16, grammarAccess.getMobaDtoAttributeAccess().getAliasKeyword_5_0_0());
            	      								
            	    }
            	    otherlv_17=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_17, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_5_0_1());
            	      								
            	    }
            	    // InternalMoba.g:5571:9: ( (lv_alias_18_0= RULE_ID ) )
            	    // InternalMoba.g:5572:10: (lv_alias_18_0= RULE_ID )
            	    {
            	    // InternalMoba.g:5572:10: (lv_alias_18_0= RULE_ID )
            	    // InternalMoba.g:5573:11: lv_alias_18_0= RULE_ID
            	    {
            	    lv_alias_18_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_alias_18_0, grammarAccess.getMobaDtoAttributeAccess().getAliasIDTerminalRuleCall_5_0_2_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	      											}
            	      											setWithLastConsumed(
            	      												current,
            	      												"alias",
            	      												lv_alias_18_0,
            	      												"org.mobadsl.grammar.Moba.ID");
            	      										
            	    }

            	    }


            	    }

            	    otherlv_19=(Token)match(input,34,FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_19, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_5_0_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:5599:4: ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:5599:4: ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) )
            	    // InternalMoba.g:5600:5: {...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalMoba.g:5600:113: ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) )
            	    // InternalMoba.g:5601:6: ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1);
            	    // InternalMoba.g:5604:9: ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) )
            	    // InternalMoba.g:5604:10: {...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5604:19: (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' )
            	    // InternalMoba.g:5604:20: otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')'
            	    {
            	    otherlv_20=(Token)match(input,93,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_20, grammarAccess.getMobaDtoAttributeAccess().getFormatKeyword_5_1_0());
            	      								
            	    }
            	    otherlv_21=(Token)match(input,32,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_21, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_5_1_1());
            	      								
            	    }
            	    // InternalMoba.g:5612:9: ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) )
            	    int alt90=2;
            	    int LA90_0 = input.LA(1);

            	    if ( (LA90_0==RULE_STRING) ) {
            	        alt90=1;
            	    }
            	    else if ( (LA90_0==RULE_CONSTANT) ) {
            	        alt90=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 90, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt90) {
            	        case 1 :
            	            // InternalMoba.g:5613:10: ( (lv_formatString_22_0= RULE_STRING ) )
            	            {
            	            // InternalMoba.g:5613:10: ( (lv_formatString_22_0= RULE_STRING ) )
            	            // InternalMoba.g:5614:11: (lv_formatString_22_0= RULE_STRING )
            	            {
            	            // InternalMoba.g:5614:11: (lv_formatString_22_0= RULE_STRING )
            	            // InternalMoba.g:5615:12: lv_formatString_22_0= RULE_STRING
            	            {
            	            lv_formatString_22_0=(Token)match(input,RULE_STRING,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(lv_formatString_22_0, grammarAccess.getMobaDtoAttributeAccess().getFormatStringSTRINGTerminalRuleCall_5_1_2_0_0());
            	              											
            	            }
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	              												}
            	              												setWithLastConsumed(
            	              													current,
            	              													"formatString",
            	              													lv_formatString_22_0,
            	              													"org.eclipse.xtext.common.Terminals.STRING");
            	              											
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMoba.g:5632:10: ( (otherlv_23= RULE_CONSTANT ) )
            	            {
            	            // InternalMoba.g:5632:10: ( (otherlv_23= RULE_CONSTANT ) )
            	            // InternalMoba.g:5633:11: (otherlv_23= RULE_CONSTANT )
            	            {
            	            // InternalMoba.g:5633:11: (otherlv_23= RULE_CONSTANT )
            	            // InternalMoba.g:5634:12: otherlv_23= RULE_CONSTANT
            	            {
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
            	              												}
            	              											
            	            }
            	            otherlv_23=(Token)match(input,RULE_CONSTANT,FOLLOW_31); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(otherlv_23, grammarAccess.getMobaDtoAttributeAccess().getFormatConstMobaConstantCrossReference_5_1_2_1_0());
            	              											
            	            }

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_24=(Token)match(input,34,FOLLOW_72); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_24, grammarAccess.getMobaDtoAttributeAccess().getRightParenthesisKeyword_5_1_3());
            	      								
            	    }

            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5());

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDtoAttributeAccess().getMobaFriendsAbleParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_25=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_25;
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
    // InternalMoba.g:5678:1: entryRuleMobaDtoReference returns [EObject current=null] : iv_ruleMobaDtoReference= ruleMobaDtoReference EOF ;
    public final EObject entryRuleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoReference = null;


        try {
            // InternalMoba.g:5678:57: (iv_ruleMobaDtoReference= ruleMobaDtoReference EOF )
            // InternalMoba.g:5679:2: iv_ruleMobaDtoReference= ruleMobaDtoReference EOF
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
    // InternalMoba.g:5685:1: ruleMobaDtoReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_cascading_2_0=null;
        Token lv_lazy_3_0=null;
        Token lv_transient_4_0=null;
        Token otherlv_5=null;
        Token lv_name_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token lv_alias_10_0=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        EObject this_MobaMultiplicityAble_6 = null;

        EObject this_MobaFriendsAble_14 = null;



        	enterRule();

        try {
            // InternalMoba.g:5691:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5692:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5692:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5693:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,96,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoReferenceAccess().getRefKeyword_0());
              		
            }
            // InternalMoba.g:5697:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:5698:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:5698:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:5699:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:5702:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:5703:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:5703:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop92:
            do {
                int alt92=4;
                int LA92_0 = input.LA(1);

                if ( LA92_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt92=1;
                }
                else if ( LA92_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt92=2;
                }
                else if ( LA92_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt92=3;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalMoba.g:5704:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5704:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:5705:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5705:113: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:5706:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:5709:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:5709:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:5709:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:5709:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:5709:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:5710:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,95,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:5727:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5727:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5728:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5728:113: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5729:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:5732:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:5732:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:5732:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:5732:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5732:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:5733:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,89,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:5750:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5750:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5751:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5751:113: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5752:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:5755:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:5755:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:5755:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:5755:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:5755:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:5756:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,90,FOLLOW_69); if (state.failed) return current;
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
            	    break loop92;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5780:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:5781:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:5781:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:5782:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
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
            // InternalMoba.g:5804:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:5805:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:5805:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:5806:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
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

            // InternalMoba.g:5822:3: (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )?
            int alt93=2;
            int LA93_0 = input.LA(1);

            if ( (LA93_0==99) ) {
                alt93=1;
            }
            switch (alt93) {
                case 1 :
                    // InternalMoba.g:5823:4: otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,99,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMobaDtoReferenceAccess().getAliasKeyword_5_0());
                      			
                    }
                    otherlv_9=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMobaDtoReferenceAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMoba.g:5831:4: ( (lv_alias_10_0= RULE_ID ) )
                    // InternalMoba.g:5832:5: (lv_alias_10_0= RULE_ID )
                    {
                    // InternalMoba.g:5832:5: (lv_alias_10_0= RULE_ID )
                    // InternalMoba.g:5833:6: lv_alias_10_0= RULE_ID
                    {
                    lv_alias_10_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_10_0, grammarAccess.getMobaDtoReferenceAccess().getAliasIDTerminalRuleCall_5_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_10_0,
                      							"org.mobadsl.grammar.Moba.ID");
                      					
                    }

                    }


                    }

                    otherlv_11=(Token)match(input,34,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getMobaDtoReferenceAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            // InternalMoba.g:5854:3: (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==97) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalMoba.g:5855:4: otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,97,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getMobaDtoReferenceAccess().getOppositeKeyword_6_0());
                      			
                    }
                    // InternalMoba.g:5859:4: ( (otherlv_13= RULE_ID ) )
                    // InternalMoba.g:5860:5: (otherlv_13= RULE_ID )
                    {
                    // InternalMoba.g:5860:5: (otherlv_13= RULE_ID )
                    // InternalMoba.g:5861:6: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
                      						}
                      					
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getMobaDtoReferenceAccess().getOppositeMobaDtoReferenceCrossReference_6_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDtoReferenceAccess().getMobaFriendsAbleParserRuleCall_7());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_14=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_14;
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


    // $ANTLR start "entryRuleMobaDtoEmbeddable"
    // InternalMoba.g:5888:1: entryRuleMobaDtoEmbeddable returns [EObject current=null] : iv_ruleMobaDtoEmbeddable= ruleMobaDtoEmbeddable EOF ;
    public final EObject entryRuleMobaDtoEmbeddable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoEmbeddable = null;


        try {
            // InternalMoba.g:5888:58: (iv_ruleMobaDtoEmbeddable= ruleMobaDtoEmbeddable EOF )
            // InternalMoba.g:5889:2: iv_ruleMobaDtoEmbeddable= ruleMobaDtoEmbeddable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaDtoEmbeddableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaDtoEmbeddable=ruleMobaDtoEmbeddable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaDtoEmbeddable; 
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
    // $ANTLR end "entryRuleMobaDtoEmbeddable"


    // $ANTLR start "ruleMobaDtoEmbeddable"
    // InternalMoba.g:5895:1: ruleMobaDtoEmbeddable returns [EObject current=null] : (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaDtoEmbeddable() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_transient_1_0=null;
        Token otherlv_2=null;
        Token lv_name_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_alias_7_0=null;
        Token otherlv_8=null;
        EObject this_MobaMultiplicityAble_3 = null;

        EObject this_MobaFriendsAble_9 = null;



        	enterRule();

        try {
            // InternalMoba.g:5901:2: ( (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5902:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5902:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5903:3: otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,98,FOLLOW_71); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoEmbeddableAccess().getEmbedKeyword_0());
              		
            }
            // InternalMoba.g:5907:3: ( (lv_transient_1_0= 'transient' ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==90) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalMoba.g:5908:4: (lv_transient_1_0= 'transient' )
                    {
                    // InternalMoba.g:5908:4: (lv_transient_1_0= 'transient' )
                    // InternalMoba.g:5909:5: lv_transient_1_0= 'transient'
                    {
                    lv_transient_1_0=(Token)match(input,90,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_transient_1_0, grammarAccess.getMobaDtoEmbeddableAccess().getTransientTransientKeyword_1_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
                      					}
                      					setWithLastConsumed(current, "transient", true, "transient");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalMoba.g:5921:3: ( (otherlv_2= RULE_ID ) )
            // InternalMoba.g:5922:4: (otherlv_2= RULE_ID )
            {
            // InternalMoba.g:5922:4: (otherlv_2= RULE_ID )
            // InternalMoba.g:5923:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getMobaDtoEmbeddableAccess().getTypeMobaDtoCrossReference_2_0());
              				
            }

            }


            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDtoEmbeddableAccess().getMobaMultiplicityAbleParserRuleCall_3());
              		
            }
            pushFollow(FOLLOW_4);
            this_MobaMultiplicityAble_3=ruleMobaMultiplicityAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaMultiplicityAble_3;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalMoba.g:5945:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMoba.g:5946:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMoba.g:5946:4: (lv_name_4_0= RULE_ID )
            // InternalMoba.g:5947:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_4_0, grammarAccess.getMobaDtoEmbeddableAccess().getNameIDTerminalRuleCall_4_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_4_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            // InternalMoba.g:5963:3: (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==99) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalMoba.g:5964:4: otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,99,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMobaDtoEmbeddableAccess().getAliasKeyword_5_0());
                      			
                    }
                    otherlv_6=(Token)match(input,32,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMobaDtoEmbeddableAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMoba.g:5972:4: ( (lv_alias_7_0= RULE_ID ) )
                    // InternalMoba.g:5973:5: (lv_alias_7_0= RULE_ID )
                    {
                    // InternalMoba.g:5973:5: (lv_alias_7_0= RULE_ID )
                    // InternalMoba.g:5974:6: lv_alias_7_0= RULE_ID
                    {
                    lv_alias_7_0=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_alias_7_0, grammarAccess.getMobaDtoEmbeddableAccess().getAliasIDTerminalRuleCall_5_2_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"alias",
                      							lv_alias_7_0,
                      							"org.mobadsl.grammar.Moba.ID");
                      					
                    }

                    }


                    }

                    otherlv_8=(Token)match(input,34,FOLLOW_25); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMobaDtoEmbeddableAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
              			}
              			newCompositeNode(grammarAccess.getMobaDtoEmbeddableAccess().getMobaFriendsAbleParserRuleCall_6());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_9=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_9;
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
    // $ANTLR end "ruleMobaDtoEmbeddable"


    // $ANTLR start "entryRuleMobaQueueFeature"
    // InternalMoba.g:6010:1: entryRuleMobaQueueFeature returns [EObject current=null] : iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF ;
    public final EObject entryRuleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueFeature = null;


        try {
            // InternalMoba.g:6010:57: (iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF )
            // InternalMoba.g:6011:2: iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF
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
    // InternalMoba.g:6017:1: ruleMobaQueueFeature returns [EObject current=null] : this_MobaQueueReference_0= ruleMobaQueueReference ;
    public final EObject ruleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaQueueReference_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:6023:2: (this_MobaQueueReference_0= ruleMobaQueueReference )
            // InternalMoba.g:6024:2: this_MobaQueueReference_0= ruleMobaQueueReference
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
    // InternalMoba.g:6035:1: entryRuleMobaQueueReference returns [EObject current=null] : iv_ruleMobaQueueReference= ruleMobaQueueReference EOF ;
    public final EObject entryRuleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueReference = null;


        try {
            // InternalMoba.g:6035:59: (iv_ruleMobaQueueReference= ruleMobaQueueReference EOF )
            // InternalMoba.g:6036:2: iv_ruleMobaQueueReference= ruleMobaQueueReference EOF
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
    // InternalMoba.g:6042:1: ruleMobaQueueReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:6048:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:6049:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:6049:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:6050:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,96,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0());
              		
            }
            // InternalMoba.g:6054:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:6055:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:6055:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:6056:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:6059:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:6060:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:6060:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop97:
            do {
                int alt97=4;
                int LA97_0 = input.LA(1);

                if ( LA97_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt97=1;
                }
                else if ( LA97_0 == 89 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt97=2;
                }
                else if ( LA97_0 == 90 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt97=3;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalMoba.g:6061:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6061:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:6062:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:6062:115: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:6063:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:6066:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:6066:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:6066:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:6066:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:6066:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:6067:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,95,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:6084:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6084:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:6085:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:6085:115: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:6086:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:6089:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:6089:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:6089:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:6089:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:6089:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:6090:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,89,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:6107:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6107:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:6108:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:6108:115: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:6109:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:6112:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:6112:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:6112:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:6112:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:6112:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:6113:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,90,FOLLOW_69); if (state.failed) return current;
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
            	    break loop97;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:6137:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:6138:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:6138:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:6139:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
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
            // InternalMoba.g:6161:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:6162:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:6162:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:6163:5: lv_name_7_0= RULE_ID
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
    // InternalMoba.g:6194:1: entryRuleMobaMuliplicity returns [EObject current=null] : iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF ;
    public final EObject entryRuleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMuliplicity = null;


        try {
            // InternalMoba.g:6194:56: (iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF )
            // InternalMoba.g:6195:2: iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF
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
    // InternalMoba.g:6201:1: ruleMobaMuliplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lower_1_0 = null;

        Enumerator lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:6207:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) )
            // InternalMoba.g:6208:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            {
            // InternalMoba.g:6208:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            // InternalMoba.g:6209:3: otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_75); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMoba.g:6213:3: ( (lv_lower_1_0= ruleMobaLowerBound ) )
            // InternalMoba.g:6214:4: (lv_lower_1_0= ruleMobaLowerBound )
            {
            // InternalMoba.g:6214:4: (lv_lower_1_0= ruleMobaLowerBound )
            // InternalMoba.g:6215:5: lv_lower_1_0= ruleMobaLowerBound
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_76);
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

            // InternalMoba.g:6232:3: (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==100) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalMoba.g:6233:4: otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    {
                    otherlv_2=(Token)match(input,100,FOLLOW_77); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:6237:4: ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    // InternalMoba.g:6238:5: (lv_upper_3_0= ruleMobaUpperBound )
                    {
                    // InternalMoba.g:6238:5: (lv_upper_3_0= ruleMobaUpperBound )
                    // InternalMoba.g:6239:6: lv_upper_3_0= ruleMobaUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_78);
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
    // InternalMoba.g:6265:1: entryRuleMobaConstraint returns [EObject current=null] : iv_ruleMobaConstraint= ruleMobaConstraint EOF ;
    public final EObject entryRuleMobaConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstraint = null;


        try {
            // InternalMoba.g:6265:55: (iv_ruleMobaConstraint= ruleMobaConstraint EOF )
            // InternalMoba.g:6266:2: iv_ruleMobaConstraint= ruleMobaConstraint EOF
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
    // InternalMoba.g:6272:1: ruleMobaConstraint returns [EObject current=null] : (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) ;
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
            // InternalMoba.g:6278:2: ( (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) )
            // InternalMoba.g:6279:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            {
            // InternalMoba.g:6279:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            int alt99=8;
            switch ( input.LA(1) ) {
            case 101:
                {
                alt99=1;
                }
                break;
            case 102:
                {
                alt99=2;
                }
                break;
            case 103:
                {
                alt99=3;
                }
                break;
            case 104:
                {
                alt99=4;
                }
                break;
            case 105:
                {
                alt99=5;
                }
                break;
            case 106:
                {
                alt99=6;
                }
                break;
            case 107:
                {
                alt99=7;
                }
                break;
            case 108:
                {
                alt99=8;
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
                    // InternalMoba.g:6280:3: this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint
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
                    // InternalMoba.g:6289:3: this_MobaMinConstraint_1= ruleMobaMinConstraint
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
                    // InternalMoba.g:6298:3: this_MobaMaxConstraint_2= ruleMobaMaxConstraint
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
                    // InternalMoba.g:6307:3: this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint
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
                    // InternalMoba.g:6316:3: this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint
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
                    // InternalMoba.g:6325:3: this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint
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
                    // InternalMoba.g:6334:3: this_MobaNullConstraint_6= ruleMobaNullConstraint
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
                    // InternalMoba.g:6343:3: this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint
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
    // InternalMoba.g:6355:1: entryRuleMobaRegexpConstraint returns [EObject current=null] : iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF ;
    public final EObject entryRuleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRegexpConstraint = null;


        try {
            // InternalMoba.g:6355:61: (iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF )
            // InternalMoba.g:6356:2: iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF
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
    // InternalMoba.g:6362:1: ruleMobaRegexpConstraint returns [EObject current=null] : (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6368:2: ( (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6369:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6369:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6370:3: otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,101,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRegexpConstraintAccess().getRegexpKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaRegexpConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6378:3: ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==RULE_STRING) ) {
                alt100=1;
            }
            else if ( (LA100_0==RULE_CONSTANT) ) {
                alt100=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }
            switch (alt100) {
                case 1 :
                    // InternalMoba.g:6379:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:6379:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    // InternalMoba.g:6380:5: (lv_filterString_2_0= RULE_STRING )
                    {
                    // InternalMoba.g:6380:5: (lv_filterString_2_0= RULE_STRING )
                    // InternalMoba.g:6381:6: lv_filterString_2_0= RULE_STRING
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
                    // InternalMoba.g:6398:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6398:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6399:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6399:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6400:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6416:1: entryRuleMobaMinConstraint returns [EObject current=null] : iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF ;
    public final EObject entryRuleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinConstraint = null;


        try {
            // InternalMoba.g:6416:58: (iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF )
            // InternalMoba.g:6417:2: iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF
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
    // InternalMoba.g:6423:1: ruleMobaMinConstraint returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6429:2: ( (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6430:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6430:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6431:3: otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,102,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMinConstraintAccess().getMinKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMinConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6439:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_DOUBLE) ) {
                alt101=1;
            }
            else if ( (LA101_0==RULE_CONSTANT) ) {
                alt101=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 101, 0, input);

                throw nvae;
            }
            switch (alt101) {
                case 1 :
                    // InternalMoba.g:6440:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:6440:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:6441:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:6441:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:6442:6: lv_filterValue_2_0= RULE_DOUBLE
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
                    // InternalMoba.g:6459:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6459:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6460:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6460:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6461:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6477:1: entryRuleMobaMaxConstraint returns [EObject current=null] : iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF ;
    public final EObject entryRuleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxConstraint = null;


        try {
            // InternalMoba.g:6477:58: (iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF )
            // InternalMoba.g:6478:2: iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF
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
    // InternalMoba.g:6484:1: ruleMobaMaxConstraint returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6490:2: ( (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6491:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6491:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6492:3: otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,103,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMaxConstraintAccess().getMaxKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMaxConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6500:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==RULE_DOUBLE) ) {
                alt102=1;
            }
            else if ( (LA102_0==RULE_CONSTANT) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;
            }
            switch (alt102) {
                case 1 :
                    // InternalMoba.g:6501:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:6501:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:6502:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:6502:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:6503:6: lv_filterValue_2_0= RULE_DOUBLE
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
                    // InternalMoba.g:6520:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6520:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6521:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6521:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6522:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6538:1: entryRuleMobaMinLengthConstraint returns [EObject current=null] : iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF ;
    public final EObject entryRuleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinLengthConstraint = null;


        try {
            // InternalMoba.g:6538:64: (iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF )
            // InternalMoba.g:6539:2: iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF
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
    // InternalMoba.g:6545:1: ruleMobaMinLengthConstraint returns [EObject current=null] : (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6551:2: ( (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6552:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6552:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6553:3: otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,104,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMinLengthConstraintAccess().getMinLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMinLengthConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6561:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_INT) ) {
                alt103=1;
            }
            else if ( (LA103_0==RULE_CONSTANT) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }
            switch (alt103) {
                case 1 :
                    // InternalMoba.g:6562:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:6562:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:6563:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:6563:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:6564:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:6581:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6581:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6582:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6582:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6583:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6599:1: entryRuleMobaMaxLengthConstraint returns [EObject current=null] : iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF ;
    public final EObject entryRuleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxLengthConstraint = null;


        try {
            // InternalMoba.g:6599:64: (iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF )
            // InternalMoba.g:6600:2: iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF
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
    // InternalMoba.g:6606:1: ruleMobaMaxLengthConstraint returns [EObject current=null] : (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6612:2: ( (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6613:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6613:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6614:3: otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,105,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMaxLengthConstraintAccess().getMaxLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,22,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMaxLengthConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6622:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt104=2;
            int LA104_0 = input.LA(1);

            if ( (LA104_0==RULE_INT) ) {
                alt104=1;
            }
            else if ( (LA104_0==RULE_CONSTANT) ) {
                alt104=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }
            switch (alt104) {
                case 1 :
                    // InternalMoba.g:6623:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:6623:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:6624:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:6624:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:6625:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:6642:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6642:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6643:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6643:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6644:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6660:1: entryRuleMobaDigitsConstraint returns [EObject current=null] : iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF ;
    public final EObject entryRuleMobaDigitsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDigitsConstraint = null;


        try {
            // InternalMoba.g:6660:61: (iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF )
            // InternalMoba.g:6661:2: iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF
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
    // InternalMoba.g:6667:1: ruleMobaDigitsConstraint returns [EObject current=null] : (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:6673:2: ( (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' ) )
            // InternalMoba.g:6674:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:6674:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )
            // InternalMoba.g:6675:3: otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,106,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDigitsConstraintAccess().getDigitsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,32,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaDigitsConstraintAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMoba.g:6683:3: ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==RULE_INT) ) {
                alt105=1;
            }
            else if ( (LA105_0==RULE_CONSTANT) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;
            }
            switch (alt105) {
                case 1 :
                    // InternalMoba.g:6684:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:6684:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    // InternalMoba.g:6685:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:6685:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    // InternalMoba.g:6686:6: lv_filterIntegerValue_2_0= RULE_INT
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
                    // InternalMoba.g:6703:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6703:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6704:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6704:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6705:6: otherlv_3= RULE_CONSTANT
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

            otherlv_4=(Token)match(input,33,FOLLOW_50); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMobaDigitsConstraintAccess().getCommaKeyword_3());
              		
            }
            // InternalMoba.g:6721:3: ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) )
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==RULE_INT) ) {
                alt106=1;
            }
            else if ( (LA106_0==RULE_CONSTANT) ) {
                alt106=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 106, 0, input);

                throw nvae;
            }
            switch (alt106) {
                case 1 :
                    // InternalMoba.g:6722:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    {
                    // InternalMoba.g:6722:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    // InternalMoba.g:6723:5: (lv_filterFractionValue_5_0= RULE_INT )
                    {
                    // InternalMoba.g:6723:5: (lv_filterFractionValue_5_0= RULE_INT )
                    // InternalMoba.g:6724:6: lv_filterFractionValue_5_0= RULE_INT
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
                    // InternalMoba.g:6741:4: ( (otherlv_6= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6741:4: ( (otherlv_6= RULE_CONSTANT ) )
                    // InternalMoba.g:6742:5: (otherlv_6= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6742:5: (otherlv_6= RULE_CONSTANT )
                    // InternalMoba.g:6743:6: otherlv_6= RULE_CONSTANT
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
    // InternalMoba.g:6763:1: entryRuleMobaNullConstraint returns [EObject current=null] : iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF ;
    public final EObject entryRuleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNullConstraint = null;


        try {
            // InternalMoba.g:6763:59: (iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF )
            // InternalMoba.g:6764:2: iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF
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
    // InternalMoba.g:6770:1: ruleMobaNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNull' ) ;
    public final EObject ruleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:6776:2: ( ( () otherlv_1= 'isNull' ) )
            // InternalMoba.g:6777:2: ( () otherlv_1= 'isNull' )
            {
            // InternalMoba.g:6777:2: ( () otherlv_1= 'isNull' )
            // InternalMoba.g:6778:3: () otherlv_1= 'isNull'
            {
            // InternalMoba.g:6778:3: ()
            // InternalMoba.g:6779:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaNullConstraintAccess().getMobaNullConstraintAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,107,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:6793:1: entryRuleMobaNotNullConstraint returns [EObject current=null] : iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF ;
    public final EObject entryRuleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNotNullConstraint = null;


        try {
            // InternalMoba.g:6793:62: (iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF )
            // InternalMoba.g:6794:2: iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF
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
    // InternalMoba.g:6800:1: ruleMobaNotNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNotNull' ) ;
    public final EObject ruleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:6806:2: ( ( () otherlv_1= 'isNotNull' ) )
            // InternalMoba.g:6807:2: ( () otherlv_1= 'isNotNull' )
            {
            // InternalMoba.g:6807:2: ( () otherlv_1= 'isNotNull' )
            // InternalMoba.g:6808:3: () otherlv_1= 'isNotNull'
            {
            // InternalMoba.g:6808:3: ()
            // InternalMoba.g:6809:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaNotNullConstraintAccess().getMobaNotNullConstraintAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,108,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:6823:1: entryRuleMobaGeneratorSlot returns [EObject current=null] : iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF ;
    public final EObject entryRuleMobaGeneratorSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorSlot = null;


        try {
            // InternalMoba.g:6823:58: (iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF )
            // InternalMoba.g:6824:2: iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF
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
    // InternalMoba.g:6830:1: ruleMobaGeneratorSlot returns [EObject current=null] : (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleMobaGeneratorSlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6836:2: ( (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? ) )
            // InternalMoba.g:6837:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? )
            {
            // InternalMoba.g:6837:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? )
            // InternalMoba.g:6838:3: otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,109,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorSlotAccess().getSlotKeyword_0());
              		
            }
            // InternalMoba.g:6842:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6843:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6843:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6844:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_80); if (state.failed) return current;
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

            // InternalMoba.g:6860:3: (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==67) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // InternalMoba.g:6861:4: otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,67,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaGeneratorSlotAccess().getTypeKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:6865:4: ( (lv_type_3_0= RULE_STRING ) )
                    // InternalMoba.g:6866:5: (lv_type_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:6866:5: (lv_type_3_0= RULE_STRING )
                    // InternalMoba.g:6867:6: lv_type_3_0= RULE_STRING
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
    // InternalMoba.g:6888:1: entryRuleMobaTrigger returns [EObject current=null] : iv_ruleMobaTrigger= ruleMobaTrigger EOF ;
    public final EObject entryRuleMobaTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTrigger = null;


        try {
            // InternalMoba.g:6888:52: (iv_ruleMobaTrigger= ruleMobaTrigger EOF )
            // InternalMoba.g:6889:2: iv_ruleMobaTrigger= ruleMobaTrigger EOF
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
    // InternalMoba.g:6895:1: ruleMobaTrigger returns [EObject current=null] : (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger ) ;
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
            // InternalMoba.g:6901:2: ( (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger ) )
            // InternalMoba.g:6902:2: (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger )
            {
            // InternalMoba.g:6902:2: (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger )
            int alt108=7;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt108=1;
                }
                break;
            case 111:
                {
                alt108=2;
                }
                break;
            case 112:
                {
                alt108=3;
                }
                break;
            case 113:
                {
                alt108=4;
                }
                break;
            case 114:
                {
                alt108=5;
                }
                break;
            case 115:
                {
                alt108=6;
                }
                break;
            case 116:
                {
                alt108=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // InternalMoba.g:6903:3: this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger
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
                    // InternalMoba.g:6912:3: this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger
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
                    // InternalMoba.g:6921:3: this_MobaEmailTrigger_2= ruleMobaEmailTrigger
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
                    // InternalMoba.g:6930:3: this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger
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
                    // InternalMoba.g:6939:3: this_MobaSMSTrigger_4= ruleMobaSMSTrigger
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
                    // InternalMoba.g:6948:3: this_MobaPushTrigger_5= ruleMobaPushTrigger
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
                    // InternalMoba.g:6957:3: this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger
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
    // InternalMoba.g:6969:1: entryRuleMobaAppInstallTrigger returns [EObject current=null] : iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF ;
    public final EObject entryRuleMobaAppInstallTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAppInstallTrigger = null;


        try {
            // InternalMoba.g:6969:62: (iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF )
            // InternalMoba.g:6970:2: iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF
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
    // InternalMoba.g:6976:1: ruleMobaAppInstallTrigger returns [EObject current=null] : (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaAppInstallTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:6982:2: ( (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:6983:2: (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:6983:2: (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:6984:3: otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,110,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaAppInstallTriggerAccess().getTriggerAppInstallKeyword_0());
              		
            }
            // InternalMoba.g:6988:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:6989:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:6989:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:6990:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7010:1: entryRuleMobaAppUpdateTrigger returns [EObject current=null] : iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF ;
    public final EObject entryRuleMobaAppUpdateTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAppUpdateTrigger = null;


        try {
            // InternalMoba.g:7010:61: (iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF )
            // InternalMoba.g:7011:2: iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF
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
    // InternalMoba.g:7017:1: ruleMobaAppUpdateTrigger returns [EObject current=null] : (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaAppUpdateTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7023:2: ( (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7024:2: (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7024:2: (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7025:3: otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,111,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaAppUpdateTriggerAccess().getTriggerAppUpdateKeyword_0());
              		
            }
            // InternalMoba.g:7029:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7030:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7030:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7031:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7051:1: entryRuleMobaEmailTrigger returns [EObject current=null] : iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF ;
    public final EObject entryRuleMobaEmailTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEmailTrigger = null;


        try {
            // InternalMoba.g:7051:57: (iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF )
            // InternalMoba.g:7052:2: iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF
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
    // InternalMoba.g:7058:1: ruleMobaEmailTrigger returns [EObject current=null] : (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaEmailTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7064:2: ( (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7065:2: (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7065:2: (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7066:3: otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,112,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEmailTriggerAccess().getTriggerEmailKeyword_0());
              		
            }
            // InternalMoba.g:7070:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7071:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7071:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7072:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7092:1: entryRuleMobaDeviceStartupTrigger returns [EObject current=null] : iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF ;
    public final EObject entryRuleMobaDeviceStartupTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDeviceStartupTrigger = null;


        try {
            // InternalMoba.g:7092:65: (iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF )
            // InternalMoba.g:7093:2: iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF
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
    // InternalMoba.g:7099:1: ruleMobaDeviceStartupTrigger returns [EObject current=null] : (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaDeviceStartupTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7105:2: ( (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7106:2: (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7106:2: (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7107:3: otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,113,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDeviceStartupTriggerAccess().getTriggerDeviceStartKeyword_0());
              		
            }
            // InternalMoba.g:7111:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7112:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7112:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7113:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7133:1: entryRuleMobaSMSTrigger returns [EObject current=null] : iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF ;
    public final EObject entryRuleMobaSMSTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSMSTrigger = null;


        try {
            // InternalMoba.g:7133:55: (iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF )
            // InternalMoba.g:7134:2: iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF
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
    // InternalMoba.g:7140:1: ruleMobaSMSTrigger returns [EObject current=null] : (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaSMSTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7146:2: ( (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7147:2: (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7147:2: (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7148:3: otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,114,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaSMSTriggerAccess().getTriggerSmsKeyword_0());
              		
            }
            // InternalMoba.g:7152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7153:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7154:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7174:1: entryRuleMobaPushTrigger returns [EObject current=null] : iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF ;
    public final EObject entryRuleMobaPushTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPushTrigger = null;


        try {
            // InternalMoba.g:7174:56: (iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF )
            // InternalMoba.g:7175:2: iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF
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
    // InternalMoba.g:7181:1: ruleMobaPushTrigger returns [EObject current=null] : (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaPushTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7187:2: ( (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7188:2: (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7188:2: (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7189:3: otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,115,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaPushTriggerAccess().getTriggerPushKeyword_0());
              		
            }
            // InternalMoba.g:7193:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7194:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7194:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7195:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7215:1: entryRuleMobaGeofenceTrigger returns [EObject current=null] : iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF ;
    public final EObject entryRuleMobaGeofenceTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeofenceTrigger = null;


        try {
            // InternalMoba.g:7215:60: (iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF )
            // InternalMoba.g:7216:2: iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF
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
    // InternalMoba.g:7222:1: ruleMobaGeofenceTrigger returns [EObject current=null] : (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) ) ;
    public final EObject ruleMobaGeofenceTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_eventType_4_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:7228:2: ( (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) ) )
            // InternalMoba.g:7229:2: (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) )
            {
            // InternalMoba.g:7229:2: (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) )
            // InternalMoba.g:7230:3: otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) )
            {
            otherlv_0=(Token)match(input,116,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeofenceTriggerAccess().getTriggerGeofenceKeyword_0());
              		
            }
            // InternalMoba.g:7234:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7235:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7235:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7236:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_81); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,117,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaGeofenceTriggerAccess().getEventKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,22,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaGeofenceTriggerAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:7260:3: ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) )
            // InternalMoba.g:7261:4: (lv_eventType_4_0= ruleMobaGeofenceEvent )
            {
            // InternalMoba.g:7261:4: (lv_eventType_4_0= ruleMobaGeofenceEvent )
            // InternalMoba.g:7262:5: lv_eventType_4_0= ruleMobaGeofenceEvent
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
    // InternalMoba.g:7283:1: entryRuleMobaExternalModule returns [EObject current=null] : iv_ruleMobaExternalModule= ruleMobaExternalModule EOF ;
    public final EObject entryRuleMobaExternalModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaExternalModule = null;


        try {
            // InternalMoba.g:7283:59: (iv_ruleMobaExternalModule= ruleMobaExternalModule EOF )
            // InternalMoba.g:7284:2: iv_ruleMobaExternalModule= ruleMobaExternalModule EOF
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
    // InternalMoba.g:7290:1: ruleMobaExternalModule returns [EObject current=null] : (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule ) ;
    public final EObject ruleMobaExternalModule() throws RecognitionException {
        EObject current = null;

        EObject this_MobaBluetoothModule_0 = null;

        EObject this_MobaPushModule_1 = null;

        EObject this_MobaNFCModule_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:7296:2: ( (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule ) )
            // InternalMoba.g:7297:2: (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule )
            {
            // InternalMoba.g:7297:2: (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule )
            int alt109=3;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt109=1;
                }
                break;
            case 119:
                {
                alt109=2;
                }
                break;
            case 120:
                {
                alt109=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 109, 0, input);

                throw nvae;
            }

            switch (alt109) {
                case 1 :
                    // InternalMoba.g:7298:3: this_MobaBluetoothModule_0= ruleMobaBluetoothModule
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
                    // InternalMoba.g:7307:3: this_MobaPushModule_1= ruleMobaPushModule
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
                    // InternalMoba.g:7316:3: this_MobaNFCModule_2= ruleMobaNFCModule
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
    // InternalMoba.g:7328:1: entryRuleMobaBluetoothModule returns [EObject current=null] : iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF ;
    public final EObject entryRuleMobaBluetoothModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaBluetoothModule = null;


        try {
            // InternalMoba.g:7328:60: (iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF )
            // InternalMoba.g:7329:2: iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF
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
    // InternalMoba.g:7335:1: ruleMobaBluetoothModule returns [EObject current=null] : (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaBluetoothModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;

        EObject this_MobaFriendsAble_5 = null;



        	enterRule();

        try {
            // InternalMoba.g:7341:2: ( (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:7342:2: (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:7342:2: (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:7343:3: otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,118,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaBluetoothModuleAccess().getModuleBluetoothKeyword_0());
              		
            }
            // InternalMoba.g:7347:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7348:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7348:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7349:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); if (state.failed) return current;
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
            otherlv_3=(Token)match(input,22,FOLLOW_84); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaBluetoothModuleAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:7373:3: ( (lv_type_4_0= ruleMobaBlueToothModuleType ) )
            // InternalMoba.g:7374:4: (lv_type_4_0= ruleMobaBlueToothModuleType )
            {
            // InternalMoba.g:7374:4: (lv_type_4_0= ruleMobaBlueToothModuleType )
            // InternalMoba.g:7375:5: lv_type_4_0= ruleMobaBlueToothModuleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMobaBluetoothModuleAccess().getTypeMobaBlueToothModuleTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaBluetoothModuleRule());
              			}
              			newCompositeNode(grammarAccess.getMobaBluetoothModuleAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_5;
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
    // $ANTLR end "ruleMobaBluetoothModule"


    // $ANTLR start "entryRuleMobaPushModule"
    // InternalMoba.g:7407:1: entryRuleMobaPushModule returns [EObject current=null] : iv_ruleMobaPushModule= ruleMobaPushModule EOF ;
    public final EObject entryRuleMobaPushModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPushModule = null;


        try {
            // InternalMoba.g:7407:55: (iv_ruleMobaPushModule= ruleMobaPushModule EOF )
            // InternalMoba.g:7408:2: iv_ruleMobaPushModule= ruleMobaPushModule EOF
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
    // InternalMoba.g:7414:1: ruleMobaPushModule returns [EObject current=null] : (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaPushModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:7420:2: ( (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:7421:2: (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:7421:2: (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:7422:3: otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,119,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaPushModuleAccess().getModulePushKeyword_0());
              		
            }
            // InternalMoba.g:7426:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7427:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7427:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7428:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_25); if (state.failed) return current;
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

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaPushModuleRule());
              			}
              			newCompositeNode(grammarAccess.getMobaPushModuleAccess().getMobaFriendsAbleParserRuleCall_2());
              		
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
    // $ANTLR end "ruleMobaPushModule"


    // $ANTLR start "entryRuleMobaNFCModule"
    // InternalMoba.g:7459:1: entryRuleMobaNFCModule returns [EObject current=null] : iv_ruleMobaNFCModule= ruleMobaNFCModule EOF ;
    public final EObject entryRuleMobaNFCModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNFCModule = null;


        try {
            // InternalMoba.g:7459:54: (iv_ruleMobaNFCModule= ruleMobaNFCModule EOF )
            // InternalMoba.g:7460:2: iv_ruleMobaNFCModule= ruleMobaNFCModule EOF
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
    // InternalMoba.g:7466:1: ruleMobaNFCModule returns [EObject current=null] : (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaNFCModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_type_4_0 = null;

        EObject this_MobaFriendsAble_5 = null;



        	enterRule();

        try {
            // InternalMoba.g:7472:2: ( (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:7473:2: (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:7473:2: (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:7474:3: otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,120,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaNFCModuleAccess().getModuleNFCKeyword_0());
              		
            }
            // InternalMoba.g:7478:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7479:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7479:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7480:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); if (state.failed) return current;
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
            otherlv_3=(Token)match(input,22,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaNFCModuleAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:7504:3: ( (lv_type_4_0= ruleMobaNFCModuleType ) )
            // InternalMoba.g:7505:4: (lv_type_4_0= ruleMobaNFCModuleType )
            {
            // InternalMoba.g:7505:4: (lv_type_4_0= ruleMobaNFCModuleType )
            // InternalMoba.g:7506:5: lv_type_4_0= ruleMobaNFCModuleType
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMobaNFCModuleAccess().getTypeMobaNFCModuleTypeEnumRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_25);
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

            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getMobaNFCModuleRule());
              			}
              			newCompositeNode(grammarAccess.getMobaNFCModuleAccess().getMobaFriendsAbleParserRuleCall_5());
              		
            }
            pushFollow(FOLLOW_2);
            this_MobaFriendsAble_5=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_5;
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
    // $ANTLR end "ruleMobaNFCModule"


    // $ANTLR start "ruleMobaConstantValueFunction"
    // InternalMoba.g:7538:1: ruleMobaConstantValueFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) ) ;
    public final Enumerator ruleMobaConstantValueFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoba.g:7544:2: ( ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) ) )
            // InternalMoba.g:7545:2: ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) )
            {
            // InternalMoba.g:7545:2: ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) )
            int alt110=4;
            switch ( input.LA(1) ) {
            case 121:
                {
                alt110=1;
                }
                break;
            case 122:
                {
                alt110=2;
                }
                break;
            case 123:
                {
                alt110=3;
                }
                break;
            case 124:
                {
                alt110=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;
            }

            switch (alt110) {
                case 1 :
                    // InternalMoba.g:7546:3: (enumLiteral_0= 'toFirstLower' )
                    {
                    // InternalMoba.g:7546:3: (enumLiteral_0= 'toFirstLower' )
                    // InternalMoba.g:7547:4: enumLiteral_0= 'toFirstLower'
                    {
                    enumLiteral_0=(Token)match(input,121,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_LOWER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_LOWER_CASEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7554:3: (enumLiteral_1= 'toFirstUpper' )
                    {
                    // InternalMoba.g:7554:3: (enumLiteral_1= 'toFirstUpper' )
                    // InternalMoba.g:7555:4: enumLiteral_1= 'toFirstUpper'
                    {
                    enumLiteral_1=(Token)match(input,122,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_UPPER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_UPPER_CASEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7562:3: (enumLiteral_2= 'toLowerCase' )
                    {
                    // InternalMoba.g:7562:3: (enumLiteral_2= 'toLowerCase' )
                    // InternalMoba.g:7563:4: enumLiteral_2= 'toLowerCase'
                    {
                    enumLiteral_2=(Token)match(input,123,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_LOWER_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaConstantValueFunctionAccess().getTO_LOWER_CASEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:7570:3: (enumLiteral_3= 'toUpperCase' )
                    {
                    // InternalMoba.g:7570:3: (enumLiteral_3= 'toUpperCase' )
                    // InternalMoba.g:7571:4: enumLiteral_3= 'toUpperCase'
                    {
                    enumLiteral_3=(Token)match(input,124,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7581:1: ruleMobaGeofenceEvent returns [Enumerator current=null] : ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) ) ;
    public final Enumerator ruleMobaGeofenceEvent() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:7587:2: ( ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) ) )
            // InternalMoba.g:7588:2: ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) )
            {
            // InternalMoba.g:7588:2: ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) )
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==125) ) {
                alt111=1;
            }
            else if ( (LA111_0==126) ) {
                alt111=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }
            switch (alt111) {
                case 1 :
                    // InternalMoba.g:7589:3: (enumLiteral_0= 'enter' )
                    {
                    // InternalMoba.g:7589:3: (enumLiteral_0= 'enter' )
                    // InternalMoba.g:7590:4: enumLiteral_0= 'enter'
                    {
                    enumLiteral_0=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaGeofenceEventAccess().getENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaGeofenceEventAccess().getENTEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7597:3: (enumLiteral_1= 'leave' )
                    {
                    // InternalMoba.g:7597:3: (enumLiteral_1= 'leave' )
                    // InternalMoba.g:7598:4: enumLiteral_1= 'leave'
                    {
                    enumLiteral_1=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7608:1: ruleMobaBlueToothModuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) ) ;
    public final Enumerator ruleMobaBlueToothModuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMoba.g:7614:2: ( ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) ) )
            // InternalMoba.g:7615:2: ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) )
            {
            // InternalMoba.g:7615:2: ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) )
            int alt112=3;
            switch ( input.LA(1) ) {
            case 127:
                {
                alt112=1;
                }
                break;
            case 128:
                {
                alt112=2;
                }
                break;
            case 129:
                {
                alt112=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }

            switch (alt112) {
                case 1 :
                    // InternalMoba.g:7616:3: (enumLiteral_0= 'lowEnergy' )
                    {
                    // InternalMoba.g:7616:3: (enumLiteral_0= 'lowEnergy' )
                    // InternalMoba.g:7617:4: enumLiteral_0= 'lowEnergy'
                    {
                    enumLiteral_0=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaBlueToothModuleTypeAccess().getLEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7624:3: (enumLiteral_1= 'spp' )
                    {
                    // InternalMoba.g:7624:3: (enumLiteral_1= 'spp' )
                    // InternalMoba.g:7625:4: enumLiteral_1= 'spp'
                    {
                    enumLiteral_1=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getSPPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaBlueToothModuleTypeAccess().getSPPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7632:3: (enumLiteral_2= 'beacon' )
                    {
                    // InternalMoba.g:7632:3: (enumLiteral_2= 'beacon' )
                    // InternalMoba.g:7633:4: enumLiteral_2= 'beacon'
                    {
                    enumLiteral_2=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7643:1: ruleMobaNFCModuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) ) ;
    public final Enumerator ruleMobaNFCModuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMoba.g:7649:2: ( ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) ) )
            // InternalMoba.g:7650:2: ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) )
            {
            // InternalMoba.g:7650:2: ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 130:
                {
                alt113=1;
                }
                break;
            case 131:
                {
                alt113=2;
                }
                break;
            case 132:
                {
                alt113=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 113, 0, input);

                throw nvae;
            }

            switch (alt113) {
                case 1 :
                    // InternalMoba.g:7651:3: (enumLiteral_0= 'id' )
                    {
                    // InternalMoba.g:7651:3: (enumLiteral_0= 'id' )
                    // InternalMoba.g:7652:4: enumLiteral_0= 'id'
                    {
                    enumLiteral_0=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaNFCModuleTypeAccess().getIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaNFCModuleTypeAccess().getIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7659:3: (enumLiteral_1= 'custom' )
                    {
                    // InternalMoba.g:7659:3: (enumLiteral_1= 'custom' )
                    // InternalMoba.g:7660:4: enumLiteral_1= 'custom'
                    {
                    enumLiteral_1=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaNFCModuleTypeAccess().getCUSTOMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaNFCModuleTypeAccess().getCUSTOMEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7667:3: (enumLiteral_2= 'text' )
                    {
                    // InternalMoba.g:7667:3: (enumLiteral_2= 'text' )
                    // InternalMoba.g:7668:4: enumLiteral_2= 'text'
                    {
                    enumLiteral_2=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7678:1: ruleMobaLowerBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) ;
    public final Enumerator ruleMobaLowerBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMoba.g:7684:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) )
            // InternalMoba.g:7685:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            {
            // InternalMoba.g:7685:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            int alt114=5;
            switch ( input.LA(1) ) {
            case 133:
                {
                alt114=1;
                }
                break;
            case 134:
                {
                alt114=2;
                }
                break;
            case 135:
                {
                alt114=3;
                }
                break;
            case 61:
                {
                alt114=4;
                }
                break;
            case 136:
                {
                alt114=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // InternalMoba.g:7686:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:7686:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:7687:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7694:3: (enumLiteral_1= '0' )
                    {
                    // InternalMoba.g:7694:3: (enumLiteral_1= '0' )
                    // InternalMoba.g:7695:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7702:3: (enumLiteral_2= '?' )
                    {
                    // InternalMoba.g:7702:3: (enumLiteral_2= '?' )
                    // InternalMoba.g:7703:4: enumLiteral_2= '?'
                    {
                    enumLiteral_2=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:7710:3: (enumLiteral_3= '+' )
                    {
                    // InternalMoba.g:7710:3: (enumLiteral_3= '+' )
                    // InternalMoba.g:7711:4: enumLiteral_3= '+'
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
                    // InternalMoba.g:7718:3: (enumLiteral_4= '1' )
                    {
                    // InternalMoba.g:7718:3: (enumLiteral_4= '1' )
                    // InternalMoba.g:7719:4: enumLiteral_4= '1'
                    {
                    enumLiteral_4=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7729:1: ruleMobaUpperBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) ;
    public final Enumerator ruleMobaUpperBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:7735:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) )
            // InternalMoba.g:7736:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            {
            // InternalMoba.g:7736:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            int alt115=2;
            int LA115_0 = input.LA(1);

            if ( (LA115_0==133) ) {
                alt115=1;
            }
            else if ( (LA115_0==136) ) {
                alt115=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }
            switch (alt115) {
                case 1 :
                    // InternalMoba.g:7737:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:7737:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:7738:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7745:3: (enumLiteral_1= '1' )
                    {
                    // InternalMoba.g:7745:3: (enumLiteral_1= '1' )
                    // InternalMoba.g:7746:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7756:1: ruleMobaRESTMethods returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMobaRESTMethods() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoba.g:7762:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalMoba.g:7763:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalMoba.g:7763:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt116=4;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt116=1;
                }
                break;
            case 138:
                {
                alt116=2;
                }
                break;
            case 139:
                {
                alt116=3;
                }
                break;
            case 140:
                {
                alt116=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }

            switch (alt116) {
                case 1 :
                    // InternalMoba.g:7764:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalMoba.g:7764:3: (enumLiteral_0= 'GET' )
                    // InternalMoba.g:7765:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaRESTMethodsAccess().getGETEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7772:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalMoba.g:7772:3: (enumLiteral_1= 'POST' )
                    // InternalMoba.g:7773:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaRESTMethodsAccess().getPOSTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7780:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalMoba.g:7780:3: (enumLiteral_2= 'PUT' )
                    // InternalMoba.g:7781:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaRESTMethodsAccess().getPUTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:7788:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalMoba.g:7788:3: (enumLiteral_3= 'DELETE' )
                    // InternalMoba.g:7789:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
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
        // InternalMoba.g:3707:5: ( RULE_ID )
        // InternalMoba.g:3707:6: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMoba

    // $ANTLR start synpred2_InternalMoba
    public final void synpred2_InternalMoba_fragment() throws RecognitionException {   
        // InternalMoba.g:3856:5: ( RULE_ID )
        // InternalMoba.g:3856:6: RULE_ID
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


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\17\uffff";
    static final String dfa_2s = "\1\34\3\uffff\1\46\12\uffff";
    static final String dfa_3s = "\1\170\3\uffff\1\101\12\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15";
    static final String dfa_5s = "\17\uffff}>";
    static final String[] dfa_6s = {
            "\1\16\7\uffff\1\2\1\4\1\10\3\uffff\1\11\1\12\1\1\16\uffff\1\3\5\uffff\1\5\4\uffff\1\6\2\uffff\2\6\1\7\11\uffff\2\7\26\uffff\1\15\7\14\1\uffff\3\13",
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

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_1;
            this.min = dfa_2;
            this.max = dfa_3;
            this.accept = dfa_4;
            this.special = dfa_5;
            this.transition = dfa_6;
        }
        public String getDescription() {
            return "439:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer )";
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
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0xC000000000800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x08001C7014000000L,0x01DFE00000600E42L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0xC000000040800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000884000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000600000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000028004000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xC000000000000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x00F7E00040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x00F7E00000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0xC0F7E00000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x00001FE000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0xC0F7E00100000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0xC0FFE00000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0100000004000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000CC0L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x3000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000000000000000L,0x1E00000000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000004000000L,0x0000000041000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0xC000000040800000L,0x0000000000000004L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000004000000L,0x0000000501000180L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000004000000L,0x0000000000000180L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000004000000L,0x0000000501000000L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000004000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000000010L,0x0000000000001000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000004000000L,0x000000000007E000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000004000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000200000000002L,0x0000000000080000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0xC000000040000000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000004000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000400000000010L,0x000000001E000000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x8000000000000010L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0xC000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000000000000010L,0x0000000086000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0xC000000000000000L,0x0000000200000000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000010L,0x0000000004000000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0xC000000000000000L,0x0000000820000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0xC000000000000000L,0x0000000A00000000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0xC000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000000L,0x00000000000001E0L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000001L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x8000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000000001CL});

}
