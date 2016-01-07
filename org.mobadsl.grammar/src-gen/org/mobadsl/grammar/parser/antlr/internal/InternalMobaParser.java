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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_VERSION", "RULE_STRING", "RULE_CONSTANT", "RULE_DOWNLOAD_TEMPLATE", "RULE_FQN", "RULE_INT", "RULE_DOUBLE", "RULE_DIGIT", "RULE_SIGN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "RULE_ID_VERSION", "'project'", "'version'", "'='", "'{'", "'uiApp'", "'backgroundApp'", "'}'", "'application'", "'cache'", "'server'", "'url'", "'extends'", "'authorization'", "'services'", "'('", "','", "')'", "'use template'", "'active'", "'generator'", "'extensionPoint'", "':'", "'mixin'", "'serialization'", "'persistence'", "'datatype'", "'isArray'", "'constraints'", "'isDate'", "'isTime'", "'isTimestamp'", "'isPredefined'", "'isString'", "'isPrimitive'", "'isBool'", "'isNumeric'", "'isDecimal'", "'enum'", "'lit'", "'isDefault'", "'isUndefined'", "'isHidden'", "'const'", "'->'", "'+'", "'friends'", "'['", "']'", "'settings'", "'type'", "'strategy'", "'interval'", "'using'", "'entity'", "'unique'", "'index'", "'dto'", "'wraps'", "'queue'", "'rest'", "'bigData'", "'headers'", "'parameters'", "'autorization'", "'requestDto'", "'responseDto'", "'errorDto'", "'method'", "'as'", "'param'", "'restCrud'", "'restWorkflow'", "'service'", "'var'", "'lazy'", "'transient'", "'domainKey'", "'domainDescription'", "'format'", "'refEntity'", "'cascading'", "'ref'", "'opposite'", "'embed'", "'alias'", "'..'", "'regexp'", "'min'", "'max'", "'minLength'", "'maxLength'", "'digits'", "'isNull'", "'isNotNull'", "'slot'", "'trigger app install'", "'trigger app update'", "'trigger email'", "'trigger device start'", "'trigger sms'", "'trigger push'", "'trigger geofence'", "'event'", "'module bluetooth'", "'module push'", "'module NFC'", "'toFirstLower'", "'toFirstUpper'", "'toLowerCase'", "'toUpperCase'", "'enter'", "'leave'", "'lowEnergy'", "'spp'", "'beacon'", "'id'", "'custom'", "'text'", "'*'", "'0'", "'?'", "'1'", "'GET'", "'POST'", "'PUT'", "'DELETE'"
    };
    public static final int T__144=144;
    public static final int T__143=143;
    public static final int T__50=50;
    public static final int T__140=140;
    public static final int T__142=142;
    public static final int T__141=141;
    public static final int RULE_SIGN=13;
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
    public static final int RULE_DIGIT=12;
    public static final int RULE_INT=10;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=14;
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
    public static final int T__19=19;
    public static final int T__99=99;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int RULE_ID_VERSION=18;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__122=122;
    public static final int T__70=70;
    public static final int T__121=121;
    public static final int T__71=71;
    public static final int T__124=124;
    public static final int T__72=72;
    public static final int T__123=123;
    public static final int T__120=120;
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=15;
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
    public static final int RULE_WS=16;
    public static final int RULE_ANY_OTHER=17;
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

                if ( (LA1_0==19||LA1_0==26) ) {
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

            if ( (LA2_0==19) ) {
                alt2=1;
            }
            else if ( (LA2_0==26) ) {
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
            otherlv_0=(Token)match(input,19,FOLLOW_4); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaProjectAccess().getVersionKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
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
            otherlv_6=(Token)match(input,22,FOLLOW_10); if (state.failed) return current;
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

                if ( LA3_0 == 23 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 0) ) {
                    alt3=1;
                }
                else if ( LA3_0 == 24 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaProjectAccess().getUnorderedGroup_7(), 1) ) {
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
            	    otherlv_8=(Token)match(input,23,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getMobaProjectAccess().getUiAppKeyword_7_0_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
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
            	    otherlv_11=(Token)match(input,24,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaProjectAccess().getBackgroundAppKeyword_7_1_0());
            	      								
            	    }
            	    otherlv_12=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
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

            otherlv_14=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:308:1: ruleMobaApplication returns [EObject current=null] : (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaApplicationFeature ) )* otherlv_11= '}' ) ;
    public final EObject ruleMobaApplication() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_version_4_0=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_MobaFriendsAble_8 = null;

        EObject lv_features_10_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:314:2: ( (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaApplicationFeature ) )* otherlv_11= '}' ) )
            // InternalMoba.g:315:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaApplicationFeature ) )* otherlv_11= '}' )
            {
            // InternalMoba.g:315:2: (otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaApplicationFeature ) )* otherlv_11= '}' )
            // InternalMoba.g:316:3: otherlv_0= 'application' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'version' otherlv_3= '=' ( (lv_version_4_0= RULE_VERSION ) ) (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaApplicationFeature ) )* otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_4); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,20,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaApplicationAccess().getVersionKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,21,FOLLOW_7); if (state.failed) return current;
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

            // InternalMoba.g:364:3: (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==27) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMoba.g:365:4: otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_5=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMobaApplicationAccess().getCacheKeyword_5_0());
                      			
                    }
                    otherlv_6=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMobaApplicationAccess().getEqualsSignKeyword_5_1());
                      			
                    }
                    // InternalMoba.g:373:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMoba.g:374:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMoba.g:374:5: (otherlv_7= RULE_ID )
                    // InternalMoba.g:375:6: otherlv_7= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaApplicationRule());
                      						}
                      					
                    }
                    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_7, grammarAccess.getMobaApplicationAccess().getDefaultCacheMobaCacheCrossReference_5_2_0());
                      					
                    }

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
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_8;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_9=(Token)match(input,22,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMobaApplicationAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            // InternalMoba.g:402:3: ( (lv_features_10_0= ruleMobaApplicationFeature ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=27 && LA5_0<=28)||LA5_0==31||(LA5_0>=36 && LA5_0<=38)||(LA5_0>=42 && LA5_0<=44)||LA5_0==61||LA5_0==67||LA5_0==72||LA5_0==75||(LA5_0>=77 && LA5_0<=78)||(LA5_0>=89 && LA5_0<=90)||(LA5_0>=113 && LA5_0<=120)||(LA5_0>=122 && LA5_0<=124)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMoba.g:403:4: (lv_features_10_0= ruleMobaApplicationFeature )
            	    {
            	    // InternalMoba.g:403:4: (lv_features_10_0= ruleMobaApplicationFeature )
            	    // InternalMoba.g:404:5: lv_features_10_0= ruleMobaApplicationFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaApplicationAccess().getFeaturesMobaApplicationFeatureParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_features_10_0=ruleMobaApplicationFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMobaApplicationRule());
            	      					}
            	      					add(
            	      						current,
            	      						"features",
            	      						lv_features_10_0,
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

            otherlv_11=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_11, grammarAccess.getMobaApplicationAccess().getRightCurlyBracketKeyword_9());
              		
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
    // InternalMoba.g:429:1: entryRuleMobaApplicationFeature returns [EObject current=null] : iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF ;
    public final EObject entryRuleMobaApplicationFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaApplicationFeature = null;


        try {
            // InternalMoba.g:429:63: (iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF )
            // InternalMoba.g:430:2: iv_ruleMobaApplicationFeature= ruleMobaApplicationFeature EOF
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
    // InternalMoba.g:436:1: ruleMobaApplicationFeature returns [EObject current=null] : (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache ) ;
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

        EObject this_MobaPersistenceType_13 = null;

        EObject this_MobaCache_14 = null;



        	enterRule();

        try {
            // InternalMoba.g:442:2: ( (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache ) )
            // InternalMoba.g:443:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache )
            {
            // InternalMoba.g:443:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache )
            int alt6=15;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalMoba.g:444:3: this_MobaDataType_0= ruleMobaDataType
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
                    // InternalMoba.g:453:3: this_MobaTemplate_1= ruleMobaTemplate
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
                    // InternalMoba.g:462:3: this_MobaConstant_2= ruleMobaConstant
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
                    // InternalMoba.g:471:3: this_MobaSettings_3= ruleMobaSettings
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
                    // InternalMoba.g:480:3: this_MobaData_4= ruleMobaData
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
                    // InternalMoba.g:489:3: this_MobaREST_5= ruleMobaREST
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
                    // InternalMoba.g:498:3: this_MobaGenerator_6= ruleMobaGenerator
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
                    // InternalMoba.g:507:3: this_MobaAuthorization_7= ruleMobaAuthorization
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
                    // InternalMoba.g:516:3: this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType
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
                    // InternalMoba.g:525:3: this_MobaExternalModule_9= ruleMobaExternalModule
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
                    // InternalMoba.g:534:3: this_MobaTrigger_10= ruleMobaTrigger
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
                    // InternalMoba.g:543:3: this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot
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
                    // InternalMoba.g:552:3: this_MobaServer_12= ruleMobaServer
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
                case 14 :
                    // InternalMoba.g:561:3: this_MobaPersistenceType_13= ruleMobaPersistenceType
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaPersistenceTypeParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaPersistenceType_13=ruleMobaPersistenceType();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaPersistenceType_13;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalMoba.g:570:3: this_MobaCache_14= ruleMobaCache
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getMobaApplicationFeatureAccess().getMobaCacheParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_MobaCache_14=ruleMobaCache();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_MobaCache_14;
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
    // InternalMoba.g:582:1: entryRuleMobaServer returns [EObject current=null] : iv_ruleMobaServer= ruleMobaServer EOF ;
    public final EObject entryRuleMobaServer() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaServer = null;


        try {
            // InternalMoba.g:582:51: (iv_ruleMobaServer= ruleMobaServer EOF )
            // InternalMoba.g:583:2: iv_ruleMobaServer= ruleMobaServer EOF
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
    // InternalMoba.g:589:1: ruleMobaServer returns [EObject current=null] : (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}' ) ;
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
        EObject this_MobaFriendsAble_8 = null;



        	enterRule();

        try {
            // InternalMoba.g:595:2: ( (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}' ) )
            // InternalMoba.g:596:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}' )
            {
            // InternalMoba.g:596:2: (otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}' )
            // InternalMoba.g:597:3: otherlv_0= 'server' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'url' otherlv_3= '=' ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) ) (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )? this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) ) otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaServerAccess().getServerKeyword_0());
              		
            }
            // InternalMoba.g:601:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:602:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:602:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:603:5: lv_name_1_0= RULE_ID
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
            otherlv_3=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaServerAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:627:3: ( ( (lv_urlString_4_0= RULE_STRING ) ) | ( (otherlv_5= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:628:4: ( (lv_urlString_4_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:628:4: ( (lv_urlString_4_0= RULE_STRING ) )
                    // InternalMoba.g:629:5: (lv_urlString_4_0= RULE_STRING )
                    {
                    // InternalMoba.g:629:5: (lv_urlString_4_0= RULE_STRING )
                    // InternalMoba.g:630:6: lv_urlString_4_0= RULE_STRING
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
                      							"org.mobadsl.grammar.Moba.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:647:4: ( (otherlv_5= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:647:4: ( (otherlv_5= RULE_CONSTANT ) )
                    // InternalMoba.g:648:5: (otherlv_5= RULE_CONSTANT )
                    {
                    // InternalMoba.g:648:5: (otherlv_5= RULE_CONSTANT )
                    // InternalMoba.g:649:6: otherlv_5= RULE_CONSTANT
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

            // InternalMoba.g:661:3: (otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==30) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMoba.g:662:4: otherlv_6= 'extends' ( (otherlv_7= RULE_ID ) )
                    {
                    otherlv_6=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMobaServerAccess().getExtendsKeyword_5_0());
                      			
                    }
                    // InternalMoba.g:666:4: ( (otherlv_7= RULE_ID ) )
                    // InternalMoba.g:667:5: (otherlv_7= RULE_ID )
                    {
                    // InternalMoba.g:667:5: (otherlv_7= RULE_ID )
                    // InternalMoba.g:668:6: otherlv_7= RULE_ID
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
            otherlv_9=(Token)match(input,22,FOLLOW_16); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMobaServerAccess().getLeftCurlyBracketKeyword_7());
              		
            }
            // InternalMoba.g:695:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:696:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:696:4: ( ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* ) )
            // InternalMoba.g:697:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());
            // InternalMoba.g:700:5: ( ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )* )
            // InternalMoba.g:701:6: ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )*
            {
            // InternalMoba.g:701:6: ( ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) ) )*
            loop10:
            do {
                int alt10=3;
                int LA10_0 = input.LA(1);

                if ( LA10_0 == 31 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0) ) {
                    alt10=1;
                }
                else if ( LA10_0 == 32 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1) ) {
                    alt10=2;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMoba.g:702:4: ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:702:4: ({...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) ) )
            	    // InternalMoba.g:703:5: {...}? => ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0)");
            	    }
            	    // InternalMoba.g:703:107: ( ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) ) )
            	    // InternalMoba.g:704:6: ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 0);
            	    // InternalMoba.g:707:9: ({...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) ) )
            	    // InternalMoba.g:707:10: {...}? => (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "true");
            	    }
            	    // InternalMoba.g:707:19: (otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) ) )
            	    // InternalMoba.g:707:20: otherlv_11= 'authorization' otherlv_12= '=' ( (otherlv_13= RULE_CONSTANT ) )
            	    {
            	    otherlv_11=(Token)match(input,31,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_11, grammarAccess.getMobaServerAccess().getAuthorizationKeyword_8_0_0());
            	      								
            	    }
            	    otherlv_12=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getMobaServerAccess().getEqualsSignKeyword_8_0_1());
            	      								
            	    }
            	    // InternalMoba.g:715:9: ( (otherlv_13= RULE_CONSTANT ) )
            	    // InternalMoba.g:716:10: (otherlv_13= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:716:10: (otherlv_13= RULE_CONSTANT )
            	    // InternalMoba.g:717:11: otherlv_13= RULE_CONSTANT
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaServerRule());
            	      											}
            	      										
            	    }
            	    otherlv_13=(Token)match(input,RULE_CONSTANT,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_13, grammarAccess.getMobaServerAccess().getAuthorizationMobaAuthorizationCrossReference_8_0_2_0());
            	      										
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaServerAccess().getUnorderedGroup_8());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalMoba.g:734:4: ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:734:4: ({...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) ) )
            	    // InternalMoba.g:735:5: {...}? => ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1)");
            	    }
            	    // InternalMoba.g:735:107: ( ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) ) )
            	    // InternalMoba.g:736:6: ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaServerAccess().getUnorderedGroup_8(), 1);
            	    // InternalMoba.g:739:9: ({...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' ) )
            	    // InternalMoba.g:739:10: {...}? => (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaServer", "true");
            	    }
            	    // InternalMoba.g:739:19: (otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')' )
            	    // InternalMoba.g:739:20: otherlv_14= 'services' otherlv_15= '=' otherlv_16= '(' ( (otherlv_17= RULE_ID ) ) (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )* otherlv_20= ')'
            	    {
            	    otherlv_14=(Token)match(input,32,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_14, grammarAccess.getMobaServerAccess().getServicesKeyword_8_1_0());
            	      								
            	    }
            	    otherlv_15=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_15, grammarAccess.getMobaServerAccess().getEqualsSignKeyword_8_1_1());
            	      								
            	    }
            	    otherlv_16=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_16, grammarAccess.getMobaServerAccess().getLeftParenthesisKeyword_8_1_2());
            	      								
            	    }
            	    // InternalMoba.g:751:9: ( (otherlv_17= RULE_ID ) )
            	    // InternalMoba.g:752:10: (otherlv_17= RULE_ID )
            	    {
            	    // InternalMoba.g:752:10: (otherlv_17= RULE_ID )
            	    // InternalMoba.g:753:11: otherlv_17= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaServerRule());
            	      											}
            	      										
            	    }
            	    otherlv_17=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_17, grammarAccess.getMobaServerAccess().getServicesMobaRESTCrossReference_8_1_3_0());
            	      										
            	    }

            	    }


            	    }

            	    // InternalMoba.g:764:9: (otherlv_18= ',' ( (otherlv_19= RULE_ID ) ) )*
            	    loop9:
            	    do {
            	        int alt9=2;
            	        int LA9_0 = input.LA(1);

            	        if ( (LA9_0==34) ) {
            	            alt9=1;
            	        }


            	        switch (alt9) {
            	    	case 1 :
            	    	    // InternalMoba.g:765:10: otherlv_18= ',' ( (otherlv_19= RULE_ID ) )
            	    	    {
            	    	    otherlv_18=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_18, grammarAccess.getMobaServerAccess().getCommaKeyword_8_1_4_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:769:10: ( (otherlv_19= RULE_ID ) )
            	    	    // InternalMoba.g:770:11: (otherlv_19= RULE_ID )
            	    	    {
            	    	    // InternalMoba.g:770:11: (otherlv_19= RULE_ID )
            	    	    // InternalMoba.g:771:12: otherlv_19= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      												if (current==null) {
            	    	      													current = createModelElement(grammarAccess.getMobaServerRule());
            	    	      												}
            	    	      											
            	    	    }
            	    	    otherlv_19=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      												newLeafNode(otherlv_19, grammarAccess.getMobaServerAccess().getServicesMobaRESTCrossReference_8_1_4_1_0());
            	    	      											
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop9;
            	        }
            	    } while (true);

            	    otherlv_20=(Token)match(input,35,FOLLOW_16); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_20, grammarAccess.getMobaServerAccess().getRightParenthesisKeyword_8_1_5());
            	      								
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

            otherlv_21=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_21, grammarAccess.getMobaServerAccess().getRightCurlyBracketKeyword_9());
              		
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
    // InternalMoba.g:808:1: entryRuleMobaTemplate returns [EObject current=null] : iv_ruleMobaTemplate= ruleMobaTemplate EOF ;
    public final EObject entryRuleMobaTemplate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTemplate = null;


        try {
            // InternalMoba.g:808:53: (iv_ruleMobaTemplate= ruleMobaTemplate EOF )
            // InternalMoba.g:809:2: iv_ruleMobaTemplate= ruleMobaTemplate EOF
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
    // InternalMoba.g:815:1: ruleMobaTemplate returns [EObject current=null] : (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) ;
    public final EObject ruleMobaTemplate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_downloadTemplate_2_0=null;


        	enterRule();

        try {
            // InternalMoba.g:821:2: ( (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) ) )
            // InternalMoba.g:822:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            {
            // InternalMoba.g:822:2: (otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) ) )
            // InternalMoba.g:823:3: otherlv_0= 'use template' ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            {
            otherlv_0=(Token)match(input,36,FOLLOW_20); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaTemplateAccess().getUseTemplateKeyword_0());
              		
            }
            // InternalMoba.g:827:3: ( ( (otherlv_1= RULE_ID ) ) | ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
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
                    // InternalMoba.g:828:4: ( (otherlv_1= RULE_ID ) )
                    {
                    // InternalMoba.g:828:4: ( (otherlv_1= RULE_ID ) )
                    // InternalMoba.g:829:5: (otherlv_1= RULE_ID )
                    {
                    // InternalMoba.g:829:5: (otherlv_1= RULE_ID )
                    // InternalMoba.g:830:6: otherlv_1= RULE_ID
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
                    // InternalMoba.g:842:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    {
                    // InternalMoba.g:842:4: ( (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE ) )
                    // InternalMoba.g:843:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    {
                    // InternalMoba.g:843:5: (lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE )
                    // InternalMoba.g:844:6: lv_downloadTemplate_2_0= RULE_DOWNLOAD_TEMPLATE
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
    // InternalMoba.g:865:1: entryRuleMobaGenerator returns [EObject current=null] : iv_ruleMobaGenerator= ruleMobaGenerator EOF ;
    public final EObject entryRuleMobaGenerator() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGenerator = null;


        try {
            // InternalMoba.g:865:54: (iv_ruleMobaGenerator= ruleMobaGenerator EOF )
            // InternalMoba.g:866:2: iv_ruleMobaGenerator= ruleMobaGenerator EOF
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
    // InternalMoba.g:872:1: ruleMobaGenerator returns [EObject current=null] : ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) ;
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
            // InternalMoba.g:878:2: ( ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' ) )
            // InternalMoba.g:879:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            {
            // InternalMoba.g:879:2: ( ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}' )
            // InternalMoba.g:880:3: ( (lv_active_0_0= 'active' ) )? otherlv_1= 'generator' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '{' ( (lv_features_4_0= ruleMobaGeneratorFeature ) )* otherlv_5= '}'
            {
            // InternalMoba.g:880:3: ( (lv_active_0_0= 'active' ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMoba.g:881:4: (lv_active_0_0= 'active' )
                    {
                    // InternalMoba.g:881:4: (lv_active_0_0= 'active' )
                    // InternalMoba.g:882:5: lv_active_0_0= 'active'
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
            // InternalMoba.g:898:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:899:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:899:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:900:5: lv_name_2_0= RULE_ID
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

            otherlv_3=(Token)match(input,22,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaGeneratorAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalMoba.g:920:3: ( (lv_features_4_0= ruleMobaGeneratorFeature ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39||LA13_0==41) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMoba.g:921:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    {
            	    // InternalMoba.g:921:4: (lv_features_4_0= ruleMobaGeneratorFeature )
            	    // InternalMoba.g:922:5: lv_features_4_0= ruleMobaGeneratorFeature
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

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:947:1: entryRuleMobaGeneratorFeature returns [EObject current=null] : iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF ;
    public final EObject entryRuleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorFeature = null;


        try {
            // InternalMoba.g:947:61: (iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF )
            // InternalMoba.g:948:2: iv_ruleMobaGeneratorFeature= ruleMobaGeneratorFeature EOF
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
    // InternalMoba.g:954:1: ruleMobaGeneratorFeature returns [EObject current=null] : (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) ;
    public final EObject ruleMobaGeneratorFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaGeneratorIDFeature_0 = null;

        EObject this_MobaGeneratorMixinFeature_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:960:2: ( (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature ) )
            // InternalMoba.g:961:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
            {
            // InternalMoba.g:961:2: (this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature | this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature )
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
                    // InternalMoba.g:962:3: this_MobaGeneratorIDFeature_0= ruleMobaGeneratorIDFeature
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
                    // InternalMoba.g:971:3: this_MobaGeneratorMixinFeature_1= ruleMobaGeneratorMixinFeature
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
    // InternalMoba.g:983:1: entryRuleMobaGeneratorIDFeature returns [EObject current=null] : iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF ;
    public final EObject entryRuleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorIDFeature = null;


        try {
            // InternalMoba.g:983:63: (iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF )
            // InternalMoba.g:984:2: iv_ruleMobaGeneratorIDFeature= ruleMobaGeneratorIDFeature EOF
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
    // InternalMoba.g:990:1: ruleMobaGeneratorIDFeature returns [EObject current=null] : (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) ;
    public final EObject ruleMobaGeneratorIDFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_generatorId_1_0=null;
        Token otherlv_2=null;
        Token lv_generatorVersion_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:996:2: ( (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) ) )
            // InternalMoba.g:997:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            {
            // InternalMoba.g:997:2: (otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) ) )
            // InternalMoba.g:998:3: otherlv_0= 'extensionPoint' ( (lv_generatorId_1_0= RULE_FQN ) ) otherlv_2= ':' ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            {
            otherlv_0=(Token)match(input,39,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorIDFeatureAccess().getExtensionPointKeyword_0());
              		
            }
            // InternalMoba.g:1002:3: ( (lv_generatorId_1_0= RULE_FQN ) )
            // InternalMoba.g:1003:4: (lv_generatorId_1_0= RULE_FQN )
            {
            // InternalMoba.g:1003:4: (lv_generatorId_1_0= RULE_FQN )
            // InternalMoba.g:1004:5: lv_generatorId_1_0= RULE_FQN
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
            // InternalMoba.g:1024:3: ( (lv_generatorVersion_3_0= RULE_VERSION ) )
            // InternalMoba.g:1025:4: (lv_generatorVersion_3_0= RULE_VERSION )
            {
            // InternalMoba.g:1025:4: (lv_generatorVersion_3_0= RULE_VERSION )
            // InternalMoba.g:1026:5: lv_generatorVersion_3_0= RULE_VERSION
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
    // InternalMoba.g:1046:1: entryRuleMobaGeneratorMixinFeature returns [EObject current=null] : iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF ;
    public final EObject entryRuleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorMixinFeature = null;


        try {
            // InternalMoba.g:1046:66: (iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF )
            // InternalMoba.g:1047:2: iv_ruleMobaGeneratorMixinFeature= ruleMobaGeneratorMixinFeature EOF
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
    // InternalMoba.g:1053:1: ruleMobaGeneratorMixinFeature returns [EObject current=null] : (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleMobaGeneratorMixinFeature() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:1059:2: ( (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalMoba.g:1060:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalMoba.g:1060:2: (otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) ) )
            // InternalMoba.g:1061:3: otherlv_0= 'mixin' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorMixinFeatureAccess().getMixinKeyword_0());
              		
            }
            // InternalMoba.g:1065:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:1066:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:1066:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:1067:5: otherlv_1= RULE_ID
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
    // InternalMoba.g:1082:1: entryRuleMobaAuthorization returns [EObject current=null] : iv_ruleMobaAuthorization= ruleMobaAuthorization EOF ;
    public final EObject entryRuleMobaAuthorization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAuthorization = null;


        try {
            // InternalMoba.g:1082:58: (iv_ruleMobaAuthorization= ruleMobaAuthorization EOF )
            // InternalMoba.g:1083:2: iv_ruleMobaAuthorization= ruleMobaAuthorization EOF
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
    // InternalMoba.g:1089:1: ruleMobaAuthorization returns [EObject current=null] : (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaAuthorization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1095:2: ( (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1096:2: (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1096:2: (otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1097:3: otherlv_0= 'authorization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,31,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaAuthorizationAccess().getAuthorizationKeyword_0());
              		
            }
            // InternalMoba.g:1101:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1102:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1102:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1103:5: lv_name_1_0= RULE_CONSTANT
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
    // InternalMoba.g:1134:1: entryRuleMobaTransportSerializationType returns [EObject current=null] : iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF ;
    public final EObject entryRuleMobaTransportSerializationType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTransportSerializationType = null;


        try {
            // InternalMoba.g:1134:71: (iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF )
            // InternalMoba.g:1135:2: iv_ruleMobaTransportSerializationType= ruleMobaTransportSerializationType EOF
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
    // InternalMoba.g:1141:1: ruleMobaTransportSerializationType returns [EObject current=null] : (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaTransportSerializationType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1147:2: ( (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1148:2: (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1148:2: (otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1149:3: otherlv_0= 'serialization' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,42,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaTransportSerializationTypeAccess().getSerializationKeyword_0());
              		
            }
            // InternalMoba.g:1153:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1154:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1154:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1155:5: lv_name_1_0= RULE_CONSTANT
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


    // $ANTLR start "entryRuleMobaPersistenceType"
    // InternalMoba.g:1186:1: entryRuleMobaPersistenceType returns [EObject current=null] : iv_ruleMobaPersistenceType= ruleMobaPersistenceType EOF ;
    public final EObject entryRuleMobaPersistenceType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPersistenceType = null;


        try {
            // InternalMoba.g:1186:60: (iv_ruleMobaPersistenceType= ruleMobaPersistenceType EOF )
            // InternalMoba.g:1187:2: iv_ruleMobaPersistenceType= ruleMobaPersistenceType EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMobaPersistenceTypeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleMobaPersistenceType=ruleMobaPersistenceType();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMobaPersistenceType; 
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
    // $ANTLR end "entryRuleMobaPersistenceType"


    // $ANTLR start "ruleMobaPersistenceType"
    // InternalMoba.g:1193:1: ruleMobaPersistenceType returns [EObject current=null] : (otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaPersistenceType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:1199:2: ( (otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1200:2: (otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1200:2: (otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1201:3: otherlv_0= 'persistence' ( (lv_name_1_0= RULE_CONSTANT ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,43,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaPersistenceTypeAccess().getPersistenceKeyword_0());
              		
            }
            // InternalMoba.g:1205:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1206:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1206:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1207:5: lv_name_1_0= RULE_CONSTANT
            {
            lv_name_1_0=(Token)match(input,RULE_CONSTANT,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_1_0, grammarAccess.getMobaPersistenceTypeAccess().getNameCONSTANTTerminalRuleCall_1_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaPersistenceTypeRule());
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
              				current = createModelElement(grammarAccess.getMobaPersistenceTypeRule());
              			}
              			newCompositeNode(grammarAccess.getMobaPersistenceTypeAccess().getMobaFriendsAbleParserRuleCall_2());
              		
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
    // $ANTLR end "ruleMobaPersistenceType"


    // $ANTLR start "entryRuleMobaDataType"
    // InternalMoba.g:1238:1: entryRuleMobaDataType returns [EObject current=null] : iv_ruleMobaDataType= ruleMobaDataType EOF ;
    public final EObject entryRuleMobaDataType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDataType = null;


        try {
            // InternalMoba.g:1238:53: (iv_ruleMobaDataType= ruleMobaDataType EOF )
            // InternalMoba.g:1239:2: iv_ruleMobaDataType= ruleMobaDataType EOF
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
    // InternalMoba.g:1245:1: ruleMobaDataType returns [EObject current=null] : (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current] ) ;
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
        Token lv_predefined_20_0=null;
        Token lv_string_21_0=null;
        Token lv_primitive_22_0=null;
        Token lv_bool_23_0=null;
        Token lv_primitive_24_0=null;
        Token lv_numeric_25_0=null;
        Token lv_primitive_26_0=null;
        Token lv_decimal_27_0=null;
        Token lv_primitive_28_0=null;
        EObject lv_constraints_8_0 = null;

        EObject lv_constraints_10_0 = null;

        EObject lv_enumAST_19_0 = null;

        EObject this_MobaFriendsAble_29 = null;



        	enterRule();

        try {
            // InternalMoba.g:1251:2: ( (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1252:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1252:2: (otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1253:3: otherlv_0= 'datatype' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) ) this_MobaFriendsAble_29= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,44,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDataTypeAccess().getDatatypeKeyword_0());
              		
            }
            // InternalMoba.g:1257:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:1258:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:1258:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:1259:5: lv_name_1_0= RULE_ID
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

            // InternalMoba.g:1275:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==30) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalMoba.g:1276:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaDataTypeAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:1280:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:1281:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:1281:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:1282:6: otherlv_3= RULE_ID
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

            // InternalMoba.g:1294:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) ) )
            // InternalMoba.g:1295:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) )
            {
            // InternalMoba.g:1295:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?) )
            // InternalMoba.g:1296:5: ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?)
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3());
            // InternalMoba.g:1299:5: ( ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?)
            // InternalMoba.g:1300:6: ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+ {...}?
            {
            // InternalMoba.g:1300:6: ( ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) | ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) ) )+
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
                else if ( ( LA25_0 >= 47 && LA25_0 <= 51 || LA25_0 >= 53 && LA25_0 <= 56 ) && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
                    alt25=3;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalMoba.g:1301:4: ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:1301:4: ({...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:1302:5: {...}? => ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // InternalMoba.g:1302:109: ( ({...}? => ( (lv_array_5_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:1303:6: ({...}? => ( (lv_array_5_0= 'isArray' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 0);
            	    // InternalMoba.g:1306:9: ({...}? => ( (lv_array_5_0= 'isArray' ) ) )
            	    // InternalMoba.g:1306:10: {...}? => ( (lv_array_5_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1306:19: ( (lv_array_5_0= 'isArray' ) )
            	    // InternalMoba.g:1306:20: (lv_array_5_0= 'isArray' )
            	    {
            	    // InternalMoba.g:1306:20: (lv_array_5_0= 'isArray' )
            	    // InternalMoba.g:1307:10: lv_array_5_0= 'isArray'
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
            	    // InternalMoba.g:1324:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:1324:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:1325:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // InternalMoba.g:1325:109: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:1326:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 1);
            	    // InternalMoba.g:1329:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:1329:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1329:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:1329:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaDataTypeAccess().getConstraintsKeyword_3_1_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_1_1());
            	      								
            	    }
            	    // InternalMoba.g:1337:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:1338:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:1338:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:1339:11: lv_constraints_8_0= ruleMobaConstraint
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

            	    // InternalMoba.g:1356:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==34) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // InternalMoba.g:1357:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaDataTypeAccess().getCommaKeyword_3_1_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:1361:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:1362:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:1362:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:1363:12: lv_constraints_10_0= ruleMobaConstraint
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

            	    otherlv_11=(Token)match(input,35,FOLLOW_28); if (state.failed) return current;
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
            	    // InternalMoba.g:1391:4: ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) )
            	    {
            	    // InternalMoba.g:1391:4: ({...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) ) )
            	    // InternalMoba.g:1392:5: {...}? => ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // InternalMoba.g:1392:109: ( ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) ) )
            	    // InternalMoba.g:1393:6: ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDataTypeAccess().getUnorderedGroup_3(), 2);
            	    // InternalMoba.g:1396:9: ({...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) ) )
            	    // InternalMoba.g:1396:10: {...}? => ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDataType", "true");
            	    }
            	    // InternalMoba.g:1396:19: ( ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? ) | ( (lv_enumAST_19_0= ruleMobaEnum ) ) | ( (lv_predefined_20_0= 'isPredefined' ) ) | ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? ) | ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? ) | ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? ) | ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? ) )
            	    int alt24=7;
            	    switch ( input.LA(1) ) {
            	    case 47:
            	    case 48:
            	    case 49:
            	        {
            	        alt24=1;
            	        }
            	        break;
            	    case 56:
            	        {
            	        alt24=2;
            	        }
            	        break;
            	    case 50:
            	        {
            	        alt24=3;
            	        }
            	        break;
            	    case 51:
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
            	    case 55:
            	        {
            	        alt24=7;
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
            	            // InternalMoba.g:1396:20: ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? )
            	            {
            	            // InternalMoba.g:1396:20: ( ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )? )
            	            // InternalMoba.g:1397:10: ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) ) (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )?
            	            {
            	            // InternalMoba.g:1397:10: ( ( (lv_date_12_0= 'isDate' ) ) | ( (lv_time_13_0= 'isTime' ) ) | ( (lv_timestamp_14_0= 'isTimestamp' ) ) )
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
            	                    // InternalMoba.g:1398:11: ( (lv_date_12_0= 'isDate' ) )
            	                    {
            	                    // InternalMoba.g:1398:11: ( (lv_date_12_0= 'isDate' ) )
            	                    // InternalMoba.g:1399:12: (lv_date_12_0= 'isDate' )
            	                    {
            	                    // InternalMoba.g:1399:12: (lv_date_12_0= 'isDate' )
            	                    // InternalMoba.g:1400:13: lv_date_12_0= 'isDate'
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
            	                    // InternalMoba.g:1413:11: ( (lv_time_13_0= 'isTime' ) )
            	                    {
            	                    // InternalMoba.g:1413:11: ( (lv_time_13_0= 'isTime' ) )
            	                    // InternalMoba.g:1414:12: (lv_time_13_0= 'isTime' )
            	                    {
            	                    // InternalMoba.g:1414:12: (lv_time_13_0= 'isTime' )
            	                    // InternalMoba.g:1415:13: lv_time_13_0= 'isTime'
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
            	                    // InternalMoba.g:1428:11: ( (lv_timestamp_14_0= 'isTimestamp' ) )
            	                    {
            	                    // InternalMoba.g:1428:11: ( (lv_timestamp_14_0= 'isTimestamp' ) )
            	                    // InternalMoba.g:1429:12: (lv_timestamp_14_0= 'isTimestamp' )
            	                    {
            	                    // InternalMoba.g:1429:12: (lv_timestamp_14_0= 'isTimestamp' )
            	                    // InternalMoba.g:1430:13: lv_timestamp_14_0= 'isTimestamp'
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

            	            // InternalMoba.g:1443:10: (otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')' )?
            	            int alt19=2;
            	            int LA19_0 = input.LA(1);

            	            if ( (LA19_0==33) ) {
            	                alt19=1;
            	            }
            	            switch (alt19) {
            	                case 1 :
            	                    // InternalMoba.g:1444:11: otherlv_15= '(' ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) ) otherlv_18= ')'
            	                    {
            	                    otherlv_15=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      											newLeafNode(otherlv_15, grammarAccess.getMobaDataTypeAccess().getLeftParenthesisKeyword_3_2_0_1_0());
            	                      										
            	                    }
            	                    // InternalMoba.g:1448:11: ( ( (lv_dateFormatString_16_0= RULE_STRING ) ) | ( (otherlv_17= RULE_CONSTANT ) ) )
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
            	                            // InternalMoba.g:1449:12: ( (lv_dateFormatString_16_0= RULE_STRING ) )
            	                            {
            	                            // InternalMoba.g:1449:12: ( (lv_dateFormatString_16_0= RULE_STRING ) )
            	                            // InternalMoba.g:1450:13: (lv_dateFormatString_16_0= RULE_STRING )
            	                            {
            	                            // InternalMoba.g:1450:13: (lv_dateFormatString_16_0= RULE_STRING )
            	                            // InternalMoba.g:1451:14: lv_dateFormatString_16_0= RULE_STRING
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
            	                              															"org.mobadsl.grammar.Moba.STRING");
            	                              													
            	                            }

            	                            }


            	                            }


            	                            }
            	                            break;
            	                        case 2 :
            	                            // InternalMoba.g:1468:12: ( (otherlv_17= RULE_CONSTANT ) )
            	                            {
            	                            // InternalMoba.g:1468:12: ( (otherlv_17= RULE_CONSTANT ) )
            	                            // InternalMoba.g:1469:13: (otherlv_17= RULE_CONSTANT )
            	                            {
            	                            // InternalMoba.g:1469:13: (otherlv_17= RULE_CONSTANT )
            	                            // InternalMoba.g:1470:14: otherlv_17= RULE_CONSTANT
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

            	                    otherlv_18=(Token)match(input,35,FOLLOW_28); if (state.failed) return current;
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
            	            // InternalMoba.g:1489:9: ( (lv_enumAST_19_0= ruleMobaEnum ) )
            	            {
            	            // InternalMoba.g:1489:9: ( (lv_enumAST_19_0= ruleMobaEnum ) )
            	            // InternalMoba.g:1490:10: (lv_enumAST_19_0= ruleMobaEnum )
            	            {
            	            // InternalMoba.g:1490:10: (lv_enumAST_19_0= ruleMobaEnum )
            	            // InternalMoba.g:1491:11: lv_enumAST_19_0= ruleMobaEnum
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
            	            // InternalMoba.g:1509:9: ( (lv_predefined_20_0= 'isPredefined' ) )
            	            {
            	            // InternalMoba.g:1509:9: ( (lv_predefined_20_0= 'isPredefined' ) )
            	            // InternalMoba.g:1510:10: (lv_predefined_20_0= 'isPredefined' )
            	            {
            	            // InternalMoba.g:1510:10: (lv_predefined_20_0= 'isPredefined' )
            	            // InternalMoba.g:1511:11: lv_predefined_20_0= 'isPredefined'
            	            {
            	            lv_predefined_20_0=(Token)match(input,50,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              											newLeafNode(lv_predefined_20_0, grammarAccess.getMobaDataTypeAccess().getPredefinedIsPredefinedKeyword_3_2_2_0());
            	              										
            	            }
            	            if ( state.backtracking==0 ) {

            	              											if (current==null) {
            	              												current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	              											}
            	              											setWithLastConsumed(current, "predefined", true, "isPredefined");
            	              										
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 4 :
            	            // InternalMoba.g:1524:9: ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1524:9: ( ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1525:10: ( (lv_string_21_0= 'isString' ) ) ( (lv_primitive_22_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1525:10: ( (lv_string_21_0= 'isString' ) )
            	            // InternalMoba.g:1526:11: (lv_string_21_0= 'isString' )
            	            {
            	            // InternalMoba.g:1526:11: (lv_string_21_0= 'isString' )
            	            // InternalMoba.g:1527:12: lv_string_21_0= 'isString'
            	            {
            	            lv_string_21_0=(Token)match(input,51,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(lv_string_21_0, grammarAccess.getMobaDataTypeAccess().getStringIsStringKeyword_3_2_3_0_0());
            	              											
            	            }
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	              												}
            	              												setWithLastConsumed(current, "string", true, "isString");
            	              											
            	            }

            	            }


            	            }

            	            // InternalMoba.g:1539:10: ( (lv_primitive_22_0= 'isPrimitive' ) )?
            	            int alt20=2;
            	            int LA20_0 = input.LA(1);

            	            if ( (LA20_0==52) ) {
            	                alt20=1;
            	            }
            	            switch (alt20) {
            	                case 1 :
            	                    // InternalMoba.g:1540:11: (lv_primitive_22_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1540:11: (lv_primitive_22_0= 'isPrimitive' )
            	                    // InternalMoba.g:1541:12: lv_primitive_22_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_22_0=(Token)match(input,52,FOLLOW_28); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      												newLeafNode(lv_primitive_22_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_3_1_0());
            	                      											
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
            	            // InternalMoba.g:1555:9: ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1555:9: ( ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1556:10: ( (lv_bool_23_0= 'isBool' ) ) ( (lv_primitive_24_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1556:10: ( (lv_bool_23_0= 'isBool' ) )
            	            // InternalMoba.g:1557:11: (lv_bool_23_0= 'isBool' )
            	            {
            	            // InternalMoba.g:1557:11: (lv_bool_23_0= 'isBool' )
            	            // InternalMoba.g:1558:12: lv_bool_23_0= 'isBool'
            	            {
            	            lv_bool_23_0=(Token)match(input,53,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(lv_bool_23_0, grammarAccess.getMobaDataTypeAccess().getBoolIsBoolKeyword_3_2_4_0_0());
            	              											
            	            }
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	              												}
            	              												setWithLastConsumed(current, "bool", true, "isBool");
            	              											
            	            }

            	            }


            	            }

            	            // InternalMoba.g:1570:10: ( (lv_primitive_24_0= 'isPrimitive' ) )?
            	            int alt21=2;
            	            int LA21_0 = input.LA(1);

            	            if ( (LA21_0==52) ) {
            	                alt21=1;
            	            }
            	            switch (alt21) {
            	                case 1 :
            	                    // InternalMoba.g:1571:11: (lv_primitive_24_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1571:11: (lv_primitive_24_0= 'isPrimitive' )
            	                    // InternalMoba.g:1572:12: lv_primitive_24_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_24_0=(Token)match(input,52,FOLLOW_28); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      												newLeafNode(lv_primitive_24_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_4_1_0());
            	                      											
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
            	            // InternalMoba.g:1586:9: ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1586:9: ( ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1587:10: ( (lv_numeric_25_0= 'isNumeric' ) ) ( (lv_primitive_26_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1587:10: ( (lv_numeric_25_0= 'isNumeric' ) )
            	            // InternalMoba.g:1588:11: (lv_numeric_25_0= 'isNumeric' )
            	            {
            	            // InternalMoba.g:1588:11: (lv_numeric_25_0= 'isNumeric' )
            	            // InternalMoba.g:1589:12: lv_numeric_25_0= 'isNumeric'
            	            {
            	            lv_numeric_25_0=(Token)match(input,54,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(lv_numeric_25_0, grammarAccess.getMobaDataTypeAccess().getNumericIsNumericKeyword_3_2_5_0_0());
            	              											
            	            }
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	              												}
            	              												setWithLastConsumed(current, "numeric", true, "isNumeric");
            	              											
            	            }

            	            }


            	            }

            	            // InternalMoba.g:1601:10: ( (lv_primitive_26_0= 'isPrimitive' ) )?
            	            int alt22=2;
            	            int LA22_0 = input.LA(1);

            	            if ( (LA22_0==52) ) {
            	                alt22=1;
            	            }
            	            switch (alt22) {
            	                case 1 :
            	                    // InternalMoba.g:1602:11: (lv_primitive_26_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1602:11: (lv_primitive_26_0= 'isPrimitive' )
            	                    // InternalMoba.g:1603:12: lv_primitive_26_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_26_0=(Token)match(input,52,FOLLOW_28); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      												newLeafNode(lv_primitive_26_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_5_1_0());
            	                      											
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
            	        case 7 :
            	            // InternalMoba.g:1617:9: ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? )
            	            {
            	            // InternalMoba.g:1617:9: ( ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )? )
            	            // InternalMoba.g:1618:10: ( (lv_decimal_27_0= 'isDecimal' ) ) ( (lv_primitive_28_0= 'isPrimitive' ) )?
            	            {
            	            // InternalMoba.g:1618:10: ( (lv_decimal_27_0= 'isDecimal' ) )
            	            // InternalMoba.g:1619:11: (lv_decimal_27_0= 'isDecimal' )
            	            {
            	            // InternalMoba.g:1619:11: (lv_decimal_27_0= 'isDecimal' )
            	            // InternalMoba.g:1620:12: lv_decimal_27_0= 'isDecimal'
            	            {
            	            lv_decimal_27_0=(Token)match(input,55,FOLLOW_32); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              												newLeafNode(lv_decimal_27_0, grammarAccess.getMobaDataTypeAccess().getDecimalIsDecimalKeyword_3_2_6_0_0());
            	              											
            	            }
            	            if ( state.backtracking==0 ) {

            	              												if (current==null) {
            	              													current = createModelElement(grammarAccess.getMobaDataTypeRule());
            	              												}
            	              												setWithLastConsumed(current, "decimal", true, "isDecimal");
            	              											
            	            }

            	            }


            	            }

            	            // InternalMoba.g:1632:10: ( (lv_primitive_28_0= 'isPrimitive' ) )?
            	            int alt23=2;
            	            int LA23_0 = input.LA(1);

            	            if ( (LA23_0==52) ) {
            	                alt23=1;
            	            }
            	            switch (alt23) {
            	                case 1 :
            	                    // InternalMoba.g:1633:11: (lv_primitive_28_0= 'isPrimitive' )
            	                    {
            	                    // InternalMoba.g:1633:11: (lv_primitive_28_0= 'isPrimitive' )
            	                    // InternalMoba.g:1634:12: lv_primitive_28_0= 'isPrimitive'
            	                    {
            	                    lv_primitive_28_0=(Token)match(input,52,FOLLOW_28); if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      												newLeafNode(lv_primitive_28_0, grammarAccess.getMobaDataTypeAccess().getPrimitiveIsPrimitiveKeyword_3_2_6_1_0());
            	                      											
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
            this_MobaFriendsAble_29=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_29;
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
    // InternalMoba.g:1676:1: entryRuleMobaEnum returns [EObject current=null] : iv_ruleMobaEnum= ruleMobaEnum EOF ;
    public final EObject entryRuleMobaEnum() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnum = null;


        try {
            // InternalMoba.g:1676:49: (iv_ruleMobaEnum= ruleMobaEnum EOF )
            // InternalMoba.g:1677:2: iv_ruleMobaEnum= ruleMobaEnum EOF
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
    // InternalMoba.g:1683:1: ruleMobaEnum returns [EObject current=null] : ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' ) ;
    public final EObject ruleMobaEnum() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_literals_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:1689:2: ( ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' ) )
            // InternalMoba.g:1690:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' )
            {
            // InternalMoba.g:1690:2: ( () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}' )
            // InternalMoba.g:1691:3: () otherlv_1= 'enum' otherlv_2= '{' ( (lv_literals_3_0= ruleMobaEnumLiteral ) )* otherlv_4= '}'
            {
            // InternalMoba.g:1691:3: ()
            // InternalMoba.g:1692:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaEnumAccess().getMobaEnumAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,56,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaEnumAccess().getEnumKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,22,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaEnumAccess().getLeftCurlyBracketKeyword_2());
              		
            }
            // InternalMoba.g:1706:3: ( (lv_literals_3_0= ruleMobaEnumLiteral ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==57) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalMoba.g:1707:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            	    {
            	    // InternalMoba.g:1707:4: (lv_literals_3_0= ruleMobaEnumLiteral )
            	    // InternalMoba.g:1708:5: lv_literals_3_0= ruleMobaEnumLiteral
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

            otherlv_4=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:1733:1: entryRuleMobaEnumLiteral returns [EObject current=null] : iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF ;
    public final EObject entryRuleMobaEnumLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEnumLiteral = null;


        try {
            // InternalMoba.g:1733:56: (iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF )
            // InternalMoba.g:1734:2: iv_ruleMobaEnumLiteral= ruleMobaEnumLiteral EOF
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
    // InternalMoba.g:1740:1: ruleMobaEnumLiteral returns [EObject current=null] : (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')' ) ;
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
        Token lv_hidden_13_0=null;
        Token otherlv_14=null;


        	enterRule();

        try {
            // InternalMoba.g:1746:2: ( (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')' ) )
            // InternalMoba.g:1747:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')' )
            {
            // InternalMoba.g:1747:2: (otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')' )
            // InternalMoba.g:1748:3: otherlv_0= 'lit' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' otherlv_3= '(' ( (lv_literal_4_0= RULE_STRING ) ) otherlv_5= ',' ( (lv_value_6_0= RULE_INT ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) ) otherlv_14= ')'
            {
            otherlv_0=(Token)match(input,57,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEnumLiteralAccess().getLitKeyword_0());
              		
            }
            // InternalMoba.g:1752:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1753:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1753:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1754:5: lv_name_1_0= RULE_CONSTANT
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

            otherlv_2=(Token)match(input,21,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaEnumLiteralAccess().getEqualsSignKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,33,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaEnumLiteralAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalMoba.g:1778:3: ( (lv_literal_4_0= RULE_STRING ) )
            // InternalMoba.g:1779:4: (lv_literal_4_0= RULE_STRING )
            {
            // InternalMoba.g:1779:4: (lv_literal_4_0= RULE_STRING )
            // InternalMoba.g:1780:5: lv_literal_4_0= RULE_STRING
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
              						"org.mobadsl.grammar.Moba.STRING");
              				
            }

            }


            }

            otherlv_5=(Token)match(input,34,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_5());
              		
            }
            // InternalMoba.g:1800:3: ( (lv_value_6_0= RULE_INT ) )
            // InternalMoba.g:1801:4: (lv_value_6_0= RULE_INT )
            {
            // InternalMoba.g:1801:4: (lv_value_6_0= RULE_INT )
            // InternalMoba.g:1802:5: lv_value_6_0= RULE_INT
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

            // InternalMoba.g:1818:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:1819:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:1819:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* ) )
            // InternalMoba.g:1820:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7());
            // InternalMoba.g:1823:5: ( ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )* )
            // InternalMoba.g:1824:6: ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )*
            {
            // InternalMoba.g:1824:6: ( ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) ) )*
            loop27:
            do {
                int alt27=4;
                int LA27_0 = input.LA(1);

                if ( LA27_0 == 34 && ( getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2) || getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) || getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) ) {
                    int LA27_2 = input.LA(2);

                    if ( LA27_2 == 59 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) ) {
                        alt27=2;
                    }
                    else if ( LA27_2 == 58 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) {
                        alt27=1;
                    }
                    else if ( LA27_2 == 60 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2) ) {
                        alt27=3;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // InternalMoba.g:1825:4: ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1825:4: ({...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) ) )
            	    // InternalMoba.g:1826:5: {...}? => ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0)");
            	    }
            	    // InternalMoba.g:1826:112: ( ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) ) )
            	    // InternalMoba.g:1827:6: ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 0);
            	    // InternalMoba.g:1830:9: ({...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) ) )
            	    // InternalMoba.g:1830:10: {...}? => (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1830:19: (otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) ) )
            	    // InternalMoba.g:1830:20: otherlv_8= ',' ( (lv_default_9_0= 'isDefault' ) )
            	    {
            	    otherlv_8=(Token)match(input,34,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_0_0());
            	      								
            	    }
            	    // InternalMoba.g:1834:9: ( (lv_default_9_0= 'isDefault' ) )
            	    // InternalMoba.g:1835:10: (lv_default_9_0= 'isDefault' )
            	    {
            	    // InternalMoba.g:1835:10: (lv_default_9_0= 'isDefault' )
            	    // InternalMoba.g:1836:11: lv_default_9_0= 'isDefault'
            	    {
            	    lv_default_9_0=(Token)match(input,58,FOLLOW_19); if (state.failed) return current;
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
            	    // InternalMoba.g:1854:4: ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1854:4: ({...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) ) )
            	    // InternalMoba.g:1855:5: {...}? => ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1)");
            	    }
            	    // InternalMoba.g:1855:112: ( ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) ) )
            	    // InternalMoba.g:1856:6: ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 1);
            	    // InternalMoba.g:1859:9: ({...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) ) )
            	    // InternalMoba.g:1859:10: {...}? => (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1859:19: (otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) ) )
            	    // InternalMoba.g:1859:20: otherlv_10= ',' ( (lv_undefined_11_0= 'isUndefined' ) )
            	    {
            	    otherlv_10=(Token)match(input,34,FOLLOW_38); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_10, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_1_0());
            	      								
            	    }
            	    // InternalMoba.g:1863:9: ( (lv_undefined_11_0= 'isUndefined' ) )
            	    // InternalMoba.g:1864:10: (lv_undefined_11_0= 'isUndefined' )
            	    {
            	    // InternalMoba.g:1864:10: (lv_undefined_11_0= 'isUndefined' )
            	    // InternalMoba.g:1865:11: lv_undefined_11_0= 'isUndefined'
            	    {
            	    lv_undefined_11_0=(Token)match(input,59,FOLLOW_19); if (state.failed) return current;
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
            	case 3 :
            	    // InternalMoba.g:1883:4: ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:1883:4: ({...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) ) )
            	    // InternalMoba.g:1884:5: {...}? => ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2)");
            	    }
            	    // InternalMoba.g:1884:112: ( ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) ) )
            	    // InternalMoba.g:1885:6: ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEnumLiteralAccess().getUnorderedGroup_7(), 2);
            	    // InternalMoba.g:1888:9: ({...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) ) )
            	    // InternalMoba.g:1888:10: {...}? => (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEnumLiteral", "true");
            	    }
            	    // InternalMoba.g:1888:19: (otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) ) )
            	    // InternalMoba.g:1888:20: otherlv_12= ',' ( (lv_hidden_13_0= 'isHidden' ) )
            	    {
            	    otherlv_12=(Token)match(input,34,FOLLOW_39); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getMobaEnumLiteralAccess().getCommaKeyword_7_2_0());
            	      								
            	    }
            	    // InternalMoba.g:1892:9: ( (lv_hidden_13_0= 'isHidden' ) )
            	    // InternalMoba.g:1893:10: (lv_hidden_13_0= 'isHidden' )
            	    {
            	    // InternalMoba.g:1893:10: (lv_hidden_13_0= 'isHidden' )
            	    // InternalMoba.g:1894:11: lv_hidden_13_0= 'isHidden'
            	    {
            	    lv_hidden_13_0=(Token)match(input,60,FOLLOW_19); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(lv_hidden_13_0, grammarAccess.getMobaEnumLiteralAccess().getHiddenIsHiddenKeyword_7_2_1_0());
            	      										
            	    }
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaEnumLiteralRule());
            	      											}
            	      											setWithLastConsumed(current, "hidden", true, "isHidden");
            	      										
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

            otherlv_14=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_14, grammarAccess.getMobaEnumLiteralAccess().getRightParenthesisKeyword_8());
              		
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
    // InternalMoba.g:1927:1: entryRuleMobaConstant returns [EObject current=null] : iv_ruleMobaConstant= ruleMobaConstant EOF ;
    public final EObject entryRuleMobaConstant() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstant = null;


        try {
            // InternalMoba.g:1927:53: (iv_ruleMobaConstant= ruleMobaConstant EOF )
            // InternalMoba.g:1928:2: iv_ruleMobaConstant= ruleMobaConstant EOF
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
    // InternalMoba.g:1934:1: ruleMobaConstant returns [EObject current=null] : (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaConstant() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_valueAST_3_0 = null;

        EObject this_MobaFriendsAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:1940:2: ( (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:1941:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:1941:2: (otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:1942:3: otherlv_0= 'const' ( (lv_name_1_0= RULE_CONSTANT ) ) otherlv_2= '=' ( (lv_valueAST_3_0= ruleMobaConstantValue ) ) this_MobaFriendsAble_4= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,61,FOLLOW_17); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaConstantAccess().getConstKeyword_0());
              		
            }
            // InternalMoba.g:1946:3: ( (lv_name_1_0= RULE_CONSTANT ) )
            // InternalMoba.g:1947:4: (lv_name_1_0= RULE_CONSTANT )
            {
            // InternalMoba.g:1947:4: (lv_name_1_0= RULE_CONSTANT )
            // InternalMoba.g:1948:5: lv_name_1_0= RULE_CONSTANT
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

            otherlv_2=(Token)match(input,21,FOLLOW_40); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaConstantAccess().getEqualsSignKeyword_2());
              		
            }
            // InternalMoba.g:1968:3: ( (lv_valueAST_3_0= ruleMobaConstantValue ) )
            // InternalMoba.g:1969:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            {
            // InternalMoba.g:1969:4: (lv_valueAST_3_0= ruleMobaConstantValue )
            // InternalMoba.g:1970:5: lv_valueAST_3_0= ruleMobaConstantValue
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
    // InternalMoba.g:2002:1: entryRuleMobaConstantValue returns [EObject current=null] : iv_ruleMobaConstantValue= ruleMobaConstantValue EOF ;
    public final EObject entryRuleMobaConstantValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstantValue = null;


        try {
            // InternalMoba.g:2002:58: (iv_ruleMobaConstantValue= ruleMobaConstantValue EOF )
            // InternalMoba.g:2003:2: iv_ruleMobaConstantValue= ruleMobaConstantValue EOF
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
    // InternalMoba.g:2009:1: ruleMobaConstantValue returns [EObject current=null] : ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? ) ;
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
            // InternalMoba.g:2015:2: ( ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? ) )
            // InternalMoba.g:2016:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? )
            {
            // InternalMoba.g:2016:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )? )
            // InternalMoba.g:2017:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) ) (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )?
            {
            // InternalMoba.g:2017:3: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (lv_valueInt_1_0= RULE_INT ) ) | ( (lv_valueDouble_2_0= RULE_DOUBLE ) ) | ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* ) )
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
                    // InternalMoba.g:2018:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2018:4: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2019:5: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2019:5: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:2020:6: lv_valueString_0_0= RULE_STRING
                    {
                    lv_valueString_0_0=(Token)match(input,RULE_STRING,FOLLOW_41); if (state.failed) return current;
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
                      							"org.mobadsl.grammar.Moba.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:2037:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    {
                    // InternalMoba.g:2037:4: ( (lv_valueInt_1_0= RULE_INT ) )
                    // InternalMoba.g:2038:5: (lv_valueInt_1_0= RULE_INT )
                    {
                    // InternalMoba.g:2038:5: (lv_valueInt_1_0= RULE_INT )
                    // InternalMoba.g:2039:6: lv_valueInt_1_0= RULE_INT
                    {
                    lv_valueInt_1_0=(Token)match(input,RULE_INT,FOLLOW_41); if (state.failed) return current;
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
                    // InternalMoba.g:2056:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:2056:4: ( (lv_valueDouble_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:2057:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:2057:5: (lv_valueDouble_2_0= RULE_DOUBLE )
                    // InternalMoba.g:2058:6: lv_valueDouble_2_0= RULE_DOUBLE
                    {
                    lv_valueDouble_2_0=(Token)match(input,RULE_DOUBLE,FOLLOW_41); if (state.failed) return current;
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
                    // InternalMoba.g:2075:4: ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* )
                    {
                    // InternalMoba.g:2075:4: ( ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )* )
                    // InternalMoba.g:2076:5: ( (otherlv_3= RULE_CONSTANT ) ) (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )*
                    {
                    // InternalMoba.g:2076:5: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:2077:6: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2077:6: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:2078:7: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElement(grammarAccess.getMobaConstantValueRule());
                      							}
                      						
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_42); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							newLeafNode(otherlv_3, grammarAccess.getMobaConstantValueAccess().getValueConstMobaConstantCrossReference_0_3_0_0());
                      						
                    }

                    }


                    }

                    // InternalMoba.g:2089:5: (otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==62) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalMoba.g:2090:6: otherlv_4= '->' ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) )
                    	    {
                    	    otherlv_4=(Token)match(input,62,FOLLOW_43); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_4, grammarAccess.getMobaConstantValueAccess().getHyphenMinusGreaterThanSignKeyword_0_3_1_0());
                    	      					
                    	    }
                    	    // InternalMoba.g:2094:6: ( (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction ) )
                    	    // InternalMoba.g:2095:7: (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction )
                    	    {
                    	    // InternalMoba.g:2095:7: (lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction )
                    	    // InternalMoba.g:2096:8: lv_valueConstFunctions_5_0= ruleMobaConstantValueFunction
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getMobaConstantValueAccess().getValueConstFunctionsMobaConstantValueFunctionEnumRuleCall_0_3_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_42);
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

            // InternalMoba.g:2116:3: (otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==63) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalMoba.g:2117:4: otherlv_6= '+' ( (lv_tail_7_0= ruleMobaConstantValue ) )
                    {
                    otherlv_6=(Token)match(input,63,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMobaConstantValueAccess().getPlusSignKeyword_1_0());
                      			
                    }
                    // InternalMoba.g:2121:4: ( (lv_tail_7_0= ruleMobaConstantValue ) )
                    // InternalMoba.g:2122:5: (lv_tail_7_0= ruleMobaConstantValue )
                    {
                    // InternalMoba.g:2122:5: (lv_tail_7_0= ruleMobaConstantValue )
                    // InternalMoba.g:2123:6: lv_tail_7_0= ruleMobaConstantValue
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
    // InternalMoba.g:2146:1: ruleMobaFriendsAble[EObject in_current] returns [EObject current=in_current] : ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) ) ;
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
            // InternalMoba.g:2152:2: ( ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) ) )
            // InternalMoba.g:2153:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) )
            {
            // InternalMoba.g:2153:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) ) )
            // InternalMoba.g:2154:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) )
            {
            // InternalMoba.g:2154:3: ( ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* ) )
            // InternalMoba.g:2155:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup());
            // InternalMoba.g:2158:4: ( ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )* )
            // InternalMoba.g:2159:5: ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )*
            {
            // InternalMoba.g:2159:5: ( ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) ) )*
            loop33:
            do {
                int alt33=3;
                int LA33_0 = input.LA(1);

                if ( LA33_0 == 64 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0) ) {
                    alt33=1;
                }
                else if ( LA33_0 == 65 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1) ) {
                    alt33=2;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalMoba.g:2160:3: ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:2160:3: ({...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) ) )
            	    // InternalMoba.g:2161:4: {...}? => ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0)");
            	    }
            	    // InternalMoba.g:2161:109: ( ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) ) )
            	    // InternalMoba.g:2162:5: ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 0);
            	    // InternalMoba.g:2165:8: ({...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' ) )
            	    // InternalMoba.g:2165:9: {...}? => (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "true");
            	    }
            	    // InternalMoba.g:2165:18: (otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')' )
            	    // InternalMoba.g:2165:19: otherlv_1= 'friends' otherlv_2= '(' ( (lv_friends_3_0= ruleMobaFriend ) ) (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )* otherlv_6= ')'
            	    {
            	    otherlv_1=(Token)match(input,64,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_1, grammarAccess.getMobaFriendsAbleAccess().getFriendsKeyword_0_0());
            	      							
            	    }
            	    otherlv_2=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_2, grammarAccess.getMobaFriendsAbleAccess().getLeftParenthesisKeyword_0_1());
            	      							
            	    }
            	    // InternalMoba.g:2173:8: ( (lv_friends_3_0= ruleMobaFriend ) )
            	    // InternalMoba.g:2174:9: (lv_friends_3_0= ruleMobaFriend )
            	    {
            	    // InternalMoba.g:2174:9: (lv_friends_3_0= ruleMobaFriend )
            	    // InternalMoba.g:2175:10: lv_friends_3_0= ruleMobaFriend
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

            	    // InternalMoba.g:2192:8: (otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==34) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // InternalMoba.g:2193:9: otherlv_4= ',' ( (lv_friends_5_0= ruleMobaFriend ) )
            	    	    {
            	    	    otherlv_4=(Token)match(input,34,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      									newLeafNode(otherlv_4, grammarAccess.getMobaFriendsAbleAccess().getCommaKeyword_0_3_0());
            	    	      								
            	    	    }
            	    	    // InternalMoba.g:2197:9: ( (lv_friends_5_0= ruleMobaFriend ) )
            	    	    // InternalMoba.g:2198:10: (lv_friends_5_0= ruleMobaFriend )
            	    	    {
            	    	    // InternalMoba.g:2198:10: (lv_friends_5_0= ruleMobaFriend )
            	    	    // InternalMoba.g:2199:11: lv_friends_5_0= ruleMobaFriend
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

            	    otherlv_6=(Token)match(input,35,FOLLOW_44); if (state.failed) return current;
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
            	    // InternalMoba.g:2227:3: ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) )
            	    {
            	    // InternalMoba.g:2227:3: ({...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) ) )
            	    // InternalMoba.g:2228:4: {...}? => ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1)");
            	    }
            	    // InternalMoba.g:2228:109: ( ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) ) )
            	    // InternalMoba.g:2229:5: ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaFriendsAbleAccess().getUnorderedGroup(), 1);
            	    // InternalMoba.g:2232:8: ({...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' ) )
            	    // InternalMoba.g:2232:9: {...}? => (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaFriendsAble", "true");
            	    }
            	    // InternalMoba.g:2232:18: (otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']' )
            	    // InternalMoba.g:2232:19: otherlv_7= '[' ( (lv_properties_8_0= ruleMobaProperty ) ) (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )* otherlv_11= ']'
            	    {
            	    otherlv_7=(Token)match(input,65,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      								newLeafNode(otherlv_7, grammarAccess.getMobaFriendsAbleAccess().getLeftSquareBracketKeyword_1_0());
            	      							
            	    }
            	    // InternalMoba.g:2236:8: ( (lv_properties_8_0= ruleMobaProperty ) )
            	    // InternalMoba.g:2237:9: (lv_properties_8_0= ruleMobaProperty )
            	    {
            	    // InternalMoba.g:2237:9: (lv_properties_8_0= ruleMobaProperty )
            	    // InternalMoba.g:2238:10: lv_properties_8_0= ruleMobaProperty
            	    {
            	    if ( state.backtracking==0 ) {

            	      										newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_1_0());
            	      									
            	    }
            	    pushFollow(FOLLOW_45);
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

            	    // InternalMoba.g:2255:8: (otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==34) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // InternalMoba.g:2256:9: otherlv_9= ',' ( (lv_properties_10_0= ruleMobaProperty ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,34,FOLLOW_14); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      									newLeafNode(otherlv_9, grammarAccess.getMobaFriendsAbleAccess().getCommaKeyword_1_2_0());
            	    	      								
            	    	    }
            	    	    // InternalMoba.g:2260:9: ( (lv_properties_10_0= ruleMobaProperty ) )
            	    	    // InternalMoba.g:2261:10: (lv_properties_10_0= ruleMobaProperty )
            	    	    {
            	    	    // InternalMoba.g:2261:10: (lv_properties_10_0= ruleMobaProperty )
            	    	    // InternalMoba.g:2262:11: lv_properties_10_0= ruleMobaProperty
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getMobaFriendsAbleAccess().getPropertiesMobaPropertyParserRuleCall_1_2_1_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_45);
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

            	    otherlv_11=(Token)match(input,66,FOLLOW_44); if (state.failed) return current;
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
    // InternalMoba.g:2300:1: entryRuleMobaFriend returns [EObject current=null] : iv_ruleMobaFriend= ruleMobaFriend EOF ;
    public final EObject entryRuleMobaFriend() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaFriend = null;


        try {
            // InternalMoba.g:2300:51: (iv_ruleMobaFriend= ruleMobaFriend EOF )
            // InternalMoba.g:2301:2: iv_ruleMobaFriend= ruleMobaFriend EOF
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
    // InternalMoba.g:2307:1: ruleMobaFriend returns [EObject current=null] : ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) ;
    public final EObject ruleMobaFriend() throws RecognitionException {
        EObject current = null;

        Token lv_valueString_0_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:2313:2: ( ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:2314:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
            {
            // InternalMoba.g:2314:2: ( ( (lv_valueString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:2315:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2315:3: ( (lv_valueString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2316:4: (lv_valueString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2316:4: (lv_valueString_0_0= RULE_STRING )
                    // InternalMoba.g:2317:5: lv_valueString_0_0= RULE_STRING
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
                      						"org.mobadsl.grammar.Moba.STRING");
                      				
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:2334:3: ( (otherlv_1= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2334:3: ( (otherlv_1= RULE_CONSTANT ) )
                    // InternalMoba.g:2335:4: (otherlv_1= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2335:4: (otherlv_1= RULE_CONSTANT )
                    // InternalMoba.g:2336:5: otherlv_1= RULE_CONSTANT
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
    // InternalMoba.g:2351:1: entryRuleMobaProperty returns [EObject current=null] : iv_ruleMobaProperty= ruleMobaProperty EOF ;
    public final EObject entryRuleMobaProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaProperty = null;


        try {
            // InternalMoba.g:2351:53: (iv_ruleMobaProperty= ruleMobaProperty EOF )
            // InternalMoba.g:2352:2: iv_ruleMobaProperty= ruleMobaProperty EOF
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
    // InternalMoba.g:2358:1: ruleMobaProperty returns [EObject current=null] : ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaProperty() throws RecognitionException {
        EObject current = null;

        Token lv_keyString_0_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token lv_valueString_3_0=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:2364:2: ( ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:2365:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:2365:2: ( ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:2366:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) ) otherlv_2= '=' ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) )
            {
            // InternalMoba.g:2366:3: ( ( (lv_keyString_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:2367:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2367:4: ( (lv_keyString_0_0= RULE_STRING ) )
                    // InternalMoba.g:2368:5: (lv_keyString_0_0= RULE_STRING )
                    {
                    // InternalMoba.g:2368:5: (lv_keyString_0_0= RULE_STRING )
                    // InternalMoba.g:2369:6: lv_keyString_0_0= RULE_STRING
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
                      							"org.mobadsl.grammar.Moba.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:2386:4: ( (otherlv_1= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2386:4: ( (otherlv_1= RULE_CONSTANT ) )
                    // InternalMoba.g:2387:5: (otherlv_1= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2387:5: (otherlv_1= RULE_CONSTANT )
                    // InternalMoba.g:2388:6: otherlv_1= RULE_CONSTANT
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

            otherlv_2=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaPropertyAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:2404:3: ( ( (lv_valueString_3_0= RULE_STRING ) ) | ( (otherlv_4= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:2405:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:2405:4: ( (lv_valueString_3_0= RULE_STRING ) )
                    // InternalMoba.g:2406:5: (lv_valueString_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:2406:5: (lv_valueString_3_0= RULE_STRING )
                    // InternalMoba.g:2407:6: lv_valueString_3_0= RULE_STRING
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
                      							"org.mobadsl.grammar.Moba.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:2424:4: ( (otherlv_4= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:2424:4: ( (otherlv_4= RULE_CONSTANT ) )
                    // InternalMoba.g:2425:5: (otherlv_4= RULE_CONSTANT )
                    {
                    // InternalMoba.g:2425:5: (otherlv_4= RULE_CONSTANT )
                    // InternalMoba.g:2426:6: otherlv_4= RULE_CONSTANT
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
    // InternalMoba.g:2442:1: entryRuleMobaData returns [EObject current=null] : iv_ruleMobaData= ruleMobaData EOF ;
    public final EObject entryRuleMobaData() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaData = null;


        try {
            // InternalMoba.g:2442:49: (iv_ruleMobaData= ruleMobaData EOF )
            // InternalMoba.g:2443:2: iv_ruleMobaData= ruleMobaData EOF
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
    // InternalMoba.g:2449:1: ruleMobaData returns [EObject current=null] : (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) ;
    public final EObject ruleMobaData() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntity_0 = null;

        EObject this_MobaDto_1 = null;

        EObject this_MobaQueue_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:2455:2: ( (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue ) )
            // InternalMoba.g:2456:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            {
            // InternalMoba.g:2456:2: (this_MobaEntity_0= ruleMobaEntity | this_MobaDto_1= ruleMobaDto | this_MobaQueue_2= ruleMobaQueue )
            int alt37=3;
            switch ( input.LA(1) ) {
            case 72:
                {
                alt37=1;
                }
                break;
            case 75:
                {
                alt37=2;
                }
                break;
            case 77:
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
                    // InternalMoba.g:2457:3: this_MobaEntity_0= ruleMobaEntity
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
                    // InternalMoba.g:2466:3: this_MobaDto_1= ruleMobaDto
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
                    // InternalMoba.g:2475:3: this_MobaQueue_2= ruleMobaQueue
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
    // InternalMoba.g:2487:1: entryRuleMobaSettings returns [EObject current=null] : iv_ruleMobaSettings= ruleMobaSettings EOF ;
    public final EObject entryRuleMobaSettings() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettings = null;


        try {
            // InternalMoba.g:2487:53: (iv_ruleMobaSettings= ruleMobaSettings EOF )
            // InternalMoba.g:2488:2: iv_ruleMobaSettings= ruleMobaSettings EOF
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
    // InternalMoba.g:2494:1: ruleMobaSettings returns [EObject current=null] : ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) ;
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
            // InternalMoba.g:2500:2: ( ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:2501:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:2501:2: ( () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:2502:3: () ( (lv_active_1_0= 'active' ) )? otherlv_2= 'settings' ( (lv_name_3_0= RULE_ID ) ) (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaSettingsFeature ) )* otherlv_9= '}'
            {
            // InternalMoba.g:2502:3: ()
            // InternalMoba.g:2503:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaSettingsAccess().getMobaSettingsAction_0(),
              					current);
              			
            }

            }

            // InternalMoba.g:2509:3: ( (lv_active_1_0= 'active' ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==37) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalMoba.g:2510:4: (lv_active_1_0= 'active' )
                    {
                    // InternalMoba.g:2510:4: (lv_active_1_0= 'active' )
                    // InternalMoba.g:2511:5: lv_active_1_0= 'active'
                    {
                    lv_active_1_0=(Token)match(input,37,FOLLOW_46); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,67,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaSettingsAccess().getSettingsKeyword_2());
              		
            }
            // InternalMoba.g:2527:3: ( (lv_name_3_0= RULE_ID ) )
            // InternalMoba.g:2528:4: (lv_name_3_0= RULE_ID )
            {
            // InternalMoba.g:2528:4: (lv_name_3_0= RULE_ID )
            // InternalMoba.g:2529:5: lv_name_3_0= RULE_ID
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

            // InternalMoba.g:2545:3: (otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) ) )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==30) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalMoba.g:2546:4: otherlv_4= 'extends' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaSettingsAccess().getExtendsKeyword_4_0());
                      			
                    }
                    // InternalMoba.g:2550:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMoba.g:2551:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMoba.g:2551:5: (otherlv_5= RULE_ID )
                    // InternalMoba.g:2552:6: otherlv_5= RULE_ID
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
            otherlv_7=(Token)match(input,22,FOLLOW_47); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAccess().getLeftCurlyBracketKeyword_6());
              		
            }
            // InternalMoba.g:2579:3: ( (lv_features_8_0= ruleMobaSettingsFeature ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==92||LA40_0==98) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalMoba.g:2580:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    {
            	    // InternalMoba.g:2580:4: (lv_features_8_0= ruleMobaSettingsFeature )
            	    // InternalMoba.g:2581:5: lv_features_8_0= ruleMobaSettingsFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaSettingsAccess().getFeaturesMobaSettingsFeatureParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_47);
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

            otherlv_9=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:2606:1: entryRuleMobaCache returns [EObject current=null] : iv_ruleMobaCache= ruleMobaCache EOF ;
    public final EObject entryRuleMobaCache() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaCache = null;


        try {
            // InternalMoba.g:2606:50: (iv_ruleMobaCache= ruleMobaCache EOF )
            // InternalMoba.g:2607:2: iv_ruleMobaCache= ruleMobaCache EOF
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
    // InternalMoba.g:2613:1: ruleMobaCache returns [EObject current=null] : ( () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )? ) ;
    public final EObject ruleMobaCache() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token lv_cacheTypeString_7_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token lv_cacheStrategyString_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token lv_cacheIntervalInt_15_0=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;


        	enterRule();

        try {
            // InternalMoba.g:2619:2: ( ( () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )? ) )
            // InternalMoba.g:2620:2: ( () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )? )
            {
            // InternalMoba.g:2620:2: ( () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )? )
            // InternalMoba.g:2621:3: () otherlv_1= 'cache' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )?
            {
            // InternalMoba.g:2621:3: ()
            // InternalMoba.g:2622:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaCacheAccess().getMobaCacheAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,27,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaCacheAccess().getCacheKeyword_1());
              		
            }
            // InternalMoba.g:2632:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:2633:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:2633:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:2634:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_48); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(lv_name_2_0, grammarAccess.getMobaCacheAccess().getNameIDTerminalRuleCall_2_0());
              				
            }
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaCacheRule());
              					}
              					setWithLastConsumed(
              						current,
              						"name",
              						lv_name_2_0,
              						"org.mobadsl.grammar.Moba.ID");
              				
            }

            }


            }

            // InternalMoba.g:2650:3: (otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==33) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalMoba.g:2651:4: otherlv_3= '(' ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) ) otherlv_19= ')'
                    {
                    otherlv_3=(Token)match(input,33,FOLLOW_49); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMobaCacheAccess().getLeftParenthesisKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:2655:4: ( ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) ) )
                    // InternalMoba.g:2656:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) )
                    {
                    // InternalMoba.g:2656:5: ( ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?) )
                    // InternalMoba.g:2657:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?)
                    {
                    getUnorderedGroupHelper().enter(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1());
                    // InternalMoba.g:2660:6: ( ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?)
                    // InternalMoba.g:2661:7: ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+ {...}?
                    {
                    // InternalMoba.g:2661:7: ( ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) )+
                    int cnt44=0;
                    loop44:
                    do {
                        int alt44=5;
                        int LA44_0 = input.LA(1);

                        if ( LA44_0 == 68 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 0) ) {
                            alt44=1;
                        }
                        else if ( LA44_0 == 69 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 1) ) {
                            alt44=2;
                        }
                        else if ( LA44_0 == 70 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 2) ) {
                            alt44=3;
                        }
                        else if ( LA44_0 == 71 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 3) ) {
                            alt44=4;
                        }


                        switch (alt44) {
                    	case 1 :
                    	    // InternalMoba.g:2662:5: ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2662:5: ({...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) ) )
                    	    // InternalMoba.g:2663:6: {...}? => ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 0) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 0)");
                    	    }
                    	    // InternalMoba.g:2663:109: ( ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2664:7: ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 0);
                    	    // InternalMoba.g:2667:10: ({...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2667:11: {...}? => (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2667:20: (otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2667:21: otherlv_5= 'type' otherlv_6= '=' ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    	    {
                    	    otherlv_5=(Token)match(input,68,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_5, grammarAccess.getMobaCacheAccess().getTypeKeyword_3_1_0_0());
                    	      									
                    	    }
                    	    otherlv_6=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_6, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_3_1_0_1());
                    	      									
                    	    }
                    	    // InternalMoba.g:2675:10: ( ( (lv_cacheTypeString_7_0= RULE_STRING ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    	    int alt41=2;
                    	    int LA41_0 = input.LA(1);

                    	    if ( (LA41_0==RULE_STRING) ) {
                    	        alt41=1;
                    	    }
                    	    else if ( (LA41_0==RULE_CONSTANT) ) {
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
                    	            // InternalMoba.g:2676:11: ( (lv_cacheTypeString_7_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:2676:11: ( (lv_cacheTypeString_7_0= RULE_STRING ) )
                    	            // InternalMoba.g:2677:12: (lv_cacheTypeString_7_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:2677:12: (lv_cacheTypeString_7_0= RULE_STRING )
                    	            // InternalMoba.g:2678:13: lv_cacheTypeString_7_0= RULE_STRING
                    	            {
                    	            lv_cacheTypeString_7_0=(Token)match(input,RULE_STRING,FOLLOW_50); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(lv_cacheTypeString_7_0, grammarAccess.getMobaCacheAccess().getCacheTypeStringSTRINGTerminalRuleCall_3_1_0_2_0_0());
                    	              												
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              													setWithLastConsumed(
                    	              														current,
                    	              														"cacheTypeString",
                    	              														lv_cacheTypeString_7_0,
                    	              														"org.mobadsl.grammar.Moba.STRING");
                    	              												
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:2695:11: ( (otherlv_8= RULE_CONSTANT ) )
                    	            {
                    	            // InternalMoba.g:2695:11: ( (otherlv_8= RULE_CONSTANT ) )
                    	            // InternalMoba.g:2696:12: (otherlv_8= RULE_CONSTANT )
                    	            {
                    	            // InternalMoba.g:2696:12: (otherlv_8= RULE_CONSTANT )
                    	            // InternalMoba.g:2697:13: otherlv_8= RULE_CONSTANT
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              												
                    	            }
                    	            otherlv_8=(Token)match(input,RULE_CONSTANT,FOLLOW_50); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(otherlv_8, grammarAccess.getMobaCacheAccess().getCacheTypeConstMobaConstantCrossReference_3_1_0_2_1_0());
                    	              												
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalMoba.g:2715:5: ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2715:5: ({...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) ) )
                    	    // InternalMoba.g:2716:6: {...}? => ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 1) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 1)");
                    	    }
                    	    // InternalMoba.g:2716:109: ( ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2717:7: ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 1);
                    	    // InternalMoba.g:2720:10: ({...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2720:11: {...}? => (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2720:20: (otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2720:21: otherlv_9= 'strategy' otherlv_10= '=' ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) )
                    	    {
                    	    otherlv_9=(Token)match(input,69,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_9, grammarAccess.getMobaCacheAccess().getStrategyKeyword_3_1_1_0());
                    	      									
                    	    }
                    	    otherlv_10=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_10, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_3_1_1_1());
                    	      									
                    	    }
                    	    // InternalMoba.g:2728:10: ( ( (lv_cacheStrategyString_11_0= RULE_STRING ) ) | ( (otherlv_12= RULE_CONSTANT ) ) )
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
                    	            // InternalMoba.g:2729:11: ( (lv_cacheStrategyString_11_0= RULE_STRING ) )
                    	            {
                    	            // InternalMoba.g:2729:11: ( (lv_cacheStrategyString_11_0= RULE_STRING ) )
                    	            // InternalMoba.g:2730:12: (lv_cacheStrategyString_11_0= RULE_STRING )
                    	            {
                    	            // InternalMoba.g:2730:12: (lv_cacheStrategyString_11_0= RULE_STRING )
                    	            // InternalMoba.g:2731:13: lv_cacheStrategyString_11_0= RULE_STRING
                    	            {
                    	            lv_cacheStrategyString_11_0=(Token)match(input,RULE_STRING,FOLLOW_50); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(lv_cacheStrategyString_11_0, grammarAccess.getMobaCacheAccess().getCacheStrategyStringSTRINGTerminalRuleCall_3_1_1_2_0_0());
                    	              												
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              													setWithLastConsumed(
                    	              														current,
                    	              														"cacheStrategyString",
                    	              														lv_cacheStrategyString_11_0,
                    	              														"org.mobadsl.grammar.Moba.STRING");
                    	              												
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:2748:11: ( (otherlv_12= RULE_CONSTANT ) )
                    	            {
                    	            // InternalMoba.g:2748:11: ( (otherlv_12= RULE_CONSTANT ) )
                    	            // InternalMoba.g:2749:12: (otherlv_12= RULE_CONSTANT )
                    	            {
                    	            // InternalMoba.g:2749:12: (otherlv_12= RULE_CONSTANT )
                    	            // InternalMoba.g:2750:13: otherlv_12= RULE_CONSTANT
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              												
                    	            }
                    	            otherlv_12=(Token)match(input,RULE_CONSTANT,FOLLOW_50); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(otherlv_12, grammarAccess.getMobaCacheAccess().getCacheStrategyConstMobaConstantCrossReference_3_1_1_2_1_0());
                    	              												
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 3 :
                    	    // InternalMoba.g:2768:5: ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2768:5: ({...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) ) )
                    	    // InternalMoba.g:2769:6: {...}? => ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 2) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 2)");
                    	    }
                    	    // InternalMoba.g:2769:109: ( ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2770:7: ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 2);
                    	    // InternalMoba.g:2773:10: ({...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2773:11: {...}? => (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2773:20: (otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2773:21: otherlv_13= 'interval' otherlv_14= '=' ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) )
                    	    {
                    	    otherlv_13=(Token)match(input,70,FOLLOW_6); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_13, grammarAccess.getMobaCacheAccess().getIntervalKeyword_3_1_2_0());
                    	      									
                    	    }
                    	    otherlv_14=(Token)match(input,21,FOLLOW_51); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_14, grammarAccess.getMobaCacheAccess().getEqualsSignKeyword_3_1_2_1());
                    	      									
                    	    }
                    	    // InternalMoba.g:2781:10: ( ( (lv_cacheIntervalInt_15_0= RULE_INT ) ) | ( (otherlv_16= RULE_CONSTANT ) ) )
                    	    int alt43=2;
                    	    int LA43_0 = input.LA(1);

                    	    if ( (LA43_0==RULE_INT) ) {
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
                    	            // InternalMoba.g:2782:11: ( (lv_cacheIntervalInt_15_0= RULE_INT ) )
                    	            {
                    	            // InternalMoba.g:2782:11: ( (lv_cacheIntervalInt_15_0= RULE_INT ) )
                    	            // InternalMoba.g:2783:12: (lv_cacheIntervalInt_15_0= RULE_INT )
                    	            {
                    	            // InternalMoba.g:2783:12: (lv_cacheIntervalInt_15_0= RULE_INT )
                    	            // InternalMoba.g:2784:13: lv_cacheIntervalInt_15_0= RULE_INT
                    	            {
                    	            lv_cacheIntervalInt_15_0=(Token)match(input,RULE_INT,FOLLOW_50); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(lv_cacheIntervalInt_15_0, grammarAccess.getMobaCacheAccess().getCacheIntervalIntINTTerminalRuleCall_3_1_2_2_0_0());
                    	              												
                    	            }
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              													setWithLastConsumed(
                    	              														current,
                    	              														"cacheIntervalInt",
                    	              														lv_cacheIntervalInt_15_0,
                    	              														"org.mobadsl.grammar.Moba.INT");
                    	              												
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;
                    	        case 2 :
                    	            // InternalMoba.g:2801:11: ( (otherlv_16= RULE_CONSTANT ) )
                    	            {
                    	            // InternalMoba.g:2801:11: ( (otherlv_16= RULE_CONSTANT ) )
                    	            // InternalMoba.g:2802:12: (otherlv_16= RULE_CONSTANT )
                    	            {
                    	            // InternalMoba.g:2802:12: (otherlv_16= RULE_CONSTANT )
                    	            // InternalMoba.g:2803:13: otherlv_16= RULE_CONSTANT
                    	            {
                    	            if ( state.backtracking==0 ) {

                    	              													if (current==null) {
                    	              														current = createModelElement(grammarAccess.getMobaCacheRule());
                    	              													}
                    	              												
                    	            }
                    	            otherlv_16=(Token)match(input,RULE_CONSTANT,FOLLOW_50); if (state.failed) return current;
                    	            if ( state.backtracking==0 ) {

                    	              													newLeafNode(otherlv_16, grammarAccess.getMobaCacheAccess().getCacheIntervalConstMobaConstantCrossReference_3_1_2_2_1_0());
                    	              												
                    	            }

                    	            }


                    	            }


                    	            }
                    	            break;

                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1());

                    	    }


                    	    }


                    	    }
                    	    break;
                    	case 4 :
                    	    // InternalMoba.g:2821:5: ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) )
                    	    {
                    	    // InternalMoba.g:2821:5: ({...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) )
                    	    // InternalMoba.g:2822:6: {...}? => ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) )
                    	    {
                    	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 3) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 3)");
                    	    }
                    	    // InternalMoba.g:2822:109: ( ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) ) )
                    	    // InternalMoba.g:2823:7: ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) )
                    	    {
                    	    getUnorderedGroupHelper().select(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1(), 3);
                    	    // InternalMoba.g:2826:10: ({...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) ) )
                    	    // InternalMoba.g:2826:11: {...}? => (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) )
                    	    {
                    	    if ( !((true)) ) {
                    	        if (state.backtracking>0) {state.failed=true; return current;}
                    	        throw new FailedPredicateException(input, "ruleMobaCache", "true");
                    	    }
                    	    // InternalMoba.g:2826:20: (otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) ) )
                    	    // InternalMoba.g:2826:21: otherlv_17= 'using' ( (otherlv_18= RULE_CONSTANT ) )
                    	    {
                    	    otherlv_17=(Token)match(input,71,FOLLOW_17); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      										newLeafNode(otherlv_17, grammarAccess.getMobaCacheAccess().getUsingKeyword_3_1_3_0());
                    	      									
                    	    }
                    	    // InternalMoba.g:2830:10: ( (otherlv_18= RULE_CONSTANT ) )
                    	    // InternalMoba.g:2831:11: (otherlv_18= RULE_CONSTANT )
                    	    {
                    	    // InternalMoba.g:2831:11: (otherlv_18= RULE_CONSTANT )
                    	    // InternalMoba.g:2832:12: otherlv_18= RULE_CONSTANT
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      												if (current==null) {
                    	      													current = createModelElement(grammarAccess.getMobaCacheRule());
                    	      												}
                    	      											
                    	    }
                    	    otherlv_18=(Token)match(input,RULE_CONSTANT,FOLLOW_50); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      												newLeafNode(otherlv_18, grammarAccess.getMobaCacheAccess().getCachePersistenceMobaPersistenceTypeCrossReference_3_1_3_1_0());
                    	      											
                    	    }

                    	    }


                    	    }


                    	    }


                    	    }

                    	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1());

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt44 >= 1 ) break loop44;
                    	    if (state.backtracking>0) {state.failed=true; return current;}
                                EarlyExitException eee =
                                    new EarlyExitException(44, input);
                                throw eee;
                        }
                        cnt44++;
                    } while (true);

                    if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1()) ) {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        throw new FailedPredicateException(input, "ruleMobaCache", "getUnorderedGroupHelper().canLeave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1())");
                    }

                    }


                    }

                    getUnorderedGroupHelper().leave(grammarAccess.getMobaCacheAccess().getUnorderedGroup_3_1());

                    }

                    otherlv_19=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_19, grammarAccess.getMobaCacheAccess().getRightParenthesisKeyword_3_2());
                      			
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
    // InternalMoba.g:2866:1: entryRuleMobaEntity returns [EObject current=null] : iv_ruleMobaEntity= ruleMobaEntity EOF ;
    public final EObject entryRuleMobaEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntity = null;


        try {
            // InternalMoba.g:2866:51: (iv_ruleMobaEntity= ruleMobaEntity EOF )
            // InternalMoba.g:2867:2: iv_ruleMobaEntity= ruleMobaEntity EOF
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
    // InternalMoba.g:2873:1: ruleMobaEntity returns [EObject current=null] : (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}' ) ;
    public final EObject ruleMobaEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_12=null;
        EObject this_MobaFriendsAble_8 = null;

        EObject lv_features_10_0 = null;

        EObject lv_indizes_11_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:2879:2: ( (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}' ) )
            // InternalMoba.g:2880:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}' )
            {
            // InternalMoba.g:2880:2: (otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}' )
            // InternalMoba.g:2881:3: otherlv_0= 'entity' ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] otherlv_9= '{' ( (lv_features_10_0= ruleMobaEntityFeature ) )* ( (lv_indizes_11_0= ruleMobaEntityIndex ) )* otherlv_12= '}'
            {
            otherlv_0=(Token)match(input,72,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAccess().getEntityKeyword_0());
              		
            }
            // InternalMoba.g:2885:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:2886:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:2886:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:2887:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
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

            // InternalMoba.g:2903:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:2904:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:2904:4: ( ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* ) )
            // InternalMoba.g:2905:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2());
            // InternalMoba.g:2908:5: ( ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )* )
            // InternalMoba.g:2909:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )*
            {
            // InternalMoba.g:2909:6: ( ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) ) )*
            loop46:
            do {
                int alt46=3;
                int LA46_0 = input.LA(1);

                if ( LA46_0 == 30 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
                    alt46=1;
                }
                else if ( LA46_0 == 27 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
                    alt46=2;
                }


                switch (alt46) {
            	case 1 :
            	    // InternalMoba.g:2910:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:2910:4: ({...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:2911:5: {...}? => ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // InternalMoba.g:2911:107: ( ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:2912:6: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 0);
            	    // InternalMoba.g:2915:9: ({...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) ) )
            	    // InternalMoba.g:2915:10: {...}? => (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:2915:19: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )
            	    // InternalMoba.g:2915:20: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
            	    {
            	    otherlv_3=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getMobaEntityAccess().getExtendsKeyword_2_0_0());
            	      								
            	    }
            	    // InternalMoba.g:2919:9: ( (otherlv_4= RULE_ID ) )
            	    // InternalMoba.g:2920:10: (otherlv_4= RULE_ID )
            	    {
            	    // InternalMoba.g:2920:10: (otherlv_4= RULE_ID )
            	    // InternalMoba.g:2921:11: otherlv_4= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaEntityRule());
            	      											}
            	      										
            	    }
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
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
            	    // InternalMoba.g:2938:4: ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:2938:4: ({...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) ) )
            	    // InternalMoba.g:2939:5: {...}? => ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // InternalMoba.g:2939:107: ( ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) ) )
            	    // InternalMoba.g:2940:6: ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAccess().getUnorderedGroup_2(), 1);
            	    // InternalMoba.g:2943:9: ({...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) ) )
            	    // InternalMoba.g:2943:10: {...}? => (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntity", "true");
            	    }
            	    // InternalMoba.g:2943:19: (otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) ) )
            	    // InternalMoba.g:2943:20: otherlv_5= 'cache' otherlv_6= '=' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_5, grammarAccess.getMobaEntityAccess().getCacheKeyword_2_1_0());
            	      								
            	    }
            	    otherlv_6=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaEntityAccess().getEqualsSignKeyword_2_1_1());
            	      								
            	    }
            	    // InternalMoba.g:2951:9: ( (otherlv_7= RULE_ID ) )
            	    // InternalMoba.g:2952:10: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMoba.g:2952:10: (otherlv_7= RULE_ID )
            	    // InternalMoba.g:2953:11: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaEntityRule());
            	      											}
            	      										
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_7, grammarAccess.getMobaEntityAccess().getCacheMobaCacheCrossReference_2_1_2_0());
            	      										
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

            	default :
            	    break loop46;
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
            this_MobaFriendsAble_8=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_8;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_9=(Token)match(input,22,FOLLOW_53); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMobaEntityAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:2992:3: ( (lv_features_10_0= ruleMobaEntityFeature ) )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==92||LA47_0==100||LA47_0==102) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalMoba.g:2993:4: (lv_features_10_0= ruleMobaEntityFeature )
            	    {
            	    // InternalMoba.g:2993:4: (lv_features_10_0= ruleMobaEntityFeature )
            	    // InternalMoba.g:2994:5: lv_features_10_0= ruleMobaEntityFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaEntityAccess().getFeaturesMobaEntityFeatureParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_53);
            	    lv_features_10_0=ruleMobaEntityFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMobaEntityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"features",
            	      						lv_features_10_0,
            	      						"org.mobadsl.grammar.Moba.MobaEntityFeature");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);

            // InternalMoba.g:3011:3: ( (lv_indizes_11_0= ruleMobaEntityIndex ) )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( ((LA48_0>=73 && LA48_0<=74)) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // InternalMoba.g:3012:4: (lv_indizes_11_0= ruleMobaEntityIndex )
            	    {
            	    // InternalMoba.g:3012:4: (lv_indizes_11_0= ruleMobaEntityIndex )
            	    // InternalMoba.g:3013:5: lv_indizes_11_0= ruleMobaEntityIndex
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaEntityAccess().getIndizesMobaEntityIndexParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_54);
            	    lv_indizes_11_0=ruleMobaEntityIndex();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMobaEntityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"indizes",
            	      						lv_indizes_11_0,
            	      						"org.mobadsl.grammar.Moba.MobaEntityIndex");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);

            otherlv_12=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_12, grammarAccess.getMobaEntityAccess().getRightCurlyBracketKeyword_7());
              		
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
    // InternalMoba.g:3038:1: entryRuleMobaEntityIndex returns [EObject current=null] : iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF ;
    public final EObject entryRuleMobaEntityIndex() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityIndex = null;


        try {
            // InternalMoba.g:3038:56: (iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF )
            // InternalMoba.g:3039:2: iv_ruleMobaEntityIndex= ruleMobaEntityIndex EOF
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
    // InternalMoba.g:3045:1: ruleMobaEntityIndex returns [EObject current=null] : ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) ;
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
            // InternalMoba.g:3051:2: ( ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' ) )
            // InternalMoba.g:3052:2: ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            {
            // InternalMoba.g:3052:2: ( ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' )
            // InternalMoba.g:3053:3: ( (lv_unique_0_0= 'unique' ) )? otherlv_1= 'index' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')'
            {
            // InternalMoba.g:3053:3: ( (lv_unique_0_0= 'unique' ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==73) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalMoba.g:3054:4: (lv_unique_0_0= 'unique' )
                    {
                    // InternalMoba.g:3054:4: (lv_unique_0_0= 'unique' )
                    // InternalMoba.g:3055:5: lv_unique_0_0= 'unique'
                    {
                    lv_unique_0_0=(Token)match(input,73,FOLLOW_55); if (state.failed) return current;
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

            otherlv_1=(Token)match(input,74,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaEntityIndexAccess().getIndexKeyword_1());
              		
            }
            // InternalMoba.g:3071:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:3072:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:3072:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:3073:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_18); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaEntityIndexAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalMoba.g:3093:3: ( (otherlv_4= RULE_ID ) )
            // InternalMoba.g:3094:4: (otherlv_4= RULE_ID )
            {
            // InternalMoba.g:3094:4: (otherlv_4= RULE_ID )
            // InternalMoba.g:3095:5: otherlv_4= RULE_ID
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

            // InternalMoba.g:3106:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==34) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalMoba.g:3107:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,34,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getMobaEntityIndexAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalMoba.g:3111:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalMoba.g:3112:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalMoba.g:3112:5: (otherlv_6= RULE_ID )
            	    // InternalMoba.g:3113:6: otherlv_6= RULE_ID
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
            	    break loop50;
                }
            } while (true);

            otherlv_7=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:3133:1: entryRuleMobaDto returns [EObject current=null] : iv_ruleMobaDto= ruleMobaDto EOF ;
    public final EObject entryRuleMobaDto() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDto = null;


        try {
            // InternalMoba.g:3133:48: (iv_ruleMobaDto= ruleMobaDto EOF )
            // InternalMoba.g:3134:2: iv_ruleMobaDto= ruleMobaDto EOF
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
    // InternalMoba.g:3140:1: ruleMobaDto returns [EObject current=null] : (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}' ) ;
    public final EObject ruleMobaDto() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject this_MobaFriendsAble_6 = null;

        EObject lv_features_8_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3146:2: ( (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}' ) )
            // InternalMoba.g:3147:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}' )
            {
            // InternalMoba.g:3147:2: (otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}' )
            // InternalMoba.g:3148:3: otherlv_0= 'dto' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )? this_MobaFriendsAble_6= ruleMobaFriendsAble[$current] otherlv_7= '{' ( (lv_features_8_0= ruleMobaDtoFeature ) )* otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,75,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAccess().getDtoKeyword_0());
              		
            }
            // InternalMoba.g:3152:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:3153:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:3153:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:3154:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_56); if (state.failed) return current;
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

            // InternalMoba.g:3170:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==30) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalMoba.g:3171:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaDtoAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:3175:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3176:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3176:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3177:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaDtoRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaDtoAccess().getSuperTypeMobaDtoCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:3189:3: (otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==76) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalMoba.g:3190:4: otherlv_4= 'wraps' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,76,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaDtoAccess().getWrapsKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:3194:4: ( (otherlv_5= RULE_ID ) )
                    // InternalMoba.g:3195:5: (otherlv_5= RULE_ID )
                    {
                    // InternalMoba.g:3195:5: (otherlv_5= RULE_ID )
                    // InternalMoba.g:3196:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaDtoRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getMobaDtoAccess().getWrappedEntityMobaEntityCrossReference_3_1_0());
                      					
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
              			newCompositeNode(grammarAccess.getMobaDtoAccess().getMobaFriendsAbleParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_6=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_6;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_7=(Token)match(input,22,FOLLOW_58); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getMobaDtoAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalMoba.g:3223:3: ( (lv_features_8_0= ruleMobaDtoFeature ) )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==92||LA53_0==100||LA53_0==102) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // InternalMoba.g:3224:4: (lv_features_8_0= ruleMobaDtoFeature )
            	    {
            	    // InternalMoba.g:3224:4: (lv_features_8_0= ruleMobaDtoFeature )
            	    // InternalMoba.g:3225:5: lv_features_8_0= ruleMobaDtoFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaDtoAccess().getFeaturesMobaDtoFeatureParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_features_8_0=ruleMobaDtoFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);

            otherlv_9=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getMobaDtoAccess().getRightCurlyBracketKeyword_7());
              		
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
    // InternalMoba.g:3250:1: entryRuleMobaQueue returns [EObject current=null] : iv_ruleMobaQueue= ruleMobaQueue EOF ;
    public final EObject entryRuleMobaQueue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueue = null;


        try {
            // InternalMoba.g:3250:50: (iv_ruleMobaQueue= ruleMobaQueue EOF )
            // InternalMoba.g:3251:2: iv_ruleMobaQueue= ruleMobaQueue EOF
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
    // InternalMoba.g:3257:1: ruleMobaQueue returns [EObject current=null] : (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}' ) ;
    public final EObject ruleMobaQueue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        EObject this_MobaFriendsAble_7 = null;

        EObject lv_features_9_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3263:2: ( (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}' ) )
            // InternalMoba.g:3264:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}' )
            {
            // InternalMoba.g:3264:2: (otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}' )
            // InternalMoba.g:3265:3: otherlv_0= 'queue' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )? this_MobaFriendsAble_7= ruleMobaFriendsAble[$current] otherlv_8= '{' ( (lv_features_9_0= ruleMobaQueueFeature ) )* otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,77,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaQueueAccess().getQueueKeyword_0());
              		
            }
            // InternalMoba.g:3269:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:3270:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:3270:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:3271:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_52); if (state.failed) return current;
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

            // InternalMoba.g:3287:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==30) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // InternalMoba.g:3288:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaQueueAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:3292:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:3293:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:3293:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:3294:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaQueueRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaQueueAccess().getSuperTypeMobaQueueCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:3306:3: (otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==27) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalMoba.g:3307:4: otherlv_4= 'cache' otherlv_5= '=' ( (otherlv_6= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_6); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaQueueAccess().getCacheKeyword_3_0());
                      			
                    }
                    otherlv_5=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMobaQueueAccess().getEqualsSignKeyword_3_1());
                      			
                    }
                    // InternalMoba.g:3315:4: ( (otherlv_6= RULE_ID ) )
                    // InternalMoba.g:3316:5: (otherlv_6= RULE_ID )
                    {
                    // InternalMoba.g:3316:5: (otherlv_6= RULE_ID )
                    // InternalMoba.g:3317:6: otherlv_6= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaQueueRule());
                      						}
                      					
                    }
                    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_8); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_6, grammarAccess.getMobaQueueAccess().getCacheMobaCacheCrossReference_3_2_0());
                      					
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
              			newCompositeNode(grammarAccess.getMobaQueueAccess().getMobaFriendsAbleParserRuleCall_4());
              		
            }
            pushFollow(FOLLOW_9);
            this_MobaFriendsAble_7=ruleMobaFriendsAble(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_MobaFriendsAble_7;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_8=(Token)match(input,22,FOLLOW_59); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getMobaQueueAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalMoba.g:3344:3: ( (lv_features_9_0= ruleMobaQueueFeature ) )*
            loop56:
            do {
                int alt56=2;
                int LA56_0 = input.LA(1);

                if ( (LA56_0==100) ) {
                    alt56=1;
                }


                switch (alt56) {
            	case 1 :
            	    // InternalMoba.g:3345:4: (lv_features_9_0= ruleMobaQueueFeature )
            	    {
            	    // InternalMoba.g:3345:4: (lv_features_9_0= ruleMobaQueueFeature )
            	    // InternalMoba.g:3346:5: lv_features_9_0= ruleMobaQueueFeature
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getMobaQueueAccess().getFeaturesMobaQueueFeatureParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_59);
            	    lv_features_9_0=ruleMobaQueueFeature();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getMobaQueueRule());
            	      					}
            	      					add(
            	      						current,
            	      						"features",
            	      						lv_features_9_0,
            	      						"org.mobadsl.grammar.Moba.MobaQueueFeature");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop56;
                }
            } while (true);

            otherlv_10=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getMobaQueueAccess().getRightCurlyBracketKeyword_7());
              		
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
    // InternalMoba.g:3371:1: entryRuleMobaREST returns [EObject current=null] : iv_ruleMobaREST= ruleMobaREST EOF ;
    public final EObject entryRuleMobaREST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaREST = null;


        try {
            // InternalMoba.g:3371:49: (iv_ruleMobaREST= ruleMobaREST EOF )
            // InternalMoba.g:3372:2: iv_ruleMobaREST= ruleMobaREST EOF
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
    // InternalMoba.g:3378:1: ruleMobaREST returns [EObject current=null] : (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow ) ;
    public final EObject ruleMobaREST() throws RecognitionException {
        EObject current = null;

        EObject this_MobaRESTCustomService_0 = null;

        EObject this_MobaRESTCrud_1 = null;

        EObject this_MobaRESTWorkflow_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:3384:2: ( (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow ) )
            // InternalMoba.g:3385:2: (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow )
            {
            // InternalMoba.g:3385:2: (this_MobaRESTCustomService_0= ruleMobaRESTCustomService | this_MobaRESTCrud_1= ruleMobaRESTCrud | this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow )
            int alt57=3;
            switch ( input.LA(1) ) {
            case 78:
                {
                alt57=1;
                }
                break;
            case 89:
                {
                alt57=2;
                }
                break;
            case 90:
                {
                alt57=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;
            }

            switch (alt57) {
                case 1 :
                    // InternalMoba.g:3386:3: this_MobaRESTCustomService_0= ruleMobaRESTCustomService
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
                    // InternalMoba.g:3395:3: this_MobaRESTCrud_1= ruleMobaRESTCrud
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
                    // InternalMoba.g:3404:3: this_MobaRESTWorkflow_2= ruleMobaRESTWorkflow
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
    // InternalMoba.g:3416:1: entryRuleMobaRESTCustomService returns [EObject current=null] : iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF ;
    public final EObject entryRuleMobaRESTCustomService() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTCustomService = null;


        try {
            // InternalMoba.g:3416:62: (iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF )
            // InternalMoba.g:3417:2: iv_ruleMobaRESTCustomService= ruleMobaRESTCustomService EOF
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
    // InternalMoba.g:3423:1: ruleMobaRESTCustomService returns [EObject current=null] : (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_31= '}' ) ;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        EObject this_MobaFriendsAble_5 = null;

        EObject lv_headers_10_0 = null;

        EObject lv_parameters_14_0 = null;

        EObject lv_requestDto_21_0 = null;

        EObject lv_responseDto_24_0 = null;

        EObject lv_errorDto_27_0 = null;

        Enumerator lv_operation_30_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:3429:2: ( (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_31= '}' ) )
            // InternalMoba.g:3430:2: (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_31= '}' )
            {
            // InternalMoba.g:3430:2: (otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_31= '}' )
            // InternalMoba.g:3431:3: otherlv_0= 'rest' ( (lv_bigData_1_0= 'bigData' ) )? ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )? this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] otherlv_6= '{' ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) ) otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,78,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRESTCustomServiceAccess().getRestKeyword_0());
              		
            }
            // InternalMoba.g:3435:3: ( (lv_bigData_1_0= 'bigData' ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==79) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // InternalMoba.g:3436:4: (lv_bigData_1_0= 'bigData' )
                    {
                    // InternalMoba.g:3436:4: (lv_bigData_1_0= 'bigData' )
                    // InternalMoba.g:3437:5: lv_bigData_1_0= 'bigData'
                    {
                    lv_bigData_1_0=(Token)match(input,79,FOLLOW_4); if (state.failed) return current;
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

            // InternalMoba.g:3449:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMoba.g:3450:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMoba.g:3450:4: (lv_name_2_0= RULE_ID )
            // InternalMoba.g:3451:5: lv_name_2_0= RULE_ID
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

            // InternalMoba.g:3467:3: (otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==30) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // InternalMoba.g:3468:4: otherlv_3= 'extends' ( (otherlv_4= RULE_ID ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getMobaRESTCustomServiceAccess().getExtendsKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:3472:4: ( (otherlv_4= RULE_ID ) )
                    // InternalMoba.g:3473:5: (otherlv_4= RULE_ID )
                    {
                    // InternalMoba.g:3473:5: (otherlv_4= RULE_ID )
                    // InternalMoba.g:3474:6: otherlv_4= RULE_ID
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
            otherlv_6=(Token)match(input,22,FOLLOW_61); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalMoba.g:3501:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3502:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3502:4: ( ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* ) )
            // InternalMoba.g:3503:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());
            // InternalMoba.g:3506:5: ( ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )* )
            // InternalMoba.g:3507:6: ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )*
            {
            // InternalMoba.g:3507:6: ( ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) ) )*
            loop62:
            do {
                int alt62=8;
                int LA62_0 = input.LA(1);

                if ( LA62_0 == 80 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0) ) {
                    alt62=1;
                }
                else if ( LA62_0 == 81 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1) ) {
                    alt62=2;
                }
                else if ( LA62_0 == 82 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2) ) {
                    alt62=3;
                }
                else if ( LA62_0 == 83 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3) ) {
                    alt62=4;
                }
                else if ( LA62_0 == 84 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4) ) {
                    alt62=5;
                }
                else if ( LA62_0 == 85 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5) ) {
                    alt62=6;
                }
                else if ( LA62_0 == 86 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 6) ) {
                    alt62=7;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalMoba.g:3508:4: ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) )
            	    {
            	    // InternalMoba.g:3508:4: ({...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) ) )
            	    // InternalMoba.g:3509:5: {...}? => ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // InternalMoba.g:3509:118: ( ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) ) )
            	    // InternalMoba.g:3510:6: ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 0);
            	    // InternalMoba.g:3513:9: ({...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' ) )
            	    // InternalMoba.g:3513:10: {...}? => (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3513:19: (otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}' )
            	    // InternalMoba.g:3513:20: otherlv_8= 'headers' otherlv_9= '{' ( (lv_headers_10_0= ruleMobaRestHeader ) )* otherlv_11= '}'
            	    {
            	    otherlv_8=(Token)match(input,80,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_8, grammarAccess.getMobaRESTCustomServiceAccess().getHeadersKeyword_6_0_0());
            	      								
            	    }
            	    otherlv_9=(Token)match(input,22,FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_9, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_6_0_1());
            	      								
            	    }
            	    // InternalMoba.g:3521:9: ( (lv_headers_10_0= ruleMobaRestHeader ) )*
            	    loop60:
            	    do {
            	        int alt60=2;
            	        int LA60_0 = input.LA(1);

            	        if ( (LA60_0==88) ) {
            	            alt60=1;
            	        }


            	        switch (alt60) {
            	    	case 1 :
            	    	    // InternalMoba.g:3522:10: (lv_headers_10_0= ruleMobaRestHeader )
            	    	    {
            	    	    // InternalMoba.g:3522:10: (lv_headers_10_0= ruleMobaRestHeader )
            	    	    // InternalMoba.g:3523:11: lv_headers_10_0= ruleMobaRestHeader
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getHeadersMobaRestHeaderParserRuleCall_6_0_2_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_62);
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
            	    	    break loop60;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,25,FOLLOW_61); if (state.failed) return current;
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
            	    // InternalMoba.g:3550:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) )
            	    {
            	    // InternalMoba.g:3550:4: ({...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) ) )
            	    // InternalMoba.g:3551:5: {...}? => ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // InternalMoba.g:3551:118: ( ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) ) )
            	    // InternalMoba.g:3552:6: ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 1);
            	    // InternalMoba.g:3555:9: ({...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' ) )
            	    // InternalMoba.g:3555:10: {...}? => (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3555:19: (otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}' )
            	    // InternalMoba.g:3555:20: otherlv_12= 'parameters' otherlv_13= '{' ( (lv_parameters_14_0= ruleMobaRestParameter ) )* otherlv_15= '}'
            	    {
            	    otherlv_12=(Token)match(input,81,FOLLOW_9); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_12, grammarAccess.getMobaRESTCustomServiceAccess().getParametersKeyword_6_1_0());
            	      								
            	    }
            	    otherlv_13=(Token)match(input,22,FOLLOW_62); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_13, grammarAccess.getMobaRESTCustomServiceAccess().getLeftCurlyBracketKeyword_6_1_1());
            	      								
            	    }
            	    // InternalMoba.g:3563:9: ( (lv_parameters_14_0= ruleMobaRestParameter ) )*
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==88) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // InternalMoba.g:3564:10: (lv_parameters_14_0= ruleMobaRestParameter )
            	    	    {
            	    	    // InternalMoba.g:3564:10: (lv_parameters_14_0= ruleMobaRestParameter )
            	    	    // InternalMoba.g:3565:11: lv_parameters_14_0= ruleMobaRestParameter
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getParametersMobaRestParameterParserRuleCall_6_1_2_0());
            	    	      										
            	    	    }
            	    	    pushFollow(FOLLOW_62);
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
            	    	    break loop61;
            	        }
            	    } while (true);

            	    otherlv_15=(Token)match(input,25,FOLLOW_61); if (state.failed) return current;
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
            	    // InternalMoba.g:3592:4: ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3592:4: ({...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) ) )
            	    // InternalMoba.g:3593:5: {...}? => ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // InternalMoba.g:3593:118: ( ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) ) )
            	    // InternalMoba.g:3594:6: ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 2);
            	    // InternalMoba.g:3597:9: ({...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) ) )
            	    // InternalMoba.g:3597:10: {...}? => (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3597:19: (otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) ) )
            	    // InternalMoba.g:3597:20: otherlv_16= 'autorization' otherlv_17= '=' ( (otherlv_18= RULE_CONSTANT ) )
            	    {
            	    otherlv_16=(Token)match(input,82,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_16, grammarAccess.getMobaRESTCustomServiceAccess().getAutorizationKeyword_6_2_0());
            	      								
            	    }
            	    otherlv_17=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_17, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_2_1());
            	      								
            	    }
            	    // InternalMoba.g:3605:9: ( (otherlv_18= RULE_CONSTANT ) )
            	    // InternalMoba.g:3606:10: (otherlv_18= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:3606:10: (otherlv_18= RULE_CONSTANT )
            	    // InternalMoba.g:3607:11: otherlv_18= RULE_CONSTANT
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaRESTCustomServiceRule());
            	      											}
            	      										
            	    }
            	    otherlv_18=(Token)match(input,RULE_CONSTANT,FOLLOW_61); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											newLeafNode(otherlv_18, grammarAccess.getMobaRESTCustomServiceAccess().getAuthorizationMobaAuthorizationCrossReference_6_2_2_0());
            	      										
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
            	    // InternalMoba.g:3624:4: ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3624:4: ({...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3625:5: {...}? => ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3)");
            	    }
            	    // InternalMoba.g:3625:118: ( ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3626:6: ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 3);
            	    // InternalMoba.g:3629:9: ({...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3629:10: {...}? => (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3629:19: (otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3629:20: otherlv_19= 'requestDto' otherlv_20= '=' ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_19=(Token)match(input,83,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_19, grammarAccess.getMobaRESTCustomServiceAccess().getRequestDtoKeyword_6_3_0());
            	      								
            	    }
            	    otherlv_20=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_20, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_3_1());
            	      								
            	    }
            	    // InternalMoba.g:3637:9: ( (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3638:10: (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3638:10: (lv_requestDto_21_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3639:11: lv_requestDto_21_0= ruleMobaRESTPayloadDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getRequestDtoMobaRESTPayloadDefinitionParserRuleCall_6_3_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_requestDto_21_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	      											}
            	      											set(
            	      												current,
            	      												"requestDto",
            	      												lv_requestDto_21_0,
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
            	    // InternalMoba.g:3662:4: ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3662:4: ({...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3663:5: {...}? => ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4)");
            	    }
            	    // InternalMoba.g:3663:118: ( ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3664:6: ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 4);
            	    // InternalMoba.g:3667:9: ({...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3667:10: {...}? => (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3667:19: (otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3667:20: otherlv_22= 'responseDto' otherlv_23= '=' ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_22=(Token)match(input,84,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_22, grammarAccess.getMobaRESTCustomServiceAccess().getResponseDtoKeyword_6_4_0());
            	      								
            	    }
            	    otherlv_23=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_23, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_4_1());
            	      								
            	    }
            	    // InternalMoba.g:3675:9: ( (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3676:10: (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3676:10: (lv_responseDto_24_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3677:11: lv_responseDto_24_0= ruleMobaRESTPayloadDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getResponseDtoMobaRESTPayloadDefinitionParserRuleCall_6_4_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_responseDto_24_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	      											}
            	      											set(
            	      												current,
            	      												"responseDto",
            	      												lv_responseDto_24_0,
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
            	    // InternalMoba.g:3700:4: ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3700:4: ({...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) ) )
            	    // InternalMoba.g:3701:5: {...}? => ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5)");
            	    }
            	    // InternalMoba.g:3701:118: ( ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) ) )
            	    // InternalMoba.g:3702:6: ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 5);
            	    // InternalMoba.g:3705:9: ({...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) ) )
            	    // InternalMoba.g:3705:10: {...}? => (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3705:19: (otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) ) )
            	    // InternalMoba.g:3705:20: otherlv_25= 'errorDto' otherlv_26= '=' ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) )
            	    {
            	    otherlv_25=(Token)match(input,85,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_25, grammarAccess.getMobaRESTCustomServiceAccess().getErrorDtoKeyword_6_5_0());
            	      								
            	    }
            	    otherlv_26=(Token)match(input,21,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_26, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_5_1());
            	      								
            	    }
            	    // InternalMoba.g:3713:9: ( (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition ) )
            	    // InternalMoba.g:3714:10: (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition )
            	    {
            	    // InternalMoba.g:3714:10: (lv_errorDto_27_0= ruleMobaRESTPayloadDefinition )
            	    // InternalMoba.g:3715:11: lv_errorDto_27_0= ruleMobaRESTPayloadDefinition
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getErrorDtoMobaRESTPayloadDefinitionParserRuleCall_6_5_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_errorDto_27_0=ruleMobaRESTPayloadDefinition();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	      											}
            	      											set(
            	      												current,
            	      												"errorDto",
            	      												lv_errorDto_27_0,
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
            	case 7 :
            	    // InternalMoba.g:3738:4: ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3738:4: ({...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) ) )
            	    // InternalMoba.g:3739:5: {...}? => ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 6)");
            	    }
            	    // InternalMoba.g:3739:118: ( ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) ) )
            	    // InternalMoba.g:3740:6: ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6(), 6);
            	    // InternalMoba.g:3743:9: ({...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) ) )
            	    // InternalMoba.g:3743:10: {...}? => (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTCustomService", "true");
            	    }
            	    // InternalMoba.g:3743:19: (otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) ) )
            	    // InternalMoba.g:3743:20: otherlv_28= 'method' otherlv_29= '=' ( (lv_operation_30_0= ruleMobaRESTMethods ) )
            	    {
            	    otherlv_28=(Token)match(input,86,FOLLOW_6); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_28, grammarAccess.getMobaRESTCustomServiceAccess().getMethodKeyword_6_6_0());
            	      								
            	    }
            	    otherlv_29=(Token)match(input,21,FOLLOW_63); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_29, grammarAccess.getMobaRESTCustomServiceAccess().getEqualsSignKeyword_6_6_1());
            	      								
            	    }
            	    // InternalMoba.g:3751:9: ( (lv_operation_30_0= ruleMobaRESTMethods ) )
            	    // InternalMoba.g:3752:10: (lv_operation_30_0= ruleMobaRESTMethods )
            	    {
            	    // InternalMoba.g:3752:10: (lv_operation_30_0= ruleMobaRESTMethods )
            	    // InternalMoba.g:3753:11: lv_operation_30_0= ruleMobaRESTMethods
            	    {
            	    if ( state.backtracking==0 ) {

            	      											newCompositeNode(grammarAccess.getMobaRESTCustomServiceAccess().getOperationMobaRESTMethodsEnumRuleCall_6_6_2_0());
            	      										
            	    }
            	    pushFollow(FOLLOW_61);
            	    lv_operation_30_0=ruleMobaRESTMethods();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElementForParent(grammarAccess.getMobaRESTCustomServiceRule());
            	      											}
            	      											set(
            	      												current,
            	      												"operation",
            	      												lv_operation_30_0,
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
            	    break loop62;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaRESTCustomServiceAccess().getUnorderedGroup_6());

            }

            otherlv_31=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_31, grammarAccess.getMobaRESTCustomServiceAccess().getRightCurlyBracketKeyword_7());
              		
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
    // InternalMoba.g:3791:1: entryRuleMobaRESTPayloadDefinition returns [EObject current=null] : iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF ;
    public final EObject entryRuleMobaRESTPayloadDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTPayloadDefinition = null;


        try {
            // InternalMoba.g:3791:66: (iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF )
            // InternalMoba.g:3792:2: iv_ruleMobaRESTPayloadDefinition= ruleMobaRESTPayloadDefinition EOF
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
    // InternalMoba.g:3798:1: ruleMobaRESTPayloadDefinition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleMobaRESTPayloadDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_array_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalMoba.g:3804:2: ( ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) ) )
            // InternalMoba.g:3805:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) )
            {
            // InternalMoba.g:3805:2: ( ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) ) )
            // InternalMoba.g:3806:3: ( (otherlv_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) )
            {
            // InternalMoba.g:3806:3: ( (otherlv_0= RULE_ID ) )
            // InternalMoba.g:3807:4: (otherlv_0= RULE_ID )
            {
            // InternalMoba.g:3807:4: (otherlv_0= RULE_ID )
            // InternalMoba.g:3808:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_64); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getMobaRESTPayloadDefinitionAccess().getDtoMobaDtoCrossReference_0_0());
              				
            }

            }


            }

            // InternalMoba.g:3819:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) ) )
            // InternalMoba.g:3820:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:3820:4: ( ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* ) )
            // InternalMoba.g:3821:5: ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1());
            // InternalMoba.g:3824:5: ( ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )* )
            // InternalMoba.g:3825:6: ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )*
            {
            // InternalMoba.g:3825:6: ( ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) ) )*
            loop63:
            do {
                int alt63=3;
                int LA63_0 = input.LA(1);

                if ( LA63_0 == 45 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0) ) {
                    alt63=1;
                }
                else if ( LA63_0 == 87 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1) ) {
                    alt63=2;
                }


                switch (alt63) {
            	case 1 :
            	    // InternalMoba.g:3826:4: ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) )
            	    {
            	    // InternalMoba.g:3826:4: ({...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) ) )
            	    // InternalMoba.g:3827:5: {...}? => ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:3827:122: ( ({...}? => ( (lv_array_2_0= 'isArray' ) ) ) )
            	    // InternalMoba.g:3828:6: ({...}? => ( (lv_array_2_0= 'isArray' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:3831:9: ({...}? => ( (lv_array_2_0= 'isArray' ) ) )
            	    // InternalMoba.g:3831:10: {...}? => ( (lv_array_2_0= 'isArray' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "true");
            	    }
            	    // InternalMoba.g:3831:19: ( (lv_array_2_0= 'isArray' ) )
            	    // InternalMoba.g:3831:20: (lv_array_2_0= 'isArray' )
            	    {
            	    // InternalMoba.g:3831:20: (lv_array_2_0= 'isArray' )
            	    // InternalMoba.g:3832:10: lv_array_2_0= 'isArray'
            	    {
            	    lv_array_2_0=(Token)match(input,45,FOLLOW_64); if (state.failed) return current;
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
            	    // InternalMoba.g:3849:4: ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) )
            	    {
            	    // InternalMoba.g:3849:4: ({...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) ) )
            	    // InternalMoba.g:3850:5: {...}? => ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:3850:122: ( ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) ) )
            	    // InternalMoba.g:3851:6: ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaRESTPayloadDefinitionAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:3854:9: ({...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) ) )
            	    // InternalMoba.g:3854:10: {...}? => (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaRESTPayloadDefinition", "true");
            	    }
            	    // InternalMoba.g:3854:19: (otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) ) )
            	    // InternalMoba.g:3854:20: otherlv_3= 'as' ( (otherlv_4= RULE_CONSTANT ) )
            	    {
            	    otherlv_3=(Token)match(input,87,FOLLOW_17); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_3, grammarAccess.getMobaRESTPayloadDefinitionAccess().getAsKeyword_1_1_0());
            	      								
            	    }
            	    // InternalMoba.g:3858:9: ( (otherlv_4= RULE_CONSTANT ) )
            	    // InternalMoba.g:3859:10: (otherlv_4= RULE_CONSTANT )
            	    {
            	    // InternalMoba.g:3859:10: (otherlv_4= RULE_CONSTANT )
            	    // InternalMoba.g:3860:11: otherlv_4= RULE_CONSTANT
            	    {
            	    if ( state.backtracking==0 ) {

            	      											if (current==null) {
            	      												current = createModelElement(grammarAccess.getMobaRESTPayloadDefinitionRule());
            	      											}
            	      										
            	    }
            	    otherlv_4=(Token)match(input,RULE_CONSTANT,FOLLOW_64); if (state.failed) return current;
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
            	    break loop63;
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
    // InternalMoba.g:3888:1: entryRuleMobaRestParameter returns [EObject current=null] : iv_ruleMobaRestParameter= ruleMobaRestParameter EOF ;
    public final EObject entryRuleMobaRestParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestParameter = null;


        try {
            // InternalMoba.g:3888:58: (iv_ruleMobaRestParameter= ruleMobaRestParameter EOF )
            // InternalMoba.g:3889:2: iv_ruleMobaRestParameter= ruleMobaRestParameter EOF
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
    // InternalMoba.g:3895:1: ruleMobaRestParameter returns [EObject current=null] : (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) ;
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
            // InternalMoba.g:3901:2: ( (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) )
            // InternalMoba.g:3902:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            {
            // InternalMoba.g:3902:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            // InternalMoba.g:3903:3: otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            {
            otherlv_0=(Token)match(input,88,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRestParameterAccess().getParamKeyword_0());
              		
            }
            // InternalMoba.g:3907:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:3908:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:3908:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:3909:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRestParameterRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getMobaRestParameterAccess().getTypeMobaDataTypeCrossReference_1_0());
              				
            }

            }


            }

            // InternalMoba.g:3920:3: ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==RULE_ID) && (synpred1_InternalMoba())) {
                alt64=1;
            }
            else if ( (LA64_0==RULE_CONSTANT) ) {
                alt64=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;
            }
            switch (alt64) {
                case 1 :
                    // InternalMoba.g:3921:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    {
                    // InternalMoba.g:3921:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    // InternalMoba.g:3922:5: ( RULE_ID )=> (lv_nameString_2_0= RULE_ID )
                    {
                    // InternalMoba.g:3923:5: (lv_nameString_2_0= RULE_ID )
                    // InternalMoba.g:3924:6: lv_nameString_2_0= RULE_ID
                    {
                    lv_nameString_2_0=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
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
                    // InternalMoba.g:3941:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:3941:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:3942:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:3942:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:3943:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRestParameterRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaRestParameterAccess().getNameConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:3955:3: (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==21) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalMoba.g:3956:4: otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaRestParameterAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:3960:4: ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    int alt65=4;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt65=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt65=2;
                        }
                        break;
                    case RULE_DOUBLE:
                        {
                        alt65=3;
                        }
                        break;
                    case RULE_CONSTANT:
                        {
                        alt65=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 0, input);

                        throw nvae;
                    }

                    switch (alt65) {
                        case 1 :
                            // InternalMoba.g:3961:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:3961:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            // InternalMoba.g:3962:6: (lv_valueString_5_0= RULE_STRING )
                            {
                            // InternalMoba.g:3962:6: (lv_valueString_5_0= RULE_STRING )
                            // InternalMoba.g:3963:7: lv_valueString_5_0= RULE_STRING
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
                              								"org.mobadsl.grammar.Moba.STRING");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:3980:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            {
                            // InternalMoba.g:3980:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            // InternalMoba.g:3981:6: (lv_valueInt_6_0= RULE_INT )
                            {
                            // InternalMoba.g:3981:6: (lv_valueInt_6_0= RULE_INT )
                            // InternalMoba.g:3982:7: lv_valueInt_6_0= RULE_INT
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
                            // InternalMoba.g:3999:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            {
                            // InternalMoba.g:3999:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            // InternalMoba.g:4000:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            {
                            // InternalMoba.g:4000:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            // InternalMoba.g:4001:7: lv_valueDouble_7_0= RULE_DOUBLE
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
                            // InternalMoba.g:4018:5: ( (otherlv_8= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4018:5: ( (otherlv_8= RULE_CONSTANT ) )
                            // InternalMoba.g:4019:6: (otherlv_8= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4019:6: (otherlv_8= RULE_CONSTANT )
                            // InternalMoba.g:4020:7: otherlv_8= RULE_CONSTANT
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
    // InternalMoba.g:4037:1: entryRuleMobaRestHeader returns [EObject current=null] : iv_ruleMobaRestHeader= ruleMobaRestHeader EOF ;
    public final EObject entryRuleMobaRestHeader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRestHeader = null;


        try {
            // InternalMoba.g:4037:55: (iv_ruleMobaRestHeader= ruleMobaRestHeader EOF )
            // InternalMoba.g:4038:2: iv_ruleMobaRestHeader= ruleMobaRestHeader EOF
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
    // InternalMoba.g:4044:1: ruleMobaRestHeader returns [EObject current=null] : (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) ;
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
            // InternalMoba.g:4050:2: ( (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? ) )
            // InternalMoba.g:4051:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            {
            // InternalMoba.g:4051:2: (otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )? )
            // InternalMoba.g:4052:3: otherlv_0= 'param' ( (otherlv_1= RULE_ID ) ) ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            {
            otherlv_0=(Token)match(input,88,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRestHeaderAccess().getParamKeyword_0());
              		
            }
            // InternalMoba.g:4056:3: ( (otherlv_1= RULE_ID ) )
            // InternalMoba.g:4057:4: (otherlv_1= RULE_ID )
            {
            // InternalMoba.g:4057:4: (otherlv_1= RULE_ID )
            // InternalMoba.g:4058:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaRestHeaderRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_65); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getMobaRestHeaderAccess().getTypeMobaDataTypeCrossReference_1_0());
              				
            }

            }


            }

            // InternalMoba.g:4069:3: ( ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==RULE_ID) && (synpred2_InternalMoba())) {
                alt67=1;
            }
            else if ( (LA67_0==RULE_CONSTANT) ) {
                alt67=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 67, 0, input);

                throw nvae;
            }
            switch (alt67) {
                case 1 :
                    // InternalMoba.g:4070:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    {
                    // InternalMoba.g:4070:4: ( ( RULE_ID )=> (lv_nameString_2_0= RULE_ID ) )
                    // InternalMoba.g:4071:5: ( RULE_ID )=> (lv_nameString_2_0= RULE_ID )
                    {
                    // InternalMoba.g:4072:5: (lv_nameString_2_0= RULE_ID )
                    // InternalMoba.g:4073:6: lv_nameString_2_0= RULE_ID
                    {
                    lv_nameString_2_0=(Token)match(input,RULE_ID,FOLLOW_66); if (state.failed) return current;
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
                    // InternalMoba.g:4090:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:4090:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:4091:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:4091:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:4092:6: otherlv_3= RULE_CONSTANT
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getMobaRestHeaderRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_CONSTANT,FOLLOW_66); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getMobaRestHeaderAccess().getNameConstMobaConstantCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalMoba.g:4104:3: (otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==21) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalMoba.g:4105:4: otherlv_4= '=' ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    {
                    otherlv_4=(Token)match(input,21,FOLLOW_40); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getMobaRestHeaderAccess().getEqualsSignKeyword_3_0());
                      			
                    }
                    // InternalMoba.g:4109:4: ( ( (lv_valueString_5_0= RULE_STRING ) ) | ( (lv_valueInt_6_0= RULE_INT ) ) | ( (lv_valueDouble_7_0= RULE_DOUBLE ) ) | ( (otherlv_8= RULE_CONSTANT ) ) )
                    int alt68=4;
                    switch ( input.LA(1) ) {
                    case RULE_STRING:
                        {
                        alt68=1;
                        }
                        break;
                    case RULE_INT:
                        {
                        alt68=2;
                        }
                        break;
                    case RULE_DOUBLE:
                        {
                        alt68=3;
                        }
                        break;
                    case RULE_CONSTANT:
                        {
                        alt68=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 68, 0, input);

                        throw nvae;
                    }

                    switch (alt68) {
                        case 1 :
                            // InternalMoba.g:4110:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4110:5: ( (lv_valueString_5_0= RULE_STRING ) )
                            // InternalMoba.g:4111:6: (lv_valueString_5_0= RULE_STRING )
                            {
                            // InternalMoba.g:4111:6: (lv_valueString_5_0= RULE_STRING )
                            // InternalMoba.g:4112:7: lv_valueString_5_0= RULE_STRING
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
                              								"org.mobadsl.grammar.Moba.STRING");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4129:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            {
                            // InternalMoba.g:4129:5: ( (lv_valueInt_6_0= RULE_INT ) )
                            // InternalMoba.g:4130:6: (lv_valueInt_6_0= RULE_INT )
                            {
                            // InternalMoba.g:4130:6: (lv_valueInt_6_0= RULE_INT )
                            // InternalMoba.g:4131:7: lv_valueInt_6_0= RULE_INT
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
                            // InternalMoba.g:4148:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            {
                            // InternalMoba.g:4148:5: ( (lv_valueDouble_7_0= RULE_DOUBLE ) )
                            // InternalMoba.g:4149:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            {
                            // InternalMoba.g:4149:6: (lv_valueDouble_7_0= RULE_DOUBLE )
                            // InternalMoba.g:4150:7: lv_valueDouble_7_0= RULE_DOUBLE
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
                            // InternalMoba.g:4167:5: ( (otherlv_8= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4167:5: ( (otherlv_8= RULE_CONSTANT ) )
                            // InternalMoba.g:4168:6: (otherlv_8= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4168:6: (otherlv_8= RULE_CONSTANT )
                            // InternalMoba.g:4169:7: otherlv_8= RULE_CONSTANT
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
    // InternalMoba.g:4186:1: entryRuleMobaRESTCrud returns [EObject current=null] : iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF ;
    public final EObject entryRuleMobaRESTCrud() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTCrud = null;


        try {
            // InternalMoba.g:4186:53: (iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF )
            // InternalMoba.g:4187:2: iv_ruleMobaRESTCrud= ruleMobaRESTCrud EOF
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
    // InternalMoba.g:4193:1: ruleMobaRESTCrud returns [EObject current=null] : (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaRESTCrud() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject this_MobaFriendsAble_4 = null;



        	enterRule();

        try {
            // InternalMoba.g:4199:2: ( (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4200:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4200:2: (otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4201:3: otherlv_0= 'restCrud' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,89,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRESTCrudAccess().getRestCrudKeyword_0());
              		
            }
            // InternalMoba.g:4205:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:4206:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:4206:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:4207:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_67); if (state.failed) return current;
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

            // InternalMoba.g:4223:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==30) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // InternalMoba.g:4224:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaRESTCrudAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:4228:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4229:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4229:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4230:6: otherlv_3= RULE_ID
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
    // InternalMoba.g:4257:1: entryRuleMobaRESTWorkflow returns [EObject current=null] : iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF ;
    public final EObject entryRuleMobaRESTWorkflow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRESTWorkflow = null;


        try {
            // InternalMoba.g:4257:57: (iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF )
            // InternalMoba.g:4258:2: iv_ruleMobaRESTWorkflow= ruleMobaRESTWorkflow EOF
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
    // InternalMoba.g:4264:1: ruleMobaRESTWorkflow returns [EObject current=null] : (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) ;
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
            // InternalMoba.g:4270:2: ( (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' ) )
            // InternalMoba.g:4271:2: (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            {
            // InternalMoba.g:4271:2: (otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}' )
            // InternalMoba.g:4272:3: otherlv_0= 'restWorkflow' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )? this_MobaFriendsAble_4= ruleMobaFriendsAble[$current] otherlv_5= '{' (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )* otherlv_8= '}'
            {
            otherlv_0=(Token)match(input,90,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRESTWorkflowAccess().getRestWorkflowKeyword_0());
              		
            }
            // InternalMoba.g:4276:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:4277:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:4277:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:4278:5: lv_name_1_0= RULE_ID
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

            // InternalMoba.g:4294:3: (otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==30) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // InternalMoba.g:4295:4: otherlv_2= 'extends' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,30,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaRESTWorkflowAccess().getExtendsKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:4299:4: ( (otherlv_3= RULE_ID ) )
                    // InternalMoba.g:4300:5: (otherlv_3= RULE_ID )
                    {
                    // InternalMoba.g:4300:5: (otherlv_3= RULE_ID )
                    // InternalMoba.g:4301:6: otherlv_3= RULE_ID
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
            otherlv_5=(Token)match(input,22,FOLLOW_68); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getMobaRESTWorkflowAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalMoba.g:4328:3: (otherlv_6= 'service' ( (otherlv_7= RULE_ID ) ) )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==91) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // InternalMoba.g:4329:4: otherlv_6= 'service' ( (otherlv_7= RULE_ID ) )
            	    {
            	    otherlv_6=(Token)match(input,91,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_6, grammarAccess.getMobaRESTWorkflowAccess().getServiceKeyword_5_0());
            	      			
            	    }
            	    // InternalMoba.g:4333:4: ( (otherlv_7= RULE_ID ) )
            	    // InternalMoba.g:4334:5: (otherlv_7= RULE_ID )
            	    {
            	    // InternalMoba.g:4334:5: (otherlv_7= RULE_ID )
            	    // InternalMoba.g:4335:6: otherlv_7= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getMobaRESTWorkflowRule());
            	      						}
            	      					
            	    }
            	    otherlv_7=(Token)match(input,RULE_ID,FOLLOW_68); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_7, grammarAccess.getMobaRESTWorkflowAccess().getServicesMobaRESTCrossReference_5_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop72;
                }
            } while (true);

            otherlv_8=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:4355:1: entryRuleMobaEntityFeature returns [EObject current=null] : iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF ;
    public final EObject entryRuleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityFeature = null;


        try {
            // InternalMoba.g:4355:58: (iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF )
            // InternalMoba.g:4356:2: iv_ruleMobaEntityFeature= ruleMobaEntityFeature EOF
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
    // InternalMoba.g:4362:1: ruleMobaEntityFeature returns [EObject current=null] : (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable ) ;
    public final EObject ruleMobaEntityFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaEntityAttribute_0 = null;

        EObject this_MobaEntityReference_1 = null;

        EObject this_MobaEntityEmbeddable_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:4368:2: ( (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable ) )
            // InternalMoba.g:4369:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable )
            {
            // InternalMoba.g:4369:2: (this_MobaEntityAttribute_0= ruleMobaEntityAttribute | this_MobaEntityReference_1= ruleMobaEntityReference | this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable )
            int alt73=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt73=1;
                }
                break;
            case 100:
                {
                alt73=2;
                }
                break;
            case 102:
                {
                alt73=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }

            switch (alt73) {
                case 1 :
                    // InternalMoba.g:4370:3: this_MobaEntityAttribute_0= ruleMobaEntityAttribute
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
                    // InternalMoba.g:4379:3: this_MobaEntityReference_1= ruleMobaEntityReference
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
                    // InternalMoba.g:4388:3: this_MobaEntityEmbeddable_2= ruleMobaEntityEmbeddable
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
    // InternalMoba.g:4400:1: entryRuleMobaEntityAttribute returns [EObject current=null] : iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF ;
    public final EObject entryRuleMobaEntityAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityAttribute = null;


        try {
            // InternalMoba.g:4400:60: (iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF )
            // InternalMoba.g:4401:2: iv_ruleMobaEntityAttribute= ruleMobaEntityAttribute EOF
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
    // InternalMoba.g:4407:1: ruleMobaEntityAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:4413:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4414:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4414:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4415:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,92,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityAttributeAccess().getVarKeyword_0());
              		
            }
            // InternalMoba.g:4419:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:4420:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:4420:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:4421:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());
            // InternalMoba.g:4424:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:4425:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:4425:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop75:
            do {
                int alt75=6;
                int LA75_0 = input.LA(1);

                if ( LA75_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt75=1;
                }
                else if ( LA75_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt75=2;
                }
                else if ( LA75_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt75=3;
                }
                else if ( LA75_0 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt75=4;
                }
                else if ( LA75_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt75=5;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalMoba.g:4426:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4426:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:4427:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4427:116: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:4428:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:4431:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:4431:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4431:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:4431:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:4431:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:4432:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,93,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:4449:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4449:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:4450:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4450:116: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:4451:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:4454:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:4454:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4454:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:4454:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:4454:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:4455:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,94,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:4472:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4472:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:4473:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:4473:116: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:4474:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:4477:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:4477:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4477:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:4477:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:4477:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:4478:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,95,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:4495:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4495:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:4496:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:4496:116: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:4497:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 3);
            	    // InternalMoba.g:4500:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:4500:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4500:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:4500:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:4500:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:4501:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,96,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:4518:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:4518:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:4519:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:4519:116: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:4520:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1(), 4);
            	    // InternalMoba.g:4523:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:4523:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityAttribute", "true");
            	    }
            	    // InternalMoba.g:4523:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:4523:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaEntityAttributeAccess().getConstraintsKeyword_1_4_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaEntityAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	      								
            	    }
            	    // InternalMoba.g:4531:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:4532:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:4532:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:4533:11: lv_constraints_8_0= ruleMobaConstraint
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

            	    // InternalMoba.g:4550:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop74:
            	    do {
            	        int alt74=2;
            	        int LA74_0 = input.LA(1);

            	        if ( (LA74_0==34) ) {
            	            alt74=1;
            	        }


            	        switch (alt74) {
            	    	case 1 :
            	    	    // InternalMoba.g:4551:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaEntityAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:4555:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:4556:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:4556:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:4557:12: lv_constraints_10_0= ruleMobaConstraint
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
            	    	    break loop74;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,35,FOLLOW_69); if (state.failed) return current;
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
            	    break loop75;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityAttributeAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:4592:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:4593:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:4593:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:4594:5: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityAttributeRule());
              					}
              				
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            // InternalMoba.g:4616:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:4617:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:4617:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:4618:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
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

            // InternalMoba.g:4634:3: (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==97) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // InternalMoba.g:4635:4: otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')'
                    {
                    otherlv_15=(Token)match(input,97,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getMobaEntityAttributeAccess().getFormatKeyword_5_0());
                      			
                    }
                    otherlv_16=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getMobaEntityAttributeAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMoba.g:4643:4: ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) )
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==RULE_STRING) ) {
                        alt76=1;
                    }
                    else if ( (LA76_0==RULE_CONSTANT) ) {
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
                            // InternalMoba.g:4644:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4644:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            // InternalMoba.g:4645:6: (lv_formatString_17_0= RULE_STRING )
                            {
                            // InternalMoba.g:4645:6: (lv_formatString_17_0= RULE_STRING )
                            // InternalMoba.g:4646:7: lv_formatString_17_0= RULE_STRING
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
                              								"org.mobadsl.grammar.Moba.STRING");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4663:5: ( (otherlv_18= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4663:5: ( (otherlv_18= RULE_CONSTANT ) )
                            // InternalMoba.g:4664:6: (otherlv_18= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4664:6: (otherlv_18= RULE_CONSTANT )
                            // InternalMoba.g:4665:7: otherlv_18= RULE_CONSTANT
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

                    otherlv_19=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
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
    // InternalMoba.g:4697:1: entryRuleMobaSettingsFeature returns [EObject current=null] : iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF ;
    public final EObject entryRuleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsFeature = null;


        try {
            // InternalMoba.g:4697:60: (iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF )
            // InternalMoba.g:4698:2: iv_ruleMobaSettingsFeature= ruleMobaSettingsFeature EOF
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
    // InternalMoba.g:4704:1: ruleMobaSettingsFeature returns [EObject current=null] : (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference ) ;
    public final EObject ruleMobaSettingsFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaSettingsAttribute_0 = null;

        EObject this_MobaSettingsEntityReference_1 = null;



        	enterRule();

        try {
            // InternalMoba.g:4710:2: ( (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference ) )
            // InternalMoba.g:4711:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference )
            {
            // InternalMoba.g:4711:2: (this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute | this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==92) ) {
                alt78=1;
            }
            else if ( (LA78_0==98) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }
            switch (alt78) {
                case 1 :
                    // InternalMoba.g:4712:3: this_MobaSettingsAttribute_0= ruleMobaSettingsAttribute
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
                    // InternalMoba.g:4721:3: this_MobaSettingsEntityReference_1= ruleMobaSettingsEntityReference
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
    // InternalMoba.g:4733:1: entryRuleMobaSettingsAttribute returns [EObject current=null] : iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF ;
    public final EObject entryRuleMobaSettingsAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsAttribute = null;


        try {
            // InternalMoba.g:4733:62: (iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF )
            // InternalMoba.g:4734:2: iv_ruleMobaSettingsAttribute= ruleMobaSettingsAttribute EOF
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
    // InternalMoba.g:4740:1: ruleMobaSettingsAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:4746:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:4747:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:4747:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:4748:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )? this_MobaFriendsAble_20= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,92,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsAttributeAccess().getVarKeyword_0());
              		
            }
            // InternalMoba.g:4752:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:4753:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:4753:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:4754:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());
            // InternalMoba.g:4757:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:4758:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:4758:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop80:
            do {
                int alt80=6;
                int LA80_0 = input.LA(1);

                if ( LA80_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt80=1;
                }
                else if ( LA80_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt80=2;
                }
                else if ( LA80_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt80=3;
                }
                else if ( LA80_0 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt80=4;
                }
                else if ( LA80_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt80=5;
                }


                switch (alt80) {
            	case 1 :
            	    // InternalMoba.g:4759:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4759:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:4760:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:4760:118: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:4761:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:4764:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:4764:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4764:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:4764:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:4764:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:4765:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,93,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:4782:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4782:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:4783:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:4783:118: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:4784:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:4787:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:4787:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4787:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:4787:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:4787:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:4788:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,94,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:4805:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4805:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:4806:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:4806:118: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:4807:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:4810:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:4810:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4810:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:4810:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:4810:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:4811:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,95,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:4828:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:4828:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:4829:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:4829:118: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:4830:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 3);
            	    // InternalMoba.g:4833:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:4833:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4833:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:4833:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:4833:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:4834:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,96,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:4851:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:4851:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:4852:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:4852:118: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:4853:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1(), 4);
            	    // InternalMoba.g:4856:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:4856:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsAttribute", "true");
            	    }
            	    // InternalMoba.g:4856:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:4856:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaSettingsAttributeAccess().getConstraintsKeyword_1_4_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	      								
            	    }
            	    // InternalMoba.g:4864:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:4865:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:4865:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:4866:11: lv_constraints_8_0= ruleMobaConstraint
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

            	    // InternalMoba.g:4883:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop79:
            	    do {
            	        int alt79=2;
            	        int LA79_0 = input.LA(1);

            	        if ( (LA79_0==34) ) {
            	            alt79=1;
            	        }


            	        switch (alt79) {
            	    	case 1 :
            	    	    // InternalMoba.g:4884:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaSettingsAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:4888:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:4889:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:4889:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:4890:12: lv_constraints_10_0= ruleMobaConstraint
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
            	    	    break loop79;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,35,FOLLOW_69); if (state.failed) return current;
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
            	    break loop80;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsAttributeAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:4925:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:4926:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:4926:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:4927:5: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaSettingsAttributeRule());
              					}
              				
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            // InternalMoba.g:4949:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:4950:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:4950:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:4951:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_71); if (state.failed) return current;
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

            // InternalMoba.g:4967:3: (otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')' )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==97) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // InternalMoba.g:4968:4: otherlv_15= 'format' otherlv_16= '(' ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) ) otherlv_19= ')'
                    {
                    otherlv_15=(Token)match(input,97,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getMobaSettingsAttributeAccess().getFormatKeyword_5_0());
                      			
                    }
                    otherlv_16=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_16, grammarAccess.getMobaSettingsAttributeAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMoba.g:4976:4: ( ( (lv_formatString_17_0= RULE_STRING ) ) | ( (otherlv_18= RULE_CONSTANT ) ) )
                    int alt81=2;
                    int LA81_0 = input.LA(1);

                    if ( (LA81_0==RULE_STRING) ) {
                        alt81=1;
                    }
                    else if ( (LA81_0==RULE_CONSTANT) ) {
                        alt81=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 81, 0, input);

                        throw nvae;
                    }
                    switch (alt81) {
                        case 1 :
                            // InternalMoba.g:4977:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            {
                            // InternalMoba.g:4977:5: ( (lv_formatString_17_0= RULE_STRING ) )
                            // InternalMoba.g:4978:6: (lv_formatString_17_0= RULE_STRING )
                            {
                            // InternalMoba.g:4978:6: (lv_formatString_17_0= RULE_STRING )
                            // InternalMoba.g:4979:7: lv_formatString_17_0= RULE_STRING
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
                              								"org.mobadsl.grammar.Moba.STRING");
                              						
                            }

                            }


                            }


                            }
                            break;
                        case 2 :
                            // InternalMoba.g:4996:5: ( (otherlv_18= RULE_CONSTANT ) )
                            {
                            // InternalMoba.g:4996:5: ( (otherlv_18= RULE_CONSTANT ) )
                            // InternalMoba.g:4997:6: (otherlv_18= RULE_CONSTANT )
                            {
                            // InternalMoba.g:4997:6: (otherlv_18= RULE_CONSTANT )
                            // InternalMoba.g:4998:7: otherlv_18= RULE_CONSTANT
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

                    otherlv_19=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
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
    // InternalMoba.g:5030:1: entryRuleMobaSettingsEntityReference returns [EObject current=null] : iv_ruleMobaSettingsEntityReference= ruleMobaSettingsEntityReference EOF ;
    public final EObject entryRuleMobaSettingsEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSettingsEntityReference = null;


        try {
            // InternalMoba.g:5030:68: (iv_ruleMobaSettingsEntityReference= ruleMobaSettingsEntityReference EOF )
            // InternalMoba.g:5031:2: iv_ruleMobaSettingsEntityReference= ruleMobaSettingsEntityReference EOF
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
    // InternalMoba.g:5037:1: ruleMobaSettingsEntityReference returns [EObject current=null] : (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:5043:2: ( (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5044:2: (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5044:2: (otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5045:3: otherlv_0= 'refEntity' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,98,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaSettingsEntityReferenceAccess().getRefEntityKeyword_0());
              		
            }
            // InternalMoba.g:5049:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:5050:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:5050:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:5051:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:5054:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:5055:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:5055:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop83:
            do {
                int alt83=4;
                int LA83_0 = input.LA(1);

                if ( LA83_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt83=1;
                }
                else if ( LA83_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt83=2;
                }
                else if ( LA83_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt83=3;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalMoba.g:5056:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5056:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:5057:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5057:124: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:5058:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:5061:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:5061:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "true");
            	    }
            	    // InternalMoba.g:5061:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:5061:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:5061:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:5062:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,99,FOLLOW_72); if (state.failed) return current;
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
            	    // InternalMoba.g:5079:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5079:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5080:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5080:124: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5081:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:5084:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:5084:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "true");
            	    }
            	    // InternalMoba.g:5084:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:5084:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5084:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:5085:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,93,FOLLOW_72); if (state.failed) return current;
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
            	    // InternalMoba.g:5102:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5102:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5103:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5103:124: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5104:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:5107:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:5107:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaSettingsEntityReference", "true");
            	    }
            	    // InternalMoba.g:5107:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:5107:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:5107:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:5108:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,94,FOLLOW_72); if (state.failed) return current;
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
            	    break loop83;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaSettingsEntityReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5132:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:5133:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:5133:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:5134:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaSettingsEntityReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            // InternalMoba.g:5156:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:5157:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:5157:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:5158:5: lv_name_7_0= RULE_ID
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
    // InternalMoba.g:5190:1: ruleMobaMultiplicityAble[EObject in_current] returns [EObject current=in_current] : ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? ;
    public final EObject ruleMobaMultiplicityAble(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        EObject lv_multiplicity_0_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:5196:2: ( ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )? )
            // InternalMoba.g:5197:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            {
            // InternalMoba.g:5197:2: ( (lv_multiplicity_0_0= ruleMobaMuliplicity ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==65) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalMoba.g:5198:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    {
                    // InternalMoba.g:5198:3: (lv_multiplicity_0_0= ruleMobaMuliplicity )
                    // InternalMoba.g:5199:4: lv_multiplicity_0_0= ruleMobaMuliplicity
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
    // InternalMoba.g:5219:1: entryRuleMobaEntityReference returns [EObject current=null] : iv_ruleMobaEntityReference= ruleMobaEntityReference EOF ;
    public final EObject entryRuleMobaEntityReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityReference = null;


        try {
            // InternalMoba.g:5219:60: (iv_ruleMobaEntityReference= ruleMobaEntityReference EOF )
            // InternalMoba.g:5220:2: iv_ruleMobaEntityReference= ruleMobaEntityReference EOF
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
    // InternalMoba.g:5226:1: ruleMobaEntityReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:5232:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5233:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5233:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5234:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )? this_MobaFriendsAble_10= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,100,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityReferenceAccess().getRefKeyword_0());
              		
            }
            // InternalMoba.g:5238:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:5239:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:5239:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:5240:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:5243:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:5244:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:5244:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop85:
            do {
                int alt85=4;
                int LA85_0 = input.LA(1);

                if ( LA85_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt85=1;
                }
                else if ( LA85_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt85=2;
                }
                else if ( LA85_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt85=3;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalMoba.g:5245:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5245:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:5246:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5246:116: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:5247:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:5250:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:5250:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:5250:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:5250:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:5250:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:5251:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,99,FOLLOW_72); if (state.failed) return current;
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
            	    // InternalMoba.g:5268:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5268:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5269:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5269:116: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5270:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:5273:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:5273:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:5273:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:5273:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5273:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:5274:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,93,FOLLOW_72); if (state.failed) return current;
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
            	    // InternalMoba.g:5291:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5291:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5292:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5292:116: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5293:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:5296:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:5296:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaEntityReference", "true");
            	    }
            	    // InternalMoba.g:5296:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:5296:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:5296:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:5297:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,94,FOLLOW_72); if (state.failed) return current;
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
            	    break loop85;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaEntityReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5321:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:5322:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:5322:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:5323:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            // InternalMoba.g:5345:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:5346:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:5346:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:5347:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_73); if (state.failed) return current;
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

            // InternalMoba.g:5363:3: (otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) ) )?
            int alt86=2;
            int LA86_0 = input.LA(1);

            if ( (LA86_0==101) ) {
                alt86=1;
            }
            switch (alt86) {
                case 1 :
                    // InternalMoba.g:5364:4: otherlv_8= 'opposite' ( (otherlv_9= RULE_ID ) )
                    {
                    otherlv_8=(Token)match(input,101,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMobaEntityReferenceAccess().getOppositeKeyword_5_0());
                      			
                    }
                    // InternalMoba.g:5368:4: ( (otherlv_9= RULE_ID ) )
                    // InternalMoba.g:5369:5: (otherlv_9= RULE_ID )
                    {
                    // InternalMoba.g:5369:5: (otherlv_9= RULE_ID )
                    // InternalMoba.g:5370:6: otherlv_9= RULE_ID
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
    // InternalMoba.g:5397:1: entryRuleMobaEntityEmbeddable returns [EObject current=null] : iv_ruleMobaEntityEmbeddable= ruleMobaEntityEmbeddable EOF ;
    public final EObject entryRuleMobaEntityEmbeddable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEntityEmbeddable = null;


        try {
            // InternalMoba.g:5397:61: (iv_ruleMobaEntityEmbeddable= ruleMobaEntityEmbeddable EOF )
            // InternalMoba.g:5398:2: iv_ruleMobaEntityEmbeddable= ruleMobaEntityEmbeddable EOF
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
    // InternalMoba.g:5404:1: ruleMobaEntityEmbeddable returns [EObject current=null] : (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:5410:2: ( (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5411:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5411:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5412:3: otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,102,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEntityEmbeddableAccess().getEmbedKeyword_0());
              		
            }
            // InternalMoba.g:5416:3: ( (lv_transient_1_0= 'transient' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==94) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalMoba.g:5417:4: (lv_transient_1_0= 'transient' )
                    {
                    // InternalMoba.g:5417:4: (lv_transient_1_0= 'transient' )
                    // InternalMoba.g:5418:5: lv_transient_1_0= 'transient'
                    {
                    lv_transient_1_0=(Token)match(input,94,FOLLOW_4); if (state.failed) return current;
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

            // InternalMoba.g:5430:3: ( (otherlv_2= RULE_ID ) )
            // InternalMoba.g:5431:4: (otherlv_2= RULE_ID )
            {
            // InternalMoba.g:5431:4: (otherlv_2= RULE_ID )
            // InternalMoba.g:5432:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaEntityEmbeddableRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            // InternalMoba.g:5454:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMoba.g:5455:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMoba.g:5455:4: (lv_name_4_0= RULE_ID )
            // InternalMoba.g:5456:5: lv_name_4_0= RULE_ID
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
    // InternalMoba.g:5487:1: entryRuleMobaDtoFeature returns [EObject current=null] : iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF ;
    public final EObject entryRuleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoFeature = null;


        try {
            // InternalMoba.g:5487:55: (iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF )
            // InternalMoba.g:5488:2: iv_ruleMobaDtoFeature= ruleMobaDtoFeature EOF
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
    // InternalMoba.g:5494:1: ruleMobaDtoFeature returns [EObject current=null] : (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable ) ;
    public final EObject ruleMobaDtoFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaDtoAttribute_0 = null;

        EObject this_MobaDtoReference_1 = null;

        EObject this_MobaDtoEmbeddable_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:5500:2: ( (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable ) )
            // InternalMoba.g:5501:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable )
            {
            // InternalMoba.g:5501:2: (this_MobaDtoAttribute_0= ruleMobaDtoAttribute | this_MobaDtoReference_1= ruleMobaDtoReference | this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable )
            int alt88=3;
            switch ( input.LA(1) ) {
            case 92:
                {
                alt88=1;
                }
                break;
            case 100:
                {
                alt88=2;
                }
                break;
            case 102:
                {
                alt88=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;
            }

            switch (alt88) {
                case 1 :
                    // InternalMoba.g:5502:3: this_MobaDtoAttribute_0= ruleMobaDtoAttribute
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
                    // InternalMoba.g:5511:3: this_MobaDtoReference_1= ruleMobaDtoReference
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
                    // InternalMoba.g:5520:3: this_MobaDtoEmbeddable_2= ruleMobaDtoEmbeddable
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
    // InternalMoba.g:5532:1: entryRuleMobaDtoAttribute returns [EObject current=null] : iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF ;
    public final EObject entryRuleMobaDtoAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoAttribute = null;


        try {
            // InternalMoba.g:5532:57: (iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF )
            // InternalMoba.g:5533:2: iv_ruleMobaDtoAttribute= ruleMobaDtoAttribute EOF
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
    // InternalMoba.g:5539:1: ruleMobaDtoAttribute returns [EObject current=null] : (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:5545:2: ( (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5546:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5546:2: (otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5547:3: otherlv_0= 'var' ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) ) ( (otherlv_12= RULE_ID ) ) this_MobaMultiplicityAble_13= ruleMobaMultiplicityAble[$current] ( (lv_name_14_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) ) this_MobaFriendsAble_25= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,92,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoAttributeAccess().getVarKeyword_0());
              		
            }
            // InternalMoba.g:5551:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:5552:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:5552:4: ( ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* ) )
            // InternalMoba.g:5553:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());
            // InternalMoba.g:5556:5: ( ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )* )
            // InternalMoba.g:5557:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            {
            // InternalMoba.g:5557:6: ( ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) ) )*
            loop90:
            do {
                int alt90=6;
                int LA90_0 = input.LA(1);

                if ( LA90_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
                    alt90=1;
                }
                else if ( LA90_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
                    alt90=2;
                }
                else if ( LA90_0 == 95 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
                    alt90=3;
                }
                else if ( LA90_0 == 96 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
                    alt90=4;
                }
                else if ( LA90_0 == 46 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
                    alt90=5;
                }


                switch (alt90) {
            	case 1 :
            	    // InternalMoba.g:5558:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5558:4: ({...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5559:5: {...}? => ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5559:113: ( ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5560:6: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:5563:9: ({...}? => ( (lv_lazy_2_0= 'lazy' ) ) )
            	    // InternalMoba.g:5563:10: {...}? => ( (lv_lazy_2_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5563:19: ( (lv_lazy_2_0= 'lazy' ) )
            	    // InternalMoba.g:5563:20: (lv_lazy_2_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5563:20: (lv_lazy_2_0= 'lazy' )
            	    // InternalMoba.g:5564:10: lv_lazy_2_0= 'lazy'
            	    {
            	    lv_lazy_2_0=(Token)match(input,93,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:5581:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5581:4: ({...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5582:5: {...}? => ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5582:113: ( ({...}? => ( (lv_transient_3_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5583:6: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:5586:9: ({...}? => ( (lv_transient_3_0= 'transient' ) ) )
            	    // InternalMoba.g:5586:10: {...}? => ( (lv_transient_3_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5586:19: ( (lv_transient_3_0= 'transient' ) )
            	    // InternalMoba.g:5586:20: (lv_transient_3_0= 'transient' )
            	    {
            	    // InternalMoba.g:5586:20: (lv_transient_3_0= 'transient' )
            	    // InternalMoba.g:5587:10: lv_transient_3_0= 'transient'
            	    {
            	    lv_transient_3_0=(Token)match(input,94,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:5604:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5604:4: ({...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) ) )
            	    // InternalMoba.g:5605:5: {...}? => ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5605:113: ( ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) ) )
            	    // InternalMoba.g:5606:6: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:5609:9: ({...}? => ( (lv_domainKey_4_0= 'domainKey' ) ) )
            	    // InternalMoba.g:5609:10: {...}? => ( (lv_domainKey_4_0= 'domainKey' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5609:19: ( (lv_domainKey_4_0= 'domainKey' ) )
            	    // InternalMoba.g:5609:20: (lv_domainKey_4_0= 'domainKey' )
            	    {
            	    // InternalMoba.g:5609:20: (lv_domainKey_4_0= 'domainKey' )
            	    // InternalMoba.g:5610:10: lv_domainKey_4_0= 'domainKey'
            	    {
            	    lv_domainKey_4_0=(Token)match(input,95,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:5627:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5627:4: ({...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) ) )
            	    // InternalMoba.g:5628:5: {...}? => ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3)");
            	    }
            	    // InternalMoba.g:5628:113: ( ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) ) )
            	    // InternalMoba.g:5629:6: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 3);
            	    // InternalMoba.g:5632:9: ({...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) ) )
            	    // InternalMoba.g:5632:10: {...}? => ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5632:19: ( (lv_domainDescription_5_0= 'domainDescription' ) )
            	    // InternalMoba.g:5632:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    {
            	    // InternalMoba.g:5632:20: (lv_domainDescription_5_0= 'domainDescription' )
            	    // InternalMoba.g:5633:10: lv_domainDescription_5_0= 'domainDescription'
            	    {
            	    lv_domainDescription_5_0=(Token)match(input,96,FOLLOW_69); if (state.failed) return current;
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
            	    // InternalMoba.g:5650:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:5650:4: ({...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) ) )
            	    // InternalMoba.g:5651:5: {...}? => ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4)");
            	    }
            	    // InternalMoba.g:5651:113: ( ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) ) )
            	    // InternalMoba.g:5652:6: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1(), 4);
            	    // InternalMoba.g:5655:9: ({...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' ) )
            	    // InternalMoba.g:5655:10: {...}? => (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5655:19: (otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')' )
            	    // InternalMoba.g:5655:20: otherlv_6= 'constraints' otherlv_7= '(' ( (lv_constraints_8_0= ruleMobaConstraint ) ) (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )* otherlv_11= ')'
            	    {
            	    otherlv_6=(Token)match(input,46,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_6, grammarAccess.getMobaDtoAttributeAccess().getConstraintsKeyword_1_4_0());
            	      								
            	    }
            	    otherlv_7=(Token)match(input,33,FOLLOW_29); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_7, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_1_4_1());
            	      								
            	    }
            	    // InternalMoba.g:5663:9: ( (lv_constraints_8_0= ruleMobaConstraint ) )
            	    // InternalMoba.g:5664:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    {
            	    // InternalMoba.g:5664:10: (lv_constraints_8_0= ruleMobaConstraint )
            	    // InternalMoba.g:5665:11: lv_constraints_8_0= ruleMobaConstraint
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

            	    // InternalMoba.g:5682:9: (otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) ) )*
            	    loop89:
            	    do {
            	        int alt89=2;
            	        int LA89_0 = input.LA(1);

            	        if ( (LA89_0==34) ) {
            	            alt89=1;
            	        }


            	        switch (alt89) {
            	    	case 1 :
            	    	    // InternalMoba.g:5683:10: otherlv_9= ',' ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    {
            	    	    otherlv_9=(Token)match(input,34,FOLLOW_29); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      										newLeafNode(otherlv_9, grammarAccess.getMobaDtoAttributeAccess().getCommaKeyword_1_4_3_0());
            	    	      									
            	    	    }
            	    	    // InternalMoba.g:5687:10: ( (lv_constraints_10_0= ruleMobaConstraint ) )
            	    	    // InternalMoba.g:5688:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    {
            	    	    // InternalMoba.g:5688:11: (lv_constraints_10_0= ruleMobaConstraint )
            	    	    // InternalMoba.g:5689:12: lv_constraints_10_0= ruleMobaConstraint
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
            	    	    break loop89;
            	        }
            	    } while (true);

            	    otherlv_11=(Token)match(input,35,FOLLOW_69); if (state.failed) return current;
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
            	    break loop90;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5724:3: ( (otherlv_12= RULE_ID ) )
            // InternalMoba.g:5725:4: (otherlv_12= RULE_ID )
            {
            // InternalMoba.g:5725:4: (otherlv_12= RULE_ID )
            // InternalMoba.g:5726:5: otherlv_12= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoAttributeRule());
              					}
              				
            }
            otherlv_12=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            // InternalMoba.g:5748:3: ( (lv_name_14_0= RULE_ID ) )
            // InternalMoba.g:5749:4: (lv_name_14_0= RULE_ID )
            {
            // InternalMoba.g:5749:4: (lv_name_14_0= RULE_ID )
            // InternalMoba.g:5750:5: lv_name_14_0= RULE_ID
            {
            lv_name_14_0=(Token)match(input,RULE_ID,FOLLOW_75); if (state.failed) return current;
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

            // InternalMoba.g:5766:3: ( ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) ) )
            // InternalMoba.g:5767:4: ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) )
            {
            // InternalMoba.g:5767:4: ( ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* ) )
            // InternalMoba.g:5768:5: ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5());
            // InternalMoba.g:5771:5: ( ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )* )
            // InternalMoba.g:5772:6: ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )*
            {
            // InternalMoba.g:5772:6: ( ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) ) | ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) ) )*
            loop92:
            do {
                int alt92=3;
                int LA92_0 = input.LA(1);

                if ( LA92_0 == 103 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0) ) {
                    alt92=1;
                }
                else if ( LA92_0 == 97 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1) ) {
                    alt92=2;
                }


                switch (alt92) {
            	case 1 :
            	    // InternalMoba.g:5773:4: ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:5773:4: ({...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) ) )
            	    // InternalMoba.g:5774:5: {...}? => ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // InternalMoba.g:5774:113: ( ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) ) )
            	    // InternalMoba.g:5775:6: ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 0);
            	    // InternalMoba.g:5778:9: ({...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' ) )
            	    // InternalMoba.g:5778:10: {...}? => (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5778:19: (otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')' )
            	    // InternalMoba.g:5778:20: otherlv_16= 'alias' otherlv_17= '(' ( (lv_alias_18_0= RULE_ID ) ) otherlv_19= ')'
            	    {
            	    otherlv_16=(Token)match(input,103,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_16, grammarAccess.getMobaDtoAttributeAccess().getAliasKeyword_5_0_0());
            	      								
            	    }
            	    otherlv_17=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_17, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_5_0_1());
            	      								
            	    }
            	    // InternalMoba.g:5786:9: ( (lv_alias_18_0= RULE_ID ) )
            	    // InternalMoba.g:5787:10: (lv_alias_18_0= RULE_ID )
            	    {
            	    // InternalMoba.g:5787:10: (lv_alias_18_0= RULE_ID )
            	    // InternalMoba.g:5788:11: lv_alias_18_0= RULE_ID
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

            	    otherlv_19=(Token)match(input,35,FOLLOW_75); if (state.failed) return current;
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
            	    // InternalMoba.g:5814:4: ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) )
            	    {
            	    // InternalMoba.g:5814:4: ({...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) ) )
            	    // InternalMoba.g:5815:5: {...}? => ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // InternalMoba.g:5815:113: ( ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) ) )
            	    // InternalMoba.g:5816:6: ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoAttributeAccess().getUnorderedGroup_5(), 1);
            	    // InternalMoba.g:5819:9: ({...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' ) )
            	    // InternalMoba.g:5819:10: {...}? => (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoAttribute", "true");
            	    }
            	    // InternalMoba.g:5819:19: (otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')' )
            	    // InternalMoba.g:5819:20: otherlv_20= 'format' otherlv_21= '(' ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) ) otherlv_24= ')'
            	    {
            	    otherlv_20=(Token)match(input,97,FOLLOW_18); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_20, grammarAccess.getMobaDtoAttributeAccess().getFormatKeyword_5_1_0());
            	      								
            	    }
            	    otherlv_21=(Token)match(input,33,FOLLOW_14); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      									newLeafNode(otherlv_21, grammarAccess.getMobaDtoAttributeAccess().getLeftParenthesisKeyword_5_1_1());
            	      								
            	    }
            	    // InternalMoba.g:5827:9: ( ( (lv_formatString_22_0= RULE_STRING ) ) | ( (otherlv_23= RULE_CONSTANT ) ) )
            	    int alt91=2;
            	    int LA91_0 = input.LA(1);

            	    if ( (LA91_0==RULE_STRING) ) {
            	        alt91=1;
            	    }
            	    else if ( (LA91_0==RULE_CONSTANT) ) {
            	        alt91=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 91, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt91) {
            	        case 1 :
            	            // InternalMoba.g:5828:10: ( (lv_formatString_22_0= RULE_STRING ) )
            	            {
            	            // InternalMoba.g:5828:10: ( (lv_formatString_22_0= RULE_STRING ) )
            	            // InternalMoba.g:5829:11: (lv_formatString_22_0= RULE_STRING )
            	            {
            	            // InternalMoba.g:5829:11: (lv_formatString_22_0= RULE_STRING )
            	            // InternalMoba.g:5830:12: lv_formatString_22_0= RULE_STRING
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
            	              													"org.mobadsl.grammar.Moba.STRING");
            	              											
            	            }

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMoba.g:5847:10: ( (otherlv_23= RULE_CONSTANT ) )
            	            {
            	            // InternalMoba.g:5847:10: ( (otherlv_23= RULE_CONSTANT ) )
            	            // InternalMoba.g:5848:11: (otherlv_23= RULE_CONSTANT )
            	            {
            	            // InternalMoba.g:5848:11: (otherlv_23= RULE_CONSTANT )
            	            // InternalMoba.g:5849:12: otherlv_23= RULE_CONSTANT
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

            	    otherlv_24=(Token)match(input,35,FOLLOW_75); if (state.failed) return current;
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
            	    break loop92;
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
    // InternalMoba.g:5893:1: entryRuleMobaDtoReference returns [EObject current=null] : iv_ruleMobaDtoReference= ruleMobaDtoReference EOF ;
    public final EObject entryRuleMobaDtoReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoReference = null;


        try {
            // InternalMoba.g:5893:57: (iv_ruleMobaDtoReference= ruleMobaDtoReference EOF )
            // InternalMoba.g:5894:2: iv_ruleMobaDtoReference= ruleMobaDtoReference EOF
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
    // InternalMoba.g:5900:1: ruleMobaDtoReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:5906:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:5907:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:5907:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:5908:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )? (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )? this_MobaFriendsAble_14= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,100,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoReferenceAccess().getRefKeyword_0());
              		
            }
            // InternalMoba.g:5912:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:5913:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:5913:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:5914:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:5917:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:5918:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:5918:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop93:
            do {
                int alt93=4;
                int LA93_0 = input.LA(1);

                if ( LA93_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt93=1;
                }
                else if ( LA93_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt93=2;
                }
                else if ( LA93_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt93=3;
                }


                switch (alt93) {
            	case 1 :
            	    // InternalMoba.g:5919:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5919:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:5920:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:5920:113: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:5921:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:5924:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:5924:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:5924:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:5924:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:5924:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:5925:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,99,FOLLOW_72); if (state.failed) return current;
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
            	    // InternalMoba.g:5942:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5942:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:5943:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:5943:113: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:5944:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:5947:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:5947:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:5947:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:5947:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:5947:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:5948:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,93,FOLLOW_72); if (state.failed) return current;
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
            	    // InternalMoba.g:5965:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:5965:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:5966:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:5966:113: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:5967:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:5970:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:5970:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaDtoReference", "true");
            	    }
            	    // InternalMoba.g:5970:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:5970:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:5970:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:5971:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,94,FOLLOW_72); if (state.failed) return current;
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
            	    break loop93;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaDtoReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:5995:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:5996:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:5996:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:5997:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            // InternalMoba.g:6019:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:6020:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:6020:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:6021:5: lv_name_7_0= RULE_ID
            {
            lv_name_7_0=(Token)match(input,RULE_ID,FOLLOW_76); if (state.failed) return current;
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

            // InternalMoba.g:6037:3: (otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')' )?
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==103) ) {
                alt94=1;
            }
            switch (alt94) {
                case 1 :
                    // InternalMoba.g:6038:4: otherlv_8= 'alias' otherlv_9= '(' ( (lv_alias_10_0= RULE_ID ) ) otherlv_11= ')'
                    {
                    otherlv_8=(Token)match(input,103,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getMobaDtoReferenceAccess().getAliasKeyword_5_0());
                      			
                    }
                    otherlv_9=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getMobaDtoReferenceAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMoba.g:6046:4: ( (lv_alias_10_0= RULE_ID ) )
                    // InternalMoba.g:6047:5: (lv_alias_10_0= RULE_ID )
                    {
                    // InternalMoba.g:6047:5: (lv_alias_10_0= RULE_ID )
                    // InternalMoba.g:6048:6: lv_alias_10_0= RULE_ID
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

                    otherlv_11=(Token)match(input,35,FOLLOW_73); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getMobaDtoReferenceAccess().getRightParenthesisKeyword_5_3());
                      			
                    }

                    }
                    break;

            }

            // InternalMoba.g:6069:3: (otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) ) )?
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==101) ) {
                alt95=1;
            }
            switch (alt95) {
                case 1 :
                    // InternalMoba.g:6070:4: otherlv_12= 'opposite' ( (otherlv_13= RULE_ID ) )
                    {
                    otherlv_12=(Token)match(input,101,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getMobaDtoReferenceAccess().getOppositeKeyword_6_0());
                      			
                    }
                    // InternalMoba.g:6074:4: ( (otherlv_13= RULE_ID ) )
                    // InternalMoba.g:6075:5: (otherlv_13= RULE_ID )
                    {
                    // InternalMoba.g:6075:5: (otherlv_13= RULE_ID )
                    // InternalMoba.g:6076:6: otherlv_13= RULE_ID
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
    // InternalMoba.g:6103:1: entryRuleMobaDtoEmbeddable returns [EObject current=null] : iv_ruleMobaDtoEmbeddable= ruleMobaDtoEmbeddable EOF ;
    public final EObject entryRuleMobaDtoEmbeddable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDtoEmbeddable = null;


        try {
            // InternalMoba.g:6103:58: (iv_ruleMobaDtoEmbeddable= ruleMobaDtoEmbeddable EOF )
            // InternalMoba.g:6104:2: iv_ruleMobaDtoEmbeddable= ruleMobaDtoEmbeddable EOF
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
    // InternalMoba.g:6110:1: ruleMobaDtoEmbeddable returns [EObject current=null] : (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:6116:2: ( (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:6117:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:6117:2: (otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:6118:3: otherlv_0= 'embed' ( (lv_transient_1_0= 'transient' ) )? ( (otherlv_2= RULE_ID ) ) this_MobaMultiplicityAble_3= ruleMobaMultiplicityAble[$current] ( (lv_name_4_0= RULE_ID ) ) (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )? this_MobaFriendsAble_9= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,102,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDtoEmbeddableAccess().getEmbedKeyword_0());
              		
            }
            // InternalMoba.g:6122:3: ( (lv_transient_1_0= 'transient' ) )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==94) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalMoba.g:6123:4: (lv_transient_1_0= 'transient' )
                    {
                    // InternalMoba.g:6123:4: (lv_transient_1_0= 'transient' )
                    // InternalMoba.g:6124:5: lv_transient_1_0= 'transient'
                    {
                    lv_transient_1_0=(Token)match(input,94,FOLLOW_4); if (state.failed) return current;
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

            // InternalMoba.g:6136:3: ( (otherlv_2= RULE_ID ) )
            // InternalMoba.g:6137:4: (otherlv_2= RULE_ID )
            {
            // InternalMoba.g:6137:4: (otherlv_2= RULE_ID )
            // InternalMoba.g:6138:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaDtoEmbeddableRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            // InternalMoba.g:6160:3: ( (lv_name_4_0= RULE_ID ) )
            // InternalMoba.g:6161:4: (lv_name_4_0= RULE_ID )
            {
            // InternalMoba.g:6161:4: (lv_name_4_0= RULE_ID )
            // InternalMoba.g:6162:5: lv_name_4_0= RULE_ID
            {
            lv_name_4_0=(Token)match(input,RULE_ID,FOLLOW_77); if (state.failed) return current;
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

            // InternalMoba.g:6178:3: (otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')' )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==103) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // InternalMoba.g:6179:4: otherlv_5= 'alias' otherlv_6= '(' ( (lv_alias_7_0= RULE_ID ) ) otherlv_8= ')'
                    {
                    otherlv_5=(Token)match(input,103,FOLLOW_18); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getMobaDtoEmbeddableAccess().getAliasKeyword_5_0());
                      			
                    }
                    otherlv_6=(Token)match(input,33,FOLLOW_4); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getMobaDtoEmbeddableAccess().getLeftParenthesisKeyword_5_1());
                      			
                    }
                    // InternalMoba.g:6187:4: ( (lv_alias_7_0= RULE_ID ) )
                    // InternalMoba.g:6188:5: (lv_alias_7_0= RULE_ID )
                    {
                    // InternalMoba.g:6188:5: (lv_alias_7_0= RULE_ID )
                    // InternalMoba.g:6189:6: lv_alias_7_0= RULE_ID
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

                    otherlv_8=(Token)match(input,35,FOLLOW_25); if (state.failed) return current;
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
    // InternalMoba.g:6225:1: entryRuleMobaQueueFeature returns [EObject current=null] : iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF ;
    public final EObject entryRuleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueFeature = null;


        try {
            // InternalMoba.g:6225:57: (iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF )
            // InternalMoba.g:6226:2: iv_ruleMobaQueueFeature= ruleMobaQueueFeature EOF
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
    // InternalMoba.g:6232:1: ruleMobaQueueFeature returns [EObject current=null] : this_MobaQueueReference_0= ruleMobaQueueReference ;
    public final EObject ruleMobaQueueFeature() throws RecognitionException {
        EObject current = null;

        EObject this_MobaQueueReference_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:6238:2: (this_MobaQueueReference_0= ruleMobaQueueReference )
            // InternalMoba.g:6239:2: this_MobaQueueReference_0= ruleMobaQueueReference
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
    // InternalMoba.g:6250:1: entryRuleMobaQueueReference returns [EObject current=null] : iv_ruleMobaQueueReference= ruleMobaQueueReference EOF ;
    public final EObject entryRuleMobaQueueReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaQueueReference = null;


        try {
            // InternalMoba.g:6250:59: (iv_ruleMobaQueueReference= ruleMobaQueueReference EOF )
            // InternalMoba.g:6251:2: iv_ruleMobaQueueReference= ruleMobaQueueReference EOF
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
    // InternalMoba.g:6257:1: ruleMobaQueueReference returns [EObject current=null] : (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:6263:2: ( (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:6264:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:6264:2: (otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:6265:3: otherlv_0= 'ref' ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) ) ( (otherlv_5= RULE_ID ) ) this_MobaMultiplicityAble_6= ruleMobaMultiplicityAble[$current] ( (lv_name_7_0= RULE_ID ) ) this_MobaFriendsAble_8= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,100,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaQueueReferenceAccess().getRefKeyword_0());
              		
            }
            // InternalMoba.g:6269:3: ( ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) ) )
            // InternalMoba.g:6270:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            {
            // InternalMoba.g:6270:4: ( ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* ) )
            // InternalMoba.g:6271:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());
            // InternalMoba.g:6274:5: ( ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )* )
            // InternalMoba.g:6275:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            {
            // InternalMoba.g:6275:6: ( ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) ) )*
            loop98:
            do {
                int alt98=4;
                int LA98_0 = input.LA(1);

                if ( LA98_0 == 99 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
                    alt98=1;
                }
                else if ( LA98_0 == 93 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
                    alt98=2;
                }
                else if ( LA98_0 == 94 && getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
                    alt98=3;
                }


                switch (alt98) {
            	case 1 :
            	    // InternalMoba.g:6276:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6276:4: ({...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) ) )
            	    // InternalMoba.g:6277:5: {...}? => ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0)");
            	    }
            	    // InternalMoba.g:6277:115: ( ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) ) )
            	    // InternalMoba.g:6278:6: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 0);
            	    // InternalMoba.g:6281:9: ({...}? => ( (lv_cascading_2_0= 'cascading' ) ) )
            	    // InternalMoba.g:6281:10: {...}? => ( (lv_cascading_2_0= 'cascading' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:6281:19: ( (lv_cascading_2_0= 'cascading' ) )
            	    // InternalMoba.g:6281:20: (lv_cascading_2_0= 'cascading' )
            	    {
            	    // InternalMoba.g:6281:20: (lv_cascading_2_0= 'cascading' )
            	    // InternalMoba.g:6282:10: lv_cascading_2_0= 'cascading'
            	    {
            	    lv_cascading_2_0=(Token)match(input,99,FOLLOW_72); if (state.failed) return current;
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
            	    // InternalMoba.g:6299:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6299:4: ({...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) ) )
            	    // InternalMoba.g:6300:5: {...}? => ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1)");
            	    }
            	    // InternalMoba.g:6300:115: ( ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) ) )
            	    // InternalMoba.g:6301:6: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 1);
            	    // InternalMoba.g:6304:9: ({...}? => ( (lv_lazy_3_0= 'lazy' ) ) )
            	    // InternalMoba.g:6304:10: {...}? => ( (lv_lazy_3_0= 'lazy' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:6304:19: ( (lv_lazy_3_0= 'lazy' ) )
            	    // InternalMoba.g:6304:20: (lv_lazy_3_0= 'lazy' )
            	    {
            	    // InternalMoba.g:6304:20: (lv_lazy_3_0= 'lazy' )
            	    // InternalMoba.g:6305:10: lv_lazy_3_0= 'lazy'
            	    {
            	    lv_lazy_3_0=(Token)match(input,93,FOLLOW_72); if (state.failed) return current;
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
            	    // InternalMoba.g:6322:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    {
            	    // InternalMoba.g:6322:4: ({...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) ) )
            	    // InternalMoba.g:6323:5: {...}? => ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "getUnorderedGroupHelper().canSelect(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2)");
            	    }
            	    // InternalMoba.g:6323:115: ( ({...}? => ( (lv_transient_4_0= 'transient' ) ) ) )
            	    // InternalMoba.g:6324:6: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1(), 2);
            	    // InternalMoba.g:6327:9: ({...}? => ( (lv_transient_4_0= 'transient' ) ) )
            	    // InternalMoba.g:6327:10: {...}? => ( (lv_transient_4_0= 'transient' ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleMobaQueueReference", "true");
            	    }
            	    // InternalMoba.g:6327:19: ( (lv_transient_4_0= 'transient' ) )
            	    // InternalMoba.g:6327:20: (lv_transient_4_0= 'transient' )
            	    {
            	    // InternalMoba.g:6327:20: (lv_transient_4_0= 'transient' )
            	    // InternalMoba.g:6328:10: lv_transient_4_0= 'transient'
            	    {
            	    lv_transient_4_0=(Token)match(input,94,FOLLOW_72); if (state.failed) return current;
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
            	    break loop98;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getMobaQueueReferenceAccess().getUnorderedGroup_1());

            }

            // InternalMoba.g:6352:3: ( (otherlv_5= RULE_ID ) )
            // InternalMoba.g:6353:4: (otherlv_5= RULE_ID )
            {
            // InternalMoba.g:6353:4: (otherlv_5= RULE_ID )
            // InternalMoba.g:6354:5: otherlv_5= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getMobaQueueReferenceRule());
              					}
              				
            }
            otherlv_5=(Token)match(input,RULE_ID,FOLLOW_70); if (state.failed) return current;
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
            // InternalMoba.g:6376:3: ( (lv_name_7_0= RULE_ID ) )
            // InternalMoba.g:6377:4: (lv_name_7_0= RULE_ID )
            {
            // InternalMoba.g:6377:4: (lv_name_7_0= RULE_ID )
            // InternalMoba.g:6378:5: lv_name_7_0= RULE_ID
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
    // InternalMoba.g:6409:1: entryRuleMobaMuliplicity returns [EObject current=null] : iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF ;
    public final EObject entryRuleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMuliplicity = null;


        try {
            // InternalMoba.g:6409:56: (iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF )
            // InternalMoba.g:6410:2: iv_ruleMobaMuliplicity= ruleMobaMuliplicity EOF
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
    // InternalMoba.g:6416:1: ruleMobaMuliplicity returns [EObject current=null] : (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) ;
    public final EObject ruleMobaMuliplicity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Enumerator lv_lower_1_0 = null;

        Enumerator lv_upper_3_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:6422:2: ( (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' ) )
            // InternalMoba.g:6423:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            {
            // InternalMoba.g:6423:2: (otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']' )
            // InternalMoba.g:6424:3: otherlv_0= '[' ( (lv_lower_1_0= ruleMobaLowerBound ) ) (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMuliplicityAccess().getLeftSquareBracketKeyword_0());
              		
            }
            // InternalMoba.g:6428:3: ( (lv_lower_1_0= ruleMobaLowerBound ) )
            // InternalMoba.g:6429:4: (lv_lower_1_0= ruleMobaLowerBound )
            {
            // InternalMoba.g:6429:4: (lv_lower_1_0= ruleMobaLowerBound )
            // InternalMoba.g:6430:5: lv_lower_1_0= ruleMobaLowerBound
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getLowerMobaLowerBoundEnumRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_79);
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

            // InternalMoba.g:6447:3: (otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==104) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalMoba.g:6448:4: otherlv_2= '..' ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    {
                    otherlv_2=(Token)match(input,104,FOLLOW_80); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaMuliplicityAccess().getFullStopFullStopKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:6452:4: ( (lv_upper_3_0= ruleMobaUpperBound ) )
                    // InternalMoba.g:6453:5: (lv_upper_3_0= ruleMobaUpperBound )
                    {
                    // InternalMoba.g:6453:5: (lv_upper_3_0= ruleMobaUpperBound )
                    // InternalMoba.g:6454:6: lv_upper_3_0= ruleMobaUpperBound
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getMobaMuliplicityAccess().getUpperMobaUpperBoundEnumRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_81);
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

            otherlv_4=(Token)match(input,66,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:6480:1: entryRuleMobaConstraint returns [EObject current=null] : iv_ruleMobaConstraint= ruleMobaConstraint EOF ;
    public final EObject entryRuleMobaConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaConstraint = null;


        try {
            // InternalMoba.g:6480:55: (iv_ruleMobaConstraint= ruleMobaConstraint EOF )
            // InternalMoba.g:6481:2: iv_ruleMobaConstraint= ruleMobaConstraint EOF
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
    // InternalMoba.g:6487:1: ruleMobaConstraint returns [EObject current=null] : (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) ;
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
            // InternalMoba.g:6493:2: ( (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint ) )
            // InternalMoba.g:6494:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            {
            // InternalMoba.g:6494:2: (this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint | this_MobaMinConstraint_1= ruleMobaMinConstraint | this_MobaMaxConstraint_2= ruleMobaMaxConstraint | this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint | this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint | this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint | this_MobaNullConstraint_6= ruleMobaNullConstraint | this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint )
            int alt100=8;
            switch ( input.LA(1) ) {
            case 105:
                {
                alt100=1;
                }
                break;
            case 106:
                {
                alt100=2;
                }
                break;
            case 107:
                {
                alt100=3;
                }
                break;
            case 108:
                {
                alt100=4;
                }
                break;
            case 109:
                {
                alt100=5;
                }
                break;
            case 110:
                {
                alt100=6;
                }
                break;
            case 111:
                {
                alt100=7;
                }
                break;
            case 112:
                {
                alt100=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 100, 0, input);

                throw nvae;
            }

            switch (alt100) {
                case 1 :
                    // InternalMoba.g:6495:3: this_MobaRegexpConstraint_0= ruleMobaRegexpConstraint
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
                    // InternalMoba.g:6504:3: this_MobaMinConstraint_1= ruleMobaMinConstraint
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
                    // InternalMoba.g:6513:3: this_MobaMaxConstraint_2= ruleMobaMaxConstraint
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
                    // InternalMoba.g:6522:3: this_MobaMinLengthConstraint_3= ruleMobaMinLengthConstraint
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
                    // InternalMoba.g:6531:3: this_MobaMaxLengthConstraint_4= ruleMobaMaxLengthConstraint
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
                    // InternalMoba.g:6540:3: this_MobaDigitsConstraint_5= ruleMobaDigitsConstraint
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
                    // InternalMoba.g:6549:3: this_MobaNullConstraint_6= ruleMobaNullConstraint
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
                    // InternalMoba.g:6558:3: this_MobaNotNullConstraint_7= ruleMobaNotNullConstraint
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
    // InternalMoba.g:6570:1: entryRuleMobaRegexpConstraint returns [EObject current=null] : iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF ;
    public final EObject entryRuleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaRegexpConstraint = null;


        try {
            // InternalMoba.g:6570:61: (iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF )
            // InternalMoba.g:6571:2: iv_ruleMobaRegexpConstraint= ruleMobaRegexpConstraint EOF
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
    // InternalMoba.g:6577:1: ruleMobaRegexpConstraint returns [EObject current=null] : (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaRegexpConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterString_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6583:2: ( (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6584:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6584:2: (otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6585:3: otherlv_0= 'regexp' otherlv_1= '=' ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,105,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaRegexpConstraintAccess().getRegexpKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaRegexpConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6593:3: ( ( (lv_filterString_2_0= RULE_STRING ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==RULE_STRING) ) {
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
                    // InternalMoba.g:6594:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    {
                    // InternalMoba.g:6594:4: ( (lv_filterString_2_0= RULE_STRING ) )
                    // InternalMoba.g:6595:5: (lv_filterString_2_0= RULE_STRING )
                    {
                    // InternalMoba.g:6595:5: (lv_filterString_2_0= RULE_STRING )
                    // InternalMoba.g:6596:6: lv_filterString_2_0= RULE_STRING
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
                      							"org.mobadsl.grammar.Moba.STRING");
                      					
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:6613:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6613:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6614:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6614:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6615:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6631:1: entryRuleMobaMinConstraint returns [EObject current=null] : iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF ;
    public final EObject entryRuleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinConstraint = null;


        try {
            // InternalMoba.g:6631:58: (iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF )
            // InternalMoba.g:6632:2: iv_ruleMobaMinConstraint= ruleMobaMinConstraint EOF
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
    // InternalMoba.g:6638:1: ruleMobaMinConstraint returns [EObject current=null] : (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMinConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6644:2: ( (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6645:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6645:2: (otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6646:3: otherlv_0= 'min' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,106,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMinConstraintAccess().getMinKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMinConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6654:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:6655:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:6655:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:6656:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:6656:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:6657:6: lv_filterValue_2_0= RULE_DOUBLE
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
                    // InternalMoba.g:6674:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6674:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6675:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6675:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6676:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6692:1: entryRuleMobaMaxConstraint returns [EObject current=null] : iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF ;
    public final EObject entryRuleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxConstraint = null;


        try {
            // InternalMoba.g:6692:58: (iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF )
            // InternalMoba.g:6693:2: iv_ruleMobaMaxConstraint= ruleMobaMaxConstraint EOF
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
    // InternalMoba.g:6699:1: ruleMobaMaxConstraint returns [EObject current=null] : (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMaxConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6705:2: ( (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6706:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6706:2: (otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6707:3: otherlv_0= 'max' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,107,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMaxConstraintAccess().getMaxKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMaxConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6715:3: ( ( (lv_filterValue_2_0= RULE_DOUBLE ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==RULE_DOUBLE) ) {
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
                    // InternalMoba.g:6716:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    {
                    // InternalMoba.g:6716:4: ( (lv_filterValue_2_0= RULE_DOUBLE ) )
                    // InternalMoba.g:6717:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    {
                    // InternalMoba.g:6717:5: (lv_filterValue_2_0= RULE_DOUBLE )
                    // InternalMoba.g:6718:6: lv_filterValue_2_0= RULE_DOUBLE
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
                    // InternalMoba.g:6735:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6735:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6736:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6736:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6737:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6753:1: entryRuleMobaMinLengthConstraint returns [EObject current=null] : iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF ;
    public final EObject entryRuleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMinLengthConstraint = null;


        try {
            // InternalMoba.g:6753:64: (iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF )
            // InternalMoba.g:6754:2: iv_ruleMobaMinLengthConstraint= ruleMobaMinLengthConstraint EOF
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
    // InternalMoba.g:6760:1: ruleMobaMinLengthConstraint returns [EObject current=null] : (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMinLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6766:2: ( (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6767:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6767:2: (otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6768:3: otherlv_0= 'minLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,108,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMinLengthConstraintAccess().getMinLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMinLengthConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6776:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:6777:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:6777:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:6778:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:6778:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:6779:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:6796:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6796:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6797:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6797:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6798:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6814:1: entryRuleMobaMaxLengthConstraint returns [EObject current=null] : iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF ;
    public final EObject entryRuleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaMaxLengthConstraint = null;


        try {
            // InternalMoba.g:6814:64: (iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF )
            // InternalMoba.g:6815:2: iv_ruleMobaMaxLengthConstraint= ruleMobaMaxLengthConstraint EOF
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
    // InternalMoba.g:6821:1: ruleMobaMaxLengthConstraint returns [EObject current=null] : (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) ;
    public final EObject ruleMobaMaxLengthConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_filterValue_2_0=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalMoba.g:6827:2: ( (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) ) )
            // InternalMoba.g:6828:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            {
            // InternalMoba.g:6828:2: (otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) )
            // InternalMoba.g:6829:3: otherlv_0= 'maxLength' otherlv_1= '=' ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
            {
            otherlv_0=(Token)match(input,109,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaMaxLengthConstraintAccess().getMaxLengthKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,21,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaMaxLengthConstraintAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalMoba.g:6837:3: ( ( (lv_filterValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:6838:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:6838:4: ( (lv_filterValue_2_0= RULE_INT ) )
                    // InternalMoba.g:6839:5: (lv_filterValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:6839:5: (lv_filterValue_2_0= RULE_INT )
                    // InternalMoba.g:6840:6: lv_filterValue_2_0= RULE_INT
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
                    // InternalMoba.g:6857:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6857:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6858:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6858:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6859:6: otherlv_3= RULE_CONSTANT
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
    // InternalMoba.g:6875:1: entryRuleMobaDigitsConstraint returns [EObject current=null] : iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF ;
    public final EObject entryRuleMobaDigitsConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDigitsConstraint = null;


        try {
            // InternalMoba.g:6875:61: (iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF )
            // InternalMoba.g:6876:2: iv_ruleMobaDigitsConstraint= ruleMobaDigitsConstraint EOF
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
    // InternalMoba.g:6882:1: ruleMobaDigitsConstraint returns [EObject current=null] : (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' ) ;
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
            // InternalMoba.g:6888:2: ( (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' ) )
            // InternalMoba.g:6889:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )
            {
            // InternalMoba.g:6889:2: (otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')' )
            // InternalMoba.g:6890:3: otherlv_0= 'digits' otherlv_1= '(' ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) ) otherlv_4= ',' ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) ) otherlv_7= ')'
            {
            otherlv_0=(Token)match(input,110,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDigitsConstraintAccess().getDigitsKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,33,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getMobaDigitsConstraintAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalMoba.g:6898:3: ( ( (lv_filterIntegerValue_2_0= RULE_INT ) ) | ( (otherlv_3= RULE_CONSTANT ) ) )
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
                    // InternalMoba.g:6899:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    {
                    // InternalMoba.g:6899:4: ( (lv_filterIntegerValue_2_0= RULE_INT ) )
                    // InternalMoba.g:6900:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    {
                    // InternalMoba.g:6900:5: (lv_filterIntegerValue_2_0= RULE_INT )
                    // InternalMoba.g:6901:6: lv_filterIntegerValue_2_0= RULE_INT
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
                    // InternalMoba.g:6918:4: ( (otherlv_3= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6918:4: ( (otherlv_3= RULE_CONSTANT ) )
                    // InternalMoba.g:6919:5: (otherlv_3= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6919:5: (otherlv_3= RULE_CONSTANT )
                    // InternalMoba.g:6920:6: otherlv_3= RULE_CONSTANT
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

            otherlv_4=(Token)match(input,34,FOLLOW_51); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getMobaDigitsConstraintAccess().getCommaKeyword_3());
              		
            }
            // InternalMoba.g:6936:3: ( ( (lv_filterFractionValue_5_0= RULE_INT ) ) | ( (otherlv_6= RULE_CONSTANT ) ) )
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RULE_INT) ) {
                alt107=1;
            }
            else if ( (LA107_0==RULE_CONSTANT) ) {
                alt107=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }
            switch (alt107) {
                case 1 :
                    // InternalMoba.g:6937:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    {
                    // InternalMoba.g:6937:4: ( (lv_filterFractionValue_5_0= RULE_INT ) )
                    // InternalMoba.g:6938:5: (lv_filterFractionValue_5_0= RULE_INT )
                    {
                    // InternalMoba.g:6938:5: (lv_filterFractionValue_5_0= RULE_INT )
                    // InternalMoba.g:6939:6: lv_filterFractionValue_5_0= RULE_INT
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
                    // InternalMoba.g:6956:4: ( (otherlv_6= RULE_CONSTANT ) )
                    {
                    // InternalMoba.g:6956:4: ( (otherlv_6= RULE_CONSTANT ) )
                    // InternalMoba.g:6957:5: (otherlv_6= RULE_CONSTANT )
                    {
                    // InternalMoba.g:6957:5: (otherlv_6= RULE_CONSTANT )
                    // InternalMoba.g:6958:6: otherlv_6= RULE_CONSTANT
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

            otherlv_7=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:6978:1: entryRuleMobaNullConstraint returns [EObject current=null] : iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF ;
    public final EObject entryRuleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNullConstraint = null;


        try {
            // InternalMoba.g:6978:59: (iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF )
            // InternalMoba.g:6979:2: iv_ruleMobaNullConstraint= ruleMobaNullConstraint EOF
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
    // InternalMoba.g:6985:1: ruleMobaNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNull' ) ;
    public final EObject ruleMobaNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:6991:2: ( ( () otherlv_1= 'isNull' ) )
            // InternalMoba.g:6992:2: ( () otherlv_1= 'isNull' )
            {
            // InternalMoba.g:6992:2: ( () otherlv_1= 'isNull' )
            // InternalMoba.g:6993:3: () otherlv_1= 'isNull'
            {
            // InternalMoba.g:6993:3: ()
            // InternalMoba.g:6994:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaNullConstraintAccess().getMobaNullConstraintAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,111,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7008:1: entryRuleMobaNotNullConstraint returns [EObject current=null] : iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF ;
    public final EObject entryRuleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNotNullConstraint = null;


        try {
            // InternalMoba.g:7008:62: (iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF )
            // InternalMoba.g:7009:2: iv_ruleMobaNotNullConstraint= ruleMobaNotNullConstraint EOF
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
    // InternalMoba.g:7015:1: ruleMobaNotNullConstraint returns [EObject current=null] : ( () otherlv_1= 'isNotNull' ) ;
    public final EObject ruleMobaNotNullConstraint() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalMoba.g:7021:2: ( ( () otherlv_1= 'isNotNull' ) )
            // InternalMoba.g:7022:2: ( () otherlv_1= 'isNotNull' )
            {
            // InternalMoba.g:7022:2: ( () otherlv_1= 'isNotNull' )
            // InternalMoba.g:7023:3: () otherlv_1= 'isNotNull'
            {
            // InternalMoba.g:7023:3: ()
            // InternalMoba.g:7024:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getMobaNotNullConstraintAccess().getMobaNotNullConstraintAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,112,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7038:1: entryRuleMobaGeneratorSlot returns [EObject current=null] : iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF ;
    public final EObject entryRuleMobaGeneratorSlot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeneratorSlot = null;


        try {
            // InternalMoba.g:7038:58: (iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF )
            // InternalMoba.g:7039:2: iv_ruleMobaGeneratorSlot= ruleMobaGeneratorSlot EOF
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
    // InternalMoba.g:7045:1: ruleMobaGeneratorSlot returns [EObject current=null] : (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? ) ;
    public final EObject ruleMobaGeneratorSlot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_type_3_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7051:2: ( (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? ) )
            // InternalMoba.g:7052:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? )
            {
            // InternalMoba.g:7052:2: (otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )? )
            // InternalMoba.g:7053:3: otherlv_0= 'slot' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )?
            {
            otherlv_0=(Token)match(input,113,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeneratorSlotAccess().getSlotKeyword_0());
              		
            }
            // InternalMoba.g:7057:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7058:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7058:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7059:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_83); if (state.failed) return current;
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

            // InternalMoba.g:7075:3: (otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) ) )?
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==68) ) {
                alt108=1;
            }
            switch (alt108) {
                case 1 :
                    // InternalMoba.g:7076:4: otherlv_2= 'type' ( (lv_type_3_0= RULE_STRING ) )
                    {
                    otherlv_2=(Token)match(input,68,FOLLOW_34); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getMobaGeneratorSlotAccess().getTypeKeyword_2_0());
                      			
                    }
                    // InternalMoba.g:7080:4: ( (lv_type_3_0= RULE_STRING ) )
                    // InternalMoba.g:7081:5: (lv_type_3_0= RULE_STRING )
                    {
                    // InternalMoba.g:7081:5: (lv_type_3_0= RULE_STRING )
                    // InternalMoba.g:7082:6: lv_type_3_0= RULE_STRING
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
                      							"org.mobadsl.grammar.Moba.STRING");
                      					
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
    // InternalMoba.g:7103:1: entryRuleMobaTrigger returns [EObject current=null] : iv_ruleMobaTrigger= ruleMobaTrigger EOF ;
    public final EObject entryRuleMobaTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaTrigger = null;


        try {
            // InternalMoba.g:7103:52: (iv_ruleMobaTrigger= ruleMobaTrigger EOF )
            // InternalMoba.g:7104:2: iv_ruleMobaTrigger= ruleMobaTrigger EOF
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
    // InternalMoba.g:7110:1: ruleMobaTrigger returns [EObject current=null] : (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger ) ;
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
            // InternalMoba.g:7116:2: ( (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger ) )
            // InternalMoba.g:7117:2: (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger )
            {
            // InternalMoba.g:7117:2: (this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger | this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger | this_MobaEmailTrigger_2= ruleMobaEmailTrigger | this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger | this_MobaSMSTrigger_4= ruleMobaSMSTrigger | this_MobaPushTrigger_5= ruleMobaPushTrigger | this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger )
            int alt109=7;
            switch ( input.LA(1) ) {
            case 114:
                {
                alt109=1;
                }
                break;
            case 115:
                {
                alt109=2;
                }
                break;
            case 116:
                {
                alt109=3;
                }
                break;
            case 117:
                {
                alt109=4;
                }
                break;
            case 118:
                {
                alt109=5;
                }
                break;
            case 119:
                {
                alt109=6;
                }
                break;
            case 120:
                {
                alt109=7;
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
                    // InternalMoba.g:7118:3: this_MobaAppInstallTrigger_0= ruleMobaAppInstallTrigger
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
                    // InternalMoba.g:7127:3: this_MobaAppUpdateTrigger_1= ruleMobaAppUpdateTrigger
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
                    // InternalMoba.g:7136:3: this_MobaEmailTrigger_2= ruleMobaEmailTrigger
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
                    // InternalMoba.g:7145:3: this_MobaDeviceStartupTrigger_3= ruleMobaDeviceStartupTrigger
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
                    // InternalMoba.g:7154:3: this_MobaSMSTrigger_4= ruleMobaSMSTrigger
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
                    // InternalMoba.g:7163:3: this_MobaPushTrigger_5= ruleMobaPushTrigger
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
                    // InternalMoba.g:7172:3: this_MobaGeofenceTrigger_6= ruleMobaGeofenceTrigger
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
    // InternalMoba.g:7184:1: entryRuleMobaAppInstallTrigger returns [EObject current=null] : iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF ;
    public final EObject entryRuleMobaAppInstallTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAppInstallTrigger = null;


        try {
            // InternalMoba.g:7184:62: (iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF )
            // InternalMoba.g:7185:2: iv_ruleMobaAppInstallTrigger= ruleMobaAppInstallTrigger EOF
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
    // InternalMoba.g:7191:1: ruleMobaAppInstallTrigger returns [EObject current=null] : (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaAppInstallTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7197:2: ( (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7198:2: (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7198:2: (otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7199:3: otherlv_0= 'trigger app install' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,114,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaAppInstallTriggerAccess().getTriggerAppInstallKeyword_0());
              		
            }
            // InternalMoba.g:7203:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7204:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7204:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7205:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7225:1: entryRuleMobaAppUpdateTrigger returns [EObject current=null] : iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF ;
    public final EObject entryRuleMobaAppUpdateTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaAppUpdateTrigger = null;


        try {
            // InternalMoba.g:7225:61: (iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF )
            // InternalMoba.g:7226:2: iv_ruleMobaAppUpdateTrigger= ruleMobaAppUpdateTrigger EOF
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
    // InternalMoba.g:7232:1: ruleMobaAppUpdateTrigger returns [EObject current=null] : (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaAppUpdateTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7238:2: ( (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7239:2: (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7239:2: (otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7240:3: otherlv_0= 'trigger app update' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,115,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaAppUpdateTriggerAccess().getTriggerAppUpdateKeyword_0());
              		
            }
            // InternalMoba.g:7244:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7245:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7245:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7246:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7266:1: entryRuleMobaEmailTrigger returns [EObject current=null] : iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF ;
    public final EObject entryRuleMobaEmailTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaEmailTrigger = null;


        try {
            // InternalMoba.g:7266:57: (iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF )
            // InternalMoba.g:7267:2: iv_ruleMobaEmailTrigger= ruleMobaEmailTrigger EOF
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
    // InternalMoba.g:7273:1: ruleMobaEmailTrigger returns [EObject current=null] : (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaEmailTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7279:2: ( (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7280:2: (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7280:2: (otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7281:3: otherlv_0= 'trigger email' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,116,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaEmailTriggerAccess().getTriggerEmailKeyword_0());
              		
            }
            // InternalMoba.g:7285:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7286:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7286:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7287:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7307:1: entryRuleMobaDeviceStartupTrigger returns [EObject current=null] : iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF ;
    public final EObject entryRuleMobaDeviceStartupTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaDeviceStartupTrigger = null;


        try {
            // InternalMoba.g:7307:65: (iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF )
            // InternalMoba.g:7308:2: iv_ruleMobaDeviceStartupTrigger= ruleMobaDeviceStartupTrigger EOF
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
    // InternalMoba.g:7314:1: ruleMobaDeviceStartupTrigger returns [EObject current=null] : (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaDeviceStartupTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7320:2: ( (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7321:2: (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7321:2: (otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7322:3: otherlv_0= 'trigger device start' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,117,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaDeviceStartupTriggerAccess().getTriggerDeviceStartKeyword_0());
              		
            }
            // InternalMoba.g:7326:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7327:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7327:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7328:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7348:1: entryRuleMobaSMSTrigger returns [EObject current=null] : iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF ;
    public final EObject entryRuleMobaSMSTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaSMSTrigger = null;


        try {
            // InternalMoba.g:7348:55: (iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF )
            // InternalMoba.g:7349:2: iv_ruleMobaSMSTrigger= ruleMobaSMSTrigger EOF
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
    // InternalMoba.g:7355:1: ruleMobaSMSTrigger returns [EObject current=null] : (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaSMSTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7361:2: ( (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7362:2: (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7362:2: (otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7363:3: otherlv_0= 'trigger sms' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,118,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaSMSTriggerAccess().getTriggerSmsKeyword_0());
              		
            }
            // InternalMoba.g:7367:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7368:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7368:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7369:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7389:1: entryRuleMobaPushTrigger returns [EObject current=null] : iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF ;
    public final EObject entryRuleMobaPushTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPushTrigger = null;


        try {
            // InternalMoba.g:7389:56: (iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF )
            // InternalMoba.g:7390:2: iv_ruleMobaPushTrigger= ruleMobaPushTrigger EOF
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
    // InternalMoba.g:7396:1: ruleMobaPushTrigger returns [EObject current=null] : (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) ) ;
    public final EObject ruleMobaPushTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMoba.g:7402:2: ( (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) ) )
            // InternalMoba.g:7403:2: (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) )
            {
            // InternalMoba.g:7403:2: (otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) ) )
            // InternalMoba.g:7404:3: otherlv_0= 'trigger push' ( (lv_name_1_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,119,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaPushTriggerAccess().getTriggerPushKeyword_0());
              		
            }
            // InternalMoba.g:7408:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7409:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7409:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7410:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7430:1: entryRuleMobaGeofenceTrigger returns [EObject current=null] : iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF ;
    public final EObject entryRuleMobaGeofenceTrigger() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaGeofenceTrigger = null;


        try {
            // InternalMoba.g:7430:60: (iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF )
            // InternalMoba.g:7431:2: iv_ruleMobaGeofenceTrigger= ruleMobaGeofenceTrigger EOF
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
    // InternalMoba.g:7437:1: ruleMobaGeofenceTrigger returns [EObject current=null] : (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) ) ;
    public final EObject ruleMobaGeofenceTrigger() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Enumerator lv_eventType_4_0 = null;



        	enterRule();

        try {
            // InternalMoba.g:7443:2: ( (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) ) )
            // InternalMoba.g:7444:2: (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) )
            {
            // InternalMoba.g:7444:2: (otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) ) )
            // InternalMoba.g:7445:3: otherlv_0= 'trigger geofence' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'event' otherlv_3= '=' ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) )
            {
            otherlv_0=(Token)match(input,120,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaGeofenceTriggerAccess().getTriggerGeofenceKeyword_0());
              		
            }
            // InternalMoba.g:7449:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7450:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7450:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7451:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_84); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,121,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaGeofenceTriggerAccess().getEventKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,21,FOLLOW_85); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaGeofenceTriggerAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:7475:3: ( (lv_eventType_4_0= ruleMobaGeofenceEvent ) )
            // InternalMoba.g:7476:4: (lv_eventType_4_0= ruleMobaGeofenceEvent )
            {
            // InternalMoba.g:7476:4: (lv_eventType_4_0= ruleMobaGeofenceEvent )
            // InternalMoba.g:7477:5: lv_eventType_4_0= ruleMobaGeofenceEvent
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
    // InternalMoba.g:7498:1: entryRuleMobaExternalModule returns [EObject current=null] : iv_ruleMobaExternalModule= ruleMobaExternalModule EOF ;
    public final EObject entryRuleMobaExternalModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaExternalModule = null;


        try {
            // InternalMoba.g:7498:59: (iv_ruleMobaExternalModule= ruleMobaExternalModule EOF )
            // InternalMoba.g:7499:2: iv_ruleMobaExternalModule= ruleMobaExternalModule EOF
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
    // InternalMoba.g:7505:1: ruleMobaExternalModule returns [EObject current=null] : (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule ) ;
    public final EObject ruleMobaExternalModule() throws RecognitionException {
        EObject current = null;

        EObject this_MobaBluetoothModule_0 = null;

        EObject this_MobaPushModule_1 = null;

        EObject this_MobaNFCModule_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:7511:2: ( (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule ) )
            // InternalMoba.g:7512:2: (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule )
            {
            // InternalMoba.g:7512:2: (this_MobaBluetoothModule_0= ruleMobaBluetoothModule | this_MobaPushModule_1= ruleMobaPushModule | this_MobaNFCModule_2= ruleMobaNFCModule )
            int alt110=3;
            switch ( input.LA(1) ) {
            case 122:
                {
                alt110=1;
                }
                break;
            case 123:
                {
                alt110=2;
                }
                break;
            case 124:
                {
                alt110=3;
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
                    // InternalMoba.g:7513:3: this_MobaBluetoothModule_0= ruleMobaBluetoothModule
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
                    // InternalMoba.g:7522:3: this_MobaPushModule_1= ruleMobaPushModule
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
                    // InternalMoba.g:7531:3: this_MobaNFCModule_2= ruleMobaNFCModule
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
    // InternalMoba.g:7543:1: entryRuleMobaBluetoothModule returns [EObject current=null] : iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF ;
    public final EObject entryRuleMobaBluetoothModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaBluetoothModule = null;


        try {
            // InternalMoba.g:7543:60: (iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF )
            // InternalMoba.g:7544:2: iv_ruleMobaBluetoothModule= ruleMobaBluetoothModule EOF
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
    // InternalMoba.g:7550:1: ruleMobaBluetoothModule returns [EObject current=null] : (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:7556:2: ( (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:7557:2: (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:7557:2: (otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:7558:3: otherlv_0= 'module bluetooth' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaBlueToothModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,122,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaBluetoothModuleAccess().getModuleBluetoothKeyword_0());
              		
            }
            // InternalMoba.g:7562:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7563:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7563:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7564:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_86); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,68,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaBluetoothModuleAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,21,FOLLOW_87); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaBluetoothModuleAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:7588:3: ( (lv_type_4_0= ruleMobaBlueToothModuleType ) )
            // InternalMoba.g:7589:4: (lv_type_4_0= ruleMobaBlueToothModuleType )
            {
            // InternalMoba.g:7589:4: (lv_type_4_0= ruleMobaBlueToothModuleType )
            // InternalMoba.g:7590:5: lv_type_4_0= ruleMobaBlueToothModuleType
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
    // InternalMoba.g:7622:1: entryRuleMobaPushModule returns [EObject current=null] : iv_ruleMobaPushModule= ruleMobaPushModule EOF ;
    public final EObject entryRuleMobaPushModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaPushModule = null;


        try {
            // InternalMoba.g:7622:55: (iv_ruleMobaPushModule= ruleMobaPushModule EOF )
            // InternalMoba.g:7623:2: iv_ruleMobaPushModule= ruleMobaPushModule EOF
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
    // InternalMoba.g:7629:1: ruleMobaPushModule returns [EObject current=null] : (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) ;
    public final EObject ruleMobaPushModule() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject this_MobaFriendsAble_2 = null;



        	enterRule();

        try {
            // InternalMoba.g:7635:2: ( (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:7636:2: (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:7636:2: (otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:7637:3: otherlv_0= 'module push' ( (lv_name_1_0= RULE_ID ) ) this_MobaFriendsAble_2= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,123,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaPushModuleAccess().getModulePushKeyword_0());
              		
            }
            // InternalMoba.g:7641:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7642:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7642:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7643:5: lv_name_1_0= RULE_ID
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
    // InternalMoba.g:7674:1: entryRuleMobaNFCModule returns [EObject current=null] : iv_ruleMobaNFCModule= ruleMobaNFCModule EOF ;
    public final EObject entryRuleMobaNFCModule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMobaNFCModule = null;


        try {
            // InternalMoba.g:7674:54: (iv_ruleMobaNFCModule= ruleMobaNFCModule EOF )
            // InternalMoba.g:7675:2: iv_ruleMobaNFCModule= ruleMobaNFCModule EOF
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
    // InternalMoba.g:7681:1: ruleMobaNFCModule returns [EObject current=null] : (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) ;
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
            // InternalMoba.g:7687:2: ( (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] ) )
            // InternalMoba.g:7688:2: (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            {
            // InternalMoba.g:7688:2: (otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current] )
            // InternalMoba.g:7689:3: otherlv_0= 'module NFC' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'type' otherlv_3= '=' ( (lv_type_4_0= ruleMobaNFCModuleType ) ) this_MobaFriendsAble_5= ruleMobaFriendsAble[$current]
            {
            otherlv_0=(Token)match(input,124,FOLLOW_4); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getMobaNFCModuleAccess().getModuleNFCKeyword_0());
              		
            }
            // InternalMoba.g:7693:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMoba.g:7694:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMoba.g:7694:4: (lv_name_1_0= RULE_ID )
            // InternalMoba.g:7695:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_86); if (state.failed) return current;
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

            otherlv_2=(Token)match(input,68,FOLLOW_6); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getMobaNFCModuleAccess().getTypeKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,21,FOLLOW_88); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getMobaNFCModuleAccess().getEqualsSignKeyword_3());
              		
            }
            // InternalMoba.g:7719:3: ( (lv_type_4_0= ruleMobaNFCModuleType ) )
            // InternalMoba.g:7720:4: (lv_type_4_0= ruleMobaNFCModuleType )
            {
            // InternalMoba.g:7720:4: (lv_type_4_0= ruleMobaNFCModuleType )
            // InternalMoba.g:7721:5: lv_type_4_0= ruleMobaNFCModuleType
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
    // InternalMoba.g:7753:1: ruleMobaConstantValueFunction returns [Enumerator current=null] : ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) ) ;
    public final Enumerator ruleMobaConstantValueFunction() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoba.g:7759:2: ( ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) ) )
            // InternalMoba.g:7760:2: ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) )
            {
            // InternalMoba.g:7760:2: ( (enumLiteral_0= 'toFirstLower' ) | (enumLiteral_1= 'toFirstUpper' ) | (enumLiteral_2= 'toLowerCase' ) | (enumLiteral_3= 'toUpperCase' ) )
            int alt111=4;
            switch ( input.LA(1) ) {
            case 125:
                {
                alt111=1;
                }
                break;
            case 126:
                {
                alt111=2;
                }
                break;
            case 127:
                {
                alt111=3;
                }
                break;
            case 128:
                {
                alt111=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 111, 0, input);

                throw nvae;
            }

            switch (alt111) {
                case 1 :
                    // InternalMoba.g:7761:3: (enumLiteral_0= 'toFirstLower' )
                    {
                    // InternalMoba.g:7761:3: (enumLiteral_0= 'toFirstLower' )
                    // InternalMoba.g:7762:4: enumLiteral_0= 'toFirstLower'
                    {
                    enumLiteral_0=(Token)match(input,125,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_LOWER_CASEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_LOWER_CASEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7769:3: (enumLiteral_1= 'toFirstUpper' )
                    {
                    // InternalMoba.g:7769:3: (enumLiteral_1= 'toFirstUpper' )
                    // InternalMoba.g:7770:4: enumLiteral_1= 'toFirstUpper'
                    {
                    enumLiteral_1=(Token)match(input,126,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_UPPER_CASEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaConstantValueFunctionAccess().getTO_FIRST_UPPER_CASEEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7777:3: (enumLiteral_2= 'toLowerCase' )
                    {
                    // InternalMoba.g:7777:3: (enumLiteral_2= 'toLowerCase' )
                    // InternalMoba.g:7778:4: enumLiteral_2= 'toLowerCase'
                    {
                    enumLiteral_2=(Token)match(input,127,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaConstantValueFunctionAccess().getTO_LOWER_CASEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaConstantValueFunctionAccess().getTO_LOWER_CASEEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:7785:3: (enumLiteral_3= 'toUpperCase' )
                    {
                    // InternalMoba.g:7785:3: (enumLiteral_3= 'toUpperCase' )
                    // InternalMoba.g:7786:4: enumLiteral_3= 'toUpperCase'
                    {
                    enumLiteral_3=(Token)match(input,128,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7796:1: ruleMobaGeofenceEvent returns [Enumerator current=null] : ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) ) ;
    public final Enumerator ruleMobaGeofenceEvent() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:7802:2: ( ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) ) )
            // InternalMoba.g:7803:2: ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) )
            {
            // InternalMoba.g:7803:2: ( (enumLiteral_0= 'enter' ) | (enumLiteral_1= 'leave' ) )
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==129) ) {
                alt112=1;
            }
            else if ( (LA112_0==130) ) {
                alt112=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 112, 0, input);

                throw nvae;
            }
            switch (alt112) {
                case 1 :
                    // InternalMoba.g:7804:3: (enumLiteral_0= 'enter' )
                    {
                    // InternalMoba.g:7804:3: (enumLiteral_0= 'enter' )
                    // InternalMoba.g:7805:4: enumLiteral_0= 'enter'
                    {
                    enumLiteral_0=(Token)match(input,129,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaGeofenceEventAccess().getENTEREnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaGeofenceEventAccess().getENTEREnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7812:3: (enumLiteral_1= 'leave' )
                    {
                    // InternalMoba.g:7812:3: (enumLiteral_1= 'leave' )
                    // InternalMoba.g:7813:4: enumLiteral_1= 'leave'
                    {
                    enumLiteral_1=(Token)match(input,130,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7823:1: ruleMobaBlueToothModuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) ) ;
    public final Enumerator ruleMobaBlueToothModuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMoba.g:7829:2: ( ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) ) )
            // InternalMoba.g:7830:2: ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) )
            {
            // InternalMoba.g:7830:2: ( (enumLiteral_0= 'lowEnergy' ) | (enumLiteral_1= 'spp' ) | (enumLiteral_2= 'beacon' ) )
            int alt113=3;
            switch ( input.LA(1) ) {
            case 131:
                {
                alt113=1;
                }
                break;
            case 132:
                {
                alt113=2;
                }
                break;
            case 133:
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
                    // InternalMoba.g:7831:3: (enumLiteral_0= 'lowEnergy' )
                    {
                    // InternalMoba.g:7831:3: (enumLiteral_0= 'lowEnergy' )
                    // InternalMoba.g:7832:4: enumLiteral_0= 'lowEnergy'
                    {
                    enumLiteral_0=(Token)match(input,131,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getLEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaBlueToothModuleTypeAccess().getLEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7839:3: (enumLiteral_1= 'spp' )
                    {
                    // InternalMoba.g:7839:3: (enumLiteral_1= 'spp' )
                    // InternalMoba.g:7840:4: enumLiteral_1= 'spp'
                    {
                    enumLiteral_1=(Token)match(input,132,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaBlueToothModuleTypeAccess().getSPPEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaBlueToothModuleTypeAccess().getSPPEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7847:3: (enumLiteral_2= 'beacon' )
                    {
                    // InternalMoba.g:7847:3: (enumLiteral_2= 'beacon' )
                    // InternalMoba.g:7848:4: enumLiteral_2= 'beacon'
                    {
                    enumLiteral_2=(Token)match(input,133,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7858:1: ruleMobaNFCModuleType returns [Enumerator current=null] : ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) ) ;
    public final Enumerator ruleMobaNFCModuleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalMoba.g:7864:2: ( ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) ) )
            // InternalMoba.g:7865:2: ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) )
            {
            // InternalMoba.g:7865:2: ( (enumLiteral_0= 'id' ) | (enumLiteral_1= 'custom' ) | (enumLiteral_2= 'text' ) )
            int alt114=3;
            switch ( input.LA(1) ) {
            case 134:
                {
                alt114=1;
                }
                break;
            case 135:
                {
                alt114=2;
                }
                break;
            case 136:
                {
                alt114=3;
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
                    // InternalMoba.g:7866:3: (enumLiteral_0= 'id' )
                    {
                    // InternalMoba.g:7866:3: (enumLiteral_0= 'id' )
                    // InternalMoba.g:7867:4: enumLiteral_0= 'id'
                    {
                    enumLiteral_0=(Token)match(input,134,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaNFCModuleTypeAccess().getIDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaNFCModuleTypeAccess().getIDEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7874:3: (enumLiteral_1= 'custom' )
                    {
                    // InternalMoba.g:7874:3: (enumLiteral_1= 'custom' )
                    // InternalMoba.g:7875:4: enumLiteral_1= 'custom'
                    {
                    enumLiteral_1=(Token)match(input,135,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaNFCModuleTypeAccess().getCUSTOMEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaNFCModuleTypeAccess().getCUSTOMEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7882:3: (enumLiteral_2= 'text' )
                    {
                    // InternalMoba.g:7882:3: (enumLiteral_2= 'text' )
                    // InternalMoba.g:7883:4: enumLiteral_2= 'text'
                    {
                    enumLiteral_2=(Token)match(input,136,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7893:1: ruleMobaLowerBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) ;
    public final Enumerator ruleMobaLowerBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;


        	enterRule();

        try {
            // InternalMoba.g:7899:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) ) )
            // InternalMoba.g:7900:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            {
            // InternalMoba.g:7900:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '0' ) | (enumLiteral_2= '?' ) | (enumLiteral_3= '+' ) | (enumLiteral_4= '1' ) )
            int alt115=5;
            switch ( input.LA(1) ) {
            case 137:
                {
                alt115=1;
                }
                break;
            case 138:
                {
                alt115=2;
                }
                break;
            case 139:
                {
                alt115=3;
                }
                break;
            case 63:
                {
                alt115=4;
                }
                break;
            case 140:
                {
                alt115=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 115, 0, input);

                throw nvae;
            }

            switch (alt115) {
                case 1 :
                    // InternalMoba.g:7901:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:7901:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:7902:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaLowerBoundAccess().getMANYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7909:3: (enumLiteral_1= '0' )
                    {
                    // InternalMoba.g:7909:3: (enumLiteral_1= '0' )
                    // InternalMoba.g:7910:4: enumLiteral_1= '0'
                    {
                    enumLiteral_1=(Token)match(input,138,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaLowerBoundAccess().getZEROEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7917:3: (enumLiteral_2= '?' )
                    {
                    // InternalMoba.g:7917:3: (enumLiteral_2= '?' )
                    // InternalMoba.g:7918:4: enumLiteral_2= '?'
                    {
                    enumLiteral_2=(Token)match(input,139,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaLowerBoundAccess().getOPTIONALEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:7925:3: (enumLiteral_3= '+' )
                    {
                    // InternalMoba.g:7925:3: (enumLiteral_3= '+' )
                    // InternalMoba.g:7926:4: enumLiteral_3= '+'
                    {
                    enumLiteral_3=(Token)match(input,63,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_3, grammarAccess.getMobaLowerBoundAccess().getATLEASTONEEnumLiteralDeclaration_3());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalMoba.g:7933:3: (enumLiteral_4= '1' )
                    {
                    // InternalMoba.g:7933:3: (enumLiteral_4= '1' )
                    // InternalMoba.g:7934:4: enumLiteral_4= '1'
                    {
                    enumLiteral_4=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7944:1: ruleMobaUpperBound returns [Enumerator current=null] : ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) ;
    public final Enumerator ruleMobaUpperBound() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalMoba.g:7950:2: ( ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) ) )
            // InternalMoba.g:7951:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            {
            // InternalMoba.g:7951:2: ( (enumLiteral_0= '*' ) | (enumLiteral_1= '1' ) )
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==137) ) {
                alt116=1;
            }
            else if ( (LA116_0==140) ) {
                alt116=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 116, 0, input);

                throw nvae;
            }
            switch (alt116) {
                case 1 :
                    // InternalMoba.g:7952:3: (enumLiteral_0= '*' )
                    {
                    // InternalMoba.g:7952:3: (enumLiteral_0= '*' )
                    // InternalMoba.g:7953:4: enumLiteral_0= '*'
                    {
                    enumLiteral_0=(Token)match(input,137,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaUpperBoundAccess().getMANYEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7960:3: (enumLiteral_1= '1' )
                    {
                    // InternalMoba.g:7960:3: (enumLiteral_1= '1' )
                    // InternalMoba.g:7961:4: enumLiteral_1= '1'
                    {
                    enumLiteral_1=(Token)match(input,140,FOLLOW_2); if (state.failed) return current;
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
    // InternalMoba.g:7971:1: ruleMobaRESTMethods returns [Enumerator current=null] : ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) ;
    public final Enumerator ruleMobaRESTMethods() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalMoba.g:7977:2: ( ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) ) )
            // InternalMoba.g:7978:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            {
            // InternalMoba.g:7978:2: ( (enumLiteral_0= 'GET' ) | (enumLiteral_1= 'POST' ) | (enumLiteral_2= 'PUT' ) | (enumLiteral_3= 'DELETE' ) )
            int alt117=4;
            switch ( input.LA(1) ) {
            case 141:
                {
                alt117=1;
                }
                break;
            case 142:
                {
                alt117=2;
                }
                break;
            case 143:
                {
                alt117=3;
                }
                break;
            case 144:
                {
                alt117=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;
            }

            switch (alt117) {
                case 1 :
                    // InternalMoba.g:7979:3: (enumLiteral_0= 'GET' )
                    {
                    // InternalMoba.g:7979:3: (enumLiteral_0= 'GET' )
                    // InternalMoba.g:7980:4: enumLiteral_0= 'GET'
                    {
                    enumLiteral_0=(Token)match(input,141,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getGETEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getMobaRESTMethodsAccess().getGETEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalMoba.g:7987:3: (enumLiteral_1= 'POST' )
                    {
                    // InternalMoba.g:7987:3: (enumLiteral_1= 'POST' )
                    // InternalMoba.g:7988:4: enumLiteral_1= 'POST'
                    {
                    enumLiteral_1=(Token)match(input,142,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getPOSTEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getMobaRESTMethodsAccess().getPOSTEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalMoba.g:7995:3: (enumLiteral_2= 'PUT' )
                    {
                    // InternalMoba.g:7995:3: (enumLiteral_2= 'PUT' )
                    // InternalMoba.g:7996:4: enumLiteral_2= 'PUT'
                    {
                    enumLiteral_2=(Token)match(input,143,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getMobaRESTMethodsAccess().getPUTEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getMobaRESTMethodsAccess().getPUTEnumLiteralDeclaration_2());
                      			
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalMoba.g:8003:3: (enumLiteral_3= 'DELETE' )
                    {
                    // InternalMoba.g:8003:3: (enumLiteral_3= 'DELETE' )
                    // InternalMoba.g:8004:4: enumLiteral_3= 'DELETE'
                    {
                    enumLiteral_3=(Token)match(input,144,FOLLOW_2); if (state.failed) return current;
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
        // InternalMoba.g:3922:5: ( RULE_ID )
        // InternalMoba.g:3922:6: RULE_ID
        {
        match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalMoba

    // $ANTLR start synpred2_InternalMoba
    public final void synpred2_InternalMoba_fragment() throws RecognitionException {   
        // InternalMoba.g:4071:5: ( RULE_ID )
        // InternalMoba.g:4071:6: RULE_ID
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
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\33\3\uffff\1\46\14\uffff";
    static final String dfa_3s = "\1\174\3\uffff\1\103\14\uffff";
    static final String dfa_4s = "\1\uffff\1\1\1\2\1\3\1\uffff\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17";
    static final String dfa_5s = "\21\uffff}>";
    static final String[] dfa_6s = {
            "\1\20\1\16\2\uffff\1\11\4\uffff\1\2\1\4\1\10\3\uffff\1\12\1\17\1\1\20\uffff\1\3\5\uffff\1\5\4\uffff\1\6\2\uffff\1\6\1\uffff\1\6\1\7\12\uffff\2\7\26\uffff\1\15\7\14\1\uffff\3\13",
            "",
            "",
            "",
            "\1\10\34\uffff\1\5",
            "",
            "",
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
            return "443:2: (this_MobaDataType_0= ruleMobaDataType | this_MobaTemplate_1= ruleMobaTemplate | this_MobaConstant_2= ruleMobaConstant | this_MobaSettings_3= ruleMobaSettings | this_MobaData_4= ruleMobaData | this_MobaREST_5= ruleMobaREST | this_MobaGenerator_6= ruleMobaGenerator | this_MobaAuthorization_7= ruleMobaAuthorization | this_MobaTransportSerializationType_8= ruleMobaTransportSerializationType | this_MobaExternalModule_9= ruleMobaExternalModule | this_MobaTrigger_10= ruleMobaTrigger | this_MobaGeneratorSlot_11= ruleMobaGeneratorSlot | this_MobaServer_12= ruleMobaServer | this_MobaPersistenceType_13= ruleMobaPersistenceType | this_MobaCache_14= ruleMobaCache )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000004080002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000400000L,0x0000000000000003L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000003800000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000008400000L,0x0000000000000003L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x20001C709A000000L,0x1DFE000006006908L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000000C0L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000040400000L,0x0000000000000003L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000182000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000C00000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000110L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000028002000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x01EFE00040000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x01EFE00000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x01EFE00000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000000000L,0x0001FE0000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x01EFE00200000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x01FFE00000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0200000002000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000000000000CC0L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0xC000000000000002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000000L,0xE000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000400000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000000002000000L,0x0000000410000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0000000800000000L,0x00000000000000F0L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0000000000000480L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0000000048400000L,0x0000000000000003L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0000000002000000L,0x0000005010000600L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0000000002000000L,0x0000000000000600L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000040400000L,0x0000000000001003L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000000400000L,0x0000000000001003L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000002000000L,0x0000005010000000L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000002000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000010L,0x0000000000008000L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000002000000L,0x00000000007F0000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000002000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x000000000001E000L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000200000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000000000090L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000040000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000002000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000400000000010L,0x00000001E0000000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000000000000010L,0x0000000000000002L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000003L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000010L,0x0000000860000000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000003L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000000010L,0x0000000040000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000000000L,0x0000008200000003L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x000000A000000003L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000003L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000000L,0x0000000000001E00L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000004L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000001200L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000880L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_85 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000006L});
    public static final BitSet FOLLOW_86 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_87 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000038L});
    public static final BitSet FOLLOW_88 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x00000000000001C0L});

}
